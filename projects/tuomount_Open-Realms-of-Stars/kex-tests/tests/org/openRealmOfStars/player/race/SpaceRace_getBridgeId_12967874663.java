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

public class SpaceRace_getBridgeId_12967874663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228950;

    public SpaceRace_getBridgeId_12967874663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term229236 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term229235 = ((Class) term229236).getDeclaredField((String) "PEACEFUL");
        ((Field) term229235).setAccessible(true);
        Object enum693 = ((Field) term229235).get((Object) null);
        Class<? extends Object> term229527 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term229526 = ((Class) term229527).getDeclaredField((String) "MATRIARCHY");
        ((Field) term229526).setAccessible(true);
        Object enum694 = ((Field) term229526).get((Object) null);
        Class<? extends Object> term229789 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term229788 = ((Class) term229789).getDeclaredField((String) "NONE");
        ((Field) term229788).setAccessible(true);
        Object enum695 =  ((Field) term229788).get((Object) null);
        Class<? extends Object> term230013 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term230012 = ((Class) term230013).getDeclaredField((String) "FEMALE");
        ((Field) term230012).setAccessible(true);
        Object enum696 =  ((Field) term230012).get((Object) null);
        ArrayList term229049 = new ArrayList();
        ((ArrayList) term229049).add(enum695);
        ((ArrayList) term229049).add(enum695);
        ((ArrayList) term229049).add(enum696);
        ((ArrayList) term229049).add(enum696);
        ((ArrayList) term229049).add(enum695);
        ((ArrayList) term229049).add(enum695);
        Class<? extends Object> term230253 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term230252 = ((Class) term230253).getDeclaredField((String) "BRIGHT_CYAN");
        ((Field) term230252).setAccessible(true);
        Object enum697 = ((Field) term230252).get((Object) null);
        ArrayList term229134 = new ArrayList();
        ((ArrayList) term229134).add((Object)null);
        ((ArrayList) term229134).add((Object)null);
        ((ArrayList) term229134).add((Object)null);
        Object term229129 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229129, term229129.getClass(), "traitId", "");
        setField(term229129, term229129.getClass(), "traitName", "");
        setField(term229129, term229129.getClass(), "description", "");
        setField(term229129, term229129.getClass(), "group", "");
        setField(term229129, term229129.getClass(), "conflictsWithIds", term229134);
        setByteField(term229129, term229129.getClass(), "traitPoints", (byte) -37);
        ArrayList term229143 = new ArrayList();
        Object term229138 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229138, term229138.getClass(), "traitId", "");
        setField(term229138, term229138.getClass(), "traitName", "");
        setField(term229138, term229138.getClass(), "description", "");
        setField(term229138, term229138.getClass(), "group", "");
        setField(term229138, term229138.getClass(), "conflictsWithIds", term229143);
        setByteField(term229138, term229138.getClass(), "traitPoints", (byte) 34);
        ArrayList term229152 = new ArrayList();
        ((ArrayList) term229152).add((Object)null);
        ((ArrayList) term229152).add((Object)null);
        ((ArrayList) term229152).add((Object)null);
        ((ArrayList) term229152).add((Object)null);
        ((ArrayList) term229152).add((Object)null);
        ((ArrayList) term229152).add((Object)null);
        ((ArrayList) term229152).add((Object)null);
        Object term229147 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229147, term229147.getClass(), "traitId", "");
        setField(term229147, term229147.getClass(), "traitName", "");
        setField(term229147, term229147.getClass(), "description", "");
        setField(term229147, term229147.getClass(), "group", "");
        setField(term229147, term229147.getClass(), "conflictsWithIds", term229152);
        setByteField(term229147, term229147.getClass(), "traitPoints", (byte) 100);
        ArrayList term229161 = new ArrayList();
        ((ArrayList) term229161).add((Object)null);
        ((ArrayList) term229161).add((Object)null);
        ((ArrayList) term229161).add((Object)null);
        ((ArrayList) term229161).add((Object)null);
        ((ArrayList) term229161).add((Object)null);
        ((ArrayList) term229161).add((Object)null);
        Object term229156 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term229156, term229156.getClass(), "traitId", "");
        setField(term229156, term229156.getClass(), "traitName", "");
        setField(term229156, term229156.getClass(), "description", "");
        setField(term229156, term229156.getClass(), "group", "");
        setField(term229156, term229156.getClass(), "conflictsWithIds", term229161);
        setByteField(term229156, term229156.getClass(), "traitPoints", (byte) 26);
        ArrayList term229127 = new ArrayList();
        ((ArrayList) term229127).add(term229129);
        ((ArrayList) term229127).add(term229138);
        ((ArrayList) term229127).add(term229147);
        ((ArrayList) term229127).add(term229156);
        Class<? extends Object> term230553 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term230552 = ((Class) term230553).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term230552).setAccessible(true);
        Object enum698 = ((Field) term230552).get((Object) null);
        Class<? extends Object> term230863 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term230862 = ((Class) term230863).getDeclaredField((String) "REGULAR");
        ((Field) term230862).setAccessible(true);
        Object enum699 = ((Field) term230862).get((Object) null);
        term228950 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term229088 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term228950, term228950.getClass(), "id", "YlBAgLvyUu");
        setField(term228950, term228950.getClass(), "name", "sLlmeMSoXg");
        setField(term228950, term228950.getClass(), "nameSingle", "sCuUAZsHXx");
        setField(term228950, term228950.getClass(), "attitude", enum693);
        setField(term228950, term228950.getClass(), "imagePath", "AmRcDBBIwM");
        setField(term228950, term228950.getClass(), "bridgeId", "QQsshQCyqk");
        setField(term228950, term228950.getClass(), "spaceShipId", "PCWsEibBhR");
        setField(term228950, term228950.getClass(), "socialSystem", enum694);
        setField(term228950, term228950.getClass(), "genderList", term229049);
        setField(term228950, term228950.getClass(), "speechSetId", "OeHsepdQel");
        setField(term228950, term228950.getClass(), "bridgeEffect", enum697);
        setField(term229088, term229088.getClass(), "songName", "dyfeuNBHxU");
        setField(term229088, term229088.getClass(), "author", "JJtsuUsIeT");
        setField(term229088, term229088.getClass(), "fileName", "JeoRsvMLJu");
        setBooleanField(term229088, term229088.getClass(), "custom", false);
        setIntField(term229088, term229088.getClass(), "fadingLimit", -486471150);
        setField(term228950, term228950.getClass(), "diplomacyMusic", term229088);
        setField(term228950, term228950.getClass(), "traits", term229127);
        setField(term228950, term228950.getClass(), "leaderNameGenerator", enum698);
        setField(term228950, term228950.getClass(), "description", "WUgEHvRzvB");
        setField(term228950, term228950.getClass(), "spaceRaceType", enum699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBridgeId", argTypes, term228950, args);
    }

};


