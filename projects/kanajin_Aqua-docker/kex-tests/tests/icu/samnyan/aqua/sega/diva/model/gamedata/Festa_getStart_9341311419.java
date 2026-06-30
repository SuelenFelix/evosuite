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

public class Festa_getStart_9341311419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14217;

    public Festa_getStart_9341311419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14321 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term14320 = ((Class) term14321).getDeclaredField((String) "PINK_FESTA");
        ((Field) term14320).setAccessible(true);
        Object enum18 = ((Field) term14320).get((Object) null);
        Class<? extends Object> term14603 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term14602 = ((Class) term14603).getDeclaredField((String) "UNDEFINED");
        ((Field) term14602).setAccessible(true);
        Object enum19 = ((Field) term14602).get((Object) null);
        Integer term14293 = new Integer(0);
        Integer term14295 = new Integer(1);
        term14217 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term14297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14302 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14313 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term14217, term14217.getClass(), "id", -1);
        setBooleanField(term14217, term14217.getClass(), "enable", true);
        setField(term14217, term14217.getClass(), "name", "xxx");
        setField(term14217, term14217.getClass(), "kind", enum18);
        setField(term14217, term14217.getClass(), "difficulty", enum19);
        setField(term14217, term14217.getClass(), "pvList", "ALL");
        setField(term14217, term14217.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term14217, term14217.getClass(), "addVP", term14293);
        setField(term14217, term14217.getClass(), "vpMultiplier", term14295);
        setIntField(term14298, term14298.getClass(), "year", 2005);
        setShortField(term14298, term14298.getClass(), "month", (short) 1);
        setShortField(term14298, term14298.getClass(), "day", (short) 1);
        setField(term14297, term14297.getClass(), "date", term14298);
        setByteField(term14302, term14302.getClass(), "hour", (byte) 0);
        setByteField(term14302, term14302.getClass(), "minute", (byte) 0);
        setByteField(term14302, term14302.getClass(), "second", (byte) 0);
        setIntField(term14302, term14302.getClass(), "nano", 0);
        setField(term14297, term14297.getClass(), "time", term14302);
        setField(term14217, term14217.getClass(), "start", term14297);
        setIntField(term14308, term14308.getClass(), "year", 2005);
        setShortField(term14308, term14308.getClass(), "month", (short) 1);
        setShortField(term14308, term14308.getClass(), "day", (short) 1);
        setField(term14307, term14307.getClass(), "date", term14308);
        setField(term14307, term14307.getClass(), "time", term14302);
        setField(term14217, term14217.getClass(), "end", term14307);
        setIntField(term14313, term14313.getClass(), "year", 2005);
        setShortField(term14313, term14313.getClass(), "month", (short) 1);
        setShortField(term14313, term14313.getClass(), "day", (short) 1);
        setField(term14312, term14312.getClass(), "date", term14313);
        setField(term14312, term14312.getClass(), "time", term14302);
        setField(term14217, term14217.getClass(), "createDate", term14312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart", argTypes, term14217, args);
    }

};


