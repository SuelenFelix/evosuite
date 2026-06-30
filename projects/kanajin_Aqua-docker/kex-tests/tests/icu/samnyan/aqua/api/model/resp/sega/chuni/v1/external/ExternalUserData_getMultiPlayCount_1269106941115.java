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

public class ExternalUserData_getMultiPlayCount_1269106941115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42106;

    public ExternalUserData_getMultiPlayCount_1269106941115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42106 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term42106, term42106.getClass(), "accessCode", null);
        setField(term42106, term42106.getClass(), "userName", null);
        setField(term42106, term42106.getClass(), "lastLoginDate", null);
        setBooleanField(term42106, term42106.getClass(), "isWebJoin", false);
        setField(term42106, term42106.getClass(), "webLimitDate", null);
        setIntField(term42106, term42106.getClass(), "level", 0);
        setIntField(term42106, term42106.getClass(), "reincarnationNum", 0);
        setField(term42106, term42106.getClass(), "exp", null);
        setLongField(term42106, term42106.getClass(), "point", 0L);
        setLongField(term42106, term42106.getClass(), "totalPoint", 0L);
        setIntField(term42106, term42106.getClass(), "playCount", 0);
        setIntField(term42106, term42106.getClass(), "multiPlayCount", 0);
        setIntField(term42106, term42106.getClass(), "multiWinCount", 0);
        setIntField(term42106, term42106.getClass(), "requestResCount", 0);
        setIntField(term42106, term42106.getClass(), "acceptResCount", 0);
        setIntField(term42106, term42106.getClass(), "successResCount", 0);
        setIntField(term42106, term42106.getClass(), "playerRating", 0);
        setIntField(term42106, term42106.getClass(), "highestRating", 0);
        setIntField(term42106, term42106.getClass(), "nameplateId", 0);
        setIntField(term42106, term42106.getClass(), "frameId", 0);
        setIntField(term42106, term42106.getClass(), "characterId", 0);
        setIntField(term42106, term42106.getClass(), "trophyId", 0);
        setIntField(term42106, term42106.getClass(), "playedTutorialBit", 0);
        setIntField(term42106, term42106.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42106, term42106.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42106, term42106.getClass(), "totalRepertoireCount", 0);
        setIntField(term42106, term42106.getClass(), "totalMapNum", 0);
        setLongField(term42106, term42106.getClass(), "totalHiScore", 0L);
        setLongField(term42106, term42106.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42106, term42106.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42106, term42106.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42106, term42106.getClass(), "totalMasterHighScore", 0L);
        setField(term42106, term42106.getClass(), "eventWatchedDate", null);
        setIntField(term42106, term42106.getClass(), "friendCount", 0);
        setBooleanField(term42106, term42106.getClass(), "isMaimai", false);
        setField(term42106, term42106.getClass(), "firstGameId", null);
        setField(term42106, term42106.getClass(), "firstRomVersion", null);
        setField(term42106, term42106.getClass(), "firstDataVersion", null);
        setField(term42106, term42106.getClass(), "firstPlayDate", null);
        setField(term42106, term42106.getClass(), "lastGameId", null);
        setField(term42106, term42106.getClass(), "lastRomVersion", null);
        setField(term42106, term42106.getClass(), "lastDataVersion", null);
        setField(term42106, term42106.getClass(), "lastPlayDate", null);
        setIntField(term42106, term42106.getClass(), "lastPlaceId", 0);
        setField(term42106, term42106.getClass(), "lastPlaceName", null);
        setField(term42106, term42106.getClass(), "lastRegionId", null);
        setField(term42106, term42106.getClass(), "lastRegionName", null);
        setField(term42106, term42106.getClass(), "lastAllNetId", null);
        setField(term42106, term42106.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMultiPlayCount", argTypes, term42106, args);
    }

};


