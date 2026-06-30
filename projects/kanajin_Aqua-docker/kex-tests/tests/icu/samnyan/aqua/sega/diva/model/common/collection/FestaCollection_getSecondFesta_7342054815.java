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

public class FestaCollection_getSecondFesta_7342054815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12084;

    public FestaCollection_getSecondFesta_7342054815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12255 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term12254 = ((Class) term12255).getDeclaredField((String) "PINK_FESTA");
        ((Field) term12254).setAccessible(true);
        Object enum30 = ((Field) term12254).get((Object) null);
        Class<? extends Object> term12537 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term12536 = ((Class) term12537).getDeclaredField((String) "UNDEFINED");
        ((Field) term12536).setAccessible(true);
        Object enum31 = ((Field) term12536).get((Object) null);
        Integer term12161 = new Integer(0);
        Integer term12163 = new Integer(1);
        Integer term12232 = new Integer(0);
        Integer term12234 = new Integer(1);
        term12084 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term12085 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term12165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12170 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12185 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term12236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12247 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12085, term12085.getClass(), "id", -1);
        setBooleanField(term12085, term12085.getClass(), "enable", true);
        setField(term12085, term12085.getClass(), "name", "xxx");
        setField(term12085, term12085.getClass(), "kind", enum30);
        setField(term12085, term12085.getClass(), "difficulty", enum31);
        setField(term12085, term12085.getClass(), "pvList", "ALL");
        setField(term12085, term12085.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term12085, term12085.getClass(), "addVP", term12161);
        setField(term12085, term12085.getClass(), "vpMultiplier", term12163);
        setIntField(term12166, term12166.getClass(), "year", 2005);
        setShortField(term12166, term12166.getClass(), "month", (short) 1);
        setShortField(term12166, term12166.getClass(), "day", (short) 1);
        setField(term12165, term12165.getClass(), "date", term12166);
        setByteField(term12170, term12170.getClass(), "hour", (byte) 0);
        setByteField(term12170, term12170.getClass(), "minute", (byte) 0);
        setByteField(term12170, term12170.getClass(), "second", (byte) 0);
        setIntField(term12170, term12170.getClass(), "nano", 0);
        setField(term12165, term12165.getClass(), "time", term12170);
        setField(term12085, term12085.getClass(), "start", term12165);
        setIntField(term12176, term12176.getClass(), "year", 2005);
        setShortField(term12176, term12176.getClass(), "month", (short) 1);
        setShortField(term12176, term12176.getClass(), "day", (short) 1);
        setField(term12175, term12175.getClass(), "date", term12176);
        setField(term12175, term12175.getClass(), "time", term12170);
        setField(term12085, term12085.getClass(), "end", term12175);
        setIntField(term12181, term12181.getClass(), "year", 2005);
        setShortField(term12181, term12181.getClass(), "month", (short) 1);
        setShortField(term12181, term12181.getClass(), "day", (short) 1);
        setField(term12180, term12180.getClass(), "date", term12181);
        setField(term12180, term12180.getClass(), "time", term12170);
        setField(term12085, term12085.getClass(), "createDate", term12180);
        setField(term12084, term12084.getClass(), "firstFesta", term12085);
        setIntField(term12185, term12185.getClass(), "id", -1);
        setBooleanField(term12185, term12185.getClass(), "enable", true);
        setField(term12185, term12185.getClass(), "name", "xxx");
        setField(term12185, term12185.getClass(), "kind", enum30);
        setField(term12185, term12185.getClass(), "difficulty", enum31);
        setField(term12185, term12185.getClass(), "pvList", "ALL");
        setField(term12185, term12185.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term12185, term12185.getClass(), "addVP", term12232);
        setField(term12185, term12185.getClass(), "vpMultiplier", term12234);
        setIntField(term12237, term12237.getClass(), "year", 2005);
        setShortField(term12237, term12237.getClass(), "month", (short) 1);
        setShortField(term12237, term12237.getClass(), "day", (short) 1);
        setField(term12236, term12236.getClass(), "date", term12237);
        setField(term12236, term12236.getClass(), "time", term12170);
        setField(term12185, term12185.getClass(), "start", term12236);
        setIntField(term12242, term12242.getClass(), "year", 2005);
        setShortField(term12242, term12242.getClass(), "month", (short) 1);
        setShortField(term12242, term12242.getClass(), "day", (short) 1);
        setField(term12241, term12241.getClass(), "date", term12242);
        setField(term12241, term12241.getClass(), "time", term12170);
        setField(term12185, term12185.getClass(), "end", term12241);
        setIntField(term12247, term12247.getClass(), "year", 2005);
        setShortField(term12247, term12247.getClass(), "month", (short) 1);
        setShortField(term12247, term12247.getClass(), "day", (short) 1);
        setField(term12246, term12246.getClass(), "date", term12247);
        setField(term12246, term12246.getClass(), "time", term12170);
        setField(term12185, term12185.getClass(), "createDate", term12246);
        setField(term12084, term12084.getClass(), "secondFesta", term12185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecondFesta", argTypes, term12084, args);
    }

};


