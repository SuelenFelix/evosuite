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

public class UserData_getEventPoint_175463265145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11881;

    public UserData_getEventPoint_175463265145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11885 = new Long(-7612550318181586304L);
        term11881 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term11883 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term11899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11914 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term11881, term11881.getClass(), "id", 6689117472719450333L);
        setLongField(term11883, term11883.getClass(), "id", 5836128569274066678L);
        setField(term11883, term11883.getClass(), "extId", term11885);
        setField(term11883, term11883.getClass(), "luid", "vSeruUyNWX");
        setIntField(term11900, term11900.getClass(), "year", 2013);
        setShortField(term11900, term11900.getClass(), "month", (short) 5);
        setShortField(term11900, term11900.getClass(), "day", (short) 9);
        setField(term11899, term11899.getClass(), "date", term11900);
        setByteField(term11904, term11904.getClass(), "hour", (byte) 4);
        setByteField(term11904, term11904.getClass(), "minute", (byte) 18);
        setByteField(term11904, term11904.getClass(), "second", (byte) 35);
        setIntField(term11904, term11904.getClass(), "nano", 909079395);
        setField(term11899, term11899.getClass(), "time", term11904);
        setField(term11883, term11883.getClass(), "registerTime", term11899);
        setIntField(term11910, term11910.getClass(), "year", 2015);
        setShortField(term11910, term11910.getClass(), "month", (short) 3);
        setShortField(term11910, term11910.getClass(), "day", (short) 15);
        setField(term11909, term11909.getClass(), "date", term11910);
        setByteField(term11914, term11914.getClass(), "hour", (byte) 8);
        setByteField(term11914, term11914.getClass(), "minute", (byte) 45);
        setByteField(term11914, term11914.getClass(), "second", (byte) 29);
        setIntField(term11914, term11914.getClass(), "nano", 781486470);
        setField(term11909, term11909.getClass(), "time", term11914);
        setField(term11883, term11883.getClass(), "accessTime", term11909);
        setField(term11881, term11881.getClass(), "card", term11883);
        setIntField(term11881, term11881.getClass(), "lastDataVersion", 86144663);
        setField(term11881, term11881.getClass(), "userName", "UkKvaeJfEC");
        setIntField(term11881, term11881.getClass(), "point", -1480903995);
        setIntField(term11881, term11881.getClass(), "totalPoint", -2111772603);
        setIntField(term11881, term11881.getClass(), "iconId", 637942911);
        setIntField(term11881, term11881.getClass(), "nameplateId", -395396657);
        setIntField(term11881, term11881.getClass(), "frameId", 1677171453);
        setIntField(term11881, term11881.getClass(), "trophyId", -2108979704);
        setIntField(term11881, term11881.getClass(), "playCount", 1629835601);
        setIntField(term11881, term11881.getClass(), "playVsCount", 1866184476);
        setIntField(term11881, term11881.getClass(), "playSyncCount", -17998574);
        setIntField(term11881, term11881.getClass(), "winCount", 145080354);
        setIntField(term11881, term11881.getClass(), "helpCount", -2087321012);
        setIntField(term11881, term11881.getClass(), "comboCount", -1613074612);
        setIntField(term11881, term11881.getClass(), "feverCount", 1054908502);
        setIntField(term11881, term11881.getClass(), "totalHiScore", -1226802566);
        setIntField(term11881, term11881.getClass(), "totalEasyHighScore", 1162813858);
        setIntField(term11881, term11881.getClass(), "totalBasicHighScore", 494596414);
        setIntField(term11881, term11881.getClass(), "totalAdvancedHighScore", 1226377461);
        setIntField(term11881, term11881.getClass(), "totalExpertHighScore", -1540486514);
        setIntField(term11881, term11881.getClass(), "totalMasterHighScore", 1471031478);
        setIntField(term11881, term11881.getClass(), "totalReMasterHighScore", -334716487);
        setIntField(term11881, term11881.getClass(), "totalHighSync", -1739012814);
        setIntField(term11881, term11881.getClass(), "totalEasySync", 1989014880);
        setIntField(term11881, term11881.getClass(), "totalBasicSync", -330280702);
        setIntField(term11881, term11881.getClass(), "totalAdvancedSync", -1858425735);
        setIntField(term11881, term11881.getClass(), "totalExpertSync", 1818274550);
        setIntField(term11881, term11881.getClass(), "totalMasterSync", 1044519085);
        setIntField(term11881, term11881.getClass(), "totalReMasterSync", 2095699770);
        setIntField(term11881, term11881.getClass(), "playerRating", -1365904757);
        setIntField(term11881, term11881.getClass(), "highestRating", -1487263349);
        setIntField(term11881, term11881.getClass(), "rankAuthTailId", -1009732764);
        setField(term11881, term11881.getClass(), "eventWatchedDate", "WPxXsahPRq");
        setField(term11881, term11881.getClass(), "webLimitDate", "IENRuqmwUU");
        setIntField(term11881, term11881.getClass(), "challengeTrackPhase", 950783153);
        setIntField(term11881, term11881.getClass(), "firstPlayBits", -801175078);
        setField(term11881, term11881.getClass(), "lastPlayDate", "GsWxOwXvSu");
        setIntField(term11881, term11881.getClass(), "lastPlaceId", 2085098404);
        setField(term11881, term11881.getClass(), "lastPlaceName", "bKBSncrMEZ");
        setIntField(term11881, term11881.getClass(), "lastRegionId", -684064427);
        setField(term11881, term11881.getClass(), "lastRegionName", "yeSXGqQExb");
        setField(term11881, term11881.getClass(), "lastClientId", "uXYcXVYJZM");
        setField(term11881, term11881.getClass(), "lastCountryCode", "BJhjdJUhkz");
        setIntField(term11881, term11881.getClass(), "eventPoint", -1981080836);
        setIntField(term11881, term11881.getClass(), "totalLv", -176676344);
        setIntField(term11881, term11881.getClass(), "lastLoginBonusDay", 1949009312);
        setIntField(term11881, term11881.getClass(), "lastSurvivalBonusDay", -432054743);
        setIntField(term11881, term11881.getClass(), "loginBonusLv", -859726380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventPoint", argTypes, term11881, args);
    }

};


