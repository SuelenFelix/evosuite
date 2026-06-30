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

public class RatingItem_setLevel_143044221010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45593;
     Object term45623;

    public RatingItem_setLevel_143044221010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45593 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45593, term45593.getClass(), "musicId", 251018856);
        setField(term45593, term45593.getClass(), "musicName", "tPiZMhJIXj");
        setField(term45593, term45593.getClass(), "artistName", "lrEkNimddJ");
        setIntField(term45593, term45593.getClass(), "level", -1965331640);
        setIntField(term45593, term45593.getClass(), "score", -514392629);
        setIntField(term45593, term45593.getClass(), "ratingBase", -166633123);
        setIntField(term45593, term45593.getClass(), "rating", 373110517);
        term45623 = new Integer(-1632703926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45623;
        callMethod(klass, "setLevel", argTypes, term45593, args);
    }

};


