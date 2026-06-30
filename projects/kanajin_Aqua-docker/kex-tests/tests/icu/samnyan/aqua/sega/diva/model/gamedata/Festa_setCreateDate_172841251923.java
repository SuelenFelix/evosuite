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

public class Festa_setCreateDate_172841251923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24453;
     Object term24553;

    public Festa_setCreateDate_172841251923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24567 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term24566 = ((Class) term24567).getDeclaredField((String) "PINK_FESTA");
        ((Field) term24566).setAccessible(true);
        Object enum47 = ((Field) term24566).get((Object) null);
        Class<? extends Object> term24849 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term24848 = ((Class) term24849).getDeclaredField((String) "UNDEFINED");
        ((Field) term24848).setAccessible(true);
        Object enum48 = ((Field) term24848).get((Object) null);
        Integer term24529 = new Integer(0);
        Integer term24531 = new Integer(1);
        term24453 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term24533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24538 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24543 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24544 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24549 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term24453, term24453.getClass(), "id", -1);
        setBooleanField(term24453, term24453.getClass(), "enable", true);
        setField(term24453, term24453.getClass(), "name", "xxx");
        setField(term24453, term24453.getClass(), "kind", enum47);
        setField(term24453, term24453.getClass(), "difficulty", enum48);
        setField(term24453, term24453.getClass(), "pvList", "ALL");
        setField(term24453, term24453.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term24453, term24453.getClass(), "addVP", term24529);
        setField(term24453, term24453.getClass(), "vpMultiplier", term24531);
        setIntField(term24534, term24534.getClass(), "year", 2005);
        setShortField(term24534, term24534.getClass(), "month", (short) 1);
        setShortField(term24534, term24534.getClass(), "day", (short) 1);
        setField(term24533, term24533.getClass(), "date", term24534);
        setByteField(term24538, term24538.getClass(), "hour", (byte) 0);
        setByteField(term24538, term24538.getClass(), "minute", (byte) 0);
        setByteField(term24538, term24538.getClass(), "second", (byte) 0);
        setIntField(term24538, term24538.getClass(), "nano", 0);
        setField(term24533, term24533.getClass(), "time", term24538);
        setField(term24453, term24453.getClass(), "start", term24533);
        setIntField(term24544, term24544.getClass(), "year", 2005);
        setShortField(term24544, term24544.getClass(), "month", (short) 1);
        setShortField(term24544, term24544.getClass(), "day", (short) 1);
        setField(term24543, term24543.getClass(), "date", term24544);
        setField(term24543, term24543.getClass(), "time", term24538);
        setField(term24453, term24453.getClass(), "end", term24543);
        setIntField(term24549, term24549.getClass(), "year", 2005);
        setShortField(term24549, term24549.getClass(), "month", (short) 1);
        setShortField(term24549, term24549.getClass(), "day", (short) 1);
        setField(term24548, term24548.getClass(), "date", term24549);
        setField(term24548, term24548.getClass(), "time", term24538);
        setField(term24453, term24453.getClass(), "createDate", term24548);
        term24553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24558 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24554, term24554.getClass(), "year", 2015);
        setShortField(term24554, term24554.getClass(), "month", (short) 9);
        setShortField(term24554, term24554.getClass(), "day", (short) 19);
        setField(term24553, term24553.getClass(), "date", term24554);
        setByteField(term24558, term24558.getClass(), "hour", (byte) 9);
        setByteField(term24558, term24558.getClass(), "minute", (byte) 4);
        setByteField(term24558, term24558.getClass(), "second", (byte) 10);
        setIntField(term24558, term24558.getClass(), "nano", 401765865);
        setField(term24553, term24553.getClass(), "time", term24558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term24553;
        callMethod(klass, "setCreateDate", argTypes, term24453, args);
    }

};


