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

public class ExternalUserData_getLastDataVersion_159570453145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43036;

    public ExternalUserData_getLastDataVersion_159570453145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43036 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43036, term43036.getClass(), "accessCode", null);
        setField(term43036, term43036.getClass(), "userName", null);
        setField(term43036, term43036.getClass(), "lastLoginDate", null);
        setBooleanField(term43036, term43036.getClass(), "isWebJoin", false);
        setField(term43036, term43036.getClass(), "webLimitDate", null);
        setIntField(term43036, term43036.getClass(), "level", 0);
        setIntField(term43036, term43036.getClass(), "reincarnationNum", 0);
        setField(term43036, term43036.getClass(), "exp", null);
        setLongField(term43036, term43036.getClass(), "point", 0L);
        setLongField(term43036, term43036.getClass(), "totalPoint", 0L);
        setIntField(term43036, term43036.getClass(), "playCount", 0);
        setIntField(term43036, term43036.getClass(), "multiPlayCount", 0);
        setIntField(term43036, term43036.getClass(), "multiWinCount", 0);
        setIntField(term43036, term43036.getClass(), "requestResCount", 0);
        setIntField(term43036, term43036.getClass(), "acceptResCount", 0);
        setIntField(term43036, term43036.getClass(), "successResCount", 0);
        setIntField(term43036, term43036.getClass(), "playerRating", 0);
        setIntField(term43036, term43036.getClass(), "highestRating", 0);
        setIntField(term43036, term43036.getClass(), "nameplateId", 0);
        setIntField(term43036, term43036.getClass(), "frameId", 0);
        setIntField(term43036, term43036.getClass(), "characterId", 0);
        setIntField(term43036, term43036.getClass(), "trophyId", 0);
        setIntField(term43036, term43036.getClass(), "playedTutorialBit", 0);
        setIntField(term43036, term43036.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43036, term43036.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43036, term43036.getClass(), "totalRepertoireCount", 0);
        setIntField(term43036, term43036.getClass(), "totalMapNum", 0);
        setLongField(term43036, term43036.getClass(), "totalHiScore", 0L);
        setLongField(term43036, term43036.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43036, term43036.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43036, term43036.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43036, term43036.getClass(), "totalMasterHighScore", 0L);
        setField(term43036, term43036.getClass(), "eventWatchedDate", null);
        setIntField(term43036, term43036.getClass(), "friendCount", 0);
        setBooleanField(term43036, term43036.getClass(), "isMaimai", false);
        setField(term43036, term43036.getClass(), "firstGameId", null);
        setField(term43036, term43036.getClass(), "firstRomVersion", null);
        setField(term43036, term43036.getClass(), "firstDataVersion", null);
        setField(term43036, term43036.getClass(), "firstPlayDate", null);
        setField(term43036, term43036.getClass(), "lastGameId", null);
        setField(term43036, term43036.getClass(), "lastRomVersion", null);
        setField(term43036, term43036.getClass(), "lastDataVersion", null);
        setField(term43036, term43036.getClass(), "lastPlayDate", null);
        setIntField(term43036, term43036.getClass(), "lastPlaceId", 0);
        setField(term43036, term43036.getClass(), "lastPlaceName", null);
        setField(term43036, term43036.getClass(), "lastRegionId", null);
        setField(term43036, term43036.getClass(), "lastRegionName", null);
        setField(term43036, term43036.getClass(), "lastAllNetId", null);
        setField(term43036, term43036.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term43036, args);
    }

};


