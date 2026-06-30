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

public class UserData_getLastPlayDate_137956237443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147699;

    public UserData_getLastPlayDate_137956237443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147703 = new Long(-1481367303699139651L);
        term147699 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term147701 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term147717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147722 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147754 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147815 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147909 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147699, term147699.getClass(), "id", -7104210321005753947L);
        setLongField(term147701, term147701.getClass(), "id", -6940797163068748652L);
        setField(term147701, term147701.getClass(), "extId", term147703);
        setField(term147701, term147701.getClass(), "luid", "rWuFJIaxKU");
        setIntField(term147718, term147718.getClass(), "year", 2025);
        setShortField(term147718, term147718.getClass(), "month", (short) 10);
        setShortField(term147718, term147718.getClass(), "day", (short) 6);
        setField(term147717, term147717.getClass(), "date", term147718);
        setByteField(term147722, term147722.getClass(), "hour", (byte) 21);
        setByteField(term147722, term147722.getClass(), "minute", (byte) 15);
        setByteField(term147722, term147722.getClass(), "second", (byte) 35);
        setIntField(term147722, term147722.getClass(), "nano", 849975366);
        setField(term147717, term147717.getClass(), "time", term147722);
        setField(term147701, term147701.getClass(), "registerTime", term147717);
        setIntField(term147728, term147728.getClass(), "year", 2012);
        setShortField(term147728, term147728.getClass(), "month", (short) 7);
        setShortField(term147728, term147728.getClass(), "day", (short) 11);
        setField(term147727, term147727.getClass(), "date", term147728);
        setByteField(term147732, term147732.getClass(), "hour", (byte) 15);
        setByteField(term147732, term147732.getClass(), "minute", (byte) 6);
        setByteField(term147732, term147732.getClass(), "second", (byte) 50);
        setIntField(term147732, term147732.getClass(), "nano", 854680138);
        setField(term147727, term147727.getClass(), "time", term147732);
        setField(term147701, term147701.getClass(), "accessTime", term147727);
        setField(term147699, term147699.getClass(), "card", term147701);
        setField(term147699, term147699.getClass(), "userName", "YfhWIhudfM");
        setIntField(term147750, term147750.getClass(), "year", 2025);
        setShortField(term147750, term147750.getClass(), "month", (short) 5);
        setShortField(term147750, term147750.getClass(), "day", (short) 5);
        setField(term147749, term147749.getClass(), "date", term147750);
        setByteField(term147754, term147754.getClass(), "hour", (byte) 4);
        setByteField(term147754, term147754.getClass(), "minute", (byte) 19);
        setByteField(term147754, term147754.getClass(), "second", (byte) 8);
        setIntField(term147754, term147754.getClass(), "nano", 352175892);
        setField(term147749, term147749.getClass(), "time", term147754);
        setField(term147699, term147699.getClass(), "lastLoginDate", term147749);
        setBooleanField(term147699, term147699.getClass(), "isWebJoin", false);
        setField(term147699, term147699.getClass(), "webLimitDate", "GMoKHTpxln");
        setIntField(term147699, term147699.getClass(), "level", -1198424905);
        setIntField(term147699, term147699.getClass(), "reincarnationNum", -782844264);
        setField(term147699, term147699.getClass(), "exp", "XkAqnfOCnI");
        setLongField(term147699, term147699.getClass(), "point", 1997269281468700420L);
        setLongField(term147699, term147699.getClass(), "totalPoint", -7128006109272835548L);
        setIntField(term147699, term147699.getClass(), "playCount", -546737664);
        setIntField(term147699, term147699.getClass(), "multiPlayCount", 2004350139);
        setIntField(term147699, term147699.getClass(), "multiWinCount", 1239280488);
        setIntField(term147699, term147699.getClass(), "requestResCount", -1336481907);
        setIntField(term147699, term147699.getClass(), "acceptResCount", 1804282244);
        setIntField(term147699, term147699.getClass(), "successResCount", 1481607063);
        setIntField(term147699, term147699.getClass(), "playerRating", 972749902);
        setIntField(term147699, term147699.getClass(), "highestRating", -1556774479);
        setIntField(term147699, term147699.getClass(), "nameplateId", -74035050);
        setIntField(term147699, term147699.getClass(), "frameId", 1681611551);
        setIntField(term147699, term147699.getClass(), "characterId", 1979378883);
        setIntField(term147699, term147699.getClass(), "trophyId", -471723430);
        setIntField(term147699, term147699.getClass(), "playedTutorialBit", -1834936016);
        setIntField(term147699, term147699.getClass(), "firstTutorialCancelNum", -1317671732);
        setIntField(term147699, term147699.getClass(), "masterTutorialCancelNum", -589460764);
        setIntField(term147699, term147699.getClass(), "totalRepertoireCount", 1158956816);
        setIntField(term147699, term147699.getClass(), "totalMapNum", -1817072774);
        setLongField(term147699, term147699.getClass(), "totalHiScore", -1369792038073493476L);
        setLongField(term147699, term147699.getClass(), "totalBasicHighScore", 5718274845956420880L);
        setLongField(term147699, term147699.getClass(), "totalAdvancedHighScore", 6700769086218292078L);
        setLongField(term147699, term147699.getClass(), "totalExpertHighScore", -5284499986511698301L);
        setLongField(term147699, term147699.getClass(), "totalMasterHighScore", -8886870795876891550L);
        setIntField(term147811, term147811.getClass(), "year", 2018);
        setShortField(term147811, term147811.getClass(), "month", (short) 4);
        setShortField(term147811, term147811.getClass(), "day", (short) 2);
        setField(term147810, term147810.getClass(), "date", term147811);
        setByteField(term147815, term147815.getClass(), "hour", (byte) 0);
        setByteField(term147815, term147815.getClass(), "minute", (byte) 55);
        setByteField(term147815, term147815.getClass(), "second", (byte) 34);
        setIntField(term147815, term147815.getClass(), "nano", 286326973);
        setField(term147810, term147810.getClass(), "time", term147815);
        setField(term147699, term147699.getClass(), "eventWatchedDate", term147810);
        setIntField(term147699, term147699.getClass(), "friendCount", 1457278062);
        setBooleanField(term147699, term147699.getClass(), "isMaimai", false);
        setField(term147699, term147699.getClass(), "firstGameId", "gmQYVeuejX");
        setField(term147699, term147699.getClass(), "firstRomVersion", "lKfOnfrbRD");
        setField(term147699, term147699.getClass(), "firstDataVersion", "nYzGCEYbnO");
        setIntField(term147859, term147859.getClass(), "year", 2024);
        setShortField(term147859, term147859.getClass(), "month", (short) 9);
        setShortField(term147859, term147859.getClass(), "day", (short) 17);
        setField(term147858, term147858.getClass(), "date", term147859);
        setByteField(term147863, term147863.getClass(), "hour", (byte) 22);
        setByteField(term147863, term147863.getClass(), "minute", (byte) 20);
        setByteField(term147863, term147863.getClass(), "second", (byte) 58);
        setIntField(term147863, term147863.getClass(), "nano", 890274772);
        setField(term147858, term147858.getClass(), "time", term147863);
        setField(term147699, term147699.getClass(), "firstPlayDate", term147858);
        setField(term147699, term147699.getClass(), "lastGameId", "pmcRudWxTC");
        setField(term147699, term147699.getClass(), "lastRomVersion", "LJueGMncZI");
        setField(term147699, term147699.getClass(), "lastDataVersion", "MzACPCdnZu");
        setIntField(term147905, term147905.getClass(), "year", 2026);
        setShortField(term147905, term147905.getClass(), "month", (short) 1);
        setShortField(term147905, term147905.getClass(), "day", (short) 17);
        setField(term147904, term147904.getClass(), "date", term147905);
        setByteField(term147909, term147909.getClass(), "hour", (byte) 17);
        setByteField(term147909, term147909.getClass(), "minute", (byte) 45);
        setByteField(term147909, term147909.getClass(), "second", (byte) 31);
        setIntField(term147909, term147909.getClass(), "nano", 201320931);
        setField(term147904, term147904.getClass(), "time", term147909);
        setField(term147699, term147699.getClass(), "lastPlayDate", term147904);
        setIntField(term147699, term147699.getClass(), "lastPlaceId", 1950635891);
        setField(term147699, term147699.getClass(), "lastPlaceName", "orKYnrPZUK");
        setField(term147699, term147699.getClass(), "lastRegionId", "cnXmohyKKG");
        setField(term147699, term147699.getClass(), "lastRegionName", "GUOUoghpWj");
        setField(term147699, term147699.getClass(), "lastAllNetId", "mwFuZUIQyt");
        setField(term147699, term147699.getClass(), "lastClientId", "vjEoebAxYI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term147699, args);
    }

};


