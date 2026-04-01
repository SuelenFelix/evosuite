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

public class SoundEffect_getFormat_8331017781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;

    public SoundEffect_getFormat_8331017781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term95 = new HashMap();
        term74 = newInstance(Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect"));
        Object term75 = newInstance(Class.forName("javax.sound.sampled.AudioFormat"));
        Object term76 = newInstance(Class.forName("javax.sound.sampled.AudioFormat$Encoding"));
        byte[] term103 = (byte[]) newByteArray(4);
        setField(term76, term76.getClass(), "name", "xxtlPwDYFs");
        setField(term75, term75.getClass(), "encoding", term76);
        setFloatField(term75, term75.getClass(), "sampleRate", 0.3455959F);
        setIntField(term75, term75.getClass(), "sampleSizeInBits", 391863371);
        setIntField(term75, term75.getClass(), "channels", -1922583790);
        setIntField(term75, term75.getClass(), "frameSize", -616727354);
        setFloatField(term75, term75.getClass(), "frameRate", 0.09123778F);
        setBooleanField(term75, term75.getClass(), "bigEndian", false);
        setField(term75, term75.getClass(), "properties", term95);
        setField(term74, term74.getClass(), "format", term75);
        setByteElement(term103, 0, (byte) -58);
        setByteElement(term103, 1, (byte) -29);
        setByteElement(term103, 2, (byte) -54);
        setByteElement(term103, 3, (byte) -10);
        setField(term74, term74.getClass(), "audioData", term103);
        setField(term74, term74.getClass(), "audioName", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormat", argTypes, term74, args);
    }

};


