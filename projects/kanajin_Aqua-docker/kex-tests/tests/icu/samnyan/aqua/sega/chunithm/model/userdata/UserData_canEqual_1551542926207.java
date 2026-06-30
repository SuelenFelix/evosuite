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

public class UserData_canEqual_1551542926207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177893;

    public UserData_canEqual_1551542926207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177893 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177893, term177893.getClass(), "id", 0L);
        setField(term177893, term177893.getClass(), "card", null);
        setField(term177893, term177893.getClass(), "userName", null);
        setField(term177893, term177893.getClass(), "lastLoginDate", null);
        setBooleanField(term177893, term177893.getClass(), "isWebJoin", false);
        setField(term177893, term177893.getClass(), "webLimitDate", null);
        setIntField(term177893, term177893.getClass(), "level", 0);
        setIntField(term177893, term177893.getClass(), "reincarnationNum", 0);
        setField(term177893, term177893.getClass(), "exp", null);
        setLongField(term177893, term177893.getClass(), "point", 0L);
        setLongField(term177893, term177893.getClass(), "totalPoint", 0L);
        setIntField(term177893, term177893.getClass(), "playCount", 0);
        setIntField(term177893, term177893.getClass(), "multiPlayCount", 0);
        setIntField(term177893, term177893.getClass(), "multiWinCount", 0);
        setIntField(term177893, term177893.getClass(), "requestResCount", 0);
        setIntField(term177893, term177893.getClass(), "acceptResCount", 0);
        setIntField(term177893, term177893.getClass(), "successResCount", 0);
        setIntField(term177893, term177893.getClass(), "playerRating", 0);
        setIntField(term177893, term177893.getClass(), "highestRating", 0);
        setIntField(term177893, term177893.getClass(), "nameplateId", 0);
        setIntField(term177893, term177893.getClass(), "frameId", 0);
        setIntField(term177893, term177893.getClass(), "characterId", 0);
        setIntField(term177893, term177893.getClass(), "trophyId", 0);
        setIntField(term177893, term177893.getClass(), "playedTutorialBit", 0);
        setIntField(term177893, term177893.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177893, term177893.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177893, term177893.getClass(), "totalRepertoireCount", 0);
        setIntField(term177893, term177893.getClass(), "totalMapNum", 0);
        setLongField(term177893, term177893.getClass(), "totalHiScore", 0L);
        setLongField(term177893, term177893.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177893, term177893.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177893, term177893.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177893, term177893.getClass(), "totalMasterHighScore", 0L);
        setField(term177893, term177893.getClass(), "eventWatchedDate", null);
        setIntField(term177893, term177893.getClass(), "friendCount", 0);
        setBooleanField(term177893, term177893.getClass(), "isMaimai", false);
        setField(term177893, term177893.getClass(), "firstGameId", null);
        setField(term177893, term177893.getClass(), "firstRomVersion", null);
        setField(term177893, term177893.getClass(), "firstDataVersion", null);
        setField(term177893, term177893.getClass(), "firstPlayDate", null);
        setField(term177893, term177893.getClass(), "lastGameId", null);
        setField(term177893, term177893.getClass(), "lastRomVersion", null);
        setField(term177893, term177893.getClass(), "lastDataVersion", null);
        setField(term177893, term177893.getClass(), "lastPlayDate", null);
        setIntField(term177893, term177893.getClass(), "lastPlaceId", 0);
        setField(term177893, term177893.getClass(), "lastPlaceName", null);
        setField(term177893, term177893.getClass(), "lastRegionId", null);
        setField(term177893, term177893.getClass(), "lastRegionName", null);
        setField(term177893, term177893.getClass(), "lastAllNetId", null);
        setField(term177893, term177893.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term177893, args);
    }

};


