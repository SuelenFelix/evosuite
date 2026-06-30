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

public class UserMusicDetail_getFullCombo_112617763441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188603;

    public UserMusicDetail_getFullCombo_112617763441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188603, term188603.getClass(), "id", 0L);
        setField(term188603, term188603.getClass(), "user", null);
        setIntField(term188603, term188603.getClass(), "musicId", 0);
        setIntField(term188603, term188603.getClass(), "level", 0);
        setIntField(term188603, term188603.getClass(), "playCount", 0);
        setIntField(term188603, term188603.getClass(), "scoreMax", 0);
        setIntField(term188603, term188603.getClass(), "syncRateMax", 0);
        setBooleanField(term188603, term188603.getClass(), "isAllPerfect", false);
        setIntField(term188603, term188603.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188603, term188603.getClass(), "fullCombo", 0);
        setIntField(term188603, term188603.getClass(), "maxFever", 0);
        setIntField(term188603, term188603.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullCombo", argTypes, term188603, args);
    }

};


