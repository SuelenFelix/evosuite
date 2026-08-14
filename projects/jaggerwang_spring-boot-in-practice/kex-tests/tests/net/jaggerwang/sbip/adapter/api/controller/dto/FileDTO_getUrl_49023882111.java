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

public class FileDTO_getUrl_49023882111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21410;

    public FileDTO_getUrl_49023882111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21411 = new Long(-8993073054427011802L);
        Long term21413 = new Long(2287785643837657068L);
        Class<? extends Object> term21519 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term21518 = ((Class) term21519).getDeclaredField((String) "LOCAL");
        ((Field) term21518).setAccessible(true);
        Object enum40 = ((Field) term21518).get((Object) null);
        Long term21461 = new Long(-7283193381993602128L);
        HashMap term21507 = new HashMap();
        term21410 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term21448 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term21475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21480 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21490 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21410, term21410.getClass(), "id", term21411);
        setField(term21410, term21410.getClass(), "userId", term21413);
        setField(term21410, term21410.getClass(), "region", enum40);
        setField(term21410, term21410.getClass(), "bucket", "EusenEbIoF");
        setField(term21410, term21410.getClass(), "path", "SScVQYSvWH");
        setField(term21448, term21448.getClass(), "name", "MnovcqFhCl");
        setField(term21448, term21448.getClass(), "size", term21461);
        setField(term21448, term21448.getClass(), "type", "qYtAeLzOhW");
        setField(term21410, term21410.getClass(), "meta", term21448);
        setIntField(term21476, term21476.getClass(), "year", 2018);
        setShortField(term21476, term21476.getClass(), "month", (short) 2);
        setShortField(term21476, term21476.getClass(), "day", (short) 4);
        setField(term21475, term21475.getClass(), "date", term21476);
        setByteField(term21480, term21480.getClass(), "hour", (byte) 5);
        setByteField(term21480, term21480.getClass(), "minute", (byte) 35);
        setByteField(term21480, term21480.getClass(), "second", (byte) 40);
        setIntField(term21480, term21480.getClass(), "nano", 354661894);
        setField(term21475, term21475.getClass(), "time", term21480);
        setField(term21410, term21410.getClass(), "createdAt", term21475);
        setIntField(term21486, term21486.getClass(), "year", 2010);
        setShortField(term21486, term21486.getClass(), "month", (short) 3);
        setShortField(term21486, term21486.getClass(), "day", (short) 23);
        setField(term21485, term21485.getClass(), "date", term21486);
        setByteField(term21490, term21490.getClass(), "hour", (byte) 17);
        setByteField(term21490, term21490.getClass(), "minute", (byte) 32);
        setByteField(term21490, term21490.getClass(), "second", (byte) 36);
        setIntField(term21490, term21490.getClass(), "nano", 470582535);
        setField(term21485, term21485.getClass(), "time", term21490);
        setField(term21410, term21410.getClass(), "updatedAt", term21485);
        setField(term21410, term21410.getClass(), "url", "tJzmOfcUnY");
        setField(term21410, term21410.getClass(), "thumbs", term21507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term21410, args);
    }

};


