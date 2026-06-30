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

public class UserPlaylog_getMaxCombo_11189335440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206498;

    public UserPlaylog_getMaxCombo_11189335440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term206504 = new Long(-1223573843683081410L);
        term206498 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term206500 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term206502 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term206518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term206528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term206529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term206533 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term206498, term206498.getClass(), "id", -982807115169128327L);
        setLongField(term206500, term206500.getClass(), "id", 1802223650726139040L);
        setLongField(term206502, term206502.getClass(), "id", 5650647751145506885L);
        setField(term206502, term206502.getClass(), "extId", term206504);
        setField(term206502, term206502.getClass(), "luid", "RUPkFdASbP");
        setIntField(term206519, term206519.getClass(), "year", 2016);
        setShortField(term206519, term206519.getClass(), "month", (short) 4);
        setShortField(term206519, term206519.getClass(), "day", (short) 6);
        setField(term206518, term206518.getClass(), "date", term206519);
        setByteField(term206523, term206523.getClass(), "hour", (byte) 11);
        setByteField(term206523, term206523.getClass(), "minute", (byte) 33);
        setByteField(term206523, term206523.getClass(), "second", (byte) 12);
        setIntField(term206523, term206523.getClass(), "nano", 167392252);
        setField(term206518, term206518.getClass(), "time", term206523);
        setField(term206502, term206502.getClass(), "registerTime", term206518);
        setIntField(term206529, term206529.getClass(), "year", 2014);
        setShortField(term206529, term206529.getClass(), "month", (short) 7);
        setShortField(term206529, term206529.getClass(), "day", (short) 24);
        setField(term206528, term206528.getClass(), "date", term206529);
        setByteField(term206533, term206533.getClass(), "hour", (byte) 5);
        setByteField(term206533, term206533.getClass(), "minute", (byte) 31);
        setByteField(term206533, term206533.getClass(), "second", (byte) 45);
        setIntField(term206533, term206533.getClass(), "nano", 932508724);
        setField(term206528, term206528.getClass(), "time", term206533);
        setField(term206502, term206502.getClass(), "accessTime", term206528);
        setField(term206500, term206500.getClass(), "card", term206502);
        setField(term206500, term206500.getClass(), "userName", "LaQWJGJelM");
        setIntField(term206500, term206500.getClass(), "level", -1144558597);
        setIntField(term206500, term206500.getClass(), "reincarnationNum", 392267583);
        setLongField(term206500, term206500.getClass(), "exp", 8348501915993953384L);
        setLongField(term206500, term206500.getClass(), "point", -3744776131666873745L);
        setLongField(term206500, term206500.getClass(), "totalPoint", 5916711676141065738L);
        setIntField(term206500, term206500.getClass(), "playCount", 1712122682);
        setIntField(term206500, term206500.getClass(), "jewelCount", -551874415);
        setIntField(term206500, term206500.getClass(), "totalJewelCount", -966624066);
        setIntField(term206500, term206500.getClass(), "medalCount", -724561959);
        setIntField(term206500, term206500.getClass(), "playerRating", 473971426);
        setIntField(term206500, term206500.getClass(), "highestRating", -1017341002);
        setIntField(term206500, term206500.getClass(), "battlePoint", -54592257);
        setIntField(term206500, term206500.getClass(), "bestBattlePoint", -949100313);
        setIntField(term206500, term206500.getClass(), "overDamageBattlePoint", -1081835094);
        setBooleanField(term206500, term206500.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term206500, term206500.getClass(), "nameplateId", 1048568503);
        setIntField(term206500, term206500.getClass(), "trophyId", 1162032291);
        setIntField(term206500, term206500.getClass(), "cardId", 2093059007);
        setIntField(term206500, term206500.getClass(), "characterId", 372882015);
        setIntField(term206500, term206500.getClass(), "characterVoiceNo", -1653385509);
        setIntField(term206500, term206500.getClass(), "tabSetting", 1135771983);
        setIntField(term206500, term206500.getClass(), "tabSortSetting", 190828856);
        setIntField(term206500, term206500.getClass(), "cardCategorySetting", 555694422);
        setIntField(term206500, term206500.getClass(), "cardSortSetting", -1555435028);
        setIntField(term206500, term206500.getClass(), "rivalScoreCategorySetting", -1501344759);
        setIntField(term206500, term206500.getClass(), "playedTutorialBit", -429485955);
        setIntField(term206500, term206500.getClass(), "firstTutorialCancelNum", -1666329424);
        setLongField(term206500, term206500.getClass(), "sumTechHighScore", 1122241556844575286L);
        setLongField(term206500, term206500.getClass(), "sumTechBasicHighScore", -4081932476065206064L);
        setLongField(term206500, term206500.getClass(), "sumTechAdvancedHighScore", 4804861320458212945L);
        setLongField(term206500, term206500.getClass(), "sumTechExpertHighScore", -8909583119182461015L);
        setLongField(term206500, term206500.getClass(), "sumTechMasterHighScore", 8112908390673739352L);
        setLongField(term206500, term206500.getClass(), "sumTechLunaticHighScore", 8506387940383586093L);
        setLongField(term206500, term206500.getClass(), "sumBattleHighScore", -3396931832744828318L);
        setLongField(term206500, term206500.getClass(), "sumBattleBasicHighScore", 58949307114037214L);
        setLongField(term206500, term206500.getClass(), "sumBattleAdvancedHighScore", 7467886048752150766L);
        setLongField(term206500, term206500.getClass(), "sumBattleExpertHighScore", -6980310935600459599L);
        setLongField(term206500, term206500.getClass(), "sumBattleMasterHighScore", 5718709907715139334L);
        setLongField(term206500, term206500.getClass(), "sumBattleLunaticHighScore", 7874544298926560716L);
        setField(term206500, term206500.getClass(), "eventWatchedDate", "EfMijZOCRw");
        setField(term206500, term206500.getClass(), "cmEventWatchedDate", "azWfFmeoGN");
        setField(term206500, term206500.getClass(), "firstGameId", "HbjtWUINNo");
        setField(term206500, term206500.getClass(), "firstRomVersion", "HjDczmXwVK");
        setField(term206500, term206500.getClass(), "firstDataVersion", "bPkkpAUHEa");
        setField(term206500, term206500.getClass(), "firstPlayDate", "cUKOSJBBAw");
        setField(term206500, term206500.getClass(), "lastGameId", "NFAztRXNmN");
        setField(term206500, term206500.getClass(), "lastRomVersion", "cOIEJbLIQI");
        setField(term206500, term206500.getClass(), "lastDataVersion", "TvYrMVmZHT");
        setField(term206500, term206500.getClass(), "compatibleCmVersion", "LpFLzVObNe");
        setField(term206500, term206500.getClass(), "lastPlayDate", "xSaAaiACTx");
        setIntField(term206500, term206500.getClass(), "lastPlaceId", -1283755218);
        setField(term206500, term206500.getClass(), "lastPlaceName", "gsnDoCKSDa");
        setIntField(term206500, term206500.getClass(), "lastRegionId", -1544800993);
        setField(term206500, term206500.getClass(), "lastRegionName", "igCjeeKwSN");
        setIntField(term206500, term206500.getClass(), "lastAllNetId", 532107043);
        setField(term206500, term206500.getClass(), "lastClientId", "UwqxIAgbVI");
        setIntField(term206500, term206500.getClass(), "lastUsedDeckId", -1800024865);
        setIntField(term206500, term206500.getClass(), "lastPlayMusicLevel", 1555494796);
        setIntField(term206500, term206500.getClass(), "lastEmoneyBrand", -1304585657);
        setField(term206498, term206498.getClass(), "user", term206500);
        setIntField(term206498, term206498.getClass(), "sortNumber", 902409852);
        setIntField(term206498, term206498.getClass(), "placeId", 500447593);
        setField(term206498, term206498.getClass(), "placeName", "ZNRLQRfFIP");
        setField(term206498, term206498.getClass(), "playDate", "bnnAetbkOZ");
        setField(term206498, term206498.getClass(), "userPlayDate", "wMjxNGGfFZ");
        setIntField(term206498, term206498.getClass(), "musicId", 206201108);
        setIntField(term206498, term206498.getClass(), "level", -926229753);
        setIntField(term206498, term206498.getClass(), "playKind", 245326381);
        setIntField(term206498, term206498.getClass(), "eventId", 122420715);
        setField(term206498, term206498.getClass(), "eventName", "wsirPqRrlc");
        setIntField(term206498, term206498.getClass(), "eventPoint", 190071205);
        setIntField(term206498, term206498.getClass(), "playedUserId1", 2096693078);
        setIntField(term206498, term206498.getClass(), "playedUserId2", 1474853885);
        setIntField(term206498, term206498.getClass(), "playedUserId3", 638225249);
        setField(term206498, term206498.getClass(), "playedUserName1", "gkEkytWJJj");
        setField(term206498, term206498.getClass(), "playedUserName2", "KQaBgHpPTE");
        setField(term206498, term206498.getClass(), "playedUserName3", "ftWAuQBFQb");
        setIntField(term206498, term206498.getClass(), "playedMusicLevel1", -669172505);
        setIntField(term206498, term206498.getClass(), "playedMusicLevel2", 1077847171);
        setIntField(term206498, term206498.getClass(), "playedMusicLevel3", -167763728);
        setIntField(term206498, term206498.getClass(), "cardId1", -413077084);
        setIntField(term206498, term206498.getClass(), "cardId2", -2108615302);
        setIntField(term206498, term206498.getClass(), "cardId3", 708531286);
        setIntField(term206498, term206498.getClass(), "cardLevel1", -1789461612);
        setIntField(term206498, term206498.getClass(), "cardLevel2", 461243699);
        setIntField(term206498, term206498.getClass(), "cardLevel3", 1738463601);
        setIntField(term206498, term206498.getClass(), "cardAttack1", -1010128268);
        setIntField(term206498, term206498.getClass(), "cardAttack2", -2057175143);
        setIntField(term206498, term206498.getClass(), "cardAttack3", 1430166837);
        setIntField(term206498, term206498.getClass(), "bossCharaId", -1161108991);
        setIntField(term206498, term206498.getClass(), "bossLevel", -2024150009);
        setIntField(term206498, term206498.getClass(), "bossAttribute", 1182356135);
        setIntField(term206498, term206498.getClass(), "clearStatus", 313863614);
        setIntField(term206498, term206498.getClass(), "techScore", -927688075);
        setIntField(term206498, term206498.getClass(), "techScoreRank", 1980560798);
        setIntField(term206498, term206498.getClass(), "battleScore", 1048342124);
        setIntField(term206498, term206498.getClass(), "battleScoreRank", -535149999);
        setIntField(term206498, term206498.getClass(), "platinumScore", 1350386277);
        setIntField(term206498, term206498.getClass(), "maxCombo", -1834376367);
        setIntField(term206498, term206498.getClass(), "judgeMiss", -942813197);
        setIntField(term206498, term206498.getClass(), "judgeHit", 1374395557);
        setIntField(term206498, term206498.getClass(), "judgeBreak", 1293688614);
        setIntField(term206498, term206498.getClass(), "judgeCriticalBreak", 151983912);
        setIntField(term206498, term206498.getClass(), "rateTap", -997603268);
        setIntField(term206498, term206498.getClass(), "rateHold", -1827144788);
        setIntField(term206498, term206498.getClass(), "rateFlick", -1031810940);
        setIntField(term206498, term206498.getClass(), "rateSideTap", -1519353412);
        setIntField(term206498, term206498.getClass(), "rateSideHold", 1644249608);
        setIntField(term206498, term206498.getClass(), "bellCount", 628215504);
        setIntField(term206498, term206498.getClass(), "totalBellCount", -165430098);
        setIntField(term206498, term206498.getClass(), "damageCount", 1205948703);
        setIntField(term206498, term206498.getClass(), "overDamage", 800755955);
        setBooleanField(term206498, term206498.getClass(), "isTechNewRecord", false);
        setBooleanField(term206498, term206498.getClass(), "isBattleNewRecord", true);
        setBooleanField(term206498, term206498.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term206498, term206498.getClass(), "isFullCombo", false);
        setBooleanField(term206498, term206498.getClass(), "isFullBell", false);
        setBooleanField(term206498, term206498.getClass(), "isAllBreak", false);
        setIntField(term206498, term206498.getClass(), "playerRating", -1518118529);
        setIntField(term206498, term206498.getClass(), "battlePoint", -1644443791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCombo", argTypes, term206498, args);
    }

};


