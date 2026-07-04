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

public class Meeting2VO_canEqual_133793181912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4703;
     Object term4742;

    public Meeting2VO_canEqual_133793181912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4704 = new Integer(-1007160944);
        Integer term4728 = new Integer(1135664017);
        term4703 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4723 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4703, term4703.getClass(), "id", term4704);
        setField(term4703, term4703.getClass(), "username", "qvykDllgpT");
        setIntField(term4719, term4719.getClass(), "year", 2012);
        setShortField(term4719, term4719.getClass(), "month", (short) 9);
        setShortField(term4719, term4719.getClass(), "day", (short) 11);
        setField(term4718, term4718.getClass(), "date", term4719);
        setByteField(term4723, term4723.getClass(), "hour", (byte) 22);
        setByteField(term4723, term4723.getClass(), "minute", (byte) 10);
        setByteField(term4723, term4723.getClass(), "second", (byte) 8);
        setIntField(term4723, term4723.getClass(), "nano", 380008862);
        setField(term4718, term4718.getClass(), "time", term4723);
        setField(term4703, term4703.getClass(), "startTime", term4718);
        setField(term4703, term4703.getClass(), "state", term4728);
        setField(term4703, term4703.getClass(), "faceUrl", "hzdUbcLZhZ");
        term4742 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4742;
        callMethod(klass, "canEqual", argTypes, term4703, args);
    }

};


