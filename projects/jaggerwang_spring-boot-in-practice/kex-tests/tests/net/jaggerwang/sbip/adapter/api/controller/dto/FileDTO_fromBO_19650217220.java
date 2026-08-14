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

public class FileDTO_fromBO_19650217220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17643;

    public FileDTO_fromBO_19650217220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17644 = new Long(1740732617708040141L);
        Long term17646 = new Long(3472971833455746664L);
        Class<? extends Object> term17729 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term17728 = ((Class) term17729).getDeclaredField((String) "LOCAL");
        ((Field) term17728).setAccessible(true);
        Object enum30 = ((Field) term17728).get((Object) null);
        Long term17694 = new Long(3731931947533293029L);
        term17643 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term17681 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term17708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17723 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17643, term17643.getClass(), "id", term17644);
        setField(term17643, term17643.getClass(), "userId", term17646);
        setField(term17643, term17643.getClass(), "region", enum30);
        setField(term17643, term17643.getClass(), "bucket", "llRfwANcVF");
        setField(term17643, term17643.getClass(), "path", "sUEeHQTWkA");
        setField(term17681, term17681.getClass(), "name", "BDIRCxAWLA");
        setField(term17681, term17681.getClass(), "size", term17694);
        setField(term17681, term17681.getClass(), "type", "eOJfbiZLnb");
        setField(term17643, term17643.getClass(), "meta", term17681);
        setIntField(term17709, term17709.getClass(), "year", 2022);
        setShortField(term17709, term17709.getClass(), "month", (short) 1);
        setShortField(term17709, term17709.getClass(), "day", (short) 4);
        setField(term17708, term17708.getClass(), "date", term17709);
        setByteField(term17713, term17713.getClass(), "hour", (byte) 21);
        setByteField(term17713, term17713.getClass(), "minute", (byte) 36);
        setByteField(term17713, term17713.getClass(), "second", (byte) 43);
        setIntField(term17713, term17713.getClass(), "nano", 941221944);
        setField(term17708, term17708.getClass(), "time", term17713);
        setField(term17643, term17643.getClass(), "createdAt", term17708);
        setIntField(term17719, term17719.getClass(), "year", 2011);
        setShortField(term17719, term17719.getClass(), "month", (short) 4);
        setShortField(term17719, term17719.getClass(), "day", (short) 18);
        setField(term17718, term17718.getClass(), "date", term17719);
        setByteField(term17723, term17723.getClass(), "hour", (byte) 15);
        setByteField(term17723, term17723.getClass(), "minute", (byte) 35);
        setByteField(term17723, term17723.getClass(), "second", (byte) 7);
        setIntField(term17723, term17723.getClass(), "nano", 925983040);
        setField(term17718, term17718.getClass(), "time", term17723);
        setField(term17643, term17643.getClass(), "updatedAt", term17718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Object[] args = new Object[1];
        args[0] = term17643;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


