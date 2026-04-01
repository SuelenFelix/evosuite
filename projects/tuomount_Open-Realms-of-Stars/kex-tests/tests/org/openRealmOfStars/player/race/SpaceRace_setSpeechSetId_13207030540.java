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

public class SpaceRace_setSpeechSetId_13207030540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314632;

    public SpaceRace_setSpeechSetId_13207030540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term314956 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term314955 = ((Class) term314956).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term314955).setAccessible(true);
        Object enum969 = ((Field) term314955).get((Object) null);
        Class<? extends Object> term315253 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term315252 = ((Class) term315253).getDeclaredField((String) "PATRIARCHY");
        ((Field) term315252).setAccessible(true);
        Object enum970 = ((Field) term315252).get((Object) null);
        Class<? extends Object> term315515 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term315514 = ((Class) term315515).getDeclaredField((String) "MALE");
        ((Field) term315514).setAccessible(true);
        Object enum971 =  ((Field) term315514).get((Object) null);
        Class<? extends Object> term315739 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term315738 = ((Class) term315739).getDeclaredField((String) "NONE");
        ((Field) term315738).setAccessible(true);
        Object enum972 =  ((Field) term315738).get((Object) null);
        ArrayList term314733 = new ArrayList();
        ((ArrayList) term314733).add(enum971);
        ((ArrayList) term314733).add(enum972);
        ((ArrayList) term314733).add(enum972);
        ((ArrayList) term314733).add(enum971);
        ((ArrayList) term314733).add(enum972);
        Class<? extends Object> term315973 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term315972 = ((Class) term315973).getDeclaredField((String) "ORANGE_BLINK");
        ((Field) term315972).setAccessible(true);
        Object enum973 = ((Field) term315972).get((Object) null);
        ArrayList term314819 = new ArrayList();
        ((ArrayList) term314819).add((Object)null);
        ((ArrayList) term314819).add((Object)null);
        ((ArrayList) term314819).add((Object)null);
        ((ArrayList) term314819).add((Object)null);
        ((ArrayList) term314819).add((Object)null);
        ((ArrayList) term314819).add((Object)null);
        Object term314814 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term314814, term314814.getClass(), "traitId", "");
        setField(term314814, term314814.getClass(), "traitName", "");
        setField(term314814, term314814.getClass(), "description", "");
        setField(term314814, term314814.getClass(), "group", "");
        setField(term314814, term314814.getClass(), "conflictsWithIds", term314819);
        setByteField(term314814, term314814.getClass(), "traitPoints", (byte) 59);
        ArrayList term314828 = new ArrayList();
        ((ArrayList) term314828).add((Object)null);
        ((ArrayList) term314828).add((Object)null);
        ((ArrayList) term314828).add((Object)null);
        ((ArrayList) term314828).add((Object)null);
        ((ArrayList) term314828).add((Object)null);
        ((ArrayList) term314828).add((Object)null);
        ((ArrayList) term314828).add((Object)null);
        ((ArrayList) term314828).add((Object)null);
        Object term314823 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term314823, term314823.getClass(), "traitId", "");
        setField(term314823, term314823.getClass(), "traitName", "");
        setField(term314823, term314823.getClass(), "description", "");
        setField(term314823, term314823.getClass(), "group", "");
        setField(term314823, term314823.getClass(), "conflictsWithIds", term314828);
        setByteField(term314823, term314823.getClass(), "traitPoints", (byte) -89);
        ArrayList term314837 = new ArrayList();
        ((ArrayList) term314837).add((Object)null);
        ((ArrayList) term314837).add((Object)null);
        ((ArrayList) term314837).add((Object)null);
        ((ArrayList) term314837).add((Object)null);
        ((ArrayList) term314837).add((Object)null);
        Object term314832 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term314832, term314832.getClass(), "traitId", "");
        setField(term314832, term314832.getClass(), "traitName", "");
        setField(term314832, term314832.getClass(), "description", "");
        setField(term314832, term314832.getClass(), "group", "");
        setField(term314832, term314832.getClass(), "conflictsWithIds", term314837);
        setByteField(term314832, term314832.getClass(), "traitPoints", (byte) 111);
        ArrayList term314846 = new ArrayList();
        Object term314841 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term314841, term314841.getClass(), "traitId", "");
        setField(term314841, term314841.getClass(), "traitName", "");
        setField(term314841, term314841.getClass(), "description", "");
        setField(term314841, term314841.getClass(), "group", "");
        setField(term314841, term314841.getClass(), "conflictsWithIds", term314846);
        setByteField(term314841, term314841.getClass(), "traitPoints", (byte) 106);
        ArrayList term314855 = new ArrayList();
        ((ArrayList) term314855).add((Object)null);
        ((ArrayList) term314855).add((Object)null);
        ((ArrayList) term314855).add((Object)null);
        ((ArrayList) term314855).add((Object)null);
        ((ArrayList) term314855).add((Object)null);
        ((ArrayList) term314855).add((Object)null);
        ((ArrayList) term314855).add((Object)null);
        ((ArrayList) term314855).add((Object)null);
        ((ArrayList) term314855).add((Object)null);
        Object term314850 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term314850, term314850.getClass(), "traitId", "");
        setField(term314850, term314850.getClass(), "traitName", "");
        setField(term314850, term314850.getClass(), "description", "");
        setField(term314850, term314850.getClass(), "group", "");
        setField(term314850, term314850.getClass(), "conflictsWithIds", term314855);
        setByteField(term314850, term314850.getClass(), "traitPoints", (byte) -8);
        ArrayList term314864 = new ArrayList();
        ((ArrayList) term314864).add((Object)null);
        ((ArrayList) term314864).add((Object)null);
        ((ArrayList) term314864).add((Object)null);
        Object term314859 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term314859, term314859.getClass(), "traitId", "");
        setField(term314859, term314859.getClass(), "traitName", "");
        setField(term314859, term314859.getClass(), "description", "");
        setField(term314859, term314859.getClass(), "group", "");
        setField(term314859, term314859.getClass(), "conflictsWithIds", term314864);
        setByteField(term314859, term314859.getClass(), "traitPoints", (byte) 106);
        ArrayList term314812 = new ArrayList();
        ((ArrayList) term314812).add(term314814);
        ((ArrayList) term314812).add(term314823);
        ((ArrayList) term314812).add(term314832);
        ((ArrayList) term314812).add(term314841);
        ((ArrayList) term314812).add(term314850);
        ((ArrayList) term314812).add(term314859);
        Class<? extends Object> term316276 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term316275 = ((Class) term316276).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term316275).setAccessible(true);
        Object enum974 = ((Field) term316275).get((Object) null);
        Class<? extends Object> term316586 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term316585 = ((Class) term316586).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term316585).setAccessible(true);
        Object enum975 = ((Field) term316585).get((Object) null);
        term314632 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term314773 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term314632, term314632.getClass(), "id", "IBEiicEMis");
        setField(term314632, term314632.getClass(), "name", "bWUMMMnrsO");
        setField(term314632, term314632.getClass(), "nameSingle", "QMuSzIUAqW");
        setField(term314632, term314632.getClass(), "attitude", enum969);
        setField(term314632, term314632.getClass(), "imagePath", "ecDNTpPdOH");
        setField(term314632, term314632.getClass(), "bridgeId", "BsVYnEehhF");
        setField(term314632, term314632.getClass(), "spaceShipId", "YwJlByssSF");
        setField(term314632, term314632.getClass(), "socialSystem", enum970);
        setField(term314632, term314632.getClass(), "genderList", term314733);
        setField(term314632, term314632.getClass(), "speechSetId", "EWbLFcROZq");
        setField(term314632, term314632.getClass(), "bridgeEffect", enum973);
        setField(term314773, term314773.getClass(), "songName", "uZkkVJREva");
        setField(term314773, term314773.getClass(), "author", "lYGZmmgWDd");
        setField(term314773, term314773.getClass(), "fileName", "YzjQFbbtMR");
        setBooleanField(term314773, term314773.getClass(), "custom", true);
        setIntField(term314773, term314773.getClass(), "fadingLimit", -1303208102);
        setField(term314632, term314632.getClass(), "diplomacyMusic", term314773);
        setField(term314632, term314632.getClass(), "traits", term314812);
        setField(term314632, term314632.getClass(), "leaderNameGenerator", enum974);
        setField(term314632, term314632.getClass(), "description", "soyBRfWJGI");
        setField(term314632, term314632.getClass(), "spaceRaceType", enum975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fboIWAsrJZ";
        callMethod(klass, "setSpeechSetId", argTypes, term314632, args);
    }

};


