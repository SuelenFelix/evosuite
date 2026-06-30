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

public class Festa_getKind_4079053963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9993;

    public Festa_getKind_4079053963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10097 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term10096 = ((Class) term10097).getDeclaredField((String) "PINK_FESTA");
        ((Field) term10096).setAccessible(true);
        Object enum6 = ((Field) term10096).get((Object) null);
        Class<? extends Object> term10379 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term10378 = ((Class) term10379).getDeclaredField((String) "UNDEFINED");
        ((Field) term10378).setAccessible(true);
        Object enum7 = ((Field) term10378).get((Object) null);
        Integer term10069 = new Integer(0);
        Integer term10071 = new Integer(1);
        term9993 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term10073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10078 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10089 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term9993, term9993.getClass(), "id", -1);
        setBooleanField(term9993, term9993.getClass(), "enable", true);
        setField(term9993, term9993.getClass(), "name", "xxx");
        setField(term9993, term9993.getClass(), "kind", enum6);
        setField(term9993, term9993.getClass(), "difficulty", enum7);
        setField(term9993, term9993.getClass(), "pvList", "ALL");
        setField(term9993, term9993.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term9993, term9993.getClass(), "addVP", term10069);
        setField(term9993, term9993.getClass(), "vpMultiplier", term10071);
        setIntField(term10074, term10074.getClass(), "year", 2005);
        setShortField(term10074, term10074.getClass(), "month", (short) 1);
        setShortField(term10074, term10074.getClass(), "day", (short) 1);
        setField(term10073, term10073.getClass(), "date", term10074);
        setByteField(term10078, term10078.getClass(), "hour", (byte) 0);
        setByteField(term10078, term10078.getClass(), "minute", (byte) 0);
        setByteField(term10078, term10078.getClass(), "second", (byte) 0);
        setIntField(term10078, term10078.getClass(), "nano", 0);
        setField(term10073, term10073.getClass(), "time", term10078);
        setField(term9993, term9993.getClass(), "start", term10073);
        setIntField(term10084, term10084.getClass(), "year", 2005);
        setShortField(term10084, term10084.getClass(), "month", (short) 1);
        setShortField(term10084, term10084.getClass(), "day", (short) 1);
        setField(term10083, term10083.getClass(), "date", term10084);
        setField(term10083, term10083.getClass(), "time", term10078);
        setField(term9993, term9993.getClass(), "end", term10083);
        setIntField(term10089, term10089.getClass(), "year", 2005);
        setShortField(term10089, term10089.getClass(), "month", (short) 1);
        setShortField(term10089, term10089.getClass(), "day", (short) 1);
        setField(term10088, term10088.getClass(), "date", term10089);
        setField(term10088, term10088.getClass(), "time", term10078);
        setField(term9993, term9993.getClass(), "createDate", term10088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKind", argTypes, term9993, args);
    }

};


