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

public class UserGeneralData_hashCode_53444412611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308161;

    public UserGeneralData_hashCode_53444412611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term308167 = new Long(4777103307547199454L);
        term308161 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term308163 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term308165 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term308181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308196 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308218 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308279 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308322 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308323 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308327 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308373 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term308161, term308161.getClass(), "id", -1968754509723632094L);
        setLongField(term308163, term308163.getClass(), "id", -2859832295320127160L);
        setLongField(term308165, term308165.getClass(), "id", -2366725071582546648L);
        setField(term308165, term308165.getClass(), "extId", term308167);
        setField(term308165, term308165.getClass(), "luid", "AaBJKKMloo");
        setIntField(term308182, term308182.getClass(), "year", 2020);
        setShortField(term308182, term308182.getClass(), "month", (short) 1);
        setShortField(term308182, term308182.getClass(), "day", (short) 2);
        setField(term308181, term308181.getClass(), "date", term308182);
        setByteField(term308186, term308186.getClass(), "hour", (byte) 9);
        setByteField(term308186, term308186.getClass(), "minute", (byte) 14);
        setByteField(term308186, term308186.getClass(), "second", (byte) 28);
        setIntField(term308186, term308186.getClass(), "nano", 824818198);
        setField(term308181, term308181.getClass(), "time", term308186);
        setField(term308165, term308165.getClass(), "registerTime", term308181);
        setIntField(term308192, term308192.getClass(), "year", 2026);
        setShortField(term308192, term308192.getClass(), "month", (short) 3);
        setShortField(term308192, term308192.getClass(), "day", (short) 1);
        setField(term308191, term308191.getClass(), "date", term308192);
        setByteField(term308196, term308196.getClass(), "hour", (byte) 20);
        setByteField(term308196, term308196.getClass(), "minute", (byte) 9);
        setByteField(term308196, term308196.getClass(), "second", (byte) 22);
        setIntField(term308196, term308196.getClass(), "nano", 122786730);
        setField(term308191, term308191.getClass(), "time", term308196);
        setField(term308165, term308165.getClass(), "accessTime", term308191);
        setField(term308163, term308163.getClass(), "card", term308165);
        setField(term308163, term308163.getClass(), "userName", "xPudQMxgBM");
        setIntField(term308214, term308214.getClass(), "year", 2017);
        setShortField(term308214, term308214.getClass(), "month", (short) 9);
        setShortField(term308214, term308214.getClass(), "day", (short) 11);
        setField(term308213, term308213.getClass(), "date", term308214);
        setByteField(term308218, term308218.getClass(), "hour", (byte) 21);
        setByteField(term308218, term308218.getClass(), "minute", (byte) 8);
        setByteField(term308218, term308218.getClass(), "second", (byte) 34);
        setIntField(term308218, term308218.getClass(), "nano", 607060574);
        setField(term308213, term308213.getClass(), "time", term308218);
        setField(term308163, term308163.getClass(), "lastLoginDate", term308213);
        setBooleanField(term308163, term308163.getClass(), "isWebJoin", true);
        setField(term308163, term308163.getClass(), "webLimitDate", "dZjsEGIcWz");
        setIntField(term308163, term308163.getClass(), "level", 151818114);
        setIntField(term308163, term308163.getClass(), "reincarnationNum", 1950783244);
        setField(term308163, term308163.getClass(), "exp", "svjpGAjnRN");
        setLongField(term308163, term308163.getClass(), "point", 2182468870423520358L);
        setLongField(term308163, term308163.getClass(), "totalPoint", 3752534101168263720L);
        setIntField(term308163, term308163.getClass(), "playCount", 768139455);
        setIntField(term308163, term308163.getClass(), "multiPlayCount", -1410773451);
        setIntField(term308163, term308163.getClass(), "multiWinCount", -223197318);
        setIntField(term308163, term308163.getClass(), "requestResCount", 405548368);
        setIntField(term308163, term308163.getClass(), "acceptResCount", 1711997114);
        setIntField(term308163, term308163.getClass(), "successResCount", 1871798985);
        setIntField(term308163, term308163.getClass(), "playerRating", 1941308595);
        setIntField(term308163, term308163.getClass(), "highestRating", -806743454);
        setIntField(term308163, term308163.getClass(), "nameplateId", 293751820);
        setIntField(term308163, term308163.getClass(), "frameId", 45674117);
        setIntField(term308163, term308163.getClass(), "characterId", 1963663502);
        setIntField(term308163, term308163.getClass(), "trophyId", -570673621);
        setIntField(term308163, term308163.getClass(), "playedTutorialBit", -1324631832);
        setIntField(term308163, term308163.getClass(), "firstTutorialCancelNum", -1565659256);
        setIntField(term308163, term308163.getClass(), "masterTutorialCancelNum", 1942755502);
        setIntField(term308163, term308163.getClass(), "totalRepertoireCount", 96638940);
        setIntField(term308163, term308163.getClass(), "totalMapNum", -1972066107);
        setLongField(term308163, term308163.getClass(), "totalHiScore", 2058442714191216609L);
        setLongField(term308163, term308163.getClass(), "totalBasicHighScore", -7602494537520939705L);
        setLongField(term308163, term308163.getClass(), "totalAdvancedHighScore", 2023870659468031248L);
        setLongField(term308163, term308163.getClass(), "totalExpertHighScore", 2046699291961773430L);
        setLongField(term308163, term308163.getClass(), "totalMasterHighScore", 2398640011723725199L);
        setIntField(term308275, term308275.getClass(), "year", 2012);
        setShortField(term308275, term308275.getClass(), "month", (short) 3);
        setShortField(term308275, term308275.getClass(), "day", (short) 20);
        setField(term308274, term308274.getClass(), "date", term308275);
        setByteField(term308279, term308279.getClass(), "hour", (byte) 13);
        setByteField(term308279, term308279.getClass(), "minute", (byte) 22);
        setByteField(term308279, term308279.getClass(), "second", (byte) 54);
        setIntField(term308279, term308279.getClass(), "nano", 20283621);
        setField(term308274, term308274.getClass(), "time", term308279);
        setField(term308163, term308163.getClass(), "eventWatchedDate", term308274);
        setIntField(term308163, term308163.getClass(), "friendCount", -621184234);
        setBooleanField(term308163, term308163.getClass(), "isMaimai", false);
        setField(term308163, term308163.getClass(), "firstGameId", "pttzoCMsTO");
        setField(term308163, term308163.getClass(), "firstRomVersion", "UZDKpgGSjX");
        setField(term308163, term308163.getClass(), "firstDataVersion", "foaQZmXMHo");
        setIntField(term308323, term308323.getClass(), "year", 2010);
        setShortField(term308323, term308323.getClass(), "month", (short) 1);
        setShortField(term308323, term308323.getClass(), "day", (short) 10);
        setField(term308322, term308322.getClass(), "date", term308323);
        setByteField(term308327, term308327.getClass(), "hour", (byte) 1);
        setByteField(term308327, term308327.getClass(), "minute", (byte) 59);
        setByteField(term308327, term308327.getClass(), "second", (byte) 5);
        setIntField(term308327, term308327.getClass(), "nano", 276776303);
        setField(term308322, term308322.getClass(), "time", term308327);
        setField(term308163, term308163.getClass(), "firstPlayDate", term308322);
        setField(term308163, term308163.getClass(), "lastGameId", "BTiRFFuMmf");
        setField(term308163, term308163.getClass(), "lastRomVersion", "eUQNprkBYk");
        setField(term308163, term308163.getClass(), "lastDataVersion", "RCWgKGfqgy");
        setIntField(term308369, term308369.getClass(), "year", 2016);
        setShortField(term308369, term308369.getClass(), "month", (short) 6);
        setShortField(term308369, term308369.getClass(), "day", (short) 27);
        setField(term308368, term308368.getClass(), "date", term308369);
        setByteField(term308373, term308373.getClass(), "hour", (byte) 13);
        setByteField(term308373, term308373.getClass(), "minute", (byte) 8);
        setByteField(term308373, term308373.getClass(), "second", (byte) 37);
        setIntField(term308373, term308373.getClass(), "nano", 819758701);
        setField(term308368, term308368.getClass(), "time", term308373);
        setField(term308163, term308163.getClass(), "lastPlayDate", term308368);
        setIntField(term308163, term308163.getClass(), "lastPlaceId", -1709700660);
        setField(term308163, term308163.getClass(), "lastPlaceName", "RownRxaaCW");
        setField(term308163, term308163.getClass(), "lastRegionId", "QJsmuCTCTh");
        setField(term308163, term308163.getClass(), "lastRegionName", "kTuulZLRxo");
        setField(term308163, term308163.getClass(), "lastAllNetId", "ZiwCIBjVsO");
        setField(term308163, term308163.getClass(), "lastClientId", "llOXbdniOh");
        setField(term308161, term308161.getClass(), "user", term308163);
        setField(term308161, term308161.getClass(), "propertyKey", "COqsWjaVOy");
        setField(term308161, term308161.getClass(), "propertyValue", "PJOXWELqDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term308161, args);
    }

};


