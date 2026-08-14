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

public class File_setMeta_24684427317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19716;
     Object term19801;

    public File_setMeta_24684427317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19717 = new Long(-5714578622746827780L);
        Long term19719 = new Long(8918129626022907229L);
        Class<? extends Object> term19829 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term19828 = ((Class) term19829).getDeclaredField((String) "LOCAL");
        ((Field) term19828).setAccessible(true);
        Object enum51 = ((Field) term19828).get((Object) null);
        Long term19767 = new Long(6269054578518955349L);
        term19716 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term19754 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term19781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19796 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19716, term19716.getClass(), "id", term19717);
        setField(term19716, term19716.getClass(), "userId", term19719);
        setField(term19716, term19716.getClass(), "region", enum51);
        setField(term19716, term19716.getClass(), "bucket", "PgPzMSEjjX");
        setField(term19716, term19716.getClass(), "path", "wzsPSPcRdj");
        setField(term19754, term19754.getClass(), "name", "kGMQdqJYyB");
        setField(term19754, term19754.getClass(), "size", term19767);
        setField(term19754, term19754.getClass(), "type", "XJJNClzHRf");
        setField(term19716, term19716.getClass(), "meta", term19754);
        setIntField(term19782, term19782.getClass(), "year", 2010);
        setShortField(term19782, term19782.getClass(), "month", (short) 5);
        setShortField(term19782, term19782.getClass(), "day", (short) 19);
        setField(term19781, term19781.getClass(), "date", term19782);
        setByteField(term19786, term19786.getClass(), "hour", (byte) 12);
        setByteField(term19786, term19786.getClass(), "minute", (byte) 17);
        setByteField(term19786, term19786.getClass(), "second", (byte) 52);
        setIntField(term19786, term19786.getClass(), "nano", 273610077);
        setField(term19781, term19781.getClass(), "time", term19786);
        setField(term19716, term19716.getClass(), "createdAt", term19781);
        setIntField(term19792, term19792.getClass(), "year", 2017);
        setShortField(term19792, term19792.getClass(), "month", (short) 4);
        setShortField(term19792, term19792.getClass(), "day", (short) 5);
        setField(term19791, term19791.getClass(), "date", term19792);
        setByteField(term19796, term19796.getClass(), "hour", (byte) 15);
        setByteField(term19796, term19796.getClass(), "minute", (byte) 9);
        setByteField(term19796, term19796.getClass(), "second", (byte) 36);
        setIntField(term19796, term19796.getClass(), "nano", 504876449);
        setField(term19791, term19791.getClass(), "time", term19796);
        setField(term19716, term19716.getClass(), "updatedAt", term19791);
        Long term19814 = new Long(-143609946830350439L);
        term19801 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term19801, term19801.getClass(), "name", "HDaezxQfQR");
        setField(term19801, term19801.getClass(), "size", term19814);
        setField(term19801, term19801.getClass(), "type", "iikZEapDlu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        Object[] args = new Object[1];
        args[0] = term19801;
        callMethod(klass, "setMeta", argTypes, term19716, args);
    }

};


