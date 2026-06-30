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

public class UserData_getWebLimitDate_68549986535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9241;

    public UserData_getWebLimitDate_68549986535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9245 = new Long(1233889271256172047L);
        term9241 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term9243 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term9259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9264 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9269 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9270 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9274 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term9241, term9241.getClass(), "id", -5248475803419977214L);
        setLongField(term9243, term9243.getClass(), "id", -6723783499250797216L);
        setField(term9243, term9243.getClass(), "extId", term9245);
        setField(term9243, term9243.getClass(), "luid", "zNFLXMifnS");
        setIntField(term9260, term9260.getClass(), "year", 2022);
        setShortField(term9260, term9260.getClass(), "month", (short) 4);
        setShortField(term9260, term9260.getClass(), "day", (short) 15);
        setField(term9259, term9259.getClass(), "date", term9260);
        setByteField(term9264, term9264.getClass(), "hour", (byte) 20);
        setByteField(term9264, term9264.getClass(), "minute", (byte) 58);
        setByteField(term9264, term9264.getClass(), "second", (byte) 46);
        setIntField(term9264, term9264.getClass(), "nano", 435562727);
        setField(term9259, term9259.getClass(), "time", term9264);
        setField(term9243, term9243.getClass(), "registerTime", term9259);
        setIntField(term9270, term9270.getClass(), "year", 2026);
        setShortField(term9270, term9270.getClass(), "month", (short) 10);
        setShortField(term9270, term9270.getClass(), "day", (short) 31);
        setField(term9269, term9269.getClass(), "date", term9270);
        setByteField(term9274, term9274.getClass(), "hour", (byte) 17);
        setByteField(term9274, term9274.getClass(), "minute", (byte) 6);
        setByteField(term9274, term9274.getClass(), "second", (byte) 30);
        setIntField(term9274, term9274.getClass(), "nano", 785931660);
        setField(term9269, term9269.getClass(), "time", term9274);
        setField(term9243, term9243.getClass(), "accessTime", term9269);
        setField(term9241, term9241.getClass(), "card", term9243);
        setIntField(term9241, term9241.getClass(), "lastDataVersion", 1721418943);
        setField(term9241, term9241.getClass(), "userName", "HHQcYMSBVc");
        setIntField(term9241, term9241.getClass(), "point", -111082612);
        setIntField(term9241, term9241.getClass(), "totalPoint", 1253334988);
        setIntField(term9241, term9241.getClass(), "iconId", 1086709736);
        setIntField(term9241, term9241.getClass(), "nameplateId", -1606698075);
        setIntField(term9241, term9241.getClass(), "frameId", 90996421);
        setIntField(term9241, term9241.getClass(), "trophyId", -1805802783);
        setIntField(term9241, term9241.getClass(), "playCount", -529831900);
        setIntField(term9241, term9241.getClass(), "playVsCount", 1574493440);
        setIntField(term9241, term9241.getClass(), "playSyncCount", 1854694585);
        setIntField(term9241, term9241.getClass(), "winCount", -1260562836);
        setIntField(term9241, term9241.getClass(), "helpCount", 694100722);
        setIntField(term9241, term9241.getClass(), "comboCount", -680529431);
        setIntField(term9241, term9241.getClass(), "feverCount", 212698793);
        setIntField(term9241, term9241.getClass(), "totalHiScore", 1169519385);
        setIntField(term9241, term9241.getClass(), "totalEasyHighScore", 1846078344);
        setIntField(term9241, term9241.getClass(), "totalBasicHighScore", 1692543802);
        setIntField(term9241, term9241.getClass(), "totalAdvancedHighScore", 376341151);
        setIntField(term9241, term9241.getClass(), "totalExpertHighScore", -1607267243);
        setIntField(term9241, term9241.getClass(), "totalMasterHighScore", 1641377218);
        setIntField(term9241, term9241.getClass(), "totalReMasterHighScore", 1235375204);
        setIntField(term9241, term9241.getClass(), "totalHighSync", 258334639);
        setIntField(term9241, term9241.getClass(), "totalEasySync", 1432187207);
        setIntField(term9241, term9241.getClass(), "totalBasicSync", -91068927);
        setIntField(term9241, term9241.getClass(), "totalAdvancedSync", 680714112);
        setIntField(term9241, term9241.getClass(), "totalExpertSync", 385297023);
        setIntField(term9241, term9241.getClass(), "totalMasterSync", -134092543);
        setIntField(term9241, term9241.getClass(), "totalReMasterSync", -1703642288);
        setIntField(term9241, term9241.getClass(), "playerRating", 2075139747);
        setIntField(term9241, term9241.getClass(), "highestRating", 2092881418);
        setIntField(term9241, term9241.getClass(), "rankAuthTailId", 1732410866);
        setField(term9241, term9241.getClass(), "eventWatchedDate", "wdoqITnaAP");
        setField(term9241, term9241.getClass(), "webLimitDate", "rIPMBcrNqB");
        setIntField(term9241, term9241.getClass(), "challengeTrackPhase", 1084102599);
        setIntField(term9241, term9241.getClass(), "firstPlayBits", -1743503755);
        setField(term9241, term9241.getClass(), "lastPlayDate", "UDaboHZHhz");
        setIntField(term9241, term9241.getClass(), "lastPlaceId", 1641342112);
        setField(term9241, term9241.getClass(), "lastPlaceName", "nRvKihUSPj");
        setIntField(term9241, term9241.getClass(), "lastRegionId", -1551790945);
        setField(term9241, term9241.getClass(), "lastRegionName", "BbNeQJpYPr");
        setField(term9241, term9241.getClass(), "lastClientId", "riMtzCoxNj");
        setField(term9241, term9241.getClass(), "lastCountryCode", "YAXkVjQZcV");
        setIntField(term9241, term9241.getClass(), "eventPoint", 2039538484);
        setIntField(term9241, term9241.getClass(), "totalLv", 1235736068);
        setIntField(term9241, term9241.getClass(), "lastLoginBonusDay", 329424176);
        setIntField(term9241, term9241.getClass(), "lastSurvivalBonusDay", -1897199214);
        setIntField(term9241, term9241.getClass(), "loginBonusLv", -1016478729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebLimitDate", argTypes, term9241, args);
    }

};


