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
import java.lang.Long;

public class ExternalUserData_setTotalHiScore_49003053876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30619;
     Object term30870;

    public ExternalUserData_setTotalHiScore_49003053876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30619 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term30644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30758 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30804 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30619, term30619.getClass(), "accessCode", "cseZveWowm");
        setField(term30619, term30619.getClass(), "userName", "idfslIPhgx");
        setIntField(term30645, term30645.getClass(), "year", 2018);
        setShortField(term30645, term30645.getClass(), "month", (short) 7);
        setShortField(term30645, term30645.getClass(), "day", (short) 6);
        setField(term30644, term30644.getClass(), "date", term30645);
        setByteField(term30649, term30649.getClass(), "hour", (byte) 6);
        setByteField(term30649, term30649.getClass(), "minute", (byte) 33);
        setByteField(term30649, term30649.getClass(), "second", (byte) 21);
        setIntField(term30649, term30649.getClass(), "nano", 484192339);
        setField(term30644, term30644.getClass(), "time", term30649);
        setField(term30619, term30619.getClass(), "lastLoginDate", term30644);
        setBooleanField(term30619, term30619.getClass(), "isWebJoin", true);
        setField(term30619, term30619.getClass(), "webLimitDate", "HyFLOXeoDX");
        setIntField(term30619, term30619.getClass(), "level", 338342107);
        setIntField(term30619, term30619.getClass(), "reincarnationNum", -650288950);
        setField(term30619, term30619.getClass(), "exp", "crkNabVaWs");
        setLongField(term30619, term30619.getClass(), "point", -6656996002079682356L);
        setLongField(term30619, term30619.getClass(), "totalPoint", 2166921473521388808L);
        setIntField(term30619, term30619.getClass(), "playCount", 433039357);
        setIntField(term30619, term30619.getClass(), "multiPlayCount", 1469939797);
        setIntField(term30619, term30619.getClass(), "multiWinCount", 252799294);
        setIntField(term30619, term30619.getClass(), "requestResCount", -2072618022);
        setIntField(term30619, term30619.getClass(), "acceptResCount", -269909549);
        setIntField(term30619, term30619.getClass(), "successResCount", 686286032);
        setIntField(term30619, term30619.getClass(), "playerRating", -1277201854);
        setIntField(term30619, term30619.getClass(), "highestRating", 1691516034);
        setIntField(term30619, term30619.getClass(), "nameplateId", 335681723);
        setIntField(term30619, term30619.getClass(), "frameId", -773707674);
        setIntField(term30619, term30619.getClass(), "characterId", 383244929);
        setIntField(term30619, term30619.getClass(), "trophyId", -2114034003);
        setIntField(term30619, term30619.getClass(), "playedTutorialBit", 207213904);
        setIntField(term30619, term30619.getClass(), "firstTutorialCancelNum", -484303394);
        setIntField(term30619, term30619.getClass(), "masterTutorialCancelNum", -31125530);
        setIntField(term30619, term30619.getClass(), "totalRepertoireCount", 1909773180);
        setIntField(term30619, term30619.getClass(), "totalMapNum", -970417907);
        setLongField(term30619, term30619.getClass(), "totalHiScore", 1964822153944985001L);
        setLongField(term30619, term30619.getClass(), "totalBasicHighScore", -955253666696787757L);
        setLongField(term30619, term30619.getClass(), "totalAdvancedHighScore", -99017747847004910L);
        setLongField(term30619, term30619.getClass(), "totalExpertHighScore", 797798302378380033L);
        setLongField(term30619, term30619.getClass(), "totalMasterHighScore", 4892304277320345810L);
        setIntField(term30706, term30706.getClass(), "year", 2025);
        setShortField(term30706, term30706.getClass(), "month", (short) 4);
        setShortField(term30706, term30706.getClass(), "day", (short) 6);
        setField(term30705, term30705.getClass(), "date", term30706);
        setByteField(term30710, term30710.getClass(), "hour", (byte) 23);
        setByteField(term30710, term30710.getClass(), "minute", (byte) 17);
        setByteField(term30710, term30710.getClass(), "second", (byte) 11);
        setIntField(term30710, term30710.getClass(), "nano", 928165672);
        setField(term30705, term30705.getClass(), "time", term30710);
        setField(term30619, term30619.getClass(), "eventWatchedDate", term30705);
        setIntField(term30619, term30619.getClass(), "friendCount", 1097894139);
        setBooleanField(term30619, term30619.getClass(), "isMaimai", false);
        setField(term30619, term30619.getClass(), "firstGameId", "qBcAJgrABE");
        setField(term30619, term30619.getClass(), "firstRomVersion", "JKdZuLFRwC");
        setField(term30619, term30619.getClass(), "firstDataVersion", "hfhLLoWnRU");
        setIntField(term30754, term30754.getClass(), "year", 2022);
        setShortField(term30754, term30754.getClass(), "month", (short) 3);
        setShortField(term30754, term30754.getClass(), "day", (short) 20);
        setField(term30753, term30753.getClass(), "date", term30754);
        setByteField(term30758, term30758.getClass(), "hour", (byte) 20);
        setByteField(term30758, term30758.getClass(), "minute", (byte) 31);
        setByteField(term30758, term30758.getClass(), "second", (byte) 56);
        setIntField(term30758, term30758.getClass(), "nano", 682853702);
        setField(term30753, term30753.getClass(), "time", term30758);
        setField(term30619, term30619.getClass(), "firstPlayDate", term30753);
        setField(term30619, term30619.getClass(), "lastGameId", "RpofnOPYha");
        setField(term30619, term30619.getClass(), "lastRomVersion", "CQYmAsjvPU");
        setField(term30619, term30619.getClass(), "lastDataVersion", "NNkIIFpxiB");
        setIntField(term30800, term30800.getClass(), "year", 2016);
        setShortField(term30800, term30800.getClass(), "month", (short) 5);
        setShortField(term30800, term30800.getClass(), "day", (short) 9);
        setField(term30799, term30799.getClass(), "date", term30800);
        setByteField(term30804, term30804.getClass(), "hour", (byte) 1);
        setByteField(term30804, term30804.getClass(), "minute", (byte) 20);
        setByteField(term30804, term30804.getClass(), "second", (byte) 56);
        setIntField(term30804, term30804.getClass(), "nano", 198437232);
        setField(term30799, term30799.getClass(), "time", term30804);
        setField(term30619, term30619.getClass(), "lastPlayDate", term30799);
        setIntField(term30619, term30619.getClass(), "lastPlaceId", 390256347);
        setField(term30619, term30619.getClass(), "lastPlaceName", "sBmtvFPDso");
        setField(term30619, term30619.getClass(), "lastRegionId", "qsUIxrLolr");
        setField(term30619, term30619.getClass(), "lastRegionName", "IlQxArYcgB");
        setField(term30619, term30619.getClass(), "lastAllNetId", "lIgKCvCuoH");
        setField(term30619, term30619.getClass(), "lastClientId", "dHuWgRwLOm");
        term30870 = new Long(-3271370917942710167L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term30870;
        callMethod(klass, "setTotalHiScore", argTypes, term30619, args);
    }

};


