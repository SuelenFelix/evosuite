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

public class TechList_getBuildingListFromTech_45172401454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419242;

    public TechList_getBuildingListFromTech_45172401454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term419246 = new ArrayList();
        ((ArrayList) term419246).add((Object)null);
        ((ArrayList) term419246).add((Object)null);
        ((ArrayList) term419246).add((Object)null);
        ((ArrayList) term419246).add((Object)null);
        ((ArrayList) term419246).add((Object)null);
        ((ArrayList) term419246).add((Object)null);
        ((ArrayList) term419246).add((Object)null);
        ((ArrayList) term419246).add((Object)null);
        ((ArrayList) term419246).add((Object)null);
        ArrayList term419251 = new ArrayList();
        ((ArrayList) term419251).add((Object)null);
        ((ArrayList) term419251).add((Object)null);
        Class<? extends Object> term419546 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term419545 = ((Class) term419546).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term419545).setAccessible(true);
        Object enum1280 = ((Field) term419545).get((Object) null);
        Class<? extends Object> term419843 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term419842 = ((Class) term419843).getDeclaredField((String) "PATRIARCHY");
        ((Field) term419842).setAccessible(true);
        Object enum1281 = ((Field) term419842).get((Object) null);
        Class<? extends Object> term420105 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term420104 = ((Class) term420105).getDeclaredField((String) "NONE");
        ((Field) term420104).setAccessible(true);
        Object enum1282 =  ((Field) term420104).get((Object) null);
        Class<? extends Object> term420329 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term420328 = ((Class) term420329).getDeclaredField((String) "FEMALE");
        ((Field) term420328).setAccessible(true);
        Object enum1283 =  ((Field) term420328).get((Object) null);
        Class<? extends Object> term420559 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term420558 = ((Class) term420559).getDeclaredField((String) "NONE");
        ((Field) term420558).setAccessible(true);
        Object enum1284 =  ((Field) term420558).get((Object) null);
        ArrayList term419370 = new ArrayList();
        ((ArrayList) term419370).add(enum1282);
        ((ArrayList) term419370).add(enum1282);
        ((ArrayList) term419370).add(enum1283);
        ((ArrayList) term419370).add(enum1284);
        ((ArrayList) term419370).add(enum1283);
        ((ArrayList) term419370).add(enum1282);
        ((ArrayList) term419370).add(enum1284);
        Class<? extends Object> term420793 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term420792 = ((Class) term420793).getDeclaredField((String) "WARM_WHITE");
        ((Field) term420792).setAccessible(true);
        Object enum1285 = ((Field) term420792).get((Object) null);
        Object term419450 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term419450, term419450.getClass(), "traitId", null);
        setField(term419450, term419450.getClass(), "traitName", null);
        setField(term419450, term419450.getClass(), "description", null);
        setField(term419450, term419450.getClass(), "group", null);
        setField(term419450, term419450.getClass(), "conflictsWithIds", null);
        setByteField(term419450, term419450.getClass(), "traitPoints", (byte) -117);
        Object term419452 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term419452, term419452.getClass(), "traitId", null);
        setField(term419452, term419452.getClass(), "traitName", null);
        setField(term419452, term419452.getClass(), "description", null);
        setField(term419452, term419452.getClass(), "group", null);
        setField(term419452, term419452.getClass(), "conflictsWithIds", null);
        setByteField(term419452, term419452.getClass(), "traitPoints", (byte) 41);
        Object term419454 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term419454, term419454.getClass(), "traitId", null);
        setField(term419454, term419454.getClass(), "traitName", null);
        setField(term419454, term419454.getClass(), "description", null);
        setField(term419454, term419454.getClass(), "group", null);
        setField(term419454, term419454.getClass(), "conflictsWithIds", null);
        setByteField(term419454, term419454.getClass(), "traitPoints", (byte) -111);
        Object term419456 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term419456, term419456.getClass(), "traitId", null);
        setField(term419456, term419456.getClass(), "traitName", null);
        setField(term419456, term419456.getClass(), "description", null);
        setField(term419456, term419456.getClass(), "group", null);
        setField(term419456, term419456.getClass(), "conflictsWithIds", null);
        setByteField(term419456, term419456.getClass(), "traitPoints", (byte) -1);
        ArrayList term419448 = new ArrayList();
        ((ArrayList) term419448).add(term419450);
        ((ArrayList) term419448).add(term419452);
        ((ArrayList) term419448).add(term419454);
        ((ArrayList) term419448).add(term419450);
        ((ArrayList) term419448).add(term419452);
        ((ArrayList) term419448).add(term419456);
        Class<? extends Object> term421090 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term421089 = ((Class) term421090).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term421089).setAccessible(true);
        Object enum1286 = ((Field) term421089).get((Object) null);
        Class<? extends Object> term421403 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term421402 = ((Class) term421403).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term421402).setAccessible(true);
        Object enum1287 = ((Field) term421402).get((Object) null);
        term419242 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        Object[] term419243 = (Object[]) newObjectArray(Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"), 0).getClass(), 1);
        Object[] term419244 = (Object[]) newArray("org.openRealmOfStars.player.tech.TechListForLevel", 2);
        Object term419245 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term419250 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        int[] term419255 = (int[]) newIntArray(8);
        int[] term419264 = (int[]) newIntArray(0);
        double[] term419265 = (double[]) newDoubleArray(3);
        Object term419269 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term419409 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term419245, term419245.getClass(), "techList", term419246);
        setIntField(term419245, term419245.getClass(), "level", 1274552070);
        setElement(term419244, 0, term419245);
        setField(term419250, term419250.getClass(), "techList", term419251);
        setIntField(term419250, term419250.getClass(), "level", -1357939737);
        setElement(term419244, 1, term419250);
        setElement(term419243, 0, term419244);
        setField(term419242, term419242.getClass(), "techList", term419243);
        setIntElement(term419255, 0, 1032926922);
        setIntElement(term419255, 1, -478839397);
        setIntElement(term419255, 2, -266762167);
        setIntElement(term419255, 3, -1341806138);
        setIntElement(term419255, 4, 684728176);
        setIntElement(term419255, 5, 2089342829);
        setIntElement(term419255, 6, 1201220971);
        setIntElement(term419255, 7, -811460564);
        setField(term419242, term419242.getClass(), "techLevels", term419255);
        setField(term419242, term419242.getClass(), "techFocus", term419264);
        setDoubleElement(term419265, 0, 0.1187814206908886);
        setDoubleElement(term419265, 1, 0.04662501176438627);
        setDoubleElement(term419265, 2, 0.17512426723256447);
        setField(term419242, term419242.getClass(), "techResearchPoint", term419265);
        setField(term419269, term419269.getClass(), "id", "CukLPXStox");
        setField(term419269, term419269.getClass(), "name", "EPjlowzpjR");
        setField(term419269, term419269.getClass(), "nameSingle", "JVHgtwZxEc");
        setField(term419269, term419269.getClass(), "attitude", enum1280);
        setField(term419269, term419269.getClass(), "imagePath", "bgVlzYTBWa");
        setField(term419269, term419269.getClass(), "bridgeId", "PSxNBryClo");
        setField(term419269, term419269.getClass(), "spaceShipId", "nOhsfXSpOo");
        setField(term419269, term419269.getClass(), "socialSystem", enum1281);
        setField(term419269, term419269.getClass(), "genderList", term419370);
        setField(term419269, term419269.getClass(), "speechSetId", "BbAlTuVaVO");
        setField(term419269, term419269.getClass(), "bridgeEffect", enum1285);
        setField(term419409, term419409.getClass(), "songName", "MIixOSOEaX");
        setField(term419409, term419409.getClass(), "author", "wQkVwQHOgj");
        setField(term419409, term419409.getClass(), "fileName", "EvarBusRCI");
        setBooleanField(term419409, term419409.getClass(), "custom", false);
        setIntField(term419409, term419409.getClass(), "fadingLimit", -1562955063);
        setField(term419269, term419269.getClass(), "diplomacyMusic", term419409);
        setField(term419269, term419269.getClass(), "traits", term419448);
        setField(term419269, term419269.getClass(), "leaderNameGenerator", enum1286);
        setField(term419269, term419269.getClass(), "description", "nstlOBmqcY");
        setField(term419269, term419269.getClass(), "spaceRaceType", enum1287);
        setField(term419242, term419242.getClass(), "race", term419269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuildingListFromTech", argTypes, term419242, args);
    }

};


