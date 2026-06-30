package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserSurvival_canEqual_108954546416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106495;
     Object term106676;

    public UserSurvival_canEqual_108954546416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term106501 = new Long(-7013378340043571457L);
        term106495 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term106497 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term106499 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term106515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106530 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term106495, term106495.getClass(), "id", 1980274010918360742L);
        setLongField(term106497, term106497.getClass(), "id", 3205645145047776900L);
        setLongField(term106499, term106499.getClass(), "id", -706258405349500259L);
        setField(term106499, term106499.getClass(), "extId", term106501);
        setField(term106499, term106499.getClass(), "luid", "pWmmwQMysX");
        setIntField(term106516, term106516.getClass(), "year", 2019);
        setShortField(term106516, term106516.getClass(), "month", (short) 4);
        setShortField(term106516, term106516.getClass(), "day", (short) 30);
        setField(term106515, term106515.getClass(), "date", term106516);
        setByteField(term106520, term106520.getClass(), "hour", (byte) 11);
        setByteField(term106520, term106520.getClass(), "minute", (byte) 21);
        setByteField(term106520, term106520.getClass(), "second", (byte) 24);
        setIntField(term106520, term106520.getClass(), "nano", 799334249);
        setField(term106515, term106515.getClass(), "time", term106520);
        setField(term106499, term106499.getClass(), "registerTime", term106515);
        setIntField(term106526, term106526.getClass(), "year", 2012);
        setShortField(term106526, term106526.getClass(), "month", (short) 10);
        setShortField(term106526, term106526.getClass(), "day", (short) 18);
        setField(term106525, term106525.getClass(), "date", term106526);
        setByteField(term106530, term106530.getClass(), "hour", (byte) 0);
        setByteField(term106530, term106530.getClass(), "minute", (byte) 2);
        setByteField(term106530, term106530.getClass(), "second", (byte) 34);
        setIntField(term106530, term106530.getClass(), "nano", 773422612);
        setField(term106525, term106525.getClass(), "time", term106530);
        setField(term106499, term106499.getClass(), "accessTime", term106525);
        setField(term106497, term106497.getClass(), "card", term106499);
        setIntField(term106497, term106497.getClass(), "lastDataVersion", 2081332215);
        setField(term106497, term106497.getClass(), "userName", "BuJzsOARZG");
        setIntField(term106497, term106497.getClass(), "point", 1586283756);
        setIntField(term106497, term106497.getClass(), "totalPoint", -335091853);
        setIntField(term106497, term106497.getClass(), "iconId", -1702801898);
        setIntField(term106497, term106497.getClass(), "nameplateId", 1529874496);
        setIntField(term106497, term106497.getClass(), "frameId", -998359895);
        setIntField(term106497, term106497.getClass(), "trophyId", -578729253);
        setIntField(term106497, term106497.getClass(), "playCount", 1220247325);
        setIntField(term106497, term106497.getClass(), "playVsCount", 1778196538);
        setIntField(term106497, term106497.getClass(), "playSyncCount", 1744440592);
        setIntField(term106497, term106497.getClass(), "winCount", 1945121505);
        setIntField(term106497, term106497.getClass(), "helpCount", -944730326);
        setIntField(term106497, term106497.getClass(), "comboCount", -1773155590);
        setIntField(term106497, term106497.getClass(), "feverCount", 153561632);
        setIntField(term106497, term106497.getClass(), "totalHiScore", 216386937);
        setIntField(term106497, term106497.getClass(), "totalEasyHighScore", -261620665);
        setIntField(term106497, term106497.getClass(), "totalBasicHighScore", -406858348);
        setIntField(term106497, term106497.getClass(), "totalAdvancedHighScore", 533081936);
        setIntField(term106497, term106497.getClass(), "totalExpertHighScore", -418681567);
        setIntField(term106497, term106497.getClass(), "totalMasterHighScore", -1387152349);
        setIntField(term106497, term106497.getClass(), "totalReMasterHighScore", -1513582711);
        setIntField(term106497, term106497.getClass(), "totalHighSync", -1229638409);
        setIntField(term106497, term106497.getClass(), "totalEasySync", 2066431097);
        setIntField(term106497, term106497.getClass(), "totalBasicSync", 2133764630);
        setIntField(term106497, term106497.getClass(), "totalAdvancedSync", -1522058627);
        setIntField(term106497, term106497.getClass(), "totalExpertSync", 353441774);
        setIntField(term106497, term106497.getClass(), "totalMasterSync", -1461119207);
        setIntField(term106497, term106497.getClass(), "totalReMasterSync", 1443058018);
        setIntField(term106497, term106497.getClass(), "playerRating", 943997229);
        setIntField(term106497, term106497.getClass(), "highestRating", -550430861);
        setIntField(term106497, term106497.getClass(), "rankAuthTailId", 401578910);
        setField(term106497, term106497.getClass(), "eventWatchedDate", "lIqJQDMmVL");
        setField(term106497, term106497.getClass(), "webLimitDate", "cXTrsrxYFN");
        setIntField(term106497, term106497.getClass(), "challengeTrackPhase", 1911986107);
        setIntField(term106497, term106497.getClass(), "firstPlayBits", -1549506145);
        setField(term106497, term106497.getClass(), "lastPlayDate", "pEUndHGBiE");
        setIntField(term106497, term106497.getClass(), "lastPlaceId", -970724016);
        setField(term106497, term106497.getClass(), "lastPlaceName", "PCzKLiLqoO");
        setIntField(term106497, term106497.getClass(), "lastRegionId", -854340858);
        setField(term106497, term106497.getClass(), "lastRegionName", "JuYhKUgElF");
        setField(term106497, term106497.getClass(), "lastClientId", "NInWPlYtwe");
        setField(term106497, term106497.getClass(), "lastCountryCode", "qVYRtrgZJt");
        setIntField(term106497, term106497.getClass(), "eventPoint", -1642984440);
        setIntField(term106497, term106497.getClass(), "totalLv", 2122217114);
        setIntField(term106497, term106497.getClass(), "lastLoginBonusDay", 2099495995);
        setIntField(term106497, term106497.getClass(), "lastSurvivalBonusDay", -1203582659);
        setIntField(term106497, term106497.getClass(), "loginBonusLv", 435281259);
        setField(term106495, term106495.getClass(), "user", term106497);
        setIntField(term106495, term106495.getClass(), "survivalId", 2040851544);
        setIntField(term106495, term106495.getClass(), "totalScore", -471289728);
        setIntField(term106495, term106495.getClass(), "totalAchieve", 1093833463);
        setBooleanField(term106495, term106495.getClass(), "isClear", false);
        setBooleanField(term106495, term106495.getClass(), "isNoDamage", true);
        term106676 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term106676;
        callMethod(klass, "canEqual", argTypes, term106495, args);
    }

};


