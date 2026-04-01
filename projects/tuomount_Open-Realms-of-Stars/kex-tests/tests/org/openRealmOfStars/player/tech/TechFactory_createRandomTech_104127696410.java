package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class TechFactory_createRandomTech_104127696410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum473;
     Object term160151;
     Object term160153;
     Object term160154;

    public TechFactory_createRandomTech_104127696410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term160442 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term160441 = ((Class) term160442).getDeclaredField((String) "Electrics");
        ((Field) term160441).setAccessible(true);
        enum473 = ((Field) term160441).get((Object) null);
        term160151 = new Integer(1137154606);
        term160153 = (Object[]) newArray("org.openRealmOfStars.player.tech.Tech", 0);
        Class<? extends Object> term160711 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term160710 = ((Class) term160711).getDeclaredField((String) "MILITARISTIC");
        ((Field) term160710).setAccessible(true);
        Object enum474 = ((Field) term160710).get((Object) null);
        Class<? extends Object> term161014 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term161013 = ((Class) term161014).getDeclaredField((String) "MATRIARCHY");
        ((Field) term161013).setAccessible(true);
        Object enum475 = ((Field) term161013).get((Object) null);
        Class<? extends Object> term161276 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term161275 = ((Class) term161276).getDeclaredField((String) "FEMALE");
        ((Field) term161275).setAccessible(true);
        Object enum476 =  ((Field) term161275).get((Object) null);
        Class<? extends Object> term161506 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term161505 = ((Class) term161506).getDeclaredField((String) "MALE");
        ((Field) term161505).setAccessible(true);
        Object enum477 =  ((Field) term161505).get((Object) null);
        ArrayList term160257 = new ArrayList();
        ((ArrayList) term160257).add(enum476);
        ((ArrayList) term160257).add(enum476);
        ((ArrayList) term160257).add(enum477);
        ((ArrayList) term160257).add(enum477);
        ((ArrayList) term160257).add(enum476);
        ((ArrayList) term160257).add(enum476);
        ((ArrayList) term160257).add(enum477);
        Class<? extends Object> term161740 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term161739 = ((Class) term161740).getDeclaredField((String) "BRIGHT_CYAN");
        ((Field) term161739).setAccessible(true);
        Object enum478 = ((Field) term161739).get((Object) null);
        ArrayList term160342 = new ArrayList();
        ((ArrayList) term160342).add((Object)null);
        Object term160337 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term160337, term160337.getClass(), "traitId", "");
        setField(term160337, term160337.getClass(), "traitName", "");
        setField(term160337, term160337.getClass(), "description", "");
        setField(term160337, term160337.getClass(), "group", "");
        setField(term160337, term160337.getClass(), "conflictsWithIds", term160342);
        setByteField(term160337, term160337.getClass(), "traitPoints", (byte) 49);
        ArrayList term160351 = new ArrayList();
        Object term160346 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term160346, term160346.getClass(), "traitId", "");
        setField(term160346, term160346.getClass(), "traitName", "");
        setField(term160346, term160346.getClass(), "description", "");
        setField(term160346, term160346.getClass(), "group", "");
        setField(term160346, term160346.getClass(), "conflictsWithIds", term160351);
        setByteField(term160346, term160346.getClass(), "traitPoints", (byte) 114);
        ArrayList term160360 = new ArrayList();
        Object term160355 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term160355, term160355.getClass(), "traitId", "");
        setField(term160355, term160355.getClass(), "traitName", "");
        setField(term160355, term160355.getClass(), "description", "");
        setField(term160355, term160355.getClass(), "group", "");
        setField(term160355, term160355.getClass(), "conflictsWithIds", term160360);
        setByteField(term160355, term160355.getClass(), "traitPoints", (byte) -81);
        ArrayList term160369 = new ArrayList();
        ((ArrayList) term160369).add((Object)null);
        Object term160364 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term160364, term160364.getClass(), "traitId", "");
        setField(term160364, term160364.getClass(), "traitName", "");
        setField(term160364, term160364.getClass(), "description", "");
        setField(term160364, term160364.getClass(), "group", "");
        setField(term160364, term160364.getClass(), "conflictsWithIds", term160369);
        setByteField(term160364, term160364.getClass(), "traitPoints", (byte) 127);
        ArrayList term160378 = new ArrayList();
        ((ArrayList) term160378).add((Object)null);
        ((ArrayList) term160378).add((Object)null);
        ((ArrayList) term160378).add((Object)null);
        ((ArrayList) term160378).add((Object)null);
        ((ArrayList) term160378).add((Object)null);
        ((ArrayList) term160378).add((Object)null);
        ((ArrayList) term160378).add((Object)null);
        Object term160373 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term160373, term160373.getClass(), "traitId", "");
        setField(term160373, term160373.getClass(), "traitName", "");
        setField(term160373, term160373.getClass(), "description", "");
        setField(term160373, term160373.getClass(), "group", "");
        setField(term160373, term160373.getClass(), "conflictsWithIds", term160378);
        setByteField(term160373, term160373.getClass(), "traitPoints", (byte) -24);
        ArrayList term160387 = new ArrayList();
        Object term160382 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term160382, term160382.getClass(), "traitId", "");
        setField(term160382, term160382.getClass(), "traitName", "");
        setField(term160382, term160382.getClass(), "description", "");
        setField(term160382, term160382.getClass(), "group", "");
        setField(term160382, term160382.getClass(), "conflictsWithIds", term160387);
        setByteField(term160382, term160382.getClass(), "traitPoints", (byte) -89);
        ArrayList term160396 = new ArrayList();
        ((ArrayList) term160396).add((Object)null);
        ((ArrayList) term160396).add((Object)null);
        ((ArrayList) term160396).add((Object)null);
        ((ArrayList) term160396).add((Object)null);
        ((ArrayList) term160396).add((Object)null);
        Object term160391 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term160391, term160391.getClass(), "traitId", "");
        setField(term160391, term160391.getClass(), "traitName", "");
        setField(term160391, term160391.getClass(), "description", "");
        setField(term160391, term160391.getClass(), "group", "");
        setField(term160391, term160391.getClass(), "conflictsWithIds", term160396);
        setByteField(term160391, term160391.getClass(), "traitPoints", (byte) -35);
        ArrayList term160335 = new ArrayList();
        ((ArrayList) term160335).add(term160337);
        ((ArrayList) term160335).add(term160346);
        ((ArrayList) term160335).add(term160355);
        ((ArrayList) term160335).add(term160364);
        ((ArrayList) term160335).add(term160373);
        ((ArrayList) term160335).add(term160382);
        ((ArrayList) term160335).add(term160391);
        Class<? extends Object> term162040 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term162039 = ((Class) term162040).getDeclaredField((String) "FEMALE_ROBOT");
        ((Field) term162039).setAccessible(true);
        Object enum479 = ((Field) term162039).get((Object) null);
        Class<? extends Object> term162353 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term162352 = ((Class) term162353).getDeclaredField((String) "REGULAR");
        ((Field) term162352).setAccessible(true);
        Object enum480 = ((Field) term162352).get((Object) null);
        term160154 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term160296 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term160154, term160154.getClass(), "id", "JARLxkvqNB");
        setField(term160154, term160154.getClass(), "name", "tNcVErsFVe");
        setField(term160154, term160154.getClass(), "nameSingle", "DnCwTIIzcH");
        setField(term160154, term160154.getClass(), "attitude", enum474);
        setField(term160154, term160154.getClass(), "imagePath", "ULOSEQkLaZ");
        setField(term160154, term160154.getClass(), "bridgeId", "frsRnTwGAg");
        setField(term160154, term160154.getClass(), "spaceShipId", "mLdICgTzLU");
        setField(term160154, term160154.getClass(), "socialSystem", enum475);
        setField(term160154, term160154.getClass(), "genderList", term160257);
        setField(term160154, term160154.getClass(), "speechSetId", "MgDkHuQnRs");
        setField(term160154, term160154.getClass(), "bridgeEffect", enum478);
        setField(term160296, term160296.getClass(), "songName", "iEeRhESASl");
        setField(term160296, term160296.getClass(), "author", "eywpqasaKj");
        setField(term160296, term160296.getClass(), "fileName", "QnaLMKXAzJ");
        setBooleanField(term160296, term160296.getClass(), "custom", false);
        setIntField(term160296, term160296.getClass(), "fadingLimit", -100681578);
        setField(term160154, term160154.getClass(), "diplomacyMusic", term160296);
        setField(term160154, term160154.getClass(), "traits", term160335);
        setField(term160154, term160154.getClass(), "leaderNameGenerator", enum479);
        setField(term160154, term160154.getClass(), "description", "DYaMGxxqDk");
        setField(term160154, term160154.getClass(), "spaceRaceType", enum480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.Tech"), 0).getClass();
        argTypes[3] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[4];
        args[0] = enum473;
        args[1] = term160151;
        args[2] = term160153;
        args[3] = term160154;
        callMethod(klass, "createRandomTech", argTypes, null, args);
    }

};


