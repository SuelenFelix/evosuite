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

public class GameCharge_setEndDate_139329638714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1121;
     Object term1167;

    public GameCharge_setEndDate_139329638714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1121 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1141 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1152 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1162 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1121, term1121.getClass(), "id", -872011222785455006L);
        setIntField(term1121, term1121.getClass(), "orderId", -1845499264);
        setIntField(term1121, term1121.getClass(), "chargeId", -505439934);
        setIntField(term1121, term1121.getClass(), "price", -344842608);
        setIntField(term1127, term1127.getClass(), "year", 2015);
        setShortField(term1127, term1127.getClass(), "month", (short) 2);
        setShortField(term1127, term1127.getClass(), "day", (short) 5);
        setField(term1126, term1126.getClass(), "date", term1127);
        setByteField(term1131, term1131.getClass(), "hour", (byte) 3);
        setByteField(term1131, term1131.getClass(), "minute", (byte) 26);
        setByteField(term1131, term1131.getClass(), "second", (byte) 49);
        setIntField(term1131, term1131.getClass(), "nano", 995758570);
        setField(term1126, term1126.getClass(), "time", term1131);
        setField(term1121, term1121.getClass(), "startDate", term1126);
        setIntField(term1137, term1137.getClass(), "year", 2013);
        setShortField(term1137, term1137.getClass(), "month", (short) 5);
        setShortField(term1137, term1137.getClass(), "day", (short) 9);
        setField(term1136, term1136.getClass(), "date", term1137);
        setByteField(term1141, term1141.getClass(), "hour", (byte) 4);
        setByteField(term1141, term1141.getClass(), "minute", (byte) 18);
        setByteField(term1141, term1141.getClass(), "second", (byte) 35);
        setIntField(term1141, term1141.getClass(), "nano", 909079395);
        setField(term1136, term1136.getClass(), "time", term1141);
        setField(term1121, term1121.getClass(), "endDate", term1136);
        setIntField(term1121, term1121.getClass(), "salePrice", 941650513);
        setIntField(term1148, term1148.getClass(), "year", 2015);
        setShortField(term1148, term1148.getClass(), "month", (short) 3);
        setShortField(term1148, term1148.getClass(), "day", (short) 15);
        setField(term1147, term1147.getClass(), "date", term1148);
        setByteField(term1152, term1152.getClass(), "hour", (byte) 8);
        setByteField(term1152, term1152.getClass(), "minute", (byte) 45);
        setByteField(term1152, term1152.getClass(), "second", (byte) 29);
        setIntField(term1152, term1152.getClass(), "nano", 781486470);
        setField(term1147, term1147.getClass(), "time", term1152);
        setField(term1121, term1121.getClass(), "saleStartDate", term1147);
        setIntField(term1158, term1158.getClass(), "year", 2021);
        setShortField(term1158, term1158.getClass(), "month", (short) 4);
        setShortField(term1158, term1158.getClass(), "day", (short) 26);
        setField(term1157, term1157.getClass(), "date", term1158);
        setByteField(term1162, term1162.getClass(), "hour", (byte) 11);
        setByteField(term1162, term1162.getClass(), "minute", (byte) 34);
        setByteField(term1162, term1162.getClass(), "second", (byte) 15);
        setIntField(term1162, term1162.getClass(), "nano", 638206023);
        setField(term1157, term1157.getClass(), "time", term1162);
        setField(term1121, term1121.getClass(), "saleEndDate", term1157);
        term1167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1172 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1168, term1168.getClass(), "year", 2013);
        setShortField(term1168, term1168.getClass(), "month", (short) 9);
        setShortField(term1168, term1168.getClass(), "day", (short) 13);
        setField(term1167, term1167.getClass(), "date", term1168);
        setByteField(term1172, term1172.getClass(), "hour", (byte) 14);
        setByteField(term1172, term1172.getClass(), "minute", (byte) 36);
        setByteField(term1172, term1172.getClass(), "second", (byte) 59);
        setIntField(term1172, term1172.getClass(), "nano", 363124001);
        setField(term1167, term1167.getClass(), "time", term1172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1167;
        callMethod(klass, "setEndDate", argTypes, term1121, args);
    }

};


