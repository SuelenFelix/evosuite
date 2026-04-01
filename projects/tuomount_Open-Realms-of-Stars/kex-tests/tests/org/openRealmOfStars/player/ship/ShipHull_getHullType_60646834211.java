package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ShipHull_getHullType_60646834211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510361;

    public ShipHull_getHullType_60646834211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term510656 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term510655 = ((Class) term510656).getDeclaredField((String) "FREIGHTER");
        ((Field) term510655).setAccessible(true);
        Object enum1616 = ((Field) term510655).get((Object) null);
        Class<? extends Object> term510915 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term510914 = ((Class) term510915).getDeclaredField((String) "MEDIUM");
        ((Field) term510914).setAccessible(true);
        Object enum1617 = ((Field) term510914).get((Object) null);
        Class<? extends Object> term511175 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term511174 = ((Class) term511175).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term511174).setAccessible(true);
        Object enum1618 = ((Field) term511174).get((Object) null);
        Class<? extends Object> term511472 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term511471 = ((Class) term511472).getDeclaredField((String) "EQUAL");
        ((Field) term511471).setAccessible(true);
        Object enum1619 = ((Field) term511471).get((Object) null);
        Class<? extends Object> term511719 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term511718 = ((Class) term511719).getDeclaredField((String) "NONE");
        ((Field) term511718).setAccessible(true);
        Object enum1620 =  ((Field) term511718).get((Object) null);
        Class<? extends Object> term511943 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term511942 = ((Class) term511943).getDeclaredField((String) "FEMALE");
        ((Field) term511942).setAccessible(true);
        Object enum1621 =  ((Field) term511942).get((Object) null);
        Class<? extends Object> term512173 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term512172 = ((Class) term512173).getDeclaredField((String) "MALE");
        ((Field) term512172).setAccessible(true);
        Object enum1622 =  ((Field) term512172).get((Object) null);
        ArrayList term510500 = new ArrayList();
        ((ArrayList) term510500).add(enum1620);
        ((ArrayList) term510500).add(enum1620);
        ((ArrayList) term510500).add(enum1620);
        ((ArrayList) term510500).add(enum1621);
        ((ArrayList) term510500).add(enum1620);
        ((ArrayList) term510500).add(enum1622);
        ((ArrayList) term510500).add(enum1622);
        ((ArrayList) term510500).add(enum1621);
        Class<? extends Object> term512407 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term512406 = ((Class) term512407).getDeclaredField((String) "NUKE_START");
        ((Field) term512406).setAccessible(true);
        Object enum1623 = ((Field) term512406).get((Object) null);
        Object term510580 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510580, term510580.getClass(), "traitId", null);
        setField(term510580, term510580.getClass(), "traitName", null);
        setField(term510580, term510580.getClass(), "description", null);
        setField(term510580, term510580.getClass(), "group", null);
        setField(term510580, term510580.getClass(), "conflictsWithIds", null);
        setByteField(term510580, term510580.getClass(), "traitPoints", (byte) -81);
        Object term510582 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510582, term510582.getClass(), "traitId", null);
        setField(term510582, term510582.getClass(), "traitName", null);
        setField(term510582, term510582.getClass(), "description", null);
        setField(term510582, term510582.getClass(), "group", null);
        setField(term510582, term510582.getClass(), "conflictsWithIds", null);
        setByteField(term510582, term510582.getClass(), "traitPoints", (byte) 71);
        Object term510584 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510584, term510584.getClass(), "traitId", null);
        setField(term510584, term510584.getClass(), "traitName", null);
        setField(term510584, term510584.getClass(), "description", null);
        setField(term510584, term510584.getClass(), "group", null);
        setField(term510584, term510584.getClass(), "conflictsWithIds", null);
        setByteField(term510584, term510584.getClass(), "traitPoints", (byte) 1);
        Object term510586 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510586, term510586.getClass(), "traitId", null);
        setField(term510586, term510586.getClass(), "traitName", null);
        setField(term510586, term510586.getClass(), "description", null);
        setField(term510586, term510586.getClass(), "group", null);
        setField(term510586, term510586.getClass(), "conflictsWithIds", null);
        setByteField(term510586, term510586.getClass(), "traitPoints", (byte) -128);
        Object term510588 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510588, term510588.getClass(), "traitId", null);
        setField(term510588, term510588.getClass(), "traitName", null);
        setField(term510588, term510588.getClass(), "description", null);
        setField(term510588, term510588.getClass(), "group", null);
        setField(term510588, term510588.getClass(), "conflictsWithIds", null);
        setByteField(term510588, term510588.getClass(), "traitPoints", (byte) 127);
        Object term510590 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510590, term510590.getClass(), "traitId", null);
        setField(term510590, term510590.getClass(), "traitName", null);
        setField(term510590, term510590.getClass(), "description", null);
        setField(term510590, term510590.getClass(), "group", null);
        setField(term510590, term510590.getClass(), "conflictsWithIds", null);
        setByteField(term510590, term510590.getClass(), "traitPoints", (byte) 1);
        Object term510592 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510592, term510592.getClass(), "traitId", null);
        setField(term510592, term510592.getClass(), "traitName", null);
        setField(term510592, term510592.getClass(), "description", null);
        setField(term510592, term510592.getClass(), "group", null);
        setField(term510592, term510592.getClass(), "conflictsWithIds", null);
        setByteField(term510592, term510592.getClass(), "traitPoints", (byte) 80);
        Object term510594 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510594, term510594.getClass(), "traitId", null);
        setField(term510594, term510594.getClass(), "traitName", null);
        setField(term510594, term510594.getClass(), "description", null);
        setField(term510594, term510594.getClass(), "group", null);
        setField(term510594, term510594.getClass(), "conflictsWithIds", null);
        setByteField(term510594, term510594.getClass(), "traitPoints", (byte) -93);
        Object term510596 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term510596, term510596.getClass(), "traitId", null);
        setField(term510596, term510596.getClass(), "traitName", null);
        setField(term510596, term510596.getClass(), "description", null);
        setField(term510596, term510596.getClass(), "group", null);
        setField(term510596, term510596.getClass(), "conflictsWithIds", null);
        setByteField(term510596, term510596.getClass(), "traitPoints", (byte) 10);
        ArrayList term510578 = new ArrayList();
        ((ArrayList) term510578).add(term510580);
        ((ArrayList) term510578).add(term510582);
        ((ArrayList) term510578).add(term510584);
        ((ArrayList) term510578).add(term510586);
        ((ArrayList) term510578).add(term510588);
        ((ArrayList) term510578).add(term510590);
        ((ArrayList) term510578).add(term510592);
        ((ArrayList) term510578).add(term510594);
        ((ArrayList) term510578).add(term510596);
        Class<? extends Object> term512704 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term512703 = ((Class) term512704).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term512703).setAccessible(true);
        Object enum1624 = ((Field) term512703).get((Object) null);
        Class<? extends Object> term513017 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term513016 = ((Class) term513017).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term513016).setAccessible(true);
        Object enum1625 = ((Field) term513016).get((Object) null);
        term510361 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term510404 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term510539 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term510361, term510361.getClass(), "index", 2136690836);
        setField(term510361, term510361.getClass(), "name", "wDQFsyJFGK");
        setIntField(term510361, term510361.getClass(), "maxSlot", 1415141329);
        setIntField(term510361, term510361.getClass(), "slotHull", 1866488615);
        setField(term510361, term510361.getClass(), "hullType", enum1616);
        setField(term510361, term510361.getClass(), "size", enum1617);
        setIntField(term510361, term510361.getClass(), "cost", 303848886);
        setIntField(term510361, term510361.getClass(), "metalCost", 1881530712);
        setIntField(term510361, term510361.getClass(), "imageIndex", 222708508);
        setDoubleField(term510361, term510361.getClass(), "fleetCapacity", 0.4228841212022646);
        setField(term510404, term510404.getClass(), "id", "mDECKRvKvu");
        setField(term510404, term510404.getClass(), "name", "ehThxEoiQB");
        setField(term510404, term510404.getClass(), "nameSingle", "HpupuOlsyn");
        setField(term510404, term510404.getClass(), "attitude", enum1618);
        setField(term510404, term510404.getClass(), "imagePath", "ffSpWMetxS");
        setField(term510404, term510404.getClass(), "bridgeId", "KIfYZLtrHx");
        setField(term510404, term510404.getClass(), "spaceShipId", "sYAjNsAtvM");
        setField(term510404, term510404.getClass(), "socialSystem", enum1619);
        setField(term510404, term510404.getClass(), "genderList", term510500);
        setField(term510404, term510404.getClass(), "speechSetId", "wzreOHptRS");
        setField(term510404, term510404.getClass(), "bridgeEffect", enum1623);
        setField(term510539, term510539.getClass(), "songName", "ChLKGGkSGj");
        setField(term510539, term510539.getClass(), "author", "ZacgmriFeL");
        setField(term510539, term510539.getClass(), "fileName", "suFipvmkKJ");
        setBooleanField(term510539, term510539.getClass(), "custom", false);
        setIntField(term510539, term510539.getClass(), "fadingLimit", 1601090042);
        setField(term510404, term510404.getClass(), "diplomacyMusic", term510539);
        setField(term510404, term510404.getClass(), "traits", term510578);
        setField(term510404, term510404.getClass(), "leaderNameGenerator", enum1624);
        setField(term510404, term510404.getClass(), "description", "eTCSYKLsdP");
        setField(term510404, term510404.getClass(), "spaceRaceType", enum1625);
        setField(term510361, term510361.getClass(), "originalBuilder", term510404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHullType", argTypes, term510361, args);
    }

};


