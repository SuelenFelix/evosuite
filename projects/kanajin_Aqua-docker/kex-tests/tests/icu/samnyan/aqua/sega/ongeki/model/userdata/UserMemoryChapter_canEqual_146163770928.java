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

public class UserMemoryChapter_canEqual_146163770928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401554;
     Object term401830;

    public UserMemoryChapter_canEqual_146163770928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term401560 = new Long(873013799050926004L);
        term401554 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term401556 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term401558 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term401574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401579 = newInstance(Class.forName("java.time.LocalTime"));
        Object term401584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401589 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term401554, term401554.getClass(), "id", 1412803437344527008L);
        setLongField(term401556, term401556.getClass(), "id", -9059703756960944121L);
        setLongField(term401558, term401558.getClass(), "id", -5820333289696299519L);
        setField(term401558, term401558.getClass(), "extId", term401560);
        setField(term401558, term401558.getClass(), "luid", "PMzNWyWNZu");
        setIntField(term401575, term401575.getClass(), "year", 2029);
        setShortField(term401575, term401575.getClass(), "month", (short) 11);
        setShortField(term401575, term401575.getClass(), "day", (short) 24);
        setField(term401574, term401574.getClass(), "date", term401575);
        setByteField(term401579, term401579.getClass(), "hour", (byte) 13);
        setByteField(term401579, term401579.getClass(), "minute", (byte) 15);
        setByteField(term401579, term401579.getClass(), "second", (byte) 7);
        setIntField(term401579, term401579.getClass(), "nano", 840237361);
        setField(term401574, term401574.getClass(), "time", term401579);
        setField(term401558, term401558.getClass(), "registerTime", term401574);
        setIntField(term401585, term401585.getClass(), "year", 2018);
        setShortField(term401585, term401585.getClass(), "month", (short) 5);
        setShortField(term401585, term401585.getClass(), "day", (short) 4);
        setField(term401584, term401584.getClass(), "date", term401585);
        setByteField(term401589, term401589.getClass(), "hour", (byte) 2);
        setByteField(term401589, term401589.getClass(), "minute", (byte) 42);
        setByteField(term401589, term401589.getClass(), "second", (byte) 14);
        setIntField(term401589, term401589.getClass(), "nano", 530846318);
        setField(term401584, term401584.getClass(), "time", term401589);
        setField(term401558, term401558.getClass(), "accessTime", term401584);
        setField(term401556, term401556.getClass(), "card", term401558);
        setField(term401556, term401556.getClass(), "userName", "GGPgHlZyam");
        setIntField(term401556, term401556.getClass(), "level", 47330822);
        setIntField(term401556, term401556.getClass(), "reincarnationNum", -385121258);
        setLongField(term401556, term401556.getClass(), "exp", -5365565718317650942L);
        setLongField(term401556, term401556.getClass(), "point", -6836919765491154407L);
        setLongField(term401556, term401556.getClass(), "totalPoint", -2200241182129794191L);
        setIntField(term401556, term401556.getClass(), "playCount", 831958329);
        setIntField(term401556, term401556.getClass(), "jewelCount", -70737914);
        setIntField(term401556, term401556.getClass(), "totalJewelCount", -487932911);
        setIntField(term401556, term401556.getClass(), "medalCount", -1234605371);
        setIntField(term401556, term401556.getClass(), "playerRating", -968587803);
        setIntField(term401556, term401556.getClass(), "highestRating", 825385628);
        setIntField(term401556, term401556.getClass(), "battlePoint", 1988025404);
        setIntField(term401556, term401556.getClass(), "bestBattlePoint", 1290034563);
        setIntField(term401556, term401556.getClass(), "overDamageBattlePoint", -1393593833);
        setBooleanField(term401556, term401556.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term401556, term401556.getClass(), "nameplateId", 707816321);
        setIntField(term401556, term401556.getClass(), "trophyId", 1109302203);
        setIntField(term401556, term401556.getClass(), "cardId", -1350326933);
        setIntField(term401556, term401556.getClass(), "characterId", -593556303);
        setIntField(term401556, term401556.getClass(), "characterVoiceNo", -1006748550);
        setIntField(term401556, term401556.getClass(), "tabSetting", 290636259);
        setIntField(term401556, term401556.getClass(), "tabSortSetting", 1083229830);
        setIntField(term401556, term401556.getClass(), "cardCategorySetting", 1787821040);
        setIntField(term401556, term401556.getClass(), "cardSortSetting", -687416336);
        setIntField(term401556, term401556.getClass(), "rivalScoreCategorySetting", -1372623309);
        setIntField(term401556, term401556.getClass(), "playedTutorialBit", 1635317633);
        setIntField(term401556, term401556.getClass(), "firstTutorialCancelNum", -1599102699);
        setLongField(term401556, term401556.getClass(), "sumTechHighScore", -1501783656287335632L);
        setLongField(term401556, term401556.getClass(), "sumTechBasicHighScore", 1194222040417145789L);
        setLongField(term401556, term401556.getClass(), "sumTechAdvancedHighScore", -8692608012677382529L);
        setLongField(term401556, term401556.getClass(), "sumTechExpertHighScore", -4261164165677849978L);
        setLongField(term401556, term401556.getClass(), "sumTechMasterHighScore", 492467355932744397L);
        setLongField(term401556, term401556.getClass(), "sumTechLunaticHighScore", -3909904062778826520L);
        setLongField(term401556, term401556.getClass(), "sumBattleHighScore", 431459361348259677L);
        setLongField(term401556, term401556.getClass(), "sumBattleBasicHighScore", 8927391482405121792L);
        setLongField(term401556, term401556.getClass(), "sumBattleAdvancedHighScore", 6916093574783329543L);
        setLongField(term401556, term401556.getClass(), "sumBattleExpertHighScore", 2626500019350680494L);
        setLongField(term401556, term401556.getClass(), "sumBattleMasterHighScore", -7385996154796124764L);
        setLongField(term401556, term401556.getClass(), "sumBattleLunaticHighScore", -3983596883706946405L);
        setField(term401556, term401556.getClass(), "eventWatchedDate", "iWHYNyPJMh");
        setField(term401556, term401556.getClass(), "cmEventWatchedDate", "BNVIIiwoWE");
        setField(term401556, term401556.getClass(), "firstGameId", "nHcDLOzpGp");
        setField(term401556, term401556.getClass(), "firstRomVersion", "fwyfjOCqkP");
        setField(term401556, term401556.getClass(), "firstDataVersion", "MrjckSmxnQ");
        setField(term401556, term401556.getClass(), "firstPlayDate", "XGMXKTMgcK");
        setField(term401556, term401556.getClass(), "lastGameId", "UJsiqZiscj");
        setField(term401556, term401556.getClass(), "lastRomVersion", "TXUHNeqATO");
        setField(term401556, term401556.getClass(), "lastDataVersion", "nthSEPyTbL");
        setField(term401556, term401556.getClass(), "compatibleCmVersion", "TxeqOUPRHc");
        setField(term401556, term401556.getClass(), "lastPlayDate", "fTznIqOtFV");
        setIntField(term401556, term401556.getClass(), "lastPlaceId", 210499010);
        setField(term401556, term401556.getClass(), "lastPlaceName", "vKEhEaEszK");
        setIntField(term401556, term401556.getClass(), "lastRegionId", 476809880);
        setField(term401556, term401556.getClass(), "lastRegionName", "sTFtRMhWYu");
        setIntField(term401556, term401556.getClass(), "lastAllNetId", -81665888);
        setField(term401556, term401556.getClass(), "lastClientId", "sEgFNJPHQu");
        setIntField(term401556, term401556.getClass(), "lastUsedDeckId", -835674553);
        setIntField(term401556, term401556.getClass(), "lastPlayMusicLevel", 1146991958);
        setIntField(term401556, term401556.getClass(), "lastEmoneyBrand", 2030476780);
        setField(term401554, term401554.getClass(), "user", term401556);
        setIntField(term401554, term401554.getClass(), "chapterId", 1012323826);
        setIntField(term401554, term401554.getClass(), "jewelCount", 1044862647);
        setIntField(term401554, term401554.getClass(), "lastPlayMusicCategory", 1466805489);
        setIntField(term401554, term401554.getClass(), "lastPlayMusicId", -400899392);
        setIntField(term401554, term401554.getClass(), "lastPlayMusicLevel", -191692602);
        setBooleanField(term401554, term401554.getClass(), "isDialogWatched", true);
        setBooleanField(term401554, term401554.getClass(), "isStoryWatched", true);
        setBooleanField(term401554, term401554.getClass(), "isBossWatched", true);
        setBooleanField(term401554, term401554.getClass(), "isClear", true);
        setIntField(term401554, term401554.getClass(), "gaugeId", 1349242117);
        setIntField(term401554, term401554.getClass(), "gaugeNum", 1440243272);
        term401830 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term401830;
        callMethod(klass, "canEqual", argTypes, term401554, args);
    }

};


