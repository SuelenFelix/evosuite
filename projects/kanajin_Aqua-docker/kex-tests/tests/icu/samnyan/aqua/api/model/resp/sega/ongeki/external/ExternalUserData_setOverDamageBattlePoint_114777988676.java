package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ExternalUserData_setOverDamageBattlePoint_114777988676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3194390;
     Object term3194626;

    public ExternalUserData_setOverDamageBattlePoint_114777988676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3194390 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3194390, term3194390.getClass(), "accessCode", "fXnvfzYbZB");
        setField(term3194390, term3194390.getClass(), "userName", "ZrGNNPbxKk");
        setIntField(term3194390, term3194390.getClass(), "level", 700325173);
        setIntField(term3194390, term3194390.getClass(), "reincarnationNum", -1119987628);
        setLongField(term3194390, term3194390.getClass(), "exp", -4034088984511957250L);
        setLongField(term3194390, term3194390.getClass(), "point", -4862092451588283686L);
        setLongField(term3194390, term3194390.getClass(), "totalPoint", 3661678622275035571L);
        setIntField(term3194390, term3194390.getClass(), "playCount", 224704813);
        setIntField(term3194390, term3194390.getClass(), "jewelCount", -938920680);
        setIntField(term3194390, term3194390.getClass(), "totalJewelCount", 1658364075);
        setIntField(term3194390, term3194390.getClass(), "medalCount", -1862255337);
        setIntField(term3194390, term3194390.getClass(), "playerRating", -211396230);
        setIntField(term3194390, term3194390.getClass(), "highestRating", -1647109238);
        setIntField(term3194390, term3194390.getClass(), "battlePoint", -1458336311);
        setIntField(term3194390, term3194390.getClass(), "bestBattlePoint", -2138205497);
        setIntField(term3194390, term3194390.getClass(), "overDamageBattlePoint", -1186763823);
        setIntField(term3194390, term3194390.getClass(), "nameplateId", -1551151081);
        setIntField(term3194390, term3194390.getClass(), "trophyId", 1031407031);
        setIntField(term3194390, term3194390.getClass(), "cardId", 1680635050);
        setIntField(term3194390, term3194390.getClass(), "characterId", -1673942685);
        setIntField(term3194390, term3194390.getClass(), "tabSetting", -1383647704);
        setIntField(term3194390, term3194390.getClass(), "tabSortSetting", -1097444301);
        setIntField(term3194390, term3194390.getClass(), "cardCategorySetting", 867455140);
        setIntField(term3194390, term3194390.getClass(), "cardSortSetting", 1592855724);
        setIntField(term3194390, term3194390.getClass(), "rivalScoreCategorySetting", 615075066);
        setIntField(term3194390, term3194390.getClass(), "playedTutorialBit", 745315475);
        setIntField(term3194390, term3194390.getClass(), "firstTutorialCancelNum", -412407316);
        setLongField(term3194390, term3194390.getClass(), "sumTechHighScore", 7923072650971061132L);
        setLongField(term3194390, term3194390.getClass(), "sumTechBasicHighScore", 5277124202185216548L);
        setLongField(term3194390, term3194390.getClass(), "sumTechAdvancedHighScore", -8245186269544982357L);
        setLongField(term3194390, term3194390.getClass(), "sumTechExpertHighScore", -2188766194747560149L);
        setLongField(term3194390, term3194390.getClass(), "sumTechMasterHighScore", -6286941457958397900L);
        setLongField(term3194390, term3194390.getClass(), "sumTechLunaticHighScore", -3588751049589226545L);
        setLongField(term3194390, term3194390.getClass(), "sumBattleHighScore", -978246897359935286L);
        setLongField(term3194390, term3194390.getClass(), "sumBattleBasicHighScore", 462151429997718985L);
        setLongField(term3194390, term3194390.getClass(), "sumBattleAdvancedHighScore", -8229695849995246119L);
        setLongField(term3194390, term3194390.getClass(), "sumBattleExpertHighScore", -661831689401061308L);
        setLongField(term3194390, term3194390.getClass(), "sumBattleMasterHighScore", -3947844246385356291L);
        setLongField(term3194390, term3194390.getClass(), "sumBattleLunaticHighScore", 7361071872592719589L);
        setField(term3194390, term3194390.getClass(), "eventWatchedDate", "wQNBinhIQn");
        setField(term3194390, term3194390.getClass(), "cmEventWatchedDate", "dUcNSttkQu");
        setField(term3194390, term3194390.getClass(), "firstGameId", "MXQIInJfTj");
        setField(term3194390, term3194390.getClass(), "firstRomVersion", "xisZTYvKXu");
        setField(term3194390, term3194390.getClass(), "firstDataVersion", "gZMlIiuQVQ");
        setField(term3194390, term3194390.getClass(), "firstPlayDate", "RrURKfKOta");
        setField(term3194390, term3194390.getClass(), "lastGameId", "QHHrVvvrXs");
        setField(term3194390, term3194390.getClass(), "lastRomVersion", "RLkOrezyAz");
        setField(term3194390, term3194390.getClass(), "lastDataVersion", "uUNYdkeTeW");
        setField(term3194390, term3194390.getClass(), "compatibleCmVersion", "bKTBlOBixI");
        setField(term3194390, term3194390.getClass(), "lastPlayDate", "ZoErSaJbGl");
        setIntField(term3194390, term3194390.getClass(), "lastPlaceId", 1737420828);
        setField(term3194390, term3194390.getClass(), "lastPlaceName", "TnyVajVbdk");
        setIntField(term3194390, term3194390.getClass(), "lastRegionId", 2034013038);
        setField(term3194390, term3194390.getClass(), "lastRegionName", "xzCcbfHkVQ");
        setIntField(term3194390, term3194390.getClass(), "lastAllNetId", -888876278);
        setField(term3194390, term3194390.getClass(), "lastClientId", "mZBLAXcJao");
        setIntField(term3194390, term3194390.getClass(), "lastUsedDeckId", -1519922430);
        setIntField(term3194390, term3194390.getClass(), "lastPlayMusicLevel", 1468658425);
        setIntField(term3194390, term3194390.getClass(), "lastEmoneyBrand", -503196387);
        term3194626 = new Integer(-725318102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3194626;
        callMethod(klass, "setOverDamageBattlePoint", argTypes, term3194390, args);
    }

};


