package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserItem_init_6562340580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121053;

    public UserItem_init_6562340580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term121057 = new Long(-6394943900800506753L);
        term121053 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term121055 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term121071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121076 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121086 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121104 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121108 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121164 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121165 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121169 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121212 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121213 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121217 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121258 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121259 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121263 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term121053, term121053.getClass(), "id", 3459456097754089065L);
        setLongField(term121055, term121055.getClass(), "id", -2286727398190518737L);
        setField(term121055, term121055.getClass(), "extId", term121057);
        setField(term121055, term121055.getClass(), "luid", "OsLyHIAMvZ");
        setIntField(term121072, term121072.getClass(), "year", 2014);
        setShortField(term121072, term121072.getClass(), "month", (short) 1);
        setShortField(term121072, term121072.getClass(), "day", (short) 18);
        setField(term121071, term121071.getClass(), "date", term121072);
        setByteField(term121076, term121076.getClass(), "hour", (byte) 4);
        setByteField(term121076, term121076.getClass(), "minute", (byte) 10);
        setByteField(term121076, term121076.getClass(), "second", (byte) 6);
        setIntField(term121076, term121076.getClass(), "nano", 867885417);
        setField(term121071, term121071.getClass(), "time", term121076);
        setField(term121055, term121055.getClass(), "registerTime", term121071);
        setIntField(term121082, term121082.getClass(), "year", 2010);
        setShortField(term121082, term121082.getClass(), "month", (short) 11);
        setShortField(term121082, term121082.getClass(), "day", (short) 27);
        setField(term121081, term121081.getClass(), "date", term121082);
        setByteField(term121086, term121086.getClass(), "hour", (byte) 6);
        setByteField(term121086, term121086.getClass(), "minute", (byte) 5);
        setByteField(term121086, term121086.getClass(), "second", (byte) 12);
        setIntField(term121086, term121086.getClass(), "nano", 189662781);
        setField(term121081, term121081.getClass(), "time", term121086);
        setField(term121055, term121055.getClass(), "accessTime", term121081);
        setField(term121053, term121053.getClass(), "card", term121055);
        setField(term121053, term121053.getClass(), "userName", "fANlppmeZc");
        setIntField(term121104, term121104.getClass(), "year", 2026);
        setShortField(term121104, term121104.getClass(), "month", (short) 11);
        setShortField(term121104, term121104.getClass(), "day", (short) 25);
        setField(term121103, term121103.getClass(), "date", term121104);
        setByteField(term121108, term121108.getClass(), "hour", (byte) 1);
        setByteField(term121108, term121108.getClass(), "minute", (byte) 35);
        setByteField(term121108, term121108.getClass(), "second", (byte) 42);
        setIntField(term121108, term121108.getClass(), "nano", 137834369);
        setField(term121103, term121103.getClass(), "time", term121108);
        setField(term121053, term121053.getClass(), "lastLoginDate", term121103);
        setBooleanField(term121053, term121053.getClass(), "isWebJoin", true);
        setField(term121053, term121053.getClass(), "webLimitDate", "vwXdXCgQIr");
        setIntField(term121053, term121053.getClass(), "level", 403780056);
        setIntField(term121053, term121053.getClass(), "reincarnationNum", 1834523834);
        setField(term121053, term121053.getClass(), "exp", "nSnrziJcBE");
        setLongField(term121053, term121053.getClass(), "point", 7624135425106525336L);
        setLongField(term121053, term121053.getClass(), "totalPoint", -1462575889150559403L);
        setIntField(term121053, term121053.getClass(), "playCount", 399538802);
        setIntField(term121053, term121053.getClass(), "multiPlayCount", 293797529);
        setIntField(term121053, term121053.getClass(), "multiWinCount", -2060795821);
        setIntField(term121053, term121053.getClass(), "requestResCount", -159511730);
        setIntField(term121053, term121053.getClass(), "acceptResCount", 370898129);
        setIntField(term121053, term121053.getClass(), "successResCount", -970532580);
        setIntField(term121053, term121053.getClass(), "playerRating", 869653312);
        setIntField(term121053, term121053.getClass(), "highestRating", 464373107);
        setIntField(term121053, term121053.getClass(), "nameplateId", -153889480);
        setIntField(term121053, term121053.getClass(), "frameId", 1435683093);
        setIntField(term121053, term121053.getClass(), "characterId", -1906424793);
        setIntField(term121053, term121053.getClass(), "trophyId", 1262036398);
        setIntField(term121053, term121053.getClass(), "playedTutorialBit", 1864946460);
        setIntField(term121053, term121053.getClass(), "firstTutorialCancelNum", -1209161295);
        setIntField(term121053, term121053.getClass(), "masterTutorialCancelNum", 341162488);
        setIntField(term121053, term121053.getClass(), "totalRepertoireCount", 1772832909);
        setIntField(term121053, term121053.getClass(), "totalMapNum", -1791192223);
        setLongField(term121053, term121053.getClass(), "totalHiScore", -5162356149587830708L);
        setLongField(term121053, term121053.getClass(), "totalBasicHighScore", -6151803779994618544L);
        setLongField(term121053, term121053.getClass(), "totalAdvancedHighScore", -3845020763922073283L);
        setLongField(term121053, term121053.getClass(), "totalExpertHighScore", -1090914825205410494L);
        setLongField(term121053, term121053.getClass(), "totalMasterHighScore", -886880864570970229L);
        setIntField(term121165, term121165.getClass(), "year", 2015);
        setShortField(term121165, term121165.getClass(), "month", (short) 8);
        setShortField(term121165, term121165.getClass(), "day", (short) 8);
        setField(term121164, term121164.getClass(), "date", term121165);
        setByteField(term121169, term121169.getClass(), "hour", (byte) 5);
        setByteField(term121169, term121169.getClass(), "minute", (byte) 27);
        setByteField(term121169, term121169.getClass(), "second", (byte) 0);
        setIntField(term121169, term121169.getClass(), "nano", 850217535);
        setField(term121164, term121164.getClass(), "time", term121169);
        setField(term121053, term121053.getClass(), "eventWatchedDate", term121164);
        setIntField(term121053, term121053.getClass(), "friendCount", -384087961);
        setBooleanField(term121053, term121053.getClass(), "isMaimai", false);
        setField(term121053, term121053.getClass(), "firstGameId", "xbhJrXUuCP");
        setField(term121053, term121053.getClass(), "firstRomVersion", "bvjVBhkXQU");
        setField(term121053, term121053.getClass(), "firstDataVersion", "IrOvUMupuD");
        setIntField(term121213, term121213.getClass(), "year", 2028);
        setShortField(term121213, term121213.getClass(), "month", (short) 8);
        setShortField(term121213, term121213.getClass(), "day", (short) 10);
        setField(term121212, term121212.getClass(), "date", term121213);
        setByteField(term121217, term121217.getClass(), "hour", (byte) 14);
        setByteField(term121217, term121217.getClass(), "minute", (byte) 7);
        setByteField(term121217, term121217.getClass(), "second", (byte) 18);
        setIntField(term121217, term121217.getClass(), "nano", 756167959);
        setField(term121212, term121212.getClass(), "time", term121217);
        setField(term121053, term121053.getClass(), "firstPlayDate", term121212);
        setField(term121053, term121053.getClass(), "lastGameId", "UgFQTaylqs");
        setField(term121053, term121053.getClass(), "lastRomVersion", "CZksebZXsC");
        setField(term121053, term121053.getClass(), "lastDataVersion", "NDTlULiAEp");
        setIntField(term121259, term121259.getClass(), "year", 2020);
        setShortField(term121259, term121259.getClass(), "month", (short) 6);
        setShortField(term121259, term121259.getClass(), "day", (short) 3);
        setField(term121258, term121258.getClass(), "date", term121259);
        setByteField(term121263, term121263.getClass(), "hour", (byte) 6);
        setByteField(term121263, term121263.getClass(), "minute", (byte) 45);
        setByteField(term121263, term121263.getClass(), "second", (byte) 58);
        setIntField(term121263, term121263.getClass(), "nano", 920763372);
        setField(term121258, term121258.getClass(), "time", term121263);
        setField(term121053, term121053.getClass(), "lastPlayDate", term121258);
        setIntField(term121053, term121053.getClass(), "lastPlaceId", 2102378795);
        setField(term121053, term121053.getClass(), "lastPlaceName", "KakVHGlMtc");
        setField(term121053, term121053.getClass(), "lastRegionId", "XQkRBflDak");
        setField(term121053, term121053.getClass(), "lastRegionName", "UXtNgOITuj");
        setField(term121053, term121053.getClass(), "lastAllNetId", "NpmLmrGTHj");
        setField(term121053, term121053.getClass(), "lastClientId", "BPWhlQnFCE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term121053;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


