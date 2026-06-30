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

public class RatingItem_getMusicId_4910549270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5171;

    public RatingItem_getMusicId_4910549270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5171 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5171, term5171.getClass(), "musicId", -687282231);
        setField(term5171, term5171.getClass(), "musicName", "SPpkrGcPRr");
        setField(term5171, term5171.getClass(), "artistName", "sEccwbJKYE");
        setIntField(term5171, term5171.getClass(), "level", 1200440315);
        setIntField(term5171, term5171.getClass(), "score", 40571662);
        setIntField(term5171, term5171.getClass(), "ratingBase", 1863910269);
        setIntField(term5171, term5171.getClass(), "rating", 864645689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term5171, args);
    }

};


