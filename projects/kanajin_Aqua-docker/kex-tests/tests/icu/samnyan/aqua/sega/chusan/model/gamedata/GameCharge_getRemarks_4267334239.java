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

public class GameCharge_getRemarks_4267334239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071;

    public GameCharge_getRemarks_4267334239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1071 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1091 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1102 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1112 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1071, term1071.getClass(), "id", 6967924379644551255L);
        setIntField(term1071, term1071.getClass(), "orderId", -112921587);
        setIntField(term1071, term1071.getClass(), "chargeId", 933028652);
        setIntField(term1071, term1071.getClass(), "price", 287287233);
        setIntField(term1077, term1077.getClass(), "year", 2028);
        setShortField(term1077, term1077.getClass(), "month", (short) 4);
        setShortField(term1077, term1077.getClass(), "day", (short) 1);
        setField(term1076, term1076.getClass(), "date", term1077);
        setByteField(term1081, term1081.getClass(), "hour", (byte) 16);
        setByteField(term1081, term1081.getClass(), "minute", (byte) 22);
        setByteField(term1081, term1081.getClass(), "second", (byte) 32);
        setIntField(term1081, term1081.getClass(), "nano", 406353763);
        setField(term1076, term1076.getClass(), "time", term1081);
        setField(term1071, term1071.getClass(), "startDate", term1076);
        setIntField(term1087, term1087.getClass(), "year", 2019);
        setShortField(term1087, term1087.getClass(), "month", (short) 7);
        setShortField(term1087, term1087.getClass(), "day", (short) 19);
        setField(term1086, term1086.getClass(), "date", term1087);
        setByteField(term1091, term1091.getClass(), "hour", (byte) 10);
        setByteField(term1091, term1091.getClass(), "minute", (byte) 54);
        setByteField(term1091, term1091.getClass(), "second", (byte) 55);
        setIntField(term1091, term1091.getClass(), "nano", 244650454);
        setField(term1086, term1086.getClass(), "time", term1091);
        setField(term1071, term1071.getClass(), "endDate", term1086);
        setIntField(term1071, term1071.getClass(), "salePrice", 962840079);
        setIntField(term1098, term1098.getClass(), "year", 2022);
        setShortField(term1098, term1098.getClass(), "month", (short) 4);
        setShortField(term1098, term1098.getClass(), "day", (short) 15);
        setField(term1097, term1097.getClass(), "date", term1098);
        setByteField(term1102, term1102.getClass(), "hour", (byte) 20);
        setByteField(term1102, term1102.getClass(), "minute", (byte) 58);
        setByteField(term1102, term1102.getClass(), "second", (byte) 46);
        setIntField(term1102, term1102.getClass(), "nano", 435562727);
        setField(term1097, term1097.getClass(), "time", term1102);
        setField(term1071, term1071.getClass(), "saleStartDate", term1097);
        setIntField(term1108, term1108.getClass(), "year", 2026);
        setShortField(term1108, term1108.getClass(), "month", (short) 10);
        setShortField(term1108, term1108.getClass(), "day", (short) 31);
        setField(term1107, term1107.getClass(), "date", term1108);
        setByteField(term1112, term1112.getClass(), "hour", (byte) 17);
        setByteField(term1112, term1112.getClass(), "minute", (byte) 6);
        setByteField(term1112, term1112.getClass(), "second", (byte) 30);
        setIntField(term1112, term1112.getClass(), "nano", 785931660);
        setField(term1107, term1107.getClass(), "time", term1112);
        setField(term1071, term1071.getClass(), "saleEndDate", term1107);
        setField(term1071, term1071.getClass(), "remarks", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRemarks", argTypes, term1071, args);
    }

};


