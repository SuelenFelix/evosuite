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

public class UserData_getUserName_853473044108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174663;

    public UserData_getUserName_853473044108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174663 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term174663, term174663.getClass(), "id", 0L);
        setField(term174663, term174663.getClass(), "card", null);
        setField(term174663, term174663.getClass(), "userName", null);
        setField(term174663, term174663.getClass(), "lastLoginDate", null);
        setBooleanField(term174663, term174663.getClass(), "isWebJoin", false);
        setField(term174663, term174663.getClass(), "webLimitDate", null);
        setIntField(term174663, term174663.getClass(), "level", 0);
        setIntField(term174663, term174663.getClass(), "reincarnationNum", 0);
        setField(term174663, term174663.getClass(), "exp", null);
        setLongField(term174663, term174663.getClass(), "point", 0L);
        setLongField(term174663, term174663.getClass(), "totalPoint", 0L);
        setIntField(term174663, term174663.getClass(), "playCount", 0);
        setIntField(term174663, term174663.getClass(), "multiPlayCount", 0);
        setIntField(term174663, term174663.getClass(), "multiWinCount", 0);
        setIntField(term174663, term174663.getClass(), "requestResCount", 0);
        setIntField(term174663, term174663.getClass(), "acceptResCount", 0);
        setIntField(term174663, term174663.getClass(), "successResCount", 0);
        setIntField(term174663, term174663.getClass(), "playerRating", 0);
        setIntField(term174663, term174663.getClass(), "highestRating", 0);
        setIntField(term174663, term174663.getClass(), "nameplateId", 0);
        setIntField(term174663, term174663.getClass(), "frameId", 0);
        setIntField(term174663, term174663.getClass(), "characterId", 0);
        setIntField(term174663, term174663.getClass(), "trophyId", 0);
        setIntField(term174663, term174663.getClass(), "playedTutorialBit", 0);
        setIntField(term174663, term174663.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term174663, term174663.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term174663, term174663.getClass(), "totalRepertoireCount", 0);
        setIntField(term174663, term174663.getClass(), "totalMapNum", 0);
        setLongField(term174663, term174663.getClass(), "totalHiScore", 0L);
        setLongField(term174663, term174663.getClass(), "totalBasicHighScore", 0L);
        setLongField(term174663, term174663.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term174663, term174663.getClass(), "totalExpertHighScore", 0L);
        setLongField(term174663, term174663.getClass(), "totalMasterHighScore", 0L);
        setField(term174663, term174663.getClass(), "eventWatchedDate", null);
        setIntField(term174663, term174663.getClass(), "friendCount", 0);
        setBooleanField(term174663, term174663.getClass(), "isMaimai", false);
        setField(term174663, term174663.getClass(), "firstGameId", null);
        setField(term174663, term174663.getClass(), "firstRomVersion", null);
        setField(term174663, term174663.getClass(), "firstDataVersion", null);
        setField(term174663, term174663.getClass(), "firstPlayDate", null);
        setField(term174663, term174663.getClass(), "lastGameId", null);
        setField(term174663, term174663.getClass(), "lastRomVersion", null);
        setField(term174663, term174663.getClass(), "lastDataVersion", null);
        setField(term174663, term174663.getClass(), "lastPlayDate", null);
        setIntField(term174663, term174663.getClass(), "lastPlaceId", 0);
        setField(term174663, term174663.getClass(), "lastPlaceName", null);
        setField(term174663, term174663.getClass(), "lastRegionId", null);
        setField(term174663, term174663.getClass(), "lastRegionName", null);
        setField(term174663, term174663.getClass(), "lastAllNetId", null);
        setField(term174663, term174663.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term174663, args);
    }

};


