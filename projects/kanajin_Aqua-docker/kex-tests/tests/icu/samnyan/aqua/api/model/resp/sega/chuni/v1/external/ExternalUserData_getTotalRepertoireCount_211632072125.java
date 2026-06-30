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

public class ExternalUserData_getTotalRepertoireCount_211632072125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10026;

    public ExternalUserData_getTotalRepertoireCount_211632072125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10026 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term10051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10056 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10113 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10117 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10206 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10207 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10211 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10026, term10026.getClass(), "accessCode", "dtGZCsKXbW");
        setField(term10026, term10026.getClass(), "userName", "bdyhHbDAmJ");
        setIntField(term10052, term10052.getClass(), "year", 2027);
        setShortField(term10052, term10052.getClass(), "month", (short) 6);
        setShortField(term10052, term10052.getClass(), "day", (short) 20);
        setField(term10051, term10051.getClass(), "date", term10052);
        setByteField(term10056, term10056.getClass(), "hour", (byte) 23);
        setByteField(term10056, term10056.getClass(), "minute", (byte) 21);
        setByteField(term10056, term10056.getClass(), "second", (byte) 6);
        setIntField(term10056, term10056.getClass(), "nano", 897776059);
        setField(term10051, term10051.getClass(), "time", term10056);
        setField(term10026, term10026.getClass(), "lastLoginDate", term10051);
        setBooleanField(term10026, term10026.getClass(), "isWebJoin", false);
        setField(term10026, term10026.getClass(), "webLimitDate", "BBXiTNHqGE");
        setIntField(term10026, term10026.getClass(), "level", 633598642);
        setIntField(term10026, term10026.getClass(), "reincarnationNum", 1862841859);
        setField(term10026, term10026.getClass(), "exp", "IEYhJmgCVd");
        setLongField(term10026, term10026.getClass(), "point", -5724112525188606013L);
        setLongField(term10026, term10026.getClass(), "totalPoint", -6100012593724108983L);
        setIntField(term10026, term10026.getClass(), "playCount", -1114668574);
        setIntField(term10026, term10026.getClass(), "multiPlayCount", 514511037);
        setIntField(term10026, term10026.getClass(), "multiWinCount", 1713573821);
        setIntField(term10026, term10026.getClass(), "requestResCount", 1956590498);
        setIntField(term10026, term10026.getClass(), "acceptResCount", 1467356494);
        setIntField(term10026, term10026.getClass(), "successResCount", -26316536);
        setIntField(term10026, term10026.getClass(), "playerRating", 1716165145);
        setIntField(term10026, term10026.getClass(), "highestRating", 1692937831);
        setIntField(term10026, term10026.getClass(), "nameplateId", -1539747985);
        setIntField(term10026, term10026.getClass(), "frameId", -1982489643);
        setIntField(term10026, term10026.getClass(), "characterId", 550892835);
        setIntField(term10026, term10026.getClass(), "trophyId", 1237549886);
        setIntField(term10026, term10026.getClass(), "playedTutorialBit", -1945635750);
        setIntField(term10026, term10026.getClass(), "firstTutorialCancelNum", -1622760744);
        setIntField(term10026, term10026.getClass(), "masterTutorialCancelNum", 2068435279);
        setIntField(term10026, term10026.getClass(), "totalRepertoireCount", -1556527718);
        setIntField(term10026, term10026.getClass(), "totalMapNum", 895255351);
        setLongField(term10026, term10026.getClass(), "totalHiScore", 5465527210299101732L);
        setLongField(term10026, term10026.getClass(), "totalBasicHighScore", 4699157009689333952L);
        setLongField(term10026, term10026.getClass(), "totalAdvancedHighScore", -78240609295693193L);
        setLongField(term10026, term10026.getClass(), "totalExpertHighScore", 3090901538358721367L);
        setLongField(term10026, term10026.getClass(), "totalMasterHighScore", -1677189124507026637L);
        setIntField(term10113, term10113.getClass(), "year", 2016);
        setShortField(term10113, term10113.getClass(), "month", (short) 3);
        setShortField(term10113, term10113.getClass(), "day", (short) 20);
        setField(term10112, term10112.getClass(), "date", term10113);
        setByteField(term10117, term10117.getClass(), "hour", (byte) 0);
        setByteField(term10117, term10117.getClass(), "minute", (byte) 54);
        setByteField(term10117, term10117.getClass(), "second", (byte) 6);
        setIntField(term10117, term10117.getClass(), "nano", 183302469);
        setField(term10112, term10112.getClass(), "time", term10117);
        setField(term10026, term10026.getClass(), "eventWatchedDate", term10112);
        setIntField(term10026, term10026.getClass(), "friendCount", -1317044799);
        setBooleanField(term10026, term10026.getClass(), "isMaimai", false);
        setField(term10026, term10026.getClass(), "firstGameId", "KSJeYkkvpk");
        setField(term10026, term10026.getClass(), "firstRomVersion", "qUtkFGMNUV");
        setField(term10026, term10026.getClass(), "firstDataVersion", "mGRiYhnMcR");
        setIntField(term10161, term10161.getClass(), "year", 2013);
        setShortField(term10161, term10161.getClass(), "month", (short) 11);
        setShortField(term10161, term10161.getClass(), "day", (short) 19);
        setField(term10160, term10160.getClass(), "date", term10161);
        setByteField(term10165, term10165.getClass(), "hour", (byte) 6);
        setByteField(term10165, term10165.getClass(), "minute", (byte) 45);
        setByteField(term10165, term10165.getClass(), "second", (byte) 10);
        setIntField(term10165, term10165.getClass(), "nano", 288981190);
        setField(term10160, term10160.getClass(), "time", term10165);
        setField(term10026, term10026.getClass(), "firstPlayDate", term10160);
        setField(term10026, term10026.getClass(), "lastGameId", "NFlvfJCVPO");
        setField(term10026, term10026.getClass(), "lastRomVersion", "KarbTXFmUU");
        setField(term10026, term10026.getClass(), "lastDataVersion", "jiUSjqwSIQ");
        setIntField(term10207, term10207.getClass(), "year", 2025);
        setShortField(term10207, term10207.getClass(), "month", (short) 9);
        setShortField(term10207, term10207.getClass(), "day", (short) 18);
        setField(term10206, term10206.getClass(), "date", term10207);
        setByteField(term10211, term10211.getClass(), "hour", (byte) 16);
        setByteField(term10211, term10211.getClass(), "minute", (byte) 1);
        setByteField(term10211, term10211.getClass(), "second", (byte) 23);
        setIntField(term10211, term10211.getClass(), "nano", 178285726);
        setField(term10206, term10206.getClass(), "time", term10211);
        setField(term10026, term10026.getClass(), "lastPlayDate", term10206);
        setIntField(term10026, term10026.getClass(), "lastPlaceId", -1428063820);
        setField(term10026, term10026.getClass(), "lastPlaceName", "MgLCedQfoj");
        setField(term10026, term10026.getClass(), "lastRegionId", "zgKiINdgNu");
        setField(term10026, term10026.getClass(), "lastRegionName", "zLMTXDQHYH");
        setField(term10026, term10026.getClass(), "lastAllNetId", "PqywFWJlpE");
        setField(term10026, term10026.getClass(), "lastClientId", "OzXRsFGTIp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRepertoireCount", argTypes, term10026, args);
    }

};


