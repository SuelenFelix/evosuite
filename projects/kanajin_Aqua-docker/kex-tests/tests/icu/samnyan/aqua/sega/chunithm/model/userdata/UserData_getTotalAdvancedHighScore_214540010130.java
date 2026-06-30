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

public class UserData_getTotalAdvancedHighScore_214540010130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142161;

    public UserData_getTotalAdvancedHighScore_214540010130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term142165 = new Long(24067105862153728L);
        term142161 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term142163 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term142179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142184 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142194 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142371 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term142161, term142161.getClass(), "id", -4782482127429671786L);
        setLongField(term142163, term142163.getClass(), "id", 240315852180007985L);
        setField(term142163, term142163.getClass(), "extId", term142165);
        setField(term142163, term142163.getClass(), "luid", "EVCYyZgkIk");
        setIntField(term142180, term142180.getClass(), "year", 2021);
        setShortField(term142180, term142180.getClass(), "month", (short) 4);
        setShortField(term142180, term142180.getClass(), "day", (short) 11);
        setField(term142179, term142179.getClass(), "date", term142180);
        setByteField(term142184, term142184.getClass(), "hour", (byte) 18);
        setByteField(term142184, term142184.getClass(), "minute", (byte) 34);
        setByteField(term142184, term142184.getClass(), "second", (byte) 41);
        setIntField(term142184, term142184.getClass(), "nano", 983328722);
        setField(term142179, term142179.getClass(), "time", term142184);
        setField(term142163, term142163.getClass(), "registerTime", term142179);
        setIntField(term142190, term142190.getClass(), "year", 2010);
        setShortField(term142190, term142190.getClass(), "month", (short) 12);
        setShortField(term142190, term142190.getClass(), "day", (short) 24);
        setField(term142189, term142189.getClass(), "date", term142190);
        setByteField(term142194, term142194.getClass(), "hour", (byte) 23);
        setByteField(term142194, term142194.getClass(), "minute", (byte) 40);
        setByteField(term142194, term142194.getClass(), "second", (byte) 14);
        setIntField(term142194, term142194.getClass(), "nano", 972467644);
        setField(term142189, term142189.getClass(), "time", term142194);
        setField(term142163, term142163.getClass(), "accessTime", term142189);
        setField(term142161, term142161.getClass(), "card", term142163);
        setField(term142161, term142161.getClass(), "userName", "YzWEZeucrS");
        setIntField(term142212, term142212.getClass(), "year", 2028);
        setShortField(term142212, term142212.getClass(), "month", (short) 3);
        setShortField(term142212, term142212.getClass(), "day", (short) 24);
        setField(term142211, term142211.getClass(), "date", term142212);
        setByteField(term142216, term142216.getClass(), "hour", (byte) 12);
        setByteField(term142216, term142216.getClass(), "minute", (byte) 44);
        setByteField(term142216, term142216.getClass(), "second", (byte) 37);
        setIntField(term142216, term142216.getClass(), "nano", 940855330);
        setField(term142211, term142211.getClass(), "time", term142216);
        setField(term142161, term142161.getClass(), "lastLoginDate", term142211);
        setBooleanField(term142161, term142161.getClass(), "isWebJoin", false);
        setField(term142161, term142161.getClass(), "webLimitDate", "dWqMWOnvZA");
        setIntField(term142161, term142161.getClass(), "level", -533410760);
        setIntField(term142161, term142161.getClass(), "reincarnationNum", -1280711293);
        setField(term142161, term142161.getClass(), "exp", "LWvhNNTPry");
        setLongField(term142161, term142161.getClass(), "point", -97075969010685575L);
        setLongField(term142161, term142161.getClass(), "totalPoint", -2947100554916560706L);
        setIntField(term142161, term142161.getClass(), "playCount", -986135027);
        setIntField(term142161, term142161.getClass(), "multiPlayCount", 759881914);
        setIntField(term142161, term142161.getClass(), "multiWinCount", -1651145659);
        setIntField(term142161, term142161.getClass(), "requestResCount", -1747737642);
        setIntField(term142161, term142161.getClass(), "acceptResCount", -875663853);
        setIntField(term142161, term142161.getClass(), "successResCount", -956550555);
        setIntField(term142161, term142161.getClass(), "playerRating", -396229522);
        setIntField(term142161, term142161.getClass(), "highestRating", -1504505239);
        setIntField(term142161, term142161.getClass(), "nameplateId", 363428862);
        setIntField(term142161, term142161.getClass(), "frameId", -1175441949);
        setIntField(term142161, term142161.getClass(), "characterId", -21088397);
        setIntField(term142161, term142161.getClass(), "trophyId", 727645543);
        setIntField(term142161, term142161.getClass(), "playedTutorialBit", 1617706309);
        setIntField(term142161, term142161.getClass(), "firstTutorialCancelNum", -1771065834);
        setIntField(term142161, term142161.getClass(), "masterTutorialCancelNum", -1607856343);
        setIntField(term142161, term142161.getClass(), "totalRepertoireCount", -1393066070);
        setIntField(term142161, term142161.getClass(), "totalMapNum", 1089906374);
        setLongField(term142161, term142161.getClass(), "totalHiScore", 7688532003614369347L);
        setLongField(term142161, term142161.getClass(), "totalBasicHighScore", -8654357733658141611L);
        setLongField(term142161, term142161.getClass(), "totalAdvancedHighScore", -6395687392343866776L);
        setLongField(term142161, term142161.getClass(), "totalExpertHighScore", 1307997391749233384L);
        setLongField(term142161, term142161.getClass(), "totalMasterHighScore", -1103232804976080479L);
        setIntField(term142273, term142273.getClass(), "year", 2029);
        setShortField(term142273, term142273.getClass(), "month", (short) 9);
        setShortField(term142273, term142273.getClass(), "day", (short) 11);
        setField(term142272, term142272.getClass(), "date", term142273);
        setByteField(term142277, term142277.getClass(), "hour", (byte) 20);
        setByteField(term142277, term142277.getClass(), "minute", (byte) 34);
        setByteField(term142277, term142277.getClass(), "second", (byte) 35);
        setIntField(term142277, term142277.getClass(), "nano", 229461560);
        setField(term142272, term142272.getClass(), "time", term142277);
        setField(term142161, term142161.getClass(), "eventWatchedDate", term142272);
        setIntField(term142161, term142161.getClass(), "friendCount", 1430244220);
        setBooleanField(term142161, term142161.getClass(), "isMaimai", false);
        setField(term142161, term142161.getClass(), "firstGameId", "NKZtzKmNMG");
        setField(term142161, term142161.getClass(), "firstRomVersion", "bybEmXMboY");
        setField(term142161, term142161.getClass(), "firstDataVersion", "mSHWVzcYng");
        setIntField(term142321, term142321.getClass(), "year", 2025);
        setShortField(term142321, term142321.getClass(), "month", (short) 1);
        setShortField(term142321, term142321.getClass(), "day", (short) 24);
        setField(term142320, term142320.getClass(), "date", term142321);
        setByteField(term142325, term142325.getClass(), "hour", (byte) 7);
        setByteField(term142325, term142325.getClass(), "minute", (byte) 5);
        setByteField(term142325, term142325.getClass(), "second", (byte) 17);
        setIntField(term142325, term142325.getClass(), "nano", 61953966);
        setField(term142320, term142320.getClass(), "time", term142325);
        setField(term142161, term142161.getClass(), "firstPlayDate", term142320);
        setField(term142161, term142161.getClass(), "lastGameId", "JbyjPaAJuH");
        setField(term142161, term142161.getClass(), "lastRomVersion", "YxeVJOSiti");
        setField(term142161, term142161.getClass(), "lastDataVersion", "IuUPZzTzjB");
        setIntField(term142367, term142367.getClass(), "year", 2020);
        setShortField(term142367, term142367.getClass(), "month", (short) 7);
        setShortField(term142367, term142367.getClass(), "day", (short) 1);
        setField(term142366, term142366.getClass(), "date", term142367);
        setByteField(term142371, term142371.getClass(), "hour", (byte) 4);
        setByteField(term142371, term142371.getClass(), "minute", (byte) 38);
        setByteField(term142371, term142371.getClass(), "second", (byte) 51);
        setIntField(term142371, term142371.getClass(), "nano", 110132009);
        setField(term142366, term142366.getClass(), "time", term142371);
        setField(term142161, term142161.getClass(), "lastPlayDate", term142366);
        setIntField(term142161, term142161.getClass(), "lastPlaceId", 871438955);
        setField(term142161, term142161.getClass(), "lastPlaceName", "YphZwwGqEI");
        setField(term142161, term142161.getClass(), "lastRegionId", "SMpEesDFbN");
        setField(term142161, term142161.getClass(), "lastRegionName", "Nmrdnhkhse");
        setField(term142161, term142161.getClass(), "lastAllNetId", "NUcoviagVt");
        setField(term142161, term142161.getClass(), "lastClientId", "LfJIjYgLRK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedHighScore", argTypes, term142161, args);
    }

};


