package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class FleetTileInfo_getImageIndex_20217294634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88035;

    public FleetTileInfo_getImageIndex_20217294634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88297 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term88296 = ((Class) term88297).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term88296).setAccessible(true);
        Object enum233 = ((Field) term88296).get((Object) null);
        Class<? extends Object> term88594 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term88593 = ((Class) term88594).getDeclaredField((String) "MATRIARCHY");
        ((Field) term88593).setAccessible(true);
        Object enum234 = ((Field) term88593).get((Object) null);
        Class<? extends Object> term88856 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term88855 = ((Class) term88856).getDeclaredField((String) "MALE");
        ((Field) term88855).setAccessible(true);
        Object enum235 =  ((Field) term88855).get((Object) null);
        Class<? extends Object> term89080 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term89079 = ((Class) term89080).getDeclaredField((String) "MALE");
        ((Field) term89079).setAccessible(true);
        Object enum236 =  ((Field) term89079).get((Object) null);
        ArrayList term88137 = new ArrayList();
        ((ArrayList) term88137).add(enum235);
        ((ArrayList) term88137).add(enum235);
        ((ArrayList) term88137).add(enum235);
        ((ArrayList) term88137).add(enum236);
        ((ArrayList) term88137).add(enum235);
        Class<? extends Object> term89314 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term89313 = ((Class) term89314).getDeclaredField((String) "FADE_IN");
        ((Field) term89313).setAccessible(true);
        Object enum237 = ((Field) term89313).get((Object) null);
        Object term88211 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term88211, term88211.getClass(), "traitId", null);
        setField(term88211, term88211.getClass(), "traitName", null);
        setField(term88211, term88211.getClass(), "description", null);
        setField(term88211, term88211.getClass(), "group", null);
        setField(term88211, term88211.getClass(), "conflictsWithIds", null);
        setByteField(term88211, term88211.getClass(), "traitPoints", (byte) 118);
        Object term88213 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term88213, term88213.getClass(), "traitId", null);
        setField(term88213, term88213.getClass(), "traitName", null);
        setField(term88213, term88213.getClass(), "description", null);
        setField(term88213, term88213.getClass(), "group", null);
        setField(term88213, term88213.getClass(), "conflictsWithIds", null);
        setByteField(term88213, term88213.getClass(), "traitPoints", (byte) -114);
        Object term88215 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term88215, term88215.getClass(), "traitId", null);
        setField(term88215, term88215.getClass(), "traitName", null);
        setField(term88215, term88215.getClass(), "description", null);
        setField(term88215, term88215.getClass(), "group", null);
        setField(term88215, term88215.getClass(), "conflictsWithIds", null);
        setByteField(term88215, term88215.getClass(), "traitPoints", (byte) 97);
        Object term88217 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term88217, term88217.getClass(), "traitId", null);
        setField(term88217, term88217.getClass(), "traitName", null);
        setField(term88217, term88217.getClass(), "description", null);
        setField(term88217, term88217.getClass(), "group", null);
        setField(term88217, term88217.getClass(), "conflictsWithIds", null);
        setByteField(term88217, term88217.getClass(), "traitPoints", (byte) -75);
        Object term88219 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term88219, term88219.getClass(), "traitId", null);
        setField(term88219, term88219.getClass(), "traitName", null);
        setField(term88219, term88219.getClass(), "description", null);
        setField(term88219, term88219.getClass(), "group", null);
        setField(term88219, term88219.getClass(), "conflictsWithIds", null);
        setByteField(term88219, term88219.getClass(), "traitPoints", (byte) 52);
        Object term88221 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term88221, term88221.getClass(), "traitId", null);
        setField(term88221, term88221.getClass(), "traitName", null);
        setField(term88221, term88221.getClass(), "description", null);
        setField(term88221, term88221.getClass(), "group", null);
        setField(term88221, term88221.getClass(), "conflictsWithIds", null);
        setByteField(term88221, term88221.getClass(), "traitPoints", (byte) -128);
        Object term88223 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term88223, term88223.getClass(), "traitId", null);
        setField(term88223, term88223.getClass(), "traitName", null);
        setField(term88223, term88223.getClass(), "description", null);
        setField(term88223, term88223.getClass(), "group", null);
        setField(term88223, term88223.getClass(), "conflictsWithIds", null);
        setByteField(term88223, term88223.getClass(), "traitPoints", (byte) 120);
        Object term88225 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term88225, term88225.getClass(), "traitId", null);
        setField(term88225, term88225.getClass(), "traitName", null);
        setField(term88225, term88225.getClass(), "description", null);
        setField(term88225, term88225.getClass(), "group", null);
        setField(term88225, term88225.getClass(), "conflictsWithIds", null);
        setByteField(term88225, term88225.getClass(), "traitPoints", (byte) 49);
        ArrayList term88209 = new ArrayList();
        ((ArrayList) term88209).add(term88211);
        ((ArrayList) term88209).add(term88213);
        ((ArrayList) term88209).add(term88215);
        ((ArrayList) term88209).add(term88217);
        ((ArrayList) term88209).add(term88219);
        ((ArrayList) term88209).add(term88221);
        ((ArrayList) term88209).add(term88223);
        ((ArrayList) term88209).add(term88225);
        Class<? extends Object> term89602 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term89601 = ((Class) term89602).getDeclaredField((String) "ROBOT");
        ((Field) term89601).setAccessible(true);
        Object enum238 = ((Field) term89601).get((Object) null);
        Class<? extends Object> term89894 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term89893 = ((Class) term89894).getDeclaredField((String) "REGULAR");
        ((Field) term89893).setAccessible(true);
        Object enum239 = ((Field) term89893).get((Object) null);
        term88035 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term88036 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term88170 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term88036, term88036.getClass(), "id", "PxBSOwkatN");
        setField(term88036, term88036.getClass(), "name", "uKjlgaHcoc");
        setField(term88036, term88036.getClass(), "nameSingle", "ITJMSWaPGZ");
        setField(term88036, term88036.getClass(), "attitude", enum233);
        setField(term88036, term88036.getClass(), "imagePath", "ivvEvcUacU");
        setField(term88036, term88036.getClass(), "bridgeId", "gbSukHPGfP");
        setField(term88036, term88036.getClass(), "spaceShipId", "jEDnJjwhoo");
        setField(term88036, term88036.getClass(), "socialSystem", enum234);
        setField(term88036, term88036.getClass(), "genderList", term88137);
        setField(term88036, term88036.getClass(), "speechSetId", "TkTHRRicKc");
        setField(term88036, term88036.getClass(), "bridgeEffect", enum237);
        setField(term88170, term88170.getClass(), "songName", "xwBoTnuoQg");
        setField(term88170, term88170.getClass(), "author", "HHAcgDPghN");
        setField(term88170, term88170.getClass(), "fileName", "GzmFcFoYft");
        setBooleanField(term88170, term88170.getClass(), "custom", true);
        setIntField(term88170, term88170.getClass(), "fadingLimit", 473269350);
        setField(term88036, term88036.getClass(), "diplomacyMusic", term88170);
        setField(term88036, term88036.getClass(), "traits", term88209);
        setField(term88036, term88036.getClass(), "leaderNameGenerator", enum238);
        setField(term88036, term88036.getClass(), "description", "RVQbteztJx");
        setField(term88036, term88036.getClass(), "spaceRaceType", enum239);
        setField(term88035, term88035.getClass(), "race", term88036);
        setIntField(term88035, term88035.getClass(), "imageIndex", -1267755429);
        setIntField(term88035, term88035.getClass(), "playerIndex", 481428944);
        setIntField(term88035, term88035.getClass(), "fleetIndex", 585379621);
        setIntField(term88035, term88035.getClass(), "planetIndex", 1343392329);
        setIntField(term88035, term88035.getClass(), "conflictIndex", 9075231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageIndex", argTypes, term88035, args);
    }

};


