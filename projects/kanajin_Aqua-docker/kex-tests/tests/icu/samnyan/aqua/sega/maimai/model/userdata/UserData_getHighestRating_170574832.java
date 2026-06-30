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

public class UserData_getHighestRating_170574832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8449;

    public UserData_getHighestRating_170574832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8453 = new Long(5262507301787091109L);
        term8449 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term8451 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term8467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8472 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8482 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term8449, term8449.getClass(), "id", 2062173786000223358L);
        setLongField(term8451, term8451.getClass(), "id", -8658027316505137504L);
        setField(term8451, term8451.getClass(), "extId", term8453);
        setField(term8451, term8451.getClass(), "luid", "zNdorvdUgu");
        setIntField(term8468, term8468.getClass(), "year", 2028);
        setShortField(term8468, term8468.getClass(), "month", (short) 1);
        setShortField(term8468, term8468.getClass(), "day", (short) 18);
        setField(term8467, term8467.getClass(), "date", term8468);
        setByteField(term8472, term8472.getClass(), "hour", (byte) 12);
        setByteField(term8472, term8472.getClass(), "minute", (byte) 4);
        setByteField(term8472, term8472.getClass(), "second", (byte) 39);
        setIntField(term8472, term8472.getClass(), "nano", 651287093);
        setField(term8467, term8467.getClass(), "time", term8472);
        setField(term8451, term8451.getClass(), "registerTime", term8467);
        setIntField(term8478, term8478.getClass(), "year", 2027);
        setShortField(term8478, term8478.getClass(), "month", (short) 7);
        setShortField(term8478, term8478.getClass(), "day", (short) 23);
        setField(term8477, term8477.getClass(), "date", term8478);
        setByteField(term8482, term8482.getClass(), "hour", (byte) 12);
        setByteField(term8482, term8482.getClass(), "minute", (byte) 6);
        setByteField(term8482, term8482.getClass(), "second", (byte) 19);
        setIntField(term8482, term8482.getClass(), "nano", 8025683);
        setField(term8477, term8477.getClass(), "time", term8482);
        setField(term8451, term8451.getClass(), "accessTime", term8477);
        setField(term8449, term8449.getClass(), "card", term8451);
        setIntField(term8449, term8449.getClass(), "lastDataVersion", 887198203);
        setField(term8449, term8449.getClass(), "userName", "oPxuZbkYio");
        setIntField(term8449, term8449.getClass(), "point", 12581312);
        setIntField(term8449, term8449.getClass(), "totalPoint", 2087383644);
        setIntField(term8449, term8449.getClass(), "iconId", 405527523);
        setIntField(term8449, term8449.getClass(), "nameplateId", -1123526433);
        setIntField(term8449, term8449.getClass(), "frameId", 910269225);
        setIntField(term8449, term8449.getClass(), "trophyId", -298852874);
        setIntField(term8449, term8449.getClass(), "playCount", 1094297953);
        setIntField(term8449, term8449.getClass(), "playVsCount", -329141819);
        setIntField(term8449, term8449.getClass(), "playSyncCount", -963204620);
        setIntField(term8449, term8449.getClass(), "winCount", 172898580);
        setIntField(term8449, term8449.getClass(), "helpCount", -777833461);
        setIntField(term8449, term8449.getClass(), "comboCount", 1583691829);
        setIntField(term8449, term8449.getClass(), "feverCount", -1468541076);
        setIntField(term8449, term8449.getClass(), "totalHiScore", -1796760393);
        setIntField(term8449, term8449.getClass(), "totalEasyHighScore", -2099267271);
        setIntField(term8449, term8449.getClass(), "totalBasicHighScore", 1134565344);
        setIntField(term8449, term8449.getClass(), "totalAdvancedHighScore", -1747434000);
        setIntField(term8449, term8449.getClass(), "totalExpertHighScore", 1611620166);
        setIntField(term8449, term8449.getClass(), "totalMasterHighScore", 249657454);
        setIntField(term8449, term8449.getClass(), "totalReMasterHighScore", 1734630901);
        setIntField(term8449, term8449.getClass(), "totalHighSync", -703815246);
        setIntField(term8449, term8449.getClass(), "totalEasySync", 157300746);
        setIntField(term8449, term8449.getClass(), "totalBasicSync", -1600748613);
        setIntField(term8449, term8449.getClass(), "totalAdvancedSync", -1509192782);
        setIntField(term8449, term8449.getClass(), "totalExpertSync", -867925573);
        setIntField(term8449, term8449.getClass(), "totalMasterSync", 478422495);
        setIntField(term8449, term8449.getClass(), "totalReMasterSync", 1727771237);
        setIntField(term8449, term8449.getClass(), "playerRating", 2033663549);
        setIntField(term8449, term8449.getClass(), "highestRating", 1766479154);
        setIntField(term8449, term8449.getClass(), "rankAuthTailId", 533171496);
        setField(term8449, term8449.getClass(), "eventWatchedDate", "vKitydDVnM");
        setField(term8449, term8449.getClass(), "webLimitDate", "urCiQnUFBM");
        setIntField(term8449, term8449.getClass(), "challengeTrackPhase", 1369020869);
        setIntField(term8449, term8449.getClass(), "firstPlayBits", -1428947021);
        setField(term8449, term8449.getClass(), "lastPlayDate", "EKjQdtKxAM");
        setIntField(term8449, term8449.getClass(), "lastPlaceId", -134324004);
        setField(term8449, term8449.getClass(), "lastPlaceName", "TXZAIPQJHt");
        setIntField(term8449, term8449.getClass(), "lastRegionId", -1813266173);
        setField(term8449, term8449.getClass(), "lastRegionName", "DIbeDHICho");
        setField(term8449, term8449.getClass(), "lastClientId", "dJGPlmSRnz");
        setField(term8449, term8449.getClass(), "lastCountryCode", "DPskuFUobI");
        setIntField(term8449, term8449.getClass(), "eventPoint", -1201819537);
        setIntField(term8449, term8449.getClass(), "totalLv", 2135922049);
        setIntField(term8449, term8449.getClass(), "lastLoginBonusDay", -263876378);
        setIntField(term8449, term8449.getClass(), "lastSurvivalBonusDay", -755209283);
        setIntField(term8449, term8449.getClass(), "loginBonusLv", -616562794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term8449, args);
    }

};


