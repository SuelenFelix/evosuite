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

public class Festa_isEnable_8774801491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8585;

    public Festa_isEnable_8774801491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8689 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term8688 = ((Class) term8689).getDeclaredField((String) "PINK_FESTA");
        ((Field) term8688).setAccessible(true);
        Object enum2 = ((Field) term8688).get((Object) null);
        Class<? extends Object> term8971 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term8970 = ((Class) term8971).getDeclaredField((String) "UNDEFINED");
        ((Field) term8970).setAccessible(true);
        Object enum3 = ((Field) term8970).get((Object) null);
        Integer term8661 = new Integer(0);
        Integer term8663 = new Integer(1);
        term8585 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term8665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8670 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8681 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term8585, term8585.getClass(), "id", -1);
        setBooleanField(term8585, term8585.getClass(), "enable", true);
        setField(term8585, term8585.getClass(), "name", "xxx");
        setField(term8585, term8585.getClass(), "kind", enum2);
        setField(term8585, term8585.getClass(), "difficulty", enum3);
        setField(term8585, term8585.getClass(), "pvList", "ALL");
        setField(term8585, term8585.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term8585, term8585.getClass(), "addVP", term8661);
        setField(term8585, term8585.getClass(), "vpMultiplier", term8663);
        setIntField(term8666, term8666.getClass(), "year", 2005);
        setShortField(term8666, term8666.getClass(), "month", (short) 1);
        setShortField(term8666, term8666.getClass(), "day", (short) 1);
        setField(term8665, term8665.getClass(), "date", term8666);
        setByteField(term8670, term8670.getClass(), "hour", (byte) 0);
        setByteField(term8670, term8670.getClass(), "minute", (byte) 0);
        setByteField(term8670, term8670.getClass(), "second", (byte) 0);
        setIntField(term8670, term8670.getClass(), "nano", 0);
        setField(term8665, term8665.getClass(), "time", term8670);
        setField(term8585, term8585.getClass(), "start", term8665);
        setIntField(term8676, term8676.getClass(), "year", 2005);
        setShortField(term8676, term8676.getClass(), "month", (short) 1);
        setShortField(term8676, term8676.getClass(), "day", (short) 1);
        setField(term8675, term8675.getClass(), "date", term8676);
        setField(term8675, term8675.getClass(), "time", term8670);
        setField(term8585, term8585.getClass(), "end", term8675);
        setIntField(term8681, term8681.getClass(), "year", 2005);
        setShortField(term8681, term8681.getClass(), "month", (short) 1);
        setShortField(term8681, term8681.getClass(), "day", (short) 1);
        setField(term8680, term8680.getClass(), "date", term8681);
        setField(term8680, term8680.getClass(), "time", term8670);
        setField(term8585, term8585.getClass(), "createDate", term8680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnable", argTypes, term8585, args);
    }

};


