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

public class Festa_setAddVP_20746343719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21613;
     Object term21713;

    public Festa_setAddVP_20746343719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21719 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term21718 = ((Class) term21719).getDeclaredField((String) "PINK_FESTA");
        ((Field) term21718).setAccessible(true);
        Object enum39 = ((Field) term21718).get((Object) null);
        Class<? extends Object> term22001 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term22000 = ((Class) term22001).getDeclaredField((String) "UNDEFINED");
        ((Field) term22000).setAccessible(true);
        Object enum40 = ((Field) term22000).get((Object) null);
        Integer term21689 = new Integer(0);
        Integer term21691 = new Integer(1);
        term21613 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term21693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21698 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21709 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term21613, term21613.getClass(), "id", -1);
        setBooleanField(term21613, term21613.getClass(), "enable", true);
        setField(term21613, term21613.getClass(), "name", "xxx");
        setField(term21613, term21613.getClass(), "kind", enum39);
        setField(term21613, term21613.getClass(), "difficulty", enum40);
        setField(term21613, term21613.getClass(), "pvList", "ALL");
        setField(term21613, term21613.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term21613, term21613.getClass(), "addVP", term21689);
        setField(term21613, term21613.getClass(), "vpMultiplier", term21691);
        setIntField(term21694, term21694.getClass(), "year", 2005);
        setShortField(term21694, term21694.getClass(), "month", (short) 1);
        setShortField(term21694, term21694.getClass(), "day", (short) 1);
        setField(term21693, term21693.getClass(), "date", term21694);
        setByteField(term21698, term21698.getClass(), "hour", (byte) 0);
        setByteField(term21698, term21698.getClass(), "minute", (byte) 0);
        setByteField(term21698, term21698.getClass(), "second", (byte) 0);
        setIntField(term21698, term21698.getClass(), "nano", 0);
        setField(term21693, term21693.getClass(), "time", term21698);
        setField(term21613, term21613.getClass(), "start", term21693);
        setIntField(term21704, term21704.getClass(), "year", 2005);
        setShortField(term21704, term21704.getClass(), "month", (short) 1);
        setShortField(term21704, term21704.getClass(), "day", (short) 1);
        setField(term21703, term21703.getClass(), "date", term21704);
        setField(term21703, term21703.getClass(), "time", term21698);
        setField(term21613, term21613.getClass(), "end", term21703);
        setIntField(term21709, term21709.getClass(), "year", 2005);
        setShortField(term21709, term21709.getClass(), "month", (short) 1);
        setShortField(term21709, term21709.getClass(), "day", (short) 1);
        setField(term21708, term21708.getClass(), "date", term21709);
        setField(term21708, term21708.getClass(), "time", term21698);
        setField(term21613, term21613.getClass(), "createDate", term21708);
        term21713 = new Integer(162113491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term21713;
        callMethod(klass, "setAddVP", argTypes, term21613, args);
    }

};


