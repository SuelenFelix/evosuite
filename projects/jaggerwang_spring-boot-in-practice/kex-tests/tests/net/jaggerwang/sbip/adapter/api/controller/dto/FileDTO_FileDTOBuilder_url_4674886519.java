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

public class FileDTO_FileDTOBuilder_url_4674886519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56362;

    public FileDTO_FileDTOBuilder_url_4674886519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56363 = new Long(-8676733724224510585L);
        Long term56365 = new Long(1318139313166175279L);
        Class<? extends Object> term56483 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term56482 = ((Class) term56483).getDeclaredField((String) "LOCAL");
        ((Field) term56482).setAccessible(true);
        Object enum110 = ((Field) term56482).get((Object) null);
        Long term56413 = new Long(1712520441197520950L);
        HashMap term56459 = new HashMap();
        term56362 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term56400 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term56427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56442 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term56362, term56362.getClass(), "id", term56363);
        setField(term56362, term56362.getClass(), "userId", term56365);
        setField(term56362, term56362.getClass(), "region", enum110);
        setField(term56362, term56362.getClass(), "bucket", "gASHxChKwn");
        setField(term56362, term56362.getClass(), "path", "iasolXlEEn");
        setField(term56400, term56400.getClass(), "name", "cAObIvLmLo");
        setField(term56400, term56400.getClass(), "size", term56413);
        setField(term56400, term56400.getClass(), "type", "xwiCqRSWSe");
        setField(term56362, term56362.getClass(), "meta", term56400);
        setIntField(term56428, term56428.getClass(), "year", 2016);
        setShortField(term56428, term56428.getClass(), "month", (short) 12);
        setShortField(term56428, term56428.getClass(), "day", (short) 21);
        setField(term56427, term56427.getClass(), "date", term56428);
        setByteField(term56432, term56432.getClass(), "hour", (byte) 14);
        setByteField(term56432, term56432.getClass(), "minute", (byte) 3);
        setByteField(term56432, term56432.getClass(), "second", (byte) 9);
        setIntField(term56432, term56432.getClass(), "nano", 805869273);
        setField(term56427, term56427.getClass(), "time", term56432);
        setField(term56362, term56362.getClass(), "createdAt", term56427);
        setIntField(term56438, term56438.getClass(), "year", 2011);
        setShortField(term56438, term56438.getClass(), "month", (short) 12);
        setShortField(term56438, term56438.getClass(), "day", (short) 31);
        setField(term56437, term56437.getClass(), "date", term56438);
        setByteField(term56442, term56442.getClass(), "hour", (byte) 6);
        setByteField(term56442, term56442.getClass(), "minute", (byte) 27);
        setByteField(term56442, term56442.getClass(), "second", (byte) 8);
        setIntField(term56442, term56442.getClass(), "nano", 782094318);
        setField(term56437, term56437.getClass(), "time", term56442);
        setField(term56362, term56362.getClass(), "updatedAt", term56437);
        setField(term56362, term56362.getClass(), "url", "IbUFkzIgzq");
        setField(term56362, term56362.getClass(), "thumbs", term56459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PECfBejlfo";
        callMethod(klass, "url", argTypes, term56362, args);
    }

};


