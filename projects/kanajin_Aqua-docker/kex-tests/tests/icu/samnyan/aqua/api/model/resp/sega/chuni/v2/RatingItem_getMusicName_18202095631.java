package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RatingItem_getMusicName_18202095631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45097;

    public RatingItem_getMusicName_18202095631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45097 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45097, term45097.getClass(), "musicId", 969573395);
        setField(term45097, term45097.getClass(), "musicName", "moHYQFfLnp");
        setField(term45097, term45097.getClass(), "artistName", "BrPqlvIbEQ");
        setIntField(term45097, term45097.getClass(), "level", -899109027);
        setIntField(term45097, term45097.getClass(), "score", -694297070);
        setIntField(term45097, term45097.getClass(), "ratingBase", 786551253);
        setIntField(term45097, term45097.getClass(), "rating", -104779523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicName", argTypes, term45097, args);
    }

};


