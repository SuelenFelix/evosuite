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

public class Government_reignTime_135696623130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19000;

    public Government_reignTime_135696623130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19135 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term19134 = ((Class) term19135).getDeclaredField((String) "STRONG_RULER");
        ((Field) term19134).setAccessible(true);
        Object enum38 = ((Field) term19134).get((Object) null);
        ArrayList term19072 = new ArrayList();
        ((ArrayList) term19072).add((Object)null);
        ((ArrayList) term19072).add((Object)null);
        Object term19067 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19067, term19067.getClass(), "traitId", "");
        setField(term19067, term19067.getClass(), "traitName", "");
        setField(term19067, term19067.getClass(), "description", "");
        setField(term19067, term19067.getClass(), "group", "");
        setField(term19067, term19067.getClass(), "conflictsWithIds", term19072);
        setByteField(term19067, term19067.getClass(), "traitPoints", (byte) 39);
        ArrayList term19081 = new ArrayList();
        ((ArrayList) term19081).add((Object)null);
        ((ArrayList) term19081).add((Object)null);
        ((ArrayList) term19081).add((Object)null);
        Object term19076 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19076, term19076.getClass(), "traitId", "");
        setField(term19076, term19076.getClass(), "traitName", "");
        setField(term19076, term19076.getClass(), "description", "");
        setField(term19076, term19076.getClass(), "group", "");
        setField(term19076, term19076.getClass(), "conflictsWithIds", term19081);
        setByteField(term19076, term19076.getClass(), "traitPoints", (byte) -1);
        ArrayList term19090 = new ArrayList();
        ((ArrayList) term19090).add((Object)null);
        ((ArrayList) term19090).add((Object)null);
        ((ArrayList) term19090).add((Object)null);
        ((ArrayList) term19090).add((Object)null);
        Object term19085 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19085, term19085.getClass(), "traitId", "");
        setField(term19085, term19085.getClass(), "traitName", "");
        setField(term19085, term19085.getClass(), "description", "");
        setField(term19085, term19085.getClass(), "group", "");
        setField(term19085, term19085.getClass(), "conflictsWithIds", term19090);
        setByteField(term19085, term19085.getClass(), "traitPoints", (byte) 117);
        ArrayList term19099 = new ArrayList();
        ((ArrayList) term19099).add((Object)null);
        ((ArrayList) term19099).add((Object)null);
        ((ArrayList) term19099).add((Object)null);
        ((ArrayList) term19099).add((Object)null);
        ((ArrayList) term19099).add((Object)null);
        ((ArrayList) term19099).add((Object)null);
        Object term19094 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19094, term19094.getClass(), "traitId", "");
        setField(term19094, term19094.getClass(), "traitName", "");
        setField(term19094, term19094.getClass(), "description", "");
        setField(term19094, term19094.getClass(), "group", "");
        setField(term19094, term19094.getClass(), "conflictsWithIds", term19099);
        setByteField(term19094, term19094.getClass(), "traitPoints", (byte) 43);
        ArrayList term19108 = new ArrayList();
        ((ArrayList) term19108).add((Object)null);
        ((ArrayList) term19108).add((Object)null);
        ((ArrayList) term19108).add((Object)null);
        ((ArrayList) term19108).add((Object)null);
        Object term19103 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19103, term19103.getClass(), "traitId", "");
        setField(term19103, term19103.getClass(), "traitName", "");
        setField(term19103, term19103.getClass(), "description", "");
        setField(term19103, term19103.getClass(), "group", "");
        setField(term19103, term19103.getClass(), "conflictsWithIds", term19108);
        setByteField(term19103, term19103.getClass(), "traitPoints", (byte) -27);
        ArrayList term19065 = new ArrayList();
        ((ArrayList) term19065).add(term19067);
        ((ArrayList) term19065).add(term19076);
        ((ArrayList) term19065).add(term19085);
        ((ArrayList) term19065).add(term19094);
        ((ArrayList) term19065).add(term19103);
        term19000 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term19000, term19000.getClass(), "id", "DCepDqVwas");
        setField(term19000, term19000.getClass(), "name", "wKIBUlfNCx");
        setField(term19000, term19000.getClass(), "rulerSelection", enum38);
        setField(term19000, term19000.getClass(), "rulerTitleMale", "iGfMUWRvod");
        setField(term19000, term19000.getClass(), "rulerTitleFemale", "zUXaSvayQe");
        setField(term19000, term19000.getClass(), "traits", term19065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reignTime", argTypes, term19000, args);
    }

};


