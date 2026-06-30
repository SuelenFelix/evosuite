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
import java.lang.Integer;

public class ExternalUserData_setNameplateId_191779708967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26992;
     Object term27243;

    public ExternalUserData_setNameplateId_191779708967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26992 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term27017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27078 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27079 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27083 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27177 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26992, term26992.getClass(), "accessCode", "RsOfgdMCMv");
        setField(term26992, term26992.getClass(), "userName", "nsofCJqJOR");
        setIntField(term27018, term27018.getClass(), "year", 2029);
        setShortField(term27018, term27018.getClass(), "month", (short) 11);
        setShortField(term27018, term27018.getClass(), "day", (short) 23);
        setField(term27017, term27017.getClass(), "date", term27018);
        setByteField(term27022, term27022.getClass(), "hour", (byte) 18);
        setByteField(term27022, term27022.getClass(), "minute", (byte) 47);
        setByteField(term27022, term27022.getClass(), "second", (byte) 36);
        setIntField(term27022, term27022.getClass(), "nano", 43248731);
        setField(term27017, term27017.getClass(), "time", term27022);
        setField(term26992, term26992.getClass(), "lastLoginDate", term27017);
        setBooleanField(term26992, term26992.getClass(), "isWebJoin", true);
        setField(term26992, term26992.getClass(), "webLimitDate", "CitJiZwsjF");
        setIntField(term26992, term26992.getClass(), "level", 376341151);
        setIntField(term26992, term26992.getClass(), "reincarnationNum", -1607267243);
        setField(term26992, term26992.getClass(), "exp", "ZiyMvLArWJ");
        setLongField(term26992, term26992.getClass(), "point", -4855037955202452256L);
        setLongField(term26992, term26992.getClass(), "totalPoint", -5903549884298836343L);
        setIntField(term26992, term26992.getClass(), "playCount", 1641377218);
        setIntField(term26992, term26992.getClass(), "multiPlayCount", 1235375204);
        setIntField(term26992, term26992.getClass(), "multiWinCount", 258334639);
        setIntField(term26992, term26992.getClass(), "requestResCount", 1432187207);
        setIntField(term26992, term26992.getClass(), "acceptResCount", -91068927);
        setIntField(term26992, term26992.getClass(), "successResCount", 680714112);
        setIntField(term26992, term26992.getClass(), "playerRating", 385297023);
        setIntField(term26992, term26992.getClass(), "highestRating", -134092543);
        setIntField(term26992, term26992.getClass(), "nameplateId", -1703642288);
        setIntField(term26992, term26992.getClass(), "frameId", 2075139747);
        setIntField(term26992, term26992.getClass(), "characterId", 2092881418);
        setIntField(term26992, term26992.getClass(), "trophyId", 1732410866);
        setIntField(term26992, term26992.getClass(), "playedTutorialBit", 1084102599);
        setIntField(term26992, term26992.getClass(), "firstTutorialCancelNum", -1743503755);
        setIntField(term26992, term26992.getClass(), "masterTutorialCancelNum", 1641342112);
        setIntField(term26992, term26992.getClass(), "totalRepertoireCount", -1551790945);
        setIntField(term26992, term26992.getClass(), "totalMapNum", 2039538484);
        setLongField(term26992, term26992.getClass(), "totalHiScore", -3058119213533262883L);
        setLongField(term26992, term26992.getClass(), "totalBasicHighScore", 1950957495500453461L);
        setLongField(term26992, term26992.getClass(), "totalAdvancedHighScore", -6423955170741487890L);
        setLongField(term26992, term26992.getClass(), "totalExpertHighScore", -4663904610228258188L);
        setLongField(term26992, term26992.getClass(), "totalMasterHighScore", 3824691451696451167L);
        setIntField(term27079, term27079.getClass(), "year", 2015);
        setShortField(term27079, term27079.getClass(), "month", (short) 4);
        setShortField(term27079, term27079.getClass(), "day", (short) 22);
        setField(term27078, term27078.getClass(), "date", term27079);
        setByteField(term27083, term27083.getClass(), "hour", (byte) 15);
        setByteField(term27083, term27083.getClass(), "minute", (byte) 23);
        setByteField(term27083, term27083.getClass(), "second", (byte) 42);
        setIntField(term27083, term27083.getClass(), "nano", 822658620);
        setField(term27078, term27078.getClass(), "time", term27083);
        setField(term26992, term26992.getClass(), "eventWatchedDate", term27078);
        setIntField(term26992, term26992.getClass(), "friendCount", 1235736068);
        setBooleanField(term26992, term26992.getClass(), "isMaimai", false);
        setField(term26992, term26992.getClass(), "firstGameId", "MaeokjEfWD");
        setField(term26992, term26992.getClass(), "firstRomVersion", "ocZcumnXEz");
        setField(term26992, term26992.getClass(), "firstDataVersion", "rNNwyactDR");
        setIntField(term27127, term27127.getClass(), "year", 2020);
        setShortField(term27127, term27127.getClass(), "month", (short) 4);
        setShortField(term27127, term27127.getClass(), "day", (short) 27);
        setField(term27126, term27126.getClass(), "date", term27127);
        setByteField(term27131, term27131.getClass(), "hour", (byte) 16);
        setByteField(term27131, term27131.getClass(), "minute", (byte) 48);
        setByteField(term27131, term27131.getClass(), "second", (byte) 39);
        setIntField(term27131, term27131.getClass(), "nano", 250909266);
        setField(term27126, term27126.getClass(), "time", term27131);
        setField(term26992, term26992.getClass(), "firstPlayDate", term27126);
        setField(term26992, term26992.getClass(), "lastGameId", "QJrTMTdxyh");
        setField(term26992, term26992.getClass(), "lastRomVersion", "rgZSPplPSs");
        setField(term26992, term26992.getClass(), "lastDataVersion", "NPUSTXlEKx");
        setIntField(term27173, term27173.getClass(), "year", 2022);
        setShortField(term27173, term27173.getClass(), "month", (short) 8);
        setShortField(term27173, term27173.getClass(), "day", (short) 16);
        setField(term27172, term27172.getClass(), "date", term27173);
        setByteField(term27177, term27177.getClass(), "hour", (byte) 4);
        setByteField(term27177, term27177.getClass(), "minute", (byte) 38);
        setByteField(term27177, term27177.getClass(), "second", (byte) 51);
        setIntField(term27177, term27177.getClass(), "nano", 348952212);
        setField(term27172, term27172.getClass(), "time", term27177);
        setField(term26992, term26992.getClass(), "lastPlayDate", term27172);
        setIntField(term26992, term26992.getClass(), "lastPlaceId", 329424176);
        setField(term26992, term26992.getClass(), "lastPlaceName", "KKFprGoNpl");
        setField(term26992, term26992.getClass(), "lastRegionId", "tWVISJlxKZ");
        setField(term26992, term26992.getClass(), "lastRegionName", "rOZkUKEoaf");
        setField(term26992, term26992.getClass(), "lastAllNetId", "yLnzGqyHGL");
        setField(term26992, term26992.getClass(), "lastClientId", "IjprPXBDuY");
        term27243 = new Integer(-1897199214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27243;
        callMethod(klass, "setNameplateId", argTypes, term26992, args);
    }

};


