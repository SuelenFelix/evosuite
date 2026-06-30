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

public class Festa_getName_14113795702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9289;

    public Festa_getName_14113795702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9393 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term9392 = ((Class) term9393).getDeclaredField((String) "PINK_FESTA");
        ((Field) term9392).setAccessible(true);
        Object enum4 = ((Field) term9392).get((Object) null);
        Class<? extends Object> term9675 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term9674 = ((Class) term9675).getDeclaredField((String) "UNDEFINED");
        ((Field) term9674).setAccessible(true);
        Object enum5 = ((Field) term9674).get((Object) null);
        Integer term9365 = new Integer(0);
        Integer term9367 = new Integer(1);
        term9289 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term9369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9374 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9385 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term9289, term9289.getClass(), "id", -1);
        setBooleanField(term9289, term9289.getClass(), "enable", true);
        setField(term9289, term9289.getClass(), "name", "xxx");
        setField(term9289, term9289.getClass(), "kind", enum4);
        setField(term9289, term9289.getClass(), "difficulty", enum5);
        setField(term9289, term9289.getClass(), "pvList", "ALL");
        setField(term9289, term9289.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term9289, term9289.getClass(), "addVP", term9365);
        setField(term9289, term9289.getClass(), "vpMultiplier", term9367);
        setIntField(term9370, term9370.getClass(), "year", 2005);
        setShortField(term9370, term9370.getClass(), "month", (short) 1);
        setShortField(term9370, term9370.getClass(), "day", (short) 1);
        setField(term9369, term9369.getClass(), "date", term9370);
        setByteField(term9374, term9374.getClass(), "hour", (byte) 0);
        setByteField(term9374, term9374.getClass(), "minute", (byte) 0);
        setByteField(term9374, term9374.getClass(), "second", (byte) 0);
        setIntField(term9374, term9374.getClass(), "nano", 0);
        setField(term9369, term9369.getClass(), "time", term9374);
        setField(term9289, term9289.getClass(), "start", term9369);
        setIntField(term9380, term9380.getClass(), "year", 2005);
        setShortField(term9380, term9380.getClass(), "month", (short) 1);
        setShortField(term9380, term9380.getClass(), "day", (short) 1);
        setField(term9379, term9379.getClass(), "date", term9380);
        setField(term9379, term9379.getClass(), "time", term9374);
        setField(term9289, term9289.getClass(), "end", term9379);
        setIntField(term9385, term9385.getClass(), "year", 2005);
        setShortField(term9385, term9385.getClass(), "month", (short) 1);
        setShortField(term9385, term9385.getClass(), "day", (short) 1);
        setField(term9384, term9384.getClass(), "date", term9385);
        setField(term9384, term9384.getClass(), "time", term9374);
        setField(term9289, term9289.getClass(), "createDate", term9384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term9289, args);
    }

};


