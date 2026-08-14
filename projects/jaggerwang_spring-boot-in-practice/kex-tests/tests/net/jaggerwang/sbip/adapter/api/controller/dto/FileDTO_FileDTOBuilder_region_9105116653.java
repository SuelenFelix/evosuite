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

public class FileDTO_FileDTOBuilder_region_9105116653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53971;
     Object enum104;

    public FileDTO_FileDTOBuilder_region_9105116653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53972 = new Long(3774876119567638995L);
        Long term53974 = new Long(-5849140391879955934L);
        Class<? extends Object> term54080 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term54079 = ((Class) term54080).getDeclaredField((String) "LOCAL");
        ((Field) term54079).setAccessible(true);
        enum104 = ((Field) term54079).get((Object) null);
        Long term54022 = new Long(5257982794400938524L);
        HashMap term54068 = new HashMap();
        term53971 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term54009 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term54036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54041 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54051 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term53971, term53971.getClass(), "id", term53972);
        setField(term53971, term53971.getClass(), "userId", term53974);
        setField(term53971, term53971.getClass(), "region", enum104);
        setField(term53971, term53971.getClass(), "bucket", "pADwkrWiMW");
        setField(term53971, term53971.getClass(), "path", "FDORDJuAXQ");
        setField(term54009, term54009.getClass(), "name", "yjqoDeLBLg");
        setField(term54009, term54009.getClass(), "size", term54022);
        setField(term54009, term54009.getClass(), "type", "DCepDqVwas");
        setField(term53971, term53971.getClass(), "meta", term54009);
        setIntField(term54037, term54037.getClass(), "year", 2018);
        setShortField(term54037, term54037.getClass(), "month", (short) 7);
        setShortField(term54037, term54037.getClass(), "day", (short) 9);
        setField(term54036, term54036.getClass(), "date", term54037);
        setByteField(term54041, term54041.getClass(), "hour", (byte) 23);
        setByteField(term54041, term54041.getClass(), "minute", (byte) 14);
        setByteField(term54041, term54041.getClass(), "second", (byte) 46);
        setIntField(term54041, term54041.getClass(), "nano", 735911690);
        setField(term54036, term54036.getClass(), "time", term54041);
        setField(term53971, term53971.getClass(), "createdAt", term54036);
        setIntField(term54047, term54047.getClass(), "year", 2013);
        setShortField(term54047, term54047.getClass(), "month", (short) 3);
        setShortField(term54047, term54047.getClass(), "day", (short) 22);
        setField(term54046, term54046.getClass(), "date", term54047);
        setByteField(term54051, term54051.getClass(), "hour", (byte) 5);
        setByteField(term54051, term54051.getClass(), "minute", (byte) 34);
        setByteField(term54051, term54051.getClass(), "second", (byte) 39);
        setIntField(term54051, term54051.getClass(), "nano", 3203168);
        setField(term54046, term54046.getClass(), "time", term54051);
        setField(term53971, term53971.getClass(), "updatedAt", term54046);
        setField(term53971, term53971.getClass(), "url", "wKIBUlfNCx");
        setField(term53971, term53971.getClass(), "thumbs", term54068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        Object[] args = new Object[1];
        args[0] = enum104;
        callMethod(klass, "region", argTypes, term53971, args);
    }

};


