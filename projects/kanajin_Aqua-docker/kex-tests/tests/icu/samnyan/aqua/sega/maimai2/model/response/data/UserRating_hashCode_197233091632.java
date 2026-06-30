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

public class UserRating_hashCode_197233091632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21397;

    public UserRating_hashCode_197233091632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21397 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.UserRating"));
        setIntField(term21397, term21397.getClass(), "rating", 0);
        setField(term21397, term21397.getClass(), "ratingList", null);
        setField(term21397, term21397.getClass(), "newRatingList", null);
        setField(term21397, term21397.getClass(), "nextRatingList", null);
        setField(term21397, term21397.getClass(), "nextNewRatingList", null);
        setField(term21397, term21397.getClass(), "udemae", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.UserRating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term21397, args);
    }

};


