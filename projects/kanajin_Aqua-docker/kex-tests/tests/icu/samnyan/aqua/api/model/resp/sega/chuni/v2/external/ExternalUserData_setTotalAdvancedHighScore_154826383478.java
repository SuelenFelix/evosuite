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
import java.lang.Long;

public class ExternalUserData_setTotalAdvancedHighScore_154826383478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31425;
     Object term31676;

    public ExternalUserData_setTotalAdvancedHighScore_154826383478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31425 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term31450 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31451 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31455 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31564 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31610 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31425, term31425.getClass(), "accessCode", "ZzqRHVEXcM");
        setField(term31425, term31425.getClass(), "userName", "YYwIEARNxi");
        setIntField(term31451, term31451.getClass(), "year", 2012);
        setShortField(term31451, term31451.getClass(), "month", (short) 1);
        setShortField(term31451, term31451.getClass(), "day", (short) 27);
        setField(term31450, term31450.getClass(), "date", term31451);
        setByteField(term31455, term31455.getClass(), "hour", (byte) 3);
        setByteField(term31455, term31455.getClass(), "minute", (byte) 30);
        setByteField(term31455, term31455.getClass(), "second", (byte) 25);
        setIntField(term31455, term31455.getClass(), "nano", 460782173);
        setField(term31450, term31450.getClass(), "time", term31455);
        setField(term31425, term31425.getClass(), "lastLoginDate", term31450);
        setBooleanField(term31425, term31425.getClass(), "isWebJoin", true);
        setField(term31425, term31425.getClass(), "webLimitDate", "rblXBUdTFc");
        setIntField(term31425, term31425.getClass(), "level", -223786928);
        setIntField(term31425, term31425.getClass(), "reincarnationNum", 1703103733);
        setField(term31425, term31425.getClass(), "exp", "rbsXSOJFKW");
        setLongField(term31425, term31425.getClass(), "point", -7830820957252387854L);
        setLongField(term31425, term31425.getClass(), "totalPoint", -8985577692063635272L);
        setIntField(term31425, term31425.getClass(), "playCount", 1057562436);
        setIntField(term31425, term31425.getClass(), "multiPlayCount", 646610000);
        setIntField(term31425, term31425.getClass(), "multiWinCount", 2003399396);
        setIntField(term31425, term31425.getClass(), "requestResCount", 1223703911);
        setIntField(term31425, term31425.getClass(), "acceptResCount", -1824905298);
        setIntField(term31425, term31425.getClass(), "successResCount", -2062724184);
        setIntField(term31425, term31425.getClass(), "playerRating", -716654499);
        setIntField(term31425, term31425.getClass(), "highestRating", 1641117123);
        setIntField(term31425, term31425.getClass(), "nameplateId", -1084408453);
        setIntField(term31425, term31425.getClass(), "frameId", -1466822773);
        setIntField(term31425, term31425.getClass(), "characterId", -230022261);
        setIntField(term31425, term31425.getClass(), "trophyId", 831967494);
        setIntField(term31425, term31425.getClass(), "playedTutorialBit", -1858635791);
        setIntField(term31425, term31425.getClass(), "firstTutorialCancelNum", 1919079331);
        setIntField(term31425, term31425.getClass(), "masterTutorialCancelNum", 144872711);
        setIntField(term31425, term31425.getClass(), "totalRepertoireCount", -720037395);
        setIntField(term31425, term31425.getClass(), "totalMapNum", 1232105469);
        setLongField(term31425, term31425.getClass(), "totalHiScore", 6545086285386938562L);
        setLongField(term31425, term31425.getClass(), "totalBasicHighScore", 3951346165629352117L);
        setLongField(term31425, term31425.getClass(), "totalAdvancedHighScore", -4187265590402169996L);
        setLongField(term31425, term31425.getClass(), "totalExpertHighScore", -8033044954947064558L);
        setLongField(term31425, term31425.getClass(), "totalMasterHighScore", 4626639872957534248L);
        setIntField(term31512, term31512.getClass(), "year", 2016);
        setShortField(term31512, term31512.getClass(), "month", (short) 10);
        setShortField(term31512, term31512.getClass(), "day", (short) 12);
        setField(term31511, term31511.getClass(), "date", term31512);
        setByteField(term31516, term31516.getClass(), "hour", (byte) 11);
        setByteField(term31516, term31516.getClass(), "minute", (byte) 25);
        setByteField(term31516, term31516.getClass(), "second", (byte) 37);
        setIntField(term31516, term31516.getClass(), "nano", 215113477);
        setField(term31511, term31511.getClass(), "time", term31516);
        setField(term31425, term31425.getClass(), "eventWatchedDate", term31511);
        setIntField(term31425, term31425.getClass(), "friendCount", -1547322575);
        setBooleanField(term31425, term31425.getClass(), "isMaimai", false);
        setField(term31425, term31425.getClass(), "firstGameId", "sAgGDoUNlf");
        setField(term31425, term31425.getClass(), "firstRomVersion", "TSTZcXdFFi");
        setField(term31425, term31425.getClass(), "firstDataVersion", "RyaaOzWfYO");
        setIntField(term31560, term31560.getClass(), "year", 2012);
        setShortField(term31560, term31560.getClass(), "month", (short) 12);
        setShortField(term31560, term31560.getClass(), "day", (short) 10);
        setField(term31559, term31559.getClass(), "date", term31560);
        setByteField(term31564, term31564.getClass(), "hour", (byte) 6);
        setByteField(term31564, term31564.getClass(), "minute", (byte) 26);
        setByteField(term31564, term31564.getClass(), "second", (byte) 38);
        setIntField(term31564, term31564.getClass(), "nano", 934336730);
        setField(term31559, term31559.getClass(), "time", term31564);
        setField(term31425, term31425.getClass(), "firstPlayDate", term31559);
        setField(term31425, term31425.getClass(), "lastGameId", "HAkxFBZZzz");
        setField(term31425, term31425.getClass(), "lastRomVersion", "yejonZnVuy");
        setField(term31425, term31425.getClass(), "lastDataVersion", "ouesGIsvuG");
        setIntField(term31606, term31606.getClass(), "year", 2021);
        setShortField(term31606, term31606.getClass(), "month", (short) 2);
        setShortField(term31606, term31606.getClass(), "day", (short) 21);
        setField(term31605, term31605.getClass(), "date", term31606);
        setByteField(term31610, term31610.getClass(), "hour", (byte) 4);
        setByteField(term31610, term31610.getClass(), "minute", (byte) 22);
        setByteField(term31610, term31610.getClass(), "second", (byte) 2);
        setIntField(term31610, term31610.getClass(), "nano", 752727543);
        setField(term31605, term31605.getClass(), "time", term31610);
        setField(term31425, term31425.getClass(), "lastPlayDate", term31605);
        setIntField(term31425, term31425.getClass(), "lastPlaceId", -61444233);
        setField(term31425, term31425.getClass(), "lastPlaceName", "pHBHlmLIZQ");
        setField(term31425, term31425.getClass(), "lastRegionId", "ZWRAbOuktl");
        setField(term31425, term31425.getClass(), "lastRegionName", "iqFRvFmVID");
        setField(term31425, term31425.getClass(), "lastAllNetId", "pNAEtppZdv");
        setField(term31425, term31425.getClass(), "lastClientId", "VsFWNMdyRt");
        term31676 = new Long(-7062466217011408314L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term31676;
        callMethod(klass, "setTotalAdvancedHighScore", argTypes, term31425, args);
    }

};


