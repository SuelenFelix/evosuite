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

public class UserData_getPlayCount_14694001410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2641;

    public UserData_getPlayCount_14694001410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2645 = new Long(-2813493605142626659L);
        term2641 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term2643 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2674 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2641, term2641.getClass(), "id", 8428634514691209827L);
        setLongField(term2643, term2643.getClass(), "id", -2585684163342970173L);
        setField(term2643, term2643.getClass(), "extId", term2645);
        setField(term2643, term2643.getClass(), "luid", "swZVeJAxjt");
        setIntField(term2660, term2660.getClass(), "year", 2014);
        setShortField(term2660, term2660.getClass(), "month", (short) 7);
        setShortField(term2660, term2660.getClass(), "day", (short) 13);
        setField(term2659, term2659.getClass(), "date", term2660);
        setByteField(term2664, term2664.getClass(), "hour", (byte) 21);
        setByteField(term2664, term2664.getClass(), "minute", (byte) 46);
        setByteField(term2664, term2664.getClass(), "second", (byte) 0);
        setIntField(term2664, term2664.getClass(), "nano", 887884128);
        setField(term2659, term2659.getClass(), "time", term2664);
        setField(term2643, term2643.getClass(), "registerTime", term2659);
        setIntField(term2670, term2670.getClass(), "year", 2023);
        setShortField(term2670, term2670.getClass(), "month", (short) 3);
        setShortField(term2670, term2670.getClass(), "day", (short) 7);
        setField(term2669, term2669.getClass(), "date", term2670);
        setByteField(term2674, term2674.getClass(), "hour", (byte) 21);
        setByteField(term2674, term2674.getClass(), "minute", (byte) 15);
        setByteField(term2674, term2674.getClass(), "second", (byte) 43);
        setIntField(term2674, term2674.getClass(), "nano", 639721472);
        setField(term2669, term2669.getClass(), "time", term2674);
        setField(term2643, term2643.getClass(), "accessTime", term2669);
        setField(term2641, term2641.getClass(), "card", term2643);
        setIntField(term2641, term2641.getClass(), "lastDataVersion", -544382127);
        setField(term2641, term2641.getClass(), "userName", "xOcJIiQQDu");
        setIntField(term2641, term2641.getClass(), "point", -1830198043);
        setIntField(term2641, term2641.getClass(), "totalPoint", -439048495);
        setIntField(term2641, term2641.getClass(), "iconId", -1849105286);
        setIntField(term2641, term2641.getClass(), "nameplateId", 1334483645);
        setIntField(term2641, term2641.getClass(), "frameId", 917513193);
        setIntField(term2641, term2641.getClass(), "trophyId", 787278105);
        setIntField(term2641, term2641.getClass(), "playCount", -2063843486);
        setIntField(term2641, term2641.getClass(), "playVsCount", 833762980);
        setIntField(term2641, term2641.getClass(), "playSyncCount", 320711637);
        setIntField(term2641, term2641.getClass(), "winCount", 1241164745);
        setIntField(term2641, term2641.getClass(), "helpCount", 1723148410);
        setIntField(term2641, term2641.getClass(), "comboCount", -920797484);
        setIntField(term2641, term2641.getClass(), "feverCount", -1631697577);
        setIntField(term2641, term2641.getClass(), "totalHiScore", 765731371);
        setIntField(term2641, term2641.getClass(), "totalEasyHighScore", -1703035419);
        setIntField(term2641, term2641.getClass(), "totalBasicHighScore", 765766290);
        setIntField(term2641, term2641.getClass(), "totalAdvancedHighScore", -1284825282);
        setIntField(term2641, term2641.getClass(), "totalExpertHighScore", -1941343035);
        setIntField(term2641, term2641.getClass(), "totalMasterHighScore", 947897214);
        setIntField(term2641, term2641.getClass(), "totalReMasterHighScore", 1496340209);
        setIntField(term2641, term2641.getClass(), "totalHighSync", -1748391876);
        setIntField(term2641, term2641.getClass(), "totalEasySync", 43258317);
        setIntField(term2641, term2641.getClass(), "totalBasicSync", 1707220033);
        setIntField(term2641, term2641.getClass(), "totalAdvancedSync", -1792504217);
        setIntField(term2641, term2641.getClass(), "totalExpertSync", 1824538861);
        setIntField(term2641, term2641.getClass(), "totalMasterSync", 499519708);
        setIntField(term2641, term2641.getClass(), "totalReMasterSync", 1501165033);
        setIntField(term2641, term2641.getClass(), "playerRating", 510162332);
        setIntField(term2641, term2641.getClass(), "highestRating", 888506903);
        setIntField(term2641, term2641.getClass(), "rankAuthTailId", 200252898);
        setField(term2641, term2641.getClass(), "eventWatchedDate", "GVizqqzXpy");
        setField(term2641, term2641.getClass(), "webLimitDate", "JqXGgAhZPl");
        setIntField(term2641, term2641.getClass(), "challengeTrackPhase", -1831826725);
        setIntField(term2641, term2641.getClass(), "firstPlayBits", 752152965);
        setField(term2641, term2641.getClass(), "lastPlayDate", "jiKYgYHqIS");
        setIntField(term2641, term2641.getClass(), "lastPlaceId", -1577069773);
        setField(term2641, term2641.getClass(), "lastPlaceName", "DfISiziTgG");
        setIntField(term2641, term2641.getClass(), "lastRegionId", -266625190);
        setField(term2641, term2641.getClass(), "lastRegionName", "XqgfKFvPSD");
        setField(term2641, term2641.getClass(), "lastClientId", "JiVRgTZvKc");
        setField(term2641, term2641.getClass(), "lastCountryCode", "XPKmummaqg");
        setIntField(term2641, term2641.getClass(), "eventPoint", 489201218);
        setIntField(term2641, term2641.getClass(), "totalLv", 464181937);
        setIntField(term2641, term2641.getClass(), "lastLoginBonusDay", -1455526612);
        setIntField(term2641, term2641.getClass(), "lastSurvivalBonusDay", -941356098);
        setIntField(term2641, term2641.getClass(), "loginBonusLv", -201517446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term2641, args);
    }

};


