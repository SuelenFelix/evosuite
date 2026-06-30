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

public class UserPlaylog_getTotalBellCount_39859019651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213450;

    public UserPlaylog_getTotalBellCount_39859019651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term213456 = new Long(-7370364068296402536L);
        term213450 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term213452 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term213454 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term213470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213475 = newInstance(Class.forName("java.time.LocalTime"));
        Object term213480 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213481 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213485 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term213450, term213450.getClass(), "id", 703577619581573832L);
        setLongField(term213452, term213452.getClass(), "id", -427204309460562393L);
        setLongField(term213454, term213454.getClass(), "id", 1107316092196427982L);
        setField(term213454, term213454.getClass(), "extId", term213456);
        setField(term213454, term213454.getClass(), "luid", "nrJryVhnJx");
        setIntField(term213471, term213471.getClass(), "year", 2023);
        setShortField(term213471, term213471.getClass(), "month", (short) 5);
        setShortField(term213471, term213471.getClass(), "day", (short) 31);
        setField(term213470, term213470.getClass(), "date", term213471);
        setByteField(term213475, term213475.getClass(), "hour", (byte) 3);
        setByteField(term213475, term213475.getClass(), "minute", (byte) 15);
        setByteField(term213475, term213475.getClass(), "second", (byte) 34);
        setIntField(term213475, term213475.getClass(), "nano", 794699238);
        setField(term213470, term213470.getClass(), "time", term213475);
        setField(term213454, term213454.getClass(), "registerTime", term213470);
        setIntField(term213481, term213481.getClass(), "year", 2013);
        setShortField(term213481, term213481.getClass(), "month", (short) 10);
        setShortField(term213481, term213481.getClass(), "day", (short) 1);
        setField(term213480, term213480.getClass(), "date", term213481);
        setByteField(term213485, term213485.getClass(), "hour", (byte) 21);
        setByteField(term213485, term213485.getClass(), "minute", (byte) 9);
        setByteField(term213485, term213485.getClass(), "second", (byte) 5);
        setIntField(term213485, term213485.getClass(), "nano", 986326309);
        setField(term213480, term213480.getClass(), "time", term213485);
        setField(term213454, term213454.getClass(), "accessTime", term213480);
        setField(term213452, term213452.getClass(), "card", term213454);
        setField(term213452, term213452.getClass(), "userName", "BRFRCWtQIG");
        setIntField(term213452, term213452.getClass(), "level", 548084080);
        setIntField(term213452, term213452.getClass(), "reincarnationNum", 1744825642);
        setLongField(term213452, term213452.getClass(), "exp", -8751876474956580823L);
        setLongField(term213452, term213452.getClass(), "point", -4989200430370185264L);
        setLongField(term213452, term213452.getClass(), "totalPoint", -5013725726051891709L);
        setIntField(term213452, term213452.getClass(), "playCount", -1372443184);
        setIntField(term213452, term213452.getClass(), "jewelCount", -360453538);
        setIntField(term213452, term213452.getClass(), "totalJewelCount", -1878105251);
        setIntField(term213452, term213452.getClass(), "medalCount", 269733901);
        setIntField(term213452, term213452.getClass(), "playerRating", -736927476);
        setIntField(term213452, term213452.getClass(), "highestRating", 1853113749);
        setIntField(term213452, term213452.getClass(), "battlePoint", -586438860);
        setIntField(term213452, term213452.getClass(), "bestBattlePoint", -1602722865);
        setIntField(term213452, term213452.getClass(), "overDamageBattlePoint", -1584130001);
        setBooleanField(term213452, term213452.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term213452, term213452.getClass(), "nameplateId", -1669995376);
        setIntField(term213452, term213452.getClass(), "trophyId", -684090418);
        setIntField(term213452, term213452.getClass(), "cardId", 248781931);
        setIntField(term213452, term213452.getClass(), "characterId", 1444890082);
        setIntField(term213452, term213452.getClass(), "characterVoiceNo", -463625508);
        setIntField(term213452, term213452.getClass(), "tabSetting", 86106790);
        setIntField(term213452, term213452.getClass(), "tabSortSetting", -1239672206);
        setIntField(term213452, term213452.getClass(), "cardCategorySetting", -909873191);
        setIntField(term213452, term213452.getClass(), "cardSortSetting", -17106495);
        setIntField(term213452, term213452.getClass(), "rivalScoreCategorySetting", -1205540932);
        setIntField(term213452, term213452.getClass(), "playedTutorialBit", -1477355747);
        setIntField(term213452, term213452.getClass(), "firstTutorialCancelNum", -1041405094);
        setLongField(term213452, term213452.getClass(), "sumTechHighScore", -8642182779747557504L);
        setLongField(term213452, term213452.getClass(), "sumTechBasicHighScore", -5559145737380156017L);
        setLongField(term213452, term213452.getClass(), "sumTechAdvancedHighScore", -5366294806491775117L);
        setLongField(term213452, term213452.getClass(), "sumTechExpertHighScore", -9085157956791529318L);
        setLongField(term213452, term213452.getClass(), "sumTechMasterHighScore", -4350871807993032884L);
        setLongField(term213452, term213452.getClass(), "sumTechLunaticHighScore", 1924669448645583780L);
        setLongField(term213452, term213452.getClass(), "sumBattleHighScore", -3309188536440842983L);
        setLongField(term213452, term213452.getClass(), "sumBattleBasicHighScore", -925747124046021405L);
        setLongField(term213452, term213452.getClass(), "sumBattleAdvancedHighScore", -7951746157411525124L);
        setLongField(term213452, term213452.getClass(), "sumBattleExpertHighScore", 686910339691253646L);
        setLongField(term213452, term213452.getClass(), "sumBattleMasterHighScore", 766037242790737165L);
        setLongField(term213452, term213452.getClass(), "sumBattleLunaticHighScore", -6241115025902069929L);
        setField(term213452, term213452.getClass(), "eventWatchedDate", "VvFHiCPutw");
        setField(term213452, term213452.getClass(), "cmEventWatchedDate", "pIVDmquiiy");
        setField(term213452, term213452.getClass(), "firstGameId", "QKZBoZqVRg");
        setField(term213452, term213452.getClass(), "firstRomVersion", "NEEIZQiGuu");
        setField(term213452, term213452.getClass(), "firstDataVersion", "CEvOMXwQxg");
        setField(term213452, term213452.getClass(), "firstPlayDate", "mxdsPNszOh");
        setField(term213452, term213452.getClass(), "lastGameId", "IVVzjnfNdK");
        setField(term213452, term213452.getClass(), "lastRomVersion", "ATmDitYnqV");
        setField(term213452, term213452.getClass(), "lastDataVersion", "SZavUirhzV");
        setField(term213452, term213452.getClass(), "compatibleCmVersion", "aCaErGkYhA");
        setField(term213452, term213452.getClass(), "lastPlayDate", "twbXfBZPUC");
        setIntField(term213452, term213452.getClass(), "lastPlaceId", -2004362129);
        setField(term213452, term213452.getClass(), "lastPlaceName", "mYbjAQVgdp");
        setIntField(term213452, term213452.getClass(), "lastRegionId", 1709267900);
        setField(term213452, term213452.getClass(), "lastRegionName", "bsHKGhUuqz");
        setIntField(term213452, term213452.getClass(), "lastAllNetId", -2036597343);
        setField(term213452, term213452.getClass(), "lastClientId", "FxfgxciexL");
        setIntField(term213452, term213452.getClass(), "lastUsedDeckId", -988488193);
        setIntField(term213452, term213452.getClass(), "lastPlayMusicLevel", -910318730);
        setIntField(term213452, term213452.getClass(), "lastEmoneyBrand", -1198085025);
        setField(term213450, term213450.getClass(), "user", term213452);
        setIntField(term213450, term213450.getClass(), "sortNumber", -1420655161);
        setIntField(term213450, term213450.getClass(), "placeId", 559777465);
        setField(term213450, term213450.getClass(), "placeName", "dBKinpPYLb");
        setField(term213450, term213450.getClass(), "playDate", "BsnkZbwWZk");
        setField(term213450, term213450.getClass(), "userPlayDate", "tQDCijzzgW");
        setIntField(term213450, term213450.getClass(), "musicId", 965262203);
        setIntField(term213450, term213450.getClass(), "level", 1569464081);
        setIntField(term213450, term213450.getClass(), "playKind", 1899979707);
        setIntField(term213450, term213450.getClass(), "eventId", -379153640);
        setField(term213450, term213450.getClass(), "eventName", "MeqXPTruBL");
        setIntField(term213450, term213450.getClass(), "eventPoint", 2059143976);
        setIntField(term213450, term213450.getClass(), "playedUserId1", -855871020);
        setIntField(term213450, term213450.getClass(), "playedUserId2", 294740259);
        setIntField(term213450, term213450.getClass(), "playedUserId3", -843479862);
        setField(term213450, term213450.getClass(), "playedUserName1", "jjqkfZqAuK");
        setField(term213450, term213450.getClass(), "playedUserName2", "oBCrGVIYdD");
        setField(term213450, term213450.getClass(), "playedUserName3", "wuSSpQZPZU");
        setIntField(term213450, term213450.getClass(), "playedMusicLevel1", -1178581916);
        setIntField(term213450, term213450.getClass(), "playedMusicLevel2", -1533008285);
        setIntField(term213450, term213450.getClass(), "playedMusicLevel3", -317721741);
        setIntField(term213450, term213450.getClass(), "cardId1", 603089761);
        setIntField(term213450, term213450.getClass(), "cardId2", 357209284);
        setIntField(term213450, term213450.getClass(), "cardId3", -1561404518);
        setIntField(term213450, term213450.getClass(), "cardLevel1", 1567499135);
        setIntField(term213450, term213450.getClass(), "cardLevel2", 1468757593);
        setIntField(term213450, term213450.getClass(), "cardLevel3", -1645647552);
        setIntField(term213450, term213450.getClass(), "cardAttack1", 1876056340);
        setIntField(term213450, term213450.getClass(), "cardAttack2", -114566575);
        setIntField(term213450, term213450.getClass(), "cardAttack3", -415161512);
        setIntField(term213450, term213450.getClass(), "bossCharaId", -638764759);
        setIntField(term213450, term213450.getClass(), "bossLevel", -1643368171);
        setIntField(term213450, term213450.getClass(), "bossAttribute", 1904125756);
        setIntField(term213450, term213450.getClass(), "clearStatus", -174814025);
        setIntField(term213450, term213450.getClass(), "techScore", 958303322);
        setIntField(term213450, term213450.getClass(), "techScoreRank", 1228479658);
        setIntField(term213450, term213450.getClass(), "battleScore", 129520433);
        setIntField(term213450, term213450.getClass(), "battleScoreRank", 390437953);
        setIntField(term213450, term213450.getClass(), "platinumScore", -1928220499);
        setIntField(term213450, term213450.getClass(), "maxCombo", 1701541391);
        setIntField(term213450, term213450.getClass(), "judgeMiss", -936192688);
        setIntField(term213450, term213450.getClass(), "judgeHit", 938944057);
        setIntField(term213450, term213450.getClass(), "judgeBreak", 855364273);
        setIntField(term213450, term213450.getClass(), "judgeCriticalBreak", -519539376);
        setIntField(term213450, term213450.getClass(), "rateTap", -651264831);
        setIntField(term213450, term213450.getClass(), "rateHold", 801845409);
        setIntField(term213450, term213450.getClass(), "rateFlick", -638292583);
        setIntField(term213450, term213450.getClass(), "rateSideTap", -1507192014);
        setIntField(term213450, term213450.getClass(), "rateSideHold", -444046395);
        setIntField(term213450, term213450.getClass(), "bellCount", -1931089223);
        setIntField(term213450, term213450.getClass(), "totalBellCount", -1614199178);
        setIntField(term213450, term213450.getClass(), "damageCount", 8500819);
        setIntField(term213450, term213450.getClass(), "overDamage", -84115449);
        setBooleanField(term213450, term213450.getClass(), "isTechNewRecord", false);
        setBooleanField(term213450, term213450.getClass(), "isBattleNewRecord", false);
        setBooleanField(term213450, term213450.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term213450, term213450.getClass(), "isFullCombo", false);
        setBooleanField(term213450, term213450.getClass(), "isFullBell", false);
        setBooleanField(term213450, term213450.getClass(), "isAllBreak", false);
        setIntField(term213450, term213450.getClass(), "playerRating", 1974081733);
        setIntField(term213450, term213450.getClass(), "battlePoint", -29727064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBellCount", argTypes, term213450, args);
    }

};


