package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMap_getEventId_7175798368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281884;

    public UserMap_getEventId_7175798368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term281890 = new Long(6437032166810658671L);
        term281884 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap"));
        Object term281886 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term281888 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term281904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281909 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term281941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term281997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term281998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282002 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282050 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term282092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term282096 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term281884, term281884.getClass(), "id", -3940330606642650491L);
        setLongField(term281886, term281886.getClass(), "id", -2807569143698701278L);
        setLongField(term281888, term281888.getClass(), "id", 7046600999249353201L);
        setField(term281888, term281888.getClass(), "extId", term281890);
        setField(term281888, term281888.getClass(), "luid", "dzcsjKTHpQ");
        setIntField(term281905, term281905.getClass(), "year", 2021);
        setShortField(term281905, term281905.getClass(), "month", (short) 5);
        setShortField(term281905, term281905.getClass(), "day", (short) 9);
        setField(term281904, term281904.getClass(), "date", term281905);
        setByteField(term281909, term281909.getClass(), "hour", (byte) 19);
        setByteField(term281909, term281909.getClass(), "minute", (byte) 53);
        setByteField(term281909, term281909.getClass(), "second", (byte) 3);
        setIntField(term281909, term281909.getClass(), "nano", 811749325);
        setField(term281904, term281904.getClass(), "time", term281909);
        setField(term281888, term281888.getClass(), "registerTime", term281904);
        setIntField(term281915, term281915.getClass(), "year", 2024);
        setShortField(term281915, term281915.getClass(), "month", (short) 4);
        setShortField(term281915, term281915.getClass(), "day", (short) 25);
        setField(term281914, term281914.getClass(), "date", term281915);
        setByteField(term281919, term281919.getClass(), "hour", (byte) 14);
        setByteField(term281919, term281919.getClass(), "minute", (byte) 35);
        setByteField(term281919, term281919.getClass(), "second", (byte) 49);
        setIntField(term281919, term281919.getClass(), "nano", 801553083);
        setField(term281914, term281914.getClass(), "time", term281919);
        setField(term281888, term281888.getClass(), "accessTime", term281914);
        setField(term281886, term281886.getClass(), "card", term281888);
        setField(term281886, term281886.getClass(), "userName", "nkYFOngZAC");
        setIntField(term281937, term281937.getClass(), "year", 2028);
        setShortField(term281937, term281937.getClass(), "month", (short) 1);
        setShortField(term281937, term281937.getClass(), "day", (short) 24);
        setField(term281936, term281936.getClass(), "date", term281937);
        setByteField(term281941, term281941.getClass(), "hour", (byte) 14);
        setByteField(term281941, term281941.getClass(), "minute", (byte) 3);
        setByteField(term281941, term281941.getClass(), "second", (byte) 36);
        setIntField(term281941, term281941.getClass(), "nano", 945137216);
        setField(term281936, term281936.getClass(), "time", term281941);
        setField(term281886, term281886.getClass(), "lastLoginDate", term281936);
        setBooleanField(term281886, term281886.getClass(), "isWebJoin", true);
        setField(term281886, term281886.getClass(), "webLimitDate", "dWlFYgFiIc");
        setIntField(term281886, term281886.getClass(), "level", 1239977029);
        setIntField(term281886, term281886.getClass(), "reincarnationNum", -1321116340);
        setField(term281886, term281886.getClass(), "exp", "noKFXgekjv");
        setLongField(term281886, term281886.getClass(), "point", -4982062716625861655L);
        setLongField(term281886, term281886.getClass(), "totalPoint", 2126814575177231106L);
        setIntField(term281886, term281886.getClass(), "playCount", -474806903);
        setIntField(term281886, term281886.getClass(), "multiPlayCount", 1981541170);
        setIntField(term281886, term281886.getClass(), "multiWinCount", -2009986235);
        setIntField(term281886, term281886.getClass(), "requestResCount", -23880680);
        setIntField(term281886, term281886.getClass(), "acceptResCount", -894843648);
        setIntField(term281886, term281886.getClass(), "successResCount", 142744348);
        setIntField(term281886, term281886.getClass(), "playerRating", 1483675783);
        setIntField(term281886, term281886.getClass(), "highestRating", -1134662759);
        setIntField(term281886, term281886.getClass(), "nameplateId", 1144602839);
        setIntField(term281886, term281886.getClass(), "frameId", 96643570);
        setIntField(term281886, term281886.getClass(), "characterId", 1111083466);
        setIntField(term281886, term281886.getClass(), "trophyId", -287565680);
        setIntField(term281886, term281886.getClass(), "playedTutorialBit", -505190175);
        setIntField(term281886, term281886.getClass(), "firstTutorialCancelNum", -1982976693);
        setIntField(term281886, term281886.getClass(), "masterTutorialCancelNum", 1819092465);
        setIntField(term281886, term281886.getClass(), "totalRepertoireCount", 10838230);
        setIntField(term281886, term281886.getClass(), "totalMapNum", -1844417927);
        setLongField(term281886, term281886.getClass(), "totalHiScore", 8926142430793076843L);
        setLongField(term281886, term281886.getClass(), "totalBasicHighScore", 5288301688317764685L);
        setLongField(term281886, term281886.getClass(), "totalAdvancedHighScore", -192549936143584170L);
        setLongField(term281886, term281886.getClass(), "totalExpertHighScore", -6661317679422299538L);
        setLongField(term281886, term281886.getClass(), "totalMasterHighScore", 2068218325920681528L);
        setIntField(term281998, term281998.getClass(), "year", 2012);
        setShortField(term281998, term281998.getClass(), "month", (short) 8);
        setShortField(term281998, term281998.getClass(), "day", (short) 14);
        setField(term281997, term281997.getClass(), "date", term281998);
        setByteField(term282002, term282002.getClass(), "hour", (byte) 1);
        setByteField(term282002, term282002.getClass(), "minute", (byte) 34);
        setByteField(term282002, term282002.getClass(), "second", (byte) 17);
        setIntField(term282002, term282002.getClass(), "nano", 763965670);
        setField(term281997, term281997.getClass(), "time", term282002);
        setField(term281886, term281886.getClass(), "eventWatchedDate", term281997);
        setIntField(term281886, term281886.getClass(), "friendCount", -1229688588);
        setBooleanField(term281886, term281886.getClass(), "isMaimai", true);
        setField(term281886, term281886.getClass(), "firstGameId", "DDVjHRnQxN");
        setField(term281886, term281886.getClass(), "firstRomVersion", "cPwsHWZyan");
        setField(term281886, term281886.getClass(), "firstDataVersion", "sVJDEsxIBv");
        setIntField(term282046, term282046.getClass(), "year", 2018);
        setShortField(term282046, term282046.getClass(), "month", (short) 3);
        setShortField(term282046, term282046.getClass(), "day", (short) 19);
        setField(term282045, term282045.getClass(), "date", term282046);
        setByteField(term282050, term282050.getClass(), "hour", (byte) 7);
        setByteField(term282050, term282050.getClass(), "minute", (byte) 4);
        setByteField(term282050, term282050.getClass(), "second", (byte) 36);
        setIntField(term282050, term282050.getClass(), "nano", 747384489);
        setField(term282045, term282045.getClass(), "time", term282050);
        setField(term281886, term281886.getClass(), "firstPlayDate", term282045);
        setField(term281886, term281886.getClass(), "lastGameId", "wCkJXDKrUp");
        setField(term281886, term281886.getClass(), "lastRomVersion", "NgJJQVugOQ");
        setField(term281886, term281886.getClass(), "lastDataVersion", "yavShYfpzp");
        setIntField(term282092, term282092.getClass(), "year", 2011);
        setShortField(term282092, term282092.getClass(), "month", (short) 6);
        setShortField(term282092, term282092.getClass(), "day", (short) 26);
        setField(term282091, term282091.getClass(), "date", term282092);
        setByteField(term282096, term282096.getClass(), "hour", (byte) 14);
        setByteField(term282096, term282096.getClass(), "minute", (byte) 33);
        setByteField(term282096, term282096.getClass(), "second", (byte) 20);
        setIntField(term282096, term282096.getClass(), "nano", 322396354);
        setField(term282091, term282091.getClass(), "time", term282096);
        setField(term281886, term281886.getClass(), "lastPlayDate", term282091);
        setIntField(term281886, term281886.getClass(), "lastPlaceId", -934089499);
        setField(term281886, term281886.getClass(), "lastPlaceName", "wMZoTYqRWV");
        setField(term281886, term281886.getClass(), "lastRegionId", "IPZjpMvLsa");
        setField(term281886, term281886.getClass(), "lastRegionName", "MOtWhQGbIj");
        setField(term281886, term281886.getClass(), "lastAllNetId", "VdjPvREeyI");
        setField(term281886, term281886.getClass(), "lastClientId", "nNqIIVCGzo");
        setField(term281884, term281884.getClass(), "user", term281886);
        setIntField(term281884, term281884.getClass(), "mapId", 1156999021);
        setIntField(term281884, term281884.getClass(), "position", 1696896271);
        setBooleanField(term281884, term281884.getClass(), "isClear", false);
        setIntField(term281884, term281884.getClass(), "areaId", 1811241767);
        setIntField(term281884, term281884.getClass(), "routeNumber", 1141602746);
        setIntField(term281884, term281884.getClass(), "eventId", 1950766545);
        setIntField(term281884, term281884.getClass(), "rate", 1718715106);
        setIntField(term281884, term281884.getClass(), "statusCount", -595632133);
        setBooleanField(term281884, term281884.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term281884, args);
    }

};


