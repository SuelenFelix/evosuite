package org.openRealmOfStars.player.ship.shipdesign;

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
import static org.openRealmOfStars.player.ship.shipdesign.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class ShipDesign_isTrooperShip_27003541925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88226;

    public ShipDesign_isTrooperShip_27003541925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88429 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term88428 = ((Class) term88429).getDeclaredField((String) "NORMAL");
        ((Field) term88428).setAccessible(true);
        Object enum280 = ((Field) term88428).get((Object) null);
        Class<? extends Object> term88679 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term88678 = ((Class) term88679).getDeclaredField((String) "LARGE");
        ((Field) term88678).setAccessible(true);
        Object enum281 = ((Field) term88678).get((Object) null);
        Class<? extends Object> term88936 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term88935 = ((Class) term88936).getDeclaredField((String) "PEACEFUL");
        ((Field) term88935).setAccessible(true);
        Object enum282 = ((Field) term88935).get((Object) null);
        Class<? extends Object> term89227 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term89226 = ((Class) term89227).getDeclaredField((String) "PATRIARCHY");
        ((Field) term89226).setAccessible(true);
        Object enum283 = ((Field) term89226).get((Object) null);
        ArrayList term88357 = new ArrayList();
        ((ArrayList) term88357).add((Object)null);
        ((ArrayList) term88357).add((Object)null);
        ((ArrayList) term88357).add((Object)null);
        ((ArrayList) term88357).add((Object)null);
        ((ArrayList) term88357).add((Object)null);
        ((ArrayList) term88357).add((Object)null);
        Class<? extends Object> term89499 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term89498 = ((Class) term89499).getDeclaredField((String) "ORANGE_BLINK");
        ((Field) term89498).setAccessible(true);
        Object enum284 = ((Field) term89498).get((Object) null);
        ArrayList term88382 = new ArrayList();
        Class<? extends Object> term89772 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term89771 = ((Class) term89772).getDeclaredField((String) "PIRATE");
        ((Field) term89771).setAccessible(true);
        Object enum285 = ((Field) term89771).get((Object) null);
        Class<? extends Object> term90067 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term90066 = ((Class) term90067).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term90066).setAccessible(true);
        Object enum286 = ((Field) term90066).get((Object) null);
        ArrayList term88404 = new ArrayList();
        term88226 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term88239 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term88278 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term88376 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term88226, term88226.getClass(), "name", "unvQfYuBUz");
        setIntField(term88239, term88239.getClass(), "index", 1764150991);
        setField(term88239, term88239.getClass(), "name", "RqnYUpQBbG");
        setIntField(term88239, term88239.getClass(), "maxSlot", 944653455);
        setIntField(term88239, term88239.getClass(), "slotHull", -1819474400);
        setField(term88239, term88239.getClass(), "hullType", enum280);
        setField(term88239, term88239.getClass(), "size", enum281);
        setIntField(term88239, term88239.getClass(), "cost", 783684648);
        setIntField(term88239, term88239.getClass(), "metalCost", 553754005);
        setIntField(term88239, term88239.getClass(), "imageIndex", 1986699236);
        setDoubleField(term88239, term88239.getClass(), "fleetCapacity", 0.3800088629986428);
        setField(term88278, term88278.getClass(), "id", "sKnuhmcjCC");
        setField(term88278, term88278.getClass(), "name", "oCBbVNwMnb");
        setField(term88278, term88278.getClass(), "nameSingle", "miJxAzOVJy");
        setField(term88278, term88278.getClass(), "attitude", enum282);
        setField(term88278, term88278.getClass(), "imagePath", "kjqlBVaviD");
        setField(term88278, term88278.getClass(), "bridgeId", "iVRXRDCrcM");
        setField(term88278, term88278.getClass(), "spaceShipId", "WAZFhrxcSM");
        setField(term88278, term88278.getClass(), "socialSystem", enum283);
        setField(term88278, term88278.getClass(), "genderList", term88357);
        setField(term88278, term88278.getClass(), "speechSetId", "gCRUlTuVMX");
        setField(term88278, term88278.getClass(), "bridgeEffect", enum284);
        setField(term88376, term88376.getClass(), "songName", "");
        setField(term88376, term88376.getClass(), "author", "");
        setField(term88376, term88376.getClass(), "fileName", "");
        setBooleanField(term88376, term88376.getClass(), "custom", false);
        setIntField(term88376, term88376.getClass(), "fadingLimit", -1729178560);
        setField(term88278, term88278.getClass(), "diplomacyMusic", term88376);
        setField(term88278, term88278.getClass(), "traits", term88382);
        setField(term88278, term88278.getClass(), "leaderNameGenerator", enum285);
        setField(term88278, term88278.getClass(), "description", "IWNJVfvTuw");
        setField(term88278, term88278.getClass(), "spaceRaceType", enum286);
        setField(term88239, term88239.getClass(), "originalBuilder", term88278);
        setField(term88226, term88226.getClass(), "hull", term88239);
        setField(term88226, term88226.getClass(), "components", term88404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTrooperShip", argTypes, term88226, args);
    }

};


