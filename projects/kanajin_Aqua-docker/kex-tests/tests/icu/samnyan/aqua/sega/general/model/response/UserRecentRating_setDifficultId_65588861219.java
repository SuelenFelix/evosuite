package icu.samnyan.aqua.sega.general.model.response;

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
import static icu.samnyan.aqua.sega.general.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserRecentRating_setDifficultId_65588861219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393;
     Object term397;

    public UserRecentRating_setDifficultId_65588861219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.response.UserRecentRating"));
        setIntField(term393, term393.getClass(), "musicId", 0);
        setIntField(term393, term393.getClass(), "difficultId", 0);
        setField(term393, term393.getClass(), "romVersionCode", null);
        setIntField(term393, term393.getClass(), "score", 0);
        term397 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.response.UserRecentRating");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term397;
        callMethod(klass, "setDifficultId", argTypes, term393, args);
    }

};


