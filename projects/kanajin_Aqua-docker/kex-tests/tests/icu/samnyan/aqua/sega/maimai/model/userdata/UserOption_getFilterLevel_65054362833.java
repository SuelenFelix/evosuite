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

public class UserOption_getFilterLevel_65054362833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60893;

    public UserOption_getFilterLevel_65054362833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60899 = new Long(3580984732036213717L);
        term60893 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term60895 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term60897 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term60913 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60914 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60918 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60928 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term60893, term60893.getClass(), "id", 6381166215871562039L);
        setLongField(term60895, term60895.getClass(), "id", 7656211287234019484L);
        setLongField(term60897, term60897.getClass(), "id", -872579514000598474L);
        setField(term60897, term60897.getClass(), "extId", term60899);
        setField(term60897, term60897.getClass(), "luid", "rKIvvYydou");
        setIntField(term60914, term60914.getClass(), "year", 2018);
        setShortField(term60914, term60914.getClass(), "month", (short) 11);
        setShortField(term60914, term60914.getClass(), "day", (short) 23);
        setField(term60913, term60913.getClass(), "date", term60914);
        setByteField(term60918, term60918.getClass(), "hour", (byte) 15);
        setByteField(term60918, term60918.getClass(), "minute", (byte) 21);
        setByteField(term60918, term60918.getClass(), "second", (byte) 39);
        setIntField(term60918, term60918.getClass(), "nano", 255623386);
        setField(term60913, term60913.getClass(), "time", term60918);
        setField(term60897, term60897.getClass(), "registerTime", term60913);
        setIntField(term60924, term60924.getClass(), "year", 2016);
        setShortField(term60924, term60924.getClass(), "month", (short) 11);
        setShortField(term60924, term60924.getClass(), "day", (short) 8);
        setField(term60923, term60923.getClass(), "date", term60924);
        setByteField(term60928, term60928.getClass(), "hour", (byte) 7);
        setByteField(term60928, term60928.getClass(), "minute", (byte) 33);
        setByteField(term60928, term60928.getClass(), "second", (byte) 30);
        setIntField(term60928, term60928.getClass(), "nano", 274725601);
        setField(term60923, term60923.getClass(), "time", term60928);
        setField(term60897, term60897.getClass(), "accessTime", term60923);
        setField(term60895, term60895.getClass(), "card", term60897);
        setIntField(term60895, term60895.getClass(), "lastDataVersion", 1127423658);
        setField(term60895, term60895.getClass(), "userName", "KNgeIkQoef");
        setIntField(term60895, term60895.getClass(), "point", 1769148291);
        setIntField(term60895, term60895.getClass(), "totalPoint", -589939936);
        setIntField(term60895, term60895.getClass(), "iconId", -1648554957);
        setIntField(term60895, term60895.getClass(), "nameplateId", -562928205);
        setIntField(term60895, term60895.getClass(), "frameId", 1606784584);
        setIntField(term60895, term60895.getClass(), "trophyId", -1363533335);
        setIntField(term60895, term60895.getClass(), "playCount", 366895162);
        setIntField(term60895, term60895.getClass(), "playVsCount", 1724693880);
        setIntField(term60895, term60895.getClass(), "playSyncCount", -1087721009);
        setIntField(term60895, term60895.getClass(), "winCount", -2015236116);
        setIntField(term60895, term60895.getClass(), "helpCount", 23503476);
        setIntField(term60895, term60895.getClass(), "comboCount", 1507237625);
        setIntField(term60895, term60895.getClass(), "feverCount", 845255343);
        setIntField(term60895, term60895.getClass(), "totalHiScore", 1633731345);
        setIntField(term60895, term60895.getClass(), "totalEasyHighScore", 953429371);
        setIntField(term60895, term60895.getClass(), "totalBasicHighScore", 200402683);
        setIntField(term60895, term60895.getClass(), "totalAdvancedHighScore", 1718675670);
        setIntField(term60895, term60895.getClass(), "totalExpertHighScore", -668635527);
        setIntField(term60895, term60895.getClass(), "totalMasterHighScore", -1270221622);
        setIntField(term60895, term60895.getClass(), "totalReMasterHighScore", -768998591);
        setIntField(term60895, term60895.getClass(), "totalHighSync", 1911741101);
        setIntField(term60895, term60895.getClass(), "totalEasySync", 1972178133);
        setIntField(term60895, term60895.getClass(), "totalBasicSync", -555791745);
        setIntField(term60895, term60895.getClass(), "totalAdvancedSync", 1871265534);
        setIntField(term60895, term60895.getClass(), "totalExpertSync", 403098234);
        setIntField(term60895, term60895.getClass(), "totalMasterSync", 400286709);
        setIntField(term60895, term60895.getClass(), "totalReMasterSync", -754991776);
        setIntField(term60895, term60895.getClass(), "playerRating", 252830341);
        setIntField(term60895, term60895.getClass(), "highestRating", 1540328966);
        setIntField(term60895, term60895.getClass(), "rankAuthTailId", -1473745505);
        setField(term60895, term60895.getClass(), "eventWatchedDate", "MeMWAHyjMR");
        setField(term60895, term60895.getClass(), "webLimitDate", "lTuLOcnSnJ");
        setIntField(term60895, term60895.getClass(), "challengeTrackPhase", -186887389);
        setIntField(term60895, term60895.getClass(), "firstPlayBits", 1862081090);
        setField(term60895, term60895.getClass(), "lastPlayDate", "govbBrRstA");
        setIntField(term60895, term60895.getClass(), "lastPlaceId", -290784129);
        setField(term60895, term60895.getClass(), "lastPlaceName", "zSMUNzRRyM");
        setIntField(term60895, term60895.getClass(), "lastRegionId", 2007865762);
        setField(term60895, term60895.getClass(), "lastRegionName", "aKwJiIZSjJ");
        setField(term60895, term60895.getClass(), "lastClientId", "lYbeaINKud");
        setField(term60895, term60895.getClass(), "lastCountryCode", "BrwuUkkatt");
        setIntField(term60895, term60895.getClass(), "eventPoint", -666918167);
        setIntField(term60895, term60895.getClass(), "totalLv", 898423021);
        setIntField(term60895, term60895.getClass(), "lastLoginBonusDay", 2126116511);
        setIntField(term60895, term60895.getClass(), "lastSurvivalBonusDay", -1607033559);
        setIntField(term60895, term60895.getClass(), "loginBonusLv", 606770187);
        setField(term60893, term60893.getClass(), "user", term60895);
        setIntField(term60893, term60893.getClass(), "soudEffect", -2099435269);
        setIntField(term60893, term60893.getClass(), "mirrorMode", -1960948468);
        setIntField(term60893, term60893.getClass(), "guideSpeed", 463987540);
        setIntField(term60893, term60893.getClass(), "bgInfo", -1061698279);
        setIntField(term60893, term60893.getClass(), "brightness", 955556184);
        setIntField(term60893, term60893.getClass(), "isStarRot", -1983502078);
        setIntField(term60893, term60893.getClass(), "breakSe", 1255011076);
        setIntField(term60893, term60893.getClass(), "slideSe", -685777121);
        setIntField(term60893, term60893.getClass(), "hardJudge", -1692733101);
        setIntField(term60893, term60893.getClass(), "isTagJump", 502455086);
        setIntField(term60893, term60893.getClass(), "breakSeVol", -1126933002);
        setIntField(term60893, term60893.getClass(), "slideSeVol", 1486444842);
        setIntField(term60893, term60893.getClass(), "isUpperDisp", 2054666202);
        setIntField(term60893, term60893.getClass(), "trackSkip", 1227044061);
        setIntField(term60893, term60893.getClass(), "optionMode", -195818221);
        setIntField(term60893, term60893.getClass(), "simpleOptionParam", -210604022);
        setIntField(term60893, term60893.getClass(), "adjustTiming", 1198201318);
        setIntField(term60893, term60893.getClass(), "dispTiming", -1343762602);
        setIntField(term60893, term60893.getClass(), "timingPos", -167150075);
        setIntField(term60893, term60893.getClass(), "ansVol", -1368631720);
        setIntField(term60893, term60893.getClass(), "noteVol", -533410760);
        setIntField(term60893, term60893.getClass(), "dmgVol", -1280711293);
        setIntField(term60893, term60893.getClass(), "appealFlame", -986135027);
        setIntField(term60893, term60893.getClass(), "isFeverDisp", 759881914);
        setIntField(term60893, term60893.getClass(), "dispJudge", -1651145659);
        setIntField(term60893, term60893.getClass(), "judgePos", -1747737642);
        setIntField(term60893, term60893.getClass(), "ratingGuard", -875663853);
        setIntField(term60893, term60893.getClass(), "selectChara", -956550555);
        setIntField(term60893, term60893.getClass(), "sortType", -396229522);
        setIntField(term60893, term60893.getClass(), "filterGenre", -1504505239);
        setIntField(term60893, term60893.getClass(), "filterLevel", 363428862);
        setIntField(term60893, term60893.getClass(), "filterRank", -1175441949);
        setIntField(term60893, term60893.getClass(), "filterVersion", -21088397);
        setIntField(term60893, term60893.getClass(), "filterRec", 727645543);
        setIntField(term60893, term60893.getClass(), "filterFullCombo", 1617706309);
        setIntField(term60893, term60893.getClass(), "filterAllPerfect", -1771065834);
        setIntField(term60893, term60893.getClass(), "filterDifficulty", -1607856343);
        setIntField(term60893, term60893.getClass(), "filterFullSync", -1393066070);
        setIntField(term60893, term60893.getClass(), "filterReMaster", 1089906374);
        setIntField(term60893, term60893.getClass(), "filterMaxFever", 1430244220);
        setIntField(term60893, term60893.getClass(), "finalSelectId", 871438955);
        setIntField(term60893, term60893.getClass(), "finalSelectCategory", 1578242981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterLevel", argTypes, term60893, args);
    }

};


