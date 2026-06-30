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

public class ExternalUserData_setLastPlaceId_65822751592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37211;
     Object term37462;

    public ExternalUserData_setLastPlaceId_65822751592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37211 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term37236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37241 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37302 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37350 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37396 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term37211, term37211.getClass(), "accessCode", "gASHxChKwn");
        setField(term37211, term37211.getClass(), "userName", "iasolXlEEn");
        setIntField(term37237, term37237.getClass(), "year", 2026);
        setShortField(term37237, term37237.getClass(), "month", (short) 2);
        setShortField(term37237, term37237.getClass(), "day", (short) 26);
        setField(term37236, term37236.getClass(), "date", term37237);
        setByteField(term37241, term37241.getClass(), "hour", (byte) 12);
        setByteField(term37241, term37241.getClass(), "minute", (byte) 23);
        setByteField(term37241, term37241.getClass(), "second", (byte) 14);
        setIntField(term37241, term37241.getClass(), "nano", 86303611);
        setField(term37236, term37236.getClass(), "time", term37241);
        setField(term37211, term37211.getClass(), "lastLoginDate", term37236);
        setBooleanField(term37211, term37211.getClass(), "isWebJoin", true);
        setField(term37211, term37211.getClass(), "webLimitDate", "cAObIvLmLo");
        setIntField(term37211, term37211.getClass(), "level", 1645751151);
        setIntField(term37211, term37211.getClass(), "reincarnationNum", -2117930201);
        setField(term37211, term37211.getClass(), "exp", "xwiCqRSWSe");
        setLongField(term37211, term37211.getClass(), "point", 675601558105654203L);
        setLongField(term37211, term37211.getClass(), "totalPoint", -6481933642917183045L);
        setIntField(term37211, term37211.getClass(), "playCount", 1839150896);
        setIntField(term37211, term37211.getClass(), "multiPlayCount", -1487860516);
        setIntField(term37211, term37211.getClass(), "multiWinCount", 784631129);
        setIntField(term37211, term37211.getClass(), "requestResCount", 658285959);
        setIntField(term37211, term37211.getClass(), "acceptResCount", -89362706);
        setIntField(term37211, term37211.getClass(), "successResCount", 341388367);
        setIntField(term37211, term37211.getClass(), "playerRating", 1078807592);
        setIntField(term37211, term37211.getClass(), "highestRating", 1673044047);
        setIntField(term37211, term37211.getClass(), "nameplateId", -1835617743);
        setIntField(term37211, term37211.getClass(), "frameId", -337695922);
        setIntField(term37211, term37211.getClass(), "characterId", 817836900);
        setIntField(term37211, term37211.getClass(), "trophyId", 1691654567);
        setIntField(term37211, term37211.getClass(), "playedTutorialBit", -1604942135);
        setIntField(term37211, term37211.getClass(), "firstTutorialCancelNum", 2000275611);
        setIntField(term37211, term37211.getClass(), "masterTutorialCancelNum", 2060369122);
        setIntField(term37211, term37211.getClass(), "totalRepertoireCount", -1275204506);
        setIntField(term37211, term37211.getClass(), "totalMapNum", 507439888);
        setLongField(term37211, term37211.getClass(), "totalHiScore", 2054808971423494757L);
        setLongField(term37211, term37211.getClass(), "totalBasicHighScore", 8734518435788772658L);
        setLongField(term37211, term37211.getClass(), "totalAdvancedHighScore", 2289954139848415685L);
        setLongField(term37211, term37211.getClass(), "totalExpertHighScore", -6137280723045949220L);
        setLongField(term37211, term37211.getClass(), "totalMasterHighScore", -7787918913179897745L);
        setIntField(term37298, term37298.getClass(), "year", 2014);
        setShortField(term37298, term37298.getClass(), "month", (short) 6);
        setShortField(term37298, term37298.getClass(), "day", (short) 12);
        setField(term37297, term37297.getClass(), "date", term37298);
        setByteField(term37302, term37302.getClass(), "hour", (byte) 5);
        setByteField(term37302, term37302.getClass(), "minute", (byte) 4);
        setByteField(term37302, term37302.getClass(), "second", (byte) 20);
        setIntField(term37302, term37302.getClass(), "nano", 169602296);
        setField(term37297, term37297.getClass(), "time", term37302);
        setField(term37211, term37211.getClass(), "eventWatchedDate", term37297);
        setIntField(term37211, term37211.getClass(), "friendCount", 1936798149);
        setBooleanField(term37211, term37211.getClass(), "isMaimai", true);
        setField(term37211, term37211.getClass(), "firstGameId", "IbUFkzIgzq");
        setField(term37211, term37211.getClass(), "firstRomVersion", "dTOUSTDdbw");
        setField(term37211, term37211.getClass(), "firstDataVersion", "PECfBejlfo");
        setIntField(term37346, term37346.getClass(), "year", 2021);
        setShortField(term37346, term37346.getClass(), "month", (short) 5);
        setShortField(term37346, term37346.getClass(), "day", (short) 13);
        setField(term37345, term37345.getClass(), "date", term37346);
        setByteField(term37350, term37350.getClass(), "hour", (byte) 15);
        setByteField(term37350, term37350.getClass(), "minute", (byte) 40);
        setByteField(term37350, term37350.getClass(), "second", (byte) 27);
        setIntField(term37350, term37350.getClass(), "nano", 319035378);
        setField(term37345, term37345.getClass(), "time", term37350);
        setField(term37211, term37211.getClass(), "firstPlayDate", term37345);
        setField(term37211, term37211.getClass(), "lastGameId", "SDbDgydVpg");
        setField(term37211, term37211.getClass(), "lastRomVersion", "EEMaiNkiOH");
        setField(term37211, term37211.getClass(), "lastDataVersion", "sFdmTylvqh");
        setIntField(term37392, term37392.getClass(), "year", 2012);
        setShortField(term37392, term37392.getClass(), "month", (short) 5);
        setShortField(term37392, term37392.getClass(), "day", (short) 21);
        setField(term37391, term37391.getClass(), "date", term37392);
        setByteField(term37396, term37396.getClass(), "hour", (byte) 19);
        setByteField(term37396, term37396.getClass(), "minute", (byte) 56);
        setByteField(term37396, term37396.getClass(), "second", (byte) 3);
        setIntField(term37396, term37396.getClass(), "nano", 266247153);
        setField(term37391, term37391.getClass(), "time", term37396);
        setField(term37211, term37211.getClass(), "lastPlayDate", term37391);
        setIntField(term37211, term37211.getClass(), "lastPlaceId", 188304401);
        setField(term37211, term37211.getClass(), "lastPlaceName", "rgniLaOaiz");
        setField(term37211, term37211.getClass(), "lastRegionId", "fzQzzdIOMC");
        setField(term37211, term37211.getClass(), "lastRegionName", "hLVDOhfCKX");
        setField(term37211, term37211.getClass(), "lastAllNetId", "yXLTfzOgfX");
        setField(term37211, term37211.getClass(), "lastClientId", "MANlfBKTPY");
        term37462 = new Integer(-40613160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37462;
        callMethod(klass, "setLastPlaceId", argTypes, term37211, args);
    }

};


