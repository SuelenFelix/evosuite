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

public class ExternalUserData_setFirstRomVersion_29445764485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34274;

    public ExternalUserData_setFirstRomVersion_29445764485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34274 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term34299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34413 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34459 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term34274, term34274.getClass(), "accessCode", "KKEcpYXNZV");
        setField(term34274, term34274.getClass(), "userName", "shLHFznysy");
        setIntField(term34300, term34300.getClass(), "year", 2026);
        setShortField(term34300, term34300.getClass(), "month", (short) 7);
        setShortField(term34300, term34300.getClass(), "day", (short) 18);
        setField(term34299, term34299.getClass(), "date", term34300);
        setByteField(term34304, term34304.getClass(), "hour", (byte) 14);
        setByteField(term34304, term34304.getClass(), "minute", (byte) 29);
        setByteField(term34304, term34304.getClass(), "second", (byte) 53);
        setIntField(term34304, term34304.getClass(), "nano", 285756900);
        setField(term34299, term34299.getClass(), "time", term34304);
        setField(term34274, term34274.getClass(), "lastLoginDate", term34299);
        setBooleanField(term34274, term34274.getClass(), "isWebJoin", false);
        setField(term34274, term34274.getClass(), "webLimitDate", "YCKIloBHLj");
        setIntField(term34274, term34274.getClass(), "level", 1677171453);
        setIntField(term34274, term34274.getClass(), "reincarnationNum", -2108979704);
        setField(term34274, term34274.getClass(), "exp", "qUWDhAeFJY");
        setLongField(term34274, term34274.getClass(), "point", -1486519351300660432L);
        setLongField(term34274, term34274.getClass(), "totalPoint", 4777103307547199454L);
        setIntField(term34274, term34274.getClass(), "playCount", 1629835601);
        setIntField(term34274, term34274.getClass(), "multiPlayCount", 1866184476);
        setIntField(term34274, term34274.getClass(), "multiWinCount", -17998574);
        setIntField(term34274, term34274.getClass(), "requestResCount", 145080354);
        setIntField(term34274, term34274.getClass(), "acceptResCount", -2087321012);
        setIntField(term34274, term34274.getClass(), "successResCount", -1613074612);
        setIntField(term34274, term34274.getClass(), "playerRating", 1054908502);
        setIntField(term34274, term34274.getClass(), "highestRating", -1226802566);
        setIntField(term34274, term34274.getClass(), "nameplateId", 1162813858);
        setIntField(term34274, term34274.getClass(), "frameId", 494596414);
        setIntField(term34274, term34274.getClass(), "characterId", 1226377461);
        setIntField(term34274, term34274.getClass(), "trophyId", -1540486514);
        setIntField(term34274, term34274.getClass(), "playedTutorialBit", 1471031478);
        setIntField(term34274, term34274.getClass(), "firstTutorialCancelNum", -334716487);
        setIntField(term34274, term34274.getClass(), "masterTutorialCancelNum", -1739012814);
        setIntField(term34274, term34274.getClass(), "totalRepertoireCount", 1989014880);
        setIntField(term34274, term34274.getClass(), "totalMapNum", -330280702);
        setLongField(term34274, term34274.getClass(), "totalHiScore", 6462632207326555041L);
        setLongField(term34274, term34274.getClass(), "totalBasicHighScore", -3188913050877092148L);
        setLongField(term34274, term34274.getClass(), "totalAdvancedHighScore", -6759247883224780481L);
        setLongField(term34274, term34274.getClass(), "totalExpertHighScore", -3724162247917461536L);
        setLongField(term34274, term34274.getClass(), "totalMasterHighScore", 7893661350133453338L);
        setIntField(term34361, term34361.getClass(), "year", 2012);
        setShortField(term34361, term34361.getClass(), "month", (short) 2);
        setShortField(term34361, term34361.getClass(), "day", (short) 2);
        setField(term34360, term34360.getClass(), "date", term34361);
        setByteField(term34365, term34365.getClass(), "hour", (byte) 4);
        setByteField(term34365, term34365.getClass(), "minute", (byte) 19);
        setByteField(term34365, term34365.getClass(), "second", (byte) 58);
        setIntField(term34365, term34365.getClass(), "nano", 550709112);
        setField(term34360, term34360.getClass(), "time", term34365);
        setField(term34274, term34274.getClass(), "eventWatchedDate", term34360);
        setIntField(term34274, term34274.getClass(), "friendCount", -1858425735);
        setBooleanField(term34274, term34274.getClass(), "isMaimai", true);
        setField(term34274, term34274.getClass(), "firstGameId", "wboNBMhRjP");
        setField(term34274, term34274.getClass(), "firstRomVersion", "HZODpafOGe");
        setField(term34274, term34274.getClass(), "firstDataVersion", "dUTYEKtTfQ");
        setIntField(term34409, term34409.getClass(), "year", 2028);
        setShortField(term34409, term34409.getClass(), "month", (short) 7);
        setShortField(term34409, term34409.getClass(), "day", (short) 4);
        setField(term34408, term34408.getClass(), "date", term34409);
        setByteField(term34413, term34413.getClass(), "hour", (byte) 13);
        setByteField(term34413, term34413.getClass(), "minute", (byte) 43);
        setByteField(term34413, term34413.getClass(), "second", (byte) 17);
        setIntField(term34413, term34413.getClass(), "nano", 949713407);
        setField(term34408, term34408.getClass(), "time", term34413);
        setField(term34274, term34274.getClass(), "firstPlayDate", term34408);
        setField(term34274, term34274.getClass(), "lastGameId", "HUtbHklGel");
        setField(term34274, term34274.getClass(), "lastRomVersion", "QbfKDAwhSB");
        setField(term34274, term34274.getClass(), "lastDataVersion", "ckTRHEIcCK");
        setIntField(term34455, term34455.getClass(), "year", 2013);
        setShortField(term34455, term34455.getClass(), "month", (short) 3);
        setShortField(term34455, term34455.getClass(), "day", (short) 25);
        setField(term34454, term34454.getClass(), "date", term34455);
        setByteField(term34459, term34459.getClass(), "hour", (byte) 16);
        setByteField(term34459, term34459.getClass(), "minute", (byte) 28);
        setByteField(term34459, term34459.getClass(), "second", (byte) 0);
        setIntField(term34459, term34459.getClass(), "nano", 265797826);
        setField(term34454, term34454.getClass(), "time", term34459);
        setField(term34274, term34274.getClass(), "lastPlayDate", term34454);
        setIntField(term34274, term34274.getClass(), "lastPlaceId", 1818274550);
        setField(term34274, term34274.getClass(), "lastPlaceName", "NYSBqIpNlD");
        setField(term34274, term34274.getClass(), "lastRegionId", "OWglDUWQYb");
        setField(term34274, term34274.getClass(), "lastRegionName", "FiqETbKjpv");
        setField(term34274, term34274.getClass(), "lastAllNetId", "FxXtdhhXyS");
        setField(term34274, term34274.getClass(), "lastClientId", "HxCEzaCcgj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PDYPOQncAB";
        callMethod(klass, "setFirstRomVersion", argTypes, term34274, args);
    }

};


