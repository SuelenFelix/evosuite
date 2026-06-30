package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class ExternalUserData_setTotalExpertHighScore_112434905779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31828;
     Object term32079;

    public ExternalUserData_setTotalExpertHighScore_112434905779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31828 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term31853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31858 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31962 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31963 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31967 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32013 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31828, term31828.getClass(), "accessCode", "QaoYFZhScg");
        setField(term31828, term31828.getClass(), "userName", "UTvXIenLCR");
        setIntField(term31854, term31854.getClass(), "year", 2017);
        setShortField(term31854, term31854.getClass(), "month", (short) 8);
        setShortField(term31854, term31854.getClass(), "day", (short) 30);
        setField(term31853, term31853.getClass(), "date", term31854);
        setByteField(term31858, term31858.getClass(), "hour", (byte) 3);
        setByteField(term31858, term31858.getClass(), "minute", (byte) 48);
        setByteField(term31858, term31858.getClass(), "second", (byte) 37);
        setIntField(term31858, term31858.getClass(), "nano", 121640121);
        setField(term31853, term31853.getClass(), "time", term31858);
        setField(term31828, term31828.getClass(), "lastLoginDate", term31853);
        setBooleanField(term31828, term31828.getClass(), "isWebJoin", false);
        setField(term31828, term31828.getClass(), "webLimitDate", "PLeKpWaxhQ");
        setIntField(term31828, term31828.getClass(), "level", -400720912);
        setIntField(term31828, term31828.getClass(), "reincarnationNum", 1266192397);
        setField(term31828, term31828.getClass(), "exp", "EBSKhqDdUW");
        setLongField(term31828, term31828.getClass(), "point", -5455716707538294699L);
        setLongField(term31828, term31828.getClass(), "totalPoint", -1889784286465977825L);
        setIntField(term31828, term31828.getClass(), "playCount", 218346781);
        setIntField(term31828, term31828.getClass(), "multiPlayCount", -984660976);
        setIntField(term31828, term31828.getClass(), "multiWinCount", -1419341969);
        setIntField(term31828, term31828.getClass(), "requestResCount", -89522625);
        setIntField(term31828, term31828.getClass(), "acceptResCount", 1475906894);
        setIntField(term31828, term31828.getClass(), "successResCount", -2004794532);
        setIntField(term31828, term31828.getClass(), "playerRating", 1232958763);
        setIntField(term31828, term31828.getClass(), "highestRating", -1702132549);
        setIntField(term31828, term31828.getClass(), "nameplateId", -1786136772);
        setIntField(term31828, term31828.getClass(), "frameId", -1510967747);
        setIntField(term31828, term31828.getClass(), "characterId", -2014792457);
        setIntField(term31828, term31828.getClass(), "trophyId", 1957633116);
        setIntField(term31828, term31828.getClass(), "playedTutorialBit", 1428598210);
        setIntField(term31828, term31828.getClass(), "firstTutorialCancelNum", 1071776561);
        setIntField(term31828, term31828.getClass(), "masterTutorialCancelNum", 1846399918);
        setIntField(term31828, term31828.getClass(), "totalRepertoireCount", 35388821);
        setIntField(term31828, term31828.getClass(), "totalMapNum", -598803400);
        setLongField(term31828, term31828.getClass(), "totalHiScore", 5592522907226111065L);
        setLongField(term31828, term31828.getClass(), "totalBasicHighScore", -2577420466618938650L);
        setLongField(term31828, term31828.getClass(), "totalAdvancedHighScore", 5614572229094721840L);
        setLongField(term31828, term31828.getClass(), "totalExpertHighScore", -159468133651974975L);
        setLongField(term31828, term31828.getClass(), "totalMasterHighScore", 9160882370265093763L);
        setIntField(term31915, term31915.getClass(), "year", 2010);
        setShortField(term31915, term31915.getClass(), "month", (short) 5);
        setShortField(term31915, term31915.getClass(), "day", (short) 21);
        setField(term31914, term31914.getClass(), "date", term31915);
        setByteField(term31919, term31919.getClass(), "hour", (byte) 2);
        setByteField(term31919, term31919.getClass(), "minute", (byte) 7);
        setByteField(term31919, term31919.getClass(), "second", (byte) 22);
        setIntField(term31919, term31919.getClass(), "nano", 178273852);
        setField(term31914, term31914.getClass(), "time", term31919);
        setField(term31828, term31828.getClass(), "eventWatchedDate", term31914);
        setIntField(term31828, term31828.getClass(), "friendCount", 25560022);
        setBooleanField(term31828, term31828.getClass(), "isMaimai", false);
        setField(term31828, term31828.getClass(), "firstGameId", "LvLbdICdfA");
        setField(term31828, term31828.getClass(), "firstRomVersion", "rtifrlITwl");
        setField(term31828, term31828.getClass(), "firstDataVersion", "yGWXZDjnPS");
        setIntField(term31963, term31963.getClass(), "year", 2020);
        setShortField(term31963, term31963.getClass(), "month", (short) 7);
        setShortField(term31963, term31963.getClass(), "day", (short) 27);
        setField(term31962, term31962.getClass(), "date", term31963);
        setByteField(term31967, term31967.getClass(), "hour", (byte) 23);
        setByteField(term31967, term31967.getClass(), "minute", (byte) 41);
        setByteField(term31967, term31967.getClass(), "second", (byte) 32);
        setIntField(term31967, term31967.getClass(), "nano", 523353963);
        setField(term31962, term31962.getClass(), "time", term31967);
        setField(term31828, term31828.getClass(), "firstPlayDate", term31962);
        setField(term31828, term31828.getClass(), "lastGameId", "vZucxbGVyo");
        setField(term31828, term31828.getClass(), "lastRomVersion", "ZZoLNbeORl");
        setField(term31828, term31828.getClass(), "lastDataVersion", "XjIOUIzJUP");
        setIntField(term32009, term32009.getClass(), "year", 2014);
        setShortField(term32009, term32009.getClass(), "month", (short) 2);
        setShortField(term32009, term32009.getClass(), "day", (short) 18);
        setField(term32008, term32008.getClass(), "date", term32009);
        setByteField(term32013, term32013.getClass(), "hour", (byte) 4);
        setByteField(term32013, term32013.getClass(), "minute", (byte) 16);
        setByteField(term32013, term32013.getClass(), "second", (byte) 8);
        setIntField(term32013, term32013.getClass(), "nano", 486006871);
        setField(term32008, term32008.getClass(), "time", term32013);
        setField(term31828, term31828.getClass(), "lastPlayDate", term32008);
        setIntField(term31828, term31828.getClass(), "lastPlaceId", -1090136985);
        setField(term31828, term31828.getClass(), "lastPlaceName", "iGTpXnnTqB");
        setField(term31828, term31828.getClass(), "lastRegionId", "XgJzBOYfQB");
        setField(term31828, term31828.getClass(), "lastRegionName", "GAPGgDekVG");
        setField(term31828, term31828.getClass(), "lastAllNetId", "WmTogHwGLE");
        setField(term31828, term31828.getClass(), "lastClientId", "qYOIXsGycY");
        term32079 = new Long(6848008460134431064L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term32079;
        callMethod(klass, "setTotalExpertHighScore", argTypes, term31828, args);
    }

};


