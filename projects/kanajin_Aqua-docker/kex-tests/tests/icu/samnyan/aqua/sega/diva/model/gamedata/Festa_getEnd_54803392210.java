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

public class Festa_getEnd_54803392210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14921;

    public Festa_getEnd_54803392210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15025 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term15024 = ((Class) term15025).getDeclaredField((String) "PINK_FESTA");
        ((Field) term15024).setAccessible(true);
        Object enum20 = ((Field) term15024).get((Object) null);
        Class<? extends Object> term15307 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term15306 = ((Class) term15307).getDeclaredField((String) "UNDEFINED");
        ((Field) term15306).setAccessible(true);
        Object enum21 = ((Field) term15306).get((Object) null);
        Integer term14997 = new Integer(0);
        Integer term14999 = new Integer(1);
        term14921 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term15001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15017 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term14921, term14921.getClass(), "id", -1);
        setBooleanField(term14921, term14921.getClass(), "enable", true);
        setField(term14921, term14921.getClass(), "name", "xxx");
        setField(term14921, term14921.getClass(), "kind", enum20);
        setField(term14921, term14921.getClass(), "difficulty", enum21);
        setField(term14921, term14921.getClass(), "pvList", "ALL");
        setField(term14921, term14921.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term14921, term14921.getClass(), "addVP", term14997);
        setField(term14921, term14921.getClass(), "vpMultiplier", term14999);
        setIntField(term15002, term15002.getClass(), "year", 2005);
        setShortField(term15002, term15002.getClass(), "month", (short) 1);
        setShortField(term15002, term15002.getClass(), "day", (short) 1);
        setField(term15001, term15001.getClass(), "date", term15002);
        setByteField(term15006, term15006.getClass(), "hour", (byte) 0);
        setByteField(term15006, term15006.getClass(), "minute", (byte) 0);
        setByteField(term15006, term15006.getClass(), "second", (byte) 0);
        setIntField(term15006, term15006.getClass(), "nano", 0);
        setField(term15001, term15001.getClass(), "time", term15006);
        setField(term14921, term14921.getClass(), "start", term15001);
        setIntField(term15012, term15012.getClass(), "year", 2005);
        setShortField(term15012, term15012.getClass(), "month", (short) 1);
        setShortField(term15012, term15012.getClass(), "day", (short) 1);
        setField(term15011, term15011.getClass(), "date", term15012);
        setField(term15011, term15011.getClass(), "time", term15006);
        setField(term14921, term14921.getClass(), "end", term15011);
        setIntField(term15017, term15017.getClass(), "year", 2005);
        setShortField(term15017, term15017.getClass(), "month", (short) 1);
        setShortField(term15017, term15017.getClass(), "day", (short) 1);
        setField(term15016, term15016.getClass(), "date", term15017);
        setField(term15016, term15016.getClass(), "time", term15006);
        setField(term14921, term14921.getClass(), "createDate", term15016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnd", argTypes, term14921, args);
    }

};


