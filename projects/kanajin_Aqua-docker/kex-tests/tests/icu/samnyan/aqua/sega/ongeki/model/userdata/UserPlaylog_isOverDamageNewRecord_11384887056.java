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

public class UserPlaylog_isOverDamageNewRecord_11384887056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216610;

    public UserPlaylog_isOverDamageNewRecord_11384887056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term216616 = new Long(-3565554762799701668L);
        term216610 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term216612 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term216614 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term216630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216635 = newInstance(Class.forName("java.time.LocalTime"));
        Object term216640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term216641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216645 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term216610, term216610.getClass(), "id", 7626275182194750265L);
        setLongField(term216612, term216612.getClass(), "id", 3909767097276933654L);
        setLongField(term216614, term216614.getClass(), "id", -1443149616140457580L);
        setField(term216614, term216614.getClass(), "extId", term216616);
        setField(term216614, term216614.getClass(), "luid", "aXKRWiZtNa");
        setIntField(term216631, term216631.getClass(), "year", 2024);
        setShortField(term216631, term216631.getClass(), "month", (short) 7);
        setShortField(term216631, term216631.getClass(), "day", (short) 15);
        setField(term216630, term216630.getClass(), "date", term216631);
        setByteField(term216635, term216635.getClass(), "hour", (byte) 14);
        setByteField(term216635, term216635.getClass(), "minute", (byte) 18);
        setByteField(term216635, term216635.getClass(), "second", (byte) 58);
        setIntField(term216635, term216635.getClass(), "nano", 537827095);
        setField(term216630, term216630.getClass(), "time", term216635);
        setField(term216614, term216614.getClass(), "registerTime", term216630);
        setIntField(term216641, term216641.getClass(), "year", 2025);
        setShortField(term216641, term216641.getClass(), "month", (short) 9);
        setShortField(term216641, term216641.getClass(), "day", (short) 18);
        setField(term216640, term216640.getClass(), "date", term216641);
        setByteField(term216645, term216645.getClass(), "hour", (byte) 9);
        setByteField(term216645, term216645.getClass(), "minute", (byte) 14);
        setByteField(term216645, term216645.getClass(), "second", (byte) 26);
        setIntField(term216645, term216645.getClass(), "nano", 567071659);
        setField(term216640, term216640.getClass(), "time", term216645);
        setField(term216614, term216614.getClass(), "accessTime", term216640);
        setField(term216612, term216612.getClass(), "card", term216614);
        setField(term216612, term216612.getClass(), "userName", "IvhFSqXGWI");
        setIntField(term216612, term216612.getClass(), "level", -1015606044);
        setIntField(term216612, term216612.getClass(), "reincarnationNum", 772442148);
        setLongField(term216612, term216612.getClass(), "exp", 8037116802229597692L);
        setLongField(term216612, term216612.getClass(), "point", -5611149132849899108L);
        setLongField(term216612, term216612.getClass(), "totalPoint", 3291346185553347924L);
        setIntField(term216612, term216612.getClass(), "playCount", -801236347);
        setIntField(term216612, term216612.getClass(), "jewelCount", 1672056052);
        setIntField(term216612, term216612.getClass(), "totalJewelCount", -980627332);
        setIntField(term216612, term216612.getClass(), "medalCount", 437346255);
        setIntField(term216612, term216612.getClass(), "playerRating", 2053260189);
        setIntField(term216612, term216612.getClass(), "highestRating", -2053852874);
        setIntField(term216612, term216612.getClass(), "battlePoint", -495359675);
        setIntField(term216612, term216612.getClass(), "bestBattlePoint", -384263579);
        setIntField(term216612, term216612.getClass(), "overDamageBattlePoint", 846361208);
        setBooleanField(term216612, term216612.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term216612, term216612.getClass(), "nameplateId", 1800799519);
        setIntField(term216612, term216612.getClass(), "trophyId", 100734387);
        setIntField(term216612, term216612.getClass(), "cardId", 654779093);
        setIntField(term216612, term216612.getClass(), "characterId", -2111377072);
        setIntField(term216612, term216612.getClass(), "characterVoiceNo", -983510285);
        setIntField(term216612, term216612.getClass(), "tabSetting", 515505845);
        setIntField(term216612, term216612.getClass(), "tabSortSetting", 2062061908);
        setIntField(term216612, term216612.getClass(), "cardCategorySetting", 52784804);
        setIntField(term216612, term216612.getClass(), "cardSortSetting", -1368391368);
        setIntField(term216612, term216612.getClass(), "rivalScoreCategorySetting", 1369129310);
        setIntField(term216612, term216612.getClass(), "playedTutorialBit", -780519895);
        setIntField(term216612, term216612.getClass(), "firstTutorialCancelNum", 137957762);
        setLongField(term216612, term216612.getClass(), "sumTechHighScore", 3971997283680673075L);
        setLongField(term216612, term216612.getClass(), "sumTechBasicHighScore", 7862186299051476140L);
        setLongField(term216612, term216612.getClass(), "sumTechAdvancedHighScore", 2438792678064435188L);
        setLongField(term216612, term216612.getClass(), "sumTechExpertHighScore", 3000898825884778616L);
        setLongField(term216612, term216612.getClass(), "sumTechMasterHighScore", -7525675331115095909L);
        setLongField(term216612, term216612.getClass(), "sumTechLunaticHighScore", -4684447831405489389L);
        setLongField(term216612, term216612.getClass(), "sumBattleHighScore", -1234944805975284573L);
        setLongField(term216612, term216612.getClass(), "sumBattleBasicHighScore", -2262970860436884733L);
        setLongField(term216612, term216612.getClass(), "sumBattleAdvancedHighScore", -5173367172520031696L);
        setLongField(term216612, term216612.getClass(), "sumBattleExpertHighScore", 1634750282436944257L);
        setLongField(term216612, term216612.getClass(), "sumBattleMasterHighScore", -6569625350734756817L);
        setLongField(term216612, term216612.getClass(), "sumBattleLunaticHighScore", -8480494695741080265L);
        setField(term216612, term216612.getClass(), "eventWatchedDate", "XtSNlvtLvB");
        setField(term216612, term216612.getClass(), "cmEventWatchedDate", "fNoIbYHFer");
        setField(term216612, term216612.getClass(), "firstGameId", "NbXrtSHLKQ");
        setField(term216612, term216612.getClass(), "firstRomVersion", "FLAHyvDmcn");
        setField(term216612, term216612.getClass(), "firstDataVersion", "ykqmQraXZT");
        setField(term216612, term216612.getClass(), "firstPlayDate", "yuvIUIQCMR");
        setField(term216612, term216612.getClass(), "lastGameId", "UiwzhuXDvB");
        setField(term216612, term216612.getClass(), "lastRomVersion", "LhpmrGuVxe");
        setField(term216612, term216612.getClass(), "lastDataVersion", "RcxoyfSpAy");
        setField(term216612, term216612.getClass(), "compatibleCmVersion", "JwsspZQNSy");
        setField(term216612, term216612.getClass(), "lastPlayDate", "VCSuECypfF");
        setIntField(term216612, term216612.getClass(), "lastPlaceId", -1051997267);
        setField(term216612, term216612.getClass(), "lastPlaceName", "VUlDErbXCX");
        setIntField(term216612, term216612.getClass(), "lastRegionId", -62396728);
        setField(term216612, term216612.getClass(), "lastRegionName", "vSTpfTsUuq");
        setIntField(term216612, term216612.getClass(), "lastAllNetId", -268599867);
        setField(term216612, term216612.getClass(), "lastClientId", "eqrBBqDbzA");
        setIntField(term216612, term216612.getClass(), "lastUsedDeckId", -1052701176);
        setIntField(term216612, term216612.getClass(), "lastPlayMusicLevel", 545101691);
        setIntField(term216612, term216612.getClass(), "lastEmoneyBrand", 1161229876);
        setField(term216610, term216610.getClass(), "user", term216612);
        setIntField(term216610, term216610.getClass(), "sortNumber", -960232938);
        setIntField(term216610, term216610.getClass(), "placeId", 164986407);
        setField(term216610, term216610.getClass(), "placeName", "WnqSummKgN");
        setField(term216610, term216610.getClass(), "playDate", "YlzFUaneLV");
        setField(term216610, term216610.getClass(), "userPlayDate", "njSAsYHICK");
        setIntField(term216610, term216610.getClass(), "musicId", 1508923050);
        setIntField(term216610, term216610.getClass(), "level", 1732773238);
        setIntField(term216610, term216610.getClass(), "playKind", -312812260);
        setIntField(term216610, term216610.getClass(), "eventId", -1403354454);
        setField(term216610, term216610.getClass(), "eventName", "qVwczDvPHZ");
        setIntField(term216610, term216610.getClass(), "eventPoint", 225390294);
        setIntField(term216610, term216610.getClass(), "playedUserId1", 627436431);
        setIntField(term216610, term216610.getClass(), "playedUserId2", -226488133);
        setIntField(term216610, term216610.getClass(), "playedUserId3", 2016800886);
        setField(term216610, term216610.getClass(), "playedUserName1", "YvPExFeAXl");
        setField(term216610, term216610.getClass(), "playedUserName2", "wUmFgUFRVc");
        setField(term216610, term216610.getClass(), "playedUserName3", "MLrlQPlgur");
        setIntField(term216610, term216610.getClass(), "playedMusicLevel1", 1306220321);
        setIntField(term216610, term216610.getClass(), "playedMusicLevel2", -925927013);
        setIntField(term216610, term216610.getClass(), "playedMusicLevel3", 560338899);
        setIntField(term216610, term216610.getClass(), "cardId1", 173805075);
        setIntField(term216610, term216610.getClass(), "cardId2", -1525849749);
        setIntField(term216610, term216610.getClass(), "cardId3", -1011327507);
        setIntField(term216610, term216610.getClass(), "cardLevel1", -378080115);
        setIntField(term216610, term216610.getClass(), "cardLevel2", 1202464107);
        setIntField(term216610, term216610.getClass(), "cardLevel3", -1327144256);
        setIntField(term216610, term216610.getClass(), "cardAttack1", -126708360);
        setIntField(term216610, term216610.getClass(), "cardAttack2", -1492561928);
        setIntField(term216610, term216610.getClass(), "cardAttack3", 14544336);
        setIntField(term216610, term216610.getClass(), "bossCharaId", 1884335890);
        setIntField(term216610, term216610.getClass(), "bossLevel", -848097424);
        setIntField(term216610, term216610.getClass(), "bossAttribute", 1737457363);
        setIntField(term216610, term216610.getClass(), "clearStatus", 72159811);
        setIntField(term216610, term216610.getClass(), "techScore", 1883446311);
        setIntField(term216610, term216610.getClass(), "techScoreRank", -1769314512);
        setIntField(term216610, term216610.getClass(), "battleScore", -1007583316);
        setIntField(term216610, term216610.getClass(), "battleScoreRank", -2097129486);
        setIntField(term216610, term216610.getClass(), "platinumScore", 906821588);
        setIntField(term216610, term216610.getClass(), "maxCombo", -1915430818);
        setIntField(term216610, term216610.getClass(), "judgeMiss", -1119861207);
        setIntField(term216610, term216610.getClass(), "judgeHit", 1746807042);
        setIntField(term216610, term216610.getClass(), "judgeBreak", 357981547);
        setIntField(term216610, term216610.getClass(), "judgeCriticalBreak", 426955084);
        setIntField(term216610, term216610.getClass(), "rateTap", -335419483);
        setIntField(term216610, term216610.getClass(), "rateHold", 1557694351);
        setIntField(term216610, term216610.getClass(), "rateFlick", 1469773425);
        setIntField(term216610, term216610.getClass(), "rateSideTap", -1873950815);
        setIntField(term216610, term216610.getClass(), "rateSideHold", 1580956926);
        setIntField(term216610, term216610.getClass(), "bellCount", 989244656);
        setIntField(term216610, term216610.getClass(), "totalBellCount", 1888105108);
        setIntField(term216610, term216610.getClass(), "damageCount", 507720504);
        setIntField(term216610, term216610.getClass(), "overDamage", 1565969836);
        setBooleanField(term216610, term216610.getClass(), "isTechNewRecord", false);
        setBooleanField(term216610, term216610.getClass(), "isBattleNewRecord", false);
        setBooleanField(term216610, term216610.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term216610, term216610.getClass(), "isFullCombo", false);
        setBooleanField(term216610, term216610.getClass(), "isFullBell", true);
        setBooleanField(term216610, term216610.getClass(), "isAllBreak", false);
        setIntField(term216610, term216610.getClass(), "playerRating", -1245521601);
        setIntField(term216610, term216610.getClass(), "battlePoint", 1500058331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOverDamageNewRecord", argTypes, term216610, args);
    }

};


