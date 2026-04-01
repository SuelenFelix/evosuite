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

public class SpaceRace_getTemperatureBaseValue_112790463736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305301;
     Object enum947;

    public SpaceRace_getTemperatureBaseValue_112790463736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term305611 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term305610 = ((Class) term305611).getDeclaredField((String) "MILITARISTIC");
        ((Field) term305610).setAccessible(true);
        Object enum939 = ((Field) term305610).get((Object) null);
        Class<? extends Object> term305914 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term305913 = ((Class) term305914).getDeclaredField((String) "EQUAL");
        ((Field) term305913).setAccessible(true);
        Object enum940 = ((Field) term305913).get((Object) null);
        Class<? extends Object> term306161 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term306160 = ((Class) term306161).getDeclaredField((String) "MALE");
        ((Field) term306160).setAccessible(true);
        Object enum941 =  ((Field) term306160).get((Object) null);
        Class<? extends Object> term306385 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term306384 = ((Class) term306385).getDeclaredField((String) "NONE");
        ((Field) term306384).setAccessible(true);
        Object enum942 =  ((Field) term306384).get((Object) null);
        Class<? extends Object> term306609 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term306608 = ((Class) term306609).getDeclaredField((String) "FEMALE");
        ((Field) term306608).setAccessible(true);
        Object enum943 =  ((Field) term306608).get((Object) null);
        ArrayList term305399 = new ArrayList();
        ((ArrayList) term305399).add(enum941);
        ((ArrayList) term305399).add(enum942);
        ((ArrayList) term305399).add(enum941);
        ((ArrayList) term305399).add(enum943);
        Class<? extends Object> term306849 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term306848 = ((Class) term306849).getDeclaredField((String) "PURPLE_DREAM");
        ((Field) term306848).setAccessible(true);
        Object enum944 = ((Field) term306848).get((Object) null);
        ArrayList term305489 = new ArrayList();
        Object term305484 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term305484, term305484.getClass(), "traitId", "");
        setField(term305484, term305484.getClass(), "traitName", "");
        setField(term305484, term305484.getClass(), "description", "");
        setField(term305484, term305484.getClass(), "group", "");
        setField(term305484, term305484.getClass(), "conflictsWithIds", term305489);
        setByteField(term305484, term305484.getClass(), "traitPoints", (byte) 104);
        ArrayList term305498 = new ArrayList();
        ((ArrayList) term305498).add((Object)null);
        ((ArrayList) term305498).add((Object)null);
        ((ArrayList) term305498).add((Object)null);
        ((ArrayList) term305498).add((Object)null);
        ((ArrayList) term305498).add((Object)null);
        Object term305493 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term305493, term305493.getClass(), "traitId", "");
        setField(term305493, term305493.getClass(), "traitName", "");
        setField(term305493, term305493.getClass(), "description", "");
        setField(term305493, term305493.getClass(), "group", "");
        setField(term305493, term305493.getClass(), "conflictsWithIds", term305498);
        setByteField(term305493, term305493.getClass(), "traitPoints", (byte) -52);
        ArrayList term305507 = new ArrayList();
        ((ArrayList) term305507).add((Object)null);
        ((ArrayList) term305507).add((Object)null);
        ((ArrayList) term305507).add((Object)null);
        ((ArrayList) term305507).add((Object)null);
        ((ArrayList) term305507).add((Object)null);
        ((ArrayList) term305507).add((Object)null);
        ((ArrayList) term305507).add((Object)null);
        Object term305502 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term305502, term305502.getClass(), "traitId", "");
        setField(term305502, term305502.getClass(), "traitName", "");
        setField(term305502, term305502.getClass(), "description", "");
        setField(term305502, term305502.getClass(), "group", "");
        setField(term305502, term305502.getClass(), "conflictsWithIds", term305507);
        setByteField(term305502, term305502.getClass(), "traitPoints", (byte) -103);
        ArrayList term305516 = new ArrayList();
        ((ArrayList) term305516).add((Object)null);
        ((ArrayList) term305516).add((Object)null);
        ((ArrayList) term305516).add((Object)null);
        ((ArrayList) term305516).add((Object)null);
        ((ArrayList) term305516).add((Object)null);
        Object term305511 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term305511, term305511.getClass(), "traitId", "");
        setField(term305511, term305511.getClass(), "traitName", "");
        setField(term305511, term305511.getClass(), "description", "");
        setField(term305511, term305511.getClass(), "group", "");
        setField(term305511, term305511.getClass(), "conflictsWithIds", term305516);
        setByteField(term305511, term305511.getClass(), "traitPoints", (byte) 8);
        ArrayList term305525 = new ArrayList();
        ((ArrayList) term305525).add((Object)null);
        Object term305520 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term305520, term305520.getClass(), "traitId", "");
        setField(term305520, term305520.getClass(), "traitName", "");
        setField(term305520, term305520.getClass(), "description", "");
        setField(term305520, term305520.getClass(), "group", "");
        setField(term305520, term305520.getClass(), "conflictsWithIds", term305525);
        setByteField(term305520, term305520.getClass(), "traitPoints", (byte) 87);
        ArrayList term305482 = new ArrayList();
        ((ArrayList) term305482).add(term305484);
        ((ArrayList) term305482).add(term305493);
        ((ArrayList) term305482).add(term305502);
        ((ArrayList) term305482).add(term305511);
        ((ArrayList) term305482).add(term305520);
        Class<? extends Object> term307152 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term307151 = ((Class) term307152).getDeclaredField((String) "ROBOT");
        ((Field) term307151).setAccessible(true);
        Object enum945 = ((Field) term307151).get((Object) null);
        Class<? extends Object> term307444 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term307443 = ((Class) term307444).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term307443).setAccessible(true);
        Object enum946 = ((Field) term307443).get((Object) null);
        term305301 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term305443 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term305301, term305301.getClass(), "id", "xiCFEluOSq");
        setField(term305301, term305301.getClass(), "name", "EDeReFiqFY");
        setField(term305301, term305301.getClass(), "nameSingle", "uWHxeGcEwu");
        setField(term305301, term305301.getClass(), "attitude", enum939);
        setField(term305301, term305301.getClass(), "imagePath", "GVkEKlhcrr");
        setField(term305301, term305301.getClass(), "bridgeId", "uNKWJhnHHl");
        setField(term305301, term305301.getClass(), "spaceShipId", "wjhYcpvRUu");
        setField(term305301, term305301.getClass(), "socialSystem", enum940);
        setField(term305301, term305301.getClass(), "genderList", term305399);
        setField(term305301, term305301.getClass(), "speechSetId", "YqeXdoWJfV");
        setField(term305301, term305301.getClass(), "bridgeEffect", enum944);
        setField(term305443, term305443.getClass(), "songName", "qEABplGAwB");
        setField(term305443, term305443.getClass(), "author", "crdvuBefUh");
        setField(term305443, term305443.getClass(), "fileName", "DmSGIaLFxy");
        setBooleanField(term305443, term305443.getClass(), "custom", false);
        setIntField(term305443, term305443.getClass(), "fadingLimit", 608454583);
        setField(term305301, term305301.getClass(), "diplomacyMusic", term305443);
        setField(term305301, term305301.getClass(), "traits", term305482);
        setField(term305301, term305301.getClass(), "leaderNameGenerator", enum945);
        setField(term305301, term305301.getClass(), "description", "vlzfUznWJR");
        setField(term305301, term305301.getClass(), "spaceRaceType", enum946);
        Class<? extends Object> term307717 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term307716 = ((Class) term307717).getDeclaredField((String) "VOLCANIC");
        ((Field) term307716).setAccessible(true);
        enum947 = ((Field) term307716).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Object[] args = new Object[1];
        args[0] = enum947;
        callMethod(klass, "getTemperatureBaseValue", argTypes, term305301, args);
    }

};


