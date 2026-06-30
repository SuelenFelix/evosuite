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
import java.lang.Boolean;

public class UserDuel_setClear_36420187417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82853;
     Object term83149;

    public UserDuel_setClear_36420187417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term82859 = new Long(1457594663983990440L);
        term82853 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term82855 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term82857 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term82873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82878 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82910 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83019 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83065 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83140 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term82853, term82853.getClass(), "id", -8963879630647796485L);
        setLongField(term82855, term82855.getClass(), "id", -4359906070460003487L);
        setLongField(term82857, term82857.getClass(), "id", 3290224539925725962L);
        setField(term82857, term82857.getClass(), "extId", term82859);
        setField(term82857, term82857.getClass(), "luid", "xCfGcRdHTK");
        setIntField(term82874, term82874.getClass(), "year", 2028);
        setShortField(term82874, term82874.getClass(), "month", (short) 10);
        setShortField(term82874, term82874.getClass(), "day", (short) 11);
        setField(term82873, term82873.getClass(), "date", term82874);
        setByteField(term82878, term82878.getClass(), "hour", (byte) 1);
        setByteField(term82878, term82878.getClass(), "minute", (byte) 5);
        setByteField(term82878, term82878.getClass(), "second", (byte) 29);
        setIntField(term82878, term82878.getClass(), "nano", 688086203);
        setField(term82873, term82873.getClass(), "time", term82878);
        setField(term82857, term82857.getClass(), "registerTime", term82873);
        setIntField(term82884, term82884.getClass(), "year", 2029);
        setShortField(term82884, term82884.getClass(), "month", (short) 4);
        setShortField(term82884, term82884.getClass(), "day", (short) 26);
        setField(term82883, term82883.getClass(), "date", term82884);
        setByteField(term82888, term82888.getClass(), "hour", (byte) 19);
        setByteField(term82888, term82888.getClass(), "minute", (byte) 30);
        setByteField(term82888, term82888.getClass(), "second", (byte) 13);
        setIntField(term82888, term82888.getClass(), "nano", 883683186);
        setField(term82883, term82883.getClass(), "time", term82888);
        setField(term82857, term82857.getClass(), "accessTime", term82883);
        setField(term82855, term82855.getClass(), "card", term82857);
        setField(term82855, term82855.getClass(), "userName", "KKHQCvKTvF");
        setIntField(term82906, term82906.getClass(), "year", 2014);
        setShortField(term82906, term82906.getClass(), "month", (short) 9);
        setShortField(term82906, term82906.getClass(), "day", (short) 25);
        setField(term82905, term82905.getClass(), "date", term82906);
        setByteField(term82910, term82910.getClass(), "hour", (byte) 11);
        setByteField(term82910, term82910.getClass(), "minute", (byte) 31);
        setByteField(term82910, term82910.getClass(), "second", (byte) 8);
        setIntField(term82910, term82910.getClass(), "nano", 872565929);
        setField(term82905, term82905.getClass(), "time", term82910);
        setField(term82855, term82855.getClass(), "lastLoginDate", term82905);
        setBooleanField(term82855, term82855.getClass(), "isWebJoin", false);
        setField(term82855, term82855.getClass(), "webLimitDate", "XBhNIIxiNP");
        setIntField(term82855, term82855.getClass(), "level", 1012166312);
        setIntField(term82855, term82855.getClass(), "reincarnationNum", 1625194278);
        setField(term82855, term82855.getClass(), "exp", "JljyXnwkuC");
        setLongField(term82855, term82855.getClass(), "point", -4048501682703538382L);
        setLongField(term82855, term82855.getClass(), "totalPoint", -8292962776344200146L);
        setIntField(term82855, term82855.getClass(), "playCount", 55518559);
        setIntField(term82855, term82855.getClass(), "multiPlayCount", 1862584249);
        setIntField(term82855, term82855.getClass(), "multiWinCount", -1127199664);
        setIntField(term82855, term82855.getClass(), "requestResCount", 1977439964);
        setIntField(term82855, term82855.getClass(), "acceptResCount", 1379432675);
        setIntField(term82855, term82855.getClass(), "successResCount", -1018695351);
        setIntField(term82855, term82855.getClass(), "playerRating", 1080095535);
        setIntField(term82855, term82855.getClass(), "highestRating", 750963355);
        setIntField(term82855, term82855.getClass(), "nameplateId", -1939304192);
        setIntField(term82855, term82855.getClass(), "frameId", 2062007036);
        setIntField(term82855, term82855.getClass(), "characterId", 2099511779);
        setIntField(term82855, term82855.getClass(), "trophyId", 2039235808);
        setIntField(term82855, term82855.getClass(), "playedTutorialBit", -815715514);
        setIntField(term82855, term82855.getClass(), "firstTutorialCancelNum", 1890131657);
        setIntField(term82855, term82855.getClass(), "masterTutorialCancelNum", -910332885);
        setIntField(term82855, term82855.getClass(), "totalRepertoireCount", 186607713);
        setIntField(term82855, term82855.getClass(), "totalMapNum", -400018942);
        setLongField(term82855, term82855.getClass(), "totalHiScore", 3705697676400134819L);
        setLongField(term82855, term82855.getClass(), "totalBasicHighScore", -413020147234344150L);
        setLongField(term82855, term82855.getClass(), "totalAdvancedHighScore", 472883245502777941L);
        setLongField(term82855, term82855.getClass(), "totalExpertHighScore", -6142480959588164820L);
        setLongField(term82855, term82855.getClass(), "totalMasterHighScore", -464053943216947554L);
        setIntField(term82967, term82967.getClass(), "year", 2016);
        setShortField(term82967, term82967.getClass(), "month", (short) 7);
        setShortField(term82967, term82967.getClass(), "day", (short) 13);
        setField(term82966, term82966.getClass(), "date", term82967);
        setByteField(term82971, term82971.getClass(), "hour", (byte) 22);
        setByteField(term82971, term82971.getClass(), "minute", (byte) 34);
        setByteField(term82971, term82971.getClass(), "second", (byte) 48);
        setIntField(term82971, term82971.getClass(), "nano", 138454110);
        setField(term82966, term82966.getClass(), "time", term82971);
        setField(term82855, term82855.getClass(), "eventWatchedDate", term82966);
        setIntField(term82855, term82855.getClass(), "friendCount", -101025934);
        setBooleanField(term82855, term82855.getClass(), "isMaimai", true);
        setField(term82855, term82855.getClass(), "firstGameId", "XLOxkLyvMY");
        setField(term82855, term82855.getClass(), "firstRomVersion", "pjUyKHjjKH");
        setField(term82855, term82855.getClass(), "firstDataVersion", "JApuaiAykc");
        setIntField(term83015, term83015.getClass(), "year", 2010);
        setShortField(term83015, term83015.getClass(), "month", (short) 5);
        setShortField(term83015, term83015.getClass(), "day", (short) 25);
        setField(term83014, term83014.getClass(), "date", term83015);
        setByteField(term83019, term83019.getClass(), "hour", (byte) 17);
        setByteField(term83019, term83019.getClass(), "minute", (byte) 23);
        setByteField(term83019, term83019.getClass(), "second", (byte) 21);
        setIntField(term83019, term83019.getClass(), "nano", 681441380);
        setField(term83014, term83014.getClass(), "time", term83019);
        setField(term82855, term82855.getClass(), "firstPlayDate", term83014);
        setField(term82855, term82855.getClass(), "lastGameId", "NJWFosJfXl");
        setField(term82855, term82855.getClass(), "lastRomVersion", "JraVClZLWB");
        setField(term82855, term82855.getClass(), "lastDataVersion", "PxscjEhxGk");
        setIntField(term83061, term83061.getClass(), "year", 2019);
        setShortField(term83061, term83061.getClass(), "month", (short) 11);
        setShortField(term83061, term83061.getClass(), "day", (short) 2);
        setField(term83060, term83060.getClass(), "date", term83061);
        setByteField(term83065, term83065.getClass(), "hour", (byte) 0);
        setByteField(term83065, term83065.getClass(), "minute", (byte) 49);
        setByteField(term83065, term83065.getClass(), "second", (byte) 45);
        setIntField(term83065, term83065.getClass(), "nano", 193831568);
        setField(term83060, term83060.getClass(), "time", term83065);
        setField(term82855, term82855.getClass(), "lastPlayDate", term83060);
        setIntField(term82855, term82855.getClass(), "lastPlaceId", 1587463337);
        setField(term82855, term82855.getClass(), "lastPlaceName", "ePFnljQSHU");
        setField(term82855, term82855.getClass(), "lastRegionId", "wedLWAuOOY");
        setField(term82855, term82855.getClass(), "lastRegionName", "oZDNpnQlCv");
        setField(term82855, term82855.getClass(), "lastAllNetId", "NdPeQAHWKN");
        setField(term82855, term82855.getClass(), "lastClientId", "giGQTpcQuV");
        setField(term82853, term82853.getClass(), "user", term82855);
        setIntField(term82853, term82853.getClass(), "duelId", 463114370);
        setIntField(term82853, term82853.getClass(), "progress", 1541842334);
        setIntField(term82853, term82853.getClass(), "point", 947697692);
        setBooleanField(term82853, term82853.getClass(), "isClear", true);
        setIntField(term83136, term83136.getClass(), "year", 2025);
        setShortField(term83136, term83136.getClass(), "month", (short) 5);
        setShortField(term83136, term83136.getClass(), "day", (short) 26);
        setField(term83135, term83135.getClass(), "date", term83136);
        setByteField(term83140, term83140.getClass(), "hour", (byte) 20);
        setByteField(term83140, term83140.getClass(), "minute", (byte) 9);
        setByteField(term83140, term83140.getClass(), "second", (byte) 33);
        setIntField(term83140, term83140.getClass(), "nano", 28360372);
        setField(term83135, term83135.getClass(), "time", term83140);
        setField(term82853, term82853.getClass(), "lastPlayDate", term83135);
        setIntField(term82853, term82853.getClass(), "param1", -372056343);
        setIntField(term82853, term82853.getClass(), "param2", 625501454);
        setIntField(term82853, term82853.getClass(), "param3", -1941817273);
        setIntField(term82853, term82853.getClass(), "param4", -919598814);
        term83149 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term83149;
        callMethod(klass, "setClear", argTypes, term82853, args);
    }

};


