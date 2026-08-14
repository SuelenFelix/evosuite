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
import java.lang.Integer;

public class Board_setId_14904738339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16312;
     Object term16450;

    public Board_setId_14904738339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16503 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term16502 = ((Class) term16503).getDeclaredField((String) "USER");
        ((Field) term16502).setAccessible(true);
        Object enum38 = ((Field) term16502).get((Object) null);
        Object term16402 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term16405 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term16408 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term16410 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term16402, term16402.getClass(), "id", -995822131);
        setField(term16402, term16402.getClass(), "content", "");
        setIntField(term16405, term16405.getClass(), "id", -687282231);
        setField(term16405, term16405.getClass(), "title", null);
        setField(term16405, term16405.getClass(), "content", null);
        setIntField(term16405, term16405.getClass(), "count", 1200440315);
        setField(term16405, term16405.getClass(), "user", null);
        setField(term16405, term16405.getClass(), "replys", null);
        setField(term16405, term16405.getClass(), "createDate", null);
        setField(term16402, term16402.getClass(), "board", term16405);
        setIntField(term16408, term16408.getClass(), "id", 0);
        setField(term16408, term16408.getClass(), "username", null);
        setField(term16408, term16408.getClass(), "password", null);
        setField(term16408, term16408.getClass(), "email", null);
        setField(term16408, term16408.getClass(), "role", null);
        setField(term16408, term16408.getClass(), "oauth", null);
        setField(term16408, term16408.getClass(), "createDate", null);
        setField(term16402, term16402.getClass(), "user", term16408);
        setField(term16410, term16410.getClass(), "date", null);
        setField(term16410, term16410.getClass(), "time", null);
        setField(term16402, term16402.getClass(), "createDate", term16410);
        Object term16411 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term16414 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term16417 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term16419 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term16411, term16411.getClass(), "id", -1973791064);
        setField(term16411, term16411.getClass(), "content", "");
        setIntField(term16414, term16414.getClass(), "id", 0);
        setField(term16414, term16414.getClass(), "title", null);
        setField(term16414, term16414.getClass(), "content", null);
        setIntField(term16414, term16414.getClass(), "count", 0);
        setField(term16414, term16414.getClass(), "user", null);
        setField(term16414, term16414.getClass(), "replys", null);
        setField(term16414, term16414.getClass(), "createDate", null);
        setField(term16411, term16411.getClass(), "board", term16414);
        setIntField(term16417, term16417.getClass(), "id", 0);
        setField(term16417, term16417.getClass(), "username", null);
        setField(term16417, term16417.getClass(), "password", null);
        setField(term16417, term16417.getClass(), "email", null);
        setField(term16417, term16417.getClass(), "role", null);
        setField(term16417, term16417.getClass(), "oauth", null);
        setField(term16417, term16417.getClass(), "createDate", null);
        setField(term16411, term16411.getClass(), "user", term16417);
        setField(term16419, term16419.getClass(), "date", null);
        setField(term16419, term16419.getClass(), "time", null);
        setField(term16411, term16411.getClass(), "createDate", term16419);
        Object term16420 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term16423 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term16426 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term16428 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term16420, term16420.getClass(), "id", 1709474063);
        setField(term16420, term16420.getClass(), "content", "");
        setIntField(term16423, term16423.getClass(), "id", 1406617209);
        setField(term16423, term16423.getClass(), "title", null);
        setField(term16423, term16423.getClass(), "content", null);
        setIntField(term16423, term16423.getClass(), "count", 1706047059);
        setField(term16423, term16423.getClass(), "user", null);
        setField(term16423, term16423.getClass(), "replys", null);
        setField(term16423, term16423.getClass(), "createDate", null);
        setField(term16420, term16420.getClass(), "board", term16423);
        setIntField(term16426, term16426.getClass(), "id", -138239905);
        setField(term16426, term16426.getClass(), "username", null);
        setField(term16426, term16426.getClass(), "password", null);
        setField(term16426, term16426.getClass(), "email", null);
        setField(term16426, term16426.getClass(), "role", null);
        setField(term16426, term16426.getClass(), "oauth", null);
        setField(term16426, term16426.getClass(), "createDate", null);
        setField(term16420, term16420.getClass(), "user", term16426);
        setField(term16428, term16428.getClass(), "date", null);
        setField(term16428, term16428.getClass(), "time", null);
        setField(term16420, term16420.getClass(), "createDate", term16428);
        Object term16429 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term16432 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term16435 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term16437 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term16429, term16429.getClass(), "id", -1999787419);
        setField(term16429, term16429.getClass(), "content", "");
        setIntField(term16432, term16432.getClass(), "id", 0);
        setField(term16432, term16432.getClass(), "title", null);
        setField(term16432, term16432.getClass(), "content", null);
        setIntField(term16432, term16432.getClass(), "count", 0);
        setField(term16432, term16432.getClass(), "user", null);
        setField(term16432, term16432.getClass(), "replys", null);
        setField(term16432, term16432.getClass(), "createDate", null);
        setField(term16429, term16429.getClass(), "board", term16432);
        setIntField(term16435, term16435.getClass(), "id", 0);
        setField(term16435, term16435.getClass(), "username", null);
        setField(term16435, term16435.getClass(), "password", null);
        setField(term16435, term16435.getClass(), "email", null);
        setField(term16435, term16435.getClass(), "role", null);
        setField(term16435, term16435.getClass(), "oauth", null);
        setField(term16435, term16435.getClass(), "createDate", null);
        setField(term16429, term16429.getClass(), "user", term16435);
        setField(term16437, term16437.getClass(), "date", null);
        setField(term16437, term16437.getClass(), "time", null);
        setField(term16429, term16429.getClass(), "createDate", term16437);
        ArrayList term16400 = new ArrayList();
        ((ArrayList) term16400).add(term16402);
        ((ArrayList) term16400).add(term16411);
        ((ArrayList) term16400).add(term16411);
        ((ArrayList) term16400).add(term16420);
        ((ArrayList) term16400).add(term16429);
        ((ArrayList) term16400).add(term16429);
        term16312 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term16339 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term16397 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term16440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16445 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term16312, term16312.getClass(), "id", -1271375703);
        setField(term16312, term16312.getClass(), "title", "oOUHomyJff");
        setField(term16312, term16312.getClass(), "content", "KnnoLMOuur");
        setIntField(term16312, term16312.getClass(), "count", 1136208236);
        setIntField(term16339, term16339.getClass(), "id", -1220630391);
        setField(term16339, term16339.getClass(), "username", "buRpVghIvt");
        setField(term16339, term16339.getClass(), "password", "oTGxFdiaIW");
        setField(term16339, term16339.getClass(), "email", "jlyFvaZlmv");
        setField(term16339, term16339.getClass(), "role", enum38);
        setField(term16339, term16339.getClass(), "oauth", "sofyLEfomV");
        setIntField(term16397, term16397.getClass(), "nanos", 267000000);
        setLongField(term16397, term16397.getClass(), "fastTime", 1599083743000L);
        setField(term16397, term16397.getClass(), "cdate", null);
        setField(term16339, term16339.getClass(), "createDate", term16397);
        setField(term16312, term16312.getClass(), "user", term16339);
        setField(term16312, term16312.getClass(), "replys", term16400);
        setIntField(term16441, term16441.getClass(), "year", 2027);
        setShortField(term16441, term16441.getClass(), "month", (short) 11);
        setShortField(term16441, term16441.getClass(), "day", (short) 10);
        setField(term16440, term16440.getClass(), "date", term16441);
        setByteField(term16445, term16445.getClass(), "hour", (byte) 9);
        setByteField(term16445, term16445.getClass(), "minute", (byte) 27);
        setByteField(term16445, term16445.getClass(), "second", (byte) 5);
        setIntField(term16445, term16445.getClass(), "nano", 574938581);
        setField(term16440, term16440.getClass(), "time", term16445);
        setField(term16312, term16312.getClass(), "createDate", term16440);
        term16450 = new Integer(-2072158633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16450;
        callMethod(klass, "setId", argTypes, term16312, args);
    }

};


