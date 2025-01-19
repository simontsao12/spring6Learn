package com.atsimoncc.spring6.di;

import org.springframework.core.io.Resource;

/**
 * ClassName: ResourceBean
 * Package: com.atsimoncc.spring6.di
 * Description:
 */
public class ResourceBean {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse() {
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
