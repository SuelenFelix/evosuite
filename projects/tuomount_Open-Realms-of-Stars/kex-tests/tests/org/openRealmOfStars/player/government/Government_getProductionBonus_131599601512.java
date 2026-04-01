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

public class Government_getProductionBonus_131599601512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10664;

    public Government_getProductionBonus_131599601512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10828 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term10827 = ((Class) term10828).getDeclaredField((String) "ELECTION_TYPE1");
        ((Field) term10827).setAccessible(true);
        Object enum20 = ((Field) term10827).get((Object) null);
        ArrayList term10738 = new ArrayList();
        ((ArrayList) term10738).add((Object)null);
        Object term10733 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10733, term10733.getClass(), "traitId", "");
        setField(term10733, term10733.getClass(), "traitName", "");
        setField(term10733, term10733.getClass(), "description", "");
        setField(term10733, term10733.getClass(), "group", "");
        setField(term10733, term10733.getClass(), "conflictsWithIds", term10738);
        setByteField(term10733, term10733.getClass(), "traitPoints", (byte) -126);
        ArrayList term10747 = new ArrayList();
        ((ArrayList) term10747).add((Object)null);
        ((ArrayList) term10747).add((Object)null);
        Object term10742 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10742, term10742.getClass(), "traitId", "");
        setField(term10742, term10742.getClass(), "traitName", "");
        setField(term10742, term10742.getClass(), "description", "");
        setField(term10742, term10742.getClass(), "group", "");
        setField(term10742, term10742.getClass(), "conflictsWithIds", term10747);
        setByteField(term10742, term10742.getClass(), "traitPoints", (byte) -91);
        ArrayList term10756 = new ArrayList();
        ((ArrayList) term10756).add((Object)null);
        ((ArrayList) term10756).add((Object)null);
        ((ArrayList) term10756).add((Object)null);
        ((ArrayList) term10756).add((Object)null);
        ((ArrayList) term10756).add((Object)null);
        Object term10751 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10751, term10751.getClass(), "traitId", "");
        setField(term10751, term10751.getClass(), "traitName", "");
        setField(term10751, term10751.getClass(), "description", "");
        setField(term10751, term10751.getClass(), "group", "");
        setField(term10751, term10751.getClass(), "conflictsWithIds", term10756);
        setByteField(term10751, term10751.getClass(), "traitPoints", (byte) -104);
        ArrayList term10765 = new ArrayList();
        ((ArrayList) term10765).add((Object)null);
        ((ArrayList) term10765).add((Object)null);
        ((ArrayList) term10765).add((Object)null);
        ((ArrayList) term10765).add((Object)null);
        ((ArrayList) term10765).add((Object)null);
        ((ArrayList) term10765).add((Object)null);
        ((ArrayList) term10765).add((Object)null);
        ((ArrayList) term10765).add((Object)null);
        ((ArrayList) term10765).add((Object)null);
        Object term10760 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10760, term10760.getClass(), "traitId", "");
        setField(term10760, term10760.getClass(), "traitName", "");
        setField(term10760, term10760.getClass(), "description", "");
        setField(term10760, term10760.getClass(), "group", "");
        setField(term10760, term10760.getClass(), "conflictsWithIds", term10765);
        setByteField(term10760, term10760.getClass(), "traitPoints", (byte) -89);
        ArrayList term10774 = new ArrayList();
        Object term10769 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10769, term10769.getClass(), "traitId", "");
        setField(term10769, term10769.getClass(), "traitName", "");
        setField(term10769, term10769.getClass(), "description", "");
        setField(term10769, term10769.getClass(), "group", "");
        setField(term10769, term10769.getClass(), "conflictsWithIds", term10774);
        setByteField(term10769, term10769.getClass(), "traitPoints", (byte) 13);
        ArrayList term10783 = new ArrayList();
        ((ArrayList) term10783).add((Object)null);
        ((ArrayList) term10783).add((Object)null);
        ((ArrayList) term10783).add((Object)null);
        ((ArrayList) term10783).add((Object)null);
        ((ArrayList) term10783).add((Object)null);
        ((ArrayList) term10783).add((Object)null);
        ((ArrayList) term10783).add((Object)null);
        ((ArrayList) term10783).add((Object)null);
        Object term10778 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10778, term10778.getClass(), "traitId", "");
        setField(term10778, term10778.getClass(), "traitName", "");
        setField(term10778, term10778.getClass(), "description", "");
        setField(term10778, term10778.getClass(), "group", "");
        setField(term10778, term10778.getClass(), "conflictsWithIds", term10783);
        setByteField(term10778, term10778.getClass(), "traitPoints", (byte) 44);
        ArrayList term10792 = new ArrayList();
        ((ArrayList) term10792).add((Object)null);
        ((ArrayList) term10792).add((Object)null);
        ((ArrayList) term10792).add((Object)null);
        ((ArrayList) term10792).add((Object)null);
        ((ArrayList) term10792).add((Object)null);
        ((ArrayList) term10792).add((Object)null);
        ((ArrayList) term10792).add((Object)null);
        ((ArrayList) term10792).add((Object)null);
        ((ArrayList) term10792).add((Object)null);
        Object term10787 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10787, term10787.getClass(), "traitId", "");
        setField(term10787, term10787.getClass(), "traitName", "");
        setField(term10787, term10787.getClass(), "description", "");
        setField(term10787, term10787.getClass(), "group", "");
        setField(term10787, term10787.getClass(), "conflictsWithIds", term10792);
        setByteField(term10787, term10787.getClass(), "traitPoints", (byte) -63);
        ArrayList term10801 = new ArrayList();
        ((ArrayList) term10801).add((Object)null);
        ((ArrayList) term10801).add((Object)null);
        ((ArrayList) term10801).add((Object)null);
        ((ArrayList) term10801).add((Object)null);
        ((ArrayList) term10801).add((Object)null);
        ((ArrayList) term10801).add((Object)null);
        ((ArrayList) term10801).add((Object)null);
        Object term10796 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term10796, term10796.getClass(), "traitId", "");
        setField(term10796, term10796.getClass(), "traitName", "");
        setField(term10796, term10796.getClass(), "description", "");
        setField(term10796, term10796.getClass(), "group", "");
        setField(term10796, term10796.getClass(), "conflictsWithIds", term10801);
        setByteField(term10796, term10796.getClass(), "traitPoints", (byte) 15);
        ArrayList term10731 = new ArrayList();
        ((ArrayList) term10731).add(term10733);
        ((ArrayList) term10731).add(term10742);
        ((ArrayList) term10731).add(term10751);
        ((ArrayList) term10731).add(term10760);
        ((ArrayList) term10731).add(term10769);
        ((ArrayList) term10731).add(term10778);
        ((ArrayList) term10731).add(term10787);
        ((ArrayList) term10731).add(term10796);
        term10664 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term10664, term10664.getClass(), "id", "lJoltmsadS");
        setField(term10664, term10664.getClass(), "name", "mvfDtZNEHr");
        setField(term10664, term10664.getClass(), "rulerSelection", enum20);
        setField(term10664, term10664.getClass(), "rulerTitleMale", "bvSgmFUDOU");
        setField(term10664, term10664.getClass(), "rulerTitleFemale", "XMHwbfiHRl");
        setField(term10664, term10664.getClass(), "traits", term10731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionBonus", argTypes, term10664, args);
    }

};


