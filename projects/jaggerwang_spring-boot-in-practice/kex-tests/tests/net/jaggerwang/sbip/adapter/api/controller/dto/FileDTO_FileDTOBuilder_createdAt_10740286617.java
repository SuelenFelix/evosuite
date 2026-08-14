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

public class FileDTO_FileDTOBuilder_createdAt_10740286617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55582;
     Object term55690;

    public FileDTO_FileDTOBuilder_createdAt_10740286617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55583 = new Long(4591729712990322550L);
        Long term55585 = new Long(-1013072826351726812L);
        Class<? extends Object> term55701 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term55700 = ((Class) term55701).getDeclaredField((String) "LOCAL");
        ((Field) term55700).setAccessible(true);
        Object enum108 = ((Field) term55700).get((Object) null);
        Long term55633 = new Long(4992284695861622180L);
        HashMap term55679 = new HashMap();
        term55582 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term55620 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term55647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55652 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55662 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term55582, term55582.getClass(), "id", term55583);
        setField(term55582, term55582.getClass(), "userId", term55585);
        setField(term55582, term55582.getClass(), "region", enum108);
        setField(term55582, term55582.getClass(), "bucket", "FmIpnxjRxA");
        setField(term55582, term55582.getClass(), "path", "FTjxxGvyun");
        setField(term55620, term55620.getClass(), "name", "qsjXSwKloH");
        setField(term55620, term55620.getClass(), "size", term55633);
        setField(term55620, term55620.getClass(), "type", "DDZHUPglvb");
        setField(term55582, term55582.getClass(), "meta", term55620);
        setIntField(term55648, term55648.getClass(), "year", 2012);
        setShortField(term55648, term55648.getClass(), "month", (short) 2);
        setShortField(term55648, term55648.getClass(), "day", (short) 16);
        setField(term55647, term55647.getClass(), "date", term55648);
        setByteField(term55652, term55652.getClass(), "hour", (byte) 5);
        setByteField(term55652, term55652.getClass(), "minute", (byte) 12);
        setByteField(term55652, term55652.getClass(), "second", (byte) 33);
        setIntField(term55652, term55652.getClass(), "nano", 551526646);
        setField(term55647, term55647.getClass(), "time", term55652);
        setField(term55582, term55582.getClass(), "createdAt", term55647);
        setIntField(term55658, term55658.getClass(), "year", 2028);
        setShortField(term55658, term55658.getClass(), "month", (short) 5);
        setShortField(term55658, term55658.getClass(), "day", (short) 29);
        setField(term55657, term55657.getClass(), "date", term55658);
        setByteField(term55662, term55662.getClass(), "hour", (byte) 0);
        setByteField(term55662, term55662.getClass(), "minute", (byte) 20);
        setByteField(term55662, term55662.getClass(), "second", (byte) 4);
        setIntField(term55662, term55662.getClass(), "nano", 186776026);
        setField(term55657, term55657.getClass(), "time", term55662);
        setField(term55582, term55582.getClass(), "updatedAt", term55657);
        setField(term55582, term55582.getClass(), "url", "rWoaXvNyVg");
        setField(term55582, term55582.getClass(), "thumbs", term55679);
        term55690 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55691 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55695 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term55691, term55691.getClass(), "year", 2021);
        setShortField(term55691, term55691.getClass(), "month", (short) 3);
        setShortField(term55691, term55691.getClass(), "day", (short) 30);
        setField(term55690, term55690.getClass(), "date", term55691);
        setByteField(term55695, term55695.getClass(), "hour", (byte) 4);
        setByteField(term55695, term55695.getClass(), "minute", (byte) 19);
        setByteField(term55695, term55695.getClass(), "second", (byte) 24);
        setIntField(term55695, term55695.getClass(), "nano", 421494175);
        setField(term55690, term55690.getClass(), "time", term55695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term55690;
        callMethod(klass, "createdAt", argTypes, term55582, args);
    }

};


