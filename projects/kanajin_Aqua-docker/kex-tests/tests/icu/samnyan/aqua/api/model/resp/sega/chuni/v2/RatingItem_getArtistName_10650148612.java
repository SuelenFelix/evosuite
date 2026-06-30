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

public class RatingItem_getArtistName_10650148612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45147;

    public RatingItem_getArtistName_10650148612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45147 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45147, term45147.getClass(), "musicId", 749289511);
        setField(term45147, term45147.getClass(), "musicName", "JDTrhGRsDT");
        setField(term45147, term45147.getClass(), "artistName", "vHxsVQImjS");
        setIntField(term45147, term45147.getClass(), "level", -414437174);
        setIntField(term45147, term45147.getClass(), "score", -860227615);
        setIntField(term45147, term45147.getClass(), "ratingBase", -1696192372);
        setIntField(term45147, term45147.getClass(), "rating", 1239525687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtistName", argTypes, term45147, args);
    }

};


