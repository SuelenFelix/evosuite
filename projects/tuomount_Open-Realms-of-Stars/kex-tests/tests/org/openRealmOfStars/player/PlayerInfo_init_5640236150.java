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
import java.lang.Integer;

public class PlayerInfo_init_5640236150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4484870;
     Object term4485111;
     Object term4485113;

    public PlayerInfo_init_5640236150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4485146 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term4485145 = ((Class) term4485146).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term4485145).setAccessible(true);
        Object enum13908 = ((Field) term4485145).get((Object) null);
        Class<? extends Object> term4485443 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term4485442 = ((Class) term4485443).getDeclaredField((String) "EQUAL");
        ((Field) term4485442).setAccessible(true);
        Object enum13909 = ((Field) term4485442).get((Object) null);
        Class<? extends Object> term4485690 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term4485689 = ((Class) term4485690).getDeclaredField((String) "FEMALE");
        ((Field) term4485689).setAccessible(true);
        Object enum13910 =  ((Field) term4485689).get((Object) null);
        Class<? extends Object> term4485920 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term4485919 = ((Class) term4485920).getDeclaredField((String) "MALE");
        ((Field) term4485919).setAccessible(true);
        Object enum13911 =  ((Field) term4485919).get((Object) null);
        Class<? extends Object> term4486144 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term4486143 = ((Class) term4486144).getDeclaredField((String) "FEMALE");
        ((Field) term4486143).setAccessible(true);
        Object enum13912 =  ((Field) term4486143).get((Object) null);
        ArrayList term4484966 = new ArrayList();
        ((ArrayList) term4484966).add(enum13910);
        ((ArrayList) term4484966).add(enum13911);
        ((ArrayList) term4484966).add(enum13912);
        ((ArrayList) term4484966).add(enum13910);
        ((ArrayList) term4484966).add(enum13912);
        ((ArrayList) term4484966).add(enum13911);
        ((ArrayList) term4484966).add(enum13910);
        ((ArrayList) term4484966).add(enum13911);
        Class<? extends Object> term4486384 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term4486383 = ((Class) term4486384).getDeclaredField((String) "FADE_IN_START");
        ((Field) term4486383).setAccessible(true);
        Object enum13913 = ((Field) term4486383).get((Object) null);
        ArrayList term4485057 = new ArrayList();
        ((ArrayList) term4485057).add((Object)null);
        ((ArrayList) term4485057).add((Object)null);
        ((ArrayList) term4485057).add((Object)null);
        ((ArrayList) term4485057).add((Object)null);
        ((ArrayList) term4485057).add((Object)null);
        ((ArrayList) term4485057).add((Object)null);
        ((ArrayList) term4485057).add((Object)null);
        Object term4485052 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term4485052, term4485052.getClass(), "traitId", "");
        setField(term4485052, term4485052.getClass(), "traitName", "");
        setField(term4485052, term4485052.getClass(), "description", "");
        setField(term4485052, term4485052.getClass(), "group", "");
        setField(term4485052, term4485052.getClass(), "conflictsWithIds", term4485057);
        setByteField(term4485052, term4485052.getClass(), "traitPoints", (byte) 127);
        ArrayList term4485066 = new ArrayList();
        ((ArrayList) term4485066).add((Object)null);
        ((ArrayList) term4485066).add((Object)null);
        ((ArrayList) term4485066).add((Object)null);
        ((ArrayList) term4485066).add((Object)null);
        ((ArrayList) term4485066).add((Object)null);
        ((ArrayList) term4485066).add((Object)null);
        ((ArrayList) term4485066).add((Object)null);
        ((ArrayList) term4485066).add((Object)null);
        ((ArrayList) term4485066).add((Object)null);
        Object term4485061 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term4485061, term4485061.getClass(), "traitId", "");
        setField(term4485061, term4485061.getClass(), "traitName", "");
        setField(term4485061, term4485061.getClass(), "description", "");
        setField(term4485061, term4485061.getClass(), "group", "");
        setField(term4485061, term4485061.getClass(), "conflictsWithIds", term4485066);
        setByteField(term4485061, term4485061.getClass(), "traitPoints", (byte) -2);
        ArrayList term4485050 = new ArrayList();
        ((ArrayList) term4485050).add(term4485052);
        ((ArrayList) term4485050).add(term4485061);
        Class<? extends Object> term4486690 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term4486689 = ((Class) term4486690).getDeclaredField((String) "CYBORG");
        ((Field) term4486689).setAccessible(true);
        Object enum13914 = ((Field) term4486689).get((Object) null);
        Class<? extends Object> term4486985 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term4486984 = ((Class) term4486985).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term4486984).setAccessible(true);
        Object enum13915 = ((Field) term4486984).get((Object) null);
        term4484870 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term4485011 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term4484870, term4484870.getClass(), "id", "gXgLjgTcNI");
        setField(term4484870, term4484870.getClass(), "name", "hiCHzEfygI");
        setField(term4484870, term4484870.getClass(), "nameSingle", "jnALnDHtba");
        setField(term4484870, term4484870.getClass(), "attitude", enum13908);
        setField(term4484870, term4484870.getClass(), "imagePath", "AcTXgRXGEU");
        setField(term4484870, term4484870.getClass(), "bridgeId", "IBYGtnaaBm");
        setField(term4484870, term4484870.getClass(), "spaceShipId", "rUCNVQrZrm");
        setField(term4484870, term4484870.getClass(), "socialSystem", enum13909);
        setField(term4484870, term4484870.getClass(), "genderList", term4484966);
        setField(term4484870, term4484870.getClass(), "speechSetId", "fZJoHQPzmr");
        setField(term4484870, term4484870.getClass(), "bridgeEffect", enum13913);
        setField(term4485011, term4485011.getClass(), "songName", "mkLJyGgSnE");
        setField(term4485011, term4485011.getClass(), "author", "SdzQKqMnXg");
        setField(term4485011, term4485011.getClass(), "fileName", "TptpeuGmNr");
        setBooleanField(term4485011, term4485011.getClass(), "custom", false);
        setIntField(term4485011, term4485011.getClass(), "fadingLimit", 453210230);
        setField(term4484870, term4484870.getClass(), "diplomacyMusic", term4485011);
        setField(term4484870, term4484870.getClass(), "traits", term4485050);
        setField(term4484870, term4484870.getClass(), "leaderNameGenerator", enum13914);
        setField(term4484870, term4484870.getClass(), "description", "jhioiUbCwt");
        setField(term4484870, term4484870.getClass(), "spaceRaceType", enum13915);
        term4485111 = new Integer(1941563322);
        term4485113 = new Integer(1578144298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4484870;
        args[1] = term4485111;
        args[2] = term4485113;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


