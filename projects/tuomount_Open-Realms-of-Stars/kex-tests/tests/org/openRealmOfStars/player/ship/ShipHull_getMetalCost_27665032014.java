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

public class ShipHull_getMetalCost_27665032014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518429;

    public ShipHull_getMetalCost_27665032014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term518702 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term518701 = ((Class) term518702).getDeclaredField((String) "PROBE");
        ((Field) term518701).setAccessible(true);
        Object enum1643 = ((Field) term518701).get((Object) null);
        Class<? extends Object> term518949 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term518948 = ((Class) term518949).getDeclaredField((String) "MEDIUM");
        ((Field) term518948).setAccessible(true);
        Object enum1644 = ((Field) term518948).get((Object) null);
        Class<? extends Object> term519209 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term519208 = ((Class) term519209).getDeclaredField((String) "PEACEFUL");
        ((Field) term519208).setAccessible(true);
        Object enum1645 = ((Field) term519208).get((Object) null);
        Class<? extends Object> term519500 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term519499 = ((Class) term519500).getDeclaredField((String) "EQUAL");
        ((Field) term519499).setAccessible(true);
        Object enum1646 = ((Field) term519499).get((Object) null);
        Class<? extends Object> term519747 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term519746 = ((Class) term519747).getDeclaredField((String) "MALE");
        ((Field) term519746).setAccessible(true);
        Object enum1647 =  ((Field) term519746).get((Object) null);
        Class<? extends Object> term519971 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term519970 = ((Class) term519971).getDeclaredField((String) "MALE");
        ((Field) term519970).setAccessible(true);
        Object enum1648 =  ((Field) term519970).get((Object) null);
        Class<? extends Object> term520195 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term520194 = ((Class) term520195).getDeclaredField((String) "FEMALE");
        ((Field) term520194).setAccessible(true);
        Object enum1649 =  ((Field) term520194).get((Object) null);
        ArrayList term518562 = new ArrayList();
        ((ArrayList) term518562).add(enum1647);
        ((ArrayList) term518562).add(enum1648);
        ((ArrayList) term518562).add(enum1649);
        ((ArrayList) term518562).add(enum1647);
        ((ArrayList) term518562).add(enum1649);
        ((ArrayList) term518562).add(enum1648);
        ((ArrayList) term518562).add(enum1649);
        ((ArrayList) term518562).add(enum1647);
        Class<? extends Object> term520435 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term520434 = ((Class) term520435).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term520434).setAccessible(true);
        Object enum1650 = ((Field) term520434).get((Object) null);
        Object term518643 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term518643, term518643.getClass(), "traitId", null);
        setField(term518643, term518643.getClass(), "traitName", null);
        setField(term518643, term518643.getClass(), "description", null);
        setField(term518643, term518643.getClass(), "group", null);
        setField(term518643, term518643.getClass(), "conflictsWithIds", null);
        setByteField(term518643, term518643.getClass(), "traitPoints", (byte) -110);
        ArrayList term518641 = new ArrayList();
        ((ArrayList) term518641).add(term518643);
        Class<? extends Object> term520735 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term520734 = ((Class) term520735).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term520734).setAccessible(true);
        Object enum1651 = ((Field) term520734).get((Object) null);
        Class<? extends Object> term521045 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term521044 = ((Class) term521045).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term521044).setAccessible(true);
        Object enum1652 = ((Field) term521044).get((Object) null);
        term518429 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term518468 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term518602 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term518429, term518429.getClass(), "index", 468323881);
        setField(term518429, term518429.getClass(), "name", "pWyjMBGvBW");
        setIntField(term518429, term518429.getClass(), "maxSlot", 1862554868);
        setIntField(term518429, term518429.getClass(), "slotHull", -610778528);
        setField(term518429, term518429.getClass(), "hullType", enum1643);
        setField(term518429, term518429.getClass(), "size", enum1644);
        setIntField(term518429, term518429.getClass(), "cost", 1749515367);
        setIntField(term518429, term518429.getClass(), "metalCost", -1319948187);
        setIntField(term518429, term518429.getClass(), "imageIndex", -1019693873);
        setDoubleField(term518429, term518429.getClass(), "fleetCapacity", 0.22437750947699786);
        setField(term518468, term518468.getClass(), "id", "AZErYpbHNK");
        setField(term518468, term518468.getClass(), "name", "hPRBDJXtIm");
        setField(term518468, term518468.getClass(), "nameSingle", "lFpBaNXOGw");
        setField(term518468, term518468.getClass(), "attitude", enum1645);
        setField(term518468, term518468.getClass(), "imagePath", "BVcseHqSdy");
        setField(term518468, term518468.getClass(), "bridgeId", "JUEqPSnhuB");
        setField(term518468, term518468.getClass(), "spaceShipId", "ZMWgxxUNDQ");
        setField(term518468, term518468.getClass(), "socialSystem", enum1646);
        setField(term518468, term518468.getClass(), "genderList", term518562);
        setField(term518468, term518468.getClass(), "speechSetId", "SvlZPdLEcQ");
        setField(term518468, term518468.getClass(), "bridgeEffect", enum1650);
        setField(term518602, term518602.getClass(), "songName", "rcsriQScsw");
        setField(term518602, term518602.getClass(), "author", "hmbjaRbJmy");
        setField(term518602, term518602.getClass(), "fileName", "YzSUGIkaWI");
        setBooleanField(term518602, term518602.getClass(), "custom", true);
        setIntField(term518602, term518602.getClass(), "fadingLimit", 1079247960);
        setField(term518468, term518468.getClass(), "diplomacyMusic", term518602);
        setField(term518468, term518468.getClass(), "traits", term518641);
        setField(term518468, term518468.getClass(), "leaderNameGenerator", enum1651);
        setField(term518468, term518468.getClass(), "description", "VEskEICAbE");
        setField(term518468, term518468.getClass(), "spaceRaceType", enum1652);
        setField(term518429, term518429.getClass(), "originalBuilder", term518468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetalCost", argTypes, term518429, args);
    }

};


