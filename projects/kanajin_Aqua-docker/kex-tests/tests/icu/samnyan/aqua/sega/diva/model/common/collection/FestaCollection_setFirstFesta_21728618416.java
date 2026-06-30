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

public class FestaCollection_setFirstFesta_21728618416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12893;
     Object term13060;

    public FestaCollection_setFirstFesta_21728618416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13130 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term13129 = ((Class) term13130).getDeclaredField((String) "PINK_FESTA");
        ((Field) term13129).setAccessible(true);
        Object enum32 = ((Field) term13129).get((Object) null);
        Class<? extends Object> term13412 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term13411 = ((Class) term13412).getDeclaredField((String) "UNDEFINED");
        ((Field) term13411).setAccessible(true);
        Object enum33 = ((Field) term13411).get((Object) null);
        Integer term12970 = new Integer(0);
        Integer term12972 = new Integer(1);
        Integer term13041 = new Integer(0);
        Integer term13043 = new Integer(1);
        term12893 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term12894 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term12974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12979 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12994 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term13045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13056 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12894, term12894.getClass(), "id", -1);
        setBooleanField(term12894, term12894.getClass(), "enable", true);
        setField(term12894, term12894.getClass(), "name", "xxx");
        setField(term12894, term12894.getClass(), "kind", enum32);
        setField(term12894, term12894.getClass(), "difficulty", enum33);
        setField(term12894, term12894.getClass(), "pvList", "ALL");
        setField(term12894, term12894.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term12894, term12894.getClass(), "addVP", term12970);
        setField(term12894, term12894.getClass(), "vpMultiplier", term12972);
        setIntField(term12975, term12975.getClass(), "year", 2005);
        setShortField(term12975, term12975.getClass(), "month", (short) 1);
        setShortField(term12975, term12975.getClass(), "day", (short) 1);
        setField(term12974, term12974.getClass(), "date", term12975);
        setByteField(term12979, term12979.getClass(), "hour", (byte) 0);
        setByteField(term12979, term12979.getClass(), "minute", (byte) 0);
        setByteField(term12979, term12979.getClass(), "second", (byte) 0);
        setIntField(term12979, term12979.getClass(), "nano", 0);
        setField(term12974, term12974.getClass(), "time", term12979);
        setField(term12894, term12894.getClass(), "start", term12974);
        setIntField(term12985, term12985.getClass(), "year", 2005);
        setShortField(term12985, term12985.getClass(), "month", (short) 1);
        setShortField(term12985, term12985.getClass(), "day", (short) 1);
        setField(term12984, term12984.getClass(), "date", term12985);
        setField(term12984, term12984.getClass(), "time", term12979);
        setField(term12894, term12894.getClass(), "end", term12984);
        setIntField(term12990, term12990.getClass(), "year", 2005);
        setShortField(term12990, term12990.getClass(), "month", (short) 1);
        setShortField(term12990, term12990.getClass(), "day", (short) 1);
        setField(term12989, term12989.getClass(), "date", term12990);
        setField(term12989, term12989.getClass(), "time", term12979);
        setField(term12894, term12894.getClass(), "createDate", term12989);
        setField(term12893, term12893.getClass(), "firstFesta", term12894);
        setIntField(term12994, term12994.getClass(), "id", -1);
        setBooleanField(term12994, term12994.getClass(), "enable", true);
        setField(term12994, term12994.getClass(), "name", "xxx");
        setField(term12994, term12994.getClass(), "kind", enum32);
        setField(term12994, term12994.getClass(), "difficulty", enum33);
        setField(term12994, term12994.getClass(), "pvList", "ALL");
        setField(term12994, term12994.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term12994, term12994.getClass(), "addVP", term13041);
        setField(term12994, term12994.getClass(), "vpMultiplier", term13043);
        setIntField(term13046, term13046.getClass(), "year", 2005);
        setShortField(term13046, term13046.getClass(), "month", (short) 1);
        setShortField(term13046, term13046.getClass(), "day", (short) 1);
        setField(term13045, term13045.getClass(), "date", term13046);
        setField(term13045, term13045.getClass(), "time", term12979);
        setField(term12994, term12994.getClass(), "start", term13045);
        setIntField(term13051, term13051.getClass(), "year", 2005);
        setShortField(term13051, term13051.getClass(), "month", (short) 1);
        setShortField(term13051, term13051.getClass(), "day", (short) 1);
        setField(term13050, term13050.getClass(), "date", term13051);
        setField(term13050, term13050.getClass(), "time", term12979);
        setField(term12994, term12994.getClass(), "end", term13050);
        setIntField(term13056, term13056.getClass(), "year", 2005);
        setShortField(term13056, term13056.getClass(), "month", (short) 1);
        setShortField(term13056, term13056.getClass(), "day", (short) 1);
        setField(term13055, term13055.getClass(), "date", term13056);
        setField(term13055, term13055.getClass(), "time", term12979);
        setField(term12994, term12994.getClass(), "createDate", term13055);
        setField(term12893, term12893.getClass(), "secondFesta", term12994);
        Integer term13107 = new Integer(0);
        Integer term13109 = new Integer(1);
        term13060 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term13111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13122 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term13060, term13060.getClass(), "id", -1);
        setBooleanField(term13060, term13060.getClass(), "enable", true);
        setField(term13060, term13060.getClass(), "name", "xxx");
        setField(term13060, term13060.getClass(), "kind", enum32);
        setField(term13060, term13060.getClass(), "difficulty", enum33);
        setField(term13060, term13060.getClass(), "pvList", "ALL");
        setField(term13060, term13060.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term13060, term13060.getClass(), "addVP", term13107);
        setField(term13060, term13060.getClass(), "vpMultiplier", term13109);
        setIntField(term13112, term13112.getClass(), "year", 2005);
        setShortField(term13112, term13112.getClass(), "month", (short) 1);
        setShortField(term13112, term13112.getClass(), "day", (short) 1);
        setField(term13111, term13111.getClass(), "date", term13112);
        setField(term13111, term13111.getClass(), "time", term12979);
        setField(term13060, term13060.getClass(), "start", term13111);
        setIntField(term13117, term13117.getClass(), "year", 2005);
        setShortField(term13117, term13117.getClass(), "month", (short) 1);
        setShortField(term13117, term13117.getClass(), "day", (short) 1);
        setField(term13116, term13116.getClass(), "date", term13117);
        setField(term13116, term13116.getClass(), "time", term12979);
        setField(term13060, term13060.getClass(), "end", term13116);
        setIntField(term13122, term13122.getClass(), "year", 2005);
        setShortField(term13122, term13122.getClass(), "month", (short) 1);
        setShortField(term13122, term13122.getClass(), "day", (short) 1);
        setField(term13121, term13121.getClass(), "date", term13122);
        setField(term13121, term13121.getClass(), "time", term12979);
        setField(term13060, term13060.getClass(), "createDate", term13121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Object[] args = new Object[1];
        args[0] = term13060;
        callMethod(klass, "setFirstFesta", argTypes, term12893, args);
    }

};


