package icu.samnyan.aqua.sega.maimai2.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserRating_setRatingList_23133351425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21383;

    public UserRating_setRatingList_23133351425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21383 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.UserRating"));
        setIntField(term21383, term21383.getClass(), "rating", 0);
        setField(term21383, term21383.getClass(), "ratingList", null);
        setField(term21383, term21383.getClass(), "newRatingList", null);
        setField(term21383, term21383.getClass(), "nextRatingList", null);
        setField(term21383, term21383.getClass(), "nextNewRatingList", null);
        setField(term21383, term21383.getClass(), "udemae", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.UserRating");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRatingList", argTypes, term21383, args);
    }

};


