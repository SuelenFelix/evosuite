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

public class ExternalUserData_getOverDamageBattlePoint_152364482417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3170956;

    public ExternalUserData_getOverDamageBattlePoint_152364482417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3170956 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3170956, term3170956.getClass(), "accessCode", "CxOqyjcIgy");
        setField(term3170956, term3170956.getClass(), "userName", "jgjNDcfjGS");
        setIntField(term3170956, term3170956.getClass(), "level", 145201592);
        setIntField(term3170956, term3170956.getClass(), "reincarnationNum", 1182633177);
        setLongField(term3170956, term3170956.getClass(), "exp", -557504471814243389L);
        setLongField(term3170956, term3170956.getClass(), "point", -1952206846782881292L);
        setLongField(term3170956, term3170956.getClass(), "totalPoint", 2256736264768408457L);
        setIntField(term3170956, term3170956.getClass(), "playCount", 630832787);
        setIntField(term3170956, term3170956.getClass(), "jewelCount", -255062885);
        setIntField(term3170956, term3170956.getClass(), "totalJewelCount", -1871267674);
        setIntField(term3170956, term3170956.getClass(), "medalCount", -2015544974);
        setIntField(term3170956, term3170956.getClass(), "playerRating", -1856444749);
        setIntField(term3170956, term3170956.getClass(), "highestRating", -1130745710);
        setIntField(term3170956, term3170956.getClass(), "battlePoint", 80681881);
        setIntField(term3170956, term3170956.getClass(), "bestBattlePoint", -120208287);
        setIntField(term3170956, term3170956.getClass(), "overDamageBattlePoint", 1951561722);
        setIntField(term3170956, term3170956.getClass(), "nameplateId", -278832094);
        setIntField(term3170956, term3170956.getClass(), "trophyId", -2145832490);
        setIntField(term3170956, term3170956.getClass(), "cardId", -1499092664);
        setIntField(term3170956, term3170956.getClass(), "characterId", -139305476);
        setIntField(term3170956, term3170956.getClass(), "tabSetting", 1753619497);
        setIntField(term3170956, term3170956.getClass(), "tabSortSetting", -1031408267);
        setIntField(term3170956, term3170956.getClass(), "cardCategorySetting", 1934019356);
        setIntField(term3170956, term3170956.getClass(), "cardSortSetting", 732528999);
        setIntField(term3170956, term3170956.getClass(), "rivalScoreCategorySetting", 2043382358);
        setIntField(term3170956, term3170956.getClass(), "playedTutorialBit", 1967989244);
        setIntField(term3170956, term3170956.getClass(), "firstTutorialCancelNum", 858984437);
        setLongField(term3170956, term3170956.getClass(), "sumTechHighScore", -5021238623137810346L);
        setLongField(term3170956, term3170956.getClass(), "sumTechBasicHighScore", -7002905536550647167L);
        setLongField(term3170956, term3170956.getClass(), "sumTechAdvancedHighScore", -3382897060980582810L);
        setLongField(term3170956, term3170956.getClass(), "sumTechExpertHighScore", -6920792960012257696L);
        setLongField(term3170956, term3170956.getClass(), "sumTechMasterHighScore", 1023861240621560610L);
        setLongField(term3170956, term3170956.getClass(), "sumTechLunaticHighScore", 6735713656028505492L);
        setLongField(term3170956, term3170956.getClass(), "sumBattleHighScore", -4853702873510435522L);
        setLongField(term3170956, term3170956.getClass(), "sumBattleBasicHighScore", -5885534898937041201L);
        setLongField(term3170956, term3170956.getClass(), "sumBattleAdvancedHighScore", 4930193129091915848L);
        setLongField(term3170956, term3170956.getClass(), "sumBattleExpertHighScore", -9090037278219238202L);
        setLongField(term3170956, term3170956.getClass(), "sumBattleMasterHighScore", 9217127001921519628L);
        setLongField(term3170956, term3170956.getClass(), "sumBattleLunaticHighScore", 1865455560890649141L);
        setField(term3170956, term3170956.getClass(), "eventWatchedDate", "yNSvDJrxqD");
        setField(term3170956, term3170956.getClass(), "cmEventWatchedDate", "NZYgDtlCQd");
        setField(term3170956, term3170956.getClass(), "firstGameId", "ovzyMFWBSq");
        setField(term3170956, term3170956.getClass(), "firstRomVersion", "XOWSYkfKts");
        setField(term3170956, term3170956.getClass(), "firstDataVersion", "FiQTmoFCGX");
        setField(term3170956, term3170956.getClass(), "firstPlayDate", "MhMthckMOM");
        setField(term3170956, term3170956.getClass(), "lastGameId", "CkUtZDcOQj");
        setField(term3170956, term3170956.getClass(), "lastRomVersion", "oVhyPeiMBF");
        setField(term3170956, term3170956.getClass(), "lastDataVersion", "lxEiYuBQxV");
        setField(term3170956, term3170956.getClass(), "compatibleCmVersion", "PPLNvNQkxV");
        setField(term3170956, term3170956.getClass(), "lastPlayDate", "PIiiqNXOxu");
        setIntField(term3170956, term3170956.getClass(), "lastPlaceId", -678127289);
        setField(term3170956, term3170956.getClass(), "lastPlaceName", "BCJsEDUYjT");
        setIntField(term3170956, term3170956.getClass(), "lastRegionId", 1250787104);
        setField(term3170956, term3170956.getClass(), "lastRegionName", "iUBGtcyNiX");
        setIntField(term3170956, term3170956.getClass(), "lastAllNetId", 1480962378);
        setField(term3170956, term3170956.getClass(), "lastClientId", "vgtFVgzJXg");
        setIntField(term3170956, term3170956.getClass(), "lastUsedDeckId", -239704539);
        setIntField(term3170956, term3170956.getClass(), "lastPlayMusicLevel", 1206406277);
        setIntField(term3170956, term3170956.getClass(), "lastEmoneyBrand", 152530681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverDamageBattlePoint", argTypes, term3170956, args);
    }

};


