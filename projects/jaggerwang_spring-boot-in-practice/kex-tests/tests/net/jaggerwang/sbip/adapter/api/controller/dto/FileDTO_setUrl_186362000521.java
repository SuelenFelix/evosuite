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

public class FileDTO_setUrl_186362000521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25325;

    public FileDTO_setUrl_186362000521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25326 = new Long(8010417010297313651L);
        Long term25328 = new Long(5845993504299821981L);
        Class<? extends Object> term25446 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term25445 = ((Class) term25446).getDeclaredField((String) "LOCAL");
        ((Field) term25445).setAccessible(true);
        Object enum50 = ((Field) term25445).get((Object) null);
        Long term25376 = new Long(-1528017371096319990L);
        HashMap term25422 = new HashMap();
        term25325 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term25363 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term25390 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25395 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25400 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25401 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25405 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25325, term25325.getClass(), "id", term25326);
        setField(term25325, term25325.getClass(), "userId", term25328);
        setField(term25325, term25325.getClass(), "region", enum50);
        setField(term25325, term25325.getClass(), "bucket", "goAoCMhKBu");
        setField(term25325, term25325.getClass(), "path", "BWxJSgKHRT");
        setField(term25363, term25363.getClass(), "name", "AGXoIndFnm");
        setField(term25363, term25363.getClass(), "size", term25376);
        setField(term25363, term25363.getClass(), "type", "mwmFMNEzkK");
        setField(term25325, term25325.getClass(), "meta", term25363);
        setIntField(term25391, term25391.getClass(), "year", 2019);
        setShortField(term25391, term25391.getClass(), "month", (short) 5);
        setShortField(term25391, term25391.getClass(), "day", (short) 16);
        setField(term25390, term25390.getClass(), "date", term25391);
        setByteField(term25395, term25395.getClass(), "hour", (byte) 3);
        setByteField(term25395, term25395.getClass(), "minute", (byte) 12);
        setByteField(term25395, term25395.getClass(), "second", (byte) 27);
        setIntField(term25395, term25395.getClass(), "nano", 775737832);
        setField(term25390, term25390.getClass(), "time", term25395);
        setField(term25325, term25325.getClass(), "createdAt", term25390);
        setIntField(term25401, term25401.getClass(), "year", 2016);
        setShortField(term25401, term25401.getClass(), "month", (short) 12);
        setShortField(term25401, term25401.getClass(), "day", (short) 2);
        setField(term25400, term25400.getClass(), "date", term25401);
        setByteField(term25405, term25405.getClass(), "hour", (byte) 7);
        setByteField(term25405, term25405.getClass(), "minute", (byte) 38);
        setByteField(term25405, term25405.getClass(), "second", (byte) 49);
        setIntField(term25405, term25405.getClass(), "nano", 415044053);
        setField(term25400, term25400.getClass(), "time", term25405);
        setField(term25325, term25325.getClass(), "updatedAt", term25400);
        setField(term25325, term25325.getClass(), "url", "kVAmKknVln");
        setField(term25325, term25325.getClass(), "thumbs", term25422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYrGukTyof";
        callMethod(klass, "setUrl", argTypes, term25325, args);
    }

};


