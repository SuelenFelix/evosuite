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
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public class Contest_init_186611119649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74144;
     Object term74146;
     Object term74148;
     Object term74158;
     Object enum158;
     Object term74209;
     Object term74211;
     Object term74213;
     Object term74215;
     Object enum159;
     Object term74244;
     Object term74246;
     Object term74248;

    public Contest_init_186611119649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74144 = new Integer(-963198667);
        term74146 = new Boolean(true);
        term74148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74153 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term74149, term74149.getClass(), "year", 2022);
        setShortField(term74149, term74149.getClass(), "month", (short) 5);
        setShortField(term74149, term74149.getClass(), "day", (short) 29);
        setField(term74148, term74148.getClass(), "date", term74149);
        setByteField(term74153, term74153.getClass(), "hour", (byte) 11);
        setByteField(term74153, term74153.getClass(), "minute", (byte) 41);
        setByteField(term74153, term74153.getClass(), "second", (byte) 43);
        setIntField(term74153, term74153.getClass(), "nano", 984890757);
        setField(term74148, term74148.getClass(), "time", term74153);
        term74158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74163 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term74159, term74159.getClass(), "year", 2029);
        setShortField(term74159, term74159.getClass(), "month", (short) 4);
        setShortField(term74159, term74159.getClass(), "day", (short) 27);
        setField(term74158, term74158.getClass(), "date", term74159);
        setByteField(term74163, term74163.getClass(), "hour", (byte) 16);
        setByteField(term74163, term74163.getClass(), "minute", (byte) 25);
        setByteField(term74163, term74163.getClass(), "second", (byte) 10);
        setIntField(term74163, term74163.getClass(), "nano", 699018782);
        setField(term74158, term74158.getClass(), "time", term74163);
        Class<? extends Object> term74343 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        Field term74342 = ((Class) term74343).getDeclaredField((String) "INTERMEDIATE");
        ((Field) term74342).setAccessible(true);
        enum158 = ((Field) term74342).get((Object) null);
        term74209 = new Integer(-1007935918);
        term74211 = new Integer(1485731037);
        term74213 = new Integer(1304396087);
        term74215 = new Integer(1782600602);
        Class<? extends Object> term74661 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        Field term74660 = ((Class) term74661).getDeclaredField((String) "PERCENTAGE");
        ((Field) term74660).setAccessible(true);
        enum159 = ((Field) term74660).get((Object) null);
        term74244 = new Integer(-185892708);
        term74246 = new Integer(-203163250);
        term74248 = new Integer(498473526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[22];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.String");
        argTypes[20] = Class.forName("java.lang.String");
        argTypes[21] = Class.forName("java.lang.String");
        Object[] args = new Object[22];
        args[0] = term74144;
        args[1] = term74146;
        args[2] = term74148;
        args[3] = term74158;
        args[4] = "tHzdWkkvkE";
        args[5] = "OeOnaLqxoy";
        args[6] = enum158;
        args[7] = term74209;
        args[8] = term74211;
        args[9] = term74213;
        args[10] = term74215;
        args[11] = "buRlIDjuAa";
        args[12] = enum159;
        args[13] = term74244;
        args[14] = term74246;
        args[15] = term74248;
        args[16] = "qDicwPaclz";
        args[17] = "eZlPEKWGYm";
        args[18] = "KuunqhygWm";
        args[19] = "wKOfSnwiZS";
        args[20] = "oIlPhWewqE";
        args[21] = "IfOJiWUkHp";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


