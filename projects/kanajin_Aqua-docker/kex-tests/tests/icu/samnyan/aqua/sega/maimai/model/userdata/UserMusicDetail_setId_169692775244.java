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
import java.lang.Long;

public class UserMusicDetail_setId_169692775244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188639;
     Object term188651;

    public UserMusicDetail_setId_169692775244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188639 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        setLongField(term188639, term188639.getClass(), "id", 0L);
        setField(term188639, term188639.getClass(), "user", null);
        setIntField(term188639, term188639.getClass(), "musicId", 0);
        setIntField(term188639, term188639.getClass(), "level", 0);
        setIntField(term188639, term188639.getClass(), "playCount", 0);
        setIntField(term188639, term188639.getClass(), "scoreMax", 0);
        setIntField(term188639, term188639.getClass(), "syncRateMax", 0);
        setBooleanField(term188639, term188639.getClass(), "isAllPerfect", false);
        setIntField(term188639, term188639.getClass(), "isAllPerfectPlus", 0);
        setIntField(term188639, term188639.getClass(), "fullCombo", 0);
        setIntField(term188639, term188639.getClass(), "maxFever", 0);
        setIntField(term188639, term188639.getClass(), "achievement", 0);
        term188651 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term188651;
        callMethod(klass, "setId", argTypes, term188639, args);
    }

};


