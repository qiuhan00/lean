package com.cfang.ioc.compantscan.filtertype;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author cfang 2020/9/21 14:07
 * @description
 */
public class CustomFilterType implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //当前类的注解源信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //当前类class源信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //当前类资源信息
        Resource resource = metadataReader.getResource();
        System.out.println("类的路径:"+classMetadata.getClassName());
        if(classMetadata.getClassName().contains("dao")){
            return true;
        }
        return false;
    }
}
