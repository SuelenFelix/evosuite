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

public class UserData_getTotalLv_18093878346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12145;

    public UserData_getTotalLv_18093878346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12149 = new Long(-2170847986967241072L);
        term12145 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term12147 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12168 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12178 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12145, term12145.getClass(), "id", -2177368829816872572L);
        setLongField(term12147, term12147.getClass(), "id", -8463029266761149071L);
        setField(term12147, term12147.getClass(), "extId", term12149);
        setField(term12147, term12147.getClass(), "luid", "cdHYQDgUZR");
        setIntField(term12164, term12164.getClass(), "year", 2021);
        setShortField(term12164, term12164.getClass(), "month", (short) 4);
        setShortField(term12164, term12164.getClass(), "day", (short) 26);
        setField(term12163, term12163.getClass(), "date", term12164);
        setByteField(term12168, term12168.getClass(), "hour", (byte) 11);
        setByteField(term12168, term12168.getClass(), "minute", (byte) 34);
        setByteField(term12168, term12168.getClass(), "second", (byte) 15);
        setIntField(term12168, term12168.getClass(), "nano", 638206023);
        setField(term12163, term12163.getClass(), "time", term12168);
        setField(term12147, term12147.getClass(), "registerTime", term12163);
        setIntField(term12174, term12174.getClass(), "year", 2013);
        setShortField(term12174, term12174.getClass(), "month", (short) 9);
        setShortField(term12174, term12174.getClass(), "day", (short) 13);
        setField(term12173, term12173.getClass(), "date", term12174);
        setByteField(term12178, term12178.getClass(), "hour", (byte) 14);
        setByteField(term12178, term12178.getClass(), "minute", (byte) 36);
        setByteField(term12178, term12178.getClass(), "second", (byte) 59);
        setIntField(term12178, term12178.getClass(), "nano", 363124001);
        setField(term12173, term12173.getClass(), "time", term12178);
        setField(term12147, term12147.getClass(), "accessTime", term12173);
        setField(term12145, term12145.getClass(), "card", term12147);
        setIntField(term12145, term12145.getClass(), "lastDataVersion", -1498422654);
        setField(term12145, term12145.getClass(), "userName", "KAORSSPSeV");
        setIntField(term12145, term12145.getClass(), "point", -1499829233);
        setIntField(term12145, term12145.getClass(), "totalPoint", -888855662);
        setIntField(term12145, term12145.getClass(), "iconId", -1483966656);
        setIntField(term12145, term12145.getClass(), "nameplateId", -334260786);
        setIntField(term12145, term12145.getClass(), "frameId", -765890956);
        setIntField(term12145, term12145.getClass(), "trophyId", -214452542);
        setIntField(term12145, term12145.getClass(), "playCount", -21429773);
        setIntField(term12145, term12145.getClass(), "playVsCount", 1774728742);
        setIntField(term12145, term12145.getClass(), "playSyncCount", -1822211508);
        setIntField(term12145, term12145.getClass(), "winCount", -177243872);
        setIntField(term12145, term12145.getClass(), "helpCount", 1485047282);
        setIntField(term12145, term12145.getClass(), "comboCount", 1624190794);
        setIntField(term12145, term12145.getClass(), "feverCount", -773608881);
        setIntField(term12145, term12145.getClass(), "totalHiScore", -1642688455);
        setIntField(term12145, term12145.getClass(), "totalEasyHighScore", -1184558215);
        setIntField(term12145, term12145.getClass(), "totalBasicHighScore", 2123688338);
        setIntField(term12145, term12145.getClass(), "totalAdvancedHighScore", -1051941387);
        setIntField(term12145, term12145.getClass(), "totalExpertHighScore", -640763660);
        setIntField(term12145, term12145.getClass(), "totalMasterHighScore", -1189468129);
        setIntField(term12145, term12145.getClass(), "totalReMasterHighScore", -1099664830);
        setIntField(term12145, term12145.getClass(), "totalHighSync", 873502011);
        setIntField(term12145, term12145.getClass(), "totalEasySync", -2004575734);
        setIntField(term12145, term12145.getClass(), "totalBasicSync", 1491468856);
        setIntField(term12145, term12145.getClass(), "totalAdvancedSync", 962385185);
        setIntField(term12145, term12145.getClass(), "totalExpertSync", 2146718886);
        setIntField(term12145, term12145.getClass(), "totalMasterSync", -985577036);
        setIntField(term12145, term12145.getClass(), "totalReMasterSync", 802539130);
        setIntField(term12145, term12145.getClass(), "playerRating", 2105146188);
        setIntField(term12145, term12145.getClass(), "highestRating", -862415480);
        setIntField(term12145, term12145.getClass(), "rankAuthTailId", 312605349);
        setField(term12145, term12145.getClass(), "eventWatchedDate", "UimMMORkzd");
        setField(term12145, term12145.getClass(), "webLimitDate", "huVIXUWLtI");
        setIntField(term12145, term12145.getClass(), "challengeTrackPhase", -402072606);
        setIntField(term12145, term12145.getClass(), "firstPlayBits", -477355193);
        setField(term12145, term12145.getClass(), "lastPlayDate", "vhKzFyKPOT");
        setIntField(term12145, term12145.getClass(), "lastPlaceId", 168425089);
        setField(term12145, term12145.getClass(), "lastPlaceName", "nQhIgWXdRc");
        setIntField(term12145, term12145.getClass(), "lastRegionId", -571931590);
        setField(term12145, term12145.getClass(), "lastRegionName", "EusenEbIoF");
        setField(term12145, term12145.getClass(), "lastClientId", "SScVQYSvWH");
        setField(term12145, term12145.getClass(), "lastCountryCode", "MnovcqFhCl");
        setIntField(term12145, term12145.getClass(), "eventPoint", 37757400);
        setIntField(term12145, term12145.getClass(), "totalLv", -1632221612);
        setIntField(term12145, term12145.getClass(), "lastLoginBonusDay", 1545314376);
        setIntField(term12145, term12145.getClass(), "lastSurvivalBonusDay", 437959151);
        setIntField(term12145, term12145.getClass(), "loginBonusLv", 27780241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalLv", argTypes, term12145, args);
    }

};


