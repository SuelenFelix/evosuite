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

public class UserPlaylog_setPlayedUserName2_171003738983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151973;

    public UserPlaylog_setPlayedUserName2_171003738983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term151979 = new Long(-2614906266506360948L);
        term151973 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term151975 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term151977 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term151993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151998 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152008 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151973, term151973.getClass(), "id", 8567604378841612757L);
        setLongField(term151975, term151975.getClass(), "id", 4248644875418274020L);
        setLongField(term151977, term151977.getClass(), "id", 2220195077881026021L);
        setField(term151977, term151977.getClass(), "extId", term151979);
        setField(term151977, term151977.getClass(), "luid", "GPeSysvTtW");
        setIntField(term151994, term151994.getClass(), "year", 2014);
        setShortField(term151994, term151994.getClass(), "month", (short) 4);
        setShortField(term151994, term151994.getClass(), "day", (short) 29);
        setField(term151993, term151993.getClass(), "date", term151994);
        setByteField(term151998, term151998.getClass(), "hour", (byte) 11);
        setByteField(term151998, term151998.getClass(), "minute", (byte) 34);
        setByteField(term151998, term151998.getClass(), "second", (byte) 37);
        setIntField(term151998, term151998.getClass(), "nano", 983028354);
        setField(term151993, term151993.getClass(), "time", term151998);
        setField(term151977, term151977.getClass(), "registerTime", term151993);
        setIntField(term152004, term152004.getClass(), "year", 2029);
        setShortField(term152004, term152004.getClass(), "month", (short) 7);
        setShortField(term152004, term152004.getClass(), "day", (short) 3);
        setField(term152003, term152003.getClass(), "date", term152004);
        setByteField(term152008, term152008.getClass(), "hour", (byte) 18);
        setByteField(term152008, term152008.getClass(), "minute", (byte) 33);
        setByteField(term152008, term152008.getClass(), "second", (byte) 32);
        setIntField(term152008, term152008.getClass(), "nano", 464450762);
        setField(term152003, term152003.getClass(), "time", term152008);
        setField(term151977, term151977.getClass(), "accessTime", term152003);
        setField(term151975, term151975.getClass(), "card", term151977);
        setIntField(term151975, term151975.getClass(), "lastDataVersion", -375199942);
        setField(term151975, term151975.getClass(), "userName", "gHCWHtrKMj");
        setIntField(term151975, term151975.getClass(), "point", -1715923424);
        setIntField(term151975, term151975.getClass(), "totalPoint", -910580480);
        setIntField(term151975, term151975.getClass(), "iconId", -526438792);
        setIntField(term151975, term151975.getClass(), "nameplateId", -1621172613);
        setIntField(term151975, term151975.getClass(), "frameId", 2090369238);
        setIntField(term151975, term151975.getClass(), "trophyId", -264474773);
        setIntField(term151975, term151975.getClass(), "playCount", 1949073511);
        setIntField(term151975, term151975.getClass(), "playVsCount", -1660804748);
        setIntField(term151975, term151975.getClass(), "playSyncCount", -1562335326);
        setIntField(term151975, term151975.getClass(), "winCount", 337950784);
        setIntField(term151975, term151975.getClass(), "helpCount", 1067037174);
        setIntField(term151975, term151975.getClass(), "comboCount", -664843481);
        setIntField(term151975, term151975.getClass(), "feverCount", 1794725157);
        setIntField(term151975, term151975.getClass(), "totalHiScore", -1899127703);
        setIntField(term151975, term151975.getClass(), "totalEasyHighScore", -240607840);
        setIntField(term151975, term151975.getClass(), "totalBasicHighScore", -577900240);
        setIntField(term151975, term151975.getClass(), "totalAdvancedHighScore", 275743640);
        setIntField(term151975, term151975.getClass(), "totalExpertHighScore", 819925760);
        setIntField(term151975, term151975.getClass(), "totalMasterHighScore", -1341150554);
        setIntField(term151975, term151975.getClass(), "totalReMasterHighScore", -911676869);
        setIntField(term151975, term151975.getClass(), "totalHighSync", -315255755);
        setIntField(term151975, term151975.getClass(), "totalEasySync", -2070324513);
        setIntField(term151975, term151975.getClass(), "totalBasicSync", 1920625938);
        setIntField(term151975, term151975.getClass(), "totalAdvancedSync", -1786378315);
        setIntField(term151975, term151975.getClass(), "totalExpertSync", -1532684075);
        setIntField(term151975, term151975.getClass(), "totalMasterSync", -739168905);
        setIntField(term151975, term151975.getClass(), "totalReMasterSync", -1515863560);
        setIntField(term151975, term151975.getClass(), "playerRating", -792512827);
        setIntField(term151975, term151975.getClass(), "highestRating", -1935600678);
        setIntField(term151975, term151975.getClass(), "rankAuthTailId", 1337707233);
        setField(term151975, term151975.getClass(), "eventWatchedDate", "sRhnTEwrac");
        setField(term151975, term151975.getClass(), "webLimitDate", "JHOBLjcqST");
        setIntField(term151975, term151975.getClass(), "challengeTrackPhase", -429200385);
        setIntField(term151975, term151975.getClass(), "firstPlayBits", 47201405);
        setField(term151975, term151975.getClass(), "lastPlayDate", "SMOeUyvURd");
        setIntField(term151975, term151975.getClass(), "lastPlaceId", 1438765646);
        setField(term151975, term151975.getClass(), "lastPlaceName", "FdqAMXxgBA");
        setIntField(term151975, term151975.getClass(), "lastRegionId", 1636250418);
        setField(term151975, term151975.getClass(), "lastRegionName", "amjxvUlDTF");
        setField(term151975, term151975.getClass(), "lastClientId", "homzrGHfwX");
        setField(term151975, term151975.getClass(), "lastCountryCode", "fIeNSTsisH");
        setIntField(term151975, term151975.getClass(), "eventPoint", -809405409);
        setIntField(term151975, term151975.getClass(), "totalLv", 1046184268);
        setIntField(term151975, term151975.getClass(), "lastLoginBonusDay", -1235106740);
        setIntField(term151975, term151975.getClass(), "lastSurvivalBonusDay", 1051468050);
        setIntField(term151975, term151975.getClass(), "loginBonusLv", 418894507);
        setField(term151973, term151973.getClass(), "user", term151975);
        setIntField(term151973, term151973.getClass(), "orderId", 788242359);
        setLongField(term151973, term151973.getClass(), "sortNumber", -613788131903895980L);
        setIntField(term151973, term151973.getClass(), "placeId", 938801054);
        setField(term151973, term151973.getClass(), "placeName", "rsKcNOWfZH");
        setField(term151973, term151973.getClass(), "country", "NwcJhozXMr");
        setIntField(term151973, term151973.getClass(), "regionId", 904698255);
        setField(term151973, term151973.getClass(), "playDate", "nEgtuqAlLm");
        setField(term151973, term151973.getClass(), "userPlayDate", "DiWPwuubfu");
        setIntField(term151973, term151973.getClass(), "musicId", -2032196462);
        setIntField(term151973, term151973.getClass(), "level", 542550600);
        setIntField(term151973, term151973.getClass(), "gameMode", -1601496921);
        setIntField(term151973, term151973.getClass(), "rivalNum", -221567698);
        setIntField(term151973, term151973.getClass(), "track", -341413663);
        setIntField(term151973, term151973.getClass(), "eventId", 2091080902);
        setBooleanField(term151973, term151973.getClass(), "isFreeToPlay", false);
        setIntField(term151973, term151973.getClass(), "playerRating", 1442192771);
        setLongField(term151973, term151973.getClass(), "playedUserId1", -5544764664016667081L);
        setField(term151973, term151973.getClass(), "playedUserName1", "vXgtAGmDaN");
        setIntField(term151973, term151973.getClass(), "playedMusicLevel1", 1878263363);
        setLongField(term151973, term151973.getClass(), "playedUserId2", 2228513255568046812L);
        setField(term151973, term151973.getClass(), "playedUserName2", "RAzeZQXqkC");
        setIntField(term151973, term151973.getClass(), "playedMusicLevel2", -773438837);
        setLongField(term151973, term151973.getClass(), "playedUserId3", -640045267052655713L);
        setField(term151973, term151973.getClass(), "playedUserName3", "NxfBiMaFGb");
        setIntField(term151973, term151973.getClass(), "playedMusicLevel3", -982537051);
        setIntField(term151973, term151973.getClass(), "achievement", 1930297196);
        setIntField(term151973, term151973.getClass(), "score", 2110980226);
        setIntField(term151973, term151973.getClass(), "tapScore", -1339712916);
        setIntField(term151973, term151973.getClass(), "holdScore", -2007274304);
        setIntField(term151973, term151973.getClass(), "slideScore", -1406392737);
        setIntField(term151973, term151973.getClass(), "breakScore", 1627751893);
        setIntField(term151973, term151973.getClass(), "syncRate", 523074955);
        setIntField(term151973, term151973.getClass(), "vsWin", -1322452923);
        setBooleanField(term151973, term151973.getClass(), "isAllPerfect", false);
        setIntField(term151973, term151973.getClass(), "fullCombo", 75459326);
        setIntField(term151973, term151973.getClass(), "maxFever", -150840209);
        setIntField(term151973, term151973.getClass(), "maxCombo", -2028952673);
        setIntField(term151973, term151973.getClass(), "tapPerfect", 1989220591);
        setIntField(term151973, term151973.getClass(), "tapGreat", 1417925303);
        setIntField(term151973, term151973.getClass(), "tapGood", 860688928);
        setIntField(term151973, term151973.getClass(), "tapBad", -786363948);
        setIntField(term151973, term151973.getClass(), "holdPerfect", 104242299);
        setIntField(term151973, term151973.getClass(), "holdGreat", -1191744986);
        setIntField(term151973, term151973.getClass(), "holdGood", 1713164522);
        setIntField(term151973, term151973.getClass(), "holdBad", -1335530034);
        setIntField(term151973, term151973.getClass(), "slidePerfect", -888582828);
        setIntField(term151973, term151973.getClass(), "slideGreat", -749215304);
        setIntField(term151973, term151973.getClass(), "slideGood", 734226645);
        setIntField(term151973, term151973.getClass(), "slideBad", 180155629);
        setIntField(term151973, term151973.getClass(), "breakPerfect", 1683440272);
        setIntField(term151973, term151973.getClass(), "breakGreat", -678768496);
        setIntField(term151973, term151973.getClass(), "breakGood", -879058177);
        setIntField(term151973, term151973.getClass(), "breakBad", -1962966061);
        setBooleanField(term151973, term151973.getClass(), "isTrackSkip", false);
        setBooleanField(term151973, term151973.getClass(), "isHighScore", false);
        setBooleanField(term151973, term151973.getClass(), "isChallengeTrack", true);
        setIntField(term151973, term151973.getClass(), "challengeLife", 300333855);
        setIntField(term151973, term151973.getClass(), "challengeRemain", 1611448749);
        setIntField(term151973, term151973.getClass(), "isAllPerfectPlus", 722153974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xKDTKfQIei";
        callMethod(klass, "setPlayedUserName2", argTypes, term151973, args);
    }

};


