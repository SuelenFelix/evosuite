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
import java.lang.Boolean;

public class Festa_setEnable_63127007713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17035;
     Object term17135;

    public Festa_setEnable_63127007713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17141 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term17140 = ((Class) term17141).getDeclaredField((String) "PINK_FESTA");
        ((Field) term17140).setAccessible(true);
        Object enum26 = ((Field) term17140).get((Object) null);
        Class<? extends Object> term17423 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term17422 = ((Class) term17423).getDeclaredField((String) "UNDEFINED");
        ((Field) term17422).setAccessible(true);
        Object enum27 = ((Field) term17422).get((Object) null);
        Integer term17111 = new Integer(0);
        Integer term17113 = new Integer(1);
        term17035 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term17115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17120 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17131 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term17035, term17035.getClass(), "id", -1);
        setBooleanField(term17035, term17035.getClass(), "enable", true);
        setField(term17035, term17035.getClass(), "name", "xxx");
        setField(term17035, term17035.getClass(), "kind", enum26);
        setField(term17035, term17035.getClass(), "difficulty", enum27);
        setField(term17035, term17035.getClass(), "pvList", "ALL");
        setField(term17035, term17035.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term17035, term17035.getClass(), "addVP", term17111);
        setField(term17035, term17035.getClass(), "vpMultiplier", term17113);
        setIntField(term17116, term17116.getClass(), "year", 2005);
        setShortField(term17116, term17116.getClass(), "month", (short) 1);
        setShortField(term17116, term17116.getClass(), "day", (short) 1);
        setField(term17115, term17115.getClass(), "date", term17116);
        setByteField(term17120, term17120.getClass(), "hour", (byte) 0);
        setByteField(term17120, term17120.getClass(), "minute", (byte) 0);
        setByteField(term17120, term17120.getClass(), "second", (byte) 0);
        setIntField(term17120, term17120.getClass(), "nano", 0);
        setField(term17115, term17115.getClass(), "time", term17120);
        setField(term17035, term17035.getClass(), "start", term17115);
        setIntField(term17126, term17126.getClass(), "year", 2005);
        setShortField(term17126, term17126.getClass(), "month", (short) 1);
        setShortField(term17126, term17126.getClass(), "day", (short) 1);
        setField(term17125, term17125.getClass(), "date", term17126);
        setField(term17125, term17125.getClass(), "time", term17120);
        setField(term17035, term17035.getClass(), "end", term17125);
        setIntField(term17131, term17131.getClass(), "year", 2005);
        setShortField(term17131, term17131.getClass(), "month", (short) 1);
        setShortField(term17131, term17131.getClass(), "day", (short) 1);
        setField(term17130, term17130.getClass(), "date", term17131);
        setField(term17130, term17130.getClass(), "time", term17120);
        setField(term17035, term17035.getClass(), "createDate", term17130);
        term17135 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17135;
        callMethod(klass, "setEnable", argTypes, term17035, args);
    }

};


