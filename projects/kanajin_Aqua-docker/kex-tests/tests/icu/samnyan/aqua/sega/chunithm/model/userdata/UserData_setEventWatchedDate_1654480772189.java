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

public class UserData_setEventWatchedDate_1654480772189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177311;

    public UserData_setEventWatchedDate_1654480772189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177311 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177311, term177311.getClass(), "id", 0L);
        setField(term177311, term177311.getClass(), "card", null);
        setField(term177311, term177311.getClass(), "userName", null);
        setField(term177311, term177311.getClass(), "lastLoginDate", null);
        setBooleanField(term177311, term177311.getClass(), "isWebJoin", false);
        setField(term177311, term177311.getClass(), "webLimitDate", null);
        setIntField(term177311, term177311.getClass(), "level", 0);
        setIntField(term177311, term177311.getClass(), "reincarnationNum", 0);
        setField(term177311, term177311.getClass(), "exp", null);
        setLongField(term177311, term177311.getClass(), "point", 0L);
        setLongField(term177311, term177311.getClass(), "totalPoint", 0L);
        setIntField(term177311, term177311.getClass(), "playCount", 0);
        setIntField(term177311, term177311.getClass(), "multiPlayCount", 0);
        setIntField(term177311, term177311.getClass(), "multiWinCount", 0);
        setIntField(term177311, term177311.getClass(), "requestResCount", 0);
        setIntField(term177311, term177311.getClass(), "acceptResCount", 0);
        setIntField(term177311, term177311.getClass(), "successResCount", 0);
        setIntField(term177311, term177311.getClass(), "playerRating", 0);
        setIntField(term177311, term177311.getClass(), "highestRating", 0);
        setIntField(term177311, term177311.getClass(), "nameplateId", 0);
        setIntField(term177311, term177311.getClass(), "frameId", 0);
        setIntField(term177311, term177311.getClass(), "characterId", 0);
        setIntField(term177311, term177311.getClass(), "trophyId", 0);
        setIntField(term177311, term177311.getClass(), "playedTutorialBit", 0);
        setIntField(term177311, term177311.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177311, term177311.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177311, term177311.getClass(), "totalRepertoireCount", 0);
        setIntField(term177311, term177311.getClass(), "totalMapNum", 0);
        setLongField(term177311, term177311.getClass(), "totalHiScore", 0L);
        setLongField(term177311, term177311.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177311, term177311.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177311, term177311.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177311, term177311.getClass(), "totalMasterHighScore", 0L);
        setField(term177311, term177311.getClass(), "eventWatchedDate", null);
        setIntField(term177311, term177311.getClass(), "friendCount", 0);
        setBooleanField(term177311, term177311.getClass(), "isMaimai", false);
        setField(term177311, term177311.getClass(), "firstGameId", null);
        setField(term177311, term177311.getClass(), "firstRomVersion", null);
        setField(term177311, term177311.getClass(), "firstDataVersion", null);
        setField(term177311, term177311.getClass(), "firstPlayDate", null);
        setField(term177311, term177311.getClass(), "lastGameId", null);
        setField(term177311, term177311.getClass(), "lastRomVersion", null);
        setField(term177311, term177311.getClass(), "lastDataVersion", null);
        setField(term177311, term177311.getClass(), "lastPlayDate", null);
        setIntField(term177311, term177311.getClass(), "lastPlaceId", 0);
        setField(term177311, term177311.getClass(), "lastPlaceName", null);
        setField(term177311, term177311.getClass(), "lastRegionId", null);
        setField(term177311, term177311.getClass(), "lastRegionName", null);
        setField(term177311, term177311.getClass(), "lastAllNetId", null);
        setField(term177311, term177311.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEventWatchedDate", argTypes, term177311, args);
    }

};


