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
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class PvEntry_init_167647275623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90037;
     Object term90039;
     Object enum207;
     Object term90053;
     Object enum208;
     Object term90065;
     Object term90075;
     Object term90085;
     Object term90095;

    public PvEntry_init_167647275623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90037 = new Long(-8469818909085103606L);
        term90039 = new Integer(-1270258033);
        Class<? extends Object> term90106 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term90105 = ((Class) term90106).getDeclaredField((String) "EXTREME");
        ((Field) term90105).setAccessible(true);
        enum207 = ((Field) term90105).get((Object) null);
        term90053 = new Integer(1677994069);
        Class<? extends Object> term90384 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term90383 = ((Class) term90384).getDeclaredField((String) "EXTRA");
        ((Field) term90383).setAccessible(true);
        enum208 = ((Field) term90383).get((Object) null);
        term90065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90070 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term90066, term90066.getClass(), "year", 2016);
        setShortField(term90066, term90066.getClass(), "month", (short) 1);
        setShortField(term90066, term90066.getClass(), "day", (short) 24);
        setField(term90065, term90065.getClass(), "date", term90066);
        setByteField(term90070, term90070.getClass(), "hour", (byte) 23);
        setByteField(term90070, term90070.getClass(), "minute", (byte) 15);
        setByteField(term90070, term90070.getClass(), "second", (byte) 43);
        setIntField(term90070, term90070.getClass(), "nano", 860277753);
        setField(term90065, term90065.getClass(), "time", term90070);
        term90075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90080 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term90076, term90076.getClass(), "year", 2016);
        setShortField(term90076, term90076.getClass(), "month", (short) 2);
        setShortField(term90076, term90076.getClass(), "day", (short) 2);
        setField(term90075, term90075.getClass(), "date", term90076);
        setByteField(term90080, term90080.getClass(), "hour", (byte) 16);
        setByteField(term90080, term90080.getClass(), "minute", (byte) 51);
        setByteField(term90080, term90080.getClass(), "second", (byte) 8);
        setIntField(term90080, term90080.getClass(), "nano", 991355221);
        setField(term90075, term90075.getClass(), "time", term90080);
        term90085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90090 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term90086, term90086.getClass(), "year", 2019);
        setShortField(term90086, term90086.getClass(), "month", (short) 12);
        setShortField(term90086, term90086.getClass(), "day", (short) 8);
        setField(term90085, term90085.getClass(), "date", term90086);
        setByteField(term90090, term90090.getClass(), "hour", (byte) 6);
        setByteField(term90090, term90090.getClass(), "minute", (byte) 0);
        setByteField(term90090, term90090.getClass(), "second", (byte) 32);
        setIntField(term90090, term90090.getClass(), "nano", 371231280);
        setField(term90085, term90085.getClass(), "time", term90090);
        term90095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90100 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term90096, term90096.getClass(), "year", 2024);
        setShortField(term90096, term90096.getClass(), "month", (short) 3);
        setShortField(term90096, term90096.getClass(), "day", (short) 19);
        setField(term90095, term90095.getClass(), "date", term90096);
        setByteField(term90100, term90100.getClass(), "hour", (byte) 16);
        setByteField(term90100, term90100.getClass(), "minute", (byte) 8);
        setByteField(term90100, term90100.getClass(), "second", (byte) 55);
        setIntField(term90100, term90100.getClass(), "nano", 955822950);
        setField(term90095, term90095.getClass(), "time", term90100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[9];
        args[0] = term90037;
        args[1] = term90039;
        args[2] = enum207;
        args[3] = term90053;
        args[4] = enum208;
        args[5] = term90065;
        args[6] = term90075;
        args[7] = term90085;
        args[8] = term90095;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


