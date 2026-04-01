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

public class FleetTileInfo_getRace_15963303472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82087;

    public FleetTileInfo_getRace_15963303472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82346 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term82345 = ((Class) term82346).getDeclaredField((String) "MILITARISTIC");
        ((Field) term82345).setAccessible(true);
        Object enum214 = ((Field) term82345).get((Object) null);
        Class<? extends Object> term82649 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term82648 = ((Class) term82649).getDeclaredField((String) "PATRIARCHY");
        ((Field) term82648).setAccessible(true);
        Object enum215 = ((Field) term82648).get((Object) null);
        Class<? extends Object> term82911 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term82910 = ((Class) term82911).getDeclaredField((String) "NONE");
        ((Field) term82910).setAccessible(true);
        Object enum216 =  ((Field) term82910).get((Object) null);
        Class<? extends Object> term83135 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term83134 = ((Class) term83135).getDeclaredField((String) "MALE");
        ((Field) term83134).setAccessible(true);
        Object enum217 =  ((Field) term83134).get((Object) null);
        Class<? extends Object> term83359 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term83358 = ((Class) term83359).getDeclaredField((String) "NONE");
        ((Field) term83358).setAccessible(true);
        Object enum218 =  ((Field) term83358).get((Object) null);
        ArrayList term82191 = new ArrayList();
        ((ArrayList) term82191).add(enum216);
        ((ArrayList) term82191).add(enum217);
        ((ArrayList) term82191).add(enum218);
        ((ArrayList) term82191).add(enum218);
        ((ArrayList) term82191).add(enum216);
        ((ArrayList) term82191).add(enum216);
        ((ArrayList) term82191).add(enum217);
        ((ArrayList) term82191).add(enum218);
        Class<? extends Object> term83593 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term83592 = ((Class) term83593).getDeclaredField((String) "TEST");
        ((Field) term83592).setAccessible(true);
        Object enum219 = ((Field) term83592).get((Object) null);
        Object term82265 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term82265, term82265.getClass(), "traitId", null);
        setField(term82265, term82265.getClass(), "traitName", null);
        setField(term82265, term82265.getClass(), "description", null);
        setField(term82265, term82265.getClass(), "group", null);
        setField(term82265, term82265.getClass(), "conflictsWithIds", null);
        setByteField(term82265, term82265.getClass(), "traitPoints", (byte) -4);
        Object term82267 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term82267, term82267.getClass(), "traitId", null);
        setField(term82267, term82267.getClass(), "traitName", null);
        setField(term82267, term82267.getClass(), "description", null);
        setField(term82267, term82267.getClass(), "group", null);
        setField(term82267, term82267.getClass(), "conflictsWithIds", null);
        setByteField(term82267, term82267.getClass(), "traitPoints", (byte) -68);
        Object term82269 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term82269, term82269.getClass(), "traitId", null);
        setField(term82269, term82269.getClass(), "traitName", null);
        setField(term82269, term82269.getClass(), "description", null);
        setField(term82269, term82269.getClass(), "group", null);
        setField(term82269, term82269.getClass(), "conflictsWithIds", null);
        setByteField(term82269, term82269.getClass(), "traitPoints", (byte) -7);
        Object term82271 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term82271, term82271.getClass(), "traitId", null);
        setField(term82271, term82271.getClass(), "traitName", null);
        setField(term82271, term82271.getClass(), "description", null);
        setField(term82271, term82271.getClass(), "group", null);
        setField(term82271, term82271.getClass(), "conflictsWithIds", null);
        setByteField(term82271, term82271.getClass(), "traitPoints", (byte) -109);
        ArrayList term82263 = new ArrayList();
        ((ArrayList) term82263).add(term82265);
        ((ArrayList) term82263).add(term82267);
        ((ArrayList) term82263).add(term82269);
        ((ArrayList) term82263).add(term82271);
        Class<? extends Object> term83872 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term83871 = ((Class) term83872).getDeclaredField((String) "ALL");
        ((Field) term83871).setAccessible(true);
        Object enum220 = ((Field) term83871).get((Object) null);
        Class<? extends Object> term84158 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term84157 = ((Class) term84158).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term84157).setAccessible(true);
        Object enum221 = ((Field) term84157).get((Object) null);
        term82087 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term82088 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term82224 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term82088, term82088.getClass(), "id", "HtLEppUqzI");
        setField(term82088, term82088.getClass(), "name", "bVlRrMQeRY");
        setField(term82088, term82088.getClass(), "nameSingle", "SXaXhlzAIB");
        setField(term82088, term82088.getClass(), "attitude", enum214);
        setField(term82088, term82088.getClass(), "imagePath", "UPVTXSXUNh");
        setField(term82088, term82088.getClass(), "bridgeId", "cjCXbXuiFn");
        setField(term82088, term82088.getClass(), "spaceShipId", "fhdhDeWdoi");
        setField(term82088, term82088.getClass(), "socialSystem", enum215);
        setField(term82088, term82088.getClass(), "genderList", term82191);
        setField(term82088, term82088.getClass(), "speechSetId", "FqrcltWSUd");
        setField(term82088, term82088.getClass(), "bridgeEffect", enum219);
        setField(term82224, term82224.getClass(), "songName", "kAbILlhsZw");
        setField(term82224, term82224.getClass(), "author", "QsIOCSpRow");
        setField(term82224, term82224.getClass(), "fileName", "gcFzvYOUch");
        setBooleanField(term82224, term82224.getClass(), "custom", false);
        setIntField(term82224, term82224.getClass(), "fadingLimit", -1106116513);
        setField(term82088, term82088.getClass(), "diplomacyMusic", term82224);
        setField(term82088, term82088.getClass(), "traits", term82263);
        setField(term82088, term82088.getClass(), "leaderNameGenerator", enum220);
        setField(term82088, term82088.getClass(), "description", "vSbbcByIuA");
        setField(term82088, term82088.getClass(), "spaceRaceType", enum221);
        setField(term82087, term82087.getClass(), "race", term82088);
        setIntField(term82087, term82087.getClass(), "imageIndex", 1454640705);
        setIntField(term82087, term82087.getClass(), "playerIndex", -1492168193);
        setIntField(term82087, term82087.getClass(), "fleetIndex", 144805805);
        setIntField(term82087, term82087.getClass(), "planetIndex", 804939687);
        setIntField(term82087, term82087.getClass(), "conflictIndex", 1638315840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRace", argTypes, term82087, args);
    }

};


