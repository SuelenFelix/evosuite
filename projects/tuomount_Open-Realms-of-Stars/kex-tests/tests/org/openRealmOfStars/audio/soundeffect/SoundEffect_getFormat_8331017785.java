package org.openRealmOfStars.audio.soundeffect;

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
import static org.openRealmOfStars.audio.soundeffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SoundEffect_getFormat_8331017785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;

    public SoundEffect_getFormat_8331017785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282 = newInstance(Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect"));
        setField(term282, term282.getClass(), "format", null);
        setField(term282, term282.getClass(), "audioData", null);
        setField(term282, term282.getClass(), "audioName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat", argTypes, term282, args);
    }

};


