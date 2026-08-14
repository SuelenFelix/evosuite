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

public class FileDTO_setUserId_4154072514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22552;
     Object term22660;

    public FileDTO_setUserId_4154072514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22553 = new Long(8024477479047145752L);
        Long term22555 = new Long(7006402814669334483L);
        Class<? extends Object> term22663 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term22662 = ((Class) term22663).getDeclaredField((String) "LOCAL");
        ((Field) term22662).setAccessible(true);
        Object enum43 = ((Field) term22662).get((Object) null);
        Long term22603 = new Long(-4003544865306793676L);
        HashMap term22649 = new HashMap();
        term22552 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term22590 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term22617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22632 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22552, term22552.getClass(), "id", term22553);
        setField(term22552, term22552.getClass(), "userId", term22555);
        setField(term22552, term22552.getClass(), "region", enum43);
        setField(term22552, term22552.getClass(), "bucket", "XjDhvToxJy");
        setField(term22552, term22552.getClass(), "path", "nxSTJflLQy");
        setField(term22590, term22590.getClass(), "name", "FlHzxEfFzI");
        setField(term22590, term22590.getClass(), "size", term22603);
        setField(term22590, term22590.getClass(), "type", "aSATgQUpoe");
        setField(term22552, term22552.getClass(), "meta", term22590);
        setIntField(term22618, term22618.getClass(), "year", 2019);
        setShortField(term22618, term22618.getClass(), "month", (short) 9);
        setShortField(term22618, term22618.getClass(), "day", (short) 3);
        setField(term22617, term22617.getClass(), "date", term22618);
        setByteField(term22622, term22622.getClass(), "hour", (byte) 2);
        setByteField(term22622, term22622.getClass(), "minute", (byte) 32);
        setByteField(term22622, term22622.getClass(), "second", (byte) 30);
        setIntField(term22622, term22622.getClass(), "nano", 339846128);
        setField(term22617, term22617.getClass(), "time", term22622);
        setField(term22552, term22552.getClass(), "createdAt", term22617);
        setIntField(term22628, term22628.getClass(), "year", 2029);
        setShortField(term22628, term22628.getClass(), "month", (short) 11);
        setShortField(term22628, term22628.getClass(), "day", (short) 6);
        setField(term22627, term22627.getClass(), "date", term22628);
        setByteField(term22632, term22632.getClass(), "hour", (byte) 2);
        setByteField(term22632, term22632.getClass(), "minute", (byte) 55);
        setByteField(term22632, term22632.getClass(), "second", (byte) 43);
        setIntField(term22632, term22632.getClass(), "nano", 109400580);
        setField(term22627, term22627.getClass(), "time", term22632);
        setField(term22552, term22552.getClass(), "updatedAt", term22627);
        setField(term22552, term22552.getClass(), "url", "VkPSXewZfB");
        setField(term22552, term22552.getClass(), "thumbs", term22649);
        term22660 = new Long(-769824408235898287L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22660;
        callMethod(klass, "setUserId", argTypes, term22552, args);
    }

};


