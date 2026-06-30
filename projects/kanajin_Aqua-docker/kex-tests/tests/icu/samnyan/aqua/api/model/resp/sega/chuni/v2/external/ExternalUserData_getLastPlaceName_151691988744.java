package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getLastPlaceName_151691988744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17645;

    public ExternalUserData_getLastPlaceName_151691988744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17645 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term17670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17784 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17830 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17645, term17645.getClass(), "accessCode", "zyZTzHNjQr");
        setField(term17645, term17645.getClass(), "userName", "YSrFKQQwXE");
        setIntField(term17671, term17671.getClass(), "year", 2029);
        setShortField(term17671, term17671.getClass(), "month", (short) 7);
        setShortField(term17671, term17671.getClass(), "day", (short) 14);
        setField(term17670, term17670.getClass(), "date", term17671);
        setByteField(term17675, term17675.getClass(), "hour", (byte) 17);
        setByteField(term17675, term17675.getClass(), "minute", (byte) 37);
        setByteField(term17675, term17675.getClass(), "second", (byte) 39);
        setIntField(term17675, term17675.getClass(), "nano", 333402299);
        setField(term17670, term17670.getClass(), "time", term17675);
        setField(term17645, term17645.getClass(), "lastLoginDate", term17670);
        setBooleanField(term17645, term17645.getClass(), "isWebJoin", false);
        setField(term17645, term17645.getClass(), "webLimitDate", "qxhOsmyyjm");
        setIntField(term17645, term17645.getClass(), "level", 225873732);
        setIntField(term17645, term17645.getClass(), "reincarnationNum", 529879356);
        setField(term17645, term17645.getClass(), "exp", "DuKcNfVVYR");
        setLongField(term17645, term17645.getClass(), "point", -5935517391653614345L);
        setLongField(term17645, term17645.getClass(), "totalPoint", -6521561238735301071L);
        setIntField(term17645, term17645.getClass(), "playCount", 18072182);
        setIntField(term17645, term17645.getClass(), "multiPlayCount", 1544768934);
        setIntField(term17645, term17645.getClass(), "multiWinCount", -383508597);
        setIntField(term17645, term17645.getClass(), "requestResCount", -819372164);
        setIntField(term17645, term17645.getClass(), "acceptResCount", 958132675);
        setIntField(term17645, term17645.getClass(), "successResCount", -689879283);
        setIntField(term17645, term17645.getClass(), "playerRating", 1985432430);
        setIntField(term17645, term17645.getClass(), "highestRating", -1769933499);
        setIntField(term17645, term17645.getClass(), "nameplateId", -1510932472);
        setIntField(term17645, term17645.getClass(), "frameId", 1970654816);
        setIntField(term17645, term17645.getClass(), "characterId", 1354781442);
        setIntField(term17645, term17645.getClass(), "trophyId", -393590701);
        setIntField(term17645, term17645.getClass(), "playedTutorialBit", 86344574);
        setIntField(term17645, term17645.getClass(), "firstTutorialCancelNum", -829441157);
        setIntField(term17645, term17645.getClass(), "masterTutorialCancelNum", -1489991025);
        setIntField(term17645, term17645.getClass(), "totalRepertoireCount", -1542979444);
        setIntField(term17645, term17645.getClass(), "totalMapNum", -1130401612);
        setLongField(term17645, term17645.getClass(), "totalHiScore", -6609679920238945303L);
        setLongField(term17645, term17645.getClass(), "totalBasicHighScore", -7296330380944173376L);
        setLongField(term17645, term17645.getClass(), "totalAdvancedHighScore", -8890284990655172580L);
        setLongField(term17645, term17645.getClass(), "totalExpertHighScore", -5951743062322506095L);
        setLongField(term17645, term17645.getClass(), "totalMasterHighScore", 768144790810175653L);
        setIntField(term17732, term17732.getClass(), "year", 2025);
        setShortField(term17732, term17732.getClass(), "month", (short) 10);
        setShortField(term17732, term17732.getClass(), "day", (short) 30);
        setField(term17731, term17731.getClass(), "date", term17732);
        setByteField(term17736, term17736.getClass(), "hour", (byte) 1);
        setByteField(term17736, term17736.getClass(), "minute", (byte) 4);
        setByteField(term17736, term17736.getClass(), "second", (byte) 18);
        setIntField(term17736, term17736.getClass(), "nano", 717716253);
        setField(term17731, term17731.getClass(), "time", term17736);
        setField(term17645, term17645.getClass(), "eventWatchedDate", term17731);
        setIntField(term17645, term17645.getClass(), "friendCount", -316771104);
        setBooleanField(term17645, term17645.getClass(), "isMaimai", true);
        setField(term17645, term17645.getClass(), "firstGameId", "fRujHWvXjJ");
        setField(term17645, term17645.getClass(), "firstRomVersion", "EAIAAStlTz");
        setField(term17645, term17645.getClass(), "firstDataVersion", "yIWXcOQTgy");
        setIntField(term17780, term17780.getClass(), "year", 2019);
        setShortField(term17780, term17780.getClass(), "month", (short) 7);
        setShortField(term17780, term17780.getClass(), "day", (short) 4);
        setField(term17779, term17779.getClass(), "date", term17780);
        setByteField(term17784, term17784.getClass(), "hour", (byte) 19);
        setByteField(term17784, term17784.getClass(), "minute", (byte) 20);
        setByteField(term17784, term17784.getClass(), "second", (byte) 59);
        setIntField(term17784, term17784.getClass(), "nano", 246784352);
        setField(term17779, term17779.getClass(), "time", term17784);
        setField(term17645, term17645.getClass(), "firstPlayDate", term17779);
        setField(term17645, term17645.getClass(), "lastGameId", "xAWekqanqc");
        setField(term17645, term17645.getClass(), "lastRomVersion", "GSOWFHMlbF");
        setField(term17645, term17645.getClass(), "lastDataVersion", "vpZIqpFbKM");
        setIntField(term17826, term17826.getClass(), "year", 2023);
        setShortField(term17826, term17826.getClass(), "month", (short) 7);
        setShortField(term17826, term17826.getClass(), "day", (short) 1);
        setField(term17825, term17825.getClass(), "date", term17826);
        setByteField(term17830, term17830.getClass(), "hour", (byte) 4);
        setByteField(term17830, term17830.getClass(), "minute", (byte) 33);
        setByteField(term17830, term17830.getClass(), "second", (byte) 9);
        setIntField(term17830, term17830.getClass(), "nano", 94365310);
        setField(term17825, term17825.getClass(), "time", term17830);
        setField(term17645, term17645.getClass(), "lastPlayDate", term17825);
        setIntField(term17645, term17645.getClass(), "lastPlaceId", -1374527319);
        setField(term17645, term17645.getClass(), "lastPlaceName", "dAbwpJCDif");
        setField(term17645, term17645.getClass(), "lastRegionId", "ATSXJPySio");
        setField(term17645, term17645.getClass(), "lastRegionName", "XZkOUcbfFg");
        setField(term17645, term17645.getClass(), "lastAllNetId", "TGiJfagfky");
        setField(term17645, term17645.getClass(), "lastClientId", "BJklinBmhN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term17645, args);
    }

};


