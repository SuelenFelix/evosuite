package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GameMessage_setType_54792046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13843;
     Object term13878;

    public GameMessage_setType_54792046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13843 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13873 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13843, term13843.getClass(), "id", -2138825831);
        setIntField(term13843, term13843.getClass(), "type", 1454781562);
        setField(term13843, term13843.getClass(), "message", "QITgiBrmfj");
        setIntField(term13859, term13859.getClass(), "year", 2029);
        setShortField(term13859, term13859.getClass(), "month", (short) 5);
        setShortField(term13859, term13859.getClass(), "day", (short) 11);
        setField(term13858, term13858.getClass(), "date", term13859);
        setByteField(term13863, term13863.getClass(), "hour", (byte) 20);
        setByteField(term13863, term13863.getClass(), "minute", (byte) 17);
        setByteField(term13863, term13863.getClass(), "second", (byte) 32);
        setIntField(term13863, term13863.getClass(), "nano", 327503582);
        setField(term13858, term13858.getClass(), "time", term13863);
        setField(term13843, term13843.getClass(), "startDate", term13858);
        setIntField(term13869, term13869.getClass(), "year", 2012);
        setShortField(term13869, term13869.getClass(), "month", (short) 10);
        setShortField(term13869, term13869.getClass(), "day", (short) 1);
        setField(term13868, term13868.getClass(), "date", term13869);
        setByteField(term13873, term13873.getClass(), "hour", (byte) 9);
        setByteField(term13873, term13873.getClass(), "minute", (byte) 27);
        setByteField(term13873, term13873.getClass(), "second", (byte) 33);
        setIntField(term13873, term13873.getClass(), "nano", 714912000);
        setField(term13868, term13868.getClass(), "time", term13873);
        setField(term13843, term13843.getClass(), "endDate", term13868);
        term13878 = new Integer(-27944011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13878;
        callMethod(klass, "setType", argTypes, term13843, args);
    }

};


