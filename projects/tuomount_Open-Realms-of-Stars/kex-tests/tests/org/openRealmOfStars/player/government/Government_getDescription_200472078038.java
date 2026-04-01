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
import java.lang.Boolean;

public class Government_getDescription_200472078038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22778;
     Object term22897;

    public Government_getDescription_200472078038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22920 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term22919 = ((Class) term22920).getDeclaredField((String) "AI_RULER");
        ((Field) term22919).setAccessible(true);
        Object enum46 = ((Field) term22919).get((Object) null);
        ArrayList term22846 = new ArrayList();
        ((ArrayList) term22846).add((Object)null);
        ((ArrayList) term22846).add((Object)null);
        Object term22841 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term22841, term22841.getClass(), "traitId", "");
        setField(term22841, term22841.getClass(), "traitName", "");
        setField(term22841, term22841.getClass(), "description", "");
        setField(term22841, term22841.getClass(), "group", "");
        setField(term22841, term22841.getClass(), "conflictsWithIds", term22846);
        setByteField(term22841, term22841.getClass(), "traitPoints", (byte) -77);
        ArrayList term22855 = new ArrayList();
        ((ArrayList) term22855).add((Object)null);
        ((ArrayList) term22855).add((Object)null);
        ((ArrayList) term22855).add((Object)null);
        ((ArrayList) term22855).add((Object)null);
        ((ArrayList) term22855).add((Object)null);
        Object term22850 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term22850, term22850.getClass(), "traitId", "");
        setField(term22850, term22850.getClass(), "traitName", "");
        setField(term22850, term22850.getClass(), "description", "");
        setField(term22850, term22850.getClass(), "group", "");
        setField(term22850, term22850.getClass(), "conflictsWithIds", term22855);
        setByteField(term22850, term22850.getClass(), "traitPoints", (byte) -12);
        ArrayList term22864 = new ArrayList();
        ((ArrayList) term22864).add((Object)null);
        Object term22859 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term22859, term22859.getClass(), "traitId", "");
        setField(term22859, term22859.getClass(), "traitName", "");
        setField(term22859, term22859.getClass(), "description", "");
        setField(term22859, term22859.getClass(), "group", "");
        setField(term22859, term22859.getClass(), "conflictsWithIds", term22864);
        setByteField(term22859, term22859.getClass(), "traitPoints", (byte) 58);
        ArrayList term22873 = new ArrayList();
        ((ArrayList) term22873).add((Object)null);
        ((ArrayList) term22873).add((Object)null);
        ((ArrayList) term22873).add((Object)null);
        ((ArrayList) term22873).add((Object)null);
        ((ArrayList) term22873).add((Object)null);
        ((ArrayList) term22873).add((Object)null);
        ((ArrayList) term22873).add((Object)null);
        ((ArrayList) term22873).add((Object)null);
        Object term22868 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term22868, term22868.getClass(), "traitId", "");
        setField(term22868, term22868.getClass(), "traitName", "");
        setField(term22868, term22868.getClass(), "description", "");
        setField(term22868, term22868.getClass(), "group", "");
        setField(term22868, term22868.getClass(), "conflictsWithIds", term22873);
        setByteField(term22868, term22868.getClass(), "traitPoints", (byte) 12);
        ArrayList term22882 = new ArrayList();
        Object term22877 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term22877, term22877.getClass(), "traitId", "");
        setField(term22877, term22877.getClass(), "traitName", "");
        setField(term22877, term22877.getClass(), "description", "");
        setField(term22877, term22877.getClass(), "group", "");
        setField(term22877, term22877.getClass(), "conflictsWithIds", term22882);
        setByteField(term22877, term22877.getClass(), "traitPoints", (byte) 79);
        ArrayList term22891 = new ArrayList();
        ((ArrayList) term22891).add((Object)null);
        ((ArrayList) term22891).add((Object)null);
        ((ArrayList) term22891).add((Object)null);
        Object term22886 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term22886, term22886.getClass(), "traitId", "");
        setField(term22886, term22886.getClass(), "traitName", "");
        setField(term22886, term22886.getClass(), "description", "");
        setField(term22886, term22886.getClass(), "group", "");
        setField(term22886, term22886.getClass(), "conflictsWithIds", term22891);
        setByteField(term22886, term22886.getClass(), "traitPoints", (byte) -4);
        ArrayList term22839 = new ArrayList();
        ((ArrayList) term22839).add(term22841);
        ((ArrayList) term22839).add(term22850);
        ((ArrayList) term22839).add(term22859);
        ((ArrayList) term22839).add(term22868);
        ((ArrayList) term22839).add(term22877);
        ((ArrayList) term22839).add(term22886);
        term22778 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term22778, term22778.getClass(), "id", "qdErlZeTVv");
        setField(term22778, term22778.getClass(), "name", "OCCDQbndDE");
        setField(term22778, term22778.getClass(), "rulerSelection", enum46);
        setField(term22778, term22778.getClass(), "rulerTitleMale", "NMANMKfctU");
        setField(term22778, term22778.getClass(), "rulerTitleFemale", "mQsaqUltLU");
        setField(term22778, term22778.getClass(), "traits", term22839);
        term22897 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term22897;
        callMethod(klass, "getDescription", argTypes, term22778, args);
    }

};


