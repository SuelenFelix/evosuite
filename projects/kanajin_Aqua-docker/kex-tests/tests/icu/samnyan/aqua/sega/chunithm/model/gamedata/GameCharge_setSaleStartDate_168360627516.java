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

public class GameCharge_setSaleStartDate_168360627516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1225;
     Object term1271;

    public GameCharge_setSaleStartDate_168360627516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1225 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1230 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1231 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1235 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1245 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1266 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1225, term1225.getClass(), "id", 5127676408959197577L);
        setIntField(term1225, term1225.getClass(), "orderId", -1347665717);
        setIntField(term1225, term1225.getClass(), "chargeId", -1888585309);
        setIntField(term1225, term1225.getClass(), "price", 683666002);
        setIntField(term1231, term1231.getClass(), "year", 2019);
        setShortField(term1231, term1231.getClass(), "month", (short) 8);
        setShortField(term1231, term1231.getClass(), "day", (short) 12);
        setField(term1230, term1230.getClass(), "date", term1231);
        setByteField(term1235, term1235.getClass(), "hour", (byte) 14);
        setByteField(term1235, term1235.getClass(), "minute", (byte) 1);
        setByteField(term1235, term1235.getClass(), "second", (byte) 51);
        setIntField(term1235, term1235.getClass(), "nano", 499021786);
        setField(term1230, term1230.getClass(), "time", term1235);
        setField(term1225, term1225.getClass(), "startDate", term1230);
        setIntField(term1241, term1241.getClass(), "year", 2014);
        setShortField(term1241, term1241.getClass(), "month", (short) 7);
        setShortField(term1241, term1241.getClass(), "day", (short) 22);
        setField(term1240, term1240.getClass(), "date", term1241);
        setByteField(term1245, term1245.getClass(), "hour", (byte) 9);
        setByteField(term1245, term1245.getClass(), "minute", (byte) 40);
        setByteField(term1245, term1245.getClass(), "second", (byte) 34);
        setIntField(term1245, term1245.getClass(), "nano", 463008257);
        setField(term1240, term1240.getClass(), "time", term1245);
        setField(term1225, term1225.getClass(), "endDate", term1240);
        setIntField(term1225, term1225.getClass(), "salePrice", 1596213415);
        setIntField(term1252, term1252.getClass(), "year", 2027);
        setShortField(term1252, term1252.getClass(), "month", (short) 6);
        setShortField(term1252, term1252.getClass(), "day", (short) 20);
        setField(term1251, term1251.getClass(), "date", term1252);
        setByteField(term1256, term1256.getClass(), "hour", (byte) 23);
        setByteField(term1256, term1256.getClass(), "minute", (byte) 21);
        setByteField(term1256, term1256.getClass(), "second", (byte) 6);
        setIntField(term1256, term1256.getClass(), "nano", 897776059);
        setField(term1251, term1251.getClass(), "time", term1256);
        setField(term1225, term1225.getClass(), "saleStartDate", term1251);
        setIntField(term1262, term1262.getClass(), "year", 2016);
        setShortField(term1262, term1262.getClass(), "month", (short) 3);
        setShortField(term1262, term1262.getClass(), "day", (short) 20);
        setField(term1261, term1261.getClass(), "date", term1262);
        setByteField(term1266, term1266.getClass(), "hour", (byte) 0);
        setByteField(term1266, term1266.getClass(), "minute", (byte) 54);
        setByteField(term1266, term1266.getClass(), "second", (byte) 6);
        setIntField(term1266, term1266.getClass(), "nano", 183302469);
        setField(term1261, term1261.getClass(), "time", term1266);
        setField(term1225, term1225.getClass(), "saleEndDate", term1261);
        term1271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1276 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1272, term1272.getClass(), "year", 2013);
        setShortField(term1272, term1272.getClass(), "month", (short) 11);
        setShortField(term1272, term1272.getClass(), "day", (short) 19);
        setField(term1271, term1271.getClass(), "date", term1272);
        setByteField(term1276, term1276.getClass(), "hour", (byte) 6);
        setByteField(term1276, term1276.getClass(), "minute", (byte) 45);
        setByteField(term1276, term1276.getClass(), "second", (byte) 10);
        setIntField(term1276, term1276.getClass(), "nano", 288981190);
        setField(term1271, term1271.getClass(), "time", term1276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1271;
        callMethod(klass, "setSaleStartDate", argTypes, term1225, args);
    }

};


