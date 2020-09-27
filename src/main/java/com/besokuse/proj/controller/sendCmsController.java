package com.besokuse.proj.controller;

import com.besokuse.proj.dto.ResultDto;
import com.besokuse.proj.pojo.Department;
import com.besokuse.proj.service.SendCms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: besokuse
 * @since: 2020/9/27 12:21
 */
@RestController
public class sendCmsController {
    @Autowired
    private SendCms sendCms;
    @RequestMapping(value = "/send")
    public ResultDto getAllEmployee(@RequestBody String phone) {
        try {
            sendCms.send(phone);
            return new ResultDto<>(200,"发送成功",null);
        }catch (Exception e){
            return new ResultDto<>(400,"未知错误",null);
        }

    }
}
