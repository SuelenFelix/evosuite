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

public class FestaCollection_getNames_6347072194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3185;

    public FestaCollection_getNames_6347072194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3356 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term3355 = ((Class) term3356).getDeclaredField((String) "PINK_FESTA");
        ((Field) term3355).setAccessible(true);
        Object enum8 = ((Field) term3355).get((Object) null);
        Class<? extends Object> term3638 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term3637 = ((Class) term3638).getDeclaredField((String) "UNDEFINED");
        ((Field) term3637).setAccessible(true);
        Object enum9 = ((Field) term3637).get((Object) null);
        Integer term3262 = new Integer(0);
        Integer term3264 = new Integer(1);
        Integer term3333 = new Integer(0);
        Integer term3335 = new Integer(1);
        term3185 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term3186 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term3266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3271 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3286 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term3337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3348 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3186, term3186.getClass(), "id", -1);
        setBooleanField(term3186, term3186.getClass(), "enable", true);
        setField(term3186, term3186.getClass(), "name", "xxx");
        setField(term3186, term3186.getClass(), "kind", enum8);
        setField(term3186, term3186.getClass(), "difficulty", enum9);
        setField(term3186, term3186.getClass(), "pvList", "ALL");
        setField(term3186, term3186.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term3186, term3186.getClass(), "addVP", term3262);
        setField(term3186, term3186.getClass(), "vpMultiplier", term3264);
        setIntField(term3267, term3267.getClass(), "year", 2005);
        setShortField(term3267, term3267.getClass(), "month", (short) 1);
        setShortField(term3267, term3267.getClass(), "day", (short) 1);
        setField(term3266, term3266.getClass(), "date", term3267);
        setByteField(term3271, term3271.getClass(), "hour", (byte) 0);
        setByteField(term3271, term3271.getClass(), "minute", (byte) 0);
        setByteField(term3271, term3271.getClass(), "second", (byte) 0);
        setIntField(term3271, term3271.getClass(), "nano", 0);
        setField(term3266, term3266.getClass(), "time", term3271);
        setField(term3186, term3186.getClass(), "start", term3266);
        setIntField(term3277, term3277.getClass(), "year", 2005);
        setShortField(term3277, term3277.getClass(), "month", (short) 1);
        setShortField(term3277, term3277.getClass(), "day", (short) 1);
        setField(term3276, term3276.getClass(), "date", term3277);
        setField(term3276, term3276.getClass(), "time", term3271);
        setField(term3186, term3186.getClass(), "end", term3276);
        setIntField(term3282, term3282.getClass(), "year", 2005);
        setShortField(term3282, term3282.getClass(), "month", (short) 1);
        setShortField(term3282, term3282.getClass(), "day", (short) 1);
        setField(term3281, term3281.getClass(), "date", term3282);
        setField(term3281, term3281.getClass(), "time", term3271);
        setField(term3186, term3186.getClass(), "createDate", term3281);
        setField(term3185, term3185.getClass(), "firstFesta", term3186);
        setIntField(term3286, term3286.getClass(), "id", -1);
        setBooleanField(term3286, term3286.getClass(), "enable", true);
        setField(term3286, term3286.getClass(), "name", "xxx");
        setField(term3286, term3286.getClass(), "kind", enum8);
        setField(term3286, term3286.getClass(), "difficulty", enum9);
        setField(term3286, term3286.getClass(), "pvList", "ALL");
        setField(term3286, term3286.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term3286, term3286.getClass(), "addVP", term3333);
        setField(term3286, term3286.getClass(), "vpMultiplier", term3335);
        setIntField(term3338, term3338.getClass(), "year", 2005);
        setShortField(term3338, term3338.getClass(), "month", (short) 1);
        setShortField(term3338, term3338.getClass(), "day", (short) 1);
        setField(term3337, term3337.getClass(), "date", term3338);
        setField(term3337, term3337.getClass(), "time", term3271);
        setField(term3286, term3286.getClass(), "start", term3337);
        setIntField(term3343, term3343.getClass(), "year", 2005);
        setShortField(term3343, term3343.getClass(), "month", (short) 1);
        setShortField(term3343, term3343.getClass(), "day", (short) 1);
        setField(term3342, term3342.getClass(), "date", term3343);
        setField(term3342, term3342.getClass(), "time", term3271);
        setField(term3286, term3286.getClass(), "end", term3342);
        setIntField(term3348, term3348.getClass(), "year", 2005);
        setShortField(term3348, term3348.getClass(), "month", (short) 1);
        setShortField(term3348, term3348.getClass(), "day", (short) 1);
        setField(term3347, term3347.getClass(), "date", term3348);
        setField(term3347, term3347.getClass(), "time", term3271);
        setField(term3286, term3286.getClass(), "createDate", term3347);
        setField(term3185, term3185.getClass(), "secondFesta", term3286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term3185, args);
    }

};


