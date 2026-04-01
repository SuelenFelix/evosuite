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

public class SpaceRace_getAttitude_94175429711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246822;

    public SpaceRace_getAttitude_94175429711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term247110 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term247109 = ((Class) term247110).getDeclaredField((String) "PEACEFUL");
        ((Field) term247109).setAccessible(true);
        Object enum750 = ((Field) term247109).get((Object) null);
        Class<? extends Object> term247401 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term247400 = ((Class) term247401).getDeclaredField((String) "PATRIARCHY");
        ((Field) term247400).setAccessible(true);
        Object enum751 = ((Field) term247400).get((Object) null);
        Class<? extends Object> term247663 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term247662 = ((Class) term247663).getDeclaredField((String) "NONE");
        ((Field) term247662).setAccessible(true);
        Object enum752 =  ((Field) term247662).get((Object) null);
        Class<? extends Object> term247887 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term247886 = ((Class) term247887).getDeclaredField((String) "FEMALE");
        ((Field) term247886).setAccessible(true);
        Object enum753 =  ((Field) term247886).get((Object) null);
        Class<? extends Object> term248117 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term248116 = ((Class) term248117).getDeclaredField((String) "NONE");
        ((Field) term248116).setAccessible(true);
        Object enum754 =  ((Field) term248116).get((Object) null);
        ArrayList term246921 = new ArrayList();
        ((ArrayList) term246921).add(enum752);
        ((ArrayList) term246921).add(enum753);
        ((ArrayList) term246921).add(enum754);
        Class<? extends Object> term248351 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term248350 = ((Class) term248351).getDeclaredField((String) "TEST");
        ((Field) term248350).setAccessible(true);
        Object enum755 = ((Field) term248350).get((Object) null);
        ArrayList term247003 = new ArrayList();
        ((ArrayList) term247003).add((Object)null);
        ((ArrayList) term247003).add((Object)null);
        ((ArrayList) term247003).add((Object)null);
        Object term246998 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term246998, term246998.getClass(), "traitId", "");
        setField(term246998, term246998.getClass(), "traitName", "");
        setField(term246998, term246998.getClass(), "description", "");
        setField(term246998, term246998.getClass(), "group", "");
        setField(term246998, term246998.getClass(), "conflictsWithIds", term247003);
        setByteField(term246998, term246998.getClass(), "traitPoints", (byte) 69);
        ArrayList term247012 = new ArrayList();
        ((ArrayList) term247012).add((Object)null);
        Object term247007 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term247007, term247007.getClass(), "traitId", "");
        setField(term247007, term247007.getClass(), "traitName", "");
        setField(term247007, term247007.getClass(), "description", "");
        setField(term247007, term247007.getClass(), "group", "");
        setField(term247007, term247007.getClass(), "conflictsWithIds", term247012);
        setByteField(term247007, term247007.getClass(), "traitPoints", (byte) 8);
        ArrayList term247021 = new ArrayList();
        ((ArrayList) term247021).add((Object)null);
        ((ArrayList) term247021).add((Object)null);
        ((ArrayList) term247021).add((Object)null);
        ((ArrayList) term247021).add((Object)null);
        ((ArrayList) term247021).add((Object)null);
        ((ArrayList) term247021).add((Object)null);
        ((ArrayList) term247021).add((Object)null);
        ((ArrayList) term247021).add((Object)null);
        ((ArrayList) term247021).add((Object)null);
        Object term247016 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term247016, term247016.getClass(), "traitId", "");
        setField(term247016, term247016.getClass(), "traitName", "");
        setField(term247016, term247016.getClass(), "description", "");
        setField(term247016, term247016.getClass(), "group", "");
        setField(term247016, term247016.getClass(), "conflictsWithIds", term247021);
        setByteField(term247016, term247016.getClass(), "traitPoints", (byte) 96);
        ArrayList term247030 = new ArrayList();
        ((ArrayList) term247030).add((Object)null);
        ((ArrayList) term247030).add((Object)null);
        ((ArrayList) term247030).add((Object)null);
        ((ArrayList) term247030).add((Object)null);
        ((ArrayList) term247030).add((Object)null);
        Object term247025 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term247025, term247025.getClass(), "traitId", "");
        setField(term247025, term247025.getClass(), "traitName", "");
        setField(term247025, term247025.getClass(), "description", "");
        setField(term247025, term247025.getClass(), "group", "");
        setField(term247025, term247025.getClass(), "conflictsWithIds", term247030);
        setByteField(term247025, term247025.getClass(), "traitPoints", (byte) 2);
        ArrayList term246996 = new ArrayList();
        ((ArrayList) term246996).add(term246998);
        ((ArrayList) term246996).add(term247007);
        ((ArrayList) term246996).add(term247016);
        ((ArrayList) term246996).add(term247025);
        Class<? extends Object> term248630 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term248629 = ((Class) term248630).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term248629).setAccessible(true);
        Object enum756 = ((Field) term248629).get((Object) null);
        Class<? extends Object> term248940 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term248939 = ((Class) term248940).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term248939).setAccessible(true);
        Object enum757 = ((Field) term248939).get((Object) null);
        term246822 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term246957 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term246822, term246822.getClass(), "id", "MrjCdvTPnq");
        setField(term246822, term246822.getClass(), "name", "fheVosxidN");
        setField(term246822, term246822.getClass(), "nameSingle", "EliOjzcjaH");
        setField(term246822, term246822.getClass(), "attitude", enum750);
        setField(term246822, term246822.getClass(), "imagePath", "QebYNbOBeP");
        setField(term246822, term246822.getClass(), "bridgeId", "azqpHmPbfX");
        setField(term246822, term246822.getClass(), "spaceShipId", "mzjGFHNpPh");
        setField(term246822, term246822.getClass(), "socialSystem", enum751);
        setField(term246822, term246822.getClass(), "genderList", term246921);
        setField(term246822, term246822.getClass(), "speechSetId", "JmuvhLuzoo");
        setField(term246822, term246822.getClass(), "bridgeEffect", enum755);
        setField(term246957, term246957.getClass(), "songName", "yunXHVjiFz");
        setField(term246957, term246957.getClass(), "author", "fInyTanaRj");
        setField(term246957, term246957.getClass(), "fileName", "vUkEfrLXZa");
        setBooleanField(term246957, term246957.getClass(), "custom", true);
        setIntField(term246957, term246957.getClass(), "fadingLimit", -229722367);
        setField(term246822, term246822.getClass(), "diplomacyMusic", term246957);
        setField(term246822, term246822.getClass(), "traits", term246996);
        setField(term246822, term246822.getClass(), "leaderNameGenerator", enum756);
        setField(term246822, term246822.getClass(), "description", "uRTXSIWwGX");
        setField(term246822, term246822.getClass(), "spaceRaceType", enum757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttitude", argTypes, term246822, args);
    }

};


