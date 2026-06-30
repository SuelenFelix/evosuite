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

public class UserData_getRankAuthTailId_984860546139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29453;

    public UserData_getRankAuthTailId_984860546139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29453 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term29453, term29453.getClass(), "id", 0L);
        setField(term29453, term29453.getClass(), "card", null);
        setIntField(term29453, term29453.getClass(), "lastDataVersion", 0);
        setField(term29453, term29453.getClass(), "userName", null);
        setIntField(term29453, term29453.getClass(), "point", 0);
        setIntField(term29453, term29453.getClass(), "totalPoint", 0);
        setIntField(term29453, term29453.getClass(), "iconId", 0);
        setIntField(term29453, term29453.getClass(), "nameplateId", 0);
        setIntField(term29453, term29453.getClass(), "frameId", 0);
        setIntField(term29453, term29453.getClass(), "trophyId", 0);
        setIntField(term29453, term29453.getClass(), "playCount", 0);
        setIntField(term29453, term29453.getClass(), "playVsCount", 0);
        setIntField(term29453, term29453.getClass(), "playSyncCount", 0);
        setIntField(term29453, term29453.getClass(), "winCount", 0);
        setIntField(term29453, term29453.getClass(), "helpCount", 0);
        setIntField(term29453, term29453.getClass(), "comboCount", 0);
        setIntField(term29453, term29453.getClass(), "feverCount", 0);
        setIntField(term29453, term29453.getClass(), "totalHiScore", 0);
        setIntField(term29453, term29453.getClass(), "totalEasyHighScore", 0);
        setIntField(term29453, term29453.getClass(), "totalBasicHighScore", 0);
        setIntField(term29453, term29453.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term29453, term29453.getClass(), "totalExpertHighScore", 0);
        setIntField(term29453, term29453.getClass(), "totalMasterHighScore", 0);
        setIntField(term29453, term29453.getClass(), "totalReMasterHighScore", 0);
        setIntField(term29453, term29453.getClass(), "totalHighSync", 0);
        setIntField(term29453, term29453.getClass(), "totalEasySync", 0);
        setIntField(term29453, term29453.getClass(), "totalBasicSync", 0);
        setIntField(term29453, term29453.getClass(), "totalAdvancedSync", 0);
        setIntField(term29453, term29453.getClass(), "totalExpertSync", 0);
        setIntField(term29453, term29453.getClass(), "totalMasterSync", 0);
        setIntField(term29453, term29453.getClass(), "totalReMasterSync", 0);
        setIntField(term29453, term29453.getClass(), "playerRating", 0);
        setIntField(term29453, term29453.getClass(), "highestRating", 0);
        setIntField(term29453, term29453.getClass(), "rankAuthTailId", 0);
        setField(term29453, term29453.getClass(), "eventWatchedDate", null);
        setField(term29453, term29453.getClass(), "webLimitDate", null);
        setIntField(term29453, term29453.getClass(), "challengeTrackPhase", 0);
        setIntField(term29453, term29453.getClass(), "firstPlayBits", 0);
        setField(term29453, term29453.getClass(), "lastPlayDate", null);
        setIntField(term29453, term29453.getClass(), "lastPlaceId", 0);
        setField(term29453, term29453.getClass(), "lastPlaceName", null);
        setIntField(term29453, term29453.getClass(), "lastRegionId", 0);
        setField(term29453, term29453.getClass(), "lastRegionName", null);
        setField(term29453, term29453.getClass(), "lastClientId", null);
        setField(term29453, term29453.getClass(), "lastCountryCode", null);
        setIntField(term29453, term29453.getClass(), "eventPoint", 0);
        setIntField(term29453, term29453.getClass(), "totalLv", 0);
        setIntField(term29453, term29453.getClass(), "lastLoginBonusDay", 0);
        setIntField(term29453, term29453.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term29453, term29453.getClass(), "loginBonusLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRankAuthTailId", argTypes, term29453, args);
    }

};


