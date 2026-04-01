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

public class SpaceRace_isMonster_129136056952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343551;

    public SpaceRace_isMonster_129136056952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term343851 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term343850 = ((Class) term343851).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term343850).setAccessible(true);
        Object enum1063 = ((Field) term343850).get((Object) null);
        Class<? extends Object> term344148 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term344147 = ((Class) term344148).getDeclaredField((String) "EQUAL");
        ((Field) term344147).setAccessible(true);
        Object enum1064 = ((Field) term344147).get((Object) null);
        Class<? extends Object> term344395 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term344394 = ((Class) term344395).getDeclaredField((String) "FEMALE");
        ((Field) term344394).setAccessible(true);
        Object enum1065 =  ((Field) term344394).get((Object) null);
        Class<? extends Object> term344625 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term344624 = ((Class) term344625).getDeclaredField((String) "MALE");
        ((Field) term344624).setAccessible(true);
        Object enum1066 =  ((Field) term344624).get((Object) null);
        Class<? extends Object> term344849 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term344848 = ((Class) term344849).getDeclaredField((String) "FEMALE");
        ((Field) term344848).setAccessible(true);
        Object enum1067 =  ((Field) term344848).get((Object) null);
        ArrayList term343647 = new ArrayList();
        ((ArrayList) term343647).add(enum1065);
        ((ArrayList) term343647).add(enum1066);
        ((ArrayList) term343647).add(enum1067);
        ((ArrayList) term343647).add(enum1067);
        ((ArrayList) term343647).add(enum1067);
        ((ArrayList) term343647).add(enum1066);
        ((ArrayList) term343647).add(enum1067);
        ((ArrayList) term343647).add(enum1066);
        ((ArrayList) term343647).add(enum1065);
        Class<? extends Object> term345089 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term345088 = ((Class) term345089).getDeclaredField((String) "FUNGUS");
        ((Field) term345088).setAccessible(true);
        Object enum1068 = ((Field) term345088).get((Object) null);
        ArrayList term343731 = new ArrayList();
        ((ArrayList) term343731).add((Object)null);
        ((ArrayList) term343731).add((Object)null);
        ((ArrayList) term343731).add((Object)null);
        ((ArrayList) term343731).add((Object)null);
        ((ArrayList) term343731).add((Object)null);
        ((ArrayList) term343731).add((Object)null);
        ((ArrayList) term343731).add((Object)null);
        ((ArrayList) term343731).add((Object)null);
        Object term343726 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term343726, term343726.getClass(), "traitId", "");
        setField(term343726, term343726.getClass(), "traitName", "");
        setField(term343726, term343726.getClass(), "description", "");
        setField(term343726, term343726.getClass(), "group", "");
        setField(term343726, term343726.getClass(), "conflictsWithIds", term343731);
        setByteField(term343726, term343726.getClass(), "traitPoints", (byte) -116);
        ArrayList term343740 = new ArrayList();
        ((ArrayList) term343740).add((Object)null);
        ((ArrayList) term343740).add((Object)null);
        Object term343735 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term343735, term343735.getClass(), "traitId", "");
        setField(term343735, term343735.getClass(), "traitName", "");
        setField(term343735, term343735.getClass(), "description", "");
        setField(term343735, term343735.getClass(), "group", "");
        setField(term343735, term343735.getClass(), "conflictsWithIds", term343740);
        setByteField(term343735, term343735.getClass(), "traitPoints", (byte) 23);
        ArrayList term343749 = new ArrayList();
        ((ArrayList) term343749).add((Object)null);
        ((ArrayList) term343749).add((Object)null);
        ((ArrayList) term343749).add((Object)null);
        ((ArrayList) term343749).add((Object)null);
        ((ArrayList) term343749).add((Object)null);
        ((ArrayList) term343749).add((Object)null);
        ((ArrayList) term343749).add((Object)null);
        ((ArrayList) term343749).add((Object)null);
        ((ArrayList) term343749).add((Object)null);
        Object term343744 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term343744, term343744.getClass(), "traitId", "");
        setField(term343744, term343744.getClass(), "traitName", "");
        setField(term343744, term343744.getClass(), "description", "");
        setField(term343744, term343744.getClass(), "group", "");
        setField(term343744, term343744.getClass(), "conflictsWithIds", term343749);
        setByteField(term343744, term343744.getClass(), "traitPoints", (byte) -16);
        ArrayList term343758 = new ArrayList();
        ((ArrayList) term343758).add((Object)null);
        Object term343753 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term343753, term343753.getClass(), "traitId", "");
        setField(term343753, term343753.getClass(), "traitName", "");
        setField(term343753, term343753.getClass(), "description", "");
        setField(term343753, term343753.getClass(), "group", "");
        setField(term343753, term343753.getClass(), "conflictsWithIds", term343758);
        setByteField(term343753, term343753.getClass(), "traitPoints", (byte) -115);
        ArrayList term343767 = new ArrayList();
        Object term343762 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term343762, term343762.getClass(), "traitId", "");
        setField(term343762, term343762.getClass(), "traitName", "");
        setField(term343762, term343762.getClass(), "description", "");
        setField(term343762, term343762.getClass(), "group", "");
        setField(term343762, term343762.getClass(), "conflictsWithIds", term343767);
        setByteField(term343762, term343762.getClass(), "traitPoints", (byte) -87);
        ArrayList term343724 = new ArrayList();
        ((ArrayList) term343724).add(term343726);
        ((ArrayList) term343724).add(term343735);
        ((ArrayList) term343724).add(term343744);
        ((ArrayList) term343724).add(term343753);
        ((ArrayList) term343724).add(term343762);
        Class<? extends Object> term345374 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term345373 = ((Class) term345374).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term345373).setAccessible(true);
        Object enum1069 = ((Field) term345373).get((Object) null);
        Class<? extends Object> term345693 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term345692 = ((Class) term345693).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term345692).setAccessible(true);
        Object enum1070 = ((Field) term345692).get((Object) null);
        term343551 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term343685 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term343551, term343551.getClass(), "id", "YWxoRQOEME");
        setField(term343551, term343551.getClass(), "name", "rdsQSkVsuL");
        setField(term343551, term343551.getClass(), "nameSingle", "EfwSeKErKM");
        setField(term343551, term343551.getClass(), "attitude", enum1063);
        setField(term343551, term343551.getClass(), "imagePath", "ZgIkmfugqQ");
        setField(term343551, term343551.getClass(), "bridgeId", "NrbDMhIaRg");
        setField(term343551, term343551.getClass(), "spaceShipId", "ccILjTbPMz");
        setField(term343551, term343551.getClass(), "socialSystem", enum1064);
        setField(term343551, term343551.getClass(), "genderList", term343647);
        setField(term343551, term343551.getClass(), "speechSetId", "IuQgeDfBad");
        setField(term343551, term343551.getClass(), "bridgeEffect", enum1068);
        setField(term343685, term343685.getClass(), "songName", "gkhkYpAukg");
        setField(term343685, term343685.getClass(), "author", "lnYIyHaqvx");
        setField(term343685, term343685.getClass(), "fileName", "TUcJMtBUTR");
        setBooleanField(term343685, term343685.getClass(), "custom", true);
        setIntField(term343685, term343685.getClass(), "fadingLimit", 50996915);
        setField(term343551, term343551.getClass(), "diplomacyMusic", term343685);
        setField(term343551, term343551.getClass(), "traits", term343724);
        setField(term343551, term343551.getClass(), "leaderNameGenerator", enum1069);
        setField(term343551, term343551.getClass(), "description", "qZxkdvJOsd");
        setField(term343551, term343551.getClass(), "spaceRaceType", enum1070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMonster", argTypes, term343551, args);
    }

};


