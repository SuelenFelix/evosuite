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

public class UserData_setLastLoginDate_177511008153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152029;
     Object term152305;

    public UserData_setLastLoginDate_177511008153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term152033 = new Long(-5935517391653614345L);
        term152029 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term152031 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term152047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152052 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152062 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152084 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152145 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152239 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term152029, term152029.getClass(), "id", -2101617281193711802L);
        setLongField(term152031, term152031.getClass(), "id", 4250276141606262084L);
        setField(term152031, term152031.getClass(), "extId", term152033);
        setField(term152031, term152031.getClass(), "luid", "AiWObYbsEu");
        setIntField(term152048, term152048.getClass(), "year", 2021);
        setShortField(term152048, term152048.getClass(), "month", (short) 7);
        setShortField(term152048, term152048.getClass(), "day", (short) 19);
        setField(term152047, term152047.getClass(), "date", term152048);
        setByteField(term152052, term152052.getClass(), "hour", (byte) 7);
        setByteField(term152052, term152052.getClass(), "minute", (byte) 53);
        setByteField(term152052, term152052.getClass(), "second", (byte) 0);
        setIntField(term152052, term152052.getClass(), "nano", 640245165);
        setField(term152047, term152047.getClass(), "time", term152052);
        setField(term152031, term152031.getClass(), "registerTime", term152047);
        setIntField(term152058, term152058.getClass(), "year", 2020);
        setShortField(term152058, term152058.getClass(), "month", (short) 12);
        setShortField(term152058, term152058.getClass(), "day", (short) 30);
        setField(term152057, term152057.getClass(), "date", term152058);
        setByteField(term152062, term152062.getClass(), "hour", (byte) 2);
        setByteField(term152062, term152062.getClass(), "minute", (byte) 46);
        setByteField(term152062, term152062.getClass(), "second", (byte) 51);
        setIntField(term152062, term152062.getClass(), "nano", 162686179);
        setField(term152057, term152057.getClass(), "time", term152062);
        setField(term152031, term152031.getClass(), "accessTime", term152057);
        setField(term152029, term152029.getClass(), "card", term152031);
        setField(term152029, term152029.getClass(), "userName", "ZgWEffEuOS");
        setIntField(term152080, term152080.getClass(), "year", 2020);
        setShortField(term152080, term152080.getClass(), "month", (short) 4);
        setShortField(term152080, term152080.getClass(), "day", (short) 24);
        setField(term152079, term152079.getClass(), "date", term152080);
        setByteField(term152084, term152084.getClass(), "hour", (byte) 14);
        setByteField(term152084, term152084.getClass(), "minute", (byte) 47);
        setByteField(term152084, term152084.getClass(), "second", (byte) 26);
        setIntField(term152084, term152084.getClass(), "nano", 767366604);
        setField(term152079, term152079.getClass(), "time", term152084);
        setField(term152029, term152029.getClass(), "lastLoginDate", term152079);
        setBooleanField(term152029, term152029.getClass(), "isWebJoin", false);
        setField(term152029, term152029.getClass(), "webLimitDate", "ytfTCVidbO");
        setIntField(term152029, term152029.getClass(), "level", -186142402);
        setIntField(term152029, term152029.getClass(), "reincarnationNum", -87117118);
        setField(term152029, term152029.getClass(), "exp", "ZNBXGdVsZF");
        setLongField(term152029, term152029.getClass(), "point", -4911308479149546611L);
        setLongField(term152029, term152029.getClass(), "totalPoint", -757647052399927680L);
        setIntField(term152029, term152029.getClass(), "playCount", 240936347);
        setIntField(term152029, term152029.getClass(), "multiPlayCount", -1531057884);
        setIntField(term152029, term152029.getClass(), "multiWinCount", -942173626);
        setIntField(term152029, term152029.getClass(), "requestResCount", 209865960);
        setIntField(term152029, term152029.getClass(), "acceptResCount", -1616150864);
        setIntField(term152029, term152029.getClass(), "successResCount", -1945453513);
        setIntField(term152029, term152029.getClass(), "playerRating", -1022307429);
        setIntField(term152029, term152029.getClass(), "highestRating", 1058681211);
        setIntField(term152029, term152029.getClass(), "nameplateId", -1476609706);
        setIntField(term152029, term152029.getClass(), "frameId", -807331064);
        setIntField(term152029, term152029.getClass(), "characterId", 4051182);
        setIntField(term152029, term152029.getClass(), "trophyId", -868532730);
        setIntField(term152029, term152029.getClass(), "playedTutorialBit", -90828570);
        setIntField(term152029, term152029.getClass(), "firstTutorialCancelNum", -340081641);
        setIntField(term152029, term152029.getClass(), "masterTutorialCancelNum", -1412324757);
        setIntField(term152029, term152029.getClass(), "totalRepertoireCount", 140849786);
        setIntField(term152029, term152029.getClass(), "totalMapNum", 34056751);
        setLongField(term152029, term152029.getClass(), "totalHiScore", -431268573686905217L);
        setLongField(term152029, term152029.getClass(), "totalBasicHighScore", -5424368208557469536L);
        setLongField(term152029, term152029.getClass(), "totalAdvancedHighScore", 435548678489866377L);
        setLongField(term152029, term152029.getClass(), "totalExpertHighScore", 8028694960701964650L);
        setLongField(term152029, term152029.getClass(), "totalMasterHighScore", 1494597033123043894L);
        setIntField(term152141, term152141.getClass(), "year", 2028);
        setShortField(term152141, term152141.getClass(), "month", (short) 9);
        setShortField(term152141, term152141.getClass(), "day", (short) 28);
        setField(term152140, term152140.getClass(), "date", term152141);
        setByteField(term152145, term152145.getClass(), "hour", (byte) 2);
        setByteField(term152145, term152145.getClass(), "minute", (byte) 16);
        setByteField(term152145, term152145.getClass(), "second", (byte) 47);
        setIntField(term152145, term152145.getClass(), "nano", 445650079);
        setField(term152140, term152140.getClass(), "time", term152145);
        setField(term152029, term152029.getClass(), "eventWatchedDate", term152140);
        setIntField(term152029, term152029.getClass(), "friendCount", 1802001091);
        setBooleanField(term152029, term152029.getClass(), "isMaimai", true);
        setField(term152029, term152029.getClass(), "firstGameId", "grGHJeQdYI");
        setField(term152029, term152029.getClass(), "firstRomVersion", "jtnUMbjYGn");
        setField(term152029, term152029.getClass(), "firstDataVersion", "SoDnZfByBc");
        setIntField(term152189, term152189.getClass(), "year", 2020);
        setShortField(term152189, term152189.getClass(), "month", (short) 3);
        setShortField(term152189, term152189.getClass(), "day", (short) 14);
        setField(term152188, term152188.getClass(), "date", term152189);
        setByteField(term152193, term152193.getClass(), "hour", (byte) 12);
        setByteField(term152193, term152193.getClass(), "minute", (byte) 11);
        setByteField(term152193, term152193.getClass(), "second", (byte) 31);
        setIntField(term152193, term152193.getClass(), "nano", 113570571);
        setField(term152188, term152188.getClass(), "time", term152193);
        setField(term152029, term152029.getClass(), "firstPlayDate", term152188);
        setField(term152029, term152029.getClass(), "lastGameId", "IzEVeLWAzF");
        setField(term152029, term152029.getClass(), "lastRomVersion", "eLHzvuaXzN");
        setField(term152029, term152029.getClass(), "lastDataVersion", "uRfUkNdrxy");
        setIntField(term152235, term152235.getClass(), "year", 2021);
        setShortField(term152235, term152235.getClass(), "month", (short) 10);
        setShortField(term152235, term152235.getClass(), "day", (short) 8);
        setField(term152234, term152234.getClass(), "date", term152235);
        setByteField(term152239, term152239.getClass(), "hour", (byte) 0);
        setByteField(term152239, term152239.getClass(), "minute", (byte) 19);
        setByteField(term152239, term152239.getClass(), "second", (byte) 6);
        setIntField(term152239, term152239.getClass(), "nano", 453380889);
        setField(term152234, term152234.getClass(), "time", term152239);
        setField(term152029, term152029.getClass(), "lastPlayDate", term152234);
        setIntField(term152029, term152029.getClass(), "lastPlaceId", -1767833537);
        setField(term152029, term152029.getClass(), "lastPlaceName", "zjPpxnBoXA");
        setField(term152029, term152029.getClass(), "lastRegionId", "DmZnQgsFaG");
        setField(term152029, term152029.getClass(), "lastRegionName", "FtsrtvMwwt");
        setField(term152029, term152029.getClass(), "lastAllNetId", "CnzmKRmFKz");
        setField(term152029, term152029.getClass(), "lastClientId", "mwselRsbwp");
        term152305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152310 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term152306, term152306.getClass(), "year", 2015);
        setShortField(term152306, term152306.getClass(), "month", (short) 5);
        setShortField(term152306, term152306.getClass(), "day", (short) 7);
        setField(term152305, term152305.getClass(), "date", term152306);
        setByteField(term152310, term152310.getClass(), "hour", (byte) 4);
        setByteField(term152310, term152310.getClass(), "minute", (byte) 51);
        setByteField(term152310, term152310.getClass(), "second", (byte) 6);
        setIntField(term152310, term152310.getClass(), "nano", 130093546);
        setField(term152305, term152305.getClass(), "time", term152310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term152305;
        callMethod(klass, "setLastLoginDate", argTypes, term152029, args);
    }

};


