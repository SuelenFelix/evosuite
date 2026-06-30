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

public class ExternalUserData_getLastPlayDate_55947936342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16843;

    public ExternalUserData_getLastPlayDate_55947936342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16843 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term16868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16873 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16934 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16982 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17028 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16843, term16843.getClass(), "accessCode", "mNgDshwZNc");
        setField(term16843, term16843.getClass(), "userName", "pDqgDbJoFw");
        setIntField(term16869, term16869.getClass(), "year", 2010);
        setShortField(term16869, term16869.getClass(), "month", (short) 2);
        setShortField(term16869, term16869.getClass(), "day", (short) 28);
        setField(term16868, term16868.getClass(), "date", term16869);
        setByteField(term16873, term16873.getClass(), "hour", (byte) 2);
        setByteField(term16873, term16873.getClass(), "minute", (byte) 54);
        setByteField(term16873, term16873.getClass(), "second", (byte) 48);
        setIntField(term16873, term16873.getClass(), "nano", 930628940);
        setField(term16868, term16868.getClass(), "time", term16873);
        setField(term16843, term16843.getClass(), "lastLoginDate", term16868);
        setBooleanField(term16843, term16843.getClass(), "isWebJoin", true);
        setField(term16843, term16843.getClass(), "webLimitDate", "iVOvTzOxwt");
        setIntField(term16843, term16843.getClass(), "level", -252449812);
        setIntField(term16843, term16843.getClass(), "reincarnationNum", -1885268968);
        setField(term16843, term16843.getClass(), "exp", "BjZQdecXvB");
        setLongField(term16843, term16843.getClass(), "point", -7191625829563442696L);
        setLongField(term16843, term16843.getClass(), "totalPoint", 1463379874413441830L);
        setIntField(term16843, term16843.getClass(), "playCount", 277855691);
        setIntField(term16843, term16843.getClass(), "multiPlayCount", 675891483);
        setIntField(term16843, term16843.getClass(), "multiWinCount", -317900470);
        setIntField(term16843, term16843.getClass(), "requestResCount", -979568);
        setIntField(term16843, term16843.getClass(), "acceptResCount", -1422131197);
        setIntField(term16843, term16843.getClass(), "successResCount", -20399281);
        setIntField(term16843, term16843.getClass(), "playerRating", -830170410);
        setIntField(term16843, term16843.getClass(), "highestRating", -1742790308);
        setIntField(term16843, term16843.getClass(), "nameplateId", -1592093430);
        setIntField(term16843, term16843.getClass(), "frameId", 1178214545);
        setIntField(term16843, term16843.getClass(), "characterId", -985334541);
        setIntField(term16843, term16843.getClass(), "trophyId", -1870004228);
        setIntField(term16843, term16843.getClass(), "playedTutorialBit", 380484139);
        setIntField(term16843, term16843.getClass(), "firstTutorialCancelNum", 1822317628);
        setIntField(term16843, term16843.getClass(), "masterTutorialCancelNum", -608830309);
        setIntField(term16843, term16843.getClass(), "totalRepertoireCount", -537786484);
        setIntField(term16843, term16843.getClass(), "totalMapNum", 263859424);
        setLongField(term16843, term16843.getClass(), "totalHiScore", 7998051124369147543L);
        setLongField(term16843, term16843.getClass(), "totalBasicHighScore", -1481367303699139651L);
        setLongField(term16843, term16843.getClass(), "totalAdvancedHighScore", -7709317346333670618L);
        setLongField(term16843, term16843.getClass(), "totalExpertHighScore", -1964501434345816975L);
        setLongField(term16843, term16843.getClass(), "totalMasterHighScore", 4689907154423223972L);
        setIntField(term16930, term16930.getClass(), "year", 2022);
        setShortField(term16930, term16930.getClass(), "month", (short) 3);
        setShortField(term16930, term16930.getClass(), "day", (short) 11);
        setField(term16929, term16929.getClass(), "date", term16930);
        setByteField(term16934, term16934.getClass(), "hour", (byte) 7);
        setByteField(term16934, term16934.getClass(), "minute", (byte) 12);
        setByteField(term16934, term16934.getClass(), "second", (byte) 56);
        setIntField(term16934, term16934.getClass(), "nano", 884158779);
        setField(term16929, term16929.getClass(), "time", term16934);
        setField(term16843, term16843.getClass(), "eventWatchedDate", term16929);
        setIntField(term16843, term16843.getClass(), "friendCount", 1436978289);
        setBooleanField(term16843, term16843.getClass(), "isMaimai", false);
        setField(term16843, term16843.getClass(), "firstGameId", "iUkOOQhEkw");
        setField(term16843, term16843.getClass(), "firstRomVersion", "wmVoFoUVmU");
        setField(term16843, term16843.getClass(), "firstDataVersion", "lLiSiPCciB");
        setIntField(term16978, term16978.getClass(), "year", 2020);
        setShortField(term16978, term16978.getClass(), "month", (short) 2);
        setShortField(term16978, term16978.getClass(), "day", (short) 1);
        setField(term16977, term16977.getClass(), "date", term16978);
        setByteField(term16982, term16982.getClass(), "hour", (byte) 0);
        setByteField(term16982, term16982.getClass(), "minute", (byte) 46);
        setByteField(term16982, term16982.getClass(), "second", (byte) 1);
        setIntField(term16982, term16982.getClass(), "nano", 544722812);
        setField(term16977, term16977.getClass(), "time", term16982);
        setField(term16843, term16843.getClass(), "firstPlayDate", term16977);
        setField(term16843, term16843.getClass(), "lastGameId", "PsMKIIEwdR");
        setField(term16843, term16843.getClass(), "lastRomVersion", "RbQmXqfXAT");
        setField(term16843, term16843.getClass(), "lastDataVersion", "fcCAsvfBbe");
        setIntField(term17024, term17024.getClass(), "year", 2027);
        setShortField(term17024, term17024.getClass(), "month", (short) 8);
        setShortField(term17024, term17024.getClass(), "day", (short) 16);
        setField(term17023, term17023.getClass(), "date", term17024);
        setByteField(term17028, term17028.getClass(), "hour", (byte) 15);
        setByteField(term17028, term17028.getClass(), "minute", (byte) 1);
        setByteField(term17028, term17028.getClass(), "second", (byte) 18);
        setIntField(term17028, term17028.getClass(), "nano", 245350825);
        setField(term17023, term17023.getClass(), "time", term17028);
        setField(term16843, term16843.getClass(), "lastPlayDate", term17023);
        setIntField(term16843, term16843.getClass(), "lastPlaceId", 696225243);
        setField(term16843, term16843.getClass(), "lastPlaceName", "mUNcKUxghj");
        setField(term16843, term16843.getClass(), "lastRegionId", "lnvLKbtveE");
        setField(term16843, term16843.getClass(), "lastRegionName", "FfrrEhTHzQ");
        setField(term16843, term16843.getClass(), "lastAllNetId", "LXnDNrMsqT");
        setField(term16843, term16843.getClass(), "lastClientId", "ZLQamJFBmu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term16843, args);
    }

};


