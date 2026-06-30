package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserRecentRating_setAchieve_14112471195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513;
     Object term517;

    public UserRecentRating_setAchieve_14112471195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term513 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserRecentRating"));
        setIntField(term513, term513.getClass(), "musicId", 1265463001);
        setIntField(term513, term513.getClass(), "level", 335112684);
        setIntField(term513, term513.getClass(), "achieve", 1551099402);
        term517 = new Integer(-2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserRecentRating");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term517;
        callMethod(klass, "setAchieve", argTypes, term513, args);
    }

};


