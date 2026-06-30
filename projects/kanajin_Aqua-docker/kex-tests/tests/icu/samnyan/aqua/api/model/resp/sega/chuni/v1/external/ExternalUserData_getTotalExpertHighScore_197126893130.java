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

public class ExternalUserData_getTotalExpertHighScore_197126893130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12031;

    public ExternalUserData_getTotalExpertHighScore_197126893130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12031 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term12056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12061 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12170 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12216 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12031, term12031.getClass(), "accessCode", "yevIIoVYHq");
        setField(term12031, term12031.getClass(), "userName", "UuYWMTqWTV");
        setIntField(term12057, term12057.getClass(), "year", 2026);
        setShortField(term12057, term12057.getClass(), "month", (short) 6);
        setShortField(term12057, term12057.getClass(), "day", (short) 13);
        setField(term12056, term12056.getClass(), "date", term12057);
        setByteField(term12061, term12061.getClass(), "hour", (byte) 19);
        setByteField(term12061, term12061.getClass(), "minute", (byte) 23);
        setByteField(term12061, term12061.getClass(), "second", (byte) 46);
        setIntField(term12061, term12061.getClass(), "nano", 67955056);
        setField(term12056, term12056.getClass(), "time", term12061);
        setField(term12031, term12031.getClass(), "lastLoginDate", term12056);
        setBooleanField(term12031, term12031.getClass(), "isWebJoin", false);
        setField(term12031, term12031.getClass(), "webLimitDate", "DSFGlcaXUb");
        setIntField(term12031, term12031.getClass(), "level", -348612876);
        setIntField(term12031, term12031.getClass(), "reincarnationNum", 1302807565);
        setField(term12031, term12031.getClass(), "exp", "sHMXNUzNeM");
        setLongField(term12031, term12031.getClass(), "point", 6426732259596412988L);
        setLongField(term12031, term12031.getClass(), "totalPoint", 185793058502220865L);
        setIntField(term12031, term12031.getClass(), "playCount", -838848221);
        setIntField(term12031, term12031.getClass(), "multiPlayCount", 1163761623);
        setIntField(term12031, term12031.getClass(), "multiWinCount", 718742281);
        setIntField(term12031, term12031.getClass(), "requestResCount", 1532723756);
        setIntField(term12031, term12031.getClass(), "acceptResCount", -124088550);
        setIntField(term12031, term12031.getClass(), "successResCount", 777492093);
        setIntField(term12031, term12031.getClass(), "playerRating", 1414025609);
        setIntField(term12031, term12031.getClass(), "highestRating", 255145822);
        setIntField(term12031, term12031.getClass(), "nameplateId", -573608449);
        setIntField(term12031, term12031.getClass(), "frameId", -1660057757);
        setIntField(term12031, term12031.getClass(), "characterId", 1816273440);
        setIntField(term12031, term12031.getClass(), "trophyId", -96541009);
        setIntField(term12031, term12031.getClass(), "playedTutorialBit", -43719302);
        setIntField(term12031, term12031.getClass(), "firstTutorialCancelNum", 1024134939);
        setIntField(term12031, term12031.getClass(), "masterTutorialCancelNum", 109078154);
        setIntField(term12031, term12031.getClass(), "totalRepertoireCount", -314165467);
        setIntField(term12031, term12031.getClass(), "totalMapNum", 963694071);
        setLongField(term12031, term12031.getClass(), "totalHiScore", -7698746988132548371L);
        setLongField(term12031, term12031.getClass(), "totalBasicHighScore", 2145420811068634601L);
        setLongField(term12031, term12031.getClass(), "totalAdvancedHighScore", 2191130532479601175L);
        setLongField(term12031, term12031.getClass(), "totalExpertHighScore", 860079646007397083L);
        setLongField(term12031, term12031.getClass(), "totalMasterHighScore", 3230472384687362867L);
        setIntField(term12118, term12118.getClass(), "year", 2013);
        setShortField(term12118, term12118.getClass(), "month", (short) 12);
        setShortField(term12118, term12118.getClass(), "day", (short) 23);
        setField(term12117, term12117.getClass(), "date", term12118);
        setByteField(term12122, term12122.getClass(), "hour", (byte) 1);
        setByteField(term12122, term12122.getClass(), "minute", (byte) 0);
        setByteField(term12122, term12122.getClass(), "second", (byte) 32);
        setIntField(term12122, term12122.getClass(), "nano", 168525686);
        setField(term12117, term12117.getClass(), "time", term12122);
        setField(term12031, term12031.getClass(), "eventWatchedDate", term12117);
        setIntField(term12031, term12031.getClass(), "friendCount", -995785731);
        setBooleanField(term12031, term12031.getClass(), "isMaimai", false);
        setField(term12031, term12031.getClass(), "firstGameId", "gPzGDOEPPw");
        setField(term12031, term12031.getClass(), "firstRomVersion", "rwKoAngzCu");
        setField(term12031, term12031.getClass(), "firstDataVersion", "VUkRVwROTl");
        setIntField(term12166, term12166.getClass(), "year", 2014);
        setShortField(term12166, term12166.getClass(), "month", (short) 1);
        setShortField(term12166, term12166.getClass(), "day", (short) 26);
        setField(term12165, term12165.getClass(), "date", term12166);
        setByteField(term12170, term12170.getClass(), "hour", (byte) 3);
        setByteField(term12170, term12170.getClass(), "minute", (byte) 31);
        setByteField(term12170, term12170.getClass(), "second", (byte) 56);
        setIntField(term12170, term12170.getClass(), "nano", 100873602);
        setField(term12165, term12165.getClass(), "time", term12170);
        setField(term12031, term12031.getClass(), "firstPlayDate", term12165);
        setField(term12031, term12031.getClass(), "lastGameId", "UDlkdccCRn");
        setField(term12031, term12031.getClass(), "lastRomVersion", "McpzErOcYb");
        setField(term12031, term12031.getClass(), "lastDataVersion", "jqrVEUvYEz");
        setIntField(term12212, term12212.getClass(), "year", 2021);
        setShortField(term12212, term12212.getClass(), "month", (short) 12);
        setShortField(term12212, term12212.getClass(), "day", (short) 1);
        setField(term12211, term12211.getClass(), "date", term12212);
        setByteField(term12216, term12216.getClass(), "hour", (byte) 15);
        setByteField(term12216, term12216.getClass(), "minute", (byte) 30);
        setByteField(term12216, term12216.getClass(), "second", (byte) 5);
        setIntField(term12216, term12216.getClass(), "nano", 996341606);
        setField(term12211, term12211.getClass(), "time", term12216);
        setField(term12031, term12031.getClass(), "lastPlayDate", term12211);
        setIntField(term12031, term12031.getClass(), "lastPlaceId", 1349815364);
        setField(term12031, term12031.getClass(), "lastPlaceName", "QITgiBrmfj");
        setField(term12031, term12031.getClass(), "lastRegionId", "pXxkiXgQnq");
        setField(term12031, term12031.getClass(), "lastRegionName", "tKmrUDURku");
        setField(term12031, term12031.getClass(), "lastAllNetId", "JeZbrwZmsP");
        setField(term12031, term12031.getClass(), "lastClientId", "bxyfeicqrK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertHighScore", argTypes, term12031, args);
    }

};


