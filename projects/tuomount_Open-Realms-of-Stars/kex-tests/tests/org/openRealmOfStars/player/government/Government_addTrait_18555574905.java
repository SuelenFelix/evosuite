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

public class Government_addTrait_18555574905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7331;
     Object term7420;

    public Government_addTrait_18555574905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7507 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term7506 = ((Class) term7507).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term7506).setAccessible(true);
        Object enum13 = ((Field) term7506).get((Object) null);
        ArrayList term7405 = new ArrayList();
        ((ArrayList) term7405).add((Object)null);
        Object term7400 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term7400, term7400.getClass(), "traitId", "");
        setField(term7400, term7400.getClass(), "traitName", "");
        setField(term7400, term7400.getClass(), "description", "");
        setField(term7400, term7400.getClass(), "group", "");
        setField(term7400, term7400.getClass(), "conflictsWithIds", term7405);
        setByteField(term7400, term7400.getClass(), "traitPoints", (byte) 72);
        ArrayList term7414 = new ArrayList();
        ((ArrayList) term7414).add((Object)null);
        ((ArrayList) term7414).add((Object)null);
        ((ArrayList) term7414).add((Object)null);
        ((ArrayList) term7414).add((Object)null);
        ((ArrayList) term7414).add((Object)null);
        ((ArrayList) term7414).add((Object)null);
        Object term7409 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term7409, term7409.getClass(), "traitId", "");
        setField(term7409, term7409.getClass(), "traitName", "");
        setField(term7409, term7409.getClass(), "description", "");
        setField(term7409, term7409.getClass(), "group", "");
        setField(term7409, term7409.getClass(), "conflictsWithIds", term7414);
        setByteField(term7409, term7409.getClass(), "traitPoints", (byte) 111);
        ArrayList term7398 = new ArrayList();
        ((ArrayList) term7398).add(term7400);
        ((ArrayList) term7398).add(term7409);
        term7331 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term7331, term7331.getClass(), "id", "hePqROaplw");
        setField(term7331, term7331.getClass(), "name", "PJcSNDruWd");
        setField(term7331, term7331.getClass(), "rulerSelection", enum13);
        setField(term7331, term7331.getClass(), "rulerTitleMale", "VVNNlAePXF");
        setField(term7331, term7331.getClass(), "rulerTitleFemale", "jnwVnmKAFv");
        setField(term7331, term7331.getClass(), "traits", term7398);
        ArrayList term7469 = new ArrayList();
        ((ArrayList) term7469).add("zsWKWiTFuo");
        term7420 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term7420, term7420.getClass(), "traitId", "qFGKIJjlmV");
        setField(term7420, term7420.getClass(), "traitName", "IHqvyhMtuM");
        setField(term7420, term7420.getClass(), "description", "dAldIGYAXV");
        setField(term7420, term7420.getClass(), "group", "mLwibAPEsa");
        setField(term7420, term7420.getClass(), "conflictsWithIds", term7469);
        setByteField(term7420, term7420.getClass(), "traitPoints", (byte) 99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        Object[] args = new Object[1];
        args[0] = term7420;
        callMethod(klass, "addTrait", argTypes, term7331, args);
    }

};


