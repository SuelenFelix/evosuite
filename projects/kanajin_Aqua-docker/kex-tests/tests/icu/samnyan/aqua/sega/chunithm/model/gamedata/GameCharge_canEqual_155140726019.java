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

public class GameCharge_canEqual_155140726019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1384;
     Object term1430;

    public GameCharge_canEqual_155140726019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1384 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1394 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1404 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1415 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1425 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1384, term1384.getClass(), "id", 8428634514691209827L);
        setIntField(term1384, term1384.getClass(), "orderId", -1801760683);
        setIntField(term1384, term1384.getClass(), "chargeId", 1141317871);
        setIntField(term1384, term1384.getClass(), "price", 890669485);
        setIntField(term1390, term1390.getClass(), "year", 2028);
        setShortField(term1390, term1390.getClass(), "month", (short) 4);
        setShortField(term1390, term1390.getClass(), "day", (short) 11);
        setField(term1389, term1389.getClass(), "date", term1390);
        setByteField(term1394, term1394.getClass(), "hour", (byte) 4);
        setByteField(term1394, term1394.getClass(), "minute", (byte) 45);
        setByteField(term1394, term1394.getClass(), "second", (byte) 2);
        setIntField(term1394, term1394.getClass(), "nano", 374177968);
        setField(term1389, term1389.getClass(), "time", term1394);
        setField(term1384, term1384.getClass(), "startDate", term1389);
        setIntField(term1400, term1400.getClass(), "year", 2021);
        setShortField(term1400, term1400.getClass(), "month", (short) 4);
        setShortField(term1400, term1400.getClass(), "day", (short) 22);
        setField(term1399, term1399.getClass(), "date", term1400);
        setByteField(term1404, term1404.getClass(), "hour", (byte) 17);
        setByteField(term1404, term1404.getClass(), "minute", (byte) 6);
        setByteField(term1404, term1404.getClass(), "second", (byte) 33);
        setIntField(term1404, term1404.getClass(), "nano", 21410850);
        setField(term1399, term1399.getClass(), "time", term1404);
        setField(term1384, term1384.getClass(), "endDate", term1399);
        setIntField(term1384, term1384.getClass(), "salePrice", 691577392);
        setIntField(term1411, term1411.getClass(), "year", 2026);
        setShortField(term1411, term1411.getClass(), "month", (short) 10);
        setShortField(term1411, term1411.getClass(), "day", (short) 19);
        setField(term1410, term1410.getClass(), "date", term1411);
        setByteField(term1415, term1415.getClass(), "hour", (byte) 7);
        setByteField(term1415, term1415.getClass(), "minute", (byte) 22);
        setByteField(term1415, term1415.getClass(), "second", (byte) 11);
        setIntField(term1415, term1415.getClass(), "nano", 17846677);
        setField(term1410, term1410.getClass(), "time", term1415);
        setField(term1384, term1384.getClass(), "saleStartDate", term1410);
        setIntField(term1421, term1421.getClass(), "year", 2018);
        setShortField(term1421, term1421.getClass(), "month", (short) 10);
        setShortField(term1421, term1421.getClass(), "day", (short) 17);
        setField(term1420, term1420.getClass(), "date", term1421);
        setByteField(term1425, term1425.getClass(), "hour", (byte) 5);
        setByteField(term1425, term1425.getClass(), "minute", (byte) 10);
        setByteField(term1425, term1425.getClass(), "second", (byte) 23);
        setIntField(term1425, term1425.getClass(), "nano", 571520422);
        setField(term1420, term1420.getClass(), "time", term1425);
        setField(term1384, term1384.getClass(), "saleEndDate", term1420);
        term1430 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1430;
        callMethod(klass, "canEqual", argTypes, term1384, args);
    }

};


