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

public class ExternalUserData_getTotalMasterHighScore_381992059135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42726;

    public ExternalUserData_getTotalMasterHighScore_381992059135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42726 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term42726, term42726.getClass(), "accessCode", null);
        setField(term42726, term42726.getClass(), "userName", null);
        setField(term42726, term42726.getClass(), "lastLoginDate", null);
        setBooleanField(term42726, term42726.getClass(), "isWebJoin", false);
        setField(term42726, term42726.getClass(), "webLimitDate", null);
        setIntField(term42726, term42726.getClass(), "level", 0);
        setIntField(term42726, term42726.getClass(), "reincarnationNum", 0);
        setField(term42726, term42726.getClass(), "exp", null);
        setLongField(term42726, term42726.getClass(), "point", 0L);
        setLongField(term42726, term42726.getClass(), "totalPoint", 0L);
        setIntField(term42726, term42726.getClass(), "playCount", 0);
        setIntField(term42726, term42726.getClass(), "multiPlayCount", 0);
        setIntField(term42726, term42726.getClass(), "multiWinCount", 0);
        setIntField(term42726, term42726.getClass(), "requestResCount", 0);
        setIntField(term42726, term42726.getClass(), "acceptResCount", 0);
        setIntField(term42726, term42726.getClass(), "successResCount", 0);
        setIntField(term42726, term42726.getClass(), "playerRating", 0);
        setIntField(term42726, term42726.getClass(), "highestRating", 0);
        setIntField(term42726, term42726.getClass(), "nameplateId", 0);
        setIntField(term42726, term42726.getClass(), "frameId", 0);
        setIntField(term42726, term42726.getClass(), "characterId", 0);
        setIntField(term42726, term42726.getClass(), "trophyId", 0);
        setIntField(term42726, term42726.getClass(), "playedTutorialBit", 0);
        setIntField(term42726, term42726.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42726, term42726.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42726, term42726.getClass(), "totalRepertoireCount", 0);
        setIntField(term42726, term42726.getClass(), "totalMapNum", 0);
        setLongField(term42726, term42726.getClass(), "totalHiScore", 0L);
        setLongField(term42726, term42726.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42726, term42726.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42726, term42726.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42726, term42726.getClass(), "totalMasterHighScore", 0L);
        setField(term42726, term42726.getClass(), "eventWatchedDate", null);
        setIntField(term42726, term42726.getClass(), "friendCount", 0);
        setBooleanField(term42726, term42726.getClass(), "isMaimai", false);
        setField(term42726, term42726.getClass(), "firstGameId", null);
        setField(term42726, term42726.getClass(), "firstRomVersion", null);
        setField(term42726, term42726.getClass(), "firstDataVersion", null);
        setField(term42726, term42726.getClass(), "firstPlayDate", null);
        setField(term42726, term42726.getClass(), "lastGameId", null);
        setField(term42726, term42726.getClass(), "lastRomVersion", null);
        setField(term42726, term42726.getClass(), "lastDataVersion", null);
        setField(term42726, term42726.getClass(), "lastPlayDate", null);
        setIntField(term42726, term42726.getClass(), "lastPlaceId", 0);
        setField(term42726, term42726.getClass(), "lastPlaceName", null);
        setField(term42726, term42726.getClass(), "lastRegionId", null);
        setField(term42726, term42726.getClass(), "lastRegionName", null);
        setField(term42726, term42726.getClass(), "lastAllNetId", null);
        setField(term42726, term42726.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterHighScore", argTypes, term42726, args);
    }

};


