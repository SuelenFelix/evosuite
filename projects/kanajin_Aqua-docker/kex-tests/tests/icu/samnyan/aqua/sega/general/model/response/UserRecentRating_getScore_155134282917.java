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

public class UserRecentRating_getScore_155134282917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383;

    public UserRecentRating_getScore_155134282917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.response.UserRecentRating"));
        setIntField(term383, term383.getClass(), "musicId", 0);
        setIntField(term383, term383.getClass(), "difficultId", 0);
        setField(term383, term383.getClass(), "romVersionCode", null);
        setIntField(term383, term383.getClass(), "score", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.response.UserRecentRating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term383, args);
    }

};


