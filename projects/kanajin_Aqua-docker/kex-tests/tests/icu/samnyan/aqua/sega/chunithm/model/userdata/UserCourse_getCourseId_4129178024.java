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

public class UserCourse_getCourseId_4129178024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179383;

    public UserCourse_getCourseId_4129178024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term179389 = new Long(3662777917800385964L);
        term179383 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term179385 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term179387 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term179403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179418 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179501 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179549 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term179670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term179671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term179675 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term179383, term179383.getClass(), "id", -4430640238371361796L);
        setLongField(term179385, term179385.getClass(), "id", -4412379824210027388L);
        setLongField(term179387, term179387.getClass(), "id", 3481375031536067233L);
        setField(term179387, term179387.getClass(), "extId", term179389);
        setField(term179387, term179387.getClass(), "luid", "kVLqWlFysu");
        setIntField(term179404, term179404.getClass(), "year", 2015);
        setShortField(term179404, term179404.getClass(), "month", (short) 1);
        setShortField(term179404, term179404.getClass(), "day", (short) 22);
        setField(term179403, term179403.getClass(), "date", term179404);
        setByteField(term179408, term179408.getClass(), "hour", (byte) 5);
        setByteField(term179408, term179408.getClass(), "minute", (byte) 48);
        setByteField(term179408, term179408.getClass(), "second", (byte) 2);
        setIntField(term179408, term179408.getClass(), "nano", 852980257);
        setField(term179403, term179403.getClass(), "time", term179408);
        setField(term179387, term179387.getClass(), "registerTime", term179403);
        setIntField(term179414, term179414.getClass(), "year", 2012);
        setShortField(term179414, term179414.getClass(), "month", (short) 9);
        setShortField(term179414, term179414.getClass(), "day", (short) 30);
        setField(term179413, term179413.getClass(), "date", term179414);
        setByteField(term179418, term179418.getClass(), "hour", (byte) 23);
        setByteField(term179418, term179418.getClass(), "minute", (byte) 28);
        setByteField(term179418, term179418.getClass(), "second", (byte) 47);
        setIntField(term179418, term179418.getClass(), "nano", 57793932);
        setField(term179413, term179413.getClass(), "time", term179418);
        setField(term179387, term179387.getClass(), "accessTime", term179413);
        setField(term179385, term179385.getClass(), "card", term179387);
        setField(term179385, term179385.getClass(), "userName", "cHmwpyPdAp");
        setIntField(term179436, term179436.getClass(), "year", 2011);
        setShortField(term179436, term179436.getClass(), "month", (short) 8);
        setShortField(term179436, term179436.getClass(), "day", (short) 18);
        setField(term179435, term179435.getClass(), "date", term179436);
        setByteField(term179440, term179440.getClass(), "hour", (byte) 20);
        setByteField(term179440, term179440.getClass(), "minute", (byte) 8);
        setByteField(term179440, term179440.getClass(), "second", (byte) 53);
        setIntField(term179440, term179440.getClass(), "nano", 112602510);
        setField(term179435, term179435.getClass(), "time", term179440);
        setField(term179385, term179385.getClass(), "lastLoginDate", term179435);
        setBooleanField(term179385, term179385.getClass(), "isWebJoin", true);
        setField(term179385, term179385.getClass(), "webLimitDate", "oNFTwxUIzz");
        setIntField(term179385, term179385.getClass(), "level", 396028910);
        setIntField(term179385, term179385.getClass(), "reincarnationNum", 69607831);
        setField(term179385, term179385.getClass(), "exp", "VGsYNwQhEZ");
        setLongField(term179385, term179385.getClass(), "point", -8163957580883746071L);
        setLongField(term179385, term179385.getClass(), "totalPoint", -6949688986087480988L);
        setIntField(term179385, term179385.getClass(), "playCount", 1571165009);
        setIntField(term179385, term179385.getClass(), "multiPlayCount", 617144608);
        setIntField(term179385, term179385.getClass(), "multiWinCount", 2095235044);
        setIntField(term179385, term179385.getClass(), "requestResCount", -363902615);
        setIntField(term179385, term179385.getClass(), "acceptResCount", -100522872);
        setIntField(term179385, term179385.getClass(), "successResCount", -49359679);
        setIntField(term179385, term179385.getClass(), "playerRating", 1959538355);
        setIntField(term179385, term179385.getClass(), "highestRating", 2137728302);
        setIntField(term179385, term179385.getClass(), "nameplateId", -1805617761);
        setIntField(term179385, term179385.getClass(), "frameId", -252123735);
        setIntField(term179385, term179385.getClass(), "characterId", -295928022);
        setIntField(term179385, term179385.getClass(), "trophyId", -95133545);
        setIntField(term179385, term179385.getClass(), "playedTutorialBit", -313878687);
        setIntField(term179385, term179385.getClass(), "firstTutorialCancelNum", 1545730027);
        setIntField(term179385, term179385.getClass(), "masterTutorialCancelNum", -428895495);
        setIntField(term179385, term179385.getClass(), "totalRepertoireCount", 1617741210);
        setIntField(term179385, term179385.getClass(), "totalMapNum", -1298890160);
        setLongField(term179385, term179385.getClass(), "totalHiScore", 6113513716640890192L);
        setLongField(term179385, term179385.getClass(), "totalBasicHighScore", 2616780148536850399L);
        setLongField(term179385, term179385.getClass(), "totalAdvancedHighScore", -930669719815118399L);
        setLongField(term179385, term179385.getClass(), "totalExpertHighScore", -459556958930554436L);
        setLongField(term179385, term179385.getClass(), "totalMasterHighScore", -4113760893823813984L);
        setIntField(term179497, term179497.getClass(), "year", 2018);
        setShortField(term179497, term179497.getClass(), "month", (short) 1);
        setShortField(term179497, term179497.getClass(), "day", (short) 17);
        setField(term179496, term179496.getClass(), "date", term179497);
        setByteField(term179501, term179501.getClass(), "hour", (byte) 10);
        setByteField(term179501, term179501.getClass(), "minute", (byte) 31);
        setByteField(term179501, term179501.getClass(), "second", (byte) 21);
        setIntField(term179501, term179501.getClass(), "nano", 403831238);
        setField(term179496, term179496.getClass(), "time", term179501);
        setField(term179385, term179385.getClass(), "eventWatchedDate", term179496);
        setIntField(term179385, term179385.getClass(), "friendCount", -2070483129);
        setBooleanField(term179385, term179385.getClass(), "isMaimai", true);
        setField(term179385, term179385.getClass(), "firstGameId", "SsgaArGuEz");
        setField(term179385, term179385.getClass(), "firstRomVersion", "dHsWwhojpf");
        setField(term179385, term179385.getClass(), "firstDataVersion", "ncpWpGyCgp");
        setIntField(term179545, term179545.getClass(), "year", 2028);
        setShortField(term179545, term179545.getClass(), "month", (short) 10);
        setShortField(term179545, term179545.getClass(), "day", (short) 5);
        setField(term179544, term179544.getClass(), "date", term179545);
        setByteField(term179549, term179549.getClass(), "hour", (byte) 10);
        setByteField(term179549, term179549.getClass(), "minute", (byte) 4);
        setByteField(term179549, term179549.getClass(), "second", (byte) 56);
        setIntField(term179549, term179549.getClass(), "nano", 151130223);
        setField(term179544, term179544.getClass(), "time", term179549);
        setField(term179385, term179385.getClass(), "firstPlayDate", term179544);
        setField(term179385, term179385.getClass(), "lastGameId", "AENfrCHOWz");
        setField(term179385, term179385.getClass(), "lastRomVersion", "vOizGhjCwb");
        setField(term179385, term179385.getClass(), "lastDataVersion", "gRxfRNHbpA");
        setIntField(term179591, term179591.getClass(), "year", 2026);
        setShortField(term179591, term179591.getClass(), "month", (short) 7);
        setShortField(term179591, term179591.getClass(), "day", (short) 8);
        setField(term179590, term179590.getClass(), "date", term179591);
        setByteField(term179595, term179595.getClass(), "hour", (byte) 9);
        setByteField(term179595, term179595.getClass(), "minute", (byte) 30);
        setByteField(term179595, term179595.getClass(), "second", (byte) 47);
        setIntField(term179595, term179595.getClass(), "nano", 654228922);
        setField(term179590, term179590.getClass(), "time", term179595);
        setField(term179385, term179385.getClass(), "lastPlayDate", term179590);
        setIntField(term179385, term179385.getClass(), "lastPlaceId", -362092120);
        setField(term179385, term179385.getClass(), "lastPlaceName", "RousChzHaG");
        setField(term179385, term179385.getClass(), "lastRegionId", "VttmtsKyxG");
        setField(term179385, term179385.getClass(), "lastRegionName", "khWWCkfcej");
        setField(term179385, term179385.getClass(), "lastAllNetId", "oLcqGUafTJ");
        setField(term179385, term179385.getClass(), "lastClientId", "tpCyOHBwCr");
        setField(term179383, term179383.getClass(), "user", term179385);
        setIntField(term179383, term179383.getClass(), "courseId", 1366079057);
        setIntField(term179383, term179383.getClass(), "classId", -999926600);
        setIntField(term179383, term179383.getClass(), "playCount", 1395824043);
        setIntField(term179383, term179383.getClass(), "scoreMax", 573136587);
        setBooleanField(term179383, term179383.getClass(), "isFullCombo", true);
        setBooleanField(term179383, term179383.getClass(), "isAllJustice", true);
        setBooleanField(term179383, term179383.getClass(), "isSuccess", true);
        setIntField(term179383, term179383.getClass(), "scoreRank", 2106974497);
        setIntField(term179383, term179383.getClass(), "eventId", 1608211969);
        setIntField(term179671, term179671.getClass(), "year", 2014);
        setShortField(term179671, term179671.getClass(), "month", (short) 7);
        setShortField(term179671, term179671.getClass(), "day", (short) 11);
        setField(term179670, term179670.getClass(), "date", term179671);
        setByteField(term179675, term179675.getClass(), "hour", (byte) 13);
        setByteField(term179675, term179675.getClass(), "minute", (byte) 25);
        setByteField(term179675, term179675.getClass(), "second", (byte) 53);
        setIntField(term179675, term179675.getClass(), "nano", 631553328);
        setField(term179670, term179670.getClass(), "time", term179675);
        setField(term179383, term179383.getClass(), "lastPlayDate", term179670);
        setIntField(term179383, term179383.getClass(), "param1", -1494030852);
        setIntField(term179383, term179383.getClass(), "param2", 1361581940);
        setIntField(term179383, term179383.getClass(), "param3", 35296030);
        setIntField(term179383, term179383.getClass(), "param4", -147453115);
        setBooleanField(term179383, term179383.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseId", argTypes, term179383, args);
    }

};


