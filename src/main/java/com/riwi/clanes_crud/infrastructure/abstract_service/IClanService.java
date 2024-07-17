package com.riwi.clanes_crud.infrastructure.abstract_service;

import org.springframework.data.domain.Page;

import com.riwi.clanes_crud.api.dtos.request.ClanGetReq;
import com.riwi.clanes_crud.api.dtos.request.ClanReq;
import com.riwi.clanes_crud.api.dtos.request.ClanReqUpd;
import com.riwi.clanes_crud.domain.entities.Clan;

public interface IClanService{
    public Page<Clan> findAll(ClanGetReq req);
    public Clan create(ClanReq req);
    public Clan update(Long id, ClanReqUpd req);
    public Clan disable(Long id);
}
