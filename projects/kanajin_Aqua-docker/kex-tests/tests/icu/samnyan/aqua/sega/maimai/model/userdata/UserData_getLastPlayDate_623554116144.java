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

public class UserData_getLastPlayDate_623554116144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29663;

    public UserData_getLastPlayDate_623554116144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29663 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29663, term29663.getClass(), "id", 0L);
        setField(term29663, term29663.getClass(), "card", null);
        setIntField(term29663, term29663.getClass(), "lastDataVersion", 0);
        setField(term29663, term29663.getClass(), "userName", null);
        setIntField(term29663, term29663.getClass(), "point", 0);
        setIntField(term29663, term29663.getClass(), "totalPoint", 0);
        setIntField(term29663, term29663.getClass(), "iconId", 0);
        setIntField(term29663, term29663.getClass(), "nameplateId", 0);
        setIntField(term29663, term29663.getClass(), "frameId", 0);
        setIntField(term29663, term29663.getClass(), "trophyId", 0);
        setIntField(term29663, term29663.getClass(), "playCount", 0);
        setIntField(term29663, term29663.getClass(), "playVsCount", 0);
        setIntField(term29663, term29663.getClass(), "playSyncCount", 0);
        setIntField(term29663, term29663.getClass(), "winCount", 0);
        setIntField(term29663, term29663.getClass(), "helpCount", 0);
        setIntField(term29663, term29663.getClass(), "comboCount", 0);
        setIntField(term29663, term29663.getClass(), "feverCount", 0);
        setIntField(term29663, term29663.getClass(), "totalHiScore", 0);
        setIntField(term29663, term29663.getClass(), "totalEasyHighScore", 0);
        setIntField(term29663, term29663.getClass(), "totalBasicHighScore", 0);
        setIntField(term29663, term29663.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29663, term29663.getClass(), "totalExpertHighScore", 0);
        setIntField(term29663, term29663.getClass(), "totalMasterHighScore", 0);
        setIntField(term29663, term29663.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29663, term29663.getClass(), "totalHighSync", 0);
        setIntField(term29663, term29663.getClass(), "totalEasySync", 0);
        setIntField(term29663, term29663.getClass(), "totalBasicSync", 0);
        setIntField(term29663, term29663.getClass(), "totalAdvancedSync", 0);
        setIntField(term29663, term29663.getClass(), "totalExpertSync", 0);
        setIntField(term29663, term29663.getClass(), "totalMasterSync", 0);
        setIntField(term29663, term29663.getClass(), "totalReMasterSync", 0);
        setIntField(term29663, term29663.getClass(), "playerRating", 0);
        setIntField(term29663, term29663.getClass(), "highestRating", 0);
        setIntField(term29663, term29663.getClass(), "rankAuthTailId", 0);
        setField(term29663, term29663.getClass(), "eventWatchedDate", null);
        setField(term29663, term29663.getClass(), "webLimitDate", null);
        setIntField(term29663, term29663.getClass(), "challengeTrackPhase", 0);
        setIntField(term29663, term29663.getClass(), "firstPlayBits", 0);
        setField(term29663, term29663.getClass(), "lastPlayDate", null);
        setIntField(term29663, term29663.getClass(), "lastPlaceId", 0);
        setField(term29663, term29663.getClass(), "lastPlaceName", null);
        setIntField(term29663, term29663.getClass(), "lastRegionId", 0);
        setField(term29663, term29663.getClass(), "lastRegionName", null);
        setField(term29663, term29663.getClass(), "lastClientId", null);
        setField(term29663, term29663.getClass(), "lastCountryCode", null);
        setIntField(term29663, term29663.getClass(), "eventPoint", 0);
        setIntField(term29663, term29663.getClass(), "totalLv", 0);
        setIntField(term29663, term29663.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29663, term29663.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29663, term29663.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term29663, args);
    }

};


