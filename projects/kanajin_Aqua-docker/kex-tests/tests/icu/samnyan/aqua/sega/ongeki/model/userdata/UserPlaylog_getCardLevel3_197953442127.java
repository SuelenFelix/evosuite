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

public class UserPlaylog_getCardLevel3_197953442127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198282;

    public UserPlaylog_getCardLevel3_197953442127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term198288 = new Long(-8992404862613425105L);
        term198282 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term198284 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term198286 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term198302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term198312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198317 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term198282, term198282.getClass(), "id", 2236842408211489701L);
        setLongField(term198284, term198284.getClass(), "id", 3036922918288838230L);
        setLongField(term198286, term198286.getClass(), "id", -8403268438145197631L);
        setField(term198286, term198286.getClass(), "extId", term198288);
        setField(term198286, term198286.getClass(), "luid", "nRYFjxHgLD");
        setIntField(term198303, term198303.getClass(), "year", 2025);
        setShortField(term198303, term198303.getClass(), "month", (short) 5);
        setShortField(term198303, term198303.getClass(), "day", (short) 7);
        setField(term198302, term198302.getClass(), "date", term198303);
        setByteField(term198307, term198307.getClass(), "hour", (byte) 9);
        setByteField(term198307, term198307.getClass(), "minute", (byte) 7);
        setByteField(term198307, term198307.getClass(), "second", (byte) 58);
        setIntField(term198307, term198307.getClass(), "nano", 974291074);
        setField(term198302, term198302.getClass(), "time", term198307);
        setField(term198286, term198286.getClass(), "registerTime", term198302);
        setIntField(term198313, term198313.getClass(), "year", 2026);
        setShortField(term198313, term198313.getClass(), "month", (short) 9);
        setShortField(term198313, term198313.getClass(), "day", (short) 29);
        setField(term198312, term198312.getClass(), "date", term198313);
        setByteField(term198317, term198317.getClass(), "hour", (byte) 18);
        setByteField(term198317, term198317.getClass(), "minute", (byte) 42);
        setByteField(term198317, term198317.getClass(), "second", (byte) 40);
        setIntField(term198317, term198317.getClass(), "nano", 611001144);
        setField(term198312, term198312.getClass(), "time", term198317);
        setField(term198286, term198286.getClass(), "accessTime", term198312);
        setField(term198284, term198284.getClass(), "card", term198286);
        setField(term198284, term198284.getClass(), "userName", "idVHWgvAfC");
        setIntField(term198284, term198284.getClass(), "level", 1098473489);
        setIntField(term198284, term198284.getClass(), "reincarnationNum", 825249073);
        setLongField(term198284, term198284.getClass(), "exp", 2582491632885619783L);
        setLongField(term198284, term198284.getClass(), "point", 861824247853923163L);
        setLongField(term198284, term198284.getClass(), "totalPoint", -5863434201422202094L);
        setIntField(term198284, term198284.getClass(), "playCount", 2055208476);
        setIntField(term198284, term198284.getClass(), "jewelCount", -159215997);
        setIntField(term198284, term198284.getClass(), "totalJewelCount", 915438885);
        setIntField(term198284, term198284.getClass(), "medalCount", 2035758672);
        setIntField(term198284, term198284.getClass(), "playerRating", -1017667604);
        setIntField(term198284, term198284.getClass(), "highestRating", 23796977);
        setIntField(term198284, term198284.getClass(), "battlePoint", -1056300132);
        setIntField(term198284, term198284.getClass(), "bestBattlePoint", -756075731);
        setIntField(term198284, term198284.getClass(), "overDamageBattlePoint", 1287668261);
        setBooleanField(term198284, term198284.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term198284, term198284.getClass(), "nameplateId", -1827790417);
        setIntField(term198284, term198284.getClass(), "trophyId", 617717466);
        setIntField(term198284, term198284.getClass(), "cardId", -805204937);
        setIntField(term198284, term198284.getClass(), "characterId", -404532819);
        setIntField(term198284, term198284.getClass(), "characterVoiceNo", -1068091214);
        setIntField(term198284, term198284.getClass(), "tabSetting", -1885921336);
        setIntField(term198284, term198284.getClass(), "tabSortSetting", 959662038);
        setIntField(term198284, term198284.getClass(), "cardCategorySetting", -1636076456);
        setIntField(term198284, term198284.getClass(), "cardSortSetting", -965575676);
        setIntField(term198284, term198284.getClass(), "rivalScoreCategorySetting", -2073269577);
        setIntField(term198284, term198284.getClass(), "playedTutorialBit", -1444541321);
        setIntField(term198284, term198284.getClass(), "firstTutorialCancelNum", 2053292904);
        setLongField(term198284, term198284.getClass(), "sumTechHighScore", -8682000970263929972L);
        setLongField(term198284, term198284.getClass(), "sumTechBasicHighScore", -307383211901007092L);
        setLongField(term198284, term198284.getClass(), "sumTechAdvancedHighScore", 2758375474651337206L);
        setLongField(term198284, term198284.getClass(), "sumTechExpertHighScore", -1599530351840213478L);
        setLongField(term198284, term198284.getClass(), "sumTechMasterHighScore", 8251229136886682852L);
        setLongField(term198284, term198284.getClass(), "sumTechLunaticHighScore", 8989065078057590901L);
        setLongField(term198284, term198284.getClass(), "sumBattleHighScore", -8900515052314357329L);
        setLongField(term198284, term198284.getClass(), "sumBattleBasicHighScore", 1051803634212008369L);
        setLongField(term198284, term198284.getClass(), "sumBattleAdvancedHighScore", 8082460776254105443L);
        setLongField(term198284, term198284.getClass(), "sumBattleExpertHighScore", -1521867881347536390L);
        setLongField(term198284, term198284.getClass(), "sumBattleMasterHighScore", 433464407057754017L);
        setLongField(term198284, term198284.getClass(), "sumBattleLunaticHighScore", 866707654489708449L);
        setField(term198284, term198284.getClass(), "eventWatchedDate", "NiyDlJYCDP");
        setField(term198284, term198284.getClass(), "cmEventWatchedDate", "NrXMyLKbPX");
        setField(term198284, term198284.getClass(), "firstGameId", "KyYQpzPLpR");
        setField(term198284, term198284.getClass(), "firstRomVersion", "guFaBtQGdw");
        setField(term198284, term198284.getClass(), "firstDataVersion", "wKzSqUTDVD");
        setField(term198284, term198284.getClass(), "firstPlayDate", "hTFXzWftzI");
        setField(term198284, term198284.getClass(), "lastGameId", "HmNmlOrLYU");
        setField(term198284, term198284.getClass(), "lastRomVersion", "vGBeVRICqD");
        setField(term198284, term198284.getClass(), "lastDataVersion", "qcloozSJvL");
        setField(term198284, term198284.getClass(), "compatibleCmVersion", "RvJyAUwaJt");
        setField(term198284, term198284.getClass(), "lastPlayDate", "WPbAmqsBdB");
        setIntField(term198284, term198284.getClass(), "lastPlaceId", 883426815);
        setField(term198284, term198284.getClass(), "lastPlaceName", "pYkUSbeFIy");
        setIntField(term198284, term198284.getClass(), "lastRegionId", 82050941);
        setField(term198284, term198284.getClass(), "lastRegionName", "aslRdJAxqq");
        setIntField(term198284, term198284.getClass(), "lastAllNetId", 1237094375);
        setField(term198284, term198284.getClass(), "lastClientId", "qSGaBJnYnR");
        setIntField(term198284, term198284.getClass(), "lastUsedDeckId", -127161769);
        setIntField(term198284, term198284.getClass(), "lastPlayMusicLevel", -8592713);
        setIntField(term198284, term198284.getClass(), "lastEmoneyBrand", 2117607396);
        setField(term198282, term198282.getClass(), "user", term198284);
        setIntField(term198282, term198282.getClass(), "sortNumber", 1915103204);
        setIntField(term198282, term198282.getClass(), "placeId", -1994232365);
        setField(term198282, term198282.getClass(), "placeName", "MGKWTJIasi");
        setField(term198282, term198282.getClass(), "playDate", "upaMEMxlUB");
        setField(term198282, term198282.getClass(), "userPlayDate", "TmmVfmoOsH");
        setIntField(term198282, term198282.getClass(), "musicId", 572269752);
        setIntField(term198282, term198282.getClass(), "level", -1720625083);
        setIntField(term198282, term198282.getClass(), "playKind", 481972209);
        setIntField(term198282, term198282.getClass(), "eventId", -9330935);
        setField(term198282, term198282.getClass(), "eventName", "qOmhPxsZYb");
        setIntField(term198282, term198282.getClass(), "eventPoint", -1264971535);
        setIntField(term198282, term198282.getClass(), "playedUserId1", 316305007);
        setIntField(term198282, term198282.getClass(), "playedUserId2", -1167706006);
        setIntField(term198282, term198282.getClass(), "playedUserId3", 1543765797);
        setField(term198282, term198282.getClass(), "playedUserName1", "WWpJZrtqJz");
        setField(term198282, term198282.getClass(), "playedUserName2", "hEgzudKuuP");
        setField(term198282, term198282.getClass(), "playedUserName3", "BziKWtuBNj");
        setIntField(term198282, term198282.getClass(), "playedMusicLevel1", -1397058066);
        setIntField(term198282, term198282.getClass(), "playedMusicLevel2", 428464844);
        setIntField(term198282, term198282.getClass(), "playedMusicLevel3", 1224454871);
        setIntField(term198282, term198282.getClass(), "cardId1", 417503001);
        setIntField(term198282, term198282.getClass(), "cardId2", -95714739);
        setIntField(term198282, term198282.getClass(), "cardId3", 967258054);
        setIntField(term198282, term198282.getClass(), "cardLevel1", 1976700804);
        setIntField(term198282, term198282.getClass(), "cardLevel2", 192284574);
        setIntField(term198282, term198282.getClass(), "cardLevel3", 726085226);
        setIntField(term198282, term198282.getClass(), "cardAttack1", -308997274);
        setIntField(term198282, term198282.getClass(), "cardAttack2", 2115944528);
        setIntField(term198282, term198282.getClass(), "cardAttack3", 2147374456);
        setIntField(term198282, term198282.getClass(), "bossCharaId", 101420380);
        setIntField(term198282, term198282.getClass(), "bossLevel", -108089538);
        setIntField(term198282, term198282.getClass(), "bossAttribute", -2118855483);
        setIntField(term198282, term198282.getClass(), "clearStatus", 956610045);
        setIntField(term198282, term198282.getClass(), "techScore", -1942169307);
        setIntField(term198282, term198282.getClass(), "techScoreRank", 617724553);
        setIntField(term198282, term198282.getClass(), "battleScore", -1338530967);
        setIntField(term198282, term198282.getClass(), "battleScoreRank", 595533783);
        setIntField(term198282, term198282.getClass(), "platinumScore", 246042148);
        setIntField(term198282, term198282.getClass(), "maxCombo", -1721990512);
        setIntField(term198282, term198282.getClass(), "judgeMiss", 1019098195);
        setIntField(term198282, term198282.getClass(), "judgeHit", 2106958856);
        setIntField(term198282, term198282.getClass(), "judgeBreak", -2063685170);
        setIntField(term198282, term198282.getClass(), "judgeCriticalBreak", -1311140530);
        setIntField(term198282, term198282.getClass(), "rateTap", 1303003392);
        setIntField(term198282, term198282.getClass(), "rateHold", -831139026);
        setIntField(term198282, term198282.getClass(), "rateFlick", 1382899869);
        setIntField(term198282, term198282.getClass(), "rateSideTap", -1429671338);
        setIntField(term198282, term198282.getClass(), "rateSideHold", 927915366);
        setIntField(term198282, term198282.getClass(), "bellCount", -777997560);
        setIntField(term198282, term198282.getClass(), "totalBellCount", 1311293255);
        setIntField(term198282, term198282.getClass(), "damageCount", 311485940);
        setIntField(term198282, term198282.getClass(), "overDamage", -1792008630);
        setBooleanField(term198282, term198282.getClass(), "isTechNewRecord", false);
        setBooleanField(term198282, term198282.getClass(), "isBattleNewRecord", true);
        setBooleanField(term198282, term198282.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term198282, term198282.getClass(), "isFullCombo", false);
        setBooleanField(term198282, term198282.getClass(), "isFullBell", true);
        setBooleanField(term198282, term198282.getClass(), "isAllBreak", true);
        setIntField(term198282, term198282.getClass(), "playerRating", -1813772232);
        setIntField(term198282, term198282.getClass(), "battlePoint", 175926067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardLevel3", argTypes, term198282, args);
    }

};


