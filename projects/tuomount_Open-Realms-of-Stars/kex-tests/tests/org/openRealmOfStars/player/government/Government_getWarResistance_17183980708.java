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

public class Government_getWarResistance_17183980708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8825;

    public Government_getWarResistance_17183980708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8980 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term8979 = ((Class) term8980).getDeclaredField((String) "HEIR_TO_THRONE");
        ((Field) term8979).setAccessible(true);
        Object enum16 = ((Field) term8979).get((Object) null);
        ArrayList term8899 = new ArrayList();
        ((ArrayList) term8899).add((Object)null);
        ((ArrayList) term8899).add((Object)null);
        ((ArrayList) term8899).add((Object)null);
        ((ArrayList) term8899).add((Object)null);
        Object term8894 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8894, term8894.getClass(), "traitId", "");
        setField(term8894, term8894.getClass(), "traitName", "");
        setField(term8894, term8894.getClass(), "description", "");
        setField(term8894, term8894.getClass(), "group", "");
        setField(term8894, term8894.getClass(), "conflictsWithIds", term8899);
        setByteField(term8894, term8894.getClass(), "traitPoints", (byte) -123);
        ArrayList term8908 = new ArrayList();
        ((ArrayList) term8908).add((Object)null);
        ((ArrayList) term8908).add((Object)null);
        ((ArrayList) term8908).add((Object)null);
        ((ArrayList) term8908).add((Object)null);
        ((ArrayList) term8908).add((Object)null);
        ((ArrayList) term8908).add((Object)null);
        ((ArrayList) term8908).add((Object)null);
        ((ArrayList) term8908).add((Object)null);
        Object term8903 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8903, term8903.getClass(), "traitId", "");
        setField(term8903, term8903.getClass(), "traitName", "");
        setField(term8903, term8903.getClass(), "description", "");
        setField(term8903, term8903.getClass(), "group", "");
        setField(term8903, term8903.getClass(), "conflictsWithIds", term8908);
        setByteField(term8903, term8903.getClass(), "traitPoints", (byte) -23);
        ArrayList term8917 = new ArrayList();
        Object term8912 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8912, term8912.getClass(), "traitId", "");
        setField(term8912, term8912.getClass(), "traitName", "");
        setField(term8912, term8912.getClass(), "description", "");
        setField(term8912, term8912.getClass(), "group", "");
        setField(term8912, term8912.getClass(), "conflictsWithIds", term8917);
        setByteField(term8912, term8912.getClass(), "traitPoints", (byte) 100);
        ArrayList term8926 = new ArrayList();
        ((ArrayList) term8926).add((Object)null);
        ((ArrayList) term8926).add((Object)null);
        ((ArrayList) term8926).add((Object)null);
        ((ArrayList) term8926).add((Object)null);
        ((ArrayList) term8926).add((Object)null);
        ((ArrayList) term8926).add((Object)null);
        ((ArrayList) term8926).add((Object)null);
        ((ArrayList) term8926).add((Object)null);
        ((ArrayList) term8926).add((Object)null);
        Object term8921 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8921, term8921.getClass(), "traitId", "");
        setField(term8921, term8921.getClass(), "traitName", "");
        setField(term8921, term8921.getClass(), "description", "");
        setField(term8921, term8921.getClass(), "group", "");
        setField(term8921, term8921.getClass(), "conflictsWithIds", term8926);
        setByteField(term8921, term8921.getClass(), "traitPoints", (byte) 106);
        ArrayList term8935 = new ArrayList();
        ((ArrayList) term8935).add((Object)null);
        ((ArrayList) term8935).add((Object)null);
        ((ArrayList) term8935).add((Object)null);
        ((ArrayList) term8935).add((Object)null);
        Object term8930 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8930, term8930.getClass(), "traitId", "");
        setField(term8930, term8930.getClass(), "traitName", "");
        setField(term8930, term8930.getClass(), "description", "");
        setField(term8930, term8930.getClass(), "group", "");
        setField(term8930, term8930.getClass(), "conflictsWithIds", term8935);
        setByteField(term8930, term8930.getClass(), "traitPoints", (byte) -57);
        ArrayList term8944 = new ArrayList();
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        Object term8939 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8939, term8939.getClass(), "traitId", "");
        setField(term8939, term8939.getClass(), "traitName", "");
        setField(term8939, term8939.getClass(), "description", "");
        setField(term8939, term8939.getClass(), "group", "");
        setField(term8939, term8939.getClass(), "conflictsWithIds", term8944);
        setByteField(term8939, term8939.getClass(), "traitPoints", (byte) -103);
        ArrayList term8953 = new ArrayList();
        Object term8948 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term8948, term8948.getClass(), "traitId", "");
        setField(term8948, term8948.getClass(), "traitName", "");
        setField(term8948, term8948.getClass(), "description", "");
        setField(term8948, term8948.getClass(), "group", "");
        setField(term8948, term8948.getClass(), "conflictsWithIds", term8953);
        setByteField(term8948, term8948.getClass(), "traitPoints", (byte) 98);
        ArrayList term8892 = new ArrayList();
        ((ArrayList) term8892).add(term8894);
        ((ArrayList) term8892).add(term8903);
        ((ArrayList) term8892).add(term8912);
        ((ArrayList) term8892).add(term8921);
        ((ArrayList) term8892).add(term8930);
        ((ArrayList) term8892).add(term8939);
        ((ArrayList) term8892).add(term8948);
        term8825 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term8825, term8825.getClass(), "id", "UimMMORkzd");
        setField(term8825, term8825.getClass(), "name", "huVIXUWLtI");
        setField(term8825, term8825.getClass(), "rulerSelection", enum16);
        setField(term8825, term8825.getClass(), "rulerTitleMale", "vhKzFyKPOT");
        setField(term8825, term8825.getClass(), "rulerTitleFemale", "nQhIgWXdRc");
        setField(term8825, term8825.getClass(), "traits", term8892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWarResistance", argTypes, term8825, args);
    }

};


