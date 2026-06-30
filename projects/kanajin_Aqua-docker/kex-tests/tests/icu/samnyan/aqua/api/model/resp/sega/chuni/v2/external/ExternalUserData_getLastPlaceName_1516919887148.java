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

public class ExternalUserData_getLastPlaceName_1516919887148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43129;

    public ExternalUserData_getLastPlaceName_1516919887148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43129 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43129, term43129.getClass(), "accessCode", null);
        setField(term43129, term43129.getClass(), "userName", null);
        setField(term43129, term43129.getClass(), "lastLoginDate", null);
        setBooleanField(term43129, term43129.getClass(), "isWebJoin", false);
        setField(term43129, term43129.getClass(), "webLimitDate", null);
        setIntField(term43129, term43129.getClass(), "level", 0);
        setIntField(term43129, term43129.getClass(), "reincarnationNum", 0);
        setField(term43129, term43129.getClass(), "exp", null);
        setLongField(term43129, term43129.getClass(), "point", 0L);
        setLongField(term43129, term43129.getClass(), "totalPoint", 0L);
        setIntField(term43129, term43129.getClass(), "playCount", 0);
        setIntField(term43129, term43129.getClass(), "multiPlayCount", 0);
        setIntField(term43129, term43129.getClass(), "multiWinCount", 0);
        setIntField(term43129, term43129.getClass(), "requestResCount", 0);
        setIntField(term43129, term43129.getClass(), "acceptResCount", 0);
        setIntField(term43129, term43129.getClass(), "successResCount", 0);
        setIntField(term43129, term43129.getClass(), "playerRating", 0);
        setIntField(term43129, term43129.getClass(), "highestRating", 0);
        setIntField(term43129, term43129.getClass(), "nameplateId", 0);
        setIntField(term43129, term43129.getClass(), "frameId", 0);
        setIntField(term43129, term43129.getClass(), "characterId", 0);
        setIntField(term43129, term43129.getClass(), "trophyId", 0);
        setIntField(term43129, term43129.getClass(), "playedTutorialBit", 0);
        setIntField(term43129, term43129.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43129, term43129.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43129, term43129.getClass(), "totalRepertoireCount", 0);
        setIntField(term43129, term43129.getClass(), "totalMapNum", 0);
        setLongField(term43129, term43129.getClass(), "totalHiScore", 0L);
        setLongField(term43129, term43129.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43129, term43129.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43129, term43129.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43129, term43129.getClass(), "totalMasterHighScore", 0L);
        setField(term43129, term43129.getClass(), "eventWatchedDate", null);
        setIntField(term43129, term43129.getClass(), "friendCount", 0);
        setBooleanField(term43129, term43129.getClass(), "isMaimai", false);
        setField(term43129, term43129.getClass(), "firstGameId", null);
        setField(term43129, term43129.getClass(), "firstRomVersion", null);
        setField(term43129, term43129.getClass(), "firstDataVersion", null);
        setField(term43129, term43129.getClass(), "firstPlayDate", null);
        setField(term43129, term43129.getClass(), "lastGameId", null);
        setField(term43129, term43129.getClass(), "lastRomVersion", null);
        setField(term43129, term43129.getClass(), "lastDataVersion", null);
        setField(term43129, term43129.getClass(), "lastPlayDate", null);
        setIntField(term43129, term43129.getClass(), "lastPlaceId", 0);
        setField(term43129, term43129.getClass(), "lastPlaceName", null);
        setField(term43129, term43129.getClass(), "lastRegionId", null);
        setField(term43129, term43129.getClass(), "lastRegionName", null);
        setField(term43129, term43129.getClass(), "lastAllNetId", null);
        setField(term43129, term43129.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term43129, args);
    }

};


