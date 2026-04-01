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

public class SpaceRace_getWarFatigueResistance_29018703526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282354;

    public SpaceRace_getWarFatigueResistance_29018703526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term282681 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term282680 = ((Class) term282681).getDeclaredField((String) "BACKSTABBING");
        ((Field) term282680).setAccessible(true);
        Object enum865 = ((Field) term282680).get((Object) null);
        Class<? extends Object> term282984 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term282983 = ((Class) term282984).getDeclaredField((String) "PATRIARCHY");
        ((Field) term282983).setAccessible(true);
        Object enum866 = ((Field) term282983).get((Object) null);
        Class<? extends Object> term283246 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term283245 = ((Class) term283246).getDeclaredField((String) "FEMALE");
        ((Field) term283245).setAccessible(true);
        Object enum867 =  ((Field) term283245).get((Object) null);
        Class<? extends Object> term283476 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term283475 = ((Class) term283476).getDeclaredField((String) "MALE");
        ((Field) term283475).setAccessible(true);
        Object enum868 =  ((Field) term283475).get((Object) null);
        ArrayList term282457 = new ArrayList();
        ((ArrayList) term282457).add(enum867);
        ((ArrayList) term282457).add(enum868);
        ((ArrayList) term282457).add(enum868);
        ((ArrayList) term282457).add(enum868);
        ((ArrayList) term282457).add(enum868);
        ((ArrayList) term282457).add(enum867);
        Class<? extends Object> term283710 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term283709 = ((Class) term283710).getDeclaredField((String) "ORANGE_BLINK");
        ((Field) term283709).setAccessible(true);
        Object enum869 = ((Field) term283709).get((Object) null);
        ArrayList term282543 = new ArrayList();
        Object term282538 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term282538, term282538.getClass(), "traitId", "");
        setField(term282538, term282538.getClass(), "traitName", "");
        setField(term282538, term282538.getClass(), "description", "");
        setField(term282538, term282538.getClass(), "group", "");
        setField(term282538, term282538.getClass(), "conflictsWithIds", term282543);
        setByteField(term282538, term282538.getClass(), "traitPoints", (byte) -7);
        ArrayList term282552 = new ArrayList();
        ((ArrayList) term282552).add((Object)null);
        ((ArrayList) term282552).add((Object)null);
        Object term282547 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term282547, term282547.getClass(), "traitId", "");
        setField(term282547, term282547.getClass(), "traitName", "");
        setField(term282547, term282547.getClass(), "description", "");
        setField(term282547, term282547.getClass(), "group", "");
        setField(term282547, term282547.getClass(), "conflictsWithIds", term282552);
        setByteField(term282547, term282547.getClass(), "traitPoints", (byte) 89);
        ArrayList term282561 = new ArrayList();
        ((ArrayList) term282561).add((Object)null);
        ((ArrayList) term282561).add((Object)null);
        ((ArrayList) term282561).add((Object)null);
        ((ArrayList) term282561).add((Object)null);
        Object term282556 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term282556, term282556.getClass(), "traitId", "");
        setField(term282556, term282556.getClass(), "traitName", "");
        setField(term282556, term282556.getClass(), "description", "");
        setField(term282556, term282556.getClass(), "group", "");
        setField(term282556, term282556.getClass(), "conflictsWithIds", term282561);
        setByteField(term282556, term282556.getClass(), "traitPoints", (byte) -36);
        ArrayList term282570 = new ArrayList();
        ((ArrayList) term282570).add((Object)null);
        ((ArrayList) term282570).add((Object)null);
        ((ArrayList) term282570).add((Object)null);
        ((ArrayList) term282570).add((Object)null);
        Object term282565 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term282565, term282565.getClass(), "traitId", "");
        setField(term282565, term282565.getClass(), "traitName", "");
        setField(term282565, term282565.getClass(), "description", "");
        setField(term282565, term282565.getClass(), "group", "");
        setField(term282565, term282565.getClass(), "conflictsWithIds", term282570);
        setByteField(term282565, term282565.getClass(), "traitPoints", (byte) -117);
        ArrayList term282579 = new ArrayList();
        ((ArrayList) term282579).add((Object)null);
        ((ArrayList) term282579).add((Object)null);
        Object term282574 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term282574, term282574.getClass(), "traitId", "");
        setField(term282574, term282574.getClass(), "traitName", "");
        setField(term282574, term282574.getClass(), "description", "");
        setField(term282574, term282574.getClass(), "group", "");
        setField(term282574, term282574.getClass(), "conflictsWithIds", term282579);
        setByteField(term282574, term282574.getClass(), "traitPoints", (byte) 41);
        ArrayList term282588 = new ArrayList();
        ((ArrayList) term282588).add((Object)null);
        ((ArrayList) term282588).add((Object)null);
        ((ArrayList) term282588).add((Object)null);
        ((ArrayList) term282588).add((Object)null);
        Object term282583 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term282583, term282583.getClass(), "traitId", "");
        setField(term282583, term282583.getClass(), "traitName", "");
        setField(term282583, term282583.getClass(), "description", "");
        setField(term282583, term282583.getClass(), "group", "");
        setField(term282583, term282583.getClass(), "conflictsWithIds", term282588);
        setByteField(term282583, term282583.getClass(), "traitPoints", (byte) -111);
        ArrayList term282597 = new ArrayList();
        ((ArrayList) term282597).add((Object)null);
        ((ArrayList) term282597).add((Object)null);
        ((ArrayList) term282597).add((Object)null);
        ((ArrayList) term282597).add((Object)null);
        Object term282592 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term282592, term282592.getClass(), "traitId", "");
        setField(term282592, term282592.getClass(), "traitName", "");
        setField(term282592, term282592.getClass(), "description", "");
        setField(term282592, term282592.getClass(), "group", "");
        setField(term282592, term282592.getClass(), "conflictsWithIds", term282597);
        setByteField(term282592, term282592.getClass(), "traitPoints", (byte) -127);
        ArrayList term282606 = new ArrayList();
        ((ArrayList) term282606).add((Object)null);
        ((ArrayList) term282606).add((Object)null);
        ((ArrayList) term282606).add((Object)null);
        ((ArrayList) term282606).add((Object)null);
        Object term282601 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term282601, term282601.getClass(), "traitId", "");
        setField(term282601, term282601.getClass(), "traitName", "");
        setField(term282601, term282601.getClass(), "description", "");
        setField(term282601, term282601.getClass(), "group", "");
        setField(term282601, term282601.getClass(), "conflictsWithIds", term282606);
        setByteField(term282601, term282601.getClass(), "traitPoints", (byte) 116);
        ArrayList term282536 = new ArrayList();
        ((ArrayList) term282536).add(term282538);
        ((ArrayList) term282536).add(term282547);
        ((ArrayList) term282536).add(term282556);
        ((ArrayList) term282536).add(term282565);
        ((ArrayList) term282536).add(term282574);
        ((ArrayList) term282536).add(term282583);
        ((ArrayList) term282536).add(term282592);
        ((ArrayList) term282536).add(term282601);
        Class<? extends Object> term284013 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term284012 = ((Class) term284013).getDeclaredField((String) "CYBORG");
        ((Field) term284012).setAccessible(true);
        Object enum870 = ((Field) term284012).get((Object) null);
        Class<? extends Object> term284308 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term284307 = ((Class) term284308).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term284307).setAccessible(true);
        Object enum871 = ((Field) term284307).get((Object) null);
        term282354 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term282497 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term282354, term282354.getClass(), "id", "OIVvPvythq");
        setField(term282354, term282354.getClass(), "name", "OIRXQPPjVx");
        setField(term282354, term282354.getClass(), "nameSingle", "SxVFmiOidb");
        setField(term282354, term282354.getClass(), "attitude", enum865);
        setField(term282354, term282354.getClass(), "imagePath", "BsiZGiodQR");
        setField(term282354, term282354.getClass(), "bridgeId", "oJyzXrwmfx");
        setField(term282354, term282354.getClass(), "spaceShipId", "RsEXdKLcXN");
        setField(term282354, term282354.getClass(), "socialSystem", enum866);
        setField(term282354, term282354.getClass(), "genderList", term282457);
        setField(term282354, term282354.getClass(), "speechSetId", "zoOFEvSdRU");
        setField(term282354, term282354.getClass(), "bridgeEffect", enum869);
        setField(term282497, term282497.getClass(), "songName", "WtywQPTOaF");
        setField(term282497, term282497.getClass(), "author", "MZMkZoDeKG");
        setField(term282497, term282497.getClass(), "fileName", "JWhhCdUerg");
        setBooleanField(term282497, term282497.getClass(), "custom", true);
        setIntField(term282497, term282497.getClass(), "fadingLimit", 1063281217);
        setField(term282354, term282354.getClass(), "diplomacyMusic", term282497);
        setField(term282354, term282354.getClass(), "traits", term282536);
        setField(term282354, term282354.getClass(), "leaderNameGenerator", enum870);
        setField(term282354, term282354.getClass(), "description", "DWQRVUVtua");
        setField(term282354, term282354.getClass(), "spaceRaceType", enum871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWarFatigueResistance", argTypes, term282354, args);
    }

};


