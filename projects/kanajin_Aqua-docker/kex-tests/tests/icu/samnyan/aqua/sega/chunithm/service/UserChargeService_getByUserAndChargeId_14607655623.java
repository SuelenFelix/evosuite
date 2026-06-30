package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserChargeService_getByUserAndChargeId_14607655623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3389;
     Object term3665;

    public UserChargeService_getByUserAndChargeId_14607655623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3393 = new Long(2535595959091595249L);
        term3389 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term3391 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3407 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3408 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3412 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3444 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3500 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3501 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3505 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3553 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3594 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3599 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3389, term3389.getClass(), "id", -4393710401270724527L);
        setLongField(term3391, term3391.getClass(), "id", -4822736661741380518L);
        setField(term3391, term3391.getClass(), "extId", term3393);
        setField(term3391, term3391.getClass(), "luid", "RbVQXSpxXy");
        setIntField(term3408, term3408.getClass(), "year", 2021);
        setShortField(term3408, term3408.getClass(), "month", (short) 4);
        setShortField(term3408, term3408.getClass(), "day", (short) 26);
        setField(term3407, term3407.getClass(), "date", term3408);
        setByteField(term3412, term3412.getClass(), "hour", (byte) 11);
        setByteField(term3412, term3412.getClass(), "minute", (byte) 34);
        setByteField(term3412, term3412.getClass(), "second", (byte) 15);
        setIntField(term3412, term3412.getClass(), "nano", 638206023);
        setField(term3407, term3407.getClass(), "time", term3412);
        setField(term3391, term3391.getClass(), "registerTime", term3407);
        setIntField(term3418, term3418.getClass(), "year", 2013);
        setShortField(term3418, term3418.getClass(), "month", (short) 9);
        setShortField(term3418, term3418.getClass(), "day", (short) 13);
        setField(term3417, term3417.getClass(), "date", term3418);
        setByteField(term3422, term3422.getClass(), "hour", (byte) 14);
        setByteField(term3422, term3422.getClass(), "minute", (byte) 36);
        setByteField(term3422, term3422.getClass(), "second", (byte) 59);
        setIntField(term3422, term3422.getClass(), "nano", 363124001);
        setField(term3417, term3417.getClass(), "time", term3422);
        setField(term3391, term3391.getClass(), "accessTime", term3417);
        setField(term3389, term3389.getClass(), "card", term3391);
        setField(term3389, term3389.getClass(), "userName", "YpJbIgJWWv");
        setIntField(term3440, term3440.getClass(), "year", 2020);
        setShortField(term3440, term3440.getClass(), "month", (short) 12);
        setShortField(term3440, term3440.getClass(), "day", (short) 21);
        setField(term3439, term3439.getClass(), "date", term3440);
        setByteField(term3444, term3444.getClass(), "hour", (byte) 20);
        setByteField(term3444, term3444.getClass(), "minute", (byte) 16);
        setByteField(term3444, term3444.getClass(), "second", (byte) 59);
        setIntField(term3444, term3444.getClass(), "nano", 976524801);
        setField(term3439, term3439.getClass(), "time", term3444);
        setField(term3389, term3389.getClass(), "lastLoginDate", term3439);
        setBooleanField(term3389, term3389.getClass(), "isWebJoin", false);
        setField(term3389, term3389.getClass(), "webLimitDate", "JppkknKVOw");
        setIntField(term3389, term3389.getClass(), "level", -680920524);
        setIntField(term3389, term3389.getClass(), "reincarnationNum", -916335264);
        setField(term3389, term3389.getClass(), "exp", "iljANwuEjk");
        setLongField(term3389, term3389.getClass(), "point", -5386201758403679145L);
        setLongField(term3389, term3389.getClass(), "totalPoint", -7268507582722666254L);
        setIntField(term3389, term3389.getClass(), "playCount", -919416536);
        setIntField(term3389, term3389.getClass(), "multiPlayCount", -43417861);
        setIntField(term3389, term3389.getClass(), "multiWinCount", -1533843432);
        setIntField(term3389, term3389.getClass(), "requestResCount", -123338791);
        setIntField(term3389, term3389.getClass(), "acceptResCount", -1467089634);
        setIntField(term3389, term3389.getClass(), "successResCount", 413548937);
        setIntField(term3389, term3389.getClass(), "playerRating", 1901317214);
        setIntField(term3389, term3389.getClass(), "highestRating", 1166710220);
        setIntField(term3389, term3389.getClass(), "nameplateId", -1070592289);
        setIntField(term3389, term3389.getClass(), "frameId", -1464172784);
        setIntField(term3389, term3389.getClass(), "characterId", 32185364);
        setIntField(term3389, term3389.getClass(), "trophyId", 1768204942);
        setIntField(term3389, term3389.getClass(), "playedTutorialBit", 1252951645);
        setIntField(term3389, term3389.getClass(), "firstTutorialCancelNum", 574481092);
        setIntField(term3389, term3389.getClass(), "masterTutorialCancelNum", -310528004);
        setIntField(term3389, term3389.getClass(), "totalRepertoireCount", -634976996);
        setIntField(term3389, term3389.getClass(), "totalMapNum", -1015274146);
        setLongField(term3389, term3389.getClass(), "totalHiScore", 5671808784468963649L);
        setLongField(term3389, term3389.getClass(), "totalBasicHighScore", 2297097306706899827L);
        setLongField(term3389, term3389.getClass(), "totalAdvancedHighScore", -900457279156388404L);
        setLongField(term3389, term3389.getClass(), "totalExpertHighScore", 1084801489398441516L);
        setLongField(term3389, term3389.getClass(), "totalMasterHighScore", 6273754186658578034L);
        setIntField(term3501, term3501.getClass(), "year", 2028);
        setShortField(term3501, term3501.getClass(), "month", (short) 5);
        setShortField(term3501, term3501.getClass(), "day", (short) 15);
        setField(term3500, term3500.getClass(), "date", term3501);
        setByteField(term3505, term3505.getClass(), "hour", (byte) 20);
        setByteField(term3505, term3505.getClass(), "minute", (byte) 31);
        setByteField(term3505, term3505.getClass(), "second", (byte) 49);
        setIntField(term3505, term3505.getClass(), "nano", 945744862);
        setField(term3500, term3500.getClass(), "time", term3505);
        setField(term3389, term3389.getClass(), "eventWatchedDate", term3500);
        setIntField(term3389, term3389.getClass(), "friendCount", -49052672);
        setBooleanField(term3389, term3389.getClass(), "isMaimai", false);
        setField(term3389, term3389.getClass(), "firstGameId", "kNqaJKIATy");
        setField(term3389, term3389.getClass(), "firstRomVersion", "vKQukfbJUd");
        setField(term3389, term3389.getClass(), "firstDataVersion", "lFRJFUMVbx");
        setIntField(term3549, term3549.getClass(), "year", 2016);
        setShortField(term3549, term3549.getClass(), "month", (short) 6);
        setShortField(term3549, term3549.getClass(), "day", (short) 23);
        setField(term3548, term3548.getClass(), "date", term3549);
        setByteField(term3553, term3553.getClass(), "hour", (byte) 20);
        setByteField(term3553, term3553.getClass(), "minute", (byte) 51);
        setByteField(term3553, term3553.getClass(), "second", (byte) 43);
        setIntField(term3553, term3553.getClass(), "nano", 284389409);
        setField(term3548, term3548.getClass(), "time", term3553);
        setField(term3389, term3389.getClass(), "firstPlayDate", term3548);
        setField(term3389, term3389.getClass(), "lastGameId", "sZdUNdggUW");
        setField(term3389, term3389.getClass(), "lastRomVersion", "OqbwYQfvAe");
        setField(term3389, term3389.getClass(), "lastDataVersion", "tRxZafjqIx");
        setIntField(term3595, term3595.getClass(), "year", 2014);
        setShortField(term3595, term3595.getClass(), "month", (short) 10);
        setShortField(term3595, term3595.getClass(), "day", (short) 7);
        setField(term3594, term3594.getClass(), "date", term3595);
        setByteField(term3599, term3599.getClass(), "hour", (byte) 12);
        setByteField(term3599, term3599.getClass(), "minute", (byte) 59);
        setByteField(term3599, term3599.getClass(), "second", (byte) 39);
        setIntField(term3599, term3599.getClass(), "nano", 603709306);
        setField(term3594, term3594.getClass(), "time", term3599);
        setField(term3389, term3389.getClass(), "lastPlayDate", term3594);
        setIntField(term3389, term3389.getClass(), "lastPlaceId", 339372704);
        setField(term3389, term3389.getClass(), "lastPlaceName", "DhjNLmRMCu");
        setField(term3389, term3389.getClass(), "lastRegionId", "PgPzMSEjjX");
        setField(term3389, term3389.getClass(), "lastRegionName", "wzsPSPcRdj");
        setField(term3389, term3389.getClass(), "lastAllNetId", "kGMQdqJYyB");
        setField(term3389, term3389.getClass(), "lastClientId", "XJJNClzHRf");
        term3665 = new Integer(-851097944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserChargeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3389;
        args[1] = term3665;
        callMethod(klass, "getByUserAndChargeId", argTypes, null, args);
    }

};


