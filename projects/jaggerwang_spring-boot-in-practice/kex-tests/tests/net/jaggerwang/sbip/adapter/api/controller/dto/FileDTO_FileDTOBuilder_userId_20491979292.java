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

public class FileDTO_FileDTOBuilder_userId_20491979292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53589;
     Object term53697;

    public FileDTO_FileDTOBuilder_userId_20491979292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53590 = new Long(736282298030442495L);
        Long term53592 = new Long(-8385042448755891761L);
        Class<? extends Object> term53700 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term53699 = ((Class) term53700).getDeclaredField((String) "LOCAL");
        ((Field) term53699).setAccessible(true);
        Object enum103 = ((Field) term53699).get((Object) null);
        Long term53640 = new Long(3776640840397782177L);
        HashMap term53686 = new HashMap();
        term53589 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term53627 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term53654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53669 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term53589, term53589.getClass(), "id", term53590);
        setField(term53589, term53589.getClass(), "userId", term53592);
        setField(term53589, term53589.getClass(), "region", enum103);
        setField(term53589, term53589.getClass(), "bucket", "kSGsHNQQoW");
        setField(term53589, term53589.getClass(), "path", "MWezlyjdaG");
        setField(term53627, term53627.getClass(), "name", "drpBJuEKQG");
        setField(term53627, term53627.getClass(), "size", term53640);
        setField(term53627, term53627.getClass(), "type", "GGpORnLrOW");
        setField(term53589, term53589.getClass(), "meta", term53627);
        setIntField(term53655, term53655.getClass(), "year", 2019);
        setShortField(term53655, term53655.getClass(), "month", (short) 4);
        setShortField(term53655, term53655.getClass(), "day", (short) 21);
        setField(term53654, term53654.getClass(), "date", term53655);
        setByteField(term53659, term53659.getClass(), "hour", (byte) 17);
        setByteField(term53659, term53659.getClass(), "minute", (byte) 1);
        setByteField(term53659, term53659.getClass(), "second", (byte) 1);
        setIntField(term53659, term53659.getClass(), "nano", 802156649);
        setField(term53654, term53654.getClass(), "time", term53659);
        setField(term53589, term53589.getClass(), "createdAt", term53654);
        setIntField(term53665, term53665.getClass(), "year", 2029);
        setShortField(term53665, term53665.getClass(), "month", (short) 8);
        setShortField(term53665, term53665.getClass(), "day", (short) 7);
        setField(term53664, term53664.getClass(), "date", term53665);
        setByteField(term53669, term53669.getClass(), "hour", (byte) 5);
        setByteField(term53669, term53669.getClass(), "minute", (byte) 54);
        setByteField(term53669, term53669.getClass(), "second", (byte) 5);
        setIntField(term53669, term53669.getClass(), "nano", 873009584);
        setField(term53664, term53664.getClass(), "time", term53669);
        setField(term53589, term53589.getClass(), "updatedAt", term53664);
        setField(term53589, term53589.getClass(), "url", "gDGZwlpOZx");
        setField(term53589, term53589.getClass(), "thumbs", term53686);
        term53697 = new Long(-4458985981191164653L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term53697;
        callMethod(klass, "userId", argTypes, term53589, args);
    }

};


