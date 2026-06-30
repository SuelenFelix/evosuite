package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getSuccessResCount_1353514848119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42230;

    public ExternalUserData_getSuccessResCount_1353514848119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42230 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term42230, term42230.getClass(), "accessCode", null);
        setField(term42230, term42230.getClass(), "userName", null);
        setField(term42230, term42230.getClass(), "lastLoginDate", null);
        setBooleanField(term42230, term42230.getClass(), "isWebJoin", false);
        setField(term42230, term42230.getClass(), "webLimitDate", null);
        setIntField(term42230, term42230.getClass(), "level", 0);
        setIntField(term42230, term42230.getClass(), "reincarnationNum", 0);
        setField(term42230, term42230.getClass(), "exp", null);
        setLongField(term42230, term42230.getClass(), "point", 0L);
        setLongField(term42230, term42230.getClass(), "totalPoint", 0L);
        setIntField(term42230, term42230.getClass(), "playCount", 0);
        setIntField(term42230, term42230.getClass(), "multiPlayCount", 0);
        setIntField(term42230, term42230.getClass(), "multiWinCount", 0);
        setIntField(term42230, term42230.getClass(), "requestResCount", 0);
        setIntField(term42230, term42230.getClass(), "acceptResCount", 0);
        setIntField(term42230, term42230.getClass(), "successResCount", 0);
        setIntField(term42230, term42230.getClass(), "playerRating", 0);
        setIntField(term42230, term42230.getClass(), "highestRating", 0);
        setIntField(term42230, term42230.getClass(), "nameplateId", 0);
        setIntField(term42230, term42230.getClass(), "frameId", 0);
        setIntField(term42230, term42230.getClass(), "characterId", 0);
        setIntField(term42230, term42230.getClass(), "trophyId", 0);
        setIntField(term42230, term42230.getClass(), "playedTutorialBit", 0);
        setIntField(term42230, term42230.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42230, term42230.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42230, term42230.getClass(), "totalRepertoireCount", 0);
        setIntField(term42230, term42230.getClass(), "totalMapNum", 0);
        setLongField(term42230, term42230.getClass(), "totalHiScore", 0L);
        setLongField(term42230, term42230.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42230, term42230.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42230, term42230.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42230, term42230.getClass(), "totalMasterHighScore", 0L);
        setField(term42230, term42230.getClass(), "eventWatchedDate", null);
        setIntField(term42230, term42230.getClass(), "friendCount", 0);
        setBooleanField(term42230, term42230.getClass(), "isMaimai", false);
        setField(term42230, term42230.getClass(), "firstGameId", null);
        setField(term42230, term42230.getClass(), "firstRomVersion", null);
        setField(term42230, term42230.getClass(), "firstDataVersion", null);
        setField(term42230, term42230.getClass(), "firstPlayDate", null);
        setField(term42230, term42230.getClass(), "lastGameId", null);
        setField(term42230, term42230.getClass(), "lastRomVersion", null);
        setField(term42230, term42230.getClass(), "lastDataVersion", null);
        setField(term42230, term42230.getClass(), "lastPlayDate", null);
        setIntField(term42230, term42230.getClass(), "lastPlaceId", 0);
        setField(term42230, term42230.getClass(), "lastPlaceName", null);
        setField(term42230, term42230.getClass(), "lastRegionId", null);
        setField(term42230, term42230.getClass(), "lastRegionName", null);
        setField(term42230, term42230.getClass(), "lastAllNetId", null);
        setField(term42230, term42230.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessResCount", argTypes, term42230, args);
    }

};


