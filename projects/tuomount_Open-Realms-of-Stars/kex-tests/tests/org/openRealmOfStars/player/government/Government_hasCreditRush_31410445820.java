package org.openRealmOfStars.player.government;

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
import static org.openRealmOfStars.player.government.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Government_hasCreditRush_31410445820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14408;

    public Government_hasCreditRush_31410445820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14539 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term14538 = ((Class) term14539).getDeclaredField((String) "AI_RULER");
        ((Field) term14538).setAccessible(true);
        Object enum28 = ((Field) term14538).get((Object) null);
        ArrayList term14476 = new ArrayList();
        ((ArrayList) term14476).add((Object)null);
        ((ArrayList) term14476).add((Object)null);
        ((ArrayList) term14476).add((Object)null);
        ((ArrayList) term14476).add((Object)null);
        ((ArrayList) term14476).add((Object)null);
        ((ArrayList) term14476).add((Object)null);
        ((ArrayList) term14476).add((Object)null);
        ((ArrayList) term14476).add((Object)null);
        ((ArrayList) term14476).add((Object)null);
        Object term14471 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14471, term14471.getClass(), "traitId", "");
        setField(term14471, term14471.getClass(), "traitName", "");
        setField(term14471, term14471.getClass(), "description", "");
        setField(term14471, term14471.getClass(), "group", "");
        setField(term14471, term14471.getClass(), "conflictsWithIds", term14476);
        setByteField(term14471, term14471.getClass(), "traitPoints", (byte) 24);
        ArrayList term14485 = new ArrayList();
        ((ArrayList) term14485).add((Object)null);
        ((ArrayList) term14485).add((Object)null);
        Object term14480 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14480, term14480.getClass(), "traitId", "");
        setField(term14480, term14480.getClass(), "traitName", "");
        setField(term14480, term14480.getClass(), "description", "");
        setField(term14480, term14480.getClass(), "group", "");
        setField(term14480, term14480.getClass(), "conflictsWithIds", term14485);
        setByteField(term14480, term14480.getClass(), "traitPoints", (byte) 123);
        ArrayList term14494 = new ArrayList();
        ((ArrayList) term14494).add((Object)null);
        ((ArrayList) term14494).add((Object)null);
        ((ArrayList) term14494).add((Object)null);
        ((ArrayList) term14494).add((Object)null);
        ((ArrayList) term14494).add((Object)null);
        ((ArrayList) term14494).add((Object)null);
        ((ArrayList) term14494).add((Object)null);
        Object term14489 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14489, term14489.getClass(), "traitId", "");
        setField(term14489, term14489.getClass(), "traitName", "");
        setField(term14489, term14489.getClass(), "description", "");
        setField(term14489, term14489.getClass(), "group", "");
        setField(term14489, term14489.getClass(), "conflictsWithIds", term14494);
        setByteField(term14489, term14489.getClass(), "traitPoints", (byte) -101);
        ArrayList term14503 = new ArrayList();
        Object term14498 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14498, term14498.getClass(), "traitId", "");
        setField(term14498, term14498.getClass(), "traitName", "");
        setField(term14498, term14498.getClass(), "description", "");
        setField(term14498, term14498.getClass(), "group", "");
        setField(term14498, term14498.getClass(), "conflictsWithIds", term14503);
        setByteField(term14498, term14498.getClass(), "traitPoints", (byte) -102);
        ArrayList term14512 = new ArrayList();
        ((ArrayList) term14512).add((Object)null);
        ((ArrayList) term14512).add((Object)null);
        ((ArrayList) term14512).add((Object)null);
        ((ArrayList) term14512).add((Object)null);
        ((ArrayList) term14512).add((Object)null);
        ((ArrayList) term14512).add((Object)null);
        ((ArrayList) term14512).add((Object)null);
        ((ArrayList) term14512).add((Object)null);
        ((ArrayList) term14512).add((Object)null);
        Object term14507 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14507, term14507.getClass(), "traitId", "");
        setField(term14507, term14507.getClass(), "traitName", "");
        setField(term14507, term14507.getClass(), "description", "");
        setField(term14507, term14507.getClass(), "group", "");
        setField(term14507, term14507.getClass(), "conflictsWithIds", term14512);
        setByteField(term14507, term14507.getClass(), "traitPoints", (byte) -95);
        ArrayList term14469 = new ArrayList();
        ((ArrayList) term14469).add(term14471);
        ((ArrayList) term14469).add(term14480);
        ((ArrayList) term14469).add(term14489);
        ((ArrayList) term14469).add(term14498);
        ((ArrayList) term14469).add(term14507);
        term14408 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term14408, term14408.getClass(), "id", "xPnOHsNlyc");
        setField(term14408, term14408.getClass(), "name", "OTSPWPJefj");
        setField(term14408, term14408.getClass(), "rulerSelection", enum28);
        setField(term14408, term14408.getClass(), "rulerTitleMale", "EOTYMqXRmE");
        setField(term14408, term14408.getClass(), "rulerTitleFemale", "iTxNduwSjE");
        setField(term14408, term14408.getClass(), "traits", term14469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasCreditRush", argTypes, term14408, args);
    }

};


