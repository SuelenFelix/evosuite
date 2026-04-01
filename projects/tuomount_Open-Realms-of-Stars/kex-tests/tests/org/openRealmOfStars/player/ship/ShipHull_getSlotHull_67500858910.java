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

public class ShipHull_getSlotHull_67500858910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507882;

    public ShipHull_getSlotHull_67500858910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term508170 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term508169 = ((Class) term508170).getDeclaredField((String) "PRIVATEER");
        ((Field) term508169).setAccessible(true);
        Object enum1608 = ((Field) term508169).get((Object) null);
        Class<? extends Object> term508429 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term508428 = ((Class) term508429).getDeclaredField((String) "HUGE");
        ((Field) term508428).setAccessible(true);
        Object enum1609 = ((Field) term508428).get((Object) null);
        Class<? extends Object> term508683 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term508682 = ((Class) term508683).getDeclaredField((String) "LOGICAL");
        ((Field) term508682).setAccessible(true);
        Object enum1610 = ((Field) term508682).get((Object) null);
        Class<? extends Object> term508971 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term508970 = ((Class) term508971).getDeclaredField((String) "PATRIARCHY");
        ((Field) term508970).setAccessible(true);
        Object enum1611 = ((Field) term508970).get((Object) null);
        Class<? extends Object> term509233 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term509232 = ((Class) term509233).getDeclaredField((String) "FEMALE");
        ((Field) term509232).setAccessible(true);
        Object enum1612 =  ((Field) term509232).get((Object) null);
        ArrayList term508021 = new ArrayList();
        ((ArrayList) term508021).add(enum1612);
        ((ArrayList) term508021).add(enum1612);
        Class<? extends Object> term509473 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term509472 = ((Class) term509473).getDeclaredField((String) "YELLOW_ALERT");
        ((Field) term509472).setAccessible(true);
        Object enum1613 = ((Field) term509472).get((Object) null);
        Object term508097 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term508097, term508097.getClass(), "traitId", null);
        setField(term508097, term508097.getClass(), "traitName", null);
        setField(term508097, term508097.getClass(), "description", null);
        setField(term508097, term508097.getClass(), "group", null);
        setField(term508097, term508097.getClass(), "conflictsWithIds", null);
        setByteField(term508097, term508097.getClass(), "traitPoints", (byte) -87);
        Object term508099 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term508099, term508099.getClass(), "traitId", null);
        setField(term508099, term508099.getClass(), "traitName", null);
        setField(term508099, term508099.getClass(), "description", null);
        setField(term508099, term508099.getClass(), "group", null);
        setField(term508099, term508099.getClass(), "conflictsWithIds", null);
        setByteField(term508099, term508099.getClass(), "traitPoints", (byte) 25);
        Object term508101 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term508101, term508101.getClass(), "traitId", null);
        setField(term508101, term508101.getClass(), "traitName", null);
        setField(term508101, term508101.getClass(), "description", null);
        setField(term508101, term508101.getClass(), "group", null);
        setField(term508101, term508101.getClass(), "conflictsWithIds", null);
        setByteField(term508101, term508101.getClass(), "traitPoints", (byte) -120);
        Object term508103 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term508103, term508103.getClass(), "traitId", null);
        setField(term508103, term508103.getClass(), "traitName", null);
        setField(term508103, term508103.getClass(), "description", null);
        setField(term508103, term508103.getClass(), "group", null);
        setField(term508103, term508103.getClass(), "conflictsWithIds", null);
        setByteField(term508103, term508103.getClass(), "traitPoints", (byte) 58);
        Object term508105 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term508105, term508105.getClass(), "traitId", null);
        setField(term508105, term508105.getClass(), "traitName", null);
        setField(term508105, term508105.getClass(), "description", null);
        setField(term508105, term508105.getClass(), "group", null);
        setField(term508105, term508105.getClass(), "conflictsWithIds", null);
        setByteField(term508105, term508105.getClass(), "traitPoints", (byte) -97);
        Object term508107 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term508107, term508107.getClass(), "traitId", null);
        setField(term508107, term508107.getClass(), "traitName", null);
        setField(term508107, term508107.getClass(), "description", null);
        setField(term508107, term508107.getClass(), "group", null);
        setField(term508107, term508107.getClass(), "conflictsWithIds", null);
        setByteField(term508107, term508107.getClass(), "traitPoints", (byte) 85);
        Object term508109 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term508109, term508109.getClass(), "traitId", null);
        setField(term508109, term508109.getClass(), "traitName", null);
        setField(term508109, term508109.getClass(), "description", null);
        setField(term508109, term508109.getClass(), "group", null);
        setField(term508109, term508109.getClass(), "conflictsWithIds", null);
        setByteField(term508109, term508109.getClass(), "traitPoints", (byte) -62);
        Object term508111 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term508111, term508111.getClass(), "traitId", null);
        setField(term508111, term508111.getClass(), "traitName", null);
        setField(term508111, term508111.getClass(), "description", null);
        setField(term508111, term508111.getClass(), "group", null);
        setField(term508111, term508111.getClass(), "conflictsWithIds", null);
        setByteField(term508111, term508111.getClass(), "traitPoints", (byte) 100);
        ArrayList term508095 = new ArrayList();
        ((ArrayList) term508095).add(term508097);
        ((ArrayList) term508095).add(term508099);
        ((ArrayList) term508095).add(term508101);
        ((ArrayList) term508095).add(term508103);
        ((ArrayList) term508095).add(term508105);
        ((ArrayList) term508095).add(term508107);
        ((ArrayList) term508095).add(term508109);
        ((ArrayList) term508095).add(term508111);
        Class<? extends Object> term509776 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term509775 = ((Class) term509776).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term509775).setAccessible(true);
        Object enum1614 = ((Field) term509775).get((Object) null);
        Class<? extends Object> term510089 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term510088 = ((Class) term510089).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term510088).setAccessible(true);
        Object enum1615 = ((Field) term510088).get((Object) null);
        term507882 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term507923 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term508056 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term507882, term507882.getClass(), "index", -253613650);
        setField(term507882, term507882.getClass(), "name", "dYQImRUWxM");
        setIntField(term507882, term507882.getClass(), "maxSlot", 598417977);
        setIntField(term507882, term507882.getClass(), "slotHull", -594010352);
        setField(term507882, term507882.getClass(), "hullType", enum1608);
        setField(term507882, term507882.getClass(), "size", enum1609);
        setIntField(term507882, term507882.getClass(), "cost", 1901360390);
        setIntField(term507882, term507882.getClass(), "metalCost", 2112491155);
        setIntField(term507882, term507882.getClass(), "imageIndex", 1153767678);
        setDoubleField(term507882, term507882.getClass(), "fleetCapacity", 0.8664463700873805);
        setField(term507923, term507923.getClass(), "id", "YeqJmNmIIY");
        setField(term507923, term507923.getClass(), "name", "hcZXAXYxdU");
        setField(term507923, term507923.getClass(), "nameSingle", "zdxKnjrAdp");
        setField(term507923, term507923.getClass(), "attitude", enum1610);
        setField(term507923, term507923.getClass(), "imagePath", "HzjGAUNELB");
        setField(term507923, term507923.getClass(), "bridgeId", "HGSQVJCxul");
        setField(term507923, term507923.getClass(), "spaceShipId", "uIugAGTulK");
        setField(term507923, term507923.getClass(), "socialSystem", enum1611);
        setField(term507923, term507923.getClass(), "genderList", term508021);
        setField(term507923, term507923.getClass(), "speechSetId", "LDtphCRvpE");
        setField(term507923, term507923.getClass(), "bridgeEffect", enum1613);
        setField(term508056, term508056.getClass(), "songName", "bhNizQfATc");
        setField(term508056, term508056.getClass(), "author", "tOMKZFAgFD");
        setField(term508056, term508056.getClass(), "fileName", "GOiBZeyBWd");
        setBooleanField(term508056, term508056.getClass(), "custom", false);
        setIntField(term508056, term508056.getClass(), "fadingLimit", 252401222);
        setField(term507923, term507923.getClass(), "diplomacyMusic", term508056);
        setField(term507923, term507923.getClass(), "traits", term508095);
        setField(term507923, term507923.getClass(), "leaderNameGenerator", enum1614);
        setField(term507923, term507923.getClass(), "description", "gEiEnMGaDd");
        setField(term507923, term507923.getClass(), "spaceRaceType", enum1615);
        setField(term507882, term507882.getClass(), "originalBuilder", term507923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlotHull", argTypes, term507882, args);
    }

};


