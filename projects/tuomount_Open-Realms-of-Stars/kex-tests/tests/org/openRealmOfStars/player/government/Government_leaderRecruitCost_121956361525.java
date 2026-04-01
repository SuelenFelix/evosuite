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

public class Government_leaderRecruitCost_121956361525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16653;

    public Government_leaderRecruitCost_121956361525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16748 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term16747 = ((Class) term16748).getDeclaredField((String) "AI_RULER");
        ((Field) term16747).setAccessible(true);
        Object enum33 = ((Field) term16747).get((Object) null);
        ArrayList term16721 = new ArrayList();
        ((ArrayList) term16721).add((Object)null);
        ((ArrayList) term16721).add((Object)null);
        ((ArrayList) term16721).add((Object)null);
        ((ArrayList) term16721).add((Object)null);
        ((ArrayList) term16721).add((Object)null);
        ((ArrayList) term16721).add((Object)null);
        ((ArrayList) term16721).add((Object)null);
        Object term16716 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term16716, term16716.getClass(), "traitId", "");
        setField(term16716, term16716.getClass(), "traitName", "");
        setField(term16716, term16716.getClass(), "description", "");
        setField(term16716, term16716.getClass(), "group", "");
        setField(term16716, term16716.getClass(), "conflictsWithIds", term16721);
        setByteField(term16716, term16716.getClass(), "traitPoints", (byte) 96);
        ArrayList term16714 = new ArrayList();
        ((ArrayList) term16714).add(term16716);
        term16653 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term16653, term16653.getClass(), "id", "rZyrfnMvHa");
        setField(term16653, term16653.getClass(), "name", "GMyMhTZeDC");
        setField(term16653, term16653.getClass(), "rulerSelection", enum33);
        setField(term16653, term16653.getClass(), "rulerTitleMale", "KqQOTshBOL");
        setField(term16653, term16653.getClass(), "rulerTitleFemale", "cuWgFcYkPC");
        setField(term16653, term16653.getClass(), "traits", term16714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "leaderRecruitCost", argTypes, term16653, args);
    }

};


