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

public class FileBO_setRegion_77108305311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7654;
     Object enum20;

    public FileBO_setRegion_77108305311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7655 = new Long(9013624480170062917L);
        Long term7657 = new Long(7862575738391801707L);
        Class<? extends Object> term7740 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term7739 = ((Class) term7740).getDeclaredField((String) "LOCAL");
        ((Field) term7739).setAccessible(true);
        enum20 = ((Field) term7739).get((Object) null);
        Long term7705 = new Long(50358265865610362L);
        term7654 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term7692 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term7719 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7724 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7734 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7654, term7654.getClass(), "id", term7655);
        setField(term7654, term7654.getClass(), "userId", term7657);
        setField(term7654, term7654.getClass(), "region", enum20);
        setField(term7654, term7654.getClass(), "bucket", "ZVecLZMLHF");
        setField(term7654, term7654.getClass(), "path", "fztQhjqwdP");
        setField(term7692, term7692.getClass(), "name", "eVpkWxjuki");
        setField(term7692, term7692.getClass(), "size", term7705);
        setField(term7692, term7692.getClass(), "type", "SJiQaLvSKv");
        setField(term7654, term7654.getClass(), "meta", term7692);
        setIntField(term7720, term7720.getClass(), "year", 2020);
        setShortField(term7720, term7720.getClass(), "month", (short) 8);
        setShortField(term7720, term7720.getClass(), "day", (short) 15);
        setField(term7719, term7719.getClass(), "date", term7720);
        setByteField(term7724, term7724.getClass(), "hour", (byte) 2);
        setByteField(term7724, term7724.getClass(), "minute", (byte) 0);
        setByteField(term7724, term7724.getClass(), "second", (byte) 38);
        setIntField(term7724, term7724.getClass(), "nano", 146431486);
        setField(term7719, term7719.getClass(), "time", term7724);
        setField(term7654, term7654.getClass(), "createdAt", term7719);
        setIntField(term7730, term7730.getClass(), "year", 2014);
        setShortField(term7730, term7730.getClass(), "month", (short) 11);
        setShortField(term7730, term7730.getClass(), "day", (short) 8);
        setField(term7729, term7729.getClass(), "date", term7730);
        setByteField(term7734, term7734.getClass(), "hour", (byte) 8);
        setByteField(term7734, term7734.getClass(), "minute", (byte) 43);
        setByteField(term7734, term7734.getClass(), "second", (byte) 32);
        setIntField(term7734, term7734.getClass(), "nano", 154434838);
        setField(term7729, term7729.getClass(), "time", term7734);
        setField(term7654, term7654.getClass(), "updatedAt", term7729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        Object[] args = new Object[1];
        args[0] = enum20;
        callMethod(klass, "setRegion", argTypes, term7654, args);
    }

};


