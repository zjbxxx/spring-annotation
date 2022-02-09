package com.zhujianbiao.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * 单实例bean容器会在关闭后调用bean的销毁方法，多实例bean则不会调用bean的销毁方法
 *
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("cat的构造方法");
    }

    /**
     * Invoked by a BeanFactory on destruction of a singleton.
     *
     * @throws Exception in case of shutdown errors.
     *                   Exceptions will get logged but not rethrown to allow
     *                   other beans to release their resources too.
     *
     *
     *
     * 会在容器关闭的时候进行调用
     */
    public void destroy() throws Exception {
        System.out.println("cat的销毁方法、、、、、");
    }

    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     *
     * 会在bean创建完成，并且属性都赋好值以后进行调用
     */
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat在属性赋值后调用的方法。。。。");
    }
}
