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

public class UserOption_getJudgeBreak_137362220731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322773;

    public UserOption_getJudgeBreak_137362220731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term322779 = new Long(-8172564209423941839L);
        term322773 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term322775 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term322777 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term322793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322798 = newInstance(Class.forName("java.time.LocalTime"));
        Object term322803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term322804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term322808 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term322773, term322773.getClass(), "id", 1225075029688847926L);
        setLongField(term322775, term322775.getClass(), "id", 6108095745316157028L);
        setLongField(term322777, term322777.getClass(), "id", -39232420536309701L);
        setField(term322777, term322777.getClass(), "extId", term322779);
        setField(term322777, term322777.getClass(), "luid", "zNUVRDLvTS");
        setIntField(term322794, term322794.getClass(), "year", 2011);
        setShortField(term322794, term322794.getClass(), "month", (short) 5);
        setShortField(term322794, term322794.getClass(), "day", (short) 30);
        setField(term322793, term322793.getClass(), "date", term322794);
        setByteField(term322798, term322798.getClass(), "hour", (byte) 9);
        setByteField(term322798, term322798.getClass(), "minute", (byte) 57);
        setByteField(term322798, term322798.getClass(), "second", (byte) 16);
        setIntField(term322798, term322798.getClass(), "nano", 713626651);
        setField(term322793, term322793.getClass(), "time", term322798);
        setField(term322777, term322777.getClass(), "registerTime", term322793);
        setIntField(term322804, term322804.getClass(), "year", 2025);
        setShortField(term322804, term322804.getClass(), "month", (short) 6);
        setShortField(term322804, term322804.getClass(), "day", (short) 6);
        setField(term322803, term322803.getClass(), "date", term322804);
        setByteField(term322808, term322808.getClass(), "hour", (byte) 11);
        setByteField(term322808, term322808.getClass(), "minute", (byte) 28);
        setByteField(term322808, term322808.getClass(), "second", (byte) 1);
        setIntField(term322808, term322808.getClass(), "nano", 731901784);
        setField(term322803, term322803.getClass(), "time", term322808);
        setField(term322777, term322777.getClass(), "accessTime", term322803);
        setField(term322775, term322775.getClass(), "card", term322777);
        setField(term322775, term322775.getClass(), "userName", "ufNMvnPbTE");
        setIntField(term322775, term322775.getClass(), "level", -1590633148);
        setIntField(term322775, term322775.getClass(), "reincarnationNum", -38190522);
        setLongField(term322775, term322775.getClass(), "exp", 1872215028544652775L);
        setLongField(term322775, term322775.getClass(), "point", -1325816131866300958L);
        setLongField(term322775, term322775.getClass(), "totalPoint", 4093876507671096130L);
        setIntField(term322775, term322775.getClass(), "playCount", -2053739914);
        setIntField(term322775, term322775.getClass(), "jewelCount", -954895502);
        setIntField(term322775, term322775.getClass(), "totalJewelCount", -286306732);
        setIntField(term322775, term322775.getClass(), "medalCount", -1837452912);
        setIntField(term322775, term322775.getClass(), "playerRating", 1752149285);
        setIntField(term322775, term322775.getClass(), "highestRating", -391897865);
        setIntField(term322775, term322775.getClass(), "battlePoint", -967150129);
        setIntField(term322775, term322775.getClass(), "bestBattlePoint", -1298477574);
        setIntField(term322775, term322775.getClass(), "overDamageBattlePoint", 2070493463);
        setBooleanField(term322775, term322775.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term322775, term322775.getClass(), "nameplateId", -1515723538);
        setIntField(term322775, term322775.getClass(), "trophyId", 1811430671);
        setIntField(term322775, term322775.getClass(), "cardId", 301560824);
        setIntField(term322775, term322775.getClass(), "characterId", -1830244942);
        setIntField(term322775, term322775.getClass(), "characterVoiceNo", -2054929667);
        setIntField(term322775, term322775.getClass(), "tabSetting", 1547208430);
        setIntField(term322775, term322775.getClass(), "tabSortSetting", 2143332451);
        setIntField(term322775, term322775.getClass(), "cardCategorySetting", 1883382194);
        setIntField(term322775, term322775.getClass(), "cardSortSetting", 1618154899);
        setIntField(term322775, term322775.getClass(), "rivalScoreCategorySetting", 1123777726);
        setIntField(term322775, term322775.getClass(), "playedTutorialBit", 2091291733);
        setIntField(term322775, term322775.getClass(), "firstTutorialCancelNum", -229688515);
        setLongField(term322775, term322775.getClass(), "sumTechHighScore", 6153486540537084543L);
        setLongField(term322775, term322775.getClass(), "sumTechBasicHighScore", 7579502619409618039L);
        setLongField(term322775, term322775.getClass(), "sumTechAdvancedHighScore", 1756680028979522951L);
        setLongField(term322775, term322775.getClass(), "sumTechExpertHighScore", 1373534947843575011L);
        setLongField(term322775, term322775.getClass(), "sumTechMasterHighScore", -4903842086766010214L);
        setLongField(term322775, term322775.getClass(), "sumTechLunaticHighScore", 6154381257291402471L);
        setLongField(term322775, term322775.getClass(), "sumBattleHighScore", 8355249531722250690L);
        setLongField(term322775, term322775.getClass(), "sumBattleBasicHighScore", -6089994223620825142L);
        setLongField(term322775, term322775.getClass(), "sumBattleAdvancedHighScore", -2897875130719347203L);
        setLongField(term322775, term322775.getClass(), "sumBattleExpertHighScore", -4491101948143402018L);
        setLongField(term322775, term322775.getClass(), "sumBattleMasterHighScore", 815724084430178296L);
        setLongField(term322775, term322775.getClass(), "sumBattleLunaticHighScore", -4769786730721892128L);
        setField(term322775, term322775.getClass(), "eventWatchedDate", "FRivlXGnKH");
        setField(term322775, term322775.getClass(), "cmEventWatchedDate", "dLgtXLerhm");
        setField(term322775, term322775.getClass(), "firstGameId", "votTVjaqAV");
        setField(term322775, term322775.getClass(), "firstRomVersion", "vLMczsXock");
        setField(term322775, term322775.getClass(), "firstDataVersion", "KhzQWjoXDm");
        setField(term322775, term322775.getClass(), "firstPlayDate", "YbdVnarZPo");
        setField(term322775, term322775.getClass(), "lastGameId", "xQLVFxgreg");
        setField(term322775, term322775.getClass(), "lastRomVersion", "UaSVQkbVIa");
        setField(term322775, term322775.getClass(), "lastDataVersion", "lpDISjhNfl");
        setField(term322775, term322775.getClass(), "compatibleCmVersion", "eRqFPwFbQq");
        setField(term322775, term322775.getClass(), "lastPlayDate", "XRguuoyFal");
        setIntField(term322775, term322775.getClass(), "lastPlaceId", 1508629108);
        setField(term322775, term322775.getClass(), "lastPlaceName", "bqQfYHrpCv");
        setIntField(term322775, term322775.getClass(), "lastRegionId", -402966917);
        setField(term322775, term322775.getClass(), "lastRegionName", "AJvPAaMMEr");
        setIntField(term322775, term322775.getClass(), "lastAllNetId", -117908649);
        setField(term322775, term322775.getClass(), "lastClientId", "aaccfTmePM");
        setIntField(term322775, term322775.getClass(), "lastUsedDeckId", -791202508);
        setIntField(term322775, term322775.getClass(), "lastPlayMusicLevel", -500733068);
        setIntField(term322775, term322775.getClass(), "lastEmoneyBrand", 741028419);
        setField(term322773, term322773.getClass(), "user", term322775);
        setIntField(term322773, term322773.getClass(), "optionSet", -1299927106);
        setIntField(term322773, term322773.getClass(), "speed", -1629395509);
        setIntField(term322773, term322773.getClass(), "mirror", 1083982722);
        setIntField(term322773, term322773.getClass(), "judgeTiming", -1101836538);
        setIntField(term322773, term322773.getClass(), "judgeAdjustment", -1916712623);
        setIntField(term322773, term322773.getClass(), "abort", 2140215899);
        setIntField(term322773, term322773.getClass(), "stealthField", -1668575256);
        setIntField(term322773, term322773.getClass(), "tapSound", 1599291001);
        setIntField(term322773, term322773.getClass(), "volGuide", -472341969);
        setIntField(term322773, term322773.getClass(), "volAll", 331537526);
        setIntField(term322773, term322773.getClass(), "volTap", 2071433680);
        setIntField(term322773, term322773.getClass(), "volCrTap", 1943446095);
        setIntField(term322773, term322773.getClass(), "volHold", 1652858351);
        setIntField(term322773, term322773.getClass(), "volSide", -913279940);
        setIntField(term322773, term322773.getClass(), "volFlick", 870323209);
        setIntField(term322773, term322773.getClass(), "volBell", -1190049621);
        setIntField(term322773, term322773.getClass(), "volEnemy", 1903492873);
        setIntField(term322773, term322773.getClass(), "volSkill", -1822278676);
        setIntField(term322773, term322773.getClass(), "volDamage", -718669557);
        setIntField(term322773, term322773.getClass(), "colorField", 1872640975);
        setIntField(term322773, term322773.getClass(), "colorLaneBright", 1834274419);
        setIntField(term322773, term322773.getClass(), "colorWallBright", -1484154691);
        setIntField(term322773, term322773.getClass(), "colorLane", -1067244232);
        setIntField(term322773, term322773.getClass(), "colorSide", 1511233817);
        setIntField(term322773, term322773.getClass(), "effectDamage", -1597236849);
        setIntField(term322773, term322773.getClass(), "effectPos", -590762770);
        setIntField(term322773, term322773.getClass(), "judgeDisp", 1625573732);
        setIntField(term322773, term322773.getClass(), "judgePos", -544709840);
        setIntField(term322773, term322773.getClass(), "judgeBreak", 306522691);
        setIntField(term322773, term322773.getClass(), "judgeHit", 1894815516);
        setIntField(term322773, term322773.getClass(), "platinumBreakDisp", -1545186921);
        setIntField(term322773, term322773.getClass(), "judgeCriticalBreak", 1281934202);
        setIntField(term322773, term322773.getClass(), "matching", -1073046167);
        setIntField(term322773, term322773.getClass(), "dispPlayerLv", 99930835);
        setIntField(term322773, term322773.getClass(), "dispRating", -2093384687);
        setIntField(term322773, term322773.getClass(), "dispBP", 281571025);
        setIntField(term322773, term322773.getClass(), "headphone", 499514218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeBreak", argTypes, term322773, args);
    }

};


