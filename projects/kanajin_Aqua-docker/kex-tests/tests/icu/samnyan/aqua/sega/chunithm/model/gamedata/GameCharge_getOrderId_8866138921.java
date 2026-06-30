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

public class GameCharge_getOrderId_8866138921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505;

    public GameCharge_getOrderId_8866138921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term505 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term520 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term521 = newInstance(Class.forName("java.time.LocalDate"));
        Object term525 = newInstance(Class.forName("java.time.LocalTime"));
        Object term531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term536 = newInstance(Class.forName("java.time.LocalTime"));
        Object term541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term546 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term505, term505.getClass(), "id", 6375119433582206027L);
        setIntField(term505, term505.getClass(), "orderId", -1530420153);
        setIntField(term505, term505.getClass(), "chargeId", -469968304);
        setIntField(term505, term505.getClass(), "price", -1145578966);
        setIntField(term511, term511.getClass(), "year", 2010);
        setShortField(term511, term511.getClass(), "month", (short) 1);
        setShortField(term511, term511.getClass(), "day", (short) 17);
        setField(term510, term510.getClass(), "date", term511);
        setByteField(term515, term515.getClass(), "hour", (byte) 13);
        setByteField(term515, term515.getClass(), "minute", (byte) 5);
        setByteField(term515, term515.getClass(), "second", (byte) 51);
        setIntField(term515, term515.getClass(), "nano", 362260580);
        setField(term510, term510.getClass(), "time", term515);
        setField(term505, term505.getClass(), "startDate", term510);
        setIntField(term521, term521.getClass(), "year", 2010);
        setShortField(term521, term521.getClass(), "month", (short) 9);
        setShortField(term521, term521.getClass(), "day", (short) 28);
        setField(term520, term520.getClass(), "date", term521);
        setByteField(term525, term525.getClass(), "hour", (byte) 6);
        setByteField(term525, term525.getClass(), "minute", (byte) 4);
        setByteField(term525, term525.getClass(), "second", (byte) 54);
        setIntField(term525, term525.getClass(), "nano", 604713782);
        setField(term520, term520.getClass(), "time", term525);
        setField(term505, term505.getClass(), "endDate", term520);
        setIntField(term505, term505.getClass(), "salePrice", 679763016);
        setIntField(term532, term532.getClass(), "year", 2023);
        setShortField(term532, term532.getClass(), "month", (short) 7);
        setShortField(term532, term532.getClass(), "day", (short) 16);
        setField(term531, term531.getClass(), "date", term532);
        setByteField(term536, term536.getClass(), "hour", (byte) 3);
        setByteField(term536, term536.getClass(), "minute", (byte) 1);
        setByteField(term536, term536.getClass(), "second", (byte) 19);
        setIntField(term536, term536.getClass(), "nano", 488629554);
        setField(term531, term531.getClass(), "time", term536);
        setField(term505, term505.getClass(), "saleStartDate", term531);
        setIntField(term542, term542.getClass(), "year", 2018);
        setShortField(term542, term542.getClass(), "month", (short) 7);
        setShortField(term542, term542.getClass(), "day", (short) 12);
        setField(term541, term541.getClass(), "date", term542);
        setByteField(term546, term546.getClass(), "hour", (byte) 1);
        setByteField(term546, term546.getClass(), "minute", (byte) 3);
        setByteField(term546, term546.getClass(), "second", (byte) 47);
        setIntField(term546, term546.getClass(), "nano", 2729929);
        setField(term541, term541.getClass(), "time", term546);
        setField(term505, term505.getClass(), "saleEndDate", term541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term505, args);
    }

};


