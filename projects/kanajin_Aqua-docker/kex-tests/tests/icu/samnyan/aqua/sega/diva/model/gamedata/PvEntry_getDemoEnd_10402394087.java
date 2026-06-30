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

public class PvEntry_getDemoEnd_10402394087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80079;

    public PvEntry_getDemoEnd_10402394087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80145 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term80144 = ((Class) term80145).getDeclaredField((String) "NORMAL");
        ((Field) term80144).setAccessible(true);
        Object enum174 = ((Field) term80144).get((Object) null);
        Class<? extends Object> term80420 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term80419 = ((Class) term80420).getDeclaredField((String) "EXTRA");
        ((Field) term80419).setAccessible(true);
        Object enum175 = ((Field) term80419).get((Object) null);
        term80079 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term80104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80109 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80114 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80115 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80119 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80129 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80139 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term80079, term80079.getClass(), "id", -5460517064177800852L);
        setIntField(term80079, term80079.getClass(), "pvId", -761675396);
        setField(term80079, term80079.getClass(), "difficulty", enum174);
        setIntField(term80079, term80079.getClass(), "version", -1954860951);
        setField(term80079, term80079.getClass(), "edition", enum175);
        setIntField(term80105, term80105.getClass(), "year", 2028);
        setShortField(term80105, term80105.getClass(), "month", (short) 5);
        setShortField(term80105, term80105.getClass(), "day", (short) 6);
        setField(term80104, term80104.getClass(), "date", term80105);
        setByteField(term80109, term80109.getClass(), "hour", (byte) 19);
        setByteField(term80109, term80109.getClass(), "minute", (byte) 33);
        setByteField(term80109, term80109.getClass(), "second", (byte) 32);
        setIntField(term80109, term80109.getClass(), "nano", 917257563);
        setField(term80104, term80104.getClass(), "time", term80109);
        setField(term80079, term80079.getClass(), "demoStart", term80104);
        setIntField(term80115, term80115.getClass(), "year", 2029);
        setShortField(term80115, term80115.getClass(), "month", (short) 7);
        setShortField(term80115, term80115.getClass(), "day", (short) 22);
        setField(term80114, term80114.getClass(), "date", term80115);
        setByteField(term80119, term80119.getClass(), "hour", (byte) 17);
        setByteField(term80119, term80119.getClass(), "minute", (byte) 59);
        setByteField(term80119, term80119.getClass(), "second", (byte) 58);
        setIntField(term80119, term80119.getClass(), "nano", 921418702);
        setField(term80114, term80114.getClass(), "time", term80119);
        setField(term80079, term80079.getClass(), "demoEnd", term80114);
        setIntField(term80125, term80125.getClass(), "year", 2012);
        setShortField(term80125, term80125.getClass(), "month", (short) 6);
        setShortField(term80125, term80125.getClass(), "day", (short) 24);
        setField(term80124, term80124.getClass(), "date", term80125);
        setByteField(term80129, term80129.getClass(), "hour", (byte) 23);
        setByteField(term80129, term80129.getClass(), "minute", (byte) 9);
        setByteField(term80129, term80129.getClass(), "second", (byte) 32);
        setIntField(term80129, term80129.getClass(), "nano", 933669930);
        setField(term80124, term80124.getClass(), "time", term80129);
        setField(term80079, term80079.getClass(), "playableStart", term80124);
        setIntField(term80135, term80135.getClass(), "year", 2013);
        setShortField(term80135, term80135.getClass(), "month", (short) 9);
        setShortField(term80135, term80135.getClass(), "day", (short) 29);
        setField(term80134, term80134.getClass(), "date", term80135);
        setByteField(term80139, term80139.getClass(), "hour", (byte) 18);
        setByteField(term80139, term80139.getClass(), "minute", (byte) 32);
        setByteField(term80139, term80139.getClass(), "second", (byte) 59);
        setIntField(term80139, term80139.getClass(), "nano", 213125607);
        setField(term80134, term80134.getClass(), "time", term80139);
        setField(term80079, term80079.getClass(), "playableEnd", term80134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDemoEnd", argTypes, term80079, args);
    }

};


