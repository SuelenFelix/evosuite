package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_hashCode_298693622208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177925;

    public UserData_hashCode_298693622208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177925 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177925, term177925.getClass(), "id", 0L);
        setField(term177925, term177925.getClass(), "card", null);
        setField(term177925, term177925.getClass(), "userName", null);
        setField(term177925, term177925.getClass(), "lastLoginDate", null);
        setBooleanField(term177925, term177925.getClass(), "isWebJoin", false);
        setField(term177925, term177925.getClass(), "webLimitDate", null);
        setIntField(term177925, term177925.getClass(), "level", 0);
        setIntField(term177925, term177925.getClass(), "reincarnationNum", 0);
        setField(term177925, term177925.getClass(), "exp", null);
        setLongField(term177925, term177925.getClass(), "point", 0L);
        setLongField(term177925, term177925.getClass(), "totalPoint", 0L);
        setIntField(term177925, term177925.getClass(), "playCount", 0);
        setIntField(term177925, term177925.getClass(), "multiPlayCount", 0);
        setIntField(term177925, term177925.getClass(), "multiWinCount", 0);
        setIntField(term177925, term177925.getClass(), "requestResCount", 0);
        setIntField(term177925, term177925.getClass(), "acceptResCount", 0);
        setIntField(term177925, term177925.getClass(), "successResCount", 0);
        setIntField(term177925, term177925.getClass(), "playerRating", 0);
        setIntField(term177925, term177925.getClass(), "highestRating", 0);
        setIntField(term177925, term177925.getClass(), "nameplateId", 0);
        setIntField(term177925, term177925.getClass(), "frameId", 0);
        setIntField(term177925, term177925.getClass(), "characterId", 0);
        setIntField(term177925, term177925.getClass(), "trophyId", 0);
        setIntField(term177925, term177925.getClass(), "playedTutorialBit", 0);
        setIntField(term177925, term177925.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177925, term177925.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177925, term177925.getClass(), "totalRepertoireCount", 0);
        setIntField(term177925, term177925.getClass(), "totalMapNum", 0);
        setLongField(term177925, term177925.getClass(), "totalHiScore", 0L);
        setLongField(term177925, term177925.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177925, term177925.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177925, term177925.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177925, term177925.getClass(), "totalMasterHighScore", 0L);
        setField(term177925, term177925.getClass(), "eventWatchedDate", null);
        setIntField(term177925, term177925.getClass(), "friendCount", 0);
        setBooleanField(term177925, term177925.getClass(), "isMaimai", false);
        setField(term177925, term177925.getClass(), "firstGameId", null);
        setField(term177925, term177925.getClass(), "firstRomVersion", null);
        setField(term177925, term177925.getClass(), "firstDataVersion", null);
        setField(term177925, term177925.getClass(), "firstPlayDate", null);
        setField(term177925, term177925.getClass(), "lastGameId", null);
        setField(term177925, term177925.getClass(), "lastRomVersion", null);
        setField(term177925, term177925.getClass(), "lastDataVersion", null);
        setField(term177925, term177925.getClass(), "lastPlayDate", null);
        setIntField(term177925, term177925.getClass(), "lastPlaceId", 0);
        setField(term177925, term177925.getClass(), "lastPlaceName", null);
        setField(term177925, term177925.getClass(), "lastRegionId", null);
        setField(term177925, term177925.getClass(), "lastRegionName", null);
        setField(term177925, term177925.getClass(), "lastAllNetId", null);
        setField(term177925, term177925.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term177925, args);
    }

};


