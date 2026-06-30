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

public class GameMessage_setStartDate_21389880918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13957;
     Object term13992;

    public GameMessage_setStartDate_21389880918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13957 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13972 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13973 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13977 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13987 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13957, term13957.getClass(), "id", 947449400);
        setIntField(term13957, term13957.getClass(), "type", -763799087);
        setField(term13957, term13957.getClass(), "message", "JeZbrwZmsP");
        setIntField(term13973, term13973.getClass(), "year", 2023);
        setShortField(term13973, term13973.getClass(), "month", (short) 5);
        setShortField(term13973, term13973.getClass(), "day", (short) 31);
        setField(term13972, term13972.getClass(), "date", term13973);
        setByteField(term13977, term13977.getClass(), "hour", (byte) 13);
        setByteField(term13977, term13977.getClass(), "minute", (byte) 29);
        setByteField(term13977, term13977.getClass(), "second", (byte) 29);
        setIntField(term13977, term13977.getClass(), "nano", 621312201);
        setField(term13972, term13972.getClass(), "time", term13977);
        setField(term13957, term13957.getClass(), "startDate", term13972);
        setIntField(term13983, term13983.getClass(), "year", 2020);
        setShortField(term13983, term13983.getClass(), "month", (short) 10);
        setShortField(term13983, term13983.getClass(), "day", (short) 26);
        setField(term13982, term13982.getClass(), "date", term13983);
        setByteField(term13987, term13987.getClass(), "hour", (byte) 10);
        setByteField(term13987, term13987.getClass(), "minute", (byte) 50);
        setByteField(term13987, term13987.getClass(), "second", (byte) 16);
        setIntField(term13987, term13987.getClass(), "nano", 613429);
        setField(term13982, term13982.getClass(), "time", term13987);
        setField(term13957, term13957.getClass(), "endDate", term13982);
        term13992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13997 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13993, term13993.getClass(), "year", 2018);
        setShortField(term13993, term13993.getClass(), "month", (short) 5);
        setShortField(term13993, term13993.getClass(), "day", (short) 22);
        setField(term13992, term13992.getClass(), "date", term13993);
        setByteField(term13997, term13997.getClass(), "hour", (byte) 16);
        setByteField(term13997, term13997.getClass(), "minute", (byte) 46);
        setByteField(term13997, term13997.getClass(), "second", (byte) 48);
        setIntField(term13997, term13997.getClass(), "nano", 72983043);
        setField(term13992, term13992.getClass(), "time", term13997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term13992;
        callMethod(klass, "setStartDate", argTypes, term13957, args);
    }

};


