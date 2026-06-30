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
import java.lang.Integer;

public class UserData_setLastLoginBonusDay_39269869203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32217;
     Object term32259;

    public UserData_setLastLoginBonusDay_39269869203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32217 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term32217, term32217.getClass(), "id", 0L);
        setField(term32217, term32217.getClass(), "card", null);
        setIntField(term32217, term32217.getClass(), "lastDataVersion", 0);
        setField(term32217, term32217.getClass(), "userName", null);
        setIntField(term32217, term32217.getClass(), "point", 0);
        setIntField(term32217, term32217.getClass(), "totalPoint", 0);
        setIntField(term32217, term32217.getClass(), "iconId", 0);
        setIntField(term32217, term32217.getClass(), "nameplateId", 0);
        setIntField(term32217, term32217.getClass(), "frameId", 0);
        setIntField(term32217, term32217.getClass(), "trophyId", 0);
        setIntField(term32217, term32217.getClass(), "playCount", 0);
        setIntField(term32217, term32217.getClass(), "playVsCount", 0);
        setIntField(term32217, term32217.getClass(), "playSyncCount", 0);
        setIntField(term32217, term32217.getClass(), "winCount", 0);
        setIntField(term32217, term32217.getClass(), "helpCount", 0);
        setIntField(term32217, term32217.getClass(), "comboCount", 0);
        setIntField(term32217, term32217.getClass(), "feverCount", 0);
        setIntField(term32217, term32217.getClass(), "totalHiScore", 0);
        setIntField(term32217, term32217.getClass(), "totalEasyHighScore", 0);
        setIntField(term32217, term32217.getClass(), "totalBasicHighScore", 0);
        setIntField(term32217, term32217.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term32217, term32217.getClass(), "totalExpertHighScore", 0);
        setIntField(term32217, term32217.getClass(), "totalMasterHighScore", 0);
        setIntField(term32217, term32217.getClass(), "totalReMasterHighScore", 0);
        setIntField(term32217, term32217.getClass(), "totalHighSync", 0);
        setIntField(term32217, term32217.getClass(), "totalEasySync", 0);
        setIntField(term32217, term32217.getClass(), "totalBasicSync", 0);
        setIntField(term32217, term32217.getClass(), "totalAdvancedSync", 0);
        setIntField(term32217, term32217.getClass(), "totalExpertSync", 0);
        setIntField(term32217, term32217.getClass(), "totalMasterSync", 0);
        setIntField(term32217, term32217.getClass(), "totalReMasterSync", 0);
        setIntField(term32217, term32217.getClass(), "playerRating", 0);
        setIntField(term32217, term32217.getClass(), "highestRating", 0);
        setIntField(term32217, term32217.getClass(), "rankAuthTailId", 0);
        setField(term32217, term32217.getClass(), "eventWatchedDate", null);
        setField(term32217, term32217.getClass(), "webLimitDate", null);
        setIntField(term32217, term32217.getClass(), "challengeTrackPhase", 0);
        setIntField(term32217, term32217.getClass(), "firstPlayBits", 0);
        setField(term32217, term32217.getClass(), "lastPlayDate", null);
        setIntField(term32217, term32217.getClass(), "lastPlaceId", 0);
        setField(term32217, term32217.getClass(), "lastPlaceName", null);
        setIntField(term32217, term32217.getClass(), "lastRegionId", 0);
        setField(term32217, term32217.getClass(), "lastRegionName", null);
        setField(term32217, term32217.getClass(), "lastClientId", null);
        setField(term32217, term32217.getClass(), "lastCountryCode", null);
        setIntField(term32217, term32217.getClass(), "eventPoint", 0);
        setIntField(term32217, term32217.getClass(), "totalLv", 0);
        setIntField(term32217, term32217.getClass(), "lastLoginBonusDay", 0);
        setIntField(term32217, term32217.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term32217, term32217.getClass(), "loginBonusLv", 0);
        term32259 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32259;
        callMethod(klass, "setLastLoginBonusDay", argTypes, term32217, args);
    }

};


