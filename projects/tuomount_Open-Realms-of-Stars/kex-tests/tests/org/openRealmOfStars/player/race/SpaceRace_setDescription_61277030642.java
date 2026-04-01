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

public class SpaceRace_setDescription_61277030642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319291;

    public SpaceRace_setDescription_61277030642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term319563 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term319562 = ((Class) term319563).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term319562).setAccessible(true);
        Object enum984 = ((Field) term319562).get((Object) null);
        Class<? extends Object> term319860 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term319859 = ((Class) term319860).getDeclaredField((String) "PATRIARCHY");
        ((Field) term319859).setAccessible(true);
        Object enum985 = ((Field) term319859).get((Object) null);
        Class<? extends Object> term320122 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term320121 = ((Class) term320122).getDeclaredField((String) "MALE");
        ((Field) term320121).setAccessible(true);
        Object enum986 =  ((Field) term320121).get((Object) null);
        Class<? extends Object> term320346 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term320345 = ((Class) term320346).getDeclaredField((String) "FEMALE");
        ((Field) term320345).setAccessible(true);
        Object enum987 =  ((Field) term320345).get((Object) null);
        ArrayList term319392 = new ArrayList();
        ((ArrayList) term319392).add(enum986);
        ((ArrayList) term319392).add(enum987);
        ((ArrayList) term319392).add(enum986);
        ((ArrayList) term319392).add(enum987);
        ((ArrayList) term319392).add(enum986);
        ((ArrayList) term319392).add(enum987);
        Class<? extends Object> term320586 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term320585 = ((Class) term320586).getDeclaredField((String) "BLUEISH_WHITE");
        ((Field) term320585).setAccessible(true);
        Object enum988 = ((Field) term320585).get((Object) null);
        ArrayList term319472 = new ArrayList();
        Class<? extends Object> term320892 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term320891 = ((Class) term320892).getDeclaredField((String) "FEMALE_ROBOT");
        ((Field) term320891).setAccessible(true);
        Object enum989 = ((Field) term320891).get((Object) null);
        Class<? extends Object> term321205 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term321204 = ((Class) term321205).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term321204).setAccessible(true);
        Object enum990 = ((Field) term321204).get((Object) null);
        term319291 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term319433 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term319291, term319291.getClass(), "id", "qacQEntxMw");
        setField(term319291, term319291.getClass(), "name", "serkapmqZh");
        setField(term319291, term319291.getClass(), "nameSingle", "gcqWfMAFPK");
        setField(term319291, term319291.getClass(), "attitude", enum984);
        setField(term319291, term319291.getClass(), "imagePath", "ScxLRRGgyT");
        setField(term319291, term319291.getClass(), "bridgeId", "CkxvejcJwL");
        setField(term319291, term319291.getClass(), "spaceShipId", "xbTYhfucaY");
        setField(term319291, term319291.getClass(), "socialSystem", enum985);
        setField(term319291, term319291.getClass(), "genderList", term319392);
        setField(term319291, term319291.getClass(), "speechSetId", "oOhYSsilyF");
        setField(term319291, term319291.getClass(), "bridgeEffect", enum988);
        setField(term319433, term319433.getClass(), "songName", "ptFtBxcggt");
        setField(term319433, term319433.getClass(), "author", "CNPbNDYCYT");
        setField(term319433, term319433.getClass(), "fileName", "CmSBEaXuvA");
        setBooleanField(term319433, term319433.getClass(), "custom", true);
        setIntField(term319433, term319433.getClass(), "fadingLimit", -193596012);
        setField(term319291, term319291.getClass(), "diplomacyMusic", term319433);
        setField(term319291, term319291.getClass(), "traits", term319472);
        setField(term319291, term319291.getClass(), "leaderNameGenerator", enum989);
        setField(term319291, term319291.getClass(), "description", "MzZzTPvXwn");
        setField(term319291, term319291.getClass(), "spaceRaceType", enum990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XzOajjTxbc";
        callMethod(klass, "setDescription", argTypes, term319291, args);
    }

};


