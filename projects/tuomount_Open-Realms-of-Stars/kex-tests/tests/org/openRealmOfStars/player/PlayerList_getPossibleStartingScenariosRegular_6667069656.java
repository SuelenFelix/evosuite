package org.openRealmOfStars.player;

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
import static org.openRealmOfStars.player.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PlayerList_getPossibleStartingScenariosRegular_6667069656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2743675;

    public PlayerList_getPossibleStartingScenariosRegular_6667069656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2743929 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term2743928 = ((Class) term2743929).getDeclaredField((String) "LOGICAL");
        ((Field) term2743928).setAccessible(true);
        Object enum8399 = ((Field) term2743928).get((Object) null);
        Class<? extends Object> term2744217 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term2744216 = ((Class) term2744217).getDeclaredField((String) "EQUAL");
        ((Field) term2744216).setAccessible(true);
        Object enum8400 = ((Field) term2744216).get((Object) null);
        Class<? extends Object> term2744464 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term2744463 = ((Class) term2744464).getDeclaredField((String) "MALE");
        ((Field) term2744463).setAccessible(true);
        Object enum8401 =  ((Field) term2744463).get((Object) null);
        ArrayList term2743768 = new ArrayList();
        ((ArrayList) term2743768).add(enum8401);
        Class<? extends Object> term2744698 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term2744697 = ((Class) term2744698).getDeclaredField((String) "GREEN_CONSOLE");
        ((Field) term2744697).setAccessible(true);
        Object enum8402 = ((Field) term2744697).get((Object) null);
        ArrayList term2743851 = new ArrayList();
        Object term2743846 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term2743846, term2743846.getClass(), "traitId", "");
        setField(term2743846, term2743846.getClass(), "traitName", "");
        setField(term2743846, term2743846.getClass(), "description", "");
        setField(term2743846, term2743846.getClass(), "group", "");
        setField(term2743846, term2743846.getClass(), "conflictsWithIds", term2743851);
        setByteField(term2743846, term2743846.getClass(), "traitPoints", (byte) 25);
        ArrayList term2743844 = new ArrayList();
        ((ArrayList) term2743844).add(term2743846);
        Class<? extends Object> term2745004 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term2745003 = ((Class) term2745004).getDeclaredField((String) "MUSHROOM");
        ((Field) term2745003).setAccessible(true);
        Object enum8403 = ((Field) term2745003).get((Object) null);
        Class<? extends Object> term2745305 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term2745304 = ((Class) term2745305).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term2745304).setAccessible(true);
        Object enum8404 = ((Field) term2745304).get((Object) null);
        term2743675 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term2743805 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term2743675, term2743675.getClass(), "id", "ieOksAzOvN");
        setField(term2743675, term2743675.getClass(), "name", "NhSEQGsvMy");
        setField(term2743675, term2743675.getClass(), "nameSingle", "XmPfiHcfuE");
        setField(term2743675, term2743675.getClass(), "attitude", enum8399);
        setField(term2743675, term2743675.getClass(), "imagePath", "ELkAUGhpfy");
        setField(term2743675, term2743675.getClass(), "bridgeId", "zUGAswPSsw");
        setField(term2743675, term2743675.getClass(), "spaceShipId", "mbQvaMehkO");
        setField(term2743675, term2743675.getClass(), "socialSystem", enum8400);
        setField(term2743675, term2743675.getClass(), "genderList", term2743768);
        setField(term2743675, term2743675.getClass(), "speechSetId", "NgVtnmneqG");
        setField(term2743675, term2743675.getClass(), "bridgeEffect", enum8402);
        setField(term2743805, term2743805.getClass(), "songName", "HhwvGaJIWL");
        setField(term2743805, term2743805.getClass(), "author", "XjqAOBXWmG");
        setField(term2743805, term2743805.getClass(), "fileName", "zaKisJjrrB");
        setBooleanField(term2743805, term2743805.getClass(), "custom", false);
        setIntField(term2743805, term2743805.getClass(), "fadingLimit", -1079966670);
        setField(term2743675, term2743675.getClass(), "diplomacyMusic", term2743805);
        setField(term2743675, term2743675.getClass(), "traits", term2743844);
        setField(term2743675, term2743675.getClass(), "leaderNameGenerator", enum8403);
        setField(term2743675, term2743675.getClass(), "description", "ZJhlplhlds");
        setField(term2743675, term2743675.getClass(), "spaceRaceType", enum8404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[1];
        args[0] = term2743675;
        callMethod(klass, "getPossibleStartingScenariosRegular", argTypes, null, args);
    }

};


