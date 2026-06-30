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

public class ExternalUserData_setTrophyId_114886160870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28201;
     Object term28452;

    public ExternalUserData_setTrophyId_114886160870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28201 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term28226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28287 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28292 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28335 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28340 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28386 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28201, term28201.getClass(), "accessCode", "FOKfDXQxMM");
        setField(term28201, term28201.getClass(), "userName", "gbxMvhrWpA");
        setIntField(term28227, term28227.getClass(), "year", 2016);
        setShortField(term28227, term28227.getClass(), "month", (short) 2);
        setShortField(term28227, term28227.getClass(), "day", (short) 2);
        setField(term28226, term28226.getClass(), "date", term28227);
        setByteField(term28231, term28231.getClass(), "hour", (byte) 16);
        setByteField(term28231, term28231.getClass(), "minute", (byte) 51);
        setByteField(term28231, term28231.getClass(), "second", (byte) 8);
        setIntField(term28231, term28231.getClass(), "nano", 991355221);
        setField(term28226, term28226.getClass(), "time", term28231);
        setField(term28201, term28201.getClass(), "lastLoginDate", term28226);
        setBooleanField(term28201, term28201.getClass(), "isWebJoin", false);
        setField(term28201, term28201.getClass(), "webLimitDate", "huNTIobUHx");
        setIntField(term28201, term28201.getClass(), "level", 113007640);
        setIntField(term28201, term28201.getClass(), "reincarnationNum", 1782226794);
        setField(term28201, term28201.getClass(), "exp", "MrVeCmRVzF");
        setLongField(term28201, term28201.getClass(), "point", 8918129626022907229L);
        setLongField(term28201, term28201.getClass(), "totalPoint", 6269054578518955349L);
        setIntField(term28201, term28201.getClass(), "playCount", 1115327577);
        setIntField(term28201, term28201.getClass(), "multiPlayCount", 840704993);
        setIntField(term28201, term28201.getClass(), "multiWinCount", 1297035285);
        setIntField(term28201, term28201.getClass(), "requestResCount", -826239685);
        setIntField(term28201, term28201.getClass(), "acceptResCount", -845551243);
        setIntField(term28201, term28201.getClass(), "successResCount", 370671198);
        setIntField(term28201, term28201.getClass(), "playerRating", 1426800646);
        setIntField(term28201, term28201.getClass(), "highestRating", 954234820);
        setIntField(term28201, term28201.getClass(), "nameplateId", 1047346538);
        setIntField(term28201, term28201.getClass(), "frameId", 728436340);
        setIntField(term28201, term28201.getClass(), "characterId", 1841731593);
        setIntField(term28201, term28201.getClass(), "trophyId", -1854929057);
        setIntField(term28201, term28201.getClass(), "playedTutorialBit", 1703814701);
        setIntField(term28201, term28201.getClass(), "firstTutorialCancelNum", 1370246522);
        setIntField(term28201, term28201.getClass(), "masterTutorialCancelNum", -574611924);
        setIntField(term28201, term28201.getClass(), "totalRepertoireCount", 512521742);
        setIntField(term28201, term28201.getClass(), "totalMapNum", 1291000976);
        setLongField(term28201, term28201.getClass(), "totalHiScore", -143609946830350439L);
        setLongField(term28201, term28201.getClass(), "totalBasicHighScore", 2018084438165711668L);
        setLongField(term28201, term28201.getClass(), "totalAdvancedHighScore", -8705953038984862378L);
        setLongField(term28201, term28201.getClass(), "totalExpertHighScore", -7589547201844161961L);
        setLongField(term28201, term28201.getClass(), "totalMasterHighScore", 8847748922379375307L);
        setIntField(term28288, term28288.getClass(), "year", 2019);
        setShortField(term28288, term28288.getClass(), "month", (short) 12);
        setShortField(term28288, term28288.getClass(), "day", (short) 8);
        setField(term28287, term28287.getClass(), "date", term28288);
        setByteField(term28292, term28292.getClass(), "hour", (byte) 6);
        setByteField(term28292, term28292.getClass(), "minute", (byte) 0);
        setByteField(term28292, term28292.getClass(), "second", (byte) 32);
        setIntField(term28292, term28292.getClass(), "nano", 371231280);
        setField(term28287, term28287.getClass(), "time", term28292);
        setField(term28201, term28201.getClass(), "eventWatchedDate", term28287);
        setIntField(term28201, term28201.getClass(), "friendCount", 1143522832);
        setBooleanField(term28201, term28201.getClass(), "isMaimai", true);
        setField(term28201, term28201.getClass(), "firstGameId", "CPVnQYACKw");
        setField(term28201, term28201.getClass(), "firstRomVersion", "sbdLhVCRsw");
        setField(term28201, term28201.getClass(), "firstDataVersion", "soJHvZwbtF");
        setIntField(term28336, term28336.getClass(), "year", 2024);
        setShortField(term28336, term28336.getClass(), "month", (short) 3);
        setShortField(term28336, term28336.getClass(), "day", (short) 19);
        setField(term28335, term28335.getClass(), "date", term28336);
        setByteField(term28340, term28340.getClass(), "hour", (byte) 16);
        setByteField(term28340, term28340.getClass(), "minute", (byte) 8);
        setByteField(term28340, term28340.getClass(), "second", (byte) 55);
        setIntField(term28340, term28340.getClass(), "nano", 955822950);
        setField(term28335, term28335.getClass(), "time", term28340);
        setField(term28201, term28201.getClass(), "firstPlayDate", term28335);
        setField(term28201, term28201.getClass(), "lastGameId", "dTGwgkfDVj");
        setField(term28201, term28201.getClass(), "lastRomVersion", "zHiuLPzYQM");
        setField(term28201, term28201.getClass(), "lastDataVersion", "ioYxUYJBrh");
        setIntField(term28382, term28382.getClass(), "year", 2010);
        setShortField(term28382, term28382.getClass(), "month", (short) 11);
        setShortField(term28382, term28382.getClass(), "day", (short) 14);
        setField(term28381, term28381.getClass(), "date", term28382);
        setByteField(term28386, term28386.getClass(), "hour", (byte) 4);
        setByteField(term28386, term28386.getClass(), "minute", (byte) 49);
        setByteField(term28386, term28386.getClass(), "second", (byte) 50);
        setIntField(term28386, term28386.getClass(), "nano", 621399921);
        setField(term28381, term28381.getClass(), "time", term28386);
        setField(term28201, term28201.getClass(), "lastPlayDate", term28381);
        setIntField(term28201, term28201.getClass(), "lastPlaceId", 40965975);
        setField(term28201, term28201.getClass(), "lastPlaceName", "GXoLEdKEIe");
        setField(term28201, term28201.getClass(), "lastRegionId", "EugWXkztim");
        setField(term28201, term28201.getClass(), "lastRegionName", "DvRdOzzihn");
        setField(term28201, term28201.getClass(), "lastAllNetId", "wIygCdQAKO");
        setField(term28201, term28201.getClass(), "lastClientId", "JsXroBYqwr");
        term28452 = new Integer(-194718582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28452;
        callMethod(klass, "setTrophyId", argTypes, term28201, args);
    }

};


