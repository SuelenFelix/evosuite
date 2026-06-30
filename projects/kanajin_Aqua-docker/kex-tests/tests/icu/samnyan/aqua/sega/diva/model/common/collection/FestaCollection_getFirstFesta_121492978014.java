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

public class FestaCollection_getFirstFesta_121492978014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11275;

    public FestaCollection_getFirstFesta_121492978014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11446 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term11445 = ((Class) term11446).getDeclaredField((String) "PINK_FESTA");
        ((Field) term11445).setAccessible(true);
        Object enum28 = ((Field) term11445).get((Object) null);
        Class<? extends Object> term11728 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term11727 = ((Class) term11728).getDeclaredField((String) "UNDEFINED");
        ((Field) term11727).setAccessible(true);
        Object enum29 = ((Field) term11727).get((Object) null);
        Integer term11352 = new Integer(0);
        Integer term11354 = new Integer(1);
        Integer term11423 = new Integer(0);
        Integer term11425 = new Integer(1);
        term11275 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term11276 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term11356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11376 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term11427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11438 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term11276, term11276.getClass(), "id", -1);
        setBooleanField(term11276, term11276.getClass(), "enable", true);
        setField(term11276, term11276.getClass(), "name", "xxx");
        setField(term11276, term11276.getClass(), "kind", enum28);
        setField(term11276, term11276.getClass(), "difficulty", enum29);
        setField(term11276, term11276.getClass(), "pvList", "ALL");
        setField(term11276, term11276.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term11276, term11276.getClass(), "addVP", term11352);
        setField(term11276, term11276.getClass(), "vpMultiplier", term11354);
        setIntField(term11357, term11357.getClass(), "year", 2005);
        setShortField(term11357, term11357.getClass(), "month", (short) 1);
        setShortField(term11357, term11357.getClass(), "day", (short) 1);
        setField(term11356, term11356.getClass(), "date", term11357);
        setByteField(term11361, term11361.getClass(), "hour", (byte) 0);
        setByteField(term11361, term11361.getClass(), "minute", (byte) 0);
        setByteField(term11361, term11361.getClass(), "second", (byte) 0);
        setIntField(term11361, term11361.getClass(), "nano", 0);
        setField(term11356, term11356.getClass(), "time", term11361);
        setField(term11276, term11276.getClass(), "start", term11356);
        setIntField(term11367, term11367.getClass(), "year", 2005);
        setShortField(term11367, term11367.getClass(), "month", (short) 1);
        setShortField(term11367, term11367.getClass(), "day", (short) 1);
        setField(term11366, term11366.getClass(), "date", term11367);
        setField(term11366, term11366.getClass(), "time", term11361);
        setField(term11276, term11276.getClass(), "end", term11366);
        setIntField(term11372, term11372.getClass(), "year", 2005);
        setShortField(term11372, term11372.getClass(), "month", (short) 1);
        setShortField(term11372, term11372.getClass(), "day", (short) 1);
        setField(term11371, term11371.getClass(), "date", term11372);
        setField(term11371, term11371.getClass(), "time", term11361);
        setField(term11276, term11276.getClass(), "createDate", term11371);
        setField(term11275, term11275.getClass(), "firstFesta", term11276);
        setIntField(term11376, term11376.getClass(), "id", -1);
        setBooleanField(term11376, term11376.getClass(), "enable", true);
        setField(term11376, term11376.getClass(), "name", "xxx");
        setField(term11376, term11376.getClass(), "kind", enum28);
        setField(term11376, term11376.getClass(), "difficulty", enum29);
        setField(term11376, term11376.getClass(), "pvList", "ALL");
        setField(term11376, term11376.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term11376, term11376.getClass(), "addVP", term11423);
        setField(term11376, term11376.getClass(), "vpMultiplier", term11425);
        setIntField(term11428, term11428.getClass(), "year", 2005);
        setShortField(term11428, term11428.getClass(), "month", (short) 1);
        setShortField(term11428, term11428.getClass(), "day", (short) 1);
        setField(term11427, term11427.getClass(), "date", term11428);
        setField(term11427, term11427.getClass(), "time", term11361);
        setField(term11376, term11376.getClass(), "start", term11427);
        setIntField(term11433, term11433.getClass(), "year", 2005);
        setShortField(term11433, term11433.getClass(), "month", (short) 1);
        setShortField(term11433, term11433.getClass(), "day", (short) 1);
        setField(term11432, term11432.getClass(), "date", term11433);
        setField(term11432, term11432.getClass(), "time", term11361);
        setField(term11376, term11376.getClass(), "end", term11432);
        setIntField(term11438, term11438.getClass(), "year", 2005);
        setShortField(term11438, term11438.getClass(), "month", (short) 1);
        setShortField(term11438, term11438.getClass(), "day", (short) 1);
        setField(term11437, term11437.getClass(), "date", term11438);
        setField(term11437, term11437.getClass(), "time", term11361);
        setField(term11376, term11376.getClass(), "createDate", term11437);
        setField(term11275, term11275.getClass(), "secondFesta", term11376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstFesta", argTypes, term11275, args);
    }

};


