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

public class GameMessage_setEndDate_9927964149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14012;
     Object term14047;

    public GameMessage_setEndDate_9927964149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14012 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term14027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14032 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14037 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14038 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14042 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14012, term14012.getClass(), "id", 1207142014);
        setIntField(term14012, term14012.getClass(), "type", -876426634);
        setField(term14012, term14012.getClass(), "message", "bxyfeicqrK");
        setIntField(term14028, term14028.getClass(), "year", 2022);
        setShortField(term14028, term14028.getClass(), "month", (short) 3);
        setShortField(term14028, term14028.getClass(), "day", (short) 16);
        setField(term14027, term14027.getClass(), "date", term14028);
        setByteField(term14032, term14032.getClass(), "hour", (byte) 16);
        setByteField(term14032, term14032.getClass(), "minute", (byte) 35);
        setByteField(term14032, term14032.getClass(), "second", (byte) 38);
        setIntField(term14032, term14032.getClass(), "nano", 79329968);
        setField(term14027, term14027.getClass(), "time", term14032);
        setField(term14012, term14012.getClass(), "startDate", term14027);
        setIntField(term14038, term14038.getClass(), "year", 2018);
        setShortField(term14038, term14038.getClass(), "month", (short) 9);
        setShortField(term14038, term14038.getClass(), "day", (short) 3);
        setField(term14037, term14037.getClass(), "date", term14038);
        setByteField(term14042, term14042.getClass(), "hour", (byte) 16);
        setByteField(term14042, term14042.getClass(), "minute", (byte) 48);
        setByteField(term14042, term14042.getClass(), "second", (byte) 45);
        setIntField(term14042, term14042.getClass(), "nano", 919694917);
        setField(term14037, term14037.getClass(), "time", term14042);
        setField(term14012, term14012.getClass(), "endDate", term14037);
        term14047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14052 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14048, term14048.getClass(), "year", 2021);
        setShortField(term14048, term14048.getClass(), "month", (short) 8);
        setShortField(term14048, term14048.getClass(), "day", (short) 23);
        setField(term14047, term14047.getClass(), "date", term14048);
        setByteField(term14052, term14052.getClass(), "hour", (byte) 15);
        setByteField(term14052, term14052.getClass(), "minute", (byte) 43);
        setByteField(term14052, term14052.getClass(), "second", (byte) 10);
        setIntField(term14052, term14052.getClass(), "nano", 893504165);
        setField(term14047, term14047.getClass(), "time", term14052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term14047;
        callMethod(klass, "setEndDate", argTypes, term14012, args);
    }

};


