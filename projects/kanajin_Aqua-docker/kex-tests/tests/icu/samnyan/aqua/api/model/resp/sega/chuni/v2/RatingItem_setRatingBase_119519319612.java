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

public class RatingItem_setRatingBase_119519319612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45697;
     Object term45727;

    public RatingItem_setRatingBase_119519319612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45697 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45697, term45697.getClass(), "musicId", 25277058);
        setField(term45697, term45697.getClass(), "musicName", "NpjPDfnDRd");
        setField(term45697, term45697.getClass(), "artistName", "SWMYovqYdk");
        setIntField(term45697, term45697.getClass(), "level", -949634053);
        setIntField(term45697, term45697.getClass(), "score", 1495471055);
        setIntField(term45697, term45697.getClass(), "ratingBase", -583415628);
        setIntField(term45697, term45697.getClass(), "rating", -1488660931);
        term45727 = new Integer(1899095931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term45727;
        callMethod(klass, "setRatingBase", argTypes, term45697, args);
    }

};


