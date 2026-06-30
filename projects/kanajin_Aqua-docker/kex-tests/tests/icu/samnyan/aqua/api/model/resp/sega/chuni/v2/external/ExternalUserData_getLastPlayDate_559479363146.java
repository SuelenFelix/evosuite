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

public class ExternalUserData_getLastPlayDate_559479363146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43067;

    public ExternalUserData_getLastPlayDate_559479363146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43067 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43067, term43067.getClass(), "accessCode", null);
        setField(term43067, term43067.getClass(), "userName", null);
        setField(term43067, term43067.getClass(), "lastLoginDate", null);
        setBooleanField(term43067, term43067.getClass(), "isWebJoin", false);
        setField(term43067, term43067.getClass(), "webLimitDate", null);
        setIntField(term43067, term43067.getClass(), "level", 0);
        setIntField(term43067, term43067.getClass(), "reincarnationNum", 0);
        setField(term43067, term43067.getClass(), "exp", null);
        setLongField(term43067, term43067.getClass(), "point", 0L);
        setLongField(term43067, term43067.getClass(), "totalPoint", 0L);
        setIntField(term43067, term43067.getClass(), "playCount", 0);
        setIntField(term43067, term43067.getClass(), "multiPlayCount", 0);
        setIntField(term43067, term43067.getClass(), "multiWinCount", 0);
        setIntField(term43067, term43067.getClass(), "requestResCount", 0);
        setIntField(term43067, term43067.getClass(), "acceptResCount", 0);
        setIntField(term43067, term43067.getClass(), "successResCount", 0);
        setIntField(term43067, term43067.getClass(), "playerRating", 0);
        setIntField(term43067, term43067.getClass(), "highestRating", 0);
        setIntField(term43067, term43067.getClass(), "nameplateId", 0);
        setIntField(term43067, term43067.getClass(), "frameId", 0);
        setIntField(term43067, term43067.getClass(), "characterId", 0);
        setIntField(term43067, term43067.getClass(), "trophyId", 0);
        setIntField(term43067, term43067.getClass(), "playedTutorialBit", 0);
        setIntField(term43067, term43067.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43067, term43067.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43067, term43067.getClass(), "totalRepertoireCount", 0);
        setIntField(term43067, term43067.getClass(), "totalMapNum", 0);
        setLongField(term43067, term43067.getClass(), "totalHiScore", 0L);
        setLongField(term43067, term43067.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43067, term43067.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43067, term43067.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43067, term43067.getClass(), "totalMasterHighScore", 0L);
        setField(term43067, term43067.getClass(), "eventWatchedDate", null);
        setIntField(term43067, term43067.getClass(), "friendCount", 0);
        setBooleanField(term43067, term43067.getClass(), "isMaimai", false);
        setField(term43067, term43067.getClass(), "firstGameId", null);
        setField(term43067, term43067.getClass(), "firstRomVersion", null);
        setField(term43067, term43067.getClass(), "firstDataVersion", null);
        setField(term43067, term43067.getClass(), "firstPlayDate", null);
        setField(term43067, term43067.getClass(), "lastGameId", null);
        setField(term43067, term43067.getClass(), "lastRomVersion", null);
        setField(term43067, term43067.getClass(), "lastDataVersion", null);
        setField(term43067, term43067.getClass(), "lastPlayDate", null);
        setIntField(term43067, term43067.getClass(), "lastPlaceId", 0);
        setField(term43067, term43067.getClass(), "lastPlaceName", null);
        setField(term43067, term43067.getClass(), "lastRegionId", null);
        setField(term43067, term43067.getClass(), "lastRegionName", null);
        setField(term43067, term43067.getClass(), "lastAllNetId", null);
        setField(term43067, term43067.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term43067, args);
    }

};


