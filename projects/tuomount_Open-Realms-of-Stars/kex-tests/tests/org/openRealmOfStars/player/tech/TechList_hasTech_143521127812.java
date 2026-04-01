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
import java.lang.String;
import java.util.ArrayList;

public class TechList_hasTech_143521127812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241083;

    public TechList_hasTech_143521127812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term241361 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term241360 = ((Class) term241361).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term241360).setAccessible(true);
        Object enum737 = ((Field) term241360).get((Object) null);
        Class<? extends Object> term241664 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term241663 = ((Class) term241664).getDeclaredField((String) "MATRIARCHY");
        ((Field) term241663).setAccessible(true);
        Object enum738 = ((Field) term241663).get((Object) null);
        Class<? extends Object> term241926 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term241925 = ((Class) term241926).getDeclaredField((String) "NONE");
        ((Field) term241925).setAccessible(true);
        Object enum739 =  ((Field) term241925).get((Object) null);
        Class<? extends Object> term242150 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term242149 = ((Class) term242150).getDeclaredField((String) "NONE");
        ((Field) term242149).setAccessible(true);
        Object enum740 =  ((Field) term242149).get((Object) null);
        Class<? extends Object> term242374 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term242373 = ((Class) term242374).getDeclaredField((String) "MALE");
        ((Field) term242373).setAccessible(true);
        Object enum741 =  ((Field) term242373).get((Object) null);
        ArrayList term241193 = new ArrayList();
        ((ArrayList) term241193).add(enum739);
        ((ArrayList) term241193).add(enum740);
        ((ArrayList) term241193).add(enum739);
        ((ArrayList) term241193).add(enum740);
        ((ArrayList) term241193).add(enum740);
        ((ArrayList) term241193).add(enum741);
        Class<? extends Object> term242608 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term242607 = ((Class) term242608).getDeclaredField((String) "FETCH_LIGHTS");
        ((Field) term242607).setAccessible(true);
        Object enum742 = ((Field) term242607).get((Object) null);
        Object term241275 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241275, term241275.getClass(), "traitId", null);
        setField(term241275, term241275.getClass(), "traitName", null);
        setField(term241275, term241275.getClass(), "description", null);
        setField(term241275, term241275.getClass(), "group", null);
        setField(term241275, term241275.getClass(), "conflictsWithIds", null);
        setByteField(term241275, term241275.getClass(), "traitPoints", (byte) 40);
        Object term241277 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241277, term241277.getClass(), "traitId", null);
        setField(term241277, term241277.getClass(), "traitName", null);
        setField(term241277, term241277.getClass(), "description", null);
        setField(term241277, term241277.getClass(), "group", null);
        setField(term241277, term241277.getClass(), "conflictsWithIds", null);
        setByteField(term241277, term241277.getClass(), "traitPoints", (byte) 83);
        ArrayList term241273 = new ArrayList();
        ((ArrayList) term241273).add(term241275);
        ((ArrayList) term241273).add(term241277);
        Class<? extends Object> term242911 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term242910 = ((Class) term242911).getDeclaredField((String) "MUSHROOM");
        ((Field) term242910).setAccessible(true);
        Object enum743 = ((Field) term242910).get((Object) null);
        Class<? extends Object> term243212 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term243211 = ((Class) term243212).getDeclaredField((String) "REGULAR");
        ((Field) term243211).setAccessible(true);
        Object enum744 = ((Field) term243211).get((Object) null);
        term241083 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        Object[] term241084 = (Object[]) newObjectArray(Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"), 0).getClass(), 0);
        int[] term241085 = (int[]) newIntArray(0);
        int[] term241086 = (int[]) newIntArray(1);
        double[] term241088 = (double[]) newDoubleArray(1);
        Object term241090 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term241234 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term241083, term241083.getClass(), "techList", term241084);
        setField(term241083, term241083.getClass(), "techLevels", term241085);
        setIntElement(term241086, 0, 1810754549);
        setField(term241083, term241083.getClass(), "techFocus", term241086);
        setDoubleElement(term241088, 0, 0.2192450926212024);
        setField(term241083, term241083.getClass(), "techResearchPoint", term241088);
        setField(term241090, term241090.getClass(), "id", "hImewbCvKZ");
        setField(term241090, term241090.getClass(), "name", "eAvCoinDEL");
        setField(term241090, term241090.getClass(), "nameSingle", "VTFTvSdVnp");
        setField(term241090, term241090.getClass(), "attitude", enum737);
        setField(term241090, term241090.getClass(), "imagePath", "MiXdRkhjVA");
        setField(term241090, term241090.getClass(), "bridgeId", "VFNmRuSuAA");
        setField(term241090, term241090.getClass(), "spaceShipId", "kZarUDgTET");
        setField(term241090, term241090.getClass(), "socialSystem", enum738);
        setField(term241090, term241090.getClass(), "genderList", term241193);
        setField(term241090, term241090.getClass(), "speechSetId", "znhFQgvSYU");
        setField(term241090, term241090.getClass(), "bridgeEffect", enum742);
        setField(term241234, term241234.getClass(), "songName", "mDNkQJxmYt");
        setField(term241234, term241234.getClass(), "author", "xZNZPvTRXV");
        setField(term241234, term241234.getClass(), "fileName", "ARslLYbNsq");
        setBooleanField(term241234, term241234.getClass(), "custom", true);
        setIntField(term241234, term241234.getClass(), "fadingLimit", 338342107);
        setField(term241090, term241090.getClass(), "diplomacyMusic", term241234);
        setField(term241090, term241090.getClass(), "traits", term241273);
        setField(term241090, term241090.getClass(), "leaderNameGenerator", enum743);
        setField(term241090, term241090.getClass(), "description", "AizJhCCKXG");
        setField(term241090, term241090.getClass(), "spaceRaceType", enum744);
        setField(term241083, term241083.getClass(), "race", term241090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iLylbwIxgL";
        callMethod(klass, "hasTech", argTypes, term241083, args);
    }

};


