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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class ShipStat_getNumberOfVictories_17339478455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191855;

    public ShipStat_getNumberOfVictories_17339478455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191955 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term191954 = ((Class) term191955).getDeclaredField((String) "PRIVATEER");
        ((Field) term191954).setAccessible(true);
        Object enum616 = ((Field) term191954).get((Object) null);
        Class<? extends Object> term192214 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term192213 = ((Class) term192214).getDeclaredField((String) "LARGE");
        ((Field) term192213).setAccessible(true);
        Object enum617 = ((Field) term192213).get((Object) null);
        Class<? extends Object> term192441 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term192440 = ((Class) term192441).getDeclaredField((String) "PEACEFUL");
        ((Field) term192440).setAccessible(true);
        Object enum618 = ((Field) term192440).get((Object) null);
        Class<? extends Object> term192702 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term192701 = ((Class) term192702).getDeclaredField((String) "MATRIARCHY");
        ((Field) term192701).setAccessible(true);
        Object enum619 = ((Field) term192701).get((Object) null);
        ArrayList term191906 = new ArrayList();
        ((ArrayList) term191906).add((Object)null);
        ((ArrayList) term191906).add((Object)null);
        ((ArrayList) term191906).add((Object)null);
        ((ArrayList) term191906).add((Object)null);
        ((ArrayList) term191906).add((Object)null);
        Class<? extends Object> term192964 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term192963 = ((Class) term192964).getDeclaredField((String) "FADE_IN");
        ((Field) term192963).setAccessible(true);
        Object enum620 = ((Field) term192963).get((Object) null);
        ArrayList term191915 = new ArrayList();
        ((ArrayList) term191915).add((Object)null);
        ((ArrayList) term191915).add((Object)null);
        ((ArrayList) term191915).add((Object)null);
        ((ArrayList) term191915).add((Object)null);
        ((ArrayList) term191915).add((Object)null);
        ((ArrayList) term191915).add((Object)null);
        ((ArrayList) term191915).add((Object)null);
        Class<? extends Object> term193222 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term193221 = ((Class) term193222).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term193221).setAccessible(true);
        Object enum621 = ((Field) term193221).get((Object) null);
        Class<? extends Object> term193531 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term193530 = ((Class) term193531).getDeclaredField((String) "REGULAR");
        ((Field) term193530).setAccessible(true);
        Object enum622 = ((Field) term193530).get((Object) null);
        ArrayList term191923 = new ArrayList();
        term191855 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term191856 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term191869 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term191895 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term191912 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term191856, term191856.getClass(), "name", "FnjEwOlAkC");
        setIntField(term191869, term191869.getClass(), "index", -1231417445);
        setField(term191869, term191869.getClass(), "name", "ZsGqLnRMml");
        setIntField(term191869, term191869.getClass(), "maxSlot", -1305887225);
        setIntField(term191869, term191869.getClass(), "slotHull", 1861751365);
        setField(term191869, term191869.getClass(), "hullType", enum616);
        setField(term191869, term191869.getClass(), "size", enum617);
        setIntField(term191869, term191869.getClass(), "cost", 1137036889);
        setIntField(term191869, term191869.getClass(), "metalCost", 1607912632);
        setIntField(term191869, term191869.getClass(), "imageIndex", -2089396254);
        setDoubleField(term191869, term191869.getClass(), "fleetCapacity", 0.8454723071922143);
        setField(term191895, term191895.getClass(), "id", "");
        setField(term191895, term191895.getClass(), "name", "");
        setField(term191895, term191895.getClass(), "nameSingle", "");
        setField(term191895, term191895.getClass(), "attitude", enum618);
        setField(term191895, term191895.getClass(), "imagePath", "");
        setField(term191895, term191895.getClass(), "bridgeId", "");
        setField(term191895, term191895.getClass(), "spaceShipId", "");
        setField(term191895, term191895.getClass(), "socialSystem", enum619);
        setField(term191895, term191895.getClass(), "genderList", term191906);
        setField(term191895, term191895.getClass(), "speechSetId", "");
        setField(term191895, term191895.getClass(), "bridgeEffect", enum620);
        setField(term191912, term191912.getClass(), "songName", null);
        setField(term191912, term191912.getClass(), "author", null);
        setField(term191912, term191912.getClass(), "fileName", null);
        setBooleanField(term191912, term191912.getClass(), "custom", false);
        setIntField(term191912, term191912.getClass(), "fadingLimit", 609444561);
        setField(term191895, term191895.getClass(), "diplomacyMusic", term191912);
        setField(term191895, term191895.getClass(), "traits", term191915);
        setField(term191895, term191895.getClass(), "leaderNameGenerator", enum621);
        setField(term191895, term191895.getClass(), "description", "");
        setField(term191895, term191895.getClass(), "spaceRaceType", enum622);
        setField(term191869, term191869.getClass(), "originalBuilder", term191895);
        setField(term191856, term191856.getClass(), "hull", term191869);
        setField(term191856, term191856.getClass(), "components", term191923);
        setField(term191855, term191855.getClass(), "design", term191856);
        setIntField(term191855, term191855.getClass(), "numberOfCombats", 2102660964);
        setIntField(term191855, term191855.getClass(), "numberOfVictories", 131358254);
        setIntField(term191855, term191855.getClass(), "numberOfLoses", -1411314076);
        setIntField(term191855, term191855.getClass(), "numberOfKills", -1465382016);
        setIntField(term191855, term191855.getClass(), "numberOfBuilt", 2111238518);
        setIntField(term191855, term191855.getClass(), "numberOfInUse", -477500403);
        setBooleanField(term191855, term191855.getClass(), "obsolete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfVictories", argTypes, term191855, args);
    }

};


