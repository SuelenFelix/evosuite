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

public class Government_getFoodBonus_191028881016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12542;

    public Government_getFoodBonus_191028881016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12688 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term12687 = ((Class) term12688).getDeclaredField((String) "ELECTION_TYPE2");
        ((Field) term12687).setAccessible(true);
        Object enum24 = ((Field) term12687).get((Object) null);
        ArrayList term12616 = new ArrayList();
        ((ArrayList) term12616).add((Object)null);
        ((ArrayList) term12616).add((Object)null);
        ((ArrayList) term12616).add((Object)null);
        Object term12611 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term12611, term12611.getClass(), "traitId", "");
        setField(term12611, term12611.getClass(), "traitName", "");
        setField(term12611, term12611.getClass(), "description", "");
        setField(term12611, term12611.getClass(), "group", "");
        setField(term12611, term12611.getClass(), "conflictsWithIds", term12616);
        setByteField(term12611, term12611.getClass(), "traitPoints", (byte) 88);
        ArrayList term12625 = new ArrayList();
        ((ArrayList) term12625).add((Object)null);
        ((ArrayList) term12625).add((Object)null);
        ((ArrayList) term12625).add((Object)null);
        ((ArrayList) term12625).add((Object)null);
        ((ArrayList) term12625).add((Object)null);
        ((ArrayList) term12625).add((Object)null);
        Object term12620 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term12620, term12620.getClass(), "traitId", "");
        setField(term12620, term12620.getClass(), "traitName", "");
        setField(term12620, term12620.getClass(), "description", "");
        setField(term12620, term12620.getClass(), "group", "");
        setField(term12620, term12620.getClass(), "conflictsWithIds", term12625);
        setByteField(term12620, term12620.getClass(), "traitPoints", (byte) 96);
        ArrayList term12634 = new ArrayList();
        ((ArrayList) term12634).add((Object)null);
        ((ArrayList) term12634).add((Object)null);
        ((ArrayList) term12634).add((Object)null);
        ((ArrayList) term12634).add((Object)null);
        ((ArrayList) term12634).add((Object)null);
        ((ArrayList) term12634).add((Object)null);
        ((ArrayList) term12634).add((Object)null);
        ((ArrayList) term12634).add((Object)null);
        ((ArrayList) term12634).add((Object)null);
        Object term12629 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term12629, term12629.getClass(), "traitId", "");
        setField(term12629, term12629.getClass(), "traitName", "");
        setField(term12629, term12629.getClass(), "description", "");
        setField(term12629, term12629.getClass(), "group", "");
        setField(term12629, term12629.getClass(), "conflictsWithIds", term12634);
        setByteField(term12629, term12629.getClass(), "traitPoints", (byte) 70);
        ArrayList term12643 = new ArrayList();
        ((ArrayList) term12643).add((Object)null);
        ((ArrayList) term12643).add((Object)null);
        ((ArrayList) term12643).add((Object)null);
        ((ArrayList) term12643).add((Object)null);
        Object term12638 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term12638, term12638.getClass(), "traitId", "");
        setField(term12638, term12638.getClass(), "traitName", "");
        setField(term12638, term12638.getClass(), "description", "");
        setField(term12638, term12638.getClass(), "group", "");
        setField(term12638, term12638.getClass(), "conflictsWithIds", term12643);
        setByteField(term12638, term12638.getClass(), "traitPoints", (byte) 48);
        ArrayList term12652 = new ArrayList();
        ((ArrayList) term12652).add((Object)null);
        ((ArrayList) term12652).add((Object)null);
        ((ArrayList) term12652).add((Object)null);
        ((ArrayList) term12652).add((Object)null);
        Object term12647 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term12647, term12647.getClass(), "traitId", "");
        setField(term12647, term12647.getClass(), "traitName", "");
        setField(term12647, term12647.getClass(), "description", "");
        setField(term12647, term12647.getClass(), "group", "");
        setField(term12647, term12647.getClass(), "conflictsWithIds", term12652);
        setByteField(term12647, term12647.getClass(), "traitPoints", (byte) -46);
        ArrayList term12661 = new ArrayList();
        ((ArrayList) term12661).add((Object)null);
        ((ArrayList) term12661).add((Object)null);
        ((ArrayList) term12661).add((Object)null);
        ((ArrayList) term12661).add((Object)null);
        Object term12656 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term12656, term12656.getClass(), "traitId", "");
        setField(term12656, term12656.getClass(), "traitName", "");
        setField(term12656, term12656.getClass(), "description", "");
        setField(term12656, term12656.getClass(), "group", "");
        setField(term12656, term12656.getClass(), "conflictsWithIds", term12661);
        setByteField(term12656, term12656.getClass(), "traitPoints", (byte) -128);
        ArrayList term12609 = new ArrayList();
        ((ArrayList) term12609).add(term12611);
        ((ArrayList) term12609).add(term12620);
        ((ArrayList) term12609).add(term12629);
        ((ArrayList) term12609).add(term12638);
        ((ArrayList) term12609).add(term12647);
        ((ArrayList) term12609).add(term12656);
        term12542 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term12542, term12542.getClass(), "id", "nJnRIRiLZK");
        setField(term12542, term12542.getClass(), "name", "eWnrMSbYbT");
        setField(term12542, term12542.getClass(), "rulerSelection", enum24);
        setField(term12542, term12542.getClass(), "rulerTitleMale", "AjoFvDFyCY");
        setField(term12542, term12542.getClass(), "rulerTitleFemale", "OFTJwdPiTG");
        setField(term12542, term12542.getClass(), "traits", term12609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFoodBonus", argTypes, term12542, args);
    }

};


