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

public class UserGameOptionEx_setExt5_110539536929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323011;
     Object term323309;

    public UserGameOptionEx_setExt5_110539536929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term323017 = new Long(353705949229610067L);
        term323011 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term323013 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term323015 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term323031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323046 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323063 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323064 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323068 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323129 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term323218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term323219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term323223 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term323011, term323011.getClass(), "id", 7483921550995914675L);
        setLongField(term323013, term323013.getClass(), "id", 578586871524293101L);
        setLongField(term323015, term323015.getClass(), "id", 146593563962570001L);
        setField(term323015, term323015.getClass(), "extId", term323017);
        setField(term323015, term323015.getClass(), "luid", "nLcDCcZnti");
        setIntField(term323032, term323032.getClass(), "year", 2017);
        setShortField(term323032, term323032.getClass(), "month", (short) 4);
        setShortField(term323032, term323032.getClass(), "day", (short) 17);
        setField(term323031, term323031.getClass(), "date", term323032);
        setByteField(term323036, term323036.getClass(), "hour", (byte) 19);
        setByteField(term323036, term323036.getClass(), "minute", (byte) 25);
        setByteField(term323036, term323036.getClass(), "second", (byte) 59);
        setIntField(term323036, term323036.getClass(), "nano", 349259554);
        setField(term323031, term323031.getClass(), "time", term323036);
        setField(term323015, term323015.getClass(), "registerTime", term323031);
        setIntField(term323042, term323042.getClass(), "year", 2020);
        setShortField(term323042, term323042.getClass(), "month", (short) 1);
        setShortField(term323042, term323042.getClass(), "day", (short) 10);
        setField(term323041, term323041.getClass(), "date", term323042);
        setByteField(term323046, term323046.getClass(), "hour", (byte) 19);
        setByteField(term323046, term323046.getClass(), "minute", (byte) 37);
        setByteField(term323046, term323046.getClass(), "second", (byte) 13);
        setIntField(term323046, term323046.getClass(), "nano", 956110243);
        setField(term323041, term323041.getClass(), "time", term323046);
        setField(term323015, term323015.getClass(), "accessTime", term323041);
        setField(term323013, term323013.getClass(), "card", term323015);
        setField(term323013, term323013.getClass(), "userName", "cMdtJSLDoI");
        setIntField(term323064, term323064.getClass(), "year", 2029);
        setShortField(term323064, term323064.getClass(), "month", (short) 6);
        setShortField(term323064, term323064.getClass(), "day", (short) 28);
        setField(term323063, term323063.getClass(), "date", term323064);
        setByteField(term323068, term323068.getClass(), "hour", (byte) 21);
        setByteField(term323068, term323068.getClass(), "minute", (byte) 13);
        setByteField(term323068, term323068.getClass(), "second", (byte) 36);
        setIntField(term323068, term323068.getClass(), "nano", 119608206);
        setField(term323063, term323063.getClass(), "time", term323068);
        setField(term323013, term323013.getClass(), "lastLoginDate", term323063);
        setBooleanField(term323013, term323013.getClass(), "isWebJoin", false);
        setField(term323013, term323013.getClass(), "webLimitDate", "OEbkXHDUoo");
        setIntField(term323013, term323013.getClass(), "level", -478425883);
        setIntField(term323013, term323013.getClass(), "reincarnationNum", 497647155);
        setField(term323013, term323013.getClass(), "exp", "UyjyaUEUez");
        setLongField(term323013, term323013.getClass(), "point", -7026476516621146038L);
        setLongField(term323013, term323013.getClass(), "totalPoint", 1672998899023933550L);
        setIntField(term323013, term323013.getClass(), "playCount", 256113501);
        setIntField(term323013, term323013.getClass(), "multiPlayCount", -1303798368);
        setIntField(term323013, term323013.getClass(), "multiWinCount", 1964540866);
        setIntField(term323013, term323013.getClass(), "requestResCount", -849495861);
        setIntField(term323013, term323013.getClass(), "acceptResCount", 1939955202);
        setIntField(term323013, term323013.getClass(), "successResCount", -1844148148);
        setIntField(term323013, term323013.getClass(), "playerRating", -1398507404);
        setIntField(term323013, term323013.getClass(), "highestRating", 1202772241);
        setIntField(term323013, term323013.getClass(), "nameplateId", 343636399);
        setIntField(term323013, term323013.getClass(), "frameId", 245937466);
        setIntField(term323013, term323013.getClass(), "characterId", 1590592660);
        setIntField(term323013, term323013.getClass(), "trophyId", -961432262);
        setIntField(term323013, term323013.getClass(), "playedTutorialBit", 1209212860);
        setIntField(term323013, term323013.getClass(), "firstTutorialCancelNum", -410679486);
        setIntField(term323013, term323013.getClass(), "masterTutorialCancelNum", -1925224017);
        setIntField(term323013, term323013.getClass(), "totalRepertoireCount", -1707884987);
        setIntField(term323013, term323013.getClass(), "totalMapNum", -2125421174);
        setLongField(term323013, term323013.getClass(), "totalHiScore", 1713676158068956691L);
        setLongField(term323013, term323013.getClass(), "totalBasicHighScore", -3353280215933613893L);
        setLongField(term323013, term323013.getClass(), "totalAdvancedHighScore", -8223688673118674950L);
        setLongField(term323013, term323013.getClass(), "totalExpertHighScore", -8163869003949252164L);
        setLongField(term323013, term323013.getClass(), "totalMasterHighScore", -607756206767958766L);
        setIntField(term323125, term323125.getClass(), "year", 2027);
        setShortField(term323125, term323125.getClass(), "month", (short) 5);
        setShortField(term323125, term323125.getClass(), "day", (short) 27);
        setField(term323124, term323124.getClass(), "date", term323125);
        setByteField(term323129, term323129.getClass(), "hour", (byte) 15);
        setByteField(term323129, term323129.getClass(), "minute", (byte) 46);
        setByteField(term323129, term323129.getClass(), "second", (byte) 2);
        setIntField(term323129, term323129.getClass(), "nano", 324971286);
        setField(term323124, term323124.getClass(), "time", term323129);
        setField(term323013, term323013.getClass(), "eventWatchedDate", term323124);
        setIntField(term323013, term323013.getClass(), "friendCount", 1829883671);
        setBooleanField(term323013, term323013.getClass(), "isMaimai", false);
        setField(term323013, term323013.getClass(), "firstGameId", "CXqnqOaCpS");
        setField(term323013, term323013.getClass(), "firstRomVersion", "YdWKzbJowD");
        setField(term323013, term323013.getClass(), "firstDataVersion", "CvmHBQYzyE");
        setIntField(term323173, term323173.getClass(), "year", 2014);
        setShortField(term323173, term323173.getClass(), "month", (short) 6);
        setShortField(term323173, term323173.getClass(), "day", (short) 27);
        setField(term323172, term323172.getClass(), "date", term323173);
        setByteField(term323177, term323177.getClass(), "hour", (byte) 7);
        setByteField(term323177, term323177.getClass(), "minute", (byte) 28);
        setByteField(term323177, term323177.getClass(), "second", (byte) 35);
        setIntField(term323177, term323177.getClass(), "nano", 352455964);
        setField(term323172, term323172.getClass(), "time", term323177);
        setField(term323013, term323013.getClass(), "firstPlayDate", term323172);
        setField(term323013, term323013.getClass(), "lastGameId", "xXJogHyQGl");
        setField(term323013, term323013.getClass(), "lastRomVersion", "AiiSXqnafr");
        setField(term323013, term323013.getClass(), "lastDataVersion", "hKYdhUsiDC");
        setIntField(term323219, term323219.getClass(), "year", 2015);
        setShortField(term323219, term323219.getClass(), "month", (short) 4);
        setShortField(term323219, term323219.getClass(), "day", (short) 4);
        setField(term323218, term323218.getClass(), "date", term323219);
        setByteField(term323223, term323223.getClass(), "hour", (byte) 9);
        setByteField(term323223, term323223.getClass(), "minute", (byte) 14);
        setByteField(term323223, term323223.getClass(), "second", (byte) 2);
        setIntField(term323223, term323223.getClass(), "nano", 337949491);
        setField(term323218, term323218.getClass(), "time", term323223);
        setField(term323013, term323013.getClass(), "lastPlayDate", term323218);
        setIntField(term323013, term323013.getClass(), "lastPlaceId", 1045788676);
        setField(term323013, term323013.getClass(), "lastPlaceName", "whjpwSMlSP");
        setField(term323013, term323013.getClass(), "lastRegionId", "CWWvGZMEId");
        setField(term323013, term323013.getClass(), "lastRegionName", "uhdVsaXySd");
        setField(term323013, term323013.getClass(), "lastAllNetId", "evnloNxsNi");
        setField(term323013, term323013.getClass(), "lastClientId", "kLCuIvMMCV");
        setField(term323011, term323011.getClass(), "user", term323013);
        setIntField(term323011, term323011.getClass(), "ext1", 1329142128);
        setIntField(term323011, term323011.getClass(), "ext2", 2042557161);
        setIntField(term323011, term323011.getClass(), "ext3", -341916705);
        setIntField(term323011, term323011.getClass(), "ext4", 959274379);
        setIntField(term323011, term323011.getClass(), "ext5", -111125266);
        setIntField(term323011, term323011.getClass(), "ext6", 448697018);
        setIntField(term323011, term323011.getClass(), "ext7", 1716089094);
        setIntField(term323011, term323011.getClass(), "ext8", 934961465);
        setIntField(term323011, term323011.getClass(), "ext9", -417012777);
        setIntField(term323011, term323011.getClass(), "ext10", 88517077);
        setIntField(term323011, term323011.getClass(), "ext11", 337947983);
        setIntField(term323011, term323011.getClass(), "ext12", 68193922);
        setIntField(term323011, term323011.getClass(), "ext13", 1396436320);
        setIntField(term323011, term323011.getClass(), "ext14", -1669072852);
        setIntField(term323011, term323011.getClass(), "ext15", 102952747);
        setIntField(term323011, term323011.getClass(), "ext16", -953707233);
        setIntField(term323011, term323011.getClass(), "ext17", 1128790859);
        setIntField(term323011, term323011.getClass(), "ext18", -1442559952);
        setIntField(term323011, term323011.getClass(), "ext19", 2077790798);
        setIntField(term323011, term323011.getClass(), "ext20", 646275345);
        term323309 = new Integer(163521440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term323309;
        callMethod(klass, "setExt5", argTypes, term323011, args);
    }

};


