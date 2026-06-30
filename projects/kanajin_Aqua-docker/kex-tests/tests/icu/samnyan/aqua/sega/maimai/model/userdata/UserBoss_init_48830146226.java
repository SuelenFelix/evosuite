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

public class UserBoss_init_48830146226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96081;
     Object term96083;
     Object term96257;
     Object term96259;
     Object term96261;
     Object term96263;
     Object term96265;
     Object term96267;
     Object term96269;
     Object term96271;

    public UserBoss_init_48830146226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96081 = new Long(-4912367223635767530L);
        Long term96087 = new Long(-6521561238735301071L);
        term96083 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term96085 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96116 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96083, term96083.getClass(), "id", 5307759455220911721L);
        setLongField(term96085, term96085.getClass(), "id", 8447690702287486582L);
        setField(term96085, term96085.getClass(), "extId", term96087);
        setField(term96085, term96085.getClass(), "luid", "rzkENrHYBI");
        setIntField(term96102, term96102.getClass(), "year", 2025);
        setShortField(term96102, term96102.getClass(), "month", (short) 12);
        setShortField(term96102, term96102.getClass(), "day", (short) 27);
        setField(term96101, term96101.getClass(), "date", term96102);
        setByteField(term96106, term96106.getClass(), "hour", (byte) 18);
        setByteField(term96106, term96106.getClass(), "minute", (byte) 0);
        setByteField(term96106, term96106.getClass(), "second", (byte) 16);
        setIntField(term96106, term96106.getClass(), "nano", 96884626);
        setField(term96101, term96101.getClass(), "time", term96106);
        setField(term96085, term96085.getClass(), "registerTime", term96101);
        setIntField(term96112, term96112.getClass(), "year", 2021);
        setShortField(term96112, term96112.getClass(), "month", (short) 6);
        setShortField(term96112, term96112.getClass(), "day", (short) 18);
        setField(term96111, term96111.getClass(), "date", term96112);
        setByteField(term96116, term96116.getClass(), "hour", (byte) 15);
        setByteField(term96116, term96116.getClass(), "minute", (byte) 12);
        setByteField(term96116, term96116.getClass(), "second", (byte) 15);
        setIntField(term96116, term96116.getClass(), "nano", 440716397);
        setField(term96111, term96111.getClass(), "time", term96116);
        setField(term96085, term96085.getClass(), "accessTime", term96111);
        setField(term96083, term96083.getClass(), "card", term96085);
        setIntField(term96083, term96083.getClass(), "lastDataVersion", 545101691);
        setField(term96083, term96083.getClass(), "userName", "ylJjmNVzzt");
        setIntField(term96083, term96083.getClass(), "point", 1161229876);
        setIntField(term96083, term96083.getClass(), "totalPoint", -960232938);
        setIntField(term96083, term96083.getClass(), "iconId", 164986407);
        setIntField(term96083, term96083.getClass(), "nameplateId", 1508923050);
        setIntField(term96083, term96083.getClass(), "frameId", 1732773238);
        setIntField(term96083, term96083.getClass(), "trophyId", -312812260);
        setIntField(term96083, term96083.getClass(), "playCount", -1403354454);
        setIntField(term96083, term96083.getClass(), "playVsCount", 225390294);
        setIntField(term96083, term96083.getClass(), "playSyncCount", 627436431);
        setIntField(term96083, term96083.getClass(), "winCount", -226488133);
        setIntField(term96083, term96083.getClass(), "helpCount", 2016800886);
        setIntField(term96083, term96083.getClass(), "comboCount", 1306220321);
        setIntField(term96083, term96083.getClass(), "feverCount", -925927013);
        setIntField(term96083, term96083.getClass(), "totalHiScore", 560338899);
        setIntField(term96083, term96083.getClass(), "totalEasyHighScore", 173805075);
        setIntField(term96083, term96083.getClass(), "totalBasicHighScore", -1525849749);
        setIntField(term96083, term96083.getClass(), "totalAdvancedHighScore", -1011327507);
        setIntField(term96083, term96083.getClass(), "totalExpertHighScore", -378080115);
        setIntField(term96083, term96083.getClass(), "totalMasterHighScore", 1202464107);
        setIntField(term96083, term96083.getClass(), "totalReMasterHighScore", -1327144256);
        setIntField(term96083, term96083.getClass(), "totalHighSync", -126708360);
        setIntField(term96083, term96083.getClass(), "totalEasySync", -1492561928);
        setIntField(term96083, term96083.getClass(), "totalBasicSync", 14544336);
        setIntField(term96083, term96083.getClass(), "totalAdvancedSync", 1884335890);
        setIntField(term96083, term96083.getClass(), "totalExpertSync", -848097424);
        setIntField(term96083, term96083.getClass(), "totalMasterSync", 1737457363);
        setIntField(term96083, term96083.getClass(), "totalReMasterSync", 72159811);
        setIntField(term96083, term96083.getClass(), "playerRating", 1883446311);
        setIntField(term96083, term96083.getClass(), "highestRating", -1769314512);
        setIntField(term96083, term96083.getClass(), "rankAuthTailId", -1007583316);
        setField(term96083, term96083.getClass(), "eventWatchedDate", "nwKTRDmHWk");
        setField(term96083, term96083.getClass(), "webLimitDate", "UueEixdrss");
        setIntField(term96083, term96083.getClass(), "challengeTrackPhase", -2097129486);
        setIntField(term96083, term96083.getClass(), "firstPlayBits", 906821588);
        setField(term96083, term96083.getClass(), "lastPlayDate", "ceafBXJyBB");
        setIntField(term96083, term96083.getClass(), "lastPlaceId", -1915430818);
        setField(term96083, term96083.getClass(), "lastPlaceName", "VNHIbCXqhH");
        setIntField(term96083, term96083.getClass(), "lastRegionId", -1119861207);
        setField(term96083, term96083.getClass(), "lastRegionName", "csnhUIxUaP");
        setField(term96083, term96083.getClass(), "lastClientId", "fmWYICGnwt");
        setField(term96083, term96083.getClass(), "lastCountryCode", "FlZbOFNISk");
        setIntField(term96083, term96083.getClass(), "eventPoint", 1746807042);
        setIntField(term96083, term96083.getClass(), "totalLv", 357981547);
        setIntField(term96083, term96083.getClass(), "lastLoginBonusDay", 426955084);
        setIntField(term96083, term96083.getClass(), "lastSurvivalBonusDay", -335419483);
        setIntField(term96083, term96083.getClass(), "loginBonusLv", 1557694351);
        term96257 = new Long(6553325891603936420L);
        term96259 = new Long(-2813353909483819403L);
        term96261 = new Long(-1960938531726773973L);
        term96263 = new Long(-4845114630136242760L);
        term96265 = new Long(-1224346442914356241L);
        term96267 = new Long(-1337024735423070709L);
        term96269 = new Long(5406702435763021326L);
        term96271 = new Long(2674610463314008194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = long.class;
        argTypes[3] = long.class;
        argTypes[4] = long.class;
        argTypes[5] = long.class;
        argTypes[6] = long.class;
        argTypes[7] = long.class;
        argTypes[8] = long.class;
        argTypes[9] = long.class;
        Object[] args = new Object[10];
        args[0] = term96081;
        args[1] = term96083;
        args[2] = term96257;
        args[3] = term96259;
        args[4] = term96261;
        args[5] = term96263;
        args[6] = term96265;
        args[7] = term96267;
        args[8] = term96269;
        args[9] = term96271;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


