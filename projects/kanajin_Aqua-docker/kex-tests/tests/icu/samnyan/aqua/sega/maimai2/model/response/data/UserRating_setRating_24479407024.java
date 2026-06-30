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
import java.lang.Integer;

public class UserRating_setRating_24479407024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21379;
     Object term21381;

    public UserRating_setRating_24479407024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21379 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.UserRating"));
        setIntField(term21379, term21379.getClass(), "rating", 0);
        setField(term21379, term21379.getClass(), "ratingList", null);
        setField(term21379, term21379.getClass(), "newRatingList", null);
        setField(term21379, term21379.getClass(), "nextRatingList", null);
        setField(term21379, term21379.getClass(), "nextNewRatingList", null);
        setField(term21379, term21379.getClass(), "udemae", null);
        term21381 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.UserRating");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21381;
        callMethod(klass, "setRating", argTypes, term21379, args);
    }

};


