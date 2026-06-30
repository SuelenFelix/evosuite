package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class FestaCollection_getIds_14376507233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2376;

    public FestaCollection_getIds_14376507233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2547 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term2546 = ((Class) term2547).getDeclaredField((String) "PINK_FESTA");
        ((Field) term2546).setAccessible(true);
        Object enum6 = ((Field) term2546).get((Object) null);
        Class<? extends Object> term2829 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term2828 = ((Class) term2829).getDeclaredField((String) "UNDEFINED");
        ((Field) term2828).setAccessible(true);
        Object enum7 = ((Field) term2828).get((Object) null);
        Integer term2453 = new Integer(0);
        Integer term2455 = new Integer(1);
        Integer term2524 = new Integer(0);
        Integer term2526 = new Integer(1);
        term2376 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term2377 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term2457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2477 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term2528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2539 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2377, term2377.getClass(), "id", -1);
        setBooleanField(term2377, term2377.getClass(), "enable", true);
        setField(term2377, term2377.getClass(), "name", "xxx");
        setField(term2377, term2377.getClass(), "kind", enum6);
        setField(term2377, term2377.getClass(), "difficulty", enum7);
        setField(term2377, term2377.getClass(), "pvList", "ALL");
        setField(term2377, term2377.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term2377, term2377.getClass(), "addVP", term2453);
        setField(term2377, term2377.getClass(), "vpMultiplier", term2455);
        setIntField(term2458, term2458.getClass(), "year", 2005);
        setShortField(term2458, term2458.getClass(), "month", (short) 1);
        setShortField(term2458, term2458.getClass(), "day", (short) 1);
        setField(term2457, term2457.getClass(), "date", term2458);
        setByteField(term2462, term2462.getClass(), "hour", (byte) 0);
        setByteField(term2462, term2462.getClass(), "minute", (byte) 0);
        setByteField(term2462, term2462.getClass(), "second", (byte) 0);
        setIntField(term2462, term2462.getClass(), "nano", 0);
        setField(term2457, term2457.getClass(), "time", term2462);
        setField(term2377, term2377.getClass(), "start", term2457);
        setIntField(term2468, term2468.getClass(), "year", 2005);
        setShortField(term2468, term2468.getClass(), "month", (short) 1);
        setShortField(term2468, term2468.getClass(), "day", (short) 1);
        setField(term2467, term2467.getClass(), "date", term2468);
        setField(term2467, term2467.getClass(), "time", term2462);
        setField(term2377, term2377.getClass(), "end", term2467);
        setIntField(term2473, term2473.getClass(), "year", 2005);
        setShortField(term2473, term2473.getClass(), "month", (short) 1);
        setShortField(term2473, term2473.getClass(), "day", (short) 1);
        setField(term2472, term2472.getClass(), "date", term2473);
        setField(term2472, term2472.getClass(), "time", term2462);
        setField(term2377, term2377.getClass(), "createDate", term2472);
        setField(term2376, term2376.getClass(), "firstFesta", term2377);
        setIntField(term2477, term2477.getClass(), "id", -1);
        setBooleanField(term2477, term2477.getClass(), "enable", true);
        setField(term2477, term2477.getClass(), "name", "xxx");
        setField(term2477, term2477.getClass(), "kind", enum6);
        setField(term2477, term2477.getClass(), "difficulty", enum7);
        setField(term2477, term2477.getClass(), "pvList", "ALL");
        setField(term2477, term2477.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term2477, term2477.getClass(), "addVP", term2524);
        setField(term2477, term2477.getClass(), "vpMultiplier", term2526);
        setIntField(term2529, term2529.getClass(), "year", 2005);
        setShortField(term2529, term2529.getClass(), "month", (short) 1);
        setShortField(term2529, term2529.getClass(), "day", (short) 1);
        setField(term2528, term2528.getClass(), "date", term2529);
        setField(term2528, term2528.getClass(), "time", term2462);
        setField(term2477, term2477.getClass(), "start", term2528);
        setIntField(term2534, term2534.getClass(), "year", 2005);
        setShortField(term2534, term2534.getClass(), "month", (short) 1);
        setShortField(term2534, term2534.getClass(), "day", (short) 1);
        setField(term2533, term2533.getClass(), "date", term2534);
        setField(term2533, term2533.getClass(), "time", term2462);
        setField(term2477, term2477.getClass(), "end", term2533);
        setIntField(term2539, term2539.getClass(), "year", 2005);
        setShortField(term2539, term2539.getClass(), "month", (short) 1);
        setShortField(term2539, term2539.getClass(), "day", (short) 1);
        setField(term2538, term2538.getClass(), "date", term2539);
        setField(term2538, term2538.getClass(), "time", term2462);
        setField(term2477, term2477.getClass(), "createDate", term2538);
        setField(term2376, term2376.getClass(), "secondFesta", term2477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIds", argTypes, term2376, args);
    }

};


