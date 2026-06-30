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

public class UserGeneralData_setId_12512596425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304855;
     Object term305157;

    public UserGeneralData_setId_12512596425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term304861 = new Long(8261619652909874476L);
        term304855 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term304857 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term304859 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term304875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304890 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304973 = newInstance(Class.forName("java.time.LocalTime"));
        Object term305016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term305017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term305021 = newInstance(Class.forName("java.time.LocalTime"));
        Object term305062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term305063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term305067 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term304855, term304855.getClass(), "id", -4251882276629548538L);
        setLongField(term304857, term304857.getClass(), "id", -2512489315719996447L);
        setLongField(term304859, term304859.getClass(), "id", 4970736928905252160L);
        setField(term304859, term304859.getClass(), "extId", term304861);
        setField(term304859, term304859.getClass(), "luid", "paSMyMWJmJ");
        setIntField(term304876, term304876.getClass(), "year", 2018);
        setShortField(term304876, term304876.getClass(), "month", (short) 10);
        setShortField(term304876, term304876.getClass(), "day", (short) 10);
        setField(term304875, term304875.getClass(), "date", term304876);
        setByteField(term304880, term304880.getClass(), "hour", (byte) 19);
        setByteField(term304880, term304880.getClass(), "minute", (byte) 28);
        setByteField(term304880, term304880.getClass(), "second", (byte) 24);
        setIntField(term304880, term304880.getClass(), "nano", 831653905);
        setField(term304875, term304875.getClass(), "time", term304880);
        setField(term304859, term304859.getClass(), "registerTime", term304875);
        setIntField(term304886, term304886.getClass(), "year", 2015);
        setShortField(term304886, term304886.getClass(), "month", (short) 1);
        setShortField(term304886, term304886.getClass(), "day", (short) 17);
        setField(term304885, term304885.getClass(), "date", term304886);
        setByteField(term304890, term304890.getClass(), "hour", (byte) 12);
        setByteField(term304890, term304890.getClass(), "minute", (byte) 24);
        setByteField(term304890, term304890.getClass(), "second", (byte) 56);
        setIntField(term304890, term304890.getClass(), "nano", 437263476);
        setField(term304885, term304885.getClass(), "time", term304890);
        setField(term304859, term304859.getClass(), "accessTime", term304885);
        setField(term304857, term304857.getClass(), "card", term304859);
        setField(term304857, term304857.getClass(), "userName", "BfEbeOIyEv");
        setIntField(term304908, term304908.getClass(), "year", 2023);
        setShortField(term304908, term304908.getClass(), "month", (short) 4);
        setShortField(term304908, term304908.getClass(), "day", (short) 11);
        setField(term304907, term304907.getClass(), "date", term304908);
        setByteField(term304912, term304912.getClass(), "hour", (byte) 7);
        setByteField(term304912, term304912.getClass(), "minute", (byte) 1);
        setByteField(term304912, term304912.getClass(), "second", (byte) 18);
        setIntField(term304912, term304912.getClass(), "nano", 152492724);
        setField(term304907, term304907.getClass(), "time", term304912);
        setField(term304857, term304857.getClass(), "lastLoginDate", term304907);
        setBooleanField(term304857, term304857.getClass(), "isWebJoin", false);
        setField(term304857, term304857.getClass(), "webLimitDate", "wKtDelthfw");
        setIntField(term304857, term304857.getClass(), "level", -1228260643);
        setIntField(term304857, term304857.getClass(), "reincarnationNum", 574874911);
        setField(term304857, term304857.getClass(), "exp", "gFOGAVnoKy");
        setLongField(term304857, term304857.getClass(), "point", -1554841210244602287L);
        setLongField(term304857, term304857.getClass(), "totalPoint", 2486531374354637666L);
        setIntField(term304857, term304857.getClass(), "playCount", -526061609);
        setIntField(term304857, term304857.getClass(), "multiPlayCount", -1784695440);
        setIntField(term304857, term304857.getClass(), "multiWinCount", -770471106);
        setIntField(term304857, term304857.getClass(), "requestResCount", 1307638203);
        setIntField(term304857, term304857.getClass(), "acceptResCount", 1624606138);
        setIntField(term304857, term304857.getClass(), "successResCount", 1148154717);
        setIntField(term304857, term304857.getClass(), "playerRating", 1743443237);
        setIntField(term304857, term304857.getClass(), "highestRating", 1817003214);
        setIntField(term304857, term304857.getClass(), "nameplateId", 1718370872);
        setIntField(term304857, term304857.getClass(), "frameId", 1587341901);
        setIntField(term304857, term304857.getClass(), "characterId", 1329288453);
        setIntField(term304857, term304857.getClass(), "trophyId", -758711264);
        setIntField(term304857, term304857.getClass(), "playedTutorialBit", -1402801191);
        setIntField(term304857, term304857.getClass(), "firstTutorialCancelNum", -138841862);
        setIntField(term304857, term304857.getClass(), "masterTutorialCancelNum", 1531550853);
        setIntField(term304857, term304857.getClass(), "totalRepertoireCount", -1492283849);
        setIntField(term304857, term304857.getClass(), "totalMapNum", -1673304554);
        setLongField(term304857, term304857.getClass(), "totalHiScore", 1067985593376883262L);
        setLongField(term304857, term304857.getClass(), "totalBasicHighScore", -5499913086956312323L);
        setLongField(term304857, term304857.getClass(), "totalAdvancedHighScore", -847032915869884035L);
        setLongField(term304857, term304857.getClass(), "totalExpertHighScore", 4566362170283660512L);
        setLongField(term304857, term304857.getClass(), "totalMasterHighScore", -6157498252500278084L);
        setIntField(term304969, term304969.getClass(), "year", 2029);
        setShortField(term304969, term304969.getClass(), "month", (short) 8);
        setShortField(term304969, term304969.getClass(), "day", (short) 3);
        setField(term304968, term304968.getClass(), "date", term304969);
        setByteField(term304973, term304973.getClass(), "hour", (byte) 19);
        setByteField(term304973, term304973.getClass(), "minute", (byte) 25);
        setByteField(term304973, term304973.getClass(), "second", (byte) 28);
        setIntField(term304973, term304973.getClass(), "nano", 55413295);
        setField(term304968, term304968.getClass(), "time", term304973);
        setField(term304857, term304857.getClass(), "eventWatchedDate", term304968);
        setIntField(term304857, term304857.getClass(), "friendCount", -620356333);
        setBooleanField(term304857, term304857.getClass(), "isMaimai", false);
        setField(term304857, term304857.getClass(), "firstGameId", "TNCsQimVZr");
        setField(term304857, term304857.getClass(), "firstRomVersion", "dTJYyhSqZb");
        setField(term304857, term304857.getClass(), "firstDataVersion", "iicxxwOzxG");
        setIntField(term305017, term305017.getClass(), "year", 2023);
        setShortField(term305017, term305017.getClass(), "month", (short) 10);
        setShortField(term305017, term305017.getClass(), "day", (short) 14);
        setField(term305016, term305016.getClass(), "date", term305017);
        setByteField(term305021, term305021.getClass(), "hour", (byte) 11);
        setByteField(term305021, term305021.getClass(), "minute", (byte) 1);
        setByteField(term305021, term305021.getClass(), "second", (byte) 5);
        setIntField(term305021, term305021.getClass(), "nano", 413421203);
        setField(term305016, term305016.getClass(), "time", term305021);
        setField(term304857, term304857.getClass(), "firstPlayDate", term305016);
        setField(term304857, term304857.getClass(), "lastGameId", "BSnMedHMbT");
        setField(term304857, term304857.getClass(), "lastRomVersion", "suxAdGELQz");
        setField(term304857, term304857.getClass(), "lastDataVersion", "tDWIXysudb");
        setIntField(term305063, term305063.getClass(), "year", 2014);
        setShortField(term305063, term305063.getClass(), "month", (short) 3);
        setShortField(term305063, term305063.getClass(), "day", (short) 29);
        setField(term305062, term305062.getClass(), "date", term305063);
        setByteField(term305067, term305067.getClass(), "hour", (byte) 11);
        setByteField(term305067, term305067.getClass(), "minute", (byte) 58);
        setByteField(term305067, term305067.getClass(), "second", (byte) 3);
        setIntField(term305067, term305067.getClass(), "nano", 921766712);
        setField(term305062, term305062.getClass(), "time", term305067);
        setField(term304857, term304857.getClass(), "lastPlayDate", term305062);
        setIntField(term304857, term304857.getClass(), "lastPlaceId", -157136506);
        setField(term304857, term304857.getClass(), "lastPlaceName", "RpgUAcoIsr");
        setField(term304857, term304857.getClass(), "lastRegionId", "lQcYldlbRe");
        setField(term304857, term304857.getClass(), "lastRegionName", "wLBfWSBNBp");
        setField(term304857, term304857.getClass(), "lastAllNetId", "mmSpCBAGwv");
        setField(term304857, term304857.getClass(), "lastClientId", "cFItYVTeZD");
        setField(term304855, term304855.getClass(), "user", term304857);
        setField(term304855, term304855.getClass(), "propertyKey", "CFWwaVWFFR");
        setField(term304855, term304855.getClass(), "propertyValue", "mVUqRSEsUR");
        term305157 = new Long(-500597048395850783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term305157;
        callMethod(klass, "setId", argTypes, term304855, args);
    }

};


