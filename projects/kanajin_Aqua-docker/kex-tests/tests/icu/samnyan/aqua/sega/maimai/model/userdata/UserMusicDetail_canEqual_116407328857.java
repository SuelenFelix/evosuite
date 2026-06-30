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

public class UserMusicDetail_canEqual_116407328857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188817;

    public UserMusicDetail_canEqual_116407328857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188817, term188817.getClass(), "id", 0L);
        setField(term188817, term188817.getClass(), "user", null);
        setIntField(term188817, term188817.getClass(), "musicId", 0);
        setIntField(term188817, term188817.getClass(), "level", 0);
        setIntField(term188817, term188817.getClass(), "playCount", 0);
        setIntField(term188817, term188817.getClass(), "scoreMax", 0);
        setIntField(term188817, term188817.getClass(), "syncRateMax", 0);
        setBooleanField(term188817, term188817.getClass(), "isAllPerfect", false);
        setIntField(term188817, term188817.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188817, term188817.getClass(), "fullCombo", 0);
        setIntField(term188817, term188817.getClass(), "maxFever", 0);
        setIntField(term188817, term188817.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term188817, args);
    }

};


