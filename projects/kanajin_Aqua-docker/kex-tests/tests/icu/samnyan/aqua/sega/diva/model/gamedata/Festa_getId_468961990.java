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

public class Festa_getId_468961990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7795;

    public Festa_getId_468961990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7930 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term7929 = ((Class) term7930).getDeclaredField((String) "PINK_FESTA");
        ((Field) term7929).setAccessible(true);
        Object enum0 = ((Field) term7929).get((Object) null);
        Class<? extends Object> term8267 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term8266 = ((Class) term8267).getDeclaredField((String) "UNDEFINED");
        ((Field) term8266).setAccessible(true);
        Object enum1 = ((Field) term8266).get((Object) null);
        Integer term7871 = new Integer(0);
        Integer term7873 = new Integer(1);
        term7795 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term7875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7890 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7891 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term7795, term7795.getClass(), "id", -1);
        setBooleanField(term7795, term7795.getClass(), "enable", true);
        setField(term7795, term7795.getClass(), "name", "xxx");
        setField(term7795, term7795.getClass(), "kind", enum0);
        setField(term7795, term7795.getClass(), "difficulty", enum1);
        setField(term7795, term7795.getClass(), "pvList", "ALL");
        setField(term7795, term7795.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term7795, term7795.getClass(), "addVP", term7871);
        setField(term7795, term7795.getClass(), "vpMultiplier", term7873);
        setIntField(term7876, term7876.getClass(), "year", 2005);
        setShortField(term7876, term7876.getClass(), "month", (short) 1);
        setShortField(term7876, term7876.getClass(), "day", (short) 1);
        setField(term7875, term7875.getClass(), "date", term7876);
        setByteField(term7880, term7880.getClass(), "hour", (byte) 0);
        setByteField(term7880, term7880.getClass(), "minute", (byte) 0);
        setByteField(term7880, term7880.getClass(), "second", (byte) 0);
        setIntField(term7880, term7880.getClass(), "nano", 0);
        setField(term7875, term7875.getClass(), "time", term7880);
        setField(term7795, term7795.getClass(), "start", term7875);
        setIntField(term7886, term7886.getClass(), "year", 2005);
        setShortField(term7886, term7886.getClass(), "month", (short) 1);
        setShortField(term7886, term7886.getClass(), "day", (short) 1);
        setField(term7885, term7885.getClass(), "date", term7886);
        setField(term7885, term7885.getClass(), "time", term7880);
        setField(term7795, term7795.getClass(), "end", term7885);
        setIntField(term7891, term7891.getClass(), "year", 2005);
        setShortField(term7891, term7891.getClass(), "month", (short) 1);
        setShortField(term7891, term7891.getClass(), "day", (short) 1);
        setField(term7890, term7890.getClass(), "date", term7891);
        setField(term7890, term7890.getClass(), "time", term7880);
        setField(term7795, term7795.getClass(), "createDate", term7890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7795, args);
    }

};


