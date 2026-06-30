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

public class UserData_setPlaySyncCount_175771837168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30691;
     Object term30733;

    public UserData_setPlaySyncCount_175771837168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30691 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term30691, term30691.getClass(), "id", 0L);
        setField(term30691, term30691.getClass(), "card", null);
        setIntField(term30691, term30691.getClass(), "lastDataVersion", 0);
        setField(term30691, term30691.getClass(), "userName", null);
        setIntField(term30691, term30691.getClass(), "point", 0);
        setIntField(term30691, term30691.getClass(), "totalPoint", 0);
        setIntField(term30691, term30691.getClass(), "iconId", 0);
        setIntField(term30691, term30691.getClass(), "nameplateId", 0);
        setIntField(term30691, term30691.getClass(), "frameId", 0);
        setIntField(term30691, term30691.getClass(), "trophyId", 0);
        setIntField(term30691, term30691.getClass(), "playCount", 0);
        setIntField(term30691, term30691.getClass(), "playVsCount", 0);
        setIntField(term30691, term30691.getClass(), "playSyncCount", 0);
        setIntField(term30691, term30691.getClass(), "winCount", 0);
        setIntField(term30691, term30691.getClass(), "helpCount", 0);
        setIntField(term30691, term30691.getClass(), "comboCount", 0);
        setIntField(term30691, term30691.getClass(), "feverCount", 0);
        setIntField(term30691, term30691.getClass(), "totalHiScore", 0);
        setIntField(term30691, term30691.getClass(), "totalEasyHighScore", 0);
        setIntField(term30691, term30691.getClass(), "totalBasicHighScore", 0);
        setIntField(term30691, term30691.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term30691, term30691.getClass(), "totalExpertHighScore", 0);
        setIntField(term30691, term30691.getClass(), "totalMasterHighScore", 0);
        setIntField(term30691, term30691.getClass(), "totalReMasterHighScore", 0);
        setIntField(term30691, term30691.getClass(), "totalHighSync", 0);
        setIntField(term30691, term30691.getClass(), "totalEasySync", 0);
        setIntField(term30691, term30691.getClass(), "totalBasicSync", 0);
        setIntField(term30691, term30691.getClass(), "totalAdvancedSync", 0);
        setIntField(term30691, term30691.getClass(), "totalExpertSync", 0);
        setIntField(term30691, term30691.getClass(), "totalMasterSync", 0);
        setIntField(term30691, term30691.getClass(), "totalReMasterSync", 0);
        setIntField(term30691, term30691.getClass(), "playerRating", 0);
        setIntField(term30691, term30691.getClass(), "highestRating", 0);
        setIntField(term30691, term30691.getClass(), "rankAuthTailId", 0);
        setField(term30691, term30691.getClass(), "eventWatchedDate", null);
        setField(term30691, term30691.getClass(), "webLimitDate", null);
        setIntField(term30691, term30691.getClass(), "challengeTrackPhase", 0);
        setIntField(term30691, term30691.getClass(), "firstPlayBits", 0);
        setField(term30691, term30691.getClass(), "lastPlayDate", null);
        setIntField(term30691, term30691.getClass(), "lastPlaceId", 0);
        setField(term30691, term30691.getClass(), "lastPlaceName", null);
        setIntField(term30691, term30691.getClass(), "lastRegionId", 0);
        setField(term30691, term30691.getClass(), "lastRegionName", null);
        setField(term30691, term30691.getClass(), "lastClientId", null);
        setField(term30691, term30691.getClass(), "lastCountryCode", null);
        setIntField(term30691, term30691.getClass(), "eventPoint", 0);
        setIntField(term30691, term30691.getClass(), "totalLv", 0);
        setIntField(term30691, term30691.getClass(), "lastLoginBonusDay", 0);
        setIntField(term30691, term30691.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term30691, term30691.getClass(), "loginBonusLv", 0);
        term30733 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30733;
        callMethod(klass, "setPlaySyncCount", argTypes, term30691, args);
    }

};


