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

public class Festa_setId_201684063512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16329;
     Object term16429;

    public Festa_setId_201684063512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16435 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term16434 = ((Class) term16435).getDeclaredField((String) "PINK_FESTA");
        ((Field) term16434).setAccessible(true);
        Object enum24 = ((Field) term16434).get((Object) null);
        Class<? extends Object> term16717 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term16716 = ((Class) term16717).getDeclaredField((String) "UNDEFINED");
        ((Field) term16716).setAccessible(true);
        Object enum25 = ((Field) term16716).get((Object) null);
        Integer term16405 = new Integer(0);
        Integer term16407 = new Integer(1);
        term16329 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term16409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16414 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16425 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term16329, term16329.getClass(), "id", -1);
        setBooleanField(term16329, term16329.getClass(), "enable", true);
        setField(term16329, term16329.getClass(), "name", "xxx");
        setField(term16329, term16329.getClass(), "kind", enum24);
        setField(term16329, term16329.getClass(), "difficulty", enum25);
        setField(term16329, term16329.getClass(), "pvList", "ALL");
        setField(term16329, term16329.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term16329, term16329.getClass(), "addVP", term16405);
        setField(term16329, term16329.getClass(), "vpMultiplier", term16407);
        setIntField(term16410, term16410.getClass(), "year", 2005);
        setShortField(term16410, term16410.getClass(), "month", (short) 1);
        setShortField(term16410, term16410.getClass(), "day", (short) 1);
        setField(term16409, term16409.getClass(), "date", term16410);
        setByteField(term16414, term16414.getClass(), "hour", (byte) 0);
        setByteField(term16414, term16414.getClass(), "minute", (byte) 0);
        setByteField(term16414, term16414.getClass(), "second", (byte) 0);
        setIntField(term16414, term16414.getClass(), "nano", 0);
        setField(term16409, term16409.getClass(), "time", term16414);
        setField(term16329, term16329.getClass(), "start", term16409);
        setIntField(term16420, term16420.getClass(), "year", 2005);
        setShortField(term16420, term16420.getClass(), "month", (short) 1);
        setShortField(term16420, term16420.getClass(), "day", (short) 1);
        setField(term16419, term16419.getClass(), "date", term16420);
        setField(term16419, term16419.getClass(), "time", term16414);
        setField(term16329, term16329.getClass(), "end", term16419);
        setIntField(term16425, term16425.getClass(), "year", 2005);
        setShortField(term16425, term16425.getClass(), "month", (short) 1);
        setShortField(term16425, term16425.getClass(), "day", (short) 1);
        setField(term16424, term16424.getClass(), "date", term16425);
        setField(term16424, term16424.getClass(), "time", term16414);
        setField(term16329, term16329.getClass(), "createDate", term16424);
        term16429 = new Integer(1692937831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16429;
        callMethod(klass, "setId", argTypes, term16329, args);
    }

};


