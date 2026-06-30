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

public class UserPlaylog_getCardLevel2_197953538226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197650;

    public UserPlaylog_getCardLevel2_197953538226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term197656 = new Long(-7423063312741500355L);
        term197650 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term197652 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term197654 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term197670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term197671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term197680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term197681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term197685 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term197650, term197650.getClass(), "id", 1851254231278465740L);
        setLongField(term197652, term197652.getClass(), "id", 1328309579961114471L);
        setLongField(term197654, term197654.getClass(), "id", 5015032571762374279L);
        setField(term197654, term197654.getClass(), "extId", term197656);
        setField(term197654, term197654.getClass(), "luid", "nyZDBXBMYn");
        setIntField(term197671, term197671.getClass(), "year", 2016);
        setShortField(term197671, term197671.getClass(), "month", (short) 6);
        setShortField(term197671, term197671.getClass(), "day", (short) 2);
        setField(term197670, term197670.getClass(), "date", term197671);
        setByteField(term197675, term197675.getClass(), "hour", (byte) 5);
        setByteField(term197675, term197675.getClass(), "minute", (byte) 24);
        setByteField(term197675, term197675.getClass(), "second", (byte) 28);
        setIntField(term197675, term197675.getClass(), "nano", 586692762);
        setField(term197670, term197670.getClass(), "time", term197675);
        setField(term197654, term197654.getClass(), "registerTime", term197670);
        setIntField(term197681, term197681.getClass(), "year", 2012);
        setShortField(term197681, term197681.getClass(), "month", (short) 3);
        setShortField(term197681, term197681.getClass(), "day", (short) 20);
        setField(term197680, term197680.getClass(), "date", term197681);
        setByteField(term197685, term197685.getClass(), "hour", (byte) 16);
        setByteField(term197685, term197685.getClass(), "minute", (byte) 41);
        setByteField(term197685, term197685.getClass(), "second", (byte) 13);
        setIntField(term197685, term197685.getClass(), "nano", 546552876);
        setField(term197680, term197680.getClass(), "time", term197685);
        setField(term197654, term197654.getClass(), "accessTime", term197680);
        setField(term197652, term197652.getClass(), "card", term197654);
        setField(term197652, term197652.getClass(), "userName", "CzeNuWMNeS");
        setIntField(term197652, term197652.getClass(), "level", -1339541472);
        setIntField(term197652, term197652.getClass(), "reincarnationNum", -1339841912);
        setLongField(term197652, term197652.getClass(), "exp", 3950055695438813172L);
        setLongField(term197652, term197652.getClass(), "point", 4680259969871678964L);
        setLongField(term197652, term197652.getClass(), "totalPoint", -8079535623511099869L);
        setIntField(term197652, term197652.getClass(), "playCount", 1493202984);
        setIntField(term197652, term197652.getClass(), "jewelCount", -1545181029);
        setIntField(term197652, term197652.getClass(), "totalJewelCount", 863002097);
        setIntField(term197652, term197652.getClass(), "medalCount", 1454255164);
        setIntField(term197652, term197652.getClass(), "playerRating", 258540505);
        setIntField(term197652, term197652.getClass(), "highestRating", -636009842);
        setIntField(term197652, term197652.getClass(), "battlePoint", -1643221139);
        setIntField(term197652, term197652.getClass(), "bestBattlePoint", -616849103);
        setIntField(term197652, term197652.getClass(), "overDamageBattlePoint", -1763424995);
        setBooleanField(term197652, term197652.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term197652, term197652.getClass(), "nameplateId", 1191219328);
        setIntField(term197652, term197652.getClass(), "trophyId", 1420085769);
        setIntField(term197652, term197652.getClass(), "cardId", -1716068102);
        setIntField(term197652, term197652.getClass(), "characterId", 1751028937);
        setIntField(term197652, term197652.getClass(), "characterVoiceNo", -946645308);
        setIntField(term197652, term197652.getClass(), "tabSetting", -1547322289);
        setIntField(term197652, term197652.getClass(), "tabSortSetting", 231829287);
        setIntField(term197652, term197652.getClass(), "cardCategorySetting", -1963914155);
        setIntField(term197652, term197652.getClass(), "cardSortSetting", -1038510230);
        setIntField(term197652, term197652.getClass(), "rivalScoreCategorySetting", -788735743);
        setIntField(term197652, term197652.getClass(), "playedTutorialBit", 1373516177);
        setIntField(term197652, term197652.getClass(), "firstTutorialCancelNum", 1802766234);
        setLongField(term197652, term197652.getClass(), "sumTechHighScore", 6213783664737876106L);
        setLongField(term197652, term197652.getClass(), "sumTechBasicHighScore", 2941511442376352105L);
        setLongField(term197652, term197652.getClass(), "sumTechAdvancedHighScore", 8292155882032188482L);
        setLongField(term197652, term197652.getClass(), "sumTechExpertHighScore", -2940506771296398549L);
        setLongField(term197652, term197652.getClass(), "sumTechMasterHighScore", 2939024897212707706L);
        setLongField(term197652, term197652.getClass(), "sumTechLunaticHighScore", -3659857262692638404L);
        setLongField(term197652, term197652.getClass(), "sumBattleHighScore", 6836079585650107676L);
        setLongField(term197652, term197652.getClass(), "sumBattleBasicHighScore", 8848500472054344868L);
        setLongField(term197652, term197652.getClass(), "sumBattleAdvancedHighScore", -9012690193533322497L);
        setLongField(term197652, term197652.getClass(), "sumBattleExpertHighScore", 4804149465943210147L);
        setLongField(term197652, term197652.getClass(), "sumBattleMasterHighScore", -713771074791912819L);
        setLongField(term197652, term197652.getClass(), "sumBattleLunaticHighScore", 3753828460538899957L);
        setField(term197652, term197652.getClass(), "eventWatchedDate", "mGULSbVqur");
        setField(term197652, term197652.getClass(), "cmEventWatchedDate", "VYoqkdcwjY");
        setField(term197652, term197652.getClass(), "firstGameId", "KMwfAbfnHw");
        setField(term197652, term197652.getClass(), "firstRomVersion", "PsqgNftcLy");
        setField(term197652, term197652.getClass(), "firstDataVersion", "BykaPFoBDp");
        setField(term197652, term197652.getClass(), "firstPlayDate", "ICCSkwtqRT");
        setField(term197652, term197652.getClass(), "lastGameId", "nZKKNtKLkY");
        setField(term197652, term197652.getClass(), "lastRomVersion", "dWXmVZsdHl");
        setField(term197652, term197652.getClass(), "lastDataVersion", "CaztRRdvSW");
        setField(term197652, term197652.getClass(), "compatibleCmVersion", "GFmsvWuxkH");
        setField(term197652, term197652.getClass(), "lastPlayDate", "MXGilcTQHk");
        setIntField(term197652, term197652.getClass(), "lastPlaceId", 685615791);
        setField(term197652, term197652.getClass(), "lastPlaceName", "rjiIdWkVuJ");
        setIntField(term197652, term197652.getClass(), "lastRegionId", -1200105341);
        setField(term197652, term197652.getClass(), "lastRegionName", "hovNRReWVy");
        setIntField(term197652, term197652.getClass(), "lastAllNetId", 2053718006);
        setField(term197652, term197652.getClass(), "lastClientId", "bmugCmWSnL");
        setIntField(term197652, term197652.getClass(), "lastUsedDeckId", -183402787);
        setIntField(term197652, term197652.getClass(), "lastPlayMusicLevel", -519427406);
        setIntField(term197652, term197652.getClass(), "lastEmoneyBrand", 705801338);
        setField(term197650, term197650.getClass(), "user", term197652);
        setIntField(term197650, term197650.getClass(), "sortNumber", 2059704519);
        setIntField(term197650, term197650.getClass(), "placeId", -686523125);
        setField(term197650, term197650.getClass(), "placeName", "fPjxaiBsNt");
        setField(term197650, term197650.getClass(), "playDate", "egyDjxIvMN");
        setField(term197650, term197650.getClass(), "userPlayDate", "zqyYQpBynr");
        setIntField(term197650, term197650.getClass(), "musicId", -554670483);
        setIntField(term197650, term197650.getClass(), "level", -813127249);
        setIntField(term197650, term197650.getClass(), "playKind", 703254336);
        setIntField(term197650, term197650.getClass(), "eventId", 339949126);
        setField(term197650, term197650.getClass(), "eventName", "JzmhjVnRxU");
        setIntField(term197650, term197650.getClass(), "eventPoint", 1498320866);
        setIntField(term197650, term197650.getClass(), "playedUserId1", -1093473223);
        setIntField(term197650, term197650.getClass(), "playedUserId2", -342489415);
        setIntField(term197650, term197650.getClass(), "playedUserId3", 820347552);
        setField(term197650, term197650.getClass(), "playedUserName1", "hjCSTPfmnL");
        setField(term197650, term197650.getClass(), "playedUserName2", "bWXEGWHIvK");
        setField(term197650, term197650.getClass(), "playedUserName3", "znEoyMLBko");
        setIntField(term197650, term197650.getClass(), "playedMusicLevel1", 1494096276);
        setIntField(term197650, term197650.getClass(), "playedMusicLevel2", 1964136923);
        setIntField(term197650, term197650.getClass(), "playedMusicLevel3", -1334128836);
        setIntField(term197650, term197650.getClass(), "cardId1", -562970331);
        setIntField(term197650, term197650.getClass(), "cardId2", -444205256);
        setIntField(term197650, term197650.getClass(), "cardId3", -220469590);
        setIntField(term197650, term197650.getClass(), "cardLevel1", -2021935274);
        setIntField(term197650, term197650.getClass(), "cardLevel2", 1794533150);
        setIntField(term197650, term197650.getClass(), "cardLevel3", 1439937964);
        setIntField(term197650, term197650.getClass(), "cardAttack1", 396099571);
        setIntField(term197650, term197650.getClass(), "cardAttack2", 27502386);
        setIntField(term197650, term197650.getClass(), "cardAttack3", -1896431724);
        setIntField(term197650, term197650.getClass(), "bossCharaId", 1369021992);
        setIntField(term197650, term197650.getClass(), "bossLevel", 1377583451);
        setIntField(term197650, term197650.getClass(), "bossAttribute", -1325246237);
        setIntField(term197650, term197650.getClass(), "clearStatus", 1255513875);
        setIntField(term197650, term197650.getClass(), "techScore", -1516283725);
        setIntField(term197650, term197650.getClass(), "techScoreRank", -707995578);
        setIntField(term197650, term197650.getClass(), "battleScore", 543654400);
        setIntField(term197650, term197650.getClass(), "battleScoreRank", 894504879);
        setIntField(term197650, term197650.getClass(), "platinumScore", -692731433);
        setIntField(term197650, term197650.getClass(), "maxCombo", -239715972);
        setIntField(term197650, term197650.getClass(), "judgeMiss", -1397849483);
        setIntField(term197650, term197650.getClass(), "judgeHit", 54409547);
        setIntField(term197650, term197650.getClass(), "judgeBreak", -703207529);
        setIntField(term197650, term197650.getClass(), "judgeCriticalBreak", -48362230);
        setIntField(term197650, term197650.getClass(), "rateTap", -1592415080);
        setIntField(term197650, term197650.getClass(), "rateHold", -840627688);
        setIntField(term197650, term197650.getClass(), "rateFlick", 561930657);
        setIntField(term197650, term197650.getClass(), "rateSideTap", -919309210);
        setIntField(term197650, term197650.getClass(), "rateSideHold", 741964410);
        setIntField(term197650, term197650.getClass(), "bellCount", 357524316);
        setIntField(term197650, term197650.getClass(), "totalBellCount", 500267199);
        setIntField(term197650, term197650.getClass(), "damageCount", 1154289365);
        setIntField(term197650, term197650.getClass(), "overDamage", 335365247);
        setBooleanField(term197650, term197650.getClass(), "isTechNewRecord", true);
        setBooleanField(term197650, term197650.getClass(), "isBattleNewRecord", false);
        setBooleanField(term197650, term197650.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term197650, term197650.getClass(), "isFullCombo", false);
        setBooleanField(term197650, term197650.getClass(), "isFullBell", false);
        setBooleanField(term197650, term197650.getClass(), "isAllBreak", true);
        setIntField(term197650, term197650.getClass(), "playerRating", 383241844);
        setIntField(term197650, term197650.getClass(), "battlePoint", -2144743021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardLevel2", argTypes, term197650, args);
    }

};


