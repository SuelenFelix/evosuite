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

public class FleetTileInfo_getPlayerIndex_15836407916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91833;

    public FleetTileInfo_getPlayerIndex_15836407916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92108 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term92107 = ((Class) term92108).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term92107).setAccessible(true);
        Object enum245 = ((Field) term92107).get((Object) null);
        Class<? extends Object> term92405 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term92404 = ((Class) term92405).getDeclaredField((String) "MATRIARCHY");
        ((Field) term92404).setAccessible(true);
        Object enum246 = ((Field) term92404).get((Object) null);
        Class<? extends Object> term92667 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term92666 = ((Class) term92667).getDeclaredField((String) "MALE");
        ((Field) term92666).setAccessible(true);
        Object enum247 =  ((Field) term92666).get((Object) null);
        Class<? extends Object> term92891 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term92890 = ((Class) term92891).getDeclaredField((String) "NONE");
        ((Field) term92890).setAccessible(true);
        Object enum248 =  ((Field) term92890).get((Object) null);
        ArrayList term91935 = new ArrayList();
        ((ArrayList) term91935).add(enum247);
        ((ArrayList) term91935).add(enum248);
        Class<? extends Object> term93125 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term93124 = ((Class) term93125).getDeclaredField((String) "BRIGHT_CYAN");
        ((Field) term93124).setAccessible(true);
        Object enum249 = ((Field) term93124).get((Object) null);
        Object term92013 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term92013, term92013.getClass(), "traitId", null);
        setField(term92013, term92013.getClass(), "traitName", null);
        setField(term92013, term92013.getClass(), "description", null);
        setField(term92013, term92013.getClass(), "group", null);
        setField(term92013, term92013.getClass(), "conflictsWithIds", null);
        setByteField(term92013, term92013.getClass(), "traitPoints", (byte) -94);
        Object term92015 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term92015, term92015.getClass(), "traitId", null);
        setField(term92015, term92015.getClass(), "traitName", null);
        setField(term92015, term92015.getClass(), "description", null);
        setField(term92015, term92015.getClass(), "group", null);
        setField(term92015, term92015.getClass(), "conflictsWithIds", null);
        setByteField(term92015, term92015.getClass(), "traitPoints", (byte) 78);
        Object term92017 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term92017, term92017.getClass(), "traitId", null);
        setField(term92017, term92017.getClass(), "traitName", null);
        setField(term92017, term92017.getClass(), "description", null);
        setField(term92017, term92017.getClass(), "group", null);
        setField(term92017, term92017.getClass(), "conflictsWithIds", null);
        setByteField(term92017, term92017.getClass(), "traitPoints", (byte) 8);
        Object term92019 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term92019, term92019.getClass(), "traitId", null);
        setField(term92019, term92019.getClass(), "traitName", null);
        setField(term92019, term92019.getClass(), "description", null);
        setField(term92019, term92019.getClass(), "group", null);
        setField(term92019, term92019.getClass(), "conflictsWithIds", null);
        setByteField(term92019, term92019.getClass(), "traitPoints", (byte) 25);
        Object term92021 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term92021, term92021.getClass(), "traitId", null);
        setField(term92021, term92021.getClass(), "traitName", null);
        setField(term92021, term92021.getClass(), "description", null);
        setField(term92021, term92021.getClass(), "group", null);
        setField(term92021, term92021.getClass(), "conflictsWithIds", null);
        setByteField(term92021, term92021.getClass(), "traitPoints", (byte) 103);
        ArrayList term92011 = new ArrayList();
        ((ArrayList) term92011).add(term92013);
        ((ArrayList) term92011).add(term92015);
        ((ArrayList) term92011).add(term92017);
        ((ArrayList) term92011).add(term92019);
        ((ArrayList) term92011).add(term92021);
        Class<? extends Object> term93425 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term93424 = ((Class) term93425).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term93424).setAccessible(true);
        Object enum250 = ((Field) term93424).get((Object) null);
        Class<? extends Object> term93762 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term93761 = ((Class) term93762).getDeclaredField((String) "REGULAR");
        ((Field) term93761).setAccessible(true);
        Object enum251 = ((Field) term93761).get((Object) null);
        term91833 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term91834 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term91972 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term91834, term91834.getClass(), "id", "GnPrxkKUmR");
        setField(term91834, term91834.getClass(), "name", "gVgLmqgxMh");
        setField(term91834, term91834.getClass(), "nameSingle", "QWknVCpJTU");
        setField(term91834, term91834.getClass(), "attitude", enum245);
        setField(term91834, term91834.getClass(), "imagePath", "XhnCbWwpIr");
        setField(term91834, term91834.getClass(), "bridgeId", "BVMUadSiyU");
        setField(term91834, term91834.getClass(), "spaceShipId", "OhWrgFwvJi");
        setField(term91834, term91834.getClass(), "socialSystem", enum246);
        setField(term91834, term91834.getClass(), "genderList", term91935);
        setField(term91834, term91834.getClass(), "speechSetId", "DfKWXfTINQ");
        setField(term91834, term91834.getClass(), "bridgeEffect", enum249);
        setField(term91972, term91972.getClass(), "songName", "KqusFIxuyo");
        setField(term91972, term91972.getClass(), "author", "CDpvEYMuDg");
        setField(term91972, term91972.getClass(), "fileName", "YaZCAiIUPe");
        setBooleanField(term91972, term91972.getClass(), "custom", true);
        setIntField(term91972, term91972.getClass(), "fadingLimit", -1773524930);
        setField(term91834, term91834.getClass(), "diplomacyMusic", term91972);
        setField(term91834, term91834.getClass(), "traits", term92011);
        setField(term91834, term91834.getClass(), "leaderNameGenerator", enum250);
        setField(term91834, term91834.getClass(), "description", "LaWPqdDqyl");
        setField(term91834, term91834.getClass(), "spaceRaceType", enum251);
        setField(term91833, term91833.getClass(), "race", term91834);
        setIntField(term91833, term91833.getClass(), "imageIndex", 2053145277);
        setIntField(term91833, term91833.getClass(), "playerIndex", 472692952);
        setIntField(term91833, term91833.getClass(), "fleetIndex", 140138500);
        setIntField(term91833, term91833.getClass(), "planetIndex", -244584643);
        setIntField(term91833, term91833.getClass(), "conflictIndex", 1557955716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerIndex", argTypes, term91833, args);
    }

};


