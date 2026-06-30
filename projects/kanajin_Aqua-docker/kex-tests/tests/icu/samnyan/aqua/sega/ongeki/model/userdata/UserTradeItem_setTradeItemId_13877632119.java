package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserTradeItem_setTradeItemId_13877632119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154543;
     Object term154811;

    public UserTradeItem_setTradeItemId_13877632119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term154549 = new Long(3746481521207337771L);
        term154543 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term154545 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term154547 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term154563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term154573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154578 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term154543, term154543.getClass(), "id", 8433973234615859286L);
        setLongField(term154545, term154545.getClass(), "id", 848612728392379464L);
        setLongField(term154547, term154547.getClass(), "id", -8328832119890386795L);
        setField(term154547, term154547.getClass(), "extId", term154549);
        setField(term154547, term154547.getClass(), "luid", "bekkhEJXox");
        setIntField(term154564, term154564.getClass(), "year", 2017);
        setShortField(term154564, term154564.getClass(), "month", (short) 7);
        setShortField(term154564, term154564.getClass(), "day", (short) 24);
        setField(term154563, term154563.getClass(), "date", term154564);
        setByteField(term154568, term154568.getClass(), "hour", (byte) 3);
        setByteField(term154568, term154568.getClass(), "minute", (byte) 55);
        setByteField(term154568, term154568.getClass(), "second", (byte) 40);
        setIntField(term154568, term154568.getClass(), "nano", 397924395);
        setField(term154563, term154563.getClass(), "time", term154568);
        setField(term154547, term154547.getClass(), "registerTime", term154563);
        setIntField(term154574, term154574.getClass(), "year", 2019);
        setShortField(term154574, term154574.getClass(), "month", (short) 1);
        setShortField(term154574, term154574.getClass(), "day", (short) 4);
        setField(term154573, term154573.getClass(), "date", term154574);
        setByteField(term154578, term154578.getClass(), "hour", (byte) 6);
        setByteField(term154578, term154578.getClass(), "minute", (byte) 53);
        setByteField(term154578, term154578.getClass(), "second", (byte) 23);
        setIntField(term154578, term154578.getClass(), "nano", 416630544);
        setField(term154573, term154573.getClass(), "time", term154578);
        setField(term154547, term154547.getClass(), "accessTime", term154573);
        setField(term154545, term154545.getClass(), "card", term154547);
        setField(term154545, term154545.getClass(), "userName", "pTiGxmDpUW");
        setIntField(term154545, term154545.getClass(), "level", -249093225);
        setIntField(term154545, term154545.getClass(), "reincarnationNum", 1664707074);
        setLongField(term154545, term154545.getClass(), "exp", 2198934093484437202L);
        setLongField(term154545, term154545.getClass(), "point", -4524163752726588302L);
        setLongField(term154545, term154545.getClass(), "totalPoint", -3721456841949694712L);
        setIntField(term154545, term154545.getClass(), "playCount", -1965724215);
        setIntField(term154545, term154545.getClass(), "jewelCount", -2029902121);
        setIntField(term154545, term154545.getClass(), "totalJewelCount", -1095782854);
        setIntField(term154545, term154545.getClass(), "medalCount", 1432496573);
        setIntField(term154545, term154545.getClass(), "playerRating", -849194186);
        setIntField(term154545, term154545.getClass(), "highestRating", 534005485);
        setIntField(term154545, term154545.getClass(), "battlePoint", 433949054);
        setIntField(term154545, term154545.getClass(), "bestBattlePoint", 1432683121);
        setIntField(term154545, term154545.getClass(), "overDamageBattlePoint", -1075532959);
        setBooleanField(term154545, term154545.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term154545, term154545.getClass(), "nameplateId", -2112121102);
        setIntField(term154545, term154545.getClass(), "trophyId", 882228649);
        setIntField(term154545, term154545.getClass(), "cardId", 1534973931);
        setIntField(term154545, term154545.getClass(), "characterId", 1939412111);
        setIntField(term154545, term154545.getClass(), "characterVoiceNo", -2088107446);
        setIntField(term154545, term154545.getClass(), "tabSetting", 590965528);
        setIntField(term154545, term154545.getClass(), "tabSortSetting", -901801526);
        setIntField(term154545, term154545.getClass(), "cardCategorySetting", -844430982);
        setIntField(term154545, term154545.getClass(), "cardSortSetting", -164393345);
        setIntField(term154545, term154545.getClass(), "rivalScoreCategorySetting", 994265990);
        setIntField(term154545, term154545.getClass(), "playedTutorialBit", 1551328629);
        setIntField(term154545, term154545.getClass(), "firstTutorialCancelNum", -967088595);
        setLongField(term154545, term154545.getClass(), "sumTechHighScore", -456836328448013051L);
        setLongField(term154545, term154545.getClass(), "sumTechBasicHighScore", -5921310990563765401L);
        setLongField(term154545, term154545.getClass(), "sumTechAdvancedHighScore", 3934914242875060981L);
        setLongField(term154545, term154545.getClass(), "sumTechExpertHighScore", -8399638382262003730L);
        setLongField(term154545, term154545.getClass(), "sumTechMasterHighScore", 1122416832206282085L);
        setLongField(term154545, term154545.getClass(), "sumTechLunaticHighScore", 8533632177187405209L);
        setLongField(term154545, term154545.getClass(), "sumBattleHighScore", 7691914418659253004L);
        setLongField(term154545, term154545.getClass(), "sumBattleBasicHighScore", -8890905894692514776L);
        setLongField(term154545, term154545.getClass(), "sumBattleAdvancedHighScore", 2347103903798520229L);
        setLongField(term154545, term154545.getClass(), "sumBattleExpertHighScore", 496363067304632356L);
        setLongField(term154545, term154545.getClass(), "sumBattleMasterHighScore", 1064707213332578186L);
        setLongField(term154545, term154545.getClass(), "sumBattleLunaticHighScore", 8450625741710194467L);
        setField(term154545, term154545.getClass(), "eventWatchedDate", "OoCofiAnPP");
        setField(term154545, term154545.getClass(), "cmEventWatchedDate", "vjPbHKOEPZ");
        setField(term154545, term154545.getClass(), "firstGameId", "rvTeECGvmV");
        setField(term154545, term154545.getClass(), "firstRomVersion", "lDBTAFbBEZ");
        setField(term154545, term154545.getClass(), "firstDataVersion", "YdjPhVNTEu");
        setField(term154545, term154545.getClass(), "firstPlayDate", "rLgUagmMGn");
        setField(term154545, term154545.getClass(), "lastGameId", "EZlpBOXfGZ");
        setField(term154545, term154545.getClass(), "lastRomVersion", "XkQUchkoze");
        setField(term154545, term154545.getClass(), "lastDataVersion", "xHufEneCSu");
        setField(term154545, term154545.getClass(), "compatibleCmVersion", "dcNBqbQVSa");
        setField(term154545, term154545.getClass(), "lastPlayDate", "voFZMRWdRg");
        setIntField(term154545, term154545.getClass(), "lastPlaceId", 1703596113);
        setField(term154545, term154545.getClass(), "lastPlaceName", "xUCRGyGVPj");
        setIntField(term154545, term154545.getClass(), "lastRegionId", -1570405490);
        setField(term154545, term154545.getClass(), "lastRegionName", "mODhKHNihX");
        setIntField(term154545, term154545.getClass(), "lastAllNetId", 2093699918);
        setField(term154545, term154545.getClass(), "lastClientId", "JuAcOfOxNL");
        setIntField(term154545, term154545.getClass(), "lastUsedDeckId", -1477783757);
        setIntField(term154545, term154545.getClass(), "lastPlayMusicLevel", -1106829807);
        setIntField(term154545, term154545.getClass(), "lastEmoneyBrand", 1056213101);
        setField(term154543, term154543.getClass(), "user", term154545);
        setIntField(term154543, term154543.getClass(), "chapterId", 1985766183);
        setIntField(term154543, term154543.getClass(), "tradeItemId", -789887248);
        setIntField(term154543, term154543.getClass(), "tradeCount", -833940690);
        term154811 = new Integer(-202105331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term154811;
        callMethod(klass, "setTradeItemId", argTypes, term154543, args);
    }

};


