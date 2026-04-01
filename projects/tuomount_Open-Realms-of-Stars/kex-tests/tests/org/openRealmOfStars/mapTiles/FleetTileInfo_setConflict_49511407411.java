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
import java.lang.Integer;

public class FleetTileInfo_setConflict_49511407411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102651;
     Object term102895;

    public FleetTileInfo_setConflict_49511407411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102928 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term102927 = ((Class) term102928).getDeclaredField((String) "MILITARISTIC");
        ((Field) term102927).setAccessible(true);
        Object enum280 = ((Field) term102927).get((Object) null);
        Class<? extends Object> term103231 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term103230 = ((Class) term103231).getDeclaredField((String) "MATRIARCHY");
        ((Field) term103230).setAccessible(true);
        Object enum281 = ((Field) term103230).get((Object) null);
        Class<? extends Object> term103493 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term103492 = ((Class) term103493).getDeclaredField((String) "FEMALE");
        ((Field) term103492).setAccessible(true);
        Object enum282 =  ((Field) term103492).get((Object) null);
        Class<? extends Object> term103723 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term103722 = ((Class) term103723).getDeclaredField((String) "FEMALE");
        ((Field) term103722).setAccessible(true);
        Object enum283 =  ((Field) term103722).get((Object) null);
        Class<? extends Object> term103953 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term103952 = ((Class) term103953).getDeclaredField((String) "MALE");
        ((Field) term103952).setAccessible(true);
        Object enum284 =  ((Field) term103952).get((Object) null);
        ArrayList term102755 = new ArrayList();
        ((ArrayList) term102755).add(enum282);
        ((ArrayList) term102755).add(enum283);
        ((ArrayList) term102755).add(enum284);
        ((ArrayList) term102755).add(enum283);
        ((ArrayList) term102755).add(enum282);
        ((ArrayList) term102755).add(enum282);
        ((ArrayList) term102755).add(enum284);
        Class<? extends Object> term104187 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term104186 = ((Class) term104187).getDeclaredField((String) "GREYBLUE");
        ((Field) term104186).setAccessible(true);
        Object enum285 = ((Field) term104186).get((Object) null);
        Object term102833 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term102833, term102833.getClass(), "traitId", null);
        setField(term102833, term102833.getClass(), "traitName", null);
        setField(term102833, term102833.getClass(), "description", null);
        setField(term102833, term102833.getClass(), "group", null);
        setField(term102833, term102833.getClass(), "conflictsWithIds", null);
        setByteField(term102833, term102833.getClass(), "traitPoints", (byte) -119);
        Object term102835 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term102835, term102835.getClass(), "traitId", null);
        setField(term102835, term102835.getClass(), "traitName", null);
        setField(term102835, term102835.getClass(), "description", null);
        setField(term102835, term102835.getClass(), "group", null);
        setField(term102835, term102835.getClass(), "conflictsWithIds", null);
        setByteField(term102835, term102835.getClass(), "traitPoints", (byte) -51);
        Object term102837 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term102837, term102837.getClass(), "traitId", null);
        setField(term102837, term102837.getClass(), "traitName", null);
        setField(term102837, term102837.getClass(), "description", null);
        setField(term102837, term102837.getClass(), "group", null);
        setField(term102837, term102837.getClass(), "conflictsWithIds", null);
        setByteField(term102837, term102837.getClass(), "traitPoints", (byte) -55);
        Object term102839 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term102839, term102839.getClass(), "traitId", null);
        setField(term102839, term102839.getClass(), "traitName", null);
        setField(term102839, term102839.getClass(), "description", null);
        setField(term102839, term102839.getClass(), "group", null);
        setField(term102839, term102839.getClass(), "conflictsWithIds", null);
        setByteField(term102839, term102839.getClass(), "traitPoints", (byte) -5);
        Object term102841 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term102841, term102841.getClass(), "traitId", null);
        setField(term102841, term102841.getClass(), "traitName", null);
        setField(term102841, term102841.getClass(), "description", null);
        setField(term102841, term102841.getClass(), "group", null);
        setField(term102841, term102841.getClass(), "conflictsWithIds", null);
        setByteField(term102841, term102841.getClass(), "traitPoints", (byte) 14);
        Object term102843 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term102843, term102843.getClass(), "traitId", null);
        setField(term102843, term102843.getClass(), "traitName", null);
        setField(term102843, term102843.getClass(), "description", null);
        setField(term102843, term102843.getClass(), "group", null);
        setField(term102843, term102843.getClass(), "conflictsWithIds", null);
        setByteField(term102843, term102843.getClass(), "traitPoints", (byte) 125);
        Object term102845 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term102845, term102845.getClass(), "traitId", null);
        setField(term102845, term102845.getClass(), "traitName", null);
        setField(term102845, term102845.getClass(), "description", null);
        setField(term102845, term102845.getClass(), "group", null);
        setField(term102845, term102845.getClass(), "conflictsWithIds", null);
        setByteField(term102845, term102845.getClass(), "traitPoints", (byte) 57);
        Object term102847 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term102847, term102847.getClass(), "traitId", null);
        setField(term102847, term102847.getClass(), "traitName", null);
        setField(term102847, term102847.getClass(), "description", null);
        setField(term102847, term102847.getClass(), "group", null);
        setField(term102847, term102847.getClass(), "conflictsWithIds", null);
        setByteField(term102847, term102847.getClass(), "traitPoints", (byte) 40);
        ArrayList term102831 = new ArrayList();
        ((ArrayList) term102831).add(term102833);
        ((ArrayList) term102831).add(term102835);
        ((ArrayList) term102831).add(term102837);
        ((ArrayList) term102831).add(term102839);
        ((ArrayList) term102831).add(term102841);
        ((ArrayList) term102831).add(term102843);
        ((ArrayList) term102831).add(term102845);
        ((ArrayList) term102831).add(term102847);
        Class<? extends Object> term104478 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term104477 = ((Class) term104478).getDeclaredField((String) "FEMALE_ROBOT");
        ((Field) term104477).setAccessible(true);
        Object enum286 = ((Field) term104477).get((Object) null);
        Class<? extends Object> term104791 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term104790 = ((Class) term104791).getDeclaredField((String) "REGULAR");
        ((Field) term104790).setAccessible(true);
        Object enum287 = ((Field) term104790).get((Object) null);
        term102651 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term102652 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term102792 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term102652, term102652.getClass(), "id", "UrLisdyvVs");
        setField(term102652, term102652.getClass(), "name", "VckRXyiShh");
        setField(term102652, term102652.getClass(), "nameSingle", "ZKwDTklKHb");
        setField(term102652, term102652.getClass(), "attitude", enum280);
        setField(term102652, term102652.getClass(), "imagePath", "tQMlnMStsQ");
        setField(term102652, term102652.getClass(), "bridgeId", "OYJvKAMFEk");
        setField(term102652, term102652.getClass(), "spaceShipId", "puNAveVBkA");
        setField(term102652, term102652.getClass(), "socialSystem", enum281);
        setField(term102652, term102652.getClass(), "genderList", term102755);
        setField(term102652, term102652.getClass(), "speechSetId", "BcZKUIbuQL");
        setField(term102652, term102652.getClass(), "bridgeEffect", enum285);
        setField(term102792, term102792.getClass(), "songName", "YvjPnZyRnw");
        setField(term102792, term102792.getClass(), "author", "IKmMfqFPku");
        setField(term102792, term102792.getClass(), "fileName", "NACnGDmVPl");
        setBooleanField(term102792, term102792.getClass(), "custom", true);
        setIntField(term102792, term102792.getClass(), "fadingLimit", 1767729920);
        setField(term102652, term102652.getClass(), "diplomacyMusic", term102792);
        setField(term102652, term102652.getClass(), "traits", term102831);
        setField(term102652, term102652.getClass(), "leaderNameGenerator", enum286);
        setField(term102652, term102652.getClass(), "description", "xHBCsghEAi");
        setField(term102652, term102652.getClass(), "spaceRaceType", enum287);
        setField(term102651, term102651.getClass(), "race", term102652);
        setIntField(term102651, term102651.getClass(), "imageIndex", -154656640);
        setIntField(term102651, term102651.getClass(), "playerIndex", 638814614);
        setIntField(term102651, term102651.getClass(), "fleetIndex", 832395207);
        setIntField(term102651, term102651.getClass(), "planetIndex", 1161114638);
        setIntField(term102651, term102651.getClass(), "conflictIndex", -1391162351);
        term102895 = new Integer(863863650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term102895;
        callMethod(klass, "setConflict", argTypes, term102651, args);
    }

};


