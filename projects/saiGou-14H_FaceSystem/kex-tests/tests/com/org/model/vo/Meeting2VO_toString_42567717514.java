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

public class Meeting2VO_toString_42567717514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4822;

    public Meeting2VO_toString_42567717514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4823 = new Integer(-1275173084);
        Integer term4847 = new Integer(-244121226);
        term4822 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4842 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4822, term4822.getClass(), "id", term4823);
        setField(term4822, term4822.getClass(), "username", "QZfhwDBzyR");
        setIntField(term4838, term4838.getClass(), "year", 2012);
        setShortField(term4838, term4838.getClass(), "month", (short) 2);
        setShortField(term4838, term4838.getClass(), "day", (short) 19);
        setField(term4837, term4837.getClass(), "date", term4838);
        setByteField(term4842, term4842.getClass(), "hour", (byte) 8);
        setByteField(term4842, term4842.getClass(), "minute", (byte) 4);
        setByteField(term4842, term4842.getClass(), "second", (byte) 43);
        setIntField(term4842, term4842.getClass(), "nano", 114930008);
        setField(term4837, term4837.getClass(), "time", term4842);
        setField(term4822, term4822.getClass(), "startTime", term4837);
        setField(term4822, term4822.getClass(), "state", term4847);
        setField(term4822, term4822.getClass(), "faceUrl", "HvnMmAOZev");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4822, args);
    }

};


