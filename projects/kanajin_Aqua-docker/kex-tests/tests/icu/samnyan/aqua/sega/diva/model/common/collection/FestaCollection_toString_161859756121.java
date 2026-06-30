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

public class FestaCollection_toString_161859756121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17148;

    public FestaCollection_toString_161859756121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17319 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term17318 = ((Class) term17319).getDeclaredField((String) "PINK_FESTA");
        ((Field) term17318).setAccessible(true);
        Object enum42 = ((Field) term17318).get((Object) null);
        Class<? extends Object> term17601 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term17600 = ((Class) term17601).getDeclaredField((String) "UNDEFINED");
        ((Field) term17600).setAccessible(true);
        Object enum43 = ((Field) term17600).get((Object) null);
        Integer term17225 = new Integer(0);
        Integer term17227 = new Integer(1);
        Integer term17296 = new Integer(0);
        Integer term17298 = new Integer(1);
        term17148 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term17149 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term17229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17234 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17239 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17240 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17249 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term17300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17311 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17149, term17149.getClass(), "id", -1);
        setBooleanField(term17149, term17149.getClass(), "enable", true);
        setField(term17149, term17149.getClass(), "name", "xxx");
        setField(term17149, term17149.getClass(), "kind", enum42);
        setField(term17149, term17149.getClass(), "difficulty", enum43);
        setField(term17149, term17149.getClass(), "pvList", "ALL");
        setField(term17149, term17149.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term17149, term17149.getClass(), "addVP", term17225);
        setField(term17149, term17149.getClass(), "vpMultiplier", term17227);
        setIntField(term17230, term17230.getClass(), "year", 2005);
        setShortField(term17230, term17230.getClass(), "month", (short) 1);
        setShortField(term17230, term17230.getClass(), "day", (short) 1);
        setField(term17229, term17229.getClass(), "date", term17230);
        setByteField(term17234, term17234.getClass(), "hour", (byte) 0);
        setByteField(term17234, term17234.getClass(), "minute", (byte) 0);
        setByteField(term17234, term17234.getClass(), "second", (byte) 0);
        setIntField(term17234, term17234.getClass(), "nano", 0);
        setField(term17229, term17229.getClass(), "time", term17234);
        setField(term17149, term17149.getClass(), "start", term17229);
        setIntField(term17240, term17240.getClass(), "year", 2005);
        setShortField(term17240, term17240.getClass(), "month", (short) 1);
        setShortField(term17240, term17240.getClass(), "day", (short) 1);
        setField(term17239, term17239.getClass(), "date", term17240);
        setField(term17239, term17239.getClass(), "time", term17234);
        setField(term17149, term17149.getClass(), "end", term17239);
        setIntField(term17245, term17245.getClass(), "year", 2005);
        setShortField(term17245, term17245.getClass(), "month", (short) 1);
        setShortField(term17245, term17245.getClass(), "day", (short) 1);
        setField(term17244, term17244.getClass(), "date", term17245);
        setField(term17244, term17244.getClass(), "time", term17234);
        setField(term17149, term17149.getClass(), "createDate", term17244);
        setField(term17148, term17148.getClass(), "firstFesta", term17149);
        setIntField(term17249, term17249.getClass(), "id", -1);
        setBooleanField(term17249, term17249.getClass(), "enable", true);
        setField(term17249, term17249.getClass(), "name", "xxx");
        setField(term17249, term17249.getClass(), "kind", enum42);
        setField(term17249, term17249.getClass(), "difficulty", enum43);
        setField(term17249, term17249.getClass(), "pvList", "ALL");
        setField(term17249, term17249.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term17249, term17249.getClass(), "addVP", term17296);
        setField(term17249, term17249.getClass(), "vpMultiplier", term17298);
        setIntField(term17301, term17301.getClass(), "year", 2005);
        setShortField(term17301, term17301.getClass(), "month", (short) 1);
        setShortField(term17301, term17301.getClass(), "day", (short) 1);
        setField(term17300, term17300.getClass(), "date", term17301);
        setField(term17300, term17300.getClass(), "time", term17234);
        setField(term17249, term17249.getClass(), "start", term17300);
        setIntField(term17306, term17306.getClass(), "year", 2005);
        setShortField(term17306, term17306.getClass(), "month", (short) 1);
        setShortField(term17306, term17306.getClass(), "day", (short) 1);
        setField(term17305, term17305.getClass(), "date", term17306);
        setField(term17305, term17305.getClass(), "time", term17234);
        setField(term17249, term17249.getClass(), "end", term17305);
        setIntField(term17311, term17311.getClass(), "year", 2005);
        setShortField(term17311, term17311.getClass(), "month", (short) 1);
        setShortField(term17311, term17311.getClass(), "day", (short) 1);
        setField(term17310, term17310.getClass(), "date", term17311);
        setField(term17310, term17310.getClass(), "time", term17234);
        setField(term17249, term17249.getClass(), "createDate", term17310);
        setField(term17148, term17148.getClass(), "secondFesta", term17249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17148, args);
    }

};


