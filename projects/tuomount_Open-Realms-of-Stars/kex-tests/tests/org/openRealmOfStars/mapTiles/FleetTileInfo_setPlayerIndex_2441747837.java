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

public class FleetTileInfo_setPlayerIndex_2441747837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94019;
     Object term94247;

    public FleetTileInfo_setPlayerIndex_2441747837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94280 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term94279 = ((Class) term94280).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term94279).setAccessible(true);
        Object enum252 = ((Field) term94279).get((Object) null);
        Class<? extends Object> term94577 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term94576 = ((Class) term94577).getDeclaredField((String) "PATRIARCHY");
        ((Field) term94576).setAccessible(true);
        Object enum253 = ((Field) term94576).get((Object) null);
        Class<? extends Object> term94839 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term94838 = ((Class) term94839).getDeclaredField((String) "NONE");
        ((Field) term94838).setAccessible(true);
        Object enum254 =  ((Field) term94838).get((Object) null);
        Class<? extends Object> term95063 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term95062 = ((Class) term95063).getDeclaredField((String) "FEMALE");
        ((Field) term95062).setAccessible(true);
        Object enum255 =  ((Field) term95062).get((Object) null);
        Class<? extends Object> term95293 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term95292 = ((Class) term95293).getDeclaredField((String) "MALE");
        ((Field) term95292).setAccessible(true);
        Object enum256 =  ((Field) term95292).get((Object) null);
        ArrayList term94121 = new ArrayList();
        ((ArrayList) term94121).add(enum254);
        ((ArrayList) term94121).add(enum255);
        ((ArrayList) term94121).add(enum256);
        ((ArrayList) term94121).add(enum255);
        Class<? extends Object> term95527 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term95526 = ((Class) term95527).getDeclaredField((String) "TEST");
        ((Field) term95526).setAccessible(true);
        Object enum257 = ((Field) term95526).get((Object) null);
        ArrayList term94193 = new ArrayList();
        Class<? extends Object> term95806 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term95805 = ((Class) term95806).getDeclaredField((String) "DEEP_CREATURE");
        ((Field) term95805).setAccessible(true);
        Object enum258 = ((Field) term95805).get((Object) null);
        Class<? extends Object> term96122 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term96121 = ((Class) term96122).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term96121).setAccessible(true);
        Object enum259 = ((Field) term96121).get((Object) null);
        term94019 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term94020 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term94154 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term94020, term94020.getClass(), "id", "BGDjrSZTJY");
        setField(term94020, term94020.getClass(), "name", "VUVCEVItic");
        setField(term94020, term94020.getClass(), "nameSingle", "tloEDDASGy");
        setField(term94020, term94020.getClass(), "attitude", enum252);
        setField(term94020, term94020.getClass(), "imagePath", "CQMdMBIICe");
        setField(term94020, term94020.getClass(), "bridgeId", "rbJaIkrSnM");
        setField(term94020, term94020.getClass(), "spaceShipId", "EAKcPFEKbX");
        setField(term94020, term94020.getClass(), "socialSystem", enum253);
        setField(term94020, term94020.getClass(), "genderList", term94121);
        setField(term94020, term94020.getClass(), "speechSetId", "uPdAMNFhdG");
        setField(term94020, term94020.getClass(), "bridgeEffect", enum257);
        setField(term94154, term94154.getClass(), "songName", "VjXPlvOnMK");
        setField(term94154, term94154.getClass(), "author", "VVfwcKWfYk");
        setField(term94154, term94154.getClass(), "fileName", "tsYXZxQtLG");
        setBooleanField(term94154, term94154.getClass(), "custom", true);
        setIntField(term94154, term94154.getClass(), "fadingLimit", -1628863633);
        setField(term94020, term94020.getClass(), "diplomacyMusic", term94154);
        setField(term94020, term94020.getClass(), "traits", term94193);
        setField(term94020, term94020.getClass(), "leaderNameGenerator", enum258);
        setField(term94020, term94020.getClass(), "description", "JUAWRJdehl");
        setField(term94020, term94020.getClass(), "spaceRaceType", enum259);
        setField(term94019, term94019.getClass(), "race", term94020);
        setIntField(term94019, term94019.getClass(), "imageIndex", -450265927);
        setIntField(term94019, term94019.getClass(), "playerIndex", 914533606);
        setIntField(term94019, term94019.getClass(), "fleetIndex", 1857214977);
        setIntField(term94019, term94019.getClass(), "planetIndex", 756946672);
        setIntField(term94019, term94019.getClass(), "conflictIndex", 1363323545);
        term94247 = new Integer(-1090735178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term94247;
        callMethod(klass, "setPlayerIndex", argTypes, term94019, args);
    }

};


