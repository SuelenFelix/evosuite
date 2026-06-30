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

public class RatingItem_equals_46871298014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45801;
     Object term45831;

    public RatingItem_equals_46871298014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45801 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45801, term45801.getClass(), "musicId", 540775467);
        setField(term45801, term45801.getClass(), "musicName", "DBufEhhBCQ");
        setField(term45801, term45801.getClass(), "artistName", "GiNZRBZjgO");
        setIntField(term45801, term45801.getClass(), "level", -2083028527);
        setIntField(term45801, term45801.getClass(), "score", 1631605263);
        setIntField(term45801, term45801.getClass(), "ratingBase", -1378134881);
        setIntField(term45801, term45801.getClass(), "rating", -1887131478);
        term45831 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45831;
        callMethod(klass, "equals", argTypes, term45801, args);
    }

};


