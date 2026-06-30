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

public class GameEvent_getEndDate_10035866513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public GameEvent_getEndDate_10035866513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        Object term76 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81 = newInstance(Class.forName("java.time.LocalTime"));
        Object term86 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term73, term73.getClass(), "id", -1955890973);
        setIntField(term73, term73.getClass(), "type", -2038273078);
        setIntField(term77, term77.getClass(), "year", 2025);
        setShortField(term77, term77.getClass(), "month", (short) 4);
        setShortField(term77, term77.getClass(), "day", (short) 24);
        setField(term76, term76.getClass(), "date", term77);
        setByteField(term81, term81.getClass(), "hour", (byte) 18);
        setByteField(term81, term81.getClass(), "minute", (byte) 11);
        setByteField(term81, term81.getClass(), "second", (byte) 40);
        setIntField(term81, term81.getClass(), "nano", 137454929);
        setField(term76, term76.getClass(), "time", term81);
        setField(term73, term73.getClass(), "startDate", term76);
        setIntField(term87, term87.getClass(), "year", 2024);
        setShortField(term87, term87.getClass(), "month", (short) 1);
        setShortField(term87, term87.getClass(), "day", (short) 24);
        setField(term86, term86.getClass(), "date", term87);
        setByteField(term91, term91.getClass(), "hour", (byte) 20);
        setByteField(term91, term91.getClass(), "minute", (byte) 28);
        setByteField(term91, term91.getClass(), "second", (byte) 39);
        setIntField(term91, term91.getClass(), "nano", 952728177);
        setField(term86, term86.getClass(), "time", term91);
        setField(term73, term73.getClass(), "endDate", term86);
        setBooleanField(term73, term73.getClass(), "enable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term73, args);
    }

};


