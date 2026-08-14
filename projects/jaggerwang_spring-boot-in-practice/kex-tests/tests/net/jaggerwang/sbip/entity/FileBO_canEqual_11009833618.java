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

public class FileBO_canEqual_11009833618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10195;
     Object term10280;

    public FileBO_canEqual_11009833618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10196 = new Long(4949335493504695457L);
        Long term10198 = new Long(-5216789073301458893L);
        Class<? extends Object> term10282 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term10281 = ((Class) term10282).getDeclaredField((String) "LOCAL");
        ((Field) term10281).setAccessible(true);
        Object enum27 = ((Field) term10281).get((Object) null);
        Long term10246 = new Long(-1832940336320585644L);
        term10195 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term10233 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term10260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10265 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10275 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10195, term10195.getClass(), "id", term10196);
        setField(term10195, term10195.getClass(), "userId", term10198);
        setField(term10195, term10195.getClass(), "region", enum27);
        setField(term10195, term10195.getClass(), "bucket", "LWyEaeIyAo");
        setField(term10195, term10195.getClass(), "path", "yVMkkQhvmN");
        setField(term10233, term10233.getClass(), "name", "mvrkADEgpp");
        setField(term10233, term10233.getClass(), "size", term10246);
        setField(term10233, term10233.getClass(), "type", "pXOkjyeIRb");
        setField(term10195, term10195.getClass(), "meta", term10233);
        setIntField(term10261, term10261.getClass(), "year", 2025);
        setShortField(term10261, term10261.getClass(), "month", (short) 3);
        setShortField(term10261, term10261.getClass(), "day", (short) 28);
        setField(term10260, term10260.getClass(), "date", term10261);
        setByteField(term10265, term10265.getClass(), "hour", (byte) 19);
        setByteField(term10265, term10265.getClass(), "minute", (byte) 56);
        setByteField(term10265, term10265.getClass(), "second", (byte) 52);
        setIntField(term10265, term10265.getClass(), "nano", 738558930);
        setField(term10260, term10260.getClass(), "time", term10265);
        setField(term10195, term10195.getClass(), "createdAt", term10260);
        setIntField(term10271, term10271.getClass(), "year", 2024);
        setShortField(term10271, term10271.getClass(), "month", (short) 2);
        setShortField(term10271, term10271.getClass(), "day", (short) 29);
        setField(term10270, term10270.getClass(), "date", term10271);
        setByteField(term10275, term10275.getClass(), "hour", (byte) 17);
        setByteField(term10275, term10275.getClass(), "minute", (byte) 54);
        setByteField(term10275, term10275.getClass(), "second", (byte) 21);
        setIntField(term10275, term10275.getClass(), "nano", 605973408);
        setField(term10270, term10270.getClass(), "time", term10275);
        setField(term10195, term10195.getClass(), "updatedAt", term10270);
        term10280 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10280;
        callMethod(klass, "canEqual", argTypes, term10195, args);
    }

};


