package org.openRealmOfStars.player.race;

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
import static org.openRealmOfStars.player.race.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class SpaceRace_getProductionSpeed_174581189721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270121;
     Object enum833;

    public SpaceRace_getProductionSpeed_174581189721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term270395 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term270394 = ((Class) term270395).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term270394).setAccessible(true);
        Object enum825 = ((Field) term270394).get((Object) null);
        Class<? extends Object> term270692 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term270691 = ((Class) term270692).getDeclaredField((String) "EQUAL");
        ((Field) term270691).setAccessible(true);
        Object enum826 = ((Field) term270691).get((Object) null);
        Class<? extends Object> term270939 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term270938 = ((Class) term270939).getDeclaredField((String) "FEMALE");
        ((Field) term270938).setAccessible(true);
        Object enum827 =  ((Field) term270938).get((Object) null);
        Class<? extends Object> term271169 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term271168 = ((Class) term271169).getDeclaredField((String) "MALE");
        ((Field) term271168).setAccessible(true);
        Object enum828 =  ((Field) term271168).get((Object) null);
        Class<? extends Object> term271393 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term271392 = ((Class) term271393).getDeclaredField((String) "NONE");
        ((Field) term271392).setAccessible(true);
        Object enum829 =  ((Field) term271392).get((Object) null);
        ArrayList term270217 = new ArrayList();
        ((ArrayList) term270217).add(enum827);
        ((ArrayList) term270217).add(enum827);
        ((ArrayList) term270217).add(enum828);
        ((ArrayList) term270217).add(enum829);
        ((ArrayList) term270217).add(enum827);
        ((ArrayList) term270217).add(enum829);
        ((ArrayList) term270217).add(enum827);
        Class<? extends Object> term271627 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term271626 = ((Class) term271627).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term271626).setAccessible(true);
        Object enum830 = ((Field) term271626).get((Object) null);
        ArrayList term270306 = new ArrayList();
        ((ArrayList) term270306).add((Object)null);
        ((ArrayList) term270306).add((Object)null);
        ((ArrayList) term270306).add((Object)null);
        ((ArrayList) term270306).add((Object)null);
        ((ArrayList) term270306).add((Object)null);
        ((ArrayList) term270306).add((Object)null);
        ((ArrayList) term270306).add((Object)null);
        ((ArrayList) term270306).add((Object)null);
        Object term270301 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term270301, term270301.getClass(), "traitId", "");
        setField(term270301, term270301.getClass(), "traitName", "");
        setField(term270301, term270301.getClass(), "description", "");
        setField(term270301, term270301.getClass(), "group", "");
        setField(term270301, term270301.getClass(), "conflictsWithIds", term270306);
        setByteField(term270301, term270301.getClass(), "traitPoints", (byte) -42);
        ArrayList term270299 = new ArrayList();
        ((ArrayList) term270299).add(term270301);
        Class<? extends Object> term271927 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term271926 = ((Class) term271927).getDeclaredField((String) "ALL");
        ((Field) term271926).setAccessible(true);
        Object enum831 = ((Field) term271926).get((Object) null);
        Class<? extends Object> term272213 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term272212 = ((Class) term272213).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term272212).setAccessible(true);
        Object enum832 = ((Field) term272212).get((Object) null);
        term270121 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term270260 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term270121, term270121.getClass(), "id", "eeXAgrClVJ");
        setField(term270121, term270121.getClass(), "name", "tRRSLRxoVF");
        setField(term270121, term270121.getClass(), "nameSingle", "rogVlsxmoq");
        setField(term270121, term270121.getClass(), "attitude", enum825);
        setField(term270121, term270121.getClass(), "imagePath", "PcMQxtTThd");
        setField(term270121, term270121.getClass(), "bridgeId", "tlNezuIPME");
        setField(term270121, term270121.getClass(), "spaceShipId", "tEciBFrLbF");
        setField(term270121, term270121.getClass(), "socialSystem", enum826);
        setField(term270121, term270121.getClass(), "genderList", term270217);
        setField(term270121, term270121.getClass(), "speechSetId", "HABvqoZbct");
        setField(term270121, term270121.getClass(), "bridgeEffect", enum830);
        setField(term270260, term270260.getClass(), "songName", "CzDfpcxVwI");
        setField(term270260, term270260.getClass(), "author", "sUKfpEKBAS");
        setField(term270260, term270260.getClass(), "fileName", "anfAMeVVsC");
        setBooleanField(term270260, term270260.getClass(), "custom", true);
        setIntField(term270260, term270260.getClass(), "fadingLimit", 1711128633);
        setField(term270121, term270121.getClass(), "diplomacyMusic", term270260);
        setField(term270121, term270121.getClass(), "traits", term270299);
        setField(term270121, term270121.getClass(), "leaderNameGenerator", enum831);
        setField(term270121, term270121.getClass(), "description", "vWbSXhWaUM");
        setField(term270121, term270121.getClass(), "spaceRaceType", enum832);
        Class<? extends Object> term272489 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.GravityType");
        Field term272488 = ((Class) term272489).getDeclaredField((String) "HIGH_GRAVITY");
        ((Field) term272488).setAccessible(true);
        enum833 = ((Field) term272488).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.GravityType");
        Object[] args = new Object[1];
        args[0] = enum833;
        callMethod(klass, "getProductionSpeed", argTypes, term270121, args);
    }

};


