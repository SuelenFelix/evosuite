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

public class UserPlaylog_getPlayedUserId2_103366643914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190066;

    public UserPlaylog_getPlayedUserId2_103366643914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term190072 = new Long(-2828343143039517941L);
        term190066 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term190068 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term190070 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term190086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term190087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term190091 = newInstance(Class.forName("java.time.LocalTime"));
        Object term190096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term190097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term190101 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term190066, term190066.getClass(), "id", -6971932757611425617L);
        setLongField(term190068, term190068.getClass(), "id", 4440178585288161892L);
        setLongField(term190070, term190070.getClass(), "id", -712345822871055137L);
        setField(term190070, term190070.getClass(), "extId", term190072);
        setField(term190070, term190070.getClass(), "luid", "jCjDnHGqSE");
        setIntField(term190087, term190087.getClass(), "year", 2014);
        setShortField(term190087, term190087.getClass(), "month", (short) 6);
        setShortField(term190087, term190087.getClass(), "day", (short) 5);
        setField(term190086, term190086.getClass(), "date", term190087);
        setByteField(term190091, term190091.getClass(), "hour", (byte) 0);
        setByteField(term190091, term190091.getClass(), "minute", (byte) 4);
        setByteField(term190091, term190091.getClass(), "second", (byte) 17);
        setIntField(term190091, term190091.getClass(), "nano", 755508342);
        setField(term190086, term190086.getClass(), "time", term190091);
        setField(term190070, term190070.getClass(), "registerTime", term190086);
        setIntField(term190097, term190097.getClass(), "year", 2021);
        setShortField(term190097, term190097.getClass(), "month", (short) 4);
        setShortField(term190097, term190097.getClass(), "day", (short) 25);
        setField(term190096, term190096.getClass(), "date", term190097);
        setByteField(term190101, term190101.getClass(), "hour", (byte) 8);
        setByteField(term190101, term190101.getClass(), "minute", (byte) 14);
        setByteField(term190101, term190101.getClass(), "second", (byte) 16);
        setIntField(term190101, term190101.getClass(), "nano", 794729004);
        setField(term190096, term190096.getClass(), "time", term190101);
        setField(term190070, term190070.getClass(), "accessTime", term190096);
        setField(term190068, term190068.getClass(), "card", term190070);
        setField(term190068, term190068.getClass(), "userName", "fSfrGnoCtQ");
        setIntField(term190068, term190068.getClass(), "level", -1395522049);
        setIntField(term190068, term190068.getClass(), "reincarnationNum", 1010920736);
        setLongField(term190068, term190068.getClass(), "exp", 8775889542973840958L);
        setLongField(term190068, term190068.getClass(), "point", -8923763886552559588L);
        setLongField(term190068, term190068.getClass(), "totalPoint", 4612473616346653819L);
        setIntField(term190068, term190068.getClass(), "playCount", -1045739252);
        setIntField(term190068, term190068.getClass(), "jewelCount", -243346516);
        setIntField(term190068, term190068.getClass(), "totalJewelCount", -2095273504);
        setIntField(term190068, term190068.getClass(), "medalCount", -775755482);
        setIntField(term190068, term190068.getClass(), "playerRating", 700894090);
        setIntField(term190068, term190068.getClass(), "highestRating", 1312055089);
        setIntField(term190068, term190068.getClass(), "battlePoint", 252154585);
        setIntField(term190068, term190068.getClass(), "bestBattlePoint", -1872883656);
        setIntField(term190068, term190068.getClass(), "overDamageBattlePoint", -1369707148);
        setBooleanField(term190068, term190068.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term190068, term190068.getClass(), "nameplateId", -1248395743);
        setIntField(term190068, term190068.getClass(), "trophyId", -943902027);
        setIntField(term190068, term190068.getClass(), "cardId", 745051381);
        setIntField(term190068, term190068.getClass(), "characterId", 2140325199);
        setIntField(term190068, term190068.getClass(), "characterVoiceNo", 1422307922);
        setIntField(term190068, term190068.getClass(), "tabSetting", -1537639739);
        setIntField(term190068, term190068.getClass(), "tabSortSetting", 132191142);
        setIntField(term190068, term190068.getClass(), "cardCategorySetting", -302778830);
        setIntField(term190068, term190068.getClass(), "cardSortSetting", -859574139);
        setIntField(term190068, term190068.getClass(), "rivalScoreCategorySetting", -869816828);
        setIntField(term190068, term190068.getClass(), "playedTutorialBit", 1368030099);
        setIntField(term190068, term190068.getClass(), "firstTutorialCancelNum", 992346246);
        setLongField(term190068, term190068.getClass(), "sumTechHighScore", -8556382140453315552L);
        setLongField(term190068, term190068.getClass(), "sumTechBasicHighScore", -1386007688006767393L);
        setLongField(term190068, term190068.getClass(), "sumTechAdvancedHighScore", 2287382827132184696L);
        setLongField(term190068, term190068.getClass(), "sumTechExpertHighScore", -8318569845287747350L);
        setLongField(term190068, term190068.getClass(), "sumTechMasterHighScore", 9045344704342547818L);
        setLongField(term190068, term190068.getClass(), "sumTechLunaticHighScore", 5942753047636183902L);
        setLongField(term190068, term190068.getClass(), "sumBattleHighScore", 7791871566240418066L);
        setLongField(term190068, term190068.getClass(), "sumBattleBasicHighScore", -692884341060238338L);
        setLongField(term190068, term190068.getClass(), "sumBattleAdvancedHighScore", 2232149240312314574L);
        setLongField(term190068, term190068.getClass(), "sumBattleExpertHighScore", -910028567124995177L);
        setLongField(term190068, term190068.getClass(), "sumBattleMasterHighScore", -6151081500934360869L);
        setLongField(term190068, term190068.getClass(), "sumBattleLunaticHighScore", -4961555175995886525L);
        setField(term190068, term190068.getClass(), "eventWatchedDate", "xiunSRKqzf");
        setField(term190068, term190068.getClass(), "cmEventWatchedDate", "glitnwSilu");
        setField(term190068, term190068.getClass(), "firstGameId", "rGlzfsjrgQ");
        setField(term190068, term190068.getClass(), "firstRomVersion", "cQnKBGhPuM");
        setField(term190068, term190068.getClass(), "firstDataVersion", "oVIuDTSJcv");
        setField(term190068, term190068.getClass(), "firstPlayDate", "ReCwraTBQl");
        setField(term190068, term190068.getClass(), "lastGameId", "CDYTunEQdj");
        setField(term190068, term190068.getClass(), "lastRomVersion", "PQcGVyAIda");
        setField(term190068, term190068.getClass(), "lastDataVersion", "pobSTDlmPu");
        setField(term190068, term190068.getClass(), "compatibleCmVersion", "WRULWkXFGh");
        setField(term190068, term190068.getClass(), "lastPlayDate", "IwTUeBbyTY");
        setIntField(term190068, term190068.getClass(), "lastPlaceId", -1773462565);
        setField(term190068, term190068.getClass(), "lastPlaceName", "CXCVrIiZYr");
        setIntField(term190068, term190068.getClass(), "lastRegionId", -1292893830);
        setField(term190068, term190068.getClass(), "lastRegionName", "wwoCovcSVQ");
        setIntField(term190068, term190068.getClass(), "lastAllNetId", 1749301650);
        setField(term190068, term190068.getClass(), "lastClientId", "dcLAJDPSlV");
        setIntField(term190068, term190068.getClass(), "lastUsedDeckId", -1255646451);
        setIntField(term190068, term190068.getClass(), "lastPlayMusicLevel", 975684744);
        setIntField(term190068, term190068.getClass(), "lastEmoneyBrand", -995141916);
        setField(term190066, term190066.getClass(), "user", term190068);
        setIntField(term190066, term190066.getClass(), "sortNumber", 1226962912);
        setIntField(term190066, term190066.getClass(), "placeId", -1674012635);
        setField(term190066, term190066.getClass(), "placeName", "quGlCgteaW");
        setField(term190066, term190066.getClass(), "playDate", "aJxuYQLBUn");
        setField(term190066, term190066.getClass(), "userPlayDate", "kJPJWltdOi");
        setIntField(term190066, term190066.getClass(), "musicId", 1710267845);
        setIntField(term190066, term190066.getClass(), "level", 1837620628);
        setIntField(term190066, term190066.getClass(), "playKind", 866060083);
        setIntField(term190066, term190066.getClass(), "eventId", 1938692940);
        setField(term190066, term190066.getClass(), "eventName", "cAaDaqijoU");
        setIntField(term190066, term190066.getClass(), "eventPoint", -1095213301);
        setIntField(term190066, term190066.getClass(), "playedUserId1", 1834341782);
        setIntField(term190066, term190066.getClass(), "playedUserId2", 7783695);
        setIntField(term190066, term190066.getClass(), "playedUserId3", -1797446938);
        setField(term190066, term190066.getClass(), "playedUserName1", "lEpAXknwdP");
        setField(term190066, term190066.getClass(), "playedUserName2", "gCtjoRBQvq");
        setField(term190066, term190066.getClass(), "playedUserName3", "DELOfnFjxZ");
        setIntField(term190066, term190066.getClass(), "playedMusicLevel1", 1666122877);
        setIntField(term190066, term190066.getClass(), "playedMusicLevel2", -263180012);
        setIntField(term190066, term190066.getClass(), "playedMusicLevel3", -697527464);
        setIntField(term190066, term190066.getClass(), "cardId1", 1717185086);
        setIntField(term190066, term190066.getClass(), "cardId2", -915266907);
        setIntField(term190066, term190066.getClass(), "cardId3", 1774186491);
        setIntField(term190066, term190066.getClass(), "cardLevel1", -1176292056);
        setIntField(term190066, term190066.getClass(), "cardLevel2", -419239990);
        setIntField(term190066, term190066.getClass(), "cardLevel3", 1812087138);
        setIntField(term190066, term190066.getClass(), "cardAttack1", 559878621);
        setIntField(term190066, term190066.getClass(), "cardAttack2", -1043553054);
        setIntField(term190066, term190066.getClass(), "cardAttack3", 1703046066);
        setIntField(term190066, term190066.getClass(), "bossCharaId", 926839329);
        setIntField(term190066, term190066.getClass(), "bossLevel", 1637499416);
        setIntField(term190066, term190066.getClass(), "bossAttribute", -1283934329);
        setIntField(term190066, term190066.getClass(), "clearStatus", -413523309);
        setIntField(term190066, term190066.getClass(), "techScore", -765029045);
        setIntField(term190066, term190066.getClass(), "techScoreRank", 989766200);
        setIntField(term190066, term190066.getClass(), "battleScore", 676995399);
        setIntField(term190066, term190066.getClass(), "battleScoreRank", -799948673);
        setIntField(term190066, term190066.getClass(), "platinumScore", -1757936898);
        setIntField(term190066, term190066.getClass(), "maxCombo", -2117118311);
        setIntField(term190066, term190066.getClass(), "judgeMiss", -1036079269);
        setIntField(term190066, term190066.getClass(), "judgeHit", -909354936);
        setIntField(term190066, term190066.getClass(), "judgeBreak", -289436930);
        setIntField(term190066, term190066.getClass(), "judgeCriticalBreak", -1940604591);
        setIntField(term190066, term190066.getClass(), "rateTap", -51328239);
        setIntField(term190066, term190066.getClass(), "rateHold", 1321280254);
        setIntField(term190066, term190066.getClass(), "rateFlick", -751370259);
        setIntField(term190066, term190066.getClass(), "rateSideTap", -181315764);
        setIntField(term190066, term190066.getClass(), "rateSideHold", -586835416);
        setIntField(term190066, term190066.getClass(), "bellCount", -268780619);
        setIntField(term190066, term190066.getClass(), "totalBellCount", -1085029958);
        setIntField(term190066, term190066.getClass(), "damageCount", 1260854199);
        setIntField(term190066, term190066.getClass(), "overDamage", -1543745443);
        setBooleanField(term190066, term190066.getClass(), "isTechNewRecord", true);
        setBooleanField(term190066, term190066.getClass(), "isBattleNewRecord", true);
        setBooleanField(term190066, term190066.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term190066, term190066.getClass(), "isFullCombo", true);
        setBooleanField(term190066, term190066.getClass(), "isFullBell", true);
        setBooleanField(term190066, term190066.getClass(), "isAllBreak", false);
        setIntField(term190066, term190066.getClass(), "playerRating", -1255681142);
        setIntField(term190066, term190066.getClass(), "battlePoint", 1875835735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId2", argTypes, term190066, args);
    }

};


