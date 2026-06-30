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

public class RatingItem_setArtistName_17802313079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45521;

    public RatingItem_setArtistName_17802313079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45521 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem"));
        setIntField(term45521, term45521.getClass(), "musicId", 2130990985);
        setField(term45521, term45521.getClass(), "musicName", "jMQsCLYfKd");
        setField(term45521, term45521.getClass(), "artistName", "dpcpGqEQLd");
        setIntField(term45521, term45521.getClass(), "level", 523197189);
        setIntField(term45521, term45521.getClass(), "score", 658684460);
        setIntField(term45521, term45521.getClass(), "ratingBase", 2073367039);
        setIntField(term45521, term45521.getClass(), "rating", -365877126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pButgbcWlR";
        callMethod(klass, "setArtistName", argTypes, term45521, args);
    }

};


