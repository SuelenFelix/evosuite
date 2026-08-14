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

public class FileDTO_FileDTOBuilder_bucket_12473709384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54351;

    public FileDTO_FileDTOBuilder_bucket_12473709384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54352 = new Long(-5630319423499317967L);
        Long term54354 = new Long(7053349473507426657L);
        Class<? extends Object> term54472 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term54471 = ((Class) term54472).getDeclaredField((String) "LOCAL");
        ((Field) term54471).setAccessible(true);
        Object enum105 = ((Field) term54471).get((Object) null);
        Long term54402 = new Long(8761438573959719489L);
        HashMap term54448 = new HashMap();
        term54351 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term54389 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term54416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54421 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54431 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term54351, term54351.getClass(), "id", term54352);
        setField(term54351, term54351.getClass(), "userId", term54354);
        setField(term54351, term54351.getClass(), "region", enum105);
        setField(term54351, term54351.getClass(), "bucket", "zUXaSvayQe");
        setField(term54351, term54351.getClass(), "path", "bPVcnnQPSC");
        setField(term54389, term54389.getClass(), "name", "PQLyoEKWSa");
        setField(term54389, term54389.getClass(), "size", term54402);
        setField(term54389, term54389.getClass(), "type", "HOgkhttJZS");
        setField(term54351, term54351.getClass(), "meta", term54389);
        setIntField(term54417, term54417.getClass(), "year", 2016);
        setShortField(term54417, term54417.getClass(), "month", (short) 10);
        setShortField(term54417, term54417.getClass(), "day", (short) 4);
        setField(term54416, term54416.getClass(), "date", term54417);
        setByteField(term54421, term54421.getClass(), "hour", (byte) 21);
        setByteField(term54421, term54421.getClass(), "minute", (byte) 48);
        setByteField(term54421, term54421.getClass(), "second", (byte) 47);
        setIntField(term54421, term54421.getClass(), "nano", 98983875);
        setField(term54416, term54416.getClass(), "time", term54421);
        setField(term54351, term54351.getClass(), "createdAt", term54416);
        setIntField(term54427, term54427.getClass(), "year", 2027);
        setShortField(term54427, term54427.getClass(), "month", (short) 1);
        setShortField(term54427, term54427.getClass(), "day", (short) 18);
        setField(term54426, term54426.getClass(), "date", term54427);
        setByteField(term54431, term54431.getClass(), "hour", (byte) 14);
        setByteField(term54431, term54431.getClass(), "minute", (byte) 46);
        setByteField(term54431, term54431.getClass(), "second", (byte) 5);
        setIntField(term54431, term54431.getClass(), "nano", 748048450);
        setField(term54426, term54426.getClass(), "time", term54431);
        setField(term54351, term54351.getClass(), "updatedAt", term54426);
        setField(term54351, term54351.getClass(), "url", "goqNSmXSSS");
        setField(term54351, term54351.getClass(), "thumbs", term54448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlxGFzEifL";
        callMethod(klass, "bucket", argTypes, term54351, args);
    }

};


