package com.anatas.terracotta.gateway;

import cf.service.BindRequest;
import cf.service.CreateRequest;
import cf.service.Provisioner;
import cf.service.ServiceBinding;
import cf.service.ServiceInstance;

public class TerracottaProvisioner implements Provisioner {

    @Override
    public ServiceBinding bind(BindRequest bindRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<String> bindingIds(String instanceId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ServiceInstance create(CreateRequest createRequest) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(String instanceId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeOrphanedBinding(String instanceId, String bindingId) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeOrphanedServiceInstance(String instanceId) {
        // TODO Auto-generated method stub

    }

    @Override
    public Iterable<String> serviceInstanceIds() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void unbind(String instanceId, String bindingId) {
        // TODO Auto-generated method stub

    }

}
