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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class TechList_getListMissingTech_159293648332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318041;
     Object enum980;
     Object term318267;

    public TechList_getListMissingTech_159293648332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term318045 = new ArrayList();
        ((ArrayList) term318045).add((Object)null);
        ((ArrayList) term318045).add((Object)null);
        ((ArrayList) term318045).add((Object)null);
        ArrayList term318050 = new ArrayList();
        ((ArrayList) term318050).add((Object)null);
        ((ArrayList) term318050).add((Object)null);
        ((ArrayList) term318050).add((Object)null);
        ((ArrayList) term318050).add((Object)null);
        ((ArrayList) term318050).add((Object)null);
        ((ArrayList) term318050).add((Object)null);
        ((ArrayList) term318050).add((Object)null);
        ((ArrayList) term318050).add((Object)null);
        ((ArrayList) term318050).add((Object)null);
        ArrayList term318056 = new ArrayList();
        ((ArrayList) term318056).add((Object)null);
        ((ArrayList) term318056).add((Object)null);
        Class<? extends Object> term318316 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term318315 = ((Class) term318316).getDeclaredField((String) "MILITARISTIC");
        ((Field) term318315).setAccessible(true);
        Object enum975 = ((Field) term318315).get((Object) null);
        Class<? extends Object> term318619 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term318618 = ((Class) term318619).getDeclaredField((String) "MATRIARCHY");
        ((Field) term318618).setAccessible(true);
        Object enum976 = ((Field) term318618).get((Object) null);
        ArrayList term318182 = new ArrayList();
        Class<? extends Object> term318891 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term318890 = ((Class) term318891).getDeclaredField((String) "RED_ALERT");
        ((Field) term318890).setAccessible(true);
        Object enum977 = ((Field) term318890).get((Object) null);
        ArrayList term318214 = new ArrayList();
        Class<? extends Object> term319155 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term319154 = ((Class) term319155).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term319154).setAccessible(true);
        Object enum978 = ((Field) term319154).get((Object) null);
        Class<? extends Object> term319465 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term319464 = ((Class) term319465).getDeclaredField((String) "REGULAR");
        ((Field) term319464).setAccessible(true);
        Object enum979 = ((Field) term319464).get((Object) null);
        term318041 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        Object[] term318042 = (Object[]) newObjectArray(Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"), 0).getClass(), 2);
        Object[] term318043 = (Object[]) newArray("org.openRealmOfStars.player.tech.TechListForLevel", 2);
        Object term318044 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term318049 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object[] term318054 = (Object[]) newArray("org.openRealmOfStars.player.tech.TechListForLevel", 1);
        Object term318055 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        int[] term318060 = (int[]) newIntArray(9);
        int[] term318070 = (int[]) newIntArray(0);
        double[] term318071 = (double[]) newDoubleArray(7);
        Object term318079 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term318211 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term318044, term318044.getClass(), "techList", term318045);
        setIntField(term318044, term318044.getClass(), "level", 285368240);
        setElement(term318043, 0, term318044);
        setField(term318049, term318049.getClass(), "techList", term318050);
        setIntField(term318049, term318049.getClass(), "level", -2080503799);
        setElement(term318043, 1, term318049);
        setElement(term318042, 0, term318043);
        setField(term318055, term318055.getClass(), "techList", term318056);
        setIntField(term318055, term318055.getClass(), "level", 13757525);
        setElement(term318054, 0, term318055);
        setElement(term318042, 1, term318054);
        setField(term318041, term318041.getClass(), "techList", term318042);
        setIntElement(term318060, 0, 77853966);
        setIntElement(term318060, 1, 1451393741);
        setIntElement(term318060, 2, -1115815564);
        setIntElement(term318060, 3, 425132480);
        setIntElement(term318060, 4, 1968674006);
        setIntElement(term318060, 5, -634536248);
        setIntElement(term318060, 6, 1090329667);
        setIntElement(term318060, 7, -1082123686);
        setIntElement(term318060, 8, -991011239);
        setField(term318041, term318041.getClass(), "techLevels", term318060);
        setField(term318041, term318041.getClass(), "techFocus", term318070);
        setDoubleElement(term318071, 0, 0.9628647861255637);
        setDoubleElement(term318071, 1, 0.623231822150205);
        setDoubleElement(term318071, 2, 0.09037487793444521);
        setDoubleElement(term318071, 3, 0.6561919196821765);
        setDoubleElement(term318071, 4, 0.7330178886612495);
        setDoubleElement(term318071, 5, 0.7618164754425794);
        setDoubleElement(term318071, 6, 0.7385589312559342);
        setField(term318041, term318041.getClass(), "techResearchPoint", term318071);
        setField(term318079, term318079.getClass(), "id", "nQZbRxPqNd");
        setField(term318079, term318079.getClass(), "name", "yuUiVhpeab");
        setField(term318079, term318079.getClass(), "nameSingle", "kakhqlEqNc");
        setField(term318079, term318079.getClass(), "attitude", enum975);
        setField(term318079, term318079.getClass(), "imagePath", "KbEBQtbxfu");
        setField(term318079, term318079.getClass(), "bridgeId", "NiFBBzDPrf");
        setField(term318079, term318079.getClass(), "spaceShipId", "CaAyNRyeYX");
        setField(term318079, term318079.getClass(), "socialSystem", enum976);
        setField(term318079, term318079.getClass(), "genderList", term318182);
        setField(term318079, term318079.getClass(), "speechSetId", "TuExFSrfbK");
        setField(term318079, term318079.getClass(), "bridgeEffect", enum977);
        setField(term318211, term318211.getClass(), "songName", null);
        setField(term318211, term318211.getClass(), "author", null);
        setField(term318211, term318211.getClass(), "fileName", null);
        setBooleanField(term318211, term318211.getClass(), "custom", false);
        setIntField(term318211, term318211.getClass(), "fadingLimit", 0);
        setField(term318079, term318079.getClass(), "diplomacyMusic", term318211);
        setField(term318079, term318079.getClass(), "traits", term318214);
        setField(term318079, term318079.getClass(), "leaderNameGenerator", enum978);
        setField(term318079, term318079.getClass(), "description", "OfCtSFOSgO");
        setField(term318079, term318079.getClass(), "spaceRaceType", enum979);
        setField(term318041, term318041.getClass(), "race", term318079);
        Class<? extends Object> term319723 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term319722 = ((Class) term319723).getDeclaredField((String) "Defense");
        ((Field) term319722).setAccessible(true);
        enum980 = ((Field) term319722).get((Object) null);
        term318267 = new Integer(-1774267288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = enum980;
        args[1] = term318267;
        callMethod(klass, "getListMissingTech", argTypes, term318041, args);
    }

};


