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

public class RatingItem_setScore_42377386811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45645;
     Object term45675;

    public RatingItem_setScore_42377386811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45645 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45645, term45645.getClass(), "musicId", -1031499401);
        setField(term45645, term45645.getClass(), "musicName", "fkeYGEUxMA");
        setField(term45645, term45645.getClass(), "artistName", "aJUGPodUIW");
        setIntField(term45645, term45645.getClass(), "level", 280202002);
        setIntField(term45645, term45645.getClass(), "score", -1074402599);
        setIntField(term45645, term45645.getClass(), "ratingBase", -1867539151);
        setIntField(term45645, term45645.getClass(), "rating", -816430246);
        term45675 = new Integer(1754193865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45675;
        callMethod(klass, "setScore", argTypes, term45645, args);
    }

};


