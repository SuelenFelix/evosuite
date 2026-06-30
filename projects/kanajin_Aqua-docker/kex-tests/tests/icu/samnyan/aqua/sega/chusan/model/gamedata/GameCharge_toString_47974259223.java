package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameCharge_toString_47974259223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2097;

    public GameCharge_toString_47974259223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2097 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term2102 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2103 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2107 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2117 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2138 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2097, term2097.getClass(), "id", 2486810210675247493L);
        setIntField(term2097, term2097.getClass(), "orderId", 480137250);
        setIntField(term2097, term2097.getClass(), "chargeId", -341152642);
        setIntField(term2097, term2097.getClass(), "price", -2015854073);
        setIntField(term2103, term2103.getClass(), "year", 2014);
        setShortField(term2103, term2103.getClass(), "month", (short) 5);
        setShortField(term2103, term2103.getClass(), "day", (short) 31);
        setField(term2102, term2102.getClass(), "date", term2103);
        setByteField(term2107, term2107.getClass(), "hour", (byte) 16);
        setByteField(term2107, term2107.getClass(), "minute", (byte) 3);
        setByteField(term2107, term2107.getClass(), "second", (byte) 14);
        setIntField(term2107, term2107.getClass(), "nano", 281059649);
        setField(term2102, term2102.getClass(), "time", term2107);
        setField(term2097, term2097.getClass(), "startDate", term2102);
        setIntField(term2113, term2113.getClass(), "year", 2010);
        setShortField(term2113, term2113.getClass(), "month", (short) 12);
        setShortField(term2113, term2113.getClass(), "day", (short) 30);
        setField(term2112, term2112.getClass(), "date", term2113);
        setByteField(term2117, term2117.getClass(), "hour", (byte) 17);
        setByteField(term2117, term2117.getClass(), "minute", (byte) 44);
        setByteField(term2117, term2117.getClass(), "second", (byte) 59);
        setIntField(term2117, term2117.getClass(), "nano", 881407895);
        setField(term2112, term2112.getClass(), "time", term2117);
        setField(term2097, term2097.getClass(), "endDate", term2112);
        setIntField(term2097, term2097.getClass(), "salePrice", 538259104);
        setIntField(term2124, term2124.getClass(), "year", 2019);
        setShortField(term2124, term2124.getClass(), "month", (short) 6);
        setShortField(term2124, term2124.getClass(), "day", (short) 12);
        setField(term2123, term2123.getClass(), "date", term2124);
        setByteField(term2128, term2128.getClass(), "hour", (byte) 5);
        setByteField(term2128, term2128.getClass(), "minute", (byte) 13);
        setByteField(term2128, term2128.getClass(), "second", (byte) 8);
        setIntField(term2128, term2128.getClass(), "nano", 838117658);
        setField(term2123, term2123.getClass(), "time", term2128);
        setField(term2097, term2097.getClass(), "saleStartDate", term2123);
        setIntField(term2134, term2134.getClass(), "year", 2014);
        setShortField(term2134, term2134.getClass(), "month", (short) 8);
        setShortField(term2134, term2134.getClass(), "day", (short) 13);
        setField(term2133, term2133.getClass(), "date", term2134);
        setByteField(term2138, term2138.getClass(), "hour", (byte) 13);
        setByteField(term2138, term2138.getClass(), "minute", (byte) 15);
        setByteField(term2138, term2138.getClass(), "second", (byte) 51);
        setIntField(term2138, term2138.getClass(), "nano", 433726678);
        setField(term2133, term2133.getClass(), "time", term2138);
        setField(term2097, term2097.getClass(), "saleEndDate", term2133);
        setField(term2097, term2097.getClass(), "remarks", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2097, args);
    }

};


