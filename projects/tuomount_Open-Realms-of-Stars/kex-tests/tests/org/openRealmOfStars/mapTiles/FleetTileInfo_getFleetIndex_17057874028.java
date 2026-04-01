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

public class FleetTileInfo_getFleetIndex_17057874028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96394;

    public FleetTileInfo_getFleetIndex_17057874028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96657 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term96656 = ((Class) term96657).getDeclaredField((String) "MILITARISTIC");
        ((Field) term96656).setAccessible(true);
        Object enum260 = ((Field) term96656).get((Object) null);
        Class<? extends Object> term96960 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term96959 = ((Class) term96960).getDeclaredField((String) "EQUAL");
        ((Field) term96959).setAccessible(true);
        Object enum261 = ((Field) term96959).get((Object) null);
        Class<? extends Object> term97207 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term97206 = ((Class) term97207).getDeclaredField((String) "NONE");
        ((Field) term97206).setAccessible(true);
        Object enum262 =  ((Field) term97206).get((Object) null);
        Class<? extends Object> term97431 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term97430 = ((Class) term97431).getDeclaredField((String) "FEMALE");
        ((Field) term97430).setAccessible(true);
        Object enum263 =  ((Field) term97430).get((Object) null);
        Class<? extends Object> term97661 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term97660 = ((Class) term97661).getDeclaredField((String) "NONE");
        ((Field) term97660).setAccessible(true);
        Object enum264 =  ((Field) term97660).get((Object) null);
        ArrayList term96493 = new ArrayList();
        ((ArrayList) term96493).add(enum262);
        ((ArrayList) term96493).add(enum263);
        ((ArrayList) term96493).add(enum264);
        ((ArrayList) term96493).add(enum264);
        ((ArrayList) term96493).add(enum263);
        ((ArrayList) term96493).add(enum263);
        ((ArrayList) term96493).add(enum264);
        Class<? extends Object> term97895 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term97894 = ((Class) term97895).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term97894).setAccessible(true);
        Object enum265 = ((Field) term97894).get((Object) null);
        Object term96574 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term96574, term96574.getClass(), "traitId", null);
        setField(term96574, term96574.getClass(), "traitName", null);
        setField(term96574, term96574.getClass(), "description", null);
        setField(term96574, term96574.getClass(), "group", null);
        setField(term96574, term96574.getClass(), "conflictsWithIds", null);
        setByteField(term96574, term96574.getClass(), "traitPoints", (byte) 111);
        ArrayList term96572 = new ArrayList();
        ((ArrayList) term96572).add(term96574);
        Class<? extends Object> term98195 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term98194 = ((Class) term98195).getDeclaredField((String) "LONG_NAMES");
        ((Field) term98194).setAccessible(true);
        Object enum266 = ((Field) term98194).get((Object) null);
        Class<? extends Object> term98502 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term98501 = ((Class) term98502).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term98501).setAccessible(true);
        Object enum267 = ((Field) term98501).get((Object) null);
        term96394 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term96395 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term96533 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term96395, term96395.getClass(), "id", "fFslDwqqzQ");
        setField(term96395, term96395.getClass(), "name", "oyTybTkTFd");
        setField(term96395, term96395.getClass(), "nameSingle", "NNjMZLPIcc");
        setField(term96395, term96395.getClass(), "attitude", enum260);
        setField(term96395, term96395.getClass(), "imagePath", "fAcvTHLHOa");
        setField(term96395, term96395.getClass(), "bridgeId", "QavvcNVesW");
        setField(term96395, term96395.getClass(), "spaceShipId", "JmFxhkDeIA");
        setField(term96395, term96395.getClass(), "socialSystem", enum261);
        setField(term96395, term96395.getClass(), "genderList", term96493);
        setField(term96395, term96395.getClass(), "speechSetId", "XcJqDBnnMZ");
        setField(term96395, term96395.getClass(), "bridgeEffect", enum265);
        setField(term96533, term96533.getClass(), "songName", "SchXFoqYFy");
        setField(term96533, term96533.getClass(), "author", "MnHKbTZBTr");
        setField(term96533, term96533.getClass(), "fileName", "xCNDHQZBKx");
        setBooleanField(term96533, term96533.getClass(), "custom", false);
        setIntField(term96533, term96533.getClass(), "fadingLimit", -651624649);
        setField(term96395, term96395.getClass(), "diplomacyMusic", term96533);
        setField(term96395, term96395.getClass(), "traits", term96572);
        setField(term96395, term96395.getClass(), "leaderNameGenerator", enum266);
        setField(term96395, term96395.getClass(), "description", "WqobQIRpLc");
        setField(term96395, term96395.getClass(), "spaceRaceType", enum267);
        setField(term96394, term96394.getClass(), "race", term96395);
        setIntField(term96394, term96394.getClass(), "imageIndex", -888494532);
        setIntField(term96394, term96394.getClass(), "playerIndex", 284122377);
        setIntField(term96394, term96394.getClass(), "fleetIndex", 1577003230);
        setIntField(term96394, term96394.getClass(), "planetIndex", -2042495274);
        setIntField(term96394, term96394.getClass(), "conflictIndex", 35579148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetIndex", argTypes, term96394, args);
    }

};


