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

public class Festa_setKind_58942832615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18467;
     Object enum30;

    public Festa_setKind_58942832615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18571 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term18570 = ((Class) term18571).getDeclaredField((String) "PINK_FESTA");
        ((Field) term18570).setAccessible(true);
        enum30 = ((Field) term18570).get((Object) null);
        Class<? extends Object> term18853 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term18852 = ((Class) term18853).getDeclaredField((String) "UNDEFINED");
        ((Field) term18852).setAccessible(true);
        Object enum31 = ((Field) term18852).get((Object) null);
        Integer term18543 = new Integer(0);
        Integer term18545 = new Integer(1);
        term18467 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term18547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18552 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18563 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term18467, term18467.getClass(), "id", -1);
        setBooleanField(term18467, term18467.getClass(), "enable", true);
        setField(term18467, term18467.getClass(), "name", "xxx");
        setField(term18467, term18467.getClass(), "kind", enum30);
        setField(term18467, term18467.getClass(), "difficulty", enum31);
        setField(term18467, term18467.getClass(), "pvList", "ALL");
        setField(term18467, term18467.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term18467, term18467.getClass(), "addVP", term18543);
        setField(term18467, term18467.getClass(), "vpMultiplier", term18545);
        setIntField(term18548, term18548.getClass(), "year", 2005);
        setShortField(term18548, term18548.getClass(), "month", (short) 1);
        setShortField(term18548, term18548.getClass(), "day", (short) 1);
        setField(term18547, term18547.getClass(), "date", term18548);
        setByteField(term18552, term18552.getClass(), "hour", (byte) 0);
        setByteField(term18552, term18552.getClass(), "minute", (byte) 0);
        setByteField(term18552, term18552.getClass(), "second", (byte) 0);
        setIntField(term18552, term18552.getClass(), "nano", 0);
        setField(term18547, term18547.getClass(), "time", term18552);
        setField(term18467, term18467.getClass(), "start", term18547);
        setIntField(term18558, term18558.getClass(), "year", 2005);
        setShortField(term18558, term18558.getClass(), "month", (short) 1);
        setShortField(term18558, term18558.getClass(), "day", (short) 1);
        setField(term18557, term18557.getClass(), "date", term18558);
        setField(term18557, term18557.getClass(), "time", term18552);
        setField(term18467, term18467.getClass(), "end", term18557);
        setIntField(term18563, term18563.getClass(), "year", 2005);
        setShortField(term18563, term18563.getClass(), "month", (short) 1);
        setShortField(term18563, term18563.getClass(), "day", (short) 1);
        setField(term18562, term18562.getClass(), "date", term18563);
        setField(term18562, term18562.getClass(), "time", term18552);
        setField(term18467, term18467.getClass(), "createDate", term18562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Object[] args = new Object[1];
        args[0] = enum30;
        callMethod(klass, "setKind", argTypes, term18467, args);
    }

};


