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
import java.lang.Integer;

public class UserData_setSuccessResCount_39511456166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157641;
     Object term157917;

    public UserData_setSuccessResCount_39511456166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term157645 = new Long(7800835025296877231L);
        term157641 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term157643 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term157659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157664 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157669 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157670 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157674 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157757 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157851 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term157641, term157641.getClass(), "id", 4149378651748540208L);
        setLongField(term157643, term157643.getClass(), "id", 5605172167231177997L);
        setField(term157643, term157643.getClass(), "extId", term157645);
        setField(term157643, term157643.getClass(), "luid", "poFpgGCWFn");
        setIntField(term157660, term157660.getClass(), "year", 2023);
        setShortField(term157660, term157660.getClass(), "month", (short) 3);
        setShortField(term157660, term157660.getClass(), "day", (short) 19);
        setField(term157659, term157659.getClass(), "date", term157660);
        setByteField(term157664, term157664.getClass(), "hour", (byte) 23);
        setByteField(term157664, term157664.getClass(), "minute", (byte) 18);
        setByteField(term157664, term157664.getClass(), "second", (byte) 37);
        setIntField(term157664, term157664.getClass(), "nano", 727148112);
        setField(term157659, term157659.getClass(), "time", term157664);
        setField(term157643, term157643.getClass(), "registerTime", term157659);
        setIntField(term157670, term157670.getClass(), "year", 2012);
        setShortField(term157670, term157670.getClass(), "month", (short) 11);
        setShortField(term157670, term157670.getClass(), "day", (short) 9);
        setField(term157669, term157669.getClass(), "date", term157670);
        setByteField(term157674, term157674.getClass(), "hour", (byte) 14);
        setByteField(term157674, term157674.getClass(), "minute", (byte) 29);
        setByteField(term157674, term157674.getClass(), "second", (byte) 47);
        setIntField(term157674, term157674.getClass(), "nano", 983788243);
        setField(term157669, term157669.getClass(), "time", term157674);
        setField(term157643, term157643.getClass(), "accessTime", term157669);
        setField(term157641, term157641.getClass(), "card", term157643);
        setField(term157641, term157641.getClass(), "userName", "RqdyWjrKTf");
        setIntField(term157692, term157692.getClass(), "year", 2017);
        setShortField(term157692, term157692.getClass(), "month", (short) 2);
        setShortField(term157692, term157692.getClass(), "day", (short) 23);
        setField(term157691, term157691.getClass(), "date", term157692);
        setByteField(term157696, term157696.getClass(), "hour", (byte) 23);
        setByteField(term157696, term157696.getClass(), "minute", (byte) 9);
        setByteField(term157696, term157696.getClass(), "second", (byte) 0);
        setIntField(term157696, term157696.getClass(), "nano", 759814507);
        setField(term157691, term157691.getClass(), "time", term157696);
        setField(term157641, term157641.getClass(), "lastLoginDate", term157691);
        setBooleanField(term157641, term157641.getClass(), "isWebJoin", false);
        setField(term157641, term157641.getClass(), "webLimitDate", "rWmZbuScqX");
        setIntField(term157641, term157641.getClass(), "level", -1227589816);
        setIntField(term157641, term157641.getClass(), "reincarnationNum", -2138540955);
        setField(term157641, term157641.getClass(), "exp", "TjNFMlAPjg");
        setLongField(term157641, term157641.getClass(), "point", 5736786634821331574L);
        setLongField(term157641, term157641.getClass(), "totalPoint", -7704912290524056833L);
        setIntField(term157641, term157641.getClass(), "playCount", 1205424873);
        setIntField(term157641, term157641.getClass(), "multiPlayCount", -1362218312);
        setIntField(term157641, term157641.getClass(), "multiWinCount", -931123286);
        setIntField(term157641, term157641.getClass(), "requestResCount", -225670855);
        setIntField(term157641, term157641.getClass(), "acceptResCount", 1809930249);
        setIntField(term157641, term157641.getClass(), "successResCount", 742585707);
        setIntField(term157641, term157641.getClass(), "playerRating", -665502806);
        setIntField(term157641, term157641.getClass(), "highestRating", 1816216567);
        setIntField(term157641, term157641.getClass(), "nameplateId", -1787268270);
        setIntField(term157641, term157641.getClass(), "frameId", 612540772);
        setIntField(term157641, term157641.getClass(), "characterId", 664095791);
        setIntField(term157641, term157641.getClass(), "trophyId", 1805310704);
        setIntField(term157641, term157641.getClass(), "playedTutorialBit", 1348119055);
        setIntField(term157641, term157641.getClass(), "firstTutorialCancelNum", -1042667016);
        setIntField(term157641, term157641.getClass(), "masterTutorialCancelNum", -1341064078);
        setIntField(term157641, term157641.getClass(), "totalRepertoireCount", -1088816172);
        setIntField(term157641, term157641.getClass(), "totalMapNum", -1935578983);
        setLongField(term157641, term157641.getClass(), "totalHiScore", -7964141454757798019L);
        setLongField(term157641, term157641.getClass(), "totalBasicHighScore", -8108561590335594741L);
        setLongField(term157641, term157641.getClass(), "totalAdvancedHighScore", -3640864148845613238L);
        setLongField(term157641, term157641.getClass(), "totalExpertHighScore", 405446700030466973L);
        setLongField(term157641, term157641.getClass(), "totalMasterHighScore", 6085713762800785207L);
        setIntField(term157753, term157753.getClass(), "year", 2025);
        setShortField(term157753, term157753.getClass(), "month", (short) 3);
        setShortField(term157753, term157753.getClass(), "day", (short) 21);
        setField(term157752, term157752.getClass(), "date", term157753);
        setByteField(term157757, term157757.getClass(), "hour", (byte) 10);
        setByteField(term157757, term157757.getClass(), "minute", (byte) 29);
        setByteField(term157757, term157757.getClass(), "second", (byte) 15);
        setIntField(term157757, term157757.getClass(), "nano", 188725715);
        setField(term157752, term157752.getClass(), "time", term157757);
        setField(term157641, term157641.getClass(), "eventWatchedDate", term157752);
        setIntField(term157641, term157641.getClass(), "friendCount", 1905602832);
        setBooleanField(term157641, term157641.getClass(), "isMaimai", true);
        setField(term157641, term157641.getClass(), "firstGameId", "RtwermybyK");
        setField(term157641, term157641.getClass(), "firstRomVersion", "viHGfcpsVu");
        setField(term157641, term157641.getClass(), "firstDataVersion", "UGKENyzPxk");
        setIntField(term157801, term157801.getClass(), "year", 2021);
        setShortField(term157801, term157801.getClass(), "month", (short) 2);
        setShortField(term157801, term157801.getClass(), "day", (short) 24);
        setField(term157800, term157800.getClass(), "date", term157801);
        setByteField(term157805, term157805.getClass(), "hour", (byte) 14);
        setByteField(term157805, term157805.getClass(), "minute", (byte) 10);
        setByteField(term157805, term157805.getClass(), "second", (byte) 37);
        setIntField(term157805, term157805.getClass(), "nano", 623256595);
        setField(term157800, term157800.getClass(), "time", term157805);
        setField(term157641, term157641.getClass(), "firstPlayDate", term157800);
        setField(term157641, term157641.getClass(), "lastGameId", "xsGPsLxzxW");
        setField(term157641, term157641.getClass(), "lastRomVersion", "XoKkEYIzVX");
        setField(term157641, term157641.getClass(), "lastDataVersion", "rtKwDvMEWe");
        setIntField(term157847, term157847.getClass(), "year", 2016);
        setShortField(term157847, term157847.getClass(), "month", (short) 8);
        setShortField(term157847, term157847.getClass(), "day", (short) 18);
        setField(term157846, term157846.getClass(), "date", term157847);
        setByteField(term157851, term157851.getClass(), "hour", (byte) 7);
        setByteField(term157851, term157851.getClass(), "minute", (byte) 29);
        setByteField(term157851, term157851.getClass(), "second", (byte) 58);
        setIntField(term157851, term157851.getClass(), "nano", 141855929);
        setField(term157846, term157846.getClass(), "time", term157851);
        setField(term157641, term157641.getClass(), "lastPlayDate", term157846);
        setIntField(term157641, term157641.getClass(), "lastPlaceId", -431572220);
        setField(term157641, term157641.getClass(), "lastPlaceName", "FjPjLYxYCD");
        setField(term157641, term157641.getClass(), "lastRegionId", "MVKJWagTKW");
        setField(term157641, term157641.getClass(), "lastRegionName", "JrgxSjdHDm");
        setField(term157641, term157641.getClass(), "lastAllNetId", "oYTaCsZgHc");
        setField(term157641, term157641.getClass(), "lastClientId", "JjbnWzssdi");
        term157917 = new Integer(972986984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157917;
        callMethod(klass, "setSuccessResCount", argTypes, term157641, args);
    }

};


