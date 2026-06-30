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

public class UserData_isWebJoin_128645233110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174727;

    public UserData_isWebJoin_128645233110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174727 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term174727, term174727.getClass(), "id", 0L);
        setField(term174727, term174727.getClass(), "card", null);
        setField(term174727, term174727.getClass(), "userName", null);
        setField(term174727, term174727.getClass(), "lastLoginDate", null);
        setBooleanField(term174727, term174727.getClass(), "isWebJoin", false);
        setField(term174727, term174727.getClass(), "webLimitDate", null);
        setIntField(term174727, term174727.getClass(), "level", 0);
        setIntField(term174727, term174727.getClass(), "reincarnationNum", 0);
        setField(term174727, term174727.getClass(), "exp", null);
        setLongField(term174727, term174727.getClass(), "point", 0L);
        setLongField(term174727, term174727.getClass(), "totalPoint", 0L);
        setIntField(term174727, term174727.getClass(), "playCount", 0);
        setIntField(term174727, term174727.getClass(), "multiPlayCount", 0);
        setIntField(term174727, term174727.getClass(), "multiWinCount", 0);
        setIntField(term174727, term174727.getClass(), "requestResCount", 0);
        setIntField(term174727, term174727.getClass(), "acceptResCount", 0);
        setIntField(term174727, term174727.getClass(), "successResCount", 0);
        setIntField(term174727, term174727.getClass(), "playerRating", 0);
        setIntField(term174727, term174727.getClass(), "highestRating", 0);
        setIntField(term174727, term174727.getClass(), "nameplateId", 0);
        setIntField(term174727, term174727.getClass(), "frameId", 0);
        setIntField(term174727, term174727.getClass(), "characterId", 0);
        setIntField(term174727, term174727.getClass(), "trophyId", 0);
        setIntField(term174727, term174727.getClass(), "playedTutorialBit", 0);
        setIntField(term174727, term174727.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term174727, term174727.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term174727, term174727.getClass(), "totalRepertoireCount", 0);
        setIntField(term174727, term174727.getClass(), "totalMapNum", 0);
        setLongField(term174727, term174727.getClass(), "totalHiScore", 0L);
        setLongField(term174727, term174727.getClass(), "totalBasicHighScore", 0L);
        setLongField(term174727, term174727.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term174727, term174727.getClass(), "totalExpertHighScore", 0L);
        setLongField(term174727, term174727.getClass(), "totalMasterHighScore", 0L);
        setField(term174727, term174727.getClass(), "eventWatchedDate", null);
        setIntField(term174727, term174727.getClass(), "friendCount", 0);
        setBooleanField(term174727, term174727.getClass(), "isMaimai", false);
        setField(term174727, term174727.getClass(), "firstGameId", null);
        setField(term174727, term174727.getClass(), "firstRomVersion", null);
        setField(term174727, term174727.getClass(), "firstDataVersion", null);
        setField(term174727, term174727.getClass(), "firstPlayDate", null);
        setField(term174727, term174727.getClass(), "lastGameId", null);
        setField(term174727, term174727.getClass(), "lastRomVersion", null);
        setField(term174727, term174727.getClass(), "lastDataVersion", null);
        setField(term174727, term174727.getClass(), "lastPlayDate", null);
        setIntField(term174727, term174727.getClass(), "lastPlaceId", 0);
        setField(term174727, term174727.getClass(), "lastPlaceName", null);
        setField(term174727, term174727.getClass(), "lastRegionId", null);
        setField(term174727, term174727.getClass(), "lastRegionName", null);
        setField(term174727, term174727.getClass(), "lastAllNetId", null);
        setField(term174727, term174727.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWebJoin", argTypes, term174727, args);
    }

};


