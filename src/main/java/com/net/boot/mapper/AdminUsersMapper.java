package com.net.boot.mapper;

import com.net.boot.model.Adminusers;

import java.util.List;

public interface AdminUsersMapper {

    void add(Adminusers u);

    List<Adminusers> find();
}
