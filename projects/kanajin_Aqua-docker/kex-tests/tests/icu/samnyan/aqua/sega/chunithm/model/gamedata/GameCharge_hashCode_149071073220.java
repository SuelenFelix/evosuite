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

public class GameCharge_hashCode_149071073220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1431;

    public GameCharge_hashCode_149071073220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1431 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1441 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1451 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1472 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1431, term1431.getClass(), "id", -2585684163342970173L);
        setIntField(term1431, term1431.getClass(), "orderId", -893623680);
        setIntField(term1431, term1431.getClass(), "chargeId", -1963434938);
        setIntField(term1431, term1431.getClass(), "price", 906181092);
        setIntField(term1437, term1437.getClass(), "year", 2022);
        setShortField(term1437, term1437.getClass(), "month", (short) 11);
        setShortField(term1437, term1437.getClass(), "day", (short) 5);
        setField(term1436, term1436.getClass(), "date", term1437);
        setByteField(term1441, term1441.getClass(), "hour", (byte) 0);
        setByteField(term1441, term1441.getClass(), "minute", (byte) 51);
        setByteField(term1441, term1441.getClass(), "second", (byte) 23);
        setIntField(term1441, term1441.getClass(), "nano", 1140962);
        setField(term1436, term1436.getClass(), "time", term1441);
        setField(term1431, term1431.getClass(), "startDate", term1436);
        setIntField(term1447, term1447.getClass(), "year", 2020);
        setShortField(term1447, term1447.getClass(), "month", (short) 5);
        setShortField(term1447, term1447.getClass(), "day", (short) 24);
        setField(term1446, term1446.getClass(), "date", term1447);
        setByteField(term1451, term1451.getClass(), "hour", (byte) 2);
        setByteField(term1451, term1451.getClass(), "minute", (byte) 9);
        setByteField(term1451, term1451.getClass(), "second", (byte) 52);
        setIntField(term1451, term1451.getClass(), "nano", 653329393);
        setField(term1446, term1446.getClass(), "time", term1451);
        setField(term1431, term1431.getClass(), "endDate", term1446);
        setIntField(term1431, term1431.getClass(), "salePrice", 1045657203);
        setIntField(term1458, term1458.getClass(), "year", 2024);
        setShortField(term1458, term1458.getClass(), "month", (short) 9);
        setShortField(term1458, term1458.getClass(), "day", (short) 22);
        setField(term1457, term1457.getClass(), "date", term1458);
        setByteField(term1462, term1462.getClass(), "hour", (byte) 0);
        setByteField(term1462, term1462.getClass(), "minute", (byte) 11);
        setByteField(term1462, term1462.getClass(), "second", (byte) 7);
        setIntField(term1462, term1462.getClass(), "nano", 56643259);
        setField(term1457, term1457.getClass(), "time", term1462);
        setField(term1431, term1431.getClass(), "saleStartDate", term1457);
        setIntField(term1468, term1468.getClass(), "year", 2021);
        setShortField(term1468, term1468.getClass(), "month", (short) 12);
        setShortField(term1468, term1468.getClass(), "day", (short) 21);
        setField(term1467, term1467.getClass(), "date", term1468);
        setByteField(term1472, term1472.getClass(), "hour", (byte) 12);
        setByteField(term1472, term1472.getClass(), "minute", (byte) 59);
        setByteField(term1472, term1472.getClass(), "second", (byte) 52);
        setIntField(term1472, term1472.getClass(), "nano", 47081639);
        setField(term1467, term1467.getClass(), "time", term1472);
        setField(term1431, term1431.getClass(), "saleEndDate", term1467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1431, args);
    }

};


