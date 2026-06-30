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

public class UserData_getUserName_5434131263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793;

    public UserData_getUserName_5434131263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term797 = new Long(-8400487765614892086L);
        term793 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term795 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term816 = newInstance(Class.forName("java.time.LocalTime"));
        Object term821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term826 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term793, term793.getClass(), "id", 4872422362414183754L);
        setLongField(term795, term795.getClass(), "id", 6811161968424632369L);
        setField(term795, term795.getClass(), "extId", term797);
        setField(term795, term795.getClass(), "luid", "OclPbYPkcH");
        setIntField(term812, term812.getClass(), "year", 2025);
        setShortField(term812, term812.getClass(), "month", (short) 4);
        setShortField(term812, term812.getClass(), "day", (short) 24);
        setField(term811, term811.getClass(), "date", term812);
        setByteField(term816, term816.getClass(), "hour", (byte) 18);
        setByteField(term816, term816.getClass(), "minute", (byte) 11);
        setByteField(term816, term816.getClass(), "second", (byte) 40);
        setIntField(term816, term816.getClass(), "nano", 137454929);
        setField(term811, term811.getClass(), "time", term816);
        setField(term795, term795.getClass(), "registerTime", term811);
        setIntField(term822, term822.getClass(), "year", 2024);
        setShortField(term822, term822.getClass(), "month", (short) 1);
        setShortField(term822, term822.getClass(), "day", (short) 24);
        setField(term821, term821.getClass(), "date", term822);
        setByteField(term826, term826.getClass(), "hour", (byte) 20);
        setByteField(term826, term826.getClass(), "minute", (byte) 28);
        setByteField(term826, term826.getClass(), "second", (byte) 39);
        setIntField(term826, term826.getClass(), "nano", 952728177);
        setField(term821, term821.getClass(), "time", term826);
        setField(term795, term795.getClass(), "accessTime", term821);
        setField(term793, term793.getClass(), "card", term795);
        setIntField(term793, term793.getClass(), "lastDataVersion", 1386130016);
        setField(term793, term793.getClass(), "userName", "IoAlmYsBwc");
        setIntField(term793, term793.getClass(), "point", 1072005683);
        setIntField(term793, term793.getClass(), "totalPoint", 1861318859);
        setIntField(term793, term793.getClass(), "iconId", 1474524152);
        setIntField(term793, term793.getClass(), "nameplateId", 568954359);
        setIntField(term793, term793.getClass(), "frameId", 53410913);
        setIntField(term793, term793.getClass(), "trophyId", -375014958);
        setIntField(term793, term793.getClass(), "playCount", 1107176718);
        setIntField(term793, term793.getClass(), "playVsCount", 480137250);
        setIntField(term793, term793.getClass(), "playSyncCount", -341152642);
        setIntField(term793, term793.getClass(), "winCount", -2015854073);
        setIntField(term793, term793.getClass(), "helpCount", 538259104);
        setIntField(term793, term793.getClass(), "comboCount", 96566506);
        setIntField(term793, term793.getClass(), "feverCount", -343325701);
        setIntField(term793, term793.getClass(), "totalHiScore", 107945604);
        setIntField(term793, term793.getClass(), "totalEasyHighScore", -1963464809);
        setIntField(term793, term793.getClass(), "totalBasicHighScore", 71190297);
        setIntField(term793, term793.getClass(), "totalAdvancedHighScore", 1202361360);
        setIntField(term793, term793.getClass(), "totalExpertHighScore", -2015048153);
        setIntField(term793, term793.getClass(), "totalMasterHighScore", -2063457669);
        setIntField(term793, term793.getClass(), "totalReMasterHighScore", -1222006000);
        setIntField(term793, term793.getClass(), "totalHighSync", 2095798786);
        setIntField(term793, term793.getClass(), "totalEasySync", -1565502840);
        setIntField(term793, term793.getClass(), "totalBasicSync", 344323424);
        setIntField(term793, term793.getClass(), "totalAdvancedSync", 9726679);
        setIntField(term793, term793.getClass(), "totalExpertSync", -25637976);
        setIntField(term793, term793.getClass(), "totalMasterSync", 1555897383);
        setIntField(term793, term793.getClass(), "totalReMasterSync", 202001407);
        setIntField(term793, term793.getClass(), "playerRating", 158873461);
        setIntField(term793, term793.getClass(), "highestRating", -430151637);
        setIntField(term793, term793.getClass(), "rankAuthTailId", -1697741339);
        setField(term793, term793.getClass(), "eventWatchedDate", "TEParAifyi");
        setField(term793, term793.getClass(), "webLimitDate", "OWDIEULEFu");
        setIntField(term793, term793.getClass(), "challengeTrackPhase", 98922530);
        setIntField(term793, term793.getClass(), "firstPlayBits", -1388471422);
        setField(term793, term793.getClass(), "lastPlayDate", "dWRymuLBtr");
        setIntField(term793, term793.getClass(), "lastPlaceId", -1498296052);
        setField(term793, term793.getClass(), "lastPlaceName", "AijpHYOFuy");
        setIntField(term793, term793.getClass(), "lastRegionId", 2098647989);
        setField(term793, term793.getClass(), "lastRegionName", "SbAoxhfrkn");
        setField(term793, term793.getClass(), "lastClientId", "kuTXqwMtDB");
        setField(term793, term793.getClass(), "lastCountryCode", "Ghbwtircqb");
        setIntField(term793, term793.getClass(), "eventPoint", 1598895173);
        setIntField(term793, term793.getClass(), "totalLv", 1830648570);
        setIntField(term793, term793.getClass(), "lastLoginBonusDay", -227365013);
        setIntField(term793, term793.getClass(), "lastSurvivalBonusDay", 11724947);
        setIntField(term793, term793.getClass(), "loginBonusLv", 1953277050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term793, args);
    }

};


