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

public class FileDTO_setId_30368845813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22170;
     Object term22278;

    public FileDTO_setId_30368845813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22171 = new Long(-7273680182770718108L);
        Long term22173 = new Long(-421166328269063791L);
        Class<? extends Object> term22281 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term22280 = ((Class) term22281).getDeclaredField((String) "LOCAL");
        ((Field) term22280).setAccessible(true);
        Object enum42 = ((Field) term22280).get((Object) null);
        Long term22221 = new Long(4811527754205378980L);
        HashMap term22267 = new HashMap();
        term22170 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term22208 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term22235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22240 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22250 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22170, term22170.getClass(), "id", term22171);
        setField(term22170, term22170.getClass(), "userId", term22173);
        setField(term22170, term22170.getClass(), "region", enum42);
        setField(term22170, term22170.getClass(), "bucket", "KtuuNAqGCQ");
        setField(term22170, term22170.getClass(), "path", "OGQsfjmReM");
        setField(term22208, term22208.getClass(), "name", "YsUtbngnRO");
        setField(term22208, term22208.getClass(), "size", term22221);
        setField(term22208, term22208.getClass(), "type", "JisaWUxcNb");
        setField(term22170, term22170.getClass(), "meta", term22208);
        setIntField(term22236, term22236.getClass(), "year", 2025);
        setShortField(term22236, term22236.getClass(), "month", (short) 1);
        setShortField(term22236, term22236.getClass(), "day", (short) 20);
        setField(term22235, term22235.getClass(), "date", term22236);
        setByteField(term22240, term22240.getClass(), "hour", (byte) 22);
        setByteField(term22240, term22240.getClass(), "minute", (byte) 55);
        setByteField(term22240, term22240.getClass(), "second", (byte) 9);
        setIntField(term22240, term22240.getClass(), "nano", 660955568);
        setField(term22235, term22235.getClass(), "time", term22240);
        setField(term22170, term22170.getClass(), "createdAt", term22235);
        setIntField(term22246, term22246.getClass(), "year", 2014);
        setShortField(term22246, term22246.getClass(), "month", (short) 2);
        setShortField(term22246, term22246.getClass(), "day", (short) 26);
        setField(term22245, term22245.getClass(), "date", term22246);
        setByteField(term22250, term22250.getClass(), "hour", (byte) 16);
        setByteField(term22250, term22250.getClass(), "minute", (byte) 42);
        setByteField(term22250, term22250.getClass(), "second", (byte) 39);
        setIntField(term22250, term22250.getClass(), "nano", 690212071);
        setField(term22245, term22245.getClass(), "time", term22250);
        setField(term22170, term22170.getClass(), "updatedAt", term22245);
        setField(term22170, term22170.getClass(), "url", "NxgmYPzWCI");
        setField(term22170, term22170.getClass(), "thumbs", term22267);
        term22278 = new Long(9174730812791817537L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22278;
        callMethod(klass, "setId", argTypes, term22170, args);
    }

};


