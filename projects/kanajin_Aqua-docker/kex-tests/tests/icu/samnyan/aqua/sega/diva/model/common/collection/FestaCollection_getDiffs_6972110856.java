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

public class FestaCollection_getDiffs_6972110856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4803;

    public FestaCollection_getDiffs_6972110856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4974 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term4973 = ((Class) term4974).getDeclaredField((String) "PINK_FESTA");
        ((Field) term4973).setAccessible(true);
        Object enum12 = ((Field) term4973).get((Object) null);
        Class<? extends Object> term5256 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term5255 = ((Class) term5256).getDeclaredField((String) "UNDEFINED");
        ((Field) term5255).setAccessible(true);
        Object enum13 = ((Field) term5255).get((Object) null);
        Integer term4880 = new Integer(0);
        Integer term4882 = new Integer(1);
        Integer term4951 = new Integer(0);
        Integer term4953 = new Integer(1);
        term4803 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term4804 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term4884 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4885 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4889 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4894 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4904 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term4955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4966 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term4804, term4804.getClass(), "id", -1);
        setBooleanField(term4804, term4804.getClass(), "enable", true);
        setField(term4804, term4804.getClass(), "name", "xxx");
        setField(term4804, term4804.getClass(), "kind", enum12);
        setField(term4804, term4804.getClass(), "difficulty", enum13);
        setField(term4804, term4804.getClass(), "pvList", "ALL");
        setField(term4804, term4804.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term4804, term4804.getClass(), "addVP", term4880);
        setField(term4804, term4804.getClass(), "vpMultiplier", term4882);
        setIntField(term4885, term4885.getClass(), "year", 2005);
        setShortField(term4885, term4885.getClass(), "month", (short) 1);
        setShortField(term4885, term4885.getClass(), "day", (short) 1);
        setField(term4884, term4884.getClass(), "date", term4885);
        setByteField(term4889, term4889.getClass(), "hour", (byte) 0);
        setByteField(term4889, term4889.getClass(), "minute", (byte) 0);
        setByteField(term4889, term4889.getClass(), "second", (byte) 0);
        setIntField(term4889, term4889.getClass(), "nano", 0);
        setField(term4884, term4884.getClass(), "time", term4889);
        setField(term4804, term4804.getClass(), "start", term4884);
        setIntField(term4895, term4895.getClass(), "year", 2005);
        setShortField(term4895, term4895.getClass(), "month", (short) 1);
        setShortField(term4895, term4895.getClass(), "day", (short) 1);
        setField(term4894, term4894.getClass(), "date", term4895);
        setField(term4894, term4894.getClass(), "time", term4889);
        setField(term4804, term4804.getClass(), "end", term4894);
        setIntField(term4900, term4900.getClass(), "year", 2005);
        setShortField(term4900, term4900.getClass(), "month", (short) 1);
        setShortField(term4900, term4900.getClass(), "day", (short) 1);
        setField(term4899, term4899.getClass(), "date", term4900);
        setField(term4899, term4899.getClass(), "time", term4889);
        setField(term4804, term4804.getClass(), "createDate", term4899);
        setField(term4803, term4803.getClass(), "firstFesta", term4804);
        setIntField(term4904, term4904.getClass(), "id", -1);
        setBooleanField(term4904, term4904.getClass(), "enable", true);
        setField(term4904, term4904.getClass(), "name", "xxx");
        setField(term4904, term4904.getClass(), "kind", enum12);
        setField(term4904, term4904.getClass(), "difficulty", enum13);
        setField(term4904, term4904.getClass(), "pvList", "ALL");
        setField(term4904, term4904.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term4904, term4904.getClass(), "addVP", term4951);
        setField(term4904, term4904.getClass(), "vpMultiplier", term4953);
        setIntField(term4956, term4956.getClass(), "year", 2005);
        setShortField(term4956, term4956.getClass(), "month", (short) 1);
        setShortField(term4956, term4956.getClass(), "day", (short) 1);
        setField(term4955, term4955.getClass(), "date", term4956);
        setField(term4955, term4955.getClass(), "time", term4889);
        setField(term4904, term4904.getClass(), "start", term4955);
        setIntField(term4961, term4961.getClass(), "year", 2005);
        setShortField(term4961, term4961.getClass(), "month", (short) 1);
        setShortField(term4961, term4961.getClass(), "day", (short) 1);
        setField(term4960, term4960.getClass(), "date", term4961);
        setField(term4960, term4960.getClass(), "time", term4889);
        setField(term4904, term4904.getClass(), "end", term4960);
        setIntField(term4966, term4966.getClass(), "year", 2005);
        setShortField(term4966, term4966.getClass(), "month", (short) 1);
        setShortField(term4966, term4966.getClass(), "day", (short) 1);
        setField(term4965, term4965.getClass(), "date", term4966);
        setField(term4965, term4965.getClass(), "time", term4889);
        setField(term4904, term4904.getClass(), "createDate", term4965);
        setField(term4803, term4803.getClass(), "secondFesta", term4904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiffs", argTypes, term4803, args);
    }

};


