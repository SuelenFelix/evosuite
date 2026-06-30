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

public class ExternalUserData_getPlayedTutorialBit_95824455522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8823;

    public ExternalUserData_getPlayedTutorialBit_95824455522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8823 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term8848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8853 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8914 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8962 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9008 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8823, term8823.getClass(), "accessCode", "VVNNlAePXF");
        setField(term8823, term8823.getClass(), "userName", "jnwVnmKAFv");
        setIntField(term8849, term8849.getClass(), "year", 2023);
        setShortField(term8849, term8849.getClass(), "month", (short) 5);
        setShortField(term8849, term8849.getClass(), "day", (short) 23);
        setField(term8848, term8848.getClass(), "date", term8849);
        setByteField(term8853, term8853.getClass(), "hour", (byte) 0);
        setByteField(term8853, term8853.getClass(), "minute", (byte) 50);
        setByteField(term8853, term8853.getClass(), "second", (byte) 5);
        setIntField(term8853, term8853.getClass(), "nano", 296286825);
        setField(term8848, term8848.getClass(), "time", term8853);
        setField(term8823, term8823.getClass(), "lastLoginDate", term8848);
        setBooleanField(term8823, term8823.getClass(), "isWebJoin", false);
        setField(term8823, term8823.getClass(), "webLimitDate", "TXyHhqeCjR");
        setIntField(term8823, term8823.getClass(), "level", -1840305774);
        setIntField(term8823, term8823.getClass(), "reincarnationNum", 1365087144);
        setField(term8823, term8823.getClass(), "exp", "lZIgPZPgTu");
        setLongField(term8823, term8823.getClass(), "point", -8603648071751666348L);
        setLongField(term8823, term8823.getClass(), "totalPoint", -7884871963229073324L);
        setIntField(term8823, term8823.getClass(), "playCount", -1537255112);
        setIntField(term8823, term8823.getClass(), "multiPlayCount", 934477462);
        setIntField(term8823, term8823.getClass(), "multiWinCount", 4900410);
        setIntField(term8823, term8823.getClass(), "requestResCount", -1252345779);
        setIntField(term8823, term8823.getClass(), "acceptResCount", -2063365430);
        setIntField(term8823, term8823.getClass(), "successResCount", 812570053);
        setIntField(term8823, term8823.getClass(), "playerRating", -1488938905);
        setIntField(term8823, term8823.getClass(), "highestRating", 1916544127);
        setIntField(term8823, term8823.getClass(), "nameplateId", -1133405894);
        setIntField(term8823, term8823.getClass(), "frameId", 1289741214);
        setIntField(term8823, term8823.getClass(), "characterId", 243280944);
        setIntField(term8823, term8823.getClass(), "trophyId", -726681073);
        setIntField(term8823, term8823.getClass(), "playedTutorialBit", -1724487863);
        setIntField(term8823, term8823.getClass(), "firstTutorialCancelNum", -128490829);
        setIntField(term8823, term8823.getClass(), "masterTutorialCancelNum", 202214133);
        setIntField(term8823, term8823.getClass(), "totalRepertoireCount", 1543091617);
        setIntField(term8823, term8823.getClass(), "totalMapNum", -763166094);
        setLongField(term8823, term8823.getClass(), "totalHiScore", -8649738738252714180L);
        setLongField(term8823, term8823.getClass(), "totalBasicHighScore", -7278883608542636188L);
        setLongField(term8823, term8823.getClass(), "totalAdvancedHighScore", -1539859611880912454L);
        setLongField(term8823, term8823.getClass(), "totalExpertHighScore", 4100236067313034103L);
        setLongField(term8823, term8823.getClass(), "totalMasterHighScore", 1195529027276497124L);
        setIntField(term8910, term8910.getClass(), "year", 2015);
        setShortField(term8910, term8910.getClass(), "month", (short) 2);
        setShortField(term8910, term8910.getClass(), "day", (short) 5);
        setField(term8909, term8909.getClass(), "date", term8910);
        setByteField(term8914, term8914.getClass(), "hour", (byte) 3);
        setByteField(term8914, term8914.getClass(), "minute", (byte) 26);
        setByteField(term8914, term8914.getClass(), "second", (byte) 49);
        setIntField(term8914, term8914.getClass(), "nano", 995758570);
        setField(term8909, term8909.getClass(), "time", term8914);
        setField(term8823, term8823.getClass(), "eventWatchedDate", term8909);
        setIntField(term8823, term8823.getClass(), "friendCount", -222941705);
        setBooleanField(term8823, term8823.getClass(), "isMaimai", true);
        setField(term8823, term8823.getClass(), "firstGameId", "iuCxnHGMoW");
        setField(term8823, term8823.getClass(), "firstRomVersion", "GPSEWEDSTo");
        setField(term8823, term8823.getClass(), "firstDataVersion", "RCOqfVsRHt");
        setIntField(term8958, term8958.getClass(), "year", 2013);
        setShortField(term8958, term8958.getClass(), "month", (short) 5);
        setShortField(term8958, term8958.getClass(), "day", (short) 9);
        setField(term8957, term8957.getClass(), "date", term8958);
        setByteField(term8962, term8962.getClass(), "hour", (byte) 4);
        setByteField(term8962, term8962.getClass(), "minute", (byte) 18);
        setByteField(term8962, term8962.getClass(), "second", (byte) 35);
        setIntField(term8962, term8962.getClass(), "nano", 909079395);
        setField(term8957, term8957.getClass(), "time", term8962);
        setField(term8823, term8823.getClass(), "firstPlayDate", term8957);
        setField(term8823, term8823.getClass(), "lastGameId", "TSyCeEZPaT");
        setField(term8823, term8823.getClass(), "lastRomVersion", "JeZFtaqkzW");
        setField(term8823, term8823.getClass(), "lastDataVersion", "vOVuNSCCLe");
        setIntField(term9004, term9004.getClass(), "year", 2015);
        setShortField(term9004, term9004.getClass(), "month", (short) 3);
        setShortField(term9004, term9004.getClass(), "day", (short) 15);
        setField(term9003, term9003.getClass(), "date", term9004);
        setByteField(term9008, term9008.getClass(), "hour", (byte) 8);
        setByteField(term9008, term9008.getClass(), "minute", (byte) 45);
        setByteField(term9008, term9008.getClass(), "second", (byte) 29);
        setIntField(term9008, term9008.getClass(), "nano", 781486470);
        setField(term9003, term9003.getClass(), "time", term9008);
        setField(term8823, term8823.getClass(), "lastPlayDate", term9003);
        setIntField(term8823, term8823.getClass(), "lastPlaceId", 291864719);
        setField(term8823, term8823.getClass(), "lastPlaceName", "fzeqPnzpnt");
        setField(term8823, term8823.getClass(), "lastRegionId", "RxbhrFBjkO");
        setField(term8823, term8823.getClass(), "lastRegionName", "aanyiAOJCl");
        setField(term8823, term8823.getClass(), "lastAllNetId", "VDokbsCuqq");
        setField(term8823, term8823.getClass(), "lastClientId", "xClUIcPECX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedTutorialBit", argTypes, term8823, args);
    }

};


