package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class VideoPage_setCid_16526184182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16276;
     Object term16307;

    public VideoPage_setCid_16526184182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16276 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term16276, term16276.getClass(), "cid", -7283193381993602128L);
        setIntField(term16276, term16276.getClass(), "page", -1693535639);
        setField(term16276, term16276.getClass(), "from", "KoasxTJGpx");
        setField(term16276, term16276.getClass(), "partName", "ceGeARYMoa");
        setLongField(term16276, term16276.getClass(), "duration", 6351887424140565471L);
        setIntField(term16276, term16276.getClass(), "width", 1344744036);
        setIntField(term16276, term16276.getClass(), "height", -98060427);
        setBooleanField(term16276, term16276.getClass(), "rotate", true);
        term16307 = new Long(6273670659288205855L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term16307;
        callMethod(klass, "setCid", argTypes, term16276, args);
    }

};


