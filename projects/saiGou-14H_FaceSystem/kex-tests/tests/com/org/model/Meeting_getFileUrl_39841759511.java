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

public class Meeting_getFileUrl_39841759511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28357;

    public Meeting_getFileUrl_39841759511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28358 = new Integer(1536865175);
        Integer term28440 = new Integer(-1059947211);
        Integer term28442 = new Integer(-768583538);
        Integer term28457 = new Integer(372329686);
        term28357 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term28360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28411 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28357, term28357.getClass(), "id", term28358);
        setIntField(term28361, term28361.getClass(), "year", 2023);
        setShortField(term28361, term28361.getClass(), "month", (short) 11);
        setShortField(term28361, term28361.getClass(), "day", (short) 25);
        setField(term28360, term28360.getClass(), "date", term28361);
        setByteField(term28365, term28365.getClass(), "hour", (byte) 1);
        setByteField(term28365, term28365.getClass(), "minute", (byte) 27);
        setByteField(term28365, term28365.getClass(), "second", (byte) 54);
        setIntField(term28365, term28365.getClass(), "nano", 382362839);
        setField(term28360, term28360.getClass(), "time", term28365);
        setField(term28357, term28357.getClass(), "createTime", term28360);
        setField(term28357, term28357.getClass(), "name", "YOaDBGAdOq");
        setField(term28357, term28357.getClass(), "link", "spXHUvRLTA");
        setField(term28357, term28357.getClass(), "introduce", "wYKOwifIEg");
        setIntField(term28407, term28407.getClass(), "year", 2019);
        setShortField(term28407, term28407.getClass(), "month", (short) 7);
        setShortField(term28407, term28407.getClass(), "day", (short) 3);
        setField(term28406, term28406.getClass(), "date", term28407);
        setByteField(term28411, term28411.getClass(), "hour", (byte) 1);
        setByteField(term28411, term28411.getClass(), "minute", (byte) 7);
        setByteField(term28411, term28411.getClass(), "second", (byte) 43);
        setIntField(term28411, term28411.getClass(), "nano", 632872277);
        setField(term28406, term28406.getClass(), "time", term28411);
        setField(term28357, term28357.getClass(), "updateTime", term28406);
        setField(term28357, term28357.getClass(), "meetingTime", "CmnJlLSyYb");
        setField(term28357, term28357.getClass(), "signTime", "XWfTNLgUUn");
        setField(term28357, term28357.getClass(), "signNumber", term28440);
        setField(term28357, term28357.getClass(), "userNumber", term28442);
        setField(term28357, term28357.getClass(), "fileUrl", "gsUmKVKOac");
        setBooleanField(term28357, term28357.getClass(), "online", false);
        setField(term28357, term28357.getClass(), "deleted", term28457);
        setField(term28357, term28357.getClass(), "host", "TXxuyKOVBs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileUrl", argTypes, term28357, args);
    }

};


