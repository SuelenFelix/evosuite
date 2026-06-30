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

public class GameCharge_getEndDate_5884755015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;

    public GameCharge_getEndDate_5884755015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term799 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term804 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term809 = newInstance(Class.forName("java.time.LocalTime"));
        Object term814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term819 = newInstance(Class.forName("java.time.LocalTime"));
        Object term825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term830 = newInstance(Class.forName("java.time.LocalTime"));
        Object term835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term840 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term799, term799.getClass(), "id", 7411271909051562686L);
        setIntField(term799, term799.getClass(), "orderId", -1786399638);
        setIntField(term799, term799.getClass(), "chargeId", 2055867847);
        setIntField(term799, term799.getClass(), "price", -1048298087);
        setIntField(term805, term805.getClass(), "year", 2011);
        setShortField(term805, term805.getClass(), "month", (short) 6);
        setShortField(term805, term805.getClass(), "day", (short) 26);
        setField(term804, term804.getClass(), "date", term805);
        setByteField(term809, term809.getClass(), "hour", (byte) 22);
        setByteField(term809, term809.getClass(), "minute", (byte) 39);
        setByteField(term809, term809.getClass(), "second", (byte) 11);
        setIntField(term809, term809.getClass(), "nano", 686293604);
        setField(term804, term804.getClass(), "time", term809);
        setField(term799, term799.getClass(), "startDate", term804);
        setIntField(term815, term815.getClass(), "year", 2012);
        setShortField(term815, term815.getClass(), "month", (short) 7);
        setShortField(term815, term815.getClass(), "day", (short) 21);
        setField(term814, term814.getClass(), "date", term815);
        setByteField(term819, term819.getClass(), "hour", (byte) 13);
        setByteField(term819, term819.getClass(), "minute", (byte) 41);
        setByteField(term819, term819.getClass(), "second", (byte) 44);
        setIntField(term819, term819.getClass(), "nano", 394467282);
        setField(term814, term814.getClass(), "time", term819);
        setField(term799, term799.getClass(), "endDate", term814);
        setIntField(term799, term799.getClass(), "salePrice", 292681826);
        setIntField(term826, term826.getClass(), "year", 2025);
        setShortField(term826, term826.getClass(), "month", (short) 9);
        setShortField(term826, term826.getClass(), "day", (short) 25);
        setField(term825, term825.getClass(), "date", term826);
        setByteField(term830, term830.getClass(), "hour", (byte) 20);
        setByteField(term830, term830.getClass(), "minute", (byte) 0);
        setByteField(term830, term830.getClass(), "second", (byte) 25);
        setIntField(term830, term830.getClass(), "nano", 65871584);
        setField(term825, term825.getClass(), "time", term830);
        setField(term799, term799.getClass(), "saleStartDate", term825);
        setIntField(term836, term836.getClass(), "year", 2011);
        setShortField(term836, term836.getClass(), "month", (short) 9);
        setShortField(term836, term836.getClass(), "day", (short) 25);
        setField(term835, term835.getClass(), "date", term836);
        setByteField(term840, term840.getClass(), "hour", (byte) 16);
        setByteField(term840, term840.getClass(), "minute", (byte) 45);
        setByteField(term840, term840.getClass(), "second", (byte) 19);
        setIntField(term840, term840.getClass(), "nano", 962864785);
        setField(term835, term835.getClass(), "time", term840);
        setField(term799, term799.getClass(), "saleEndDate", term835);
        setField(term799, term799.getClass(), "remarks", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term799, args);
    }

};


