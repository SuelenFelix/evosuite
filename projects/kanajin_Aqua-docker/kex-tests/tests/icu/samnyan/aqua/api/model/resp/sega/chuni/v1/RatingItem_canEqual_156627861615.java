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

public class RatingItem_canEqual_156627861615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5976;
     Object term6006;

    public RatingItem_canEqual_156627861615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5976 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem"));
        setIntField(term5976, term5976.getClass(), "musicId", -348612876);
        setField(term5976, term5976.getClass(), "musicName", "xJgPlLxpgC");
        setField(term5976, term5976.getClass(), "artistName", "EYtfuJaxiM");
        setIntField(term5976, term5976.getClass(), "level", 1302807565);
        setIntField(term5976, term5976.getClass(), "score", -838848221);
        setIntField(term5976, term5976.getClass(), "ratingBase", 1163761623);
        setIntField(term5976, term5976.getClass(), "rating", 718742281);
        term6006 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RatingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6006;
        callMethod(klass, "canEqual", argTypes, term5976, args);
    }

};


