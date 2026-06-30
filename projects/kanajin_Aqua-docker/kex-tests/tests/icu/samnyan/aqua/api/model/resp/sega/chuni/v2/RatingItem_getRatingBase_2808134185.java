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

public class RatingItem_getRatingBase_2808134185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45297;

    public RatingItem_getRatingBase_2808134185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45297 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45297, term45297.getClass(), "musicId", -1265226052);
        setField(term45297, term45297.getClass(), "musicName", "HTimNhSNVi");
        setField(term45297, term45297.getClass(), "artistName", "IWJWbrHcqm");
        setIntField(term45297, term45297.getClass(), "level", 1970023149);
        setIntField(term45297, term45297.getClass(), "score", -336351735);
        setIntField(term45297, term45297.getClass(), "ratingBase", 1938932230);
        setIntField(term45297, term45297.getClass(), "rating", 1128720609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRatingBase", argTypes, term45297, args);
    }

};


