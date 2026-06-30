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

public class UserPlaylog_getDamageCount_180805945652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214082;

    public UserPlaylog_getDamageCount_180805945652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term214088 = new Long(-1084263688306617320L);
        term214082 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term214084 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term214086 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term214102 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214103 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214107 = newInstance(Class.forName("java.time.LocalTime"));
        Object term214112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term214113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term214117 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term214082, term214082.getClass(), "id", -741178090091846530L);
        setLongField(term214084, term214084.getClass(), "id", -7820629957062019016L);
        setLongField(term214086, term214086.getClass(), "id", 8546808375918306560L);
        setField(term214086, term214086.getClass(), "extId", term214088);
        setField(term214086, term214086.getClass(), "luid", "eaArOXcEdx");
        setIntField(term214103, term214103.getClass(), "year", 2025);
        setShortField(term214103, term214103.getClass(), "month", (short) 5);
        setShortField(term214103, term214103.getClass(), "day", (short) 29);
        setField(term214102, term214102.getClass(), "date", term214103);
        setByteField(term214107, term214107.getClass(), "hour", (byte) 14);
        setByteField(term214107, term214107.getClass(), "minute", (byte) 31);
        setByteField(term214107, term214107.getClass(), "second", (byte) 17);
        setIntField(term214107, term214107.getClass(), "nano", 808113660);
        setField(term214102, term214102.getClass(), "time", term214107);
        setField(term214086, term214086.getClass(), "registerTime", term214102);
        setIntField(term214113, term214113.getClass(), "year", 2029);
        setShortField(term214113, term214113.getClass(), "month", (short) 9);
        setShortField(term214113, term214113.getClass(), "day", (short) 22);
        setField(term214112, term214112.getClass(), "date", term214113);
        setByteField(term214117, term214117.getClass(), "hour", (byte) 9);
        setByteField(term214117, term214117.getClass(), "minute", (byte) 11);
        setByteField(term214117, term214117.getClass(), "second", (byte) 48);
        setIntField(term214117, term214117.getClass(), "nano", 904292704);
        setField(term214112, term214112.getClass(), "time", term214117);
        setField(term214086, term214086.getClass(), "accessTime", term214112);
        setField(term214084, term214084.getClass(), "card", term214086);
        setField(term214084, term214084.getClass(), "userName", "ynSIbcCBaI");
        setIntField(term214084, term214084.getClass(), "level", -36303217);
        setIntField(term214084, term214084.getClass(), "reincarnationNum", -1425546184);
        setLongField(term214084, term214084.getClass(), "exp", -2296694108636965262L);
        setLongField(term214084, term214084.getClass(), "point", 115184320156573542L);
        setLongField(term214084, term214084.getClass(), "totalPoint", -5192352240739849518L);
        setIntField(term214084, term214084.getClass(), "playCount", -1133905901);
        setIntField(term214084, term214084.getClass(), "jewelCount", -975779438);
        setIntField(term214084, term214084.getClass(), "totalJewelCount", -1141325147);
        setIntField(term214084, term214084.getClass(), "medalCount", 1102382810);
        setIntField(term214084, term214084.getClass(), "playerRating", -546054340);
        setIntField(term214084, term214084.getClass(), "highestRating", 839496076);
        setIntField(term214084, term214084.getClass(), "battlePoint", -709438438);
        setIntField(term214084, term214084.getClass(), "bestBattlePoint", -270196134);
        setIntField(term214084, term214084.getClass(), "overDamageBattlePoint", -518906199);
        setBooleanField(term214084, term214084.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term214084, term214084.getClass(), "nameplateId", 913561629);
        setIntField(term214084, term214084.getClass(), "trophyId", -82780836);
        setIntField(term214084, term214084.getClass(), "cardId", -1538850204);
        setIntField(term214084, term214084.getClass(), "characterId", -2037783207);
        setIntField(term214084, term214084.getClass(), "characterVoiceNo", 799731049);
        setIntField(term214084, term214084.getClass(), "tabSetting", 1446415915);
        setIntField(term214084, term214084.getClass(), "tabSortSetting", 1616695923);
        setIntField(term214084, term214084.getClass(), "cardCategorySetting", -1952633376);
        setIntField(term214084, term214084.getClass(), "cardSortSetting", -2077418776);
        setIntField(term214084, term214084.getClass(), "rivalScoreCategorySetting", 1888684596);
        setIntField(term214084, term214084.getClass(), "playedTutorialBit", 1391968678);
        setIntField(term214084, term214084.getClass(), "firstTutorialCancelNum", -573573198);
        setLongField(term214084, term214084.getClass(), "sumTechHighScore", 6748970300109104263L);
        setLongField(term214084, term214084.getClass(), "sumTechBasicHighScore", -8294594230521407691L);
        setLongField(term214084, term214084.getClass(), "sumTechAdvancedHighScore", -8666244601924927641L);
        setLongField(term214084, term214084.getClass(), "sumTechExpertHighScore", -1995356765968597169L);
        setLongField(term214084, term214084.getClass(), "sumTechMasterHighScore", -6356470816180664936L);
        setLongField(term214084, term214084.getClass(), "sumTechLunaticHighScore", -6897765086628386393L);
        setLongField(term214084, term214084.getClass(), "sumBattleHighScore", -1046939409955026466L);
        setLongField(term214084, term214084.getClass(), "sumBattleBasicHighScore", -8985083735056061211L);
        setLongField(term214084, term214084.getClass(), "sumBattleAdvancedHighScore", -4116568912512494319L);
        setLongField(term214084, term214084.getClass(), "sumBattleExpertHighScore", -1391513918138897073L);
        setLongField(term214084, term214084.getClass(), "sumBattleMasterHighScore", -8061662383472277177L);
        setLongField(term214084, term214084.getClass(), "sumBattleLunaticHighScore", 7156880244966092433L);
        setField(term214084, term214084.getClass(), "eventWatchedDate", "LaaQtlDqEd");
        setField(term214084, term214084.getClass(), "cmEventWatchedDate", "rVKVHcfKQD");
        setField(term214084, term214084.getClass(), "firstGameId", "TvgFLUmwwW");
        setField(term214084, term214084.getClass(), "firstRomVersion", "LrNiWJYyTG");
        setField(term214084, term214084.getClass(), "firstDataVersion", "ELrjumEBLg");
        setField(term214084, term214084.getClass(), "firstPlayDate", "xbmZKVroup");
        setField(term214084, term214084.getClass(), "lastGameId", "LZMAvggNMe");
        setField(term214084, term214084.getClass(), "lastRomVersion", "vnpnXFWzvr");
        setField(term214084, term214084.getClass(), "lastDataVersion", "cbudVbeXed");
        setField(term214084, term214084.getClass(), "compatibleCmVersion", "nUwJJPksYx");
        setField(term214084, term214084.getClass(), "lastPlayDate", "bkYmvWePQT");
        setIntField(term214084, term214084.getClass(), "lastPlaceId", -721584808);
        setField(term214084, term214084.getClass(), "lastPlaceName", "jxDxrLRRcq");
        setIntField(term214084, term214084.getClass(), "lastRegionId", 2146307582);
        setField(term214084, term214084.getClass(), "lastRegionName", "rTpdeGCRay");
        setIntField(term214084, term214084.getClass(), "lastAllNetId", 816418778);
        setField(term214084, term214084.getClass(), "lastClientId", "zXdwBSOjJU");
        setIntField(term214084, term214084.getClass(), "lastUsedDeckId", -1343139679);
        setIntField(term214084, term214084.getClass(), "lastPlayMusicLevel", -1422276108);
        setIntField(term214084, term214084.getClass(), "lastEmoneyBrand", 629145097);
        setField(term214082, term214082.getClass(), "user", term214084);
        setIntField(term214082, term214082.getClass(), "sortNumber", -1038526476);
        setIntField(term214082, term214082.getClass(), "placeId", -1620249948);
        setField(term214082, term214082.getClass(), "placeName", "fCgIgrkuJo");
        setField(term214082, term214082.getClass(), "playDate", "ymsVUhZoWG");
        setField(term214082, term214082.getClass(), "userPlayDate", "rZQVdeAYlM");
        setIntField(term214082, term214082.getClass(), "musicId", 407409382);
        setIntField(term214082, term214082.getClass(), "level", -434813900);
        setIntField(term214082, term214082.getClass(), "playKind", -1591071874);
        setIntField(term214082, term214082.getClass(), "eventId", -1309509159);
        setField(term214082, term214082.getClass(), "eventName", "miQpwHDBxH");
        setIntField(term214082, term214082.getClass(), "eventPoint", 876797689);
        setIntField(term214082, term214082.getClass(), "playedUserId1", -851468449);
        setIntField(term214082, term214082.getClass(), "playedUserId2", -1514712203);
        setIntField(term214082, term214082.getClass(), "playedUserId3", 1598781132);
        setField(term214082, term214082.getClass(), "playedUserName1", "SDiMckZWSA");
        setField(term214082, term214082.getClass(), "playedUserName2", "lBtaWtPHWf");
        setField(term214082, term214082.getClass(), "playedUserName3", "ebaQRypTcS");
        setIntField(term214082, term214082.getClass(), "playedMusicLevel1", 1899169938);
        setIntField(term214082, term214082.getClass(), "playedMusicLevel2", 2086291792);
        setIntField(term214082, term214082.getClass(), "playedMusicLevel3", -1433187744);
        setIntField(term214082, term214082.getClass(), "cardId1", 1762255097);
        setIntField(term214082, term214082.getClass(), "cardId2", 888018912);
        setIntField(term214082, term214082.getClass(), "cardId3", 856692442);
        setIntField(term214082, term214082.getClass(), "cardLevel1", -2001484892);
        setIntField(term214082, term214082.getClass(), "cardLevel2", -196301425);
        setIntField(term214082, term214082.getClass(), "cardLevel3", 1709968466);
        setIntField(term214082, term214082.getClass(), "cardAttack1", 1751184955);
        setIntField(term214082, term214082.getClass(), "cardAttack2", 1782993942);
        setIntField(term214082, term214082.getClass(), "cardAttack3", 963677814);
        setIntField(term214082, term214082.getClass(), "bossCharaId", -1797863095);
        setIntField(term214082, term214082.getClass(), "bossLevel", 857108422);
        setIntField(term214082, term214082.getClass(), "bossAttribute", -1089564718);
        setIntField(term214082, term214082.getClass(), "clearStatus", 1985944979);
        setIntField(term214082, term214082.getClass(), "techScore", 600742414);
        setIntField(term214082, term214082.getClass(), "techScoreRank", -848491327);
        setIntField(term214082, term214082.getClass(), "battleScore", 271036746);
        setIntField(term214082, term214082.getClass(), "battleScoreRank", 1921972298);
        setIntField(term214082, term214082.getClass(), "platinumScore", 1759412486);
        setIntField(term214082, term214082.getClass(), "maxCombo", -609040240);
        setIntField(term214082, term214082.getClass(), "judgeMiss", -263119455);
        setIntField(term214082, term214082.getClass(), "judgeHit", 1676382020);
        setIntField(term214082, term214082.getClass(), "judgeBreak", -368458204);
        setIntField(term214082, term214082.getClass(), "judgeCriticalBreak", 385413138);
        setIntField(term214082, term214082.getClass(), "rateTap", 546200121);
        setIntField(term214082, term214082.getClass(), "rateHold", -100422031);
        setIntField(term214082, term214082.getClass(), "rateFlick", -906004322);
        setIntField(term214082, term214082.getClass(), "rateSideTap", -2047208630);
        setIntField(term214082, term214082.getClass(), "rateSideHold", 1549289354);
        setIntField(term214082, term214082.getClass(), "bellCount", -1656094384);
        setIntField(term214082, term214082.getClass(), "totalBellCount", -1810376733);
        setIntField(term214082, term214082.getClass(), "damageCount", 1564142914);
        setIntField(term214082, term214082.getClass(), "overDamage", -702106315);
        setBooleanField(term214082, term214082.getClass(), "isTechNewRecord", false);
        setBooleanField(term214082, term214082.getClass(), "isBattleNewRecord", false);
        setBooleanField(term214082, term214082.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term214082, term214082.getClass(), "isFullCombo", false);
        setBooleanField(term214082, term214082.getClass(), "isFullBell", true);
        setBooleanField(term214082, term214082.getClass(), "isAllBreak", true);
        setIntField(term214082, term214082.getClass(), "playerRating", -350021779);
        setIntField(term214082, term214082.getClass(), "battlePoint", 1208670155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDamageCount", argTypes, term214082, args);
    }

};


