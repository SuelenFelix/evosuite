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

public class UserPlaylog_getUser_12606654641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181850;

    public UserPlaylog_getUser_12606654641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term181856 = new Long(2287785643837657068L);
        term181850 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term181852 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term181854 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term181870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181875 = newInstance(Class.forName("java.time.LocalTime"));
        Object term181880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term181881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181885 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term181850, term181850.getClass(), "id", 7927237568181703163L);
        setLongField(term181852, term181852.getClass(), "id", 8570009922272534626L);
        setLongField(term181854, term181854.getClass(), "id", -8902259157428840686L);
        setField(term181854, term181854.getClass(), "extId", term181856);
        setField(term181854, term181854.getClass(), "luid", "lAkfwyrdJh");
        setIntField(term181871, term181871.getClass(), "year", 2019);
        setShortField(term181871, term181871.getClass(), "month", (short) 3);
        setShortField(term181871, term181871.getClass(), "day", (short) 15);
        setField(term181870, term181870.getClass(), "date", term181871);
        setByteField(term181875, term181875.getClass(), "hour", (byte) 19);
        setByteField(term181875, term181875.getClass(), "minute", (byte) 20);
        setByteField(term181875, term181875.getClass(), "second", (byte) 17);
        setIntField(term181875, term181875.getClass(), "nano", 872983779);
        setField(term181870, term181870.getClass(), "time", term181875);
        setField(term181854, term181854.getClass(), "registerTime", term181870);
        setIntField(term181881, term181881.getClass(), "year", 2028);
        setShortField(term181881, term181881.getClass(), "month", (short) 10);
        setShortField(term181881, term181881.getClass(), "day", (short) 1);
        setField(term181880, term181880.getClass(), "date", term181881);
        setByteField(term181885, term181885.getClass(), "hour", (byte) 12);
        setByteField(term181885, term181885.getClass(), "minute", (byte) 47);
        setByteField(term181885, term181885.getClass(), "second", (byte) 33);
        setIntField(term181885, term181885.getClass(), "nano", 170475636);
        setField(term181880, term181880.getClass(), "time", term181885);
        setField(term181854, term181854.getClass(), "accessTime", term181880);
        setField(term181852, term181852.getClass(), "card", term181854);
        setField(term181852, term181852.getClass(), "userName", "RwVzJMayYn");
        setIntField(term181852, term181852.getClass(), "level", -278477960);
        setIntField(term181852, term181852.getClass(), "reincarnationNum", 1350970644);
        setLongField(term181852, term181852.getClass(), "exp", -3803614501416114575L);
        setLongField(term181852, term181852.getClass(), "point", 6102475192058129247L);
        setLongField(term181852, term181852.getClass(), "totalPoint", -4281244125783955710L);
        setIntField(term181852, term181852.getClass(), "playCount", 66061780);
        setIntField(term181852, term181852.getClass(), "jewelCount", -502963961);
        setIntField(term181852, term181852.getClass(), "totalJewelCount", 1088885205);
        setIntField(term181852, term181852.getClass(), "medalCount", 478047010);
        setIntField(term181852, term181852.getClass(), "playerRating", 750938225);
        setIntField(term181852, term181852.getClass(), "highestRating", -2008152478);
        setIntField(term181852, term181852.getClass(), "battlePoint", 655489496);
        setIntField(term181852, term181852.getClass(), "bestBattlePoint", 682196034);
        setIntField(term181852, term181852.getClass(), "overDamageBattlePoint", -2093869089);
        setBooleanField(term181852, term181852.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term181852, term181852.getClass(), "nameplateId", 1853945022);
        setIntField(term181852, term181852.getClass(), "trophyId", -1033559342);
        setIntField(term181852, term181852.getClass(), "cardId", -989968487);
        setIntField(term181852, term181852.getClass(), "characterId", -893947386);
        setIntField(term181852, term181852.getClass(), "characterVoiceNo", -584984505);
        setIntField(term181852, term181852.getClass(), "tabSetting", 1921752033);
        setIntField(term181852, term181852.getClass(), "tabSortSetting", 1157339879);
        setIntField(term181852, term181852.getClass(), "cardCategorySetting", -1756345024);
        setIntField(term181852, term181852.getClass(), "cardSortSetting", -362014680);
        setIntField(term181852, term181852.getClass(), "rivalScoreCategorySetting", 1027302993);
        setIntField(term181852, term181852.getClass(), "playedTutorialBit", 578940700);
        setIntField(term181852, term181852.getClass(), "firstTutorialCancelNum", 1531290466);
        setLongField(term181852, term181852.getClass(), "sumTechHighScore", 403186353656902852L);
        setLongField(term181852, term181852.getClass(), "sumTechBasicHighScore", 2784445642622626925L);
        setLongField(term181852, term181852.getClass(), "sumTechAdvancedHighScore", -5453777250967497602L);
        setLongField(term181852, term181852.getClass(), "sumTechExpertHighScore", -8149935998454675151L);
        setLongField(term181852, term181852.getClass(), "sumTechMasterHighScore", 3428486638437521102L);
        setLongField(term181852, term181852.getClass(), "sumTechLunaticHighScore", 3764731684576741944L);
        setLongField(term181852, term181852.getClass(), "sumBattleHighScore", 8932365346248063195L);
        setLongField(term181852, term181852.getClass(), "sumBattleBasicHighScore", -6598276650320885409L);
        setLongField(term181852, term181852.getClass(), "sumBattleAdvancedHighScore", 405274616298957014L);
        setLongField(term181852, term181852.getClass(), "sumBattleExpertHighScore", 4272568189267567670L);
        setLongField(term181852, term181852.getClass(), "sumBattleMasterHighScore", -1376360718446582689L);
        setLongField(term181852, term181852.getClass(), "sumBattleLunaticHighScore", 5868440555894643459L);
        setField(term181852, term181852.getClass(), "eventWatchedDate", "QneDLFoKDs");
        setField(term181852, term181852.getClass(), "cmEventWatchedDate", "ZFvSWqDErD");
        setField(term181852, term181852.getClass(), "firstGameId", "ZOIsEkkYcg");
        setField(term181852, term181852.getClass(), "firstRomVersion", "uVZNGWujSB");
        setField(term181852, term181852.getClass(), "firstDataVersion", "aSeKrqRjrc");
        setField(term181852, term181852.getClass(), "firstPlayDate", "boIyFGzYdI");
        setField(term181852, term181852.getClass(), "lastGameId", "yTrhnMjhqm");
        setField(term181852, term181852.getClass(), "lastRomVersion", "EMzeudToqI");
        setField(term181852, term181852.getClass(), "lastDataVersion", "GSzyRhhzzM");
        setField(term181852, term181852.getClass(), "compatibleCmVersion", "mSOhoJEHnr");
        setField(term181852, term181852.getClass(), "lastPlayDate", "dWXHGHNUNn");
        setIntField(term181852, term181852.getClass(), "lastPlaceId", 248659773);
        setField(term181852, term181852.getClass(), "lastPlaceName", "zXgcLGETIq");
        setIntField(term181852, term181852.getClass(), "lastRegionId", 511099454);
        setField(term181852, term181852.getClass(), "lastRegionName", "wDYLeXsgWz");
        setIntField(term181852, term181852.getClass(), "lastAllNetId", -1280548304);
        setField(term181852, term181852.getClass(), "lastClientId", "oCtzSjVaYw");
        setIntField(term181852, term181852.getClass(), "lastUsedDeckId", -328046339);
        setIntField(term181852, term181852.getClass(), "lastPlayMusicLevel", -197215219);
        setIntField(term181852, term181852.getClass(), "lastEmoneyBrand", 8593789);
        setField(term181850, term181850.getClass(), "user", term181852);
        setIntField(term181850, term181850.getClass(), "sortNumber", 1063189043);
        setIntField(term181850, term181850.getClass(), "placeId", 1133122784);
        setField(term181850, term181850.getClass(), "placeName", "kVDgCXjfOs");
        setField(term181850, term181850.getClass(), "playDate", "kjdirmlqfW");
        setField(term181850, term181850.getClass(), "userPlayDate", "JETgVlJyGS");
        setIntField(term181850, term181850.getClass(), "musicId", -1433654281);
        setIntField(term181850, term181850.getClass(), "level", -1834883908);
        setIntField(term181850, term181850.getClass(), "playKind", -116554333);
        setIntField(term181850, term181850.getClass(), "eventId", 46242785);
        setField(term181850, term181850.getClass(), "eventName", "kAUpfVcBjb");
        setIntField(term181850, term181850.getClass(), "eventPoint", -530930262);
        setIntField(term181850, term181850.getClass(), "playedUserId1", 1471497959);
        setIntField(term181850, term181850.getClass(), "playedUserId2", 547335421);
        setIntField(term181850, term181850.getClass(), "playedUserId3", 2116412636);
        setField(term181850, term181850.getClass(), "playedUserName1", "NwUGjxHFcU");
        setField(term181850, term181850.getClass(), "playedUserName2", "ugWxxSVYlr");
        setField(term181850, term181850.getClass(), "playedUserName3", "yPAymLCsGS");
        setIntField(term181850, term181850.getClass(), "playedMusicLevel1", -2016758054);
        setIntField(term181850, term181850.getClass(), "playedMusicLevel2", -1010951475);
        setIntField(term181850, term181850.getClass(), "playedMusicLevel3", -1802761834);
        setIntField(term181850, term181850.getClass(), "cardId1", 722925820);
        setIntField(term181850, term181850.getClass(), "cardId2", 1912473903);
        setIntField(term181850, term181850.getClass(), "cardId3", -1362804989);
        setIntField(term181850, term181850.getClass(), "cardLevel1", 193811882);
        setIntField(term181850, term181850.getClass(), "cardLevel2", -1508936648);
        setIntField(term181850, term181850.getClass(), "cardLevel3", 633922177);
        setIntField(term181850, term181850.getClass(), "cardAttack1", 2140007432);
        setIntField(term181850, term181850.getClass(), "cardAttack2", -1242429003);
        setIntField(term181850, term181850.getClass(), "cardAttack3", -900466144);
        setIntField(term181850, term181850.getClass(), "bossCharaId", 889123906);
        setIntField(term181850, term181850.getClass(), "bossLevel", 1453080745);
        setIntField(term181850, term181850.getClass(), "bossAttribute", -1783104767);
        setIntField(term181850, term181850.getClass(), "clearStatus", -1902202151);
        setIntField(term181850, term181850.getClass(), "techScore", -75944389);
        setIntField(term181850, term181850.getClass(), "techScoreRank", -185749338);
        setIntField(term181850, term181850.getClass(), "battleScore", -1515532416);
        setIntField(term181850, term181850.getClass(), "battleScoreRank", -1466493850);
        setIntField(term181850, term181850.getClass(), "platinumScore", 1520011387);
        setIntField(term181850, term181850.getClass(), "maxCombo", -1082705514);
        setIntField(term181850, term181850.getClass(), "judgeMiss", 869620443);
        setIntField(term181850, term181850.getClass(), "judgeHit", 254180392);
        setIntField(term181850, term181850.getClass(), "judgeBreak", 921499787);
        setIntField(term181850, term181850.getClass(), "judgeCriticalBreak", -480804345);
        setIntField(term181850, term181850.getClass(), "rateTap", 1073952970);
        setIntField(term181850, term181850.getClass(), "rateHold", -977380185);
        setIntField(term181850, term181850.getClass(), "rateFlick", 987432422);
        setIntField(term181850, term181850.getClass(), "rateSideTap", 1827227369);
        setIntField(term181850, term181850.getClass(), "rateSideHold", 1829845158);
        setIntField(term181850, term181850.getClass(), "bellCount", 1621951378);
        setIntField(term181850, term181850.getClass(), "totalBellCount", 1549119911);
        setIntField(term181850, term181850.getClass(), "damageCount", -272319701);
        setIntField(term181850, term181850.getClass(), "overDamage", 681602619);
        setBooleanField(term181850, term181850.getClass(), "isTechNewRecord", true);
        setBooleanField(term181850, term181850.getClass(), "isBattleNewRecord", true);
        setBooleanField(term181850, term181850.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term181850, term181850.getClass(), "isFullCombo", false);
        setBooleanField(term181850, term181850.getClass(), "isFullBell", false);
        setBooleanField(term181850, term181850.getClass(), "isAllBreak", false);
        setIntField(term181850, term181850.getClass(), "playerRating", 686439428);
        setIntField(term181850, term181850.getClass(), "battlePoint", -2089572988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term181850, args);
    }

};


