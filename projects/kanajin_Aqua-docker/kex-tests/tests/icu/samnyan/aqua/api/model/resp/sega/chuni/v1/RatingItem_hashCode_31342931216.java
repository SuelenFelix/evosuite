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

public class RatingItem_hashCode_31342931216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6027;

    public RatingItem_hashCode_31342931216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6027 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term6027, term6027.getClass(), "musicId", 1532723756);
        setField(term6027, term6027.getClass(), "musicName", "gCWtLVKVVe");
        setField(term6027, term6027.getClass(), "artistName", "fWKJoSoCwE");
        setIntField(term6027, term6027.getClass(), "level", -124088550);
        setIntField(term6027, term6027.getClass(), "score", 777492093);
        setIntField(term6027, term6027.getClass(), "ratingBase", 1414025609);
        setIntField(term6027, term6027.getClass(), "rating", 255145822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6027, args);
    }

};


