package org.openRealmOfStars.player.race;

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
import static org.openRealmOfStars.player.race.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class SpaceRace_setSpaceShipId_8677215016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235470;

    public SpaceRace_setSpaceShipId_8677215016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term235787 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term235786 = ((Class) term235787).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term235786).setAccessible(true);
        Object enum714 = ((Field) term235786).get((Object) null);
        Class<? extends Object> term236084 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term236083 = ((Class) term236084).getDeclaredField((String) "PATRIARCHY");
        ((Field) term236083).setAccessible(true);
        Object enum715 = ((Field) term236083).get((Object) null);
        Class<? extends Object> term236346 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term236345 = ((Class) term236346).getDeclaredField((String) "MALE");
        ((Field) term236345).setAccessible(true);
        Object enum716 =  ((Field) term236345).get((Object) null);
        Class<? extends Object> term236570 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term236569 = ((Class) term236570).getDeclaredField((String) "NONE");
        ((Field) term236569).setAccessible(true);
        Object enum717 =  ((Field) term236569).get((Object) null);
        ArrayList term235571 = new ArrayList();
        ((ArrayList) term235571).add(enum716);
        ((ArrayList) term235571).add(enum716);
        ((ArrayList) term235571).add(enum717);
        ((ArrayList) term235571).add(enum717);
        ((ArrayList) term235571).add(enum717);
        ((ArrayList) term235571).add(enum717);
        ((ArrayList) term235571).add(enum717);
        Class<? extends Object> term236804 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term236803 = ((Class) term236804).getDeclaredField((String) "FLOAT_IN_SPACE");
        ((Field) term236803).setAccessible(true);
        Object enum718 = ((Field) term236803).get((Object) null);
        ArrayList term235659 = new ArrayList();
        Object term235654 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term235654, term235654.getClass(), "traitId", "");
        setField(term235654, term235654.getClass(), "traitName", "");
        setField(term235654, term235654.getClass(), "description", "");
        setField(term235654, term235654.getClass(), "group", "");
        setField(term235654, term235654.getClass(), "conflictsWithIds", term235659);
        setByteField(term235654, term235654.getClass(), "traitPoints", (byte) 1);
        ArrayList term235668 = new ArrayList();
        ((ArrayList) term235668).add((Object)null);
        ((ArrayList) term235668).add((Object)null);
        ((ArrayList) term235668).add((Object)null);
        ((ArrayList) term235668).add((Object)null);
        ((ArrayList) term235668).add((Object)null);
        Object term235663 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term235663, term235663.getClass(), "traitId", "");
        setField(term235663, term235663.getClass(), "traitName", "");
        setField(term235663, term235663.getClass(), "description", "");
        setField(term235663, term235663.getClass(), "group", "");
        setField(term235663, term235663.getClass(), "conflictsWithIds", term235668);
        setByteField(term235663, term235663.getClass(), "traitPoints", (byte) 29);
        ArrayList term235677 = new ArrayList();
        ((ArrayList) term235677).add((Object)null);
        ((ArrayList) term235677).add((Object)null);
        ((ArrayList) term235677).add((Object)null);
        ((ArrayList) term235677).add((Object)null);
        ((ArrayList) term235677).add((Object)null);
        ((ArrayList) term235677).add((Object)null);
        Object term235672 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term235672, term235672.getClass(), "traitId", "");
        setField(term235672, term235672.getClass(), "traitName", "");
        setField(term235672, term235672.getClass(), "description", "");
        setField(term235672, term235672.getClass(), "group", "");
        setField(term235672, term235672.getClass(), "conflictsWithIds", term235677);
        setByteField(term235672, term235672.getClass(), "traitPoints", (byte) -120);
        ArrayList term235686 = new ArrayList();
        ((ArrayList) term235686).add((Object)null);
        ((ArrayList) term235686).add((Object)null);
        ((ArrayList) term235686).add((Object)null);
        ((ArrayList) term235686).add((Object)null);
        ((ArrayList) term235686).add((Object)null);
        Object term235681 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term235681, term235681.getClass(), "traitId", "");
        setField(term235681, term235681.getClass(), "traitName", "");
        setField(term235681, term235681.getClass(), "description", "");
        setField(term235681, term235681.getClass(), "group", "");
        setField(term235681, term235681.getClass(), "conflictsWithIds", term235686);
        setByteField(term235681, term235681.getClass(), "traitPoints", (byte) -15);
        ArrayList term235695 = new ArrayList();
        ((ArrayList) term235695).add((Object)null);
        ((ArrayList) term235695).add((Object)null);
        ((ArrayList) term235695).add((Object)null);
        ((ArrayList) term235695).add((Object)null);
        ((ArrayList) term235695).add((Object)null);
        ((ArrayList) term235695).add((Object)null);
        ((ArrayList) term235695).add((Object)null);
        ((ArrayList) term235695).add((Object)null);
        Object term235690 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term235690, term235690.getClass(), "traitId", "");
        setField(term235690, term235690.getClass(), "traitName", "");
        setField(term235690, term235690.getClass(), "description", "");
        setField(term235690, term235690.getClass(), "group", "");
        setField(term235690, term235690.getClass(), "conflictsWithIds", term235695);
        setByteField(term235690, term235690.getClass(), "traitPoints", (byte) 30);
        ArrayList term235652 = new ArrayList();
        ((ArrayList) term235652).add(term235654);
        ((ArrayList) term235652).add(term235663);
        ((ArrayList) term235652).add(term235672);
        ((ArrayList) term235652).add(term235681);
        ((ArrayList) term235652).add(term235690);
        Class<? extends Object> term237113 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term237112 = ((Class) term237113).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term237112).setAccessible(true);
        Object enum719 = ((Field) term237112).get((Object) null);
        Class<? extends Object> term237423 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term237422 = ((Class) term237423).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term237422).setAccessible(true);
        Object enum720 = ((Field) term237422).get((Object) null);
        term235470 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term235613 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term235470, term235470.getClass(), "id", "GdKZQFSXLD");
        setField(term235470, term235470.getClass(), "name", "HFgSxxkaqY");
        setField(term235470, term235470.getClass(), "nameSingle", "YELYGfUdgT");
        setField(term235470, term235470.getClass(), "attitude", enum714);
        setField(term235470, term235470.getClass(), "imagePath", "uIuHcWMIiJ");
        setField(term235470, term235470.getClass(), "bridgeId", "yATyJhRInt");
        setField(term235470, term235470.getClass(), "spaceShipId", "TlmrfudqaW");
        setField(term235470, term235470.getClass(), "socialSystem", enum715);
        setField(term235470, term235470.getClass(), "genderList", term235571);
        setField(term235470, term235470.getClass(), "speechSetId", "gnpzTNFhwY");
        setField(term235470, term235470.getClass(), "bridgeEffect", enum718);
        setField(term235613, term235613.getClass(), "songName", "EcCtjFVSMK");
        setField(term235613, term235613.getClass(), "author", "DnpLIBKoLA");
        setField(term235613, term235613.getClass(), "fileName", "pfqWEoZXtC");
        setBooleanField(term235613, term235613.getClass(), "custom", false);
        setIntField(term235613, term235613.getClass(), "fadingLimit", -1981879284);
        setField(term235470, term235470.getClass(), "diplomacyMusic", term235613);
        setField(term235470, term235470.getClass(), "traits", term235652);
        setField(term235470, term235470.getClass(), "leaderNameGenerator", enum719);
        setField(term235470, term235470.getClass(), "description", "oHxEQPShRZ");
        setField(term235470, term235470.getClass(), "spaceRaceType", enum720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kbHGRhfzpJ";
        callMethod(klass, "setSpaceShipId", argTypes, term235470, args);
    }

};


