package com.leo.artifact_example.dms.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SampleDto {
    private String id;
    private String name;
}
