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

public class FileDTO_hashCode_80855907425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26923;

    public FileDTO_hashCode_80855907425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26924 = new Long(5304481534735378567L);
        Long term26926 = new Long(3423155413133381764L);
        Class<? extends Object> term27032 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term27031 = ((Class) term27032).getDeclaredField((String) "LOCAL");
        ((Field) term27031).setAccessible(true);
        Object enum54 = ((Field) term27031).get((Object) null);
        Long term26974 = new Long(7711054832353934171L);
        HashMap term27020 = new HashMap();
        term26923 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term26961 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term26988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26993 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27003 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26923, term26923.getClass(), "id", term26924);
        setField(term26923, term26923.getClass(), "userId", term26926);
        setField(term26923, term26923.getClass(), "region", enum54);
        setField(term26923, term26923.getClass(), "bucket", "rsumfoDNHa");
        setField(term26923, term26923.getClass(), "path", "ceCWHUTQUM");
        setField(term26961, term26961.getClass(), "name", "LrqwfrKKtS");
        setField(term26961, term26961.getClass(), "size", term26974);
        setField(term26961, term26961.getClass(), "type", "ZUdnQXfzCI");
        setField(term26923, term26923.getClass(), "meta", term26961);
        setIntField(term26989, term26989.getClass(), "year", 2015);
        setShortField(term26989, term26989.getClass(), "month", (short) 4);
        setShortField(term26989, term26989.getClass(), "day", (short) 22);
        setField(term26988, term26988.getClass(), "date", term26989);
        setByteField(term26993, term26993.getClass(), "hour", (byte) 15);
        setByteField(term26993, term26993.getClass(), "minute", (byte) 23);
        setByteField(term26993, term26993.getClass(), "second", (byte) 42);
        setIntField(term26993, term26993.getClass(), "nano", 822658620);
        setField(term26988, term26988.getClass(), "time", term26993);
        setField(term26923, term26923.getClass(), "createdAt", term26988);
        setIntField(term26999, term26999.getClass(), "year", 2020);
        setShortField(term26999, term26999.getClass(), "month", (short) 4);
        setShortField(term26999, term26999.getClass(), "day", (short) 27);
        setField(term26998, term26998.getClass(), "date", term26999);
        setByteField(term27003, term27003.getClass(), "hour", (byte) 16);
        setByteField(term27003, term27003.getClass(), "minute", (byte) 48);
        setByteField(term27003, term27003.getClass(), "second", (byte) 39);
        setIntField(term27003, term27003.getClass(), "nano", 250909266);
        setField(term26998, term26998.getClass(), "time", term27003);
        setField(term26923, term26923.getClass(), "updatedAt", term26998);
        setField(term26923, term26923.getClass(), "url", "EULDrUNQvw");
        setField(term26923, term26923.getClass(), "thumbs", term27020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term26923, args);
    }

};


