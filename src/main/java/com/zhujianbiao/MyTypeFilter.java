package com.zhujianbiao;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 此类是用来实现@CompentScan注解中的FilterType.CUSTOM（自定义过滤规则）的功能，必须实现TypeFilter接口，然后重写其方法,返回true代表符合规则
 */
public class MyTypeFilter implements TypeFilter {
    /**
     * Determine whether this filter matches for the class described by
     * the given metadata.
     *
     * @param metadataReader        the metadata reader for the target class   读取到的当前正在扫描的类的信息
     * @param metadataReaderFactory a factory for obtaining metadata readers   可以获取到其他任何类的信息的工厂
     *                              for other classes (such as superclasses and interfaces)
     * @return whether this filter matches
     * @throws IOException in case of I/O failure when reading metadata
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory){
//        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//        System.out.println("===="+annotationMetadata.getClassName());
        return true;
    }
}
