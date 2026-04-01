package org.openRealmOfStars.audio.music;

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
import static org.openRealmOfStars.audio.music.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MusicFileInfo_getName_108655490413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;

    public MusicFileInfo_getName_108655490413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term576 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term576, term576.getClass(), "songName", null);
        setField(term576, term576.getClass(), "author", null);
        setField(term576, term576.getClass(), "fileName", null);
        setBooleanField(term576, term576.getClass(), "custom", false);
        setIntField(term576, term576.getClass(), "fadingLimit", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term576, args);
    }

};


