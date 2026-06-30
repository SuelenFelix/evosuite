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
import java.lang.Integer;

public class UserMusicDetail_setTechScoreMax_175403128024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414745;
     Object term415026;

    public UserMusicDetail_setTechScoreMax_175403128024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term414751 = new Long(5391189846186870864L);
        term414745 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term414747 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term414749 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term414765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term414766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term414775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term414776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term414780 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term414745, term414745.getClass(), "id", -2791090143717800753L);
        setLongField(term414747, term414747.getClass(), "id", 3153460847101249077L);
        setLongField(term414749, term414749.getClass(), "id", -978653044574454752L);
        setField(term414749, term414749.getClass(), "extId", term414751);
        setField(term414749, term414749.getClass(), "luid", "lBbpqgzxDb");
        setIntField(term414766, term414766.getClass(), "year", 2022);
        setShortField(term414766, term414766.getClass(), "month", (short) 6);
        setShortField(term414766, term414766.getClass(), "day", (short) 24);
        setField(term414765, term414765.getClass(), "date", term414766);
        setByteField(term414770, term414770.getClass(), "hour", (byte) 0);
        setByteField(term414770, term414770.getClass(), "minute", (byte) 49);
        setByteField(term414770, term414770.getClass(), "second", (byte) 35);
        setIntField(term414770, term414770.getClass(), "nano", 108272185);
        setField(term414765, term414765.getClass(), "time", term414770);
        setField(term414749, term414749.getClass(), "registerTime", term414765);
        setIntField(term414776, term414776.getClass(), "year", 2022);
        setShortField(term414776, term414776.getClass(), "month", (short) 4);
        setShortField(term414776, term414776.getClass(), "day", (short) 10);
        setField(term414775, term414775.getClass(), "date", term414776);
        setByteField(term414780, term414780.getClass(), "hour", (byte) 21);
        setByteField(term414780, term414780.getClass(), "minute", (byte) 19);
        setByteField(term414780, term414780.getClass(), "second", (byte) 36);
        setIntField(term414780, term414780.getClass(), "nano", 925743416);
        setField(term414775, term414775.getClass(), "time", term414780);
        setField(term414749, term414749.getClass(), "accessTime", term414775);
        setField(term414747, term414747.getClass(), "card", term414749);
        setField(term414747, term414747.getClass(), "userName", "cierHVWUUb");
        setIntField(term414747, term414747.getClass(), "level", -139552797);
        setIntField(term414747, term414747.getClass(), "reincarnationNum", -80663945);
        setLongField(term414747, term414747.getClass(), "exp", -8917087204928412931L);
        setLongField(term414747, term414747.getClass(), "point", 6597146713020316618L);
        setLongField(term414747, term414747.getClass(), "totalPoint", 5887033377092158499L);
        setIntField(term414747, term414747.getClass(), "playCount", 456788129);
        setIntField(term414747, term414747.getClass(), "jewelCount", 514849340);
        setIntField(term414747, term414747.getClass(), "totalJewelCount", 1442034697);
        setIntField(term414747, term414747.getClass(), "medalCount", 955334177);
        setIntField(term414747, term414747.getClass(), "playerRating", -526625130);
        setIntField(term414747, term414747.getClass(), "highestRating", -1302212664);
        setIntField(term414747, term414747.getClass(), "battlePoint", 1993555888);
        setIntField(term414747, term414747.getClass(), "bestBattlePoint", -1460884772);
        setIntField(term414747, term414747.getClass(), "overDamageBattlePoint", -1531270804);
        setBooleanField(term414747, term414747.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term414747, term414747.getClass(), "nameplateId", -551373922);
        setIntField(term414747, term414747.getClass(), "trophyId", -134643584);
        setIntField(term414747, term414747.getClass(), "cardId", -452429011);
        setIntField(term414747, term414747.getClass(), "characterId", 709991768);
        setIntField(term414747, term414747.getClass(), "characterVoiceNo", 1044554229);
        setIntField(term414747, term414747.getClass(), "tabSetting", -1956369756);
        setIntField(term414747, term414747.getClass(), "tabSortSetting", 1235137274);
        setIntField(term414747, term414747.getClass(), "cardCategorySetting", 1913471718);
        setIntField(term414747, term414747.getClass(), "cardSortSetting", 1453438669);
        setIntField(term414747, term414747.getClass(), "rivalScoreCategorySetting", 902495678);
        setIntField(term414747, term414747.getClass(), "playedTutorialBit", -839099535);
        setIntField(term414747, term414747.getClass(), "firstTutorialCancelNum", -720173301);
        setLongField(term414747, term414747.getClass(), "sumTechHighScore", -1621498198706663186L);
        setLongField(term414747, term414747.getClass(), "sumTechBasicHighScore", 2029072485459874752L);
        setLongField(term414747, term414747.getClass(), "sumTechAdvancedHighScore", 2094996783422911349L);
        setLongField(term414747, term414747.getClass(), "sumTechExpertHighScore", 76292116086299279L);
        setLongField(term414747, term414747.getClass(), "sumTechMasterHighScore", 1458473892194845270L);
        setLongField(term414747, term414747.getClass(), "sumTechLunaticHighScore", 663622310897180625L);
        setLongField(term414747, term414747.getClass(), "sumBattleHighScore", -3801894761384214508L);
        setLongField(term414747, term414747.getClass(), "sumBattleBasicHighScore", 266424019302589296L);
        setLongField(term414747, term414747.getClass(), "sumBattleAdvancedHighScore", -1098432253190286454L);
        setLongField(term414747, term414747.getClass(), "sumBattleExpertHighScore", -5012780319335557529L);
        setLongField(term414747, term414747.getClass(), "sumBattleMasterHighScore", -3240402850180558614L);
        setLongField(term414747, term414747.getClass(), "sumBattleLunaticHighScore", 3933859901289739616L);
        setField(term414747, term414747.getClass(), "eventWatchedDate", "zNdjBIhTHe");
        setField(term414747, term414747.getClass(), "cmEventWatchedDate", "wwPIcdUdfn");
        setField(term414747, term414747.getClass(), "firstGameId", "DwADGGKhGV");
        setField(term414747, term414747.getClass(), "firstRomVersion", "AmBkDeKenP");
        setField(term414747, term414747.getClass(), "firstDataVersion", "pfgaDesPCm");
        setField(term414747, term414747.getClass(), "firstPlayDate", "fsNJUrMRQx");
        setField(term414747, term414747.getClass(), "lastGameId", "DWwIRwLaAz");
        setField(term414747, term414747.getClass(), "lastRomVersion", "NEDuNpZASn");
        setField(term414747, term414747.getClass(), "lastDataVersion", "pyMczJCzvt");
        setField(term414747, term414747.getClass(), "compatibleCmVersion", "oWsNlfkGKf");
        setField(term414747, term414747.getClass(), "lastPlayDate", "DRxDRENPhB");
        setIntField(term414747, term414747.getClass(), "lastPlaceId", 442103417);
        setField(term414747, term414747.getClass(), "lastPlaceName", "XFRGfTYaNV");
        setIntField(term414747, term414747.getClass(), "lastRegionId", -1413432037);
        setField(term414747, term414747.getClass(), "lastRegionName", "MythFsOKup");
        setIntField(term414747, term414747.getClass(), "lastAllNetId", 844753192);
        setField(term414747, term414747.getClass(), "lastClientId", "AQXaDrPUBi");
        setIntField(term414747, term414747.getClass(), "lastUsedDeckId", 616138874);
        setIntField(term414747, term414747.getClass(), "lastPlayMusicLevel", 320772700);
        setIntField(term414747, term414747.getClass(), "lastEmoneyBrand", -1846610137);
        setField(term414745, term414745.getClass(), "user", term414747);
        setIntField(term414745, term414745.getClass(), "musicId", -2056167292);
        setIntField(term414745, term414745.getClass(), "level", -1269305802);
        setIntField(term414745, term414745.getClass(), "playCount", -4397577);
        setIntField(term414745, term414745.getClass(), "techScoreMax", 604131363);
        setIntField(term414745, term414745.getClass(), "techScoreRank", 2015878239);
        setIntField(term414745, term414745.getClass(), "battleScoreMax", -1633971352);
        setIntField(term414745, term414745.getClass(), "battleScoreRank", -1855535070);
        setIntField(term414745, term414745.getClass(), "maxComboCount", 2097431572);
        setIntField(term414745, term414745.getClass(), "maxOverKill", 888560357);
        setIntField(term414745, term414745.getClass(), "maxTeamOverKill", 1064049778);
        setBooleanField(term414745, term414745.getClass(), "isFullBell", true);
        setBooleanField(term414745, term414745.getClass(), "isFullCombo", false);
        setBooleanField(term414745, term414745.getClass(), "isAllBreake", true);
        setBooleanField(term414745, term414745.getClass(), "isLock", false);
        setIntField(term414745, term414745.getClass(), "clearStatus", 53464217);
        setBooleanField(term414745, term414745.getClass(), "isStoryWatched", true);
        term415026 = new Integer(1983550462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term415026;
        callMethod(klass, "setTechScoreMax", argTypes, term414745, args);
    }

};


