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
import java.lang.Integer;

public class UserData_setFriendCount_602695456190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177343;
     Object term177375;

    public UserData_setFriendCount_602695456190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177343 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177343, term177343.getClass(), "id", 0L);
        setField(term177343, term177343.getClass(), "card", null);
        setField(term177343, term177343.getClass(), "userName", null);
        setField(term177343, term177343.getClass(), "lastLoginDate", null);
        setBooleanField(term177343, term177343.getClass(), "isWebJoin", false);
        setField(term177343, term177343.getClass(), "webLimitDate", null);
        setIntField(term177343, term177343.getClass(), "level", 0);
        setIntField(term177343, term177343.getClass(), "reincarnationNum", 0);
        setField(term177343, term177343.getClass(), "exp", null);
        setLongField(term177343, term177343.getClass(), "point", 0L);
        setLongField(term177343, term177343.getClass(), "totalPoint", 0L);
        setIntField(term177343, term177343.getClass(), "playCount", 0);
        setIntField(term177343, term177343.getClass(), "multiPlayCount", 0);
        setIntField(term177343, term177343.getClass(), "multiWinCount", 0);
        setIntField(term177343, term177343.getClass(), "requestResCount", 0);
        setIntField(term177343, term177343.getClass(), "acceptResCount", 0);
        setIntField(term177343, term177343.getClass(), "successResCount", 0);
        setIntField(term177343, term177343.getClass(), "playerRating", 0);
        setIntField(term177343, term177343.getClass(), "highestRating", 0);
        setIntField(term177343, term177343.getClass(), "nameplateId", 0);
        setIntField(term177343, term177343.getClass(), "frameId", 0);
        setIntField(term177343, term177343.getClass(), "characterId", 0);
        setIntField(term177343, term177343.getClass(), "trophyId", 0);
        setIntField(term177343, term177343.getClass(), "playedTutorialBit", 0);
        setIntField(term177343, term177343.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177343, term177343.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177343, term177343.getClass(), "totalRepertoireCount", 0);
        setIntField(term177343, term177343.getClass(), "totalMapNum", 0);
        setLongField(term177343, term177343.getClass(), "totalHiScore", 0L);
        setLongField(term177343, term177343.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177343, term177343.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177343, term177343.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177343, term177343.getClass(), "totalMasterHighScore", 0L);
        setField(term177343, term177343.getClass(), "eventWatchedDate", null);
        setIntField(term177343, term177343.getClass(), "friendCount", 0);
        setBooleanField(term177343, term177343.getClass(), "isMaimai", false);
        setField(term177343, term177343.getClass(), "firstGameId", null);
        setField(term177343, term177343.getClass(), "firstRomVersion", null);
        setField(term177343, term177343.getClass(), "firstDataVersion", null);
        setField(term177343, term177343.getClass(), "firstPlayDate", null);
        setField(term177343, term177343.getClass(), "lastGameId", null);
        setField(term177343, term177343.getClass(), "lastRomVersion", null);
        setField(term177343, term177343.getClass(), "lastDataVersion", null);
        setField(term177343, term177343.getClass(), "lastPlayDate", null);
        setIntField(term177343, term177343.getClass(), "lastPlaceId", 0);
        setField(term177343, term177343.getClass(), "lastPlaceName", null);
        setField(term177343, term177343.getClass(), "lastRegionId", null);
        setField(term177343, term177343.getClass(), "lastRegionName", null);
        setField(term177343, term177343.getClass(), "lastAllNetId", null);
        setField(term177343, term177343.getClass(), "lastClientId", null);
        term177375 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177375;
        callMethod(klass, "setFriendCount", argTypes, term177343, args);
    }

};


