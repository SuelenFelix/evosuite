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
import java.lang.Integer;

public class UserActivity_setParam1_182150158615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298357;
     Object term298642;

    public UserActivity_setParam1_182150158615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term298363 = new Long(-894705411488729365L);
        term298357 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term298359 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term298361 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term298377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298392 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298414 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298475 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298523 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298569 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term298357, term298357.getClass(), "id", -8551703328287150294L);
        setLongField(term298359, term298359.getClass(), "id", -7184114446608947533L);
        setLongField(term298361, term298361.getClass(), "id", 4282611577386894476L);
        setField(term298361, term298361.getClass(), "extId", term298363);
        setField(term298361, term298361.getClass(), "luid", "qkPcNUMMFU");
        setIntField(term298378, term298378.getClass(), "year", 2025);
        setShortField(term298378, term298378.getClass(), "month", (short) 12);
        setShortField(term298378, term298378.getClass(), "day", (short) 25);
        setField(term298377, term298377.getClass(), "date", term298378);
        setByteField(term298382, term298382.getClass(), "hour", (byte) 11);
        setByteField(term298382, term298382.getClass(), "minute", (byte) 38);
        setByteField(term298382, term298382.getClass(), "second", (byte) 44);
        setIntField(term298382, term298382.getClass(), "nano", 858074445);
        setField(term298377, term298377.getClass(), "time", term298382);
        setField(term298361, term298361.getClass(), "registerTime", term298377);
        setIntField(term298388, term298388.getClass(), "year", 2013);
        setShortField(term298388, term298388.getClass(), "month", (short) 11);
        setShortField(term298388, term298388.getClass(), "day", (short) 5);
        setField(term298387, term298387.getClass(), "date", term298388);
        setByteField(term298392, term298392.getClass(), "hour", (byte) 3);
        setByteField(term298392, term298392.getClass(), "minute", (byte) 40);
        setByteField(term298392, term298392.getClass(), "second", (byte) 58);
        setIntField(term298392, term298392.getClass(), "nano", 756839926);
        setField(term298387, term298387.getClass(), "time", term298392);
        setField(term298361, term298361.getClass(), "accessTime", term298387);
        setField(term298359, term298359.getClass(), "card", term298361);
        setField(term298359, term298359.getClass(), "userName", "ZXmgWZeTRn");
        setIntField(term298410, term298410.getClass(), "year", 2011);
        setShortField(term298410, term298410.getClass(), "month", (short) 10);
        setShortField(term298410, term298410.getClass(), "day", (short) 30);
        setField(term298409, term298409.getClass(), "date", term298410);
        setByteField(term298414, term298414.getClass(), "hour", (byte) 6);
        setByteField(term298414, term298414.getClass(), "minute", (byte) 30);
        setByteField(term298414, term298414.getClass(), "second", (byte) 5);
        setIntField(term298414, term298414.getClass(), "nano", 871506731);
        setField(term298409, term298409.getClass(), "time", term298414);
        setField(term298359, term298359.getClass(), "lastLoginDate", term298409);
        setBooleanField(term298359, term298359.getClass(), "isWebJoin", true);
        setField(term298359, term298359.getClass(), "webLimitDate", "GoLHmDBAJB");
        setIntField(term298359, term298359.getClass(), "level", 1997228827);
        setIntField(term298359, term298359.getClass(), "reincarnationNum", 222278312);
        setField(term298359, term298359.getClass(), "exp", "AZqmZETlNN");
        setLongField(term298359, term298359.getClass(), "point", 5461840589943005596L);
        setLongField(term298359, term298359.getClass(), "totalPoint", 4172079491130812074L);
        setIntField(term298359, term298359.getClass(), "playCount", 1345586536);
        setIntField(term298359, term298359.getClass(), "multiPlayCount", -1883388147);
        setIntField(term298359, term298359.getClass(), "multiWinCount", 1671689178);
        setIntField(term298359, term298359.getClass(), "requestResCount", -434038223);
        setIntField(term298359, term298359.getClass(), "acceptResCount", -1160303977);
        setIntField(term298359, term298359.getClass(), "successResCount", -1616741813);
        setIntField(term298359, term298359.getClass(), "playerRating", -553905854);
        setIntField(term298359, term298359.getClass(), "highestRating", -1551399681);
        setIntField(term298359, term298359.getClass(), "nameplateId", -875579962);
        setIntField(term298359, term298359.getClass(), "frameId", -2092774130);
        setIntField(term298359, term298359.getClass(), "characterId", -1169966252);
        setIntField(term298359, term298359.getClass(), "trophyId", -818418397);
        setIntField(term298359, term298359.getClass(), "playedTutorialBit", -2117133876);
        setIntField(term298359, term298359.getClass(), "firstTutorialCancelNum", -1419806086);
        setIntField(term298359, term298359.getClass(), "masterTutorialCancelNum", -506269910);
        setIntField(term298359, term298359.getClass(), "totalRepertoireCount", 937160250);
        setIntField(term298359, term298359.getClass(), "totalMapNum", 1724814262);
        setLongField(term298359, term298359.getClass(), "totalHiScore", -3422932225408332326L);
        setLongField(term298359, term298359.getClass(), "totalBasicHighScore", -7436930987563830432L);
        setLongField(term298359, term298359.getClass(), "totalAdvancedHighScore", -1373289583745846808L);
        setLongField(term298359, term298359.getClass(), "totalExpertHighScore", -242380797470678711L);
        setLongField(term298359, term298359.getClass(), "totalMasterHighScore", -5130681366312086929L);
        setIntField(term298471, term298471.getClass(), "year", 2026);
        setShortField(term298471, term298471.getClass(), "month", (short) 8);
        setShortField(term298471, term298471.getClass(), "day", (short) 18);
        setField(term298470, term298470.getClass(), "date", term298471);
        setByteField(term298475, term298475.getClass(), "hour", (byte) 11);
        setByteField(term298475, term298475.getClass(), "minute", (byte) 25);
        setByteField(term298475, term298475.getClass(), "second", (byte) 34);
        setIntField(term298475, term298475.getClass(), "nano", 763131841);
        setField(term298470, term298470.getClass(), "time", term298475);
        setField(term298359, term298359.getClass(), "eventWatchedDate", term298470);
        setIntField(term298359, term298359.getClass(), "friendCount", -362349898);
        setBooleanField(term298359, term298359.getClass(), "isMaimai", true);
        setField(term298359, term298359.getClass(), "firstGameId", "bToiDutxBd");
        setField(term298359, term298359.getClass(), "firstRomVersion", "iIhNOWZSiI");
        setField(term298359, term298359.getClass(), "firstDataVersion", "NQIBkRnfjL");
        setIntField(term298519, term298519.getClass(), "year", 2025);
        setShortField(term298519, term298519.getClass(), "month", (short) 8);
        setShortField(term298519, term298519.getClass(), "day", (short) 1);
        setField(term298518, term298518.getClass(), "date", term298519);
        setByteField(term298523, term298523.getClass(), "hour", (byte) 12);
        setByteField(term298523, term298523.getClass(), "minute", (byte) 32);
        setByteField(term298523, term298523.getClass(), "second", (byte) 48);
        setIntField(term298523, term298523.getClass(), "nano", 244138870);
        setField(term298518, term298518.getClass(), "time", term298523);
        setField(term298359, term298359.getClass(), "firstPlayDate", term298518);
        setField(term298359, term298359.getClass(), "lastGameId", "roYYoUvuve");
        setField(term298359, term298359.getClass(), "lastRomVersion", "saBbwEJwaU");
        setField(term298359, term298359.getClass(), "lastDataVersion", "deyNBzGoAl");
        setIntField(term298565, term298565.getClass(), "year", 2019);
        setShortField(term298565, term298565.getClass(), "month", (short) 10);
        setShortField(term298565, term298565.getClass(), "day", (short) 1);
        setField(term298564, term298564.getClass(), "date", term298565);
        setByteField(term298569, term298569.getClass(), "hour", (byte) 10);
        setByteField(term298569, term298569.getClass(), "minute", (byte) 5);
        setByteField(term298569, term298569.getClass(), "second", (byte) 12);
        setIntField(term298569, term298569.getClass(), "nano", 615041184);
        setField(term298564, term298564.getClass(), "time", term298569);
        setField(term298359, term298359.getClass(), "lastPlayDate", term298564);
        setIntField(term298359, term298359.getClass(), "lastPlaceId", -569261309);
        setField(term298359, term298359.getClass(), "lastPlaceName", "FBbQyFgPdH");
        setField(term298359, term298359.getClass(), "lastRegionId", "AjdUNyCugb");
        setField(term298359, term298359.getClass(), "lastRegionName", "dKDzzuLoLW");
        setField(term298359, term298359.getClass(), "lastAllNetId", "EPVoKzYjsa");
        setField(term298359, term298359.getClass(), "lastClientId", "exwRDMTrUH");
        setField(term298357, term298357.getClass(), "user", term298359);
        setIntField(term298357, term298357.getClass(), "kind", -853939727);
        setIntField(term298357, term298357.getClass(), "activityId", 416632574);
        setIntField(term298357, term298357.getClass(), "sortNumber", 759801111);
        setIntField(term298357, term298357.getClass(), "param1", -844675169);
        setIntField(term298357, term298357.getClass(), "param2", -714313525);
        setIntField(term298357, term298357.getClass(), "param3", 1266686205);
        setIntField(term298357, term298357.getClass(), "param4", 342577277);
        term298642 = new Integer(782543565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term298642;
        callMethod(klass, "setParam1", argTypes, term298357, args);
    }

};


