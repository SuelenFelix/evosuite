package com.github.cuteluobo.livedanmuarchive.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.github.cuteluobo.livedanmuarchive.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class DanMuDataModelSelector_setStartCreateTime_10136468764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3106;
     Object term3145;

    public DanMuDataModelSelector_setStartCreateTime_10136468764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3107 = new Long(2274723545906746965L);
        Long term3109 = new Long(1353683663053784647L);
        Long term3111 = new Long(-1465819833800717311L);
        Integer term3113 = new Integer(-1963434938);
        Integer term3127 = new Integer(906181092);
        Integer term3129 = new Integer(1045657203);
        Long term3131 = new Long(-8306611953768020559L);
        term3106 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector"));
        setField(term3106, term3106.getClass(), "startCreateTime", term3107);
        setField(term3106, term3106.getClass(), "endCreateTime", term3109);
        setField(term3106, term3106.getClass(), "id", term3111);
        setField(term3106, term3106.getClass(), "userId", term3113);
        setField(term3106, term3106.getClass(), "data", "jUbSRrkrYZ");
        setField(term3106, term3106.getClass(), "format", term3127);
        setField(term3106, term3106.getClass(), "type", term3129);
        setField(term3106, term3106.getClass(), "createTime", term3131);
        setField(term3106, term3106.getClass(), "createTimeText", "bWWfajKbEX");
        term3145 = new Long(-8692119547314358088L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.dto.DanMuDataModelSelector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3145;
        callMethod(klass, "setStartCreateTime", argTypes, term3106, args);
    }

};


