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

public class Festa_setStart_1691441321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23025;
     Object term23125;

    public Festa_setStart_1691441321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23139 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term23138 = ((Class) term23139).getDeclaredField((String) "PINK_FESTA");
        ((Field) term23138).setAccessible(true);
        Object enum43 = ((Field) term23138).get((Object) null);
        Class<? extends Object> term23421 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term23420 = ((Class) term23421).getDeclaredField((String) "UNDEFINED");
        ((Field) term23420).setAccessible(true);
        Object enum44 = ((Field) term23420).get((Object) null);
        Integer term23101 = new Integer(0);
        Integer term23103 = new Integer(1);
        term23025 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term23105 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23106 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23110 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23121 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term23025, term23025.getClass(), "id", -1);
        setBooleanField(term23025, term23025.getClass(), "enable", true);
        setField(term23025, term23025.getClass(), "name", "xxx");
        setField(term23025, term23025.getClass(), "kind", enum43);
        setField(term23025, term23025.getClass(), "difficulty", enum44);
        setField(term23025, term23025.getClass(), "pvList", "ALL");
        setField(term23025, term23025.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term23025, term23025.getClass(), "addVP", term23101);
        setField(term23025, term23025.getClass(), "vpMultiplier", term23103);
        setIntField(term23106, term23106.getClass(), "year", 2005);
        setShortField(term23106, term23106.getClass(), "month", (short) 1);
        setShortField(term23106, term23106.getClass(), "day", (short) 1);
        setField(term23105, term23105.getClass(), "date", term23106);
        setByteField(term23110, term23110.getClass(), "hour", (byte) 0);
        setByteField(term23110, term23110.getClass(), "minute", (byte) 0);
        setByteField(term23110, term23110.getClass(), "second", (byte) 0);
        setIntField(term23110, term23110.getClass(), "nano", 0);
        setField(term23105, term23105.getClass(), "time", term23110);
        setField(term23025, term23025.getClass(), "start", term23105);
        setIntField(term23116, term23116.getClass(), "year", 2005);
        setShortField(term23116, term23116.getClass(), "month", (short) 1);
        setShortField(term23116, term23116.getClass(), "day", (short) 1);
        setField(term23115, term23115.getClass(), "date", term23116);
        setField(term23115, term23115.getClass(), "time", term23110);
        setField(term23025, term23025.getClass(), "end", term23115);
        setIntField(term23121, term23121.getClass(), "year", 2005);
        setShortField(term23121, term23121.getClass(), "month", (short) 1);
        setShortField(term23121, term23121.getClass(), "day", (short) 1);
        setField(term23120, term23120.getClass(), "date", term23121);
        setField(term23120, term23120.getClass(), "time", term23110);
        setField(term23025, term23025.getClass(), "createDate", term23120);
        term23125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23130 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23126, term23126.getClass(), "year", 2012);
        setShortField(term23126, term23126.getClass(), "month", (short) 8);
        setShortField(term23126, term23126.getClass(), "day", (short) 25);
        setField(term23125, term23125.getClass(), "date", term23126);
        setByteField(term23130, term23130.getClass(), "hour", (byte) 5);
        setByteField(term23130, term23130.getClass(), "minute", (byte) 20);
        setByteField(term23130, term23130.getClass(), "second", (byte) 50);
        setIntField(term23130, term23130.getClass(), "nano", 345595912);
        setField(term23125, term23125.getClass(), "time", term23130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23125;
        callMethod(klass, "setStart", argTypes, term23025, args);
    }

};


