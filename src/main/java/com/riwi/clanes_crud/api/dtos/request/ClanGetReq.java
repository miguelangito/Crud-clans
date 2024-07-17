package com.riwi.clanes_crud.api.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClanGetReq {
    private Long page;
    private Long size;
    private String name;
    private String description;
    private Long cohortId;
}
