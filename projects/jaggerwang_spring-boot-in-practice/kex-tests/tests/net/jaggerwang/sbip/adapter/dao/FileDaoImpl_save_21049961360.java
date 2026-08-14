package net.jaggerwang.sbip.adapter.dao;

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
import static net.jaggerwang.sbip.adapter.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FileDaoImpl_save_21049961360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22610;

    public FileDaoImpl_save_21049961360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22611 = new Long(-6503611645609982617L);
        Long term22613 = new Long(-7574091101944828886L);
        Class<? extends Object> term22696 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term22695 = ((Class) term22696).getDeclaredField((String) "LOCAL");
        ((Field) term22695).setAccessible(true);
        Object enum59 = ((Field) term22695).get((Object) null);
        Long term22661 = new Long(-6792339614909987294L);
        term22610 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term22648 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term22675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22690 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22610, term22610.getClass(), "id", term22611);
        setField(term22610, term22610.getClass(), "userId", term22613);
        setField(term22610, term22610.getClass(), "region", enum59);
        setField(term22610, term22610.getClass(), "bucket", "aSkmSwTnEw");
        setField(term22610, term22610.getClass(), "path", "xvkbvaEGYd");
        setField(term22648, term22648.getClass(), "name", "HBGNxdNURv");
        setField(term22648, term22648.getClass(), "size", term22661);
        setField(term22648, term22648.getClass(), "type", "mfCpTPPQQm");
        setField(term22610, term22610.getClass(), "meta", term22648);
        setIntField(term22676, term22676.getClass(), "year", 2020);
        setShortField(term22676, term22676.getClass(), "month", (short) 5);
        setShortField(term22676, term22676.getClass(), "day", (short) 31);
        setField(term22675, term22675.getClass(), "date", term22676);
        setByteField(term22680, term22680.getClass(), "hour", (byte) 17);
        setByteField(term22680, term22680.getClass(), "minute", (byte) 5);
        setByteField(term22680, term22680.getClass(), "second", (byte) 38);
        setIntField(term22680, term22680.getClass(), "nano", 709012300);
        setField(term22675, term22675.getClass(), "time", term22680);
        setField(term22610, term22610.getClass(), "createdAt", term22675);
        setIntField(term22686, term22686.getClass(), "year", 2021);
        setShortField(term22686, term22686.getClass(), "month", (short) 7);
        setShortField(term22686, term22686.getClass(), "day", (short) 6);
        setField(term22685, term22685.getClass(), "date", term22686);
        setByteField(term22690, term22690.getClass(), "hour", (byte) 12);
        setByteField(term22690, term22690.getClass(), "minute", (byte) 46);
        setByteField(term22690, term22690.getClass(), "second", (byte) 42);
        setIntField(term22690, term22690.getClass(), "nano", 512890850);
        setField(term22685, term22685.getClass(), "time", term22690);
        setField(term22610, term22610.getClass(), "updatedAt", term22685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.FileDaoImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Object[] args = new Object[1];
        args[0] = term22610;
        callMethod(klass, "save", argTypes, null, args);
    }

};


