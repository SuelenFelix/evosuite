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
import java.lang.Object;
import java.lang.Long;

public class UserData_setLastPlaceName_155250193290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23965;

    public UserData_setLastPlaceName_155250193290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23969 = new Long(5836128569274066678L);
        term23965 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term23967 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term23983 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23984 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23988 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23998 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term23965, term23965.getClass(), "id", 4795660804170399986L);
        setLongField(term23967, term23967.getClass(), "id", -4030863184426321096L);
        setField(term23967, term23967.getClass(), "extId", term23969);
        setField(term23967, term23967.getClass(), "luid", "AbonCTtbef");
        setIntField(term23984, term23984.getClass(), "year", 2022);
        setShortField(term23984, term23984.getClass(), "month", (short) 5);
        setShortField(term23984, term23984.getClass(), "day", (short) 29);
        setField(term23983, term23983.getClass(), "date", term23984);
        setByteField(term23988, term23988.getClass(), "hour", (byte) 11);
        setByteField(term23988, term23988.getClass(), "minute", (byte) 41);
        setByteField(term23988, term23988.getClass(), "second", (byte) 43);
        setIntField(term23988, term23988.getClass(), "nano", 984890757);
        setField(term23983, term23983.getClass(), "time", term23988);
        setField(term23967, term23967.getClass(), "registerTime", term23983);
        setIntField(term23994, term23994.getClass(), "year", 2029);
        setShortField(term23994, term23994.getClass(), "month", (short) 4);
        setShortField(term23994, term23994.getClass(), "day", (short) 27);
        setField(term23993, term23993.getClass(), "date", term23994);
        setByteField(term23998, term23998.getClass(), "hour", (byte) 16);
        setByteField(term23998, term23998.getClass(), "minute", (byte) 25);
        setByteField(term23998, term23998.getClass(), "second", (byte) 10);
        setIntField(term23998, term23998.getClass(), "nano", 699018782);
        setField(term23993, term23993.getClass(), "time", term23998);
        setField(term23967, term23967.getClass(), "accessTime", term23993);
        setField(term23965, term23965.getClass(), "card", term23967);
        setIntField(term23965, term23965.getClass(), "lastDataVersion", -346017809);
        setField(term23965, term23965.getClass(), "userName", "maXrGOGoKA");
        setIntField(term23965, term23965.getClass(), "point", 1922136769);
        setIntField(term23965, term23965.getClass(), "totalPoint", 1253469190);
        setIntField(term23965, term23965.getClass(), "iconId", -92568219);
        setIntField(term23965, term23965.getClass(), "nameplateId", 647226080);
        setIntField(term23965, term23965.getClass(), "frameId", -1031047832);
        setIntField(term23965, term23965.getClass(), "trophyId", -1460628462);
        setIntField(term23965, term23965.getClass(), "playCount", -1466838817);
        setIntField(term23965, term23965.getClass(), "playVsCount", -1308667183);
        setIntField(term23965, term23965.getClass(), "playSyncCount", -1936073165);
        setIntField(term23965, term23965.getClass(), "winCount", 2145615477);
        setIntField(term23965, term23965.getClass(), "helpCount", 1806729907);
        setIntField(term23965, term23965.getClass(), "comboCount", -182792320);
        setIntField(term23965, term23965.getClass(), "feverCount", 409164749);
        setIntField(term23965, term23965.getClass(), "totalHiScore", 896581942);
        setIntField(term23965, term23965.getClass(), "totalEasyHighScore", 108670537);
        setIntField(term23965, term23965.getClass(), "totalBasicHighScore", -94326012);
        setIntField(term23965, term23965.getClass(), "totalAdvancedHighScore", -665192132);
        setIntField(term23965, term23965.getClass(), "totalExpertHighScore", 720355914);
        setIntField(term23965, term23965.getClass(), "totalMasterHighScore", -775874930);
        setIntField(term23965, term23965.getClass(), "totalReMasterHighScore", 1404363846);
        setIntField(term23965, term23965.getClass(), "totalHighSync", -2081298107);
        setIntField(term23965, term23965.getClass(), "totalEasySync", -231030486);
        setIntField(term23965, term23965.getClass(), "totalBasicSync", 908016119);
        setIntField(term23965, term23965.getClass(), "totalAdvancedSync", 110988463);
        setIntField(term23965, term23965.getClass(), "totalExpertSync", 955685902);
        setIntField(term23965, term23965.getClass(), "totalMasterSync", 462054815);
        setIntField(term23965, term23965.getClass(), "totalReMasterSync", 406100677);
        setIntField(term23965, term23965.getClass(), "playerRating", 778368290);
        setIntField(term23965, term23965.getClass(), "highestRating", 963185413);
        setIntField(term23965, term23965.getClass(), "rankAuthTailId", 1937434591);
        setField(term23965, term23965.getClass(), "eventWatchedDate", "zAkgWQVCpM");
        setField(term23965, term23965.getClass(), "webLimitDate", "yQUDyOroXU");
        setIntField(term23965, term23965.getClass(), "challengeTrackPhase", 759908235);
        setIntField(term23965, term23965.getClass(), "firstPlayBits", -1220035028);
        setField(term23965, term23965.getClass(), "lastPlayDate", "xweqkPdyJH");
        setIntField(term23965, term23965.getClass(), "lastPlaceId", 211574528);
        setField(term23965, term23965.getClass(), "lastPlaceName", "kwteHWzwcc");
        setIntField(term23965, term23965.getClass(), "lastRegionId", 984819165);
        setField(term23965, term23965.getClass(), "lastRegionName", "uMsWXqNhln");
        setField(term23965, term23965.getClass(), "lastClientId", "MAnhIPOtHL");
        setField(term23965, term23965.getClass(), "lastCountryCode", "dikKjYjmRO");
        setIntField(term23965, term23965.getClass(), "eventPoint", 1276438509);
        setIntField(term23965, term23965.getClass(), "totalLv", -934156422);
        setIntField(term23965, term23965.getClass(), "lastLoginBonusDay", -1644931931);
        setIntField(term23965, term23965.getClass(), "lastSurvivalBonusDay", -1890108963);
        setIntField(term23965, term23965.getClass(), "loginBonusLv", 1848496553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GJnnMDVnEP";
        callMethod(klass, "setLastPlaceName", argTypes, term23965, args);
    }

};


