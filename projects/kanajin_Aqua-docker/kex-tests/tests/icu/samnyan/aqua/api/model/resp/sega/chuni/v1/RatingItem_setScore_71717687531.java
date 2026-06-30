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
import java.lang.Integer;

public class RatingItem_setScore_71717687531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6251;
     Object term6257;

    public RatingItem_setScore_71717687531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6251 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term6251, term6251.getClass(), "musicId", 0);
        setField(term6251, term6251.getClass(), "musicName", null);
        setField(term6251, term6251.getClass(), "artistName", null);
        setIntField(term6251, term6251.getClass(), "level", 0);
        setIntField(term6251, term6251.getClass(), "score", 0);
        setIntField(term6251, term6251.getClass(), "ratingBase", 0);
        setIntField(term6251, term6251.getClass(), "rating", 0);
        term6257 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6257;
        callMethod(klass, "setScore", argTypes, term6251, args);
    }

};


