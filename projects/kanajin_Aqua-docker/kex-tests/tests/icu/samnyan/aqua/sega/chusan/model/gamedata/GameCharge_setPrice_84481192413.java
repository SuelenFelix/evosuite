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
import java.lang.Integer;

public class GameCharge_setPrice_84481192413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349;
     Object term1407;

    public GameCharge_setPrice_84481192413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1349 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1354 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1359 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1390 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1349, term1349.getClass(), "id", -5476826692763582090L);
        setIntField(term1349, term1349.getClass(), "orderId", -1547384488);
        setIntField(term1349, term1349.getClass(), "chargeId", 1442160736);
        setIntField(term1349, term1349.getClass(), "price", 1114000454);
        setIntField(term1355, term1355.getClass(), "year", 2020);
        setShortField(term1355, term1355.getClass(), "month", (short) 5);
        setShortField(term1355, term1355.getClass(), "day", (short) 12);
        setField(term1354, term1354.getClass(), "date", term1355);
        setByteField(term1359, term1359.getClass(), "hour", (byte) 0);
        setByteField(term1359, term1359.getClass(), "minute", (byte) 15);
        setByteField(term1359, term1359.getClass(), "second", (byte) 24);
        setIntField(term1359, term1359.getClass(), "nano", 250257744);
        setField(term1354, term1354.getClass(), "time", term1359);
        setField(term1349, term1349.getClass(), "startDate", term1354);
        setIntField(term1365, term1365.getClass(), "year", 2013);
        setShortField(term1365, term1365.getClass(), "month", (short) 9);
        setShortField(term1365, term1365.getClass(), "day", (short) 19);
        setField(term1364, term1364.getClass(), "date", term1365);
        setByteField(term1369, term1369.getClass(), "hour", (byte) 12);
        setByteField(term1369, term1369.getClass(), "minute", (byte) 29);
        setByteField(term1369, term1369.getClass(), "second", (byte) 28);
        setIntField(term1369, term1369.getClass(), "nano", 244069764);
        setField(term1364, term1364.getClass(), "time", term1369);
        setField(term1349, term1349.getClass(), "endDate", term1364);
        setIntField(term1349, term1349.getClass(), "salePrice", -556405712);
        setIntField(term1376, term1376.getClass(), "year", 2025);
        setShortField(term1376, term1376.getClass(), "month", (short) 12);
        setShortField(term1376, term1376.getClass(), "day", (short) 16);
        setField(term1375, term1375.getClass(), "date", term1376);
        setByteField(term1380, term1380.getClass(), "hour", (byte) 7);
        setByteField(term1380, term1380.getClass(), "minute", (byte) 53);
        setByteField(term1380, term1380.getClass(), "second", (byte) 23);
        setIntField(term1380, term1380.getClass(), "nano", 532991944);
        setField(term1375, term1375.getClass(), "time", term1380);
        setField(term1349, term1349.getClass(), "saleStartDate", term1375);
        setIntField(term1386, term1386.getClass(), "year", 2024);
        setShortField(term1386, term1386.getClass(), "month", (short) 2);
        setShortField(term1386, term1386.getClass(), "day", (short) 5);
        setField(term1385, term1385.getClass(), "date", term1386);
        setByteField(term1390, term1390.getClass(), "hour", (byte) 12);
        setByteField(term1390, term1390.getClass(), "minute", (byte) 28);
        setByteField(term1390, term1390.getClass(), "second", (byte) 37);
        setIntField(term1390, term1390.getClass(), "nano", 689695229);
        setField(term1385, term1385.getClass(), "time", term1390);
        setField(term1349, term1349.getClass(), "saleEndDate", term1385);
        setField(term1349, term1349.getClass(), "remarks", "LQFpaHEwXR");
        term1407 = new Integer(-1772434990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1407;
        callMethod(klass, "setPrice", argTypes, term1349, args);
    }

};


