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

public class UserDuel_getParam1_9489958978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78405;

    public UserDuel_getParam1_9489958978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78411 = new Long(-2924531382671518368L);
        term78405 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term78407 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term78409 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term78425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78566 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78567 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78571 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78692 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78405, term78405.getClass(), "id", -5292926065434569211L);
        setLongField(term78407, term78407.getClass(), "id", 346757673772711087L);
        setLongField(term78409, term78409.getClass(), "id", -1912308523656007793L);
        setField(term78409, term78409.getClass(), "extId", term78411);
        setField(term78409, term78409.getClass(), "luid", "orjiIcUIcD");
        setIntField(term78426, term78426.getClass(), "year", 2014);
        setShortField(term78426, term78426.getClass(), "month", (short) 7);
        setShortField(term78426, term78426.getClass(), "day", (short) 24);
        setField(term78425, term78425.getClass(), "date", term78426);
        setByteField(term78430, term78430.getClass(), "hour", (byte) 5);
        setByteField(term78430, term78430.getClass(), "minute", (byte) 31);
        setByteField(term78430, term78430.getClass(), "second", (byte) 45);
        setIntField(term78430, term78430.getClass(), "nano", 932508724);
        setField(term78425, term78425.getClass(), "time", term78430);
        setField(term78409, term78409.getClass(), "registerTime", term78425);
        setIntField(term78436, term78436.getClass(), "year", 2022);
        setShortField(term78436, term78436.getClass(), "month", (short) 9);
        setShortField(term78436, term78436.getClass(), "day", (short) 29);
        setField(term78435, term78435.getClass(), "date", term78436);
        setByteField(term78440, term78440.getClass(), "hour", (byte) 15);
        setByteField(term78440, term78440.getClass(), "minute", (byte) 41);
        setByteField(term78440, term78440.getClass(), "second", (byte) 55);
        setIntField(term78440, term78440.getClass(), "nano", 811723850);
        setField(term78435, term78435.getClass(), "time", term78440);
        setField(term78409, term78409.getClass(), "accessTime", term78435);
        setField(term78407, term78407.getClass(), "card", term78409);
        setField(term78407, term78407.getClass(), "userName", "lGzFueHQqZ");
        setIntField(term78458, term78458.getClass(), "year", 2017);
        setShortField(term78458, term78458.getClass(), "month", (short) 3);
        setShortField(term78458, term78458.getClass(), "day", (short) 7);
        setField(term78457, term78457.getClass(), "date", term78458);
        setByteField(term78462, term78462.getClass(), "hour", (byte) 17);
        setByteField(term78462, term78462.getClass(), "minute", (byte) 3);
        setByteField(term78462, term78462.getClass(), "second", (byte) 1);
        setIntField(term78462, term78462.getClass(), "nano", 107604440);
        setField(term78457, term78457.getClass(), "time", term78462);
        setField(term78407, term78407.getClass(), "lastLoginDate", term78457);
        setBooleanField(term78407, term78407.getClass(), "isWebJoin", false);
        setField(term78407, term78407.getClass(), "webLimitDate", "cjiDFHGGlp");
        setIntField(term78407, term78407.getClass(), "level", 681306470);
        setIntField(term78407, term78407.getClass(), "reincarnationNum", -1757429033);
        setField(term78407, term78407.getClass(), "exp", "XLjtkfroHJ");
        setLongField(term78407, term78407.getClass(), "point", 1577272117979272714L);
        setLongField(term78407, term78407.getClass(), "totalPoint", 2167034694898722303L);
        setIntField(term78407, term78407.getClass(), "playCount", -941018916);
        setIntField(term78407, term78407.getClass(), "multiPlayCount", -200717429);
        setIntField(term78407, term78407.getClass(), "multiWinCount", 1017751788);
        setIntField(term78407, term78407.getClass(), "requestResCount", 452190809);
        setIntField(term78407, term78407.getClass(), "acceptResCount", -868819495);
        setIntField(term78407, term78407.getClass(), "successResCount", -1011591867);
        setIntField(term78407, term78407.getClass(), "playerRating", 709949296);
        setIntField(term78407, term78407.getClass(), "highestRating", 1078431447);
        setIntField(term78407, term78407.getClass(), "nameplateId", -894257039);
        setIntField(term78407, term78407.getClass(), "frameId", 1586412497);
        setIntField(term78407, term78407.getClass(), "characterId", 719020316);
        setIntField(term78407, term78407.getClass(), "trophyId", 1522532191);
        setIntField(term78407, term78407.getClass(), "playedTutorialBit", 137516958);
        setIntField(term78407, term78407.getClass(), "firstTutorialCancelNum", -1233770688);
        setIntField(term78407, term78407.getClass(), "masterTutorialCancelNum", 722935077);
        setIntField(term78407, term78407.getClass(), "totalRepertoireCount", -304660297);
        setIntField(term78407, term78407.getClass(), "totalMapNum", 1530655970);
        setLongField(term78407, term78407.getClass(), "totalHiScore", 5116667900739377769L);
        setLongField(term78407, term78407.getClass(), "totalBasicHighScore", 7850317217678882393L);
        setLongField(term78407, term78407.getClass(), "totalAdvancedHighScore", -166310229318189286L);
        setLongField(term78407, term78407.getClass(), "totalExpertHighScore", 1735840139746449096L);
        setLongField(term78407, term78407.getClass(), "totalMasterHighScore", 2159730973728155805L);
        setIntField(term78519, term78519.getClass(), "year", 2010);
        setShortField(term78519, term78519.getClass(), "month", (short) 4);
        setShortField(term78519, term78519.getClass(), "day", (short) 22);
        setField(term78518, term78518.getClass(), "date", term78519);
        setByteField(term78523, term78523.getClass(), "hour", (byte) 16);
        setByteField(term78523, term78523.getClass(), "minute", (byte) 6);
        setByteField(term78523, term78523.getClass(), "second", (byte) 12);
        setIntField(term78523, term78523.getClass(), "nano", 46820039);
        setField(term78518, term78518.getClass(), "time", term78523);
        setField(term78407, term78407.getClass(), "eventWatchedDate", term78518);
        setIntField(term78407, term78407.getClass(), "friendCount", -154857398);
        setBooleanField(term78407, term78407.getClass(), "isMaimai", false);
        setField(term78407, term78407.getClass(), "firstGameId", "hdqypaATat");
        setField(term78407, term78407.getClass(), "firstRomVersion", "yXrHDHEipD");
        setField(term78407, term78407.getClass(), "firstDataVersion", "pbqIeikQzp");
        setIntField(term78567, term78567.getClass(), "year", 2025);
        setShortField(term78567, term78567.getClass(), "month", (short) 10);
        setShortField(term78567, term78567.getClass(), "day", (short) 24);
        setField(term78566, term78566.getClass(), "date", term78567);
        setByteField(term78571, term78571.getClass(), "hour", (byte) 16);
        setByteField(term78571, term78571.getClass(), "minute", (byte) 37);
        setByteField(term78571, term78571.getClass(), "second", (byte) 14);
        setIntField(term78571, term78571.getClass(), "nano", 973421967);
        setField(term78566, term78566.getClass(), "time", term78571);
        setField(term78407, term78407.getClass(), "firstPlayDate", term78566);
        setField(term78407, term78407.getClass(), "lastGameId", "baLJgqNNUx");
        setField(term78407, term78407.getClass(), "lastRomVersion", "GlPSGqVaBj");
        setField(term78407, term78407.getClass(), "lastDataVersion", "jieMNXAAbL");
        setIntField(term78613, term78613.getClass(), "year", 2021);
        setShortField(term78613, term78613.getClass(), "month", (short) 4);
        setShortField(term78613, term78613.getClass(), "day", (short) 25);
        setField(term78612, term78612.getClass(), "date", term78613);
        setByteField(term78617, term78617.getClass(), "hour", (byte) 8);
        setByteField(term78617, term78617.getClass(), "minute", (byte) 14);
        setByteField(term78617, term78617.getClass(), "second", (byte) 18);
        setIntField(term78617, term78617.getClass(), "nano", 906796683);
        setField(term78612, term78612.getClass(), "time", term78617);
        setField(term78407, term78407.getClass(), "lastPlayDate", term78612);
        setIntField(term78407, term78407.getClass(), "lastPlaceId", 385239631);
        setField(term78407, term78407.getClass(), "lastPlaceName", "NbmTxmqOjh");
        setField(term78407, term78407.getClass(), "lastRegionId", "rLDmBbcLaC");
        setField(term78407, term78407.getClass(), "lastRegionName", "tUKcXglBlG");
        setField(term78407, term78407.getClass(), "lastAllNetId", "ZGptycjjRq");
        setField(term78407, term78407.getClass(), "lastClientId", "kXJaxapFer");
        setField(term78405, term78405.getClass(), "user", term78407);
        setIntField(term78405, term78405.getClass(), "duelId", 836211088);
        setIntField(term78405, term78405.getClass(), "progress", -365730201);
        setIntField(term78405, term78405.getClass(), "point", -1218078298);
        setBooleanField(term78405, term78405.getClass(), "isClear", false);
        setIntField(term78688, term78688.getClass(), "year", 2012);
        setShortField(term78688, term78688.getClass(), "month", (short) 7);
        setShortField(term78688, term78688.getClass(), "day", (short) 16);
        setField(term78687, term78687.getClass(), "date", term78688);
        setByteField(term78692, term78692.getClass(), "hour", (byte) 8);
        setByteField(term78692, term78692.getClass(), "minute", (byte) 3);
        setByteField(term78692, term78692.getClass(), "second", (byte) 1);
        setIntField(term78692, term78692.getClass(), "nano", 861288078);
        setField(term78687, term78687.getClass(), "time", term78692);
        setField(term78405, term78405.getClass(), "lastPlayDate", term78687);
        setIntField(term78405, term78405.getClass(), "param1", -1186533450);
        setIntField(term78405, term78405.getClass(), "param2", 1385418235);
        setIntField(term78405, term78405.getClass(), "param3", 928651112);
        setIntField(term78405, term78405.getClass(), "param4", -970446181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam1", argTypes, term78405, args);
    }

};


