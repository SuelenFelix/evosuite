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

public class SpaceRace_isPirate_203047497053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345968;

    public SpaceRace_isPirate_203047497053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term346251 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term346250 = ((Class) term346251).getDeclaredField((String) "MERCHANTICAL");
        ((Field) term346250).setAccessible(true);
        Object enum1071 = ((Field) term346250).get((Object) null);
        Class<? extends Object> term346554 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term346553 = ((Class) term346554).getDeclaredField((String) "EQUAL");
        ((Field) term346553).setAccessible(true);
        Object enum1072 = ((Field) term346553).get((Object) null);
        Class<? extends Object> term346801 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term346800 = ((Class) term346801).getDeclaredField((String) "NONE");
        ((Field) term346800).setAccessible(true);
        Object enum1073 =  ((Field) term346800).get((Object) null);
        Class<? extends Object> term347025 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term347024 = ((Class) term347025).getDeclaredField((String) "MALE");
        ((Field) term347024).setAccessible(true);
        Object enum1074 =  ((Field) term347024).get((Object) null);
        Class<? extends Object> term347249 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term347248 = ((Class) term347249).getDeclaredField((String) "MALE");
        ((Field) term347248).setAccessible(true);
        Object enum1075 =  ((Field) term347248).get((Object) null);
        ArrayList term346066 = new ArrayList();
        ((ArrayList) term346066).add(enum1073);
        ((ArrayList) term346066).add(enum1074);
        ((ArrayList) term346066).add(enum1074);
        ((ArrayList) term346066).add(enum1074);
        ((ArrayList) term346066).add(enum1073);
        ((ArrayList) term346066).add(enum1074);
        ((ArrayList) term346066).add(enum1075);
        ((ArrayList) term346066).add(enum1075);
        Class<? extends Object> term347483 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term347482 = ((Class) term347483).getDeclaredField((String) "FUNGUS");
        ((Field) term347482).setAccessible(true);
        Object enum1076 = ((Field) term347482).get((Object) null);
        ArrayList term346150 = new ArrayList();
        ((ArrayList) term346150).add((Object)null);
        ((ArrayList) term346150).add((Object)null);
        Object term346145 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term346145, term346145.getClass(), "traitId", "");
        setField(term346145, term346145.getClass(), "traitName", "");
        setField(term346145, term346145.getClass(), "description", "");
        setField(term346145, term346145.getClass(), "group", "");
        setField(term346145, term346145.getClass(), "conflictsWithIds", term346150);
        setByteField(term346145, term346145.getClass(), "traitPoints", (byte) 16);
        ArrayList term346159 = new ArrayList();
        ((ArrayList) term346159).add((Object)null);
        ((ArrayList) term346159).add((Object)null);
        ((ArrayList) term346159).add((Object)null);
        Object term346154 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term346154, term346154.getClass(), "traitId", "");
        setField(term346154, term346154.getClass(), "traitName", "");
        setField(term346154, term346154.getClass(), "description", "");
        setField(term346154, term346154.getClass(), "group", "");
        setField(term346154, term346154.getClass(), "conflictsWithIds", term346159);
        setByteField(term346154, term346154.getClass(), "traitPoints", (byte) 62);
        ArrayList term346168 = new ArrayList();
        ((ArrayList) term346168).add((Object)null);
        ((ArrayList) term346168).add((Object)null);
        Object term346163 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term346163, term346163.getClass(), "traitId", "");
        setField(term346163, term346163.getClass(), "traitName", "");
        setField(term346163, term346163.getClass(), "description", "");
        setField(term346163, term346163.getClass(), "group", "");
        setField(term346163, term346163.getClass(), "conflictsWithIds", term346168);
        setByteField(term346163, term346163.getClass(), "traitPoints", (byte) 43);
        ArrayList term346143 = new ArrayList();
        ((ArrayList) term346143).add(term346145);
        ((ArrayList) term346143).add(term346154);
        ((ArrayList) term346143).add(term346163);
        Class<? extends Object> term347768 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term347767 = ((Class) term347768).getDeclaredField((String) "ANCIENT_ROMAN");
        ((Field) term347767).setAccessible(true);
        Object enum1077 = ((Field) term347767).get((Object) null);
        Class<? extends Object> term348084 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term348083 = ((Class) term348084).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term348083).setAccessible(true);
        Object enum1078 = ((Field) term348083).get((Object) null);
        term345968 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term346104 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term345968, term345968.getClass(), "id", "ZvanAlshXP");
        setField(term345968, term345968.getClass(), "name", "JsHqsJhBWD");
        setField(term345968, term345968.getClass(), "nameSingle", "qxayeVXQhZ");
        setField(term345968, term345968.getClass(), "attitude", enum1071);
        setField(term345968, term345968.getClass(), "imagePath", "SHVaBCTtHF");
        setField(term345968, term345968.getClass(), "bridgeId", "FYpENSbXJU");
        setField(term345968, term345968.getClass(), "spaceShipId", "lIbSpSPDyK");
        setField(term345968, term345968.getClass(), "socialSystem", enum1072);
        setField(term345968, term345968.getClass(), "genderList", term346066);
        setField(term345968, term345968.getClass(), "speechSetId", "XhiuPGVKrE");
        setField(term345968, term345968.getClass(), "bridgeEffect", enum1076);
        setField(term346104, term346104.getClass(), "songName", "SGOwXdQQSY");
        setField(term346104, term346104.getClass(), "author", "dHXclHCaUP");
        setField(term346104, term346104.getClass(), "fileName", "NNQTRipcCv");
        setBooleanField(term346104, term346104.getClass(), "custom", false);
        setIntField(term346104, term346104.getClass(), "fadingLimit", -241796987);
        setField(term345968, term345968.getClass(), "diplomacyMusic", term346104);
        setField(term345968, term345968.getClass(), "traits", term346143);
        setField(term345968, term345968.getClass(), "leaderNameGenerator", enum1077);
        setField(term345968, term345968.getClass(), "description", "YMfXRIYvot");
        setField(term345968, term345968.getClass(), "spaceRaceType", enum1078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPirate", argTypes, term345968, args);
    }

};


