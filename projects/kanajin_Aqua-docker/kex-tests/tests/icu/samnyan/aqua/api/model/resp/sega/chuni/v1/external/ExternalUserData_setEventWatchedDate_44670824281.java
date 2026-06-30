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

public class ExternalUserData_setEventWatchedDate_44670824281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32634;
     Object term32885;

    public ExternalUserData_setEventWatchedDate_44670824281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32634 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term32659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32819 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32634, term32634.getClass(), "accessCode", "JCWSoxnBJs");
        setField(term32634, term32634.getClass(), "userName", "vAxcpvjEEa");
        setIntField(term32660, term32660.getClass(), "year", 2018);
        setShortField(term32660, term32660.getClass(), "month", (short) 1);
        setShortField(term32660, term32660.getClass(), "day", (short) 29);
        setField(term32659, term32659.getClass(), "date", term32660);
        setByteField(term32664, term32664.getClass(), "hour", (byte) 17);
        setByteField(term32664, term32664.getClass(), "minute", (byte) 5);
        setByteField(term32664, term32664.getClass(), "second", (byte) 53);
        setIntField(term32664, term32664.getClass(), "nano", 36624440);
        setField(term32659, term32659.getClass(), "time", term32664);
        setField(term32634, term32634.getClass(), "lastLoginDate", term32659);
        setBooleanField(term32634, term32634.getClass(), "isWebJoin", false);
        setField(term32634, term32634.getClass(), "webLimitDate", "FCkOgIBqXE");
        setIntField(term32634, term32634.getClass(), "level", 2111611214);
        setIntField(term32634, term32634.getClass(), "reincarnationNum", -2031129784);
        setField(term32634, term32634.getClass(), "exp", "kadRHthQRD");
        setLongField(term32634, term32634.getClass(), "point", -8605430501912680279L);
        setLongField(term32634, term32634.getClass(), "totalPoint", 2985226914509512766L);
        setIntField(term32634, term32634.getClass(), "playCount", 251039122);
        setIntField(term32634, term32634.getClass(), "multiPlayCount", 459471826);
        setIntField(term32634, term32634.getClass(), "multiWinCount", -1054011286);
        setIntField(term32634, term32634.getClass(), "requestResCount", -1640361091);
        setIntField(term32634, term32634.getClass(), "acceptResCount", -1908164516);
        setIntField(term32634, term32634.getClass(), "successResCount", -1343269854);
        setIntField(term32634, term32634.getClass(), "playerRating", -731459309);
        setIntField(term32634, term32634.getClass(), "highestRating", -913468095);
        setIntField(term32634, term32634.getClass(), "nameplateId", 38489871);
        setIntField(term32634, term32634.getClass(), "frameId", -1667787735);
        setIntField(term32634, term32634.getClass(), "characterId", 1841765799);
        setIntField(term32634, term32634.getClass(), "trophyId", 72160200);
        setIntField(term32634, term32634.getClass(), "playedTutorialBit", -1870567623);
        setIntField(term32634, term32634.getClass(), "firstTutorialCancelNum", -1442923471);
        setIntField(term32634, term32634.getClass(), "masterTutorialCancelNum", -434247549);
        setIntField(term32634, term32634.getClass(), "totalRepertoireCount", 1246505552);
        setIntField(term32634, term32634.getClass(), "totalMapNum", -1456497810);
        setLongField(term32634, term32634.getClass(), "totalHiScore", 4041117732464806744L);
        setLongField(term32634, term32634.getClass(), "totalBasicHighScore", 7199459243454109261L);
        setLongField(term32634, term32634.getClass(), "totalAdvancedHighScore", -1009485425289165749L);
        setLongField(term32634, term32634.getClass(), "totalExpertHighScore", -5044181804110715069L);
        setLongField(term32634, term32634.getClass(), "totalMasterHighScore", -2413135395771470086L);
        setIntField(term32721, term32721.getClass(), "year", 2022);
        setShortField(term32721, term32721.getClass(), "month", (short) 12);
        setShortField(term32721, term32721.getClass(), "day", (short) 22);
        setField(term32720, term32720.getClass(), "date", term32721);
        setByteField(term32725, term32725.getClass(), "hour", (byte) 18);
        setByteField(term32725, term32725.getClass(), "minute", (byte) 30);
        setByteField(term32725, term32725.getClass(), "second", (byte) 56);
        setIntField(term32725, term32725.getClass(), "nano", 111391416);
        setField(term32720, term32720.getClass(), "time", term32725);
        setField(term32634, term32634.getClass(), "eventWatchedDate", term32720);
        setIntField(term32634, term32634.getClass(), "friendCount", 61954667);
        setBooleanField(term32634, term32634.getClass(), "isMaimai", true);
        setField(term32634, term32634.getClass(), "firstGameId", "cGbJSRSpNn");
        setField(term32634, term32634.getClass(), "firstRomVersion", "MzXzaqaiHW");
        setField(term32634, term32634.getClass(), "firstDataVersion", "jWOWtrhVkA");
        setIntField(term32769, term32769.getClass(), "year", 2019);
        setShortField(term32769, term32769.getClass(), "month", (short) 6);
        setShortField(term32769, term32769.getClass(), "day", (short) 22);
        setField(term32768, term32768.getClass(), "date", term32769);
        setByteField(term32773, term32773.getClass(), "hour", (byte) 9);
        setByteField(term32773, term32773.getClass(), "minute", (byte) 14);
        setByteField(term32773, term32773.getClass(), "second", (byte) 27);
        setIntField(term32773, term32773.getClass(), "nano", 124138657);
        setField(term32768, term32768.getClass(), "time", term32773);
        setField(term32634, term32634.getClass(), "firstPlayDate", term32768);
        setField(term32634, term32634.getClass(), "lastGameId", "IyOhWYyaDV");
        setField(term32634, term32634.getClass(), "lastRomVersion", "omWrkCSFzy");
        setField(term32634, term32634.getClass(), "lastDataVersion", "VFYvUTgYFB");
        setIntField(term32815, term32815.getClass(), "year", 2023);
        setShortField(term32815, term32815.getClass(), "month", (short) 5);
        setShortField(term32815, term32815.getClass(), "day", (short) 8);
        setField(term32814, term32814.getClass(), "date", term32815);
        setByteField(term32819, term32819.getClass(), "hour", (byte) 6);
        setByteField(term32819, term32819.getClass(), "minute", (byte) 35);
        setByteField(term32819, term32819.getClass(), "second", (byte) 9);
        setIntField(term32819, term32819.getClass(), "nano", 577816079);
        setField(term32814, term32814.getClass(), "time", term32819);
        setField(term32634, term32634.getClass(), "lastPlayDate", term32814);
        setIntField(term32634, term32634.getClass(), "lastPlaceId", -919022885);
        setField(term32634, term32634.getClass(), "lastPlaceName", "BrWqhEIUUj");
        setField(term32634, term32634.getClass(), "lastRegionId", "WfUmxdiHcU");
        setField(term32634, term32634.getClass(), "lastRegionName", "BRrftvRvmF");
        setField(term32634, term32634.getClass(), "lastAllNetId", "fvoyRbZTsm");
        setField(term32634, term32634.getClass(), "lastClientId", "iOCnOQXWTl");
        term32885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32890 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32886, term32886.getClass(), "year", 2019);
        setShortField(term32886, term32886.getClass(), "month", (short) 12);
        setShortField(term32886, term32886.getClass(), "day", (short) 13);
        setField(term32885, term32885.getClass(), "date", term32886);
        setByteField(term32890, term32890.getClass(), "hour", (byte) 7);
        setByteField(term32890, term32890.getClass(), "minute", (byte) 59);
        setByteField(term32890, term32890.getClass(), "second", (byte) 40);
        setIntField(term32890, term32890.getClass(), "nano", 824164134);
        setField(term32885, term32885.getClass(), "time", term32890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term32885;
        callMethod(klass, "setEventWatchedDate", argTypes, term32634, args);
    }

};


