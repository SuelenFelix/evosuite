package org.openRealmOfStars.player.espionage;

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
import static org.openRealmOfStars.player.espionage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Intelligence_getSize_14510605581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63021;

    public Intelligence_getSize_14510605581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term63029 = new ArrayList();
        ((ArrayList) term63029).add((Object)null);
        ((ArrayList) term63029).add((Object)null);
        ((ArrayList) term63029).add((Object)null);
        ((ArrayList) term63029).add((Object)null);
        ((ArrayList) term63029).add((Object)null);
        ((ArrayList) term63029).add((Object)null);
        ((ArrayList) term63029).add((Object)null);
        ((ArrayList) term63029).add((Object)null);
        ArrayList term63039 = new ArrayList();
        ((ArrayList) term63039).add((Object)null);
        ((ArrayList) term63039).add((Object)null);
        ((ArrayList) term63039).add((Object)null);
        ((ArrayList) term63039).add((Object)null);
        ArrayList term63049 = new ArrayList();
        ((ArrayList) term63049).add((Object)null);
        ArrayList term63059 = new ArrayList();
        ((ArrayList) term63059).add((Object)null);
        ((ArrayList) term63059).add((Object)null);
        ((ArrayList) term63059).add((Object)null);
        ((ArrayList) term63059).add((Object)null);
        ((ArrayList) term63059).add((Object)null);
        ((ArrayList) term63059).add((Object)null);
        ((ArrayList) term63059).add((Object)null);
        ((ArrayList) term63059).add((Object)null);
        ((ArrayList) term63059).add((Object)null);
        term63021 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.Intelligence"));
        Object[] term63022 = (Object[]) newArray("org.openRealmOfStars.player.espionage.IntelligenceList", 4);
        Object term63023 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        Object term63033 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        Object term63043 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        Object term63053 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term63023, term63023.getClass(), "playerIndex", -1234361060);
        setIntField(term63023, term63023.getClass(), "intelligenceLevel1Estimate", -267520884);
        setIntField(term63023, term63023.getClass(), "intelligenceLevel3Estimate", 1431716083);
        setIntField(term63023, term63023.getClass(), "intelligenceLevel5Estimate", 1540004680);
        setIntField(term63023, term63023.getClass(), "intelligenceLevel7Estimate", -594861500);
        setField(term63023, term63023.getClass(), "list", term63029);
        setElement(term63022, 0, term63023);
        setIntField(term63033, term63033.getClass(), "playerIndex", 284652039);
        setIntField(term63033, term63033.getClass(), "intelligenceLevel1Estimate", 1163350537);
        setIntField(term63033, term63033.getClass(), "intelligenceLevel3Estimate", -855026181);
        setIntField(term63033, term63033.getClass(), "intelligenceLevel5Estimate", 1404243357);
        setIntField(term63033, term63033.getClass(), "intelligenceLevel7Estimate", -570134327);
        setField(term63033, term63033.getClass(), "list", term63039);
        setElement(term63022, 1, term63033);
        setIntField(term63043, term63043.getClass(), "playerIndex", -1980981205);
        setIntField(term63043, term63043.getClass(), "intelligenceLevel1Estimate", -1530498856);
        setIntField(term63043, term63043.getClass(), "intelligenceLevel3Estimate", 1816257051);
        setIntField(term63043, term63043.getClass(), "intelligenceLevel5Estimate", -541591725);
        setIntField(term63043, term63043.getClass(), "intelligenceLevel7Estimate", 498271385);
        setField(term63043, term63043.getClass(), "list", term63049);
        setElement(term63022, 2, term63043);
        setIntField(term63053, term63053.getClass(), "playerIndex", 1418222767);
        setIntField(term63053, term63053.getClass(), "intelligenceLevel1Estimate", 1862441057);
        setIntField(term63053, term63053.getClass(), "intelligenceLevel3Estimate", 1889814117);
        setIntField(term63053, term63053.getClass(), "intelligenceLevel5Estimate", -1336297368);
        setIntField(term63053, term63053.getClass(), "intelligenceLevel7Estimate", 1535507114);
        setField(term63053, term63053.getClass(), "list", term63059);
        setElement(term63022, 3, term63053);
        setField(term63021, term63021.getClass(), "intelligenceLists", term63022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.Intelligence");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term63021, args);
    }

};


