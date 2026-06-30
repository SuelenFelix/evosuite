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

public class ExternalUserData_getFriendCount_7458547133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13234;

    public ExternalUserData_getFriendCount_7458547133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13234 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term13259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13264 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13373 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13419 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13234, term13234.getClass(), "accessCode", "XebAeSnCKZ");
        setField(term13234, term13234.getClass(), "userName", "GeddnXjHGy");
        setIntField(term13260, term13260.getClass(), "year", 2012);
        setShortField(term13260, term13260.getClass(), "month", (short) 5);
        setShortField(term13260, term13260.getClass(), "day", (short) 25);
        setField(term13259, term13259.getClass(), "date", term13260);
        setByteField(term13264, term13264.getClass(), "hour", (byte) 5);
        setByteField(term13264, term13264.getClass(), "minute", (byte) 8);
        setByteField(term13264, term13264.getClass(), "second", (byte) 47);
        setIntField(term13264, term13264.getClass(), "nano", 455554221);
        setField(term13259, term13259.getClass(), "time", term13264);
        setField(term13234, term13234.getClass(), "lastLoginDate", term13259);
        setBooleanField(term13234, term13234.getClass(), "isWebJoin", true);
        setField(term13234, term13234.getClass(), "webLimitDate", "vLTbaoAxBm");
        setIntField(term13234, term13234.getClass(), "level", -431440129);
        setIntField(term13234, term13234.getClass(), "reincarnationNum", -763576148);
        setField(term13234, term13234.getClass(), "exp", "BXTjEyEZxD");
        setLongField(term13234, term13234.getClass(), "point", -7904053112604879960L);
        setLongField(term13234, term13234.getClass(), "totalPoint", -6602460430714339690L);
        setIntField(term13234, term13234.getClass(), "playCount", 1568948514);
        setIntField(term13234, term13234.getClass(), "multiPlayCount", -1511130237);
        setIntField(term13234, term13234.getClass(), "multiWinCount", 452088587);
        setIntField(term13234, term13234.getClass(), "requestResCount", -1630069454);
        setIntField(term13234, term13234.getClass(), "acceptResCount", 1499735894);
        setIntField(term13234, term13234.getClass(), "successResCount", 716486048);
        setIntField(term13234, term13234.getClass(), "playerRating", -466708718);
        setIntField(term13234, term13234.getClass(), "highestRating", 1038029515);
        setIntField(term13234, term13234.getClass(), "nameplateId", 1137154606);
        setIntField(term13234, term13234.getClass(), "frameId", -100681578);
        setIntField(term13234, term13234.getClass(), "characterId", 296568835);
        setIntField(term13234, term13234.getClass(), "trophyId", 1431951992);
        setIntField(term13234, term13234.getClass(), "playedTutorialBit", -1608123016);
        setIntField(term13234, term13234.getClass(), "firstTutorialCancelNum", -896473214);
        setIntField(term13234, term13234.getClass(), "masterTutorialCancelNum", 401203924);
        setIntField(term13234, term13234.getClass(), "totalRepertoireCount", -1212399479);
        setIntField(term13234, term13234.getClass(), "totalMapNum", 2107679041);
        setLongField(term13234, term13234.getClass(), "totalHiScore", 21047099434645581L);
        setLongField(term13234, term13234.getClass(), "totalBasicHighScore", -8862087040734407227L);
        setLongField(term13234, term13234.getClass(), "totalAdvancedHighScore", -6394943900800506753L);
        setLongField(term13234, term13234.getClass(), "totalExpertHighScore", -4867941246533901410L);
        setLongField(term13234, term13234.getClass(), "totalMasterHighScore", 1044883697493326351L);
        setIntField(term13321, term13321.getClass(), "year", 2029);
        setShortField(term13321, term13321.getClass(), "month", (short) 11);
        setShortField(term13321, term13321.getClass(), "day", (short) 18);
        setField(term13320, term13320.getClass(), "date", term13321);
        setByteField(term13325, term13325.getClass(), "hour", (byte) 5);
        setByteField(term13325, term13325.getClass(), "minute", (byte) 36);
        setByteField(term13325, term13325.getClass(), "second", (byte) 57);
        setIntField(term13325, term13325.getClass(), "nano", 394167804);
        setField(term13320, term13320.getClass(), "time", term13325);
        setField(term13234, term13234.getClass(), "eventWatchedDate", term13320);
        setIntField(term13234, term13234.getClass(), "friendCount", 2040965507);
        setBooleanField(term13234, term13234.getClass(), "isMaimai", true);
        setField(term13234, term13234.getClass(), "firstGameId", "oKhVzOKUFW");
        setField(term13234, term13234.getClass(), "firstRomVersion", "mNHyqmOAFy");
        setField(term13234, term13234.getClass(), "firstDataVersion", "UxgSdhxPCH");
        setIntField(term13369, term13369.getClass(), "year", 2020);
        setShortField(term13369, term13369.getClass(), "month", (short) 10);
        setShortField(term13369, term13369.getClass(), "day", (short) 8);
        setField(term13368, term13368.getClass(), "date", term13369);
        setByteField(term13373, term13373.getClass(), "hour", (byte) 15);
        setByteField(term13373, term13373.getClass(), "minute", (byte) 57);
        setByteField(term13373, term13373.getClass(), "second", (byte) 17);
        setIntField(term13373, term13373.getClass(), "nano", 288139529);
        setField(term13368, term13368.getClass(), "time", term13373);
        setField(term13234, term13234.getClass(), "firstPlayDate", term13368);
        setField(term13234, term13234.getClass(), "lastGameId", "DAujxZPHJC");
        setField(term13234, term13234.getClass(), "lastRomVersion", "IlBhdrCvHq");
        setField(term13234, term13234.getClass(), "lastDataVersion", "OirVUQhauU");
        setIntField(term13415, term13415.getClass(), "year", 2022);
        setShortField(term13415, term13415.getClass(), "month", (short) 6);
        setShortField(term13415, term13415.getClass(), "day", (short) 12);
        setField(term13414, term13414.getClass(), "date", term13415);
        setByteField(term13419, term13419.getClass(), "hour", (byte) 14);
        setByteField(term13419, term13419.getClass(), "minute", (byte) 3);
        setByteField(term13419, term13419.getClass(), "second", (byte) 7);
        setIntField(term13419, term13419.getClass(), "nano", 637592645);
        setField(term13414, term13414.getClass(), "time", term13419);
        setField(term13234, term13234.getClass(), "lastPlayDate", term13414);
        setIntField(term13234, term13234.getClass(), "lastPlaceId", -1281083262);
        setField(term13234, term13234.getClass(), "lastPlaceName", "GLbyDfbNZI");
        setField(term13234, term13234.getClass(), "lastRegionId", "oNLcCYDAsO");
        setField(term13234, term13234.getClass(), "lastRegionName", "CNqMxLvtcJ");
        setField(term13234, term13234.getClass(), "lastAllNetId", "ktbqerIaKW");
        setField(term13234, term13234.getClass(), "lastClientId", "VoghngXfsK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriendCount", argTypes, term13234, args);
    }

};


