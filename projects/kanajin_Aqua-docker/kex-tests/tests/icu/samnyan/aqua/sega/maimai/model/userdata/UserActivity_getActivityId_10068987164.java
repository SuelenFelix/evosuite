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

public class UserActivity_getActivityId_10068987164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44794;

    public UserActivity_getActivityId_10068987164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44800 = new Long(-1333707622307134180L);
        term44794 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term44796 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term44798 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term44814 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44815 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44819 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44829 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term44794, term44794.getClass(), "id", -3225860270104198596L);
        setLongField(term44796, term44796.getClass(), "id", -1164342036939643746L);
        setLongField(term44798, term44798.getClass(), "id", -7013378340043571457L);
        setField(term44798, term44798.getClass(), "extId", term44800);
        setField(term44798, term44798.getClass(), "luid", "pADwkrWiMW");
        setIntField(term44815, term44815.getClass(), "year", 2015);
        setShortField(term44815, term44815.getClass(), "month", (short) 5);
        setShortField(term44815, term44815.getClass(), "day", (short) 14);
        setField(term44814, term44814.getClass(), "date", term44815);
        setByteField(term44819, term44819.getClass(), "hour", (byte) 13);
        setByteField(term44819, term44819.getClass(), "minute", (byte) 25);
        setByteField(term44819, term44819.getClass(), "second", (byte) 10);
        setIntField(term44819, term44819.getClass(), "nano", 246578829);
        setField(term44814, term44814.getClass(), "time", term44819);
        setField(term44798, term44798.getClass(), "registerTime", term44814);
        setIntField(term44825, term44825.getClass(), "year", 2028);
        setShortField(term44825, term44825.getClass(), "month", (short) 5);
        setShortField(term44825, term44825.getClass(), "day", (short) 23);
        setField(term44824, term44824.getClass(), "date", term44825);
        setByteField(term44829, term44829.getClass(), "hour", (byte) 6);
        setByteField(term44829, term44829.getClass(), "minute", (byte) 0);
        setByteField(term44829, term44829.getClass(), "second", (byte) 51);
        setIntField(term44829, term44829.getClass(), "nano", 258967293);
        setField(term44824, term44824.getClass(), "time", term44829);
        setField(term44798, term44798.getClass(), "accessTime", term44824);
        setField(term44796, term44796.getClass(), "card", term44798);
        setIntField(term44796, term44796.getClass(), "lastDataVersion", 1923849673);
        setField(term44796, term44796.getClass(), "userName", "FDORDJuAXQ");
        setIntField(term44796, term44796.getClass(), "point", 783108536);
        setIntField(term44796, term44796.getClass(), "totalPoint", 1305284548);
        setIntField(term44796, term44796.getClass(), "iconId", -567549105);
        setIntField(term44796, term44796.getClass(), "nameplateId", -1707996167);
        setIntField(term44796, term44796.getClass(), "frameId", 1222265931);
        setIntField(term44796, term44796.getClass(), "trophyId", 1684951870);
        setIntField(term44796, term44796.getClass(), "playCount", -1511199281);
        setIntField(term44796, term44796.getClass(), "playVsCount", -1801978748);
        setIntField(term44796, term44796.getClass(), "playSyncCount", 1121989052);
        setIntField(term44796, term44796.getClass(), "winCount", 1115099352);
        setIntField(term44796, term44796.getClass(), "helpCount", -269893980);
        setIntField(term44796, term44796.getClass(), "comboCount", 1190163419);
        setIntField(term44796, term44796.getClass(), "feverCount", -1365404936);
        setIntField(term44796, term44796.getClass(), "totalHiScore", -828371576);
        setIntField(term44796, term44796.getClass(), "totalEasyHighScore", 1475471511);
        setIntField(term44796, term44796.getClass(), "totalBasicHighScore", 1061251899);
        setIntField(term44796, term44796.getClass(), "totalAdvancedHighScore", -1000926687);
        setIntField(term44796, term44796.getClass(), "totalExpertHighScore", 89149779);
        setIntField(term44796, term44796.getClass(), "totalMasterHighScore", 354592191);
        setIntField(term44796, term44796.getClass(), "totalReMasterHighScore", -874460167);
        setIntField(term44796, term44796.getClass(), "totalHighSync", 1753994569);
        setIntField(term44796, term44796.getClass(), "totalEasySync", 2131854523);
        setIntField(term44796, term44796.getClass(), "totalBasicSync", -2074551841);
        setIntField(term44796, term44796.getClass(), "totalAdvancedSync", 1213549602);
        setIntField(term44796, term44796.getClass(), "totalExpertSync", -1638897284);
        setIntField(term44796, term44796.getClass(), "totalMasterSync", -1998048906);
        setIntField(term44796, term44796.getClass(), "totalReMasterSync", -1915332852);
        setIntField(term44796, term44796.getClass(), "playerRating", 1603272771);
        setIntField(term44796, term44796.getClass(), "highestRating", -1169796605);
        setIntField(term44796, term44796.getClass(), "rankAuthTailId", 1294129760);
        setField(term44796, term44796.getClass(), "eventWatchedDate", "yjqoDeLBLg");
        setField(term44796, term44796.getClass(), "webLimitDate", "DCepDqVwas");
        setIntField(term44796, term44796.getClass(), "challengeTrackPhase", -1042003821);
        setIntField(term44796, term44796.getClass(), "firstPlayBits", 1800189572);
        setField(term44796, term44796.getClass(), "lastPlayDate", "wKIBUlfNCx");
        setIntField(term44796, term44796.getClass(), "lastPlaceId", -555300889);
        setField(term44796, term44796.getClass(), "lastPlaceName", "iGfMUWRvod");
        setIntField(term44796, term44796.getClass(), "lastRegionId", -319938895);
        setField(term44796, term44796.getClass(), "lastRegionName", "zUXaSvayQe");
        setField(term44796, term44796.getClass(), "lastClientId", "bPVcnnQPSC");
        setField(term44796, term44796.getClass(), "lastCountryCode", "PQLyoEKWSa");
        setIntField(term44796, term44796.getClass(), "eventPoint", -529078248);
        setIntField(term44796, term44796.getClass(), "totalLv", 2125754107);
        setIntField(term44796, term44796.getClass(), "lastLoginBonusDay", 1094413748);
        setIntField(term44796, term44796.getClass(), "lastSurvivalBonusDay", 1697340530);
        setIntField(term44796, term44796.getClass(), "loginBonusLv", 2037702914);
        setField(term44794, term44794.getClass(), "user", term44796);
        setIntField(term44794, term44794.getClass(), "kind", 540968254);
        setIntField(term44794, term44794.getClass(), "activityId", 1166539646);
        setLongField(term44794, term44794.getClass(), "sortNumber", -3279534582096707294L);
        setIntField(term44794, term44794.getClass(), "param1", 1055557164);
        setIntField(term44794, term44794.getClass(), "param2", -1601763818);
        setIntField(term44794, term44794.getClass(), "param3", 562192186);
        setIntField(term44794, term44794.getClass(), "param4", -904648920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivityId", argTypes, term44794, args);
    }

};


