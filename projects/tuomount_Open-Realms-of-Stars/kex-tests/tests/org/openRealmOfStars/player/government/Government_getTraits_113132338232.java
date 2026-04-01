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

public class Government_getTraits_113132338232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19933;

    public Government_getTraits_113132338232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20059 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term20058 = ((Class) term20059).getDeclaredField((String) "STRONG_RULER");
        ((Field) term20058).setAccessible(true);
        Object enum40 = ((Field) term20058).get((Object) null);
        ArrayList term20005 = new ArrayList();
        ((ArrayList) term20005).add((Object)null);
        Object term20000 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20000, term20000.getClass(), "traitId", "");
        setField(term20000, term20000.getClass(), "traitName", "");
        setField(term20000, term20000.getClass(), "description", "");
        setField(term20000, term20000.getClass(), "group", "");
        setField(term20000, term20000.getClass(), "conflictsWithIds", term20005);
        setByteField(term20000, term20000.getClass(), "traitPoints", (byte) 107);
        ArrayList term20014 = new ArrayList();
        ((ArrayList) term20014).add((Object)null);
        ((ArrayList) term20014).add((Object)null);
        ((ArrayList) term20014).add((Object)null);
        ((ArrayList) term20014).add((Object)null);
        ((ArrayList) term20014).add((Object)null);
        ((ArrayList) term20014).add((Object)null);
        Object term20009 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20009, term20009.getClass(), "traitId", "");
        setField(term20009, term20009.getClass(), "traitName", "");
        setField(term20009, term20009.getClass(), "description", "");
        setField(term20009, term20009.getClass(), "group", "");
        setField(term20009, term20009.getClass(), "conflictsWithIds", term20014);
        setByteField(term20009, term20009.getClass(), "traitPoints", (byte) -109);
        ArrayList term20023 = new ArrayList();
        ((ArrayList) term20023).add((Object)null);
        ((ArrayList) term20023).add((Object)null);
        ((ArrayList) term20023).add((Object)null);
        ((ArrayList) term20023).add((Object)null);
        ((ArrayList) term20023).add((Object)null);
        Object term20018 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20018, term20018.getClass(), "traitId", "");
        setField(term20018, term20018.getClass(), "traitName", "");
        setField(term20018, term20018.getClass(), "description", "");
        setField(term20018, term20018.getClass(), "group", "");
        setField(term20018, term20018.getClass(), "conflictsWithIds", term20023);
        setByteField(term20018, term20018.getClass(), "traitPoints", (byte) 122);
        ArrayList term20032 = new ArrayList();
        ((ArrayList) term20032).add((Object)null);
        ((ArrayList) term20032).add((Object)null);
        ((ArrayList) term20032).add((Object)null);
        Object term20027 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20027, term20027.getClass(), "traitId", "");
        setField(term20027, term20027.getClass(), "traitName", "");
        setField(term20027, term20027.getClass(), "description", "");
        setField(term20027, term20027.getClass(), "group", "");
        setField(term20027, term20027.getClass(), "conflictsWithIds", term20032);
        setByteField(term20027, term20027.getClass(), "traitPoints", (byte) 83);
        ArrayList term19998 = new ArrayList();
        ((ArrayList) term19998).add(term20000);
        ((ArrayList) term19998).add(term20009);
        ((ArrayList) term19998).add(term20018);
        ((ArrayList) term19998).add(term20027);
        term19933 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term19933, term19933.getClass(), "id", "rzoDGjHkzG");
        setField(term19933, term19933.getClass(), "name", "NsphHxYiuC");
        setField(term19933, term19933.getClass(), "rulerSelection", enum40);
        setField(term19933, term19933.getClass(), "rulerTitleMale", "XYJztkznbY");
        setField(term19933, term19933.getClass(), "rulerTitleFemale", "NeTiWVoyjZ");
        setField(term19933, term19933.getClass(), "traits", term19998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTraits", argTypes, term19933, args);
    }

};


