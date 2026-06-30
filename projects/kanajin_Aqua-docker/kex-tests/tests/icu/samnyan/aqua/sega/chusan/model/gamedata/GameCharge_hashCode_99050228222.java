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

public class GameCharge_hashCode_99050228222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2029;

    public GameCharge_hashCode_99050228222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2029 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term2034 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2035 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2039 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2044 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2045 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2049 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2060 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2070 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2029, term2029.getClass(), "id", -4365849114644724155L);
        setIntField(term2029, term2029.getClass(), "orderId", 568954359);
        setIntField(term2029, term2029.getClass(), "chargeId", 53410913);
        setIntField(term2029, term2029.getClass(), "price", -375014958);
        setIntField(term2035, term2035.getClass(), "year", 2016);
        setShortField(term2035, term2035.getClass(), "month", (short) 4);
        setShortField(term2035, term2035.getClass(), "day", (short) 18);
        setField(term2034, term2034.getClass(), "date", term2035);
        setByteField(term2039, term2039.getClass(), "hour", (byte) 15);
        setByteField(term2039, term2039.getClass(), "minute", (byte) 56);
        setByteField(term2039, term2039.getClass(), "second", (byte) 45);
        setIntField(term2039, term2039.getClass(), "nano", 248103350);
        setField(term2034, term2034.getClass(), "time", term2039);
        setField(term2029, term2029.getClass(), "startDate", term2034);
        setIntField(term2045, term2045.getClass(), "year", 2028);
        setShortField(term2045, term2045.getClass(), "month", (short) 3);
        setShortField(term2045, term2045.getClass(), "day", (short) 25);
        setField(term2044, term2044.getClass(), "date", term2045);
        setByteField(term2049, term2049.getClass(), "hour", (byte) 6);
        setByteField(term2049, term2049.getClass(), "minute", (byte) 9);
        setByteField(term2049, term2049.getClass(), "second", (byte) 35);
        setIntField(term2049, term2049.getClass(), "nano", 744453524);
        setField(term2044, term2044.getClass(), "time", term2049);
        setField(term2029, term2029.getClass(), "endDate", term2044);
        setIntField(term2029, term2029.getClass(), "salePrice", 1107176718);
        setIntField(term2056, term2056.getClass(), "year", 2017);
        setShortField(term2056, term2056.getClass(), "month", (short) 6);
        setShortField(term2056, term2056.getClass(), "day", (short) 28);
        setField(term2055, term2055.getClass(), "date", term2056);
        setByteField(term2060, term2060.getClass(), "hour", (byte) 8);
        setByteField(term2060, term2060.getClass(), "minute", (byte) 1);
        setByteField(term2060, term2060.getClass(), "second", (byte) 14);
        setIntField(term2060, term2060.getClass(), "nano", 501033715);
        setField(term2055, term2055.getClass(), "time", term2060);
        setField(term2029, term2029.getClass(), "saleStartDate", term2055);
        setIntField(term2066, term2066.getClass(), "year", 2016);
        setShortField(term2066, term2066.getClass(), "month", (short) 10);
        setShortField(term2066, term2066.getClass(), "day", (short) 10);
        setField(term2065, term2065.getClass(), "date", term2066);
        setByteField(term2070, term2070.getClass(), "hour", (byte) 16);
        setByteField(term2070, term2070.getClass(), "minute", (byte) 7);
        setByteField(term2070, term2070.getClass(), "second", (byte) 16);
        setIntField(term2070, term2070.getClass(), "nano", 995200309);
        setField(term2065, term2065.getClass(), "time", term2070);
        setField(term2029, term2029.getClass(), "saleEndDate", term2065);
        setField(term2029, term2029.getClass(), "remarks", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2029, args);
    }

};


