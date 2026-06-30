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

public class ExternalUserData_getHighestRating_188542411217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6818;

    public ExternalUserData_getHighestRating_188542411217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6818 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term6843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6848 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6909 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6957 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7003 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6818, term6818.getClass(), "accessCode", "doQLHkjpNm");
        setField(term6818, term6818.getClass(), "userName", "lCyLIcSuom");
        setIntField(term6844, term6844.getClass(), "year", 2028);
        setShortField(term6844, term6844.getClass(), "month", (short) 4);
        setShortField(term6844, term6844.getClass(), "day", (short) 1);
        setField(term6843, term6843.getClass(), "date", term6844);
        setByteField(term6848, term6848.getClass(), "hour", (byte) 16);
        setByteField(term6848, term6848.getClass(), "minute", (byte) 22);
        setByteField(term6848, term6848.getClass(), "second", (byte) 32);
        setIntField(term6848, term6848.getClass(), "nano", 406353763);
        setField(term6843, term6843.getClass(), "time", term6848);
        setField(term6818, term6818.getClass(), "lastLoginDate", term6843);
        setBooleanField(term6818, term6818.getClass(), "isWebJoin", false);
        setField(term6818, term6818.getClass(), "webLimitDate", "CGOpQSZZwI");
        setIntField(term6818, term6818.getClass(), "level", 844222656);
        setIntField(term6818, term6818.getClass(), "reincarnationNum", -18216811);
        setField(term6818, term6818.getClass(), "exp", "ypEdrstygY");
        setLongField(term6818, term6818.getClass(), "point", -7268507582722666254L);
        setLongField(term6818, term6818.getClass(), "totalPoint", 5671808784468963649L);
        setIntField(term6818, term6818.getClass(), "playCount", -1813280137);
        setIntField(term6818, term6818.getClass(), "multiPlayCount", 719656595);
        setIntField(term6818, term6818.getClass(), "multiWinCount", -1516995753);
        setIntField(term6818, term6818.getClass(), "requestResCount", -390501023);
        setIntField(term6818, term6818.getClass(), "acceptResCount", -1667482829);
        setIntField(term6818, term6818.getClass(), "successResCount", 1116576792);
        setIntField(term6818, term6818.getClass(), "playerRating", -942194446);
        setIntField(term6818, term6818.getClass(), "highestRating", -938508470);
        setIntField(term6818, term6818.getClass(), "nameplateId", 1242676024);
        setIntField(term6818, term6818.getClass(), "frameId", -1865023308);
        setIntField(term6818, term6818.getClass(), "characterId", 1698510819);
        setIntField(term6818, term6818.getClass(), "trophyId", -1553893255);
        setIntField(term6818, term6818.getClass(), "playedTutorialBit", 1303442927);
        setIntField(term6818, term6818.getClass(), "firstTutorialCancelNum", 794568325);
        setIntField(term6818, term6818.getClass(), "masterTutorialCancelNum", -434468428);
        setIntField(term6818, term6818.getClass(), "totalRepertoireCount", 1559605714);
        setIntField(term6818, term6818.getClass(), "totalMapNum", 1146601902);
        setLongField(term6818, term6818.getClass(), "totalHiScore", 2297097306706899827L);
        setLongField(term6818, term6818.getClass(), "totalBasicHighScore", -900457279156388404L);
        setLongField(term6818, term6818.getClass(), "totalAdvancedHighScore", 1084801489398441516L);
        setLongField(term6818, term6818.getClass(), "totalExpertHighScore", 6273754186658578034L);
        setLongField(term6818, term6818.getClass(), "totalMasterHighScore", 3620247240684476031L);
        setIntField(term6905, term6905.getClass(), "year", 2019);
        setShortField(term6905, term6905.getClass(), "month", (short) 7);
        setShortField(term6905, term6905.getClass(), "day", (short) 19);
        setField(term6904, term6904.getClass(), "date", term6905);
        setByteField(term6909, term6909.getClass(), "hour", (byte) 10);
        setByteField(term6909, term6909.getClass(), "minute", (byte) 54);
        setByteField(term6909, term6909.getClass(), "second", (byte) 55);
        setIntField(term6909, term6909.getClass(), "nano", 244650454);
        setField(term6904, term6904.getClass(), "time", term6909);
        setField(term6818, term6818.getClass(), "eventWatchedDate", term6904);
        setIntField(term6818, term6818.getClass(), "friendCount", -1938881385);
        setBooleanField(term6818, term6818.getClass(), "isMaimai", true);
        setField(term6818, term6818.getClass(), "firstGameId", "sNQFlATEeQ");
        setField(term6818, term6818.getClass(), "firstRomVersion", "ZKMLioamsY");
        setField(term6818, term6818.getClass(), "firstDataVersion", "WVbxuoDBcn");
        setIntField(term6953, term6953.getClass(), "year", 2022);
        setShortField(term6953, term6953.getClass(), "month", (short) 4);
        setShortField(term6953, term6953.getClass(), "day", (short) 15);
        setField(term6952, term6952.getClass(), "date", term6953);
        setByteField(term6957, term6957.getClass(), "hour", (byte) 20);
        setByteField(term6957, term6957.getClass(), "minute", (byte) 58);
        setByteField(term6957, term6957.getClass(), "second", (byte) 46);
        setIntField(term6957, term6957.getClass(), "nano", 435562727);
        setField(term6952, term6952.getClass(), "time", term6957);
        setField(term6818, term6818.getClass(), "firstPlayDate", term6952);
        setField(term6818, term6818.getClass(), "lastGameId", "pvDEABOxLt");
        setField(term6818, term6818.getClass(), "lastRomVersion", "beAMpkroCQ");
        setField(term6818, term6818.getClass(), "lastDataVersion", "uSUvKAyuvd");
        setIntField(term6999, term6999.getClass(), "year", 2026);
        setShortField(term6999, term6999.getClass(), "month", (short) 10);
        setShortField(term6999, term6999.getClass(), "day", (short) 31);
        setField(term6998, term6998.getClass(), "date", term6999);
        setByteField(term7003, term7003.getClass(), "hour", (byte) 17);
        setByteField(term7003, term7003.getClass(), "minute", (byte) 6);
        setByteField(term7003, term7003.getClass(), "second", (byte) 30);
        setIntField(term7003, term7003.getClass(), "nano", 785931660);
        setField(term6998, term6998.getClass(), "time", term7003);
        setField(term6818, term6818.getClass(), "lastPlayDate", term6998);
        setIntField(term6818, term6818.getClass(), "lastPlaceId", -1629418973);
        setField(term6818, term6818.getClass(), "lastPlaceName", "onQLVONGuf");
        setField(term6818, term6818.getClass(), "lastRegionId", "SOrEHbcbmn");
        setField(term6818, term6818.getClass(), "lastRegionName", "bnsyeQXFdu");
        setField(term6818, term6818.getClass(), "lastAllNetId", "BwtdjiefJn");
        setField(term6818, term6818.getClass(), "lastClientId", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term6818, args);
    }

};


