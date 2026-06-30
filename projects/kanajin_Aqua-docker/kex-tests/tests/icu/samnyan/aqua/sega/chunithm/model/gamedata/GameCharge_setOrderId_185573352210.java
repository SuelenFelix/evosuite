package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GameCharge_setOrderId_185573352210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;
     Object term967;

    public GameCharge_setOrderId_185573352210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term921 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term962 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term921, term921.getClass(), "id", -8885298608300233488L);
        setIntField(term921, term921.getClass(), "orderId", 1540719661);
        setIntField(term921, term921.getClass(), "chargeId", 1265463001);
        setIntField(term921, term921.getClass(), "price", 335112684);
        setIntField(term927, term927.getClass(), "year", 2022);
        setShortField(term927, term927.getClass(), "month", (short) 11);
        setShortField(term927, term927.getClass(), "day", (short) 10);
        setField(term926, term926.getClass(), "date", term927);
        setByteField(term931, term931.getClass(), "hour", (byte) 20);
        setByteField(term931, term931.getClass(), "minute", (byte) 8);
        setByteField(term931, term931.getClass(), "second", (byte) 35);
        setIntField(term931, term931.getClass(), "nano", 658416570);
        setField(term926, term926.getClass(), "time", term931);
        setField(term921, term921.getClass(), "startDate", term926);
        setIntField(term937, term937.getClass(), "year", 2018);
        setShortField(term937, term937.getClass(), "month", (short) 11);
        setShortField(term937, term937.getClass(), "day", (short) 9);
        setField(term936, term936.getClass(), "date", term937);
        setByteField(term941, term941.getClass(), "hour", (byte) 6);
        setByteField(term941, term941.getClass(), "minute", (byte) 8);
        setByteField(term941, term941.getClass(), "second", (byte) 32);
        setIntField(term941, term941.getClass(), "nano", 750733310);
        setField(term936, term936.getClass(), "time", term941);
        setField(term921, term921.getClass(), "endDate", term936);
        setIntField(term921, term921.getClass(), "salePrice", 1551099402);
        setIntField(term948, term948.getClass(), "year", 2010);
        setShortField(term948, term948.getClass(), "month", (short) 2);
        setShortField(term948, term948.getClass(), "day", (short) 24);
        setField(term947, term947.getClass(), "date", term948);
        setByteField(term952, term952.getClass(), "hour", (byte) 17);
        setByteField(term952, term952.getClass(), "minute", (byte) 58);
        setByteField(term952, term952.getClass(), "second", (byte) 56);
        setIntField(term952, term952.getClass(), "nano", 291725532);
        setField(term947, term947.getClass(), "time", term952);
        setField(term921, term921.getClass(), "saleStartDate", term947);
        setIntField(term958, term958.getClass(), "year", 2028);
        setShortField(term958, term958.getClass(), "month", (short) 7);
        setShortField(term958, term958.getClass(), "day", (short) 22);
        setField(term957, term957.getClass(), "date", term958);
        setByteField(term962, term962.getClass(), "hour", (byte) 18);
        setByteField(term962, term962.getClass(), "minute", (byte) 33);
        setByteField(term962, term962.getClass(), "second", (byte) 7);
        setIntField(term962, term962.getClass(), "nano", 763613074);
        setField(term957, term957.getClass(), "time", term962);
        setField(term921, term921.getClass(), "saleEndDate", term957);
        term967 = new Integer(-2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term967;
        callMethod(klass, "setOrderId", argTypes, term921, args);
    }

};


