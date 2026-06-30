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

public class UserData_getLastAllNetId_116324003548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149829;

    public UserData_getLastAllNetId_116324003548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term149833 = new Long(2022482096970820459L);
        term149829 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term149831 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term149847 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149848 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149852 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149940 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149941 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149945 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149993 = newInstance(Class.forName("java.time.LocalTime"));
        Object term150034 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150035 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150039 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term149829, term149829.getClass(), "id", -648036229192078849L);
        setLongField(term149831, term149831.getClass(), "id", 840220645925856846L);
        setField(term149831, term149831.getClass(), "extId", term149833);
        setField(term149831, term149831.getClass(), "luid", "nrdzzTSWFF");
        setIntField(term149848, term149848.getClass(), "year", 2011);
        setShortField(term149848, term149848.getClass(), "month", (short) 11);
        setShortField(term149848, term149848.getClass(), "day", (short) 21);
        setField(term149847, term149847.getClass(), "date", term149848);
        setByteField(term149852, term149852.getClass(), "hour", (byte) 20);
        setByteField(term149852, term149852.getClass(), "minute", (byte) 1);
        setByteField(term149852, term149852.getClass(), "second", (byte) 18);
        setIntField(term149852, term149852.getClass(), "nano", 576451110);
        setField(term149847, term149847.getClass(), "time", term149852);
        setField(term149831, term149831.getClass(), "registerTime", term149847);
        setIntField(term149858, term149858.getClass(), "year", 2027);
        setShortField(term149858, term149858.getClass(), "month", (short) 8);
        setShortField(term149858, term149858.getClass(), "day", (short) 22);
        setField(term149857, term149857.getClass(), "date", term149858);
        setByteField(term149862, term149862.getClass(), "hour", (byte) 8);
        setByteField(term149862, term149862.getClass(), "minute", (byte) 7);
        setByteField(term149862, term149862.getClass(), "second", (byte) 58);
        setIntField(term149862, term149862.getClass(), "nano", 805189737);
        setField(term149857, term149857.getClass(), "time", term149862);
        setField(term149831, term149831.getClass(), "accessTime", term149857);
        setField(term149829, term149829.getClass(), "card", term149831);
        setField(term149829, term149829.getClass(), "userName", "KoJHLBVrxX");
        setIntField(term149880, term149880.getClass(), "year", 2010);
        setShortField(term149880, term149880.getClass(), "month", (short) 9);
        setShortField(term149880, term149880.getClass(), "day", (short) 19);
        setField(term149879, term149879.getClass(), "date", term149880);
        setByteField(term149884, term149884.getClass(), "hour", (byte) 9);
        setByteField(term149884, term149884.getClass(), "minute", (byte) 4);
        setByteField(term149884, term149884.getClass(), "second", (byte) 35);
        setIntField(term149884, term149884.getClass(), "nano", 742393322);
        setField(term149879, term149879.getClass(), "time", term149884);
        setField(term149829, term149829.getClass(), "lastLoginDate", term149879);
        setBooleanField(term149829, term149829.getClass(), "isWebJoin", false);
        setField(term149829, term149829.getClass(), "webLimitDate", "HkLucnnsSl");
        setIntField(term149829, term149829.getClass(), "level", 507424812);
        setIntField(term149829, term149829.getClass(), "reincarnationNum", -844787500);
        setField(term149829, term149829.getClass(), "exp", "VdhooJgKjD");
        setLongField(term149829, term149829.getClass(), "point", 4645120364448163549L);
        setLongField(term149829, term149829.getClass(), "totalPoint", -7648896690366097711L);
        setIntField(term149829, term149829.getClass(), "playCount", 917456811);
        setIntField(term149829, term149829.getClass(), "multiPlayCount", 78789367);
        setIntField(term149829, term149829.getClass(), "multiWinCount", -437074400);
        setIntField(term149829, term149829.getClass(), "requestResCount", -1058580635);
        setIntField(term149829, term149829.getClass(), "acceptResCount", 1737604630);
        setIntField(term149829, term149829.getClass(), "successResCount", 1363336854);
        setIntField(term149829, term149829.getClass(), "playerRating", 649098774);
        setIntField(term149829, term149829.getClass(), "highestRating", 394089806);
        setIntField(term149829, term149829.getClass(), "nameplateId", 1726963667);
        setIntField(term149829, term149829.getClass(), "frameId", 1456425179);
        setIntField(term149829, term149829.getClass(), "characterId", -709895123);
        setIntField(term149829, term149829.getClass(), "trophyId", -1519932258);
        setIntField(term149829, term149829.getClass(), "playedTutorialBit", 1214021948);
        setIntField(term149829, term149829.getClass(), "firstTutorialCancelNum", -795117444);
        setIntField(term149829, term149829.getClass(), "masterTutorialCancelNum", -1609134843);
        setIntField(term149829, term149829.getClass(), "totalRepertoireCount", -637905866);
        setIntField(term149829, term149829.getClass(), "totalMapNum", 377538185);
        setLongField(term149829, term149829.getClass(), "totalHiScore", 6570000576385960810L);
        setLongField(term149829, term149829.getClass(), "totalBasicHighScore", 7680535193078478069L);
        setLongField(term149829, term149829.getClass(), "totalAdvancedHighScore", -5087018910424412847L);
        setLongField(term149829, term149829.getClass(), "totalExpertHighScore", 6714464751236187198L);
        setLongField(term149829, term149829.getClass(), "totalMasterHighScore", 5851303130674694601L);
        setIntField(term149941, term149941.getClass(), "year", 2024);
        setShortField(term149941, term149941.getClass(), "month", (short) 1);
        setShortField(term149941, term149941.getClass(), "day", (short) 7);
        setField(term149940, term149940.getClass(), "date", term149941);
        setByteField(term149945, term149945.getClass(), "hour", (byte) 7);
        setByteField(term149945, term149945.getClass(), "minute", (byte) 3);
        setByteField(term149945, term149945.getClass(), "second", (byte) 17);
        setIntField(term149945, term149945.getClass(), "nano", 324519719);
        setField(term149940, term149940.getClass(), "time", term149945);
        setField(term149829, term149829.getClass(), "eventWatchedDate", term149940);
        setIntField(term149829, term149829.getClass(), "friendCount", -2110389833);
        setBooleanField(term149829, term149829.getClass(), "isMaimai", false);
        setField(term149829, term149829.getClass(), "firstGameId", "glIybxsQbc");
        setField(term149829, term149829.getClass(), "firstRomVersion", "nWUrJaIrWY");
        setField(term149829, term149829.getClass(), "firstDataVersion", "azfYXqXuep");
        setIntField(term149989, term149989.getClass(), "year", 2026);
        setShortField(term149989, term149989.getClass(), "month", (short) 4);
        setShortField(term149989, term149989.getClass(), "day", (short) 22);
        setField(term149988, term149988.getClass(), "date", term149989);
        setByteField(term149993, term149993.getClass(), "hour", (byte) 17);
        setByteField(term149993, term149993.getClass(), "minute", (byte) 39);
        setByteField(term149993, term149993.getClass(), "second", (byte) 46);
        setIntField(term149993, term149993.getClass(), "nano", 198742551);
        setField(term149988, term149988.getClass(), "time", term149993);
        setField(term149829, term149829.getClass(), "firstPlayDate", term149988);
        setField(term149829, term149829.getClass(), "lastGameId", "RUDKjRvYEj");
        setField(term149829, term149829.getClass(), "lastRomVersion", "qqfmBAQNbi");
        setField(term149829, term149829.getClass(), "lastDataVersion", "ZazUKKNrNz");
        setIntField(term150035, term150035.getClass(), "year", 2026);
        setShortField(term150035, term150035.getClass(), "month", (short) 12);
        setShortField(term150035, term150035.getClass(), "day", (short) 25);
        setField(term150034, term150034.getClass(), "date", term150035);
        setByteField(term150039, term150039.getClass(), "hour", (byte) 7);
        setByteField(term150039, term150039.getClass(), "minute", (byte) 49);
        setByteField(term150039, term150039.getClass(), "second", (byte) 40);
        setIntField(term150039, term150039.getClass(), "nano", 210722201);
        setField(term150034, term150034.getClass(), "time", term150039);
        setField(term149829, term149829.getClass(), "lastPlayDate", term150034);
        setIntField(term149829, term149829.getClass(), "lastPlaceId", 936155212);
        setField(term149829, term149829.getClass(), "lastPlaceName", "adJVCgKQux");
        setField(term149829, term149829.getClass(), "lastRegionId", "PQibUERIvR");
        setField(term149829, term149829.getClass(), "lastRegionName", "HsNjJxtWVg");
        setField(term149829, term149829.getClass(), "lastAllNetId", "yrkhDRBntk");
        setField(term149829, term149829.getClass(), "lastClientId", "LbApweKHaq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term149829, args);
    }

};


