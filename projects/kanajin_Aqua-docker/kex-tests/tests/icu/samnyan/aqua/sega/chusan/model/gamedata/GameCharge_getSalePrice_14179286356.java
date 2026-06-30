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

public class GameCharge_getSalePrice_14179286356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867;

    public GameCharge_getSalePrice_14179286356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term867 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term872 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term873 = newInstance(Class.forName("java.time.LocalDate"));
        Object term877 = newInstance(Class.forName("java.time.LocalTime"));
        Object term882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term898 = newInstance(Class.forName("java.time.LocalTime"));
        Object term903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term908 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term867, term867.getClass(), "id", 4872422362414183754L);
        setIntField(term867, term867.getClass(), "orderId", 458147407);
        setIntField(term867, term867.getClass(), "chargeId", -184153539);
        setIntField(term867, term867.getClass(), "price", 493620644);
        setIntField(term873, term873.getClass(), "year", 2022);
        setShortField(term873, term873.getClass(), "month", (short) 6);
        setShortField(term873, term873.getClass(), "day", (short) 20);
        setField(term872, term872.getClass(), "date", term873);
        setByteField(term877, term877.getClass(), "hour", (byte) 7);
        setByteField(term877, term877.getClass(), "minute", (byte) 57);
        setByteField(term877, term877.getClass(), "second", (byte) 37);
        setIntField(term877, term877.getClass(), "nano", 90374877);
        setField(term872, term872.getClass(), "time", term877);
        setField(term867, term867.getClass(), "startDate", term872);
        setIntField(term883, term883.getClass(), "year", 2023);
        setShortField(term883, term883.getClass(), "month", (short) 2);
        setShortField(term883, term883.getClass(), "day", (short) 16);
        setField(term882, term882.getClass(), "date", term883);
        setByteField(term887, term887.getClass(), "hour", (byte) 3);
        setByteField(term887, term887.getClass(), "minute", (byte) 18);
        setByteField(term887, term887.getClass(), "second", (byte) 56);
        setIntField(term887, term887.getClass(), "nano", 733017887);
        setField(term882, term882.getClass(), "time", term887);
        setField(term867, term867.getClass(), "endDate", term882);
        setIntField(term867, term867.getClass(), "salePrice", 1328271830);
        setIntField(term894, term894.getClass(), "year", 2025);
        setShortField(term894, term894.getClass(), "month", (short) 3);
        setShortField(term894, term894.getClass(), "day", (short) 28);
        setField(term893, term893.getClass(), "date", term894);
        setByteField(term898, term898.getClass(), "hour", (byte) 19);
        setByteField(term898, term898.getClass(), "minute", (byte) 56);
        setByteField(term898, term898.getClass(), "second", (byte) 52);
        setIntField(term898, term898.getClass(), "nano", 738558930);
        setField(term893, term893.getClass(), "time", term898);
        setField(term867, term867.getClass(), "saleStartDate", term893);
        setIntField(term904, term904.getClass(), "year", 2024);
        setShortField(term904, term904.getClass(), "month", (short) 2);
        setShortField(term904, term904.getClass(), "day", (short) 29);
        setField(term903, term903.getClass(), "date", term904);
        setByteField(term908, term908.getClass(), "hour", (byte) 17);
        setByteField(term908, term908.getClass(), "minute", (byte) 54);
        setByteField(term908, term908.getClass(), "second", (byte) 21);
        setIntField(term908, term908.getClass(), "nano", 605973408);
        setField(term903, term903.getClass(), "time", term908);
        setField(term867, term867.getClass(), "saleEndDate", term903);
        setField(term867, term867.getClass(), "remarks", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSalePrice", argTypes, term867, args);
    }

};


