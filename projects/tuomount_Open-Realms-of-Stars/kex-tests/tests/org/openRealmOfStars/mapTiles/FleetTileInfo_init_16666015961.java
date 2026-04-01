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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class FleetTileInfo_init_16666015961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80140;
     Object term80386;
     Object term80388;

    public FleetTileInfo_init_16666015961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80421 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term80420 = ((Class) term80421).getDeclaredField((String) "BACKSTABBING");
        ((Field) term80420).setAccessible(true);
        Object enum208 = ((Field) term80420).get((Object) null);
        Class<? extends Object> term80724 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term80723 = ((Class) term80724).getDeclaredField((String) "MATRIARCHY");
        ((Field) term80723).setAccessible(true);
        Object enum209 = ((Field) term80723).get((Object) null);
        Class<? extends Object> term80986 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term80985 = ((Class) term80986).getDeclaredField((String) "MALE");
        ((Field) term80985).setAccessible(true);
        Object enum210 =  ((Field) term80985).get((Object) null);
        ArrayList term80243 = new ArrayList();
        ((ArrayList) term80243).add(enum210);
        Class<? extends Object> term81220 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term81219 = ((Class) term81220).getDeclaredField((String) "DARK_RED");
        ((Field) term81219).setAccessible(true);
        Object enum211 = ((Field) term81219).get((Object) null);
        ArrayList term80321 = new ArrayList();
        ((ArrayList) term80321).add((Object)null);
        ((ArrayList) term80321).add((Object)null);
        Object term80316 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term80316, term80316.getClass(), "traitId", "");
        setField(term80316, term80316.getClass(), "traitName", "");
        setField(term80316, term80316.getClass(), "description", "");
        setField(term80316, term80316.getClass(), "group", "");
        setField(term80316, term80316.getClass(), "conflictsWithIds", term80321);
        setByteField(term80316, term80316.getClass(), "traitPoints", (byte) -102);
        ArrayList term80330 = new ArrayList();
        ((ArrayList) term80330).add((Object)null);
        ((ArrayList) term80330).add((Object)null);
        ((ArrayList) term80330).add((Object)null);
        ((ArrayList) term80330).add((Object)null);
        Object term80325 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term80325, term80325.getClass(), "traitId", "");
        setField(term80325, term80325.getClass(), "traitName", "");
        setField(term80325, term80325.getClass(), "description", "");
        setField(term80325, term80325.getClass(), "group", "");
        setField(term80325, term80325.getClass(), "conflictsWithIds", term80330);
        setByteField(term80325, term80325.getClass(), "traitPoints", (byte) -93);
        ArrayList term80339 = new ArrayList();
        ((ArrayList) term80339).add((Object)null);
        ((ArrayList) term80339).add((Object)null);
        Object term80334 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term80334, term80334.getClass(), "traitId", "");
        setField(term80334, term80334.getClass(), "traitName", "");
        setField(term80334, term80334.getClass(), "description", "");
        setField(term80334, term80334.getClass(), "group", "");
        setField(term80334, term80334.getClass(), "conflictsWithIds", term80339);
        setByteField(term80334, term80334.getClass(), "traitPoints", (byte) 111);
        ArrayList term80314 = new ArrayList();
        ((ArrayList) term80314).add(term80316);
        ((ArrayList) term80314).add(term80325);
        ((ArrayList) term80314).add(term80334);
        Class<? extends Object> term81511 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term81510 = ((Class) term81511).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term81510).setAccessible(true);
        Object enum212 = ((Field) term81510).get((Object) null);
        Class<? extends Object> term81830 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term81829 = ((Class) term81830).getDeclaredField((String) "REGULAR");
        ((Field) term81829).setAccessible(true);
        Object enum213 = ((Field) term81829).get((Object) null);
        term80140 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term80275 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term80140, term80140.getClass(), "id", "VAFSknHLsZ");
        setField(term80140, term80140.getClass(), "name", "MamzBtwhiz");
        setField(term80140, term80140.getClass(), "nameSingle", "wVOypfVLsP");
        setField(term80140, term80140.getClass(), "attitude", enum208);
        setField(term80140, term80140.getClass(), "imagePath", "pEazBcUUWX");
        setField(term80140, term80140.getClass(), "bridgeId", "nlvRWrTxvz");
        setField(term80140, term80140.getClass(), "spaceShipId", "isMKwgUmka");
        setField(term80140, term80140.getClass(), "socialSystem", enum209);
        setField(term80140, term80140.getClass(), "genderList", term80243);
        setField(term80140, term80140.getClass(), "speechSetId", "pDIyzhDtTy");
        setField(term80140, term80140.getClass(), "bridgeEffect", enum211);
        setField(term80275, term80275.getClass(), "songName", "wXiUlhXQoC");
        setField(term80275, term80275.getClass(), "author", "gKhmgJzimH");
        setField(term80275, term80275.getClass(), "fileName", "OzRiWLVXNx");
        setBooleanField(term80275, term80275.getClass(), "custom", true);
        setIntField(term80275, term80275.getClass(), "fadingLimit", 665526857);
        setField(term80140, term80140.getClass(), "diplomacyMusic", term80275);
        setField(term80140, term80140.getClass(), "traits", term80314);
        setField(term80140, term80140.getClass(), "leaderNameGenerator", enum212);
        setField(term80140, term80140.getClass(), "description", "gqMysJhxfA");
        setField(term80140, term80140.getClass(), "spaceRaceType", enum213);
        term80386 = new Integer(184439959);
        term80388 = new Integer(-153314488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term80140;
        args[1] = term80386;
        args[2] = term80388;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


