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

public class GameCharge_getOrderId_3864054421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527;

    public GameCharge_getOrderId_3864054421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term547 = newInstance(Class.forName("java.time.LocalTime"));
        Object term553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term558 = newInstance(Class.forName("java.time.LocalTime"));
        Object term563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term568 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term527, term527.getClass(), "id", 6375119433582206027L);
        setIntField(term527, term527.getClass(), "orderId", -1530420153);
        setIntField(term527, term527.getClass(), "chargeId", -469968304);
        setIntField(term527, term527.getClass(), "price", -1145578966);
        setIntField(term533, term533.getClass(), "year", 2010);
        setShortField(term533, term533.getClass(), "month", (short) 1);
        setShortField(term533, term533.getClass(), "day", (short) 17);
        setField(term532, term532.getClass(), "date", term533);
        setByteField(term537, term537.getClass(), "hour", (byte) 13);
        setByteField(term537, term537.getClass(), "minute", (byte) 5);
        setByteField(term537, term537.getClass(), "second", (byte) 51);
        setIntField(term537, term537.getClass(), "nano", 362260580);
        setField(term532, term532.getClass(), "time", term537);
        setField(term527, term527.getClass(), "startDate", term532);
        setIntField(term543, term543.getClass(), "year", 2010);
        setShortField(term543, term543.getClass(), "month", (short) 9);
        setShortField(term543, term543.getClass(), "day", (short) 28);
        setField(term542, term542.getClass(), "date", term543);
        setByteField(term547, term547.getClass(), "hour", (byte) 6);
        setByteField(term547, term547.getClass(), "minute", (byte) 4);
        setByteField(term547, term547.getClass(), "second", (byte) 54);
        setIntField(term547, term547.getClass(), "nano", 604713782);
        setField(term542, term542.getClass(), "time", term547);
        setField(term527, term527.getClass(), "endDate", term542);
        setIntField(term527, term527.getClass(), "salePrice", 679763016);
        setIntField(term554, term554.getClass(), "year", 2023);
        setShortField(term554, term554.getClass(), "month", (short) 7);
        setShortField(term554, term554.getClass(), "day", (short) 16);
        setField(term553, term553.getClass(), "date", term554);
        setByteField(term558, term558.getClass(), "hour", (byte) 3);
        setByteField(term558, term558.getClass(), "minute", (byte) 1);
        setByteField(term558, term558.getClass(), "second", (byte) 19);
        setIntField(term558, term558.getClass(), "nano", 488629554);
        setField(term553, term553.getClass(), "time", term558);
        setField(term527, term527.getClass(), "saleStartDate", term553);
        setIntField(term564, term564.getClass(), "year", 2018);
        setShortField(term564, term564.getClass(), "month", (short) 7);
        setShortField(term564, term564.getClass(), "day", (short) 12);
        setField(term563, term563.getClass(), "date", term564);
        setByteField(term568, term568.getClass(), "hour", (byte) 1);
        setByteField(term568, term568.getClass(), "minute", (byte) 3);
        setByteField(term568, term568.getClass(), "second", (byte) 47);
        setIntField(term568, term568.getClass(), "nano", 2729929);
        setField(term563, term563.getClass(), "time", term568);
        setField(term527, term527.getClass(), "saleEndDate", term563);
        setField(term527, term527.getClass(), "remarks", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term527, args);
    }

};


