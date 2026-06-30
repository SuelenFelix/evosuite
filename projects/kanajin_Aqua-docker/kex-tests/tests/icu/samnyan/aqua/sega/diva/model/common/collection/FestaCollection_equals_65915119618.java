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

public class FestaCollection_equals_65915119618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14719;
     Object term14886;

    public FestaCollection_equals_65915119618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14891 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term14890 = ((Class) term14891).getDeclaredField((String) "PINK_FESTA");
        ((Field) term14890).setAccessible(true);
        Object enum36 = ((Field) term14890).get((Object) null);
        Class<? extends Object> term15173 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term15172 = ((Class) term15173).getDeclaredField((String) "UNDEFINED");
        ((Field) term15172).setAccessible(true);
        Object enum37 = ((Field) term15172).get((Object) null);
        Integer term14796 = new Integer(0);
        Integer term14798 = new Integer(1);
        Integer term14867 = new Integer(0);
        Integer term14869 = new Integer(1);
        term14719 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term14720 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term14800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14820 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term14871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14882 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term14720, term14720.getClass(), "id", -1);
        setBooleanField(term14720, term14720.getClass(), "enable", true);
        setField(term14720, term14720.getClass(), "name", "xxx");
        setField(term14720, term14720.getClass(), "kind", enum36);
        setField(term14720, term14720.getClass(), "difficulty", enum37);
        setField(term14720, term14720.getClass(), "pvList", "ALL");
        setField(term14720, term14720.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term14720, term14720.getClass(), "addVP", term14796);
        setField(term14720, term14720.getClass(), "vpMultiplier", term14798);
        setIntField(term14801, term14801.getClass(), "year", 2005);
        setShortField(term14801, term14801.getClass(), "month", (short) 1);
        setShortField(term14801, term14801.getClass(), "day", (short) 1);
        setField(term14800, term14800.getClass(), "date", term14801);
        setByteField(term14805, term14805.getClass(), "hour", (byte) 0);
        setByteField(term14805, term14805.getClass(), "minute", (byte) 0);
        setByteField(term14805, term14805.getClass(), "second", (byte) 0);
        setIntField(term14805, term14805.getClass(), "nano", 0);
        setField(term14800, term14800.getClass(), "time", term14805);
        setField(term14720, term14720.getClass(), "start", term14800);
        setIntField(term14811, term14811.getClass(), "year", 2005);
        setShortField(term14811, term14811.getClass(), "month", (short) 1);
        setShortField(term14811, term14811.getClass(), "day", (short) 1);
        setField(term14810, term14810.getClass(), "date", term14811);
        setField(term14810, term14810.getClass(), "time", term14805);
        setField(term14720, term14720.getClass(), "end", term14810);
        setIntField(term14816, term14816.getClass(), "year", 2005);
        setShortField(term14816, term14816.getClass(), "month", (short) 1);
        setShortField(term14816, term14816.getClass(), "day", (short) 1);
        setField(term14815, term14815.getClass(), "date", term14816);
        setField(term14815, term14815.getClass(), "time", term14805);
        setField(term14720, term14720.getClass(), "createDate", term14815);
        setField(term14719, term14719.getClass(), "firstFesta", term14720);
        setIntField(term14820, term14820.getClass(), "id", -1);
        setBooleanField(term14820, term14820.getClass(), "enable", true);
        setField(term14820, term14820.getClass(), "name", "xxx");
        setField(term14820, term14820.getClass(), "kind", enum36);
        setField(term14820, term14820.getClass(), "difficulty", enum37);
        setField(term14820, term14820.getClass(), "pvList", "ALL");
        setField(term14820, term14820.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term14820, term14820.getClass(), "addVP", term14867);
        setField(term14820, term14820.getClass(), "vpMultiplier", term14869);
        setIntField(term14872, term14872.getClass(), "year", 2005);
        setShortField(term14872, term14872.getClass(), "month", (short) 1);
        setShortField(term14872, term14872.getClass(), "day", (short) 1);
        setField(term14871, term14871.getClass(), "date", term14872);
        setField(term14871, term14871.getClass(), "time", term14805);
        setField(term14820, term14820.getClass(), "start", term14871);
        setIntField(term14877, term14877.getClass(), "year", 2005);
        setShortField(term14877, term14877.getClass(), "month", (short) 1);
        setShortField(term14877, term14877.getClass(), "day", (short) 1);
        setField(term14876, term14876.getClass(), "date", term14877);
        setField(term14876, term14876.getClass(), "time", term14805);
        setField(term14820, term14820.getClass(), "end", term14876);
        setIntField(term14882, term14882.getClass(), "year", 2005);
        setShortField(term14882, term14882.getClass(), "month", (short) 1);
        setShortField(term14882, term14882.getClass(), "day", (short) 1);
        setField(term14881, term14881.getClass(), "date", term14882);
        setField(term14881, term14881.getClass(), "time", term14805);
        setField(term14820, term14820.getClass(), "createDate", term14881);
        setField(term14719, term14719.getClass(), "secondFesta", term14820);
        term14886 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14886;
        callMethod(klass, "equals", argTypes, term14719, args);
    }

};


