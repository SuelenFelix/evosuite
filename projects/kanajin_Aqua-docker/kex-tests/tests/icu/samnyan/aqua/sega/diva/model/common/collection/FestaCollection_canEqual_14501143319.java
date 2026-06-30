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

public class FestaCollection_canEqual_14501143319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15529;
     Object term15696;

    public FestaCollection_canEqual_14501143319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15701 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term15700 = ((Class) term15701).getDeclaredField((String) "PINK_FESTA");
        ((Field) term15700).setAccessible(true);
        Object enum38 = ((Field) term15700).get((Object) null);
        Class<? extends Object> term15983 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term15982 = ((Class) term15983).getDeclaredField((String) "UNDEFINED");
        ((Field) term15982).setAccessible(true);
        Object enum39 = ((Field) term15982).get((Object) null);
        Integer term15606 = new Integer(0);
        Integer term15608 = new Integer(1);
        Integer term15677 = new Integer(0);
        Integer term15679 = new Integer(1);
        term15529 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term15530 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term15610 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15611 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15615 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15625 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15626 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15630 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term15681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15686 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15687 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15692 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term15530, term15530.getClass(), "id", -1);
        setBooleanField(term15530, term15530.getClass(), "enable", true);
        setField(term15530, term15530.getClass(), "name", "xxx");
        setField(term15530, term15530.getClass(), "kind", enum38);
        setField(term15530, term15530.getClass(), "difficulty", enum39);
        setField(term15530, term15530.getClass(), "pvList", "ALL");
        setField(term15530, term15530.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term15530, term15530.getClass(), "addVP", term15606);
        setField(term15530, term15530.getClass(), "vpMultiplier", term15608);
        setIntField(term15611, term15611.getClass(), "year", 2005);
        setShortField(term15611, term15611.getClass(), "month", (short) 1);
        setShortField(term15611, term15611.getClass(), "day", (short) 1);
        setField(term15610, term15610.getClass(), "date", term15611);
        setByteField(term15615, term15615.getClass(), "hour", (byte) 0);
        setByteField(term15615, term15615.getClass(), "minute", (byte) 0);
        setByteField(term15615, term15615.getClass(), "second", (byte) 0);
        setIntField(term15615, term15615.getClass(), "nano", 0);
        setField(term15610, term15610.getClass(), "time", term15615);
        setField(term15530, term15530.getClass(), "start", term15610);
        setIntField(term15621, term15621.getClass(), "year", 2005);
        setShortField(term15621, term15621.getClass(), "month", (short) 1);
        setShortField(term15621, term15621.getClass(), "day", (short) 1);
        setField(term15620, term15620.getClass(), "date", term15621);
        setField(term15620, term15620.getClass(), "time", term15615);
        setField(term15530, term15530.getClass(), "end", term15620);
        setIntField(term15626, term15626.getClass(), "year", 2005);
        setShortField(term15626, term15626.getClass(), "month", (short) 1);
        setShortField(term15626, term15626.getClass(), "day", (short) 1);
        setField(term15625, term15625.getClass(), "date", term15626);
        setField(term15625, term15625.getClass(), "time", term15615);
        setField(term15530, term15530.getClass(), "createDate", term15625);
        setField(term15529, term15529.getClass(), "firstFesta", term15530);
        setIntField(term15630, term15630.getClass(), "id", -1);
        setBooleanField(term15630, term15630.getClass(), "enable", true);
        setField(term15630, term15630.getClass(), "name", "xxx");
        setField(term15630, term15630.getClass(), "kind", enum38);
        setField(term15630, term15630.getClass(), "difficulty", enum39);
        setField(term15630, term15630.getClass(), "pvList", "ALL");
        setField(term15630, term15630.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term15630, term15630.getClass(), "addVP", term15677);
        setField(term15630, term15630.getClass(), "vpMultiplier", term15679);
        setIntField(term15682, term15682.getClass(), "year", 2005);
        setShortField(term15682, term15682.getClass(), "month", (short) 1);
        setShortField(term15682, term15682.getClass(), "day", (short) 1);
        setField(term15681, term15681.getClass(), "date", term15682);
        setField(term15681, term15681.getClass(), "time", term15615);
        setField(term15630, term15630.getClass(), "start", term15681);
        setIntField(term15687, term15687.getClass(), "year", 2005);
        setShortField(term15687, term15687.getClass(), "month", (short) 1);
        setShortField(term15687, term15687.getClass(), "day", (short) 1);
        setField(term15686, term15686.getClass(), "date", term15687);
        setField(term15686, term15686.getClass(), "time", term15615);
        setField(term15630, term15630.getClass(), "end", term15686);
        setIntField(term15692, term15692.getClass(), "year", 2005);
        setShortField(term15692, term15692.getClass(), "month", (short) 1);
        setShortField(term15692, term15692.getClass(), "day", (short) 1);
        setField(term15691, term15691.getClass(), "date", term15692);
        setField(term15691, term15691.getClass(), "time", term15615);
        setField(term15630, term15630.getClass(), "createDate", term15691);
        setField(term15529, term15529.getClass(), "secondFesta", term15630);
        term15696 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15696;
        callMethod(klass, "canEqual", argTypes, term15529, args);
    }

};


