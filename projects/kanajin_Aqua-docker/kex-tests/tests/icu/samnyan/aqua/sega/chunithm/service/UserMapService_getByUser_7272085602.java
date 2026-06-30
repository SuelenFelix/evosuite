package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMapService_getByUser_7272085602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789;

    public UserMapService_getByUser_7272085602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1793 = new Long(7411271909051562686L);
        term1789 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1791 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1812 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1844 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1905 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1953 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1999 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1789, term1789.getClass(), "id", -8708192233349544946L);
        setLongField(term1791, term1791.getClass(), "id", 5907001541142728739L);
        setField(term1791, term1791.getClass(), "extId", term1793);
        setField(term1791, term1791.getClass(), "luid", "hoicvmsovO");
        setIntField(term1808, term1808.getClass(), "year", 2028);
        setShortField(term1808, term1808.getClass(), "month", (short) 10);
        setShortField(term1808, term1808.getClass(), "day", (short) 1);
        setField(term1807, term1807.getClass(), "date", term1808);
        setByteField(term1812, term1812.getClass(), "hour", (byte) 17);
        setByteField(term1812, term1812.getClass(), "minute", (byte) 29);
        setByteField(term1812, term1812.getClass(), "second", (byte) 30);
        setIntField(term1812, term1812.getClass(), "nano", 845472306);
        setField(term1807, term1807.getClass(), "time", term1812);
        setField(term1791, term1791.getClass(), "registerTime", term1807);
        setIntField(term1818, term1818.getClass(), "year", 2027);
        setShortField(term1818, term1818.getClass(), "month", (short) 2);
        setShortField(term1818, term1818.getClass(), "day", (short) 19);
        setField(term1817, term1817.getClass(), "date", term1818);
        setByteField(term1822, term1822.getClass(), "hour", (byte) 17);
        setByteField(term1822, term1822.getClass(), "minute", (byte) 37);
        setByteField(term1822, term1822.getClass(), "second", (byte) 27);
        setIntField(term1822, term1822.getClass(), "nano", 920380537);
        setField(term1817, term1817.getClass(), "time", term1822);
        setField(term1791, term1791.getClass(), "accessTime", term1817);
        setField(term1789, term1789.getClass(), "card", term1791);
        setField(term1789, term1789.getClass(), "userName", "eqJfYWRaEL");
        setIntField(term1840, term1840.getClass(), "year", 2021);
        setShortField(term1840, term1840.getClass(), "month", (short) 8);
        setShortField(term1840, term1840.getClass(), "day", (short) 12);
        setField(term1839, term1839.getClass(), "date", term1840);
        setByteField(term1844, term1844.getClass(), "hour", (byte) 2);
        setByteField(term1844, term1844.getClass(), "minute", (byte) 17);
        setByteField(term1844, term1844.getClass(), "second", (byte) 51);
        setIntField(term1844, term1844.getClass(), "nano", 207375141);
        setField(term1839, term1839.getClass(), "time", term1844);
        setField(term1789, term1789.getClass(), "lastLoginDate", term1839);
        setBooleanField(term1789, term1789.getClass(), "isWebJoin", false);
        setField(term1789, term1789.getClass(), "webLimitDate", "fhkbdRViHi");
        setIntField(term1789, term1789.getClass(), "level", -1845499264);
        setIntField(term1789, term1789.getClass(), "reincarnationNum", -505439934);
        setField(term1789, term1789.getClass(), "exp", "uWHnvSvaPl");
        setLongField(term1789, term1789.getClass(), "point", 4178434741742309755L);
        setLongField(term1789, term1789.getClass(), "totalPoint", -2068172595987555756L);
        setIntField(term1789, term1789.getClass(), "playCount", -344842608);
        setIntField(term1789, term1789.getClass(), "multiPlayCount", 941650513);
        setIntField(term1789, term1789.getClass(), "multiWinCount", 444029505);
        setIntField(term1789, term1789.getClass(), "requestResCount", -1034506028);
        setIntField(term1789, term1789.getClass(), "acceptResCount", -1263114719);
        setIntField(term1789, term1789.getClass(), "successResCount", -894662986);
        setIntField(term1789, term1789.getClass(), "playerRating", 304775596);
        setIntField(term1789, term1789.getClass(), "highestRating", -1347665717);
        setIntField(term1789, term1789.getClass(), "nameplateId", -1888585309);
        setIntField(term1789, term1789.getClass(), "frameId", 683666002);
        setIntField(term1789, term1789.getClass(), "characterId", 1596213415);
        setIntField(term1789, term1789.getClass(), "trophyId", -268815336);
        setIntField(term1789, term1789.getClass(), "playedTutorialBit", -1210583429);
        setIntField(term1789, term1789.getClass(), "firstTutorialCancelNum", -663691365);
        setIntField(term1789, term1789.getClass(), "masterTutorialCancelNum", 339854490);
        setIntField(term1789, term1789.getClass(), "totalRepertoireCount", -615654495);
        setIntField(term1789, term1789.getClass(), "totalMapNum", -1476117762);
        setLongField(term1789, term1789.getClass(), "totalHiScore", -6292278961887936280L);
        setLongField(term1789, term1789.getClass(), "totalBasicHighScore", -6645965768855543712L);
        setLongField(term1789, term1789.getClass(), "totalAdvancedHighScore", 4784595517102746672L);
        setLongField(term1789, term1789.getClass(), "totalExpertHighScore", -7612550318181586304L);
        setLongField(term1789, term1789.getClass(), "totalMasterHighScore", -2170847986967241072L);
        setIntField(term1901, term1901.getClass(), "year", 2025);
        setShortField(term1901, term1901.getClass(), "month", (short) 11);
        setShortField(term1901, term1901.getClass(), "day", (short) 3);
        setField(term1900, term1900.getClass(), "date", term1901);
        setByteField(term1905, term1905.getClass(), "hour", (byte) 21);
        setByteField(term1905, term1905.getClass(), "minute", (byte) 24);
        setByteField(term1905, term1905.getClass(), "second", (byte) 23);
        setIntField(term1905, term1905.getClass(), "nano", 210986721);
        setField(term1900, term1900.getClass(), "time", term1905);
        setField(term1789, term1789.getClass(), "eventWatchedDate", term1900);
        setIntField(term1789, term1789.getClass(), "friendCount", -341962980);
        setBooleanField(term1789, term1789.getClass(), "isMaimai", true);
        setField(term1789, term1789.getClass(), "firstGameId", "kBdSllIBVz");
        setField(term1789, term1789.getClass(), "firstRomVersion", "TJmVBGfTML");
        setField(term1789, term1789.getClass(), "firstDataVersion", "tPlsykYBqO");
        setIntField(term1949, term1949.getClass(), "year", 2016);
        setShortField(term1949, term1949.getClass(), "month", (short) 6);
        setShortField(term1949, term1949.getClass(), "day", (short) 15);
        setField(term1948, term1948.getClass(), "date", term1949);
        setByteField(term1953, term1953.getClass(), "hour", (byte) 21);
        setByteField(term1953, term1953.getClass(), "minute", (byte) 23);
        setByteField(term1953, term1953.getClass(), "second", (byte) 23);
        setIntField(term1953, term1953.getClass(), "nano", 433372070);
        setField(term1948, term1948.getClass(), "time", term1953);
        setField(term1789, term1789.getClass(), "firstPlayDate", term1948);
        setField(term1789, term1789.getClass(), "lastGameId", "bLPjGVBhlX");
        setField(term1789, term1789.getClass(), "lastRomVersion", "whBvTVIIlC");
        setField(term1789, term1789.getClass(), "lastDataVersion", "IgRJUzaCwW");
        setIntField(term1995, term1995.getClass(), "year", 2012);
        setShortField(term1995, term1995.getClass(), "month", (short) 8);
        setShortField(term1995, term1995.getClass(), "day", (short) 25);
        setField(term1994, term1994.getClass(), "date", term1995);
        setByteField(term1999, term1999.getClass(), "hour", (byte) 19);
        setByteField(term1999, term1999.getClass(), "minute", (byte) 49);
        setByteField(term1999, term1999.getClass(), "second", (byte) 8);
        setIntField(term1999, term1999.getClass(), "nano", 912685024);
        setField(term1994, term1994.getClass(), "time", term1999);
        setField(term1789, term1789.getClass(), "lastPlayDate", term1994);
        setIntField(term1789, term1789.getClass(), "lastPlaceId", 1532716628);
        setField(term1789, term1789.getClass(), "lastPlaceName", "JUmudUmaaV");
        setField(term1789, term1789.getClass(), "lastRegionId", "KoyGrUJeJW");
        setField(term1789, term1789.getClass(), "lastRegionName", "HqBOwkVqjD");
        setField(term1789, term1789.getClass(), "lastAllNetId", "MAcUBcBckh");
        setField(term1789, term1789.getClass(), "lastClientId", "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserMapService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term1789;
        callMethod(klass, "getByUser", argTypes, null, args);
    }

};


