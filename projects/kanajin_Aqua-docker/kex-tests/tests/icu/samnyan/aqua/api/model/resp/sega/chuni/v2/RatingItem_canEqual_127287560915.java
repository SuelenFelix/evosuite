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

public class RatingItem_canEqual_127287560915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45852;
     Object term45882;

    public RatingItem_canEqual_127287560915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45852 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45852, term45852.getClass(), "musicId", 1916020077);
        setField(term45852, term45852.getClass(), "musicName", "ceGAKcClsG");
        setField(term45852, term45852.getClass(), "artistName", "SEldZGJyvX");
        setIntField(term45852, term45852.getClass(), "level", -1842191454);
        setIntField(term45852, term45852.getClass(), "score", 384551988);
        setIntField(term45852, term45852.getClass(), "ratingBase", -2021521187);
        setIntField(term45852, term45852.getClass(), "rating", -2139205197);
        term45882 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45882;
        callMethod(klass, "canEqual", argTypes, term45852, args);
    }

};


