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

public class ExternalUserData_getEventWatchedDate_38363377932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12833;

    public ExternalUserData_getEventWatchedDate_38363377932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12833 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term12858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12924 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13018 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12833, term12833.getClass(), "accessCode", "qphdrqUtNx");
        setField(term12833, term12833.getClass(), "userName", "bwlLFAfNWx");
        setIntField(term12859, term12859.getClass(), "year", 2014);
        setShortField(term12859, term12859.getClass(), "month", (short) 5);
        setShortField(term12859, term12859.getClass(), "day", (short) 31);
        setField(term12858, term12858.getClass(), "date", term12859);
        setByteField(term12863, term12863.getClass(), "hour", (byte) 16);
        setByteField(term12863, term12863.getClass(), "minute", (byte) 3);
        setByteField(term12863, term12863.getClass(), "second", (byte) 14);
        setIntField(term12863, term12863.getClass(), "nano", 281059649);
        setField(term12858, term12858.getClass(), "time", term12863);
        setField(term12833, term12833.getClass(), "lastLoginDate", term12858);
        setBooleanField(term12833, term12833.getClass(), "isWebJoin", false);
        setField(term12833, term12833.getClass(), "webLimitDate", "JWodNQzjjV");
        setIntField(term12833, term12833.getClass(), "level", 34167717);
        setIntField(term12833, term12833.getClass(), "reincarnationNum", -514195141);
        setField(term12833, term12833.getClass(), "exp", "CAgxWjhxNf");
        setLongField(term12833, term12833.getClass(), "point", -1592696983130738594L);
        setLongField(term12833, term12833.getClass(), "totalPoint", 6902365338255307910L);
        setIntField(term12833, term12833.getClass(), "playCount", -297946422);
        setIntField(term12833, term12833.getClass(), "multiPlayCount", 385463636);
        setIntField(term12833, term12833.getClass(), "multiWinCount", -1677599962);
        setIntField(term12833, term12833.getClass(), "requestResCount", -1790275458);
        setIntField(term12833, term12833.getClass(), "acceptResCount", -497534255);
        setIntField(term12833, term12833.getClass(), "successResCount", 1588942911);
        setIntField(term12833, term12833.getClass(), "playerRating", -2129828854);
        setIntField(term12833, term12833.getClass(), "highestRating", -47438786);
        setIntField(term12833, term12833.getClass(), "nameplateId", -1955400589);
        setIntField(term12833, term12833.getClass(), "frameId", 626179200);
        setIntField(term12833, term12833.getClass(), "characterId", -511077684);
        setIntField(term12833, term12833.getClass(), "trophyId", -711507760);
        setIntField(term12833, term12833.getClass(), "playedTutorialBit", 1053773809);
        setIntField(term12833, term12833.getClass(), "firstTutorialCancelNum", 924127883);
        setIntField(term12833, term12833.getClass(), "masterTutorialCancelNum", -751079123);
        setIntField(term12833, term12833.getClass(), "totalRepertoireCount", -110837188);
        setIntField(term12833, term12833.getClass(), "totalMapNum", -271094506);
        setLongField(term12833, term12833.getClass(), "totalHiScore", -8019730974733786399L);
        setLongField(term12833, term12833.getClass(), "totalBasicHighScore", 394960377236392159L);
        setLongField(term12833, term12833.getClass(), "totalAdvancedHighScore", -2955854401507097864L);
        setLongField(term12833, term12833.getClass(), "totalExpertHighScore", 329213208496958131L);
        setLongField(term12833, term12833.getClass(), "totalMasterHighScore", 8107921244631636572L);
        setIntField(term12920, term12920.getClass(), "year", 2010);
        setShortField(term12920, term12920.getClass(), "month", (short) 12);
        setShortField(term12920, term12920.getClass(), "day", (short) 30);
        setField(term12919, term12919.getClass(), "date", term12920);
        setByteField(term12924, term12924.getClass(), "hour", (byte) 17);
        setByteField(term12924, term12924.getClass(), "minute", (byte) 44);
        setByteField(term12924, term12924.getClass(), "second", (byte) 59);
        setIntField(term12924, term12924.getClass(), "nano", 881407895);
        setField(term12919, term12919.getClass(), "time", term12924);
        setField(term12833, term12833.getClass(), "eventWatchedDate", term12919);
        setIntField(term12833, term12833.getClass(), "friendCount", 455632030);
        setBooleanField(term12833, term12833.getClass(), "isMaimai", false);
        setField(term12833, term12833.getClass(), "firstGameId", "goAoCMhKBu");
        setField(term12833, term12833.getClass(), "firstRomVersion", "BWxJSgKHRT");
        setField(term12833, term12833.getClass(), "firstDataVersion", "AGXoIndFnm");
        setIntField(term12968, term12968.getClass(), "year", 2019);
        setShortField(term12968, term12968.getClass(), "month", (short) 6);
        setShortField(term12968, term12968.getClass(), "day", (short) 12);
        setField(term12967, term12967.getClass(), "date", term12968);
        setByteField(term12972, term12972.getClass(), "hour", (byte) 5);
        setByteField(term12972, term12972.getClass(), "minute", (byte) 13);
        setByteField(term12972, term12972.getClass(), "second", (byte) 8);
        setIntField(term12972, term12972.getClass(), "nano", 838117658);
        setField(term12967, term12967.getClass(), "time", term12972);
        setField(term12833, term12833.getClass(), "firstPlayDate", term12967);
        setField(term12833, term12833.getClass(), "lastGameId", "mwmFMNEzkK");
        setField(term12833, term12833.getClass(), "lastRomVersion", "kVAmKknVln");
        setField(term12833, term12833.getClass(), "lastDataVersion", "MRFLbEGYKG");
        setIntField(term13014, term13014.getClass(), "year", 2014);
        setShortField(term13014, term13014.getClass(), "month", (short) 8);
        setShortField(term13014, term13014.getClass(), "day", (short) 13);
        setField(term13013, term13013.getClass(), "date", term13014);
        setByteField(term13018, term13018.getClass(), "hour", (byte) 13);
        setByteField(term13018, term13018.getClass(), "minute", (byte) 15);
        setByteField(term13018, term13018.getClass(), "second", (byte) 51);
        setIntField(term13018, term13018.getClass(), "nano", 433726678);
        setField(term13013, term13013.getClass(), "time", term13018);
        setField(term12833, term12833.getClass(), "lastPlayDate", term13013);
        setIntField(term12833, term12833.getClass(), "lastPlaceId", -1632929393);
        setField(term12833, term12833.getClass(), "lastPlaceName", "BYrGukTyof");
        setField(term12833, term12833.getClass(), "lastRegionId", "jiCGTTzKGB");
        setField(term12833, term12833.getClass(), "lastRegionName", "MqICFYzDJj");
        setField(term12833, term12833.getClass(), "lastAllNetId", "YgQvdcBQKw");
        setField(term12833, term12833.getClass(), "lastClientId", "FiYYLuailz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term12833, args);
    }

};


