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
import java.lang.Integer;
import java.lang.Long;

public class DanMuUserInfoModel_setAddTime_13398289058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3072;
     Object term3101;

    public DanMuUserInfoModel_setAddTime_13398289058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3073 = new Integer(1962444399);
        Long term3075 = new Long(-4023935540989049732L);
        term3072 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel"));
        setField(term3072, term3072.getClass(), "id", term3073);
        setField(term3072, term3072.getClass(), "addTime", term3075);
        setField(term3072, term3072.getClass(), "uid", "sEnIVFtZuQ");
        setField(term3072, term3072.getClass(), "nickName", "ZVecLZMLHF");
        term3101 = new Long(855932984568615096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3101;
        callMethod(klass, "setAddTime", argTypes, term3072, args);
    }

};


