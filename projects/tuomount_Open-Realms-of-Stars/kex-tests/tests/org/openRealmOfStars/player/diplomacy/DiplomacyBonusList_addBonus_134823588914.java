package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class DiplomacyBonusList_addBonus_134823588914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38637;
     Object enum108;
     Object term38678;

    public DiplomacyBonusList_addBonus_134823588914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38898 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term38897 = ((Class) term38898).getDeclaredField((String) "LIKED_EMBARGO");
        ((Field) term38897).setAccessible(true);
        Object enum105 = ((Field) term38897).get((Object) null);
        Object term38641 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term38641, term38641.getClass(), "type", enum105);
        setBooleanField(term38641, term38641.getClass(), "onlyOne", true);
        setIntField(term38641, term38641.getClass(), "bonusValue", -1794965320);
        setIntField(term38641, term38641.getClass(), "bonusLasting", 520504102);
        Class<? extends Object> term39224 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term39223 = ((Class) term39224).getDeclaredField((String) "SIMILAR_GOVERNMENT");
        ((Field) term39223).setAccessible(true);
        Object enum106 = ((Field) term39223).get((Object) null);
        Object term38647 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term38647, term38647.getClass(), "type", enum106);
        setBooleanField(term38647, term38647.getClass(), "onlyOne", true);
        setIntField(term38647, term38647.getClass(), "bonusValue", -457396133);
        setIntField(term38647, term38647.getClass(), "bonusLasting", -1793950607);
        Class<? extends Object> term39565 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term39564 = ((Class) term39565).getDeclaredField((String) "REALM_LOST");
        ((Field) term39564).setAccessible(true);
        Object enum107 = ((Field) term39564).get((Object) null);
        Object term38653 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term38653, term38653.getClass(), "type", enum107);
        setBooleanField(term38653, term38653.getClass(), "onlyOne", true);
        setIntField(term38653, term38653.getClass(), "bonusValue", 1091954101);
        setIntField(term38653, term38653.getClass(), "bonusLasting", 1895143076);
        ArrayList term38639 = new ArrayList();
        ((ArrayList) term38639).add(term38641);
        ((ArrayList) term38639).add(term38647);
        ((ArrayList) term38639).add(term38653);
        term38637 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term38637, term38637.getClass(), "playerIndex", 824341437);
        setField(term38637, term38637.getClass(), "list", term38639);
        setIntField(term38637, term38637.getClass(), "numberOfMeetings", 1981860404);
        Class<? extends Object> term39882 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term39881 = ((Class) term39882).getDeclaredField((String) "BOARD_PLAYER");
        ((Field) term39881).setAccessible(true);
        enum108 = ((Field) term39881).get((Object) null);
        Class<? extends Object> term40235 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term40234 = ((Class) term40235).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term40234).setAccessible(true);
        Object enum109 = ((Field) term40234).get((Object) null);
        Class<? extends Object> term40532 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term40531 = ((Class) term40532).getDeclaredField((String) "PATRIARCHY");
        ((Field) term40531).setAccessible(true);
        Object enum110 = ((Field) term40531).get((Object) null);
        ArrayList term38779 = new ArrayList();
        Class<? extends Object> term40804 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term40803 = ((Class) term40804).getDeclaredField((String) "WARM_WHITE");
        ((Field) term40803).setAccessible(true);
        Object enum111 = ((Field) term40803).get((Object) null);
        ArrayList term38848 = new ArrayList();
        Class<? extends Object> term41101 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term41100 = ((Class) term41101).getDeclaredField((String) "ANCIENT_ROMAN");
        ((Field) term41100).setAccessible(true);
        Object enum112 = ((Field) term41100).get((Object) null);
        Class<? extends Object> term41417 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term41416 = ((Class) term41417).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term41416).setAccessible(true);
        Object enum113 = ((Field) term41416).get((Object) null);
        term38678 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term38809 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term38678, term38678.getClass(), "id", "YsUtbngnRO");
        setField(term38678, term38678.getClass(), "name", "JisaWUxcNb");
        setField(term38678, term38678.getClass(), "nameSingle", "NxgmYPzWCI");
        setField(term38678, term38678.getClass(), "attitude", enum109);
        setField(term38678, term38678.getClass(), "imagePath", "SqjyKmayBx");
        setField(term38678, term38678.getClass(), "bridgeId", "XjDhvToxJy");
        setField(term38678, term38678.getClass(), "spaceShipId", "nxSTJflLQy");
        setField(term38678, term38678.getClass(), "socialSystem", enum110);
        setField(term38678, term38678.getClass(), "genderList", term38779);
        setField(term38678, term38678.getClass(), "speechSetId", "FlHzxEfFzI");
        setField(term38678, term38678.getClass(), "bridgeEffect", enum111);
        setField(term38809, term38809.getClass(), "songName", "aSATgQUpoe");
        setField(term38809, term38809.getClass(), "author", "VkPSXewZfB");
        setField(term38809, term38809.getClass(), "fileName", "ubodzJoMGW");
        setBooleanField(term38809, term38809.getClass(), "custom", false);
        setIntField(term38809, term38809.getClass(), "fadingLimit", 732174235);
        setField(term38678, term38678.getClass(), "diplomacyMusic", term38809);
        setField(term38678, term38678.getClass(), "traits", term38848);
        setField(term38678, term38678.getClass(), "leaderNameGenerator", enum112);
        setField(term38678, term38678.getClass(), "description", "weddIktxOA");
        setField(term38678, term38678.getClass(), "spaceRaceType", enum113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[2];
        args[0] = enum108;
        args[1] = term38678;
        callMethod(klass, "addBonus", argTypes, term38637, args);
    }

};


