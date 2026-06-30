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

public class UserData_setTotalHighSync_180315358180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31219;
     Object term31261;

    public UserData_setTotalHighSync_180315358180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31219 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31219, term31219.getClass(), "id", 0L);
        setField(term31219, term31219.getClass(), "card", null);
        setIntField(term31219, term31219.getClass(), "lastDataVersion", 0);
        setField(term31219, term31219.getClass(), "userName", null);
        setIntField(term31219, term31219.getClass(), "point", 0);
        setIntField(term31219, term31219.getClass(), "totalPoint", 0);
        setIntField(term31219, term31219.getClass(), "iconId", 0);
        setIntField(term31219, term31219.getClass(), "nameplateId", 0);
        setIntField(term31219, term31219.getClass(), "frameId", 0);
        setIntField(term31219, term31219.getClass(), "trophyId", 0);
        setIntField(term31219, term31219.getClass(), "playCount", 0);
        setIntField(term31219, term31219.getClass(), "playVsCount", 0);
        setIntField(term31219, term31219.getClass(), "playSyncCount", 0);
        setIntField(term31219, term31219.getClass(), "winCount", 0);
        setIntField(term31219, term31219.getClass(), "helpCount", 0);
        setIntField(term31219, term31219.getClass(), "comboCount", 0);
        setIntField(term31219, term31219.getClass(), "feverCount", 0);
        setIntField(term31219, term31219.getClass(), "totalHiScore", 0);
        setIntField(term31219, term31219.getClass(), "totalEasyHighScore", 0);
        setIntField(term31219, term31219.getClass(), "totalBasicHighScore", 0);
        setIntField(term31219, term31219.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31219, term31219.getClass(), "totalExpertHighScore", 0);
        setIntField(term31219, term31219.getClass(), "totalMasterHighScore", 0);
        setIntField(term31219, term31219.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31219, term31219.getClass(), "totalHighSync", 0);
        setIntField(term31219, term31219.getClass(), "totalEasySync", 0);
        setIntField(term31219, term31219.getClass(), "totalBasicSync", 0);
        setIntField(term31219, term31219.getClass(), "totalAdvancedSync", 0);
        setIntField(term31219, term31219.getClass(), "totalExpertSync", 0);
        setIntField(term31219, term31219.getClass(), "totalMasterSync", 0);
        setIntField(term31219, term31219.getClass(), "totalReMasterSync", 0);
        setIntField(term31219, term31219.getClass(), "playerRating", 0);
        setIntField(term31219, term31219.getClass(), "highestRating", 0);
        setIntField(term31219, term31219.getClass(), "rankAuthTailId", 0);
        setField(term31219, term31219.getClass(), "eventWatchedDate", null);
        setField(term31219, term31219.getClass(), "webLimitDate", null);
        setIntField(term31219, term31219.getClass(), "challengeTrackPhase", 0);
        setIntField(term31219, term31219.getClass(), "firstPlayBits", 0);
        setField(term31219, term31219.getClass(), "lastPlayDate", null);
        setIntField(term31219, term31219.getClass(), "lastPlaceId", 0);
        setField(term31219, term31219.getClass(), "lastPlaceName", null);
        setIntField(term31219, term31219.getClass(), "lastRegionId", 0);
        setField(term31219, term31219.getClass(), "lastRegionName", null);
        setField(term31219, term31219.getClass(), "lastClientId", null);
        setField(term31219, term31219.getClass(), "lastCountryCode", null);
        setIntField(term31219, term31219.getClass(), "eventPoint", 0);
        setIntField(term31219, term31219.getClass(), "totalLv", 0);
        setIntField(term31219, term31219.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31219, term31219.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31219, term31219.getClass(), "loginBonusLv", 0);
        term31261 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31261;
        callMethod(klass, "setTotalHighSync", argTypes, term31219, args);
    }

};


