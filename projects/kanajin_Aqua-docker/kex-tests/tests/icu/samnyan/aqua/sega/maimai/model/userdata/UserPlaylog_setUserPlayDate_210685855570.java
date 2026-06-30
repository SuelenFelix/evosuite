package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserPlaylog_setUserPlayDate_210685855570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145771;

    public UserPlaylog_setUserPlayDate_210685855570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145777 = new Long(7711054832353934171L);
        term145771 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term145773 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term145775 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term145791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145796 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145806 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term145771, term145771.getClass(), "id", -1863876892925084453L);
        setLongField(term145773, term145773.getClass(), "id", 4384548833934581339L);
        setLongField(term145775, term145775.getClass(), "id", -4507015763084556962L);
        setField(term145775, term145775.getClass(), "extId", term145777);
        setField(term145775, term145775.getClass(), "luid", "rXLmNRoJfU");
        setIntField(term145792, term145792.getClass(), "year", 2010);
        setShortField(term145792, term145792.getClass(), "month", (short) 2);
        setShortField(term145792, term145792.getClass(), "day", (short) 11);
        setField(term145791, term145791.getClass(), "date", term145792);
        setByteField(term145796, term145796.getClass(), "hour", (byte) 12);
        setByteField(term145796, term145796.getClass(), "minute", (byte) 49);
        setByteField(term145796, term145796.getClass(), "second", (byte) 35);
        setIntField(term145796, term145796.getClass(), "nano", 685384504);
        setField(term145791, term145791.getClass(), "time", term145796);
        setField(term145775, term145775.getClass(), "registerTime", term145791);
        setIntField(term145802, term145802.getClass(), "year", 2024);
        setShortField(term145802, term145802.getClass(), "month", (short) 8);
        setShortField(term145802, term145802.getClass(), "day", (short) 7);
        setField(term145801, term145801.getClass(), "date", term145802);
        setByteField(term145806, term145806.getClass(), "hour", (byte) 8);
        setByteField(term145806, term145806.getClass(), "minute", (byte) 41);
        setByteField(term145806, term145806.getClass(), "second", (byte) 36);
        setIntField(term145806, term145806.getClass(), "nano", 84091386);
        setField(term145801, term145801.getClass(), "time", term145806);
        setField(term145775, term145775.getClass(), "accessTime", term145801);
        setField(term145773, term145773.getClass(), "card", term145775);
        setIntField(term145773, term145773.getClass(), "lastDataVersion", -668356776);
        setField(term145773, term145773.getClass(), "userName", "dWaVZloZWE");
        setIntField(term145773, term145773.getClass(), "point", 1390020457);
        setIntField(term145773, term145773.getClass(), "totalPoint", -1315169575);
        setIntField(term145773, term145773.getClass(), "iconId", -1487987516);
        setIntField(term145773, term145773.getClass(), "nameplateId", 481913288);
        setIntField(term145773, term145773.getClass(), "frameId", -1807886018);
        setIntField(term145773, term145773.getClass(), "trophyId", -338826312);
        setIntField(term145773, term145773.getClass(), "playCount", 1304235700);
        setIntField(term145773, term145773.getClass(), "playVsCount", 1120499647);
        setIntField(term145773, term145773.getClass(), "playSyncCount", -1733948783);
        setIntField(term145773, term145773.getClass(), "winCount", 2120160907);
        setIntField(term145773, term145773.getClass(), "helpCount", 1939998816);
        setIntField(term145773, term145773.getClass(), "comboCount", -2065525992);
        setIntField(term145773, term145773.getClass(), "feverCount", -1649181478);
        setIntField(term145773, term145773.getClass(), "totalHiScore", -1855197844);
        setIntField(term145773, term145773.getClass(), "totalEasyHighScore", 601928914);
        setIntField(term145773, term145773.getClass(), "totalBasicHighScore", -136782583);
        setIntField(term145773, term145773.getClass(), "totalAdvancedHighScore", 1555048573);
        setIntField(term145773, term145773.getClass(), "totalExpertHighScore", -18895625);
        setIntField(term145773, term145773.getClass(), "totalMasterHighScore", 647195359);
        setIntField(term145773, term145773.getClass(), "totalReMasterHighScore", -1574973049);
        setIntField(term145773, term145773.getClass(), "totalHighSync", 2116654690);
        setIntField(term145773, term145773.getClass(), "totalEasySync", -1058719664);
        setIntField(term145773, term145773.getClass(), "totalBasicSync", 463983332);
        setIntField(term145773, term145773.getClass(), "totalAdvancedSync", -2132833047);
        setIntField(term145773, term145773.getClass(), "totalExpertSync", 1270931140);
        setIntField(term145773, term145773.getClass(), "totalMasterSync", 1238962538);
        setIntField(term145773, term145773.getClass(), "totalReMasterSync", 681751473);
        setIntField(term145773, term145773.getClass(), "playerRating", -144291893);
        setIntField(term145773, term145773.getClass(), "highestRating", 117129544);
        setIntField(term145773, term145773.getClass(), "rankAuthTailId", 1848381831);
        setField(term145773, term145773.getClass(), "eventWatchedDate", "vgZFgEliKc");
        setField(term145773, term145773.getClass(), "webLimitDate", "cwNMyoCqHJ");
        setIntField(term145773, term145773.getClass(), "challengeTrackPhase", -778102076);
        setIntField(term145773, term145773.getClass(), "firstPlayBits", -1713689291);
        setField(term145773, term145773.getClass(), "lastPlayDate", "PzUYNYWLsN");
        setIntField(term145773, term145773.getClass(), "lastPlaceId", -2063881648);
        setField(term145773, term145773.getClass(), "lastPlaceName", "rGvXtIHjBI");
        setIntField(term145773, term145773.getClass(), "lastRegionId", 563783162);
        setField(term145773, term145773.getClass(), "lastRegionName", "PKJkUkzual");
        setField(term145773, term145773.getClass(), "lastClientId", "WYcqisofgT");
        setField(term145773, term145773.getClass(), "lastCountryCode", "vVYrwXQCzi");
        setIntField(term145773, term145773.getClass(), "eventPoint", 656102329);
        setIntField(term145773, term145773.getClass(), "totalLv", -1966739717);
        setIntField(term145773, term145773.getClass(), "lastLoginBonusDay", 1421785489);
        setIntField(term145773, term145773.getClass(), "lastSurvivalBonusDay", 353670452);
        setIntField(term145773, term145773.getClass(), "loginBonusLv", 1415144193);
        setField(term145771, term145771.getClass(), "user", term145773);
        setIntField(term145771, term145771.getClass(), "orderId", -28263322);
        setLongField(term145771, term145771.getClass(), "sortNumber", 1746899333256847901L);
        setIntField(term145771, term145771.getClass(), "placeId", 2096635362);
        setField(term145771, term145771.getClass(), "placeName", "urqqtlYppy");
        setField(term145771, term145771.getClass(), "country", "znNUsUuegd");
        setIntField(term145771, term145771.getClass(), "regionId", -303198211);
        setField(term145771, term145771.getClass(), "playDate", "TvOdQLksId");
        setField(term145771, term145771.getClass(), "userPlayDate", "gbrBAjYfeF");
        setIntField(term145771, term145771.getClass(), "musicId", -1539311662);
        setIntField(term145771, term145771.getClass(), "level", 207650579);
        setIntField(term145771, term145771.getClass(), "gameMode", -1857463721);
        setIntField(term145771, term145771.getClass(), "rivalNum", -1985015039);
        setIntField(term145771, term145771.getClass(), "track", 1342441822);
        setIntField(term145771, term145771.getClass(), "eventId", 368673307);
        setBooleanField(term145771, term145771.getClass(), "isFreeToPlay", false);
        setIntField(term145771, term145771.getClass(), "playerRating", -1720235890);
        setLongField(term145771, term145771.getClass(), "playedUserId1", -6366307783743902404L);
        setField(term145771, term145771.getClass(), "playedUserName1", "oQyDIyWghi");
        setIntField(term145771, term145771.getClass(), "playedMusicLevel1", -2140644211);
        setLongField(term145771, term145771.getClass(), "playedUserId2", -1515418567631326771L);
        setField(term145771, term145771.getClass(), "playedUserName2", "VGvITdbKFh");
        setIntField(term145771, term145771.getClass(), "playedMusicLevel2", 1521652550);
        setLongField(term145771, term145771.getClass(), "playedUserId3", 5849423766693913056L);
        setField(term145771, term145771.getClass(), "playedUserName3", "OzwgkolGue");
        setIntField(term145771, term145771.getClass(), "playedMusicLevel3", 1361373044);
        setIntField(term145771, term145771.getClass(), "achievement", -1178276792);
        setIntField(term145771, term145771.getClass(), "score", -773752165);
        setIntField(term145771, term145771.getClass(), "tapScore", -1842010799);
        setIntField(term145771, term145771.getClass(), "holdScore", -487747690);
        setIntField(term145771, term145771.getClass(), "slideScore", 1055878202);
        setIntField(term145771, term145771.getClass(), "breakScore", -1662864117);
        setIntField(term145771, term145771.getClass(), "syncRate", -1327285672);
        setIntField(term145771, term145771.getClass(), "vsWin", 2136037217);
        setBooleanField(term145771, term145771.getClass(), "isAllPerfect", false);
        setIntField(term145771, term145771.getClass(), "fullCombo", 1001407525);
        setIntField(term145771, term145771.getClass(), "maxFever", -1424893901);
        setIntField(term145771, term145771.getClass(), "maxCombo", -446854523);
        setIntField(term145771, term145771.getClass(), "tapPerfect", 762171453);
        setIntField(term145771, term145771.getClass(), "tapGreat", 912786468);
        setIntField(term145771, term145771.getClass(), "tapGood", 66790297);
        setIntField(term145771, term145771.getClass(), "tapBad", -2003841860);
        setIntField(term145771, term145771.getClass(), "holdPerfect", 1224595074);
        setIntField(term145771, term145771.getClass(), "holdGreat", -52088508);
        setIntField(term145771, term145771.getClass(), "holdGood", 653517054);
        setIntField(term145771, term145771.getClass(), "holdBad", 109615960);
        setIntField(term145771, term145771.getClass(), "slidePerfect", -1951421926);
        setIntField(term145771, term145771.getClass(), "slideGreat", -413131943);
        setIntField(term145771, term145771.getClass(), "slideGood", -908007521);
        setIntField(term145771, term145771.getClass(), "slideBad", 1839099930);
        setIntField(term145771, term145771.getClass(), "breakPerfect", 389115237);
        setIntField(term145771, term145771.getClass(), "breakGreat", 201178127);
        setIntField(term145771, term145771.getClass(), "breakGood", 1523290038);
        setIntField(term145771, term145771.getClass(), "breakBad", 1666444125);
        setBooleanField(term145771, term145771.getClass(), "isTrackSkip", false);
        setBooleanField(term145771, term145771.getClass(), "isHighScore", false);
        setBooleanField(term145771, term145771.getClass(), "isChallengeTrack", false);
        setIntField(term145771, term145771.getClass(), "challengeLife", -1907610020);
        setIntField(term145771, term145771.getClass(), "challengeRemain", -558304449);
        setIntField(term145771, term145771.getClass(), "isAllPerfectPlus", 399759942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wqwrSGuByQ";
        callMethod(klass, "setUserPlayDate", argTypes, term145771, args);
    }

};


