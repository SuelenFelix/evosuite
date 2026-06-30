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

public class UserData_getLevel_12027599136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131937;

    public UserData_getLevel_12027599136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term131941 = new Long(8708846223293804408L);
        term131937 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term131939 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term131955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131970 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132096 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132097 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132147 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term131937, term131937.getClass(), "id", -2126569881795166293L);
        setLongField(term131939, term131939.getClass(), "id", 3910222794831758746L);
        setField(term131939, term131939.getClass(), "extId", term131941);
        setField(term131939, term131939.getClass(), "luid", "MCSpZrEsbC");
        setIntField(term131956, term131956.getClass(), "year", 2015);
        setShortField(term131956, term131956.getClass(), "month", (short) 2);
        setShortField(term131956, term131956.getClass(), "day", (short) 24);
        setField(term131955, term131955.getClass(), "date", term131956);
        setByteField(term131960, term131960.getClass(), "hour", (byte) 6);
        setByteField(term131960, term131960.getClass(), "minute", (byte) 20);
        setByteField(term131960, term131960.getClass(), "second", (byte) 15);
        setIntField(term131960, term131960.getClass(), "nano", 869307930);
        setField(term131955, term131955.getClass(), "time", term131960);
        setField(term131939, term131939.getClass(), "registerTime", term131955);
        setIntField(term131966, term131966.getClass(), "year", 2010);
        setShortField(term131966, term131966.getClass(), "month", (short) 7);
        setShortField(term131966, term131966.getClass(), "day", (short) 29);
        setField(term131965, term131965.getClass(), "date", term131966);
        setByteField(term131970, term131970.getClass(), "hour", (byte) 19);
        setByteField(term131970, term131970.getClass(), "minute", (byte) 55);
        setByteField(term131970, term131970.getClass(), "second", (byte) 25);
        setIntField(term131970, term131970.getClass(), "nano", 276104398);
        setField(term131965, term131965.getClass(), "time", term131970);
        setField(term131939, term131939.getClass(), "accessTime", term131965);
        setField(term131937, term131937.getClass(), "card", term131939);
        setField(term131937, term131937.getClass(), "userName", "HisKZVFThP");
        setIntField(term131988, term131988.getClass(), "year", 2011);
        setShortField(term131988, term131988.getClass(), "month", (short) 10);
        setShortField(term131988, term131988.getClass(), "day", (short) 27);
        setField(term131987, term131987.getClass(), "date", term131988);
        setByteField(term131992, term131992.getClass(), "hour", (byte) 1);
        setByteField(term131992, term131992.getClass(), "minute", (byte) 11);
        setByteField(term131992, term131992.getClass(), "second", (byte) 44);
        setIntField(term131992, term131992.getClass(), "nano", 881306622);
        setField(term131987, term131987.getClass(), "time", term131992);
        setField(term131937, term131937.getClass(), "lastLoginDate", term131987);
        setBooleanField(term131937, term131937.getClass(), "isWebJoin", false);
        setField(term131937, term131937.getClass(), "webLimitDate", "aYnflhXuDg");
        setIntField(term131937, term131937.getClass(), "level", 432916102);
        setIntField(term131937, term131937.getClass(), "reincarnationNum", -1059151250);
        setField(term131937, term131937.getClass(), "exp", "CfykLOhTuP");
        setLongField(term131937, term131937.getClass(), "point", -9065147632457577345L);
        setLongField(term131937, term131937.getClass(), "totalPoint", 4051658878918665197L);
        setIntField(term131937, term131937.getClass(), "playCount", 150030523);
        setIntField(term131937, term131937.getClass(), "multiPlayCount", -1729514045);
        setIntField(term131937, term131937.getClass(), "multiWinCount", 72012599);
        setIntField(term131937, term131937.getClass(), "requestResCount", 1119073188);
        setIntField(term131937, term131937.getClass(), "acceptResCount", -1116601587);
        setIntField(term131937, term131937.getClass(), "successResCount", -1646521952);
        setIntField(term131937, term131937.getClass(), "playerRating", 532690926);
        setIntField(term131937, term131937.getClass(), "highestRating", 1569782717);
        setIntField(term131937, term131937.getClass(), "nameplateId", -479375394);
        setIntField(term131937, term131937.getClass(), "frameId", 2068819583);
        setIntField(term131937, term131937.getClass(), "characterId", 1499046631);
        setIntField(term131937, term131937.getClass(), "trophyId", -846622452);
        setIntField(term131937, term131937.getClass(), "playedTutorialBit", -1069059356);
        setIntField(term131937, term131937.getClass(), "firstTutorialCancelNum", -2030213410);
        setIntField(term131937, term131937.getClass(), "masterTutorialCancelNum", -63736169);
        setIntField(term131937, term131937.getClass(), "totalRepertoireCount", 1480163997);
        setIntField(term131937, term131937.getClass(), "totalMapNum", -949949277);
        setLongField(term131937, term131937.getClass(), "totalHiScore", -7721169040681572263L);
        setLongField(term131937, term131937.getClass(), "totalBasicHighScore", 3973799120661807990L);
        setLongField(term131937, term131937.getClass(), "totalAdvancedHighScore", 9052872633177963228L);
        setLongField(term131937, term131937.getClass(), "totalExpertHighScore", 3498870473976116381L);
        setLongField(term131937, term131937.getClass(), "totalMasterHighScore", 4125808103563576764L);
        setIntField(term132049, term132049.getClass(), "year", 2027);
        setShortField(term132049, term132049.getClass(), "month", (short) 12);
        setShortField(term132049, term132049.getClass(), "day", (short) 27);
        setField(term132048, term132048.getClass(), "date", term132049);
        setByteField(term132053, term132053.getClass(), "hour", (byte) 0);
        setByteField(term132053, term132053.getClass(), "minute", (byte) 54);
        setByteField(term132053, term132053.getClass(), "second", (byte) 48);
        setIntField(term132053, term132053.getClass(), "nano", 695137077);
        setField(term132048, term132048.getClass(), "time", term132053);
        setField(term131937, term131937.getClass(), "eventWatchedDate", term132048);
        setIntField(term131937, term131937.getClass(), "friendCount", -1805950945);
        setBooleanField(term131937, term131937.getClass(), "isMaimai", false);
        setField(term131937, term131937.getClass(), "firstGameId", "pGIHyjmseT");
        setField(term131937, term131937.getClass(), "firstRomVersion", "DFKfoJgHLx");
        setField(term131937, term131937.getClass(), "firstDataVersion", "kbySPSiGhF");
        setIntField(term132097, term132097.getClass(), "year", 2028);
        setShortField(term132097, term132097.getClass(), "month", (short) 5);
        setShortField(term132097, term132097.getClass(), "day", (short) 24);
        setField(term132096, term132096.getClass(), "date", term132097);
        setByteField(term132101, term132101.getClass(), "hour", (byte) 20);
        setByteField(term132101, term132101.getClass(), "minute", (byte) 5);
        setByteField(term132101, term132101.getClass(), "second", (byte) 44);
        setIntField(term132101, term132101.getClass(), "nano", 283024850);
        setField(term132096, term132096.getClass(), "time", term132101);
        setField(term131937, term131937.getClass(), "firstPlayDate", term132096);
        setField(term131937, term131937.getClass(), "lastGameId", "sKCjjNeVoI");
        setField(term131937, term131937.getClass(), "lastRomVersion", "HuoMsoUWrV");
        setField(term131937, term131937.getClass(), "lastDataVersion", "jCLmdVxyvG");
        setIntField(term132143, term132143.getClass(), "year", 2029);
        setShortField(term132143, term132143.getClass(), "month", (short) 3);
        setShortField(term132143, term132143.getClass(), "day", (short) 15);
        setField(term132142, term132142.getClass(), "date", term132143);
        setByteField(term132147, term132147.getClass(), "hour", (byte) 10);
        setByteField(term132147, term132147.getClass(), "minute", (byte) 22);
        setByteField(term132147, term132147.getClass(), "second", (byte) 21);
        setIntField(term132147, term132147.getClass(), "nano", 258160604);
        setField(term132142, term132142.getClass(), "time", term132147);
        setField(term131937, term131937.getClass(), "lastPlayDate", term132142);
        setIntField(term131937, term131937.getClass(), "lastPlaceId", 674695717);
        setField(term131937, term131937.getClass(), "lastPlaceName", "FYniCuCHuO");
        setField(term131937, term131937.getClass(), "lastRegionId", "VJXbdWMtjC");
        setField(term131937, term131937.getClass(), "lastRegionName", "AugzpVbSsO");
        setField(term131937, term131937.getClass(), "lastAllNetId", "tBGQmugLvu");
        setField(term131937, term131937.getClass(), "lastClientId", "oxWULKaNGt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term131937, args);
    }

};


