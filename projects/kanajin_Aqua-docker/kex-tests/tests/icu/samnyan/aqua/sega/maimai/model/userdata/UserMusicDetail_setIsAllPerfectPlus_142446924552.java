package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserMusicDetail_setIsAllPerfectPlus_142446924552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188749;
     Object term188761;

    public UserMusicDetail_setIsAllPerfectPlus_142446924552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188749 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188749, term188749.getClass(), "id", 0L);
        setField(term188749, term188749.getClass(), "user", null);
        setIntField(term188749, term188749.getClass(), "musicId", 0);
        setIntField(term188749, term188749.getClass(), "level", 0);
        setIntField(term188749, term188749.getClass(), "playCount", 0);
        setIntField(term188749, term188749.getClass(), "scoreMax", 0);
        setIntField(term188749, term188749.getClass(), "syncRateMax", 0);
        setBooleanField(term188749, term188749.getClass(), "isAllPerfect", false);
        setIntField(term188749, term188749.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188749, term188749.getClass(), "fullCombo", 0);
        setIntField(term188749, term188749.getClass(), "maxFever", 0);
        setIntField(term188749, term188749.getClass(), "achievement", 0);
        term188761 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term188761;
        callMethod(klass, "setIsAllPerfectPlus", argTypes, term188749, args);
    }

};


