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

public class ExternalUserData_getLevel_11531656465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2006;

    public ExternalUserData_getLevel_11531656465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2006 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term2031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2097 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2145 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2191 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2006, term2006.getClass(), "accessCode", "MAcUBcBckh");
        setField(term2006, term2006.getClass(), "userName", "oVgzLbrsFr");
        setIntField(term2032, term2032.getClass(), "year", 2014);
        setShortField(term2032, term2032.getClass(), "month", (short) 7);
        setShortField(term2032, term2032.getClass(), "day", (short) 13);
        setField(term2031, term2031.getClass(), "date", term2032);
        setByteField(term2036, term2036.getClass(), "hour", (byte) 21);
        setByteField(term2036, term2036.getClass(), "minute", (byte) 46);
        setByteField(term2036, term2036.getClass(), "second", (byte) 0);
        setIntField(term2036, term2036.getClass(), "nano", 887884128);
        setField(term2031, term2031.getClass(), "time", term2036);
        setField(term2006, term2006.getClass(), "lastLoginDate", term2031);
        setBooleanField(term2006, term2006.getClass(), "isWebJoin", false);
        setField(term2006, term2006.getClass(), "webLimitDate", "vQVyKLdtaz");
        setIntField(term2006, term2006.getClass(), "level", -1210583429);
        setIntField(term2006, term2006.getClass(), "reincarnationNum", -663691365);
        setField(term2006, term2006.getClass(), "exp", "OWKQODBLzb");
        setLongField(term2006, term2006.getClass(), "point", 1233889271256172047L);
        setLongField(term2006, term2006.getClass(), "totalPoint", 6617340557564669657L);
        setIntField(term2006, term2006.getClass(), "playCount", 339854490);
        setIntField(term2006, term2006.getClass(), "multiPlayCount", -615654495);
        setIntField(term2006, term2006.getClass(), "multiWinCount", -1476117762);
        setIntField(term2006, term2006.getClass(), "requestResCount", -341962980);
        setIntField(term2006, term2006.getClass(), "acceptResCount", 1532716628);
        setIntField(term2006, term2006.getClass(), "successResCount", -1801760683);
        setIntField(term2006, term2006.getClass(), "playerRating", 1141317871);
        setIntField(term2006, term2006.getClass(), "highestRating", 890669485);
        setIntField(term2006, term2006.getClass(), "nameplateId", 691577392);
        setIntField(term2006, term2006.getClass(), "frameId", -893623680);
        setIntField(term2006, term2006.getClass(), "characterId", -1963434938);
        setIntField(term2006, term2006.getClass(), "trophyId", 906181092);
        setIntField(term2006, term2006.getClass(), "playedTutorialBit", 1045657203);
        setIntField(term2006, term2006.getClass(), "firstTutorialCancelNum", 1386130016);
        setIntField(term2006, term2006.getClass(), "masterTutorialCancelNum", 1072005683);
        setIntField(term2006, term2006.getClass(), "totalRepertoireCount", 1861318859);
        setIntField(term2006, term2006.getClass(), "totalMapNum", 1474524152);
        setLongField(term2006, term2006.getClass(), "totalHiScore", 1439298019805881866L);
        setLongField(term2006, term2006.getClass(), "totalBasicHighScore", -8708192233349544946L);
        setLongField(term2006, term2006.getClass(), "totalAdvancedHighScore", 5907001541142728739L);
        setLongField(term2006, term2006.getClass(), "totalExpertHighScore", 4178434741742309755L);
        setLongField(term2006, term2006.getClass(), "totalMasterHighScore", -2068172595987555756L);
        setIntField(term2093, term2093.getClass(), "year", 2023);
        setShortField(term2093, term2093.getClass(), "month", (short) 3);
        setShortField(term2093, term2093.getClass(), "day", (short) 7);
        setField(term2092, term2092.getClass(), "date", term2093);
        setByteField(term2097, term2097.getClass(), "hour", (byte) 21);
        setByteField(term2097, term2097.getClass(), "minute", (byte) 15);
        setByteField(term2097, term2097.getClass(), "second", (byte) 43);
        setIntField(term2097, term2097.getClass(), "nano", 639721472);
        setField(term2092, term2092.getClass(), "time", term2097);
        setField(term2006, term2006.getClass(), "eventWatchedDate", term2092);
        setIntField(term2006, term2006.getClass(), "friendCount", 568954359);
        setBooleanField(term2006, term2006.getClass(), "isMaimai", true);
        setField(term2006, term2006.getClass(), "firstGameId", "wGmYcqUkgE");
        setField(term2006, term2006.getClass(), "firstRomVersion", "idgaQsnJpQ");
        setField(term2006, term2006.getClass(), "firstDataVersion", "VgZnGoIFwQ");
        setIntField(term2141, term2141.getClass(), "year", 2015);
        setShortField(term2141, term2141.getClass(), "month", (short) 3);
        setShortField(term2141, term2141.getClass(), "day", (short) 10);
        setField(term2140, term2140.getClass(), "date", term2141);
        setByteField(term2145, term2145.getClass(), "hour", (byte) 23);
        setByteField(term2145, term2145.getClass(), "minute", (byte) 34);
        setByteField(term2145, term2145.getClass(), "second", (byte) 44);
        setIntField(term2145, term2145.getClass(), "nano", 587322824);
        setField(term2140, term2140.getClass(), "time", term2145);
        setField(term2006, term2006.getClass(), "firstPlayDate", term2140);
        setField(term2006, term2006.getClass(), "lastGameId", "jUbSRrkrYZ");
        setField(term2006, term2006.getClass(), "lastRomVersion", "bWWfajKbEX");
        setField(term2006, term2006.getClass(), "lastDataVersion", "cAPeiZHKGJ");
        setIntField(term2187, term2187.getClass(), "year", 2027);
        setShortField(term2187, term2187.getClass(), "month", (short) 8);
        setShortField(term2187, term2187.getClass(), "day", (short) 26);
        setField(term2186, term2186.getClass(), "date", term2187);
        setByteField(term2191, term2191.getClass(), "hour", (byte) 5);
        setByteField(term2191, term2191.getClass(), "minute", (byte) 11);
        setByteField(term2191, term2191.getClass(), "second", (byte) 9);
        setIntField(term2191, term2191.getClass(), "nano", 219245092);
        setField(term2186, term2186.getClass(), "time", term2191);
        setField(term2006, term2006.getClass(), "lastPlayDate", term2186);
        setIntField(term2006, term2006.getClass(), "lastPlaceId", 53410913);
        setField(term2006, term2006.getClass(), "lastPlaceName", "LvJFtLBaxj");
        setField(term2006, term2006.getClass(), "lastRegionId", "PHvxnGHptP");
        setField(term2006, term2006.getClass(), "lastRegionName", "TimdotUuNC");
        setField(term2006, term2006.getClass(), "lastAllNetId", "PkWMRdJcBb");
        setField(term2006, term2006.getClass(), "lastClientId", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term2006, args);
    }

};


