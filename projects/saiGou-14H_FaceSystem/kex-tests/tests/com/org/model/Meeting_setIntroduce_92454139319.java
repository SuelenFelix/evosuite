package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_setIntroduce_92454139319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29885;

    public Meeting_setIntroduce_92454139319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29886 = new Integer(-937626498);
        Integer term29968 = new Integer(398974629);
        Integer term29970 = new Integer(-790946306);
        Integer term29985 = new Integer(-189980304);
        term29885 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term29888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29939 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29885, term29885.getClass(), "id", term29886);
        setIntField(term29889, term29889.getClass(), "year", 2029);
        setShortField(term29889, term29889.getClass(), "month", (short) 6);
        setShortField(term29889, term29889.getClass(), "day", (short) 10);
        setField(term29888, term29888.getClass(), "date", term29889);
        setByteField(term29893, term29893.getClass(), "hour", (byte) 10);
        setByteField(term29893, term29893.getClass(), "minute", (byte) 16);
        setByteField(term29893, term29893.getClass(), "second", (byte) 3);
        setIntField(term29893, term29893.getClass(), "nano", 695609423);
        setField(term29888, term29888.getClass(), "time", term29893);
        setField(term29885, term29885.getClass(), "createTime", term29888);
        setField(term29885, term29885.getClass(), "name", "gXGEyEhyUf");
        setField(term29885, term29885.getClass(), "link", "EDooGXKCHK");
        setField(term29885, term29885.getClass(), "introduce", "EBGKZmWwAk");
        setIntField(term29935, term29935.getClass(), "year", 2021);
        setShortField(term29935, term29935.getClass(), "month", (short) 2);
        setShortField(term29935, term29935.getClass(), "day", (short) 24);
        setField(term29934, term29934.getClass(), "date", term29935);
        setByteField(term29939, term29939.getClass(), "hour", (byte) 2);
        setByteField(term29939, term29939.getClass(), "minute", (byte) 4);
        setByteField(term29939, term29939.getClass(), "second", (byte) 26);
        setIntField(term29939, term29939.getClass(), "nano", 423826252);
        setField(term29934, term29934.getClass(), "time", term29939);
        setField(term29885, term29885.getClass(), "updateTime", term29934);
        setField(term29885, term29885.getClass(), "meetingTime", "bAMgiOmJxZ");
        setField(term29885, term29885.getClass(), "signTime", "HFCedfiKpJ");
        setField(term29885, term29885.getClass(), "signNumber", term29968);
        setField(term29885, term29885.getClass(), "userNumber", term29970);
        setField(term29885, term29885.getClass(), "fileUrl", "WxLoSrVDiR");
        setBooleanField(term29885, term29885.getClass(), "online", false);
        setField(term29885, term29885.getClass(), "deleted", term29985);
        setField(term29885, term29885.getClass(), "host", "lGTNzfeoYK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bASCCOMbHW";
        callMethod(klass, "setIntroduce", argTypes, term29885, args);
    }

};


