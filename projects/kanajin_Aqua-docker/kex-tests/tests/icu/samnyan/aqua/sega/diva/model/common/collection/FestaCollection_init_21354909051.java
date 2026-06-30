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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class FestaCollection_init_21354909051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895;

    public FestaCollection_init_21354909051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term999 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term998 = ((Class) term999).getDeclaredField((String) "PINK_FESTA");
        ((Field) term998).setAccessible(true);
        Object enum2 = ((Field) term998).get((Object) null);
        Class<? extends Object> term1281 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term1280 = ((Class) term1281).getDeclaredField((String) "UNDEFINED");
        ((Field) term1280).setAccessible(true);
        Object enum3 = ((Field) term1280).get((Object) null);
        Integer term971 = new Integer(0);
        Integer term973 = new Integer(1);
        term895 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term991 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term895, term895.getClass(), "id", -1);
        setBooleanField(term895, term895.getClass(), "enable", true);
        setField(term895, term895.getClass(), "name", "xxx");
        setField(term895, term895.getClass(), "kind", enum2);
        setField(term895, term895.getClass(), "difficulty", enum3);
        setField(term895, term895.getClass(), "pvList", "ALL");
        setField(term895, term895.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term895, term895.getClass(), "addVP", term971);
        setField(term895, term895.getClass(), "vpMultiplier", term973);
        setIntField(term976, term976.getClass(), "year", 2005);
        setShortField(term976, term976.getClass(), "month", (short) 1);
        setShortField(term976, term976.getClass(), "day", (short) 1);
        setField(term975, term975.getClass(), "date", term976);
        setByteField(term980, term980.getClass(), "hour", (byte) 0);
        setByteField(term980, term980.getClass(), "minute", (byte) 0);
        setByteField(term980, term980.getClass(), "second", (byte) 0);
        setIntField(term980, term980.getClass(), "nano", 0);
        setField(term975, term975.getClass(), "time", term980);
        setField(term895, term895.getClass(), "start", term975);
        setIntField(term986, term986.getClass(), "year", 2005);
        setShortField(term986, term986.getClass(), "month", (short) 1);
        setShortField(term986, term986.getClass(), "day", (short) 1);
        setField(term985, term985.getClass(), "date", term986);
        setField(term985, term985.getClass(), "time", term980);
        setField(term895, term895.getClass(), "end", term985);
        setIntField(term991, term991.getClass(), "year", 2005);
        setShortField(term991, term991.getClass(), "month", (short) 1);
        setShortField(term991, term991.getClass(), "day", (short) 1);
        setField(term990, term990.getClass(), "date", term991);
        setField(term990, term990.getClass(), "time", term980);
        setField(term895, term895.getClass(), "createDate", term990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Object[] args = new Object[1];
        args[0] = term895;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


