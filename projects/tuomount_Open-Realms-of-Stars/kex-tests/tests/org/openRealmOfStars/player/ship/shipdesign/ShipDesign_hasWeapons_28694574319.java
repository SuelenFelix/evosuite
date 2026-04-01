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

public class ShipDesign_hasWeapons_28694574319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69722;

    public ShipDesign_hasWeapons_28694574319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69928 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term69927 = ((Class) term69928).getDeclaredField((String) "FREIGHTER");
        ((Field) term69927).setAccessible(true);
        Object enum220 = ((Field) term69927).get((Object) null);
        Class<? extends Object> term70187 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term70186 = ((Class) term70187).getDeclaredField((String) "LARGE");
        ((Field) term70186).setAccessible(true);
        Object enum221 = ((Field) term70186).get((Object) null);
        Class<? extends Object> term70444 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term70443 = ((Class) term70444).getDeclaredField((String) "LOGICAL");
        ((Field) term70443).setAccessible(true);
        Object enum222 = ((Field) term70443).get((Object) null);
        Class<? extends Object> term70732 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term70731 = ((Class) term70732).getDeclaredField((String) "EQUAL");
        ((Field) term70731).setAccessible(true);
        Object enum223 = ((Field) term70731).get((Object) null);
        ArrayList term69856 = new ArrayList();
        ((ArrayList) term69856).add((Object)null);
        Class<? extends Object> term70989 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term70988 = ((Class) term70989).getDeclaredField((String) "EXIT");
        ((Field) term70988).setAccessible(true);
        Object enum224 = ((Field) term70988).get((Object) null);
        ArrayList term69881 = new ArrayList();
        ((ArrayList) term69881).add((Object)null);
        ((ArrayList) term69881).add((Object)null);
        ((ArrayList) term69881).add((Object)null);
        ((ArrayList) term69881).add((Object)null);
        ((ArrayList) term69881).add((Object)null);
        ((ArrayList) term69881).add((Object)null);
        ((ArrayList) term69881).add((Object)null);
        Class<? extends Object> term71238 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term71237 = ((Class) term71238).getDeclaredField((String) "DEEP_CREATURE");
        ((Field) term71237).setAccessible(true);
        Object enum225 = ((Field) term71237).get((Object) null);
        Class<? extends Object> term71554 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term71553 = ((Class) term71554).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term71553).setAccessible(true);
        Object enum226 = ((Field) term71553).get((Object) null);
        ArrayList term69903 = new ArrayList();
        term69722 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term69735 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term69777 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term69875 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term69722, term69722.getClass(), "name", "raNzcEorkV");
        setIntField(term69735, term69735.getClass(), "index", 37757400);
        setField(term69735, term69735.getClass(), "name", "nEgozCeoUr");
        setIntField(term69735, term69735.getClass(), "maxSlot", -1632221612);
        setIntField(term69735, term69735.getClass(), "slotHull", 1545314376);
        setField(term69735, term69735.getClass(), "hullType", enum220);
        setField(term69735, term69735.getClass(), "size", enum221);
        setIntField(term69735, term69735.getClass(), "cost", 437959151);
        setIntField(term69735, term69735.getClass(), "metalCost", 27780241);
        setIntField(term69735, term69735.getClass(), "imageIndex", -683868408);
        setDoubleField(term69735, term69735.getClass(), "fleetCapacity", 0.7332741045694002);
        setField(term69777, term69777.getClass(), "id", "EWGMzlcOnW");
        setField(term69777, term69777.getClass(), "name", "XeSDJYKMBf");
        setField(term69777, term69777.getClass(), "nameSingle", "tIsFcOGTUX");
        setField(term69777, term69777.getClass(), "attitude", enum222);
        setField(term69777, term69777.getClass(), "imagePath", "XUVRcnELFP");
        setField(term69777, term69777.getClass(), "bridgeId", "xIeSbezmkD");
        setField(term69777, term69777.getClass(), "spaceShipId", "txUWLZRkSv");
        setField(term69777, term69777.getClass(), "socialSystem", enum223);
        setField(term69777, term69777.getClass(), "genderList", term69856);
        setField(term69777, term69777.getClass(), "speechSetId", "gHRMJRsBGm");
        setField(term69777, term69777.getClass(), "bridgeEffect", enum224);
        setField(term69875, term69875.getClass(), "songName", "");
        setField(term69875, term69875.getClass(), "author", "");
        setField(term69875, term69875.getClass(), "fileName", "");
        setBooleanField(term69875, term69875.getClass(), "custom", true);
        setIntField(term69875, term69875.getClass(), "fadingLimit", -381130069);
        setField(term69777, term69777.getClass(), "diplomacyMusic", term69875);
        setField(term69777, term69777.getClass(), "traits", term69881);
        setField(term69777, term69777.getClass(), "leaderNameGenerator", enum225);
        setField(term69777, term69777.getClass(), "description", "UTvXIenLCR");
        setField(term69777, term69777.getClass(), "spaceRaceType", enum226);
        setField(term69735, term69735.getClass(), "originalBuilder", term69777);
        setField(term69722, term69722.getClass(), "hull", term69735);
        setField(term69722, term69722.getClass(), "components", term69903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasWeapons", argTypes, term69722, args);
    }

};


