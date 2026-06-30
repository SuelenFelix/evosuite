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

public class UserData_setChallengeTrackPhase_921093424192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31743;
     Object term31785;

    public UserData_setChallengeTrackPhase_921093424192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31743 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        setLongField(term31743, term31743.getClass(), "id", 0L);
        setField(term31743, term31743.getClass(), "card", null);
        setIntField(term31743, term31743.getClass(), "lastDataVersion", 0);
        setField(term31743, term31743.getClass(), "userName", null);
        setIntField(term31743, term31743.getClass(), "point", 0);
        setIntField(term31743, term31743.getClass(), "totalPoint", 0);
        setIntField(term31743, term31743.getClass(), "iconId", 0);
        setIntField(term31743, term31743.getClass(), "nameplateId", 0);
        setIntField(term31743, term31743.getClass(), "frameId", 0);
        setIntField(term31743, term31743.getClass(), "trophyId", 0);
        setIntField(term31743, term31743.getClass(), "playCount", 0);
        setIntField(term31743, term31743.getClass(), "playVsCount", 0);
        setIntField(term31743, term31743.getClass(), "playSyncCount", 0);
        setIntField(term31743, term31743.getClass(), "winCount", 0);
        setIntField(term31743, term31743.getClass(), "helpCount", 0);
        setIntField(term31743, term31743.getClass(), "comboCount", 0);
        setIntField(term31743, term31743.getClass(), "feverCount", 0);
        setIntField(term31743, term31743.getClass(), "totalHiScore", 0);
        setIntField(term31743, term31743.getClass(), "totalEasyHighScore", 0);
        setIntField(term31743, term31743.getClass(), "totalBasicHighScore", 0);
        setIntField(term31743, term31743.getClass(), "totalAdvancedHighScore", 0);
        setIntField(term31743, term31743.getClass(), "totalExpertHighScore", 0);
        setIntField(term31743, term31743.getClass(), "totalMasterHighScore", 0);
        setIntField(term31743, term31743.getClass(), "totalReMasterHighScore", 0);
        setIntField(term31743, term31743.getClass(), "totalHighSync", 0);
        setIntField(term31743, term31743.getClass(), "totalEasySync", 0);
        setIntField(term31743, term31743.getClass(), "totalBasicSync", 0);
        setIntField(term31743, term31743.getClass(), "totalAdvancedSync", 0);
        setIntField(term31743, term31743.getClass(), "totalExpertSync", 0);
        setIntField(term31743, term31743.getClass(), "totalMasterSync", 0);
        setIntField(term31743, term31743.getClass(), "totalReMasterSync", 0);
        setIntField(term31743, term31743.getClass(), "playerRating", 0);
        setIntField(term31743, term31743.getClass(), "highestRating", 0);
        setIntField(term31743, term31743.getClass(), "rankAuthTailId", 0);
        setField(term31743, term31743.getClass(), "eventWatchedDate", null);
        setField(term31743, term31743.getClass(), "webLimitDate", null);
        setIntField(term31743, term31743.getClass(), "challengeTrackPhase", 0);
        setIntField(term31743, term31743.getClass(), "firstPlayBits", 0);
        setField(term31743, term31743.getClass(), "lastPlayDate", null);
        setIntField(term31743, term31743.getClass(), "lastPlaceId", 0);
        setField(term31743, term31743.getClass(), "lastPlaceName", null);
        setIntField(term31743, term31743.getClass(), "lastRegionId", 0);
        setField(term31743, term31743.getClass(), "lastRegionName", null);
        setField(term31743, term31743.getClass(), "lastClientId", null);
        setField(term31743, term31743.getClass(), "lastCountryCode", null);
        setIntField(term31743, term31743.getClass(), "eventPoint", 0);
        setIntField(term31743, term31743.getClass(), "totalLv", 0);
        setIntField(term31743, term31743.getClass(), "lastLoginBonusDay", 0);
        setIntField(term31743, term31743.getClass(), "lastSurvivalBonusDay", 0);
        setIntField(term31743, term31743.getClass(), "loginBonusLv", 0);
        term31785 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31785;
        callMethod(klass, "setChallengeTrackPhase", argTypes, term31743, args);
    }

};


