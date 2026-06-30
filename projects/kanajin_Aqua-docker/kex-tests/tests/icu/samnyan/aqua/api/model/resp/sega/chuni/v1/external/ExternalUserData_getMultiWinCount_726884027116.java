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

public class ExternalUserData_getMultiWinCount_726884027116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42137;

    public ExternalUserData_getMultiWinCount_726884027116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42137 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term42137, term42137.getClass(), "accessCode", null);
        setField(term42137, term42137.getClass(), "userName", null);
        setField(term42137, term42137.getClass(), "lastLoginDate", null);
        setBooleanField(term42137, term42137.getClass(), "isWebJoin", false);
        setField(term42137, term42137.getClass(), "webLimitDate", null);
        setIntField(term42137, term42137.getClass(), "level", 0);
        setIntField(term42137, term42137.getClass(), "reincarnationNum", 0);
        setField(term42137, term42137.getClass(), "exp", null);
        setLongField(term42137, term42137.getClass(), "point", 0L);
        setLongField(term42137, term42137.getClass(), "totalPoint", 0L);
        setIntField(term42137, term42137.getClass(), "playCount", 0);
        setIntField(term42137, term42137.getClass(), "multiPlayCount", 0);
        setIntField(term42137, term42137.getClass(), "multiWinCount", 0);
        setIntField(term42137, term42137.getClass(), "requestResCount", 0);
        setIntField(term42137, term42137.getClass(), "acceptResCount", 0);
        setIntField(term42137, term42137.getClass(), "successResCount", 0);
        setIntField(term42137, term42137.getClass(), "playerRating", 0);
        setIntField(term42137, term42137.getClass(), "highestRating", 0);
        setIntField(term42137, term42137.getClass(), "nameplateId", 0);
        setIntField(term42137, term42137.getClass(), "frameId", 0);
        setIntField(term42137, term42137.getClass(), "characterId", 0);
        setIntField(term42137, term42137.getClass(), "trophyId", 0);
        setIntField(term42137, term42137.getClass(), "playedTutorialBit", 0);
        setIntField(term42137, term42137.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42137, term42137.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42137, term42137.getClass(), "totalRepertoireCount", 0);
        setIntField(term42137, term42137.getClass(), "totalMapNum", 0);
        setLongField(term42137, term42137.getClass(), "totalHiScore", 0L);
        setLongField(term42137, term42137.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42137, term42137.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42137, term42137.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42137, term42137.getClass(), "totalMasterHighScore", 0L);
        setField(term42137, term42137.getClass(), "eventWatchedDate", null);
        setIntField(term42137, term42137.getClass(), "friendCount", 0);
        setBooleanField(term42137, term42137.getClass(), "isMaimai", false);
        setField(term42137, term42137.getClass(), "firstGameId", null);
        setField(term42137, term42137.getClass(), "firstRomVersion", null);
        setField(term42137, term42137.getClass(), "firstDataVersion", null);
        setField(term42137, term42137.getClass(), "firstPlayDate", null);
        setField(term42137, term42137.getClass(), "lastGameId", null);
        setField(term42137, term42137.getClass(), "lastRomVersion", null);
        setField(term42137, term42137.getClass(), "lastDataVersion", null);
        setField(term42137, term42137.getClass(), "lastPlayDate", null);
        setIntField(term42137, term42137.getClass(), "lastPlaceId", 0);
        setField(term42137, term42137.getClass(), "lastPlaceName", null);
        setField(term42137, term42137.getClass(), "lastRegionId", null);
        setField(term42137, term42137.getClass(), "lastRegionName", null);
        setField(term42137, term42137.getClass(), "lastAllNetId", null);
        setField(term42137, term42137.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMultiWinCount", argTypes, term42137, args);
    }

};


