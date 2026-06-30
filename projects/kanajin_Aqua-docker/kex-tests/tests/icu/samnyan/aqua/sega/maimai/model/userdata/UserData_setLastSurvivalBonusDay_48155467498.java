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

public class UserData_setLastSurvivalBonusDay_48155467498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26173;
     Object term26347;

    public UserData_setLastSurvivalBonusDay_48155467498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26177 = new Long(4949335493504695457L);
        term26173 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term26175 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term26191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26196 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26206 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term26173, term26173.getClass(), "id", 4199886998224701110L);
        setLongField(term26175, term26175.getClass(), "id", 8540994973773607992L);
        setField(term26175, term26175.getClass(), "extId", term26177);
        setField(term26175, term26175.getClass(), "luid", "yOQuJXRvOo");
        setIntField(term26192, term26192.getClass(), "year", 2029);
        setShortField(term26192, term26192.getClass(), "month", (short) 7);
        setShortField(term26192, term26192.getClass(), "day", (short) 19);
        setField(term26191, term26191.getClass(), "date", term26192);
        setByteField(term26196, term26196.getClass(), "hour", (byte) 4);
        setByteField(term26196, term26196.getClass(), "minute", (byte) 38);
        setByteField(term26196, term26196.getClass(), "second", (byte) 15);
        setIntField(term26196, term26196.getClass(), "nano", 260833456);
        setField(term26191, term26191.getClass(), "time", term26196);
        setField(term26175, term26175.getClass(), "registerTime", term26191);
        setIntField(term26202, term26202.getClass(), "year", 2019);
        setShortField(term26202, term26202.getClass(), "month", (short) 12);
        setShortField(term26202, term26202.getClass(), "day", (short) 13);
        setField(term26201, term26201.getClass(), "date", term26202);
        setByteField(term26206, term26206.getClass(), "hour", (byte) 17);
        setByteField(term26206, term26206.getClass(), "minute", (byte) 38);
        setByteField(term26206, term26206.getClass(), "second", (byte) 43);
        setIntField(term26206, term26206.getClass(), "nano", 435007801);
        setField(term26201, term26201.getClass(), "time", term26206);
        setField(term26175, term26175.getClass(), "accessTime", term26201);
        setField(term26173, term26173.getClass(), "card", term26175);
        setIntField(term26173, term26173.getClass(), "lastDataVersion", -829801689);
        setField(term26173, term26173.getClass(), "userName", "XmLHcnVsch");
        setIntField(term26173, term26173.getClass(), "point", 265481386);
        setIntField(term26173, term26173.getClass(), "totalPoint", -893720551);
        setIntField(term26173, term26173.getClass(), "iconId", 696829611);
        setIntField(term26173, term26173.getClass(), "nameplateId", 1751983051);
        setIntField(term26173, term26173.getClass(), "frameId", -1416766445);
        setIntField(term26173, term26173.getClass(), "trophyId", -203238563);
        setIntField(term26173, term26173.getClass(), "playCount", -132358473);
        setIntField(term26173, term26173.getClass(), "playVsCount", 130567867);
        setIntField(term26173, term26173.getClass(), "playSyncCount", 33782620);
        setIntField(term26173, term26173.getClass(), "winCount", -818766632);
        setIntField(term26173, term26173.getClass(), "helpCount", 45627161);
        setIntField(term26173, term26173.getClass(), "comboCount", -206817101);
        setIntField(term26173, term26173.getClass(), "feverCount", 1541533024);
        setIntField(term26173, term26173.getClass(), "totalHiScore", -1032828989);
        setIntField(term26173, term26173.getClass(), "totalEasyHighScore", -649944911);
        setIntField(term26173, term26173.getClass(), "totalBasicHighScore", -1426067073);
        setIntField(term26173, term26173.getClass(), "totalAdvancedHighScore", -1679645192);
        setIntField(term26173, term26173.getClass(), "totalExpertHighScore", 1524285721);
        setIntField(term26173, term26173.getClass(), "totalMasterHighScore", -808971480);
        setIntField(term26173, term26173.getClass(), "totalReMasterHighScore", 534508972);
        setIntField(term26173, term26173.getClass(), "totalHighSync", -301935716);
        setIntField(term26173, term26173.getClass(), "totalEasySync", 1701720681);
        setIntField(term26173, term26173.getClass(), "totalBasicSync", -378738380);
        setIntField(term26173, term26173.getClass(), "totalAdvancedSync", 1984720770);
        setIntField(term26173, term26173.getClass(), "totalExpertSync", -8765616);
        setIntField(term26173, term26173.getClass(), "totalMasterSync", -1365627412);
        setIntField(term26173, term26173.getClass(), "totalReMasterSync", 520625434);
        setIntField(term26173, term26173.getClass(), "playerRating", 1531056945);
        setIntField(term26173, term26173.getClass(), "highestRating", -2128361795);
        setIntField(term26173, term26173.getClass(), "rankAuthTailId", 925239258);
        setField(term26173, term26173.getClass(), "eventWatchedDate", "Yrvtdcltri");
        setField(term26173, term26173.getClass(), "webLimitDate", "RxrsjXRVcT");
        setIntField(term26173, term26173.getClass(), "challengeTrackPhase", 1041156468);
        setIntField(term26173, term26173.getClass(), "firstPlayBits", 825756233);
        setField(term26173, term26173.getClass(), "lastPlayDate", "cfRimmJxqA");
        setIntField(term26173, term26173.getClass(), "lastPlaceId", -494349155);
        setField(term26173, term26173.getClass(), "lastPlaceName", "oOnRVGqFmy");
        setIntField(term26173, term26173.getClass(), "lastRegionId", -621743880);
        setField(term26173, term26173.getClass(), "lastRegionName", "LaXzFIlWMk");
        setField(term26173, term26173.getClass(), "lastClientId", "GuVQjhBxma");
        setField(term26173, term26173.getClass(), "lastCountryCode", "WAVMPPbIfL");
        setIntField(term26173, term26173.getClass(), "eventPoint", 1487958580);
        setIntField(term26173, term26173.getClass(), "totalLv", -41377169);
        setIntField(term26173, term26173.getClass(), "lastLoginBonusDay", -1713407140);
        setIntField(term26173, term26173.getClass(), "lastSurvivalBonusDay", 184591989);
        setIntField(term26173, term26173.getClass(), "loginBonusLv", 528505320);
        term26347 = new Integer(1255256909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26347;
        callMethod(klass, "setLastSurvivalBonusDay", argTypes, term26173, args);
    }

};


