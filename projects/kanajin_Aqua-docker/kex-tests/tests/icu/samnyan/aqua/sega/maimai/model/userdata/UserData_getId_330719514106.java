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

public class UserData_getId_330719514106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28067;

    public UserData_getId_330719514106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28067 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28067, term28067.getClass(), "id", 0L);
        setField(term28067, term28067.getClass(), "card", null);
        setIntField(term28067, term28067.getClass(), "lastDataVersion", 0);
        setField(term28067, term28067.getClass(), "userName", null);
        setIntField(term28067, term28067.getClass(), "point", 0);
        setIntField(term28067, term28067.getClass(), "totalPoint", 0);
        setIntField(term28067, term28067.getClass(), "iconId", 0);
        setIntField(term28067, term28067.getClass(), "nameplateId", 0);
        setIntField(term28067, term28067.getClass(), "frameId", 0);
        setIntField(term28067, term28067.getClass(), "trophyId", 0);
        setIntField(term28067, term28067.getClass(), "playCount", 0);
        setIntField(term28067, term28067.getClass(), "playVsCount", 0);
        setIntField(term28067, term28067.getClass(), "playSyncCount", 0);
        setIntField(term28067, term28067.getClass(), "winCount", 0);
        setIntField(term28067, term28067.getClass(), "helpCount", 0);
        setIntField(term28067, term28067.getClass(), "comboCount", 0);
        setIntField(term28067, term28067.getClass(), "feverCount", 0);
        setIntField(term28067, term28067.getClass(), "totalHiScore", 0);
        setIntField(term28067, term28067.getClass(), "totalEasyHighScore", 0);
        setIntField(term28067, term28067.getClass(), "totalBasicHighScore", 0);
        setIntField(term28067, term28067.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28067, term28067.getClass(), "totalExpertHighScore", 0);
        setIntField(term28067, term28067.getClass(), "totalMasterHighScore", 0);
        setIntField(term28067, term28067.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28067, term28067.getClass(), "totalHighSync", 0);
        setIntField(term28067, term28067.getClass(), "totalEasySync", 0);
        setIntField(term28067, term28067.getClass(), "totalBasicSync", 0);
        setIntField(term28067, term28067.getClass(), "totalAdvancedSync", 0);
        setIntField(term28067, term28067.getClass(), "totalExpertSync", 0);
        setIntField(term28067, term28067.getClass(), "totalMasterSync", 0);
        setIntField(term28067, term28067.getClass(), "totalReMasterSync", 0);
        setIntField(term28067, term28067.getClass(), "playerRating", 0);
        setIntField(term28067, term28067.getClass(), "highestRating", 0);
        setIntField(term28067, term28067.getClass(), "rankAuthTailId", 0);
        setField(term28067, term28067.getClass(), "eventWatchedDate", null);
        setField(term28067, term28067.getClass(), "webLimitDate", null);
        setIntField(term28067, term28067.getClass(), "challengeTrackPhase", 0);
        setIntField(term28067, term28067.getClass(), "firstPlayBits", 0);
        setField(term28067, term28067.getClass(), "lastPlayDate", null);
        setIntField(term28067, term28067.getClass(), "lastPlaceId", 0);
        setField(term28067, term28067.getClass(), "lastPlaceName", null);
        setIntField(term28067, term28067.getClass(), "lastRegionId", 0);
        setField(term28067, term28067.getClass(), "lastRegionName", null);
        setField(term28067, term28067.getClass(), "lastClientId", null);
        setField(term28067, term28067.getClass(), "lastCountryCode", null);
        setIntField(term28067, term28067.getClass(), "eventPoint", 0);
        setIntField(term28067, term28067.getClass(), "totalLv", 0);
        setIntField(term28067, term28067.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28067, term28067.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28067, term28067.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term28067, args);
    }

};


