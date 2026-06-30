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

public class ExternalUserData_getReincarnationNum_868781469110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41951;

    public ExternalUserData_getReincarnationNum_868781469110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41951 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term41951, term41951.getClass(), "accessCode", null);
        setField(term41951, term41951.getClass(), "userName", null);
        setField(term41951, term41951.getClass(), "lastLoginDate", null);
        setBooleanField(term41951, term41951.getClass(), "isWebJoin", false);
        setField(term41951, term41951.getClass(), "webLimitDate", null);
        setIntField(term41951, term41951.getClass(), "level", 0);
        setIntField(term41951, term41951.getClass(), "reincarnationNum", 0);
        setField(term41951, term41951.getClass(), "exp", null);
        setLongField(term41951, term41951.getClass(), "point", 0L);
        setLongField(term41951, term41951.getClass(), "totalPoint", 0L);
        setIntField(term41951, term41951.getClass(), "playCount", 0);
        setIntField(term41951, term41951.getClass(), "multiPlayCount", 0);
        setIntField(term41951, term41951.getClass(), "multiWinCount", 0);
        setIntField(term41951, term41951.getClass(), "requestResCount", 0);
        setIntField(term41951, term41951.getClass(), "acceptResCount", 0);
        setIntField(term41951, term41951.getClass(), "successResCount", 0);
        setIntField(term41951, term41951.getClass(), "playerRating", 0);
        setIntField(term41951, term41951.getClass(), "highestRating", 0);
        setIntField(term41951, term41951.getClass(), "nameplateId", 0);
        setIntField(term41951, term41951.getClass(), "frameId", 0);
        setIntField(term41951, term41951.getClass(), "characterId", 0);
        setIntField(term41951, term41951.getClass(), "trophyId", 0);
        setIntField(term41951, term41951.getClass(), "playedTutorialBit", 0);
        setIntField(term41951, term41951.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term41951, term41951.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term41951, term41951.getClass(), "totalRepertoireCount", 0);
        setIntField(term41951, term41951.getClass(), "totalMapNum", 0);
        setLongField(term41951, term41951.getClass(), "totalHiScore", 0L);
        setLongField(term41951, term41951.getClass(), "totalBasicHighScore", 0L);
        setLongField(term41951, term41951.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term41951, term41951.getClass(), "totalExpertHighScore", 0L);
        setLongField(term41951, term41951.getClass(), "totalMasterHighScore", 0L);
        setField(term41951, term41951.getClass(), "eventWatchedDate", null);
        setIntField(term41951, term41951.getClass(), "friendCount", 0);
        setBooleanField(term41951, term41951.getClass(), "isMaimai", false);
        setField(term41951, term41951.getClass(), "firstGameId", null);
        setField(term41951, term41951.getClass(), "firstRomVersion", null);
        setField(term41951, term41951.getClass(), "firstDataVersion", null);
        setField(term41951, term41951.getClass(), "firstPlayDate", null);
        setField(term41951, term41951.getClass(), "lastGameId", null);
        setField(term41951, term41951.getClass(), "lastRomVersion", null);
        setField(term41951, term41951.getClass(), "lastDataVersion", null);
        setField(term41951, term41951.getClass(), "lastPlayDate", null);
        setIntField(term41951, term41951.getClass(), "lastPlaceId", 0);
        setField(term41951, term41951.getClass(), "lastPlaceName", null);
        setField(term41951, term41951.getClass(), "lastRegionId", null);
        setField(term41951, term41951.getClass(), "lastRegionName", null);
        setField(term41951, term41951.getClass(), "lastAllNetId", null);
        setField(term41951, term41951.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReincarnationNum", argTypes, term41951, args);
    }

};


