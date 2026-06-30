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

public class RatingItem_setArtistName_207363431429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6237;

    public RatingItem_setArtistName_207363431429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6237 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term6237, term6237.getClass(), "musicId", 0);
        setField(term6237, term6237.getClass(), "musicName", null);
        setField(term6237, term6237.getClass(), "artistName", null);
        setIntField(term6237, term6237.getClass(), "level", 0);
        setIntField(term6237, term6237.getClass(), "score", 0);
        setIntField(term6237, term6237.getClass(), "ratingBase", 0);
        setIntField(term6237, term6237.getClass(), "rating", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setArtistName", argTypes, term6237, args);
    }

};


