package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class DanMuDataModel_toString_147927436115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6050;

    public DanMuDataModel_toString_147927436115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6051 = new Long(-1526729287349763895L);
        Integer term6053 = new Integer(-749861210);
        Integer term6067 = new Integer(1694224101);
        Integer term6069 = new Integer(937859191);
        Long term6071 = new Long(7017605765544766728L);
        term6050 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term6050, term6050.getClass(), "id", term6051);
        setField(term6050, term6050.getClass(), "userId", term6053);
        setField(term6050, term6050.getClass(), "data", "HDaezxQfQR");
        setField(term6050, term6050.getClass(), "format", term6067);
        setField(term6050, term6050.getClass(), "type", term6069);
        setField(term6050, term6050.getClass(), "createTime", term6071);
        setField(term6050, term6050.getClass(), "createTimeText", "iikZEapDlu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6050, args);
    }

};


