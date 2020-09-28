package com.cfang.ioc.tImport;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author cfang 2020/9/21 15:00
 * @description
 */
public class DogImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.cfang.ioc.tImport.Dog"};
    }
}
