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

public class FestaCollection_getAttr_11902009628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6421;

    public FestaCollection_getAttr_11902009628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6592 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term6591 = ((Class) term6592).getDeclaredField((String) "PINK_FESTA");
        ((Field) term6591).setAccessible(true);
        Object enum16 = ((Field) term6591).get((Object) null);
        Class<? extends Object> term6874 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term6873 = ((Class) term6874).getDeclaredField((String) "UNDEFINED");
        ((Field) term6873).setAccessible(true);
        Object enum17 = ((Field) term6873).get((Object) null);
        Integer term6498 = new Integer(0);
        Integer term6500 = new Integer(1);
        Integer term6569 = new Integer(0);
        Integer term6571 = new Integer(1);
        term6421 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term6422 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term6502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6507 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6522 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term6573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6578 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6579 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6584 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term6422, term6422.getClass(), "id", -1);
        setBooleanField(term6422, term6422.getClass(), "enable", true);
        setField(term6422, term6422.getClass(), "name", "xxx");
        setField(term6422, term6422.getClass(), "kind", enum16);
        setField(term6422, term6422.getClass(), "difficulty", enum17);
        setField(term6422, term6422.getClass(), "pvList", "ALL");
        setField(term6422, term6422.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term6422, term6422.getClass(), "addVP", term6498);
        setField(term6422, term6422.getClass(), "vpMultiplier", term6500);
        setIntField(term6503, term6503.getClass(), "year", 2005);
        setShortField(term6503, term6503.getClass(), "month", (short) 1);
        setShortField(term6503, term6503.getClass(), "day", (short) 1);
        setField(term6502, term6502.getClass(), "date", term6503);
        setByteField(term6507, term6507.getClass(), "hour", (byte) 0);
        setByteField(term6507, term6507.getClass(), "minute", (byte) 0);
        setByteField(term6507, term6507.getClass(), "second", (byte) 0);
        setIntField(term6507, term6507.getClass(), "nano", 0);
        setField(term6502, term6502.getClass(), "time", term6507);
        setField(term6422, term6422.getClass(), "start", term6502);
        setIntField(term6513, term6513.getClass(), "year", 2005);
        setShortField(term6513, term6513.getClass(), "month", (short) 1);
        setShortField(term6513, term6513.getClass(), "day", (short) 1);
        setField(term6512, term6512.getClass(), "date", term6513);
        setField(term6512, term6512.getClass(), "time", term6507);
        setField(term6422, term6422.getClass(), "end", term6512);
        setIntField(term6518, term6518.getClass(), "year", 2005);
        setShortField(term6518, term6518.getClass(), "month", (short) 1);
        setShortField(term6518, term6518.getClass(), "day", (short) 1);
        setField(term6517, term6517.getClass(), "date", term6518);
        setField(term6517, term6517.getClass(), "time", term6507);
        setField(term6422, term6422.getClass(), "createDate", term6517);
        setField(term6421, term6421.getClass(), "firstFesta", term6422);
        setIntField(term6522, term6522.getClass(), "id", -1);
        setBooleanField(term6522, term6522.getClass(), "enable", true);
        setField(term6522, term6522.getClass(), "name", "xxx");
        setField(term6522, term6522.getClass(), "kind", enum16);
        setField(term6522, term6522.getClass(), "difficulty", enum17);
        setField(term6522, term6522.getClass(), "pvList", "ALL");
        setField(term6522, term6522.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term6522, term6522.getClass(), "addVP", term6569);
        setField(term6522, term6522.getClass(), "vpMultiplier", term6571);
        setIntField(term6574, term6574.getClass(), "year", 2005);
        setShortField(term6574, term6574.getClass(), "month", (short) 1);
        setShortField(term6574, term6574.getClass(), "day", (short) 1);
        setField(term6573, term6573.getClass(), "date", term6574);
        setField(term6573, term6573.getClass(), "time", term6507);
        setField(term6522, term6522.getClass(), "start", term6573);
        setIntField(term6579, term6579.getClass(), "year", 2005);
        setShortField(term6579, term6579.getClass(), "month", (short) 1);
        setShortField(term6579, term6579.getClass(), "day", (short) 1);
        setField(term6578, term6578.getClass(), "date", term6579);
        setField(term6578, term6578.getClass(), "time", term6507);
        setField(term6522, term6522.getClass(), "end", term6578);
        setIntField(term6584, term6584.getClass(), "year", 2005);
        setShortField(term6584, term6584.getClass(), "month", (short) 1);
        setShortField(term6584, term6584.getClass(), "day", (short) 1);
        setField(term6583, term6583.getClass(), "date", term6584);
        setField(term6583, term6583.getClass(), "time", term6507);
        setField(term6522, term6522.getClass(), "createDate", term6583);
        setField(term6421, term6421.getClass(), "secondFesta", term6522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttr", argTypes, term6421, args);
    }

};


