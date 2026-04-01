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

public class Government_hasTrait_11549758566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7890;

    public Government_hasTrait_11549758566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8057 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term8056 = ((Class) term8057).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term8056).setAccessible(true);
        Object enum14 = ((Field) term8056).get((Object) null);
        ArrayList term7964 = new ArrayList();
        ((ArrayList) term7964).add((Object)null);
        ((ArrayList) term7964).add((Object)null);
        ((ArrayList) term7964).add((Object)null);
        ((ArrayList) term7964).add((Object)null);
        ((ArrayList) term7964).add((Object)null);
        ((ArrayList) term7964).add((Object)null);
        ((ArrayList) term7964).add((Object)null);
        Object term7959 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term7959, term7959.getClass(), "traitId", "");
        setField(term7959, term7959.getClass(), "traitName", "");
        setField(term7959, term7959.getClass(), "description", "");
        setField(term7959, term7959.getClass(), "group", "");
        setField(term7959, term7959.getClass(), "conflictsWithIds", term7964);
        setByteField(term7959, term7959.getClass(), "traitPoints", (byte) -12);
        ArrayList term7973 = new ArrayList();
        ((ArrayList) term7973).add((Object)null);
        Object term7968 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term7968, term7968.getClass(), "traitId", "");
        setField(term7968, term7968.getClass(), "traitName", "");
        setField(term7968, term7968.getClass(), "description", "");
        setField(term7968, term7968.getClass(), "group", "");
        setField(term7968, term7968.getClass(), "conflictsWithIds", term7973);
        setByteField(term7968, term7968.getClass(), "traitPoints", (byte) -61);
        ArrayList term7982 = new ArrayList();
        ((ArrayList) term7982).add((Object)null);
        ((ArrayList) term7982).add((Object)null);
        ((ArrayList) term7982).add((Object)null);
        ((ArrayList) term7982).add((Object)null);
        ((ArrayList) term7982).add((Object)null);
        Object term7977 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term7977, term7977.getClass(), "traitId", "");
        setField(term7977, term7977.getClass(), "traitName", "");
        setField(term7977, term7977.getClass(), "description", "");
        setField(term7977, term7977.getClass(), "group", "");
        setField(term7977, term7977.getClass(), "conflictsWithIds", term7982);
        setByteField(term7977, term7977.getClass(), "traitPoints", (byte) -85);
        ArrayList term7991 = new ArrayList();
        ((ArrayList) term7991).add((Object)null);
        Object term7986 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term7986, term7986.getClass(), "traitId", "");
        setField(term7986, term7986.getClass(), "traitName", "");
        setField(term7986, term7986.getClass(), "description", "");
        setField(term7986, term7986.getClass(), "group", "");
        setField(term7986, term7986.getClass(), "conflictsWithIds", term7991);
        setByteField(term7986, term7986.getClass(), "traitPoints", (byte) -22);
        ArrayList term8000 = new ArrayList();
        ((ArrayList) term8000).add((Object)null);
        ((ArrayList) term8000).add((Object)null);
        ((ArrayList) term8000).add((Object)null);
        ((ArrayList) term8000).add((Object)null);
        ((ArrayList) term8000).add((Object)null);
        ((ArrayList) term8000).add((Object)null);
        ((ArrayList) term8000).add((Object)null);
        ((ArrayList) term8000).add((Object)null);
        ((ArrayList) term8000).add((Object)null);
        Object term7995 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term7995, term7995.getClass(), "traitId", "");
        setField(term7995, term7995.getClass(), "traitName", "");
        setField(term7995, term7995.getClass(), "description", "");
        setField(term7995, term7995.getClass(), "group", "");
        setField(term7995, term7995.getClass(), "conflictsWithIds", term8000);
        setByteField(term7995, term7995.getClass(), "traitPoints", (byte) 93);
        ArrayList term8009 = new ArrayList();
        Object term8004 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8004, term8004.getClass(), "traitId", "");
        setField(term8004, term8004.getClass(), "traitName", "");
        setField(term8004, term8004.getClass(), "description", "");
        setField(term8004, term8004.getClass(), "group", "");
        setField(term8004, term8004.getClass(), "conflictsWithIds", term8009);
        setByteField(term8004, term8004.getClass(), "traitPoints", (byte) 69);
        ArrayList term8018 = new ArrayList();
        ((ArrayList) term8018).add((Object)null);
        ((ArrayList) term8018).add((Object)null);
        ((ArrayList) term8018).add((Object)null);
        ((ArrayList) term8018).add((Object)null);
        Object term8013 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8013, term8013.getClass(), "traitId", "");
        setField(term8013, term8013.getClass(), "traitName", "");
        setField(term8013, term8013.getClass(), "description", "");
        setField(term8013, term8013.getClass(), "group", "");
        setField(term8013, term8013.getClass(), "conflictsWithIds", term8018);
        setByteField(term8013, term8013.getClass(), "traitPoints", (byte) -74);
        ArrayList term7957 = new ArrayList();
        ((ArrayList) term7957).add(term7959);
        ((ArrayList) term7957).add(term7968);
        ((ArrayList) term7957).add(term7977);
        ((ArrayList) term7957).add(term7986);
        ((ArrayList) term7957).add(term7995);
        ((ArrayList) term7957).add(term8004);
        ((ArrayList) term7957).add(term8013);
        term7890 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term7890, term7890.getClass(), "id", "UPUbwyHQKN");
        setField(term7890, term7890.getClass(), "name", "lgQkrXANyI");
        setField(term7890, term7890.getClass(), "rulerSelection", enum14);
        setField(term7890, term7890.getClass(), "rulerTitleMale", "MeTmRZXErV");
        setField(term7890, term7890.getClass(), "rulerTitleFemale", "jNxbVmoZgq");
        setField(term7890, term7890.getClass(), "traits", term7957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yeSXGqQExb";
        callMethod(klass, "hasTrait", argTypes, term7890, args);
    }

};


