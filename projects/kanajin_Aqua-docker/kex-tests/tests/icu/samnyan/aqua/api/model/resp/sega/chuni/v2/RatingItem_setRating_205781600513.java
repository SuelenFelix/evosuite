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

public class RatingItem_setRating_205781600513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45749;
     Object term45779;

    public RatingItem_setRating_205781600513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45749 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45749, term45749.getClass(), "musicId", 145571200);
        setField(term45749, term45749.getClass(), "musicName", "TQuvAoQcBe");
        setField(term45749, term45749.getClass(), "artistName", "nGYLfZrtWO");
        setIntField(term45749, term45749.getClass(), "level", -81919234);
        setIntField(term45749, term45749.getClass(), "score", 41779745);
        setIntField(term45749, term45749.getClass(), "ratingBase", 908188015);
        setIntField(term45749, term45749.getClass(), "rating", 1448289766);
        term45779 = new Integer(1377148923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45779;
        callMethod(klass, "setRating", argTypes, term45749, args);
    }

};


