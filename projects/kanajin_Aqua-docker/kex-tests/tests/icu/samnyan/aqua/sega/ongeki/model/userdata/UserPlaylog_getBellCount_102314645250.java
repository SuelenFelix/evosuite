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

public class UserPlaylog_getBellCount_102314645250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212818;

    public UserPlaylog_getBellCount_102314645250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term212824 = new Long(6940486570215409900L);
        term212818 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term212820 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term212822 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term212838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212843 = newInstance(Class.forName("java.time.LocalTime"));
        Object term212848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212853 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term212818, term212818.getClass(), "id", 6208951224862982673L);
        setLongField(term212820, term212820.getClass(), "id", -268890584351402081L);
        setLongField(term212822, term212822.getClass(), "id", -978448106392119367L);
        setField(term212822, term212822.getClass(), "extId", term212824);
        setField(term212822, term212822.getClass(), "luid", "owHMQAOCOb");
        setIntField(term212839, term212839.getClass(), "year", 2024);
        setShortField(term212839, term212839.getClass(), "month", (short) 5);
        setShortField(term212839, term212839.getClass(), "day", (short) 7);
        setField(term212838, term212838.getClass(), "date", term212839);
        setByteField(term212843, term212843.getClass(), "hour", (byte) 11);
        setByteField(term212843, term212843.getClass(), "minute", (byte) 43);
        setByteField(term212843, term212843.getClass(), "second", (byte) 25);
        setIntField(term212843, term212843.getClass(), "nano", 863939499);
        setField(term212838, term212838.getClass(), "time", term212843);
        setField(term212822, term212822.getClass(), "registerTime", term212838);
        setIntField(term212849, term212849.getClass(), "year", 2024);
        setShortField(term212849, term212849.getClass(), "month", (short) 9);
        setShortField(term212849, term212849.getClass(), "day", (short) 7);
        setField(term212848, term212848.getClass(), "date", term212849);
        setByteField(term212853, term212853.getClass(), "hour", (byte) 10);
        setByteField(term212853, term212853.getClass(), "minute", (byte) 12);
        setByteField(term212853, term212853.getClass(), "second", (byte) 46);
        setIntField(term212853, term212853.getClass(), "nano", 856869732);
        setField(term212848, term212848.getClass(), "time", term212853);
        setField(term212822, term212822.getClass(), "accessTime", term212848);
        setField(term212820, term212820.getClass(), "card", term212822);
        setField(term212820, term212820.getClass(), "userName", "mwPpmhmgxe");
        setIntField(term212820, term212820.getClass(), "level", 1298254943);
        setIntField(term212820, term212820.getClass(), "reincarnationNum", 816808363);
        setLongField(term212820, term212820.getClass(), "exp", -3528336609655788551L);
        setLongField(term212820, term212820.getClass(), "point", 4816799479368554284L);
        setLongField(term212820, term212820.getClass(), "totalPoint", 3652673223683322909L);
        setIntField(term212820, term212820.getClass(), "playCount", 1297344752);
        setIntField(term212820, term212820.getClass(), "jewelCount", 2091257387);
        setIntField(term212820, term212820.getClass(), "totalJewelCount", 1262385462);
        setIntField(term212820, term212820.getClass(), "medalCount", 146198205);
        setIntField(term212820, term212820.getClass(), "playerRating", 1811207533);
        setIntField(term212820, term212820.getClass(), "highestRating", -1241224611);
        setIntField(term212820, term212820.getClass(), "battlePoint", 1661530764);
        setIntField(term212820, term212820.getClass(), "bestBattlePoint", -1244991565);
        setIntField(term212820, term212820.getClass(), "overDamageBattlePoint", -865604268);
        setBooleanField(term212820, term212820.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term212820, term212820.getClass(), "nameplateId", -629271467);
        setIntField(term212820, term212820.getClass(), "trophyId", -1485210649);
        setIntField(term212820, term212820.getClass(), "cardId", 343270861);
        setIntField(term212820, term212820.getClass(), "characterId", 408001246);
        setIntField(term212820, term212820.getClass(), "characterVoiceNo", -413564129);
        setIntField(term212820, term212820.getClass(), "tabSetting", -32548606);
        setIntField(term212820, term212820.getClass(), "tabSortSetting", 129009378);
        setIntField(term212820, term212820.getClass(), "cardCategorySetting", 1817148676);
        setIntField(term212820, term212820.getClass(), "cardSortSetting", 1276665124);
        setIntField(term212820, term212820.getClass(), "rivalScoreCategorySetting", 631763699);
        setIntField(term212820, term212820.getClass(), "playedTutorialBit", -2016696905);
        setIntField(term212820, term212820.getClass(), "firstTutorialCancelNum", 820644673);
        setLongField(term212820, term212820.getClass(), "sumTechHighScore", 6227673003320806424L);
        setLongField(term212820, term212820.getClass(), "sumTechBasicHighScore", -1484157229223168601L);
        setLongField(term212820, term212820.getClass(), "sumTechAdvancedHighScore", -6850104699394939381L);
        setLongField(term212820, term212820.getClass(), "sumTechExpertHighScore", 7427943646966776961L);
        setLongField(term212820, term212820.getClass(), "sumTechMasterHighScore", 8040374950080130138L);
        setLongField(term212820, term212820.getClass(), "sumTechLunaticHighScore", 7801123516239721316L);
        setLongField(term212820, term212820.getClass(), "sumBattleHighScore", 8021841383006833732L);
        setLongField(term212820, term212820.getClass(), "sumBattleBasicHighScore", 102470579642992799L);
        setLongField(term212820, term212820.getClass(), "sumBattleAdvancedHighScore", -862440733015005866L);
        setLongField(term212820, term212820.getClass(), "sumBattleExpertHighScore", -8233584794966246633L);
        setLongField(term212820, term212820.getClass(), "sumBattleMasterHighScore", 6005391128356452368L);
        setLongField(term212820, term212820.getClass(), "sumBattleLunaticHighScore", 6426040306923535246L);
        setField(term212820, term212820.getClass(), "eventWatchedDate", "AkTBlKrxZl");
        setField(term212820, term212820.getClass(), "cmEventWatchedDate", "JjTdvIrvPK");
        setField(term212820, term212820.getClass(), "firstGameId", "IPYNkBSSpi");
        setField(term212820, term212820.getClass(), "firstRomVersion", "jrAClCtfec");
        setField(term212820, term212820.getClass(), "firstDataVersion", "bsICeJRjzc");
        setField(term212820, term212820.getClass(), "firstPlayDate", "OGXxsmtsYU");
        setField(term212820, term212820.getClass(), "lastGameId", "mLKQCgJRhc");
        setField(term212820, term212820.getClass(), "lastRomVersion", "FBrppwmmNJ");
        setField(term212820, term212820.getClass(), "lastDataVersion", "CEhIgioAkj");
        setField(term212820, term212820.getClass(), "compatibleCmVersion", "neItQnzSgh");
        setField(term212820, term212820.getClass(), "lastPlayDate", "nOSnYvTIMh");
        setIntField(term212820, term212820.getClass(), "lastPlaceId", 1395411611);
        setField(term212820, term212820.getClass(), "lastPlaceName", "nlAaUzdWnd");
        setIntField(term212820, term212820.getClass(), "lastRegionId", 1535159183);
        setField(term212820, term212820.getClass(), "lastRegionName", "flQJpSTTxh");
        setIntField(term212820, term212820.getClass(), "lastAllNetId", 542305172);
        setField(term212820, term212820.getClass(), "lastClientId", "JyglsQuOkT");
        setIntField(term212820, term212820.getClass(), "lastUsedDeckId", 1880502684);
        setIntField(term212820, term212820.getClass(), "lastPlayMusicLevel", 1208089406);
        setIntField(term212820, term212820.getClass(), "lastEmoneyBrand", -822607091);
        setField(term212818, term212818.getClass(), "user", term212820);
        setIntField(term212818, term212818.getClass(), "sortNumber", -1404356844);
        setIntField(term212818, term212818.getClass(), "placeId", 1214654693);
        setField(term212818, term212818.getClass(), "placeName", "zBTpnippXR");
        setField(term212818, term212818.getClass(), "playDate", "xGyaHdnzGM");
        setField(term212818, term212818.getClass(), "userPlayDate", "wbRekMnfmr");
        setIntField(term212818, term212818.getClass(), "musicId", -1144368319);
        setIntField(term212818, term212818.getClass(), "level", -1299647512);
        setIntField(term212818, term212818.getClass(), "playKind", -738749379);
        setIntField(term212818, term212818.getClass(), "eventId", 2067337022);
        setField(term212818, term212818.getClass(), "eventName", "hgaQCYedRy");
        setIntField(term212818, term212818.getClass(), "eventPoint", -462097537);
        setIntField(term212818, term212818.getClass(), "playedUserId1", 1791338762);
        setIntField(term212818, term212818.getClass(), "playedUserId2", 1852645839);
        setIntField(term212818, term212818.getClass(), "playedUserId3", 439157981);
        setField(term212818, term212818.getClass(), "playedUserName1", "OrqIIvDFfM");
        setField(term212818, term212818.getClass(), "playedUserName2", "dmTuManhEg");
        setField(term212818, term212818.getClass(), "playedUserName3", "fkGbNMnCKx");
        setIntField(term212818, term212818.getClass(), "playedMusicLevel1", 2026803446);
        setIntField(term212818, term212818.getClass(), "playedMusicLevel2", -1060834778);
        setIntField(term212818, term212818.getClass(), "playedMusicLevel3", 1424979936);
        setIntField(term212818, term212818.getClass(), "cardId1", 1913639183);
        setIntField(term212818, term212818.getClass(), "cardId2", -2065117323);
        setIntField(term212818, term212818.getClass(), "cardId3", 1455954533);
        setIntField(term212818, term212818.getClass(), "cardLevel1", 596927400);
        setIntField(term212818, term212818.getClass(), "cardLevel2", 717640575);
        setIntField(term212818, term212818.getClass(), "cardLevel3", 1377342355);
        setIntField(term212818, term212818.getClass(), "cardAttack1", 303367492);
        setIntField(term212818, term212818.getClass(), "cardAttack2", -1689842535);
        setIntField(term212818, term212818.getClass(), "cardAttack3", 1550009784);
        setIntField(term212818, term212818.getClass(), "bossCharaId", -1322057757);
        setIntField(term212818, term212818.getClass(), "bossLevel", 106608060);
        setIntField(term212818, term212818.getClass(), "bossAttribute", -97528141);
        setIntField(term212818, term212818.getClass(), "clearStatus", 103420135);
        setIntField(term212818, term212818.getClass(), "techScore", 998281573);
        setIntField(term212818, term212818.getClass(), "techScoreRank", 1538565026);
        setIntField(term212818, term212818.getClass(), "battleScore", 1510446613);
        setIntField(term212818, term212818.getClass(), "battleScoreRank", -591217691);
        setIntField(term212818, term212818.getClass(), "platinumScore", -1436479682);
        setIntField(term212818, term212818.getClass(), "maxCombo", -87850160);
        setIntField(term212818, term212818.getClass(), "judgeMiss", 2100422614);
        setIntField(term212818, term212818.getClass(), "judgeHit", 95434101);
        setIntField(term212818, term212818.getClass(), "judgeBreak", 1578254763);
        setIntField(term212818, term212818.getClass(), "judgeCriticalBreak", -1197972603);
        setIntField(term212818, term212818.getClass(), "rateTap", 82035733);
        setIntField(term212818, term212818.getClass(), "rateHold", -815104311);
        setIntField(term212818, term212818.getClass(), "rateFlick", -323574733);
        setIntField(term212818, term212818.getClass(), "rateSideTap", -1600567927);
        setIntField(term212818, term212818.getClass(), "rateSideHold", -1051157170);
        setIntField(term212818, term212818.getClass(), "bellCount", 1267890763);
        setIntField(term212818, term212818.getClass(), "totalBellCount", -354908388);
        setIntField(term212818, term212818.getClass(), "damageCount", -1823173740);
        setIntField(term212818, term212818.getClass(), "overDamage", 711565551);
        setBooleanField(term212818, term212818.getClass(), "isTechNewRecord", false);
        setBooleanField(term212818, term212818.getClass(), "isBattleNewRecord", false);
        setBooleanField(term212818, term212818.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term212818, term212818.getClass(), "isFullCombo", true);
        setBooleanField(term212818, term212818.getClass(), "isFullBell", false);
        setBooleanField(term212818, term212818.getClass(), "isAllBreak", true);
        setIntField(term212818, term212818.getClass(), "playerRating", 1808622233);
        setIntField(term212818, term212818.getClass(), "battlePoint", -1854319585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBellCount", argTypes, term212818, args);
    }

};


