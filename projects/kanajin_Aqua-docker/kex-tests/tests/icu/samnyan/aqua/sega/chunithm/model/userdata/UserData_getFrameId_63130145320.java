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

public class UserData_getFrameId_63130145320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137901;

    public UserData_getFrameId_63130145320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term137905 = new Long(-5242567610844514867L);
        term137901 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term137903 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term137919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137924 = newInstance(Class.forName("java.time.LocalTime"));
        Object term137929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137934 = newInstance(Class.forName("java.time.LocalTime"));
        Object term137951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138012 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138013 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138017 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138065 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138111 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term137901, term137901.getClass(), "id", 7731755337784936423L);
        setLongField(term137903, term137903.getClass(), "id", -1374127091272456168L);
        setField(term137903, term137903.getClass(), "extId", term137905);
        setField(term137903, term137903.getClass(), "luid", "wbdTRzpToE");
        setIntField(term137920, term137920.getClass(), "year", 2018);
        setShortField(term137920, term137920.getClass(), "month", (short) 11);
        setShortField(term137920, term137920.getClass(), "day", (short) 27);
        setField(term137919, term137919.getClass(), "date", term137920);
        setByteField(term137924, term137924.getClass(), "hour", (byte) 4);
        setByteField(term137924, term137924.getClass(), "minute", (byte) 0);
        setByteField(term137924, term137924.getClass(), "second", (byte) 11);
        setIntField(term137924, term137924.getClass(), "nano", 685942391);
        setField(term137919, term137919.getClass(), "time", term137924);
        setField(term137903, term137903.getClass(), "registerTime", term137919);
        setIntField(term137930, term137930.getClass(), "year", 2022);
        setShortField(term137930, term137930.getClass(), "month", (short) 6);
        setShortField(term137930, term137930.getClass(), "day", (short) 11);
        setField(term137929, term137929.getClass(), "date", term137930);
        setByteField(term137934, term137934.getClass(), "hour", (byte) 17);
        setByteField(term137934, term137934.getClass(), "minute", (byte) 9);
        setByteField(term137934, term137934.getClass(), "second", (byte) 40);
        setIntField(term137934, term137934.getClass(), "nano", 253206883);
        setField(term137929, term137929.getClass(), "time", term137934);
        setField(term137903, term137903.getClass(), "accessTime", term137929);
        setField(term137901, term137901.getClass(), "card", term137903);
        setField(term137901, term137901.getClass(), "userName", "hYyOXAATCh");
        setIntField(term137952, term137952.getClass(), "year", 2024);
        setShortField(term137952, term137952.getClass(), "month", (short) 4);
        setShortField(term137952, term137952.getClass(), "day", (short) 9);
        setField(term137951, term137951.getClass(), "date", term137952);
        setByteField(term137956, term137956.getClass(), "hour", (byte) 0);
        setByteField(term137956, term137956.getClass(), "minute", (byte) 48);
        setByteField(term137956, term137956.getClass(), "second", (byte) 32);
        setIntField(term137956, term137956.getClass(), "nano", 320317914);
        setField(term137951, term137951.getClass(), "time", term137956);
        setField(term137901, term137901.getClass(), "lastLoginDate", term137951);
        setBooleanField(term137901, term137901.getClass(), "isWebJoin", true);
        setField(term137901, term137901.getClass(), "webLimitDate", "UbvbXQRnLW");
        setIntField(term137901, term137901.getClass(), "level", 467509047);
        setIntField(term137901, term137901.getClass(), "reincarnationNum", -904447748);
        setField(term137901, term137901.getClass(), "exp", "CkIbQCWOgW");
        setLongField(term137901, term137901.getClass(), "point", 9130044369997098420L);
        setLongField(term137901, term137901.getClass(), "totalPoint", 7290022068563009794L);
        setIntField(term137901, term137901.getClass(), "playCount", 854911566);
        setIntField(term137901, term137901.getClass(), "multiPlayCount", -1420033797);
        setIntField(term137901, term137901.getClass(), "multiWinCount", 747673390);
        setIntField(term137901, term137901.getClass(), "requestResCount", 705588535);
        setIntField(term137901, term137901.getClass(), "acceptResCount", -2070496137);
        setIntField(term137901, term137901.getClass(), "successResCount", -716175280);
        setIntField(term137901, term137901.getClass(), "playerRating", 1978574372);
        setIntField(term137901, term137901.getClass(), "highestRating", 267968248);
        setIntField(term137901, term137901.getClass(), "nameplateId", 994276530);
        setIntField(term137901, term137901.getClass(), "frameId", 1628085673);
        setIntField(term137901, term137901.getClass(), "characterId", -2024076633);
        setIntField(term137901, term137901.getClass(), "trophyId", -1871930908);
        setIntField(term137901, term137901.getClass(), "playedTutorialBit", 1529921600);
        setIntField(term137901, term137901.getClass(), "firstTutorialCancelNum", 1411675971);
        setIntField(term137901, term137901.getClass(), "masterTutorialCancelNum", 1224330822);
        setIntField(term137901, term137901.getClass(), "totalRepertoireCount", 991967399);
        setIntField(term137901, term137901.getClass(), "totalMapNum", -653419421);
        setLongField(term137901, term137901.getClass(), "totalHiScore", 2323440960270760830L);
        setLongField(term137901, term137901.getClass(), "totalBasicHighScore", 4533583496836744726L);
        setLongField(term137901, term137901.getClass(), "totalAdvancedHighScore", 2414597052032100136L);
        setLongField(term137901, term137901.getClass(), "totalExpertHighScore", -1963815850972856990L);
        setLongField(term137901, term137901.getClass(), "totalMasterHighScore", 6662149042039246051L);
        setIntField(term138013, term138013.getClass(), "year", 2010);
        setShortField(term138013, term138013.getClass(), "month", (short) 1);
        setShortField(term138013, term138013.getClass(), "day", (short) 23);
        setField(term138012, term138012.getClass(), "date", term138013);
        setByteField(term138017, term138017.getClass(), "hour", (byte) 17);
        setByteField(term138017, term138017.getClass(), "minute", (byte) 14);
        setByteField(term138017, term138017.getClass(), "second", (byte) 3);
        setIntField(term138017, term138017.getClass(), "nano", 196125620);
        setField(term138012, term138012.getClass(), "time", term138017);
        setField(term137901, term137901.getClass(), "eventWatchedDate", term138012);
        setIntField(term137901, term137901.getClass(), "friendCount", -364951490);
        setBooleanField(term137901, term137901.getClass(), "isMaimai", false);
        setField(term137901, term137901.getClass(), "firstGameId", "JWaRuPqymE");
        setField(term137901, term137901.getClass(), "firstRomVersion", "nTasTwGyTu");
        setField(term137901, term137901.getClass(), "firstDataVersion", "qRRPimcPhW");
        setIntField(term138061, term138061.getClass(), "year", 2010);
        setShortField(term138061, term138061.getClass(), "month", (short) 5);
        setShortField(term138061, term138061.getClass(), "day", (short) 1);
        setField(term138060, term138060.getClass(), "date", term138061);
        setByteField(term138065, term138065.getClass(), "hour", (byte) 8);
        setByteField(term138065, term138065.getClass(), "minute", (byte) 28);
        setByteField(term138065, term138065.getClass(), "second", (byte) 39);
        setIntField(term138065, term138065.getClass(), "nano", 321837588);
        setField(term138060, term138060.getClass(), "time", term138065);
        setField(term137901, term137901.getClass(), "firstPlayDate", term138060);
        setField(term137901, term137901.getClass(), "lastGameId", "vhGXukwBWg");
        setField(term137901, term137901.getClass(), "lastRomVersion", "JahleHixdz");
        setField(term137901, term137901.getClass(), "lastDataVersion", "rnkTocCEbH");
        setIntField(term138107, term138107.getClass(), "year", 2026);
        setShortField(term138107, term138107.getClass(), "month", (short) 4);
        setShortField(term138107, term138107.getClass(), "day", (short) 6);
        setField(term138106, term138106.getClass(), "date", term138107);
        setByteField(term138111, term138111.getClass(), "hour", (byte) 2);
        setByteField(term138111, term138111.getClass(), "minute", (byte) 53);
        setByteField(term138111, term138111.getClass(), "second", (byte) 57);
        setIntField(term138111, term138111.getClass(), "nano", 42640315);
        setField(term138106, term138106.getClass(), "time", term138111);
        setField(term137901, term137901.getClass(), "lastPlayDate", term138106);
        setIntField(term137901, term137901.getClass(), "lastPlaceId", 1275653221);
        setField(term137901, term137901.getClass(), "lastPlaceName", "wsDKWECjHf");
        setField(term137901, term137901.getClass(), "lastRegionId", "FBPRmfNDEr");
        setField(term137901, term137901.getClass(), "lastRegionName", "qOEJpzrzgF");
        setField(term137901, term137901.getClass(), "lastAllNetId", "ExvDwmtNdV");
        setField(term137901, term137901.getClass(), "lastClientId", "MmhamxEBqw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term137901, args);
    }

};


