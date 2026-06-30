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

public class ExternalUserData_getLevel_898429101109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41920;

    public ExternalUserData_getLevel_898429101109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41920 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term41920, term41920.getClass(), "accessCode", null);
        setField(term41920, term41920.getClass(), "userName", null);
        setField(term41920, term41920.getClass(), "lastLoginDate", null);
        setBooleanField(term41920, term41920.getClass(), "isWebJoin", false);
        setField(term41920, term41920.getClass(), "webLimitDate", null);
        setIntField(term41920, term41920.getClass(), "level", 0);
        setIntField(term41920, term41920.getClass(), "reincarnationNum", 0);
        setField(term41920, term41920.getClass(), "exp", null);
        setLongField(term41920, term41920.getClass(), "point", 0L);
        setLongField(term41920, term41920.getClass(), "totalPoint", 0L);
        setIntField(term41920, term41920.getClass(), "playCount", 0);
        setIntField(term41920, term41920.getClass(), "multiPlayCount", 0);
        setIntField(term41920, term41920.getClass(), "multiWinCount", 0);
        setIntField(term41920, term41920.getClass(), "requestResCount", 0);
        setIntField(term41920, term41920.getClass(), "acceptResCount", 0);
        setIntField(term41920, term41920.getClass(), "successResCount", 0);
        setIntField(term41920, term41920.getClass(), "playerRating", 0);
        setIntField(term41920, term41920.getClass(), "highestRating", 0);
        setIntField(term41920, term41920.getClass(), "nameplateId", 0);
        setIntField(term41920, term41920.getClass(), "frameId", 0);
        setIntField(term41920, term41920.getClass(), "characterId", 0);
        setIntField(term41920, term41920.getClass(), "trophyId", 0);
        setIntField(term41920, term41920.getClass(), "playedTutorialBit", 0);
        setIntField(term41920, term41920.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term41920, term41920.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term41920, term41920.getClass(), "totalRepertoireCount", 0);
        setIntField(term41920, term41920.getClass(), "totalMapNum", 0);
        setLongField(term41920, term41920.getClass(), "totalHiScore", 0L);
        setLongField(term41920, term41920.getClass(), "totalBasicHighScore", 0L);
        setLongField(term41920, term41920.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term41920, term41920.getClass(), "totalExpertHighScore", 0L);
        setLongField(term41920, term41920.getClass(), "totalMasterHighScore", 0L);
        setField(term41920, term41920.getClass(), "eventWatchedDate", null);
        setIntField(term41920, term41920.getClass(), "friendCount", 0);
        setBooleanField(term41920, term41920.getClass(), "isMaimai", false);
        setField(term41920, term41920.getClass(), "firstGameId", null);
        setField(term41920, term41920.getClass(), "firstRomVersion", null);
        setField(term41920, term41920.getClass(), "firstDataVersion", null);
        setField(term41920, term41920.getClass(), "firstPlayDate", null);
        setField(term41920, term41920.getClass(), "lastGameId", null);
        setField(term41920, term41920.getClass(), "lastRomVersion", null);
        setField(term41920, term41920.getClass(), "lastDataVersion", null);
        setField(term41920, term41920.getClass(), "lastPlayDate", null);
        setIntField(term41920, term41920.getClass(), "lastPlaceId", 0);
        setField(term41920, term41920.getClass(), "lastPlaceName", null);
        setField(term41920, term41920.getClass(), "lastRegionId", null);
        setField(term41920, term41920.getClass(), "lastRegionName", null);
        setField(term41920, term41920.getClass(), "lastAllNetId", null);
        setField(term41920, term41920.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term41920, args);
    }

};


