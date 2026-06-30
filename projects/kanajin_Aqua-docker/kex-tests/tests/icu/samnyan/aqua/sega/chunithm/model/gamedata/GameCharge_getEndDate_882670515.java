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

public class GameCharge_getEndDate_882670515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689;

    public GameCharge_getEndDate_882670515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term699 = newInstance(Class.forName("java.time.LocalTime"));
        Object term704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term709 = newInstance(Class.forName("java.time.LocalTime"));
        Object term715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term730 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term689, term689.getClass(), "id", 7411271909051562686L);
        setIntField(term689, term689.getClass(), "orderId", -1786399638);
        setIntField(term689, term689.getClass(), "chargeId", 2055867847);
        setIntField(term689, term689.getClass(), "price", -1048298087);
        setIntField(term695, term695.getClass(), "year", 2011);
        setShortField(term695, term695.getClass(), "month", (short) 6);
        setShortField(term695, term695.getClass(), "day", (short) 26);
        setField(term694, term694.getClass(), "date", term695);
        setByteField(term699, term699.getClass(), "hour", (byte) 22);
        setByteField(term699, term699.getClass(), "minute", (byte) 39);
        setByteField(term699, term699.getClass(), "second", (byte) 11);
        setIntField(term699, term699.getClass(), "nano", 686293604);
        setField(term694, term694.getClass(), "time", term699);
        setField(term689, term689.getClass(), "startDate", term694);
        setIntField(term705, term705.getClass(), "year", 2012);
        setShortField(term705, term705.getClass(), "month", (short) 7);
        setShortField(term705, term705.getClass(), "day", (short) 21);
        setField(term704, term704.getClass(), "date", term705);
        setByteField(term709, term709.getClass(), "hour", (byte) 13);
        setByteField(term709, term709.getClass(), "minute", (byte) 41);
        setByteField(term709, term709.getClass(), "second", (byte) 44);
        setIntField(term709, term709.getClass(), "nano", 394467282);
        setField(term704, term704.getClass(), "time", term709);
        setField(term689, term689.getClass(), "endDate", term704);
        setIntField(term689, term689.getClass(), "salePrice", 292681826);
        setIntField(term716, term716.getClass(), "year", 2025);
        setShortField(term716, term716.getClass(), "month", (short) 9);
        setShortField(term716, term716.getClass(), "day", (short) 25);
        setField(term715, term715.getClass(), "date", term716);
        setByteField(term720, term720.getClass(), "hour", (byte) 20);
        setByteField(term720, term720.getClass(), "minute", (byte) 0);
        setByteField(term720, term720.getClass(), "second", (byte) 25);
        setIntField(term720, term720.getClass(), "nano", 65871584);
        setField(term715, term715.getClass(), "time", term720);
        setField(term689, term689.getClass(), "saleStartDate", term715);
        setIntField(term726, term726.getClass(), "year", 2011);
        setShortField(term726, term726.getClass(), "month", (short) 9);
        setShortField(term726, term726.getClass(), "day", (short) 25);
        setField(term725, term725.getClass(), "date", term726);
        setByteField(term730, term730.getClass(), "hour", (byte) 16);
        setByteField(term730, term730.getClass(), "minute", (byte) 45);
        setByteField(term730, term730.getClass(), "second", (byte) 19);
        setIntField(term730, term730.getClass(), "nano", 962864785);
        setField(term725, term725.getClass(), "time", term730);
        setField(term689, term689.getClass(), "saleEndDate", term725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term689, args);
    }

};


