package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_setLastLoginDate_16393165651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20496;
     Object term20747;

    public ExternalUserData_setLastLoginDate_16393165651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20496 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term20521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20635 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20681 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term20496, term20496.getClass(), "accessCode", "bIqaKgXgPm");
        setField(term20496, term20496.getClass(), "userName", "uOJFOUcNvv");
        setIntField(term20522, term20522.getClass(), "year", 2024);
        setShortField(term20522, term20522.getClass(), "month", (short) 7);
        setShortField(term20522, term20522.getClass(), "day", (short) 29);
        setField(term20521, term20521.getClass(), "date", term20522);
        setByteField(term20526, term20526.getClass(), "hour", (byte) 19);
        setByteField(term20526, term20526.getClass(), "minute", (byte) 15);
        setByteField(term20526, term20526.getClass(), "second", (byte) 16);
        setIntField(term20526, term20526.getClass(), "nano", 554834199);
        setField(term20521, term20521.getClass(), "time", term20526);
        setField(term20496, term20496.getClass(), "lastLoginDate", term20521);
        setBooleanField(term20496, term20496.getClass(), "isWebJoin", false);
        setField(term20496, term20496.getClass(), "webLimitDate", "tkmmGweDwJ");
        setIntField(term20496, term20496.getClass(), "level", 1835568392);
        setIntField(term20496, term20496.getClass(), "reincarnationNum", 457470807);
        setField(term20496, term20496.getClass(), "exp", "pMfTuAFXxg");
        setLongField(term20496, term20496.getClass(), "point", 4552367707739103094L);
        setLongField(term20496, term20496.getClass(), "totalPoint", -6001151456088965547L);
        setIntField(term20496, term20496.getClass(), "playCount", -994742871);
        setIntField(term20496, term20496.getClass(), "multiPlayCount", -222412326);
        setIntField(term20496, term20496.getClass(), "multiWinCount", -299497261);
        setIntField(term20496, term20496.getClass(), "requestResCount", -23054366);
        setIntField(term20496, term20496.getClass(), "acceptResCount", 153009426);
        setIntField(term20496, term20496.getClass(), "successResCount", 185751892);
        setIntField(term20496, term20496.getClass(), "playerRating", 1068256001);
        setIntField(term20496, term20496.getClass(), "highestRating", 1139078354);
        setIntField(term20496, term20496.getClass(), "nameplateId", -691164974);
        setIntField(term20496, term20496.getClass(), "frameId", -761675396);
        setIntField(term20496, term20496.getClass(), "characterId", -1954860951);
        setIntField(term20496, term20496.getClass(), "trophyId", -2078879114);
        setIntField(term20496, term20496.getClass(), "playedTutorialBit", -1186882318);
        setIntField(term20496, term20496.getClass(), "firstTutorialCancelNum", 1077647088);
        setIntField(term20496, term20496.getClass(), "masterTutorialCancelNum", -705176810);
        setIntField(term20496, term20496.getClass(), "totalRepertoireCount", -1584779593);
        setIntField(term20496, term20496.getClass(), "totalMapNum", 303007547);
        setLongField(term20496, term20496.getClass(), "totalHiScore", 1740732617708040141L);
        setLongField(term20496, term20496.getClass(), "totalBasicHighScore", 3472971833455746664L);
        setLongField(term20496, term20496.getClass(), "totalAdvancedHighScore", 3731931947533293029L);
        setLongField(term20496, term20496.getClass(), "totalExpertHighScore", 9214973322210954344L);
        setLongField(term20496, term20496.getClass(), "totalMasterHighScore", 3662777917800385964L);
        setIntField(term20583, term20583.getClass(), "year", 2018);
        setShortField(term20583, term20583.getClass(), "month", (short) 2);
        setShortField(term20583, term20583.getClass(), "day", (short) 13);
        setField(term20582, term20582.getClass(), "date", term20583);
        setByteField(term20587, term20587.getClass(), "hour", (byte) 15);
        setByteField(term20587, term20587.getClass(), "minute", (byte) 1);
        setByteField(term20587, term20587.getClass(), "second", (byte) 45);
        setIntField(term20587, term20587.getClass(), "nano", 380020898);
        setField(term20582, term20582.getClass(), "time", term20587);
        setField(term20496, term20496.getClass(), "eventWatchedDate", term20582);
        setIntField(term20496, term20496.getClass(), "friendCount", 1498738343);
        setBooleanField(term20496, term20496.getClass(), "isMaimai", false);
        setField(term20496, term20496.getClass(), "firstGameId", "XCZmhkblRc");
        setField(term20496, term20496.getClass(), "firstRomVersion", "gFUWMydGCU");
        setField(term20496, term20496.getClass(), "firstDataVersion", "LLegSTfqJt");
        setIntField(term20631, term20631.getClass(), "year", 2022);
        setShortField(term20631, term20631.getClass(), "month", (short) 8);
        setShortField(term20631, term20631.getClass(), "day", (short) 30);
        setField(term20630, term20630.getClass(), "date", term20631);
        setByteField(term20635, term20635.getClass(), "hour", (byte) 3);
        setByteField(term20635, term20635.getClass(), "minute", (byte) 13);
        setByteField(term20635, term20635.getClass(), "second", (byte) 34);
        setIntField(term20635, term20635.getClass(), "nano", 69286341);
        setField(term20630, term20630.getClass(), "time", term20635);
        setField(term20496, term20496.getClass(), "firstPlayDate", term20630);
        setField(term20496, term20496.getClass(), "lastGameId", "XQfmqLbqHS");
        setField(term20496, term20496.getClass(), "lastRomVersion", "jLVLqQSjqg");
        setField(term20496, term20496.getClass(), "lastDataVersion", "JKGueoHesL");
        setIntField(term20677, term20677.getClass(), "year", 2013);
        setShortField(term20677, term20677.getClass(), "month", (short) 5);
        setShortField(term20677, term20677.getClass(), "day", (short) 14);
        setField(term20676, term20676.getClass(), "date", term20677);
        setByteField(term20681, term20681.getClass(), "hour", (byte) 12);
        setByteField(term20681, term20681.getClass(), "minute", (byte) 8);
        setByteField(term20681, term20681.getClass(), "second", (byte) 12);
        setIntField(term20681, term20681.getClass(), "nano", 597594916);
        setField(term20676, term20676.getClass(), "time", term20681);
        setField(term20496, term20496.getClass(), "lastPlayDate", term20676);
        setIntField(term20496, term20496.getClass(), "lastPlaceId", -1635571857);
        setField(term20496, term20496.getClass(), "lastPlaceName", "CRAUqtVBkU");
        setField(term20496, term20496.getClass(), "lastRegionId", "DddqUYfomL");
        setField(term20496, term20496.getClass(), "lastRegionName", "YQwoogpPyi");
        setField(term20496, term20496.getClass(), "lastAllNetId", "rnPhHoorxj");
        setField(term20496, term20496.getClass(), "lastClientId", "GuwJLKquuI");
        term20747 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20752 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20748, term20748.getClass(), "year", 2020);
        setShortField(term20748, term20748.getClass(), "month", (short) 4);
        setShortField(term20748, term20748.getClass(), "day", (short) 2);
        setField(term20747, term20747.getClass(), "date", term20748);
        setByteField(term20752, term20752.getClass(), "hour", (byte) 11);
        setByteField(term20752, term20752.getClass(), "minute", (byte) 26);
        setByteField(term20752, term20752.getClass(), "second", (byte) 22);
        setIntField(term20752, term20752.getClass(), "nano", 168224721);
        setField(term20747, term20747.getClass(), "time", term20752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term20747;
        callMethod(klass, "setLastLoginDate", argTypes, term20496, args);
    }

};


