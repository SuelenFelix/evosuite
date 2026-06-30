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

public class FestaCollection_getAddVps_17350824739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7230;

    public FestaCollection_getAddVps_17350824739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7401 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term7400 = ((Class) term7401).getDeclaredField((String) "PINK_FESTA");
        ((Field) term7400).setAccessible(true);
        Object enum18 = ((Field) term7400).get((Object) null);
        Class<? extends Object> term7683 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term7682 = ((Class) term7683).getDeclaredField((String) "UNDEFINED");
        ((Field) term7682).setAccessible(true);
        Object enum19 = ((Field) term7682).get((Object) null);
        Integer term7307 = new Integer(0);
        Integer term7309 = new Integer(1);
        Integer term7378 = new Integer(0);
        Integer term7380 = new Integer(1);
        term7230 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term7231 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term7311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7316 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7331 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term7382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7393 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term7231, term7231.getClass(), "id", -1);
        setBooleanField(term7231, term7231.getClass(), "enable", true);
        setField(term7231, term7231.getClass(), "name", "xxx");
        setField(term7231, term7231.getClass(), "kind", enum18);
        setField(term7231, term7231.getClass(), "difficulty", enum19);
        setField(term7231, term7231.getClass(), "pvList", "ALL");
        setField(term7231, term7231.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term7231, term7231.getClass(), "addVP", term7307);
        setField(term7231, term7231.getClass(), "vpMultiplier", term7309);
        setIntField(term7312, term7312.getClass(), "year", 2005);
        setShortField(term7312, term7312.getClass(), "month", (short) 1);
        setShortField(term7312, term7312.getClass(), "day", (short) 1);
        setField(term7311, term7311.getClass(), "date", term7312);
        setByteField(term7316, term7316.getClass(), "hour", (byte) 0);
        setByteField(term7316, term7316.getClass(), "minute", (byte) 0);
        setByteField(term7316, term7316.getClass(), "second", (byte) 0);
        setIntField(term7316, term7316.getClass(), "nano", 0);
        setField(term7311, term7311.getClass(), "time", term7316);
        setField(term7231, term7231.getClass(), "start", term7311);
        setIntField(term7322, term7322.getClass(), "year", 2005);
        setShortField(term7322, term7322.getClass(), "month", (short) 1);
        setShortField(term7322, term7322.getClass(), "day", (short) 1);
        setField(term7321, term7321.getClass(), "date", term7322);
        setField(term7321, term7321.getClass(), "time", term7316);
        setField(term7231, term7231.getClass(), "end", term7321);
        setIntField(term7327, term7327.getClass(), "year", 2005);
        setShortField(term7327, term7327.getClass(), "month", (short) 1);
        setShortField(term7327, term7327.getClass(), "day", (short) 1);
        setField(term7326, term7326.getClass(), "date", term7327);
        setField(term7326, term7326.getClass(), "time", term7316);
        setField(term7231, term7231.getClass(), "createDate", term7326);
        setField(term7230, term7230.getClass(), "firstFesta", term7231);
        setIntField(term7331, term7331.getClass(), "id", -1);
        setBooleanField(term7331, term7331.getClass(), "enable", true);
        setField(term7331, term7331.getClass(), "name", "xxx");
        setField(term7331, term7331.getClass(), "kind", enum18);
        setField(term7331, term7331.getClass(), "difficulty", enum19);
        setField(term7331, term7331.getClass(), "pvList", "ALL");
        setField(term7331, term7331.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term7331, term7331.getClass(), "addVP", term7378);
        setField(term7331, term7331.getClass(), "vpMultiplier", term7380);
        setIntField(term7383, term7383.getClass(), "year", 2005);
        setShortField(term7383, term7383.getClass(), "month", (short) 1);
        setShortField(term7383, term7383.getClass(), "day", (short) 1);
        setField(term7382, term7382.getClass(), "date", term7383);
        setField(term7382, term7382.getClass(), "time", term7316);
        setField(term7331, term7331.getClass(), "start", term7382);
        setIntField(term7388, term7388.getClass(), "year", 2005);
        setShortField(term7388, term7388.getClass(), "month", (short) 1);
        setShortField(term7388, term7388.getClass(), "day", (short) 1);
        setField(term7387, term7387.getClass(), "date", term7388);
        setField(term7387, term7387.getClass(), "time", term7316);
        setField(term7331, term7331.getClass(), "end", term7387);
        setIntField(term7393, term7393.getClass(), "year", 2005);
        setShortField(term7393, term7393.getClass(), "month", (short) 1);
        setShortField(term7393, term7393.getClass(), "day", (short) 1);
        setField(term7392, term7392.getClass(), "date", term7393);
        setField(term7392, term7392.getClass(), "time", term7316);
        setField(term7331, term7331.getClass(), "createDate", term7392);
        setField(term7230, term7230.getClass(), "secondFesta", term7331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddVps", argTypes, term7230, args);
    }

};


