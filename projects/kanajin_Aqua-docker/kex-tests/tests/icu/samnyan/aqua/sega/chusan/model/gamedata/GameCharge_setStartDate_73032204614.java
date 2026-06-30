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

public class GameCharge_setStartDate_73032204614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419;
     Object term1477;

    public GameCharge_setStartDate_73032204614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1419 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1429 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1439 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1460 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1419, term1419.getClass(), "id", -872011222785455006L);
        setIntField(term1419, term1419.getClass(), "orderId", -1845499264);
        setIntField(term1419, term1419.getClass(), "chargeId", -505439934);
        setIntField(term1419, term1419.getClass(), "price", -344842608);
        setIntField(term1425, term1425.getClass(), "year", 2023);
        setShortField(term1425, term1425.getClass(), "month", (short) 5);
        setShortField(term1425, term1425.getClass(), "day", (short) 23);
        setField(term1424, term1424.getClass(), "date", term1425);
        setByteField(term1429, term1429.getClass(), "hour", (byte) 0);
        setByteField(term1429, term1429.getClass(), "minute", (byte) 50);
        setByteField(term1429, term1429.getClass(), "second", (byte) 5);
        setIntField(term1429, term1429.getClass(), "nano", 296286825);
        setField(term1424, term1424.getClass(), "time", term1429);
        setField(term1419, term1419.getClass(), "startDate", term1424);
        setIntField(term1435, term1435.getClass(), "year", 2015);
        setShortField(term1435, term1435.getClass(), "month", (short) 2);
        setShortField(term1435, term1435.getClass(), "day", (short) 5);
        setField(term1434, term1434.getClass(), "date", term1435);
        setByteField(term1439, term1439.getClass(), "hour", (byte) 3);
        setByteField(term1439, term1439.getClass(), "minute", (byte) 26);
        setByteField(term1439, term1439.getClass(), "second", (byte) 49);
        setIntField(term1439, term1439.getClass(), "nano", 995758570);
        setField(term1434, term1434.getClass(), "time", term1439);
        setField(term1419, term1419.getClass(), "endDate", term1434);
        setIntField(term1419, term1419.getClass(), "salePrice", 941650513);
        setIntField(term1446, term1446.getClass(), "year", 2013);
        setShortField(term1446, term1446.getClass(), "month", (short) 5);
        setShortField(term1446, term1446.getClass(), "day", (short) 9);
        setField(term1445, term1445.getClass(), "date", term1446);
        setByteField(term1450, term1450.getClass(), "hour", (byte) 4);
        setByteField(term1450, term1450.getClass(), "minute", (byte) 18);
        setByteField(term1450, term1450.getClass(), "second", (byte) 35);
        setIntField(term1450, term1450.getClass(), "nano", 909079395);
        setField(term1445, term1445.getClass(), "time", term1450);
        setField(term1419, term1419.getClass(), "saleStartDate", term1445);
        setIntField(term1456, term1456.getClass(), "year", 2015);
        setShortField(term1456, term1456.getClass(), "month", (short) 3);
        setShortField(term1456, term1456.getClass(), "day", (short) 15);
        setField(term1455, term1455.getClass(), "date", term1456);
        setByteField(term1460, term1460.getClass(), "hour", (byte) 8);
        setByteField(term1460, term1460.getClass(), "minute", (byte) 45);
        setByteField(term1460, term1460.getClass(), "second", (byte) 29);
        setIntField(term1460, term1460.getClass(), "nano", 781486470);
        setField(term1455, term1455.getClass(), "time", term1460);
        setField(term1419, term1419.getClass(), "saleEndDate", term1455);
        setField(term1419, term1419.getClass(), "remarks", "oVcInYnLWB");
        term1477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1482 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1478, term1478.getClass(), "year", 2021);
        setShortField(term1478, term1478.getClass(), "month", (short) 4);
        setShortField(term1478, term1478.getClass(), "day", (short) 26);
        setField(term1477, term1477.getClass(), "date", term1478);
        setByteField(term1482, term1482.getClass(), "hour", (byte) 11);
        setByteField(term1482, term1482.getClass(), "minute", (byte) 34);
        setByteField(term1482, term1482.getClass(), "second", (byte) 15);
        setIntField(term1482, term1482.getClass(), "nano", 638206023);
        setField(term1477, term1477.getClass(), "time", term1482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1477;
        callMethod(klass, "setStartDate", argTypes, term1419, args);
    }

};


