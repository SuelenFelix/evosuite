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

public class UserItem_getItemId_9385979304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122775;

    public UserItem_getItemId_9385979304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term122781 = new Long(868503089567085985L);
        term122775 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term122777 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term122779 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term122795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122810 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122987 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122775, term122775.getClass(), "id", -2747979550793547397L);
        setLongField(term122777, term122777.getClass(), "id", 9109639281020807778L);
        setLongField(term122779, term122779.getClass(), "id", 6914197512599341154L);
        setField(term122779, term122779.getClass(), "extId", term122781);
        setField(term122779, term122779.getClass(), "luid", "vfKOoCcJXS");
        setIntField(term122796, term122796.getClass(), "year", 2025);
        setShortField(term122796, term122796.getClass(), "month", (short) 11);
        setShortField(term122796, term122796.getClass(), "day", (short) 1);
        setField(term122795, term122795.getClass(), "date", term122796);
        setByteField(term122800, term122800.getClass(), "hour", (byte) 18);
        setByteField(term122800, term122800.getClass(), "minute", (byte) 1);
        setByteField(term122800, term122800.getClass(), "second", (byte) 17);
        setIntField(term122800, term122800.getClass(), "nano", 984602745);
        setField(term122795, term122795.getClass(), "time", term122800);
        setField(term122779, term122779.getClass(), "registerTime", term122795);
        setIntField(term122806, term122806.getClass(), "year", 2015);
        setShortField(term122806, term122806.getClass(), "month", (short) 4);
        setShortField(term122806, term122806.getClass(), "day", (short) 9);
        setField(term122805, term122805.getClass(), "date", term122806);
        setByteField(term122810, term122810.getClass(), "hour", (byte) 23);
        setByteField(term122810, term122810.getClass(), "minute", (byte) 29);
        setByteField(term122810, term122810.getClass(), "second", (byte) 20);
        setIntField(term122810, term122810.getClass(), "nano", 431389763);
        setField(term122805, term122805.getClass(), "time", term122810);
        setField(term122779, term122779.getClass(), "accessTime", term122805);
        setField(term122777, term122777.getClass(), "card", term122779);
        setField(term122777, term122777.getClass(), "userName", "jCPFInZUzz");
        setIntField(term122828, term122828.getClass(), "year", 2029);
        setShortField(term122828, term122828.getClass(), "month", (short) 3);
        setShortField(term122828, term122828.getClass(), "day", (short) 1);
        setField(term122827, term122827.getClass(), "date", term122828);
        setByteField(term122832, term122832.getClass(), "hour", (byte) 8);
        setByteField(term122832, term122832.getClass(), "minute", (byte) 38);
        setByteField(term122832, term122832.getClass(), "second", (byte) 43);
        setIntField(term122832, term122832.getClass(), "nano", 711609754);
        setField(term122827, term122827.getClass(), "time", term122832);
        setField(term122777, term122777.getClass(), "lastLoginDate", term122827);
        setBooleanField(term122777, term122777.getClass(), "isWebJoin", true);
        setField(term122777, term122777.getClass(), "webLimitDate", "WPHeIEBBVh");
        setIntField(term122777, term122777.getClass(), "level", 1721773044);
        setIntField(term122777, term122777.getClass(), "reincarnationNum", -915969228);
        setField(term122777, term122777.getClass(), "exp", "ruFkchQbOS");
        setLongField(term122777, term122777.getClass(), "point", -6395079400634628442L);
        setLongField(term122777, term122777.getClass(), "totalPoint", 7082509513795758490L);
        setIntField(term122777, term122777.getClass(), "playCount", 1880570421);
        setIntField(term122777, term122777.getClass(), "multiPlayCount", 1550634740);
        setIntField(term122777, term122777.getClass(), "multiWinCount", 1948909933);
        setIntField(term122777, term122777.getClass(), "requestResCount", 523942487);
        setIntField(term122777, term122777.getClass(), "acceptResCount", 414828751);
        setIntField(term122777, term122777.getClass(), "successResCount", -1302401149);
        setIntField(term122777, term122777.getClass(), "playerRating", -245323536);
        setIntField(term122777, term122777.getClass(), "highestRating", 1512614447);
        setIntField(term122777, term122777.getClass(), "nameplateId", 1978532347);
        setIntField(term122777, term122777.getClass(), "frameId", 612187049);
        setIntField(term122777, term122777.getClass(), "characterId", -965947021);
        setIntField(term122777, term122777.getClass(), "trophyId", 1079005450);
        setIntField(term122777, term122777.getClass(), "playedTutorialBit", -1932347451);
        setIntField(term122777, term122777.getClass(), "firstTutorialCancelNum", -406686588);
        setIntField(term122777, term122777.getClass(), "masterTutorialCancelNum", 1008508403);
        setIntField(term122777, term122777.getClass(), "totalRepertoireCount", -1013082565);
        setIntField(term122777, term122777.getClass(), "totalMapNum", -855398884);
        setLongField(term122777, term122777.getClass(), "totalHiScore", 6894785617640026192L);
        setLongField(term122777, term122777.getClass(), "totalBasicHighScore", -712231978771147321L);
        setLongField(term122777, term122777.getClass(), "totalAdvancedHighScore", -3719705503663357236L);
        setLongField(term122777, term122777.getClass(), "totalExpertHighScore", -2486316003854133942L);
        setLongField(term122777, term122777.getClass(), "totalMasterHighScore", 1641523513056981056L);
        setIntField(term122889, term122889.getClass(), "year", 2023);
        setShortField(term122889, term122889.getClass(), "month", (short) 3);
        setShortField(term122889, term122889.getClass(), "day", (short) 12);
        setField(term122888, term122888.getClass(), "date", term122889);
        setByteField(term122893, term122893.getClass(), "hour", (byte) 3);
        setByteField(term122893, term122893.getClass(), "minute", (byte) 34);
        setByteField(term122893, term122893.getClass(), "second", (byte) 59);
        setIntField(term122893, term122893.getClass(), "nano", 301826860);
        setField(term122888, term122888.getClass(), "time", term122893);
        setField(term122777, term122777.getClass(), "eventWatchedDate", term122888);
        setIntField(term122777, term122777.getClass(), "friendCount", -762497528);
        setBooleanField(term122777, term122777.getClass(), "isMaimai", false);
        setField(term122777, term122777.getClass(), "firstGameId", "tBfuxXsdPa");
        setField(term122777, term122777.getClass(), "firstRomVersion", "fbUKhQMRyD");
        setField(term122777, term122777.getClass(), "firstDataVersion", "NSGSwngDCi");
        setIntField(term122937, term122937.getClass(), "year", 2011);
        setShortField(term122937, term122937.getClass(), "month", (short) 4);
        setShortField(term122937, term122937.getClass(), "day", (short) 13);
        setField(term122936, term122936.getClass(), "date", term122937);
        setByteField(term122941, term122941.getClass(), "hour", (byte) 13);
        setByteField(term122941, term122941.getClass(), "minute", (byte) 34);
        setByteField(term122941, term122941.getClass(), "second", (byte) 31);
        setIntField(term122941, term122941.getClass(), "nano", 110060277);
        setField(term122936, term122936.getClass(), "time", term122941);
        setField(term122777, term122777.getClass(), "firstPlayDate", term122936);
        setField(term122777, term122777.getClass(), "lastGameId", "IqTXCynBeA");
        setField(term122777, term122777.getClass(), "lastRomVersion", "bgIAbyunKO");
        setField(term122777, term122777.getClass(), "lastDataVersion", "ECOAkMOcmP");
        setIntField(term122983, term122983.getClass(), "year", 2016);
        setShortField(term122983, term122983.getClass(), "month", (short) 11);
        setShortField(term122983, term122983.getClass(), "day", (short) 25);
        setField(term122982, term122982.getClass(), "date", term122983);
        setByteField(term122987, term122987.getClass(), "hour", (byte) 0);
        setByteField(term122987, term122987.getClass(), "minute", (byte) 48);
        setByteField(term122987, term122987.getClass(), "second", (byte) 33);
        setIntField(term122987, term122987.getClass(), "nano", 65903710);
        setField(term122982, term122982.getClass(), "time", term122987);
        setField(term122777, term122777.getClass(), "lastPlayDate", term122982);
        setIntField(term122777, term122777.getClass(), "lastPlaceId", -210438728);
        setField(term122777, term122777.getClass(), "lastPlaceName", "GropLwcnsd");
        setField(term122777, term122777.getClass(), "lastRegionId", "OPVlJKGGVY");
        setField(term122777, term122777.getClass(), "lastRegionName", "kcbEwUStJX");
        setField(term122777, term122777.getClass(), "lastAllNetId", "rbJDQpboBH");
        setField(term122777, term122777.getClass(), "lastClientId", "AJvPxKmklj");
        setField(term122775, term122775.getClass(), "user", term122777);
        setIntField(term122775, term122775.getClass(), "itemKind", -277514484);
        setIntField(term122775, term122775.getClass(), "itemId", 836110005);
        setIntField(term122775, term122775.getClass(), "stock", 1);
        setBooleanField(term122775, term122775.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemId", argTypes, term122775, args);
    }

};


