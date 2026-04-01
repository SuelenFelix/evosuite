package org.openRealmOfStars.starMap.planet.construction;

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
import static org.openRealmOfStars.starMap.planet.construction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Building_getFullDescription_137476189816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8024;
     Object term8096;

    public Building_getFullDescription_137476189816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8358 = Class.forName((String) "org.openRealmOfStars.starMap.planet.construction.BuildingType");
        Field term8357 = ((Class) term8358).getDeclaredField((String) "CULTURE");
        ((Field) term8357).setAccessible(true);
        Object enum16 = ((Field) term8357).get((Object) null);
        term8024 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Building"));
        setField(term8024, term8024.getClass(), "type", enum16);
        setIntField(term8024, term8024.getClass(), "farmBonus", 278355793);
        setIntField(term8024, term8024.getClass(), "waterBonus", -310648604);
        setIntField(term8024, term8024.getClass(), "mineBonus", -648200466);
        setIntField(term8024, term8024.getClass(), "factBonus", 2007134147);
        setIntField(term8024, term8024.getClass(), "cultBonus", 993388358);
        setIntField(term8024, term8024.getClass(), "reseBonus", -765191335);
        setIntField(term8024, term8024.getClass(), "credBonus", -1697741155);
        setIntField(term8024, term8024.getClass(), "happinessBonus", 1295839803);
        setIntField(term8024, term8024.getClass(), "materialBonus", -1891015523);
        setDoubleField(term8024, term8024.getClass(), "maintenanceCost", 0.9527281779865117);
        setBooleanField(term8024, term8024.getClass(), "singleAllowed", false);
        setBooleanField(term8024, term8024.getClass(), "scientificAchievement", false);
        setBooleanField(term8024, term8024.getClass(), "broadcaster", true);
        setBooleanField(term8024, term8024.getClass(), "orbitalElevator", true);
        setIntField(term8024, term8024.getClass(), "battleBonus", -1560631747);
        setIntField(term8024, term8024.getClass(), "defenseDamage", 1215150180);
        setIntField(term8024, term8024.getClass(), "scanRange", -1422859977);
        setIntField(term8024, term8024.getClass(), "scanCloakingDetection", -1972436591);
        setIntField(term8024, term8024.getClass(), "fleetCapacityBonus", 68922753);
        setIntField(term8024, term8024.getClass(), "recycleBonus", -220791533);
        setIntField(term8024, term8024.getClass(), "ancientArtifactResearch", 1741500243);
        setIntField(term8024, term8024.getClass(), "wildLifePower", -2070466617);
        setField(term8024, term8024.getClass(), "name", "xOcJIiQQDu");
        setField(term8024, term8024.getClass(), "iconId", "GVizqqzXpy");
        setField(term8024, term8024.getClass(), "description", "JqXGgAhZPl");
        setIntField(term8024, term8024.getClass(), "prodCost", -1127721881);
        setIntField(term8024, term8024.getClass(), "metalCost", 1074848808);
        Class<? extends Object> term8880 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term8879 = ((Class) term8880).getDeclaredField((String) "PEACEFUL");
        ((Field) term8879).setAccessible(true);
        Object enum17 = ((Field) term8879).get((Object) null);
        Class<? extends Object> term9208 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term9207 = ((Class) term9208).getDeclaredField((String) "PATRIARCHY");
        ((Field) term9207).setAccessible(true);
        Object enum18 = ((Field) term9207).get((Object) null);
        Class<? extends Object> term9499 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term9498 = ((Class) term9499).getDeclaredField((String) "MALE");
        ((Field) term9498).setAccessible(true);
        Object enum19 =  ((Field) term9498).get((Object) null);
        Class<? extends Object> term9723 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term9722 = ((Class) term9723).getDeclaredField((String) "NONE");
        ((Field) term9722).setAccessible(true);
        Object enum20 =  ((Field) term9722).get((Object) null);
        Class<? extends Object> term9947 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term9946 = ((Class) term9947).getDeclaredField((String) "FEMALE");
        ((Field) term9946).setAccessible(true);
        Object enum21 =  ((Field) term9946).get((Object) null);
        ArrayList term8195 = new ArrayList();
        ((ArrayList) term8195).add(enum19);
        ((ArrayList) term8195).add(enum20);
        ((ArrayList) term8195).add(enum19);
        ((ArrayList) term8195).add(enum20);
        ((ArrayList) term8195).add(enum21);
        Class<? extends Object> term10566 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term10565 = ((Class) term10566).getDeclaredField((String) "JUNGLE");
        ((Field) term10565).setAccessible(true);
        Object enum22 = ((Field) term10565).get((Object) null);
        ArrayList term8279 = new ArrayList();
        ((ArrayList) term8279).add((Object)null);
        ((ArrayList) term8279).add((Object)null);
        ((ArrayList) term8279).add((Object)null);
        Object term8274 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term8274, term8274.getClass(), "traitId", "");
        setField(term8274, term8274.getClass(), "traitName", "");
        setField(term8274, term8274.getClass(), "description", "");
        setField(term8274, term8274.getClass(), "group", "");
        setField(term8274, term8274.getClass(), "conflictsWithIds", term8279);
        setByteField(term8274, term8274.getClass(), "traitPoints", (byte) 47);
        ArrayList term8288 = new ArrayList();
        ((ArrayList) term8288).add((Object)null);
        ((ArrayList) term8288).add((Object)null);
        ((ArrayList) term8288).add((Object)null);
        ((ArrayList) term8288).add((Object)null);
        Object term8283 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term8283, term8283.getClass(), "traitId", "");
        setField(term8283, term8283.getClass(), "traitName", "");
        setField(term8283, term8283.getClass(), "description", "");
        setField(term8283, term8283.getClass(), "group", "");
        setField(term8283, term8283.getClass(), "conflictsWithIds", term8288);
        setByteField(term8283, term8283.getClass(), "traitPoints", (byte) 48);
        ArrayList term8297 = new ArrayList();
        ((ArrayList) term8297).add((Object)null);
        Object term8292 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term8292, term8292.getClass(), "traitId", "");
        setField(term8292, term8292.getClass(), "traitName", "");
        setField(term8292, term8292.getClass(), "description", "");
        setField(term8292, term8292.getClass(), "group", "");
        setField(term8292, term8292.getClass(), "conflictsWithIds", term8297);
        setByteField(term8292, term8292.getClass(), "traitPoints", (byte) 89);
        ArrayList term8306 = new ArrayList();
        ((ArrayList) term8306).add((Object)null);
        ((ArrayList) term8306).add((Object)null);
        ((ArrayList) term8306).add((Object)null);
        ((ArrayList) term8306).add((Object)null);
        ((ArrayList) term8306).add((Object)null);
        ((ArrayList) term8306).add((Object)null);
        Object term8301 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term8301, term8301.getClass(), "traitId", "");
        setField(term8301, term8301.getClass(), "traitName", "");
        setField(term8301, term8301.getClass(), "description", "");
        setField(term8301, term8301.getClass(), "group", "");
        setField(term8301, term8301.getClass(), "conflictsWithIds", term8306);
        setByteField(term8301, term8301.getClass(), "traitPoints", (byte) 75);
        ArrayList term8272 = new ArrayList();
        ((ArrayList) term8272).add(term8274);
        ((ArrayList) term8272).add(term8283);
        ((ArrayList) term8272).add(term8292);
        ((ArrayList) term8272).add(term8301);
        Class<? extends Object> term11118 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term11117 = ((Class) term11118).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term11117).setAccessible(true);
        Object enum23 = ((Field) term11117).get((Object) null);
        Class<? extends Object> term11478 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term11477 = ((Class) term11478).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term11477).setAccessible(true);
        Object enum24 = ((Field) term11477).get((Object) null);
        term8096 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term8233 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term8096, term8096.getClass(), "id", "jiKYgYHqIS");
        setField(term8096, term8096.getClass(), "name", "DfISiziTgG");
        setField(term8096, term8096.getClass(), "nameSingle", "XqgfKFvPSD");
        setField(term8096, term8096.getClass(), "attitude", enum17);
        setField(term8096, term8096.getClass(), "imagePath", "JiVRgTZvKc");
        setField(term8096, term8096.getClass(), "bridgeId", "XPKmummaqg");
        setField(term8096, term8096.getClass(), "spaceShipId", "BKLfkLiZTH");
        setField(term8096, term8096.getClass(), "socialSystem", enum18);
        setField(term8096, term8096.getClass(), "genderList", term8195);
        setField(term8096, term8096.getClass(), "speechSetId", "SPpkrGcPRr");
        setField(term8096, term8096.getClass(), "bridgeEffect", enum22);
        setField(term8233, term8233.getClass(), "songName", "sEccwbJKYE");
        setField(term8233, term8233.getClass(), "author", "AWRooQKkdW");
        setField(term8233, term8233.getClass(), "fileName", "vjxIhXHxGR");
        setBooleanField(term8233, term8233.getClass(), "custom", false);
        setIntField(term8233, term8233.getClass(), "fadingLimit", -146054762);
        setField(term8096, term8096.getClass(), "diplomacyMusic", term8233);
        setField(term8096, term8096.getClass(), "traits", term8272);
        setField(term8096, term8096.getClass(), "leaderNameGenerator", enum23);
        setField(term8096, term8096.getClass(), "description", "gCWtLVKVVe");
        setField(term8096, term8096.getClass(), "spaceRaceType", enum24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[1];
        args[0] = term8096;
        callMethod(klass, "getFullDescription", argTypes, term8024, args);
    }

};


