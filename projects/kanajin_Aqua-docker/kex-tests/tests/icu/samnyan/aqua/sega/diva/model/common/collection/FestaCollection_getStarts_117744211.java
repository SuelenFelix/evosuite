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

public class FestaCollection_getStarts_117744211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8848;

    public FestaCollection_getStarts_117744211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9019 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term9018 = ((Class) term9019).getDeclaredField((String) "PINK_FESTA");
        ((Field) term9018).setAccessible(true);
        Object enum22 = ((Field) term9018).get((Object) null);
        Class<? extends Object> term9301 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term9300 = ((Class) term9301).getDeclaredField((String) "UNDEFINED");
        ((Field) term9300).setAccessible(true);
        Object enum23 = ((Field) term9300).get((Object) null);
        Integer term8925 = new Integer(0);
        Integer term8927 = new Integer(1);
        Integer term8996 = new Integer(0);
        Integer term8998 = new Integer(1);
        term8848 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term8849 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term8929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8934 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8949 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term9000 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9001 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9011 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term8849, term8849.getClass(), "id", -1);
        setBooleanField(term8849, term8849.getClass(), "enable", true);
        setField(term8849, term8849.getClass(), "name", "xxx");
        setField(term8849, term8849.getClass(), "kind", enum22);
        setField(term8849, term8849.getClass(), "difficulty", enum23);
        setField(term8849, term8849.getClass(), "pvList", "ALL");
        setField(term8849, term8849.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term8849, term8849.getClass(), "addVP", term8925);
        setField(term8849, term8849.getClass(), "vpMultiplier", term8927);
        setIntField(term8930, term8930.getClass(), "year", 2005);
        setShortField(term8930, term8930.getClass(), "month", (short) 1);
        setShortField(term8930, term8930.getClass(), "day", (short) 1);
        setField(term8929, term8929.getClass(), "date", term8930);
        setByteField(term8934, term8934.getClass(), "hour", (byte) 0);
        setByteField(term8934, term8934.getClass(), "minute", (byte) 0);
        setByteField(term8934, term8934.getClass(), "second", (byte) 0);
        setIntField(term8934, term8934.getClass(), "nano", 0);
        setField(term8929, term8929.getClass(), "time", term8934);
        setField(term8849, term8849.getClass(), "start", term8929);
        setIntField(term8940, term8940.getClass(), "year", 2005);
        setShortField(term8940, term8940.getClass(), "month", (short) 1);
        setShortField(term8940, term8940.getClass(), "day", (short) 1);
        setField(term8939, term8939.getClass(), "date", term8940);
        setField(term8939, term8939.getClass(), "time", term8934);
        setField(term8849, term8849.getClass(), "end", term8939);
        setIntField(term8945, term8945.getClass(), "year", 2005);
        setShortField(term8945, term8945.getClass(), "month", (short) 1);
        setShortField(term8945, term8945.getClass(), "day", (short) 1);
        setField(term8944, term8944.getClass(), "date", term8945);
        setField(term8944, term8944.getClass(), "time", term8934);
        setField(term8849, term8849.getClass(), "createDate", term8944);
        setField(term8848, term8848.getClass(), "firstFesta", term8849);
        setIntField(term8949, term8949.getClass(), "id", -1);
        setBooleanField(term8949, term8949.getClass(), "enable", true);
        setField(term8949, term8949.getClass(), "name", "xxx");
        setField(term8949, term8949.getClass(), "kind", enum22);
        setField(term8949, term8949.getClass(), "difficulty", enum23);
        setField(term8949, term8949.getClass(), "pvList", "ALL");
        setField(term8949, term8949.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term8949, term8949.getClass(), "addVP", term8996);
        setField(term8949, term8949.getClass(), "vpMultiplier", term8998);
        setIntField(term9001, term9001.getClass(), "year", 2005);
        setShortField(term9001, term9001.getClass(), "month", (short) 1);
        setShortField(term9001, term9001.getClass(), "day", (short) 1);
        setField(term9000, term9000.getClass(), "date", term9001);
        setField(term9000, term9000.getClass(), "time", term8934);
        setField(term8949, term8949.getClass(), "start", term9000);
        setIntField(term9006, term9006.getClass(), "year", 2005);
        setShortField(term9006, term9006.getClass(), "month", (short) 1);
        setShortField(term9006, term9006.getClass(), "day", (short) 1);
        setField(term9005, term9005.getClass(), "date", term9006);
        setField(term9005, term9005.getClass(), "time", term8934);
        setField(term8949, term8949.getClass(), "end", term9005);
        setIntField(term9011, term9011.getClass(), "year", 2005);
        setShortField(term9011, term9011.getClass(), "month", (short) 1);
        setShortField(term9011, term9011.getClass(), "day", (short) 1);
        setField(term9010, term9010.getClass(), "date", term9011);
        setField(term9010, term9010.getClass(), "time", term8934);
        setField(term8949, term8949.getClass(), "createDate", term9010);
        setField(term8848, term8848.getClass(), "secondFesta", term8949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarts", argTypes, term8848, args);
    }

};


