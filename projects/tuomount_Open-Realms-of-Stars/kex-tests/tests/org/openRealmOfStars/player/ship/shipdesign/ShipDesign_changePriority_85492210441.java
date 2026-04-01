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
import java.lang.Integer;
import java.lang.Boolean;

public class ShipDesign_changePriority_85492210441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146323;
     Object term146506;
     Object term146508;

    public ShipDesign_changePriority_85492210441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146531 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term146530 = ((Class) term146531).getDeclaredField((String) "ORBITAL");
        ((Field) term146530).setAccessible(true);
        Object enum467 = ((Field) term146530).get((Object) null);
        Class<? extends Object> term146784 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term146783 = ((Class) term146784).getDeclaredField((String) "SMALL");
        ((Field) term146783).setAccessible(true);
        Object enum468 = ((Field) term146783).get((Object) null);
        Class<? extends Object> term147041 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term147040 = ((Class) term147041).getDeclaredField((String) "MILITARISTIC");
        ((Field) term147040).setAccessible(true);
        Object enum469 = ((Field) term147040).get((Object) null);
        Class<? extends Object> term147344 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term147343 = ((Class) term147344).getDeclaredField((String) "PATRIARCHY");
        ((Field) term147343).setAccessible(true);
        Object enum470 = ((Field) term147343).get((Object) null);
        ArrayList term146455 = new ArrayList();
        ((ArrayList) term146455).add((Object)null);
        ((ArrayList) term146455).add((Object)null);
        ((ArrayList) term146455).add((Object)null);
        ((ArrayList) term146455).add((Object)null);
        ((ArrayList) term146455).add((Object)null);
        ((ArrayList) term146455).add((Object)null);
        Class<? extends Object> term147616 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term147615 = ((Class) term147616).getDeclaredField((String) "ORANGE_BLINK");
        ((Field) term147615).setAccessible(true);
        Object enum471 = ((Field) term147615).get((Object) null);
        ArrayList term146480 = new ArrayList();
        ((ArrayList) term146480).add((Object)null);
        ((ArrayList) term146480).add((Object)null);
        ((ArrayList) term146480).add((Object)null);
        ((ArrayList) term146480).add((Object)null);
        ((ArrayList) term146480).add((Object)null);
        ((ArrayList) term146480).add((Object)null);
        ((ArrayList) term146480).add((Object)null);
        ((ArrayList) term146480).add((Object)null);
        Class<? extends Object> term147889 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term147888 = ((Class) term147889).getDeclaredField((String) "BIG_PLANT");
        ((Field) term147888).setAccessible(true);
        Object enum472 = ((Field) term147888).get((Object) null);
        Class<? extends Object> term148193 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term148192 = ((Class) term148193).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term148192).setAccessible(true);
        Object enum473 = ((Field) term148192).get((Object) null);
        ArrayList term146502 = new ArrayList();
        term146323 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term146336 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term146376 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term146474 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term146323, term146323.getClass(), "name", "ltTwdndtbe");
        setIntField(term146336, term146336.getClass(), "index", -676216760);
        setField(term146336, term146336.getClass(), "name", "XaldiIeyMi");
        setIntField(term146336, term146336.getClass(), "maxSlot", 1859109121);
        setIntField(term146336, term146336.getClass(), "slotHull", 1727853532);
        setField(term146336, term146336.getClass(), "hullType", enum467);
        setField(term146336, term146336.getClass(), "size", enum468);
        setIntField(term146336, term146336.getClass(), "cost", -54706718);
        setIntField(term146336, term146336.getClass(), "metalCost", 461863345);
        setIntField(term146336, term146336.getClass(), "imageIndex", 733174414);
        setDoubleField(term146336, term146336.getClass(), "fleetCapacity", 0.8878841294187743);
        setField(term146376, term146376.getClass(), "id", "lkujDCFpdm");
        setField(term146376, term146376.getClass(), "name", "sGfzmhpQEH");
        setField(term146376, term146376.getClass(), "nameSingle", "FqGkFGXAbg");
        setField(term146376, term146376.getClass(), "attitude", enum469);
        setField(term146376, term146376.getClass(), "imagePath", "SSWEZgFiFO");
        setField(term146376, term146376.getClass(), "bridgeId", "spphrCslQA");
        setField(term146376, term146376.getClass(), "spaceShipId", "EPkEFVlZrY");
        setField(term146376, term146376.getClass(), "socialSystem", enum470);
        setField(term146376, term146376.getClass(), "genderList", term146455);
        setField(term146376, term146376.getClass(), "speechSetId", "jySnpYEVPv");
        setField(term146376, term146376.getClass(), "bridgeEffect", enum471);
        setField(term146474, term146474.getClass(), "songName", "");
        setField(term146474, term146474.getClass(), "author", "");
        setField(term146474, term146474.getClass(), "fileName", "");
        setBooleanField(term146474, term146474.getClass(), "custom", true);
        setIntField(term146474, term146474.getClass(), "fadingLimit", -1055100686);
        setField(term146376, term146376.getClass(), "diplomacyMusic", term146474);
        setField(term146376, term146376.getClass(), "traits", term146480);
        setField(term146376, term146376.getClass(), "leaderNameGenerator", enum472);
        setField(term146376, term146376.getClass(), "description", "KDKQhbiclt");
        setField(term146376, term146376.getClass(), "spaceRaceType", enum473);
        setField(term146336, term146336.getClass(), "originalBuilder", term146376);
        setField(term146323, term146323.getClass(), "hull", term146336);
        setField(term146323, term146323.getClass(), "components", term146502);
        term146506 = new Integer(1994661826);
        term146508 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term146506;
        args[1] = term146508;
        callMethod(klass, "changePriority", argTypes, term146323, args);
    }

};


