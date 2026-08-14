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

public class Reply_ReplyBuilder_content_2798539312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37288;

    public Reply_ReplyBuilder_content_2798539312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37537 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term37536 = ((Class) term37537).getDeclaredField((String) "ADMIN");
        ((Field) term37536).setAccessible(true);
        Object enum84 = ((Field) term37536).get((Object) null);
        Object term37387 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term37387, term37387.getClass(), "id", 1369020869);
        setField(term37387, term37387.getClass(), "content", null);
        setField(term37387, term37387.getClass(), "board", null);
        setField(term37387, term37387.getClass(), "user", null);
        setField(term37387, term37387.getClass(), "createDate", null);
        ArrayList term37385 = new ArrayList();
        ((ArrayList) term37385).add(term37387);
        term37288 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term37302 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term37329 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term37382 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term37391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37401 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term37451 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term37454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37459 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term37288, term37288.getClass(), "id", 1727771237);
        setField(term37288, term37288.getClass(), "content", "MhTJfnBVaz");
        setIntField(term37302, term37302.getClass(), "id", 2033663549);
        setField(term37302, term37302.getClass(), "title", "tWJuxHLcBL");
        setField(term37302, term37302.getClass(), "content", "ZOcslmWgQG");
        setIntField(term37302, term37302.getClass(), "count", 1766479154);
        setIntField(term37329, term37329.getClass(), "id", 533171496);
        setField(term37329, term37329.getClass(), "username", "YzxEEHlDUj");
        setField(term37329, term37329.getClass(), "password", "UcCUEwaHWp");
        setField(term37329, term37329.getClass(), "email", "IZewAlURAW");
        setField(term37329, term37329.getClass(), "role", enum84);
        setField(term37329, term37329.getClass(), "oauth", "RYptfEmCie");
        setIntField(term37382, term37382.getClass(), "nanos", 407000000);
        setLongField(term37382, term37382.getClass(), "fastTime", 1761717893000L);
        setField(term37382, term37382.getClass(), "cdate", null);
        setField(term37329, term37329.getClass(), "createDate", term37382);
        setField(term37302, term37302.getClass(), "user", term37329);
        setField(term37302, term37302.getClass(), "replys", term37385);
        setIntField(term37392, term37392.getClass(), "year", 2017);
        setShortField(term37392, term37392.getClass(), "month", (short) 2);
        setShortField(term37392, term37392.getClass(), "day", (short) 24);
        setField(term37391, term37391.getClass(), "date", term37392);
        setByteField(term37396, term37396.getClass(), "hour", (byte) 23);
        setByteField(term37396, term37396.getClass(), "minute", (byte) 46);
        setByteField(term37396, term37396.getClass(), "second", (byte) 43);
        setIntField(term37396, term37396.getClass(), "nano", 626549570);
        setField(term37391, term37391.getClass(), "time", term37396);
        setField(term37302, term37302.getClass(), "createDate", term37391);
        setField(term37288, term37288.getClass(), "board", term37302);
        setIntField(term37401, term37401.getClass(), "id", 2135922049);
        setField(term37401, term37401.getClass(), "username", "CJBElYMXZF");
        setField(term37401, term37401.getClass(), "password", "uZOAWgAORh");
        setField(term37401, term37401.getClass(), "email", "fmFvklptLM");
        setField(term37401, term37401.getClass(), "role", enum84);
        setField(term37401, term37401.getClass(), "oauth", "CYfPHswxIT");
        setIntField(term37451, term37451.getClass(), "nanos", 580000000);
        setLongField(term37451, term37451.getClass(), "fastTime", 1418062437000L);
        setField(term37451, term37451.getClass(), "cdate", null);
        setField(term37401, term37401.getClass(), "createDate", term37451);
        setField(term37288, term37288.getClass(), "user", term37401);
        setIntField(term37455, term37455.getClass(), "year", 2014);
        setShortField(term37455, term37455.getClass(), "month", (short) 4);
        setShortField(term37455, term37455.getClass(), "day", (short) 20);
        setField(term37454, term37454.getClass(), "date", term37455);
        setByteField(term37459, term37459.getClass(), "hour", (byte) 16);
        setByteField(term37459, term37459.getClass(), "minute", (byte) 19);
        setByteField(term37459, term37459.getClass(), "second", (byte) 50);
        setIntField(term37459, term37459.getClass(), "nano", 397343944);
        setField(term37454, term37454.getClass(), "time", term37459);
        setField(term37288, term37288.getClass(), "createDate", term37454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDibKvfdDt";
        callMethod(klass, "content", argTypes, term37288, args);
    }

};


