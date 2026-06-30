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

public class RatingItem_getArtistName_7716118542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5271;

    public RatingItem_getArtistName_7716118542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5271 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5271, term5271.getClass(), "musicId", -138239905);
        setField(term5271, term5271.getClass(), "musicName", "QXzGXbEXMu");
        setField(term5271, term5271.getClass(), "artistName", "qxSDVejjiY");
        setIntField(term5271, term5271.getClass(), "level", 1709474063);
        setIntField(term5271, term5271.getClass(), "score", 1406617209);
        setIntField(term5271, term5271.getClass(), "ratingBase", 1706047059);
        setIntField(term5271, term5271.getClass(), "rating", 590451710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtistName", argTypes, term5271, args);
    }

};


