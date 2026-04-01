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

public class SpaceRace_hasTrait_3400245049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242448;

    public SpaceRace_hasTrait_3400245049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term242734 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term242733 = ((Class) term242734).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term242733).setAccessible(true);
        Object enum736 = ((Field) term242733).get((Object) null);
        Class<? extends Object> term243031 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term243030 = ((Class) term243031).getDeclaredField((String) "MATRIARCHY");
        ((Field) term243030).setAccessible(true);
        Object enum737 = ((Field) term243030).get((Object) null);
        Class<? extends Object> term243293 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term243292 = ((Class) term243293).getDeclaredField((String) "NONE");
        ((Field) term243292).setAccessible(true);
        Object enum738 =  ((Field) term243292).get((Object) null);
        Class<? extends Object> term243517 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term243516 = ((Class) term243517).getDeclaredField((String) "FEMALE");
        ((Field) term243516).setAccessible(true);
        Object enum739 =  ((Field) term243516).get((Object) null);
        Class<? extends Object> term243747 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term243746 = ((Class) term243747).getDeclaredField((String) "MALE");
        ((Field) term243746).setAccessible(true);
        Object enum740 =  ((Field) term243746).get((Object) null);
        ArrayList term242549 = new ArrayList();
        ((ArrayList) term242549).add(enum738);
        ((ArrayList) term242549).add(enum739);
        ((ArrayList) term242549).add(enum738);
        ((ArrayList) term242549).add(enum738);
        ((ArrayList) term242549).add(enum738);
        ((ArrayList) term242549).add(enum740);
        ((ArrayList) term242549).add(enum739);
        ((ArrayList) term242549).add(enum738);
        Class<? extends Object> term243981 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term243980 = ((Class) term243981).getDeclaredField((String) "BRIGHT_CYAN");
        ((Field) term243980).setAccessible(true);
        Object enum741 = ((Field) term243980).get((Object) null);
        ArrayList term242638 = new ArrayList();
        ((ArrayList) term242638).add((Object)null);
        Object term242633 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term242633, term242633.getClass(), "traitId", "");
        setField(term242633, term242633.getClass(), "traitName", "");
        setField(term242633, term242633.getClass(), "description", "");
        setField(term242633, term242633.getClass(), "group", "");
        setField(term242633, term242633.getClass(), "conflictsWithIds", term242638);
        setByteField(term242633, term242633.getClass(), "traitPoints", (byte) 13);
        ArrayList term242631 = new ArrayList();
        ((ArrayList) term242631).add(term242633);
        Class<? extends Object> term244281 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term244280 = ((Class) term244281).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term244280).setAccessible(true);
        Object enum742 = ((Field) term244280).get((Object) null);
        Class<? extends Object> term244618 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term244617 = ((Class) term244618).getDeclaredField((String) "REGULAR");
        ((Field) term244617).setAccessible(true);
        Object enum743 = ((Field) term244617).get((Object) null);
        term242448 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term242592 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term242448, term242448.getClass(), "id", "XOkulfLyFB");
        setField(term242448, term242448.getClass(), "name", "TWxIeAVyij");
        setField(term242448, term242448.getClass(), "nameSingle", "TNTJNnihvv");
        setField(term242448, term242448.getClass(), "attitude", enum736);
        setField(term242448, term242448.getClass(), "imagePath", "DPtVWGCAtJ");
        setField(term242448, term242448.getClass(), "bridgeId", "UZOnqpPQsA");
        setField(term242448, term242448.getClass(), "spaceShipId", "wYZNsqEOJb");
        setField(term242448, term242448.getClass(), "socialSystem", enum737);
        setField(term242448, term242448.getClass(), "genderList", term242549);
        setField(term242448, term242448.getClass(), "speechSetId", "psufmwuxCV");
        setField(term242448, term242448.getClass(), "bridgeEffect", enum741);
        setField(term242592, term242592.getClass(), "songName", "HCLZNLlrSc");
        setField(term242592, term242592.getClass(), "author", "DQrthrhMjb");
        setField(term242592, term242592.getClass(), "fileName", "BGKoNLhthG");
        setBooleanField(term242592, term242592.getClass(), "custom", false);
        setIntField(term242592, term242592.getClass(), "fadingLimit", 2127902475);
        setField(term242448, term242448.getClass(), "diplomacyMusic", term242592);
        setField(term242448, term242448.getClass(), "traits", term242631);
        setField(term242448, term242448.getClass(), "leaderNameGenerator", enum742);
        setField(term242448, term242448.getClass(), "description", "mfWAasgXsv");
        setField(term242448, term242448.getClass(), "spaceRaceType", enum743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uxmGJPsOll";
        callMethod(klass, "hasTrait", argTypes, term242448, args);
    }

};


