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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class UserItem_init_1546414018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128829;
     Object term128831;
     Object term129107;
     Object term129109;
     Object term129111;
     Object term129113;

    public UserItem_init_1546414018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128829 = new Long(5648572465261242904L);
        Long term128835 = new Long(-9204303423581447271L);
        term128831 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term128833 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term128849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128854 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128859 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128864 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128886 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128947 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128991 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128995 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129041 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term128831, term128831.getClass(), "id", -6565717772503302541L);
        setLongField(term128833, term128833.getClass(), "id", 8565557338431532040L);
        setField(term128833, term128833.getClass(), "extId", term128835);
        setField(term128833, term128833.getClass(), "luid", "QDpqtNZTXP");
        setIntField(term128850, term128850.getClass(), "year", 2021);
        setShortField(term128850, term128850.getClass(), "month", (short) 8);
        setShortField(term128850, term128850.getClass(), "day", (short) 11);
        setField(term128849, term128849.getClass(), "date", term128850);
        setByteField(term128854, term128854.getClass(), "hour", (byte) 17);
        setByteField(term128854, term128854.getClass(), "minute", (byte) 23);
        setByteField(term128854, term128854.getClass(), "second", (byte) 44);
        setIntField(term128854, term128854.getClass(), "nano", 259629307);
        setField(term128849, term128849.getClass(), "time", term128854);
        setField(term128833, term128833.getClass(), "registerTime", term128849);
        setIntField(term128860, term128860.getClass(), "year", 2015);
        setShortField(term128860, term128860.getClass(), "month", (short) 7);
        setShortField(term128860, term128860.getClass(), "day", (short) 18);
        setField(term128859, term128859.getClass(), "date", term128860);
        setByteField(term128864, term128864.getClass(), "hour", (byte) 12);
        setByteField(term128864, term128864.getClass(), "minute", (byte) 57);
        setByteField(term128864, term128864.getClass(), "second", (byte) 55);
        setIntField(term128864, term128864.getClass(), "nano", 807129715);
        setField(term128859, term128859.getClass(), "time", term128864);
        setField(term128833, term128833.getClass(), "accessTime", term128859);
        setField(term128831, term128831.getClass(), "card", term128833);
        setField(term128831, term128831.getClass(), "userName", "ERsxGrzfGd");
        setIntField(term128882, term128882.getClass(), "year", 2014);
        setShortField(term128882, term128882.getClass(), "month", (short) 12);
        setShortField(term128882, term128882.getClass(), "day", (short) 11);
        setField(term128881, term128881.getClass(), "date", term128882);
        setByteField(term128886, term128886.getClass(), "hour", (byte) 6);
        setByteField(term128886, term128886.getClass(), "minute", (byte) 5);
        setByteField(term128886, term128886.getClass(), "second", (byte) 33);
        setIntField(term128886, term128886.getClass(), "nano", 20756797);
        setField(term128881, term128881.getClass(), "time", term128886);
        setField(term128831, term128831.getClass(), "lastLoginDate", term128881);
        setBooleanField(term128831, term128831.getClass(), "isWebJoin", false);
        setField(term128831, term128831.getClass(), "webLimitDate", "CRKkCjukkS");
        setIntField(term128831, term128831.getClass(), "level", -382694195);
        setIntField(term128831, term128831.getClass(), "reincarnationNum", -818635049);
        setField(term128831, term128831.getClass(), "exp", "PqRZMgCthN");
        setLongField(term128831, term128831.getClass(), "point", 6166105616036971710L);
        setLongField(term128831, term128831.getClass(), "totalPoint", -5620922687611709677L);
        setIntField(term128831, term128831.getClass(), "playCount", 2059446583);
        setIntField(term128831, term128831.getClass(), "multiPlayCount", -1921696663);
        setIntField(term128831, term128831.getClass(), "multiWinCount", 687014558);
        setIntField(term128831, term128831.getClass(), "requestResCount", -217279729);
        setIntField(term128831, term128831.getClass(), "acceptResCount", -1559780022);
        setIntField(term128831, term128831.getClass(), "successResCount", 767848530);
        setIntField(term128831, term128831.getClass(), "playerRating", 1958684579);
        setIntField(term128831, term128831.getClass(), "highestRating", -1479249075);
        setIntField(term128831, term128831.getClass(), "nameplateId", -1222677001);
        setIntField(term128831, term128831.getClass(), "frameId", 931155794);
        setIntField(term128831, term128831.getClass(), "characterId", 869921404);
        setIntField(term128831, term128831.getClass(), "trophyId", 431473602);
        setIntField(term128831, term128831.getClass(), "playedTutorialBit", 284886453);
        setIntField(term128831, term128831.getClass(), "firstTutorialCancelNum", 81623981);
        setIntField(term128831, term128831.getClass(), "masterTutorialCancelNum", -1407481630);
        setIntField(term128831, term128831.getClass(), "totalRepertoireCount", -1963906003);
        setIntField(term128831, term128831.getClass(), "totalMapNum", -1380281551);
        setLongField(term128831, term128831.getClass(), "totalHiScore", -2346105813386002114L);
        setLongField(term128831, term128831.getClass(), "totalBasicHighScore", -8289034985880178543L);
        setLongField(term128831, term128831.getClass(), "totalAdvancedHighScore", 2163887912849925332L);
        setLongField(term128831, term128831.getClass(), "totalExpertHighScore", -4225761439324849295L);
        setLongField(term128831, term128831.getClass(), "totalMasterHighScore", 221832985952382123L);
        setIntField(term128943, term128943.getClass(), "year", 2025);
        setShortField(term128943, term128943.getClass(), "month", (short) 12);
        setShortField(term128943, term128943.getClass(), "day", (short) 6);
        setField(term128942, term128942.getClass(), "date", term128943);
        setByteField(term128947, term128947.getClass(), "hour", (byte) 11);
        setByteField(term128947, term128947.getClass(), "minute", (byte) 45);
        setByteField(term128947, term128947.getClass(), "second", (byte) 47);
        setIntField(term128947, term128947.getClass(), "nano", 496361054);
        setField(term128942, term128942.getClass(), "time", term128947);
        setField(term128831, term128831.getClass(), "eventWatchedDate", term128942);
        setIntField(term128831, term128831.getClass(), "friendCount", -2059295062);
        setBooleanField(term128831, term128831.getClass(), "isMaimai", false);
        setField(term128831, term128831.getClass(), "firstGameId", "GrJVQEmmlP");
        setField(term128831, term128831.getClass(), "firstRomVersion", "znnUCOtZMp");
        setField(term128831, term128831.getClass(), "firstDataVersion", "QhqWOzlnRY");
        setIntField(term128991, term128991.getClass(), "year", 2015);
        setShortField(term128991, term128991.getClass(), "month", (short) 8);
        setShortField(term128991, term128991.getClass(), "day", (short) 27);
        setField(term128990, term128990.getClass(), "date", term128991);
        setByteField(term128995, term128995.getClass(), "hour", (byte) 7);
        setByteField(term128995, term128995.getClass(), "minute", (byte) 42);
        setByteField(term128995, term128995.getClass(), "second", (byte) 59);
        setIntField(term128995, term128995.getClass(), "nano", 534792982);
        setField(term128990, term128990.getClass(), "time", term128995);
        setField(term128831, term128831.getClass(), "firstPlayDate", term128990);
        setField(term128831, term128831.getClass(), "lastGameId", "PgDJdYVklE");
        setField(term128831, term128831.getClass(), "lastRomVersion", "mdNIWipYwz");
        setField(term128831, term128831.getClass(), "lastDataVersion", "LPiRxaDRZj");
        setIntField(term129037, term129037.getClass(), "year", 2017);
        setShortField(term129037, term129037.getClass(), "month", (short) 6);
        setShortField(term129037, term129037.getClass(), "day", (short) 20);
        setField(term129036, term129036.getClass(), "date", term129037);
        setByteField(term129041, term129041.getClass(), "hour", (byte) 6);
        setByteField(term129041, term129041.getClass(), "minute", (byte) 20);
        setByteField(term129041, term129041.getClass(), "second", (byte) 39);
        setIntField(term129041, term129041.getClass(), "nano", 301313068);
        setField(term129036, term129036.getClass(), "time", term129041);
        setField(term128831, term128831.getClass(), "lastPlayDate", term129036);
        setIntField(term128831, term128831.getClass(), "lastPlaceId", 1107432374);
        setField(term128831, term128831.getClass(), "lastPlaceName", "ghNeQsQdJv");
        setField(term128831, term128831.getClass(), "lastRegionId", "WdJpcVlXsy");
        setField(term128831, term128831.getClass(), "lastRegionName", "uYQVtgtMJM");
        setField(term128831, term128831.getClass(), "lastAllNetId", "AxhrYuHpMZ");
        setField(term128831, term128831.getClass(), "lastClientId", "ZLdlevjZxO");
        term129107 = new Integer(1623768155);
        term129109 = new Integer(-919788156);
        term129111 = new Integer(29020862);
        term129113 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term128829;
        args[1] = term128831;
        args[2] = term129107;
        args[3] = term129109;
        args[4] = term129111;
        args[5] = term129113;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


