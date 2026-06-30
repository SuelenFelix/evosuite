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

public class UserData_getFeverCount_1067093706122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28739;

    public UserData_getFeverCount_1067093706122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28739 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term28739, term28739.getClass(), "id", 0L);
        setField(term28739, term28739.getClass(), "card", null);
        setIntField(term28739, term28739.getClass(), "lastDataVersion", 0);
        setField(term28739, term28739.getClass(), "userName", null);
        setIntField(term28739, term28739.getClass(), "point", 0);
        setIntField(term28739, term28739.getClass(), "totalPoint", 0);
        setIntField(term28739, term28739.getClass(), "iconId", 0);
        setIntField(term28739, term28739.getClass(), "nameplateId", 0);
        setIntField(term28739, term28739.getClass(), "frameId", 0);
        setIntField(term28739, term28739.getClass(), "trophyId", 0);
        setIntField(term28739, term28739.getClass(), "playCount", 0);
        setIntField(term28739, term28739.getClass(), "playVsCount", 0);
        setIntField(term28739, term28739.getClass(), "playSyncCount", 0);
        setIntField(term28739, term28739.getClass(), "winCount", 0);
        setIntField(term28739, term28739.getClass(), "helpCount", 0);
        setIntField(term28739, term28739.getClass(), "comboCount", 0);
        setIntField(term28739, term28739.getClass(), "feverCount", 0);
        setIntField(term28739, term28739.getClass(), "totalHiScore", 0);
        setIntField(term28739, term28739.getClass(), "totalEasyHighScore", 0);
        setIntField(term28739, term28739.getClass(), "totalBasicHighScore", 0);
        setIntField(term28739, term28739.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term28739, term28739.getClass(), "totalExpertHighScore", 0);
        setIntField(term28739, term28739.getClass(), "totalMasterHighScore", 0);
        setIntField(term28739, term28739.getClass(), "totalReMasterHighScore", 0);
        setIntField(term28739, term28739.getClass(), "totalHighSync", 0);
        setIntField(term28739, term28739.getClass(), "totalEasySync", 0);
        setIntField(term28739, term28739.getClass(), "totalBasicSync", 0);
        setIntField(term28739, term28739.getClass(), "totalAdvancedSync", 0);
        setIntField(term28739, term28739.getClass(), "totalExpertSync", 0);
        setIntField(term28739, term28739.getClass(), "totalMasterSync", 0);
        setIntField(term28739, term28739.getClass(), "totalReMasterSync", 0);
        setIntField(term28739, term28739.getClass(), "playerRating", 0);
        setIntField(term28739, term28739.getClass(), "highestRating", 0);
        setIntField(term28739, term28739.getClass(), "rankAuthTailId", 0);
        setField(term28739, term28739.getClass(), "eventWatchedDate", null);
        setField(term28739, term28739.getClass(), "webLimitDate", null);
        setIntField(term28739, term28739.getClass(), "challengeTrackPhase", 0);
        setIntField(term28739, term28739.getClass(), "firstPlayBits", 0);
        setField(term28739, term28739.getClass(), "lastPlayDate", null);
        setIntField(term28739, term28739.getClass(), "lastPlaceId", 0);
        setField(term28739, term28739.getClass(), "lastPlaceName", null);
        setIntField(term28739, term28739.getClass(), "lastRegionId", 0);
        setField(term28739, term28739.getClass(), "lastRegionName", null);
        setField(term28739, term28739.getClass(), "lastClientId", null);
        setField(term28739, term28739.getClass(), "lastCountryCode", null);
        setIntField(term28739, term28739.getClass(), "eventPoint", 0);
        setIntField(term28739, term28739.getClass(), "totalLv", 0);
        setIntField(term28739, term28739.getClass(), "lastLoginBonusDay", 0);
        setIntField(term28739, term28739.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term28739, term28739.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeverCount", argTypes, term28739, args);
    }

};


