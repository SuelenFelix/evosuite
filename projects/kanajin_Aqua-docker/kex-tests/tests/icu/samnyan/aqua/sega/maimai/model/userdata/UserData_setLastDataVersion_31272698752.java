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

public class UserData_setLastDataVersion_31272698752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13777;
     Object term13951;

    public UserData_setLastDataVersion_31272698752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13781 = new Long(-2850532706972744550L);
        term13777 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term13779 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term13795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13810 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term13777, term13777.getClass(), "id", 2354625302846375590L);
        setLongField(term13779, term13779.getClass(), "id", 7276637106827860087L);
        setField(term13779, term13779.getClass(), "extId", term13781);
        setField(term13779, term13779.getClass(), "luid", "QNjNTLlUaV");
        setIntField(term13796, term13796.getClass(), "year", 2021);
        setShortField(term13796, term13796.getClass(), "month", (short) 8);
        setShortField(term13796, term13796.getClass(), "day", (short) 27);
        setField(term13795, term13795.getClass(), "date", term13796);
        setByteField(term13800, term13800.getClass(), "hour", (byte) 20);
        setByteField(term13800, term13800.getClass(), "minute", (byte) 11);
        setByteField(term13800, term13800.getClass(), "second", (byte) 47);
        setIntField(term13800, term13800.getClass(), "nano", 116303493);
        setField(term13795, term13795.getClass(), "time", term13800);
        setField(term13779, term13779.getClass(), "registerTime", term13795);
        setIntField(term13806, term13806.getClass(), "year", 2012);
        setShortField(term13806, term13806.getClass(), "month", (short) 5);
        setShortField(term13806, term13806.getClass(), "day", (short) 17);
        setField(term13805, term13805.getClass(), "date", term13806);
        setByteField(term13810, term13810.getClass(), "hour", (byte) 19);
        setByteField(term13810, term13810.getClass(), "minute", (byte) 36);
        setByteField(term13810, term13810.getClass(), "second", (byte) 33);
        setIntField(term13810, term13810.getClass(), "nano", 46625011);
        setField(term13805, term13805.getClass(), "time", term13810);
        setField(term13779, term13779.getClass(), "accessTime", term13805);
        setField(term13777, term13777.getClass(), "card", term13779);
        setIntField(term13777, term13777.getClass(), "lastDataVersion", 1235809050);
        setField(term13777, term13777.getClass(), "userName", "hIYsRyOZxk");
        setIntField(term13777, term13777.getClass(), "point", 1370082921);
        setIntField(term13777, term13777.getClass(), "totalPoint", 1966881264);
        setIntField(term13777, term13777.getClass(), "iconId", -1707655562);
        setIntField(term13777, term13777.getClass(), "nameplateId", 1525815085);
        setIntField(term13777, term13777.getClass(), "frameId", 1785476260);
        setIntField(term13777, term13777.getClass(), "trophyId", -655035002);
        setIntField(term13777, term13777.getClass(), "playCount", 1841475189);
        setIntField(term13777, term13777.getClass(), "playVsCount", -456566581);
        setIntField(term13777, term13777.getClass(), "playSyncCount", 2114761003);
        setIntField(term13777, term13777.getClass(), "winCount", -1128091158);
        setIntField(term13777, term13777.getClass(), "helpCount", 380526008);
        setIntField(term13777, term13777.getClass(), "comboCount", -285065370);
        setIntField(term13777, term13777.getClass(), "feverCount", -1542216721);
        setIntField(term13777, term13777.getClass(), "totalHiScore", -311300330);
        setIntField(term13777, term13777.getClass(), "totalEasyHighScore", 1160936971);
        setIntField(term13777, term13777.getClass(), "totalBasicHighScore", 1258846008);
        setIntField(term13777, term13777.getClass(), "totalAdvancedHighScore", 702866958);
        setIntField(term13777, term13777.getClass(), "totalExpertHighScore", 622731276);
        setIntField(term13777, term13777.getClass(), "totalMasterHighScore", -1302341502);
        setIntField(term13777, term13777.getClass(), "totalReMasterHighScore", 1113574554);
        setIntField(term13777, term13777.getClass(), "totalHighSync", 1685800093);
        setIntField(term13777, term13777.getClass(), "totalEasySync", -318699441);
        setIntField(term13777, term13777.getClass(), "totalBasicSync", 1381027809);
        setIntField(term13777, term13777.getClass(), "totalAdvancedSync", -371717995);
        setIntField(term13777, term13777.getClass(), "totalExpertSync", 1713005479);
        setIntField(term13777, term13777.getClass(), "totalMasterSync", -1948910444);
        setIntField(term13777, term13777.getClass(), "totalReMasterSync", -1099061955);
        setIntField(term13777, term13777.getClass(), "playerRating", -1672904007);
        setIntField(term13777, term13777.getClass(), "highestRating", -217232010);
        setIntField(term13777, term13777.getClass(), "rankAuthTailId", 2053372601);
        setField(term13777, term13777.getClass(), "eventWatchedDate", "RjNoEywJbC");
        setField(term13777, term13777.getClass(), "webLimitDate", "RTTvrwwhou");
        setIntField(term13777, term13777.getClass(), "challengeTrackPhase", -1828855069);
        setIntField(term13777, term13777.getClass(), "firstPlayBits", -1213694931);
        setField(term13777, term13777.getClass(), "lastPlayDate", "lRORwXipuk");
        setIntField(term13777, term13777.getClass(), "lastPlaceId", -1255656944);
        setField(term13777, term13777.getClass(), "lastPlaceName", "fVdTcjgHdw");
        setIntField(term13777, term13777.getClass(), "lastRegionId", -377697034);
        setField(term13777, term13777.getClass(), "lastRegionName", "wwAwLLcLPp");
        setField(term13777, term13777.getClass(), "lastClientId", "nHpMKOmlpQ");
        setField(term13777, term13777.getClass(), "lastCountryCode", "fKhrQsJToZ");
        setIntField(term13777, term13777.getClass(), "eventPoint", 1102778743);
        setIntField(term13777, term13777.getClass(), "totalLv", 1300928519);
        setIntField(term13777, term13777.getClass(), "lastLoginBonusDay", 338172676);
        setIntField(term13777, term13777.getClass(), "lastSurvivalBonusDay", -1896960942);
        setIntField(term13777, term13777.getClass(), "loginBonusLv", -935912608);
        term13951 = new Integer(505087197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13951;
        callMethod(klass, "setLastDataVersion", argTypes, term13777, args);
    }

};


