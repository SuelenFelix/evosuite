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

public class UserData_getLastDataVersion_209861219042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147273;

    public UserData_getLastDataVersion_209861219042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147277 = new Long(7998051124369147543L);
        term147273 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term147275 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term147291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147328 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147437 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147483 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147273, term147273.getClass(), "id", -9130931529513264634L);
        setLongField(term147275, term147275.getClass(), "id", -3784941054078150666L);
        setField(term147275, term147275.getClass(), "extId", term147277);
        setField(term147275, term147275.getClass(), "luid", "rLNYIbBxpb");
        setIntField(term147292, term147292.getClass(), "year", 2029);
        setShortField(term147292, term147292.getClass(), "month", (short) 10);
        setShortField(term147292, term147292.getClass(), "day", (short) 18);
        setField(term147291, term147291.getClass(), "date", term147292);
        setByteField(term147296, term147296.getClass(), "hour", (byte) 20);
        setByteField(term147296, term147296.getClass(), "minute", (byte) 21);
        setByteField(term147296, term147296.getClass(), "second", (byte) 59);
        setIntField(term147296, term147296.getClass(), "nano", 900109050);
        setField(term147291, term147291.getClass(), "time", term147296);
        setField(term147275, term147275.getClass(), "registerTime", term147291);
        setIntField(term147302, term147302.getClass(), "year", 2024);
        setShortField(term147302, term147302.getClass(), "month", (short) 6);
        setShortField(term147302, term147302.getClass(), "day", (short) 12);
        setField(term147301, term147301.getClass(), "date", term147302);
        setByteField(term147306, term147306.getClass(), "hour", (byte) 19);
        setByteField(term147306, term147306.getClass(), "minute", (byte) 6);
        setByteField(term147306, term147306.getClass(), "second", (byte) 29);
        setIntField(term147306, term147306.getClass(), "nano", 858628510);
        setField(term147301, term147301.getClass(), "time", term147306);
        setField(term147275, term147275.getClass(), "accessTime", term147301);
        setField(term147273, term147273.getClass(), "card", term147275);
        setField(term147273, term147273.getClass(), "userName", "kdvVBzzgOS");
        setIntField(term147324, term147324.getClass(), "year", 2019);
        setShortField(term147324, term147324.getClass(), "month", (short) 7);
        setShortField(term147324, term147324.getClass(), "day", (short) 11);
        setField(term147323, term147323.getClass(), "date", term147324);
        setByteField(term147328, term147328.getClass(), "hour", (byte) 17);
        setByteField(term147328, term147328.getClass(), "minute", (byte) 44);
        setByteField(term147328, term147328.getClass(), "second", (byte) 21);
        setIntField(term147328, term147328.getClass(), "nano", 476944971);
        setField(term147323, term147323.getClass(), "time", term147328);
        setField(term147273, term147273.getClass(), "lastLoginDate", term147323);
        setBooleanField(term147273, term147273.getClass(), "isWebJoin", false);
        setField(term147273, term147273.getClass(), "webLimitDate", "cwXRILYula");
        setIntField(term147273, term147273.getClass(), "level", 28864647);
        setIntField(term147273, term147273.getClass(), "reincarnationNum", 376502371);
        setField(term147273, term147273.getClass(), "exp", "GRIytmuHxn");
        setLongField(term147273, term147273.getClass(), "point", -5473289678956769394L);
        setLongField(term147273, term147273.getClass(), "totalPoint", 1682107454655274084L);
        setIntField(term147273, term147273.getClass(), "playCount", -1190514622);
        setIntField(term147273, term147273.getClass(), "multiPlayCount", -664203259);
        setIntField(term147273, term147273.getClass(), "multiWinCount", 1182607812);
        setIntField(term147273, term147273.getClass(), "requestResCount", -593876319);
        setIntField(term147273, term147273.getClass(), "acceptResCount", -319651858);
        setIntField(term147273, term147273.getClass(), "successResCount", -1605318650);
        setIntField(term147273, term147273.getClass(), "playerRating", -1715705311);
        setIntField(term147273, term147273.getClass(), "highestRating", 1583733510);
        setIntField(term147273, term147273.getClass(), "nameplateId", -1283509243);
        setIntField(term147273, term147273.getClass(), "frameId", -1360455750);
        setIntField(term147273, term147273.getClass(), "characterId", -1612479152);
        setIntField(term147273, term147273.getClass(), "trophyId", -1375350596);
        setIntField(term147273, term147273.getClass(), "playedTutorialBit", 1037044797);
        setIntField(term147273, term147273.getClass(), "firstTutorialCancelNum", -236855495);
        setIntField(term147273, term147273.getClass(), "masterTutorialCancelNum", 1407499360);
        setIntField(term147273, term147273.getClass(), "totalRepertoireCount", -824739842);
        setIntField(term147273, term147273.getClass(), "totalMapNum", 1736957152);
        setLongField(term147273, term147273.getClass(), "totalHiScore", -4816041910670569630L);
        setLongField(term147273, term147273.getClass(), "totalBasicHighScore", -1787967031647261832L);
        setLongField(term147273, term147273.getClass(), "totalAdvancedHighScore", 6923295800018827960L);
        setLongField(term147273, term147273.getClass(), "totalExpertHighScore", -2861825709944291199L);
        setLongField(term147273, term147273.getClass(), "totalMasterHighScore", 8351145561182470563L);
        setIntField(term147385, term147385.getClass(), "year", 2021);
        setShortField(term147385, term147385.getClass(), "month", (short) 5);
        setShortField(term147385, term147385.getClass(), "day", (short) 15);
        setField(term147384, term147384.getClass(), "date", term147385);
        setByteField(term147389, term147389.getClass(), "hour", (byte) 22);
        setByteField(term147389, term147389.getClass(), "minute", (byte) 36);
        setByteField(term147389, term147389.getClass(), "second", (byte) 5);
        setIntField(term147389, term147389.getClass(), "nano", 9733573);
        setField(term147384, term147384.getClass(), "time", term147389);
        setField(term147273, term147273.getClass(), "eventWatchedDate", term147384);
        setIntField(term147273, term147273.getClass(), "friendCount", -526630921);
        setBooleanField(term147273, term147273.getClass(), "isMaimai", false);
        setField(term147273, term147273.getClass(), "firstGameId", "kTzFRQAqyW");
        setField(term147273, term147273.getClass(), "firstRomVersion", "VHZcekDeFJ");
        setField(term147273, term147273.getClass(), "firstDataVersion", "JpemqlOPQk");
        setIntField(term147433, term147433.getClass(), "year", 2012);
        setShortField(term147433, term147433.getClass(), "month", (short) 3);
        setShortField(term147433, term147433.getClass(), "day", (short) 3);
        setField(term147432, term147432.getClass(), "date", term147433);
        setByteField(term147437, term147437.getClass(), "hour", (byte) 11);
        setByteField(term147437, term147437.getClass(), "minute", (byte) 7);
        setByteField(term147437, term147437.getClass(), "second", (byte) 7);
        setIntField(term147437, term147437.getClass(), "nano", 136274896);
        setField(term147432, term147432.getClass(), "time", term147437);
        setField(term147273, term147273.getClass(), "firstPlayDate", term147432);
        setField(term147273, term147273.getClass(), "lastGameId", "wZMPsUUQHd");
        setField(term147273, term147273.getClass(), "lastRomVersion", "kfQRMGKNWd");
        setField(term147273, term147273.getClass(), "lastDataVersion", "DmPsloRwDO");
        setIntField(term147479, term147479.getClass(), "year", 2011);
        setShortField(term147479, term147479.getClass(), "month", (short) 6);
        setShortField(term147479, term147479.getClass(), "day", (short) 17);
        setField(term147478, term147478.getClass(), "date", term147479);
        setByteField(term147483, term147483.getClass(), "hour", (byte) 1);
        setByteField(term147483, term147483.getClass(), "minute", (byte) 14);
        setByteField(term147483, term147483.getClass(), "second", (byte) 57);
        setIntField(term147483, term147483.getClass(), "nano", 635501898);
        setField(term147478, term147478.getClass(), "time", term147483);
        setField(term147273, term147273.getClass(), "lastPlayDate", term147478);
        setIntField(term147273, term147273.getClass(), "lastPlaceId", -1766101899);
        setField(term147273, term147273.getClass(), "lastPlaceName", "VELROAvnmN");
        setField(term147273, term147273.getClass(), "lastRegionId", "aYIchgguwD");
        setField(term147273, term147273.getClass(), "lastRegionName", "YeMojFOdIm");
        setField(term147273, term147273.getClass(), "lastAllNetId", "SlRtNRtKAG");
        setField(term147273, term147273.getClass(), "lastClientId", "tjWInMuXpE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term147273, args);
    }

};


