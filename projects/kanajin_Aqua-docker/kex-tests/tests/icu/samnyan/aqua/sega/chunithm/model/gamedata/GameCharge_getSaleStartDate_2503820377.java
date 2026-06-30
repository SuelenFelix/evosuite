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

public class GameCharge_getSaleStartDate_2503820377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;

    public GameCharge_getSaleStartDate_2503820377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term791 = newInstance(Class.forName("java.time.LocalTime"));
        Object term796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term801 = newInstance(Class.forName("java.time.LocalTime"));
        Object term807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term812 = newInstance(Class.forName("java.time.LocalTime"));
        Object term817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term822 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term781, term781.getClass(), "id", 6811161968424632369L);
        setIntField(term781, term781.getClass(), "orderId", 1596070772);
        setIntField(term781, term781.getClass(), "chargeId", 97029295);
        setIntField(term781, term781.getClass(), "price", -1371869594);
        setIntField(term787, term787.getClass(), "year", 2016);
        setShortField(term787, term787.getClass(), "month", (short) 2);
        setShortField(term787, term787.getClass(), "day", (short) 25);
        setField(term786, term786.getClass(), "date", term787);
        setByteField(term791, term791.getClass(), "hour", (byte) 8);
        setByteField(term791, term791.getClass(), "minute", (byte) 54);
        setByteField(term791, term791.getClass(), "second", (byte) 40);
        setIntField(term791, term791.getClass(), "nano", 124525896);
        setField(term786, term786.getClass(), "time", term791);
        setField(term781, term781.getClass(), "startDate", term786);
        setIntField(term797, term797.getClass(), "year", 2029);
        setShortField(term797, term797.getClass(), "month", (short) 1);
        setShortField(term797, term797.getClass(), "day", (short) 10);
        setField(term796, term796.getClass(), "date", term797);
        setByteField(term801, term801.getClass(), "hour", (byte) 8);
        setByteField(term801, term801.getClass(), "minute", (byte) 46);
        setByteField(term801, term801.getClass(), "second", (byte) 35);
        setIntField(term801, term801.getClass(), "nano", 58807194);
        setField(term796, term796.getClass(), "time", term801);
        setField(term781, term781.getClass(), "endDate", term796);
        setIntField(term781, term781.getClass(), "salePrice", -2095575670);
        setIntField(term808, term808.getClass(), "year", 2016);
        setShortField(term808, term808.getClass(), "month", (short) 10);
        setShortField(term808, term808.getClass(), "day", (short) 20);
        setField(term807, term807.getClass(), "date", term808);
        setByteField(term812, term812.getClass(), "hour", (byte) 18);
        setByteField(term812, term812.getClass(), "minute", (byte) 39);
        setByteField(term812, term812.getClass(), "second", (byte) 1);
        setIntField(term812, term812.getClass(), "nano", 196253988);
        setField(term807, term807.getClass(), "time", term812);
        setField(term781, term781.getClass(), "saleStartDate", term807);
        setIntField(term818, term818.getClass(), "year", 2019);
        setShortField(term818, term818.getClass(), "month", (short) 1);
        setShortField(term818, term818.getClass(), "day", (short) 6);
        setField(term817, term817.getClass(), "date", term818);
        setByteField(term822, term822.getClass(), "hour", (byte) 18);
        setByteField(term822, term822.getClass(), "minute", (byte) 8);
        setByteField(term822, term822.getClass(), "second", (byte) 46);
        setIntField(term822, term822.getClass(), "nano", 934136445);
        setField(term817, term817.getClass(), "time", term822);
        setField(term781, term781.getClass(), "saleEndDate", term817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSaleStartDate", argTypes, term781, args);
    }

};


