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
import java.lang.Integer;

public class Intelligence_getByIndex_6483302762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63063;
     Object term63085;

    public Intelligence_getByIndex_6483302762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term63071 = new ArrayList();
        ((ArrayList) term63071).add((Object)null);
        ArrayList term63081 = new ArrayList();
        ((ArrayList) term63081).add((Object)null);
        ((ArrayList) term63081).add((Object)null);
        term63063 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.Intelligence"));
        Object[] term63064 = (Object[]) newArray("org.openRealmOfStars.player.espionage.IntelligenceList", 2);
        Object term63065 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        Object term63075 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term63065, term63065.getClass(), "playerIndex", -1174141307);
        setIntField(term63065, term63065.getClass(), "intelligenceLevel1Estimate", -1603957392);
        setIntField(term63065, term63065.getClass(), "intelligenceLevel3Estimate", -287005602);
        setIntField(term63065, term63065.getClass(), "intelligenceLevel5Estimate", 923353564);
        setIntField(term63065, term63065.getClass(), "intelligenceLevel7Estimate", 2013647768);
        setField(term63065, term63065.getClass(), "list", term63071);
        setElement(term63064, 0, term63065);
        setIntField(term63075, term63075.getClass(), "playerIndex", -1073781147);
        setIntField(term63075, term63075.getClass(), "intelligenceLevel1Estimate", 138913824);
        setIntField(term63075, term63075.getClass(), "intelligenceLevel3Estimate", -637767208);
        setIntField(term63075, term63075.getClass(), "intelligenceLevel5Estimate", 844890845);
        setIntField(term63075, term63075.getClass(), "intelligenceLevel7Estimate", -989538894);
        setField(term63075, term63075.getClass(), "list", term63081);
        setElement(term63064, 1, term63075);
        setField(term63063, term63063.getClass(), "intelligenceLists", term63064);
        term63085 = new Integer(-1409886459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.Intelligence");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63085;
        callMethod(klass, "getByIndex", argTypes, term63063, args);
    }

};


