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

public class PlayerInfo_init_183706700717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4554144;

    public PlayerInfo_init_183706700717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4554408 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term4554407 = ((Class) term4554408).getDeclaredField((String) "LOGICAL");
        ((Field) term4554407).setAccessible(true);
        Object enum14126 = ((Field) term4554407).get((Object) null);
        Class<? extends Object> term4554696 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term4554695 = ((Class) term4554696).getDeclaredField((String) "PATRIARCHY");
        ((Field) term4554695).setAccessible(true);
        Object enum14127 = ((Field) term4554695).get((Object) null);
        Class<? extends Object> term4554958 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term4554957 = ((Class) term4554958).getDeclaredField((String) "NONE");
        ((Field) term4554957).setAccessible(true);
        Object enum14128 =  ((Field) term4554957).get((Object) null);
        Class<? extends Object> term4555182 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term4555181 = ((Class) term4555182).getDeclaredField((String) "MALE");
        ((Field) term4555181).setAccessible(true);
        Object enum14129 =  ((Field) term4555181).get((Object) null);
        Class<? extends Object> term4555406 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term4555405 = ((Class) term4555406).getDeclaredField((String) "MALE");
        ((Field) term4555405).setAccessible(true);
        Object enum14130 =  ((Field) term4555405).get((Object) null);
        ArrayList term4554242 = new ArrayList();
        ((ArrayList) term4554242).add(enum14128);
        ((ArrayList) term4554242).add(enum14129);
        ((ArrayList) term4554242).add(enum14130);
        ((ArrayList) term4554242).add(enum14128);
        ((ArrayList) term4554242).add(enum14129);
        ((ArrayList) term4554242).add(enum14129);
        ((ArrayList) term4554242).add(enum14128);
        Class<? extends Object> term4555640 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term4555639 = ((Class) term4555640).getDeclaredField((String) "WARM_WHITE");
        ((Field) term4555639).setAccessible(true);
        Object enum14131 = ((Field) term4555639).get((Object) null);
        ArrayList term4554330 = new ArrayList();
        ((ArrayList) term4554330).add((Object)null);
        ((ArrayList) term4554330).add((Object)null);
        ((ArrayList) term4554330).add((Object)null);
        ((ArrayList) term4554330).add((Object)null);
        ((ArrayList) term4554330).add((Object)null);
        ((ArrayList) term4554330).add((Object)null);
        ((ArrayList) term4554330).add((Object)null);
        ((ArrayList) term4554330).add((Object)null);
        ((ArrayList) term4554330).add((Object)null);
        Object term4554325 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term4554325, term4554325.getClass(), "traitId", "");
        setField(term4554325, term4554325.getClass(), "traitName", "");
        setField(term4554325, term4554325.getClass(), "description", "");
        setField(term4554325, term4554325.getClass(), "group", "");
        setField(term4554325, term4554325.getClass(), "conflictsWithIds", term4554330);
        setByteField(term4554325, term4554325.getClass(), "traitPoints", (byte) -6);
        ArrayList term4554323 = new ArrayList();
        ((ArrayList) term4554323).add(term4554325);
        Class<? extends Object> term4555937 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term4555936 = ((Class) term4555937).getDeclaredField((String) "SPACE_ORC");
        ((Field) term4555936).setAccessible(true);
        Object enum14132 = ((Field) term4555936).get((Object) null);
        Class<? extends Object> term4556241 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term4556240 = ((Class) term4556241).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term4556240).setAccessible(true);
        Object enum14133 = ((Field) term4556240).get((Object) null);
        term4554144 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term4554284 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term4554144, term4554144.getClass(), "id", "TjuTAdjCll");
        setField(term4554144, term4554144.getClass(), "name", "sQZQmhdQUF");
        setField(term4554144, term4554144.getClass(), "nameSingle", "CmgeCJaLef");
        setField(term4554144, term4554144.getClass(), "attitude", enum14126);
        setField(term4554144, term4554144.getClass(), "imagePath", "RRcVoRNVdN");
        setField(term4554144, term4554144.getClass(), "bridgeId", "kyqWbTokWm");
        setField(term4554144, term4554144.getClass(), "spaceShipId", "lsGVFiSwaq");
        setField(term4554144, term4554144.getClass(), "socialSystem", enum14127);
        setField(term4554144, term4554144.getClass(), "genderList", term4554242);
        setField(term4554144, term4554144.getClass(), "speechSetId", "ixxqWYJDVX");
        setField(term4554144, term4554144.getClass(), "bridgeEffect", enum14131);
        setField(term4554284, term4554284.getClass(), "songName", "LUQbvcJerz");
        setField(term4554284, term4554284.getClass(), "author", "xIGtyYBYuj");
        setField(term4554284, term4554284.getClass(), "fileName", "yIKtZBrdwX");
        setBooleanField(term4554284, term4554284.getClass(), "custom", true);
        setIntField(term4554284, term4554284.getClass(), "fadingLimit", -1984876923);
        setField(term4554144, term4554144.getClass(), "diplomacyMusic", term4554284);
        setField(term4554144, term4554144.getClass(), "traits", term4554323);
        setField(term4554144, term4554144.getClass(), "leaderNameGenerator", enum14132);
        setField(term4554144, term4554144.getClass(), "description", "LIjfmSgcJI");
        setField(term4554144, term4554144.getClass(), "spaceRaceType", enum14133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[1];
        args[0] = term4554144;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


