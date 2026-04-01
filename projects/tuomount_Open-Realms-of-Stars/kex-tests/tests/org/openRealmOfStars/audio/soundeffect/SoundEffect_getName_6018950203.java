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

public class SoundEffect_getName_6018950203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212;

    public SoundEffect_getName_6018950203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term233 = new HashMap();
        term212 = newInstance(Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect"));
        Object term213 = newInstance(Class.forName("javax.sound.sampled.AudioFormat"));
        Object term214 = newInstance(Class.forName("javax.sound.sampled.AudioFormat$Encoding"));
        byte[] term241 = (byte[]) newByteArray(4);
        setField(term214, term214.getClass(), "name", "RMFIsYGgne");
        setField(term213, term213.getClass(), "encoding", term214);
        setFloatField(term213, term213.getClass(), "sampleRate", 0.5446086F);
        setIntField(term213, term213.getClass(), "sampleSizeInBits", -1339778481);
        setIntField(term213, term213.getClass(), "channels", 1725571209);
        setIntField(term213, term213.getClass(), "frameSize", -522618178);
        setFloatField(term213, term213.getClass(), "frameRate", 0.5254275F);
        setBooleanField(term213, term213.getClass(), "bigEndian", false);
        setField(term213, term213.getClass(), "properties", term233);
        setField(term212, term212.getClass(), "format", term213);
        setByteElement(term241, 0, (byte) 83);
        setByteElement(term241, 1, (byte) 74);
        setByteElement(term241, 2, (byte) -71);
        setByteElement(term241, 3, (byte) 49);
        setField(term212, term212.getClass(), "audioData", term241);
        setField(term212, term212.getClass(), "audioName", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term212, args);
    }

};


