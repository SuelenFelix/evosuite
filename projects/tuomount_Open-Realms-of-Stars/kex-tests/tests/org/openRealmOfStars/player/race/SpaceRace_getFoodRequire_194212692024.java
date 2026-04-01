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

public class SpaceRace_getFoodRequire_194212692024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277931;

    public SpaceRace_getFoodRequire_194212692024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term278255 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term278254 = ((Class) term278255).getDeclaredField((String) "PEACEFUL");
        ((Field) term278254).setAccessible(true);
        Object enum851 = ((Field) term278254).get((Object) null);
        Class<? extends Object> term278546 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term278545 = ((Class) term278546).getDeclaredField((String) "EQUAL");
        ((Field) term278545).setAccessible(true);
        Object enum852 = ((Field) term278545).get((Object) null);
        Class<? extends Object> term278793 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term278792 = ((Class) term278793).getDeclaredField((String) "FEMALE");
        ((Field) term278792).setAccessible(true);
        Object enum853 =  ((Field) term278792).get((Object) null);
        Class<? extends Object> term279023 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term279022 = ((Class) term279023).getDeclaredField((String) "NONE");
        ((Field) term279022).setAccessible(true);
        Object enum854 =  ((Field) term279022).get((Object) null);
        ArrayList term278025 = new ArrayList();
        ((ArrayList) term278025).add(enum853);
        ((ArrayList) term278025).add(enum853);
        ((ArrayList) term278025).add(enum854);
        Class<? extends Object> term279257 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term279256 = ((Class) term279257).getDeclaredField((String) "NUKE_START");
        ((Field) term279256).setAccessible(true);
        Object enum855 = ((Field) term279256).get((Object) null);
        ArrayList term278109 = new ArrayList();
        ((ArrayList) term278109).add((Object)null);
        ((ArrayList) term278109).add((Object)null);
        ((ArrayList) term278109).add((Object)null);
        ((ArrayList) term278109).add((Object)null);
        ((ArrayList) term278109).add((Object)null);
        Object term278104 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term278104, term278104.getClass(), "traitId", "");
        setField(term278104, term278104.getClass(), "traitName", "");
        setField(term278104, term278104.getClass(), "description", "");
        setField(term278104, term278104.getClass(), "group", "");
        setField(term278104, term278104.getClass(), "conflictsWithIds", term278109);
        setByteField(term278104, term278104.getClass(), "traitPoints", (byte) 107);
        ArrayList term278118 = new ArrayList();
        ((ArrayList) term278118).add((Object)null);
        ((ArrayList) term278118).add((Object)null);
        ((ArrayList) term278118).add((Object)null);
        Object term278113 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term278113, term278113.getClass(), "traitId", "");
        setField(term278113, term278113.getClass(), "traitName", "");
        setField(term278113, term278113.getClass(), "description", "");
        setField(term278113, term278113.getClass(), "group", "");
        setField(term278113, term278113.getClass(), "conflictsWithIds", term278118);
        setByteField(term278113, term278113.getClass(), "traitPoints", (byte) -23);
        ArrayList term278127 = new ArrayList();
        ((ArrayList) term278127).add((Object)null);
        ((ArrayList) term278127).add((Object)null);
        ((ArrayList) term278127).add((Object)null);
        ((ArrayList) term278127).add((Object)null);
        ((ArrayList) term278127).add((Object)null);
        ((ArrayList) term278127).add((Object)null);
        ((ArrayList) term278127).add((Object)null);
        ((ArrayList) term278127).add((Object)null);
        ((ArrayList) term278127).add((Object)null);
        Object term278122 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term278122, term278122.getClass(), "traitId", "");
        setField(term278122, term278122.getClass(), "traitName", "");
        setField(term278122, term278122.getClass(), "description", "");
        setField(term278122, term278122.getClass(), "group", "");
        setField(term278122, term278122.getClass(), "conflictsWithIds", term278127);
        setByteField(term278122, term278122.getClass(), "traitPoints", (byte) 7);
        ArrayList term278136 = new ArrayList();
        ((ArrayList) term278136).add((Object)null);
        ((ArrayList) term278136).add((Object)null);
        Object term278131 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term278131, term278131.getClass(), "traitId", "");
        setField(term278131, term278131.getClass(), "traitName", "");
        setField(term278131, term278131.getClass(), "description", "");
        setField(term278131, term278131.getClass(), "group", "");
        setField(term278131, term278131.getClass(), "conflictsWithIds", term278136);
        setByteField(term278131, term278131.getClass(), "traitPoints", (byte) -60);
        ArrayList term278145 = new ArrayList();
        Object term278140 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term278140, term278140.getClass(), "traitId", "");
        setField(term278140, term278140.getClass(), "traitName", "");
        setField(term278140, term278140.getClass(), "description", "");
        setField(term278140, term278140.getClass(), "group", "");
        setField(term278140, term278140.getClass(), "conflictsWithIds", term278145);
        setByteField(term278140, term278140.getClass(), "traitPoints", (byte) -111);
        ArrayList term278154 = new ArrayList();
        Object term278149 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term278149, term278149.getClass(), "traitId", "");
        setField(term278149, term278149.getClass(), "traitName", "");
        setField(term278149, term278149.getClass(), "description", "");
        setField(term278149, term278149.getClass(), "group", "");
        setField(term278149, term278149.getClass(), "conflictsWithIds", term278154);
        setByteField(term278149, term278149.getClass(), "traitPoints", (byte) 127);
        ArrayList term278163 = new ArrayList();
        ((ArrayList) term278163).add((Object)null);
        Object term278158 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term278158, term278158.getClass(), "traitId", "");
        setField(term278158, term278158.getClass(), "traitName", "");
        setField(term278158, term278158.getClass(), "description", "");
        setField(term278158, term278158.getClass(), "group", "");
        setField(term278158, term278158.getClass(), "conflictsWithIds", term278163);
        setByteField(term278158, term278158.getClass(), "traitPoints", (byte) 98);
        ArrayList term278172 = new ArrayList();
        ((ArrayList) term278172).add((Object)null);
        ((ArrayList) term278172).add((Object)null);
        ((ArrayList) term278172).add((Object)null);
        ((ArrayList) term278172).add((Object)null);
        ((ArrayList) term278172).add((Object)null);
        ((ArrayList) term278172).add((Object)null);
        ((ArrayList) term278172).add((Object)null);
        Object term278167 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term278167, term278167.getClass(), "traitId", "");
        setField(term278167, term278167.getClass(), "traitName", "");
        setField(term278167, term278167.getClass(), "description", "");
        setField(term278167, term278167.getClass(), "group", "");
        setField(term278167, term278167.getClass(), "conflictsWithIds", term278172);
        setByteField(term278167, term278167.getClass(), "traitPoints", (byte) -49);
        ArrayList term278102 = new ArrayList();
        ((ArrayList) term278102).add(term278104);
        ((ArrayList) term278102).add(term278113);
        ((ArrayList) term278102).add(term278122);
        ((ArrayList) term278102).add(term278131);
        ((ArrayList) term278102).add(term278140);
        ((ArrayList) term278102).add(term278149);
        ((ArrayList) term278102).add(term278158);
        ((ArrayList) term278102).add(term278167);
        Class<? extends Object> term279554 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term279553 = ((Class) term279554).getDeclaredField((String) "DEEP_CREATURE");
        ((Field) term279553).setAccessible(true);
        Object enum856 = ((Field) term279553).get((Object) null);
        Class<? extends Object> term279870 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term279869 = ((Class) term279870).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term279869).setAccessible(true);
        Object enum857 = ((Field) term279869).get((Object) null);
        term277931 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term278063 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term277931, term277931.getClass(), "id", "XMgPdlQkhy");
        setField(term277931, term277931.getClass(), "name", "FagcUlRRig");
        setField(term277931, term277931.getClass(), "nameSingle", "eBoBopUIXv");
        setField(term277931, term277931.getClass(), "attitude", enum851);
        setField(term277931, term277931.getClass(), "imagePath", "oQrHpsHWfU");
        setField(term277931, term277931.getClass(), "bridgeId", "cRIqcVypqV");
        setField(term277931, term277931.getClass(), "spaceShipId", "HkjSosreWD");
        setField(term277931, term277931.getClass(), "socialSystem", enum852);
        setField(term277931, term277931.getClass(), "genderList", term278025);
        setField(term277931, term277931.getClass(), "speechSetId", "iwCfNJPqoQ");
        setField(term277931, term277931.getClass(), "bridgeEffect", enum855);
        setField(term278063, term278063.getClass(), "songName", "dFLZhdWnQQ");
        setField(term278063, term278063.getClass(), "author", "iviSqxxKri");
        setField(term278063, term278063.getClass(), "fileName", "DqctNOpAAG");
        setBooleanField(term278063, term278063.getClass(), "custom", true);
        setIntField(term278063, term278063.getClass(), "fadingLimit", 750226278);
        setField(term277931, term277931.getClass(), "diplomacyMusic", term278063);
        setField(term277931, term277931.getClass(), "traits", term278102);
        setField(term277931, term277931.getClass(), "leaderNameGenerator", enum856);
        setField(term277931, term277931.getClass(), "description", "ohwhPbAzfO");
        setField(term277931, term277931.getClass(), "spaceRaceType", enum857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFoodRequire", argTypes, term277931, args);
    }

};


