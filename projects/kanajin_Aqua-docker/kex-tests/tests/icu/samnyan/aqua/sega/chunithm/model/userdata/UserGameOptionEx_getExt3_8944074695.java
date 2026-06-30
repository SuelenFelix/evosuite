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

public class UserGameOptionEx_getExt3_8944074695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311823;

    public UserGameOptionEx_getExt3_8944074695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term311829 = new Long(8931772176819893873L);
        term311823 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term311825 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term311827 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term311843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311848 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311858 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term311984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term311985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term311989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312035 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term311823, term311823.getClass(), "id", -1774178372431419404L);
        setLongField(term311825, term311825.getClass(), "id", -5232167923670406765L);
        setLongField(term311827, term311827.getClass(), "id", 2839192734257680041L);
        setField(term311827, term311827.getClass(), "extId", term311829);
        setField(term311827, term311827.getClass(), "luid", "LoKsDbhNbo");
        setIntField(term311844, term311844.getClass(), "year", 2014);
        setShortField(term311844, term311844.getClass(), "month", (short) 10);
        setShortField(term311844, term311844.getClass(), "day", (short) 10);
        setField(term311843, term311843.getClass(), "date", term311844);
        setByteField(term311848, term311848.getClass(), "hour", (byte) 8);
        setByteField(term311848, term311848.getClass(), "minute", (byte) 51);
        setByteField(term311848, term311848.getClass(), "second", (byte) 54);
        setIntField(term311848, term311848.getClass(), "nano", 123493753);
        setField(term311843, term311843.getClass(), "time", term311848);
        setField(term311827, term311827.getClass(), "registerTime", term311843);
        setIntField(term311854, term311854.getClass(), "year", 2014);
        setShortField(term311854, term311854.getClass(), "month", (short) 8);
        setShortField(term311854, term311854.getClass(), "day", (short) 19);
        setField(term311853, term311853.getClass(), "date", term311854);
        setByteField(term311858, term311858.getClass(), "hour", (byte) 1);
        setByteField(term311858, term311858.getClass(), "minute", (byte) 39);
        setByteField(term311858, term311858.getClass(), "second", (byte) 36);
        setIntField(term311858, term311858.getClass(), "nano", 806963285);
        setField(term311853, term311853.getClass(), "time", term311858);
        setField(term311827, term311827.getClass(), "accessTime", term311853);
        setField(term311825, term311825.getClass(), "card", term311827);
        setField(term311825, term311825.getClass(), "userName", "GWRasXJpVB");
        setIntField(term311876, term311876.getClass(), "year", 2018);
        setShortField(term311876, term311876.getClass(), "month", (short) 1);
        setShortField(term311876, term311876.getClass(), "day", (short) 14);
        setField(term311875, term311875.getClass(), "date", term311876);
        setByteField(term311880, term311880.getClass(), "hour", (byte) 22);
        setByteField(term311880, term311880.getClass(), "minute", (byte) 57);
        setByteField(term311880, term311880.getClass(), "second", (byte) 10);
        setIntField(term311880, term311880.getClass(), "nano", 872798508);
        setField(term311875, term311875.getClass(), "time", term311880);
        setField(term311825, term311825.getClass(), "lastLoginDate", term311875);
        setBooleanField(term311825, term311825.getClass(), "isWebJoin", false);
        setField(term311825, term311825.getClass(), "webLimitDate", "NxETFVBNah");
        setIntField(term311825, term311825.getClass(), "level", 580491493);
        setIntField(term311825, term311825.getClass(), "reincarnationNum", 387297918);
        setField(term311825, term311825.getClass(), "exp", "djQXCEqeOZ");
        setLongField(term311825, term311825.getClass(), "point", -6632951164960930766L);
        setLongField(term311825, term311825.getClass(), "totalPoint", -5628065665330605775L);
        setIntField(term311825, term311825.getClass(), "playCount", -1932797129);
        setIntField(term311825, term311825.getClass(), "multiPlayCount", 58661935);
        setIntField(term311825, term311825.getClass(), "multiWinCount", -2141739997);
        setIntField(term311825, term311825.getClass(), "requestResCount", 1174212845);
        setIntField(term311825, term311825.getClass(), "acceptResCount", -836471847);
        setIntField(term311825, term311825.getClass(), "successResCount", -393198178);
        setIntField(term311825, term311825.getClass(), "playerRating", 1492611616);
        setIntField(term311825, term311825.getClass(), "highestRating", 1159845482);
        setIntField(term311825, term311825.getClass(), "nameplateId", -1320493702);
        setIntField(term311825, term311825.getClass(), "frameId", 352279226);
        setIntField(term311825, term311825.getClass(), "characterId", -405922040);
        setIntField(term311825, term311825.getClass(), "trophyId", 241363882);
        setIntField(term311825, term311825.getClass(), "playedTutorialBit", 207671794);
        setIntField(term311825, term311825.getClass(), "firstTutorialCancelNum", 1035622429);
        setIntField(term311825, term311825.getClass(), "masterTutorialCancelNum", 249486941);
        setIntField(term311825, term311825.getClass(), "totalRepertoireCount", 679500257);
        setIntField(term311825, term311825.getClass(), "totalMapNum", 1649482549);
        setLongField(term311825, term311825.getClass(), "totalHiScore", -3198795776779837753L);
        setLongField(term311825, term311825.getClass(), "totalBasicHighScore", -6404400134373703541L);
        setLongField(term311825, term311825.getClass(), "totalAdvancedHighScore", -797757766423223920L);
        setLongField(term311825, term311825.getClass(), "totalExpertHighScore", 2045688555375039671L);
        setLongField(term311825, term311825.getClass(), "totalMasterHighScore", -820715354224473286L);
        setIntField(term311937, term311937.getClass(), "year", 2022);
        setShortField(term311937, term311937.getClass(), "month", (short) 5);
        setShortField(term311937, term311937.getClass(), "day", (short) 31);
        setField(term311936, term311936.getClass(), "date", term311937);
        setByteField(term311941, term311941.getClass(), "hour", (byte) 12);
        setByteField(term311941, term311941.getClass(), "minute", (byte) 16);
        setByteField(term311941, term311941.getClass(), "second", (byte) 12);
        setIntField(term311941, term311941.getClass(), "nano", 175299957);
        setField(term311936, term311936.getClass(), "time", term311941);
        setField(term311825, term311825.getClass(), "eventWatchedDate", term311936);
        setIntField(term311825, term311825.getClass(), "friendCount", 140677496);
        setBooleanField(term311825, term311825.getClass(), "isMaimai", false);
        setField(term311825, term311825.getClass(), "firstGameId", "jQItbqdgru");
        setField(term311825, term311825.getClass(), "firstRomVersion", "eESpOcBzik");
        setField(term311825, term311825.getClass(), "firstDataVersion", "xTQmAOqrKo");
        setIntField(term311985, term311985.getClass(), "year", 2028);
        setShortField(term311985, term311985.getClass(), "month", (short) 8);
        setShortField(term311985, term311985.getClass(), "day", (short) 11);
        setField(term311984, term311984.getClass(), "date", term311985);
        setByteField(term311989, term311989.getClass(), "hour", (byte) 16);
        setByteField(term311989, term311989.getClass(), "minute", (byte) 9);
        setByteField(term311989, term311989.getClass(), "second", (byte) 40);
        setIntField(term311989, term311989.getClass(), "nano", 909974703);
        setField(term311984, term311984.getClass(), "time", term311989);
        setField(term311825, term311825.getClass(), "firstPlayDate", term311984);
        setField(term311825, term311825.getClass(), "lastGameId", "pJPSrRkLki");
        setField(term311825, term311825.getClass(), "lastRomVersion", "CctsyEvwWN");
        setField(term311825, term311825.getClass(), "lastDataVersion", "DZhtgksRJV");
        setIntField(term312031, term312031.getClass(), "year", 2016);
        setShortField(term312031, term312031.getClass(), "month", (short) 8);
        setShortField(term312031, term312031.getClass(), "day", (short) 17);
        setField(term312030, term312030.getClass(), "date", term312031);
        setByteField(term312035, term312035.getClass(), "hour", (byte) 13);
        setByteField(term312035, term312035.getClass(), "minute", (byte) 3);
        setByteField(term312035, term312035.getClass(), "second", (byte) 8);
        setIntField(term312035, term312035.getClass(), "nano", 607435854);
        setField(term312030, term312030.getClass(), "time", term312035);
        setField(term311825, term311825.getClass(), "lastPlayDate", term312030);
        setIntField(term311825, term311825.getClass(), "lastPlaceId", -1669492910);
        setField(term311825, term311825.getClass(), "lastPlaceName", "kEOZgldknG");
        setField(term311825, term311825.getClass(), "lastRegionId", "TgjFBWvVUx");
        setField(term311825, term311825.getClass(), "lastRegionName", "qyZMBaqUiw");
        setField(term311825, term311825.getClass(), "lastAllNetId", "LScHUVQpVE");
        setField(term311825, term311825.getClass(), "lastClientId", "FbQsgUOoDY");
        setField(term311823, term311823.getClass(), "user", term311825);
        setIntField(term311823, term311823.getClass(), "ext1", -200807801);
        setIntField(term311823, term311823.getClass(), "ext2", 2076815815);
        setIntField(term311823, term311823.getClass(), "ext3", -1877483268);
        setIntField(term311823, term311823.getClass(), "ext4", -896155047);
        setIntField(term311823, term311823.getClass(), "ext5", 671448927);
        setIntField(term311823, term311823.getClass(), "ext6", -1995125137);
        setIntField(term311823, term311823.getClass(), "ext7", 1052567802);
        setIntField(term311823, term311823.getClass(), "ext8", -823917574);
        setIntField(term311823, term311823.getClass(), "ext9", -2028837196);
        setIntField(term311823, term311823.getClass(), "ext10", -1509629142);
        setIntField(term311823, term311823.getClass(), "ext11", 319507405);
        setIntField(term311823, term311823.getClass(), "ext12", 435716326);
        setIntField(term311823, term311823.getClass(), "ext13", -1387319323);
        setIntField(term311823, term311823.getClass(), "ext14", 1676848994);
        setIntField(term311823, term311823.getClass(), "ext15", 1608056311);
        setIntField(term311823, term311823.getClass(), "ext16", 12015436);
        setIntField(term311823, term311823.getClass(), "ext17", 1451738148);
        setIntField(term311823, term311823.getClass(), "ext18", -502537377);
        setIntField(term311823, term311823.getClass(), "ext19", 324933257);
        setIntField(term311823, term311823.getClass(), "ext20", -1568921238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt3", argTypes, term311823, args);
    }

};


