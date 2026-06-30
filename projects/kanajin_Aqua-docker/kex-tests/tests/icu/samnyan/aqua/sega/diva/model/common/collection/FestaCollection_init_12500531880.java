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

public class FestaCollection_init_12500531880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term101;

    public FestaCollection_init_12500531880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term201 = ((Class) term202).getDeclaredField((String) "PINK_FESTA");
        ((Field) term201).setAccessible(true);
        Object enum0 = ((Field) term201).get((Object) null);
        Class<? extends Object> term539 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term538 = ((Class) term539).getDeclaredField((String) "UNDEFINED");
        ((Field) term538).setAccessible(true);
        Object enum1 = ((Field) term538).get((Object) null);
        Integer term77 = new Integer(0);
        Integer term79 = new Integer(1);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term81 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1, term1.getClass(), "id", -1);
        setBooleanField(term1, term1.getClass(), "enable", true);
        setField(term1, term1.getClass(), "name", "xxx");
        setField(term1, term1.getClass(), "kind", enum0);
        setField(term1, term1.getClass(), "difficulty", enum1);
        setField(term1, term1.getClass(), "pvList", "ALL");
        setField(term1, term1.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term1, term1.getClass(), "addVP", term77);
        setField(term1, term1.getClass(), "vpMultiplier", term79);
        setIntField(term82, term82.getClass(), "year", 2005);
        setShortField(term82, term82.getClass(), "month", (short) 1);
        setShortField(term82, term82.getClass(), "day", (short) 1);
        setField(term81, term81.getClass(), "date", term82);
        setByteField(term86, term86.getClass(), "hour", (byte) 0);
        setByteField(term86, term86.getClass(), "minute", (byte) 0);
        setByteField(term86, term86.getClass(), "second", (byte) 0);
        setIntField(term86, term86.getClass(), "nano", 0);
        setField(term81, term81.getClass(), "time", term86);
        setField(term1, term1.getClass(), "start", term81);
        setIntField(term92, term92.getClass(), "year", 2005);
        setShortField(term92, term92.getClass(), "month", (short) 1);
        setShortField(term92, term92.getClass(), "day", (short) 1);
        setField(term91, term91.getClass(), "date", term92);
        setField(term91, term91.getClass(), "time", term86);
        setField(term1, term1.getClass(), "end", term91);
        setIntField(term97, term97.getClass(), "year", 2005);
        setShortField(term97, term97.getClass(), "month", (short) 1);
        setShortField(term97, term97.getClass(), "day", (short) 1);
        setField(term96, term96.getClass(), "date", term97);
        setField(term96, term96.getClass(), "time", term86);
        setField(term1, term1.getClass(), "createDate", term96);
        Integer term148 = new Integer(0);
        Integer term150 = new Integer(1);
        term101 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term163 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term101, term101.getClass(), "id", -1);
        setBooleanField(term101, term101.getClass(), "enable", true);
        setField(term101, term101.getClass(), "name", "xxx");
        setField(term101, term101.getClass(), "kind", enum0);
        setField(term101, term101.getClass(), "difficulty", enum1);
        setField(term101, term101.getClass(), "pvList", "ALL");
        setField(term101, term101.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term101, term101.getClass(), "addVP", term148);
        setField(term101, term101.getClass(), "vpMultiplier", term150);
        setIntField(term153, term153.getClass(), "year", 2005);
        setShortField(term153, term153.getClass(), "month", (short) 1);
        setShortField(term153, term153.getClass(), "day", (short) 1);
        setField(term152, term152.getClass(), "date", term153);
        setField(term152, term152.getClass(), "time", term86);
        setField(term101, term101.getClass(), "start", term152);
        setIntField(term158, term158.getClass(), "year", 2005);
        setShortField(term158, term158.getClass(), "month", (short) 1);
        setShortField(term158, term158.getClass(), "day", (short) 1);
        setField(term157, term157.getClass(), "date", term158);
        setField(term157, term157.getClass(), "time", term86);
        setField(term101, term101.getClass(), "end", term157);
        setIntField(term163, term163.getClass(), "year", 2005);
        setShortField(term163, term163.getClass(), "month", (short) 1);
        setShortField(term163, term163.getClass(), "day", (short) 1);
        setField(term162, term162.getClass(), "date", term163);
        setField(term162, term162.getClass(), "time", term86);
        setField(term101, term101.getClass(), "createDate", term162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term101;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


