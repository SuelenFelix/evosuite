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
import java.lang.Integer;

public class UserData_setComboCount_152783244665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17255;
     Object term17429;

    public UserData_setComboCount_152783244665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17259 = new Long(414749984815662075L);
        term17255 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term17257 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term17273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17288 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term17255, term17255.getClass(), "id", 7489064039921396098L);
        setLongField(term17257, term17257.getClass(), "id", 6843866297465638866L);
        setField(term17257, term17257.getClass(), "extId", term17259);
        setField(term17257, term17257.getClass(), "luid", "OyYyYYnJuF");
        setIntField(term17274, term17274.getClass(), "year", 2012);
        setShortField(term17274, term17274.getClass(), "month", (short) 5);
        setShortField(term17274, term17274.getClass(), "day", (short) 25);
        setField(term17273, term17273.getClass(), "date", term17274);
        setByteField(term17278, term17278.getClass(), "hour", (byte) 5);
        setByteField(term17278, term17278.getClass(), "minute", (byte) 8);
        setByteField(term17278, term17278.getClass(), "second", (byte) 47);
        setIntField(term17278, term17278.getClass(), "nano", 455554221);
        setField(term17273, term17273.getClass(), "time", term17278);
        setField(term17257, term17257.getClass(), "registerTime", term17273);
        setIntField(term17284, term17284.getClass(), "year", 2029);
        setShortField(term17284, term17284.getClass(), "month", (short) 11);
        setShortField(term17284, term17284.getClass(), "day", (short) 18);
        setField(term17283, term17283.getClass(), "date", term17284);
        setByteField(term17288, term17288.getClass(), "hour", (byte) 5);
        setByteField(term17288, term17288.getClass(), "minute", (byte) 36);
        setByteField(term17288, term17288.getClass(), "second", (byte) 57);
        setIntField(term17288, term17288.getClass(), "nano", 394167804);
        setField(term17283, term17283.getClass(), "time", term17288);
        setField(term17257, term17257.getClass(), "accessTime", term17283);
        setField(term17255, term17255.getClass(), "card", term17257);
        setIntField(term17255, term17255.getClass(), "lastDataVersion", 1316863342);
        setField(term17255, term17255.getClass(), "userName", "aYLvcxZohT");
        setIntField(term17255, term17255.getClass(), "point", 735033722);
        setIntField(term17255, term17255.getClass(), "totalPoint", -1409886459);
        setIntField(term17255, term17255.getClass(), "iconId", 666379561);
        setIntField(term17255, term17255.getClass(), "nameplateId", 1071163503);
        setIntField(term17255, term17255.getClass(), "frameId", -1507726422);
        setIntField(term17255, term17255.getClass(), "trophyId", 171429081);
        setIntField(term17255, term17255.getClass(), "playCount", 1552107519);
        setIntField(term17255, term17255.getClass(), "playVsCount", -1952294830);
        setIntField(term17255, term17255.getClass(), "playSyncCount", -1756012081);
        setIntField(term17255, term17255.getClass(), "winCount", 879317718);
        setIntField(term17255, term17255.getClass(), "helpCount", -1205568351);
        setIntField(term17255, term17255.getClass(), "comboCount", -1038188576);
        setIntField(term17255, term17255.getClass(), "feverCount", -190354157);
        setIntField(term17255, term17255.getClass(), "totalHiScore", 878906837);
        setIntField(term17255, term17255.getClass(), "totalEasyHighScore", -1578163757);
        setIntField(term17255, term17255.getClass(), "totalBasicHighScore", -1361859122);
        setIntField(term17255, term17255.getClass(), "totalAdvancedHighScore", -1130681822);
        setIntField(term17255, term17255.getClass(), "totalExpertHighScore", 1224219518);
        setIntField(term17255, term17255.getClass(), "totalMasterHighScore", 1466055196);
        setIntField(term17255, term17255.getClass(), "totalReMasterHighScore", -1310910895);
        setIntField(term17255, term17255.getClass(), "totalHighSync", -1504228047);
        setIntField(term17255, term17255.getClass(), "totalEasySync", 1642235898);
        setIntField(term17255, term17255.getClass(), "totalBasicSync", -719765151);
        setIntField(term17255, term17255.getClass(), "totalAdvancedSync", 2039931383);
        setIntField(term17255, term17255.getClass(), "totalExpertSync", -2109330879);
        setIntField(term17255, term17255.getClass(), "totalMasterSync", -1576801556);
        setIntField(term17255, term17255.getClass(), "totalReMasterSync", -1572718384);
        setIntField(term17255, term17255.getClass(), "playerRating", 1623201205);
        setIntField(term17255, term17255.getClass(), "highestRating", 259489188);
        setIntField(term17255, term17255.getClass(), "rankAuthTailId", 1709072289);
        setField(term17255, term17255.getClass(), "eventWatchedDate", "mnHyQbMyld");
        setField(term17255, term17255.getClass(), "webLimitDate", "KHtaDOIcJZ");
        setIntField(term17255, term17255.getClass(), "challengeTrackPhase", 688786687);
        setIntField(term17255, term17255.getClass(), "firstPlayBits", 1934256188);
        setField(term17255, term17255.getClass(), "lastPlayDate", "vgdwrCZczl");
        setIntField(term17255, term17255.getClass(), "lastPlaceId", 1127725248);
        setField(term17255, term17255.getClass(), "lastPlaceName", "gKMNrpKBpu");
        setIntField(term17255, term17255.getClass(), "lastRegionId", 1789414533);
        setField(term17255, term17255.getClass(), "lastRegionName", "ZbHJVEqcoa");
        setField(term17255, term17255.getClass(), "lastClientId", "awDQVEVIKi");
        setField(term17255, term17255.getClass(), "lastCountryCode", "HJwNgUzZZR");
        setIntField(term17255, term17255.getClass(), "eventPoint", -1774273964);
        setIntField(term17255, term17255.getClass(), "totalLv", -1765697393);
        setIntField(term17255, term17255.getClass(), "lastLoginBonusDay", 2101925650);
        setIntField(term17255, term17255.getClass(), "lastSurvivalBonusDay", -242176552);
        setIntField(term17255, term17255.getClass(), "loginBonusLv", 776524710);
        term17429 = new Integer(1069095385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17429;
        callMethod(klass, "setComboCount", argTypes, term17255, args);
    }

};


