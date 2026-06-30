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

public class UserGameOptionEx_getExt2_8944084304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311375;

    public UserGameOptionEx_getExt2_8944084304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term311381 = new Long(7848004402682338886L);
        term311375 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term311377 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term311379 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term311395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311400 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311406 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311410 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311493 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311541 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311587 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term311375, term311375.getClass(), "id", -7307957496922433051L);
        setLongField(term311377, term311377.getClass(), "id", -8573375024113271710L);
        setLongField(term311379, term311379.getClass(), "id", -5466314644855449620L);
        setField(term311379, term311379.getClass(), "extId", term311381);
        setField(term311379, term311379.getClass(), "luid", "OvmJqKnwXe");
        setIntField(term311396, term311396.getClass(), "year", 2016);
        setShortField(term311396, term311396.getClass(), "month", (short) 5);
        setShortField(term311396, term311396.getClass(), "day", (short) 24);
        setField(term311395, term311395.getClass(), "date", term311396);
        setByteField(term311400, term311400.getClass(), "hour", (byte) 21);
        setByteField(term311400, term311400.getClass(), "minute", (byte) 38);
        setByteField(term311400, term311400.getClass(), "second", (byte) 40);
        setIntField(term311400, term311400.getClass(), "nano", 696576411);
        setField(term311395, term311395.getClass(), "time", term311400);
        setField(term311379, term311379.getClass(), "registerTime", term311395);
        setIntField(term311406, term311406.getClass(), "year", 2010);
        setShortField(term311406, term311406.getClass(), "month", (short) 12);
        setShortField(term311406, term311406.getClass(), "day", (short) 30);
        setField(term311405, term311405.getClass(), "date", term311406);
        setByteField(term311410, term311410.getClass(), "hour", (byte) 11);
        setByteField(term311410, term311410.getClass(), "minute", (byte) 10);
        setByteField(term311410, term311410.getClass(), "second", (byte) 21);
        setIntField(term311410, term311410.getClass(), "nano", 435794680);
        setField(term311405, term311405.getClass(), "time", term311410);
        setField(term311379, term311379.getClass(), "accessTime", term311405);
        setField(term311377, term311377.getClass(), "card", term311379);
        setField(term311377, term311377.getClass(), "userName", "nrshoMEpRL");
        setIntField(term311428, term311428.getClass(), "year", 2012);
        setShortField(term311428, term311428.getClass(), "month", (short) 3);
        setShortField(term311428, term311428.getClass(), "day", (short) 25);
        setField(term311427, term311427.getClass(), "date", term311428);
        setByteField(term311432, term311432.getClass(), "hour", (byte) 16);
        setByteField(term311432, term311432.getClass(), "minute", (byte) 6);
        setByteField(term311432, term311432.getClass(), "second", (byte) 31);
        setIntField(term311432, term311432.getClass(), "nano", 502489841);
        setField(term311427, term311427.getClass(), "time", term311432);
        setField(term311377, term311377.getClass(), "lastLoginDate", term311427);
        setBooleanField(term311377, term311377.getClass(), "isWebJoin", true);
        setField(term311377, term311377.getClass(), "webLimitDate", "ZLOPgKhMdJ");
        setIntField(term311377, term311377.getClass(), "level", -1207102661);
        setIntField(term311377, term311377.getClass(), "reincarnationNum", -2824097);
        setField(term311377, term311377.getClass(), "exp", "ZbWdzNDrkG");
        setLongField(term311377, term311377.getClass(), "point", -1608345939535109455L);
        setLongField(term311377, term311377.getClass(), "totalPoint", 3258015411464637764L);
        setIntField(term311377, term311377.getClass(), "playCount", 322011644);
        setIntField(term311377, term311377.getClass(), "multiPlayCount", -1229888447);
        setIntField(term311377, term311377.getClass(), "multiWinCount", -1053932216);
        setIntField(term311377, term311377.getClass(), "requestResCount", 1920645313);
        setIntField(term311377, term311377.getClass(), "acceptResCount", 1445376587);
        setIntField(term311377, term311377.getClass(), "successResCount", 1173557411);
        setIntField(term311377, term311377.getClass(), "playerRating", -602481720);
        setIntField(term311377, term311377.getClass(), "highestRating", -652516365);
        setIntField(term311377, term311377.getClass(), "nameplateId", 1407579260);
        setIntField(term311377, term311377.getClass(), "frameId", -1211428493);
        setIntField(term311377, term311377.getClass(), "characterId", 1824828795);
        setIntField(term311377, term311377.getClass(), "trophyId", 1126712238);
        setIntField(term311377, term311377.getClass(), "playedTutorialBit", 1726829660);
        setIntField(term311377, term311377.getClass(), "firstTutorialCancelNum", -131597464);
        setIntField(term311377, term311377.getClass(), "masterTutorialCancelNum", 408558447);
        setIntField(term311377, term311377.getClass(), "totalRepertoireCount", -326704512);
        setIntField(term311377, term311377.getClass(), "totalMapNum", -243882414);
        setLongField(term311377, term311377.getClass(), "totalHiScore", 869392470837426566L);
        setLongField(term311377, term311377.getClass(), "totalBasicHighScore", 4646930212097294716L);
        setLongField(term311377, term311377.getClass(), "totalAdvancedHighScore", 3463084499266875904L);
        setLongField(term311377, term311377.getClass(), "totalExpertHighScore", -7732584336161913999L);
        setLongField(term311377, term311377.getClass(), "totalMasterHighScore", -9198569837410546989L);
        setIntField(term311489, term311489.getClass(), "year", 2019);
        setShortField(term311489, term311489.getClass(), "month", (short) 5);
        setShortField(term311489, term311489.getClass(), "day", (short) 21);
        setField(term311488, term311488.getClass(), "date", term311489);
        setByteField(term311493, term311493.getClass(), "hour", (byte) 14);
        setByteField(term311493, term311493.getClass(), "minute", (byte) 54);
        setByteField(term311493, term311493.getClass(), "second", (byte) 3);
        setIntField(term311493, term311493.getClass(), "nano", 940111114);
        setField(term311488, term311488.getClass(), "time", term311493);
        setField(term311377, term311377.getClass(), "eventWatchedDate", term311488);
        setIntField(term311377, term311377.getClass(), "friendCount", 671126920);
        setBooleanField(term311377, term311377.getClass(), "isMaimai", false);
        setField(term311377, term311377.getClass(), "firstGameId", "qXWvyFwoKF");
        setField(term311377, term311377.getClass(), "firstRomVersion", "NkogXiHtJk");
        setField(term311377, term311377.getClass(), "firstDataVersion", "OacTmTWbcB");
        setIntField(term311537, term311537.getClass(), "year", 2011);
        setShortField(term311537, term311537.getClass(), "month", (short) 10);
        setShortField(term311537, term311537.getClass(), "day", (short) 29);
        setField(term311536, term311536.getClass(), "date", term311537);
        setByteField(term311541, term311541.getClass(), "hour", (byte) 10);
        setByteField(term311541, term311541.getClass(), "minute", (byte) 14);
        setByteField(term311541, term311541.getClass(), "second", (byte) 47);
        setIntField(term311541, term311541.getClass(), "nano", 118811919);
        setField(term311536, term311536.getClass(), "time", term311541);
        setField(term311377, term311377.getClass(), "firstPlayDate", term311536);
        setField(term311377, term311377.getClass(), "lastGameId", "xLFRUxoUve");
        setField(term311377, term311377.getClass(), "lastRomVersion", "OadUkgqJIf");
        setField(term311377, term311377.getClass(), "lastDataVersion", "LVRLcJfRsa");
        setIntField(term311583, term311583.getClass(), "year", 2021);
        setShortField(term311583, term311583.getClass(), "month", (short) 7);
        setShortField(term311583, term311583.getClass(), "day", (short) 30);
        setField(term311582, term311582.getClass(), "date", term311583);
        setByteField(term311587, term311587.getClass(), "hour", (byte) 2);
        setByteField(term311587, term311587.getClass(), "minute", (byte) 10);
        setByteField(term311587, term311587.getClass(), "second", (byte) 11);
        setIntField(term311587, term311587.getClass(), "nano", 550024384);
        setField(term311582, term311582.getClass(), "time", term311587);
        setField(term311377, term311377.getClass(), "lastPlayDate", term311582);
        setIntField(term311377, term311377.getClass(), "lastPlaceId", 1273806754);
        setField(term311377, term311377.getClass(), "lastPlaceName", "kssWCPGFlA");
        setField(term311377, term311377.getClass(), "lastRegionId", "MswayHAKlw");
        setField(term311377, term311377.getClass(), "lastRegionName", "qICSGozwUr");
        setField(term311377, term311377.getClass(), "lastAllNetId", "dTLPQyRkQI");
        setField(term311377, term311377.getClass(), "lastClientId", "bLgBVBwSSr");
        setField(term311375, term311375.getClass(), "user", term311377);
        setIntField(term311375, term311375.getClass(), "ext1", -1951879272);
        setIntField(term311375, term311375.getClass(), "ext2", -2003857250);
        setIntField(term311375, term311375.getClass(), "ext3", 294839075);
        setIntField(term311375, term311375.getClass(), "ext4", 591258092);
        setIntField(term311375, term311375.getClass(), "ext5", -1052140576);
        setIntField(term311375, term311375.getClass(), "ext6", -271424283);
        setIntField(term311375, term311375.getClass(), "ext7", 1731549443);
        setIntField(term311375, term311375.getClass(), "ext8", 1099618075);
        setIntField(term311375, term311375.getClass(), "ext9", -1949109167);
        setIntField(term311375, term311375.getClass(), "ext10", 672435692);
        setIntField(term311375, term311375.getClass(), "ext11", -488001056);
        setIntField(term311375, term311375.getClass(), "ext12", -1595822497);
        setIntField(term311375, term311375.getClass(), "ext13", 845221249);
        setIntField(term311375, term311375.getClass(), "ext14", 493327780);
        setIntField(term311375, term311375.getClass(), "ext15", 1273239065);
        setIntField(term311375, term311375.getClass(), "ext16", 206098664);
        setIntField(term311375, term311375.getClass(), "ext17", 1145017472);
        setIntField(term311375, term311375.getClass(), "ext18", 2065041254);
        setIntField(term311375, term311375.getClass(), "ext19", 2066778785);
        setIntField(term311375, term311375.getClass(), "ext20", -1664190515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt2", argTypes, term311375, args);
    }

};


