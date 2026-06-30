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

public class ExternalUserData_getFirstPlayDate_61815995438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15239;

    public ExternalUserData_getFirstPlayDate_61815995438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15239 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term15264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15269 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15330 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15424 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15239, term15239.getClass(), "accessCode", "mvfDtZNEHr");
        setField(term15239, term15239.getClass(), "userName", "bvSgmFUDOU");
        setIntField(term15265, term15265.getClass(), "year", 2026);
        setShortField(term15265, term15265.getClass(), "month", (short) 9);
        setShortField(term15265, term15265.getClass(), "day", (short) 18);
        setField(term15264, term15264.getClass(), "date", term15265);
        setByteField(term15269, term15269.getClass(), "hour", (byte) 14);
        setByteField(term15269, term15269.getClass(), "minute", (byte) 51);
        setByteField(term15269, term15269.getClass(), "second", (byte) 41);
        setIntField(term15269, term15269.getClass(), "nano", 830322169);
        setField(term15264, term15264.getClass(), "time", term15269);
        setField(term15239, term15239.getClass(), "lastLoginDate", term15264);
        setBooleanField(term15239, term15239.getClass(), "isWebJoin", true);
        setField(term15239, term15239.getClass(), "webLimitDate", "XMHwbfiHRl");
        setIntField(term15239, term15239.getClass(), "level", 1868344256);
        setIntField(term15239, term15239.getClass(), "reincarnationNum", 1857693976);
        setField(term15239, term15239.getClass(), "exp", "bucTnYicnp");
        setLongField(term15239, term15239.getClass(), "point", -113028659747841511L);
        setLongField(term15239, term15239.getClass(), "totalPoint", 7271112616766426991L);
        setIntField(term15239, term15239.getClass(), "playCount", 1631305277);
        setIntField(term15239, term15239.getClass(), "multiPlayCount", 162113491);
        setIntField(term15239, term15239.getClass(), "multiWinCount", -932147928);
        setIntField(term15239, term15239.getClass(), "requestResCount", 487369012);
        setIntField(term15239, term15239.getClass(), "acceptResCount", -179238712);
        setIntField(term15239, term15239.getClass(), "successResCount", -2018735535);
        setIntField(term15239, term15239.getClass(), "playerRating", -658524954);
        setIntField(term15239, term15239.getClass(), "highestRating", -2009613557);
        setIntField(term15239, term15239.getClass(), "nameplateId", 654195547);
        setIntField(term15239, term15239.getClass(), "frameId", 1622857008);
        setIntField(term15239, term15239.getClass(), "characterId", 934338954);
        setIntField(term15239, term15239.getClass(), "trophyId", 598635505);
        setIntField(term15239, term15239.getClass(), "playedTutorialBit", -944986533);
        setIntField(term15239, term15239.getClass(), "firstTutorialCancelNum", 1894454926);
        setIntField(term15239, term15239.getClass(), "masterTutorialCancelNum", 1415142780);
        setIntField(term15239, term15239.getClass(), "totalRepertoireCount", -574105759);
        setIntField(term15239, term15239.getClass(), "totalMapNum", -1165271567);
        setLongField(term15239, term15239.getClass(), "totalHiScore", -8514728180792822493L);
        setLongField(term15239, term15239.getClass(), "totalBasicHighScore", 5315236285592892506L);
        setLongField(term15239, term15239.getClass(), "totalAdvancedHighScore", -6969704322644192945L);
        setLongField(term15239, term15239.getClass(), "totalExpertHighScore", -6685235643232255177L);
        setLongField(term15239, term15239.getClass(), "totalMasterHighScore", -5656664340499957324L);
        setIntField(term15326, term15326.getClass(), "year", 2024);
        setShortField(term15326, term15326.getClass(), "month", (short) 3);
        setShortField(term15326, term15326.getClass(), "day", (short) 17);
        setField(term15325, term15325.getClass(), "date", term15326);
        setByteField(term15330, term15330.getClass(), "hour", (byte) 5);
        setByteField(term15330, term15330.getClass(), "minute", (byte) 21);
        setByteField(term15330, term15330.getClass(), "second", (byte) 47);
        setIntField(term15330, term15330.getClass(), "nano", 798433252);
        setField(term15325, term15325.getClass(), "time", term15330);
        setField(term15239, term15239.getClass(), "eventWatchedDate", term15325);
        setIntField(term15239, term15239.getClass(), "friendCount", 376834234);
        setBooleanField(term15239, term15239.getClass(), "isMaimai", false);
        setField(term15239, term15239.getClass(), "firstGameId", "EkgprvqZlM");
        setField(term15239, term15239.getClass(), "firstRomVersion", "fbnKvthhOz");
        setField(term15239, term15239.getClass(), "firstDataVersion", "PGfCDJTBek");
        setIntField(term15374, term15374.getClass(), "year", 2023);
        setShortField(term15374, term15374.getClass(), "month", (short) 7);
        setShortField(term15374, term15374.getClass(), "day", (short) 27);
        setField(term15373, term15373.getClass(), "date", term15374);
        setByteField(term15378, term15378.getClass(), "hour", (byte) 4);
        setByteField(term15378, term15378.getClass(), "minute", (byte) 25);
        setByteField(term15378, term15378.getClass(), "second", (byte) 46);
        setIntField(term15378, term15378.getClass(), "nano", 646465452);
        setField(term15373, term15373.getClass(), "time", term15378);
        setField(term15239, term15239.getClass(), "firstPlayDate", term15373);
        setField(term15239, term15239.getClass(), "lastGameId", "ZwjARhAtHC");
        setField(term15239, term15239.getClass(), "lastRomVersion", "XXvscsYBWv");
        setField(term15239, term15239.getClass(), "lastDataVersion", "uePedtiAfL");
        setIntField(term15420, term15420.getClass(), "year", 2022);
        setShortField(term15420, term15420.getClass(), "month", (short) 11);
        setShortField(term15420, term15420.getClass(), "day", (short) 2);
        setField(term15419, term15419.getClass(), "date", term15420);
        setByteField(term15424, term15424.getClass(), "hour", (byte) 4);
        setByteField(term15424, term15424.getClass(), "minute", (byte) 14);
        setByteField(term15424, term15424.getClass(), "second", (byte) 5);
        setIntField(term15424, term15424.getClass(), "nano", 604465127);
        setField(term15419, term15419.getClass(), "time", term15424);
        setField(term15239, term15239.getClass(), "lastPlayDate", term15419);
        setIntField(term15239, term15239.getClass(), "lastPlaceId", -1911972560);
        setField(term15239, term15239.getClass(), "lastPlaceName", "AdSHvysxQB");
        setField(term15239, term15239.getClass(), "lastRegionId", "jlraKkBWFA");
        setField(term15239, term15239.getClass(), "lastRegionName", "mRBtFTxVdE");
        setField(term15239, term15239.getClass(), "lastAllNetId", "IVacFDAZcj");
        setField(term15239, term15239.getClass(), "lastClientId", "EEYmuwyVDP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term15239, args);
    }

};


