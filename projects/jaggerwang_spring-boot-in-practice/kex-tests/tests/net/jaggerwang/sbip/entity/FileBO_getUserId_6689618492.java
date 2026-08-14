package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FileBO_getUserId_6689618492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4527;

    public FileBO_getUserId_6689618492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4528 = new Long(-4443169559037975007L);
        Long term4530 = new Long(-3842548265506930260L);
        Class<? extends Object> term4613 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term4612 = ((Class) term4613).getDeclaredField((String) "LOCAL");
        ((Field) term4612).setAccessible(true);
        Object enum11 = ((Field) term4612).get((Object) null);
        Long term4578 = new Long(-5788180182343976541L);
        term4527 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term4565 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term4592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4597 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4602 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4603 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4607 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4527, term4527.getClass(), "id", term4528);
        setField(term4527, term4527.getClass(), "userId", term4530);
        setField(term4527, term4527.getClass(), "region", enum11);
        setField(term4527, term4527.getClass(), "bucket", "JUmudUmaaV");
        setField(term4527, term4527.getClass(), "path", "KoyGrUJeJW");
        setField(term4565, term4565.getClass(), "name", "HqBOwkVqjD");
        setField(term4565, term4565.getClass(), "size", term4578);
        setField(term4565, term4565.getClass(), "type", "MAcUBcBckh");
        setField(term4527, term4527.getClass(), "meta", term4565);
        setIntField(term4593, term4593.getClass(), "year", 2025);
        setShortField(term4593, term4593.getClass(), "month", (short) 3);
        setShortField(term4593, term4593.getClass(), "day", (short) 9);
        setField(term4592, term4592.getClass(), "date", term4593);
        setByteField(term4597, term4597.getClass(), "hour", (byte) 5);
        setByteField(term4597, term4597.getClass(), "minute", (byte) 49);
        setByteField(term4597, term4597.getClass(), "second", (byte) 12);
        setIntField(term4597, term4597.getClass(), "nano", 791695028);
        setField(term4592, term4592.getClass(), "time", term4597);
        setField(term4527, term4527.getClass(), "createdAt", term4592);
        setIntField(term4603, term4603.getClass(), "year", 2023);
        setShortField(term4603, term4603.getClass(), "month", (short) 9);
        setShortField(term4603, term4603.getClass(), "day", (short) 23);
        setField(term4602, term4602.getClass(), "date", term4603);
        setByteField(term4607, term4607.getClass(), "hour", (byte) 12);
        setByteField(term4607, term4607.getClass(), "minute", (byte) 55);
        setByteField(term4607, term4607.getClass(), "second", (byte) 58);
        setIntField(term4607, term4607.getClass(), "nano", 159178396);
        setField(term4602, term4602.getClass(), "time", term4607);
        setField(term4527, term4527.getClass(), "updatedAt", term4602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term4527, args);
    }

};


