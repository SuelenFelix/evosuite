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

public class GameCharge_setEndDate_189350483715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1497;
     Object term1555;

    public GameCharge_setEndDate_189350483715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1497 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1507 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1517 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1528 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1538 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1497, term1497.getClass(), "id", -316468845751588286L);
        setIntField(term1497, term1497.getClass(), "orderId", 444029505);
        setIntField(term1497, term1497.getClass(), "chargeId", -1034506028);
        setIntField(term1497, term1497.getClass(), "price", -1263114719);
        setIntField(term1503, term1503.getClass(), "year", 2013);
        setShortField(term1503, term1503.getClass(), "month", (short) 9);
        setShortField(term1503, term1503.getClass(), "day", (short) 13);
        setField(term1502, term1502.getClass(), "date", term1503);
        setByteField(term1507, term1507.getClass(), "hour", (byte) 14);
        setByteField(term1507, term1507.getClass(), "minute", (byte) 36);
        setByteField(term1507, term1507.getClass(), "second", (byte) 59);
        setIntField(term1507, term1507.getClass(), "nano", 363124001);
        setField(term1502, term1502.getClass(), "time", term1507);
        setField(term1497, term1497.getClass(), "startDate", term1502);
        setIntField(term1513, term1513.getClass(), "year", 2020);
        setShortField(term1513, term1513.getClass(), "month", (short) 12);
        setShortField(term1513, term1513.getClass(), "day", (short) 21);
        setField(term1512, term1512.getClass(), "date", term1513);
        setByteField(term1517, term1517.getClass(), "hour", (byte) 20);
        setByteField(term1517, term1517.getClass(), "minute", (byte) 16);
        setByteField(term1517, term1517.getClass(), "second", (byte) 59);
        setIntField(term1517, term1517.getClass(), "nano", 976524801);
        setField(term1512, term1512.getClass(), "time", term1517);
        setField(term1497, term1497.getClass(), "endDate", term1512);
        setIntField(term1497, term1497.getClass(), "salePrice", -894662986);
        setIntField(term1524, term1524.getClass(), "year", 2028);
        setShortField(term1524, term1524.getClass(), "month", (short) 5);
        setShortField(term1524, term1524.getClass(), "day", (short) 15);
        setField(term1523, term1523.getClass(), "date", term1524);
        setByteField(term1528, term1528.getClass(), "hour", (byte) 20);
        setByteField(term1528, term1528.getClass(), "minute", (byte) 31);
        setByteField(term1528, term1528.getClass(), "second", (byte) 49);
        setIntField(term1528, term1528.getClass(), "nano", 945744862);
        setField(term1523, term1523.getClass(), "time", term1528);
        setField(term1497, term1497.getClass(), "saleStartDate", term1523);
        setIntField(term1534, term1534.getClass(), "year", 2016);
        setShortField(term1534, term1534.getClass(), "month", (short) 6);
        setShortField(term1534, term1534.getClass(), "day", (short) 23);
        setField(term1533, term1533.getClass(), "date", term1534);
        setByteField(term1538, term1538.getClass(), "hour", (byte) 20);
        setByteField(term1538, term1538.getClass(), "minute", (byte) 51);
        setByteField(term1538, term1538.getClass(), "second", (byte) 43);
        setIntField(term1538, term1538.getClass(), "nano", 284389409);
        setField(term1533, term1533.getClass(), "time", term1538);
        setField(term1497, term1497.getClass(), "saleEndDate", term1533);
        setField(term1497, term1497.getClass(), "remarks", "aJlieCFVtF");
        term1555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1560 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1556, term1556.getClass(), "year", 2014);
        setShortField(term1556, term1556.getClass(), "month", (short) 10);
        setShortField(term1556, term1556.getClass(), "day", (short) 7);
        setField(term1555, term1555.getClass(), "date", term1556);
        setByteField(term1560, term1560.getClass(), "hour", (byte) 12);
        setByteField(term1560, term1560.getClass(), "minute", (byte) 59);
        setByteField(term1560, term1560.getClass(), "second", (byte) 39);
        setIntField(term1560, term1560.getClass(), "nano", 603709306);
        setField(term1555, term1555.getClass(), "time", term1560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1555;
        callMethod(klass, "setEndDate", argTypes, term1497, args);
    }

};


