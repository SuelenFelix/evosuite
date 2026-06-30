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

public class UserData_getMultiWinCount_146689425513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134919;

    public UserData_getMultiWinCount_146689425513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term134923 = new Long(7271112616766426991L);
        term134919 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term134921 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term134937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134942 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134969 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134970 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134974 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135035 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135078 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135079 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135083 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135129 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term134919, term134919.getClass(), "id", -6590532407494439408L);
        setLongField(term134921, term134921.getClass(), "id", -6471364019572540705L);
        setField(term134921, term134921.getClass(), "extId", term134923);
        setField(term134921, term134921.getClass(), "luid", "EYFlXZZTDu");
        setIntField(term134938, term134938.getClass(), "year", 2018);
        setShortField(term134938, term134938.getClass(), "month", (short) 5);
        setShortField(term134938, term134938.getClass(), "day", (short) 15);
        setField(term134937, term134937.getClass(), "date", term134938);
        setByteField(term134942, term134942.getClass(), "hour", (byte) 5);
        setByteField(term134942, term134942.getClass(), "minute", (byte) 3);
        setByteField(term134942, term134942.getClass(), "second", (byte) 34);
        setIntField(term134942, term134942.getClass(), "nano", 114109344);
        setField(term134937, term134937.getClass(), "time", term134942);
        setField(term134921, term134921.getClass(), "registerTime", term134937);
        setIntField(term134948, term134948.getClass(), "year", 2012);
        setShortField(term134948, term134948.getClass(), "month", (short) 5);
        setShortField(term134948, term134948.getClass(), "day", (short) 31);
        setField(term134947, term134947.getClass(), "date", term134948);
        setByteField(term134952, term134952.getClass(), "hour", (byte) 17);
        setByteField(term134952, term134952.getClass(), "minute", (byte) 40);
        setByteField(term134952, term134952.getClass(), "second", (byte) 9);
        setIntField(term134952, term134952.getClass(), "nano", 811185655);
        setField(term134947, term134947.getClass(), "time", term134952);
        setField(term134921, term134921.getClass(), "accessTime", term134947);
        setField(term134919, term134919.getClass(), "card", term134921);
        setField(term134919, term134919.getClass(), "userName", "DRGzFlWxaV");
        setIntField(term134970, term134970.getClass(), "year", 2023);
        setShortField(term134970, term134970.getClass(), "month", (short) 2);
        setShortField(term134970, term134970.getClass(), "day", (short) 20);
        setField(term134969, term134969.getClass(), "date", term134970);
        setByteField(term134974, term134974.getClass(), "hour", (byte) 20);
        setByteField(term134974, term134974.getClass(), "minute", (byte) 0);
        setByteField(term134974, term134974.getClass(), "second", (byte) 6);
        setIntField(term134974, term134974.getClass(), "nano", 8237029);
        setField(term134969, term134969.getClass(), "time", term134974);
        setField(term134919, term134919.getClass(), "lastLoginDate", term134969);
        setBooleanField(term134919, term134919.getClass(), "isWebJoin", false);
        setField(term134919, term134919.getClass(), "webLimitDate", "ZyTXwKjtvO");
        setIntField(term134919, term134919.getClass(), "level", 1198494389);
        setIntField(term134919, term134919.getClass(), "reincarnationNum", -1775188050);
        setField(term134919, term134919.getClass(), "exp", "mrIomiQpXW");
        setLongField(term134919, term134919.getClass(), "point", 3643648387583329737L);
        setLongField(term134919, term134919.getClass(), "totalPoint", 1005259662364765094L);
        setIntField(term134919, term134919.getClass(), "playCount", -1883712310);
        setIntField(term134919, term134919.getClass(), "multiPlayCount", -209552412);
        setIntField(term134919, term134919.getClass(), "multiWinCount", -128147837);
        setIntField(term134919, term134919.getClass(), "requestResCount", -628985630);
        setIntField(term134919, term134919.getClass(), "acceptResCount", -448657659);
        setIntField(term134919, term134919.getClass(), "successResCount", -732060555);
        setIntField(term134919, term134919.getClass(), "playerRating", -1192629086);
        setIntField(term134919, term134919.getClass(), "highestRating", -2079826481);
        setIntField(term134919, term134919.getClass(), "nameplateId", 720449771);
        setIntField(term134919, term134919.getClass(), "frameId", -889881321);
        setIntField(term134919, term134919.getClass(), "characterId", -210771326);
        setIntField(term134919, term134919.getClass(), "trophyId", 281911175);
        setIntField(term134919, term134919.getClass(), "playedTutorialBit", 1704970339);
        setIntField(term134919, term134919.getClass(), "firstTutorialCancelNum", 1614956209);
        setIntField(term134919, term134919.getClass(), "masterTutorialCancelNum", -151499130);
        setIntField(term134919, term134919.getClass(), "totalRepertoireCount", -1822594915);
        setIntField(term134919, term134919.getClass(), "totalMapNum", 1838995967);
        setLongField(term134919, term134919.getClass(), "totalHiScore", 7575427910876423093L);
        setLongField(term134919, term134919.getClass(), "totalBasicHighScore", 3175154144372494944L);
        setLongField(term134919, term134919.getClass(), "totalAdvancedHighScore", -2463322238616422697L);
        setLongField(term134919, term134919.getClass(), "totalExpertHighScore", 2408965375678908663L);
        setLongField(term134919, term134919.getClass(), "totalMasterHighScore", -556491737091506400L);
        setIntField(term135031, term135031.getClass(), "year", 2012);
        setShortField(term135031, term135031.getClass(), "month", (short) 2);
        setShortField(term135031, term135031.getClass(), "day", (short) 25);
        setField(term135030, term135030.getClass(), "date", term135031);
        setByteField(term135035, term135035.getClass(), "hour", (byte) 8);
        setByteField(term135035, term135035.getClass(), "minute", (byte) 57);
        setByteField(term135035, term135035.getClass(), "second", (byte) 53);
        setIntField(term135035, term135035.getClass(), "nano", 186482203);
        setField(term135030, term135030.getClass(), "time", term135035);
        setField(term134919, term134919.getClass(), "eventWatchedDate", term135030);
        setIntField(term134919, term134919.getClass(), "friendCount", 265353182);
        setBooleanField(term134919, term134919.getClass(), "isMaimai", false);
        setField(term134919, term134919.getClass(), "firstGameId", "mDIAdszXHc");
        setField(term134919, term134919.getClass(), "firstRomVersion", "GYljRejWKI");
        setField(term134919, term134919.getClass(), "firstDataVersion", "AwXWFyuuXB");
        setIntField(term135079, term135079.getClass(), "year", 2021);
        setShortField(term135079, term135079.getClass(), "month", (short) 5);
        setShortField(term135079, term135079.getClass(), "day", (short) 16);
        setField(term135078, term135078.getClass(), "date", term135079);
        setByteField(term135083, term135083.getClass(), "hour", (byte) 15);
        setByteField(term135083, term135083.getClass(), "minute", (byte) 22);
        setByteField(term135083, term135083.getClass(), "second", (byte) 31);
        setIntField(term135083, term135083.getClass(), "nano", 389269845);
        setField(term135078, term135078.getClass(), "time", term135083);
        setField(term134919, term134919.getClass(), "firstPlayDate", term135078);
        setField(term134919, term134919.getClass(), "lastGameId", "hHUEukVMwn");
        setField(term134919, term134919.getClass(), "lastRomVersion", "yvAOmWOExs");
        setField(term134919, term134919.getClass(), "lastDataVersion", "DmsJwEkQmO");
        setIntField(term135125, term135125.getClass(), "year", 2010);
        setShortField(term135125, term135125.getClass(), "month", (short) 8);
        setShortField(term135125, term135125.getClass(), "day", (short) 30);
        setField(term135124, term135124.getClass(), "date", term135125);
        setByteField(term135129, term135129.getClass(), "hour", (byte) 23);
        setByteField(term135129, term135129.getClass(), "minute", (byte) 21);
        setByteField(term135129, term135129.getClass(), "second", (byte) 37);
        setIntField(term135129, term135129.getClass(), "nano", 513420347);
        setField(term135124, term135124.getClass(), "time", term135129);
        setField(term134919, term134919.getClass(), "lastPlayDate", term135124);
        setIntField(term134919, term134919.getClass(), "lastPlaceId", 1812110091);
        setField(term134919, term134919.getClass(), "lastPlaceName", "HzibsEDFOp");
        setField(term134919, term134919.getClass(), "lastRegionId", "nxccuKoVbt");
        setField(term134919, term134919.getClass(), "lastRegionName", "fgSbKLymzA");
        setField(term134919, term134919.getClass(), "lastAllNetId", "kSFJgZpdtf");
        setField(term134919, term134919.getClass(), "lastClientId", "ujNUCJKMUq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMultiWinCount", argTypes, term134919, args);
    }

};


