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

public class ShipHull_getFleetCapacity_141313031516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524167;

    public ShipHull_getFleetCapacity_141313031516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term524451 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term524450 = ((Class) term524451).getDeclaredField((String) "FREIGHTER");
        ((Field) term524450).setAccessible(true);
        Object enum1663 = ((Field) term524450).get((Object) null);
        Class<? extends Object> term524710 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term524709 = ((Class) term524710).getDeclaredField((String) "MEDIUM");
        ((Field) term524709).setAccessible(true);
        Object enum1664 = ((Field) term524709).get((Object) null);
        Class<? extends Object> term524970 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term524969 = ((Class) term524970).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term524969).setAccessible(true);
        Object enum1665 = ((Field) term524969).get((Object) null);
        Class<? extends Object> term525267 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term525266 = ((Class) term525267).getDeclaredField((String) "PATRIARCHY");
        ((Field) term525266).setAccessible(true);
        Object enum1666 = ((Field) term525266).get((Object) null);
        Class<? extends Object> term525529 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term525528 = ((Class) term525529).getDeclaredField((String) "NONE");
        ((Field) term525528).setAccessible(true);
        Object enum1667 =  ((Field) term525528).get((Object) null);
        Class<? extends Object> term525753 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term525752 = ((Class) term525753).getDeclaredField((String) "NONE");
        ((Field) term525752).setAccessible(true);
        Object enum1668 =  ((Field) term525752).get((Object) null);
        ArrayList term524311 = new ArrayList();
        ((ArrayList) term524311).add(enum1667);
        ((ArrayList) term524311).add(enum1668);
        ((ArrayList) term524311).add(enum1668);
        ((ArrayList) term524311).add(enum1667);
        Class<? extends Object> term525987 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term525986 = ((Class) term525987).getDeclaredField((String) "BLUEISH_WHITE");
        ((Field) term525986).setAccessible(true);
        Object enum1669 = ((Field) term525986).get((Object) null);
        Object term524391 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term524391, term524391.getClass(), "traitId", null);
        setField(term524391, term524391.getClass(), "traitName", null);
        setField(term524391, term524391.getClass(), "description", null);
        setField(term524391, term524391.getClass(), "group", null);
        setField(term524391, term524391.getClass(), "conflictsWithIds", null);
        setByteField(term524391, term524391.getClass(), "traitPoints", (byte) -9);
        Object term524393 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term524393, term524393.getClass(), "traitId", null);
        setField(term524393, term524393.getClass(), "traitName", null);
        setField(term524393, term524393.getClass(), "description", null);
        setField(term524393, term524393.getClass(), "group", null);
        setField(term524393, term524393.getClass(), "conflictsWithIds", null);
        setByteField(term524393, term524393.getClass(), "traitPoints", (byte) -43);
        Object term524395 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term524395, term524395.getClass(), "traitId", null);
        setField(term524395, term524395.getClass(), "traitName", null);
        setField(term524395, term524395.getClass(), "description", null);
        setField(term524395, term524395.getClass(), "group", null);
        setField(term524395, term524395.getClass(), "conflictsWithIds", null);
        setByteField(term524395, term524395.getClass(), "traitPoints", (byte) -55);
        ArrayList term524389 = new ArrayList();
        ((ArrayList) term524389).add(term524391);
        ((ArrayList) term524389).add(term524393);
        ((ArrayList) term524389).add(term524395);
        Class<? extends Object> term526293 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term526292 = ((Class) term526293).getDeclaredField((String) "BIG_PLANT");
        ((Field) term526292).setAccessible(true);
        Object enum1670 = ((Field) term526292).get((Object) null);
        Class<? extends Object> term526597 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term526596 = ((Class) term526597).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term526596).setAccessible(true);
        Object enum1671 = ((Field) term526596).get((Object) null);
        term524167 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term524210 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term524350 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term524167, term524167.getClass(), "index", -1976301777);
        setField(term524167, term524167.getClass(), "name", "CIWbgYSuZU");
        setIntField(term524167, term524167.getClass(), "maxSlot", -463965331);
        setIntField(term524167, term524167.getClass(), "slotHull", 769940367);
        setField(term524167, term524167.getClass(), "hullType", enum1663);
        setField(term524167, term524167.getClass(), "size", enum1664);
        setIntField(term524167, term524167.getClass(), "cost", 1030297962);
        setIntField(term524167, term524167.getClass(), "metalCost", -925377527);
        setIntField(term524167, term524167.getClass(), "imageIndex", 1946040384);
        setDoubleField(term524167, term524167.getClass(), "fleetCapacity", 0.28838369056651414);
        setField(term524210, term524210.getClass(), "id", "ZBwsjdwfcZ");
        setField(term524210, term524210.getClass(), "name", "FqIUPZQKtw");
        setField(term524210, term524210.getClass(), "nameSingle", "QEzXCFJyaD");
        setField(term524210, term524210.getClass(), "attitude", enum1665);
        setField(term524210, term524210.getClass(), "imagePath", "MMfSSDzqaq");
        setField(term524210, term524210.getClass(), "bridgeId", "kwiZbXSGpI");
        setField(term524210, term524210.getClass(), "spaceShipId", "aFAywDDNnc");
        setField(term524210, term524210.getClass(), "socialSystem", enum1666);
        setField(term524210, term524210.getClass(), "genderList", term524311);
        setField(term524210, term524210.getClass(), "speechSetId", "boAPrSbTkG");
        setField(term524210, term524210.getClass(), "bridgeEffect", enum1669);
        setField(term524350, term524350.getClass(), "songName", "CHKiyIGmzv");
        setField(term524350, term524350.getClass(), "author", "erbOqSnPtH");
        setField(term524350, term524350.getClass(), "fileName", "bUrfDTGdWW");
        setBooleanField(term524350, term524350.getClass(), "custom", false);
        setIntField(term524350, term524350.getClass(), "fadingLimit", -870849674);
        setField(term524210, term524210.getClass(), "diplomacyMusic", term524350);
        setField(term524210, term524210.getClass(), "traits", term524389);
        setField(term524210, term524210.getClass(), "leaderNameGenerator", enum1670);
        setField(term524210, term524210.getClass(), "description", "HRkpPEsKVp");
        setField(term524210, term524210.getClass(), "spaceRaceType", enum1671);
        setField(term524167, term524167.getClass(), "originalBuilder", term524210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetCapacity", argTypes, term524167, args);
    }

};


