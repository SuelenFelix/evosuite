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

public class UserData_getWinCount_1547910158119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28613;

    public UserData_getWinCount_1547910158119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28613 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28613, term28613.getClass(), "id", 0L);
        setField(term28613, term28613.getClass(), "card", null);
        setIntField(term28613, term28613.getClass(), "lastDataVersion", 0);
        setField(term28613, term28613.getClass(), "userName", null);
        setIntField(term28613, term28613.getClass(), "point", 0);
        setIntField(term28613, term28613.getClass(), "totalPoint", 0);
        setIntField(term28613, term28613.getClass(), "iconId", 0);
        setIntField(term28613, term28613.getClass(), "nameplateId", 0);
        setIntField(term28613, term28613.getClass(), "frameId", 0);
        setIntField(term28613, term28613.getClass(), "trophyId", 0);
        setIntField(term28613, term28613.getClass(), "playCount", 0);
        setIntField(term28613, term28613.getClass(), "playVsCount", 0);
        setIntField(term28613, term28613.getClass(), "playSyncCount", 0);
        setIntField(term28613, term28613.getClass(), "winCount", 0);
        setIntField(term28613, term28613.getClass(), "helpCount", 0);
        setIntField(term28613, term28613.getClass(), "comboCount", 0);
        setIntField(term28613, term28613.getClass(), "feverCount", 0);
        setIntField(term28613, term28613.getClass(), "totalHiScore", 0);
        setIntField(term28613, term28613.getClass(), "totalEasyHighScore", 0);
        setIntField(term28613, term28613.getClass(), "totalBasicHighScore", 0);
        setIntField(term28613, term28613.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28613, term28613.getClass(), "totalExpertHighScore", 0);
        setIntField(term28613, term28613.getClass(), "totalMasterHighScore", 0);
        setIntField(term28613, term28613.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28613, term28613.getClass(), "totalHighSync", 0);
        setIntField(term28613, term28613.getClass(), "totalEasySync", 0);
        setIntField(term28613, term28613.getClass(), "totalBasicSync", 0);
        setIntField(term28613, term28613.getClass(), "totalAdvancedSync", 0);
        setIntField(term28613, term28613.getClass(), "totalExpertSync", 0);
        setIntField(term28613, term28613.getClass(), "totalMasterSync", 0);
        setIntField(term28613, term28613.getClass(), "totalReMasterSync", 0);
        setIntField(term28613, term28613.getClass(), "playerRating", 0);
        setIntField(term28613, term28613.getClass(), "highestRating", 0);
        setIntField(term28613, term28613.getClass(), "rankAuthTailId", 0);
        setField(term28613, term28613.getClass(), "eventWatchedDate", null);
        setField(term28613, term28613.getClass(), "webLimitDate", null);
        setIntField(term28613, term28613.getClass(), "challengeTrackPhase", 0);
        setIntField(term28613, term28613.getClass(), "firstPlayBits", 0);
        setField(term28613, term28613.getClass(), "lastPlayDate", null);
        setIntField(term28613, term28613.getClass(), "lastPlaceId", 0);
        setField(term28613, term28613.getClass(), "lastPlaceName", null);
        setIntField(term28613, term28613.getClass(), "lastRegionId", 0);
        setField(term28613, term28613.getClass(), "lastRegionName", null);
        setField(term28613, term28613.getClass(), "lastClientId", null);
        setField(term28613, term28613.getClass(), "lastCountryCode", null);
        setIntField(term28613, term28613.getClass(), "eventPoint", 0);
        setIntField(term28613, term28613.getClass(), "totalLv", 0);
        setIntField(term28613, term28613.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28613, term28613.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28613, term28613.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWinCount", argTypes, term28613, args);
    }

};


