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

public class UserData_getTotalExpertSync_1095980676134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29243;

    public UserData_getTotalExpertSync_1095980676134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29243 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29243, term29243.getClass(), "id", 0L);
        setField(term29243, term29243.getClass(), "card", null);
        setIntField(term29243, term29243.getClass(), "lastDataVersion", 0);
        setField(term29243, term29243.getClass(), "userName", null);
        setIntField(term29243, term29243.getClass(), "point", 0);
        setIntField(term29243, term29243.getClass(), "totalPoint", 0);
        setIntField(term29243, term29243.getClass(), "iconId", 0);
        setIntField(term29243, term29243.getClass(), "nameplateId", 0);
        setIntField(term29243, term29243.getClass(), "frameId", 0);
        setIntField(term29243, term29243.getClass(), "trophyId", 0);
        setIntField(term29243, term29243.getClass(), "playCount", 0);
        setIntField(term29243, term29243.getClass(), "playVsCount", 0);
        setIntField(term29243, term29243.getClass(), "playSyncCount", 0);
        setIntField(term29243, term29243.getClass(), "winCount", 0);
        setIntField(term29243, term29243.getClass(), "helpCount", 0);
        setIntField(term29243, term29243.getClass(), "comboCount", 0);
        setIntField(term29243, term29243.getClass(), "feverCount", 0);
        setIntField(term29243, term29243.getClass(), "totalHiScore", 0);
        setIntField(term29243, term29243.getClass(), "totalEasyHighScore", 0);
        setIntField(term29243, term29243.getClass(), "totalBasicHighScore", 0);
        setIntField(term29243, term29243.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29243, term29243.getClass(), "totalExpertHighScore", 0);
        setIntField(term29243, term29243.getClass(), "totalMasterHighScore", 0);
        setIntField(term29243, term29243.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29243, term29243.getClass(), "totalHighSync", 0);
        setIntField(term29243, term29243.getClass(), "totalEasySync", 0);
        setIntField(term29243, term29243.getClass(), "totalBasicSync", 0);
        setIntField(term29243, term29243.getClass(), "totalAdvancedSync", 0);
        setIntField(term29243, term29243.getClass(), "totalExpertSync", 0);
        setIntField(term29243, term29243.getClass(), "totalMasterSync", 0);
        setIntField(term29243, term29243.getClass(), "totalReMasterSync", 0);
        setIntField(term29243, term29243.getClass(), "playerRating", 0);
        setIntField(term29243, term29243.getClass(), "highestRating", 0);
        setIntField(term29243, term29243.getClass(), "rankAuthTailId", 0);
        setField(term29243, term29243.getClass(), "eventWatchedDate", null);
        setField(term29243, term29243.getClass(), "webLimitDate", null);
        setIntField(term29243, term29243.getClass(), "challengeTrackPhase", 0);
        setIntField(term29243, term29243.getClass(), "firstPlayBits", 0);
        setField(term29243, term29243.getClass(), "lastPlayDate", null);
        setIntField(term29243, term29243.getClass(), "lastPlaceId", 0);
        setField(term29243, term29243.getClass(), "lastPlaceName", null);
        setIntField(term29243, term29243.getClass(), "lastRegionId", 0);
        setField(term29243, term29243.getClass(), "lastRegionName", null);
        setField(term29243, term29243.getClass(), "lastClientId", null);
        setField(term29243, term29243.getClass(), "lastCountryCode", null);
        setIntField(term29243, term29243.getClass(), "eventPoint", 0);
        setIntField(term29243, term29243.getClass(), "totalLv", 0);
        setIntField(term29243, term29243.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29243, term29243.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29243, term29243.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertSync", argTypes, term29243, args);
    }

};


