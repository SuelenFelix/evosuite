package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getPlayerRating_1232526759120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42261;

    public ExternalUserData_getPlayerRating_1232526759120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42261 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term42261, term42261.getClass(), "accessCode", null);
        setField(term42261, term42261.getClass(), "userName", null);
        setField(term42261, term42261.getClass(), "lastLoginDate", null);
        setBooleanField(term42261, term42261.getClass(), "isWebJoin", false);
        setField(term42261, term42261.getClass(), "webLimitDate", null);
        setIntField(term42261, term42261.getClass(), "level", 0);
        setIntField(term42261, term42261.getClass(), "reincarnationNum", 0);
        setField(term42261, term42261.getClass(), "exp", null);
        setLongField(term42261, term42261.getClass(), "point", 0L);
        setLongField(term42261, term42261.getClass(), "totalPoint", 0L);
        setIntField(term42261, term42261.getClass(), "playCount", 0);
        setIntField(term42261, term42261.getClass(), "multiPlayCount", 0);
        setIntField(term42261, term42261.getClass(), "multiWinCount", 0);
        setIntField(term42261, term42261.getClass(), "requestResCount", 0);
        setIntField(term42261, term42261.getClass(), "acceptResCount", 0);
        setIntField(term42261, term42261.getClass(), "successResCount", 0);
        setIntField(term42261, term42261.getClass(), "playerRating", 0);
        setIntField(term42261, term42261.getClass(), "highestRating", 0);
        setIntField(term42261, term42261.getClass(), "nameplateId", 0);
        setIntField(term42261, term42261.getClass(), "frameId", 0);
        setIntField(term42261, term42261.getClass(), "characterId", 0);
        setIntField(term42261, term42261.getClass(), "trophyId", 0);
        setIntField(term42261, term42261.getClass(), "playedTutorialBit", 0);
        setIntField(term42261, term42261.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42261, term42261.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42261, term42261.getClass(), "totalRepertoireCount", 0);
        setIntField(term42261, term42261.getClass(), "totalMapNum", 0);
        setLongField(term42261, term42261.getClass(), "totalHiScore", 0L);
        setLongField(term42261, term42261.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42261, term42261.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42261, term42261.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42261, term42261.getClass(), "totalMasterHighScore", 0L);
        setField(term42261, term42261.getClass(), "eventWatchedDate", null);
        setIntField(term42261, term42261.getClass(), "friendCount", 0);
        setBooleanField(term42261, term42261.getClass(), "isMaimai", false);
        setField(term42261, term42261.getClass(), "firstGameId", null);
        setField(term42261, term42261.getClass(), "firstRomVersion", null);
        setField(term42261, term42261.getClass(), "firstDataVersion", null);
        setField(term42261, term42261.getClass(), "firstPlayDate", null);
        setField(term42261, term42261.getClass(), "lastGameId", null);
        setField(term42261, term42261.getClass(), "lastRomVersion", null);
        setField(term42261, term42261.getClass(), "lastDataVersion", null);
        setField(term42261, term42261.getClass(), "lastPlayDate", null);
        setIntField(term42261, term42261.getClass(), "lastPlaceId", 0);
        setField(term42261, term42261.getClass(), "lastPlaceName", null);
        setField(term42261, term42261.getClass(), "lastRegionId", null);
        setField(term42261, term42261.getClass(), "lastRegionName", null);
        setField(term42261, term42261.getClass(), "lastAllNetId", null);
        setField(term42261, term42261.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term42261, args);
    }

};


