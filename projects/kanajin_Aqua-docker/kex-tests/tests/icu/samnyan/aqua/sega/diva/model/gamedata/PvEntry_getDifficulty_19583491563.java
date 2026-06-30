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

public class PvEntry_getDifficulty_19583491563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77691;

    public PvEntry_getDifficulty_19583491563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77758 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term77757 = ((Class) term77758).getDeclaredField((String) "EASY");
        ((Field) term77757).setAccessible(true);
        Object enum166 = ((Field) term77757).get((Object) null);
        Class<? extends Object> term78027 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term78026 = ((Class) term78027).getDeclaredField((String) "ORIGINAL");
        ((Field) term78026).setAccessible(true);
        Object enum167 = ((Field) term78026).get((Object) null);
        term77691 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        Object term77717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77722 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77737 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77738 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77742 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77747 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77752 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77691, term77691.getClass(), "id", 5315236285592892506L);
        setIntField(term77691, term77691.getClass(), "pvId", -222412326);
        setField(term77691, term77691.getClass(), "difficulty", enum166);
        setIntField(term77691, term77691.getClass(), "version", -299497261);
        setField(term77691, term77691.getClass(), "edition", enum167);
        setIntField(term77718, term77718.getClass(), "year", 2016);
        setShortField(term77718, term77718.getClass(), "month", (short) 11);
        setShortField(term77718, term77718.getClass(), "day", (short) 20);
        setField(term77717, term77717.getClass(), "date", term77718);
        setByteField(term77722, term77722.getClass(), "hour", (byte) 17);
        setByteField(term77722, term77722.getClass(), "minute", (byte) 20);
        setByteField(term77722, term77722.getClass(), "second", (byte) 21);
        setIntField(term77722, term77722.getClass(), "nano", 340096364);
        setField(term77717, term77717.getClass(), "time", term77722);
        setField(term77691, term77691.getClass(), "demoStart", term77717);
        setIntField(term77728, term77728.getClass(), "year", 2024);
        setShortField(term77728, term77728.getClass(), "month", (short) 10);
        setShortField(term77728, term77728.getClass(), "day", (short) 28);
        setField(term77727, term77727.getClass(), "date", term77728);
        setByteField(term77732, term77732.getClass(), "hour", (byte) 5);
        setByteField(term77732, term77732.getClass(), "minute", (byte) 13);
        setByteField(term77732, term77732.getClass(), "second", (byte) 51);
        setIntField(term77732, term77732.getClass(), "nano", 605693001);
        setField(term77727, term77727.getClass(), "time", term77732);
        setField(term77691, term77691.getClass(), "demoEnd", term77727);
        setIntField(term77738, term77738.getClass(), "year", 2029);
        setShortField(term77738, term77738.getClass(), "month", (short) 7);
        setShortField(term77738, term77738.getClass(), "day", (short) 19);
        setField(term77737, term77737.getClass(), "date", term77738);
        setByteField(term77742, term77742.getClass(), "hour", (byte) 4);
        setByteField(term77742, term77742.getClass(), "minute", (byte) 38);
        setByteField(term77742, term77742.getClass(), "second", (byte) 15);
        setIntField(term77742, term77742.getClass(), "nano", 260833456);
        setField(term77737, term77737.getClass(), "time", term77742);
        setField(term77691, term77691.getClass(), "playableStart", term77737);
        setIntField(term77748, term77748.getClass(), "year", 2019);
        setShortField(term77748, term77748.getClass(), "month", (short) 12);
        setShortField(term77748, term77748.getClass(), "day", (short) 13);
        setField(term77747, term77747.getClass(), "date", term77748);
        setByteField(term77752, term77752.getClass(), "hour", (byte) 17);
        setByteField(term77752, term77752.getClass(), "minute", (byte) 38);
        setByteField(term77752, term77752.getClass(), "second", (byte) 43);
        setIntField(term77752, term77752.getClass(), "nano", 435007801);
        setField(term77747, term77747.getClass(), "time", term77752);
        setField(term77691, term77691.getClass(), "playableEnd", term77747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDifficulty", argTypes, term77691, args);
    }

};


