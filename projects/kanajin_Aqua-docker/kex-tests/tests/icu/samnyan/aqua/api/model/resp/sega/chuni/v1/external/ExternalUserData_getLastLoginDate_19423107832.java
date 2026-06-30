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

public class ExternalUserData_getLastLoginDate_19423107832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803;

    public ExternalUserData_getLastLoginDate_19423107832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term803 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term833 = newInstance(Class.forName("java.time.LocalTime"));
        Object term889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term894 = newInstance(Class.forName("java.time.LocalTime"));
        Object term937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term942 = newInstance(Class.forName("java.time.LocalTime"));
        Object term983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term988 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term803, term803.getClass(), "accessCode", "OWDIEULEFu");
        setField(term803, term803.getClass(), "userName", "dWRymuLBtr");
        setIntField(term829, term829.getClass(), "year", 2029);
        setShortField(term829, term829.getClass(), "month", (short) 8);
        setShortField(term829, term829.getClass(), "day", (short) 29);
        setField(term828, term828.getClass(), "date", term829);
        setByteField(term833, term833.getClass(), "hour", (byte) 15);
        setByteField(term833, term833.getClass(), "minute", (byte) 50);
        setByteField(term833, term833.getClass(), "second", (byte) 1);
        setIntField(term833, term833.getClass(), "nano", 277971904);
        setField(term828, term828.getClass(), "time", term833);
        setField(term803, term803.getClass(), "lastLoginDate", term828);
        setBooleanField(term803, term803.getClass(), "isWebJoin", true);
        setField(term803, term803.getClass(), "webLimitDate", "AijpHYOFuy");
        setIntField(term803, term803.getClass(), "level", -602026508);
        setIntField(term803, term803.getClass(), "reincarnationNum", -157887805);
        setField(term803, term803.getClass(), "exp", "SbAoxhfrkn");
        setLongField(term803, term803.getClass(), "point", -5476826692763582090L);
        setLongField(term803, term803.getClass(), "totalPoint", -872011222785455006L);
        setIntField(term803, term803.getClass(), "playCount", 1876565163);
        setIntField(term803, term803.getClass(), "multiPlayCount", -817164822);
        setIntField(term803, term803.getClass(), "multiWinCount", -1016503459);
        setIntField(term803, term803.getClass(), "requestResCount", -1968847291);
        setIntField(term803, term803.getClass(), "acceptResCount", 579005622);
        setIntField(term803, term803.getClass(), "successResCount", -14890619);
        setIntField(term803, term803.getClass(), "playerRating", 1632125673);
        setIntField(term803, term803.getClass(), "highestRating", 454281060);
        setIntField(term803, term803.getClass(), "nameplateId", -1786399638);
        setIntField(term803, term803.getClass(), "frameId", 2055867847);
        setIntField(term803, term803.getClass(), "characterId", -1048298087);
        setIntField(term803, term803.getClass(), "trophyId", 292681826);
        setIntField(term803, term803.getClass(), "playedTutorialBit", 458147407);
        setIntField(term803, term803.getClass(), "firstTutorialCancelNum", -184153539);
        setIntField(term803, term803.getClass(), "masterTutorialCancelNum", 493620644);
        setIntField(term803, term803.getClass(), "totalRepertoireCount", 1328271830);
        setIntField(term803, term803.getClass(), "totalMapNum", 1596070772);
        setLongField(term803, term803.getClass(), "totalHiScore", -316468845751588286L);
        setLongField(term803, term803.getClass(), "totalBasicHighScore", 5127676408959197577L);
        setLongField(term803, term803.getClass(), "totalAdvancedHighScore", -6573104506744284592L);
        setLongField(term803, term803.getClass(), "totalExpertHighScore", -4920224193275732920L);
        setLongField(term803, term803.getClass(), "totalMasterHighScore", 8428634514691209827L);
        setIntField(term890, term890.getClass(), "year", 2022);
        setShortField(term890, term890.getClass(), "month", (short) 11);
        setShortField(term890, term890.getClass(), "day", (short) 16);
        setField(term889, term889.getClass(), "date", term890);
        setByteField(term894, term894.getClass(), "hour", (byte) 15);
        setByteField(term894, term894.getClass(), "minute", (byte) 54);
        setByteField(term894, term894.getClass(), "second", (byte) 2);
        setIntField(term894, term894.getClass(), "nano", 733274103);
        setField(term889, term889.getClass(), "time", term894);
        setField(term803, term803.getClass(), "eventWatchedDate", term889);
        setIntField(term803, term803.getClass(), "friendCount", 97029295);
        setBooleanField(term803, term803.getClass(), "isMaimai", true);
        setField(term803, term803.getClass(), "firstGameId", "kuTXqwMtDB");
        setField(term803, term803.getClass(), "firstRomVersion", "Ghbwtircqb");
        setField(term803, term803.getClass(), "firstDataVersion", "xrwlQZdwCp");
        setIntField(term938, term938.getClass(), "year", 2019);
        setShortField(term938, term938.getClass(), "month", (short) 2);
        setShortField(term938, term938.getClass(), "day", (short) 21);
        setField(term937, term937.getClass(), "date", term938);
        setByteField(term942, term942.getClass(), "hour", (byte) 5);
        setByteField(term942, term942.getClass(), "minute", (byte) 41);
        setByteField(term942, term942.getClass(), "second", (byte) 11);
        setIntField(term942, term942.getClass(), "nano", 859829782);
        setField(term937, term937.getClass(), "time", term942);
        setField(term803, term803.getClass(), "firstPlayDate", term937);
        setField(term803, term803.getClass(), "lastGameId", "IDCWpPLRkE");
        setField(term803, term803.getClass(), "lastRomVersion", "nyiiPDVjAc");
        setField(term803, term803.getClass(), "lastDataVersion", "aKnKipADSo");
        setIntField(term984, term984.getClass(), "year", 2018);
        setShortField(term984, term984.getClass(), "month", (short) 9);
        setShortField(term984, term984.getClass(), "day", (short) 28);
        setField(term983, term983.getClass(), "date", term984);
        setByteField(term988, term988.getClass(), "hour", (byte) 3);
        setByteField(term988, term988.getClass(), "minute", (byte) 37);
        setByteField(term988, term988.getClass(), "second", (byte) 46);
        setIntField(term988, term988.getClass(), "nano", 763326845);
        setField(term983, term983.getClass(), "time", term988);
        setField(term803, term803.getClass(), "lastPlayDate", term983);
        setIntField(term803, term803.getClass(), "lastPlaceId", -1371869594);
        setField(term803, term803.getClass(), "lastPlaceName", "wSQxaModmm");
        setField(term803, term803.getClass(), "lastRegionId", "UlajhuVLaP");
        setField(term803, term803.getClass(), "lastRegionName", "gGSMzuGICf");
        setField(term803, term803.getClass(), "lastAllNetId", "hxCBltsObl");
        setField(term803, term803.getClass(), "lastClientId", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term803, args);
    }

};


