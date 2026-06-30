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

public class Festa_getCreateDate_21485692111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15625;

    public Festa_getCreateDate_21485692111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15729 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term15728 = ((Class) term15729).getDeclaredField((String) "PINK_FESTA");
        ((Field) term15728).setAccessible(true);
        Object enum22 = ((Field) term15728).get((Object) null);
        Class<? extends Object> term16011 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term16010 = ((Class) term16011).getDeclaredField((String) "UNDEFINED");
        ((Field) term16010).setAccessible(true);
        Object enum23 = ((Field) term16010).get((Object) null);
        Integer term15701 = new Integer(0);
        Integer term15703 = new Integer(1);
        term15625 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term15705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15721 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term15625, term15625.getClass(), "id", -1);
        setBooleanField(term15625, term15625.getClass(), "enable", true);
        setField(term15625, term15625.getClass(), "name", "xxx");
        setField(term15625, term15625.getClass(), "kind", enum22);
        setField(term15625, term15625.getClass(), "difficulty", enum23);
        setField(term15625, term15625.getClass(), "pvList", "ALL");
        setField(term15625, term15625.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term15625, term15625.getClass(), "addVP", term15701);
        setField(term15625, term15625.getClass(), "vpMultiplier", term15703);
        setIntField(term15706, term15706.getClass(), "year", 2005);
        setShortField(term15706, term15706.getClass(), "month", (short) 1);
        setShortField(term15706, term15706.getClass(), "day", (short) 1);
        setField(term15705, term15705.getClass(), "date", term15706);
        setByteField(term15710, term15710.getClass(), "hour", (byte) 0);
        setByteField(term15710, term15710.getClass(), "minute", (byte) 0);
        setByteField(term15710, term15710.getClass(), "second", (byte) 0);
        setIntField(term15710, term15710.getClass(), "nano", 0);
        setField(term15705, term15705.getClass(), "time", term15710);
        setField(term15625, term15625.getClass(), "start", term15705);
        setIntField(term15716, term15716.getClass(), "year", 2005);
        setShortField(term15716, term15716.getClass(), "month", (short) 1);
        setShortField(term15716, term15716.getClass(), "day", (short) 1);
        setField(term15715, term15715.getClass(), "date", term15716);
        setField(term15715, term15715.getClass(), "time", term15710);
        setField(term15625, term15625.getClass(), "end", term15715);
        setIntField(term15721, term15721.getClass(), "year", 2005);
        setShortField(term15721, term15721.getClass(), "month", (short) 1);
        setShortField(term15721, term15721.getClass(), "day", (short) 1);
        setField(term15720, term15720.getClass(), "date", term15721);
        setField(term15720, term15720.getClass(), "time", term15710);
        setField(term15625, term15625.getClass(), "createDate", term15720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term15625, args);
    }

};


