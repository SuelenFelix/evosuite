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

public class UserPlaylog_getJudgeCriticalBreak_110366986744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209026;

    public UserPlaylog_getJudgeCriticalBreak_110366986744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term209032 = new Long(-3753621038448351550L);
        term209026 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term209028 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term209030 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term209046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209061 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term209026, term209026.getClass(), "id", -508849502348132649L);
        setLongField(term209028, term209028.getClass(), "id", -526755729238290338L);
        setLongField(term209030, term209030.getClass(), "id", 1267411778368027297L);
        setField(term209030, term209030.getClass(), "extId", term209032);
        setField(term209030, term209030.getClass(), "luid", "CpZsTbPacH");
        setIntField(term209047, term209047.getClass(), "year", 2028);
        setShortField(term209047, term209047.getClass(), "month", (short) 11);
        setShortField(term209047, term209047.getClass(), "day", (short) 9);
        setField(term209046, term209046.getClass(), "date", term209047);
        setByteField(term209051, term209051.getClass(), "hour", (byte) 7);
        setByteField(term209051, term209051.getClass(), "minute", (byte) 38);
        setByteField(term209051, term209051.getClass(), "second", (byte) 24);
        setIntField(term209051, term209051.getClass(), "nano", 528146857);
        setField(term209046, term209046.getClass(), "time", term209051);
        setField(term209030, term209030.getClass(), "registerTime", term209046);
        setIntField(term209057, term209057.getClass(), "year", 2025);
        setShortField(term209057, term209057.getClass(), "month", (short) 3);
        setShortField(term209057, term209057.getClass(), "day", (short) 6);
        setField(term209056, term209056.getClass(), "date", term209057);
        setByteField(term209061, term209061.getClass(), "hour", (byte) 12);
        setByteField(term209061, term209061.getClass(), "minute", (byte) 2);
        setByteField(term209061, term209061.getClass(), "second", (byte) 23);
        setIntField(term209061, term209061.getClass(), "nano", 463787680);
        setField(term209056, term209056.getClass(), "time", term209061);
        setField(term209030, term209030.getClass(), "accessTime", term209056);
        setField(term209028, term209028.getClass(), "card", term209030);
        setField(term209028, term209028.getClass(), "userName", "HyRjodIKrt");
        setIntField(term209028, term209028.getClass(), "level", -913146699);
        setIntField(term209028, term209028.getClass(), "reincarnationNum", -2037448252);
        setLongField(term209028, term209028.getClass(), "exp", 2317459916332323737L);
        setLongField(term209028, term209028.getClass(), "point", -7528534982191518296L);
        setLongField(term209028, term209028.getClass(), "totalPoint", 3324576313620852526L);
        setIntField(term209028, term209028.getClass(), "playCount", -337985535);
        setIntField(term209028, term209028.getClass(), "jewelCount", 1399803639);
        setIntField(term209028, term209028.getClass(), "totalJewelCount", 160926225);
        setIntField(term209028, term209028.getClass(), "medalCount", -1541440051);
        setIntField(term209028, term209028.getClass(), "playerRating", 440254626);
        setIntField(term209028, term209028.getClass(), "highestRating", 2001906899);
        setIntField(term209028, term209028.getClass(), "battlePoint", 532379889);
        setIntField(term209028, term209028.getClass(), "bestBattlePoint", -1084521349);
        setIntField(term209028, term209028.getClass(), "overDamageBattlePoint", -1930705611);
        setBooleanField(term209028, term209028.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term209028, term209028.getClass(), "nameplateId", 1949222496);
        setIntField(term209028, term209028.getClass(), "trophyId", 1176018048);
        setIntField(term209028, term209028.getClass(), "cardId", 1196729512);
        setIntField(term209028, term209028.getClass(), "characterId", -1129446141);
        setIntField(term209028, term209028.getClass(), "characterVoiceNo", -2055516348);
        setIntField(term209028, term209028.getClass(), "tabSetting", -1810305325);
        setIntField(term209028, term209028.getClass(), "tabSortSetting", 891522595);
        setIntField(term209028, term209028.getClass(), "cardCategorySetting", 584482188);
        setIntField(term209028, term209028.getClass(), "cardSortSetting", -966923623);
        setIntField(term209028, term209028.getClass(), "rivalScoreCategorySetting", -1827280492);
        setIntField(term209028, term209028.getClass(), "playedTutorialBit", -540366977);
        setIntField(term209028, term209028.getClass(), "firstTutorialCancelNum", -87673396);
        setLongField(term209028, term209028.getClass(), "sumTechHighScore", 6901850304380041585L);
        setLongField(term209028, term209028.getClass(), "sumTechBasicHighScore", 3974913559658326104L);
        setLongField(term209028, term209028.getClass(), "sumTechAdvancedHighScore", 8913529807973832335L);
        setLongField(term209028, term209028.getClass(), "sumTechExpertHighScore", 7102480627990060552L);
        setLongField(term209028, term209028.getClass(), "sumTechMasterHighScore", -1022511683316739328L);
        setLongField(term209028, term209028.getClass(), "sumTechLunaticHighScore", 3918249492698728421L);
        setLongField(term209028, term209028.getClass(), "sumBattleHighScore", 5056811364823438038L);
        setLongField(term209028, term209028.getClass(), "sumBattleBasicHighScore", 364901119971402132L);
        setLongField(term209028, term209028.getClass(), "sumBattleAdvancedHighScore", 3591948876135773977L);
        setLongField(term209028, term209028.getClass(), "sumBattleExpertHighScore", -5189953093105826248L);
        setLongField(term209028, term209028.getClass(), "sumBattleMasterHighScore", -5645220165267616021L);
        setLongField(term209028, term209028.getClass(), "sumBattleLunaticHighScore", 4348732969026682940L);
        setField(term209028, term209028.getClass(), "eventWatchedDate", "dGqYTSkmlc");
        setField(term209028, term209028.getClass(), "cmEventWatchedDate", "XBismYeIOM");
        setField(term209028, term209028.getClass(), "firstGameId", "TQZuVrOtiK");
        setField(term209028, term209028.getClass(), "firstRomVersion", "UUetRJugfR");
        setField(term209028, term209028.getClass(), "firstDataVersion", "ozLkLYzWZD");
        setField(term209028, term209028.getClass(), "firstPlayDate", "LEAEPBtmDE");
        setField(term209028, term209028.getClass(), "lastGameId", "oUCfMEViOl");
        setField(term209028, term209028.getClass(), "lastRomVersion", "NCKuJOimgb");
        setField(term209028, term209028.getClass(), "lastDataVersion", "BbWYbJZcOk");
        setField(term209028, term209028.getClass(), "compatibleCmVersion", "rclaaiJLVZ");
        setField(term209028, term209028.getClass(), "lastPlayDate", "yQuEIHUdPd");
        setIntField(term209028, term209028.getClass(), "lastPlaceId", 854845151);
        setField(term209028, term209028.getClass(), "lastPlaceName", "YGcdcqZBhD");
        setIntField(term209028, term209028.getClass(), "lastRegionId", -427113243);
        setField(term209028, term209028.getClass(), "lastRegionName", "YIiYmjYKPu");
        setIntField(term209028, term209028.getClass(), "lastAllNetId", 1884007720);
        setField(term209028, term209028.getClass(), "lastClientId", "BNzmlooMdf");
        setIntField(term209028, term209028.getClass(), "lastUsedDeckId", 444461504);
        setIntField(term209028, term209028.getClass(), "lastPlayMusicLevel", -723040972);
        setIntField(term209028, term209028.getClass(), "lastEmoneyBrand", -403619714);
        setField(term209026, term209026.getClass(), "user", term209028);
        setIntField(term209026, term209026.getClass(), "sortNumber", 1083157942);
        setIntField(term209026, term209026.getClass(), "placeId", 1032329767);
        setField(term209026, term209026.getClass(), "placeName", "txAQLBXsin");
        setField(term209026, term209026.getClass(), "playDate", "ZxLrAouHPX");
        setField(term209026, term209026.getClass(), "userPlayDate", "YsBtkFntbK");
        setIntField(term209026, term209026.getClass(), "musicId", 1878032322);
        setIntField(term209026, term209026.getClass(), "level", 1027562263);
        setIntField(term209026, term209026.getClass(), "playKind", -1444808827);
        setIntField(term209026, term209026.getClass(), "eventId", -1120740211);
        setField(term209026, term209026.getClass(), "eventName", "iaYOIMpvRZ");
        setIntField(term209026, term209026.getClass(), "eventPoint", 654951288);
        setIntField(term209026, term209026.getClass(), "playedUserId1", 2139003917);
        setIntField(term209026, term209026.getClass(), "playedUserId2", -88880251);
        setIntField(term209026, term209026.getClass(), "playedUserId3", -1157773436);
        setField(term209026, term209026.getClass(), "playedUserName1", "sTmWbdFIlX");
        setField(term209026, term209026.getClass(), "playedUserName2", "wAunlbFkbk");
        setField(term209026, term209026.getClass(), "playedUserName3", "MphslRDPYz");
        setIntField(term209026, term209026.getClass(), "playedMusicLevel1", 237998332);
        setIntField(term209026, term209026.getClass(), "playedMusicLevel2", 1398526783);
        setIntField(term209026, term209026.getClass(), "playedMusicLevel3", -1335367347);
        setIntField(term209026, term209026.getClass(), "cardId1", 378431284);
        setIntField(term209026, term209026.getClass(), "cardId2", 1775630559);
        setIntField(term209026, term209026.getClass(), "cardId3", 1511551801);
        setIntField(term209026, term209026.getClass(), "cardLevel1", 910313590);
        setIntField(term209026, term209026.getClass(), "cardLevel2", -877418986);
        setIntField(term209026, term209026.getClass(), "cardLevel3", -336009454);
        setIntField(term209026, term209026.getClass(), "cardAttack1", -63641196);
        setIntField(term209026, term209026.getClass(), "cardAttack2", 1871287078);
        setIntField(term209026, term209026.getClass(), "cardAttack3", 792196604);
        setIntField(term209026, term209026.getClass(), "bossCharaId", -1306447464);
        setIntField(term209026, term209026.getClass(), "bossLevel", -1027761764);
        setIntField(term209026, term209026.getClass(), "bossAttribute", 766326251);
        setIntField(term209026, term209026.getClass(), "clearStatus", -557939372);
        setIntField(term209026, term209026.getClass(), "techScore", 924802684);
        setIntField(term209026, term209026.getClass(), "techScoreRank", 647650611);
        setIntField(term209026, term209026.getClass(), "battleScore", 1830557897);
        setIntField(term209026, term209026.getClass(), "battleScoreRank", -1998060372);
        setIntField(term209026, term209026.getClass(), "platinumScore", 567825669);
        setIntField(term209026, term209026.getClass(), "maxCombo", -119885836);
        setIntField(term209026, term209026.getClass(), "judgeMiss", 698701205);
        setIntField(term209026, term209026.getClass(), "judgeHit", 733986936);
        setIntField(term209026, term209026.getClass(), "judgeBreak", -1752207831);
        setIntField(term209026, term209026.getClass(), "judgeCriticalBreak", -1175000933);
        setIntField(term209026, term209026.getClass(), "rateTap", -1090683004);
        setIntField(term209026, term209026.getClass(), "rateHold", 1077547795);
        setIntField(term209026, term209026.getClass(), "rateFlick", -287532994);
        setIntField(term209026, term209026.getClass(), "rateSideTap", -224320349);
        setIntField(term209026, term209026.getClass(), "rateSideHold", -526888962);
        setIntField(term209026, term209026.getClass(), "bellCount", -23497981);
        setIntField(term209026, term209026.getClass(), "totalBellCount", -1204518409);
        setIntField(term209026, term209026.getClass(), "damageCount", 1564920368);
        setIntField(term209026, term209026.getClass(), "overDamage", 380619960);
        setBooleanField(term209026, term209026.getClass(), "isTechNewRecord", false);
        setBooleanField(term209026, term209026.getClass(), "isBattleNewRecord", true);
        setBooleanField(term209026, term209026.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term209026, term209026.getClass(), "isFullCombo", false);
        setBooleanField(term209026, term209026.getClass(), "isFullBell", false);
        setBooleanField(term209026, term209026.getClass(), "isAllBreak", true);
        setIntField(term209026, term209026.getClass(), "playerRating", 2032116097);
        setIntField(term209026, term209026.getClass(), "battlePoint", -1529610099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeCriticalBreak", argTypes, term209026, args);
    }

};


