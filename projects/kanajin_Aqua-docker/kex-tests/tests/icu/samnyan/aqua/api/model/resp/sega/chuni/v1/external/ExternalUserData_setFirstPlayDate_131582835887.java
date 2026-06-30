package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_setFirstPlayDate_131582835887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35120;
     Object term35371;

    public ExternalUserData_setFirstPlayDate_131582835887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35120 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term35145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35211 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35259 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35305 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term35120, term35120.getClass(), "accessCode", "QZfhwDBzyR");
        setField(term35120, term35120.getClass(), "userName", "HvnMmAOZev");
        setIntField(term35146, term35146.getClass(), "year", 2018);
        setShortField(term35146, term35146.getClass(), "month", (short) 1);
        setShortField(term35146, term35146.getClass(), "day", (short) 7);
        setField(term35145, term35145.getClass(), "date", term35146);
        setByteField(term35150, term35150.getClass(), "hour", (byte) 5);
        setByteField(term35150, term35150.getClass(), "minute", (byte) 42);
        setByteField(term35150, term35150.getClass(), "second", (byte) 49);
        setIntField(term35150, term35150.getClass(), "nano", 291814792);
        setField(term35145, term35145.getClass(), "time", term35150);
        setField(term35120, term35120.getClass(), "lastLoginDate", term35145);
        setBooleanField(term35120, term35120.getClass(), "isWebJoin", true);
        setField(term35120, term35120.getClass(), "webLimitDate", "JTPAQsfRtT");
        setIntField(term35120, term35120.getClass(), "level", -21429773);
        setIntField(term35120, term35120.getClass(), "reincarnationNum", 1774728742);
        setField(term35120, term35120.getClass(), "exp", "otxkkKfDfl");
        setLongField(term35120, term35120.getClass(), "point", 5857854340777182167L);
        setLongField(term35120, term35120.getClass(), "totalPoint", 3660520943100987842L);
        setIntField(term35120, term35120.getClass(), "playCount", -1822211508);
        setIntField(term35120, term35120.getClass(), "multiPlayCount", -177243872);
        setIntField(term35120, term35120.getClass(), "multiWinCount", 1485047282);
        setIntField(term35120, term35120.getClass(), "requestResCount", 1624190794);
        setIntField(term35120, term35120.getClass(), "acceptResCount", -773608881);
        setIntField(term35120, term35120.getClass(), "successResCount", -1642688455);
        setIntField(term35120, term35120.getClass(), "playerRating", -1184558215);
        setIntField(term35120, term35120.getClass(), "highestRating", 2123688338);
        setIntField(term35120, term35120.getClass(), "nameplateId", -1051941387);
        setIntField(term35120, term35120.getClass(), "frameId", -640763660);
        setIntField(term35120, term35120.getClass(), "characterId", -1189468129);
        setIntField(term35120, term35120.getClass(), "trophyId", -1099664830);
        setIntField(term35120, term35120.getClass(), "playedTutorialBit", 873502011);
        setIntField(term35120, term35120.getClass(), "firstTutorialCancelNum", -2004575734);
        setIntField(term35120, term35120.getClass(), "masterTutorialCancelNum", 1491468856);
        setIntField(term35120, term35120.getClass(), "totalRepertoireCount", 962385185);
        setIntField(term35120, term35120.getClass(), "totalMapNum", 2146718886);
        setLongField(term35120, term35120.getClass(), "totalHiScore", -8211240904293846981L);
        setLongField(term35120, term35120.getClass(), "totalBasicHighScore", 3535528164828723056L);
        setLongField(term35120, term35120.getClass(), "totalAdvancedHighScore", 4036794646678680547L);
        setLongField(term35120, term35120.getClass(), "totalExpertHighScore", 4006388896509492239L);
        setLongField(term35120, term35120.getClass(), "totalMasterHighScore", -6314099457945626605L);
        setIntField(term35207, term35207.getClass(), "year", 2022);
        setShortField(term35207, term35207.getClass(), "month", (short) 7);
        setShortField(term35207, term35207.getClass(), "day", (short) 9);
        setField(term35206, term35206.getClass(), "date", term35207);
        setByteField(term35211, term35211.getClass(), "hour", (byte) 21);
        setByteField(term35211, term35211.getClass(), "minute", (byte) 48);
        setByteField(term35211, term35211.getClass(), "second", (byte) 58);
        setIntField(term35211, term35211.getClass(), "nano", 579553780);
        setField(term35206, term35206.getClass(), "time", term35211);
        setField(term35120, term35120.getClass(), "eventWatchedDate", term35206);
        setIntField(term35120, term35120.getClass(), "friendCount", -985577036);
        setBooleanField(term35120, term35120.getClass(), "isMaimai", true);
        setField(term35120, term35120.getClass(), "firstGameId", "bqIuFFFwnP");
        setField(term35120, term35120.getClass(), "firstRomVersion", "hDxvvVgGlk");
        setField(term35120, term35120.getClass(), "firstDataVersion", "XdjSvjaTqk");
        setIntField(term35255, term35255.getClass(), "year", 2017);
        setShortField(term35255, term35255.getClass(), "month", (short) 5);
        setShortField(term35255, term35255.getClass(), "day", (short) 2);
        setField(term35254, term35254.getClass(), "date", term35255);
        setByteField(term35259, term35259.getClass(), "hour", (byte) 7);
        setByteField(term35259, term35259.getClass(), "minute", (byte) 24);
        setByteField(term35259, term35259.getClass(), "second", (byte) 51);
        setIntField(term35259, term35259.getClass(), "nano", 706502334);
        setField(term35254, term35254.getClass(), "time", term35259);
        setField(term35120, term35120.getClass(), "firstPlayDate", term35254);
        setField(term35120, term35120.getClass(), "lastGameId", "ukrlYVcvsg");
        setField(term35120, term35120.getClass(), "lastRomVersion", "cpjqTCNflQ");
        setField(term35120, term35120.getClass(), "lastDataVersion", "wiYGATEfmw");
        setIntField(term35301, term35301.getClass(), "year", 2026);
        setShortField(term35301, term35301.getClass(), "month", (short) 11);
        setShortField(term35301, term35301.getClass(), "day", (short) 1);
        setField(term35300, term35300.getClass(), "date", term35301);
        setByteField(term35305, term35305.getClass(), "hour", (byte) 9);
        setByteField(term35305, term35305.getClass(), "minute", (byte) 4);
        setByteField(term35305, term35305.getClass(), "second", (byte) 25);
        setIntField(term35305, term35305.getClass(), "nano", 272299951);
        setField(term35300, term35300.getClass(), "time", term35305);
        setField(term35120, term35120.getClass(), "lastPlayDate", term35300);
        setIntField(term35120, term35120.getClass(), "lastPlaceId", 802539130);
        setField(term35120, term35120.getClass(), "lastPlaceName", "FiALSqneIg");
        setField(term35120, term35120.getClass(), "lastRegionId", "lGVACSQceQ");
        setField(term35120, term35120.getClass(), "lastRegionName", "jpgWRbSvyQ");
        setField(term35120, term35120.getClass(), "lastAllNetId", "tFMlYmPEBX");
        setField(term35120, term35120.getClass(), "lastClientId", "ljkZxGNgjZ");
        term35371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35376 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term35372, term35372.getClass(), "year", 2017);
        setShortField(term35372, term35372.getClass(), "month", (short) 11);
        setShortField(term35372, term35372.getClass(), "day", (short) 19);
        setField(term35371, term35371.getClass(), "date", term35372);
        setByteField(term35376, term35376.getClass(), "hour", (byte) 2);
        setByteField(term35376, term35376.getClass(), "minute", (byte) 52);
        setByteField(term35376, term35376.getClass(), "second", (byte) 15);
        setIntField(term35376, term35376.getClass(), "nano", 625778933);
        setField(term35371, term35371.getClass(), "time", term35376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term35371;
        callMethod(klass, "setFirstPlayDate", argTypes, term35120, args);
    }

};


