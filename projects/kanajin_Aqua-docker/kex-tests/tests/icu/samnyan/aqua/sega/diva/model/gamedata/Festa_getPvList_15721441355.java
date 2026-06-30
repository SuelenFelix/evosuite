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

public class Festa_getPvList_15721441355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11401;

    public Festa_getPvList_15721441355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11505 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term11504 = ((Class) term11505).getDeclaredField((String) "PINK_FESTA");
        ((Field) term11504).setAccessible(true);
        Object enum10 = ((Field) term11504).get((Object) null);
        Class<? extends Object> term11787 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term11786 = ((Class) term11787).getDeclaredField((String) "UNDEFINED");
        ((Field) term11786).setAccessible(true);
        Object enum11 = ((Field) term11786).get((Object) null);
        Integer term11477 = new Integer(0);
        Integer term11479 = new Integer(1);
        term11401 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term11481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11491 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11492 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11497 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term11401, term11401.getClass(), "id", -1);
        setBooleanField(term11401, term11401.getClass(), "enable", true);
        setField(term11401, term11401.getClass(), "name", "xxx");
        setField(term11401, term11401.getClass(), "kind", enum10);
        setField(term11401, term11401.getClass(), "difficulty", enum11);
        setField(term11401, term11401.getClass(), "pvList", "ALL");
        setField(term11401, term11401.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term11401, term11401.getClass(), "addVP", term11477);
        setField(term11401, term11401.getClass(), "vpMultiplier", term11479);
        setIntField(term11482, term11482.getClass(), "year", 2005);
        setShortField(term11482, term11482.getClass(), "month", (short) 1);
        setShortField(term11482, term11482.getClass(), "day", (short) 1);
        setField(term11481, term11481.getClass(), "date", term11482);
        setByteField(term11486, term11486.getClass(), "hour", (byte) 0);
        setByteField(term11486, term11486.getClass(), "minute", (byte) 0);
        setByteField(term11486, term11486.getClass(), "second", (byte) 0);
        setIntField(term11486, term11486.getClass(), "nano", 0);
        setField(term11481, term11481.getClass(), "time", term11486);
        setField(term11401, term11401.getClass(), "start", term11481);
        setIntField(term11492, term11492.getClass(), "year", 2005);
        setShortField(term11492, term11492.getClass(), "month", (short) 1);
        setShortField(term11492, term11492.getClass(), "day", (short) 1);
        setField(term11491, term11491.getClass(), "date", term11492);
        setField(term11491, term11491.getClass(), "time", term11486);
        setField(term11401, term11401.getClass(), "end", term11491);
        setIntField(term11497, term11497.getClass(), "year", 2005);
        setShortField(term11497, term11497.getClass(), "month", (short) 1);
        setShortField(term11497, term11497.getClass(), "day", (short) 1);
        setField(term11496, term11496.getClass(), "date", term11497);
        setField(term11496, term11496.getClass(), "time", term11486);
        setField(term11401, term11401.getClass(), "createDate", term11496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPvList", argTypes, term11401, args);
    }

};


