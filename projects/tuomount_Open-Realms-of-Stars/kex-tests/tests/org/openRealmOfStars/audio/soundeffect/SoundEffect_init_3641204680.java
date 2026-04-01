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

public class SoundEffect_init_3641204680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term43;

    public SoundEffect_init_3641204680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21 = new HashMap();
        term1 = newInstance(Class.forName("javax.sound.sampled.AudioFormat"));
        Object term2 = newInstance(Class.forName("javax.sound.sampled.AudioFormat$Encoding"));
        setField(term2, term2.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "encoding", term2);
        setFloatField(term1, term1.getClass(), "sampleRate", 0.13238746F);
        setIntField(term1, term1.getClass(), "sampleSizeInBits", 568599855);
        setIntField(term1, term1.getClass(), "channels", 1162663216);
        setIntField(term1, term1.getClass(), "frameSize", 1484323161);
        setFloatField(term1, term1.getClass(), "frameRate", 0.2707036F);
        setBooleanField(term1, term1.getClass(), "bigEndian", false);
        setField(term1, term1.getClass(), "properties", term21);
        term43 = (byte[]) newByteArray(5);
        setByteElement(term43, 0, (byte) 47);
        setByteElement(term43, 1, (byte) 48);
        setByteElement(term43, 2, (byte) 89);
        setByteElement(term43, 3, (byte) 75);
        setByteElement(term43, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.sound.sampled.AudioFormat");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "MuLcgQHgqz";
        args[2] = term43;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


