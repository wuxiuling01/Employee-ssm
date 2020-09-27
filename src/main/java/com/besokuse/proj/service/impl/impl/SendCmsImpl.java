package com.besokuse.proj.service.impl.impl;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.besokuse.proj.service.SendCms;
import org.springframework.stereotype.Service;

/**
 * @author: besokuse
 * @since: 2020/9/27 12:13
 */
@Service
public class SendCmsImpl implements SendCms {
    @Override
    public void send(String phone) {


        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FkEPj1e5ssMBdo4S99S", "fe91Qnof9TWbL3er1DRqqRvA6cbEoP");
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "Besokuse");
        request.putQueryParameter("TemplateCode", "SMS_184105617");
        request.putQueryParameter("TemplateParam", "{code:8888}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
    }

