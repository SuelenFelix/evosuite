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

public class Festa_setDifficulty_83862730116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19171;
     Object enum34;

    public Festa_setDifficulty_83862730116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19286 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term19285 = ((Class) term19286).getDeclaredField((String) "PINK_FESTA");
        ((Field) term19285).setAccessible(true);
        Object enum32 = ((Field) term19285).get((Object) null);
        Class<? extends Object> term19568 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term19567 = ((Class) term19568).getDeclaredField((String) "UNDEFINED");
        ((Field) term19567).setAccessible(true);
        Object enum33 = ((Field) term19567).get((Object) null);
        Integer term19247 = new Integer(0);
        Integer term19249 = new Integer(1);
        term19171 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term19251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19267 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term19171, term19171.getClass(), "id", -1);
        setBooleanField(term19171, term19171.getClass(), "enable", true);
        setField(term19171, term19171.getClass(), "name", "xxx");
        setField(term19171, term19171.getClass(), "kind", enum32);
        setField(term19171, term19171.getClass(), "difficulty", enum33);
        setField(term19171, term19171.getClass(), "pvList", "ALL");
        setField(term19171, term19171.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term19171, term19171.getClass(), "addVP", term19247);
        setField(term19171, term19171.getClass(), "vpMultiplier", term19249);
        setIntField(term19252, term19252.getClass(), "year", 2005);
        setShortField(term19252, term19252.getClass(), "month", (short) 1);
        setShortField(term19252, term19252.getClass(), "day", (short) 1);
        setField(term19251, term19251.getClass(), "date", term19252);
        setByteField(term19256, term19256.getClass(), "hour", (byte) 0);
        setByteField(term19256, term19256.getClass(), "minute", (byte) 0);
        setByteField(term19256, term19256.getClass(), "second", (byte) 0);
        setIntField(term19256, term19256.getClass(), "nano", 0);
        setField(term19251, term19251.getClass(), "time", term19256);
        setField(term19171, term19171.getClass(), "start", term19251);
        setIntField(term19262, term19262.getClass(), "year", 2005);
        setShortField(term19262, term19262.getClass(), "month", (short) 1);
        setShortField(term19262, term19262.getClass(), "day", (short) 1);
        setField(term19261, term19261.getClass(), "date", term19262);
        setField(term19261, term19261.getClass(), "time", term19256);
        setField(term19171, term19171.getClass(), "end", term19261);
        setIntField(term19267, term19267.getClass(), "year", 2005);
        setShortField(term19267, term19267.getClass(), "month", (short) 1);
        setShortField(term19267, term19267.getClass(), "day", (short) 1);
        setField(term19266, term19266.getClass(), "date", term19267);
        setField(term19266, term19266.getClass(), "time", term19256);
        setField(term19171, term19171.getClass(), "createDate", term19266);
        Class<? extends Object> term19887 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term19886 = ((Class) term19887).getDeclaredField((String) "NORMAL");
        ((Field) term19886).setAccessible(true);
        enum34 = ((Field) term19886).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[1];
        args[0] = enum34;
        callMethod(klass, "setDifficulty", argTypes, term19171, args);
    }

};


