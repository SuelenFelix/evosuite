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

public class ExternalUserData_getLastGameId_1656660861143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42974;

    public ExternalUserData_getLastGameId_1656660861143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42974 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term42974, term42974.getClass(), "accessCode", null);
        setField(term42974, term42974.getClass(), "userName", null);
        setField(term42974, term42974.getClass(), "lastLoginDate", null);
        setBooleanField(term42974, term42974.getClass(), "isWebJoin", false);
        setField(term42974, term42974.getClass(), "webLimitDate", null);
        setIntField(term42974, term42974.getClass(), "level", 0);
        setIntField(term42974, term42974.getClass(), "reincarnationNum", 0);
        setField(term42974, term42974.getClass(), "exp", null);
        setLongField(term42974, term42974.getClass(), "point", 0L);
        setLongField(term42974, term42974.getClass(), "totalPoint", 0L);
        setIntField(term42974, term42974.getClass(), "playCount", 0);
        setIntField(term42974, term42974.getClass(), "multiPlayCount", 0);
        setIntField(term42974, term42974.getClass(), "multiWinCount", 0);
        setIntField(term42974, term42974.getClass(), "requestResCount", 0);
        setIntField(term42974, term42974.getClass(), "acceptResCount", 0);
        setIntField(term42974, term42974.getClass(), "successResCount", 0);
        setIntField(term42974, term42974.getClass(), "playerRating", 0);
        setIntField(term42974, term42974.getClass(), "highestRating", 0);
        setIntField(term42974, term42974.getClass(), "nameplateId", 0);
        setIntField(term42974, term42974.getClass(), "frameId", 0);
        setIntField(term42974, term42974.getClass(), "characterId", 0);
        setIntField(term42974, term42974.getClass(), "trophyId", 0);
        setIntField(term42974, term42974.getClass(), "playedTutorialBit", 0);
        setIntField(term42974, term42974.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42974, term42974.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42974, term42974.getClass(), "totalRepertoireCount", 0);
        setIntField(term42974, term42974.getClass(), "totalMapNum", 0);
        setLongField(term42974, term42974.getClass(), "totalHiScore", 0L);
        setLongField(term42974, term42974.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42974, term42974.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42974, term42974.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42974, term42974.getClass(), "totalMasterHighScore", 0L);
        setField(term42974, term42974.getClass(), "eventWatchedDate", null);
        setIntField(term42974, term42974.getClass(), "friendCount", 0);
        setBooleanField(term42974, term42974.getClass(), "isMaimai", false);
        setField(term42974, term42974.getClass(), "firstGameId", null);
        setField(term42974, term42974.getClass(), "firstRomVersion", null);
        setField(term42974, term42974.getClass(), "firstDataVersion", null);
        setField(term42974, term42974.getClass(), "firstPlayDate", null);
        setField(term42974, term42974.getClass(), "lastGameId", null);
        setField(term42974, term42974.getClass(), "lastRomVersion", null);
        setField(term42974, term42974.getClass(), "lastDataVersion", null);
        setField(term42974, term42974.getClass(), "lastPlayDate", null);
        setIntField(term42974, term42974.getClass(), "lastPlaceId", 0);
        setField(term42974, term42974.getClass(), "lastPlaceName", null);
        setField(term42974, term42974.getClass(), "lastRegionId", null);
        setField(term42974, term42974.getClass(), "lastRegionName", null);
        setField(term42974, term42974.getClass(), "lastAllNetId", null);
        setField(term42974, term42974.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term42974, args);
    }

};


