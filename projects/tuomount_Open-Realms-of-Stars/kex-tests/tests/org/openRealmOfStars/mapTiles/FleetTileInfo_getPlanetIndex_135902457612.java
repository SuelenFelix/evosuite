package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class FleetTileInfo_getPlanetIndex_135902457612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105048;

    public FleetTileInfo_getPlanetIndex_135902457612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105318 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term105317 = ((Class) term105318).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term105317).setAccessible(true);
        Object enum288 = ((Field) term105317).get((Object) null);
        Class<? extends Object> term105621 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term105620 = ((Class) term105621).getDeclaredField((String) "PATRIARCHY");
        ((Field) term105620).setAccessible(true);
        Object enum289 = ((Field) term105620).get((Object) null);
        Class<? extends Object> term105883 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term105882 = ((Class) term105883).getDeclaredField((String) "NONE");
        ((Field) term105882).setAccessible(true);
        Object enum290 =  ((Field) term105882).get((Object) null);
        ArrayList term105152 = new ArrayList();
        ((ArrayList) term105152).add(enum290);
        ((ArrayList) term105152).add(enum290);
        ((ArrayList) term105152).add(enum290);
        Class<? extends Object> term106117 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term106116 = ((Class) term106117).getDeclaredField((String) "FLOAT_IN_SPACE");
        ((Field) term106116).setAccessible(true);
        Object enum291 = ((Field) term106116).get((Object) null);
        Object term105230 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term105230, term105230.getClass(), "traitId", null);
        setField(term105230, term105230.getClass(), "traitName", null);
        setField(term105230, term105230.getClass(), "description", null);
        setField(term105230, term105230.getClass(), "group", null);
        setField(term105230, term105230.getClass(), "conflictsWithIds", null);
        setByteField(term105230, term105230.getClass(), "traitPoints", (byte) -31);
        Object term105232 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term105232, term105232.getClass(), "traitId", null);
        setField(term105232, term105232.getClass(), "traitName", null);
        setField(term105232, term105232.getClass(), "description", null);
        setField(term105232, term105232.getClass(), "group", null);
        setField(term105232, term105232.getClass(), "conflictsWithIds", null);
        setByteField(term105232, term105232.getClass(), "traitPoints", (byte) 83);
        Object term105234 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term105234, term105234.getClass(), "traitId", null);
        setField(term105234, term105234.getClass(), "traitName", null);
        setField(term105234, term105234.getClass(), "description", null);
        setField(term105234, term105234.getClass(), "group", null);
        setField(term105234, term105234.getClass(), "conflictsWithIds", null);
        setByteField(term105234, term105234.getClass(), "traitPoints", (byte) 19);
        Object term105236 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term105236, term105236.getClass(), "traitId", null);
        setField(term105236, term105236.getClass(), "traitName", null);
        setField(term105236, term105236.getClass(), "description", null);
        setField(term105236, term105236.getClass(), "group", null);
        setField(term105236, term105236.getClass(), "conflictsWithIds", null);
        setByteField(term105236, term105236.getClass(), "traitPoints", (byte) 95);
        Object term105238 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term105238, term105238.getClass(), "traitId", null);
        setField(term105238, term105238.getClass(), "traitName", null);
        setField(term105238, term105238.getClass(), "description", null);
        setField(term105238, term105238.getClass(), "group", null);
        setField(term105238, term105238.getClass(), "conflictsWithIds", null);
        setByteField(term105238, term105238.getClass(), "traitPoints", (byte) 95);
        Object term105240 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term105240, term105240.getClass(), "traitId", null);
        setField(term105240, term105240.getClass(), "traitName", null);
        setField(term105240, term105240.getClass(), "description", null);
        setField(term105240, term105240.getClass(), "group", null);
        setField(term105240, term105240.getClass(), "conflictsWithIds", null);
        setByteField(term105240, term105240.getClass(), "traitPoints", (byte) 15);
        ArrayList term105228 = new ArrayList();
        ((ArrayList) term105228).add(term105230);
        ((ArrayList) term105228).add(term105232);
        ((ArrayList) term105228).add(term105234);
        ((ArrayList) term105228).add(term105236);
        ((ArrayList) term105228).add(term105238);
        ((ArrayList) term105228).add(term105240);
        Class<? extends Object> term106426 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term106425 = ((Class) term106426).getDeclaredField((String) "CYBORG");
        ((Field) term106425).setAccessible(true);
        Object enum292 = ((Field) term106425).get((Object) null);
        Class<? extends Object> term106721 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term106720 = ((Class) term106721).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term106720).setAccessible(true);
        Object enum293 = ((Field) term106720).get((Object) null);
        term105048 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term105049 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term105189 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term105049, term105049.getClass(), "id", "BVlqqUSYbB");
        setField(term105049, term105049.getClass(), "name", "hhGHcwcBqB");
        setField(term105049, term105049.getClass(), "nameSingle", "WIVENkFxNU");
        setField(term105049, term105049.getClass(), "attitude", enum288);
        setField(term105049, term105049.getClass(), "imagePath", "MFSosHURtm");
        setField(term105049, term105049.getClass(), "bridgeId", "hIBYlJpYye");
        setField(term105049, term105049.getClass(), "spaceShipId", "LNendOzJhj");
        setField(term105049, term105049.getClass(), "socialSystem", enum289);
        setField(term105049, term105049.getClass(), "genderList", term105152);
        setField(term105049, term105049.getClass(), "speechSetId", "ZwcevQDgzv");
        setField(term105049, term105049.getClass(), "bridgeEffect", enum291);
        setField(term105189, term105189.getClass(), "songName", "rzkENrHYBI");
        setField(term105189, term105189.getClass(), "author", "ylJjmNVzzt");
        setField(term105189, term105189.getClass(), "fileName", "nwKTRDmHWk");
        setBooleanField(term105189, term105189.getClass(), "custom", false);
        setIntField(term105189, term105189.getClass(), "fadingLimit", 326665488);
        setField(term105049, term105049.getClass(), "diplomacyMusic", term105189);
        setField(term105049, term105049.getClass(), "traits", term105228);
        setField(term105049, term105049.getClass(), "leaderNameGenerator", enum292);
        setField(term105049, term105049.getClass(), "description", "CvbqWuRute");
        setField(term105049, term105049.getClass(), "spaceRaceType", enum293);
        setField(term105048, term105048.getClass(), "race", term105049);
        setIntField(term105048, term105048.getClass(), "imageIndex", -556521634);
        setIntField(term105048, term105048.getClass(), "playerIndex", -904069976);
        setIntField(term105048, term105048.getClass(), "fleetIndex", 1492540298);
        setIntField(term105048, term105048.getClass(), "planetIndex", 751340602);
        setIntField(term105048, term105048.getClass(), "conflictIndex", 123770182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetIndex", argTypes, term105048, args);
    }

};


