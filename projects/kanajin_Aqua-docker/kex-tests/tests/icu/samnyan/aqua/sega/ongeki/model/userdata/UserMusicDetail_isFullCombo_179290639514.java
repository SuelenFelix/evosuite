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

public class UserMusicDetail_isFullCombo_179290639514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409904;

    public UserMusicDetail_isFullCombo_179290639514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term409910 = new Long(4715419421865334491L);
        term409904 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term409906 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term409908 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term409924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term409925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term409929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term409934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term409935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term409939 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term409904, term409904.getClass(), "id", 5079513179886147872L);
        setLongField(term409906, term409906.getClass(), "id", -5847331116152904564L);
        setLongField(term409908, term409908.getClass(), "id", 635953914377265513L);
        setField(term409908, term409908.getClass(), "extId", term409910);
        setField(term409908, term409908.getClass(), "luid", "DiWdiCvVqo");
        setIntField(term409925, term409925.getClass(), "year", 2021);
        setShortField(term409925, term409925.getClass(), "month", (short) 5);
        setShortField(term409925, term409925.getClass(), "day", (short) 16);
        setField(term409924, term409924.getClass(), "date", term409925);
        setByteField(term409929, term409929.getClass(), "hour", (byte) 15);
        setByteField(term409929, term409929.getClass(), "minute", (byte) 22);
        setByteField(term409929, term409929.getClass(), "second", (byte) 31);
        setIntField(term409929, term409929.getClass(), "nano", 389269845);
        setField(term409924, term409924.getClass(), "time", term409929);
        setField(term409908, term409908.getClass(), "registerTime", term409924);
        setIntField(term409935, term409935.getClass(), "year", 2010);
        setShortField(term409935, term409935.getClass(), "month", (short) 8);
        setShortField(term409935, term409935.getClass(), "day", (short) 30);
        setField(term409934, term409934.getClass(), "date", term409935);
        setByteField(term409939, term409939.getClass(), "hour", (byte) 23);
        setByteField(term409939, term409939.getClass(), "minute", (byte) 21);
        setByteField(term409939, term409939.getClass(), "second", (byte) 37);
        setIntField(term409939, term409939.getClass(), "nano", 513420347);
        setField(term409934, term409934.getClass(), "time", term409939);
        setField(term409908, term409908.getClass(), "accessTime", term409934);
        setField(term409906, term409906.getClass(), "card", term409908);
        setField(term409906, term409906.getClass(), "userName", "BsdzvtfGKW");
        setIntField(term409906, term409906.getClass(), "level", 2044593829);
        setIntField(term409906, term409906.getClass(), "reincarnationNum", -655326794);
        setLongField(term409906, term409906.getClass(), "exp", -8898900260136590113L);
        setLongField(term409906, term409906.getClass(), "point", 9120889159648845245L);
        setLongField(term409906, term409906.getClass(), "totalPoint", 7231121302151038587L);
        setIntField(term409906, term409906.getClass(), "playCount", -509232651);
        setIntField(term409906, term409906.getClass(), "jewelCount", -1127502560);
        setIntField(term409906, term409906.getClass(), "totalJewelCount", -884054864);
        setIntField(term409906, term409906.getClass(), "medalCount", -865980110);
        setIntField(term409906, term409906.getClass(), "playerRating", -2028050005);
        setIntField(term409906, term409906.getClass(), "highestRating", 2025229906);
        setIntField(term409906, term409906.getClass(), "battlePoint", 2111957025);
        setIntField(term409906, term409906.getClass(), "bestBattlePoint", -112933518);
        setIntField(term409906, term409906.getClass(), "overDamageBattlePoint", 1937155744);
        setBooleanField(term409906, term409906.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term409906, term409906.getClass(), "nameplateId", -388385111);
        setIntField(term409906, term409906.getClass(), "trophyId", -2054633894);
        setIntField(term409906, term409906.getClass(), "cardId", 710316222);
        setIntField(term409906, term409906.getClass(), "characterId", 1812306411);
        setIntField(term409906, term409906.getClass(), "characterVoiceNo", -1705950169);
        setIntField(term409906, term409906.getClass(), "tabSetting", -1216002612);
        setIntField(term409906, term409906.getClass(), "tabSortSetting", -2065861103);
        setIntField(term409906, term409906.getClass(), "cardCategorySetting", -978440695);
        setIntField(term409906, term409906.getClass(), "cardSortSetting", 525509738);
        setIntField(term409906, term409906.getClass(), "rivalScoreCategorySetting", -168692748);
        setIntField(term409906, term409906.getClass(), "playedTutorialBit", -97183233);
        setIntField(term409906, term409906.getClass(), "firstTutorialCancelNum", 1216788465);
        setLongField(term409906, term409906.getClass(), "sumTechHighScore", -5049156697737365468L);
        setLongField(term409906, term409906.getClass(), "sumTechBasicHighScore", 5220991136779392723L);
        setLongField(term409906, term409906.getClass(), "sumTechAdvancedHighScore", -1196613288262458205L);
        setLongField(term409906, term409906.getClass(), "sumTechExpertHighScore", -4353243523900058035L);
        setLongField(term409906, term409906.getClass(), "sumTechMasterHighScore", 7900596771603143871L);
        setLongField(term409906, term409906.getClass(), "sumTechLunaticHighScore", -7727812548590909075L);
        setLongField(term409906, term409906.getClass(), "sumBattleHighScore", -7041400520007266498L);
        setLongField(term409906, term409906.getClass(), "sumBattleBasicHighScore", 8056668597431253042L);
        setLongField(term409906, term409906.getClass(), "sumBattleAdvancedHighScore", 4899158238784342068L);
        setLongField(term409906, term409906.getClass(), "sumBattleExpertHighScore", 1137091658310647744L);
        setLongField(term409906, term409906.getClass(), "sumBattleMasterHighScore", -5771733709474376387L);
        setLongField(term409906, term409906.getClass(), "sumBattleLunaticHighScore", -486319717648901570L);
        setField(term409906, term409906.getClass(), "eventWatchedDate", "NmdTtCkEmt");
        setField(term409906, term409906.getClass(), "cmEventWatchedDate", "YUrDDbEhVT");
        setField(term409906, term409906.getClass(), "firstGameId", "wTewWMyeix");
        setField(term409906, term409906.getClass(), "firstRomVersion", "YBlgjzaVgW");
        setField(term409906, term409906.getClass(), "firstDataVersion", "LiVkkqWjWA");
        setField(term409906, term409906.getClass(), "firstPlayDate", "XrFKCgMuLG");
        setField(term409906, term409906.getClass(), "lastGameId", "GyqsPosQop");
        setField(term409906, term409906.getClass(), "lastRomVersion", "ugAmGuohIe");
        setField(term409906, term409906.getClass(), "lastDataVersion", "dGzmFStjEd");
        setField(term409906, term409906.getClass(), "compatibleCmVersion", "OaPsIbAiPd");
        setField(term409906, term409906.getClass(), "lastPlayDate", "jMQsspYFpf");
        setIntField(term409906, term409906.getClass(), "lastPlaceId", -706246095);
        setField(term409906, term409906.getClass(), "lastPlaceName", "EnNITzdFgl");
        setIntField(term409906, term409906.getClass(), "lastRegionId", -1818179960);
        setField(term409906, term409906.getClass(), "lastRegionName", "ykWqDPXbrp");
        setIntField(term409906, term409906.getClass(), "lastAllNetId", -107692590);
        setField(term409906, term409906.getClass(), "lastClientId", "xgcZAGZiVP");
        setIntField(term409906, term409906.getClass(), "lastUsedDeckId", -517366427);
        setIntField(term409906, term409906.getClass(), "lastPlayMusicLevel", 170145566);
        setIntField(term409906, term409906.getClass(), "lastEmoneyBrand", -1540449299);
        setField(term409904, term409904.getClass(), "user", term409906);
        setIntField(term409904, term409904.getClass(), "musicId", 280307957);
        setIntField(term409904, term409904.getClass(), "level", -147223414);
        setIntField(term409904, term409904.getClass(), "playCount", 718413245);
        setIntField(term409904, term409904.getClass(), "techScoreMax", -1981165845);
        setIntField(term409904, term409904.getClass(), "techScoreRank", -1046395755);
        setIntField(term409904, term409904.getClass(), "battleScoreMax", -1774643014);
        setIntField(term409904, term409904.getClass(), "battleScoreRank", 1335107524);
        setIntField(term409904, term409904.getClass(), "maxComboCount", 31576483);
        setIntField(term409904, term409904.getClass(), "maxOverKill", 461524357);
        setIntField(term409904, term409904.getClass(), "maxTeamOverKill", -1484861287);
        setBooleanField(term409904, term409904.getClass(), "isFullBell", false);
        setBooleanField(term409904, term409904.getClass(), "isFullCombo", false);
        setBooleanField(term409904, term409904.getClass(), "isAllBreake", true);
        setBooleanField(term409904, term409904.getClass(), "isLock", false);
        setIntField(term409904, term409904.getClass(), "clearStatus", -468063076);
        setBooleanField(term409904, term409904.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullCombo", argTypes, term409904, args);
    }

};


