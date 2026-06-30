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

public class ExternalUserData_getLastClientId_1225938140152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43253;

    public ExternalUserData_getLastClientId_1225938140152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43253 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43253, term43253.getClass(), "accessCode", null);
        setField(term43253, term43253.getClass(), "userName", null);
        setField(term43253, term43253.getClass(), "lastLoginDate", null);
        setBooleanField(term43253, term43253.getClass(), "isWebJoin", false);
        setField(term43253, term43253.getClass(), "webLimitDate", null);
        setIntField(term43253, term43253.getClass(), "level", 0);
        setIntField(term43253, term43253.getClass(), "reincarnationNum", 0);
        setField(term43253, term43253.getClass(), "exp", null);
        setLongField(term43253, term43253.getClass(), "point", 0L);
        setLongField(term43253, term43253.getClass(), "totalPoint", 0L);
        setIntField(term43253, term43253.getClass(), "playCount", 0);
        setIntField(term43253, term43253.getClass(), "multiPlayCount", 0);
        setIntField(term43253, term43253.getClass(), "multiWinCount", 0);
        setIntField(term43253, term43253.getClass(), "requestResCount", 0);
        setIntField(term43253, term43253.getClass(), "acceptResCount", 0);
        setIntField(term43253, term43253.getClass(), "successResCount", 0);
        setIntField(term43253, term43253.getClass(), "playerRating", 0);
        setIntField(term43253, term43253.getClass(), "highestRating", 0);
        setIntField(term43253, term43253.getClass(), "nameplateId", 0);
        setIntField(term43253, term43253.getClass(), "frameId", 0);
        setIntField(term43253, term43253.getClass(), "characterId", 0);
        setIntField(term43253, term43253.getClass(), "trophyId", 0);
        setIntField(term43253, term43253.getClass(), "playedTutorialBit", 0);
        setIntField(term43253, term43253.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43253, term43253.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43253, term43253.getClass(), "totalRepertoireCount", 0);
        setIntField(term43253, term43253.getClass(), "totalMapNum", 0);
        setLongField(term43253, term43253.getClass(), "totalHiScore", 0L);
        setLongField(term43253, term43253.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43253, term43253.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43253, term43253.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43253, term43253.getClass(), "totalMasterHighScore", 0L);
        setField(term43253, term43253.getClass(), "eventWatchedDate", null);
        setIntField(term43253, term43253.getClass(), "friendCount", 0);
        setBooleanField(term43253, term43253.getClass(), "isMaimai", false);
        setField(term43253, term43253.getClass(), "firstGameId", null);
        setField(term43253, term43253.getClass(), "firstRomVersion", null);
        setField(term43253, term43253.getClass(), "firstDataVersion", null);
        setField(term43253, term43253.getClass(), "firstPlayDate", null);
        setField(term43253, term43253.getClass(), "lastGameId", null);
        setField(term43253, term43253.getClass(), "lastRomVersion", null);
        setField(term43253, term43253.getClass(), "lastDataVersion", null);
        setField(term43253, term43253.getClass(), "lastPlayDate", null);
        setIntField(term43253, term43253.getClass(), "lastPlaceId", 0);
        setField(term43253, term43253.getClass(), "lastPlaceName", null);
        setField(term43253, term43253.getClass(), "lastRegionId", null);
        setField(term43253, term43253.getClass(), "lastRegionName", null);
        setField(term43253, term43253.getClass(), "lastAllNetId", null);
        setField(term43253, term43253.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term43253, args);
    }

};


