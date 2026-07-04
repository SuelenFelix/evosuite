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

public class Meeting2VO_setState_6871850699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4501;
     Object term4540;

    public Meeting2VO_setState_6871850699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4502 = new Integer(-1456670397);
        Integer term4526 = new Integer(1622346318);
        term4501 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4516 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4517 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4521 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4501, term4501.getClass(), "id", term4502);
        setField(term4501, term4501.getClass(), "username", "FmJNEfmYgq");
        setIntField(term4517, term4517.getClass(), "year", 2022);
        setShortField(term4517, term4517.getClass(), "month", (short) 11);
        setShortField(term4517, term4517.getClass(), "day", (short) 16);
        setField(term4516, term4516.getClass(), "date", term4517);
        setByteField(term4521, term4521.getClass(), "hour", (byte) 15);
        setByteField(term4521, term4521.getClass(), "minute", (byte) 54);
        setByteField(term4521, term4521.getClass(), "second", (byte) 2);
        setIntField(term4521, term4521.getClass(), "nano", 733274103);
        setField(term4516, term4516.getClass(), "time", term4521);
        setField(term4501, term4501.getClass(), "startTime", term4516);
        setField(term4501, term4501.getClass(), "state", term4526);
        setField(term4501, term4501.getClass(), "faceUrl", "NqQofgWsJd");
        term4540 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4540;
        callMethod(klass, "setState", argTypes, term4501, args);
    }

};


