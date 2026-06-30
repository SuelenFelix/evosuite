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

public class UserData_getNameplateId_19736998797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;

    public UserData_getNameplateId_19736998797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1853 = new Long(6811161968424632369L);
        term1849 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term1851 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1872 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1882 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1849, term1849.getClass(), "id", -5476826692763582090L);
        setLongField(term1851, term1851.getClass(), "id", -872011222785455006L);
        setField(term1851, term1851.getClass(), "extId", term1853);
        setField(term1851, term1851.getClass(), "luid", "eqJfYWRaEL");
        setIntField(term1868, term1868.getClass(), "year", 2012);
        setShortField(term1868, term1868.getClass(), "month", (short) 2);
        setShortField(term1868, term1868.getClass(), "day", (short) 19);
        setField(term1867, term1867.getClass(), "date", term1868);
        setByteField(term1872, term1872.getClass(), "hour", (byte) 8);
        setByteField(term1872, term1872.getClass(), "minute", (byte) 4);
        setByteField(term1872, term1872.getClass(), "second", (byte) 43);
        setIntField(term1872, term1872.getClass(), "nano", 114930008);
        setField(term1867, term1867.getClass(), "time", term1872);
        setField(term1851, term1851.getClass(), "registerTime", term1867);
        setIntField(term1878, term1878.getClass(), "year", 2017);
        setShortField(term1878, term1878.getClass(), "month", (short) 6);
        setShortField(term1878, term1878.getClass(), "day", (short) 8);
        setField(term1877, term1877.getClass(), "date", term1878);
        setByteField(term1882, term1882.getClass(), "hour", (byte) 0);
        setByteField(term1882, term1882.getClass(), "minute", (byte) 18);
        setByteField(term1882, term1882.getClass(), "second", (byte) 55);
        setIntField(term1882, term1882.getClass(), "nano", 680586717);
        setField(term1877, term1877.getClass(), "time", term1882);
        setField(term1851, term1851.getClass(), "accessTime", term1877);
        setField(term1849, term1849.getClass(), "card", term1851);
        setIntField(term1849, term1849.getClass(), "lastDataVersion", -1656687479);
        setField(term1849, term1849.getClass(), "userName", "fhkbdRViHi");
        setIntField(term1849, term1849.getClass(), "point", -249614216);
        setIntField(term1849, term1849.getClass(), "totalPoint", 1870727665);
        setIntField(term1849, term1849.getClass(), "iconId", -519881101);
        setIntField(term1849, term1849.getClass(), "nameplateId", -680920524);
        setIntField(term1849, term1849.getClass(), "frameId", -916335264);
        setIntField(term1849, term1849.getClass(), "trophyId", -919416536);
        setIntField(term1849, term1849.getClass(), "playCount", -43417861);
        setIntField(term1849, term1849.getClass(), "playVsCount", -1533843432);
        setIntField(term1849, term1849.getClass(), "playSyncCount", -123338791);
        setIntField(term1849, term1849.getClass(), "winCount", -1467089634);
        setIntField(term1849, term1849.getClass(), "helpCount", 413548937);
        setIntField(term1849, term1849.getClass(), "comboCount", 1901317214);
        setIntField(term1849, term1849.getClass(), "feverCount", 1166710220);
        setIntField(term1849, term1849.getClass(), "totalHiScore", -1070592289);
        setIntField(term1849, term1849.getClass(), "totalEasyHighScore", -1464172784);
        setIntField(term1849, term1849.getClass(), "totalBasicHighScore", 32185364);
        setIntField(term1849, term1849.getClass(), "totalAdvancedHighScore", 1768204942);
        setIntField(term1849, term1849.getClass(), "totalExpertHighScore", 1252951645);
        setIntField(term1849, term1849.getClass(), "totalMasterHighScore", 574481092);
        setIntField(term1849, term1849.getClass(), "totalReMasterHighScore", -310528004);
        setIntField(term1849, term1849.getClass(), "totalHighSync", -634976996);
        setIntField(term1849, term1849.getClass(), "totalEasySync", -1015274146);
        setIntField(term1849, term1849.getClass(), "totalBasicSync", -49052672);
        setIntField(term1849, term1849.getClass(), "totalAdvancedSync", 339372704);
        setIntField(term1849, term1849.getClass(), "totalExpertSync", -851097944);
        setIntField(term1849, term1849.getClass(), "totalMasterSync", 803925431);
        setIntField(term1849, term1849.getClass(), "totalReMasterSync", 76929641);
        setIntField(term1849, term1849.getClass(), "playerRating", -2003192918);
        setIntField(term1849, term1849.getClass(), "highestRating", -1362856620);
        setIntField(term1849, term1849.getClass(), "rankAuthTailId", -1835839814);
        setField(term1849, term1849.getClass(), "eventWatchedDate", "uWHnvSvaPl");
        setField(term1849, term1849.getClass(), "webLimitDate", "kBdSllIBVz");
        setIntField(term1849, term1849.getClass(), "challengeTrackPhase", -1404350380);
        setIntField(term1849, term1849.getClass(), "firstPlayBits", -2013924238);
        setField(term1849, term1849.getClass(), "lastPlayDate", "TJmVBGfTML");
        setIntField(term1849, term1849.getClass(), "lastPlaceId", 579006268);
        setField(term1849, term1849.getClass(), "lastPlaceName", "tPlsykYBqO");
        setIntField(term1849, term1849.getClass(), "lastRegionId", -1694747156);
        setField(term1849, term1849.getClass(), "lastRegionName", "bLPjGVBhlX");
        setField(term1849, term1849.getClass(), "lastClientId", "whBvTVIIlC");
        setField(term1849, term1849.getClass(), "lastCountryCode", "IgRJUzaCwW");
        setIntField(term1849, term1849.getClass(), "eventPoint", 1466373988);
        setIntField(term1849, term1849.getClass(), "totalLv", -358526505);
        setIntField(term1849, term1849.getClass(), "lastLoginBonusDay", 1843268026);
        setIntField(term1849, term1849.getClass(), "lastSurvivalBonusDay", 954660603);
        setIntField(term1849, term1849.getClass(), "loginBonusLv", -1351605385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term1849, args);
    }

};


