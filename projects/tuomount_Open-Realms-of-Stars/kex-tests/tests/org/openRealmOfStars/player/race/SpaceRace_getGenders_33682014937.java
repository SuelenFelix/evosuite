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

public class SpaceRace_getGenders_33682014937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308032;

    public SpaceRace_getGenders_33682014937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term308338 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term308337 = ((Class) term308338).getDeclaredField((String) "BACKSTABBING");
        ((Field) term308337).setAccessible(true);
        Object enum948 = ((Field) term308337).get((Object) null);
        Class<? extends Object> term308641 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term308640 = ((Class) term308641).getDeclaredField((String) "EQUAL");
        ((Field) term308640).setAccessible(true);
        Object enum949 = ((Field) term308640).get((Object) null);
        Class<? extends Object> term308888 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term308887 = ((Class) term308888).getDeclaredField((String) "FEMALE");
        ((Field) term308887).setAccessible(true);
        Object enum950 =  ((Field) term308887).get((Object) null);
        Class<? extends Object> term309118 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term309117 = ((Class) term309118).getDeclaredField((String) "FEMALE");
        ((Field) term309117).setAccessible(true);
        Object enum951 =  ((Field) term309117).get((Object) null);
        Class<? extends Object> term309348 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term309347 = ((Class) term309348).getDeclaredField((String) "MALE");
        ((Field) term309347).setAccessible(true);
        Object enum952 =  ((Field) term309347).get((Object) null);
        ArrayList term308130 = new ArrayList();
        ((ArrayList) term308130).add(enum950);
        ((ArrayList) term308130).add(enum951);
        ((ArrayList) term308130).add(enum951);
        ((ArrayList) term308130).add(enum951);
        ((ArrayList) term308130).add(enum952);
        ((ArrayList) term308130).add(enum950);
        ((ArrayList) term308130).add(enum950);
        Class<? extends Object> term309582 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term309581 = ((Class) term309582).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term309581).setAccessible(true);
        Object enum953 = ((Field) term309581).get((Object) null);
        ArrayList term308219 = new ArrayList();
        ((ArrayList) term308219).add((Object)null);
        ((ArrayList) term308219).add((Object)null);
        ((ArrayList) term308219).add((Object)null);
        ((ArrayList) term308219).add((Object)null);
        ((ArrayList) term308219).add((Object)null);
        ((ArrayList) term308219).add((Object)null);
        Object term308214 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term308214, term308214.getClass(), "traitId", "");
        setField(term308214, term308214.getClass(), "traitName", "");
        setField(term308214, term308214.getClass(), "description", "");
        setField(term308214, term308214.getClass(), "group", "");
        setField(term308214, term308214.getClass(), "conflictsWithIds", term308219);
        setByteField(term308214, term308214.getClass(), "traitPoints", (byte) -87);
        ArrayList term308228 = new ArrayList();
        ((ArrayList) term308228).add((Object)null);
        ((ArrayList) term308228).add((Object)null);
        ((ArrayList) term308228).add((Object)null);
        ((ArrayList) term308228).add((Object)null);
        ((ArrayList) term308228).add((Object)null);
        ((ArrayList) term308228).add((Object)null);
        ((ArrayList) term308228).add((Object)null);
        ((ArrayList) term308228).add((Object)null);
        Object term308223 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term308223, term308223.getClass(), "traitId", "");
        setField(term308223, term308223.getClass(), "traitName", "");
        setField(term308223, term308223.getClass(), "description", "");
        setField(term308223, term308223.getClass(), "group", "");
        setField(term308223, term308223.getClass(), "conflictsWithIds", term308228);
        setByteField(term308223, term308223.getClass(), "traitPoints", (byte) -38);
        ArrayList term308237 = new ArrayList();
        ((ArrayList) term308237).add((Object)null);
        ((ArrayList) term308237).add((Object)null);
        ((ArrayList) term308237).add((Object)null);
        ((ArrayList) term308237).add((Object)null);
        ((ArrayList) term308237).add((Object)null);
        Object term308232 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term308232, term308232.getClass(), "traitId", "");
        setField(term308232, term308232.getClass(), "traitName", "");
        setField(term308232, term308232.getClass(), "description", "");
        setField(term308232, term308232.getClass(), "group", "");
        setField(term308232, term308232.getClass(), "conflictsWithIds", term308237);
        setByteField(term308232, term308232.getClass(), "traitPoints", (byte) -45);
        ArrayList term308246 = new ArrayList();
        ((ArrayList) term308246).add((Object)null);
        ((ArrayList) term308246).add((Object)null);
        ((ArrayList) term308246).add((Object)null);
        ((ArrayList) term308246).add((Object)null);
        ((ArrayList) term308246).add((Object)null);
        ((ArrayList) term308246).add((Object)null);
        ((ArrayList) term308246).add((Object)null);
        ((ArrayList) term308246).add((Object)null);
        Object term308241 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term308241, term308241.getClass(), "traitId", "");
        setField(term308241, term308241.getClass(), "traitName", "");
        setField(term308241, term308241.getClass(), "description", "");
        setField(term308241, term308241.getClass(), "group", "");
        setField(term308241, term308241.getClass(), "conflictsWithIds", term308246);
        setByteField(term308241, term308241.getClass(), "traitPoints", (byte) -30);
        ArrayList term308255 = new ArrayList();
        ((ArrayList) term308255).add((Object)null);
        ((ArrayList) term308255).add((Object)null);
        ((ArrayList) term308255).add((Object)null);
        ((ArrayList) term308255).add((Object)null);
        ((ArrayList) term308255).add((Object)null);
        ((ArrayList) term308255).add((Object)null);
        ((ArrayList) term308255).add((Object)null);
        ((ArrayList) term308255).add((Object)null);
        ((ArrayList) term308255).add((Object)null);
        Object term308250 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term308250, term308250.getClass(), "traitId", "");
        setField(term308250, term308250.getClass(), "traitName", "");
        setField(term308250, term308250.getClass(), "description", "");
        setField(term308250, term308250.getClass(), "group", "");
        setField(term308250, term308250.getClass(), "conflictsWithIds", term308255);
        setByteField(term308250, term308250.getClass(), "traitPoints", (byte) 18);
        ArrayList term308212 = new ArrayList();
        ((ArrayList) term308212).add(term308214);
        ((ArrayList) term308212).add(term308223);
        ((ArrayList) term308212).add(term308232);
        ((ArrayList) term308212).add(term308241);
        ((ArrayList) term308212).add(term308250);
        Class<? extends Object> term309882 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term309881 = ((Class) term309882).getDeclaredField((String) "ANCIENT_ROMAN");
        ((Field) term309881).setAccessible(true);
        Object enum954 = ((Field) term309881).get((Object) null);
        Class<? extends Object> term310198 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term310197 = ((Class) term310198).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term310197).setAccessible(true);
        Object enum955 = ((Field) term310197).get((Object) null);
        term308032 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term308173 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term308032, term308032.getClass(), "id", "FdzDmAbJCC");
        setField(term308032, term308032.getClass(), "name", "OSXAuRuAau");
        setField(term308032, term308032.getClass(), "nameSingle", "azsnWqwRkF");
        setField(term308032, term308032.getClass(), "attitude", enum948);
        setField(term308032, term308032.getClass(), "imagePath", "VytBIaPeoV");
        setField(term308032, term308032.getClass(), "bridgeId", "eVeQiooIie");
        setField(term308032, term308032.getClass(), "spaceShipId", "tBvyiKlvwt");
        setField(term308032, term308032.getClass(), "socialSystem", enum949);
        setField(term308032, term308032.getClass(), "genderList", term308130);
        setField(term308032, term308032.getClass(), "speechSetId", "cbrJBcmzzA");
        setField(term308032, term308032.getClass(), "bridgeEffect", enum953);
        setField(term308173, term308173.getClass(), "songName", "MQEpjCONzM");
        setField(term308173, term308173.getClass(), "author", "NYzdiIdifj");
        setField(term308173, term308173.getClass(), "fileName", "QShAEmzTpm");
        setBooleanField(term308173, term308173.getClass(), "custom", true);
        setIntField(term308173, term308173.getClass(), "fadingLimit", -117720047);
        setField(term308032, term308032.getClass(), "diplomacyMusic", term308173);
        setField(term308032, term308032.getClass(), "traits", term308212);
        setField(term308032, term308032.getClass(), "leaderNameGenerator", enum954);
        setField(term308032, term308032.getClass(), "description", "VxtdFZGhCL");
        setField(term308032, term308032.getClass(), "spaceRaceType", enum955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenders", argTypes, term308032, args);
    }

};


