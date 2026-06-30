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

public class UserCourse_getParam4_64360647118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1921684;

    public UserCourse_getParam4_64360647118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1921690 = new Long(-9065147632457577345L);
        term1921684 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1921686 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1921688 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1921704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1921705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1921709 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1921714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1921715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1921719 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1921736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1921737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1921741 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1921797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1921798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1921802 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1921845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1921846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1921850 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1921891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1921892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1921896 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1921971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1921972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1921976 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1921684, term1921684.getClass(), "id", 1287796110897749250L);
        setLongField(term1921686, term1921686.getClass(), "id", 4452782675059171661L);
        setLongField(term1921688, term1921688.getClass(), "id", 6471054768877734804L);
        setField(term1921688, term1921688.getClass(), "extId", term1921690);
        setField(term1921688, term1921688.getClass(), "luid", "ptvFIfEgNJ");
        setIntField(term1921705, term1921705.getClass(), "year", 2015);
        setShortField(term1921705, term1921705.getClass(), "month", (short) 10);
        setShortField(term1921705, term1921705.getClass(), "day", (short) 11);
        setField(term1921704, term1921704.getClass(), "date", term1921705);
        setByteField(term1921709, term1921709.getClass(), "hour", (byte) 0);
        setByteField(term1921709, term1921709.getClass(), "minute", (byte) 42);
        setByteField(term1921709, term1921709.getClass(), "second", (byte) 19);
        setIntField(term1921709, term1921709.getClass(), "nano", 164514327);
        setField(term1921704, term1921704.getClass(), "time", term1921709);
        setField(term1921688, term1921688.getClass(), "registerTime", term1921704);
        setIntField(term1921715, term1921715.getClass(), "year", 2013);
        setShortField(term1921715, term1921715.getClass(), "month", (short) 4);
        setShortField(term1921715, term1921715.getClass(), "day", (short) 27);
        setField(term1921714, term1921714.getClass(), "date", term1921715);
        setByteField(term1921719, term1921719.getClass(), "hour", (byte) 19);
        setByteField(term1921719, term1921719.getClass(), "minute", (byte) 32);
        setByteField(term1921719, term1921719.getClass(), "second", (byte) 17);
        setIntField(term1921719, term1921719.getClass(), "nano", 665386519);
        setField(term1921714, term1921714.getClass(), "time", term1921719);
        setField(term1921688, term1921688.getClass(), "accessTime", term1921714);
        setField(term1921686, term1921686.getClass(), "card", term1921688);
        setField(term1921686, term1921686.getClass(), "userName", "cMUEqJJuOQ");
        setIntField(term1921737, term1921737.getClass(), "year", 2013);
        setShortField(term1921737, term1921737.getClass(), "month", (short) 4);
        setShortField(term1921737, term1921737.getClass(), "day", (short) 17);
        setField(term1921736, term1921736.getClass(), "date", term1921737);
        setByteField(term1921741, term1921741.getClass(), "hour", (byte) 3);
        setByteField(term1921741, term1921741.getClass(), "minute", (byte) 19);
        setByteField(term1921741, term1921741.getClass(), "second", (byte) 31);
        setIntField(term1921741, term1921741.getClass(), "nano", 139426903);
        setField(term1921736, term1921736.getClass(), "time", term1921741);
        setField(term1921686, term1921686.getClass(), "lastLoginDate", term1921736);
        setBooleanField(term1921686, term1921686.getClass(), "isWebJoin", false);
        setField(term1921686, term1921686.getClass(), "webLimitDate", "nVaDhcPiof");
        setIntField(term1921686, term1921686.getClass(), "level", 1892031800);
        setIntField(term1921686, term1921686.getClass(), "reincarnationNum", -2015845928);
        setField(term1921686, term1921686.getClass(), "exp", "kKWTeqelcV");
        setLongField(term1921686, term1921686.getClass(), "point", -9151002295388904721L);
        setLongField(term1921686, term1921686.getClass(), "totalPoint", 3498537933490908805L);
        setIntField(term1921686, term1921686.getClass(), "playCount", 2494427);
        setIntField(term1921686, term1921686.getClass(), "multiPlayCount", 669864275);
        setIntField(term1921686, term1921686.getClass(), "multiWinCount", -1151569506);
        setIntField(term1921686, term1921686.getClass(), "requestResCount", 789438733);
        setIntField(term1921686, term1921686.getClass(), "acceptResCount", 407044092);
        setIntField(term1921686, term1921686.getClass(), "successResCount", -1536369341);
        setIntField(term1921686, term1921686.getClass(), "playerRating", -1117160745);
        setIntField(term1921686, term1921686.getClass(), "highestRating", -817449978);
        setIntField(term1921686, term1921686.getClass(), "nameplateId", -157150821);
        setIntField(term1921686, term1921686.getClass(), "frameId", 1890912448);
        setIntField(term1921686, term1921686.getClass(), "characterId", 122264246);
        setIntField(term1921686, term1921686.getClass(), "trophyId", 1520143356);
        setIntField(term1921686, term1921686.getClass(), "playedTutorialBit", 1750931957);
        setIntField(term1921686, term1921686.getClass(), "firstTutorialCancelNum", 999683384);
        setIntField(term1921686, term1921686.getClass(), "masterTutorialCancelNum", -1179041412);
        setIntField(term1921686, term1921686.getClass(), "totalRepertoireCount", -1861094651);
        setIntField(term1921686, term1921686.getClass(), "totalMapNum", -717475219);
        setLongField(term1921686, term1921686.getClass(), "totalHiScore", 3424785834104954244L);
        setLongField(term1921686, term1921686.getClass(), "totalBasicHighScore", -815995385500021365L);
        setLongField(term1921686, term1921686.getClass(), "totalAdvancedHighScore", 2361236908800538469L);
        setLongField(term1921686, term1921686.getClass(), "totalExpertHighScore", -4672058112310472624L);
        setLongField(term1921686, term1921686.getClass(), "totalMasterHighScore", 5222026754942565922L);
        setIntField(term1921798, term1921798.getClass(), "year", 2017);
        setShortField(term1921798, term1921798.getClass(), "month", (short) 7);
        setShortField(term1921798, term1921798.getClass(), "day", (short) 25);
        setField(term1921797, term1921797.getClass(), "date", term1921798);
        setByteField(term1921802, term1921802.getClass(), "hour", (byte) 13);
        setByteField(term1921802, term1921802.getClass(), "minute", (byte) 34);
        setByteField(term1921802, term1921802.getClass(), "second", (byte) 15);
        setIntField(term1921802, term1921802.getClass(), "nano", 333336406);
        setField(term1921797, term1921797.getClass(), "time", term1921802);
        setField(term1921686, term1921686.getClass(), "eventWatchedDate", term1921797);
        setIntField(term1921686, term1921686.getClass(), "friendCount", 91203011);
        setBooleanField(term1921686, term1921686.getClass(), "isMaimai", true);
        setField(term1921686, term1921686.getClass(), "firstGameId", "QnGDkZKXXR");
        setField(term1921686, term1921686.getClass(), "firstRomVersion", "yKPmdRJTsT");
        setField(term1921686, term1921686.getClass(), "firstDataVersion", "kYlyPMgQAW");
        setIntField(term1921846, term1921846.getClass(), "year", 2018);
        setShortField(term1921846, term1921846.getClass(), "month", (short) 6);
        setShortField(term1921846, term1921846.getClass(), "day", (short) 26);
        setField(term1921845, term1921845.getClass(), "date", term1921846);
        setByteField(term1921850, term1921850.getClass(), "hour", (byte) 19);
        setByteField(term1921850, term1921850.getClass(), "minute", (byte) 40);
        setByteField(term1921850, term1921850.getClass(), "second", (byte) 54);
        setIntField(term1921850, term1921850.getClass(), "nano", 125276671);
        setField(term1921845, term1921845.getClass(), "time", term1921850);
        setField(term1921686, term1921686.getClass(), "firstPlayDate", term1921845);
        setField(term1921686, term1921686.getClass(), "lastGameId", "DJNtAyxqZG");
        setField(term1921686, term1921686.getClass(), "lastRomVersion", "NZPPLYYSsh");
        setField(term1921686, term1921686.getClass(), "lastDataVersion", "UHSnbyePGh");
        setIntField(term1921892, term1921892.getClass(), "year", 2016);
        setShortField(term1921892, term1921892.getClass(), "month", (short) 1);
        setShortField(term1921892, term1921892.getClass(), "day", (short) 8);
        setField(term1921891, term1921891.getClass(), "date", term1921892);
        setByteField(term1921896, term1921896.getClass(), "hour", (byte) 17);
        setByteField(term1921896, term1921896.getClass(), "minute", (byte) 22);
        setByteField(term1921896, term1921896.getClass(), "second", (byte) 1);
        setIntField(term1921896, term1921896.getClass(), "nano", 753332306);
        setField(term1921891, term1921891.getClass(), "time", term1921896);
        setField(term1921686, term1921686.getClass(), "lastPlayDate", term1921891);
        setIntField(term1921686, term1921686.getClass(), "lastPlaceId", 588258700);
        setField(term1921686, term1921686.getClass(), "lastPlaceName", "EizboHWfWA");
        setField(term1921686, term1921686.getClass(), "lastRegionId", "iLBtyWZrCd");
        setField(term1921686, term1921686.getClass(), "lastRegionName", "nUGNKNNBpy");
        setField(term1921686, term1921686.getClass(), "lastAllNetId", "OWNVsMcphJ");
        setField(term1921686, term1921686.getClass(), "lastClientId", "HyOiQKxqdg");
        setField(term1921684, term1921684.getClass(), "user", term1921686);
        setIntField(term1921684, term1921684.getClass(), "courseId", 832279481);
        setIntField(term1921684, term1921684.getClass(), "classId", -2141630121);
        setIntField(term1921684, term1921684.getClass(), "playCount", 1553500514);
        setIntField(term1921684, term1921684.getClass(), "scoreMax", 97718885);
        setBooleanField(term1921684, term1921684.getClass(), "isFullCombo", true);
        setBooleanField(term1921684, term1921684.getClass(), "isAllJustice", false);
        setBooleanField(term1921684, term1921684.getClass(), "isSuccess", false);
        setIntField(term1921684, term1921684.getClass(), "scoreRank", 1795921688);
        setIntField(term1921684, term1921684.getClass(), "eventId", 1495538707);
        setIntField(term1921972, term1921972.getClass(), "year", 2012);
        setShortField(term1921972, term1921972.getClass(), "month", (short) 7);
        setShortField(term1921972, term1921972.getClass(), "day", (short) 24);
        setField(term1921971, term1921971.getClass(), "date", term1921972);
        setByteField(term1921976, term1921976.getClass(), "hour", (byte) 2);
        setByteField(term1921976, term1921976.getClass(), "minute", (byte) 23);
        setByteField(term1921976, term1921976.getClass(), "second", (byte) 19);
        setIntField(term1921976, term1921976.getClass(), "nano", 760970943);
        setField(term1921971, term1921971.getClass(), "time", term1921976);
        setField(term1921684, term1921684.getClass(), "lastPlayDate", term1921971);
        setIntField(term1921684, term1921684.getClass(), "param1", -852761205);
        setIntField(term1921684, term1921684.getClass(), "param2", 1358572235);
        setIntField(term1921684, term1921684.getClass(), "param3", -1989575509);
        setIntField(term1921684, term1921684.getClass(), "param4", -1358412194);
        setBooleanField(term1921684, term1921684.getClass(), "isClear", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam4", argTypes, term1921684, args);
    }

};


