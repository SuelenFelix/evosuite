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

public class UserCourse_getPlayCount_14300613277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1916712;

    public UserCourse_getPlayCount_14300613277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1916718 = new Long(-1732771393859471811L);
        term1916712 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1916714 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1916716 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1916732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916737 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916742 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916747 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916769 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916830 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916878 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916924 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1917000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1917004 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1916712, term1916712.getClass(), "id", -4813431311216378737L);
        setLongField(term1916714, term1916714.getClass(), "id", 1791353883632398134L);
        setLongField(term1916716, term1916716.getClass(), "id", 5779567655266093831L);
        setField(term1916716, term1916716.getClass(), "extId", term1916718);
        setField(term1916716, term1916716.getClass(), "luid", "dJrqbDvwyV");
        setIntField(term1916733, term1916733.getClass(), "year", 2025);
        setShortField(term1916733, term1916733.getClass(), "month", (short) 12);
        setShortField(term1916733, term1916733.getClass(), "day", (short) 11);
        setField(term1916732, term1916732.getClass(), "date", term1916733);
        setByteField(term1916737, term1916737.getClass(), "hour", (byte) 7);
        setByteField(term1916737, term1916737.getClass(), "minute", (byte) 49);
        setByteField(term1916737, term1916737.getClass(), "second", (byte) 2);
        setIntField(term1916737, term1916737.getClass(), "nano", 56309546);
        setField(term1916732, term1916732.getClass(), "time", term1916737);
        setField(term1916716, term1916716.getClass(), "registerTime", term1916732);
        setIntField(term1916743, term1916743.getClass(), "year", 2024);
        setShortField(term1916743, term1916743.getClass(), "month", (short) 2);
        setShortField(term1916743, term1916743.getClass(), "day", (short) 14);
        setField(term1916742, term1916742.getClass(), "date", term1916743);
        setByteField(term1916747, term1916747.getClass(), "hour", (byte) 20);
        setByteField(term1916747, term1916747.getClass(), "minute", (byte) 53);
        setByteField(term1916747, term1916747.getClass(), "second", (byte) 45);
        setIntField(term1916747, term1916747.getClass(), "nano", 332492248);
        setField(term1916742, term1916742.getClass(), "time", term1916747);
        setField(term1916716, term1916716.getClass(), "accessTime", term1916742);
        setField(term1916714, term1916714.getClass(), "card", term1916716);
        setField(term1916714, term1916714.getClass(), "userName", "yrAZRwcgfh");
        setIntField(term1916765, term1916765.getClass(), "year", 2012);
        setShortField(term1916765, term1916765.getClass(), "month", (short) 8);
        setShortField(term1916765, term1916765.getClass(), "day", (short) 22);
        setField(term1916764, term1916764.getClass(), "date", term1916765);
        setByteField(term1916769, term1916769.getClass(), "hour", (byte) 11);
        setByteField(term1916769, term1916769.getClass(), "minute", (byte) 5);
        setByteField(term1916769, term1916769.getClass(), "second", (byte) 26);
        setIntField(term1916769, term1916769.getClass(), "nano", 602156560);
        setField(term1916764, term1916764.getClass(), "time", term1916769);
        setField(term1916714, term1916714.getClass(), "lastLoginDate", term1916764);
        setBooleanField(term1916714, term1916714.getClass(), "isWebJoin", true);
        setField(term1916714, term1916714.getClass(), "webLimitDate", "DLndfvBGRN");
        setIntField(term1916714, term1916714.getClass(), "level", -1819792612);
        setIntField(term1916714, term1916714.getClass(), "reincarnationNum", -100082730);
        setField(term1916714, term1916714.getClass(), "exp", "AUjYnIPItz");
        setLongField(term1916714, term1916714.getClass(), "point", 1372157791855776103L);
        setLongField(term1916714, term1916714.getClass(), "totalPoint", -6128141043781648098L);
        setIntField(term1916714, term1916714.getClass(), "playCount", 180851744);
        setIntField(term1916714, term1916714.getClass(), "multiPlayCount", -1220002471);
        setIntField(term1916714, term1916714.getClass(), "multiWinCount", -2014875645);
        setIntField(term1916714, term1916714.getClass(), "requestResCount", -1007371862);
        setIntField(term1916714, term1916714.getClass(), "acceptResCount", -1872866012);
        setIntField(term1916714, term1916714.getClass(), "successResCount", -243843303);
        setIntField(term1916714, term1916714.getClass(), "playerRating", -832988464);
        setIntField(term1916714, term1916714.getClass(), "highestRating", -182200923);
        setIntField(term1916714, term1916714.getClass(), "nameplateId", 384725985);
        setIntField(term1916714, term1916714.getClass(), "frameId", -1129809812);
        setIntField(term1916714, term1916714.getClass(), "characterId", -383500257);
        setIntField(term1916714, term1916714.getClass(), "trophyId", 1051619797);
        setIntField(term1916714, term1916714.getClass(), "playedTutorialBit", -1818654338);
        setIntField(term1916714, term1916714.getClass(), "firstTutorialCancelNum", -1020326766);
        setIntField(term1916714, term1916714.getClass(), "masterTutorialCancelNum", 1655720608);
        setIntField(term1916714, term1916714.getClass(), "totalRepertoireCount", 914755250);
        setIntField(term1916714, term1916714.getClass(), "totalMapNum", 1718885968);
        setLongField(term1916714, term1916714.getClass(), "totalHiScore", -679290419619427997L);
        setLongField(term1916714, term1916714.getClass(), "totalBasicHighScore", -7260894147390365201L);
        setLongField(term1916714, term1916714.getClass(), "totalAdvancedHighScore", 8390870958245157498L);
        setLongField(term1916714, term1916714.getClass(), "totalExpertHighScore", -6870200723158434236L);
        setLongField(term1916714, term1916714.getClass(), "totalMasterHighScore", -6342056246660572005L);
        setIntField(term1916826, term1916826.getClass(), "year", 2019);
        setShortField(term1916826, term1916826.getClass(), "month", (short) 7);
        setShortField(term1916826, term1916826.getClass(), "day", (short) 9);
        setField(term1916825, term1916825.getClass(), "date", term1916826);
        setByteField(term1916830, term1916830.getClass(), "hour", (byte) 7);
        setByteField(term1916830, term1916830.getClass(), "minute", (byte) 37);
        setByteField(term1916830, term1916830.getClass(), "second", (byte) 55);
        setIntField(term1916830, term1916830.getClass(), "nano", 875375973);
        setField(term1916825, term1916825.getClass(), "time", term1916830);
        setField(term1916714, term1916714.getClass(), "eventWatchedDate", term1916825);
        setIntField(term1916714, term1916714.getClass(), "friendCount", -635377333);
        setBooleanField(term1916714, term1916714.getClass(), "isMaimai", false);
        setField(term1916714, term1916714.getClass(), "firstGameId", "bYySRUzWrx");
        setField(term1916714, term1916714.getClass(), "firstRomVersion", "NNlzvnkMro");
        setField(term1916714, term1916714.getClass(), "firstDataVersion", "HDsCcQlPof");
        setIntField(term1916874, term1916874.getClass(), "year", 2029);
        setShortField(term1916874, term1916874.getClass(), "month", (short) 5);
        setShortField(term1916874, term1916874.getClass(), "day", (short) 28);
        setField(term1916873, term1916873.getClass(), "date", term1916874);
        setByteField(term1916878, term1916878.getClass(), "hour", (byte) 0);
        setByteField(term1916878, term1916878.getClass(), "minute", (byte) 50);
        setByteField(term1916878, term1916878.getClass(), "second", (byte) 4);
        setIntField(term1916878, term1916878.getClass(), "nano", 534146317);
        setField(term1916873, term1916873.getClass(), "time", term1916878);
        setField(term1916714, term1916714.getClass(), "firstPlayDate", term1916873);
        setField(term1916714, term1916714.getClass(), "lastGameId", "huggWrVWwe");
        setField(term1916714, term1916714.getClass(), "lastRomVersion", "flRcCHbNJy");
        setField(term1916714, term1916714.getClass(), "lastDataVersion", "ixVWnJbdST");
        setIntField(term1916920, term1916920.getClass(), "year", 2020);
        setShortField(term1916920, term1916920.getClass(), "month", (short) 9);
        setShortField(term1916920, term1916920.getClass(), "day", (short) 25);
        setField(term1916919, term1916919.getClass(), "date", term1916920);
        setByteField(term1916924, term1916924.getClass(), "hour", (byte) 2);
        setByteField(term1916924, term1916924.getClass(), "minute", (byte) 6);
        setByteField(term1916924, term1916924.getClass(), "second", (byte) 45);
        setIntField(term1916924, term1916924.getClass(), "nano", 309482408);
        setField(term1916919, term1916919.getClass(), "time", term1916924);
        setField(term1916714, term1916714.getClass(), "lastPlayDate", term1916919);
        setIntField(term1916714, term1916714.getClass(), "lastPlaceId", -2059770925);
        setField(term1916714, term1916714.getClass(), "lastPlaceName", "yBGnskuOrv");
        setField(term1916714, term1916714.getClass(), "lastRegionId", "ohHApiXWCF");
        setField(term1916714, term1916714.getClass(), "lastRegionName", "FoYeweghFk");
        setField(term1916714, term1916714.getClass(), "lastAllNetId", "mYSwMtcuGG");
        setField(term1916714, term1916714.getClass(), "lastClientId", "bMGqQMWueW");
        setField(term1916712, term1916712.getClass(), "user", term1916714);
        setIntField(term1916712, term1916712.getClass(), "courseId", -1738400107);
        setIntField(term1916712, term1916712.getClass(), "classId", -1351071177);
        setIntField(term1916712, term1916712.getClass(), "playCount", -1125193370);
        setIntField(term1916712, term1916712.getClass(), "scoreMax", 572171538);
        setBooleanField(term1916712, term1916712.getClass(), "isFullCombo", true);
        setBooleanField(term1916712, term1916712.getClass(), "isAllJustice", false);
        setBooleanField(term1916712, term1916712.getClass(), "isSuccess", true);
        setIntField(term1916712, term1916712.getClass(), "scoreRank", 805305450);
        setIntField(term1916712, term1916712.getClass(), "eventId", 156727112);
        setIntField(term1917000, term1917000.getClass(), "year", 2025);
        setShortField(term1917000, term1917000.getClass(), "month", (short) 11);
        setShortField(term1917000, term1917000.getClass(), "day", (short) 22);
        setField(term1916999, term1916999.getClass(), "date", term1917000);
        setByteField(term1917004, term1917004.getClass(), "hour", (byte) 8);
        setByteField(term1917004, term1917004.getClass(), "minute", (byte) 59);
        setByteField(term1917004, term1917004.getClass(), "second", (byte) 34);
        setIntField(term1917004, term1917004.getClass(), "nano", 987393594);
        setField(term1916999, term1916999.getClass(), "time", term1917004);
        setField(term1916712, term1916712.getClass(), "lastPlayDate", term1916999);
        setIntField(term1916712, term1916712.getClass(), "param1", -1262220137);
        setIntField(term1916712, term1916712.getClass(), "param2", -1326983980);
        setIntField(term1916712, term1916712.getClass(), "param3", 920590756);
        setIntField(term1916712, term1916712.getClass(), "param4", 2027104940);
        setBooleanField(term1916712, term1916712.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term1916712, args);
    }

};


