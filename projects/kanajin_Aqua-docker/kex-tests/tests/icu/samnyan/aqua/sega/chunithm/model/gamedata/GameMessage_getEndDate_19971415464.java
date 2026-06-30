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

public class GameMessage_getEndDate_19971415464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13751;

    public GameMessage_getEndDate_19971415464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13751 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13781 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13751, term13751.getClass(), "id", -1097563716);
        setIntField(term13751, term13751.getClass(), "type", 1572907769);
        setField(term13751, term13751.getClass(), "message", "McpzErOcYb");
        setIntField(term13767, term13767.getClass(), "year", 2023);
        setShortField(term13767, term13767.getClass(), "month", (short) 11);
        setShortField(term13767, term13767.getClass(), "day", (short) 14);
        setField(term13766, term13766.getClass(), "date", term13767);
        setByteField(term13771, term13771.getClass(), "hour", (byte) 15);
        setByteField(term13771, term13771.getClass(), "minute", (byte) 2);
        setByteField(term13771, term13771.getClass(), "second", (byte) 47);
        setIntField(term13771, term13771.getClass(), "nano", 703984770);
        setField(term13766, term13766.getClass(), "time", term13771);
        setField(term13751, term13751.getClass(), "startDate", term13766);
        setIntField(term13777, term13777.getClass(), "year", 2024);
        setShortField(term13777, term13777.getClass(), "month", (short) 4);
        setShortField(term13777, term13777.getClass(), "day", (short) 26);
        setField(term13776, term13776.getClass(), "date", term13777);
        setByteField(term13781, term13781.getClass(), "hour", (byte) 15);
        setByteField(term13781, term13781.getClass(), "minute", (byte) 12);
        setByteField(term13781, term13781.getClass(), "second", (byte) 31);
        setIntField(term13781, term13781.getClass(), "nano", 839979637);
        setField(term13776, term13776.getClass(), "time", term13781);
        setField(term13751, term13751.getClass(), "endDate", term13776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term13751, args);
    }

};


