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

public class UserData_setFirstGameId_1365251143192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177411;

    public UserData_setFirstGameId_1365251143192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177411 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177411, term177411.getClass(), "id", 0L);
        setField(term177411, term177411.getClass(), "card", null);
        setField(term177411, term177411.getClass(), "userName", null);
        setField(term177411, term177411.getClass(), "lastLoginDate", null);
        setBooleanField(term177411, term177411.getClass(), "isWebJoin", false);
        setField(term177411, term177411.getClass(), "webLimitDate", null);
        setIntField(term177411, term177411.getClass(), "level", 0);
        setIntField(term177411, term177411.getClass(), "reincarnationNum", 0);
        setField(term177411, term177411.getClass(), "exp", null);
        setLongField(term177411, term177411.getClass(), "point", 0L);
        setLongField(term177411, term177411.getClass(), "totalPoint", 0L);
        setIntField(term177411, term177411.getClass(), "playCount", 0);
        setIntField(term177411, term177411.getClass(), "multiPlayCount", 0);
        setIntField(term177411, term177411.getClass(), "multiWinCount", 0);
        setIntField(term177411, term177411.getClass(), "requestResCount", 0);
        setIntField(term177411, term177411.getClass(), "acceptResCount", 0);
        setIntField(term177411, term177411.getClass(), "successResCount", 0);
        setIntField(term177411, term177411.getClass(), "playerRating", 0);
        setIntField(term177411, term177411.getClass(), "highestRating", 0);
        setIntField(term177411, term177411.getClass(), "nameplateId", 0);
        setIntField(term177411, term177411.getClass(), "frameId", 0);
        setIntField(term177411, term177411.getClass(), "characterId", 0);
        setIntField(term177411, term177411.getClass(), "trophyId", 0);
        setIntField(term177411, term177411.getClass(), "playedTutorialBit", 0);
        setIntField(term177411, term177411.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177411, term177411.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177411, term177411.getClass(), "totalRepertoireCount", 0);
        setIntField(term177411, term177411.getClass(), "totalMapNum", 0);
        setLongField(term177411, term177411.getClass(), "totalHiScore", 0L);
        setLongField(term177411, term177411.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177411, term177411.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177411, term177411.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177411, term177411.getClass(), "totalMasterHighScore", 0L);
        setField(term177411, term177411.getClass(), "eventWatchedDate", null);
        setIntField(term177411, term177411.getClass(), "friendCount", 0);
        setBooleanField(term177411, term177411.getClass(), "isMaimai", false);
        setField(term177411, term177411.getClass(), "firstGameId", null);
        setField(term177411, term177411.getClass(), "firstRomVersion", null);
        setField(term177411, term177411.getClass(), "firstDataVersion", null);
        setField(term177411, term177411.getClass(), "firstPlayDate", null);
        setField(term177411, term177411.getClass(), "lastGameId", null);
        setField(term177411, term177411.getClass(), "lastRomVersion", null);
        setField(term177411, term177411.getClass(), "lastDataVersion", null);
        setField(term177411, term177411.getClass(), "lastPlayDate", null);
        setIntField(term177411, term177411.getClass(), "lastPlaceId", 0);
        setField(term177411, term177411.getClass(), "lastPlaceName", null);
        setField(term177411, term177411.getClass(), "lastRegionId", null);
        setField(term177411, term177411.getClass(), "lastRegionName", null);
        setField(term177411, term177411.getClass(), "lastAllNetId", null);
        setField(term177411, term177411.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstGameId", argTypes, term177411, args);
    }

};


