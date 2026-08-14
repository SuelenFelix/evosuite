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

public class FileDTO_getCreatedAt_12411430379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20650;

    public FileDTO_getCreatedAt_12411430379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20651 = new Long(-8303973304709662279L);
        Long term20653 = new Long(6853972830905120647L);
        Class<? extends Object> term20759 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term20758 = ((Class) term20759).getDeclaredField((String) "LOCAL");
        ((Field) term20758).setAccessible(true);
        Object enum38 = ((Field) term20758).get((Object) null);
        Long term20701 = new Long(1442167273909860961L);
        HashMap term20747 = new HashMap();
        term20650 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term20688 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term20715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20730 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term20650, term20650.getClass(), "id", term20651);
        setField(term20650, term20650.getClass(), "userId", term20653);
        setField(term20650, term20650.getClass(), "region", enum38);
        setField(term20650, term20650.getClass(), "bucket", "IENRuqmwUU");
        setField(term20650, term20650.getClass(), "path", "GsWxOwXvSu");
        setField(term20688, term20688.getClass(), "name", "bKBSncrMEZ");
        setField(term20688, term20688.getClass(), "size", term20701);
        setField(term20688, term20688.getClass(), "type", "yeSXGqQExb");
        setField(term20650, term20650.getClass(), "meta", term20688);
        setIntField(term20716, term20716.getClass(), "year", 2023);
        setShortField(term20716, term20716.getClass(), "month", (short) 8);
        setShortField(term20716, term20716.getClass(), "day", (short) 8);
        setField(term20715, term20715.getClass(), "date", term20716);
        setByteField(term20720, term20720.getClass(), "hour", (byte) 20);
        setByteField(term20720, term20720.getClass(), "minute", (byte) 17);
        setByteField(term20720, term20720.getClass(), "second", (byte) 40);
        setIntField(term20720, term20720.getClass(), "nano", 834219024);
        setField(term20715, term20715.getClass(), "time", term20720);
        setField(term20650, term20650.getClass(), "createdAt", term20715);
        setIntField(term20726, term20726.getClass(), "year", 2012);
        setShortField(term20726, term20726.getClass(), "month", (short) 2);
        setShortField(term20726, term20726.getClass(), "day", (short) 12);
        setField(term20725, term20725.getClass(), "date", term20726);
        setByteField(term20730, term20730.getClass(), "hour", (byte) 16);
        setByteField(term20730, term20730.getClass(), "minute", (byte) 39);
        setByteField(term20730, term20730.getClass(), "second", (byte) 57);
        setIntField(term20730, term20730.getClass(), "nano", 651756700);
        setField(term20725, term20725.getClass(), "time", term20730);
        setField(term20650, term20650.getClass(), "updatedAt", term20725);
        setField(term20650, term20650.getClass(), "url", "uXYcXVYJZM");
        setField(term20650, term20650.getClass(), "thumbs", term20747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term20650, args);
    }

};


