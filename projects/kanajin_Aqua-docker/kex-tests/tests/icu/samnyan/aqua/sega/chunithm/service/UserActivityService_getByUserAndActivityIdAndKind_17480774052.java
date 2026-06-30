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

public class UserActivityService_getByUserAndActivityIdAndKind_17480774052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6281;
     Object term6557;
     Object term6559;

    public UserActivityService_getByUserAndActivityIdAndKind_17480774052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6285 = new Long(7009926388951271268L);
        term6281 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term6283 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6336 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6397 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6445 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6491 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6281, term6281.getClass(), "id", 21047099434645581L);
        setLongField(term6283, term6283.getClass(), "id", -8862087040734407227L);
        setField(term6283, term6283.getClass(), "extId", term6285);
        setField(term6283, term6283.getClass(), "luid", "nKZKnxWYCK");
        setIntField(term6300, term6300.getClass(), "year", 2014);
        setShortField(term6300, term6300.getClass(), "month", (short) 1);
        setShortField(term6300, term6300.getClass(), "day", (short) 23);
        setField(term6299, term6299.getClass(), "date", term6300);
        setByteField(term6304, term6304.getClass(), "hour", (byte) 19);
        setByteField(term6304, term6304.getClass(), "minute", (byte) 52);
        setByteField(term6304, term6304.getClass(), "second", (byte) 9);
        setIntField(term6304, term6304.getClass(), "nano", 235326975);
        setField(term6299, term6299.getClass(), "time", term6304);
        setField(term6283, term6283.getClass(), "registerTime", term6299);
        setIntField(term6310, term6310.getClass(), "year", 2023);
        setShortField(term6310, term6310.getClass(), "month", (short) 8);
        setShortField(term6310, term6310.getClass(), "day", (short) 21);
        setField(term6309, term6309.getClass(), "date", term6310);
        setByteField(term6314, term6314.getClass(), "hour", (byte) 10);
        setByteField(term6314, term6314.getClass(), "minute", (byte) 36);
        setByteField(term6314, term6314.getClass(), "second", (byte) 15);
        setIntField(term6314, term6314.getClass(), "nano", 257070204);
        setField(term6309, term6309.getClass(), "time", term6314);
        setField(term6283, term6283.getClass(), "accessTime", term6309);
        setField(term6281, term6281.getClass(), "card", term6283);
        setField(term6281, term6281.getClass(), "userName", "JOqQxuzRuZ");
        setIntField(term6332, term6332.getClass(), "year", 2012);
        setShortField(term6332, term6332.getClass(), "month", (short) 12);
        setShortField(term6332, term6332.getClass(), "day", (short) 14);
        setField(term6331, term6331.getClass(), "date", term6332);
        setByteField(term6336, term6336.getClass(), "hour", (byte) 1);
        setByteField(term6336, term6336.getClass(), "minute", (byte) 47);
        setByteField(term6336, term6336.getClass(), "second", (byte) 3);
        setIntField(term6336, term6336.getClass(), "nano", 359751066);
        setField(term6331, term6331.getClass(), "time", term6336);
        setField(term6281, term6281.getClass(), "lastLoginDate", term6331);
        setBooleanField(term6281, term6281.getClass(), "isWebJoin", false);
        setField(term6281, term6281.getClass(), "webLimitDate", "RSaoipUlsg");
        setIntField(term6281, term6281.getClass(), "level", -865722613);
        setIntField(term6281, term6281.getClass(), "reincarnationNum", -1551355284);
        setField(term6281, term6281.getClass(), "exp", "cSHGbqKqlN");
        setLongField(term6281, term6281.getClass(), "point", -6394943900800506753L);
        setLongField(term6281, term6281.getClass(), "totalPoint", -4867941246533901410L);
        setIntField(term6281, term6281.getClass(), "playCount", -1381970335);
        setIntField(term6281, term6281.getClass(), "multiPlayCount", 1213549815);
        setIntField(term6281, term6281.getClass(), "multiWinCount", -1518419301);
        setIntField(term6281, term6281.getClass(), "requestResCount", 674879025);
        setIntField(term6281, term6281.getClass(), "acceptResCount", -1538936030);
        setIntField(term6281, term6281.getClass(), "successResCount", -752870423);
        setIntField(term6281, term6281.getClass(), "playerRating", -1698809299);
        setIntField(term6281, term6281.getClass(), "highestRating", 401512128);
        setIntField(term6281, term6281.getClass(), "nameplateId", -2069930777);
        setIntField(term6281, term6281.getClass(), "frameId", 1543696412);
        setIntField(term6281, term6281.getClass(), "characterId", -1385748168);
        setIntField(term6281, term6281.getClass(), "trophyId", -270592367);
        setIntField(term6281, term6281.getClass(), "playedTutorialBit", 178847646);
        setIntField(term6281, term6281.getClass(), "firstTutorialCancelNum", 273590437);
        setIntField(term6281, term6281.getClass(), "masterTutorialCancelNum", -348612876);
        setIntField(term6281, term6281.getClass(), "totalRepertoireCount", 1302807565);
        setIntField(term6281, term6281.getClass(), "totalMapNum", -838848221);
        setLongField(term6281, term6281.getClass(), "totalHiScore", 1044883697493326351L);
        setLongField(term6281, term6281.getClass(), "totalBasicHighScore", -7406618974062419277L);
        setLongField(term6281, term6281.getClass(), "totalAdvancedHighScore", 868503089567085985L);
        setLongField(term6281, term6281.getClass(), "totalExpertHighScore", -3277773415369003529L);
        setLongField(term6281, term6281.getClass(), "totalMasterHighScore", 1253549421411622358L);
        setIntField(term6393, term6393.getClass(), "year", 2010);
        setShortField(term6393, term6393.getClass(), "month", (short) 2);
        setShortField(term6393, term6393.getClass(), "day", (short) 28);
        setField(term6392, term6392.getClass(), "date", term6393);
        setByteField(term6397, term6397.getClass(), "hour", (byte) 2);
        setByteField(term6397, term6397.getClass(), "minute", (byte) 54);
        setByteField(term6397, term6397.getClass(), "second", (byte) 48);
        setIntField(term6397, term6397.getClass(), "nano", 930628940);
        setField(term6392, term6392.getClass(), "time", term6397);
        setField(term6281, term6281.getClass(), "eventWatchedDate", term6392);
        setIntField(term6281, term6281.getClass(), "friendCount", 1163761623);
        setBooleanField(term6281, term6281.getClass(), "isMaimai", true);
        setField(term6281, term6281.getClass(), "firstGameId", "pFAfANnxup");
        setField(term6281, term6281.getClass(), "firstRomVersion", "FbSIUZyBXZ");
        setField(term6281, term6281.getClass(), "firstDataVersion", "mhQDwIyrRi");
        setIntField(term6441, term6441.getClass(), "year", 2022);
        setShortField(term6441, term6441.getClass(), "month", (short) 3);
        setShortField(term6441, term6441.getClass(), "day", (short) 11);
        setField(term6440, term6440.getClass(), "date", term6441);
        setByteField(term6445, term6445.getClass(), "hour", (byte) 7);
        setByteField(term6445, term6445.getClass(), "minute", (byte) 12);
        setByteField(term6445, term6445.getClass(), "second", (byte) 56);
        setIntField(term6445, term6445.getClass(), "nano", 884158779);
        setField(term6440, term6440.getClass(), "time", term6445);
        setField(term6281, term6281.getClass(), "firstPlayDate", term6440);
        setField(term6281, term6281.getClass(), "lastGameId", "HpZXWDPhlg");
        setField(term6281, term6281.getClass(), "lastRomVersion", "lBOokzEPfe");
        setField(term6281, term6281.getClass(), "lastDataVersion", "dtGZCsKXbW");
        setIntField(term6487, term6487.getClass(), "year", 2020);
        setShortField(term6487, term6487.getClass(), "month", (short) 2);
        setShortField(term6487, term6487.getClass(), "day", (short) 1);
        setField(term6486, term6486.getClass(), "date", term6487);
        setByteField(term6491, term6491.getClass(), "hour", (byte) 0);
        setByteField(term6491, term6491.getClass(), "minute", (byte) 46);
        setByteField(term6491, term6491.getClass(), "second", (byte) 1);
        setIntField(term6491, term6491.getClass(), "nano", 544722812);
        setField(term6486, term6486.getClass(), "time", term6491);
        setField(term6281, term6281.getClass(), "lastPlayDate", term6486);
        setIntField(term6281, term6281.getClass(), "lastPlaceId", 718742281);
        setField(term6281, term6281.getClass(), "lastPlaceName", "bdyhHbDAmJ");
        setField(term6281, term6281.getClass(), "lastRegionId", "BBXiTNHqGE");
        setField(term6281, term6281.getClass(), "lastRegionName", "IEYhJmgCVd");
        setField(term6281, term6281.getClass(), "lastAllNetId", "KSJeYkkvpk");
        setField(term6281, term6281.getClass(), "lastClientId", "qUtkFGMNUV");
        term6557 = new Integer(1532723756);
        term6559 = new Integer(-124088550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserActivityService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term6281;
        args[1] = term6557;
        args[2] = term6559;
        callMethod(klass, "getByUserAndActivityIdAndKind", argTypes, null, args);
    }

};


