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

public class GameCharge_getSaleEndDate_18917747988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term827;

    public GameCharge_getSaleEndDate_18917747988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term827 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term837 = newInstance(Class.forName("java.time.LocalTime"));
        Object term842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term858 = newInstance(Class.forName("java.time.LocalTime"));
        Object term863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term868 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term827, term827.getClass(), "id", -7237588299778557629L);
        setIntField(term827, term827.getClass(), "orderId", 1225272962);
        setIntField(term827, term827.getClass(), "chargeId", 1324040357);
        setIntField(term827, term827.getClass(), "price", -1588772968);
        setIntField(term833, term833.getClass(), "year", 2028);
        setShortField(term833, term833.getClass(), "month", (short) 1);
        setShortField(term833, term833.getClass(), "day", (short) 18);
        setField(term832, term832.getClass(), "date", term833);
        setByteField(term837, term837.getClass(), "hour", (byte) 12);
        setByteField(term837, term837.getClass(), "minute", (byte) 4);
        setByteField(term837, term837.getClass(), "second", (byte) 39);
        setIntField(term837, term837.getClass(), "nano", 651287093);
        setField(term832, term832.getClass(), "time", term837);
        setField(term827, term827.getClass(), "startDate", term832);
        setIntField(term843, term843.getClass(), "year", 2027);
        setShortField(term843, term843.getClass(), "month", (short) 7);
        setShortField(term843, term843.getClass(), "day", (short) 23);
        setField(term842, term842.getClass(), "date", term843);
        setByteField(term847, term847.getClass(), "hour", (byte) 12);
        setByteField(term847, term847.getClass(), "minute", (byte) 6);
        setByteField(term847, term847.getClass(), "second", (byte) 19);
        setIntField(term847, term847.getClass(), "nano", 8025683);
        setField(term842, term842.getClass(), "time", term847);
        setField(term827, term827.getClass(), "endDate", term842);
        setIntField(term827, term827.getClass(), "salePrice", -93135961);
        setIntField(term854, term854.getClass(), "year", 2018);
        setShortField(term854, term854.getClass(), "month", (short) 2);
        setShortField(term854, term854.getClass(), "day", (short) 14);
        setField(term853, term853.getClass(), "date", term854);
        setByteField(term858, term858.getClass(), "hour", (byte) 2);
        setByteField(term858, term858.getClass(), "minute", (byte) 40);
        setByteField(term858, term858.getClass(), "second", (byte) 48);
        setIntField(term858, term858.getClass(), "nano", 371006728);
        setField(term853, term853.getClass(), "time", term858);
        setField(term827, term827.getClass(), "saleStartDate", term853);
        setIntField(term864, term864.getClass(), "year", 2025);
        setShortField(term864, term864.getClass(), "month", (short) 8);
        setShortField(term864, term864.getClass(), "day", (short) 22);
        setField(term863, term863.getClass(), "date", term864);
        setByteField(term868, term868.getClass(), "hour", (byte) 6);
        setByteField(term868, term868.getClass(), "minute", (byte) 48);
        setByteField(term868, term868.getClass(), "second", (byte) 49);
        setIntField(term868, term868.getClass(), "nano", 46400229);
        setField(term863, term863.getClass(), "time", term868);
        setField(term827, term827.getClass(), "saleEndDate", term863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaleEndDate", argTypes, term827, args);
    }

};


