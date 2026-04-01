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

public class SpaceRace_getSpaceShipId_9707723175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233112;

    public SpaceRace_getSpaceShipId_9707723175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term233365 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term233364 = ((Class) term233365).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term233364).setAccessible(true);
        Object enum706 = ((Field) term233364).get((Object) null);
        Class<? extends Object> term233662 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term233661 = ((Class) term233662).getDeclaredField((String) "EQUAL");
        ((Field) term233661).setAccessible(true);
        Object enum707 = ((Field) term233661).get((Object) null);
        Class<? extends Object> term233909 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term233908 = ((Class) term233909).getDeclaredField((String) "NONE");
        ((Field) term233908).setAccessible(true);
        Object enum708 =  ((Field) term233908).get((Object) null);
        Class<? extends Object> term234133 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term234132 = ((Class) term234133).getDeclaredField((String) "FEMALE");
        ((Field) term234132).setAccessible(true);
        Object enum709 =  ((Field) term234132).get((Object) null);
        Class<? extends Object> term234363 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term234362 = ((Class) term234363).getDeclaredField((String) "MALE");
        ((Field) term234362).setAccessible(true);
        Object enum710 =  ((Field) term234362).get((Object) null);
        ArrayList term233208 = new ArrayList();
        ((ArrayList) term233208).add(enum708);
        ((ArrayList) term233208).add(enum709);
        ((ArrayList) term233208).add(enum710);
        ((ArrayList) term233208).add(enum710);
        ((ArrayList) term233208).add(enum709);
        ((ArrayList) term233208).add(enum710);
        ((ArrayList) term233208).add(enum708);
        ((ArrayList) term233208).add(enum708);
        Class<? extends Object> term234597 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term234596 = ((Class) term234597).getDeclaredField((String) "DARKEST");
        ((Field) term234596).setAccessible(true);
        Object enum711 = ((Field) term234596).get((Object) null);
        ArrayList term233286 = new ArrayList();
        Class<? extends Object> term234885 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term234884 = ((Class) term234885).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term234884).setAccessible(true);
        Object enum712 = ((Field) term234884).get((Object) null);
        Class<? extends Object> term235195 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term235194 = ((Class) term235195).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term235194).setAccessible(true);
        Object enum713 = ((Field) term235194).get((Object) null);
        term233112 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term233247 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term233112, term233112.getClass(), "id", "XwHsyzwFuB");
        setField(term233112, term233112.getClass(), "name", "MIAvupSKXI");
        setField(term233112, term233112.getClass(), "nameSingle", "JmvFMHistb");
        setField(term233112, term233112.getClass(), "attitude", enum706);
        setField(term233112, term233112.getClass(), "imagePath", "UlmwNYWZhf");
        setField(term233112, term233112.getClass(), "bridgeId", "lQsoSaqaEn");
        setField(term233112, term233112.getClass(), "spaceShipId", "rRmmFiJgHJ");
        setField(term233112, term233112.getClass(), "socialSystem", enum707);
        setField(term233112, term233112.getClass(), "genderList", term233208);
        setField(term233112, term233112.getClass(), "speechSetId", "LpTexXwjgT");
        setField(term233112, term233112.getClass(), "bridgeEffect", enum711);
        setField(term233247, term233247.getClass(), "songName", "ezaECgtjZY");
        setField(term233247, term233247.getClass(), "author", "qlaCsDxgmf");
        setField(term233247, term233247.getClass(), "fileName", "wxLOExZiQg");
        setBooleanField(term233247, term233247.getClass(), "custom", true);
        setIntField(term233247, term233247.getClass(), "fadingLimit", 1016033285);
        setField(term233112, term233112.getClass(), "diplomacyMusic", term233247);
        setField(term233112, term233112.getClass(), "traits", term233286);
        setField(term233112, term233112.getClass(), "leaderNameGenerator", enum712);
        setField(term233112, term233112.getClass(), "description", "KqiIkkKUPx");
        setField(term233112, term233112.getClass(), "spaceRaceType", enum713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpaceShipId", argTypes, term233112, args);
    }

};


