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

public class UserPlaylog_isAllBreak_176523407859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218506;

    public UserPlaylog_isAllBreak_176523407859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term218512 = new Long(1634166935474035772L);
        term218506 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term218508 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term218510 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term218526 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218527 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218531 = newInstance(Class.forName("java.time.LocalTime"));
        Object term218536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218541 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term218506, term218506.getClass(), "id", -166542082464095579L);
        setLongField(term218508, term218508.getClass(), "id", -7646899338332480839L);
        setLongField(term218510, term218510.getClass(), "id", 6759680599257464822L);
        setField(term218510, term218510.getClass(), "extId", term218512);
        setField(term218510, term218510.getClass(), "luid", "dtotxQeUmY");
        setIntField(term218527, term218527.getClass(), "year", 2019);
        setShortField(term218527, term218527.getClass(), "month", (short) 5);
        setShortField(term218527, term218527.getClass(), "day", (short) 2);
        setField(term218526, term218526.getClass(), "date", term218527);
        setByteField(term218531, term218531.getClass(), "hour", (byte) 7);
        setByteField(term218531, term218531.getClass(), "minute", (byte) 38);
        setByteField(term218531, term218531.getClass(), "second", (byte) 2);
        setIntField(term218531, term218531.getClass(), "nano", 148685302);
        setField(term218526, term218526.getClass(), "time", term218531);
        setField(term218510, term218510.getClass(), "registerTime", term218526);
        setIntField(term218537, term218537.getClass(), "year", 2019);
        setShortField(term218537, term218537.getClass(), "month", (short) 4);
        setShortField(term218537, term218537.getClass(), "day", (short) 21);
        setField(term218536, term218536.getClass(), "date", term218537);
        setByteField(term218541, term218541.getClass(), "hour", (byte) 5);
        setByteField(term218541, term218541.getClass(), "minute", (byte) 35);
        setByteField(term218541, term218541.getClass(), "second", (byte) 51);
        setIntField(term218541, term218541.getClass(), "nano", 345346848);
        setField(term218536, term218536.getClass(), "time", term218541);
        setField(term218510, term218510.getClass(), "accessTime", term218536);
        setField(term218508, term218508.getClass(), "card", term218510);
        setField(term218508, term218508.getClass(), "userName", "xlfrOHXLcP");
        setIntField(term218508, term218508.getClass(), "level", -1595184661);
        setIntField(term218508, term218508.getClass(), "reincarnationNum", -1926551151);
        setLongField(term218508, term218508.getClass(), "exp", 4578508757232108216L);
        setLongField(term218508, term218508.getClass(), "point", -8350558671563402440L);
        setLongField(term218508, term218508.getClass(), "totalPoint", -8545542915745803688L);
        setIntField(term218508, term218508.getClass(), "playCount", -515301751);
        setIntField(term218508, term218508.getClass(), "jewelCount", -1631583570);
        setIntField(term218508, term218508.getClass(), "totalJewelCount", 1842224897);
        setIntField(term218508, term218508.getClass(), "medalCount", 484137454);
        setIntField(term218508, term218508.getClass(), "playerRating", -1073010447);
        setIntField(term218508, term218508.getClass(), "highestRating", 2051289757);
        setIntField(term218508, term218508.getClass(), "battlePoint", 1076073722);
        setIntField(term218508, term218508.getClass(), "bestBattlePoint", -14378708);
        setIntField(term218508, term218508.getClass(), "overDamageBattlePoint", 1455425247);
        setBooleanField(term218508, term218508.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term218508, term218508.getClass(), "nameplateId", 1225276779);
        setIntField(term218508, term218508.getClass(), "trophyId", -1640653355);
        setIntField(term218508, term218508.getClass(), "cardId", -648278413);
        setIntField(term218508, term218508.getClass(), "characterId", -1181202031);
        setIntField(term218508, term218508.getClass(), "characterVoiceNo", -439859067);
        setIntField(term218508, term218508.getClass(), "tabSetting", -66207086);
        setIntField(term218508, term218508.getClass(), "tabSortSetting", -1284058526);
        setIntField(term218508, term218508.getClass(), "cardCategorySetting", 862234803);
        setIntField(term218508, term218508.getClass(), "cardSortSetting", -616491282);
        setIntField(term218508, term218508.getClass(), "rivalScoreCategorySetting", -58881768);
        setIntField(term218508, term218508.getClass(), "playedTutorialBit", 1032489246);
        setIntField(term218508, term218508.getClass(), "firstTutorialCancelNum", -902458143);
        setLongField(term218508, term218508.getClass(), "sumTechHighScore", 2093720573953757774L);
        setLongField(term218508, term218508.getClass(), "sumTechBasicHighScore", -7359299566670725640L);
        setLongField(term218508, term218508.getClass(), "sumTechAdvancedHighScore", 5122235896758869025L);
        setLongField(term218508, term218508.getClass(), "sumTechExpertHighScore", 1639764991428545540L);
        setLongField(term218508, term218508.getClass(), "sumTechMasterHighScore", -2585624432000034107L);
        setLongField(term218508, term218508.getClass(), "sumTechLunaticHighScore", 8327431796101021119L);
        setLongField(term218508, term218508.getClass(), "sumBattleHighScore", 4135426471711941594L);
        setLongField(term218508, term218508.getClass(), "sumBattleBasicHighScore", -6076971976423849918L);
        setLongField(term218508, term218508.getClass(), "sumBattleAdvancedHighScore", -6147480950782624972L);
        setLongField(term218508, term218508.getClass(), "sumBattleExpertHighScore", 4552903135246330307L);
        setLongField(term218508, term218508.getClass(), "sumBattleMasterHighScore", 2293806674628074430L);
        setLongField(term218508, term218508.getClass(), "sumBattleLunaticHighScore", 8769239443508889370L);
        setField(term218508, term218508.getClass(), "eventWatchedDate", "ScyVgkgWQC");
        setField(term218508, term218508.getClass(), "cmEventWatchedDate", "EupIzTtIGl");
        setField(term218508, term218508.getClass(), "firstGameId", "ipqSPLoaHR");
        setField(term218508, term218508.getClass(), "firstRomVersion", "OvhEUawYLa");
        setField(term218508, term218508.getClass(), "firstDataVersion", "ZGoWfxYnff");
        setField(term218508, term218508.getClass(), "firstPlayDate", "nEGtThxDpE");
        setField(term218508, term218508.getClass(), "lastGameId", "YJECmDWfFA");
        setField(term218508, term218508.getClass(), "lastRomVersion", "nBVnXTgrAz");
        setField(term218508, term218508.getClass(), "lastDataVersion", "WMaQyrwGdO");
        setField(term218508, term218508.getClass(), "compatibleCmVersion", "ZnZODAPebz");
        setField(term218508, term218508.getClass(), "lastPlayDate", "sZasilHTLD");
        setIntField(term218508, term218508.getClass(), "lastPlaceId", -1015807113);
        setField(term218508, term218508.getClass(), "lastPlaceName", "fzGHTtdbZF");
        setIntField(term218508, term218508.getClass(), "lastRegionId", -741690280);
        setField(term218508, term218508.getClass(), "lastRegionName", "PseWsKPNnq");
        setIntField(term218508, term218508.getClass(), "lastAllNetId", -302708306);
        setField(term218508, term218508.getClass(), "lastClientId", "bTUqKPrsQc");
        setIntField(term218508, term218508.getClass(), "lastUsedDeckId", -805114262);
        setIntField(term218508, term218508.getClass(), "lastPlayMusicLevel", 32762414);
        setIntField(term218508, term218508.getClass(), "lastEmoneyBrand", -2095258959);
        setField(term218506, term218506.getClass(), "user", term218508);
        setIntField(term218506, term218506.getClass(), "sortNumber", -2021218682);
        setIntField(term218506, term218506.getClass(), "placeId", 1079108695);
        setField(term218506, term218506.getClass(), "placeName", "hYtVnMoMQS");
        setField(term218506, term218506.getClass(), "playDate", "iVctvCjlkg");
        setField(term218506, term218506.getClass(), "userPlayDate", "LNrZSgEmMs");
        setIntField(term218506, term218506.getClass(), "musicId", -1181567725);
        setIntField(term218506, term218506.getClass(), "level", 767307414);
        setIntField(term218506, term218506.getClass(), "playKind", -122688671);
        setIntField(term218506, term218506.getClass(), "eventId", -1230291029);
        setField(term218506, term218506.getClass(), "eventName", "hhqCyYNKnb");
        setIntField(term218506, term218506.getClass(), "eventPoint", 1594785809);
        setIntField(term218506, term218506.getClass(), "playedUserId1", -670648979);
        setIntField(term218506, term218506.getClass(), "playedUserId2", 1399645267);
        setIntField(term218506, term218506.getClass(), "playedUserId3", 1041538795);
        setField(term218506, term218506.getClass(), "playedUserName1", "ysTbjBRFqY");
        setField(term218506, term218506.getClass(), "playedUserName2", "CvxoLXuHEl");
        setField(term218506, term218506.getClass(), "playedUserName3", "eRCmaTGfAT");
        setIntField(term218506, term218506.getClass(), "playedMusicLevel1", 1356367916);
        setIntField(term218506, term218506.getClass(), "playedMusicLevel2", 1576872122);
        setIntField(term218506, term218506.getClass(), "playedMusicLevel3", 380977694);
        setIntField(term218506, term218506.getClass(), "cardId1", -1411160608);
        setIntField(term218506, term218506.getClass(), "cardId2", 117398006);
        setIntField(term218506, term218506.getClass(), "cardId3", -1432040068);
        setIntField(term218506, term218506.getClass(), "cardLevel1", -153489469);
        setIntField(term218506, term218506.getClass(), "cardLevel2", 1080583578);
        setIntField(term218506, term218506.getClass(), "cardLevel3", 283702087);
        setIntField(term218506, term218506.getClass(), "cardAttack1", 612339159);
        setIntField(term218506, term218506.getClass(), "cardAttack2", 1739451740);
        setIntField(term218506, term218506.getClass(), "cardAttack3", -1033928520);
        setIntField(term218506, term218506.getClass(), "bossCharaId", 2015415340);
        setIntField(term218506, term218506.getClass(), "bossLevel", -1270808334);
        setIntField(term218506, term218506.getClass(), "bossAttribute", 450987049);
        setIntField(term218506, term218506.getClass(), "clearStatus", -1761685529);
        setIntField(term218506, term218506.getClass(), "techScore", -1152845025);
        setIntField(term218506, term218506.getClass(), "techScoreRank", -1141797598);
        setIntField(term218506, term218506.getClass(), "battleScore", 2077501415);
        setIntField(term218506, term218506.getClass(), "battleScoreRank", -1674245464);
        setIntField(term218506, term218506.getClass(), "platinumScore", 1501358200);
        setIntField(term218506, term218506.getClass(), "maxCombo", 606013511);
        setIntField(term218506, term218506.getClass(), "judgeMiss", -1852663448);
        setIntField(term218506, term218506.getClass(), "judgeHit", -312526763);
        setIntField(term218506, term218506.getClass(), "judgeBreak", 2020033827);
        setIntField(term218506, term218506.getClass(), "judgeCriticalBreak", 1422686838);
        setIntField(term218506, term218506.getClass(), "rateTap", 217849440);
        setIntField(term218506, term218506.getClass(), "rateHold", -1464210075);
        setIntField(term218506, term218506.getClass(), "rateFlick", 624179347);
        setIntField(term218506, term218506.getClass(), "rateSideTap", 1724442328);
        setIntField(term218506, term218506.getClass(), "rateSideHold", 761455228);
        setIntField(term218506, term218506.getClass(), "bellCount", 894605550);
        setIntField(term218506, term218506.getClass(), "totalBellCount", -710673930);
        setIntField(term218506, term218506.getClass(), "damageCount", 573521617);
        setIntField(term218506, term218506.getClass(), "overDamage", 1856558520);
        setBooleanField(term218506, term218506.getClass(), "isTechNewRecord", false);
        setBooleanField(term218506, term218506.getClass(), "isBattleNewRecord", true);
        setBooleanField(term218506, term218506.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term218506, term218506.getClass(), "isFullCombo", false);
        setBooleanField(term218506, term218506.getClass(), "isFullBell", true);
        setBooleanField(term218506, term218506.getClass(), "isAllBreak", false);
        setIntField(term218506, term218506.getClass(), "playerRating", 578922091);
        setIntField(term218506, term218506.getClass(), "battlePoint", 1645299882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllBreak", argTypes, term218506, args);
    }

};


