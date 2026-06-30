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
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class GameCharge_init_76705144024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2165;
     Object term2167;
     Object term2169;
     Object term2171;
     Object term2173;
     Object term2183;
     Object term2193;
     Object term2195;
     Object term2205;

    public GameCharge_init_76705144024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2165 = new Long(7009926388951271268L);
        term2167 = new Integer(96566506);
        term2169 = new Integer(-343325701);
        term2171 = new Integer(107945604);
        term2173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2178 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2174, term2174.getClass(), "year", 2012);
        setShortField(term2174, term2174.getClass(), "month", (short) 5);
        setShortField(term2174, term2174.getClass(), "day", (short) 25);
        setField(term2173, term2173.getClass(), "date", term2174);
        setByteField(term2178, term2178.getClass(), "hour", (byte) 5);
        setByteField(term2178, term2178.getClass(), "minute", (byte) 8);
        setByteField(term2178, term2178.getClass(), "second", (byte) 47);
        setIntField(term2178, term2178.getClass(), "nano", 455554221);
        setField(term2173, term2173.getClass(), "time", term2178);
        term2183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2188 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2184, term2184.getClass(), "year", 2029);
        setShortField(term2184, term2184.getClass(), "month", (short) 11);
        setShortField(term2184, term2184.getClass(), "day", (short) 18);
        setField(term2183, term2183.getClass(), "date", term2184);
        setByteField(term2188, term2188.getClass(), "hour", (byte) 5);
        setByteField(term2188, term2188.getClass(), "minute", (byte) 36);
        setByteField(term2188, term2188.getClass(), "second", (byte) 57);
        setIntField(term2188, term2188.getClass(), "nano", 394167804);
        setField(term2183, term2183.getClass(), "time", term2188);
        term2193 = new Integer(-1963464809);
        term2195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2200 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2196, term2196.getClass(), "year", 2020);
        setShortField(term2196, term2196.getClass(), "month", (short) 10);
        setShortField(term2196, term2196.getClass(), "day", (short) 8);
        setField(term2195, term2195.getClass(), "date", term2196);
        setByteField(term2200, term2200.getClass(), "hour", (byte) 15);
        setByteField(term2200, term2200.getClass(), "minute", (byte) 57);
        setByteField(term2200, term2200.getClass(), "second", (byte) 17);
        setIntField(term2200, term2200.getClass(), "nano", 288139529);
        setField(term2195, term2195.getClass(), "time", term2200);
        term2205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2210 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2206, term2206.getClass(), "year", 2022);
        setShortField(term2206, term2206.getClass(), "month", (short) 6);
        setShortField(term2206, term2206.getClass(), "day", (short) 12);
        setField(term2205, term2205.getClass(), "date", term2206);
        setByteField(term2210, term2210.getClass(), "hour", (byte) 14);
        setByteField(term2210, term2210.getClass(), "minute", (byte) 3);
        setByteField(term2210, term2210.getClass(), "second", (byte) 7);
        setIntField(term2210, term2210.getClass(), "nano", 637592645);
        setField(term2205, term2205.getClass(), "time", term2210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.time.LocalDateTime");
        argTypes[9] = Class.forName("java.lang.String");
        Object[] args = new Object[10];
        args[0] = term2165;
        args[1] = term2167;
        args[2] = term2169;
        args[3] = term2171;
        args[4] = term2173;
        args[5] = term2183;
        args[6] = term2193;
        args[7] = term2195;
        args[8] = term2205;
        args[9] = "vrQLuWIDJX";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


