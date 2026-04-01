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
import java.lang.Object;
import java.util.HashMap;

public class SoundEffect_getData_18960376822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;

    public SoundEffect_getData_18960376822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term165 = new HashMap();
        term144 = newInstance(Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect"));
        Object term145 = newInstance(Class.forName("javax.sound.sampled.AudioFormat"));
        Object term146 = newInstance(Class.forName("javax.sound.sampled.AudioFormat$Encoding"));
        byte[] term173 = (byte[]) newByteArray(3);
        setField(term146, term146.getClass(), "name", "SzjVpOQTyS");
        setField(term145, term145.getClass(), "encoding", term146);
        setFloatField(term145, term145.getClass(), "sampleRate", 0.5523636F);
        setIntField(term145, term145.getClass(), "sampleSizeInBits", -1955890973);
        setIntField(term145, term145.getClass(), "channels", -2038273078);
        setIntField(term145, term145.getClass(), "frameSize", 1227103734);
        setFloatField(term145, term145.getClass(), "frameRate", 0.8564069F);
        setBooleanField(term145, term145.getClass(), "bigEndian", false);
        setField(term145, term145.getClass(), "properties", term165);
        setField(term144, term144.getClass(), "format", term145);
        setByteElement(term173, 0, (byte) 79);
        setByteElement(term173, 1, (byte) -119);
        setByteElement(term173, 2, (byte) -66);
        setField(term144, term144.getClass(), "audioData", term173);
        setField(term144, term144.getClass(), "audioName", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term144, args);
    }

};


