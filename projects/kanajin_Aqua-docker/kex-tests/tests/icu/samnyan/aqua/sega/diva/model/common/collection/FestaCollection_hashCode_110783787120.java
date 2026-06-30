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

public class FestaCollection_hashCode_110783787120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16339;

    public FestaCollection_hashCode_110783787120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16510 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term16509 = ((Class) term16510).getDeclaredField((String) "PINK_FESTA");
        ((Field) term16509).setAccessible(true);
        Object enum40 = ((Field) term16509).get((Object) null);
        Class<? extends Object> term16792 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term16791 = ((Class) term16792).getDeclaredField((String) "UNDEFINED");
        ((Field) term16791).setAccessible(true);
        Object enum41 = ((Field) term16791).get((Object) null);
        Integer term16416 = new Integer(0);
        Integer term16418 = new Integer(1);
        Integer term16487 = new Integer(0);
        Integer term16489 = new Integer(1);
        term16339 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term16340 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term16420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16425 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16440 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term16491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16502 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term16340, term16340.getClass(), "id", -1);
        setBooleanField(term16340, term16340.getClass(), "enable", true);
        setField(term16340, term16340.getClass(), "name", "xxx");
        setField(term16340, term16340.getClass(), "kind", enum40);
        setField(term16340, term16340.getClass(), "difficulty", enum41);
        setField(term16340, term16340.getClass(), "pvList", "ALL");
        setField(term16340, term16340.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term16340, term16340.getClass(), "addVP", term16416);
        setField(term16340, term16340.getClass(), "vpMultiplier", term16418);
        setIntField(term16421, term16421.getClass(), "year", 2005);
        setShortField(term16421, term16421.getClass(), "month", (short) 1);
        setShortField(term16421, term16421.getClass(), "day", (short) 1);
        setField(term16420, term16420.getClass(), "date", term16421);
        setByteField(term16425, term16425.getClass(), "hour", (byte) 0);
        setByteField(term16425, term16425.getClass(), "minute", (byte) 0);
        setByteField(term16425, term16425.getClass(), "second", (byte) 0);
        setIntField(term16425, term16425.getClass(), "nano", 0);
        setField(term16420, term16420.getClass(), "time", term16425);
        setField(term16340, term16340.getClass(), "start", term16420);
        setIntField(term16431, term16431.getClass(), "year", 2005);
        setShortField(term16431, term16431.getClass(), "month", (short) 1);
        setShortField(term16431, term16431.getClass(), "day", (short) 1);
        setField(term16430, term16430.getClass(), "date", term16431);
        setField(term16430, term16430.getClass(), "time", term16425);
        setField(term16340, term16340.getClass(), "end", term16430);
        setIntField(term16436, term16436.getClass(), "year", 2005);
        setShortField(term16436, term16436.getClass(), "month", (short) 1);
        setShortField(term16436, term16436.getClass(), "day", (short) 1);
        setField(term16435, term16435.getClass(), "date", term16436);
        setField(term16435, term16435.getClass(), "time", term16425);
        setField(term16340, term16340.getClass(), "createDate", term16435);
        setField(term16339, term16339.getClass(), "firstFesta", term16340);
        setIntField(term16440, term16440.getClass(), "id", -1);
        setBooleanField(term16440, term16440.getClass(), "enable", true);
        setField(term16440, term16440.getClass(), "name", "xxx");
        setField(term16440, term16440.getClass(), "kind", enum40);
        setField(term16440, term16440.getClass(), "difficulty", enum41);
        setField(term16440, term16440.getClass(), "pvList", "ALL");
        setField(term16440, term16440.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term16440, term16440.getClass(), "addVP", term16487);
        setField(term16440, term16440.getClass(), "vpMultiplier", term16489);
        setIntField(term16492, term16492.getClass(), "year", 2005);
        setShortField(term16492, term16492.getClass(), "month", (short) 1);
        setShortField(term16492, term16492.getClass(), "day", (short) 1);
        setField(term16491, term16491.getClass(), "date", term16492);
        setField(term16491, term16491.getClass(), "time", term16425);
        setField(term16440, term16440.getClass(), "start", term16491);
        setIntField(term16497, term16497.getClass(), "year", 2005);
        setShortField(term16497, term16497.getClass(), "month", (short) 1);
        setShortField(term16497, term16497.getClass(), "day", (short) 1);
        setField(term16496, term16496.getClass(), "date", term16497);
        setField(term16496, term16496.getClass(), "time", term16425);
        setField(term16440, term16440.getClass(), "end", term16496);
        setIntField(term16502, term16502.getClass(), "year", 2005);
        setShortField(term16502, term16502.getClass(), "month", (short) 1);
        setShortField(term16502, term16502.getClass(), "day", (short) 1);
        setField(term16501, term16501.getClass(), "date", term16502);
        setField(term16501, term16501.getClass(), "time", term16425);
        setField(term16440, term16440.getClass(), "createDate", term16501);
        setField(term16339, term16339.getClass(), "secondFesta", term16440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term16339, args);
    }

};


