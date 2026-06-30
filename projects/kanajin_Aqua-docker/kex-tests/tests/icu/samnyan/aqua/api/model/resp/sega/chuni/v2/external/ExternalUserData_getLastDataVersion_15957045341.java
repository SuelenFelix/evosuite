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

public class ExternalUserData_getLastDataVersion_15957045341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16442;

    public ExternalUserData_getLastDataVersion_15957045341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16442 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term16467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16472 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16533 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16576 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16577 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16581 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16627 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16442, term16442.getClass(), "accessCode", "xmzSoVgiED");
        setField(term16442, term16442.getClass(), "userName", "pdSvedKgPq");
        setIntField(term16468, term16468.getClass(), "year", 2029);
        setShortField(term16468, term16468.getClass(), "month", (short) 11);
        setShortField(term16468, term16468.getClass(), "day", (short) 8);
        setField(term16467, term16467.getClass(), "date", term16468);
        setByteField(term16472, term16472.getClass(), "hour", (byte) 23);
        setByteField(term16472, term16472.getClass(), "minute", (byte) 43);
        setByteField(term16472, term16472.getClass(), "second", (byte) 12);
        setIntField(term16472, term16472.getClass(), "nano", 586227255);
        setField(term16467, term16467.getClass(), "time", term16472);
        setField(term16442, term16442.getClass(), "lastLoginDate", term16467);
        setBooleanField(term16442, term16442.getClass(), "isWebJoin", true);
        setField(term16442, term16442.getClass(), "webLimitDate", "epPTwvcoyb");
        setIntField(term16442, term16442.getClass(), "level", 1850364894);
        setIntField(term16442, term16442.getClass(), "reincarnationNum", 915367534);
        setField(term16442, term16442.getClass(), "exp", "UBPHmOICBs");
        setLongField(term16442, term16442.getClass(), "point", 7017605765544766728L);
        setLongField(term16442, term16442.getClass(), "totalPoint", -6078481855513028760L);
        setIntField(term16442, term16442.getClass(), "playCount", 1949983666);
        setIntField(term16442, term16442.getClass(), "multiPlayCount", 154111854);
        setIntField(term16442, term16442.getClass(), "multiWinCount", 710986341);
        setIntField(term16442, term16442.getClass(), "requestResCount", -873958002);
        setIntField(term16442, term16442.getClass(), "acceptResCount", -1780848958);
        setIntField(term16442, term16442.getClass(), "successResCount", 1235045850);
        setIntField(term16442, term16442.getClass(), "playerRating", -75143033);
        setIntField(term16442, term16442.getClass(), "highestRating", 797015478);
        setIntField(term16442, term16442.getClass(), "nameplateId", 717574276);
        setIntField(term16442, term16442.getClass(), "frameId", 1795369860);
        setIntField(term16442, term16442.getClass(), "characterId", -570164389);
        setIntField(term16442, term16442.getClass(), "trophyId", 43200329);
        setIntField(term16442, term16442.getClass(), "playedTutorialBit", 998679955);
        setIntField(term16442, term16442.getClass(), "firstTutorialCancelNum", 953741504);
        setIntField(term16442, term16442.getClass(), "masterTutorialCancelNum", 1389452261);
        setIntField(term16442, term16442.getClass(), "totalRepertoireCount", 1615957955);
        setIntField(term16442, term16442.getClass(), "totalMapNum", 1779370220);
        setLongField(term16442, term16442.getClass(), "totalHiScore", -6985556670871089725L);
        setLongField(term16442, term16442.getClass(), "totalBasicHighScore", -8469818909085103606L);
        setLongField(term16442, term16442.getClass(), "totalAdvancedHighScore", 11315815278355083L);
        setLongField(term16442, term16442.getClass(), "totalExpertHighScore", 7735460540091431012L);
        setLongField(term16442, term16442.getClass(), "totalMasterHighScore", 1346299551708610248L);
        setIntField(term16529, term16529.getClass(), "year", 2014);
        setShortField(term16529, term16529.getClass(), "month", (short) 1);
        setShortField(term16529, term16529.getClass(), "day", (short) 23);
        setField(term16528, term16528.getClass(), "date", term16529);
        setByteField(term16533, term16533.getClass(), "hour", (byte) 19);
        setByteField(term16533, term16533.getClass(), "minute", (byte) 52);
        setByteField(term16533, term16533.getClass(), "second", (byte) 9);
        setIntField(term16533, term16533.getClass(), "nano", 235326975);
        setField(term16528, term16528.getClass(), "time", term16533);
        setField(term16442, term16442.getClass(), "eventWatchedDate", term16528);
        setIntField(term16442, term16442.getClass(), "friendCount", -1716046610);
        setBooleanField(term16442, term16442.getClass(), "isMaimai", false);
        setField(term16442, term16442.getClass(), "firstGameId", "IDJUVPgUJf");
        setField(term16442, term16442.getClass(), "firstRomVersion", "JmnWRJUxGr");
        setField(term16442, term16442.getClass(), "firstDataVersion", "wgRGBNrTGP");
        setIntField(term16577, term16577.getClass(), "year", 2023);
        setShortField(term16577, term16577.getClass(), "month", (short) 8);
        setShortField(term16577, term16577.getClass(), "day", (short) 21);
        setField(term16576, term16576.getClass(), "date", term16577);
        setByteField(term16581, term16581.getClass(), "hour", (byte) 10);
        setByteField(term16581, term16581.getClass(), "minute", (byte) 36);
        setByteField(term16581, term16581.getClass(), "second", (byte) 15);
        setIntField(term16581, term16581.getClass(), "nano", 257070204);
        setField(term16576, term16576.getClass(), "time", term16581);
        setField(term16442, term16442.getClass(), "firstPlayDate", term16576);
        setField(term16442, term16442.getClass(), "lastGameId", "FIdNVptZpW");
        setField(term16442, term16442.getClass(), "lastRomVersion", "rQjxAhisjm");
        setField(term16442, term16442.getClass(), "lastDataVersion", "ZDhASPHjDG");
        setIntField(term16623, term16623.getClass(), "year", 2012);
        setShortField(term16623, term16623.getClass(), "month", (short) 12);
        setShortField(term16623, term16623.getClass(), "day", (short) 14);
        setField(term16622, term16622.getClass(), "date", term16623);
        setByteField(term16627, term16627.getClass(), "hour", (byte) 1);
        setByteField(term16627, term16627.getClass(), "minute", (byte) 47);
        setByteField(term16627, term16627.getClass(), "second", (byte) 3);
        setIntField(term16627, term16627.getClass(), "nano", 359751066);
        setField(term16622, term16622.getClass(), "time", term16627);
        setField(term16442, term16442.getClass(), "lastPlayDate", term16622);
        setIntField(term16442, term16442.getClass(), "lastPlaceId", 65264024);
        setField(term16442, term16442.getClass(), "lastPlaceName", "HNVOAXYNEZ");
        setField(term16442, term16442.getClass(), "lastRegionId", "gbbYBYyfvr");
        setField(term16442, term16442.getClass(), "lastRegionName", "SrWMUlbtWV");
        setField(term16442, term16442.getClass(), "lastAllNetId", "VePIumgrrU");
        setField(term16442, term16442.getClass(), "lastClientId", "DPwIqlszZo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term16442, args);
    }

};


