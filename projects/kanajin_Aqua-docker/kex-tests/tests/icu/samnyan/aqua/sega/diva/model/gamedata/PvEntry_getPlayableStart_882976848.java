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

public class PvEntry_getPlayableStart_882976848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80676;

    public PvEntry_getPlayableStart_882976848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80746 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term80745 = ((Class) term80746).getDeclaredField((String) "EXTREME");
        ((Field) term80745).setAccessible(true);
        Object enum176 = ((Field) term80745).get((Object) null);
        Class<? extends Object> term81024 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term81023 = ((Class) term81024).getDeclaredField((String) "ORIGINAL");
        ((Field) term81023).setAccessible(true);
        Object enum177 = ((Field) term81023).get((Object) null);
        term80676 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term80705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80730 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80740 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term80676, term80676.getClass(), "id", -5242567610844514867L);
        setIntField(term80676, term80676.getClass(), "pvId", -2078879114);
        setField(term80676, term80676.getClass(), "difficulty", enum176);
        setIntField(term80676, term80676.getClass(), "version", -1186882318);
        setField(term80676, term80676.getClass(), "edition", enum177);
        setIntField(term80706, term80706.getClass(), "year", 2010);
        setShortField(term80706, term80706.getClass(), "month", (short) 9);
        setShortField(term80706, term80706.getClass(), "day", (short) 20);
        setField(term80705, term80705.getClass(), "date", term80706);
        setByteField(term80710, term80710.getClass(), "hour", (byte) 3);
        setByteField(term80710, term80710.getClass(), "minute", (byte) 41);
        setByteField(term80710, term80710.getClass(), "second", (byte) 7);
        setIntField(term80710, term80710.getClass(), "nano", 796515800);
        setField(term80705, term80705.getClass(), "time", term80710);
        setField(term80676, term80676.getClass(), "demoStart", term80705);
        setIntField(term80716, term80716.getClass(), "year", 2015);
        setShortField(term80716, term80716.getClass(), "month", (short) 10);
        setShortField(term80716, term80716.getClass(), "day", (short) 2);
        setField(term80715, term80715.getClass(), "date", term80716);
        setByteField(term80720, term80720.getClass(), "hour", (byte) 21);
        setByteField(term80720, term80720.getClass(), "minute", (byte) 18);
        setByteField(term80720, term80720.getClass(), "second", (byte) 42);
        setIntField(term80720, term80720.getClass(), "nano", 185569616);
        setField(term80715, term80715.getClass(), "time", term80720);
        setField(term80676, term80676.getClass(), "demoEnd", term80715);
        setIntField(term80726, term80726.getClass(), "year", 2018);
        setShortField(term80726, term80726.getClass(), "month", (short) 5);
        setShortField(term80726, term80726.getClass(), "day", (short) 13);
        setField(term80725, term80725.getClass(), "date", term80726);
        setByteField(term80730, term80730.getClass(), "hour", (byte) 0);
        setByteField(term80730, term80730.getClass(), "minute", (byte) 47);
        setByteField(term80730, term80730.getClass(), "second", (byte) 45);
        setIntField(term80730, term80730.getClass(), "nano", 10058361);
        setField(term80725, term80725.getClass(), "time", term80730);
        setField(term80676, term80676.getClass(), "playableStart", term80725);
        setIntField(term80736, term80736.getClass(), "year", 2014);
        setShortField(term80736, term80736.getClass(), "month", (short) 6);
        setShortField(term80736, term80736.getClass(), "day", (short) 11);
        setField(term80735, term80735.getClass(), "date", term80736);
        setByteField(term80740, term80740.getClass(), "hour", (byte) 8);
        setByteField(term80740, term80740.getClass(), "minute", (byte) 55);
        setByteField(term80740, term80740.getClass(), "second", (byte) 58);
        setIntField(term80740, term80740.getClass(), "nano", 376244535);
        setField(term80735, term80735.getClass(), "time", term80740);
        setField(term80676, term80676.getClass(), "playableEnd", term80735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayableStart", argTypes, term80676, args);
    }

};


