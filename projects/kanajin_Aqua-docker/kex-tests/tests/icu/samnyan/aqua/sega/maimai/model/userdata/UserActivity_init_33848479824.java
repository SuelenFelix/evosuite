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
import java.lang.Integer;

public class UserActivity_init_33848479824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50263;
     Object term50265;
     Object term50439;
     Object term50441;
     Object term50443;
     Object term50445;
     Object term50447;
     Object term50449;
     Object term50451;

    public UserActivity_init_33848479824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50263 = new Long(-1528017371096319990L);
        Long term50269 = new Long(3427570961451840069L);
        term50265 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term50267 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term50283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50288 = newInstance(Class.forName("java.time.LocalTime"));
        Object term50293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50298 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term50265, term50265.getClass(), "id", -1526328443223793465L);
        setLongField(term50267, term50267.getClass(), "id", -412186147449928821L);
        setField(term50267, term50267.getClass(), "extId", term50269);
        setField(term50267, term50267.getClass(), "luid", "BRMTHqqoRg");
        setIntField(term50284, term50284.getClass(), "year", 2021);
        setShortField(term50284, term50284.getClass(), "month", (short) 7);
        setShortField(term50284, term50284.getClass(), "day", (short) 2);
        setField(term50283, term50283.getClass(), "date", term50284);
        setByteField(term50288, term50288.getClass(), "hour", (byte) 21);
        setByteField(term50288, term50288.getClass(), "minute", (byte) 55);
        setByteField(term50288, term50288.getClass(), "second", (byte) 54);
        setIntField(term50288, term50288.getClass(), "nano", 731983440);
        setField(term50283, term50283.getClass(), "time", term50288);
        setField(term50267, term50267.getClass(), "registerTime", term50283);
        setIntField(term50294, term50294.getClass(), "year", 2022);
        setShortField(term50294, term50294.getClass(), "month", (short) 10);
        setShortField(term50294, term50294.getClass(), "day", (short) 14);
        setField(term50293, term50293.getClass(), "date", term50294);
        setByteField(term50298, term50298.getClass(), "hour", (byte) 7);
        setByteField(term50298, term50298.getClass(), "minute", (byte) 29);
        setByteField(term50298, term50298.getClass(), "second", (byte) 42);
        setIntField(term50298, term50298.getClass(), "nano", 962865996);
        setField(term50293, term50293.getClass(), "time", term50298);
        setField(term50267, term50267.getClass(), "accessTime", term50293);
        setField(term50265, term50265.getClass(), "card", term50267);
        setIntField(term50265, term50265.getClass(), "lastDataVersion", -1454824229);
        setField(term50265, term50265.getClass(), "userName", "nOElYZBeyU");
        setIntField(term50265, term50265.getClass(), "point", -94200317);
        setIntField(term50265, term50265.getClass(), "totalPoint", -1822530946);
        setIntField(term50265, term50265.getClass(), "iconId", 362870886);
        setIntField(term50265, term50265.getClass(), "nameplateId", -728892845);
        setIntField(term50265, term50265.getClass(), "frameId", -344829493);
        setIntField(term50265, term50265.getClass(), "trophyId", -542170709);
        setIntField(term50265, term50265.getClass(), "playCount", 1069599758);
        setIntField(term50265, term50265.getClass(), "playVsCount", 339833097);
        setIntField(term50265, term50265.getClass(), "playSyncCount", -669854850);
        setIntField(term50265, term50265.getClass(), "winCount", -958077351);
        setIntField(term50265, term50265.getClass(), "helpCount", 254501776);
        setIntField(term50265, term50265.getClass(), "comboCount", -655069845);
        setIntField(term50265, term50265.getClass(), "feverCount", -489615582);
        setIntField(term50265, term50265.getClass(), "totalHiScore", 627648167);
        setIntField(term50265, term50265.getClass(), "totalEasyHighScore", -1937818486);
        setIntField(term50265, term50265.getClass(), "totalBasicHighScore", -1847517978);
        setIntField(term50265, term50265.getClass(), "totalAdvancedHighScore", 1452025284);
        setIntField(term50265, term50265.getClass(), "totalExpertHighScore", 694572730);
        setIntField(term50265, term50265.getClass(), "totalMasterHighScore", 809297786);
        setIntField(term50265, term50265.getClass(), "totalReMasterHighScore", 1250819263);
        setIntField(term50265, term50265.getClass(), "totalHighSync", 1618070973);
        setIntField(term50265, term50265.getClass(), "totalEasySync", -127271511);
        setIntField(term50265, term50265.getClass(), "totalBasicSync", -259183708);
        setIntField(term50265, term50265.getClass(), "totalAdvancedSync", 1520040482);
        setIntField(term50265, term50265.getClass(), "totalExpertSync", 959050550);
        setIntField(term50265, term50265.getClass(), "totalMasterSync", -622942789);
        setIntField(term50265, term50265.getClass(), "totalReMasterSync", -638909127);
        setIntField(term50265, term50265.getClass(), "playerRating", -1583218821);
        setIntField(term50265, term50265.getClass(), "highestRating", 66936045);
        setIntField(term50265, term50265.getClass(), "rankAuthTailId", -734520364);
        setField(term50265, term50265.getClass(), "eventWatchedDate", "eUXPtGmoNg");
        setField(term50265, term50265.getClass(), "webLimitDate", "ZjqXyUmAJY");
        setIntField(term50265, term50265.getClass(), "challengeTrackPhase", -1309875787);
        setIntField(term50265, term50265.getClass(), "firstPlayBits", 123831044);
        setField(term50265, term50265.getClass(), "lastPlayDate", "pjEERkBbYo");
        setIntField(term50265, term50265.getClass(), "lastPlaceId", 1698388280);
        setField(term50265, term50265.getClass(), "lastPlaceName", "FQPqmjhWog");
        setIntField(term50265, term50265.getClass(), "lastRegionId", -44060117);
        setField(term50265, term50265.getClass(), "lastRegionName", "sYtJsiIiSX");
        setField(term50265, term50265.getClass(), "lastClientId", "KgfsAwTFFn");
        setField(term50265, term50265.getClass(), "lastCountryCode", "hFnFlgThhp");
        setIntField(term50265, term50265.getClass(), "eventPoint", 1362804360);
        setIntField(term50265, term50265.getClass(), "totalLv", 1614080670);
        setIntField(term50265, term50265.getClass(), "lastLoginBonusDay", -757156022);
        setIntField(term50265, term50265.getClass(), "lastSurvivalBonusDay", -711624128);
        setIntField(term50265, term50265.getClass(), "loginBonusLv", 1920273912);
        term50439 = new Integer(-1321346843);
        term50441 = new Integer(-1682796364);
        term50443 = new Long(-1449569009562240465L);
        term50445 = new Integer(-1747539443);
        term50447 = new Integer(1907000901);
        term50449 = new Integer(-1160333442);
        term50451 = new Integer(104572719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = long.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = term50263;
        args[1] = term50265;
        args[2] = term50439;
        args[3] = term50441;
        args[4] = term50443;
        args[5] = term50445;
        args[6] = term50447;
        args[7] = term50449;
        args[8] = term50451;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


