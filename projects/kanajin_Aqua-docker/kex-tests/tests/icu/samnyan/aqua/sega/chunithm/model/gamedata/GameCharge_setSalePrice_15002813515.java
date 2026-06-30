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
import java.lang.Integer;

public class GameCharge_setSalePrice_15002813515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1177;
     Object term1223;

    public GameCharge_setSalePrice_15002813515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1177 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1187 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1192 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1193 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1197 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1218 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1177, term1177.getClass(), "id", -316468845751588286L);
        setIntField(term1177, term1177.getClass(), "orderId", 444029505);
        setIntField(term1177, term1177.getClass(), "chargeId", -1034506028);
        setIntField(term1177, term1177.getClass(), "price", -1263114719);
        setIntField(term1183, term1183.getClass(), "year", 2020);
        setShortField(term1183, term1183.getClass(), "month", (short) 12);
        setShortField(term1183, term1183.getClass(), "day", (short) 21);
        setField(term1182, term1182.getClass(), "date", term1183);
        setByteField(term1187, term1187.getClass(), "hour", (byte) 20);
        setByteField(term1187, term1187.getClass(), "minute", (byte) 16);
        setByteField(term1187, term1187.getClass(), "second", (byte) 59);
        setIntField(term1187, term1187.getClass(), "nano", 976524801);
        setField(term1182, term1182.getClass(), "time", term1187);
        setField(term1177, term1177.getClass(), "startDate", term1182);
        setIntField(term1193, term1193.getClass(), "year", 2028);
        setShortField(term1193, term1193.getClass(), "month", (short) 5);
        setShortField(term1193, term1193.getClass(), "day", (short) 15);
        setField(term1192, term1192.getClass(), "date", term1193);
        setByteField(term1197, term1197.getClass(), "hour", (byte) 20);
        setByteField(term1197, term1197.getClass(), "minute", (byte) 31);
        setByteField(term1197, term1197.getClass(), "second", (byte) 49);
        setIntField(term1197, term1197.getClass(), "nano", 945744862);
        setField(term1192, term1192.getClass(), "time", term1197);
        setField(term1177, term1177.getClass(), "endDate", term1192);
        setIntField(term1177, term1177.getClass(), "salePrice", -894662986);
        setIntField(term1204, term1204.getClass(), "year", 2016);
        setShortField(term1204, term1204.getClass(), "month", (short) 6);
        setShortField(term1204, term1204.getClass(), "day", (short) 23);
        setField(term1203, term1203.getClass(), "date", term1204);
        setByteField(term1208, term1208.getClass(), "hour", (byte) 20);
        setByteField(term1208, term1208.getClass(), "minute", (byte) 51);
        setByteField(term1208, term1208.getClass(), "second", (byte) 43);
        setIntField(term1208, term1208.getClass(), "nano", 284389409);
        setField(term1203, term1203.getClass(), "time", term1208);
        setField(term1177, term1177.getClass(), "saleStartDate", term1203);
        setIntField(term1214, term1214.getClass(), "year", 2014);
        setShortField(term1214, term1214.getClass(), "month", (short) 10);
        setShortField(term1214, term1214.getClass(), "day", (short) 7);
        setField(term1213, term1213.getClass(), "date", term1214);
        setByteField(term1218, term1218.getClass(), "hour", (byte) 12);
        setByteField(term1218, term1218.getClass(), "minute", (byte) 59);
        setByteField(term1218, term1218.getClass(), "second", (byte) 39);
        setIntField(term1218, term1218.getClass(), "nano", 603709306);
        setField(term1213, term1213.getClass(), "time", term1218);
        setField(term1177, term1177.getClass(), "saleEndDate", term1213);
        term1223 = new Integer(304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1223;
        callMethod(klass, "setSalePrice", argTypes, term1177, args);
    }

};


