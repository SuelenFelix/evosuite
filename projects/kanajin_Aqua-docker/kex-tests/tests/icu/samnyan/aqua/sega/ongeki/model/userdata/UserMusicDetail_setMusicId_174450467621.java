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

public class UserMusicDetail_setMusicId_174450467621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413416;
     Object term413697;

    public UserMusicDetail_setMusicId_174450467621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term413422 = new Long(-2341942457089205755L);
        term413416 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term413418 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term413420 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term413436 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term413437 = newInstance(Class.forName("java.time.LocalDate"));
        Object term413441 = newInstance(Class.forName("java.time.LocalTime"));
        Object term413446 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term413447 = newInstance(Class.forName("java.time.LocalDate"));
        Object term413451 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term413416, term413416.getClass(), "id", -5143363334762101705L);
        setLongField(term413418, term413418.getClass(), "id", -8714889971914652724L);
        setLongField(term413420, term413420.getClass(), "id", 1633373661844055017L);
        setField(term413420, term413420.getClass(), "extId", term413422);
        setField(term413420, term413420.getClass(), "luid", "oIYACzsZpO");
        setIntField(term413437, term413437.getClass(), "year", 2010);
        setShortField(term413437, term413437.getClass(), "month", (short) 4);
        setShortField(term413437, term413437.getClass(), "day", (short) 28);
        setField(term413436, term413436.getClass(), "date", term413437);
        setByteField(term413441, term413441.getClass(), "hour", (byte) 7);
        setByteField(term413441, term413441.getClass(), "minute", (byte) 16);
        setByteField(term413441, term413441.getClass(), "second", (byte) 45);
        setIntField(term413441, term413441.getClass(), "nano", 525398860);
        setField(term413436, term413436.getClass(), "time", term413441);
        setField(term413420, term413420.getClass(), "registerTime", term413436);
        setIntField(term413447, term413447.getClass(), "year", 2020);
        setShortField(term413447, term413447.getClass(), "month", (short) 2);
        setShortField(term413447, term413447.getClass(), "day", (short) 7);
        setField(term413446, term413446.getClass(), "date", term413447);
        setByteField(term413451, term413451.getClass(), "hour", (byte) 14);
        setByteField(term413451, term413451.getClass(), "minute", (byte) 41);
        setByteField(term413451, term413451.getClass(), "second", (byte) 9);
        setIntField(term413451, term413451.getClass(), "nano", 794817926);
        setField(term413446, term413446.getClass(), "time", term413451);
        setField(term413420, term413420.getClass(), "accessTime", term413446);
        setField(term413418, term413418.getClass(), "card", term413420);
        setField(term413418, term413418.getClass(), "userName", "RfgguGmlQP");
        setIntField(term413418, term413418.getClass(), "level", 709048916);
        setIntField(term413418, term413418.getClass(), "reincarnationNum", -13691942);
        setLongField(term413418, term413418.getClass(), "exp", -1855650083844392558L);
        setLongField(term413418, term413418.getClass(), "point", 2045289215142939095L);
        setLongField(term413418, term413418.getClass(), "totalPoint", -1945624552077318241L);
        setIntField(term413418, term413418.getClass(), "playCount", -1079898451);
        setIntField(term413418, term413418.getClass(), "jewelCount", 260118108);
        setIntField(term413418, term413418.getClass(), "totalJewelCount", -1275215601);
        setIntField(term413418, term413418.getClass(), "medalCount", 596018355);
        setIntField(term413418, term413418.getClass(), "playerRating", 123052389);
        setIntField(term413418, term413418.getClass(), "highestRating", -1320565406);
        setIntField(term413418, term413418.getClass(), "battlePoint", 1749882864);
        setIntField(term413418, term413418.getClass(), "bestBattlePoint", -541344581);
        setIntField(term413418, term413418.getClass(), "overDamageBattlePoint", 1731616889);
        setBooleanField(term413418, term413418.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term413418, term413418.getClass(), "nameplateId", 2145418544);
        setIntField(term413418, term413418.getClass(), "trophyId", -1673180075);
        setIntField(term413418, term413418.getClass(), "cardId", 181576856);
        setIntField(term413418, term413418.getClass(), "characterId", -1680803295);
        setIntField(term413418, term413418.getClass(), "characterVoiceNo", -1049260222);
        setIntField(term413418, term413418.getClass(), "tabSetting", 1035047010);
        setIntField(term413418, term413418.getClass(), "tabSortSetting", 521595604);
        setIntField(term413418, term413418.getClass(), "cardCategorySetting", 1536684136);
        setIntField(term413418, term413418.getClass(), "cardSortSetting", -1159948740);
        setIntField(term413418, term413418.getClass(), "rivalScoreCategorySetting", -1895884504);
        setIntField(term413418, term413418.getClass(), "playedTutorialBit", 1105260860);
        setIntField(term413418, term413418.getClass(), "firstTutorialCancelNum", 879107563);
        setLongField(term413418, term413418.getClass(), "sumTechHighScore", 6172264615116267241L);
        setLongField(term413418, term413418.getClass(), "sumTechBasicHighScore", -1108691377032791531L);
        setLongField(term413418, term413418.getClass(), "sumTechAdvancedHighScore", 5788616445570179624L);
        setLongField(term413418, term413418.getClass(), "sumTechExpertHighScore", -4411005681079727824L);
        setLongField(term413418, term413418.getClass(), "sumTechMasterHighScore", 4673501956274308665L);
        setLongField(term413418, term413418.getClass(), "sumTechLunaticHighScore", -3865403292128109469L);
        setLongField(term413418, term413418.getClass(), "sumBattleHighScore", -7289935152631471322L);
        setLongField(term413418, term413418.getClass(), "sumBattleBasicHighScore", -5350602707257508927L);
        setLongField(term413418, term413418.getClass(), "sumBattleAdvancedHighScore", -3995764169282109340L);
        setLongField(term413418, term413418.getClass(), "sumBattleExpertHighScore", 246554790335214494L);
        setLongField(term413418, term413418.getClass(), "sumBattleMasterHighScore", 3651035925125348113L);
        setLongField(term413418, term413418.getClass(), "sumBattleLunaticHighScore", -3453754188487725450L);
        setField(term413418, term413418.getClass(), "eventWatchedDate", "mdcebAEBOw");
        setField(term413418, term413418.getClass(), "cmEventWatchedDate", "IMxWalezey");
        setField(term413418, term413418.getClass(), "firstGameId", "tiOvrrRKwG");
        setField(term413418, term413418.getClass(), "firstRomVersion", "eNkxChmMEp");
        setField(term413418, term413418.getClass(), "firstDataVersion", "JXKzRDhlGr");
        setField(term413418, term413418.getClass(), "firstPlayDate", "kBxHuegeml");
        setField(term413418, term413418.getClass(), "lastGameId", "GMhjgWjCLu");
        setField(term413418, term413418.getClass(), "lastRomVersion", "eMhogYbDDv");
        setField(term413418, term413418.getClass(), "lastDataVersion", "sLgnHfeImy");
        setField(term413418, term413418.getClass(), "compatibleCmVersion", "xxZnzCbdrb");
        setField(term413418, term413418.getClass(), "lastPlayDate", "MyhHbUdrPa");
        setIntField(term413418, term413418.getClass(), "lastPlaceId", -1609099933);
        setField(term413418, term413418.getClass(), "lastPlaceName", "AfCmdwVEhd");
        setIntField(term413418, term413418.getClass(), "lastRegionId", -1267385597);
        setField(term413418, term413418.getClass(), "lastRegionName", "WueoPTOllJ");
        setIntField(term413418, term413418.getClass(), "lastAllNetId", -1305756821);
        setField(term413418, term413418.getClass(), "lastClientId", "hMvcxPGifk");
        setIntField(term413418, term413418.getClass(), "lastUsedDeckId", -1642183968);
        setIntField(term413418, term413418.getClass(), "lastPlayMusicLevel", 1386552143);
        setIntField(term413418, term413418.getClass(), "lastEmoneyBrand", 1151887427);
        setField(term413416, term413416.getClass(), "user", term413418);
        setIntField(term413416, term413416.getClass(), "musicId", -1853705567);
        setIntField(term413416, term413416.getClass(), "level", -2058887590);
        setIntField(term413416, term413416.getClass(), "playCount", -1808737314);
        setIntField(term413416, term413416.getClass(), "techScoreMax", -1932790259);
        setIntField(term413416, term413416.getClass(), "techScoreRank", -1410903336);
        setIntField(term413416, term413416.getClass(), "battleScoreMax", -1479944246);
        setIntField(term413416, term413416.getClass(), "battleScoreRank", -200968852);
        setIntField(term413416, term413416.getClass(), "maxComboCount", 1163971459);
        setIntField(term413416, term413416.getClass(), "maxOverKill", 79435033);
        setIntField(term413416, term413416.getClass(), "maxTeamOverKill", -2132296503);
        setBooleanField(term413416, term413416.getClass(), "isFullBell", false);
        setBooleanField(term413416, term413416.getClass(), "isFullCombo", false);
        setBooleanField(term413416, term413416.getClass(), "isAllBreake", true);
        setBooleanField(term413416, term413416.getClass(), "isLock", true);
        setIntField(term413416, term413416.getClass(), "clearStatus", -1206889152);
        setBooleanField(term413416, term413416.getClass(), "isStoryWatched", false);
        term413697 = new Integer(989683490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term413697;
        callMethod(klass, "setMusicId", argTypes, term413416, args);
    }

};


