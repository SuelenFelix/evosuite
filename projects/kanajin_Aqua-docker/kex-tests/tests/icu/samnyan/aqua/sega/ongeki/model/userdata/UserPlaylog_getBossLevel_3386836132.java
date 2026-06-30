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

public class UserPlaylog_getBossLevel_3386836132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201442;

    public UserPlaylog_getBossLevel_3386836132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term201448 = new Long(-3231440836116263235L);
        term201442 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term201444 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term201446 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term201462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201467 = newInstance(Class.forName("java.time.LocalTime"));
        Object term201472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term201477 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term201442, term201442.getClass(), "id", 5759451034243251945L);
        setLongField(term201444, term201444.getClass(), "id", -3681588184887129859L);
        setLongField(term201446, term201446.getClass(), "id", 7389663485430652067L);
        setField(term201446, term201446.getClass(), "extId", term201448);
        setField(term201446, term201446.getClass(), "luid", "jlcrHmfxgw");
        setIntField(term201463, term201463.getClass(), "year", 2019);
        setShortField(term201463, term201463.getClass(), "month", (short) 10);
        setShortField(term201463, term201463.getClass(), "day", (short) 25);
        setField(term201462, term201462.getClass(), "date", term201463);
        setByteField(term201467, term201467.getClass(), "hour", (byte) 18);
        setByteField(term201467, term201467.getClass(), "minute", (byte) 58);
        setByteField(term201467, term201467.getClass(), "second", (byte) 55);
        setIntField(term201467, term201467.getClass(), "nano", 407840282);
        setField(term201462, term201462.getClass(), "time", term201467);
        setField(term201446, term201446.getClass(), "registerTime", term201462);
        setIntField(term201473, term201473.getClass(), "year", 2012);
        setShortField(term201473, term201473.getClass(), "month", (short) 4);
        setShortField(term201473, term201473.getClass(), "day", (short) 23);
        setField(term201472, term201472.getClass(), "date", term201473);
        setByteField(term201477, term201477.getClass(), "hour", (byte) 8);
        setByteField(term201477, term201477.getClass(), "minute", (byte) 11);
        setByteField(term201477, term201477.getClass(), "second", (byte) 45);
        setIntField(term201477, term201477.getClass(), "nano", 286907697);
        setField(term201472, term201472.getClass(), "time", term201477);
        setField(term201446, term201446.getClass(), "accessTime", term201472);
        setField(term201444, term201444.getClass(), "card", term201446);
        setField(term201444, term201444.getClass(), "userName", "qshqyFDkaY");
        setIntField(term201444, term201444.getClass(), "level", 15479492);
        setIntField(term201444, term201444.getClass(), "reincarnationNum", -258376445);
        setLongField(term201444, term201444.getClass(), "exp", -1486523688091782488L);
        setLongField(term201444, term201444.getClass(), "point", -656132478494175508L);
        setLongField(term201444, term201444.getClass(), "totalPoint", -838122048368919304L);
        setIntField(term201444, term201444.getClass(), "playCount", -1191611854);
        setIntField(term201444, term201444.getClass(), "jewelCount", -1527549440);
        setIntField(term201444, term201444.getClass(), "totalJewelCount", -1399194513);
        setIntField(term201444, term201444.getClass(), "medalCount", -1471074360);
        setIntField(term201444, term201444.getClass(), "playerRating", -1817615474);
        setIntField(term201444, term201444.getClass(), "highestRating", 1327478327);
        setIntField(term201444, term201444.getClass(), "battlePoint", -414080427);
        setIntField(term201444, term201444.getClass(), "bestBattlePoint", -1135585922);
        setIntField(term201444, term201444.getClass(), "overDamageBattlePoint", 66735634);
        setBooleanField(term201444, term201444.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term201444, term201444.getClass(), "nameplateId", 1949042395);
        setIntField(term201444, term201444.getClass(), "trophyId", 1649546902);
        setIntField(term201444, term201444.getClass(), "cardId", -87681490);
        setIntField(term201444, term201444.getClass(), "characterId", 395330131);
        setIntField(term201444, term201444.getClass(), "characterVoiceNo", 651139126);
        setIntField(term201444, term201444.getClass(), "tabSetting", -656045392);
        setIntField(term201444, term201444.getClass(), "tabSortSetting", -100842881);
        setIntField(term201444, term201444.getClass(), "cardCategorySetting", 1937636625);
        setIntField(term201444, term201444.getClass(), "cardSortSetting", 1059591478);
        setIntField(term201444, term201444.getClass(), "rivalScoreCategorySetting", 1368153892);
        setIntField(term201444, term201444.getClass(), "playedTutorialBit", -1910393713);
        setIntField(term201444, term201444.getClass(), "firstTutorialCancelNum", -373450377);
        setLongField(term201444, term201444.getClass(), "sumTechHighScore", -4625916681960163535L);
        setLongField(term201444, term201444.getClass(), "sumTechBasicHighScore", 1385272929057395735L);
        setLongField(term201444, term201444.getClass(), "sumTechAdvancedHighScore", -7591104665472989385L);
        setLongField(term201444, term201444.getClass(), "sumTechExpertHighScore", -8977725568527294543L);
        setLongField(term201444, term201444.getClass(), "sumTechMasterHighScore", -5082845034262723454L);
        setLongField(term201444, term201444.getClass(), "sumTechLunaticHighScore", -2403845829743948038L);
        setLongField(term201444, term201444.getClass(), "sumBattleHighScore", 8533827589273378299L);
        setLongField(term201444, term201444.getClass(), "sumBattleBasicHighScore", -1097488180177149706L);
        setLongField(term201444, term201444.getClass(), "sumBattleAdvancedHighScore", -7727811943108626484L);
        setLongField(term201444, term201444.getClass(), "sumBattleExpertHighScore", 4364403881941265652L);
        setLongField(term201444, term201444.getClass(), "sumBattleMasterHighScore", -4929298995378859634L);
        setLongField(term201444, term201444.getClass(), "sumBattleLunaticHighScore", -8457480468325339301L);
        setField(term201444, term201444.getClass(), "eventWatchedDate", "UTzAnQlNUZ");
        setField(term201444, term201444.getClass(), "cmEventWatchedDate", "FOXCMddxzQ");
        setField(term201444, term201444.getClass(), "firstGameId", "DtROYlXqCJ");
        setField(term201444, term201444.getClass(), "firstRomVersion", "fcNMdNQQvW");
        setField(term201444, term201444.getClass(), "firstDataVersion", "NDvqjvXlOJ");
        setField(term201444, term201444.getClass(), "firstPlayDate", "IEYToiMHbq");
        setField(term201444, term201444.getClass(), "lastGameId", "oUdobPPOtl");
        setField(term201444, term201444.getClass(), "lastRomVersion", "DnPZWDcJoa");
        setField(term201444, term201444.getClass(), "lastDataVersion", "rJbnGmOZjC");
        setField(term201444, term201444.getClass(), "compatibleCmVersion", "JVRRLnzenT");
        setField(term201444, term201444.getClass(), "lastPlayDate", "dYYtYLYBZf");
        setIntField(term201444, term201444.getClass(), "lastPlaceId", -1107911075);
        setField(term201444, term201444.getClass(), "lastPlaceName", "MECOvMKXsH");
        setIntField(term201444, term201444.getClass(), "lastRegionId", -856364710);
        setField(term201444, term201444.getClass(), "lastRegionName", "mvJDolKmzb");
        setIntField(term201444, term201444.getClass(), "lastAllNetId", 179988997);
        setField(term201444, term201444.getClass(), "lastClientId", "ndJXYHbYDA");
        setIntField(term201444, term201444.getClass(), "lastUsedDeckId", 1879810976);
        setIntField(term201444, term201444.getClass(), "lastPlayMusicLevel", 1144603644);
        setIntField(term201444, term201444.getClass(), "lastEmoneyBrand", -703646783);
        setField(term201442, term201442.getClass(), "user", term201444);
        setIntField(term201442, term201442.getClass(), "sortNumber", -1293767834);
        setIntField(term201442, term201442.getClass(), "placeId", 1526878045);
        setField(term201442, term201442.getClass(), "placeName", "TlztQQjnqF");
        setField(term201442, term201442.getClass(), "playDate", "OrFmbgNXCQ");
        setField(term201442, term201442.getClass(), "userPlayDate", "MLmGotxWzi");
        setIntField(term201442, term201442.getClass(), "musicId", 631599007);
        setIntField(term201442, term201442.getClass(), "level", 702159930);
        setIntField(term201442, term201442.getClass(), "playKind", 824038568);
        setIntField(term201442, term201442.getClass(), "eventId", -370485451);
        setField(term201442, term201442.getClass(), "eventName", "BwZPpCJvdQ");
        setIntField(term201442, term201442.getClass(), "eventPoint", 467333323);
        setIntField(term201442, term201442.getClass(), "playedUserId1", -1350994762);
        setIntField(term201442, term201442.getClass(), "playedUserId2", 1766232836);
        setIntField(term201442, term201442.getClass(), "playedUserId3", 1922516908);
        setField(term201442, term201442.getClass(), "playedUserName1", "hUXNsbksVz");
        setField(term201442, term201442.getClass(), "playedUserName2", "yaqKkLfKHZ");
        setField(term201442, term201442.getClass(), "playedUserName3", "BPwZgWBNtv");
        setIntField(term201442, term201442.getClass(), "playedMusicLevel1", -110190362);
        setIntField(term201442, term201442.getClass(), "playedMusicLevel2", -325091);
        setIntField(term201442, term201442.getClass(), "playedMusicLevel3", 1574153232);
        setIntField(term201442, term201442.getClass(), "cardId1", -1460192568);
        setIntField(term201442, term201442.getClass(), "cardId2", 442946166);
        setIntField(term201442, term201442.getClass(), "cardId3", -1289046671);
        setIntField(term201442, term201442.getClass(), "cardLevel1", 1924768268);
        setIntField(term201442, term201442.getClass(), "cardLevel2", 675170256);
        setIntField(term201442, term201442.getClass(), "cardLevel3", 1387462542);
        setIntField(term201442, term201442.getClass(), "cardAttack1", -634135757);
        setIntField(term201442, term201442.getClass(), "cardAttack2", -456013445);
        setIntField(term201442, term201442.getClass(), "cardAttack3", 597371734);
        setIntField(term201442, term201442.getClass(), "bossCharaId", 365652868);
        setIntField(term201442, term201442.getClass(), "bossLevel", 1943076101);
        setIntField(term201442, term201442.getClass(), "bossAttribute", 2049221621);
        setIntField(term201442, term201442.getClass(), "clearStatus", -689247368);
        setIntField(term201442, term201442.getClass(), "techScore", -868439065);
        setIntField(term201442, term201442.getClass(), "techScoreRank", 246432144);
        setIntField(term201442, term201442.getClass(), "battleScore", -151088069);
        setIntField(term201442, term201442.getClass(), "battleScoreRank", 1422097505);
        setIntField(term201442, term201442.getClass(), "platinumScore", 1068387503);
        setIntField(term201442, term201442.getClass(), "maxCombo", 935204519);
        setIntField(term201442, term201442.getClass(), "judgeMiss", -762101877);
        setIntField(term201442, term201442.getClass(), "judgeHit", -890918634);
        setIntField(term201442, term201442.getClass(), "judgeBreak", -1556937802);
        setIntField(term201442, term201442.getClass(), "judgeCriticalBreak", 427119020);
        setIntField(term201442, term201442.getClass(), "rateTap", -1654312906);
        setIntField(term201442, term201442.getClass(), "rateHold", 1893614703);
        setIntField(term201442, term201442.getClass(), "rateFlick", -1482414233);
        setIntField(term201442, term201442.getClass(), "rateSideTap", -647597518);
        setIntField(term201442, term201442.getClass(), "rateSideHold", 15502703);
        setIntField(term201442, term201442.getClass(), "bellCount", 2056971874);
        setIntField(term201442, term201442.getClass(), "totalBellCount", -642687820);
        setIntField(term201442, term201442.getClass(), "damageCount", -1340216604);
        setIntField(term201442, term201442.getClass(), "overDamage", -1135543196);
        setBooleanField(term201442, term201442.getClass(), "isTechNewRecord", false);
        setBooleanField(term201442, term201442.getClass(), "isBattleNewRecord", false);
        setBooleanField(term201442, term201442.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term201442, term201442.getClass(), "isFullCombo", false);
        setBooleanField(term201442, term201442.getClass(), "isFullBell", true);
        setBooleanField(term201442, term201442.getClass(), "isAllBreak", true);
        setIntField(term201442, term201442.getClass(), "playerRating", -1976125049);
        setIntField(term201442, term201442.getClass(), "battlePoint", 73969741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBossLevel", argTypes, term201442, args);
    }

};


