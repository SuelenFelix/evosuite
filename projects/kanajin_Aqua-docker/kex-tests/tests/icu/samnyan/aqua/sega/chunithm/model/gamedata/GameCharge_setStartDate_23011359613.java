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

public class GameCharge_setStartDate_23011359613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;
     Object term1111;

    public GameCharge_setStartDate_23011359613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1065 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1070 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1071 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1075 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1085 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1106 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1065, term1065.getClass(), "id", -5476826692763582090L);
        setIntField(term1065, term1065.getClass(), "orderId", 1442160736);
        setIntField(term1065, term1065.getClass(), "chargeId", 1114000454);
        setIntField(term1065, term1065.getClass(), "price", -556405712);
        setIntField(term1071, term1071.getClass(), "year", 2020);
        setShortField(term1071, term1071.getClass(), "month", (short) 5);
        setShortField(term1071, term1071.getClass(), "day", (short) 12);
        setField(term1070, term1070.getClass(), "date", term1071);
        setByteField(term1075, term1075.getClass(), "hour", (byte) 0);
        setByteField(term1075, term1075.getClass(), "minute", (byte) 15);
        setByteField(term1075, term1075.getClass(), "second", (byte) 24);
        setIntField(term1075, term1075.getClass(), "nano", 250257744);
        setField(term1070, term1070.getClass(), "time", term1075);
        setField(term1065, term1065.getClass(), "startDate", term1070);
        setIntField(term1081, term1081.getClass(), "year", 2013);
        setShortField(term1081, term1081.getClass(), "month", (short) 9);
        setShortField(term1081, term1081.getClass(), "day", (short) 19);
        setField(term1080, term1080.getClass(), "date", term1081);
        setByteField(term1085, term1085.getClass(), "hour", (byte) 12);
        setByteField(term1085, term1085.getClass(), "minute", (byte) 29);
        setByteField(term1085, term1085.getClass(), "second", (byte) 28);
        setIntField(term1085, term1085.getClass(), "nano", 244069764);
        setField(term1080, term1080.getClass(), "time", term1085);
        setField(term1065, term1065.getClass(), "endDate", term1080);
        setIntField(term1065, term1065.getClass(), "salePrice", -1772434990);
        setIntField(term1092, term1092.getClass(), "year", 2025);
        setShortField(term1092, term1092.getClass(), "month", (short) 12);
        setShortField(term1092, term1092.getClass(), "day", (short) 16);
        setField(term1091, term1091.getClass(), "date", term1092);
        setByteField(term1096, term1096.getClass(), "hour", (byte) 7);
        setByteField(term1096, term1096.getClass(), "minute", (byte) 53);
        setByteField(term1096, term1096.getClass(), "second", (byte) 23);
        setIntField(term1096, term1096.getClass(), "nano", 532991944);
        setField(term1091, term1091.getClass(), "time", term1096);
        setField(term1065, term1065.getClass(), "saleStartDate", term1091);
        setIntField(term1102, term1102.getClass(), "year", 2024);
        setShortField(term1102, term1102.getClass(), "month", (short) 2);
        setShortField(term1102, term1102.getClass(), "day", (short) 5);
        setField(term1101, term1101.getClass(), "date", term1102);
        setByteField(term1106, term1106.getClass(), "hour", (byte) 12);
        setByteField(term1106, term1106.getClass(), "minute", (byte) 28);
        setByteField(term1106, term1106.getClass(), "second", (byte) 37);
        setIntField(term1106, term1106.getClass(), "nano", 689695229);
        setField(term1101, term1101.getClass(), "time", term1106);
        setField(term1065, term1065.getClass(), "saleEndDate", term1101);
        term1111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1116 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1112, term1112.getClass(), "year", 2023);
        setShortField(term1112, term1112.getClass(), "month", (short) 5);
        setShortField(term1112, term1112.getClass(), "day", (short) 23);
        setField(term1111, term1111.getClass(), "date", term1112);
        setByteField(term1116, term1116.getClass(), "hour", (byte) 0);
        setByteField(term1116, term1116.getClass(), "minute", (byte) 50);
        setByteField(term1116, term1116.getClass(), "second", (byte) 5);
        setIntField(term1116, term1116.getClass(), "nano", 296286825);
        setField(term1111, term1111.getClass(), "time", term1116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1111;
        callMethod(klass, "setStartDate", argTypes, term1065, args);
    }

};


