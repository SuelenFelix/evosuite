package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Festa_setName_30849699814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17741;

    public Festa_setName_30849699814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17857 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term17856 = ((Class) term17857).getDeclaredField((String) "PINK_FESTA");
        ((Field) term17856).setAccessible(true);
        Object enum28 = ((Field) term17856).get((Object) null);
        Class<? extends Object> term18139 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term18138 = ((Class) term18139).getDeclaredField((String) "UNDEFINED");
        ((Field) term18138).setAccessible(true);
        Object enum29 = ((Field) term18138).get((Object) null);
        Integer term17817 = new Integer(0);
        Integer term17819 = new Integer(1);
        term17741 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term17821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17837 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17741, term17741.getClass(), "id", -1);
        setBooleanField(term17741, term17741.getClass(), "enable", true);
        setField(term17741, term17741.getClass(), "name", "xxx");
        setField(term17741, term17741.getClass(), "kind", enum28);
        setField(term17741, term17741.getClass(), "difficulty", enum29);
        setField(term17741, term17741.getClass(), "pvList", "ALL");
        setField(term17741, term17741.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term17741, term17741.getClass(), "addVP", term17817);
        setField(term17741, term17741.getClass(), "vpMultiplier", term17819);
        setIntField(term17822, term17822.getClass(), "year", 2005);
        setShortField(term17822, term17822.getClass(), "month", (short) 1);
        setShortField(term17822, term17822.getClass(), "day", (short) 1);
        setField(term17821, term17821.getClass(), "date", term17822);
        setByteField(term17826, term17826.getClass(), "hour", (byte) 0);
        setByteField(term17826, term17826.getClass(), "minute", (byte) 0);
        setByteField(term17826, term17826.getClass(), "second", (byte) 0);
        setIntField(term17826, term17826.getClass(), "nano", 0);
        setField(term17821, term17821.getClass(), "time", term17826);
        setField(term17741, term17741.getClass(), "start", term17821);
        setIntField(term17832, term17832.getClass(), "year", 2005);
        setShortField(term17832, term17832.getClass(), "month", (short) 1);
        setShortField(term17832, term17832.getClass(), "day", (short) 1);
        setField(term17831, term17831.getClass(), "date", term17832);
        setField(term17831, term17831.getClass(), "time", term17826);
        setField(term17741, term17741.getClass(), "end", term17831);
        setIntField(term17837, term17837.getClass(), "year", 2005);
        setShortField(term17837, term17837.getClass(), "month", (short) 1);
        setShortField(term17837, term17837.getClass(), "day", (short) 1);
        setField(term17836, term17836.getClass(), "date", term17837);
        setField(term17836, term17836.getClass(), "time", term17826);
        setField(term17741, term17741.getClass(), "createDate", term17836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VzkPDPPGQl";
        callMethod(klass, "setName", argTypes, term17741, args);
    }

};


