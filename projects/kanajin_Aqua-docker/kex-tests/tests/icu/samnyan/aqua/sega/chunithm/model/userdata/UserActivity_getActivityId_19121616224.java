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

public class UserActivity_getActivityId_19121616224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293138;

    public UserActivity_getActivityId_19121616224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term293144 = new Long(-2720964670491002091L);
        term293138 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term293140 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term293142 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term293158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293163 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293168 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293169 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293173 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293195 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293256 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293350 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term293138, term293138.getClass(), "id", 6000339484311671071L);
        setLongField(term293140, term293140.getClass(), "id", -26107593653918206L);
        setLongField(term293142, term293142.getClass(), "id", -882029722229355739L);
        setField(term293142, term293142.getClass(), "extId", term293144);
        setField(term293142, term293142.getClass(), "luid", "AjaATujJwK");
        setIntField(term293159, term293159.getClass(), "year", 2027);
        setShortField(term293159, term293159.getClass(), "month", (short) 2);
        setShortField(term293159, term293159.getClass(), "day", (short) 22);
        setField(term293158, term293158.getClass(), "date", term293159);
        setByteField(term293163, term293163.getClass(), "hour", (byte) 20);
        setByteField(term293163, term293163.getClass(), "minute", (byte) 51);
        setByteField(term293163, term293163.getClass(), "second", (byte) 19);
        setIntField(term293163, term293163.getClass(), "nano", 500850954);
        setField(term293158, term293158.getClass(), "time", term293163);
        setField(term293142, term293142.getClass(), "registerTime", term293158);
        setIntField(term293169, term293169.getClass(), "year", 2022);
        setShortField(term293169, term293169.getClass(), "month", (short) 6);
        setShortField(term293169, term293169.getClass(), "day", (short) 1);
        setField(term293168, term293168.getClass(), "date", term293169);
        setByteField(term293173, term293173.getClass(), "hour", (byte) 16);
        setByteField(term293173, term293173.getClass(), "minute", (byte) 51);
        setByteField(term293173, term293173.getClass(), "second", (byte) 51);
        setIntField(term293173, term293173.getClass(), "nano", 720124904);
        setField(term293168, term293168.getClass(), "time", term293173);
        setField(term293142, term293142.getClass(), "accessTime", term293168);
        setField(term293140, term293140.getClass(), "card", term293142);
        setField(term293140, term293140.getClass(), "userName", "qHFDnDYniJ");
        setIntField(term293191, term293191.getClass(), "year", 2016);
        setShortField(term293191, term293191.getClass(), "month", (short) 2);
        setShortField(term293191, term293191.getClass(), "day", (short) 25);
        setField(term293190, term293190.getClass(), "date", term293191);
        setByteField(term293195, term293195.getClass(), "hour", (byte) 6);
        setByteField(term293195, term293195.getClass(), "minute", (byte) 42);
        setByteField(term293195, term293195.getClass(), "second", (byte) 57);
        setIntField(term293195, term293195.getClass(), "nano", 604996243);
        setField(term293190, term293190.getClass(), "time", term293195);
        setField(term293140, term293140.getClass(), "lastLoginDate", term293190);
        setBooleanField(term293140, term293140.getClass(), "isWebJoin", true);
        setField(term293140, term293140.getClass(), "webLimitDate", "MgbYXBxThg");
        setIntField(term293140, term293140.getClass(), "level", -1054022433);
        setIntField(term293140, term293140.getClass(), "reincarnationNum", -1999866261);
        setField(term293140, term293140.getClass(), "exp", "wHcRCOxDfS");
        setLongField(term293140, term293140.getClass(), "point", -764143069790997305L);
        setLongField(term293140, term293140.getClass(), "totalPoint", 7841874237578415646L);
        setIntField(term293140, term293140.getClass(), "playCount", 218173974);
        setIntField(term293140, term293140.getClass(), "multiPlayCount", -71148389);
        setIntField(term293140, term293140.getClass(), "multiWinCount", -1782029594);
        setIntField(term293140, term293140.getClass(), "requestResCount", 647536343);
        setIntField(term293140, term293140.getClass(), "acceptResCount", -896132032);
        setIntField(term293140, term293140.getClass(), "successResCount", -1337932659);
        setIntField(term293140, term293140.getClass(), "playerRating", -1851616394);
        setIntField(term293140, term293140.getClass(), "highestRating", 1530110795);
        setIntField(term293140, term293140.getClass(), "nameplateId", -1883428800);
        setIntField(term293140, term293140.getClass(), "frameId", 1157616668);
        setIntField(term293140, term293140.getClass(), "characterId", -90435964);
        setIntField(term293140, term293140.getClass(), "trophyId", -148280744);
        setIntField(term293140, term293140.getClass(), "playedTutorialBit", -719081831);
        setIntField(term293140, term293140.getClass(), "firstTutorialCancelNum", 541867805);
        setIntField(term293140, term293140.getClass(), "masterTutorialCancelNum", 1140585505);
        setIntField(term293140, term293140.getClass(), "totalRepertoireCount", -625247027);
        setIntField(term293140, term293140.getClass(), "totalMapNum", 2119038637);
        setLongField(term293140, term293140.getClass(), "totalHiScore", 4722907183385854894L);
        setLongField(term293140, term293140.getClass(), "totalBasicHighScore", 1141311547133627189L);
        setLongField(term293140, term293140.getClass(), "totalAdvancedHighScore", -5819816209403809941L);
        setLongField(term293140, term293140.getClass(), "totalExpertHighScore", -3534340455184560024L);
        setLongField(term293140, term293140.getClass(), "totalMasterHighScore", -6827271135302328977L);
        setIntField(term293252, term293252.getClass(), "year", 2026);
        setShortField(term293252, term293252.getClass(), "month", (short) 3);
        setShortField(term293252, term293252.getClass(), "day", (short) 6);
        setField(term293251, term293251.getClass(), "date", term293252);
        setByteField(term293256, term293256.getClass(), "hour", (byte) 22);
        setByteField(term293256, term293256.getClass(), "minute", (byte) 22);
        setByteField(term293256, term293256.getClass(), "second", (byte) 41);
        setIntField(term293256, term293256.getClass(), "nano", 677007798);
        setField(term293251, term293251.getClass(), "time", term293256);
        setField(term293140, term293140.getClass(), "eventWatchedDate", term293251);
        setIntField(term293140, term293140.getClass(), "friendCount", 929089598);
        setBooleanField(term293140, term293140.getClass(), "isMaimai", false);
        setField(term293140, term293140.getClass(), "firstGameId", "aLuLvKQrgt");
        setField(term293140, term293140.getClass(), "firstRomVersion", "qAoVvEtxnE");
        setField(term293140, term293140.getClass(), "firstDataVersion", "rXhHWXIrYT");
        setIntField(term293300, term293300.getClass(), "year", 2021);
        setShortField(term293300, term293300.getClass(), "month", (short) 9);
        setShortField(term293300, term293300.getClass(), "day", (short) 20);
        setField(term293299, term293299.getClass(), "date", term293300);
        setByteField(term293304, term293304.getClass(), "hour", (byte) 8);
        setByteField(term293304, term293304.getClass(), "minute", (byte) 12);
        setByteField(term293304, term293304.getClass(), "second", (byte) 11);
        setIntField(term293304, term293304.getClass(), "nano", 486253385);
        setField(term293299, term293299.getClass(), "time", term293304);
        setField(term293140, term293140.getClass(), "firstPlayDate", term293299);
        setField(term293140, term293140.getClass(), "lastGameId", "xScYUuGKsX");
        setField(term293140, term293140.getClass(), "lastRomVersion", "trzXXmqsss");
        setField(term293140, term293140.getClass(), "lastDataVersion", "HWcsZwHzBJ");
        setIntField(term293346, term293346.getClass(), "year", 2022);
        setShortField(term293346, term293346.getClass(), "month", (short) 6);
        setShortField(term293346, term293346.getClass(), "day", (short) 15);
        setField(term293345, term293345.getClass(), "date", term293346);
        setByteField(term293350, term293350.getClass(), "hour", (byte) 9);
        setByteField(term293350, term293350.getClass(), "minute", (byte) 56);
        setByteField(term293350, term293350.getClass(), "second", (byte) 45);
        setIntField(term293350, term293350.getClass(), "nano", 156456441);
        setField(term293345, term293345.getClass(), "time", term293350);
        setField(term293140, term293140.getClass(), "lastPlayDate", term293345);
        setIntField(term293140, term293140.getClass(), "lastPlaceId", -764359478);
        setField(term293140, term293140.getClass(), "lastPlaceName", "IXfEZVfVbn");
        setField(term293140, term293140.getClass(), "lastRegionId", "ibOPAeVaEy");
        setField(term293140, term293140.getClass(), "lastRegionName", "UQFCGhBwRP");
        setField(term293140, term293140.getClass(), "lastAllNetId", "IKUCiyluwb");
        setField(term293140, term293140.getClass(), "lastClientId", "OIVvPvythq");
        setField(term293138, term293138.getClass(), "user", term293140);
        setIntField(term293138, term293138.getClass(), "kind", -650378880);
        setIntField(term293138, term293138.getClass(), "activityId", 1983275307);
        setIntField(term293138, term293138.getClass(), "sortNumber", 369962091);
        setIntField(term293138, term293138.getClass(), "param1", -305227009);
        setIntField(term293138, term293138.getClass(), "param2", -147443379);
        setIntField(term293138, term293138.getClass(), "param3", -361601596);
        setIntField(term293138, term293138.getClass(), "param4", 1129701491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivityId", argTypes, term293138, args);
    }

};


