package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingVO_setUserNumber_121288905227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11935;
     Object term12050;

    public MeetingVO_setUserNumber_121288905227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11936 = new Integer(873659088);
        Integer term11974 = new Integer(-975748721);
        Integer term12034 = new Integer(433248783);
        Integer term12046 = new Integer(-507944154);
        Integer term12048 = new Integer(-1736183862);
        term11935 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term11976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12041 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11935, term11935.getClass(), "id", term11936);
        setField(term11935, term11935.getClass(), "name", "YIDNFdhfGO");
        setField(term11935, term11935.getClass(), "host", "adNbqunmox");
        setField(term11935, term11935.getClass(), "roomName", "ImSBmTIdsP");
        setField(term11935, term11935.getClass(), "online", term11974);
        setIntField(term11977, term11977.getClass(), "year", 2019);
        setShortField(term11977, term11977.getClass(), "month", (short) 7);
        setShortField(term11977, term11977.getClass(), "day", (short) 19);
        setField(term11976, term11976.getClass(), "date", term11977);
        setByteField(term11981, term11981.getClass(), "hour", (byte) 10);
        setByteField(term11981, term11981.getClass(), "minute", (byte) 54);
        setByteField(term11981, term11981.getClass(), "second", (byte) 55);
        setIntField(term11981, term11981.getClass(), "nano", 244650454);
        setField(term11976, term11976.getClass(), "time", term11981);
        setField(term11935, term11935.getClass(), "createTime", term11976);
        setField(term11935, term11935.getClass(), "link", "KDKQhbiclt");
        setField(term11935, term11935.getClass(), "meetingTime", "diWnDDpNWl");
        setField(term11935, term11935.getClass(), "signTime", "jcrJhyEbDI");
        setField(term11935, term11935.getClass(), "introduce", "DHbGOjJfEz");
        setField(term11935, term11935.getClass(), "state", term12034);
        setIntField(term12037, term12037.getClass(), "year", 2022);
        setShortField(term12037, term12037.getClass(), "month", (short) 4);
        setShortField(term12037, term12037.getClass(), "day", (short) 15);
        setField(term12036, term12036.getClass(), "date", term12037);
        setByteField(term12041, term12041.getClass(), "hour", (byte) 20);
        setByteField(term12041, term12041.getClass(), "minute", (byte) 58);
        setByteField(term12041, term12041.getClass(), "second", (byte) 46);
        setIntField(term12041, term12041.getClass(), "nano", 435562727);
        setField(term12036, term12036.getClass(), "time", term12041);
        setField(term11935, term11935.getClass(), "updateTime", term12036);
        setField(term11935, term11935.getClass(), "userNumber", term12046);
        setField(term11935, term11935.getClass(), "signNumber", term12048);
        term12050 = new Integer(897010381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term12050;
        callMethod(klass, "setUserNumber", argTypes, term11935, args);
    }

};


