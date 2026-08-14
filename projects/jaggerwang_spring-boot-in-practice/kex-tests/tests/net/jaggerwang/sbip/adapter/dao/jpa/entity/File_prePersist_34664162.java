package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class File_prePersist_34664162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14810;

    public File_prePersist_34664162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14811 = new Long(-4231979631084175364L);
        Long term14813 = new Long(1634166935474035772L);
        Class<? extends Object> term14896 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term14895 = ((Class) term14896).getDeclaredField((String) "LOCAL");
        ((Field) term14895).setAccessible(true);
        Object enum37 = ((Field) term14895).get((Object) null);
        Long term14861 = new Long(-2614906266506360948L);
        term14810 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term14848 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term14875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14890 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14810, term14810.getClass(), "id", term14811);
        setField(term14810, term14810.getClass(), "userId", term14813);
        setField(term14810, term14810.getClass(), "region", enum37);
        setField(term14810, term14810.getClass(), "bucket", "VMeAzAHwZj");
        setField(term14810, term14810.getClass(), "path", "PznxWXsZME");
        setField(term14848, term14848.getClass(), "name", "ZzIujlwVsw");
        setField(term14848, term14848.getClass(), "size", term14861);
        setField(term14848, term14848.getClass(), "type", "LWyEaeIyAo");
        setField(term14810, term14810.getClass(), "meta", term14848);
        setIntField(term14876, term14876.getClass(), "year", 2028);
        setShortField(term14876, term14876.getClass(), "month", (short) 12);
        setShortField(term14876, term14876.getClass(), "day", (short) 2);
        setField(term14875, term14875.getClass(), "date", term14876);
        setByteField(term14880, term14880.getClass(), "hour", (byte) 18);
        setByteField(term14880, term14880.getClass(), "minute", (byte) 6);
        setByteField(term14880, term14880.getClass(), "second", (byte) 45);
        setIntField(term14880, term14880.getClass(), "nano", 967474945);
        setField(term14875, term14875.getClass(), "time", term14880);
        setField(term14810, term14810.getClass(), "createdAt", term14875);
        setIntField(term14886, term14886.getClass(), "year", 2018);
        setShortField(term14886, term14886.getClass(), "month", (short) 11);
        setShortField(term14886, term14886.getClass(), "day", (short) 11);
        setField(term14885, term14885.getClass(), "date", term14886);
        setByteField(term14890, term14890.getClass(), "hour", (byte) 11);
        setByteField(term14890, term14890.getClass(), "minute", (byte) 30);
        setByteField(term14890, term14890.getClass(), "second", (byte) 33);
        setIntField(term14890, term14890.getClass(), "nano", 101261443);
        setField(term14885, term14885.getClass(), "time", term14890);
        setField(term14810, term14810.getClass(), "updatedAt", term14885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term14810, args);
    }

};


