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

public class ExternalUserData_getLastRegionName_315378933150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43191;

    public ExternalUserData_getLastRegionName_315378933150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43191 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43191, term43191.getClass(), "accessCode", null);
        setField(term43191, term43191.getClass(), "userName", null);
        setField(term43191, term43191.getClass(), "lastLoginDate", null);
        setBooleanField(term43191, term43191.getClass(), "isWebJoin", false);
        setField(term43191, term43191.getClass(), "webLimitDate", null);
        setIntField(term43191, term43191.getClass(), "level", 0);
        setIntField(term43191, term43191.getClass(), "reincarnationNum", 0);
        setField(term43191, term43191.getClass(), "exp", null);
        setLongField(term43191, term43191.getClass(), "point", 0L);
        setLongField(term43191, term43191.getClass(), "totalPoint", 0L);
        setIntField(term43191, term43191.getClass(), "playCount", 0);
        setIntField(term43191, term43191.getClass(), "multiPlayCount", 0);
        setIntField(term43191, term43191.getClass(), "multiWinCount", 0);
        setIntField(term43191, term43191.getClass(), "requestResCount", 0);
        setIntField(term43191, term43191.getClass(), "acceptResCount", 0);
        setIntField(term43191, term43191.getClass(), "successResCount", 0);
        setIntField(term43191, term43191.getClass(), "playerRating", 0);
        setIntField(term43191, term43191.getClass(), "highestRating", 0);
        setIntField(term43191, term43191.getClass(), "nameplateId", 0);
        setIntField(term43191, term43191.getClass(), "frameId", 0);
        setIntField(term43191, term43191.getClass(), "characterId", 0);
        setIntField(term43191, term43191.getClass(), "trophyId", 0);
        setIntField(term43191, term43191.getClass(), "playedTutorialBit", 0);
        setIntField(term43191, term43191.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43191, term43191.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43191, term43191.getClass(), "totalRepertoireCount", 0);
        setIntField(term43191, term43191.getClass(), "totalMapNum", 0);
        setLongField(term43191, term43191.getClass(), "totalHiScore", 0L);
        setLongField(term43191, term43191.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43191, term43191.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43191, term43191.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43191, term43191.getClass(), "totalMasterHighScore", 0L);
        setField(term43191, term43191.getClass(), "eventWatchedDate", null);
        setIntField(term43191, term43191.getClass(), "friendCount", 0);
        setBooleanField(term43191, term43191.getClass(), "isMaimai", false);
        setField(term43191, term43191.getClass(), "firstGameId", null);
        setField(term43191, term43191.getClass(), "firstRomVersion", null);
        setField(term43191, term43191.getClass(), "firstDataVersion", null);
        setField(term43191, term43191.getClass(), "firstPlayDate", null);
        setField(term43191, term43191.getClass(), "lastGameId", null);
        setField(term43191, term43191.getClass(), "lastRomVersion", null);
        setField(term43191, term43191.getClass(), "lastDataVersion", null);
        setField(term43191, term43191.getClass(), "lastPlayDate", null);
        setIntField(term43191, term43191.getClass(), "lastPlaceId", 0);
        setField(term43191, term43191.getClass(), "lastPlaceName", null);
        setField(term43191, term43191.getClass(), "lastRegionId", null);
        setField(term43191, term43191.getClass(), "lastRegionName", null);
        setField(term43191, term43191.getClass(), "lastAllNetId", null);
        setField(term43191, term43191.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term43191, args);
    }

};


