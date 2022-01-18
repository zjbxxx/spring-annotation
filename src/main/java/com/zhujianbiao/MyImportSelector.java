package com.zhujianbiao;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义需要注入到容器中的类
 */
public class MyImportSelector implements ImportSelector {
    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
     *
     * @param importingClassMetadata
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //注意：如果不返回任何组件的话，必须是返回一个空数组，不能返回null，不然会报NPE
        return new String[]{"com.zhujianbiao.Color","com.zhujianbiao.Yellow"};
    }
}
