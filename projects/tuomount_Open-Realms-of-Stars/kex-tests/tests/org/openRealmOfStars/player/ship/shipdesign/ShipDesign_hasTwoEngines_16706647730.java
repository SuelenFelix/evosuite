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

public class ShipDesign_hasTwoEngines_16706647730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107813;

    public ShipDesign_hasTwoEngines_16706647730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108043 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term108042 = ((Class) term108043).getDeclaredField((String) "ORBITAL");
        ((Field) term108042).setAccessible(true);
        Object enum343 = ((Field) term108042).get((Object) null);
        Class<? extends Object> term108296 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term108295 = ((Class) term108296).getDeclaredField((String) "SMALL");
        ((Field) term108295).setAccessible(true);
        Object enum344 = ((Field) term108295).get((Object) null);
        Class<? extends Object> term108553 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term108552 = ((Class) term108553).getDeclaredField((String) "BACKSTABBING");
        ((Field) term108552).setAccessible(true);
        Object enum345 = ((Field) term108552).get((Object) null);
        Class<? extends Object> term108856 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term108855 = ((Class) term108856).getDeclaredField((String) "EQUAL");
        ((Field) term108855).setAccessible(true);
        Object enum346 = ((Field) term108855).get((Object) null);
        ArrayList term107945 = new ArrayList();
        ((ArrayList) term107945).add((Object)null);
        ((ArrayList) term107945).add((Object)null);
        ((ArrayList) term107945).add((Object)null);
        Class<? extends Object> term109113 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term109112 = ((Class) term109113).getDeclaredField((String) "FLOAT_IN_SPACE");
        ((Field) term109112).setAccessible(true);
        Object enum347 = ((Field) term109112).get((Object) null);
        ArrayList term107970 = new ArrayList();
        ((ArrayList) term107970).add((Object)null);
        ((ArrayList) term107970).add((Object)null);
        ((ArrayList) term107970).add((Object)null);
        ((ArrayList) term107970).add((Object)null);
        ((ArrayList) term107970).add((Object)null);
        ((ArrayList) term107970).add((Object)null);
        ((ArrayList) term107970).add((Object)null);
        ((ArrayList) term107970).add((Object)null);
        ((ArrayList) term107970).add((Object)null);
        Class<? extends Object> term109392 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term109391 = ((Class) term109392).getDeclaredField((String) "PIRATE");
        ((Field) term109391).setAccessible(true);
        Object enum348 = ((Field) term109391).get((Object) null);
        Class<? extends Object> term109687 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term109686 = ((Class) term109687).getDeclaredField((String) "REGULAR");
        ((Field) term109686).setAccessible(true);
        Object enum349 = ((Field) term109686).get((Object) null);
        Class<? extends Object> term109945 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term109944 = ((Class) term109945).getDeclaredField((String) "CLOAKING_DEVICE");
        ((Field) term109944).setAccessible(true);
        Object enum350 = ((Field) term109944).get((Object) null);
        Object term107994 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term107994, term107994.getClass(), "index", -2019439660);
        setField(term107994, term107994.getClass(), "type", enum350);
        setIntField(term107994, term107994.getClass(), "cost", 1037621714);
        setIntField(term107994, term107994.getClass(), "metalCost", 1072685856);
        setField(term107994, term107994.getClass(), "name", "");
        setIntField(term107994, term107994.getClass(), "energyRequirement", 1560132742);
        setIntField(term107994, term107994.getClass(), "energyResource", -1289646730);
        setIntField(term107994, term107994.getClass(), "ftlSpeed", 983651082);
        setIntField(term107994, term107994.getClass(), "speed", 794411004);
        setIntField(term107994, term107994.getClass(), "tacticSpeed", 1964107266);
        setIntField(term107994, term107994.getClass(), "scannerRange", -256542569);
        setIntField(term107994, term107994.getClass(), "cloakDetection", -1936597357);
        setIntField(term107994, term107994.getClass(), "cloaking", -179816637);
        setIntField(term107994, term107994.getClass(), "defenseValue", -1304594615);
        setIntField(term107994, term107994.getClass(), "baySize", 1384334359);
        setIntField(term107994, term107994.getClass(), "damage", -552245510);
        setIntField(term107994, term107994.getClass(), "weaponRange", 1590263959);
        setIntField(term107994, term107994.getClass(), "initiativeBoost", -203971814);
        setIntField(term107994, term107994.getClass(), "cultureBonus", -786856127);
        setIntField(term107994, term107994.getClass(), "creditBonus", 891987554);
        setIntField(term107994, term107994.getClass(), "researchBonus", 407640701);
        setIntField(term107994, term107994.getClass(), "espionageBonus", -55858757);
        setIntField(term107994, term107994.getClass(), "fleetCapacityBonus", 1101065297);
        setIntField(term107994, term107994.getClass(), "hitBonus", -110542660);
        ArrayList term107992 = new ArrayList();
        ((ArrayList) term107992).add(term107994);
        term107813 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term107826 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term107866 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term107964 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term107813, term107813.getClass(), "name", "UsCZaSgXzI");
        setIntField(term107826, term107826.getClass(), "index", -13561953);
        setField(term107826, term107826.getClass(), "name", "IXZCeVwvBM");
        setIntField(term107826, term107826.getClass(), "maxSlot", 2069622671);
        setIntField(term107826, term107826.getClass(), "slotHull", 86341231);
        setField(term107826, term107826.getClass(), "hullType", enum343);
        setField(term107826, term107826.getClass(), "size", enum344);
        setIntField(term107826, term107826.getClass(), "cost", -926119173);
        setIntField(term107826, term107826.getClass(), "metalCost", 1613936898);
        setIntField(term107826, term107826.getClass(), "imageIndex", -406599151);
        setDoubleField(term107826, term107826.getClass(), "fleetCapacity", 0.37161417339133307);
        setField(term107866, term107866.getClass(), "id", "ElTdyUVQYi");
        setField(term107866, term107866.getClass(), "name", "KkgJnxXxVl");
        setField(term107866, term107866.getClass(), "nameSingle", "TGnzPlGFMb");
        setField(term107866, term107866.getClass(), "attitude", enum345);
        setField(term107866, term107866.getClass(), "imagePath", "yEvLMSpdHy");
        setField(term107866, term107866.getClass(), "bridgeId", "qdErlZeTVv");
        setField(term107866, term107866.getClass(), "spaceShipId", "OCCDQbndDE");
        setField(term107866, term107866.getClass(), "socialSystem", enum346);
        setField(term107866, term107866.getClass(), "genderList", term107945);
        setField(term107866, term107866.getClass(), "speechSetId", "NMANMKfctU");
        setField(term107866, term107866.getClass(), "bridgeEffect", enum347);
        setField(term107964, term107964.getClass(), "songName", "");
        setField(term107964, term107964.getClass(), "author", "");
        setField(term107964, term107964.getClass(), "fileName", "");
        setBooleanField(term107964, term107964.getClass(), "custom", true);
        setIntField(term107964, term107964.getClass(), "fadingLimit", -1421272179);
        setField(term107866, term107866.getClass(), "diplomacyMusic", term107964);
        setField(term107866, term107866.getClass(), "traits", term107970);
        setField(term107866, term107866.getClass(), "leaderNameGenerator", enum348);
        setField(term107866, term107866.getClass(), "description", "ofSfQtWBjp");
        setField(term107866, term107866.getClass(), "spaceRaceType", enum349);
        setField(term107826, term107826.getClass(), "originalBuilder", term107866);
        setField(term107813, term107813.getClass(), "hull", term107826);
        setField(term107813, term107813.getClass(), "components", term107992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTwoEngines", argTypes, term107813, args);
    }

};


