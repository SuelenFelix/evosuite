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
import java.lang.Integer;

public class GameMessage_setId_13675390135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13796;
     Object term13831;

    public GameMessage_setId_13675390135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13796 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13816 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13826 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13796, term13796.getClass(), "id", 1608016787);
        setIntField(term13796, term13796.getClass(), "type", -516303035);
        setField(term13796, term13796.getClass(), "message", "jqrVEUvYEz");
        setIntField(term13812, term13812.getClass(), "year", 2010);
        setShortField(term13812, term13812.getClass(), "month", (short) 3);
        setShortField(term13812, term13812.getClass(), "day", (short) 11);
        setField(term13811, term13811.getClass(), "date", term13812);
        setByteField(term13816, term13816.getClass(), "hour", (byte) 0);
        setByteField(term13816, term13816.getClass(), "minute", (byte) 21);
        setByteField(term13816, term13816.getClass(), "second", (byte) 25);
        setIntField(term13816, term13816.getClass(), "nano", 201315999);
        setField(term13811, term13811.getClass(), "time", term13816);
        setField(term13796, term13796.getClass(), "startDate", term13811);
        setIntField(term13822, term13822.getClass(), "year", 2016);
        setShortField(term13822, term13822.getClass(), "month", (short) 8);
        setShortField(term13822, term13822.getClass(), "day", (short) 24);
        setField(term13821, term13821.getClass(), "date", term13822);
        setByteField(term13826, term13826.getClass(), "hour", (byte) 22);
        setByteField(term13826, term13826.getClass(), "minute", (byte) 25);
        setByteField(term13826, term13826.getClass(), "second", (byte) 3);
        setIntField(term13826, term13826.getClass(), "nano", 185613519);
        setField(term13821, term13821.getClass(), "time", term13826);
        setField(term13796, term13796.getClass(), "endDate", term13821);
        term13831 = new Integer(-2143043890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13831;
        callMethod(klass, "setId", argTypes, term13796, args);
    }

};


