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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class TechFactory_getListByTechLevel_170786553916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum578;
     Object term192339;
     Object term192341;

    public TechFactory_getListByTechLevel_170786553916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192596 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term192595 = ((Class) term192596).getDeclaredField((String) "Propulsion");
        ((Field) term192595).setAccessible(true);
        enum578 = ((Field) term192595).get((Object) null);
        term192339 = new Integer(-284885486);
        Class<? extends Object> term192868 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term192867 = ((Class) term192868).getDeclaredField((String) "PEACEFUL");
        ((Field) term192867).setAccessible(true);
        Object enum579 = ((Field) term192867).get((Object) null);
        Class<? extends Object> term193159 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term193158 = ((Class) term193159).getDeclaredField((String) "PATRIARCHY");
        ((Field) term193158).setAccessible(true);
        Object enum580 = ((Field) term193158).get((Object) null);
        Class<? extends Object> term193421 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term193420 = ((Class) term193421).getDeclaredField((String) "FEMALE");
        ((Field) term193420).setAccessible(true);
        Object enum581 =  ((Field) term193420).get((Object) null);
        Class<? extends Object> term193651 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term193650 = ((Class) term193651).getDeclaredField((String) "FEMALE");
        ((Field) term193650).setAccessible(true);
        Object enum582 =  ((Field) term193650).get((Object) null);
        Class<? extends Object> term193881 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term193880 = ((Class) term193881).getDeclaredField((String) "NONE");
        ((Field) term193880).setAccessible(true);
        Object enum583 =  ((Field) term193880).get((Object) null);
        ArrayList term192440 = new ArrayList();
        ((ArrayList) term192440).add(enum581);
        ((ArrayList) term192440).add(enum581);
        ((ArrayList) term192440).add(enum582);
        ((ArrayList) term192440).add(enum582);
        ((ArrayList) term192440).add(enum583);
        ((ArrayList) term192440).add(enum582);
        ((ArrayList) term192440).add(enum582);
        Class<? extends Object> term194115 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term194114 = ((Class) term194115).getDeclaredField((String) "YELLOW_ALERT");
        ((Field) term194114).setAccessible(true);
        Object enum584 = ((Field) term194114).get((Object) null);
        ArrayList term192530 = new ArrayList();
        ((ArrayList) term192530).add((Object)null);
        ((ArrayList) term192530).add((Object)null);
        Object term192525 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term192525, term192525.getClass(), "traitId", "");
        setField(term192525, term192525.getClass(), "traitName", "");
        setField(term192525, term192525.getClass(), "description", "");
        setField(term192525, term192525.getClass(), "group", "");
        setField(term192525, term192525.getClass(), "conflictsWithIds", term192530);
        setByteField(term192525, term192525.getClass(), "traitPoints", (byte) -4);
        ArrayList term192539 = new ArrayList();
        ((ArrayList) term192539).add((Object)null);
        ((ArrayList) term192539).add((Object)null);
        Object term192534 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term192534, term192534.getClass(), "traitId", "");
        setField(term192534, term192534.getClass(), "traitName", "");
        setField(term192534, term192534.getClass(), "description", "");
        setField(term192534, term192534.getClass(), "group", "");
        setField(term192534, term192534.getClass(), "conflictsWithIds", term192539);
        setByteField(term192534, term192534.getClass(), "traitPoints", (byte) 28);
        ArrayList term192548 = new ArrayList();
        ((ArrayList) term192548).add((Object)null);
        ((ArrayList) term192548).add((Object)null);
        ((ArrayList) term192548).add((Object)null);
        ((ArrayList) term192548).add((Object)null);
        ((ArrayList) term192548).add((Object)null);
        ((ArrayList) term192548).add((Object)null);
        ((ArrayList) term192548).add((Object)null);
        ((ArrayList) term192548).add((Object)null);
        ((ArrayList) term192548).add((Object)null);
        Object term192543 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term192543, term192543.getClass(), "traitId", "");
        setField(term192543, term192543.getClass(), "traitName", "");
        setField(term192543, term192543.getClass(), "description", "");
        setField(term192543, term192543.getClass(), "group", "");
        setField(term192543, term192543.getClass(), "conflictsWithIds", term192548);
        setByteField(term192543, term192543.getClass(), "traitPoints", (byte) 94);
        ArrayList term192523 = new ArrayList();
        ((ArrayList) term192523).add(term192525);
        ((ArrayList) term192523).add(term192534);
        ((ArrayList) term192523).add(term192543);
        Class<? extends Object> term194418 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term194417 = ((Class) term194418).getDeclaredField((String) "BIG_PLANT");
        ((Field) term194417).setAccessible(true);
        Object enum585 = ((Field) term194417).get((Object) null);
        Class<? extends Object> term194722 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term194721 = ((Class) term194722).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term194721).setAccessible(true);
        Object enum586 = ((Field) term194721).get((Object) null);
        term192341 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term192484 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term192341, term192341.getClass(), "id", "iRfJJNrMLZ");
        setField(term192341, term192341.getClass(), "name", "sYrnlJNHsq");
        setField(term192341, term192341.getClass(), "nameSingle", "POHTKvZAAU");
        setField(term192341, term192341.getClass(), "attitude", enum579);
        setField(term192341, term192341.getClass(), "imagePath", "HSQaALDFNu");
        setField(term192341, term192341.getClass(), "bridgeId", "aOaXBQyJal");
        setField(term192341, term192341.getClass(), "spaceShipId", "vRbigVGnNS");
        setField(term192341, term192341.getClass(), "socialSystem", enum580);
        setField(term192341, term192341.getClass(), "genderList", term192440);
        setField(term192341, term192341.getClass(), "speechSetId", "bVteGrLeFP");
        setField(term192341, term192341.getClass(), "bridgeEffect", enum584);
        setField(term192484, term192484.getClass(), "songName", "LLVxzGZuym");
        setField(term192484, term192484.getClass(), "author", "FHWZKmPKlK");
        setField(term192484, term192484.getClass(), "fileName", "MqWvZIWxCr");
        setBooleanField(term192484, term192484.getClass(), "custom", true);
        setIntField(term192484, term192484.getClass(), "fadingLimit", 1791984446);
        setField(term192341, term192341.getClass(), "diplomacyMusic", term192484);
        setField(term192341, term192341.getClass(), "traits", term192523);
        setField(term192341, term192341.getClass(), "leaderNameGenerator", enum585);
        setField(term192341, term192341.getClass(), "description", "aYWilzmMDP");
        setField(term192341, term192341.getClass(), "spaceRaceType", enum586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[3];
        args[0] = enum578;
        args[1] = term192339;
        args[2] = term192341;
        callMethod(klass, "getListByTechLevel", argTypes, null, args);
    }

};


