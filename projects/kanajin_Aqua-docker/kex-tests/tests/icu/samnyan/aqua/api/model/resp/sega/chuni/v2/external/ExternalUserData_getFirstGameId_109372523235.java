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

public class ExternalUserData_getFirstGameId_109372523235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14036;

    public ExternalUserData_getFirstGameId_109372523235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14036 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term14061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14066 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14122 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14123 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14127 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14175 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14221 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14036, term14036.getClass(), "accessCode", "mfHtgSbdjD");
        setField(term14036, term14036.getClass(), "userName", "cmuaUiHMVL");
        setIntField(term14062, term14062.getClass(), "year", 2029);
        setShortField(term14062, term14062.getClass(), "month", (short) 5);
        setShortField(term14062, term14062.getClass(), "day", (short) 11);
        setField(term14061, term14061.getClass(), "date", term14062);
        setByteField(term14066, term14066.getClass(), "hour", (byte) 20);
        setByteField(term14066, term14066.getClass(), "minute", (byte) 17);
        setByteField(term14066, term14066.getClass(), "second", (byte) 32);
        setIntField(term14066, term14066.getClass(), "nano", 327503582);
        setField(term14061, term14061.getClass(), "time", term14066);
        setField(term14036, term14036.getClass(), "lastLoginDate", term14061);
        setBooleanField(term14036, term14036.getClass(), "isWebJoin", false);
        setField(term14036, term14036.getClass(), "webLimitDate", "xjoSGPWUgu");
        setIntField(term14036, term14036.getClass(), "level", 1991858584);
        setIntField(term14036, term14036.getClass(), "reincarnationNum", -1300947782);
        setField(term14036, term14036.getClass(), "exp", "uzmqjnOUXu");
        setLongField(term14036, term14036.getClass(), "point", 1860789353508856614L);
        setLongField(term14036, term14036.getClass(), "totalPoint", -7456852906235966771L);
        setIntField(term14036, term14036.getClass(), "playCount", 188512644);
        setIntField(term14036, term14036.getClass(), "multiPlayCount", 1851127634);
        setIntField(term14036, term14036.getClass(), "multiWinCount", 783730213);
        setIntField(term14036, term14036.getClass(), "requestResCount", 1815951606);
        setIntField(term14036, term14036.getClass(), "acceptResCount", 1105016932);
        setIntField(term14036, term14036.getClass(), "successResCount", -365784998);
        setIntField(term14036, term14036.getClass(), "playerRating", -1893236300);
        setIntField(term14036, term14036.getClass(), "highestRating", -1858909368);
        setIntField(term14036, term14036.getClass(), "nameplateId", -280113263);
        setIntField(term14036, term14036.getClass(), "frameId", 529625347);
        setIntField(term14036, term14036.getClass(), "characterId", 1409095253);
        setIntField(term14036, term14036.getClass(), "trophyId", 315179039);
        setIntField(term14036, term14036.getClass(), "playedTutorialBit", -1835923897);
        setIntField(term14036, term14036.getClass(), "firstTutorialCancelNum", -341287775);
        setIntField(term14036, term14036.getClass(), "masterTutorialCancelNum", -1651110911);
        setIntField(term14036, term14036.getClass(), "totalRepertoireCount", -1934033808);
        setIntField(term14036, term14036.getClass(), "totalMapNum", 950322609);
        setLongField(term14036, term14036.getClass(), "totalHiScore", -67485388932970712L);
        setLongField(term14036, term14036.getClass(), "totalBasicHighScore", 5806367330808555223L);
        setLongField(term14036, term14036.getClass(), "totalAdvancedHighScore", 4576699120365923235L);
        setLongField(term14036, term14036.getClass(), "totalExpertHighScore", -1635471392209071620L);
        setLongField(term14036, term14036.getClass(), "totalMasterHighScore", -4714000263923324167L);
        setIntField(term14123, term14123.getClass(), "year", 2012);
        setShortField(term14123, term14123.getClass(), "month", (short) 10);
        setShortField(term14123, term14123.getClass(), "day", (short) 1);
        setField(term14122, term14122.getClass(), "date", term14123);
        setByteField(term14127, term14127.getClass(), "hour", (byte) 9);
        setByteField(term14127, term14127.getClass(), "minute", (byte) 27);
        setByteField(term14127, term14127.getClass(), "second", (byte) 33);
        setIntField(term14127, term14127.getClass(), "nano", 714912000);
        setField(term14122, term14122.getClass(), "time", term14127);
        setField(term14036, term14036.getClass(), "eventWatchedDate", term14122);
        setIntField(term14036, term14036.getClass(), "friendCount", -2023791789);
        setBooleanField(term14036, term14036.getClass(), "isMaimai", false);
        setField(term14036, term14036.getClass(), "firstGameId", "xeyjTOCOJb");
        setField(term14036, term14036.getClass(), "firstRomVersion", "DGRqjjdhzy");
        setField(term14036, term14036.getClass(), "firstDataVersion", "lQFkjJUPAR");
        setIntField(term14171, term14171.getClass(), "year", 2010);
        setShortField(term14171, term14171.getClass(), "month", (short) 1);
        setShortField(term14171, term14171.getClass(), "day", (short) 10);
        setField(term14170, term14170.getClass(), "date", term14171);
        setByteField(term14175, term14175.getClass(), "hour", (byte) 12);
        setByteField(term14175, term14175.getClass(), "minute", (byte) 46);
        setByteField(term14175, term14175.getClass(), "second", (byte) 5);
        setIntField(term14175, term14175.getClass(), "nano", 540440953);
        setField(term14170, term14170.getClass(), "time", term14175);
        setField(term14036, term14036.getClass(), "firstPlayDate", term14170);
        setField(term14036, term14036.getClass(), "lastGameId", "BsuVlGUUjV");
        setField(term14036, term14036.getClass(), "lastRomVersion", "bHHjfDCntT");
        setField(term14036, term14036.getClass(), "lastDataVersion", "sEphiduvkv");
        setIntField(term14217, term14217.getClass(), "year", 2028);
        setShortField(term14217, term14217.getClass(), "month", (short) 5);
        setShortField(term14217, term14217.getClass(), "day", (short) 7);
        setField(term14216, term14216.getClass(), "date", term14217);
        setByteField(term14221, term14221.getClass(), "hour", (byte) 7);
        setByteField(term14221, term14221.getClass(), "minute", (byte) 48);
        setByteField(term14221, term14221.getClass(), "second", (byte) 4);
        setIntField(term14221, term14221.getClass(), "nano", 380425174);
        setField(term14216, term14216.getClass(), "time", term14221);
        setField(term14036, term14036.getClass(), "lastPlayDate", term14216);
        setIntField(term14036, term14036.getClass(), "lastPlaceId", 353974456);
        setField(term14036, term14036.getClass(), "lastPlaceName", "PbLgCSAHce");
        setField(term14036, term14036.getClass(), "lastRegionId", "NWldOLAbqk");
        setField(term14036, term14036.getClass(), "lastRegionName", "qnYaYSpDwO");
        setField(term14036, term14036.getClass(), "lastAllNetId", "dgbFDCdHtj");
        setField(term14036, term14036.getClass(), "lastClientId", "EKpdCBubDE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term14036, args);
    }

};


