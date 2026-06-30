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

public class UserMusicDetail_equals_35991065956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188805;

    public UserMusicDetail_equals_35991065956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188805 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188805, term188805.getClass(), "id", 0L);
        setField(term188805, term188805.getClass(), "user", null);
        setIntField(term188805, term188805.getClass(), "musicId", 0);
        setIntField(term188805, term188805.getClass(), "level", 0);
        setIntField(term188805, term188805.getClass(), "playCount", 0);
        setIntField(term188805, term188805.getClass(), "scoreMax", 0);
        setIntField(term188805, term188805.getClass(), "syncRateMax", 0);
        setBooleanField(term188805, term188805.getClass(), "isAllPerfect", false);
        setIntField(term188805, term188805.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188805, term188805.getClass(), "fullCombo", 0);
        setIntField(term188805, term188805.getClass(), "maxFever", 0);
        setIntField(term188805, term188805.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term188805, args);
    }

};


