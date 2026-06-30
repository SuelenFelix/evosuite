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

public class GameCharge_setSaleEndDate_150127730217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;
     Object term1327;

    public GameCharge_setSaleEndDate_150127730217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1281 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1291 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1296 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1297 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1301 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1312 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1322 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1281, term1281.getClass(), "id", -6573104506744284592L);
        setIntField(term1281, term1281.getClass(), "orderId", -268815336);
        setIntField(term1281, term1281.getClass(), "chargeId", -1210583429);
        setIntField(term1281, term1281.getClass(), "price", -663691365);
        setIntField(term1287, term1287.getClass(), "year", 2025);
        setShortField(term1287, term1287.getClass(), "month", (short) 9);
        setShortField(term1287, term1287.getClass(), "day", (short) 18);
        setField(term1286, term1286.getClass(), "date", term1287);
        setByteField(term1291, term1291.getClass(), "hour", (byte) 16);
        setByteField(term1291, term1291.getClass(), "minute", (byte) 1);
        setByteField(term1291, term1291.getClass(), "second", (byte) 23);
        setIntField(term1291, term1291.getClass(), "nano", 178285726);
        setField(term1286, term1286.getClass(), "time", term1291);
        setField(term1281, term1281.getClass(), "startDate", term1286);
        setIntField(term1297, term1297.getClass(), "year", 2013);
        setShortField(term1297, term1297.getClass(), "month", (short) 7);
        setShortField(term1297, term1297.getClass(), "day", (short) 26);
        setField(term1296, term1296.getClass(), "date", term1297);
        setByteField(term1301, term1301.getClass(), "hour", (byte) 14);
        setByteField(term1301, term1301.getClass(), "minute", (byte) 45);
        setByteField(term1301, term1301.getClass(), "second", (byte) 33);
        setIntField(term1301, term1301.getClass(), "nano", 547995853);
        setField(term1296, term1296.getClass(), "time", term1301);
        setField(term1281, term1281.getClass(), "endDate", term1296);
        setIntField(term1281, term1281.getClass(), "salePrice", 339854490);
        setIntField(term1308, term1308.getClass(), "year", 2016);
        setShortField(term1308, term1308.getClass(), "month", (short) 12);
        setShortField(term1308, term1308.getClass(), "day", (short) 20);
        setField(term1307, term1307.getClass(), "date", term1308);
        setByteField(term1312, term1312.getClass(), "hour", (byte) 8);
        setByteField(term1312, term1312.getClass(), "minute", (byte) 46);
        setByteField(term1312, term1312.getClass(), "second", (byte) 16);
        setIntField(term1312, term1312.getClass(), "nano", 10071864);
        setField(term1307, term1307.getClass(), "time", term1312);
        setField(term1281, term1281.getClass(), "saleStartDate", term1307);
        setIntField(term1318, term1318.getClass(), "year", 2021);
        setShortField(term1318, term1318.getClass(), "month", (short) 8);
        setShortField(term1318, term1318.getClass(), "day", (short) 27);
        setField(term1317, term1317.getClass(), "date", term1318);
        setByteField(term1322, term1322.getClass(), "hour", (byte) 20);
        setByteField(term1322, term1322.getClass(), "minute", (byte) 11);
        setByteField(term1322, term1322.getClass(), "second", (byte) 47);
        setIntField(term1322, term1322.getClass(), "nano", 116303493);
        setField(term1317, term1317.getClass(), "time", term1322);
        setField(term1281, term1281.getClass(), "saleEndDate", term1317);
        term1327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1332 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1328, term1328.getClass(), "year", 2012);
        setShortField(term1328, term1328.getClass(), "month", (short) 5);
        setShortField(term1328, term1328.getClass(), "day", (short) 17);
        setField(term1327, term1327.getClass(), "date", term1328);
        setByteField(term1332, term1332.getClass(), "hour", (byte) 19);
        setByteField(term1332, term1332.getClass(), "minute", (byte) 36);
        setByteField(term1332, term1332.getClass(), "second", (byte) 33);
        setIntField(term1332, term1332.getClass(), "nano", 46625011);
        setField(term1327, term1327.getClass(), "time", term1332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1327;
        callMethod(klass, "setSaleEndDate", argTypes, term1281, args);
    }

};


