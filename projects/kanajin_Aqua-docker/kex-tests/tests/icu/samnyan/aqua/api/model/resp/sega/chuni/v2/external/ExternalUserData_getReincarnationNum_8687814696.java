package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getReincarnationNum_8687814696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2407;

    public ExternalUserData_getReincarnationNum_8687814696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2407 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term2432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2437 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2494 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2498 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2592 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2407, term2407.getClass(), "accessCode", "swZVeJAxjt");
        setField(term2407, term2407.getClass(), "userName", "xOcJIiQQDu");
        setIntField(term2433, term2433.getClass(), "year", 2025);
        setShortField(term2433, term2433.getClass(), "month", (short) 3);
        setShortField(term2433, term2433.getClass(), "day", (short) 9);
        setField(term2432, term2432.getClass(), "date", term2433);
        setByteField(term2437, term2437.getClass(), "hour", (byte) 5);
        setByteField(term2437, term2437.getClass(), "minute", (byte) 49);
        setByteField(term2437, term2437.getClass(), "second", (byte) 12);
        setIntField(term2437, term2437.getClass(), "nano", 791695028);
        setField(term2432, term2432.getClass(), "time", term2437);
        setField(term2407, term2407.getClass(), "lastLoginDate", term2432);
        setBooleanField(term2407, term2407.getClass(), "isWebJoin", false);
        setField(term2407, term2407.getClass(), "webLimitDate", "GVizqqzXpy");
        setIntField(term2407, term2407.getClass(), "level", -375014958);
        setIntField(term2407, term2407.getClass(), "reincarnationNum", 1107176718);
        setField(term2407, term2407.getClass(), "exp", "JqXGgAhZPl");
        setLongField(term2407, term2407.getClass(), "point", -6292278961887936280L);
        setLongField(term2407, term2407.getClass(), "totalPoint", -6645965768855543712L);
        setIntField(term2407, term2407.getClass(), "playCount", 480137250);
        setIntField(term2407, term2407.getClass(), "multiPlayCount", -341152642);
        setIntField(term2407, term2407.getClass(), "multiWinCount", -2015854073);
        setIntField(term2407, term2407.getClass(), "requestResCount", 538259104);
        setIntField(term2407, term2407.getClass(), "acceptResCount", 96566506);
        setIntField(term2407, term2407.getClass(), "successResCount", -343325701);
        setIntField(term2407, term2407.getClass(), "playerRating", 107945604);
        setIntField(term2407, term2407.getClass(), "highestRating", -1963464809);
        setIntField(term2407, term2407.getClass(), "nameplateId", 71190297);
        setIntField(term2407, term2407.getClass(), "frameId", 1202361360);
        setIntField(term2407, term2407.getClass(), "characterId", -2015048153);
        setIntField(term2407, term2407.getClass(), "trophyId", -2063457669);
        setIntField(term2407, term2407.getClass(), "playedTutorialBit", -1222006000);
        setIntField(term2407, term2407.getClass(), "firstTutorialCancelNum", 2095798786);
        setIntField(term2407, term2407.getClass(), "masterTutorialCancelNum", -1565502840);
        setIntField(term2407, term2407.getClass(), "totalRepertoireCount", 344323424);
        setIntField(term2407, term2407.getClass(), "totalMapNum", 9726679);
        setLongField(term2407, term2407.getClass(), "totalHiScore", 4784595517102746672L);
        setLongField(term2407, term2407.getClass(), "totalBasicHighScore", -7612550318181586304L);
        setLongField(term2407, term2407.getClass(), "totalAdvancedHighScore", -2170847986967241072L);
        setLongField(term2407, term2407.getClass(), "totalExpertHighScore", 4044358158040652353L);
        setLongField(term2407, term2407.getClass(), "totalMasterHighScore", -4443169559037975007L);
        setIntField(term2494, term2494.getClass(), "year", 2023);
        setShortField(term2494, term2494.getClass(), "month", (short) 9);
        setShortField(term2494, term2494.getClass(), "day", (short) 23);
        setField(term2493, term2493.getClass(), "date", term2494);
        setByteField(term2498, term2498.getClass(), "hour", (byte) 12);
        setByteField(term2498, term2498.getClass(), "minute", (byte) 55);
        setByteField(term2498, term2498.getClass(), "second", (byte) 58);
        setIntField(term2498, term2498.getClass(), "nano", 159178396);
        setField(term2493, term2493.getClass(), "time", term2498);
        setField(term2407, term2407.getClass(), "eventWatchedDate", term2493);
        setIntField(term2407, term2407.getClass(), "friendCount", -25637976);
        setBooleanField(term2407, term2407.getClass(), "isMaimai", true);
        setField(term2407, term2407.getClass(), "firstGameId", "jiKYgYHqIS");
        setField(term2407, term2407.getClass(), "firstRomVersion", "DfISiziTgG");
        setField(term2407, term2407.getClass(), "firstDataVersion", "XqgfKFvPSD");
        setIntField(term2542, term2542.getClass(), "year", 2028);
        setShortField(term2542, term2542.getClass(), "month", (short) 10);
        setShortField(term2542, term2542.getClass(), "day", (short) 1);
        setField(term2541, term2541.getClass(), "date", term2542);
        setByteField(term2546, term2546.getClass(), "hour", (byte) 17);
        setByteField(term2546, term2546.getClass(), "minute", (byte) 29);
        setByteField(term2546, term2546.getClass(), "second", (byte) 30);
        setIntField(term2546, term2546.getClass(), "nano", 845472306);
        setField(term2541, term2541.getClass(), "time", term2546);
        setField(term2407, term2407.getClass(), "firstPlayDate", term2541);
        setField(term2407, term2407.getClass(), "lastGameId", "JiVRgTZvKc");
        setField(term2407, term2407.getClass(), "lastRomVersion", "XPKmummaqg");
        setField(term2407, term2407.getClass(), "lastDataVersion", "BKLfkLiZTH");
        setIntField(term2588, term2588.getClass(), "year", 2027);
        setShortField(term2588, term2588.getClass(), "month", (short) 2);
        setShortField(term2588, term2588.getClass(), "day", (short) 19);
        setField(term2587, term2587.getClass(), "date", term2588);
        setByteField(term2592, term2592.getClass(), "hour", (byte) 17);
        setByteField(term2592, term2592.getClass(), "minute", (byte) 37);
        setByteField(term2592, term2592.getClass(), "second", (byte) 27);
        setIntField(term2592, term2592.getClass(), "nano", 920380537);
        setField(term2587, term2587.getClass(), "time", term2592);
        setField(term2407, term2407.getClass(), "lastPlayDate", term2587);
        setIntField(term2407, term2407.getClass(), "lastPlaceId", 1555897383);
        setField(term2407, term2407.getClass(), "lastPlaceName", "SPpkrGcPRr");
        setField(term2407, term2407.getClass(), "lastRegionId", "sEccwbJKYE");
        setField(term2407, term2407.getClass(), "lastRegionName", "AWRooQKkdW");
        setField(term2407, term2407.getClass(), "lastAllNetId", "vjxIhXHxGR");
        setField(term2407, term2407.getClass(), "lastClientId", "QXzGXbEXMu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReincarnationNum", argTypes, term2407, args);
    }

};


