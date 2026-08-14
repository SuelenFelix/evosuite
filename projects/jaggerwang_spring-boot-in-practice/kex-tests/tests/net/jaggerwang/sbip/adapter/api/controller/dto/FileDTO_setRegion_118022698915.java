package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class FileDTO_setRegion_118022698915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22934;
     Object enum44;

    public FileDTO_setRegion_118022698915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22935 = new Long(-2828343143039517941L);
        Long term22937 = new Long(2809748481176687920L);
        Class<? extends Object> term23043 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term23042 = ((Class) term23043).getDeclaredField((String) "LOCAL");
        ((Field) term23042).setAccessible(true);
        enum44 = ((Field) term23042).get((Object) null);
        Long term22985 = new Long(4012955251407483889L);
        HashMap term23031 = new HashMap();
        term22934 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term22972 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term22999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23004 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23009 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23010 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23014 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22934, term22934.getClass(), "id", term22935);
        setField(term22934, term22934.getClass(), "userId", term22937);
        setField(term22934, term22934.getClass(), "region", enum44);
        setField(term22934, term22934.getClass(), "bucket", "weddIktxOA");
        setField(term22934, term22934.getClass(), "path", "uSlMeISsDD");
        setField(term22972, term22972.getClass(), "name", "WdCiTDUKqn");
        setField(term22972, term22972.getClass(), "size", term22985);
        setField(term22972, term22972.getClass(), "type", "PSizQDoxxe");
        setField(term22934, term22934.getClass(), "meta", term22972);
        setIntField(term23000, term23000.getClass(), "year", 2020);
        setShortField(term23000, term23000.getClass(), "month", (short) 7);
        setShortField(term23000, term23000.getClass(), "day", (short) 24);
        setField(term22999, term22999.getClass(), "date", term23000);
        setByteField(term23004, term23004.getClass(), "hour", (byte) 22);
        setByteField(term23004, term23004.getClass(), "minute", (byte) 16);
        setByteField(term23004, term23004.getClass(), "second", (byte) 59);
        setIntField(term23004, term23004.getClass(), "nano", 588569833);
        setField(term22999, term22999.getClass(), "time", term23004);
        setField(term22934, term22934.getClass(), "createdAt", term22999);
        setIntField(term23010, term23010.getClass(), "year", 2019);
        setShortField(term23010, term23010.getClass(), "month", (short) 8);
        setShortField(term23010, term23010.getClass(), "day", (short) 6);
        setField(term23009, term23009.getClass(), "date", term23010);
        setByteField(term23014, term23014.getClass(), "hour", (byte) 5);
        setByteField(term23014, term23014.getClass(), "minute", (byte) 32);
        setByteField(term23014, term23014.getClass(), "second", (byte) 47);
        setIntField(term23014, term23014.getClass(), "nano", 73220317);
        setField(term23009, term23009.getClass(), "time", term23014);
        setField(term22934, term22934.getClass(), "updatedAt", term23009);
        setField(term22934, term22934.getClass(), "url", "mKaHyMybrK");
        setField(term22934, term22934.getClass(), "thumbs", term23031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        Object[] args = new Object[1];
        args[0] = enum44;
        callMethod(klass, "setRegion", argTypes, term22934, args);
    }

};


