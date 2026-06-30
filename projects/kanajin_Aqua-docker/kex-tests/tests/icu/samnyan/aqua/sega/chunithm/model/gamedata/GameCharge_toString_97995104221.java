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

public class GameCharge_toString_97995104221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1477;

    public GameCharge_toString_97995104221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1477 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1487 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1497 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1518 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1477, term1477.getClass(), "id", 8059786003080744426L);
        setIntField(term1477, term1477.getClass(), "orderId", 1386130016);
        setIntField(term1477, term1477.getClass(), "chargeId", 1072005683);
        setIntField(term1477, term1477.getClass(), "price", 1861318859);
        setIntField(term1483, term1483.getClass(), "year", 2026);
        setShortField(term1483, term1483.getClass(), "month", (short) 6);
        setShortField(term1483, term1483.getClass(), "day", (short) 13);
        setField(term1482, term1482.getClass(), "date", term1483);
        setByteField(term1487, term1487.getClass(), "hour", (byte) 19);
        setByteField(term1487, term1487.getClass(), "minute", (byte) 23);
        setByteField(term1487, term1487.getClass(), "second", (byte) 46);
        setIntField(term1487, term1487.getClass(), "nano", 67955056);
        setField(term1482, term1482.getClass(), "time", term1487);
        setField(term1477, term1477.getClass(), "startDate", term1482);
        setIntField(term1493, term1493.getClass(), "year", 2013);
        setShortField(term1493, term1493.getClass(), "month", (short) 12);
        setShortField(term1493, term1493.getClass(), "day", (short) 23);
        setField(term1492, term1492.getClass(), "date", term1493);
        setByteField(term1497, term1497.getClass(), "hour", (byte) 1);
        setByteField(term1497, term1497.getClass(), "minute", (byte) 0);
        setByteField(term1497, term1497.getClass(), "second", (byte) 32);
        setIntField(term1497, term1497.getClass(), "nano", 168525686);
        setField(term1492, term1492.getClass(), "time", term1497);
        setField(term1477, term1477.getClass(), "endDate", term1492);
        setIntField(term1477, term1477.getClass(), "salePrice", 1474524152);
        setIntField(term1504, term1504.getClass(), "year", 2014);
        setShortField(term1504, term1504.getClass(), "month", (short) 1);
        setShortField(term1504, term1504.getClass(), "day", (short) 26);
        setField(term1503, term1503.getClass(), "date", term1504);
        setByteField(term1508, term1508.getClass(), "hour", (byte) 3);
        setByteField(term1508, term1508.getClass(), "minute", (byte) 31);
        setByteField(term1508, term1508.getClass(), "second", (byte) 56);
        setIntField(term1508, term1508.getClass(), "nano", 100873602);
        setField(term1503, term1503.getClass(), "time", term1508);
        setField(term1477, term1477.getClass(), "saleStartDate", term1503);
        setIntField(term1514, term1514.getClass(), "year", 2021);
        setShortField(term1514, term1514.getClass(), "month", (short) 12);
        setShortField(term1514, term1514.getClass(), "day", (short) 1);
        setField(term1513, term1513.getClass(), "date", term1514);
        setByteField(term1518, term1518.getClass(), "hour", (byte) 15);
        setByteField(term1518, term1518.getClass(), "minute", (byte) 30);
        setByteField(term1518, term1518.getClass(), "second", (byte) 5);
        setIntField(term1518, term1518.getClass(), "nano", 996341606);
        setField(term1513, term1513.getClass(), "time", term1518);
        setField(term1477, term1477.getClass(), "saleEndDate", term1513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1477, args);
    }

};


