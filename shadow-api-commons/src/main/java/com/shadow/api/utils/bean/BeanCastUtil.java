package com.shadow.api.utils.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeanCastUtil {

    public static final Logger log = LoggerFactory.getLogger(BeanCastUtil.class);

    public static <O, N> N castBean(O originBean, Class<N> nowBeanClazz) {
        if (originBean == null) {
            return null;
        } else {
            Object nowBean = null;

            try {
                nowBean = nowBeanClazz.newInstance();
                BeanUtils.copyProperties(originBean,nowBean);
            } catch (InstantiationException var4) {
                log.error(var4.getMessage(), var4);
            } catch (IllegalAccessException var5) {
                log.error(var5.getMessage(), var5);
            }

            return (N) nowBean;
        }
    }

    public static <O, N> N castBean(O originBean, Class<N> nowBeanClazz, BeanCastOprate<O, N> oprate) {
        N nowBean = oprate.doCast(originBean);
        return nowBean;
    }

    public static <O, N> List<N> castList(List<O> originList, Class<N> nowBeanClazz) {
        if (originList == null) {
            return null;
        } else {
            List<N> nowList = new ArrayList();
            Iterator var3 = originList.iterator();

            while(var3.hasNext()) {
                O originBean = (O) var3.next();
                nowList.add(castBean(originBean, nowBeanClazz));
            }

            return nowList;
        }
    }

    public static <O, N> List<N> castList(List<O> originList, Class<N> nowBeanClazz, BeanCastOprate<O, N> oprate) {
        if (originList == null) {
            return null;
        } else {
            List<N> nowList = new ArrayList();
            Iterator var4 = originList.iterator();

            while(var4.hasNext()) {
                O originBean = (O) var4.next();
                nowList.add(castBean(originBean, nowBeanClazz, oprate));
            }

            return nowList;
        }
    }
}
