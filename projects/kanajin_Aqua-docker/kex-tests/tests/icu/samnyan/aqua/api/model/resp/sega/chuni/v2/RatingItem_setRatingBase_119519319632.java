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
import java.lang.Integer;

public class RatingItem_setRatingBase_119519319632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46135;
     Object term46141;

    public RatingItem_setRatingBase_119519319632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46135 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term46135, term46135.getClass(), "musicId", 0);
        setField(term46135, term46135.getClass(), "musicName", null);
        setField(term46135, term46135.getClass(), "artistName", null);
        setIntField(term46135, term46135.getClass(), "level", 0);
        setIntField(term46135, term46135.getClass(), "score", 0);
        setIntField(term46135, term46135.getClass(), "ratingBase", 0);
        setIntField(term46135, term46135.getClass(), "rating", 0);
        term46141 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term46141;
        callMethod(klass, "setRatingBase", argTypes, term46135, args);
    }

};


