package com.besokuse.proj.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author: besokuse
 * @since: 2020/9/27 10:54
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResultDto<T> implements Serializable {
    private Integer code;
    private String meg;
    private List<T> data;
}
