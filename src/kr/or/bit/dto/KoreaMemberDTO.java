package kr.or.bit.dto;

import lombok.Data;

@Data
public class KoreaMemberDTO {
    private String id;
    private String pwd;
    private String name;
    private Integer age;
    private String gender;
    private String email;
    private String ip;
}