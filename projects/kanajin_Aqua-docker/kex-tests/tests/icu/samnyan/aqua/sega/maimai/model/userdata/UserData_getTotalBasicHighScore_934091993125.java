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

public class UserData_getTotalBasicHighScore_934091993125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28865;

    public UserData_getTotalBasicHighScore_934091993125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28865 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28865, term28865.getClass(), "id", 0L);
        setField(term28865, term28865.getClass(), "card", null);
        setIntField(term28865, term28865.getClass(), "lastDataVersion", 0);
        setField(term28865, term28865.getClass(), "userName", null);
        setIntField(term28865, term28865.getClass(), "point", 0);
        setIntField(term28865, term28865.getClass(), "totalPoint", 0);
        setIntField(term28865, term28865.getClass(), "iconId", 0);
        setIntField(term28865, term28865.getClass(), "nameplateId", 0);
        setIntField(term28865, term28865.getClass(), "frameId", 0);
        setIntField(term28865, term28865.getClass(), "trophyId", 0);
        setIntField(term28865, term28865.getClass(), "playCount", 0);
        setIntField(term28865, term28865.getClass(), "playVsCount", 0);
        setIntField(term28865, term28865.getClass(), "playSyncCount", 0);
        setIntField(term28865, term28865.getClass(), "winCount", 0);
        setIntField(term28865, term28865.getClass(), "helpCount", 0);
        setIntField(term28865, term28865.getClass(), "comboCount", 0);
        setIntField(term28865, term28865.getClass(), "feverCount", 0);
        setIntField(term28865, term28865.getClass(), "totalHiScore", 0);
        setIntField(term28865, term28865.getClass(), "totalEasyHighScore", 0);
        setIntField(term28865, term28865.getClass(), "totalBasicHighScore", 0);
        setIntField(term28865, term28865.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28865, term28865.getClass(), "totalExpertHighScore", 0);
        setIntField(term28865, term28865.getClass(), "totalMasterHighScore", 0);
        setIntField(term28865, term28865.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28865, term28865.getClass(), "totalHighSync", 0);
        setIntField(term28865, term28865.getClass(), "totalEasySync", 0);
        setIntField(term28865, term28865.getClass(), "totalBasicSync", 0);
        setIntField(term28865, term28865.getClass(), "totalAdvancedSync", 0);
        setIntField(term28865, term28865.getClass(), "totalExpertSync", 0);
        setIntField(term28865, term28865.getClass(), "totalMasterSync", 0);
        setIntField(term28865, term28865.getClass(), "totalReMasterSync", 0);
        setIntField(term28865, term28865.getClass(), "playerRating", 0);
        setIntField(term28865, term28865.getClass(), "highestRating", 0);
        setIntField(term28865, term28865.getClass(), "rankAuthTailId", 0);
        setField(term28865, term28865.getClass(), "eventWatchedDate", null);
        setField(term28865, term28865.getClass(), "webLimitDate", null);
        setIntField(term28865, term28865.getClass(), "challengeTrackPhase", 0);
        setIntField(term28865, term28865.getClass(), "firstPlayBits", 0);
        setField(term28865, term28865.getClass(), "lastPlayDate", null);
        setIntField(term28865, term28865.getClass(), "lastPlaceId", 0);
        setField(term28865, term28865.getClass(), "lastPlaceName", null);
        setIntField(term28865, term28865.getClass(), "lastRegionId", 0);
        setField(term28865, term28865.getClass(), "lastRegionName", null);
        setField(term28865, term28865.getClass(), "lastClientId", null);
        setField(term28865, term28865.getClass(), "lastCountryCode", null);
        setIntField(term28865, term28865.getClass(), "eventPoint", 0);
        setIntField(term28865, term28865.getClass(), "totalLv", 0);
        setIntField(term28865, term28865.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28865, term28865.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28865, term28865.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term28865, args);
    }

};


