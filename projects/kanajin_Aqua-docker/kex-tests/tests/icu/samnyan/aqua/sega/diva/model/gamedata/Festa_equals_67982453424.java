package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Festa_equals_67982453424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25167;
     Object term25267;

    public Festa_equals_67982453424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25272 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term25271 = ((Class) term25272).getDeclaredField((String) "PINK_FESTA");
        ((Field) term25271).setAccessible(true);
        Object enum49 = ((Field) term25271).get((Object) null);
        Class<? extends Object> term25554 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term25553 = ((Class) term25554).getDeclaredField((String) "UNDEFINED");
        ((Field) term25553).setAccessible(true);
        Object enum50 = ((Field) term25553).get((Object) null);
        Integer term25243 = new Integer(0);
        Integer term25245 = new Integer(1);
        term25167 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term25247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25263 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term25167, term25167.getClass(), "id", -1);
        setBooleanField(term25167, term25167.getClass(), "enable", true);
        setField(term25167, term25167.getClass(), "name", "xxx");
        setField(term25167, term25167.getClass(), "kind", enum49);
        setField(term25167, term25167.getClass(), "difficulty", enum50);
        setField(term25167, term25167.getClass(), "pvList", "ALL");
        setField(term25167, term25167.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term25167, term25167.getClass(), "addVP", term25243);
        setField(term25167, term25167.getClass(), "vpMultiplier", term25245);
        setIntField(term25248, term25248.getClass(), "year", 2005);
        setShortField(term25248, term25248.getClass(), "month", (short) 1);
        setShortField(term25248, term25248.getClass(), "day", (short) 1);
        setField(term25247, term25247.getClass(), "date", term25248);
        setByteField(term25252, term25252.getClass(), "hour", (byte) 0);
        setByteField(term25252, term25252.getClass(), "minute", (byte) 0);
        setByteField(term25252, term25252.getClass(), "second", (byte) 0);
        setIntField(term25252, term25252.getClass(), "nano", 0);
        setField(term25247, term25247.getClass(), "time", term25252);
        setField(term25167, term25167.getClass(), "start", term25247);
        setIntField(term25258, term25258.getClass(), "year", 2005);
        setShortField(term25258, term25258.getClass(), "month", (short) 1);
        setShortField(term25258, term25258.getClass(), "day", (short) 1);
        setField(term25257, term25257.getClass(), "date", term25258);
        setField(term25257, term25257.getClass(), "time", term25252);
        setField(term25167, term25167.getClass(), "end", term25257);
        setIntField(term25263, term25263.getClass(), "year", 2005);
        setShortField(term25263, term25263.getClass(), "month", (short) 1);
        setShortField(term25263, term25263.getClass(), "day", (short) 1);
        setField(term25262, term25262.getClass(), "date", term25263);
        setField(term25262, term25262.getClass(), "time", term25252);
        setField(term25167, term25167.getClass(), "createDate", term25262);
        term25267 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25267;
        callMethod(klass, "equals", argTypes, term25167, args);
    }

};


