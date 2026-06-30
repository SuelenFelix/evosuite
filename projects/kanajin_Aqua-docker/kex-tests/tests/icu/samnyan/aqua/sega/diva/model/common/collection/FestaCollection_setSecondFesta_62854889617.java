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

public class FestaCollection_setSecondFesta_62854889617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13806;
     Object term13973;

    public FestaCollection_setSecondFesta_62854889617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14043 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term14042 = ((Class) term14043).getDeclaredField((String) "PINK_FESTA");
        ((Field) term14042).setAccessible(true);
        Object enum34 = ((Field) term14042).get((Object) null);
        Class<? extends Object> term14325 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term14324 = ((Class) term14325).getDeclaredField((String) "UNDEFINED");
        ((Field) term14324).setAccessible(true);
        Object enum35 = ((Field) term14324).get((Object) null);
        Integer term13883 = new Integer(0);
        Integer term13885 = new Integer(1);
        Integer term13954 = new Integer(0);
        Integer term13956 = new Integer(1);
        term13806 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term13807 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term13887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13892 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13907 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term13958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13969 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term13807, term13807.getClass(), "id", -1);
        setBooleanField(term13807, term13807.getClass(), "enable", true);
        setField(term13807, term13807.getClass(), "name", "xxx");
        setField(term13807, term13807.getClass(), "kind", enum34);
        setField(term13807, term13807.getClass(), "difficulty", enum35);
        setField(term13807, term13807.getClass(), "pvList", "ALL");
        setField(term13807, term13807.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term13807, term13807.getClass(), "addVP", term13883);
        setField(term13807, term13807.getClass(), "vpMultiplier", term13885);
        setIntField(term13888, term13888.getClass(), "year", 2005);
        setShortField(term13888, term13888.getClass(), "month", (short) 1);
        setShortField(term13888, term13888.getClass(), "day", (short) 1);
        setField(term13887, term13887.getClass(), "date", term13888);
        setByteField(term13892, term13892.getClass(), "hour", (byte) 0);
        setByteField(term13892, term13892.getClass(), "minute", (byte) 0);
        setByteField(term13892, term13892.getClass(), "second", (byte) 0);
        setIntField(term13892, term13892.getClass(), "nano", 0);
        setField(term13887, term13887.getClass(), "time", term13892);
        setField(term13807, term13807.getClass(), "start", term13887);
        setIntField(term13898, term13898.getClass(), "year", 2005);
        setShortField(term13898, term13898.getClass(), "month", (short) 1);
        setShortField(term13898, term13898.getClass(), "day", (short) 1);
        setField(term13897, term13897.getClass(), "date", term13898);
        setField(term13897, term13897.getClass(), "time", term13892);
        setField(term13807, term13807.getClass(), "end", term13897);
        setIntField(term13903, term13903.getClass(), "year", 2005);
        setShortField(term13903, term13903.getClass(), "month", (short) 1);
        setShortField(term13903, term13903.getClass(), "day", (short) 1);
        setField(term13902, term13902.getClass(), "date", term13903);
        setField(term13902, term13902.getClass(), "time", term13892);
        setField(term13807, term13807.getClass(), "createDate", term13902);
        setField(term13806, term13806.getClass(), "firstFesta", term13807);
        setIntField(term13907, term13907.getClass(), "id", -1);
        setBooleanField(term13907, term13907.getClass(), "enable", true);
        setField(term13907, term13907.getClass(), "name", "xxx");
        setField(term13907, term13907.getClass(), "kind", enum34);
        setField(term13907, term13907.getClass(), "difficulty", enum35);
        setField(term13907, term13907.getClass(), "pvList", "ALL");
        setField(term13907, term13907.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term13907, term13907.getClass(), "addVP", term13954);
        setField(term13907, term13907.getClass(), "vpMultiplier", term13956);
        setIntField(term13959, term13959.getClass(), "year", 2005);
        setShortField(term13959, term13959.getClass(), "month", (short) 1);
        setShortField(term13959, term13959.getClass(), "day", (short) 1);
        setField(term13958, term13958.getClass(), "date", term13959);
        setField(term13958, term13958.getClass(), "time", term13892);
        setField(term13907, term13907.getClass(), "start", term13958);
        setIntField(term13964, term13964.getClass(), "year", 2005);
        setShortField(term13964, term13964.getClass(), "month", (short) 1);
        setShortField(term13964, term13964.getClass(), "day", (short) 1);
        setField(term13963, term13963.getClass(), "date", term13964);
        setField(term13963, term13963.getClass(), "time", term13892);
        setField(term13907, term13907.getClass(), "end", term13963);
        setIntField(term13969, term13969.getClass(), "year", 2005);
        setShortField(term13969, term13969.getClass(), "month", (short) 1);
        setShortField(term13969, term13969.getClass(), "day", (short) 1);
        setField(term13968, term13968.getClass(), "date", term13969);
        setField(term13968, term13968.getClass(), "time", term13892);
        setField(term13907, term13907.getClass(), "createDate", term13968);
        setField(term13806, term13806.getClass(), "secondFesta", term13907);
        Integer term14020 = new Integer(0);
        Integer term14022 = new Integer(1);
        term13973 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term14024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14034 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14035 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term13973, term13973.getClass(), "id", -1);
        setBooleanField(term13973, term13973.getClass(), "enable", true);
        setField(term13973, term13973.getClass(), "name", "xxx");
        setField(term13973, term13973.getClass(), "kind", enum34);
        setField(term13973, term13973.getClass(), "difficulty", enum35);
        setField(term13973, term13973.getClass(), "pvList", "ALL");
        setField(term13973, term13973.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term13973, term13973.getClass(), "addVP", term14020);
        setField(term13973, term13973.getClass(), "vpMultiplier", term14022);
        setIntField(term14025, term14025.getClass(), "year", 2005);
        setShortField(term14025, term14025.getClass(), "month", (short) 1);
        setShortField(term14025, term14025.getClass(), "day", (short) 1);
        setField(term14024, term14024.getClass(), "date", term14025);
        setField(term14024, term14024.getClass(), "time", term13892);
        setField(term13973, term13973.getClass(), "start", term14024);
        setIntField(term14030, term14030.getClass(), "year", 2005);
        setShortField(term14030, term14030.getClass(), "month", (short) 1);
        setShortField(term14030, term14030.getClass(), "day", (short) 1);
        setField(term14029, term14029.getClass(), "date", term14030);
        setField(term14029, term14029.getClass(), "time", term13892);
        setField(term13973, term13973.getClass(), "end", term14029);
        setIntField(term14035, term14035.getClass(), "year", 2005);
        setShortField(term14035, term14035.getClass(), "month", (short) 1);
        setShortField(term14035, term14035.getClass(), "day", (short) 1);
        setField(term14034, term14034.getClass(), "date", term14035);
        setField(term14034, term14034.getClass(), "time", term13892);
        setField(term13973, term13973.getClass(), "createDate", term14034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Object[] args = new Object[1];
        args[0] = term13973;
        callMethod(klass, "setSecondFesta", argTypes, term13806, args);
    }

};


