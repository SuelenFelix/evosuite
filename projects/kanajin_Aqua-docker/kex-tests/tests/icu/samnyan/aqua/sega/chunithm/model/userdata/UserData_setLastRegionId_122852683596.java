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

public class UserData_setLastRegionId_122852683596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170645;

    public UserData_setLastRegionId_122852683596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170649 = new Long(4458302820344896046L);
        term170645 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term170647 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170700 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170761 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170804 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170805 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170809 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170855 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170645, term170645.getClass(), "id", -6852826463016078835L);
        setLongField(term170647, term170647.getClass(), "id", -1105029726312622544L);
        setField(term170647, term170647.getClass(), "extId", term170649);
        setField(term170647, term170647.getClass(), "luid", "bJOmNlfxjj");
        setIntField(term170664, term170664.getClass(), "year", 2017);
        setShortField(term170664, term170664.getClass(), "month", (short) 3);
        setShortField(term170664, term170664.getClass(), "day", (short) 11);
        setField(term170663, term170663.getClass(), "date", term170664);
        setByteField(term170668, term170668.getClass(), "hour", (byte) 1);
        setByteField(term170668, term170668.getClass(), "minute", (byte) 44);
        setByteField(term170668, term170668.getClass(), "second", (byte) 37);
        setIntField(term170668, term170668.getClass(), "nano", 310059951);
        setField(term170663, term170663.getClass(), "time", term170668);
        setField(term170647, term170647.getClass(), "registerTime", term170663);
        setIntField(term170674, term170674.getClass(), "year", 2029);
        setShortField(term170674, term170674.getClass(), "month", (short) 4);
        setShortField(term170674, term170674.getClass(), "day", (short) 13);
        setField(term170673, term170673.getClass(), "date", term170674);
        setByteField(term170678, term170678.getClass(), "hour", (byte) 17);
        setByteField(term170678, term170678.getClass(), "minute", (byte) 31);
        setByteField(term170678, term170678.getClass(), "second", (byte) 51);
        setIntField(term170678, term170678.getClass(), "nano", 645646484);
        setField(term170673, term170673.getClass(), "time", term170678);
        setField(term170647, term170647.getClass(), "accessTime", term170673);
        setField(term170645, term170645.getClass(), "card", term170647);
        setField(term170645, term170645.getClass(), "userName", "JSmvZTKhYV");
        setIntField(term170696, term170696.getClass(), "year", 2022);
        setShortField(term170696, term170696.getClass(), "month", (short) 9);
        setShortField(term170696, term170696.getClass(), "day", (short) 20);
        setField(term170695, term170695.getClass(), "date", term170696);
        setByteField(term170700, term170700.getClass(), "hour", (byte) 0);
        setByteField(term170700, term170700.getClass(), "minute", (byte) 54);
        setByteField(term170700, term170700.getClass(), "second", (byte) 26);
        setIntField(term170700, term170700.getClass(), "nano", 693173761);
        setField(term170695, term170695.getClass(), "time", term170700);
        setField(term170645, term170645.getClass(), "lastLoginDate", term170695);
        setBooleanField(term170645, term170645.getClass(), "isWebJoin", true);
        setField(term170645, term170645.getClass(), "webLimitDate", "jznZimNLoY");
        setIntField(term170645, term170645.getClass(), "level", 733566791);
        setIntField(term170645, term170645.getClass(), "reincarnationNum", 1116868023);
        setField(term170645, term170645.getClass(), "exp", "DbfCXKwAyh");
        setLongField(term170645, term170645.getClass(), "point", 6124417557876373592L);
        setLongField(term170645, term170645.getClass(), "totalPoint", -3951408454367699300L);
        setIntField(term170645, term170645.getClass(), "playCount", -880728130);
        setIntField(term170645, term170645.getClass(), "multiPlayCount", -931337079);
        setIntField(term170645, term170645.getClass(), "multiWinCount", 1123970734);
        setIntField(term170645, term170645.getClass(), "requestResCount", -649594954);
        setIntField(term170645, term170645.getClass(), "acceptResCount", 70645068);
        setIntField(term170645, term170645.getClass(), "successResCount", -151223836);
        setIntField(term170645, term170645.getClass(), "playerRating", 1752322336);
        setIntField(term170645, term170645.getClass(), "highestRating", 173612084);
        setIntField(term170645, term170645.getClass(), "nameplateId", 1186172025);
        setIntField(term170645, term170645.getClass(), "frameId", -323007757);
        setIntField(term170645, term170645.getClass(), "characterId", 1298918335);
        setIntField(term170645, term170645.getClass(), "trophyId", 669874346);
        setIntField(term170645, term170645.getClass(), "playedTutorialBit", -547487291);
        setIntField(term170645, term170645.getClass(), "firstTutorialCancelNum", 718172838);
        setIntField(term170645, term170645.getClass(), "masterTutorialCancelNum", 1520055684);
        setIntField(term170645, term170645.getClass(), "totalRepertoireCount", -2007202523);
        setIntField(term170645, term170645.getClass(), "totalMapNum", 2083513828);
        setLongField(term170645, term170645.getClass(), "totalHiScore", 9080921777701921013L);
        setLongField(term170645, term170645.getClass(), "totalBasicHighScore", -1374439556714560224L);
        setLongField(term170645, term170645.getClass(), "totalAdvancedHighScore", -6600873378715339777L);
        setLongField(term170645, term170645.getClass(), "totalExpertHighScore", -5693438879808590110L);
        setLongField(term170645, term170645.getClass(), "totalMasterHighScore", 8029601947786876260L);
        setIntField(term170757, term170757.getClass(), "year", 2015);
        setShortField(term170757, term170757.getClass(), "month", (short) 8);
        setShortField(term170757, term170757.getClass(), "day", (short) 27);
        setField(term170756, term170756.getClass(), "date", term170757);
        setByteField(term170761, term170761.getClass(), "hour", (byte) 11);
        setByteField(term170761, term170761.getClass(), "minute", (byte) 15);
        setByteField(term170761, term170761.getClass(), "second", (byte) 34);
        setIntField(term170761, term170761.getClass(), "nano", 42827370);
        setField(term170756, term170756.getClass(), "time", term170761);
        setField(term170645, term170645.getClass(), "eventWatchedDate", term170756);
        setIntField(term170645, term170645.getClass(), "friendCount", 1152264913);
        setBooleanField(term170645, term170645.getClass(), "isMaimai", false);
        setField(term170645, term170645.getClass(), "firstGameId", "QihtmYbuXW");
        setField(term170645, term170645.getClass(), "firstRomVersion", "qNPBjOrBfH");
        setField(term170645, term170645.getClass(), "firstDataVersion", "fPMPFECIlh");
        setIntField(term170805, term170805.getClass(), "year", 2022);
        setShortField(term170805, term170805.getClass(), "month", (short) 8);
        setShortField(term170805, term170805.getClass(), "day", (short) 25);
        setField(term170804, term170804.getClass(), "date", term170805);
        setByteField(term170809, term170809.getClass(), "hour", (byte) 3);
        setByteField(term170809, term170809.getClass(), "minute", (byte) 14);
        setByteField(term170809, term170809.getClass(), "second", (byte) 27);
        setIntField(term170809, term170809.getClass(), "nano", 388420417);
        setField(term170804, term170804.getClass(), "time", term170809);
        setField(term170645, term170645.getClass(), "firstPlayDate", term170804);
        setField(term170645, term170645.getClass(), "lastGameId", "IzCXTvJGuk");
        setField(term170645, term170645.getClass(), "lastRomVersion", "oKmmNJRrKQ");
        setField(term170645, term170645.getClass(), "lastDataVersion", "KRbaZxXHuA");
        setIntField(term170851, term170851.getClass(), "year", 2028);
        setShortField(term170851, term170851.getClass(), "month", (short) 5);
        setShortField(term170851, term170851.getClass(), "day", (short) 3);
        setField(term170850, term170850.getClass(), "date", term170851);
        setByteField(term170855, term170855.getClass(), "hour", (byte) 0);
        setByteField(term170855, term170855.getClass(), "minute", (byte) 10);
        setByteField(term170855, term170855.getClass(), "second", (byte) 12);
        setIntField(term170855, term170855.getClass(), "nano", 1962201);
        setField(term170850, term170850.getClass(), "time", term170855);
        setField(term170645, term170645.getClass(), "lastPlayDate", term170850);
        setIntField(term170645, term170645.getClass(), "lastPlaceId", -938013563);
        setField(term170645, term170645.getClass(), "lastPlaceName", "ubvofxfseb");
        setField(term170645, term170645.getClass(), "lastRegionId", "tyfceKrVos");
        setField(term170645, term170645.getClass(), "lastRegionName", "fvlLLikQLO");
        setField(term170645, term170645.getClass(), "lastAllNetId", "TGSSYDMNWY");
        setField(term170645, term170645.getClass(), "lastClientId", "GuRcyFWnot");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BWuJUuPVmd";
        callMethod(klass, "setLastRegionId", argTypes, term170645, args);
    }

};


