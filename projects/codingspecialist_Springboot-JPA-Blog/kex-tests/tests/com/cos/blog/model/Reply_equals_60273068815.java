package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Reply_equals_60273068815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7836;
     Object term7969;

    public Reply_equals_60273068815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8031 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term8030 = ((Class) term8031).getDeclaredField((String) "USER");
        ((Field) term8030).setAccessible(true);
        Object enum17 = ((Field) term8030).get((Object) null);
        Object term7935 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7935, term7935.getClass(), "id", 803925431);
        setField(term7935, term7935.getClass(), "content", null);
        setField(term7935, term7935.getClass(), "board", null);
        setField(term7935, term7935.getClass(), "user", null);
        setField(term7935, term7935.getClass(), "createDate", null);
        Object term7937 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7937, term7937.getClass(), "id", -1404350380);
        setField(term7937, term7937.getClass(), "content", null);
        setField(term7937, term7937.getClass(), "board", null);
        setField(term7937, term7937.getClass(), "user", null);
        setField(term7937, term7937.getClass(), "createDate", null);
        Object term7939 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7939, term7939.getClass(), "id", 1466373988);
        setField(term7939, term7939.getClass(), "content", null);
        setField(term7939, term7939.getClass(), "board", null);
        setField(term7939, term7939.getClass(), "user", null);
        setField(term7939, term7939.getClass(), "createDate", null);
        Object term7941 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7941, term7941.getClass(), "id", -1351605385);
        setField(term7941, term7941.getClass(), "content", null);
        setField(term7941, term7941.getClass(), "board", null);
        setField(term7941, term7941.getClass(), "user", null);
        setField(term7941, term7941.getClass(), "createDate", null);
        Object term7943 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term7943, term7943.getClass(), "id", 0);
        setField(term7943, term7943.getClass(), "content", null);
        setField(term7943, term7943.getClass(), "board", null);
        setField(term7943, term7943.getClass(), "user", null);
        setField(term7943, term7943.getClass(), "createDate", null);
        ArrayList term7933 = new ArrayList();
        ((ArrayList) term7933).add(term7935);
        ((ArrayList) term7933).add(term7937);
        ((ArrayList) term7933).add(term7939);
        ((ArrayList) term7933).add(term7941);
        ((ArrayList) term7933).add(term7941);
        ((ArrayList) term7933).add(term7935);
        ((ArrayList) term7933).add(term7943);
        ((ArrayList) term7933).add(term7943);
        term7836 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term7850 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term7877 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term7930 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7957 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term7959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7960 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7964 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term7836, term7836.getClass(), "id", -1015274146);
        setField(term7836, term7836.getClass(), "content", "PGfCDJTBek");
        setIntField(term7850, term7850.getClass(), "id", -49052672);
        setField(term7850, term7850.getClass(), "title", "ZwjARhAtHC");
        setField(term7850, term7850.getClass(), "content", "XXvscsYBWv");
        setIntField(term7850, term7850.getClass(), "count", 339372704);
        setIntField(term7877, term7877.getClass(), "id", -851097944);
        setField(term7877, term7877.getClass(), "username", "uePedtiAfL");
        setField(term7877, term7877.getClass(), "password", "AdSHvysxQB");
        setField(term7877, term7877.getClass(), "email", "jlraKkBWFA");
        setField(term7877, term7877.getClass(), "role", enum17);
        setField(term7877, term7877.getClass(), "oauth", "mRBtFTxVdE");
        setIntField(term7930, term7930.getClass(), "nanos", 896000000);
        setLongField(term7930, term7930.getClass(), "fastTime", 1450854459000L);
        setField(term7930, term7930.getClass(), "cdate", null);
        setField(term7877, term7877.getClass(), "createDate", term7930);
        setField(term7850, term7850.getClass(), "user", term7877);
        setField(term7850, term7850.getClass(), "replys", term7933);
        setIntField(term7948, term7948.getClass(), "year", 2016);
        setShortField(term7948, term7948.getClass(), "month", (short) 8);
        setShortField(term7948, term7948.getClass(), "day", (short) 24);
        setField(term7947, term7947.getClass(), "date", term7948);
        setByteField(term7952, term7952.getClass(), "hour", (byte) 22);
        setByteField(term7952, term7952.getClass(), "minute", (byte) 25);
        setByteField(term7952, term7952.getClass(), "second", (byte) 3);
        setIntField(term7952, term7952.getClass(), "nano", 185613519);
        setField(term7947, term7947.getClass(), "time", term7952);
        setField(term7850, term7850.getClass(), "createDate", term7947);
        setField(term7836, term7836.getClass(), "board", term7850);
        setIntField(term7957, term7957.getClass(), "id", 0);
        setField(term7957, term7957.getClass(), "username", null);
        setField(term7957, term7957.getClass(), "password", null);
        setField(term7957, term7957.getClass(), "email", null);
        setField(term7957, term7957.getClass(), "role", null);
        setField(term7957, term7957.getClass(), "oauth", null);
        setField(term7957, term7957.getClass(), "createDate", null);
        setField(term7836, term7836.getClass(), "user", term7957);
        setIntField(term7960, term7960.getClass(), "year", 2029);
        setShortField(term7960, term7960.getClass(), "month", (short) 5);
        setShortField(term7960, term7960.getClass(), "day", (short) 11);
        setField(term7959, term7959.getClass(), "date", term7960);
        setByteField(term7964, term7964.getClass(), "hour", (byte) 20);
        setByteField(term7964, term7964.getClass(), "minute", (byte) 17);
        setByteField(term7964, term7964.getClass(), "second", (byte) 32);
        setIntField(term7964, term7964.getClass(), "nano", 327503582);
        setField(term7959, term7959.getClass(), "time", term7964);
        setField(term7836, term7836.getClass(), "createDate", term7959);
        term7969 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7969;
        callMethod(klass, "equals", argTypes, term7836, args);
    }

};


