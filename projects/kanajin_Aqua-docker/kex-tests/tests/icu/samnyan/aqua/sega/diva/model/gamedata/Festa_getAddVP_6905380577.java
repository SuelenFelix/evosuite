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

public class Festa_getAddVP_6905380577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12809;

    public Festa_getAddVP_6905380577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12913 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term12912 = ((Class) term12913).getDeclaredField((String) "PINK_FESTA");
        ((Field) term12912).setAccessible(true);
        Object enum14 = ((Field) term12912).get((Object) null);
        Class<? extends Object> term13195 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term13194 = ((Class) term13195).getDeclaredField((String) "UNDEFINED");
        ((Field) term13194).setAccessible(true);
        Object enum15 = ((Field) term13194).get((Object) null);
        Integer term12885 = new Integer(0);
        Integer term12887 = new Integer(1);
        term12809 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term12889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12894 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12905 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12809, term12809.getClass(), "id", -1);
        setBooleanField(term12809, term12809.getClass(), "enable", true);
        setField(term12809, term12809.getClass(), "name", "xxx");
        setField(term12809, term12809.getClass(), "kind", enum14);
        setField(term12809, term12809.getClass(), "difficulty", enum15);
        setField(term12809, term12809.getClass(), "pvList", "ALL");
        setField(term12809, term12809.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term12809, term12809.getClass(), "addVP", term12885);
        setField(term12809, term12809.getClass(), "vpMultiplier", term12887);
        setIntField(term12890, term12890.getClass(), "year", 2005);
        setShortField(term12890, term12890.getClass(), "month", (short) 1);
        setShortField(term12890, term12890.getClass(), "day", (short) 1);
        setField(term12889, term12889.getClass(), "date", term12890);
        setByteField(term12894, term12894.getClass(), "hour", (byte) 0);
        setByteField(term12894, term12894.getClass(), "minute", (byte) 0);
        setByteField(term12894, term12894.getClass(), "second", (byte) 0);
        setIntField(term12894, term12894.getClass(), "nano", 0);
        setField(term12889, term12889.getClass(), "time", term12894);
        setField(term12809, term12809.getClass(), "start", term12889);
        setIntField(term12900, term12900.getClass(), "year", 2005);
        setShortField(term12900, term12900.getClass(), "month", (short) 1);
        setShortField(term12900, term12900.getClass(), "day", (short) 1);
        setField(term12899, term12899.getClass(), "date", term12900);
        setField(term12899, term12899.getClass(), "time", term12894);
        setField(term12809, term12809.getClass(), "end", term12899);
        setIntField(term12905, term12905.getClass(), "year", 2005);
        setShortField(term12905, term12905.getClass(), "month", (short) 1);
        setShortField(term12905, term12905.getClass(), "day", (short) 1);
        setField(term12904, term12904.getClass(), "date", term12905);
        setField(term12904, term12904.getClass(), "time", term12894);
        setField(term12809, term12809.getClass(), "createDate", term12904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddVP", argTypes, term12809, args);
    }

};


