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

public class Government_getGovernorHappiness_131420778229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18535;

    public Government_getGovernorHappiness_131420778229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18664 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term18663 = ((Class) term18664).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term18663).setAccessible(true);
        Object enum37 = ((Field) term18663).get((Object) null);
        ArrayList term18610 = new ArrayList();
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        ((ArrayList) term18610).add((Object)null);
        Object term18605 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18605, term18605.getClass(), "traitId", "");
        setField(term18605, term18605.getClass(), "traitName", "");
        setField(term18605, term18605.getClass(), "description", "");
        setField(term18605, term18605.getClass(), "group", "");
        setField(term18605, term18605.getClass(), "conflictsWithIds", term18610);
        setByteField(term18605, term18605.getClass(), "traitPoints", (byte) -120);
        ArrayList term18619 = new ArrayList();
        ((ArrayList) term18619).add((Object)null);
        ((ArrayList) term18619).add((Object)null);
        ((ArrayList) term18619).add((Object)null);
        ((ArrayList) term18619).add((Object)null);
        Object term18614 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18614, term18614.getClass(), "traitId", "");
        setField(term18614, term18614.getClass(), "traitName", "");
        setField(term18614, term18614.getClass(), "description", "");
        setField(term18614, term18614.getClass(), "group", "");
        setField(term18614, term18614.getClass(), "conflictsWithIds", term18619);
        setByteField(term18614, term18614.getClass(), "traitPoints", (byte) 96);
        ArrayList term18628 = new ArrayList();
        ((ArrayList) term18628).add((Object)null);
        Object term18623 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18623, term18623.getClass(), "traitId", "");
        setField(term18623, term18623.getClass(), "traitName", "");
        setField(term18623, term18623.getClass(), "description", "");
        setField(term18623, term18623.getClass(), "group", "");
        setField(term18623, term18623.getClass(), "conflictsWithIds", term18628);
        setByteField(term18623, term18623.getClass(), "traitPoints", (byte) -41);
        ArrayList term18637 = new ArrayList();
        ((ArrayList) term18637).add((Object)null);
        ((ArrayList) term18637).add((Object)null);
        Object term18632 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18632, term18632.getClass(), "traitId", "");
        setField(term18632, term18632.getClass(), "traitName", "");
        setField(term18632, term18632.getClass(), "description", "");
        setField(term18632, term18632.getClass(), "group", "");
        setField(term18632, term18632.getClass(), "conflictsWithIds", term18637);
        setByteField(term18632, term18632.getClass(), "traitPoints", (byte) -88);
        ArrayList term18603 = new ArrayList();
        ((ArrayList) term18603).add(term18605);
        ((ArrayList) term18603).add(term18614);
        ((ArrayList) term18603).add(term18623);
        ((ArrayList) term18603).add(term18632);
        term18535 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term18535, term18535.getClass(), "id", "cpjqTCNflQ");
        setField(term18535, term18535.getClass(), "name", "wiYGATEfmw");
        setField(term18535, term18535.getClass(), "rulerSelection", enum37);
        setField(term18535, term18535.getClass(), "rulerTitleMale", "FiALSqneIg");
        setField(term18535, term18535.getClass(), "rulerTitleFemale", "lGVACSQceQ");
        setField(term18535, term18535.getClass(), "traits", term18603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGovernorHappiness", argTypes, term18535, args);
    }

};


