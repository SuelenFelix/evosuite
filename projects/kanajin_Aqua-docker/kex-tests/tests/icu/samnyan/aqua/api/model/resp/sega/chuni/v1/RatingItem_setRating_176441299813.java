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

public class RatingItem_setRating_176441299813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5873;
     Object term5903;

    public RatingItem_setRating_176441299813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5873 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5873, term5873.getClass(), "musicId", 674879025);
        setField(term5873, term5873.getClass(), "musicName", "xIeFjkHkOe");
        setField(term5873, term5873.getClass(), "artistName", "SdCKLMIYnX");
        setIntField(term5873, term5873.getClass(), "level", -1538936030);
        setIntField(term5873, term5873.getClass(), "score", -752870423);
        setIntField(term5873, term5873.getClass(), "ratingBase", -1698809299);
        setIntField(term5873, term5873.getClass(), "rating", 401512128);
        term5903 = new Integer(-2069930777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5903;
        callMethod(klass, "setRating", argTypes, term5873, args);
    }

};


