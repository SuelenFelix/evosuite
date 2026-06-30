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

public class UserCourse_getLastPlayDate_21361885714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919876;

    public UserCourse_getLastPlayDate_21361885714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1919882 = new Long(6115702104023062411L);
        term1919876 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1919878 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1919880 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1919896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919911 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1919989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1919990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1919994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920037 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920038 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920042 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920088 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1920163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1920164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1920168 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1919876, term1919876.getClass(), "id", 6485530445379563620L);
        setLongField(term1919878, term1919878.getClass(), "id", 920216627284774000L);
        setLongField(term1919880, term1919880.getClass(), "id", 5333453643619993356L);
        setField(term1919880, term1919880.getClass(), "extId", term1919882);
        setField(term1919880, term1919880.getClass(), "luid", "oqMrQQrrVL");
        setIntField(term1919897, term1919897.getClass(), "year", 2012);
        setShortField(term1919897, term1919897.getClass(), "month", (short) 4);
        setShortField(term1919897, term1919897.getClass(), "day", (short) 3);
        setField(term1919896, term1919896.getClass(), "date", term1919897);
        setByteField(term1919901, term1919901.getClass(), "hour", (byte) 8);
        setByteField(term1919901, term1919901.getClass(), "minute", (byte) 21);
        setByteField(term1919901, term1919901.getClass(), "second", (byte) 42);
        setIntField(term1919901, term1919901.getClass(), "nano", 444734702);
        setField(term1919896, term1919896.getClass(), "time", term1919901);
        setField(term1919880, term1919880.getClass(), "registerTime", term1919896);
        setIntField(term1919907, term1919907.getClass(), "year", 2020);
        setShortField(term1919907, term1919907.getClass(), "month", (short) 1);
        setShortField(term1919907, term1919907.getClass(), "day", (short) 14);
        setField(term1919906, term1919906.getClass(), "date", term1919907);
        setByteField(term1919911, term1919911.getClass(), "hour", (byte) 5);
        setByteField(term1919911, term1919911.getClass(), "minute", (byte) 11);
        setByteField(term1919911, term1919911.getClass(), "second", (byte) 49);
        setIntField(term1919911, term1919911.getClass(), "nano", 818156892);
        setField(term1919906, term1919906.getClass(), "time", term1919911);
        setField(term1919880, term1919880.getClass(), "accessTime", term1919906);
        setField(term1919878, term1919878.getClass(), "card", term1919880);
        setField(term1919878, term1919878.getClass(), "userName", "qvwFovEXqe");
        setIntField(term1919929, term1919929.getClass(), "year", 2016);
        setShortField(term1919929, term1919929.getClass(), "month", (short) 3);
        setShortField(term1919929, term1919929.getClass(), "day", (short) 16);
        setField(term1919928, term1919928.getClass(), "date", term1919929);
        setByteField(term1919933, term1919933.getClass(), "hour", (byte) 5);
        setByteField(term1919933, term1919933.getClass(), "minute", (byte) 50);
        setByteField(term1919933, term1919933.getClass(), "second", (byte) 13);
        setIntField(term1919933, term1919933.getClass(), "nano", 102220081);
        setField(term1919928, term1919928.getClass(), "time", term1919933);
        setField(term1919878, term1919878.getClass(), "lastLoginDate", term1919928);
        setBooleanField(term1919878, term1919878.getClass(), "isWebJoin", true);
        setField(term1919878, term1919878.getClass(), "webLimitDate", "OGCEmIHeNK");
        setIntField(term1919878, term1919878.getClass(), "level", -1413635424);
        setIntField(term1919878, term1919878.getClass(), "reincarnationNum", -26866418);
        setField(term1919878, term1919878.getClass(), "exp", "nwTBLyBkZs");
        setLongField(term1919878, term1919878.getClass(), "point", 4541247173435290555L);
        setLongField(term1919878, term1919878.getClass(), "totalPoint", -5495572424610292165L);
        setIntField(term1919878, term1919878.getClass(), "playCount", -1703133189);
        setIntField(term1919878, term1919878.getClass(), "multiPlayCount", 1379912649);
        setIntField(term1919878, term1919878.getClass(), "multiWinCount", 1422737368);
        setIntField(term1919878, term1919878.getClass(), "requestResCount", -754904275);
        setIntField(term1919878, term1919878.getClass(), "acceptResCount", 230879015);
        setIntField(term1919878, term1919878.getClass(), "successResCount", -1660198112);
        setIntField(term1919878, term1919878.getClass(), "playerRating", 1640859322);
        setIntField(term1919878, term1919878.getClass(), "highestRating", -344414049);
        setIntField(term1919878, term1919878.getClass(), "nameplateId", -1001055919);
        setIntField(term1919878, term1919878.getClass(), "frameId", 966779989);
        setIntField(term1919878, term1919878.getClass(), "characterId", 39133792);
        setIntField(term1919878, term1919878.getClass(), "trophyId", -88377996);
        setIntField(term1919878, term1919878.getClass(), "playedTutorialBit", -1261868431);
        setIntField(term1919878, term1919878.getClass(), "firstTutorialCancelNum", -2111419080);
        setIntField(term1919878, term1919878.getClass(), "masterTutorialCancelNum", 36688263);
        setIntField(term1919878, term1919878.getClass(), "totalRepertoireCount", -772462148);
        setIntField(term1919878, term1919878.getClass(), "totalMapNum", 544734454);
        setLongField(term1919878, term1919878.getClass(), "totalHiScore", -9173017432952704525L);
        setLongField(term1919878, term1919878.getClass(), "totalBasicHighScore", -7175862030913636203L);
        setLongField(term1919878, term1919878.getClass(), "totalAdvancedHighScore", -7596170267118467628L);
        setLongField(term1919878, term1919878.getClass(), "totalExpertHighScore", -2713724478247953315L);
        setLongField(term1919878, term1919878.getClass(), "totalMasterHighScore", -70576793097430913L);
        setIntField(term1919990, term1919990.getClass(), "year", 2012);
        setShortField(term1919990, term1919990.getClass(), "month", (short) 2);
        setShortField(term1919990, term1919990.getClass(), "day", (short) 26);
        setField(term1919989, term1919989.getClass(), "date", term1919990);
        setByteField(term1919994, term1919994.getClass(), "hour", (byte) 13);
        setByteField(term1919994, term1919994.getClass(), "minute", (byte) 13);
        setByteField(term1919994, term1919994.getClass(), "second", (byte) 12);
        setIntField(term1919994, term1919994.getClass(), "nano", 305314101);
        setField(term1919989, term1919989.getClass(), "time", term1919994);
        setField(term1919878, term1919878.getClass(), "eventWatchedDate", term1919989);
        setIntField(term1919878, term1919878.getClass(), "friendCount", 804780804);
        setBooleanField(term1919878, term1919878.getClass(), "isMaimai", false);
        setField(term1919878, term1919878.getClass(), "firstGameId", "NvtLNKWNpR");
        setField(term1919878, term1919878.getClass(), "firstRomVersion", "TKgMixLQJa");
        setField(term1919878, term1919878.getClass(), "firstDataVersion", "SNCecnOiGg");
        setIntField(term1920038, term1920038.getClass(), "year", 2010);
        setShortField(term1920038, term1920038.getClass(), "month", (short) 7);
        setShortField(term1920038, term1920038.getClass(), "day", (short) 4);
        setField(term1920037, term1920037.getClass(), "date", term1920038);
        setByteField(term1920042, term1920042.getClass(), "hour", (byte) 21);
        setByteField(term1920042, term1920042.getClass(), "minute", (byte) 11);
        setByteField(term1920042, term1920042.getClass(), "second", (byte) 23);
        setIntField(term1920042, term1920042.getClass(), "nano", 247125018);
        setField(term1920037, term1920037.getClass(), "time", term1920042);
        setField(term1919878, term1919878.getClass(), "firstPlayDate", term1920037);
        setField(term1919878, term1919878.getClass(), "lastGameId", "VSjkgFDjfl");
        setField(term1919878, term1919878.getClass(), "lastRomVersion", "aQyMsUPeIH");
        setField(term1919878, term1919878.getClass(), "lastDataVersion", "nPeqrCmhpD");
        setIntField(term1920084, term1920084.getClass(), "year", 2015);
        setShortField(term1920084, term1920084.getClass(), "month", (short) 5);
        setShortField(term1920084, term1920084.getClass(), "day", (short) 1);
        setField(term1920083, term1920083.getClass(), "date", term1920084);
        setByteField(term1920088, term1920088.getClass(), "hour", (byte) 6);
        setByteField(term1920088, term1920088.getClass(), "minute", (byte) 27);
        setByteField(term1920088, term1920088.getClass(), "second", (byte) 49);
        setIntField(term1920088, term1920088.getClass(), "nano", 511085557);
        setField(term1920083, term1920083.getClass(), "time", term1920088);
        setField(term1919878, term1919878.getClass(), "lastPlayDate", term1920083);
        setIntField(term1919878, term1919878.getClass(), "lastPlaceId", 1103639939);
        setField(term1919878, term1919878.getClass(), "lastPlaceName", "bcoaApoRyq");
        setField(term1919878, term1919878.getClass(), "lastRegionId", "MMvuTBjaRO");
        setField(term1919878, term1919878.getClass(), "lastRegionName", "yQDkachBbn");
        setField(term1919878, term1919878.getClass(), "lastAllNetId", "JiMBWbcQmH");
        setField(term1919878, term1919878.getClass(), "lastClientId", "XTwpAFuVgG");
        setField(term1919876, term1919876.getClass(), "user", term1919878);
        setIntField(term1919876, term1919876.getClass(), "courseId", 377148270);
        setIntField(term1919876, term1919876.getClass(), "classId", 1148568533);
        setIntField(term1919876, term1919876.getClass(), "playCount", -1167536924);
        setIntField(term1919876, term1919876.getClass(), "scoreMax", -152363917);
        setBooleanField(term1919876, term1919876.getClass(), "isFullCombo", true);
        setBooleanField(term1919876, term1919876.getClass(), "isAllJustice", true);
        setBooleanField(term1919876, term1919876.getClass(), "isSuccess", true);
        setIntField(term1919876, term1919876.getClass(), "scoreRank", -913559925);
        setIntField(term1919876, term1919876.getClass(), "eventId", -300678683);
        setIntField(term1920164, term1920164.getClass(), "year", 2013);
        setShortField(term1920164, term1920164.getClass(), "month", (short) 1);
        setShortField(term1920164, term1920164.getClass(), "day", (short) 3);
        setField(term1920163, term1920163.getClass(), "date", term1920164);
        setByteField(term1920168, term1920168.getClass(), "hour", (byte) 16);
        setByteField(term1920168, term1920168.getClass(), "minute", (byte) 39);
        setByteField(term1920168, term1920168.getClass(), "second", (byte) 19);
        setIntField(term1920168, term1920168.getClass(), "nano", 328786605);
        setField(term1920163, term1920163.getClass(), "time", term1920168);
        setField(term1919876, term1919876.getClass(), "lastPlayDate", term1920163);
        setIntField(term1919876, term1919876.getClass(), "param1", -273519943);
        setIntField(term1919876, term1919876.getClass(), "param2", 1597553334);
        setIntField(term1919876, term1919876.getClass(), "param3", -1961405566);
        setIntField(term1919876, term1919876.getClass(), "param4", 856646249);
        setBooleanField(term1919876, term1919876.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term1919876, args);
    }

};


