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

public class Festa_getVpMultiplier_15256422118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13513;

    public Festa_getVpMultiplier_15256422118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13617 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term13616 = ((Class) term13617).getDeclaredField((String) "PINK_FESTA");
        ((Field) term13616).setAccessible(true);
        Object enum16 = ((Field) term13616).get((Object) null);
        Class<? extends Object> term13899 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term13898 = ((Class) term13899).getDeclaredField((String) "UNDEFINED");
        ((Field) term13898).setAccessible(true);
        Object enum17 = ((Field) term13898).get((Object) null);
        Integer term13589 = new Integer(0);
        Integer term13591 = new Integer(1);
        term13513 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term13593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13598 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13609 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term13513, term13513.getClass(), "id", -1);
        setBooleanField(term13513, term13513.getClass(), "enable", true);
        setField(term13513, term13513.getClass(), "name", "xxx");
        setField(term13513, term13513.getClass(), "kind", enum16);
        setField(term13513, term13513.getClass(), "difficulty", enum17);
        setField(term13513, term13513.getClass(), "pvList", "ALL");
        setField(term13513, term13513.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term13513, term13513.getClass(), "addVP", term13589);
        setField(term13513, term13513.getClass(), "vpMultiplier", term13591);
        setIntField(term13594, term13594.getClass(), "year", 2005);
        setShortField(term13594, term13594.getClass(), "month", (short) 1);
        setShortField(term13594, term13594.getClass(), "day", (short) 1);
        setField(term13593, term13593.getClass(), "date", term13594);
        setByteField(term13598, term13598.getClass(), "hour", (byte) 0);
        setByteField(term13598, term13598.getClass(), "minute", (byte) 0);
        setByteField(term13598, term13598.getClass(), "second", (byte) 0);
        setIntField(term13598, term13598.getClass(), "nano", 0);
        setField(term13593, term13593.getClass(), "time", term13598);
        setField(term13513, term13513.getClass(), "start", term13593);
        setIntField(term13604, term13604.getClass(), "year", 2005);
        setShortField(term13604, term13604.getClass(), "month", (short) 1);
        setShortField(term13604, term13604.getClass(), "day", (short) 1);
        setField(term13603, term13603.getClass(), "date", term13604);
        setField(term13603, term13603.getClass(), "time", term13598);
        setField(term13513, term13513.getClass(), "end", term13603);
        setIntField(term13609, term13609.getClass(), "year", 2005);
        setShortField(term13609, term13609.getClass(), "month", (short) 1);
        setShortField(term13609, term13609.getClass(), "day", (short) 1);
        setField(term13608, term13608.getClass(), "date", term13609);
        setField(term13608, term13608.getClass(), "time", term13598);
        setField(term13513, term13513.getClass(), "createDate", term13608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVpMultiplier", argTypes, term13513, args);
    }

};


