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

public class UserMusicDetail_equals_188359790538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104987;
     Object term105281;

    public UserMusicDetail_equals_188359790538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104993 = new Long(-1885698929232124806L);
        term104987 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term104989 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term104991 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term105007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105105 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105199 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term104987, term104987.getClass(), "id", -7721155272042062465L);
        setLongField(term104989, term104989.getClass(), "id", -3609905362646270267L);
        setLongField(term104991, term104991.getClass(), "id", -2000451137378760129L);
        setField(term104991, term104991.getClass(), "extId", term104993);
        setField(term104991, term104991.getClass(), "luid", "kCjOAdClxu");
        setIntField(term105008, term105008.getClass(), "year", 2017);
        setShortField(term105008, term105008.getClass(), "month", (short) 3);
        setShortField(term105008, term105008.getClass(), "day", (short) 9);
        setField(term105007, term105007.getClass(), "date", term105008);
        setByteField(term105012, term105012.getClass(), "hour", (byte) 4);
        setByteField(term105012, term105012.getClass(), "minute", (byte) 6);
        setByteField(term105012, term105012.getClass(), "second", (byte) 41);
        setIntField(term105012, term105012.getClass(), "nano", 312276445);
        setField(term105007, term105007.getClass(), "time", term105012);
        setField(term104991, term104991.getClass(), "registerTime", term105007);
        setIntField(term105018, term105018.getClass(), "year", 2026);
        setShortField(term105018, term105018.getClass(), "month", (short) 7);
        setShortField(term105018, term105018.getClass(), "day", (short) 11);
        setField(term105017, term105017.getClass(), "date", term105018);
        setByteField(term105022, term105022.getClass(), "hour", (byte) 9);
        setByteField(term105022, term105022.getClass(), "minute", (byte) 32);
        setByteField(term105022, term105022.getClass(), "second", (byte) 4);
        setIntField(term105022, term105022.getClass(), "nano", 550731760);
        setField(term105017, term105017.getClass(), "time", term105022);
        setField(term104991, term104991.getClass(), "accessTime", term105017);
        setField(term104989, term104989.getClass(), "card", term104991);
        setField(term104989, term104989.getClass(), "userName", "UqDmRiivsD");
        setIntField(term105040, term105040.getClass(), "year", 2022);
        setShortField(term105040, term105040.getClass(), "month", (short) 12);
        setShortField(term105040, term105040.getClass(), "day", (short) 25);
        setField(term105039, term105039.getClass(), "date", term105040);
        setByteField(term105044, term105044.getClass(), "hour", (byte) 14);
        setByteField(term105044, term105044.getClass(), "minute", (byte) 46);
        setByteField(term105044, term105044.getClass(), "second", (byte) 54);
        setIntField(term105044, term105044.getClass(), "nano", 646863896);
        setField(term105039, term105039.getClass(), "time", term105044);
        setField(term104989, term104989.getClass(), "lastLoginDate", term105039);
        setBooleanField(term104989, term104989.getClass(), "isWebJoin", false);
        setField(term104989, term104989.getClass(), "webLimitDate", "lbuoMbJEmY");
        setIntField(term104989, term104989.getClass(), "level", -600241671);
        setIntField(term104989, term104989.getClass(), "reincarnationNum", -1229610550);
        setField(term104989, term104989.getClass(), "exp", "mlYqXpLxYN");
        setLongField(term104989, term104989.getClass(), "point", 1101988351761375103L);
        setLongField(term104989, term104989.getClass(), "totalPoint", 3578367247532414586L);
        setIntField(term104989, term104989.getClass(), "playCount", 493486357);
        setIntField(term104989, term104989.getClass(), "multiPlayCount", 329514667);
        setIntField(term104989, term104989.getClass(), "multiWinCount", 1579294785);
        setIntField(term104989, term104989.getClass(), "requestResCount", 41910159);
        setIntField(term104989, term104989.getClass(), "acceptResCount", 2144178531);
        setIntField(term104989, term104989.getClass(), "successResCount", -1853902014);
        setIntField(term104989, term104989.getClass(), "playerRating", 1694299799);
        setIntField(term104989, term104989.getClass(), "highestRating", -1172188590);
        setIntField(term104989, term104989.getClass(), "nameplateId", 1811271159);
        setIntField(term104989, term104989.getClass(), "frameId", 534169620);
        setIntField(term104989, term104989.getClass(), "characterId", 1011698169);
        setIntField(term104989, term104989.getClass(), "trophyId", -1031068823);
        setIntField(term104989, term104989.getClass(), "playedTutorialBit", -1229282495);
        setIntField(term104989, term104989.getClass(), "firstTutorialCancelNum", 58488326);
        setIntField(term104989, term104989.getClass(), "masterTutorialCancelNum", -1178011877);
        setIntField(term104989, term104989.getClass(), "totalRepertoireCount", 1744976454);
        setIntField(term104989, term104989.getClass(), "totalMapNum", -501735949);
        setLongField(term104989, term104989.getClass(), "totalHiScore", -2559231705850769990L);
        setLongField(term104989, term104989.getClass(), "totalBasicHighScore", -1061715269956397020L);
        setLongField(term104989, term104989.getClass(), "totalAdvancedHighScore", -8348777841777993085L);
        setLongField(term104989, term104989.getClass(), "totalExpertHighScore", 3281687079413025082L);
        setLongField(term104989, term104989.getClass(), "totalMasterHighScore", -3122487376211578679L);
        setIntField(term105101, term105101.getClass(), "year", 2024);
        setShortField(term105101, term105101.getClass(), "month", (short) 11);
        setShortField(term105101, term105101.getClass(), "day", (short) 30);
        setField(term105100, term105100.getClass(), "date", term105101);
        setByteField(term105105, term105105.getClass(), "hour", (byte) 21);
        setByteField(term105105, term105105.getClass(), "minute", (byte) 11);
        setByteField(term105105, term105105.getClass(), "second", (byte) 39);
        setIntField(term105105, term105105.getClass(), "nano", 160428117);
        setField(term105100, term105100.getClass(), "time", term105105);
        setField(term104989, term104989.getClass(), "eventWatchedDate", term105100);
        setIntField(term104989, term104989.getClass(), "friendCount", 1633315544);
        setBooleanField(term104989, term104989.getClass(), "isMaimai", true);
        setField(term104989, term104989.getClass(), "firstGameId", "NUmCDjLJOd");
        setField(term104989, term104989.getClass(), "firstRomVersion", "miAgzoWkiV");
        setField(term104989, term104989.getClass(), "firstDataVersion", "teJJZHDWWb");
        setIntField(term105149, term105149.getClass(), "year", 2021);
        setShortField(term105149, term105149.getClass(), "month", (short) 9);
        setShortField(term105149, term105149.getClass(), "day", (short) 3);
        setField(term105148, term105148.getClass(), "date", term105149);
        setByteField(term105153, term105153.getClass(), "hour", (byte) 14);
        setByteField(term105153, term105153.getClass(), "minute", (byte) 19);
        setByteField(term105153, term105153.getClass(), "second", (byte) 24);
        setIntField(term105153, term105153.getClass(), "nano", 810013387);
        setField(term105148, term105148.getClass(), "time", term105153);
        setField(term104989, term104989.getClass(), "firstPlayDate", term105148);
        setField(term104989, term104989.getClass(), "lastGameId", "QDGurdhyNf");
        setField(term104989, term104989.getClass(), "lastRomVersion", "FnxmVYYBUu");
        setField(term104989, term104989.getClass(), "lastDataVersion", "FcaMVDYJay");
        setIntField(term105195, term105195.getClass(), "year", 2020);
        setShortField(term105195, term105195.getClass(), "month", (short) 5);
        setShortField(term105195, term105195.getClass(), "day", (short) 1);
        setField(term105194, term105194.getClass(), "date", term105195);
        setByteField(term105199, term105199.getClass(), "hour", (byte) 18);
        setByteField(term105199, term105199.getClass(), "minute", (byte) 14);
        setByteField(term105199, term105199.getClass(), "second", (byte) 55);
        setIntField(term105199, term105199.getClass(), "nano", 33109610);
        setField(term105194, term105194.getClass(), "time", term105199);
        setField(term104989, term104989.getClass(), "lastPlayDate", term105194);
        setIntField(term104989, term104989.getClass(), "lastPlaceId", 1699846026);
        setField(term104989, term104989.getClass(), "lastPlaceName", "pLLUuhaofY");
        setField(term104989, term104989.getClass(), "lastRegionId", "dCIHiLfkJL");
        setField(term104989, term104989.getClass(), "lastRegionName", "bMYsCPikwh");
        setField(term104989, term104989.getClass(), "lastAllNetId", "hZENcMRjJX");
        setField(term104989, term104989.getClass(), "lastClientId", "iUsNqPEgsp");
        setField(term104987, term104987.getClass(), "user", term104989);
        setIntField(term104987, term104987.getClass(), "musicId", -1144234812);
        setIntField(term104987, term104987.getClass(), "level", -2144123201);
        setIntField(term104987, term104987.getClass(), "playCount", 1436840858);
        setIntField(term104987, term104987.getClass(), "scoreMax", -2146939628);
        setIntField(term104987, term104987.getClass(), "resRequestCount", -1735999292);
        setIntField(term104987, term104987.getClass(), "resAcceptCount", 1978300005);
        setIntField(term104987, term104987.getClass(), "resSuccessCount", -495461794);
        setIntField(term104987, term104987.getClass(), "missCount", 1179148135);
        setIntField(term104987, term104987.getClass(), "maxComboCount", 1856832248);
        setBooleanField(term104987, term104987.getClass(), "isFullCombo", false);
        setBooleanField(term104987, term104987.getClass(), "isAllJustice", true);
        setBooleanField(term104987, term104987.getClass(), "isSuccess", false);
        setIntField(term104987, term104987.getClass(), "fullChain", 1112040940);
        setIntField(term104987, term104987.getClass(), "maxChain", -1289327826);
        setIntField(term104987, term104987.getClass(), "scoreRank", -1510240264);
        setBooleanField(term104987, term104987.getClass(), "isLock", false);
        term105281 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term105281;
        callMethod(klass, "equals", argTypes, term104987, args);
    }

};


