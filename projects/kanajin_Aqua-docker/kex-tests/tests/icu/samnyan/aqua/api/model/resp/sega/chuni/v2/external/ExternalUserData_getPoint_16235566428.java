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

public class ExternalUserData_getPoint_16235566428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3209;

    public ExternalUserData_getPoint_16235566428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3209 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term3234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3239 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3295 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3296 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3300 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3348 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3394 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3209, term3209.getClass(), "accessCode", "dpNsDgfPso");
        setField(term3209, term3209.getClass(), "userName", "hCWPJQKpdc");
        setIntField(term3235, term3235.getClass(), "year", 2012);
        setShortField(term3235, term3235.getClass(), "month", (short) 3);
        setShortField(term3235, term3235.getClass(), "day", (short) 27);
        setField(term3234, term3234.getClass(), "date", term3235);
        setByteField(term3239, term3239.getClass(), "hour", (byte) 17);
        setByteField(term3239, term3239.getClass(), "minute", (byte) 49);
        setByteField(term3239, term3239.getClass(), "second", (byte) 24);
        setIntField(term3239, term3239.getClass(), "nano", 530647398);
        setField(term3234, term3234.getClass(), "time", term3239);
        setField(term3209, term3209.getClass(), "lastLoginDate", term3234);
        setBooleanField(term3209, term3209.getClass(), "isWebJoin", true);
        setField(term3209, term3209.getClass(), "webLimitDate", "WzMEhMXkKx");
        setIntField(term3209, term3209.getClass(), "level", -2014576105);
        setIntField(term3209, term3209.getClass(), "reincarnationNum", 1296895584);
        setField(term3209, term3209.getClass(), "exp", "XOiDvlDhdc");
        setLongField(term3209, term3209.getClass(), "point", -7738503207562305297L);
        setLongField(term3209, term3209.getClass(), "totalPoint", 3825396310311739952L);
        setIntField(term3209, term3209.getClass(), "playCount", 628918458);
        setIntField(term3209, term3209.getClass(), "multiPlayCount", -1274456137);
        setIntField(term3209, term3209.getClass(), "multiWinCount", 1041916673);
        setIntField(term3209, term3209.getClass(), "requestResCount", -601863069);
        setIntField(term3209, term3209.getClass(), "acceptResCount", 663292551);
        setIntField(term3209, term3209.getClass(), "successResCount", -1885090354);
        setIntField(term3209, term3209.getClass(), "playerRating", -2066804303);
        setIntField(term3209, term3209.getClass(), "highestRating", -1731761810);
        setIntField(term3209, term3209.getClass(), "nameplateId", 197109649);
        setIntField(term3209, term3209.getClass(), "frameId", -1239406390);
        setIntField(term3209, term3209.getClass(), "characterId", 1557431527);
        setIntField(term3209, term3209.getClass(), "trophyId", -1504890659);
        setIntField(term3209, term3209.getClass(), "playedTutorialBit", 1358829571);
        setIntField(term3209, term3209.getClass(), "firstTutorialCancelNum", 991356662);
        setIntField(term3209, term3209.getClass(), "masterTutorialCancelNum", -506958186);
        setIntField(term3209, term3209.getClass(), "totalRepertoireCount", -507387516);
        setIntField(term3209, term3209.getClass(), "totalMapNum", -1970452551);
        setLongField(term3209, term3209.getClass(), "totalHiScore", -3838084482494604218L);
        setLongField(term3209, term3209.getClass(), "totalBasicHighScore", 3892018155439224435L);
        setLongField(term3209, term3209.getClass(), "totalAdvancedHighScore", 5953383087795962419L);
        setLongField(term3209, term3209.getClass(), "totalExpertHighScore", 7994303628307559416L);
        setLongField(term3209, term3209.getClass(), "totalMasterHighScore", 2443640364875054177L);
        setIntField(term3296, term3296.getClass(), "year", 2010);
        setShortField(term3296, term3296.getClass(), "month", (short) 6);
        setShortField(term3296, term3296.getClass(), "day", (short) 14);
        setField(term3295, term3295.getClass(), "date", term3296);
        setByteField(term3300, term3300.getClass(), "hour", (byte) 6);
        setByteField(term3300, term3300.getClass(), "minute", (byte) 22);
        setByteField(term3300, term3300.getClass(), "second", (byte) 20);
        setIntField(term3300, term3300.getClass(), "nano", 25133051);
        setField(term3295, term3295.getClass(), "time", term3300);
        setField(term3209, term3209.getClass(), "eventWatchedDate", term3295);
        setIntField(term3209, term3209.getClass(), "friendCount", -1896376975);
        setBooleanField(term3209, term3209.getClass(), "isMaimai", true);
        setField(term3209, term3209.getClass(), "firstGameId", "AdxvLJhNLe");
        setField(term3209, term3209.getClass(), "firstRomVersion", "lHfTrWKMPk");
        setField(term3209, term3209.getClass(), "firstDataVersion", "JDaAnsVTGV");
        setIntField(term3344, term3344.getClass(), "year", 2010);
        setShortField(term3344, term3344.getClass(), "month", (short) 5);
        setShortField(term3344, term3344.getClass(), "day", (short) 2);
        setField(term3343, term3343.getClass(), "date", term3344);
        setByteField(term3348, term3348.getClass(), "hour", (byte) 2);
        setByteField(term3348, term3348.getClass(), "minute", (byte) 22);
        setByteField(term3348, term3348.getClass(), "second", (byte) 33);
        setIntField(term3348, term3348.getClass(), "nano", 530835039);
        setField(term3343, term3343.getClass(), "time", term3348);
        setField(term3209, term3209.getClass(), "firstPlayDate", term3343);
        setField(term3209, term3209.getClass(), "lastGameId", "mLUZFTfjle");
        setField(term3209, term3209.getClass(), "lastRomVersion", "xIeFjkHkOe");
        setField(term3209, term3209.getClass(), "lastDataVersion", "SdCKLMIYnX");
        setIntField(term3390, term3390.getClass(), "year", 2024);
        setShortField(term3390, term3390.getClass(), "month", (short) 4);
        setShortField(term3390, term3390.getClass(), "day", (short) 24);
        setField(term3389, term3389.getClass(), "date", term3390);
        setByteField(term3394, term3394.getClass(), "hour", (byte) 7);
        setByteField(term3394, term3394.getClass(), "minute", (byte) 2);
        setByteField(term3394, term3394.getClass(), "second", (byte) 51);
        setIntField(term3394, term3394.getClass(), "nano", 635502964);
        setField(term3389, term3389.getClass(), "time", term3394);
        setField(term3209, term3209.getClass(), "lastPlayDate", term3389);
        setIntField(term3209, term3209.getClass(), "lastPlaceId", 729658803);
        setField(term3209, term3209.getClass(), "lastPlaceName", "OJJtVNPyKZ");
        setField(term3209, term3209.getClass(), "lastRegionId", "AKNapTAfmD");
        setField(term3209, term3209.getClass(), "lastRegionName", "xJgPlLxpgC");
        setField(term3209, term3209.getClass(), "lastAllNetId", "EYtfuJaxiM");
        setField(term3209, term3209.getClass(), "lastClientId", "gCWtLVKVVe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term3209, args);
    }

};


