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

public class UserMusicDetail_setMaxTeamOverKill_167629768730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417403;
     Object term417684;

    public UserMusicDetail_setMaxTeamOverKill_167629768730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term417409 = new Long(-6299955839293054069L);
        term417403 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term417405 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term417407 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term417423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term417424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term417428 = newInstance(Class.forName("java.time.LocalTime"));
        Object term417433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term417434 = newInstance(Class.forName("java.time.LocalDate"));
        Object term417438 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term417403, term417403.getClass(), "id", -1965766295985741316L);
        setLongField(term417405, term417405.getClass(), "id", -6989204328143903527L);
        setLongField(term417407, term417407.getClass(), "id", 5417612471723212893L);
        setField(term417407, term417407.getClass(), "extId", term417409);
        setField(term417407, term417407.getClass(), "luid", "jrczJlmGeq");
        setIntField(term417424, term417424.getClass(), "year", 2018);
        setShortField(term417424, term417424.getClass(), "month", (short) 5);
        setShortField(term417424, term417424.getClass(), "day", (short) 29);
        setField(term417423, term417423.getClass(), "date", term417424);
        setByteField(term417428, term417428.getClass(), "hour", (byte) 8);
        setByteField(term417428, term417428.getClass(), "minute", (byte) 2);
        setByteField(term417428, term417428.getClass(), "second", (byte) 25);
        setIntField(term417428, term417428.getClass(), "nano", 113852787);
        setField(term417423, term417423.getClass(), "time", term417428);
        setField(term417407, term417407.getClass(), "registerTime", term417423);
        setIntField(term417434, term417434.getClass(), "year", 2017);
        setShortField(term417434, term417434.getClass(), "month", (short) 7);
        setShortField(term417434, term417434.getClass(), "day", (short) 3);
        setField(term417433, term417433.getClass(), "date", term417434);
        setByteField(term417438, term417438.getClass(), "hour", (byte) 18);
        setByteField(term417438, term417438.getClass(), "minute", (byte) 55);
        setByteField(term417438, term417438.getClass(), "second", (byte) 1);
        setIntField(term417438, term417438.getClass(), "nano", 995749632);
        setField(term417433, term417433.getClass(), "time", term417438);
        setField(term417407, term417407.getClass(), "accessTime", term417433);
        setField(term417405, term417405.getClass(), "card", term417407);
        setField(term417405, term417405.getClass(), "userName", "CbhhDebDEX");
        setIntField(term417405, term417405.getClass(), "level", 1554018921);
        setIntField(term417405, term417405.getClass(), "reincarnationNum", 1804425784);
        setLongField(term417405, term417405.getClass(), "exp", 5080934469034164732L);
        setLongField(term417405, term417405.getClass(), "point", 6534627284756417711L);
        setLongField(term417405, term417405.getClass(), "totalPoint", 6770453843488601447L);
        setIntField(term417405, term417405.getClass(), "playCount", -678252178);
        setIntField(term417405, term417405.getClass(), "jewelCount", -1455734392);
        setIntField(term417405, term417405.getClass(), "totalJewelCount", 928833652);
        setIntField(term417405, term417405.getClass(), "medalCount", 665498508);
        setIntField(term417405, term417405.getClass(), "playerRating", 959272336);
        setIntField(term417405, term417405.getClass(), "highestRating", 81183347);
        setIntField(term417405, term417405.getClass(), "battlePoint", 1289871424);
        setIntField(term417405, term417405.getClass(), "bestBattlePoint", -236079370);
        setIntField(term417405, term417405.getClass(), "overDamageBattlePoint", 2010037939);
        setBooleanField(term417405, term417405.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term417405, term417405.getClass(), "nameplateId", 248119278);
        setIntField(term417405, term417405.getClass(), "trophyId", 1723462859);
        setIntField(term417405, term417405.getClass(), "cardId", -289108625);
        setIntField(term417405, term417405.getClass(), "characterId", 1929649061);
        setIntField(term417405, term417405.getClass(), "characterVoiceNo", 1925642870);
        setIntField(term417405, term417405.getClass(), "tabSetting", -502476370);
        setIntField(term417405, term417405.getClass(), "tabSortSetting", 1224458415);
        setIntField(term417405, term417405.getClass(), "cardCategorySetting", -1271822706);
        setIntField(term417405, term417405.getClass(), "cardSortSetting", -1642798112);
        setIntField(term417405, term417405.getClass(), "rivalScoreCategorySetting", -1785576595);
        setIntField(term417405, term417405.getClass(), "playedTutorialBit", 1549180659);
        setIntField(term417405, term417405.getClass(), "firstTutorialCancelNum", 1808176996);
        setLongField(term417405, term417405.getClass(), "sumTechHighScore", -3789525738233782420L);
        setLongField(term417405, term417405.getClass(), "sumTechBasicHighScore", -4957843507108786200L);
        setLongField(term417405, term417405.getClass(), "sumTechAdvancedHighScore", -6420649918163015697L);
        setLongField(term417405, term417405.getClass(), "sumTechExpertHighScore", -7636506045076404538L);
        setLongField(term417405, term417405.getClass(), "sumTechMasterHighScore", -1902220584143973835L);
        setLongField(term417405, term417405.getClass(), "sumTechLunaticHighScore", -5246487621660141273L);
        setLongField(term417405, term417405.getClass(), "sumBattleHighScore", 203583612709995751L);
        setLongField(term417405, term417405.getClass(), "sumBattleBasicHighScore", -4146674409439041610L);
        setLongField(term417405, term417405.getClass(), "sumBattleAdvancedHighScore", -1879947888985228393L);
        setLongField(term417405, term417405.getClass(), "sumBattleExpertHighScore", 6676447757733405312L);
        setLongField(term417405, term417405.getClass(), "sumBattleMasterHighScore", 7066263318151594314L);
        setLongField(term417405, term417405.getClass(), "sumBattleLunaticHighScore", 8685861713963659550L);
        setField(term417405, term417405.getClass(), "eventWatchedDate", "DrdhmLCYeL");
        setField(term417405, term417405.getClass(), "cmEventWatchedDate", "wJhiSfuApb");
        setField(term417405, term417405.getClass(), "firstGameId", "UEsvqwcIgT");
        setField(term417405, term417405.getClass(), "firstRomVersion", "sOtnBPWqhn");
        setField(term417405, term417405.getClass(), "firstDataVersion", "aTmUaHxKED");
        setField(term417405, term417405.getClass(), "firstPlayDate", "YIVCGRizzq");
        setField(term417405, term417405.getClass(), "lastGameId", "BDlRVpRqCb");
        setField(term417405, term417405.getClass(), "lastRomVersion", "CGRHPlBjUX");
        setField(term417405, term417405.getClass(), "lastDataVersion", "PihPefTPDf");
        setField(term417405, term417405.getClass(), "compatibleCmVersion", "gDLpykXZzz");
        setField(term417405, term417405.getClass(), "lastPlayDate", "EnEflwAwaP");
        setIntField(term417405, term417405.getClass(), "lastPlaceId", 1702277825);
        setField(term417405, term417405.getClass(), "lastPlaceName", "IFHoeBGFjU");
        setIntField(term417405, term417405.getClass(), "lastRegionId", 895142160);
        setField(term417405, term417405.getClass(), "lastRegionName", "GPTFYfjowS");
        setIntField(term417405, term417405.getClass(), "lastAllNetId", 1482921729);
        setField(term417405, term417405.getClass(), "lastClientId", "NbSgoagcRR");
        setIntField(term417405, term417405.getClass(), "lastUsedDeckId", -603641436);
        setIntField(term417405, term417405.getClass(), "lastPlayMusicLevel", 1801259023);
        setIntField(term417405, term417405.getClass(), "lastEmoneyBrand", -1785744654);
        setField(term417403, term417403.getClass(), "user", term417405);
        setIntField(term417403, term417403.getClass(), "musicId", -1955868567);
        setIntField(term417403, term417403.getClass(), "level", -628995778);
        setIntField(term417403, term417403.getClass(), "playCount", 564022024);
        setIntField(term417403, term417403.getClass(), "techScoreMax", 1024842456);
        setIntField(term417403, term417403.getClass(), "techScoreRank", 227378188);
        setIntField(term417403, term417403.getClass(), "battleScoreMax", 1737784016);
        setIntField(term417403, term417403.getClass(), "battleScoreRank", 3809106);
        setIntField(term417403, term417403.getClass(), "maxComboCount", 1947945285);
        setIntField(term417403, term417403.getClass(), "maxOverKill", 1996806370);
        setIntField(term417403, term417403.getClass(), "maxTeamOverKill", 1046598423);
        setBooleanField(term417403, term417403.getClass(), "isFullBell", true);
        setBooleanField(term417403, term417403.getClass(), "isFullCombo", true);
        setBooleanField(term417403, term417403.getClass(), "isAllBreake", true);
        setBooleanField(term417403, term417403.getClass(), "isLock", false);
        setIntField(term417403, term417403.getClass(), "clearStatus", -1151624861);
        setBooleanField(term417403, term417403.getClass(), "isStoryWatched", true);
        term417684 = new Integer(1112103947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term417684;
        callMethod(klass, "setMaxTeamOverKill", argTypes, term417403, args);
    }

};


