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

public class SpaceRace_getRaceImagePathToWiki_85021395216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258527;

    public SpaceRace_getRaceImagePathToWiki_85021395216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term258814 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term258813 = ((Class) term258814).getDeclaredField((String) "BACKSTABBING");
        ((Field) term258813).setAccessible(true);
        Object enum788 = ((Field) term258813).get((Object) null);
        Class<? extends Object> term259117 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term259116 = ((Class) term259117).getDeclaredField((String) "EQUAL");
        ((Field) term259116).setAccessible(true);
        Object enum789 = ((Field) term259116).get((Object) null);
        Class<? extends Object> term259364 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term259363 = ((Class) term259364).getDeclaredField((String) "NONE");
        ((Field) term259363).setAccessible(true);
        Object enum790 =  ((Field) term259363).get((Object) null);
        Class<? extends Object> term259588 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term259587 = ((Class) term259588).getDeclaredField((String) "NONE");
        ((Field) term259587).setAccessible(true);
        Object enum791 =  ((Field) term259587).get((Object) null);
        ArrayList term258625 = new ArrayList();
        ((ArrayList) term258625).add(enum790);
        ((ArrayList) term258625).add(enum790);
        ((ArrayList) term258625).add(enum790);
        ((ArrayList) term258625).add(enum791);
        ((ArrayList) term258625).add(enum790);
        ((ArrayList) term258625).add(enum791);
        ((ArrayList) term258625).add(enum791);
        Class<? extends Object> term259822 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term259821 = ((Class) term259822).getDeclaredField((String) "NUKE_START");
        ((Field) term259821).setAccessible(true);
        Object enum792 = ((Field) term259821).get((Object) null);
        ArrayList term258709 = new ArrayList();
        ((ArrayList) term258709).add((Object)null);
        ((ArrayList) term258709).add((Object)null);
        ((ArrayList) term258709).add((Object)null);
        ((ArrayList) term258709).add((Object)null);
        Object term258704 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term258704, term258704.getClass(), "traitId", "");
        setField(term258704, term258704.getClass(), "traitName", "");
        setField(term258704, term258704.getClass(), "description", "");
        setField(term258704, term258704.getClass(), "group", "");
        setField(term258704, term258704.getClass(), "conflictsWithIds", term258709);
        setByteField(term258704, term258704.getClass(), "traitPoints", (byte) 48);
        ArrayList term258718 = new ArrayList();
        ((ArrayList) term258718).add((Object)null);
        ((ArrayList) term258718).add((Object)null);
        ((ArrayList) term258718).add((Object)null);
        ((ArrayList) term258718).add((Object)null);
        ((ArrayList) term258718).add((Object)null);
        ((ArrayList) term258718).add((Object)null);
        ((ArrayList) term258718).add((Object)null);
        ((ArrayList) term258718).add((Object)null);
        Object term258713 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term258713, term258713.getClass(), "traitId", "");
        setField(term258713, term258713.getClass(), "traitName", "");
        setField(term258713, term258713.getClass(), "description", "");
        setField(term258713, term258713.getClass(), "group", "");
        setField(term258713, term258713.getClass(), "conflictsWithIds", term258718);
        setByteField(term258713, term258713.getClass(), "traitPoints", (byte) 79);
        ArrayList term258727 = new ArrayList();
        Object term258722 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term258722, term258722.getClass(), "traitId", "");
        setField(term258722, term258722.getClass(), "traitName", "");
        setField(term258722, term258722.getClass(), "description", "");
        setField(term258722, term258722.getClass(), "group", "");
        setField(term258722, term258722.getClass(), "conflictsWithIds", term258727);
        setByteField(term258722, term258722.getClass(), "traitPoints", (byte) -19);
        ArrayList term258736 = new ArrayList();
        ((ArrayList) term258736).add((Object)null);
        Object term258731 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term258731, term258731.getClass(), "traitId", "");
        setField(term258731, term258731.getClass(), "traitName", "");
        setField(term258731, term258731.getClass(), "description", "");
        setField(term258731, term258731.getClass(), "group", "");
        setField(term258731, term258731.getClass(), "conflictsWithIds", term258736);
        setByteField(term258731, term258731.getClass(), "traitPoints", (byte) 75);
        ArrayList term258702 = new ArrayList();
        ((ArrayList) term258702).add(term258704);
        ((ArrayList) term258702).add(term258713);
        ((ArrayList) term258702).add(term258722);
        ((ArrayList) term258702).add(term258731);
        Class<? extends Object> term260119 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term260118 = ((Class) term260119).getDeclaredField((String) "MUSHROOM");
        ((Field) term260118).setAccessible(true);
        Object enum793 = ((Field) term260118).get((Object) null);
        Class<? extends Object> term260420 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term260419 = ((Class) term260420).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term260419).setAccessible(true);
        Object enum794 = ((Field) term260419).get((Object) null);
        term258527 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term258663 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term258527, term258527.getClass(), "id", "HqxxvASIJq");
        setField(term258527, term258527.getClass(), "name", "MBJxaagZhg");
        setField(term258527, term258527.getClass(), "nameSingle", "cpHleFahfl");
        setField(term258527, term258527.getClass(), "attitude", enum788);
        setField(term258527, term258527.getClass(), "imagePath", "fWZbsaquDq");
        setField(term258527, term258527.getClass(), "bridgeId", "HZUfvLLZWl");
        setField(term258527, term258527.getClass(), "spaceShipId", "uRtTKxfUmc");
        setField(term258527, term258527.getClass(), "socialSystem", enum789);
        setField(term258527, term258527.getClass(), "genderList", term258625);
        setField(term258527, term258527.getClass(), "speechSetId", "iMwYcIBemV");
        setField(term258527, term258527.getClass(), "bridgeEffect", enum792);
        setField(term258663, term258663.getClass(), "songName", "IsEKnDPoFO");
        setField(term258663, term258663.getClass(), "author", "LwUrUwnvds");
        setField(term258663, term258663.getClass(), "fileName", "sRQPBAZKAb");
        setBooleanField(term258663, term258663.getClass(), "custom", false);
        setIntField(term258663, term258663.getClass(), "fadingLimit", 72576894);
        setField(term258527, term258527.getClass(), "diplomacyMusic", term258663);
        setField(term258527, term258527.getClass(), "traits", term258702);
        setField(term258527, term258527.getClass(), "leaderNameGenerator", enum793);
        setField(term258527, term258527.getClass(), "description", "DRDfOzZyDb");
        setField(term258527, term258527.getClass(), "spaceRaceType", enum794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRaceImagePathToWiki", argTypes, term258527, args);
    }

};


