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

public class Festa_setEnd_33179895022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23739;
     Object term23839;

    public Festa_setEnd_33179895022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23853 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term23852 = ((Class) term23853).getDeclaredField((String) "PINK_FESTA");
        ((Field) term23852).setAccessible(true);
        Object enum45 = ((Field) term23852).get((Object) null);
        Class<? extends Object> term24135 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term24134 = ((Class) term24135).getDeclaredField((String) "UNDEFINED");
        ((Field) term24134).setAccessible(true);
        Object enum46 = ((Field) term24134).get((Object) null);
        Integer term23815 = new Integer(0);
        Integer term23817 = new Integer(1);
        term23739 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term23819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23824 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23834 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23835 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term23739, term23739.getClass(), "id", -1);
        setBooleanField(term23739, term23739.getClass(), "enable", true);
        setField(term23739, term23739.getClass(), "name", "xxx");
        setField(term23739, term23739.getClass(), "kind", enum45);
        setField(term23739, term23739.getClass(), "difficulty", enum46);
        setField(term23739, term23739.getClass(), "pvList", "ALL");
        setField(term23739, term23739.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term23739, term23739.getClass(), "addVP", term23815);
        setField(term23739, term23739.getClass(), "vpMultiplier", term23817);
        setIntField(term23820, term23820.getClass(), "year", 2005);
        setShortField(term23820, term23820.getClass(), "month", (short) 1);
        setShortField(term23820, term23820.getClass(), "day", (short) 1);
        setField(term23819, term23819.getClass(), "date", term23820);
        setByteField(term23824, term23824.getClass(), "hour", (byte) 0);
        setByteField(term23824, term23824.getClass(), "minute", (byte) 0);
        setByteField(term23824, term23824.getClass(), "second", (byte) 0);
        setIntField(term23824, term23824.getClass(), "nano", 0);
        setField(term23819, term23819.getClass(), "time", term23824);
        setField(term23739, term23739.getClass(), "start", term23819);
        setIntField(term23830, term23830.getClass(), "year", 2005);
        setShortField(term23830, term23830.getClass(), "month", (short) 1);
        setShortField(term23830, term23830.getClass(), "day", (short) 1);
        setField(term23829, term23829.getClass(), "date", term23830);
        setField(term23829, term23829.getClass(), "time", term23824);
        setField(term23739, term23739.getClass(), "end", term23829);
        setIntField(term23835, term23835.getClass(), "year", 2005);
        setShortField(term23835, term23835.getClass(), "month", (short) 1);
        setShortField(term23835, term23835.getClass(), "day", (short) 1);
        setField(term23834, term23834.getClass(), "date", term23835);
        setField(term23834, term23834.getClass(), "time", term23824);
        setField(term23739, term23739.getClass(), "createDate", term23834);
        term23839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23844 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23840, term23840.getClass(), "year", 2021);
        setShortField(term23840, term23840.getClass(), "month", (short) 1);
        setShortField(term23840, term23840.getClass(), "day", (short) 18);
        setField(term23839, term23839.getClass(), "date", term23840);
        setByteField(term23844, term23844.getClass(), "hour", (byte) 13);
        setByteField(term23844, term23844.getClass(), "minute", (byte) 38);
        setByteField(term23844, term23844.getClass(), "second", (byte) 26);
        setIntField(term23844, term23844.getClass(), "nano", 544608644);
        setField(term23839, term23839.getClass(), "time", term23844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23839;
        callMethod(klass, "setEnd", argTypes, term23739, args);
    }

};


