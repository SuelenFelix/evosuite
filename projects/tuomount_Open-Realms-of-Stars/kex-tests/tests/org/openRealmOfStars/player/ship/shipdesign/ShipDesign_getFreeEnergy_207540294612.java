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

public class ShipDesign_getFreeEnergy_207540294612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43772;

    public ShipDesign_getFreeEnergy_207540294612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43979 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term43978 = ((Class) term43979).getDeclaredField((String) "FREIGHTER");
        ((Field) term43978).setAccessible(true);
        Object enum137 = ((Field) term43978).get((Object) null);
        Class<? extends Object> term44238 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term44237 = ((Class) term44238).getDeclaredField((String) "MEDIUM");
        ((Field) term44237).setAccessible(true);
        Object enum138 = ((Field) term44237).get((Object) null);
        Class<? extends Object> term44498 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term44497 = ((Class) term44498).getDeclaredField((String) "LOGICAL");
        ((Field) term44497).setAccessible(true);
        Object enum139 = ((Field) term44497).get((Object) null);
        Class<? extends Object> term44786 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term44785 = ((Class) term44786).getDeclaredField((String) "PATRIARCHY");
        ((Field) term44785).setAccessible(true);
        Object enum140 = ((Field) term44785).get((Object) null);
        ArrayList term43907 = new ArrayList();
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        ((ArrayList) term43907).add((Object)null);
        Class<? extends Object> term45058 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term45057 = ((Class) term45058).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term45057).setAccessible(true);
        Object enum141 = ((Field) term45057).get((Object) null);
        ArrayList term43932 = new ArrayList();
        ((ArrayList) term43932).add((Object)null);
        ((ArrayList) term43932).add((Object)null);
        ((ArrayList) term43932).add((Object)null);
        ((ArrayList) term43932).add((Object)null);
        ((ArrayList) term43932).add((Object)null);
        ((ArrayList) term43932).add((Object)null);
        ((ArrayList) term43932).add((Object)null);
        Class<? extends Object> term45328 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term45327 = ((Class) term45328).getDeclaredField((String) "SPACE_ORC");
        ((Field) term45327).setAccessible(true);
        Object enum142 = ((Field) term45327).get((Object) null);
        Class<? extends Object> term45632 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term45631 = ((Class) term45632).getDeclaredField((String) "REGULAR");
        ((Field) term45631).setAccessible(true);
        Object enum143 = ((Field) term45631).get((Object) null);
        ArrayList term43954 = new ArrayList();
        term43772 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term43785 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term43828 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term43926 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term43772, term43772.getClass(), "name", "GTmoNrziyc");
        setIntField(term43785, term43785.getClass(), "index", -203163250);
        setField(term43785, term43785.getClass(), "name", "LvztehSlhM");
        setIntField(term43785, term43785.getClass(), "maxSlot", 498473526);
        setIntField(term43785, term43785.getClass(), "slotHull", 1186917020);
        setField(term43785, term43785.getClass(), "hullType", enum137);
        setField(term43785, term43785.getClass(), "size", enum138);
        setIntField(term43785, term43785.getClass(), "cost", 1670041824);
        setIntField(term43785, term43785.getClass(), "metalCost", 2140388634);
        setIntField(term43785, term43785.getClass(), "imageIndex", 21095258);
        setDoubleField(term43785, term43785.getClass(), "fleetCapacity", 0.7655020693602768);
        setField(term43828, term43828.getClass(), "id", "njvnWFTMxN");
        setField(term43828, term43828.getClass(), "name", "fLRqcTSfzF");
        setField(term43828, term43828.getClass(), "nameSingle", "EBYHwsuWAU");
        setField(term43828, term43828.getClass(), "attitude", enum139);
        setField(term43828, term43828.getClass(), "imagePath", "PtIjKpiSix");
        setField(term43828, term43828.getClass(), "bridgeId", "NZdTuwSCIM");
        setField(term43828, term43828.getClass(), "spaceShipId", "dDHcmzPAmP");
        setField(term43828, term43828.getClass(), "socialSystem", enum140);
        setField(term43828, term43828.getClass(), "genderList", term43907);
        setField(term43828, term43828.getClass(), "speechSetId", "HEaTkWYBgv");
        setField(term43828, term43828.getClass(), "bridgeEffect", enum141);
        setField(term43926, term43926.getClass(), "songName", "");
        setField(term43926, term43926.getClass(), "author", "");
        setField(term43926, term43926.getClass(), "fileName", "");
        setBooleanField(term43926, term43926.getClass(), "custom", false);
        setIntField(term43926, term43926.getClass(), "fadingLimit", -1793997256);
        setField(term43828, term43828.getClass(), "diplomacyMusic", term43926);
        setField(term43828, term43828.getClass(), "traits", term43932);
        setField(term43828, term43828.getClass(), "leaderNameGenerator", enum142);
        setField(term43828, term43828.getClass(), "description", "PTEndmPMzk");
        setField(term43828, term43828.getClass(), "spaceRaceType", enum143);
        setField(term43785, term43785.getClass(), "originalBuilder", term43828);
        setField(term43772, term43772.getClass(), "hull", term43785);
        setField(term43772, term43772.getClass(), "components", term43954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreeEnergy", argTypes, term43772, args);
    }

};


