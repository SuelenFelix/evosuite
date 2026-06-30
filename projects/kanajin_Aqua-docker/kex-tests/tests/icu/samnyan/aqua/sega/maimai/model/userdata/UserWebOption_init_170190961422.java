package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class UserWebOption_init_170190961422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43245;
     Object term43247;
     Object term43421;
     Object term43423;
     Object term43425;
     Object term43427;
     Object term43429;
     Object term43431;

    public UserWebOption_init_170190961422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43245 = new Long(6465987664600701876L);
        Long term43251 = new Long(-6301101997917060727L);
        term43247 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term43249 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term43265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43270 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43280 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43247, term43247.getClass(), "id", -136372844051852955L);
        setLongField(term43249, term43249.getClass(), "id", -7632759764262745126L);
        setField(term43249, term43249.getClass(), "extId", term43251);
        setField(term43249, term43249.getClass(), "luid", "KyGXZcXJwq");
        setIntField(term43266, term43266.getClass(), "year", 2027);
        setShortField(term43266, term43266.getClass(), "month", (short) 5);
        setShortField(term43266, term43266.getClass(), "day", (short) 22);
        setField(term43265, term43265.getClass(), "date", term43266);
        setByteField(term43270, term43270.getClass(), "hour", (byte) 6);
        setByteField(term43270, term43270.getClass(), "minute", (byte) 8);
        setByteField(term43270, term43270.getClass(), "second", (byte) 27);
        setIntField(term43270, term43270.getClass(), "nano", 955380448);
        setField(term43265, term43265.getClass(), "time", term43270);
        setField(term43249, term43249.getClass(), "registerTime", term43265);
        setIntField(term43276, term43276.getClass(), "year", 2029);
        setShortField(term43276, term43276.getClass(), "month", (short) 1);
        setShortField(term43276, term43276.getClass(), "day", (short) 12);
        setField(term43275, term43275.getClass(), "date", term43276);
        setByteField(term43280, term43280.getClass(), "hour", (byte) 15);
        setByteField(term43280, term43280.getClass(), "minute", (byte) 27);
        setByteField(term43280, term43280.getClass(), "second", (byte) 0);
        setIntField(term43280, term43280.getClass(), "nano", 592641552);
        setField(term43275, term43275.getClass(), "time", term43280);
        setField(term43249, term43249.getClass(), "accessTime", term43275);
        setField(term43247, term43247.getClass(), "card", term43249);
        setIntField(term43247, term43247.getClass(), "lastDataVersion", 1181177739);
        setField(term43247, term43247.getClass(), "userName", "TqiCjeuoWE");
        setIntField(term43247, term43247.getClass(), "point", -1721345168);
        setIntField(term43247, term43247.getClass(), "totalPoint", -776806272);
        setIntField(term43247, term43247.getClass(), "iconId", -495130634);
        setIntField(term43247, term43247.getClass(), "nameplateId", -1517420629);
        setIntField(term43247, term43247.getClass(), "frameId", 910419690);
        setIntField(term43247, term43247.getClass(), "trophyId", 647300506);
        setIntField(term43247, term43247.getClass(), "playCount", -2110644158);
        setIntField(term43247, term43247.getClass(), "playVsCount", -354120577);
        setIntField(term43247, term43247.getClass(), "playSyncCount", 943350345);
        setIntField(term43247, term43247.getClass(), "winCount", -1526651923);
        setIntField(term43247, term43247.getClass(), "helpCount", -1797724758);
        setIntField(term43247, term43247.getClass(), "comboCount", 2137942105);
        setIntField(term43247, term43247.getClass(), "feverCount", 925222207);
        setIntField(term43247, term43247.getClass(), "totalHiScore", 63865718);
        setIntField(term43247, term43247.getClass(), "totalEasyHighScore", 2107786162);
        setIntField(term43247, term43247.getClass(), "totalBasicHighScore", 426605276);
        setIntField(term43247, term43247.getClass(), "totalAdvancedHighScore", 814644265);
        setIntField(term43247, term43247.getClass(), "totalExpertHighScore", -2072841059);
        setIntField(term43247, term43247.getClass(), "totalMasterHighScore", 960614556);
        setIntField(term43247, term43247.getClass(), "totalReMasterHighScore", 1482016188);
        setIntField(term43247, term43247.getClass(), "totalHighSync", 1240153987);
        setIntField(term43247, term43247.getClass(), "totalEasySync", 126731415);
        setIntField(term43247, term43247.getClass(), "totalBasicSync", -119958532);
        setIntField(term43247, term43247.getClass(), "totalAdvancedSync", -1797813817);
        setIntField(term43247, term43247.getClass(), "totalExpertSync", 434400926);
        setIntField(term43247, term43247.getClass(), "totalMasterSync", 2013467659);
        setIntField(term43247, term43247.getClass(), "totalReMasterSync", 1671774860);
        setIntField(term43247, term43247.getClass(), "playerRating", -1376241623);
        setIntField(term43247, term43247.getClass(), "highestRating", -949624433);
        setIntField(term43247, term43247.getClass(), "rankAuthTailId", 757298168);
        setField(term43247, term43247.getClass(), "eventWatchedDate", "GWWfkXOYLP");
        setField(term43247, term43247.getClass(), "webLimitDate", "qvykDllgpT");
        setIntField(term43247, term43247.getClass(), "challengeTrackPhase", 1392304956);
        setIntField(term43247, term43247.getClass(), "firstPlayBits", -51203093);
        setField(term43247, term43247.getClass(), "lastPlayDate", "hzdUbcLZhZ");
        setIntField(term43247, term43247.getClass(), "lastPlaceId", 950494826);
        setField(term43247, term43247.getClass(), "lastPlaceName", "GlxnEJvYeC");
        setIntField(term43247, term43247.getClass(), "lastRegionId", 364244181);
        setField(term43247, term43247.getClass(), "lastRegionName", "SLdOGaqmNv");
        setField(term43247, term43247.getClass(), "lastClientId", "QZfhwDBzyR");
        setField(term43247, term43247.getClass(), "lastCountryCode", "HvnMmAOZev");
        setIntField(term43247, term43247.getClass(), "eventPoint", -181128819);
        setIntField(term43247, term43247.getClass(), "totalLv", 1578870716);
        setIntField(term43247, term43247.getClass(), "lastLoginBonusDay", 170089904);
        setIntField(term43247, term43247.getClass(), "lastSurvivalBonusDay", 1115214841);
        setIntField(term43247, term43247.getClass(), "loginBonusLv", -161656545);
        term43421 = new Boolean(false);
        term43423 = new Integer(1569649652);
        term43425 = new Integer(1224092165);
        term43427 = new Integer(286266173);
        term43429 = new Integer(524985992);
        term43431 = new Integer(1329035477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term43245;
        args[1] = term43247;
        args[2] = term43421;
        args[3] = term43423;
        args[4] = term43425;
        args[5] = term43427;
        args[6] = term43429;
        args[7] = term43431;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


