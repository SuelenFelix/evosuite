package org.openRealmOfStars.starMap.event.ascensionEvents;

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
import static org.openRealmOfStars.starMap.event.ascensionEvents.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AscensionEvents_save_18568414435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1859;
     Object term1865;

    public AscensionEvents_save_18568414435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1859 = newInstance(Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents"));
        setIntField(term1859, term1859.getClass(), "artifactSpawnSpeed", 941650513);
        setIntField(term1859, term1859.getClass(), "spaceDevourerSpeed", 444029505);
        setIntField(term1859, term1859.getClass(), "chanceForArtifact", -1034506028);
        setIntField(term1859, term1859.getClass(), "chanceForDevourer", -1263114719);
        setByteField(term1859, term1859.getClass(), "ascensionActivation", (byte) 116);
        term1865 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term1867 = (byte[]) newByteArray(5);
        byte[] term1873 = (byte[]) newByteArray(1);
        Object term1876 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1865, term1865.getClass(), "written", -894662986);
        setByteElement(term1867, 0, (byte) -81);
        setByteElement(term1867, 1, (byte) 102);
        setByteElement(term1867, 2, (byte) -118);
        setByteElement(term1867, 3, (byte) -126);
        setByteElement(term1867, 4, (byte) -91);
        setField(term1865, term1865.getClass(), "bytearr", term1867);
        setByteElement(term1873, 0, (byte) -104);
        setField(term1865, term1865.getClass(), "writeBuffer", term1873);
        setField(term1865, term1865.getClass(), "out", null);
        setBooleanField(term1865, term1865.getClass(), "closed", true);
        setField(term1865, term1865.getClass(), "closeLock", term1876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.event.ascensionEvents.AscensionEvents");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term1865;
        callMethod(klass, "save", argTypes, term1859, args);
    }

};


