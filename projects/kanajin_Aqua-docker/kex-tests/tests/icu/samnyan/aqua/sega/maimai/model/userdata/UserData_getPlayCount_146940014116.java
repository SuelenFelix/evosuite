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

public class UserData_getPlayCount_146940014116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28487;

    public UserData_getPlayCount_146940014116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28487 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28487, term28487.getClass(), "id", 0L);
        setField(term28487, term28487.getClass(), "card", null);
        setIntField(term28487, term28487.getClass(), "lastDataVersion", 0);
        setField(term28487, term28487.getClass(), "userName", null);
        setIntField(term28487, term28487.getClass(), "point", 0);
        setIntField(term28487, term28487.getClass(), "totalPoint", 0);
        setIntField(term28487, term28487.getClass(), "iconId", 0);
        setIntField(term28487, term28487.getClass(), "nameplateId", 0);
        setIntField(term28487, term28487.getClass(), "frameId", 0);
        setIntField(term28487, term28487.getClass(), "trophyId", 0);
        setIntField(term28487, term28487.getClass(), "playCount", 0);
        setIntField(term28487, term28487.getClass(), "playVsCount", 0);
        setIntField(term28487, term28487.getClass(), "playSyncCount", 0);
        setIntField(term28487, term28487.getClass(), "winCount", 0);
        setIntField(term28487, term28487.getClass(), "helpCount", 0);
        setIntField(term28487, term28487.getClass(), "comboCount", 0);
        setIntField(term28487, term28487.getClass(), "feverCount", 0);
        setIntField(term28487, term28487.getClass(), "totalHiScore", 0);
        setIntField(term28487, term28487.getClass(), "totalEasyHighScore", 0);
        setIntField(term28487, term28487.getClass(), "totalBasicHighScore", 0);
        setIntField(term28487, term28487.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28487, term28487.getClass(), "totalExpertHighScore", 0);
        setIntField(term28487, term28487.getClass(), "totalMasterHighScore", 0);
        setIntField(term28487, term28487.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28487, term28487.getClass(), "totalHighSync", 0);
        setIntField(term28487, term28487.getClass(), "totalEasySync", 0);
        setIntField(term28487, term28487.getClass(), "totalBasicSync", 0);
        setIntField(term28487, term28487.getClass(), "totalAdvancedSync", 0);
        setIntField(term28487, term28487.getClass(), "totalExpertSync", 0);
        setIntField(term28487, term28487.getClass(), "totalMasterSync", 0);
        setIntField(term28487, term28487.getClass(), "totalReMasterSync", 0);
        setIntField(term28487, term28487.getClass(), "playerRating", 0);
        setIntField(term28487, term28487.getClass(), "highestRating", 0);
        setIntField(term28487, term28487.getClass(), "rankAuthTailId", 0);
        setField(term28487, term28487.getClass(), "eventWatchedDate", null);
        setField(term28487, term28487.getClass(), "webLimitDate", null);
        setIntField(term28487, term28487.getClass(), "challengeTrackPhase", 0);
        setIntField(term28487, term28487.getClass(), "firstPlayBits", 0);
        setField(term28487, term28487.getClass(), "lastPlayDate", null);
        setIntField(term28487, term28487.getClass(), "lastPlaceId", 0);
        setField(term28487, term28487.getClass(), "lastPlaceName", null);
        setIntField(term28487, term28487.getClass(), "lastRegionId", 0);
        setField(term28487, term28487.getClass(), "lastRegionName", null);
        setField(term28487, term28487.getClass(), "lastClientId", null);
        setField(term28487, term28487.getClass(), "lastCountryCode", null);
        setIntField(term28487, term28487.getClass(), "eventPoint", 0);
        setIntField(term28487, term28487.getClass(), "totalLv", 0);
        setIntField(term28487, term28487.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28487, term28487.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28487, term28487.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term28487, args);
    }

};


