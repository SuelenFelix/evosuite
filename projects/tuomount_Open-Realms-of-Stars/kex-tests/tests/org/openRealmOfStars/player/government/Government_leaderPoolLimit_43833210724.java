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

public class Government_leaderPoolLimit_43833210724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16183;

    public Government_leaderPoolLimit_43833210724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16320 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term16319 = ((Class) term16320).getDeclaredField((String) "ELECTION_TYPE2");
        ((Field) term16319).setAccessible(true);
        Object enum32 = ((Field) term16319).get((Object) null);
        ArrayList term16257 = new ArrayList();
        ((ArrayList) term16257).add((Object)null);
        ((ArrayList) term16257).add((Object)null);
        ((ArrayList) term16257).add((Object)null);
        ((ArrayList) term16257).add((Object)null);
        ((ArrayList) term16257).add((Object)null);
        ((ArrayList) term16257).add((Object)null);
        ((ArrayList) term16257).add((Object)null);
        ((ArrayList) term16257).add((Object)null);
        ((ArrayList) term16257).add((Object)null);
        Object term16252 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term16252, term16252.getClass(), "traitId", "");
        setField(term16252, term16252.getClass(), "traitName", "");
        setField(term16252, term16252.getClass(), "description", "");
        setField(term16252, term16252.getClass(), "group", "");
        setField(term16252, term16252.getClass(), "conflictsWithIds", term16257);
        setByteField(term16252, term16252.getClass(), "traitPoints", (byte) 48);
        ArrayList term16266 = new ArrayList();
        ((ArrayList) term16266).add((Object)null);
        ((ArrayList) term16266).add((Object)null);
        ((ArrayList) term16266).add((Object)null);
        ((ArrayList) term16266).add((Object)null);
        ((ArrayList) term16266).add((Object)null);
        ((ArrayList) term16266).add((Object)null);
        ((ArrayList) term16266).add((Object)null);
        Object term16261 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term16261, term16261.getClass(), "traitId", "");
        setField(term16261, term16261.getClass(), "traitName", "");
        setField(term16261, term16261.getClass(), "description", "");
        setField(term16261, term16261.getClass(), "group", "");
        setField(term16261, term16261.getClass(), "conflictsWithIds", term16266);
        setByteField(term16261, term16261.getClass(), "traitPoints", (byte) -128);
        ArrayList term16275 = new ArrayList();
        ((ArrayList) term16275).add((Object)null);
        ((ArrayList) term16275).add((Object)null);
        ((ArrayList) term16275).add((Object)null);
        ((ArrayList) term16275).add((Object)null);
        ((ArrayList) term16275).add((Object)null);
        ((ArrayList) term16275).add((Object)null);
        ((ArrayList) term16275).add((Object)null);
        ((ArrayList) term16275).add((Object)null);
        ((ArrayList) term16275).add((Object)null);
        Object term16270 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term16270, term16270.getClass(), "traitId", "");
        setField(term16270, term16270.getClass(), "traitName", "");
        setField(term16270, term16270.getClass(), "description", "");
        setField(term16270, term16270.getClass(), "group", "");
        setField(term16270, term16270.getClass(), "conflictsWithIds", term16275);
        setByteField(term16270, term16270.getClass(), "traitPoints", (byte) 70);
        ArrayList term16284 = new ArrayList();
        ((ArrayList) term16284).add((Object)null);
        ((ArrayList) term16284).add((Object)null);
        ((ArrayList) term16284).add((Object)null);
        ((ArrayList) term16284).add((Object)null);
        ((ArrayList) term16284).add((Object)null);
        Object term16279 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term16279, term16279.getClass(), "traitId", "");
        setField(term16279, term16279.getClass(), "traitName", "");
        setField(term16279, term16279.getClass(), "description", "");
        setField(term16279, term16279.getClass(), "group", "");
        setField(term16279, term16279.getClass(), "conflictsWithIds", term16284);
        setByteField(term16279, term16279.getClass(), "traitPoints", (byte) -28);
        ArrayList term16293 = new ArrayList();
        ((ArrayList) term16293).add((Object)null);
        Object term16288 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term16288, term16288.getClass(), "traitId", "");
        setField(term16288, term16288.getClass(), "traitName", "");
        setField(term16288, term16288.getClass(), "description", "");
        setField(term16288, term16288.getClass(), "group", "");
        setField(term16288, term16288.getClass(), "conflictsWithIds", term16293);
        setByteField(term16288, term16288.getClass(), "traitPoints", (byte) 115);
        ArrayList term16250 = new ArrayList();
        ((ArrayList) term16250).add(term16252);
        ((ArrayList) term16250).add(term16261);
        ((ArrayList) term16250).add(term16270);
        ((ArrayList) term16250).add(term16279);
        ((ArrayList) term16250).add(term16288);
        term16183 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term16183, term16183.getClass(), "id", "zhcWVVrrjs");
        setField(term16183, term16183.getClass(), "name", "EAMaFLdmaG");
        setField(term16183, term16183.getClass(), "rulerSelection", enum32);
        setField(term16183, term16183.getClass(), "rulerTitleMale", "DYZSJMwbhX");
        setField(term16183, term16183.getClass(), "rulerTitleFemale", "QGcshsIIWo");
        setField(term16183, term16183.getClass(), "traits", term16250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "leaderPoolLimit", argTypes, term16183, args);
    }

};


