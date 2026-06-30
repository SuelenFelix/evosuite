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

public class RatingItem_setMusicName_16574521238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45449;

    public RatingItem_setMusicName_16574521238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45449 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45449, term45449.getClass(), "musicId", -1427059961);
        setField(term45449, term45449.getClass(), "musicName", "qSnwPXRuzC");
        setField(term45449, term45449.getClass(), "artistName", "gqhqalMaKC");
        setIntField(term45449, term45449.getClass(), "level", 1120685189);
        setIntField(term45449, term45449.getClass(), "score", 654585209);
        setIntField(term45449, term45449.getClass(), "ratingBase", -1661685401);
        setIntField(term45449, term45449.getClass(), "rating", 1427434947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qkMduZHBXR";
        callMethod(klass, "setMusicName", argTypes, term45449, args);
    }

};


