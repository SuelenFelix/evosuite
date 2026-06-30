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

public class UserOption_getUser_3855077232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51345;

    public UserOption_getUser_3855077232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51351 = new Long(-8614778293741404325L);
        term51345 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term51347 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term51349 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51370 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51380 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51345, term51345.getClass(), "id", -3753621038448351550L);
        setLongField(term51347, term51347.getClass(), "id", 5304481534735378567L);
        setLongField(term51349, term51349.getClass(), "id", 3423155413133381764L);
        setField(term51349, term51349.getClass(), "extId", term51351);
        setField(term51349, term51349.getClass(), "luid", "COhzwXcfds");
        setIntField(term51366, term51366.getClass(), "year", 2013);
        setShortField(term51366, term51366.getClass(), "month", (short) 9);
        setShortField(term51366, term51366.getClass(), "day", (short) 12);
        setField(term51365, term51365.getClass(), "date", term51366);
        setByteField(term51370, term51370.getClass(), "hour", (byte) 14);
        setByteField(term51370, term51370.getClass(), "minute", (byte) 21);
        setByteField(term51370, term51370.getClass(), "second", (byte) 35);
        setIntField(term51370, term51370.getClass(), "nano", 520302725);
        setField(term51365, term51365.getClass(), "time", term51370);
        setField(term51349, term51349.getClass(), "registerTime", term51365);
        setIntField(term51376, term51376.getClass(), "year", 2016);
        setShortField(term51376, term51376.getClass(), "month", (short) 2);
        setShortField(term51376, term51376.getClass(), "day", (short) 15);
        setField(term51375, term51375.getClass(), "date", term51376);
        setByteField(term51380, term51380.getClass(), "hour", (byte) 7);
        setByteField(term51380, term51380.getClass(), "minute", (byte) 36);
        setByteField(term51380, term51380.getClass(), "second", (byte) 21);
        setIntField(term51380, term51380.getClass(), "nano", 74269011);
        setField(term51375, term51375.getClass(), "time", term51380);
        setField(term51349, term51349.getClass(), "accessTime", term51375);
        setField(term51347, term51347.getClass(), "card", term51349);
        setIntField(term51347, term51347.getClass(), "lastDataVersion", -2020163854);
        setField(term51347, term51347.getClass(), "userName", "anncJTnzrg");
        setIntField(term51347, term51347.getClass(), "point", -806823193);
        setIntField(term51347, term51347.getClass(), "totalPoint", 128449587);
        setIntField(term51347, term51347.getClass(), "iconId", 1470799236);
        setIntField(term51347, term51347.getClass(), "nameplateId", -2013078692);
        setIntField(term51347, term51347.getClass(), "frameId", -911027260);
        setIntField(term51347, term51347.getClass(), "trophyId", 1971287649);
        setIntField(term51347, term51347.getClass(), "playCount", -1688662880);
        setIntField(term51347, term51347.getClass(), "playVsCount", 635942792);
        setIntField(term51347, term51347.getClass(), "playSyncCount", -126969868);
        setIntField(term51347, term51347.getClass(), "winCount", 1605804678);
        setIntField(term51347, term51347.getClass(), "helpCount", -1830340335);
        setIntField(term51347, term51347.getClass(), "comboCount", 439648027);
        setIntField(term51347, term51347.getClass(), "feverCount", 702556555);
        setIntField(term51347, term51347.getClass(), "totalHiScore", 1868194288);
        setIntField(term51347, term51347.getClass(), "totalEasyHighScore", 517487974);
        setIntField(term51347, term51347.getClass(), "totalBasicHighScore", -1609952826);
        setIntField(term51347, term51347.getClass(), "totalAdvancedHighScore", -2135129588);
        setIntField(term51347, term51347.getClass(), "totalExpertHighScore", -1453667786);
        setIntField(term51347, term51347.getClass(), "totalMasterHighScore", 390534071);
        setIntField(term51347, term51347.getClass(), "totalReMasterHighScore", 134001300);
        setIntField(term51347, term51347.getClass(), "totalHighSync", -1533628114);
        setIntField(term51347, term51347.getClass(), "totalEasySync", 886396590);
        setIntField(term51347, term51347.getClass(), "totalBasicSync", -1864639476);
        setIntField(term51347, term51347.getClass(), "totalAdvancedSync", 233887874);
        setIntField(term51347, term51347.getClass(), "totalExpertSync", 1421452259);
        setIntField(term51347, term51347.getClass(), "totalMasterSync", 2051816737);
        setIntField(term51347, term51347.getClass(), "totalReMasterSync", 191145214);
        setIntField(term51347, term51347.getClass(), "playerRating", 597423188);
        setIntField(term51347, term51347.getClass(), "highestRating", 170448789);
        setIntField(term51347, term51347.getClass(), "rankAuthTailId", -105784895);
        setField(term51347, term51347.getClass(), "eventWatchedDate", "GMylOocLnB");
        setField(term51347, term51347.getClass(), "webLimitDate", "spOehuHwSl");
        setIntField(term51347, term51347.getClass(), "challengeTrackPhase", -190866786);
        setIntField(term51347, term51347.getClass(), "firstPlayBits", -1192542298);
        setField(term51347, term51347.getClass(), "lastPlayDate", "cyobgydTWP");
        setIntField(term51347, term51347.getClass(), "lastPlaceId", 1742896562);
        setField(term51347, term51347.getClass(), "lastPlaceName", "moHYQFfLnp");
        setIntField(term51347, term51347.getClass(), "lastRegionId", -1205180837);
        setField(term51347, term51347.getClass(), "lastRegionName", "BrPqlvIbEQ");
        setField(term51347, term51347.getClass(), "lastClientId", "JDTrhGRsDT");
        setField(term51347, term51347.getClass(), "lastCountryCode", "vHxsVQImjS");
        setIntField(term51347, term51347.getClass(), "eventPoint", 1782497174);
        setIntField(term51347, term51347.getClass(), "totalLv", 354412864);
        setIntField(term51347, term51347.getClass(), "lastLoginBonusDay", -1323183254);
        setIntField(term51347, term51347.getClass(), "lastSurvivalBonusDay", 366309576);
        setIntField(term51347, term51347.getClass(), "loginBonusLv", 202085518);
        setField(term51345, term51345.getClass(), "user", term51347);
        setIntField(term51345, term51345.getClass(), "soudEffect", -527355218);
        setIntField(term51345, term51345.getClass(), "mirrorMode", 1946726839);
        setIntField(term51345, term51345.getClass(), "guideSpeed", 185844905);
        setIntField(term51345, term51345.getClass(), "bgInfo", 1821594065);
        setIntField(term51345, term51345.getClass(), "brightness", 888820496);
        setIntField(term51345, term51345.getClass(), "isStarRot", 1745066397);
        setIntField(term51345, term51345.getClass(), "breakSe", 47561810);
        setIntField(term51345, term51345.getClass(), "slideSe", -1708484817);
        setIntField(term51345, term51345.getClass(), "hardJudge", 574829358);
        setIntField(term51345, term51345.getClass(), "isTagJump", 179028147);
        setIntField(term51345, term51345.getClass(), "breakSeVol", -1077334778);
        setIntField(term51345, term51345.getClass(), "slideSeVol", -845040092);
        setIntField(term51345, term51345.getClass(), "isUpperDisp", -1659873585);
        setIntField(term51345, term51345.getClass(), "trackSkip", 1881072097);
        setIntField(term51345, term51345.getClass(), "optionMode", 1677550181);
        setIntField(term51345, term51345.getClass(), "simpleOptionParam", 1710291513);
        setIntField(term51345, term51345.getClass(), "adjustTiming", -464025782);
        setIntField(term51345, term51345.getClass(), "dispTiming", -1392716182);
        setIntField(term51345, term51345.getClass(), "timingPos", -251208414);
        setIntField(term51345, term51345.getClass(), "ansVol", 2058785706);
        setIntField(term51345, term51345.getClass(), "noteVol", -1996745891);
        setIntField(term51345, term51345.getClass(), "dmgVol", 615988012);
        setIntField(term51345, term51345.getClass(), "appealFlame", -2129409800);
        setIntField(term51345, term51345.getClass(), "isFeverDisp", -522844088);
        setIntField(term51345, term51345.getClass(), "dispJudge", 1867429949);
        setIntField(term51345, term51345.getClass(), "judgePos", 1323279910);
        setIntField(term51345, term51345.getClass(), "ratingGuard", 1526554078);
        setIntField(term51345, term51345.getClass(), "selectChara", 119754400);
        setIntField(term51345, term51345.getClass(), "sortType", -1149597715);
        setIntField(term51345, term51345.getClass(), "filterGenre", 1709518907);
        setIntField(term51345, term51345.getClass(), "filterLevel", -1687052168);
        setIntField(term51345, term51345.getClass(), "filterRank", -2097023139);
        setIntField(term51345, term51345.getClass(), "filterVersion", -1867947821);
        setIntField(term51345, term51345.getClass(), "filterRec", 561665845);
        setIntField(term51345, term51345.getClass(), "filterFullCombo", -283888175);
        setIntField(term51345, term51345.getClass(), "filterAllPerfect", 277022954);
        setIntField(term51345, term51345.getClass(), "filterDifficulty", -1539323257);
        setIntField(term51345, term51345.getClass(), "filterFullSync", -1696039925);
        setIntField(term51345, term51345.getClass(), "filterReMaster", 741097031);
        setIntField(term51345, term51345.getClass(), "filterMaxFever", -1525517989);
        setIntField(term51345, term51345.getClass(), "finalSelectId", -1137095698);
        setIntField(term51345, term51345.getClass(), "finalSelectCategory", -1037663898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term51345, args);
    }

};


