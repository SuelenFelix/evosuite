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

public class UserData_setTotalHiScore_170374774478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162777;
     Object term163053;

    public UserData_setTotalHiScore_170374774478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162781 = new Long(4742108233936970770L);
        term162777 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term162779 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term162795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162810 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term162982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term162987 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term162777, term162777.getClass(), "id", -3649102514229401546L);
        setLongField(term162779, term162779.getClass(), "id", 3713715739646445715L);
        setField(term162779, term162779.getClass(), "extId", term162781);
        setField(term162779, term162779.getClass(), "luid", "bbKtLbiXSm");
        setIntField(term162796, term162796.getClass(), "year", 2025);
        setShortField(term162796, term162796.getClass(), "month", (short) 9);
        setShortField(term162796, term162796.getClass(), "day", (short) 21);
        setField(term162795, term162795.getClass(), "date", term162796);
        setByteField(term162800, term162800.getClass(), "hour", (byte) 14);
        setByteField(term162800, term162800.getClass(), "minute", (byte) 13);
        setByteField(term162800, term162800.getClass(), "second", (byte) 32);
        setIntField(term162800, term162800.getClass(), "nano", 905448064);
        setField(term162795, term162795.getClass(), "time", term162800);
        setField(term162779, term162779.getClass(), "registerTime", term162795);
        setIntField(term162806, term162806.getClass(), "year", 2016);
        setShortField(term162806, term162806.getClass(), "month", (short) 3);
        setShortField(term162806, term162806.getClass(), "day", (short) 23);
        setField(term162805, term162805.getClass(), "date", term162806);
        setByteField(term162810, term162810.getClass(), "hour", (byte) 13);
        setByteField(term162810, term162810.getClass(), "minute", (byte) 20);
        setByteField(term162810, term162810.getClass(), "second", (byte) 5);
        setIntField(term162810, term162810.getClass(), "nano", 289506427);
        setField(term162805, term162805.getClass(), "time", term162810);
        setField(term162779, term162779.getClass(), "accessTime", term162805);
        setField(term162777, term162777.getClass(), "card", term162779);
        setField(term162777, term162777.getClass(), "userName", "AYcehuoFwZ");
        setIntField(term162828, term162828.getClass(), "year", 2029);
        setShortField(term162828, term162828.getClass(), "month", (short) 2);
        setShortField(term162828, term162828.getClass(), "day", (short) 5);
        setField(term162827, term162827.getClass(), "date", term162828);
        setByteField(term162832, term162832.getClass(), "hour", (byte) 10);
        setByteField(term162832, term162832.getClass(), "minute", (byte) 18);
        setByteField(term162832, term162832.getClass(), "second", (byte) 47);
        setIntField(term162832, term162832.getClass(), "nano", 906113421);
        setField(term162827, term162827.getClass(), "time", term162832);
        setField(term162777, term162777.getClass(), "lastLoginDate", term162827);
        setBooleanField(term162777, term162777.getClass(), "isWebJoin", false);
        setField(term162777, term162777.getClass(), "webLimitDate", "MkKeGpajFk");
        setIntField(term162777, term162777.getClass(), "level", -1618417661);
        setIntField(term162777, term162777.getClass(), "reincarnationNum", 1845352431);
        setField(term162777, term162777.getClass(), "exp", "JhIjEseRRP");
        setLongField(term162777, term162777.getClass(), "point", -8676537686298141977L);
        setLongField(term162777, term162777.getClass(), "totalPoint", 551686776820505988L);
        setIntField(term162777, term162777.getClass(), "playCount", 16970863);
        setIntField(term162777, term162777.getClass(), "multiPlayCount", 702867666);
        setIntField(term162777, term162777.getClass(), "multiWinCount", 347847504);
        setIntField(term162777, term162777.getClass(), "requestResCount", -25604178);
        setIntField(term162777, term162777.getClass(), "acceptResCount", -662117106);
        setIntField(term162777, term162777.getClass(), "successResCount", -1490593932);
        setIntField(term162777, term162777.getClass(), "playerRating", 503810132);
        setIntField(term162777, term162777.getClass(), "highestRating", 1371231836);
        setIntField(term162777, term162777.getClass(), "nameplateId", -316604772);
        setIntField(term162777, term162777.getClass(), "frameId", 1189774759);
        setIntField(term162777, term162777.getClass(), "characterId", 938460209);
        setIntField(term162777, term162777.getClass(), "trophyId", 365759248);
        setIntField(term162777, term162777.getClass(), "playedTutorialBit", -891609036);
        setIntField(term162777, term162777.getClass(), "firstTutorialCancelNum", -938051706);
        setIntField(term162777, term162777.getClass(), "masterTutorialCancelNum", 224101797);
        setIntField(term162777, term162777.getClass(), "totalRepertoireCount", -136266270);
        setIntField(term162777, term162777.getClass(), "totalMapNum", 1619823751);
        setLongField(term162777, term162777.getClass(), "totalHiScore", -8646107147325484092L);
        setLongField(term162777, term162777.getClass(), "totalBasicHighScore", 8466615981775064224L);
        setLongField(term162777, term162777.getClass(), "totalAdvancedHighScore", 2731353493639960564L);
        setLongField(term162777, term162777.getClass(), "totalExpertHighScore", 6896878573943470353L);
        setLongField(term162777, term162777.getClass(), "totalMasterHighScore", 1888273898418481547L);
        setIntField(term162889, term162889.getClass(), "year", 2015);
        setShortField(term162889, term162889.getClass(), "month", (short) 1);
        setShortField(term162889, term162889.getClass(), "day", (short) 4);
        setField(term162888, term162888.getClass(), "date", term162889);
        setByteField(term162893, term162893.getClass(), "hour", (byte) 18);
        setByteField(term162893, term162893.getClass(), "minute", (byte) 36);
        setByteField(term162893, term162893.getClass(), "second", (byte) 25);
        setIntField(term162893, term162893.getClass(), "nano", 723019757);
        setField(term162888, term162888.getClass(), "time", term162893);
        setField(term162777, term162777.getClass(), "eventWatchedDate", term162888);
        setIntField(term162777, term162777.getClass(), "friendCount", -1457875542);
        setBooleanField(term162777, term162777.getClass(), "isMaimai", false);
        setField(term162777, term162777.getClass(), "firstGameId", "qlzeNoUsis");
        setField(term162777, term162777.getClass(), "firstRomVersion", "yzmxcgrHQF");
        setField(term162777, term162777.getClass(), "firstDataVersion", "XCCRJOWaYi");
        setIntField(term162937, term162937.getClass(), "year", 2024);
        setShortField(term162937, term162937.getClass(), "month", (short) 10);
        setShortField(term162937, term162937.getClass(), "day", (short) 3);
        setField(term162936, term162936.getClass(), "date", term162937);
        setByteField(term162941, term162941.getClass(), "hour", (byte) 7);
        setByteField(term162941, term162941.getClass(), "minute", (byte) 36);
        setByteField(term162941, term162941.getClass(), "second", (byte) 5);
        setIntField(term162941, term162941.getClass(), "nano", 242848846);
        setField(term162936, term162936.getClass(), "time", term162941);
        setField(term162777, term162777.getClass(), "firstPlayDate", term162936);
        setField(term162777, term162777.getClass(), "lastGameId", "LGjjIEeXNn");
        setField(term162777, term162777.getClass(), "lastRomVersion", "gxjxaNDCjb");
        setField(term162777, term162777.getClass(), "lastDataVersion", "ZkckWvQlSC");
        setIntField(term162983, term162983.getClass(), "year", 2022);
        setShortField(term162983, term162983.getClass(), "month", (short) 5);
        setShortField(term162983, term162983.getClass(), "day", (short) 5);
        setField(term162982, term162982.getClass(), "date", term162983);
        setByteField(term162987, term162987.getClass(), "hour", (byte) 0);
        setByteField(term162987, term162987.getClass(), "minute", (byte) 24);
        setByteField(term162987, term162987.getClass(), "second", (byte) 51);
        setIntField(term162987, term162987.getClass(), "nano", 749373975);
        setField(term162982, term162982.getClass(), "time", term162987);
        setField(term162777, term162777.getClass(), "lastPlayDate", term162982);
        setIntField(term162777, term162777.getClass(), "lastPlaceId", 2137234063);
        setField(term162777, term162777.getClass(), "lastPlaceName", "RMAILvTevE");
        setField(term162777, term162777.getClass(), "lastRegionId", "xKATihyOsy");
        setField(term162777, term162777.getClass(), "lastRegionName", "uinyvocUGz");
        setField(term162777, term162777.getClass(), "lastAllNetId", "mhGOBiEPDs");
        setField(term162777, term162777.getClass(), "lastClientId", "BtaROXxZYZ");
        term163053 = new Long(8023833370051493222L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term163053;
        callMethod(klass, "setTotalHiScore", argTypes, term162777, args);
    }

};


