package org.openRealmOfStars.player.diplomacy.speeches;

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
import static org.openRealmOfStars.player.diplomacy.speeches.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class SpeechFactory_createLine_5256314872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term17;

    public SpeechFactory_createLine_5256314872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term755 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term754 = ((Class) term755).getDeclaredField((String) "ASK_MOVE_SPY");
        ((Field) term754).setAccessible(true);
        enum0 = ((Field) term754).get((Object) null);
        Class<? extends Object> term1242 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term1241 = ((Class) term1242).getDeclaredField((String) "PEACEFUL");
        ((Field) term1241).setAccessible(true);
        Object enum1 = ((Field) term1241).get((Object) null);
        Class<? extends Object> term1570 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term1569 = ((Class) term1570).getDeclaredField((String) "PATRIARCHY");
        ((Field) term1569).setAccessible(true);
        Object enum2 = ((Field) term1569).get((Object) null);
        Class<? extends Object> term1861 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term1860 = ((Class) term1861).getDeclaredField((String) "MALE");
        ((Field) term1860).setAccessible(true);
        Object enum3 =  ((Field) term1860).get((Object) null);
        Class<? extends Object> term2085 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term2084 = ((Class) term2085).getDeclaredField((String) "NONE");
        ((Field) term2084).setAccessible(true);
        Object enum4 =  ((Field) term2084).get((Object) null);
        Class<? extends Object> term2309 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term2308 = ((Class) term2309).getDeclaredField((String) "FEMALE");
        ((Field) term2308).setAccessible(true);
        Object enum5 =  ((Field) term2308).get((Object) null);
        ArrayList term116 = new ArrayList();
        ((ArrayList) term116).add(enum3);
        ((ArrayList) term116).add(enum4);
        ((ArrayList) term116).add(enum3);
        ((ArrayList) term116).add(enum4);
        ((ArrayList) term116).add(enum5);
        Class<? extends Object> term2928 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term2927 = ((Class) term2928).getDeclaredField((String) "JUNGLE");
        ((Field) term2927).setAccessible(true);
        Object enum6 = ((Field) term2927).get((Object) null);
        ArrayList term200 = new ArrayList();
        ((ArrayList) term200).add((Object)null);
        ((ArrayList) term200).add((Object)null);
        ((ArrayList) term200).add((Object)null);
        Object term195 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term195, term195.getClass(), "traitId", "");
        setField(term195, term195.getClass(), "traitName", "");
        setField(term195, term195.getClass(), "description", "");
        setField(term195, term195.getClass(), "group", "");
        setField(term195, term195.getClass(), "conflictsWithIds", term200);
        setByteField(term195, term195.getClass(), "traitPoints", (byte) 47);
        ArrayList term209 = new ArrayList();
        ((ArrayList) term209).add((Object)null);
        ((ArrayList) term209).add((Object)null);
        ((ArrayList) term209).add((Object)null);
        ((ArrayList) term209).add((Object)null);
        Object term204 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term204, term204.getClass(), "traitId", "");
        setField(term204, term204.getClass(), "traitName", "");
        setField(term204, term204.getClass(), "description", "");
        setField(term204, term204.getClass(), "group", "");
        setField(term204, term204.getClass(), "conflictsWithIds", term209);
        setByteField(term204, term204.getClass(), "traitPoints", (byte) 48);
        ArrayList term218 = new ArrayList();
        ((ArrayList) term218).add((Object)null);
        Object term213 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term213, term213.getClass(), "traitId", "");
        setField(term213, term213.getClass(), "traitName", "");
        setField(term213, term213.getClass(), "description", "");
        setField(term213, term213.getClass(), "group", "");
        setField(term213, term213.getClass(), "conflictsWithIds", term218);
        setByteField(term213, term213.getClass(), "traitPoints", (byte) 89);
        ArrayList term227 = new ArrayList();
        ((ArrayList) term227).add((Object)null);
        ((ArrayList) term227).add((Object)null);
        ((ArrayList) term227).add((Object)null);
        ((ArrayList) term227).add((Object)null);
        ((ArrayList) term227).add((Object)null);
        ((ArrayList) term227).add((Object)null);
        Object term222 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term222, term222.getClass(), "traitId", "");
        setField(term222, term222.getClass(), "traitName", "");
        setField(term222, term222.getClass(), "description", "");
        setField(term222, term222.getClass(), "group", "");
        setField(term222, term222.getClass(), "conflictsWithIds", term227);
        setByteField(term222, term222.getClass(), "traitPoints", (byte) 75);
        ArrayList term193 = new ArrayList();
        ((ArrayList) term193).add(term195);
        ((ArrayList) term193).add(term204);
        ((ArrayList) term193).add(term213);
        ((ArrayList) term193).add(term222);
        Class<? extends Object> term3480 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term3479 = ((Class) term3480).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term3479).setAccessible(true);
        Object enum7 = ((Field) term3479).get((Object) null);
        Class<? extends Object> term3840 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term3839 = ((Class) term3840).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term3839).setAccessible(true);
        Object enum8 = ((Field) term3839).get((Object) null);
        term17 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term154 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term17, term17.getClass(), "id", "PAEBtnZtTD");
        setField(term17, term17.getClass(), "name", "sjlJAEtRrb");
        setField(term17, term17.getClass(), "nameSingle", "MuLcgQHgqz");
        setField(term17, term17.getClass(), "attitude", enum1);
        setField(term17, term17.getClass(), "imagePath", "xxtlPwDYFs");
        setField(term17, term17.getClass(), "bridgeId", "jJCZpVmanW");
        setField(term17, term17.getClass(), "spaceShipId", "EGtDIRbSSb");
        setField(term17, term17.getClass(), "socialSystem", enum2);
        setField(term17, term17.getClass(), "genderList", term116);
        setField(term17, term17.getClass(), "speechSetId", "SzjVpOQTyS");
        setField(term17, term17.getClass(), "bridgeEffect", enum6);
        setField(term154, term154.getClass(), "songName", "MjGYSRKTNF");
        setField(term154, term154.getClass(), "author", "hRNSzYYIrc");
        setField(term154, term154.getClass(), "fileName", "RMFIsYGgne");
        setBooleanField(term154, term154.getClass(), "custom", false);
        setIntField(term154, term154.getClass(), "fadingLimit", 568599855);
        setField(term17, term17.getClass(), "diplomacyMusic", term154);
        setField(term17, term17.getClass(), "traits", term193);
        setField(term17, term17.getClass(), "leaderNameGenerator", enum7);
        setField(term17, term17.getClass(), "description", "wSQxaModmm");
        setField(term17, term17.getClass(), "spaceRaceType", enum8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum0;
        args[1] = term17;
        args[2] = "UlajhuVLaP";
        callMethod(klass, "createLine", argTypes, null, args);
    }

};


