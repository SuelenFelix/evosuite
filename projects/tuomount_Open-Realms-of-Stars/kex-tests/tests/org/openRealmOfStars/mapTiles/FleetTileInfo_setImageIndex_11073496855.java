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

public class FleetTileInfo_setImageIndex_11073496855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90151;
     Object term90379;

    public FleetTileInfo_setImageIndex_11073496855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90412 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term90411 = ((Class) term90412).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term90411).setAccessible(true);
        Object enum240 = ((Field) term90411).get((Object) null);
        Class<? extends Object> term90709 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term90708 = ((Class) term90709).getDeclaredField((String) "PATRIARCHY");
        ((Field) term90708).setAccessible(true);
        Object enum241 = ((Field) term90708).get((Object) null);
        ArrayList term90253 = new ArrayList();
        Class<? extends Object> term90981 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term90980 = ((Class) term90981).getDeclaredField((String) "JUNGLE");
        ((Field) term90980).setAccessible(true);
        Object enum242 = ((Field) term90980).get((Object) null);
        Object term90320 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term90320, term90320.getClass(), "traitId", null);
        setField(term90320, term90320.getClass(), "traitName", null);
        setField(term90320, term90320.getClass(), "description", null);
        setField(term90320, term90320.getClass(), "group", null);
        setField(term90320, term90320.getClass(), "conflictsWithIds", null);
        setByteField(term90320, term90320.getClass(), "traitPoints", (byte) 74);
        Object term90322 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term90322, term90322.getClass(), "traitId", null);
        setField(term90322, term90322.getClass(), "traitName", null);
        setField(term90322, term90322.getClass(), "description", null);
        setField(term90322, term90322.getClass(), "group", null);
        setField(term90322, term90322.getClass(), "conflictsWithIds", null);
        setByteField(term90322, term90322.getClass(), "traitPoints", (byte) 37);
        Object term90324 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term90324, term90324.getClass(), "traitId", null);
        setField(term90324, term90324.getClass(), "traitName", null);
        setField(term90324, term90324.getClass(), "description", null);
        setField(term90324, term90324.getClass(), "group", null);
        setField(term90324, term90324.getClass(), "conflictsWithIds", null);
        setByteField(term90324, term90324.getClass(), "traitPoints", (byte) -78);
        Object term90326 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term90326, term90326.getClass(), "traitId", null);
        setField(term90326, term90326.getClass(), "traitName", null);
        setField(term90326, term90326.getClass(), "description", null);
        setField(term90326, term90326.getClass(), "group", null);
        setField(term90326, term90326.getClass(), "conflictsWithIds", null);
        setByteField(term90326, term90326.getClass(), "traitPoints", (byte) 3);
        Object term90328 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term90328, term90328.getClass(), "traitId", null);
        setField(term90328, term90328.getClass(), "traitName", null);
        setField(term90328, term90328.getClass(), "description", null);
        setField(term90328, term90328.getClass(), "group", null);
        setField(term90328, term90328.getClass(), "conflictsWithIds", null);
        setByteField(term90328, term90328.getClass(), "traitPoints", (byte) -30);
        Object term90330 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term90330, term90330.getClass(), "traitId", null);
        setField(term90330, term90330.getClass(), "traitName", null);
        setField(term90330, term90330.getClass(), "description", null);
        setField(term90330, term90330.getClass(), "group", null);
        setField(term90330, term90330.getClass(), "conflictsWithIds", null);
        setByteField(term90330, term90330.getClass(), "traitPoints", (byte) -67);
        Object term90332 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term90332, term90332.getClass(), "traitId", null);
        setField(term90332, term90332.getClass(), "traitName", null);
        setField(term90332, term90332.getClass(), "description", null);
        setField(term90332, term90332.getClass(), "group", null);
        setField(term90332, term90332.getClass(), "conflictsWithIds", null);
        setByteField(term90332, term90332.getClass(), "traitPoints", (byte) -67);
        ArrayList term90318 = new ArrayList();
        ((ArrayList) term90318).add(term90320);
        ((ArrayList) term90318).add(term90322);
        ((ArrayList) term90318).add(term90324);
        ((ArrayList) term90318).add(term90326);
        ((ArrayList) term90318).add(term90328);
        ((ArrayList) term90318).add(term90330);
        ((ArrayList) term90318).add(term90332);
        Class<? extends Object> term91266 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term91265 = ((Class) term91266).getDeclaredField((String) "PIRATE");
        ((Field) term91265).setAccessible(true);
        Object enum243 = ((Field) term91265).get((Object) null);
        Class<? extends Object> term91561 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term91560 = ((Class) term91561).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term91560).setAccessible(true);
        Object enum244 = ((Field) term91560).get((Object) null);
        term90151 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term90152 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term90279 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term90152, term90152.getClass(), "id", "yjmUdvwSdd");
        setField(term90152, term90152.getClass(), "name", "COsGswsrtI");
        setField(term90152, term90152.getClass(), "nameSingle", "ebUWnoVDmk");
        setField(term90152, term90152.getClass(), "attitude", enum240);
        setField(term90152, term90152.getClass(), "imagePath", "wCcojFgWKb");
        setField(term90152, term90152.getClass(), "bridgeId", "iHtqLPNWTt");
        setField(term90152, term90152.getClass(), "spaceShipId", "TQgECVDMEf");
        setField(term90152, term90152.getClass(), "socialSystem", enum241);
        setField(term90152, term90152.getClass(), "genderList", term90253);
        setField(term90152, term90152.getClass(), "speechSetId", "KIBOVYItqe");
        setField(term90152, term90152.getClass(), "bridgeEffect", enum242);
        setField(term90279, term90279.getClass(), "songName", "GUztJeVeCc");
        setField(term90279, term90279.getClass(), "author", "YNXFGgstqj");
        setField(term90279, term90279.getClass(), "fileName", "xZTWqxWsAc");
        setBooleanField(term90279, term90279.getClass(), "custom", true);
        setIntField(term90279, term90279.getClass(), "fadingLimit", -1835849143);
        setField(term90152, term90152.getClass(), "diplomacyMusic", term90279);
        setField(term90152, term90152.getClass(), "traits", term90318);
        setField(term90152, term90152.getClass(), "leaderNameGenerator", enum243);
        setField(term90152, term90152.getClass(), "description", "uDAdogNiBQ");
        setField(term90152, term90152.getClass(), "spaceRaceType", enum244);
        setField(term90151, term90151.getClass(), "race", term90152);
        setIntField(term90151, term90151.getClass(), "imageIndex", 156667044);
        setIntField(term90151, term90151.getClass(), "playerIndex", -1224273100);
        setIntField(term90151, term90151.getClass(), "fleetIndex", -1428004018);
        setIntField(term90151, term90151.getClass(), "planetIndex", -296242927);
        setIntField(term90151, term90151.getClass(), "conflictIndex", -1009003985);
        term90379 = new Integer(281679450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term90379;
        callMethod(klass, "setImageIndex", argTypes, term90151, args);
    }

};


