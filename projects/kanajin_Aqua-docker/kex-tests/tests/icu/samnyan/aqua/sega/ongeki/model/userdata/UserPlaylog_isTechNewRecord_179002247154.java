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

public class UserPlaylog_isTechNewRecord_179002247154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215346;

    public UserPlaylog_isTechNewRecord_179002247154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term215352 = new Long(-1365372122034008688L);
        term215346 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term215348 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term215350 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term215366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215371 = newInstance(Class.forName("java.time.LocalTime"));
        Object term215376 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215377 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215381 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term215346, term215346.getClass(), "id", 7050041705355474598L);
        setLongField(term215348, term215348.getClass(), "id", -790773781296622829L);
        setLongField(term215350, term215350.getClass(), "id", 2766432648605092542L);
        setField(term215350, term215350.getClass(), "extId", term215352);
        setField(term215350, term215350.getClass(), "luid", "prSWHcndlk");
        setIntField(term215367, term215367.getClass(), "year", 2020);
        setShortField(term215367, term215367.getClass(), "month", (short) 5);
        setShortField(term215367, term215367.getClass(), "day", (short) 18);
        setField(term215366, term215366.getClass(), "date", term215367);
        setByteField(term215371, term215371.getClass(), "hour", (byte) 0);
        setByteField(term215371, term215371.getClass(), "minute", (byte) 6);
        setByteField(term215371, term215371.getClass(), "second", (byte) 7);
        setIntField(term215371, term215371.getClass(), "nano", 597786302);
        setField(term215366, term215366.getClass(), "time", term215371);
        setField(term215350, term215350.getClass(), "registerTime", term215366);
        setIntField(term215377, term215377.getClass(), "year", 2022);
        setShortField(term215377, term215377.getClass(), "month", (short) 10);
        setShortField(term215377, term215377.getClass(), "day", (short) 9);
        setField(term215376, term215376.getClass(), "date", term215377);
        setByteField(term215381, term215381.getClass(), "hour", (byte) 13);
        setByteField(term215381, term215381.getClass(), "minute", (byte) 29);
        setByteField(term215381, term215381.getClass(), "second", (byte) 0);
        setIntField(term215381, term215381.getClass(), "nano", 479809645);
        setField(term215376, term215376.getClass(), "time", term215381);
        setField(term215350, term215350.getClass(), "accessTime", term215376);
        setField(term215348, term215348.getClass(), "card", term215350);
        setField(term215348, term215348.getClass(), "userName", "jikicdaZoQ");
        setIntField(term215348, term215348.getClass(), "level", -390781407);
        setIntField(term215348, term215348.getClass(), "reincarnationNum", -1039337265);
        setLongField(term215348, term215348.getClass(), "exp", -7418127502854503493L);
        setLongField(term215348, term215348.getClass(), "point", 2056940966441733881L);
        setLongField(term215348, term215348.getClass(), "totalPoint", -5567998152506692170L);
        setIntField(term215348, term215348.getClass(), "playCount", -685914213);
        setIntField(term215348, term215348.getClass(), "jewelCount", 1920458051);
        setIntField(term215348, term215348.getClass(), "totalJewelCount", -1153940656);
        setIntField(term215348, term215348.getClass(), "medalCount", 963396922);
        setIntField(term215348, term215348.getClass(), "playerRating", -1975824255);
        setIntField(term215348, term215348.getClass(), "highestRating", 191239283);
        setIntField(term215348, term215348.getClass(), "battlePoint", 367335503);
        setIntField(term215348, term215348.getClass(), "bestBattlePoint", -1858156484);
        setIntField(term215348, term215348.getClass(), "overDamageBattlePoint", 1629598973);
        setBooleanField(term215348, term215348.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term215348, term215348.getClass(), "nameplateId", 26411664);
        setIntField(term215348, term215348.getClass(), "trophyId", 1791622790);
        setIntField(term215348, term215348.getClass(), "cardId", -1666988360);
        setIntField(term215348, term215348.getClass(), "characterId", 1304377188);
        setIntField(term215348, term215348.getClass(), "characterVoiceNo", 348283942);
        setIntField(term215348, term215348.getClass(), "tabSetting", 776006341);
        setIntField(term215348, term215348.getClass(), "tabSortSetting", 1145867680);
        setIntField(term215348, term215348.getClass(), "cardCategorySetting", 1382995321);
        setIntField(term215348, term215348.getClass(), "cardSortSetting", 375758346);
        setIntField(term215348, term215348.getClass(), "rivalScoreCategorySetting", 128390500);
        setIntField(term215348, term215348.getClass(), "playedTutorialBit", 2129617215);
        setIntField(term215348, term215348.getClass(), "firstTutorialCancelNum", 123578164);
        setLongField(term215348, term215348.getClass(), "sumTechHighScore", 1588032528014963437L);
        setLongField(term215348, term215348.getClass(), "sumTechBasicHighScore", 5609222796474002227L);
        setLongField(term215348, term215348.getClass(), "sumTechAdvancedHighScore", -9190628802748301406L);
        setLongField(term215348, term215348.getClass(), "sumTechExpertHighScore", 3603248734833458364L);
        setLongField(term215348, term215348.getClass(), "sumTechMasterHighScore", 6548056565582320757L);
        setLongField(term215348, term215348.getClass(), "sumTechLunaticHighScore", 7497491354611378876L);
        setLongField(term215348, term215348.getClass(), "sumBattleHighScore", 349006973694791230L);
        setLongField(term215348, term215348.getClass(), "sumBattleBasicHighScore", 7628536876459883328L);
        setLongField(term215348, term215348.getClass(), "sumBattleAdvancedHighScore", 1624185261238942901L);
        setLongField(term215348, term215348.getClass(), "sumBattleExpertHighScore", -8750773609970352127L);
        setLongField(term215348, term215348.getClass(), "sumBattleMasterHighScore", 6012110850487716369L);
        setLongField(term215348, term215348.getClass(), "sumBattleLunaticHighScore", -6620434607349317470L);
        setField(term215348, term215348.getClass(), "eventWatchedDate", "UjlZvHchZX");
        setField(term215348, term215348.getClass(), "cmEventWatchedDate", "ZoGOphtbMj");
        setField(term215348, term215348.getClass(), "firstGameId", "FxtuMMZTnJ");
        setField(term215348, term215348.getClass(), "firstRomVersion", "xqcrleZqqU");
        setField(term215348, term215348.getClass(), "firstDataVersion", "GZfyTlJvPo");
        setField(term215348, term215348.getClass(), "firstPlayDate", "ErykqtSHSR");
        setField(term215348, term215348.getClass(), "lastGameId", "cYBIjKvbtm");
        setField(term215348, term215348.getClass(), "lastRomVersion", "BEvLYxGdKf");
        setField(term215348, term215348.getClass(), "lastDataVersion", "ANkSSVQejl");
        setField(term215348, term215348.getClass(), "compatibleCmVersion", "UiDKxqVkSN");
        setField(term215348, term215348.getClass(), "lastPlayDate", "vxFZtlwdRB");
        setIntField(term215348, term215348.getClass(), "lastPlaceId", 496578261);
        setField(term215348, term215348.getClass(), "lastPlaceName", "gwRYIIqrRr");
        setIntField(term215348, term215348.getClass(), "lastRegionId", -685473621);
        setField(term215348, term215348.getClass(), "lastRegionName", "aBvLuPbJPh");
        setIntField(term215348, term215348.getClass(), "lastAllNetId", -1507226157);
        setField(term215348, term215348.getClass(), "lastClientId", "TvrcwGmIbL");
        setIntField(term215348, term215348.getClass(), "lastUsedDeckId", 2048976325);
        setIntField(term215348, term215348.getClass(), "lastPlayMusicLevel", 1946370960);
        setIntField(term215348, term215348.getClass(), "lastEmoneyBrand", -1208286860);
        setField(term215346, term215346.getClass(), "user", term215348);
        setIntField(term215346, term215346.getClass(), "sortNumber", -1558614690);
        setIntField(term215346, term215346.getClass(), "placeId", -1007231272);
        setField(term215346, term215346.getClass(), "placeName", "CLEwlxHcqT");
        setField(term215346, term215346.getClass(), "playDate", "ITYLKPXKxL");
        setField(term215346, term215346.getClass(), "userPlayDate", "AZimImfppv");
        setIntField(term215346, term215346.getClass(), "musicId", 616194988);
        setIntField(term215346, term215346.getClass(), "level", 875212303);
        setIntField(term215346, term215346.getClass(), "playKind", -1724746051);
        setIntField(term215346, term215346.getClass(), "eventId", -1978836967);
        setField(term215346, term215346.getClass(), "eventName", "oTKpImhTKa");
        setIntField(term215346, term215346.getClass(), "eventPoint", 223766580);
        setIntField(term215346, term215346.getClass(), "playedUserId1", -1028401307);
        setIntField(term215346, term215346.getClass(), "playedUserId2", -749032967);
        setIntField(term215346, term215346.getClass(), "playedUserId3", 399255289);
        setField(term215346, term215346.getClass(), "playedUserName1", "CtxCIgenEk");
        setField(term215346, term215346.getClass(), "playedUserName2", "BxNhqJkpzh");
        setField(term215346, term215346.getClass(), "playedUserName3", "zukENECSXB");
        setIntField(term215346, term215346.getClass(), "playedMusicLevel1", -188927419);
        setIntField(term215346, term215346.getClass(), "playedMusicLevel2", 865923167);
        setIntField(term215346, term215346.getClass(), "playedMusicLevel3", 411168220);
        setIntField(term215346, term215346.getClass(), "cardId1", -37027662);
        setIntField(term215346, term215346.getClass(), "cardId2", 1314903229);
        setIntField(term215346, term215346.getClass(), "cardId3", 1315243912);
        setIntField(term215346, term215346.getClass(), "cardLevel1", 1457074887);
        setIntField(term215346, term215346.getClass(), "cardLevel2", 1963312777);
        setIntField(term215346, term215346.getClass(), "cardLevel3", -1162599119);
        setIntField(term215346, term215346.getClass(), "cardAttack1", -151931152);
        setIntField(term215346, term215346.getClass(), "cardAttack2", 14184131);
        setIntField(term215346, term215346.getClass(), "cardAttack3", 357749330);
        setIntField(term215346, term215346.getClass(), "bossCharaId", 33679397);
        setIntField(term215346, term215346.getClass(), "bossLevel", 613527123);
        setIntField(term215346, term215346.getClass(), "bossAttribute", 312461013);
        setIntField(term215346, term215346.getClass(), "clearStatus", 1548945209);
        setIntField(term215346, term215346.getClass(), "techScore", -1537602442);
        setIntField(term215346, term215346.getClass(), "techScoreRank", -1264895109);
        setIntField(term215346, term215346.getClass(), "battleScore", -1573815915);
        setIntField(term215346, term215346.getClass(), "battleScoreRank", -1219777858);
        setIntField(term215346, term215346.getClass(), "platinumScore", 1275177499);
        setIntField(term215346, term215346.getClass(), "maxCombo", 683701474);
        setIntField(term215346, term215346.getClass(), "judgeMiss", 247947009);
        setIntField(term215346, term215346.getClass(), "judgeHit", 718686721);
        setIntField(term215346, term215346.getClass(), "judgeBreak", -1912489972);
        setIntField(term215346, term215346.getClass(), "judgeCriticalBreak", 380168858);
        setIntField(term215346, term215346.getClass(), "rateTap", 1684017550);
        setIntField(term215346, term215346.getClass(), "rateHold", -1085067457);
        setIntField(term215346, term215346.getClass(), "rateFlick", -1171804799);
        setIntField(term215346, term215346.getClass(), "rateSideTap", -50658959);
        setIntField(term215346, term215346.getClass(), "rateSideHold", -1244851072);
        setIntField(term215346, term215346.getClass(), "bellCount", -1127273572);
        setIntField(term215346, term215346.getClass(), "totalBellCount", -942505377);
        setIntField(term215346, term215346.getClass(), "damageCount", 1207786576);
        setIntField(term215346, term215346.getClass(), "overDamage", -95646854);
        setBooleanField(term215346, term215346.getClass(), "isTechNewRecord", true);
        setBooleanField(term215346, term215346.getClass(), "isBattleNewRecord", false);
        setBooleanField(term215346, term215346.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term215346, term215346.getClass(), "isFullCombo", true);
        setBooleanField(term215346, term215346.getClass(), "isFullBell", false);
        setBooleanField(term215346, term215346.getClass(), "isAllBreak", false);
        setIntField(term215346, term215346.getClass(), "playerRating", -1261061854);
        setIntField(term215346, term215346.getClass(), "battlePoint", 581616367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTechNewRecord", argTypes, term215346, args);
    }

};


