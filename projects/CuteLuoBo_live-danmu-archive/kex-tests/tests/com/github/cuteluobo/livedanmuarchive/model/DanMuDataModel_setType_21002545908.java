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

public class DanMuDataModel_setType_21002545908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5637;
     Object term5672;

    public DanMuDataModel_setType_21002545908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5638 = new Long(-6969704322644192945L);
        Integer term5640 = new Integer(584893196);
        Integer term5654 = new Integer(497269071);
        Integer term5656 = new Integer(-1899301124);
        Long term5658 = new Long(-6685235643232255177L);
        term5637 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term5637, term5637.getClass(), "id", term5638);
        setField(term5637, term5637.getClass(), "userId", term5640);
        setField(term5637, term5637.getClass(), "data", "RbVQXSpxXy");
        setField(term5637, term5637.getClass(), "format", term5654);
        setField(term5637, term5637.getClass(), "type", term5656);
        setField(term5637, term5637.getClass(), "createTime", term5658);
        setField(term5637, term5637.getClass(), "createTimeText", "YpJbIgJWWv");
        term5672 = new Integer(-1882480155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5672;
        callMethod(klass, "setType", argTypes, term5637, args);
    }

};


