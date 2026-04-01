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

public class MusicFileInfo_getFilename_15923935805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public MusicFileInfo_getFilename_15923935805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term295, term295.getClass(), "songName", "LQFpaHEwXR");
        setField(term295, term295.getClass(), "author", "oVcInYnLWB");
        setField(term295, term295.getClass(), "fileName", "aJlieCFVtF");
        setBooleanField(term295, term295.getClass(), "custom", false);
        setIntField(term295, term295.getClass(), "fadingLimit", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilename", argTypes, term295, args);
    }

};


