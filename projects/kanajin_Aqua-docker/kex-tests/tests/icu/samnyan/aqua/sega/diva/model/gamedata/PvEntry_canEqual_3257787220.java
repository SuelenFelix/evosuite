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

public class PvEntry_canEqual_3257787220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88269;
     Object term88332;

    public PvEntry_canEqual_3257787220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88334 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term88333 = ((Class) term88334).getDeclaredField((String) "EASY");
        ((Field) term88333).setAccessible(true);
        Object enum201 = ((Field) term88333).get((Object) null);
        Class<? extends Object> term88603 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term88602 = ((Class) term88603).getDeclaredField((String) "EXTRA");
        ((Field) term88602).setAccessible(true);
        Object enum202 = ((Field) term88602).get((Object) null);
        term88269 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term88292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term88322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term88327 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term88269, term88269.getClass(), "id", 7017605765544766728L);
        setIntField(term88269, term88269.getClass(), "pvId", -1870339027);
        setField(term88269, term88269.getClass(), "difficulty", enum201);
        setIntField(term88269, term88269.getClass(), "version", -1549603566);
        setField(term88269, term88269.getClass(), "edition", enum202);
        setIntField(term88293, term88293.getClass(), "year", 2012);
        setShortField(term88293, term88293.getClass(), "month", (short) 2);
        setShortField(term88293, term88293.getClass(), "day", (short) 18);
        setField(term88292, term88292.getClass(), "date", term88293);
        setByteField(term88297, term88297.getClass(), "hour", (byte) 4);
        setByteField(term88297, term88297.getClass(), "minute", (byte) 27);
        setByteField(term88297, term88297.getClass(), "second", (byte) 19);
        setIntField(term88297, term88297.getClass(), "nano", 948215601);
        setField(term88292, term88292.getClass(), "time", term88297);
        setField(term88269, term88269.getClass(), "demoStart", term88292);
        setIntField(term88303, term88303.getClass(), "year", 2029);
        setShortField(term88303, term88303.getClass(), "month", (short) 11);
        setShortField(term88303, term88303.getClass(), "day", (short) 23);
        setField(term88302, term88302.getClass(), "date", term88303);
        setByteField(term88307, term88307.getClass(), "hour", (byte) 18);
        setByteField(term88307, term88307.getClass(), "minute", (byte) 47);
        setByteField(term88307, term88307.getClass(), "second", (byte) 36);
        setIntField(term88307, term88307.getClass(), "nano", 43248731);
        setField(term88302, term88302.getClass(), "time", term88307);
        setField(term88269, term88269.getClass(), "demoEnd", term88302);
        setIntField(term88313, term88313.getClass(), "year", 2015);
        setShortField(term88313, term88313.getClass(), "month", (short) 4);
        setShortField(term88313, term88313.getClass(), "day", (short) 22);
        setField(term88312, term88312.getClass(), "date", term88313);
        setByteField(term88317, term88317.getClass(), "hour", (byte) 15);
        setByteField(term88317, term88317.getClass(), "minute", (byte) 23);
        setByteField(term88317, term88317.getClass(), "second", (byte) 42);
        setIntField(term88317, term88317.getClass(), "nano", 822658620);
        setField(term88312, term88312.getClass(), "time", term88317);
        setField(term88269, term88269.getClass(), "playableStart", term88312);
        setIntField(term88323, term88323.getClass(), "year", 2020);
        setShortField(term88323, term88323.getClass(), "month", (short) 4);
        setShortField(term88323, term88323.getClass(), "day", (short) 27);
        setField(term88322, term88322.getClass(), "date", term88323);
        setByteField(term88327, term88327.getClass(), "hour", (byte) 16);
        setByteField(term88327, term88327.getClass(), "minute", (byte) 48);
        setByteField(term88327, term88327.getClass(), "second", (byte) 39);
        setIntField(term88327, term88327.getClass(), "nano", 250909266);
        setField(term88322, term88322.getClass(), "time", term88327);
        setField(term88269, term88269.getClass(), "playableEnd", term88322);
        term88332 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term88332;
        callMethod(klass, "canEqual", argTypes, term88269, args);
    }

};


