package com.zgz.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aoocunt {
    private Long id;
    private Long userId;
    private Integer total;
    private Integer used;
    private Integer residue;

}
