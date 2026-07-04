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

public class Meeting_getName_15799442333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26885;

    public Meeting_getName_15799442333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26886 = new Integer(732187274);
        Integer term26968 = new Integer(1495500544);
        Integer term26970 = new Integer(-610532968);
        Integer term26985 = new Integer(-1034929475);
        term26885 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term26888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26939 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26885, term26885.getClass(), "id", term26886);
        setIntField(term26889, term26889.getClass(), "year", 2028);
        setShortField(term26889, term26889.getClass(), "month", (short) 2);
        setShortField(term26889, term26889.getClass(), "day", (short) 8);
        setField(term26888, term26888.getClass(), "date", term26889);
        setByteField(term26893, term26893.getClass(), "hour", (byte) 12);
        setByteField(term26893, term26893.getClass(), "minute", (byte) 27);
        setByteField(term26893, term26893.getClass(), "second", (byte) 18);
        setIntField(term26893, term26893.getClass(), "nano", 853147382);
        setField(term26888, term26888.getClass(), "time", term26893);
        setField(term26885, term26885.getClass(), "createTime", term26888);
        setField(term26885, term26885.getClass(), "name", "EhfPOdaJdQ");
        setField(term26885, term26885.getClass(), "link", "KoTunRQrvH");
        setField(term26885, term26885.getClass(), "introduce", "WEDoAQHAFg");
        setIntField(term26935, term26935.getClass(), "year", 2028);
        setShortField(term26935, term26935.getClass(), "month", (short) 10);
        setShortField(term26935, term26935.getClass(), "day", (short) 3);
        setField(term26934, term26934.getClass(), "date", term26935);
        setByteField(term26939, term26939.getClass(), "hour", (byte) 22);
        setByteField(term26939, term26939.getClass(), "minute", (byte) 20);
        setByteField(term26939, term26939.getClass(), "second", (byte) 16);
        setIntField(term26939, term26939.getClass(), "nano", 358560291);
        setField(term26934, term26934.getClass(), "time", term26939);
        setField(term26885, term26885.getClass(), "updateTime", term26934);
        setField(term26885, term26885.getClass(), "meetingTime", "TDwsNJKaql");
        setField(term26885, term26885.getClass(), "signTime", "OuxgUlcbAs");
        setField(term26885, term26885.getClass(), "signNumber", term26968);
        setField(term26885, term26885.getClass(), "userNumber", term26970);
        setField(term26885, term26885.getClass(), "fileUrl", "ZTSRAqJUkK");
        setBooleanField(term26885, term26885.getClass(), "online", true);
        setField(term26885, term26885.getClass(), "deleted", term26985);
        setField(term26885, term26885.getClass(), "host", "hnHAGEsrzw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term26885, args);
    }

};


