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

public class UserWebOption_getDispJudgeStyle_17158751245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38613;

    public UserWebOption_getDispJudgeStyle_17158751245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38619 = new Long(-1804015692891701666L);
        term38613 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term38615 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term38617 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term38633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38648 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term38613, term38613.getClass(), "id", 174253963298276221L);
        setLongField(term38615, term38615.getClass(), "id", 3713624957161771816L);
        setLongField(term38617, term38617.getClass(), "id", 6130232388739280211L);
        setField(term38617, term38617.getClass(), "extId", term38619);
        setField(term38617, term38617.getClass(), "luid", "CQYmAsjvPU");
        setIntField(term38634, term38634.getClass(), "year", 2010);
        setShortField(term38634, term38634.getClass(), "month", (short) 5);
        setShortField(term38634, term38634.getClass(), "day", (short) 19);
        setField(term38633, term38633.getClass(), "date", term38634);
        setByteField(term38638, term38638.getClass(), "hour", (byte) 12);
        setByteField(term38638, term38638.getClass(), "minute", (byte) 17);
        setByteField(term38638, term38638.getClass(), "second", (byte) 52);
        setIntField(term38638, term38638.getClass(), "nano", 273610077);
        setField(term38633, term38633.getClass(), "time", term38638);
        setField(term38617, term38617.getClass(), "registerTime", term38633);
        setIntField(term38644, term38644.getClass(), "year", 2017);
        setShortField(term38644, term38644.getClass(), "month", (short) 4);
        setShortField(term38644, term38644.getClass(), "day", (short) 5);
        setField(term38643, term38643.getClass(), "date", term38644);
        setByteField(term38648, term38648.getClass(), "hour", (byte) 15);
        setByteField(term38648, term38648.getClass(), "minute", (byte) 9);
        setByteField(term38648, term38648.getClass(), "second", (byte) 36);
        setIntField(term38648, term38648.getClass(), "nano", 504876449);
        setField(term38643, term38643.getClass(), "time", term38648);
        setField(term38617, term38617.getClass(), "accessTime", term38643);
        setField(term38615, term38615.getClass(), "card", term38617);
        setIntField(term38615, term38615.getClass(), "lastDataVersion", -556521634);
        setField(term38615, term38615.getClass(), "userName", "NNkIIFpxiB");
        setIntField(term38615, term38615.getClass(), "point", -904069976);
        setIntField(term38615, term38615.getClass(), "totalPoint", 1492540298);
        setIntField(term38615, term38615.getClass(), "iconId", 751340602);
        setIntField(term38615, term38615.getClass(), "nameplateId", 123770182);
        setIntField(term38615, term38615.getClass(), "frameId", -813178856);
        setIntField(term38615, term38615.getClass(), "trophyId", 1591732055);
        setIntField(term38615, term38615.getClass(), "playCount", -1580446775);
        setIntField(term38615, term38615.getClass(), "playVsCount", -1008507790);
        setIntField(term38615, term38615.getClass(), "playSyncCount", -1382203900);
        setIntField(term38615, term38615.getClass(), "winCount", -2140997236);
        setIntField(term38615, term38615.getClass(), "helpCount", -1868254835);
        setIntField(term38615, term38615.getClass(), "comboCount", -660465161);
        setIntField(term38615, term38615.getClass(), "feverCount", -967958435);
        setIntField(term38615, term38615.getClass(), "totalHiScore", 791509654);
        setIntField(term38615, term38615.getClass(), "totalEasyHighScore", -1695301446);
        setIntField(term38615, term38615.getClass(), "totalBasicHighScore", 579391144);
        setIntField(term38615, term38615.getClass(), "totalAdvancedHighScore", 858488872);
        setIntField(term38615, term38615.getClass(), "totalExpertHighScore", -218279934);
        setIntField(term38615, term38615.getClass(), "totalMasterHighScore", -689744296);
        setIntField(term38615, term38615.getClass(), "totalReMasterHighScore", 263038376);
        setIntField(term38615, term38615.getClass(), "totalHighSync", -631719292);
        setIntField(term38615, term38615.getClass(), "totalEasySync", -2119317714);
        setIntField(term38615, term38615.getClass(), "totalBasicSync", -1867952163);
        setIntField(term38615, term38615.getClass(), "totalAdvancedSync", -1770219455);
        setIntField(term38615, term38615.getClass(), "totalExpertSync", -993930773);
        setIntField(term38615, term38615.getClass(), "totalMasterSync", 1436841795);
        setIntField(term38615, term38615.getClass(), "totalReMasterSync", 248838167);
        setIntField(term38615, term38615.getClass(), "playerRating", 1957931763);
        setIntField(term38615, term38615.getClass(), "highestRating", -845283401);
        setIntField(term38615, term38615.getClass(), "rankAuthTailId", 1423298146);
        setField(term38615, term38615.getClass(), "eventWatchedDate", "sBmtvFPDso");
        setField(term38615, term38615.getClass(), "webLimitDate", "qsUIxrLolr");
        setIntField(term38615, term38615.getClass(), "challengeTrackPhase", 168549967);
        setIntField(term38615, term38615.getClass(), "firstPlayBits", 1631903694);
        setField(term38615, term38615.getClass(), "lastPlayDate", "IlQxArYcgB");
        setIntField(term38615, term38615.getClass(), "lastPlaceId", 483088872);
        setField(term38615, term38615.getClass(), "lastPlaceName", "lIgKCvCuoH");
        setIntField(term38615, term38615.getClass(), "lastRegionId", 157859356);
        setField(term38615, term38615.getClass(), "lastRegionName", "dHuWgRwLOm");
        setField(term38615, term38615.getClass(), "lastClientId", "PsTQDxNIld");
        setField(term38615, term38615.getClass(), "lastCountryCode", "uoBijJjvaj");
        setIntField(term38615, term38615.getClass(), "eventPoint", 1788509099);
        setIntField(term38615, term38615.getClass(), "totalLv", -407602685);
        setIntField(term38615, term38615.getClass(), "lastLoginBonusDay", -484929244);
        setIntField(term38615, term38615.getClass(), "lastSurvivalBonusDay", -1316734168);
        setIntField(term38615, term38615.getClass(), "loginBonusLv", 1973373652);
        setField(term38613, term38613.getClass(), "user", term38615);
        setBooleanField(term38613, term38613.getClass(), "isNetMember", true);
        setIntField(term38613, term38613.getClass(), "dispRate", 1574921912);
        setIntField(term38613, term38613.getClass(), "dispJudgeStyle", -1117910274);
        setIntField(term38613, term38613.getClass(), "dispRank", 759727183);
        setIntField(term38613, term38613.getClass(), "dispHomeRanker", 383595991);
        setIntField(term38613, term38613.getClass(), "dispTotalLv", 1736367900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispJudgeStyle", argTypes, term38613, args);
    }

};


