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

public class UserData_setTotalEasySync_30882937875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19915;
     Object term20089;

    public UserData_setTotalEasySync_30882937875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19919 = new Long(-5963439350418910964L);
        term19915 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term19917 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19938 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19948 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term19915, term19915.getClass(), "id", 1457594663983990440L);
        setLongField(term19917, term19917.getClass(), "id", 3452833434644634217L);
        setField(term19917, term19917.getClass(), "extId", term19919);
        setField(term19917, term19917.getClass(), "luid", "VuLLXpvPpZ");
        setIntField(term19934, term19934.getClass(), "year", 2026);
        setShortField(term19934, term19934.getClass(), "month", (short) 9);
        setShortField(term19934, term19934.getClass(), "day", (short) 18);
        setField(term19933, term19933.getClass(), "date", term19934);
        setByteField(term19938, term19938.getClass(), "hour", (byte) 14);
        setByteField(term19938, term19938.getClass(), "minute", (byte) 51);
        setByteField(term19938, term19938.getClass(), "second", (byte) 41);
        setIntField(term19938, term19938.getClass(), "nano", 830322169);
        setField(term19933, term19933.getClass(), "time", term19938);
        setField(term19917, term19917.getClass(), "registerTime", term19933);
        setIntField(term19944, term19944.getClass(), "year", 2024);
        setShortField(term19944, term19944.getClass(), "month", (short) 3);
        setShortField(term19944, term19944.getClass(), "day", (short) 17);
        setField(term19943, term19943.getClass(), "date", term19944);
        setByteField(term19948, term19948.getClass(), "hour", (byte) 5);
        setByteField(term19948, term19948.getClass(), "minute", (byte) 21);
        setByteField(term19948, term19948.getClass(), "second", (byte) 47);
        setIntField(term19948, term19948.getClass(), "nano", 798433252);
        setField(term19943, term19943.getClass(), "time", term19948);
        setField(term19917, term19917.getClass(), "accessTime", term19943);
        setField(term19915, term19915.getClass(), "card", term19917);
        setIntField(term19915, term19915.getClass(), "lastDataVersion", -1778687889);
        setField(term19915, term19915.getClass(), "userName", "UEdzEKEEEV");
        setIntField(term19915, term19915.getClass(), "point", -1827662352);
        setIntField(term19915, term19915.getClass(), "totalPoint", -1292290537);
        setIntField(term19915, term19915.getClass(), "iconId", 1060963259);
        setIntField(term19915, term19915.getClass(), "nameplateId", -1275604693);
        setIntField(term19915, term19915.getClass(), "frameId", 455869012);
        setIntField(term19915, term19915.getClass(), "trophyId", 782841747);
        setIntField(term19915, term19915.getClass(), "playCount", 744634969);
        setIntField(term19915, term19915.getClass(), "playVsCount", -13561953);
        setIntField(term19915, term19915.getClass(), "playSyncCount", 2069622671);
        setIntField(term19915, term19915.getClass(), "winCount", 86341231);
        setIntField(term19915, term19915.getClass(), "helpCount", -926119173);
        setIntField(term19915, term19915.getClass(), "comboCount", 1613936898);
        setIntField(term19915, term19915.getClass(), "feverCount", -406599151);
        setIntField(term19915, term19915.getClass(), "totalHiScore", -1421272179);
        setIntField(term19915, term19915.getClass(), "totalEasyHighScore", -2019439660);
        setIntField(term19915, term19915.getClass(), "totalBasicHighScore", 1037621714);
        setIntField(term19915, term19915.getClass(), "totalAdvancedHighScore", 1072685856);
        setIntField(term19915, term19915.getClass(), "totalExpertHighScore", 1560132742);
        setIntField(term19915, term19915.getClass(), "totalMasterHighScore", -1289646730);
        setIntField(term19915, term19915.getClass(), "totalReMasterHighScore", 983651082);
        setIntField(term19915, term19915.getClass(), "totalHighSync", 794411004);
        setIntField(term19915, term19915.getClass(), "totalEasySync", 1964107266);
        setIntField(term19915, term19915.getClass(), "totalBasicSync", -256542569);
        setIntField(term19915, term19915.getClass(), "totalAdvancedSync", -1936597357);
        setIntField(term19915, term19915.getClass(), "totalExpertSync", -179816637);
        setIntField(term19915, term19915.getClass(), "totalMasterSync", -1304594615);
        setIntField(term19915, term19915.getClass(), "totalReMasterSync", 1384334359);
        setIntField(term19915, term19915.getClass(), "playerRating", -552245510);
        setIntField(term19915, term19915.getClass(), "highestRating", 1590263959);
        setIntField(term19915, term19915.getClass(), "rankAuthTailId", -203971814);
        setField(term19915, term19915.getClass(), "eventWatchedDate", "BcENaQFYSd");
        setField(term19915, term19915.getClass(), "webLimitDate", "POPYycoDBy");
        setIntField(term19915, term19915.getClass(), "challengeTrackPhase", -786856127);
        setIntField(term19915, term19915.getClass(), "firstPlayBits", 891987554);
        setField(term19915, term19915.getClass(), "lastPlayDate", "LuWMOXdAPA");
        setIntField(term19915, term19915.getClass(), "lastPlaceId", 407640701);
        setField(term19915, term19915.getClass(), "lastPlaceName", "blSffTnsOv");
        setIntField(term19915, term19915.getClass(), "lastRegionId", -55858757);
        setField(term19915, term19915.getClass(), "lastRegionName", "qbUMcIvEXH");
        setField(term19915, term19915.getClass(), "lastClientId", "TVxGTjeDcu");
        setField(term19915, term19915.getClass(), "lastCountryCode", "ABPtcyCzkR");
        setIntField(term19915, term19915.getClass(), "eventPoint", 1101065297);
        setIntField(term19915, term19915.getClass(), "totalLv", -110542660);
        setIntField(term19915, term19915.getClass(), "lastLoginBonusDay", 1430629000);
        setIntField(term19915, term19915.getClass(), "lastSurvivalBonusDay", -1684627375);
        setIntField(term19915, term19915.getClass(), "loginBonusLv", -74479819);
        term20089 = new Integer(-1610494666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20089;
        callMethod(klass, "setTotalEasySync", argTypes, term19915, args);
    }

};


