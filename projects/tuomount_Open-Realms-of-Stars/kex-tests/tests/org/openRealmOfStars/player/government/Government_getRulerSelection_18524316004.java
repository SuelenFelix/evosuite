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

public class Government_getRulerSelection_18524316004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6830;

    public Government_getRulerSelection_18524316004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6995 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term6994 = ((Class) term6995).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term6994).setAccessible(true);
        Object enum12 = ((Field) term6994).get((Object) null);
        ArrayList term6905 = new ArrayList();
        Object term6900 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6900, term6900.getClass(), "traitId", "");
        setField(term6900, term6900.getClass(), "traitName", "");
        setField(term6900, term6900.getClass(), "description", "");
        setField(term6900, term6900.getClass(), "group", "");
        setField(term6900, term6900.getClass(), "conflictsWithIds", term6905);
        setByteField(term6900, term6900.getClass(), "traitPoints", (byte) 98);
        ArrayList term6914 = new ArrayList();
        Object term6909 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6909, term6909.getClass(), "traitId", "");
        setField(term6909, term6909.getClass(), "traitName", "");
        setField(term6909, term6909.getClass(), "description", "");
        setField(term6909, term6909.getClass(), "group", "");
        setField(term6909, term6909.getClass(), "conflictsWithIds", term6914);
        setByteField(term6909, term6909.getClass(), "traitPoints", (byte) 67);
        ArrayList term6923 = new ArrayList();
        ((ArrayList) term6923).add((Object)null);
        Object term6918 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6918, term6918.getClass(), "traitId", "");
        setField(term6918, term6918.getClass(), "traitName", "");
        setField(term6918, term6918.getClass(), "description", "");
        setField(term6918, term6918.getClass(), "group", "");
        setField(term6918, term6918.getClass(), "conflictsWithIds", term6923);
        setByteField(term6918, term6918.getClass(), "traitPoints", (byte) 66);
        ArrayList term6932 = new ArrayList();
        ((ArrayList) term6932).add((Object)null);
        ((ArrayList) term6932).add((Object)null);
        ((ArrayList) term6932).add((Object)null);
        ((ArrayList) term6932).add((Object)null);
        ((ArrayList) term6932).add((Object)null);
        Object term6927 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6927, term6927.getClass(), "traitId", "");
        setField(term6927, term6927.getClass(), "traitName", "");
        setField(term6927, term6927.getClass(), "description", "");
        setField(term6927, term6927.getClass(), "group", "");
        setField(term6927, term6927.getClass(), "conflictsWithIds", term6932);
        setByteField(term6927, term6927.getClass(), "traitPoints", (byte) -121);
        ArrayList term6941 = new ArrayList();
        ((ArrayList) term6941).add((Object)null);
        ((ArrayList) term6941).add((Object)null);
        ((ArrayList) term6941).add((Object)null);
        ((ArrayList) term6941).add((Object)null);
        Object term6936 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6936, term6936.getClass(), "traitId", "");
        setField(term6936, term6936.getClass(), "traitName", "");
        setField(term6936, term6936.getClass(), "description", "");
        setField(term6936, term6936.getClass(), "group", "");
        setField(term6936, term6936.getClass(), "conflictsWithIds", term6941);
        setByteField(term6936, term6936.getClass(), "traitPoints", (byte) -119);
        ArrayList term6950 = new ArrayList();
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        ((ArrayList) term6950).add((Object)null);
        Object term6945 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6945, term6945.getClass(), "traitId", "");
        setField(term6945, term6945.getClass(), "traitName", "");
        setField(term6945, term6945.getClass(), "description", "");
        setField(term6945, term6945.getClass(), "group", "");
        setField(term6945, term6945.getClass(), "conflictsWithIds", term6950);
        setByteField(term6945, term6945.getClass(), "traitPoints", (byte) 71);
        ArrayList term6959 = new ArrayList();
        Object term6954 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6954, term6954.getClass(), "traitId", "");
        setField(term6954, term6954.getClass(), "traitName", "");
        setField(term6954, term6954.getClass(), "description", "");
        setField(term6954, term6954.getClass(), "group", "");
        setField(term6954, term6954.getClass(), "conflictsWithIds", term6959);
        setByteField(term6954, term6954.getClass(), "traitPoints", (byte) 80);
        ArrayList term6968 = new ArrayList();
        ((ArrayList) term6968).add((Object)null);
        ((ArrayList) term6968).add((Object)null);
        ((ArrayList) term6968).add((Object)null);
        ((ArrayList) term6968).add((Object)null);
        ((ArrayList) term6968).add((Object)null);
        ((ArrayList) term6968).add((Object)null);
        ((ArrayList) term6968).add((Object)null);
        Object term6963 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term6963, term6963.getClass(), "traitId", "");
        setField(term6963, term6963.getClass(), "traitName", "");
        setField(term6963, term6963.getClass(), "description", "");
        setField(term6963, term6963.getClass(), "group", "");
        setField(term6963, term6963.getClass(), "conflictsWithIds", term6968);
        setByteField(term6963, term6963.getClass(), "traitPoints", (byte) 42);
        ArrayList term6898 = new ArrayList();
        ((ArrayList) term6898).add(term6900);
        ((ArrayList) term6898).add(term6909);
        ((ArrayList) term6898).add(term6918);
        ((ArrayList) term6898).add(term6927);
        ((ArrayList) term6898).add(term6936);
        ((ArrayList) term6898).add(term6945);
        ((ArrayList) term6898).add(term6954);
        ((ArrayList) term6898).add(term6963);
        term6830 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term6830, term6830.getClass(), "id", "ywmcuThdfL");
        setField(term6830, term6830.getClass(), "name", "GBOEuByOfr");
        setField(term6830, term6830.getClass(), "rulerSelection", enum12);
        setField(term6830, term6830.getClass(), "rulerTitleMale", "NHbOFFjyVK");
        setField(term6830, term6830.getClass(), "rulerTitleFemale", "zaloBqlrSo");
        setField(term6830, term6830.getClass(), "traits", term6898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRulerSelection", argTypes, term6830, args);
    }

};


