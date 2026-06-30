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

public class UserRecentRating_setMusicId_17155875954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;
     Object term121;

    public UserRecentRating_setMusicId_17155875954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.response.UserRecentRating"));
        setIntField(term105, term105.getClass(), "musicId", 1134449235);
        setIntField(term105, term105.getClass(), "difficultId", -883034806);
        setField(term105, term105.getClass(), "romVersionCode", "jJCZpVmanW");
        setIntField(term105, term105.getClass(), "score", 1585847225);
        term121 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.response.UserRecentRating");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term121;
        callMethod(klass, "setMusicId", argTypes, term105, args);
    }

};


