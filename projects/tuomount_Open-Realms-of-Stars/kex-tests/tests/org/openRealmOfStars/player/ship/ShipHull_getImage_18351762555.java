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

public class ShipHull_getImage_18351762555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494671;

    public ShipHull_getImage_18351762555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term494938 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term494937 = ((Class) term494938).getDeclaredField((String) "NORMAL");
        ((Field) term494937).setAccessible(true);
        Object enum1564 = ((Field) term494937).get((Object) null);
        Class<? extends Object> term495188 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term495187 = ((Class) term495188).getDeclaredField((String) "LARGE");
        ((Field) term495187).setAccessible(true);
        Object enum1565 = ((Field) term495187).get((Object) null);
        Class<? extends Object> term495445 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term495444 = ((Class) term495445).getDeclaredField((String) "MILITARISTIC");
        ((Field) term495444).setAccessible(true);
        Object enum1566 = ((Field) term495444).get((Object) null);
        Class<? extends Object> term495748 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term495747 = ((Class) term495748).getDeclaredField((String) "EQUAL");
        ((Field) term495747).setAccessible(true);
        Object enum1567 = ((Field) term495747).get((Object) null);
        ArrayList term494808 = new ArrayList();
        Class<? extends Object> term496005 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term496004 = ((Class) term496005).getDeclaredField((String) "GREEN_CONSOLE");
        ((Field) term496004).setAccessible(true);
        Object enum1568 = ((Field) term496004).get((Object) null);
        Object term494882 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term494882, term494882.getClass(), "traitId", null);
        setField(term494882, term494882.getClass(), "traitName", null);
        setField(term494882, term494882.getClass(), "description", null);
        setField(term494882, term494882.getClass(), "group", null);
        setField(term494882, term494882.getClass(), "conflictsWithIds", null);
        setByteField(term494882, term494882.getClass(), "traitPoints", (byte) -126);
        Object term494884 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term494884, term494884.getClass(), "traitId", null);
        setField(term494884, term494884.getClass(), "traitName", null);
        setField(term494884, term494884.getClass(), "description", null);
        setField(term494884, term494884.getClass(), "group", null);
        setField(term494884, term494884.getClass(), "conflictsWithIds", null);
        setByteField(term494884, term494884.getClass(), "traitPoints", (byte) -71);
        ArrayList term494880 = new ArrayList();
        ((ArrayList) term494880).add(term494882);
        ((ArrayList) term494880).add(term494884);
        Class<? extends Object> term496311 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term496310 = ((Class) term496311).getDeclaredField((String) "PIRATE");
        ((Field) term496310).setAccessible(true);
        Object enum1569 = ((Field) term496310).get((Object) null);
        Class<? extends Object> term496606 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term496605 = ((Class) term496606).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term496605).setAccessible(true);
        Object enum1570 = ((Field) term496605).get((Object) null);
        term494671 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term494710 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term494841 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term494671, term494671.getClass(), "index", -1361865906);
        setField(term494671, term494671.getClass(), "name", "uatyJVVkuh");
        setIntField(term494671, term494671.getClass(), "maxSlot", -1811613830);
        setIntField(term494671, term494671.getClass(), "slotHull", -962036081);
        setField(term494671, term494671.getClass(), "hullType", enum1564);
        setField(term494671, term494671.getClass(), "size", enum1565);
        setIntField(term494671, term494671.getClass(), "cost", -251705138);
        setIntField(term494671, term494671.getClass(), "metalCost", 1341608295);
        setIntField(term494671, term494671.getClass(), "imageIndex", -271438483);
        setDoubleField(term494671, term494671.getClass(), "fleetCapacity", 0.9188322321077216);
        setField(term494710, term494710.getClass(), "id", "TJamUXzKwL");
        setField(term494710, term494710.getClass(), "name", "NefUeTpLNQ");
        setField(term494710, term494710.getClass(), "nameSingle", "fkoYwHvULG");
        setField(term494710, term494710.getClass(), "attitude", enum1566);
        setField(term494710, term494710.getClass(), "imagePath", "hCGkeVUnyl");
        setField(term494710, term494710.getClass(), "bridgeId", "cXGPSCFmzx");
        setField(term494710, term494710.getClass(), "spaceShipId", "StllJtCsUw");
        setField(term494710, term494710.getClass(), "socialSystem", enum1567);
        setField(term494710, term494710.getClass(), "genderList", term494808);
        setField(term494710, term494710.getClass(), "speechSetId", "vWQQZntGOv");
        setField(term494710, term494710.getClass(), "bridgeEffect", enum1568);
        setField(term494841, term494841.getClass(), "songName", "yxlVzXBuqU");
        setField(term494841, term494841.getClass(), "author", "QmESxVdSXD");
        setField(term494841, term494841.getClass(), "fileName", "mwdzLXoSCo");
        setBooleanField(term494841, term494841.getClass(), "custom", true);
        setIntField(term494841, term494841.getClass(), "fadingLimit", -1421718976);
        setField(term494710, term494710.getClass(), "diplomacyMusic", term494841);
        setField(term494710, term494710.getClass(), "traits", term494880);
        setField(term494710, term494710.getClass(), "leaderNameGenerator", enum1569);
        setField(term494710, term494710.getClass(), "description", "nAOmberuac");
        setField(term494710, term494710.getClass(), "spaceRaceType", enum1570);
        setField(term494671, term494671.getClass(), "originalBuilder", term494710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term494671, args);
    }

};


