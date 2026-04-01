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

public class Intelligence_clearAllIntelligenceBonuses_9598442333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63087;

    public Intelligence_clearAllIntelligenceBonuses_9598442333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term63095 = new ArrayList();
        ((ArrayList) term63095).add((Object)null);
        ((ArrayList) term63095).add((Object)null);
        ((ArrayList) term63095).add((Object)null);
        ((ArrayList) term63095).add((Object)null);
        term63087 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.Intelligence"));
        Object[] term63088 = (Object[]) newArray("org.openRealmOfStars.player.espionage.IntelligenceList", 1);
        Object term63089 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term63089, term63089.getClass(), "playerIndex", 666379561);
        setIntField(term63089, term63089.getClass(), "intelligenceLevel1Estimate", 1071163503);
        setIntField(term63089, term63089.getClass(), "intelligenceLevel3Estimate", -1507726422);
        setIntField(term63089, term63089.getClass(), "intelligenceLevel5Estimate", 171429081);
        setIntField(term63089, term63089.getClass(), "intelligenceLevel7Estimate", 1552107519);
        setField(term63089, term63089.getClass(), "list", term63095);
        setElement(term63088, 0, term63089);
        setField(term63087, term63087.getClass(), "intelligenceLists", term63088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.Intelligence");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearAllIntelligenceBonuses", argTypes, term63087, args);
    }

};


