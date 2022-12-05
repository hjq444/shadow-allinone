package com.shadow.api.utils.bean;

@FunctionalInterface
public interface BeanCastOprate<O, N> {
    N doCast(O var1);
}
