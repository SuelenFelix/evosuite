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
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class GameCharge_init_212883794522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1523;
     Object term1525;
     Object term1527;
     Object term1529;
     Object term1531;
     Object term1541;
     Object term1551;
     Object term1553;
     Object term1563;

    public GameCharge_init_212883794522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1523 = new Long(-4365849114644724155L);
        term1525 = new Integer(568954359);
        term1527 = new Integer(53410913);
        term1529 = new Integer(-375014958);
        term1531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1536 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1532, term1532.getClass(), "year", 2016);
        setShortField(term1532, term1532.getClass(), "month", (short) 4);
        setShortField(term1532, term1532.getClass(), "day", (short) 18);
        setField(term1531, term1531.getClass(), "date", term1532);
        setByteField(term1536, term1536.getClass(), "hour", (byte) 15);
        setByteField(term1536, term1536.getClass(), "minute", (byte) 56);
        setByteField(term1536, term1536.getClass(), "second", (byte) 45);
        setIntField(term1536, term1536.getClass(), "nano", 248103350);
        setField(term1531, term1531.getClass(), "time", term1536);
        term1541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1546 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1542, term1542.getClass(), "year", 2028);
        setShortField(term1542, term1542.getClass(), "month", (short) 3);
        setShortField(term1542, term1542.getClass(), "day", (short) 25);
        setField(term1541, term1541.getClass(), "date", term1542);
        setByteField(term1546, term1546.getClass(), "hour", (byte) 6);
        setByteField(term1546, term1546.getClass(), "minute", (byte) 9);
        setByteField(term1546, term1546.getClass(), "second", (byte) 35);
        setIntField(term1546, term1546.getClass(), "nano", 744453524);
        setField(term1541, term1541.getClass(), "time", term1546);
        term1551 = new Integer(1107176718);
        term1553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1558 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1554, term1554.getClass(), "year", 2017);
        setShortField(term1554, term1554.getClass(), "month", (short) 6);
        setShortField(term1554, term1554.getClass(), "day", (short) 28);
        setField(term1553, term1553.getClass(), "date", term1554);
        setByteField(term1558, term1558.getClass(), "hour", (byte) 8);
        setByteField(term1558, term1558.getClass(), "minute", (byte) 1);
        setByteField(term1558, term1558.getClass(), "second", (byte) 14);
        setIntField(term1558, term1558.getClass(), "nano", 501033715);
        setField(term1553, term1553.getClass(), "time", term1558);
        term1563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1568 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1564, term1564.getClass(), "year", 2016);
        setShortField(term1564, term1564.getClass(), "month", (short) 10);
        setShortField(term1564, term1564.getClass(), "day", (short) 10);
        setField(term1563, term1563.getClass(), "date", term1564);
        setByteField(term1568, term1568.getClass(), "hour", (byte) 16);
        setByteField(term1568, term1568.getClass(), "minute", (byte) 7);
        setByteField(term1568, term1568.getClass(), "second", (byte) 16);
        setIntField(term1568, term1568.getClass(), "nano", 995200309);
        setField(term1563, term1563.getClass(), "time", term1568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[9];
        args[0] = term1523;
        args[1] = term1525;
        args[2] = term1527;
        args[3] = term1529;
        args[4] = term1531;
        args[5] = term1541;
        args[6] = term1551;
        args[7] = term1553;
        args[8] = term1563;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


