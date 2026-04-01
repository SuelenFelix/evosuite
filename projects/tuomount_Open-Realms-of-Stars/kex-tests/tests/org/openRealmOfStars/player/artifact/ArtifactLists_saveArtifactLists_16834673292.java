package org.openRealmOfStars.player.artifact;

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
import static org.openRealmOfStars.player.artifact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ArtifactLists_saveArtifactLists_16834673292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5195;
     Object term5205;

    public ArtifactLists_saveArtifactLists_16834673292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5196 = new ArrayList();
        ArrayList term5200 = new ArrayList();
        term5195 = newInstance(Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists"));
        setField(term5195, term5195.getClass(), "discoveredArtifacts", term5196);
        setField(term5195, term5195.getClass(), "researchedArtifacts", term5200);
        setIntField(term5195, term5195.getClass(), "artifactResearchPoints", 306847454);
        term5205 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term5207 = (byte[]) newByteArray(1);
        byte[] term5209 = (byte[]) newByteArray(6);
        Object term5217 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term5205, term5205.getClass(), "written", 1745276158);
        setByteElement(term5207, 0, (byte) -10);
        setField(term5205, term5205.getClass(), "bytearr", term5207);
        setByteElement(term5209, 0, (byte) 79);
        setByteElement(term5209, 1, (byte) -119);
        setByteElement(term5209, 2, (byte) -66);
        setByteElement(term5209, 3, (byte) 83);
        setByteElement(term5209, 4, (byte) 74);
        setByteElement(term5209, 5, (byte) -71);
        setField(term5205, term5205.getClass(), "writeBuffer", term5209);
        setField(term5205, term5205.getClass(), "out", null);
        setBooleanField(term5205, term5205.getClass(), "closed", true);
        setField(term5205, term5205.getClass(), "closeLock", term5217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.artifact.ArtifactLists");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term5205;
        callMethod(klass, "saveArtifactLists", argTypes, term5195, args);
    }

};


