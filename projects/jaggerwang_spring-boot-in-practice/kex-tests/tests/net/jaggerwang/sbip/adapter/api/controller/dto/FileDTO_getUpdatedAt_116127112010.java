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

public class FileDTO_getUpdatedAt_116127112010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21030;

    public FileDTO_getUpdatedAt_116127112010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21031 = new Long(6895382576300001141L);
        Long term21033 = new Long(9062006526792682783L);
        Class<? extends Object> term21139 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term21138 = ((Class) term21139).getDeclaredField((String) "LOCAL");
        ((Field) term21138).setAccessible(true);
        Object enum39 = ((Field) term21138).get((Object) null);
        Long term21081 = new Long(-7400951017937830861L);
        HashMap term21127 = new HashMap();
        term21030 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term21068 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term21095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21100 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21105 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21106 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21110 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21030, term21030.getClass(), "id", term21031);
        setField(term21030, term21030.getClass(), "userId", term21033);
        setField(term21030, term21030.getClass(), "region", enum39);
        setField(term21030, term21030.getClass(), "bucket", "cdHYQDgUZR");
        setField(term21030, term21030.getClass(), "path", "KAORSSPSeV");
        setField(term21068, term21068.getClass(), "name", "UimMMORkzd");
        setField(term21068, term21068.getClass(), "size", term21081);
        setField(term21068, term21068.getClass(), "type", "huVIXUWLtI");
        setField(term21030, term21030.getClass(), "meta", term21068);
        setIntField(term21096, term21096.getClass(), "year", 2024);
        setShortField(term21096, term21096.getClass(), "month", (short) 12);
        setShortField(term21096, term21096.getClass(), "day", (short) 11);
        setField(term21095, term21095.getClass(), "date", term21096);
        setByteField(term21100, term21100.getClass(), "hour", (byte) 19);
        setByteField(term21100, term21100.getClass(), "minute", (byte) 38);
        setByteField(term21100, term21100.getClass(), "second", (byte) 23);
        setIntField(term21100, term21100.getClass(), "nano", 207336939);
        setField(term21095, term21095.getClass(), "time", term21100);
        setField(term21030, term21030.getClass(), "createdAt", term21095);
        setIntField(term21106, term21106.getClass(), "year", 2023);
        setShortField(term21106, term21106.getClass(), "month", (short) 3);
        setShortField(term21106, term21106.getClass(), "day", (short) 29);
        setField(term21105, term21105.getClass(), "date", term21106);
        setByteField(term21110, term21110.getClass(), "hour", (byte) 12);
        setByteField(term21110, term21110.getClass(), "minute", (byte) 11);
        setByteField(term21110, term21110.getClass(), "second", (byte) 3);
        setIntField(term21110, term21110.getClass(), "nano", 876063258);
        setField(term21105, term21105.getClass(), "time", term21110);
        setField(term21030, term21030.getClass(), "updatedAt", term21105);
        setField(term21030, term21030.getClass(), "url", "vhKzFyKPOT");
        setField(term21030, term21030.getClass(), "thumbs", term21127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term21030, args);
    }

};


