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

public class Festa_toString_27962183127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27281;

    public Festa_toString_27962183127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27385 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term27384 = ((Class) term27385).getDeclaredField((String) "PINK_FESTA");
        ((Field) term27384).setAccessible(true);
        Object enum55 = ((Field) term27384).get((Object) null);
        Class<? extends Object> term27667 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term27666 = ((Class) term27667).getDeclaredField((String) "UNDEFINED");
        ((Field) term27666).setAccessible(true);
        Object enum56 = ((Field) term27666).get((Object) null);
        Integer term27357 = new Integer(0);
        Integer term27359 = new Integer(1);
        term27281 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term27361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27366 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27376 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27377 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term27281, term27281.getClass(), "id", -1);
        setBooleanField(term27281, term27281.getClass(), "enable", true);
        setField(term27281, term27281.getClass(), "name", "xxx");
        setField(term27281, term27281.getClass(), "kind", enum55);
        setField(term27281, term27281.getClass(), "difficulty", enum56);
        setField(term27281, term27281.getClass(), "pvList", "ALL");
        setField(term27281, term27281.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term27281, term27281.getClass(), "addVP", term27357);
        setField(term27281, term27281.getClass(), "vpMultiplier", term27359);
        setIntField(term27362, term27362.getClass(), "year", 2005);
        setShortField(term27362, term27362.getClass(), "month", (short) 1);
        setShortField(term27362, term27362.getClass(), "day", (short) 1);
        setField(term27361, term27361.getClass(), "date", term27362);
        setByteField(term27366, term27366.getClass(), "hour", (byte) 0);
        setByteField(term27366, term27366.getClass(), "minute", (byte) 0);
        setByteField(term27366, term27366.getClass(), "second", (byte) 0);
        setIntField(term27366, term27366.getClass(), "nano", 0);
        setField(term27361, term27361.getClass(), "time", term27366);
        setField(term27281, term27281.getClass(), "start", term27361);
        setIntField(term27372, term27372.getClass(), "year", 2005);
        setShortField(term27372, term27372.getClass(), "month", (short) 1);
        setShortField(term27372, term27372.getClass(), "day", (short) 1);
        setField(term27371, term27371.getClass(), "date", term27372);
        setField(term27371, term27371.getClass(), "time", term27366);
        setField(term27281, term27281.getClass(), "end", term27371);
        setIntField(term27377, term27377.getClass(), "year", 2005);
        setShortField(term27377, term27377.getClass(), "month", (short) 1);
        setShortField(term27377, term27377.getClass(), "day", (short) 1);
        setField(term27376, term27376.getClass(), "date", term27377);
        setField(term27376, term27376.getClass(), "time", term27366);
        setField(term27281, term27281.getClass(), "createDate", term27376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27281, args);
    }

};


