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
import java.lang.Integer;

public class RatingItem_setMusicId_20436748097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5521;
     Object term5551;

    public RatingItem_setMusicId_20436748097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5521 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5521, term5521.getClass(), "musicId", -2110556060);
        setField(term5521, term5521.getClass(), "musicName", "yGtHPyvYiQ");
        setField(term5521, term5521.getClass(), "artistName", "MvRIxilFMJ");
        setIntField(term5521, term5521.getClass(), "level", 313459791);
        setIntField(term5521, term5521.getClass(), "score", 752615112);
        setIntField(term5521, term5521.getClass(), "ratingBase", -1674430871);
        setIntField(term5521, term5521.getClass(), "rating", 794352120);
        term5551 = new Integer(340719678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5551;
        callMethod(klass, "setMusicId", argTypes, term5521, args);
    }

};


