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

public class Festa_hashCode_23113785926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26577;

    public Festa_hashCode_23113785926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26681 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term26680 = ((Class) term26681).getDeclaredField((String) "PINK_FESTA");
        ((Field) term26680).setAccessible(true);
        Object enum53 = ((Field) term26680).get((Object) null);
        Class<? extends Object> term26963 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term26962 = ((Class) term26963).getDeclaredField((String) "UNDEFINED");
        ((Field) term26962).setAccessible(true);
        Object enum54 = ((Field) term26962).get((Object) null);
        Integer term26653 = new Integer(0);
        Integer term26655 = new Integer(1);
        term26577 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term26657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26662 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26673 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term26577, term26577.getClass(), "id", -1);
        setBooleanField(term26577, term26577.getClass(), "enable", true);
        setField(term26577, term26577.getClass(), "name", "xxx");
        setField(term26577, term26577.getClass(), "kind", enum53);
        setField(term26577, term26577.getClass(), "difficulty", enum54);
        setField(term26577, term26577.getClass(), "pvList", "ALL");
        setField(term26577, term26577.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term26577, term26577.getClass(), "addVP", term26653);
        setField(term26577, term26577.getClass(), "vpMultiplier", term26655);
        setIntField(term26658, term26658.getClass(), "year", 2005);
        setShortField(term26658, term26658.getClass(), "month", (short) 1);
        setShortField(term26658, term26658.getClass(), "day", (short) 1);
        setField(term26657, term26657.getClass(), "date", term26658);
        setByteField(term26662, term26662.getClass(), "hour", (byte) 0);
        setByteField(term26662, term26662.getClass(), "minute", (byte) 0);
        setByteField(term26662, term26662.getClass(), "second", (byte) 0);
        setIntField(term26662, term26662.getClass(), "nano", 0);
        setField(term26657, term26657.getClass(), "time", term26662);
        setField(term26577, term26577.getClass(), "start", term26657);
        setIntField(term26668, term26668.getClass(), "year", 2005);
        setShortField(term26668, term26668.getClass(), "month", (short) 1);
        setShortField(term26668, term26668.getClass(), "day", (short) 1);
        setField(term26667, term26667.getClass(), "date", term26668);
        setField(term26667, term26667.getClass(), "time", term26662);
        setField(term26577, term26577.getClass(), "end", term26667);
        setIntField(term26673, term26673.getClass(), "year", 2005);
        setShortField(term26673, term26673.getClass(), "month", (short) 1);
        setShortField(term26673, term26673.getClass(), "day", (short) 1);
        setField(term26672, term26672.getClass(), "date", term26673);
        setField(term26672, term26672.getClass(), "time", term26662);
        setField(term26577, term26577.getClass(), "createDate", term26672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term26577, args);
    }

};


