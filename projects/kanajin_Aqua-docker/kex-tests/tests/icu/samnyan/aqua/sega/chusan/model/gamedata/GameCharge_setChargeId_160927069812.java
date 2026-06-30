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

public class GameCharge_setChargeId_160927069812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1279;
     Object term1337;

    public GameCharge_setChargeId_160927069812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1279 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1289 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1299 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1310 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1320 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1279, term1279.getClass(), "id", 2535595959091595249L);
        setIntField(term1279, term1279.getClass(), "orderId", 1655935355);
        setIntField(term1279, term1279.getClass(), "chargeId", -481533957);
        setIntField(term1279, term1279.getClass(), "price", 1240914516);
        setIntField(term1285, term1285.getClass(), "year", 2011);
        setShortField(term1285, term1285.getClass(), "month", (short) 4);
        setShortField(term1285, term1285.getClass(), "day", (short) 19);
        setField(term1284, term1284.getClass(), "date", term1285);
        setByteField(term1289, term1289.getClass(), "hour", (byte) 12);
        setByteField(term1289, term1289.getClass(), "minute", (byte) 0);
        setByteField(term1289, term1289.getClass(), "second", (byte) 14);
        setIntField(term1289, term1289.getClass(), "nano", 849079063);
        setField(term1284, term1284.getClass(), "time", term1289);
        setField(term1279, term1279.getClass(), "startDate", term1284);
        setIntField(term1295, term1295.getClass(), "year", 2014);
        setShortField(term1295, term1295.getClass(), "month", (short) 8);
        setShortField(term1295, term1295.getClass(), "day", (short) 17);
        setField(term1294, term1294.getClass(), "date", term1295);
        setByteField(term1299, term1299.getClass(), "hour", (byte) 19);
        setByteField(term1299, term1299.getClass(), "minute", (byte) 32);
        setByteField(term1299, term1299.getClass(), "second", (byte) 5);
        setIntField(term1299, term1299.getClass(), "nano", 604713831);
        setField(term1294, term1294.getClass(), "time", term1299);
        setField(term1279, term1279.getClass(), "endDate", term1294);
        setIntField(term1279, term1279.getClass(), "salePrice", -1465035361);
        setIntField(term1306, term1306.getClass(), "year", 2021);
        setShortField(term1306, term1306.getClass(), "month", (short) 3);
        setShortField(term1306, term1306.getClass(), "day", (short) 13);
        setField(term1305, term1305.getClass(), "date", term1306);
        setByteField(term1310, term1310.getClass(), "hour", (byte) 6);
        setByteField(term1310, term1310.getClass(), "minute", (byte) 25);
        setByteField(term1310, term1310.getClass(), "second", (byte) 42);
        setIntField(term1310, term1310.getClass(), "nano", 282924199);
        setField(term1305, term1305.getClass(), "time", term1310);
        setField(term1279, term1279.getClass(), "saleStartDate", term1305);
        setIntField(term1316, term1316.getClass(), "year", 2020);
        setShortField(term1316, term1316.getClass(), "month", (short) 10);
        setShortField(term1316, term1316.getClass(), "day", (short) 25);
        setField(term1315, term1315.getClass(), "date", term1316);
        setByteField(term1320, term1320.getClass(), "hour", (byte) 18);
        setByteField(term1320, term1320.getClass(), "minute", (byte) 22);
        setByteField(term1320, term1320.getClass(), "second", (byte) 30);
        setIntField(term1320, term1320.getClass(), "nano", 948592965);
        setField(term1315, term1315.getClass(), "time", term1320);
        setField(term1279, term1279.getClass(), "saleEndDate", term1315);
        setField(term1279, term1279.getClass(), "remarks", "MxlszYVzRf");
        term1337 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1337;
        callMethod(klass, "setChargeId", argTypes, term1279, args);
    }

};


