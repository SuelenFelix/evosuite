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

public class Government_isImmuneToHappiness_16973575069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9313;

    public Government_isImmuneToHappiness_16973575069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9423 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term9422 = ((Class) term9423).getDeclaredField((String) "ELECTION_TYPE2");
        ((Field) term9422).setAccessible(true);
        Object enum17 = ((Field) term9422).get((Object) null);
        ArrayList term9387 = new ArrayList();
        ((ArrayList) term9387).add((Object)null);
        ((ArrayList) term9387).add((Object)null);
        Object term9382 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term9382, term9382.getClass(), "traitId", "");
        setField(term9382, term9382.getClass(), "traitName", "");
        setField(term9382, term9382.getClass(), "description", "");
        setField(term9382, term9382.getClass(), "group", "");
        setField(term9382, term9382.getClass(), "conflictsWithIds", term9387);
        setByteField(term9382, term9382.getClass(), "traitPoints", (byte) 79);
        ArrayList term9396 = new ArrayList();
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        ((ArrayList) term9396).add((Object)null);
        Object term9391 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term9391, term9391.getClass(), "traitId", "");
        setField(term9391, term9391.getClass(), "traitName", "");
        setField(term9391, term9391.getClass(), "description", "");
        setField(term9391, term9391.getClass(), "group", "");
        setField(term9391, term9391.getClass(), "conflictsWithIds", term9396);
        setByteField(term9391, term9391.getClass(), "traitPoints", (byte) 61);
        ArrayList term9380 = new ArrayList();
        ((ArrayList) term9380).add(term9382);
        ((ArrayList) term9380).add(term9391);
        term9313 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term9313, term9313.getClass(), "id", "bwlLFAfNWx");
        setField(term9313, term9313.getClass(), "name", "JWodNQzjjV");
        setField(term9313, term9313.getClass(), "rulerSelection", enum17);
        setField(term9313, term9313.getClass(), "rulerTitleMale", "CAgxWjhxNf");
        setField(term9313, term9313.getClass(), "rulerTitleFemale", "goAoCMhKBu");
        setField(term9313, term9313.getClass(), "traits", term9380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isImmuneToHappiness", argTypes, term9313, args);
    }

};


