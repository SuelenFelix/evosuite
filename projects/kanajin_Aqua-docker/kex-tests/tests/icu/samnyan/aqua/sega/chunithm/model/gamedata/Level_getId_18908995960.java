package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Level_getId_18908995960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1725;

    public Level_getId_18908995960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2113 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term2112 = ((Class) term2113).getDeclaredField((String) "IRODORI");
        ((Field) term2112).setAccessible(true);
        Object enum0 = ((Field) term2112).get((Object) null);
        HashMap term1816 = new HashMap();
        term1725 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term1727 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term1725, term1725.getClass(), "id", 2486810210675247493L);
        setIntField(term1727, term1727.getClass(), "musicId", 480137250);
        setField(term1727, term1727.getClass(), "name", "PAEBtnZtTD");
        setField(term1727, term1727.getClass(), "sortName", "sjlJAEtRrb");
        setField(term1727, term1727.getClass(), "copyright", "MuLcgQHgqz");
        setField(term1727, term1727.getClass(), "artistName", "xxtlPwDYFs");
        setField(term1727, term1727.getClass(), "genre", enum0);
        setField(term1727, term1727.getClass(), "releaseVersion", "jJCZpVmanW");
        setField(term1727, term1727.getClass(), "levels", term1816);
        setField(term1725, term1725.getClass(), "music", term1727);
        setBooleanField(term1725, term1725.getClass(), "enable", true);
        setIntField(term1725, term1725.getClass(), "level", -25637976);
        setIntField(term1725, term1725.getClass(), "levelDecimal", 1555897383);
        setIntField(term1725, term1725.getClass(), "diff", 202001407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1725, args);
    }

};


