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

public class Festa_canEqual_148398716325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25872;
     Object term25972;

    public Festa_canEqual_148398716325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25977 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term25976 = ((Class) term25977).getDeclaredField((String) "PINK_FESTA");
        ((Field) term25976).setAccessible(true);
        Object enum51 = ((Field) term25976).get((Object) null);
        Class<? extends Object> term26259 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term26258 = ((Class) term26259).getDeclaredField((String) "UNDEFINED");
        ((Field) term26258).setAccessible(true);
        Object enum52 = ((Field) term26258).get((Object) null);
        Integer term25948 = new Integer(0);
        Integer term25950 = new Integer(1);
        term25872 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term25952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25957 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25962 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25963 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25968 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term25872, term25872.getClass(), "id", -1);
        setBooleanField(term25872, term25872.getClass(), "enable", true);
        setField(term25872, term25872.getClass(), "name", "xxx");
        setField(term25872, term25872.getClass(), "kind", enum51);
        setField(term25872, term25872.getClass(), "difficulty", enum52);
        setField(term25872, term25872.getClass(), "pvList", "ALL");
        setField(term25872, term25872.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term25872, term25872.getClass(), "addVP", term25948);
        setField(term25872, term25872.getClass(), "vpMultiplier", term25950);
        setIntField(term25953, term25953.getClass(), "year", 2005);
        setShortField(term25953, term25953.getClass(), "month", (short) 1);
        setShortField(term25953, term25953.getClass(), "day", (short) 1);
        setField(term25952, term25952.getClass(), "date", term25953);
        setByteField(term25957, term25957.getClass(), "hour", (byte) 0);
        setByteField(term25957, term25957.getClass(), "minute", (byte) 0);
        setByteField(term25957, term25957.getClass(), "second", (byte) 0);
        setIntField(term25957, term25957.getClass(), "nano", 0);
        setField(term25952, term25952.getClass(), "time", term25957);
        setField(term25872, term25872.getClass(), "start", term25952);
        setIntField(term25963, term25963.getClass(), "year", 2005);
        setShortField(term25963, term25963.getClass(), "month", (short) 1);
        setShortField(term25963, term25963.getClass(), "day", (short) 1);
        setField(term25962, term25962.getClass(), "date", term25963);
        setField(term25962, term25962.getClass(), "time", term25957);
        setField(term25872, term25872.getClass(), "end", term25962);
        setIntField(term25968, term25968.getClass(), "year", 2005);
        setShortField(term25968, term25968.getClass(), "month", (short) 1);
        setShortField(term25968, term25968.getClass(), "day", (short) 1);
        setField(term25967, term25967.getClass(), "date", term25968);
        setField(term25967, term25967.getClass(), "time", term25957);
        setField(term25872, term25872.getClass(), "createDate", term25967);
        term25972 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25972;
        callMethod(klass, "canEqual", argTypes, term25872, args);
    }

};


