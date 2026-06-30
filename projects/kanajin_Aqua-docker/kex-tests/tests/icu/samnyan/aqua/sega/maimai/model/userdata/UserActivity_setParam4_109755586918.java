package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserActivity_setParam4_109755586918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48894;
     Object term49077;

    public UserActivity_setParam4_109755586918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48900 = new Long(5219030281405653303L);
        term48894 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term48896 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term48898 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term48914 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48915 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48919 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48929 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48894, term48894.getClass(), "id", 2809748481176687920L);
        setLongField(term48896, term48896.getClass(), "id", 4012955251407483889L);
        setLongField(term48898, term48898.getClass(), "id", -4058686252500969842L);
        setField(term48898, term48898.getClass(), "extId", term48900);
        setField(term48898, term48898.getClass(), "luid", "nwKkzNpzyC");
        setIntField(term48915, term48915.getClass(), "year", 2013);
        setShortField(term48915, term48915.getClass(), "month", (short) 6);
        setShortField(term48915, term48915.getClass(), "day", (short) 29);
        setField(term48914, term48914.getClass(), "date", term48915);
        setByteField(term48919, term48919.getClass(), "hour", (byte) 22);
        setByteField(term48919, term48919.getClass(), "minute", (byte) 31);
        setByteField(term48919, term48919.getClass(), "second", (byte) 28);
        setIntField(term48919, term48919.getClass(), "nano", 930397670);
        setField(term48914, term48914.getClass(), "time", term48919);
        setField(term48898, term48898.getClass(), "registerTime", term48914);
        setIntField(term48925, term48925.getClass(), "year", 2020);
        setShortField(term48925, term48925.getClass(), "month", (short) 5);
        setShortField(term48925, term48925.getClass(), "day", (short) 8);
        setField(term48924, term48924.getClass(), "date", term48925);
        setByteField(term48929, term48929.getClass(), "hour", (byte) 14);
        setByteField(term48929, term48929.getClass(), "minute", (byte) 28);
        setByteField(term48929, term48929.getClass(), "second", (byte) 38);
        setIntField(term48929, term48929.getClass(), "nano", 93855882);
        setField(term48924, term48924.getClass(), "time", term48929);
        setField(term48898, term48898.getClass(), "accessTime", term48924);
        setField(term48896, term48896.getClass(), "card", term48898);
        setIntField(term48896, term48896.getClass(), "lastDataVersion", -1221698112);
        setField(term48896, term48896.getClass(), "userName", "CwrsdYnHpH");
        setIntField(term48896, term48896.getClass(), "point", 1551007948);
        setIntField(term48896, term48896.getClass(), "totalPoint", -823083171);
        setIntField(term48896, term48896.getClass(), "iconId", 267756518);
        setIntField(term48896, term48896.getClass(), "nameplateId", -2130068890);
        setIntField(term48896, term48896.getClass(), "frameId", -111157494);
        setIntField(term48896, term48896.getClass(), "trophyId", 1356632069);
        setIntField(term48896, term48896.getClass(), "playCount", -497887292);
        setIntField(term48896, term48896.getClass(), "playVsCount", 738235414);
        setIntField(term48896, term48896.getClass(), "playSyncCount", -573957070);
        setIntField(term48896, term48896.getClass(), "winCount", -1100140077);
        setIntField(term48896, term48896.getClass(), "helpCount", -301805097);
        setIntField(term48896, term48896.getClass(), "comboCount", 496142964);
        setIntField(term48896, term48896.getClass(), "feverCount", 520268147);
        setIntField(term48896, term48896.getClass(), "totalHiScore", 702608636);
        setIntField(term48896, term48896.getClass(), "totalEasyHighScore", 352605161);
        setIntField(term48896, term48896.getClass(), "totalBasicHighScore", -1191829886);
        setIntField(term48896, term48896.getClass(), "totalAdvancedHighScore", -1544525961);
        setIntField(term48896, term48896.getClass(), "totalExpertHighScore", 190733490);
        setIntField(term48896, term48896.getClass(), "totalMasterHighScore", 2100537808);
        setIntField(term48896, term48896.getClass(), "totalReMasterHighScore", 1383366759);
        setIntField(term48896, term48896.getClass(), "totalHighSync", -424387882);
        setIntField(term48896, term48896.getClass(), "totalEasySync", -1591399293);
        setIntField(term48896, term48896.getClass(), "totalBasicSync", -1486539515);
        setIntField(term48896, term48896.getClass(), "totalAdvancedSync", -477235854);
        setIntField(term48896, term48896.getClass(), "totalExpertSync", -545213489);
        setIntField(term48896, term48896.getClass(), "totalMasterSync", 1341679614);
        setIntField(term48896, term48896.getClass(), "totalReMasterSync", -1687904905);
        setIntField(term48896, term48896.getClass(), "playerRating", -403695011);
        setIntField(term48896, term48896.getClass(), "highestRating", 1739332917);
        setIntField(term48896, term48896.getClass(), "rankAuthTailId", -1942607717);
        setField(term48896, term48896.getClass(), "eventWatchedDate", "jifjXNXluS");
        setField(term48896, term48896.getClass(), "webLimitDate", "uDayZDXPOP");
        setIntField(term48896, term48896.getClass(), "challengeTrackPhase", 2004204445);
        setIntField(term48896, term48896.getClass(), "firstPlayBits", 1813480917);
        setField(term48896, term48896.getClass(), "lastPlayDate", "kbjWxMAIhY");
        setIntField(term48896, term48896.getClass(), "lastPlaceId", -164198746);
        setField(term48896, term48896.getClass(), "lastPlaceName", "GmtlSgqKcI");
        setIntField(term48896, term48896.getClass(), "lastRegionId", -335778340);
        setField(term48896, term48896.getClass(), "lastRegionName", "ssSbvPoMjB");
        setField(term48896, term48896.getClass(), "lastClientId", "mhRVADhaKm");
        setField(term48896, term48896.getClass(), "lastCountryCode", "rLldJrTAay");
        setIntField(term48896, term48896.getClass(), "eventPoint", 1446088650);
        setIntField(term48896, term48896.getClass(), "totalLv", 1275760441);
        setIntField(term48896, term48896.getClass(), "lastLoginBonusDay", 1486085635);
        setIntField(term48896, term48896.getClass(), "lastSurvivalBonusDay", -2029499473);
        setIntField(term48896, term48896.getClass(), "loginBonusLv", 543873732);
        setField(term48894, term48894.getClass(), "user", term48896);
        setIntField(term48894, term48894.getClass(), "kind", -214745694);
        setIntField(term48894, term48894.getClass(), "activityId", -18584549);
        setLongField(term48894, term48894.getClass(), "sortNumber", 6077991958696417121L);
        setIntField(term48894, term48894.getClass(), "param1", -1678828778);
        setIntField(term48894, term48894.getClass(), "param2", 1466641302);
        setIntField(term48894, term48894.getClass(), "param3", -365255901);
        setIntField(term48894, term48894.getClass(), "param4", -1861629783);
        term49077 = new Integer(1512542473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49077;
        callMethod(klass, "setParam4", argTypes, term48894, args);
    }

};


