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

public class UserData_getPlayCount_16311990411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134067;

    public UserData_getPlayCount_16311990411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term134071 = new Long(8403492202041709902L);
        term134067 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term134069 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term134085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134090 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134100 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134183 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134277 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term134067, term134067.getClass(), "id", -4194720301615483872L);
        setLongField(term134069, term134069.getClass(), "id", 8225296394508889174L);
        setField(term134069, term134069.getClass(), "extId", term134071);
        setField(term134069, term134069.getClass(), "luid", "iiMXpaWLIH");
        setIntField(term134086, term134086.getClass(), "year", 2015);
        setShortField(term134086, term134086.getClass(), "month", (short) 12);
        setShortField(term134086, term134086.getClass(), "day", (short) 3);
        setField(term134085, term134085.getClass(), "date", term134086);
        setByteField(term134090, term134090.getClass(), "hour", (byte) 9);
        setByteField(term134090, term134090.getClass(), "minute", (byte) 57);
        setByteField(term134090, term134090.getClass(), "second", (byte) 8);
        setIntField(term134090, term134090.getClass(), "nano", 387525054);
        setField(term134085, term134085.getClass(), "time", term134090);
        setField(term134069, term134069.getClass(), "registerTime", term134085);
        setIntField(term134096, term134096.getClass(), "year", 2019);
        setShortField(term134096, term134096.getClass(), "month", (short) 1);
        setShortField(term134096, term134096.getClass(), "day", (short) 15);
        setField(term134095, term134095.getClass(), "date", term134096);
        setByteField(term134100, term134100.getClass(), "hour", (byte) 12);
        setByteField(term134100, term134100.getClass(), "minute", (byte) 5);
        setByteField(term134100, term134100.getClass(), "second", (byte) 14);
        setIntField(term134100, term134100.getClass(), "nano", 485893917);
        setField(term134095, term134095.getClass(), "time", term134100);
        setField(term134069, term134069.getClass(), "accessTime", term134095);
        setField(term134067, term134067.getClass(), "card", term134069);
        setField(term134067, term134067.getClass(), "userName", "MqMDTdIpYR");
        setIntField(term134118, term134118.getClass(), "year", 2019);
        setShortField(term134118, term134118.getClass(), "month", (short) 9);
        setShortField(term134118, term134118.getClass(), "day", (short) 8);
        setField(term134117, term134117.getClass(), "date", term134118);
        setByteField(term134122, term134122.getClass(), "hour", (byte) 22);
        setByteField(term134122, term134122.getClass(), "minute", (byte) 56);
        setByteField(term134122, term134122.getClass(), "second", (byte) 8);
        setIntField(term134122, term134122.getClass(), "nano", 479364056);
        setField(term134117, term134117.getClass(), "time", term134122);
        setField(term134067, term134067.getClass(), "lastLoginDate", term134117);
        setBooleanField(term134067, term134067.getClass(), "isWebJoin", true);
        setField(term134067, term134067.getClass(), "webLimitDate", "uuwidsQbSs");
        setIntField(term134067, term134067.getClass(), "level", -1921252803);
        setIntField(term134067, term134067.getClass(), "reincarnationNum", 542685338);
        setField(term134067, term134067.getClass(), "exp", "rXLmNRoJfU");
        setLongField(term134067, term134067.getClass(), "point", 9128485710912688789L);
        setLongField(term134067, term134067.getClass(), "totalPoint", 3638619900345530638L);
        setIntField(term134067, term134067.getClass(), "playCount", 593280113);
        setIntField(term134067, term134067.getClass(), "multiPlayCount", 1265600687);
        setIntField(term134067, term134067.getClass(), "multiWinCount", 156680957);
        setIntField(term134067, term134067.getClass(), "requestResCount", -181324663);
        setIntField(term134067, term134067.getClass(), "acceptResCount", 973270477);
        setIntField(term134067, term134067.getClass(), "successResCount", 50996915);
        setIntField(term134067, term134067.getClass(), "playerRating", -241796987);
        setIntField(term134067, term134067.getClass(), "highestRating", -1252248921);
        setIntField(term134067, term134067.getClass(), "nameplateId", 1214656233);
        setIntField(term134067, term134067.getClass(), "frameId", 376569110);
        setIntField(term134067, term134067.getClass(), "characterId", -366233083);
        setIntField(term134067, term134067.getClass(), "trophyId", -1586250649);
        setIntField(term134067, term134067.getClass(), "playedTutorialBit", 714204805);
        setIntField(term134067, term134067.getClass(), "firstTutorialCancelNum", -1539644001);
        setIntField(term134067, term134067.getClass(), "masterTutorialCancelNum", 1694021329);
        setIntField(term134067, term134067.getClass(), "totalRepertoireCount", -340695215);
        setIntField(term134067, term134067.getClass(), "totalMapNum", -965593105);
        setLongField(term134067, term134067.getClass(), "totalHiScore", 2980761758683429513L);
        setLongField(term134067, term134067.getClass(), "totalBasicHighScore", -719725737683944768L);
        setLongField(term134067, term134067.getClass(), "totalAdvancedHighScore", 1074272882002635033L);
        setLongField(term134067, term134067.getClass(), "totalExpertHighScore", -399567772073942896L);
        setLongField(term134067, term134067.getClass(), "totalMasterHighScore", -5288897655304765945L);
        setIntField(term134179, term134179.getClass(), "year", 2019);
        setShortField(term134179, term134179.getClass(), "month", (short) 3);
        setShortField(term134179, term134179.getClass(), "day", (short) 23);
        setField(term134178, term134178.getClass(), "date", term134179);
        setByteField(term134183, term134183.getClass(), "hour", (byte) 23);
        setByteField(term134183, term134183.getClass(), "minute", (byte) 49);
        setByteField(term134183, term134183.getClass(), "second", (byte) 56);
        setIntField(term134183, term134183.getClass(), "nano", 82527744);
        setField(term134178, term134178.getClass(), "time", term134183);
        setField(term134067, term134067.getClass(), "eventWatchedDate", term134178);
        setIntField(term134067, term134067.getClass(), "friendCount", -1713765557);
        setBooleanField(term134067, term134067.getClass(), "isMaimai", false);
        setField(term134067, term134067.getClass(), "firstGameId", "dWaVZloZWE");
        setField(term134067, term134067.getClass(), "firstRomVersion", "vgZFgEliKc");
        setField(term134067, term134067.getClass(), "firstDataVersion", "cwNMyoCqHJ");
        setIntField(term134227, term134227.getClass(), "year", 2013);
        setShortField(term134227, term134227.getClass(), "month", (short) 11);
        setShortField(term134227, term134227.getClass(), "day", (short) 16);
        setField(term134226, term134226.getClass(), "date", term134227);
        setByteField(term134231, term134231.getClass(), "hour", (byte) 9);
        setByteField(term134231, term134231.getClass(), "minute", (byte) 35);
        setByteField(term134231, term134231.getClass(), "second", (byte) 15);
        setIntField(term134231, term134231.getClass(), "nano", 916926372);
        setField(term134226, term134226.getClass(), "time", term134231);
        setField(term134067, term134067.getClass(), "firstPlayDate", term134226);
        setField(term134067, term134067.getClass(), "lastGameId", "PzUYNYWLsN");
        setField(term134067, term134067.getClass(), "lastRomVersion", "rGvXtIHjBI");
        setField(term134067, term134067.getClass(), "lastDataVersion", "PKJkUkzual");
        setIntField(term134273, term134273.getClass(), "year", 2017);
        setShortField(term134273, term134273.getClass(), "month", (short) 2);
        setShortField(term134273, term134273.getClass(), "day", (short) 22);
        setField(term134272, term134272.getClass(), "date", term134273);
        setByteField(term134277, term134277.getClass(), "hour", (byte) 20);
        setByteField(term134277, term134277.getClass(), "minute", (byte) 59);
        setByteField(term134277, term134277.getClass(), "second", (byte) 8);
        setIntField(term134277, term134277.getClass(), "nano", 864237115);
        setField(term134272, term134272.getClass(), "time", term134277);
        setField(term134067, term134067.getClass(), "lastPlayDate", term134272);
        setIntField(term134067, term134067.getClass(), "lastPlaceId", -100503999);
        setField(term134067, term134067.getClass(), "lastPlaceName", "WYcqisofgT");
        setField(term134067, term134067.getClass(), "lastRegionId", "vVYrwXQCzi");
        setField(term134067, term134067.getClass(), "lastRegionName", "urqqtlYppy");
        setField(term134067, term134067.getClass(), "lastAllNetId", "znNUsUuegd");
        setField(term134067, term134067.getClass(), "lastClientId", "TvOdQLksId");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term134067, args);
    }

};


