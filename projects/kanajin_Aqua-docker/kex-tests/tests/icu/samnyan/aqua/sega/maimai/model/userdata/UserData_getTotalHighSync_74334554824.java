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

public class UserData_getTotalHighSync_74334554824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6337;

    public UserData_getTotalHighSync_74334554824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6341 = new Long(2486810210675247493L);
        term6337 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term6339 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6360 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6370 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6337, term6337.getClass(), "id", -4443169559037975007L);
        setLongField(term6339, term6339.getClass(), "id", -3842548265506930260L);
        setField(term6339, term6339.getClass(), "extId", term6341);
        setField(term6339, term6339.getClass(), "luid", "zcorEihhLK");
        setIntField(term6356, term6356.getClass(), "year", 2012);
        setShortField(term6356, term6356.getClass(), "month", (short) 4);
        setShortField(term6356, term6356.getClass(), "day", (short) 25);
        setField(term6355, term6355.getClass(), "date", term6356);
        setByteField(term6360, term6360.getClass(), "hour", (byte) 21);
        setByteField(term6360, term6360.getClass(), "minute", (byte) 14);
        setByteField(term6360, term6360.getClass(), "second", (byte) 15);
        setIntField(term6360, term6360.getClass(), "nano", 561700934);
        setField(term6355, term6355.getClass(), "time", term6360);
        setField(term6339, term6339.getClass(), "registerTime", term6355);
        setIntField(term6366, term6366.getClass(), "year", 2011);
        setShortField(term6366, term6366.getClass(), "month", (short) 10);
        setShortField(term6366, term6366.getClass(), "day", (short) 25);
        setField(term6365, term6365.getClass(), "date", term6366);
        setByteField(term6370, term6370.getClass(), "hour", (byte) 10);
        setByteField(term6370, term6370.getClass(), "minute", (byte) 33);
        setByteField(term6370, term6370.getClass(), "second", (byte) 8);
        setIntField(term6370, term6370.getClass(), "nano", 268304014);
        setField(term6365, term6365.getClass(), "time", term6370);
        setField(term6339, term6339.getClass(), "accessTime", term6365);
        setField(term6337, term6337.getClass(), "card", term6339);
        setIntField(term6337, term6337.getClass(), "lastDataVersion", 1737876343);
        setField(term6337, term6337.getClass(), "userName", "GrqozDKFOk");
        setIntField(term6337, term6337.getClass(), "point", -897937940);
        setIntField(term6337, term6337.getClass(), "totalPoint", 1523261232);
        setIntField(term6337, term6337.getClass(), "iconId", -428988337);
        setIntField(term6337, term6337.getClass(), "nameplateId", 48047085);
        setIntField(term6337, term6337.getClass(), "frameId", 1902784843);
        setIntField(term6337, term6337.getClass(), "trophyId", 2021136615);
        setIntField(term6337, term6337.getClass(), "playCount", 1778570695);
        setIntField(term6337, term6337.getClass(), "playVsCount", -1142164411);
        setIntField(term6337, term6337.getClass(), "playSyncCount", -1619435313);
        setIntField(term6337, term6337.getClass(), "winCount", 1013801066);
        setIntField(term6337, term6337.getClass(), "helpCount", 1512541853);
        setIntField(term6337, term6337.getClass(), "comboCount", -965421502);
        setIntField(term6337, term6337.getClass(), "feverCount", 1319026002);
        setIntField(term6337, term6337.getClass(), "totalHiScore", -1368173231);
        setIntField(term6337, term6337.getClass(), "totalEasyHighScore", 1956006038);
        setIntField(term6337, term6337.getClass(), "totalBasicHighScore", -1062304878);
        setIntField(term6337, term6337.getClass(), "totalAdvancedHighScore", -1377876610);
        setIntField(term6337, term6337.getClass(), "totalExpertHighScore", -1456184732);
        setIntField(term6337, term6337.getClass(), "totalMasterHighScore", 1689228897);
        setIntField(term6337, term6337.getClass(), "totalReMasterHighScore", 892205855);
        setIntField(term6337, term6337.getClass(), "totalHighSync", 1955560079);
        setIntField(term6337, term6337.getClass(), "totalEasySync", -1330529019);
        setIntField(term6337, term6337.getClass(), "totalBasicSync", 237134844);
        setIntField(term6337, term6337.getClass(), "totalAdvancedSync", 2076413861);
        setIntField(term6337, term6337.getClass(), "totalExpertSync", 66817373);
        setIntField(term6337, term6337.getClass(), "totalMasterSync", 1459628013);
        setIntField(term6337, term6337.getClass(), "totalReMasterSync", -1641507499);
        setIntField(term6337, term6337.getClass(), "playerRating", -33436796);
        setIntField(term6337, term6337.getClass(), "highestRating", -1527326823);
        setIntField(term6337, term6337.getClass(), "rankAuthTailId", 469871899);
        setField(term6337, term6337.getClass(), "eventWatchedDate", "CFyoseFGLF");
        setField(term6337, term6337.getClass(), "webLimitDate", "SFqCrhEWLm");
        setIntField(term6337, term6337.getClass(), "challengeTrackPhase", -1348703436);
        setIntField(term6337, term6337.getClass(), "firstPlayBits", -2027012650);
        setField(term6337, term6337.getClass(), "lastPlayDate", "GZdcJyZntS");
        setIntField(term6337, term6337.getClass(), "lastPlaceId", 1343432022);
        setField(term6337, term6337.getClass(), "lastPlaceName", "OIHoJeysUi");
        setIntField(term6337, term6337.getClass(), "lastRegionId", -1767079160);
        setField(term6337, term6337.getClass(), "lastRegionName", "WXMWFDGcLB");
        setField(term6337, term6337.getClass(), "lastClientId", "wKWbJssZuG");
        setField(term6337, term6337.getClass(), "lastCountryCode", "NzBMMhkhpT");
        setIntField(term6337, term6337.getClass(), "eventPoint", -201010601);
        setIntField(term6337, term6337.getClass(), "totalLv", 2060027076);
        setIntField(term6337, term6337.getClass(), "lastLoginBonusDay", 2084868811);
        setIntField(term6337, term6337.getClass(), "lastSurvivalBonusDay", 314478878);
        setIntField(term6337, term6337.getClass(), "loginBonusLv", 1425342686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHighSync", argTypes, term6337, args);
    }

};


