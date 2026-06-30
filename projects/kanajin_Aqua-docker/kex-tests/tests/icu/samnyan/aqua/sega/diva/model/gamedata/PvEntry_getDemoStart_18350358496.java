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

public class PvEntry_getDemoStart_18350358496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79482;

    public PvEntry_getDemoStart_18350358496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79548 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term79547 = ((Class) term79548).getDeclaredField((String) "NORMAL");
        ((Field) term79547).setAccessible(true);
        Object enum172 = ((Field) term79547).get((Object) null);
        Class<? extends Object> term79823 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term79822 = ((Class) term79823).getDeclaredField((String) "EXTRA");
        ((Field) term79822).setAccessible(true);
        Object enum173 = ((Field) term79822).get((Object) null);
        term79482 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term79507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79512 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79532 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79542 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term79482, term79482.getClass(), "id", -5656664340499957324L);
        setIntField(term79482, term79482.getClass(), "pvId", 1139078354);
        setField(term79482, term79482.getClass(), "difficulty", enum172);
        setIntField(term79482, term79482.getClass(), "version", -691164974);
        setField(term79482, term79482.getClass(), "edition", enum173);
        setIntField(term79508, term79508.getClass(), "year", 2020);
        setShortField(term79508, term79508.getClass(), "month", (short) 4);
        setShortField(term79508, term79508.getClass(), "day", (short) 2);
        setField(term79507, term79507.getClass(), "date", term79508);
        setByteField(term79512, term79512.getClass(), "hour", (byte) 11);
        setByteField(term79512, term79512.getClass(), "minute", (byte) 26);
        setByteField(term79512, term79512.getClass(), "second", (byte) 22);
        setIntField(term79512, term79512.getClass(), "nano", 168224721);
        setField(term79507, term79507.getClass(), "time", term79512);
        setField(term79482, term79482.getClass(), "demoStart", term79507);
        setIntField(term79518, term79518.getClass(), "year", 2010);
        setShortField(term79518, term79518.getClass(), "month", (short) 10);
        setShortField(term79518, term79518.getClass(), "day", (short) 26);
        setField(term79517, term79517.getClass(), "date", term79518);
        setByteField(term79522, term79522.getClass(), "hour", (byte) 6);
        setByteField(term79522, term79522.getClass(), "minute", (byte) 28);
        setByteField(term79522, term79522.getClass(), "second", (byte) 52);
        setIntField(term79522, term79522.getClass(), "nano", 197540216);
        setField(term79517, term79517.getClass(), "time", term79522);
        setField(term79482, term79482.getClass(), "demoEnd", term79517);
        setIntField(term79528, term79528.getClass(), "year", 2028);
        setShortField(term79528, term79528.getClass(), "month", (short) 2);
        setShortField(term79528, term79528.getClass(), "day", (short) 8);
        setField(term79527, term79527.getClass(), "date", term79528);
        setByteField(term79532, term79532.getClass(), "hour", (byte) 16);
        setByteField(term79532, term79532.getClass(), "minute", (byte) 14);
        setByteField(term79532, term79532.getClass(), "second", (byte) 31);
        setIntField(term79532, term79532.getClass(), "nano", 824823232);
        setField(term79527, term79527.getClass(), "time", term79532);
        setField(term79482, term79482.getClass(), "playableStart", term79527);
        setIntField(term79538, term79538.getClass(), "year", 2018);
        setShortField(term79538, term79538.getClass(), "month", (short) 9);
        setShortField(term79538, term79538.getClass(), "day", (short) 8);
        setField(term79537, term79537.getClass(), "date", term79538);
        setByteField(term79542, term79542.getClass(), "hour", (byte) 14);
        setByteField(term79542, term79542.getClass(), "minute", (byte) 21);
        setByteField(term79542, term79542.getClass(), "second", (byte) 23);
        setIntField(term79542, term79542.getClass(), "nano", 316911941);
        setField(term79537, term79537.getClass(), "time", term79542);
        setField(term79482, term79482.getClass(), "playableEnd", term79537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDemoStart", argTypes, term79482, args);
    }

};


