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

public class RatingItem_toString_49073338517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45953;

    public RatingItem_toString_49073338517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45953 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45953, term45953.getClass(), "musicId", 747491);
        setField(term45953, term45953.getClass(), "musicName", "FLLklaMZvg");
        setField(term45953, term45953.getClass(), "artistName", "jRDZpkFkoD");
        setIntField(term45953, term45953.getClass(), "level", 734222768);
        setIntField(term45953, term45953.getClass(), "score", 1545425140);
        setIntField(term45953, term45953.getClass(), "ratingBase", -1580765555);
        setIntField(term45953, term45953.getClass(), "rating", -1295149055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term45953, args);
    }

};


