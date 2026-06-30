package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RatingItem_equals_76211598714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5925;
     Object term5955;

    public RatingItem_equals_76211598714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5925 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5925, term5925.getClass(), "musicId", 1543696412);
        setField(term5925, term5925.getClass(), "musicName", "OJJtVNPyKZ");
        setField(term5925, term5925.getClass(), "artistName", "AKNapTAfmD");
        setIntField(term5925, term5925.getClass(), "level", -1385748168);
        setIntField(term5925, term5925.getClass(), "score", -270592367);
        setIntField(term5925, term5925.getClass(), "ratingBase", 178847646);
        setIntField(term5925, term5925.getClass(), "rating", 273590437);
        term5955 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5955;
        callMethod(klass, "equals", argTypes, term5925, args);
    }

};


