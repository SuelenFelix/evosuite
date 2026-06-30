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

public class Festa_setVpMultiplier_45331435120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22319;
     Object term22419;

    public Festa_setVpMultiplier_45331435120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22425 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term22424 = ((Class) term22425).getDeclaredField((String) "PINK_FESTA");
        ((Field) term22424).setAccessible(true);
        Object enum41 = ((Field) term22424).get((Object) null);
        Class<? extends Object> term22707 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term22706 = ((Class) term22707).getDeclaredField((String) "UNDEFINED");
        ((Field) term22706).setAccessible(true);
        Object enum42 = ((Field) term22706).get((Object) null);
        Integer term22395 = new Integer(0);
        Integer term22397 = new Integer(1);
        term22319 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term22399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22404 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22415 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22319, term22319.getClass(), "id", -1);
        setBooleanField(term22319, term22319.getClass(), "enable", true);
        setField(term22319, term22319.getClass(), "name", "xxx");
        setField(term22319, term22319.getClass(), "kind", enum41);
        setField(term22319, term22319.getClass(), "difficulty", enum42);
        setField(term22319, term22319.getClass(), "pvList", "ALL");
        setField(term22319, term22319.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term22319, term22319.getClass(), "addVP", term22395);
        setField(term22319, term22319.getClass(), "vpMultiplier", term22397);
        setIntField(term22400, term22400.getClass(), "year", 2005);
        setShortField(term22400, term22400.getClass(), "month", (short) 1);
        setShortField(term22400, term22400.getClass(), "day", (short) 1);
        setField(term22399, term22399.getClass(), "date", term22400);
        setByteField(term22404, term22404.getClass(), "hour", (byte) 0);
        setByteField(term22404, term22404.getClass(), "minute", (byte) 0);
        setByteField(term22404, term22404.getClass(), "second", (byte) 0);
        setIntField(term22404, term22404.getClass(), "nano", 0);
        setField(term22399, term22399.getClass(), "time", term22404);
        setField(term22319, term22319.getClass(), "start", term22399);
        setIntField(term22410, term22410.getClass(), "year", 2005);
        setShortField(term22410, term22410.getClass(), "month", (short) 1);
        setShortField(term22410, term22410.getClass(), "day", (short) 1);
        setField(term22409, term22409.getClass(), "date", term22410);
        setField(term22409, term22409.getClass(), "time", term22404);
        setField(term22319, term22319.getClass(), "end", term22409);
        setIntField(term22415, term22415.getClass(), "year", 2005);
        setShortField(term22415, term22415.getClass(), "month", (short) 1);
        setShortField(term22415, term22415.getClass(), "day", (short) 1);
        setField(term22414, term22414.getClass(), "date", term22415);
        setField(term22414, term22414.getClass(), "time", term22404);
        setField(term22319, term22319.getClass(), "createDate", term22414);
        term22419 = new Integer(-932147928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term22419;
        callMethod(klass, "setVpMultiplier", argTypes, term22319, args);
    }

};


