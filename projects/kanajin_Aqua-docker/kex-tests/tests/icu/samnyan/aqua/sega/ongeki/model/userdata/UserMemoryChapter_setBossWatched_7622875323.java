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
import java.lang.Boolean;

public class UserMemoryChapter_setBossWatched_7622875323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399365;
     Object term399641;

    public UserMemoryChapter_setBossWatched_7622875323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term399371 = new Long(-308461294344616496L);
        term399365 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term399367 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term399369 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term399385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term399386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term399390 = newInstance(Class.forName("java.time.LocalTime"));
        Object term399395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term399396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term399400 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term399365, term399365.getClass(), "id", -6444870215267340910L);
        setLongField(term399367, term399367.getClass(), "id", 7796989954227614941L);
        setLongField(term399369, term399369.getClass(), "id", -1918816021138029139L);
        setField(term399369, term399369.getClass(), "extId", term399371);
        setField(term399369, term399369.getClass(), "luid", "muoAhEuvQF");
        setIntField(term399386, term399386.getClass(), "year", 2015);
        setShortField(term399386, term399386.getClass(), "month", (short) 2);
        setShortField(term399386, term399386.getClass(), "day", (short) 24);
        setField(term399385, term399385.getClass(), "date", term399386);
        setByteField(term399390, term399390.getClass(), "hour", (byte) 6);
        setByteField(term399390, term399390.getClass(), "minute", (byte) 20);
        setByteField(term399390, term399390.getClass(), "second", (byte) 15);
        setIntField(term399390, term399390.getClass(), "nano", 869307930);
        setField(term399385, term399385.getClass(), "time", term399390);
        setField(term399369, term399369.getClass(), "registerTime", term399385);
        setIntField(term399396, term399396.getClass(), "year", 2010);
        setShortField(term399396, term399396.getClass(), "month", (short) 7);
        setShortField(term399396, term399396.getClass(), "day", (short) 29);
        setField(term399395, term399395.getClass(), "date", term399396);
        setByteField(term399400, term399400.getClass(), "hour", (byte) 19);
        setByteField(term399400, term399400.getClass(), "minute", (byte) 55);
        setByteField(term399400, term399400.getClass(), "second", (byte) 25);
        setIntField(term399400, term399400.getClass(), "nano", 276104398);
        setField(term399395, term399395.getClass(), "time", term399400);
        setField(term399369, term399369.getClass(), "accessTime", term399395);
        setField(term399367, term399367.getClass(), "card", term399369);
        setField(term399367, term399367.getClass(), "userName", "oVXmxPjXjA");
        setIntField(term399367, term399367.getClass(), "level", 283318021);
        setIntField(term399367, term399367.getClass(), "reincarnationNum", 169625386);
        setLongField(term399367, term399367.getClass(), "exp", -8501869542785737410L);
        setLongField(term399367, term399367.getClass(), "point", -2212701068692712924L);
        setLongField(term399367, term399367.getClass(), "totalPoint", 4909635776702836261L);
        setIntField(term399367, term399367.getClass(), "playCount", -1640544943);
        setIntField(term399367, term399367.getClass(), "jewelCount", -1714703971);
        setIntField(term399367, term399367.getClass(), "totalJewelCount", -1269829320);
        setIntField(term399367, term399367.getClass(), "medalCount", -2088808992);
        setIntField(term399367, term399367.getClass(), "playerRating", 39450659);
        setIntField(term399367, term399367.getClass(), "highestRating", -47006848);
        setIntField(term399367, term399367.getClass(), "battlePoint", 1381413991);
        setIntField(term399367, term399367.getClass(), "bestBattlePoint", 1191817145);
        setIntField(term399367, term399367.getClass(), "overDamageBattlePoint", -1006800538);
        setBooleanField(term399367, term399367.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term399367, term399367.getClass(), "nameplateId", -2108619790);
        setIntField(term399367, term399367.getClass(), "trophyId", -1489410041);
        setIntField(term399367, term399367.getClass(), "cardId", 155882680);
        setIntField(term399367, term399367.getClass(), "characterId", -40972709);
        setIntField(term399367, term399367.getClass(), "characterVoiceNo", -1725069827);
        setIntField(term399367, term399367.getClass(), "tabSetting", -1066990669);
        setIntField(term399367, term399367.getClass(), "tabSortSetting", 1031324328);
        setIntField(term399367, term399367.getClass(), "cardCategorySetting", -912053647);
        setIntField(term399367, term399367.getClass(), "cardSortSetting", 489738419);
        setIntField(term399367, term399367.getClass(), "rivalScoreCategorySetting", -1967414447);
        setIntField(term399367, term399367.getClass(), "playedTutorialBit", -1630459792);
        setIntField(term399367, term399367.getClass(), "firstTutorialCancelNum", -86611445);
        setLongField(term399367, term399367.getClass(), "sumTechHighScore", -5609860175518526293L);
        setLongField(term399367, term399367.getClass(), "sumTechBasicHighScore", -3627446538264878781L);
        setLongField(term399367, term399367.getClass(), "sumTechAdvancedHighScore", -6514053203829171248L);
        setLongField(term399367, term399367.getClass(), "sumTechExpertHighScore", -3439074291060147123L);
        setLongField(term399367, term399367.getClass(), "sumTechMasterHighScore", -1741932243177779617L);
        setLongField(term399367, term399367.getClass(), "sumTechLunaticHighScore", -3080935724128115456L);
        setLongField(term399367, term399367.getClass(), "sumBattleHighScore", 156861999847786759L);
        setLongField(term399367, term399367.getClass(), "sumBattleBasicHighScore", 9196734911520469348L);
        setLongField(term399367, term399367.getClass(), "sumBattleAdvancedHighScore", -8786327085035228611L);
        setLongField(term399367, term399367.getClass(), "sumBattleExpertHighScore", -612016812539807661L);
        setLongField(term399367, term399367.getClass(), "sumBattleMasterHighScore", 5323883456740583519L);
        setLongField(term399367, term399367.getClass(), "sumBattleLunaticHighScore", -5292614708144298436L);
        setField(term399367, term399367.getClass(), "eventWatchedDate", "iFaMRmXuCD");
        setField(term399367, term399367.getClass(), "cmEventWatchedDate", "TYlCosvlAx");
        setField(term399367, term399367.getClass(), "firstGameId", "nolUmjxFFk");
        setField(term399367, term399367.getClass(), "firstRomVersion", "SOYriOJfdw");
        setField(term399367, term399367.getClass(), "firstDataVersion", "HmEzzyTmyy");
        setField(term399367, term399367.getClass(), "firstPlayDate", "mdNYWqaAmz");
        setField(term399367, term399367.getClass(), "lastGameId", "zrBxhXshea");
        setField(term399367, term399367.getClass(), "lastRomVersion", "tsIzAYHUwn");
        setField(term399367, term399367.getClass(), "lastDataVersion", "KypcnfNwsm");
        setField(term399367, term399367.getClass(), "compatibleCmVersion", "aYFGNYAwBJ");
        setField(term399367, term399367.getClass(), "lastPlayDate", "NPqEIqMvQB");
        setIntField(term399367, term399367.getClass(), "lastPlaceId", -1377995609);
        setField(term399367, term399367.getClass(), "lastPlaceName", "ftuGuCfzhd");
        setIntField(term399367, term399367.getClass(), "lastRegionId", -900900492);
        setField(term399367, term399367.getClass(), "lastRegionName", "LcIpDatvSj");
        setIntField(term399367, term399367.getClass(), "lastAllNetId", 1677871787);
        setField(term399367, term399367.getClass(), "lastClientId", "VaQWcSkEYb");
        setIntField(term399367, term399367.getClass(), "lastUsedDeckId", -192582266);
        setIntField(term399367, term399367.getClass(), "lastPlayMusicLevel", -1080208225);
        setIntField(term399367, term399367.getClass(), "lastEmoneyBrand", 910771201);
        setField(term399365, term399365.getClass(), "user", term399367);
        setIntField(term399365, term399365.getClass(), "chapterId", -66493064);
        setIntField(term399365, term399365.getClass(), "jewelCount", -926289798);
        setIntField(term399365, term399365.getClass(), "lastPlayMusicCategory", 1967574407);
        setIntField(term399365, term399365.getClass(), "lastPlayMusicId", 628803348);
        setIntField(term399365, term399365.getClass(), "lastPlayMusicLevel", 81745805);
        setBooleanField(term399365, term399365.getClass(), "isDialogWatched", true);
        setBooleanField(term399365, term399365.getClass(), "isStoryWatched", false);
        setBooleanField(term399365, term399365.getClass(), "isBossWatched", true);
        setBooleanField(term399365, term399365.getClass(), "isClear", false);
        setIntField(term399365, term399365.getClass(), "gaugeId", -1447126721);
        setIntField(term399365, term399365.getClass(), "gaugeNum", -977802841);
        term399641 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term399641;
        callMethod(klass, "setBossWatched", argTypes, term399365, args);
    }

};


