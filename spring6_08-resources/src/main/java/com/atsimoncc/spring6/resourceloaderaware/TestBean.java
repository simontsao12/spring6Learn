package com.atsimoncc.spring6.resourceloaderaware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * ClassName: TestBean
 * Package: com.atsimoncc.spring6.resourceloaderaware
 * Description:
 */
public class TestBean implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }
}
