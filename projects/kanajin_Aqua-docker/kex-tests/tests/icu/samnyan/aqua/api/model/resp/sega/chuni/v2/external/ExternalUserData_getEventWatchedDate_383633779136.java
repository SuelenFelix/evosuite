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

public class ExternalUserData_getEventWatchedDate_383633779136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42757;

    public ExternalUserData_getEventWatchedDate_383633779136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42757 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term42757, term42757.getClass(), "accessCode", null);
        setField(term42757, term42757.getClass(), "userName", null);
        setField(term42757, term42757.getClass(), "lastLoginDate", null);
        setBooleanField(term42757, term42757.getClass(), "isWebJoin", false);
        setField(term42757, term42757.getClass(), "webLimitDate", null);
        setIntField(term42757, term42757.getClass(), "level", 0);
        setIntField(term42757, term42757.getClass(), "reincarnationNum", 0);
        setField(term42757, term42757.getClass(), "exp", null);
        setLongField(term42757, term42757.getClass(), "point", 0L);
        setLongField(term42757, term42757.getClass(), "totalPoint", 0L);
        setIntField(term42757, term42757.getClass(), "playCount", 0);
        setIntField(term42757, term42757.getClass(), "multiPlayCount", 0);
        setIntField(term42757, term42757.getClass(), "multiWinCount", 0);
        setIntField(term42757, term42757.getClass(), "requestResCount", 0);
        setIntField(term42757, term42757.getClass(), "acceptResCount", 0);
        setIntField(term42757, term42757.getClass(), "successResCount", 0);
        setIntField(term42757, term42757.getClass(), "playerRating", 0);
        setIntField(term42757, term42757.getClass(), "highestRating", 0);
        setIntField(term42757, term42757.getClass(), "nameplateId", 0);
        setIntField(term42757, term42757.getClass(), "frameId", 0);
        setIntField(term42757, term42757.getClass(), "characterId", 0);
        setIntField(term42757, term42757.getClass(), "trophyId", 0);
        setIntField(term42757, term42757.getClass(), "playedTutorialBit", 0);
        setIntField(term42757, term42757.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42757, term42757.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42757, term42757.getClass(), "totalRepertoireCount", 0);
        setIntField(term42757, term42757.getClass(), "totalMapNum", 0);
        setLongField(term42757, term42757.getClass(), "totalHiScore", 0L);
        setLongField(term42757, term42757.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42757, term42757.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42757, term42757.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42757, term42757.getClass(), "totalMasterHighScore", 0L);
        setField(term42757, term42757.getClass(), "eventWatchedDate", null);
        setIntField(term42757, term42757.getClass(), "friendCount", 0);
        setBooleanField(term42757, term42757.getClass(), "isMaimai", false);
        setField(term42757, term42757.getClass(), "firstGameId", null);
        setField(term42757, term42757.getClass(), "firstRomVersion", null);
        setField(term42757, term42757.getClass(), "firstDataVersion", null);
        setField(term42757, term42757.getClass(), "firstPlayDate", null);
        setField(term42757, term42757.getClass(), "lastGameId", null);
        setField(term42757, term42757.getClass(), "lastRomVersion", null);
        setField(term42757, term42757.getClass(), "lastDataVersion", null);
        setField(term42757, term42757.getClass(), "lastPlayDate", null);
        setIntField(term42757, term42757.getClass(), "lastPlaceId", 0);
        setField(term42757, term42757.getClass(), "lastPlaceName", null);
        setField(term42757, term42757.getClass(), "lastRegionId", null);
        setField(term42757, term42757.getClass(), "lastRegionName", null);
        setField(term42757, term42757.getClass(), "lastAllNetId", null);
        setField(term42757, term42757.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term42757, args);
    }

};


