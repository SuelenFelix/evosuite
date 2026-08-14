package com.leosam.tvbox.mv.data;

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
import static com.leosam.tvbox.mv.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Vod_getVodActor_133689825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589;

    public Vod_getVodActor_133689825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1589 = newInstance(Class.forName("com.leosam.tvbox.mv.data.Vod"));
        setField(term1589, term1589.getClass(), "vodId", "whBvTVIIlC");
        setField(term1589, term1589.getClass(), "vodName", "IgRJUzaCwW");
        setField(term1589, term1589.getClass(), "vodActor", "JUmudUmaaV");
        setField(term1589, term1589.getClass(), "vodPlayFrom", "KoyGrUJeJW");
        setField(term1589, term1589.getClass(), "vodPic", "HqBOwkVqjD");
        setField(term1589, term1589.getClass(), "vodPlayUrl", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.data.Vod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVodActor", argTypes, term1589, args);
    }

};


