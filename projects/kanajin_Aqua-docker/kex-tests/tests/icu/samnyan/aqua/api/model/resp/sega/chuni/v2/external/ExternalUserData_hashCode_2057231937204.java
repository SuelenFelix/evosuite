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

public class ExternalUserData_hashCode_2057231937204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44925;

    public ExternalUserData_hashCode_2057231937204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44925 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44925, term44925.getClass(), "accessCode", null);
        setField(term44925, term44925.getClass(), "userName", null);
        setField(term44925, term44925.getClass(), "lastLoginDate", null);
        setBooleanField(term44925, term44925.getClass(), "isWebJoin", false);
        setField(term44925, term44925.getClass(), "webLimitDate", null);
        setIntField(term44925, term44925.getClass(), "level", 0);
        setIntField(term44925, term44925.getClass(), "reincarnationNum", 0);
        setField(term44925, term44925.getClass(), "exp", null);
        setLongField(term44925, term44925.getClass(), "point", 0L);
        setLongField(term44925, term44925.getClass(), "totalPoint", 0L);
        setIntField(term44925, term44925.getClass(), "playCount", 0);
        setIntField(term44925, term44925.getClass(), "multiPlayCount", 0);
        setIntField(term44925, term44925.getClass(), "multiWinCount", 0);
        setIntField(term44925, term44925.getClass(), "requestResCount", 0);
        setIntField(term44925, term44925.getClass(), "acceptResCount", 0);
        setIntField(term44925, term44925.getClass(), "successResCount", 0);
        setIntField(term44925, term44925.getClass(), "playerRating", 0);
        setIntField(term44925, term44925.getClass(), "highestRating", 0);
        setIntField(term44925, term44925.getClass(), "nameplateId", 0);
        setIntField(term44925, term44925.getClass(), "frameId", 0);
        setIntField(term44925, term44925.getClass(), "characterId", 0);
        setIntField(term44925, term44925.getClass(), "trophyId", 0);
        setIntField(term44925, term44925.getClass(), "playedTutorialBit", 0);
        setIntField(term44925, term44925.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44925, term44925.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44925, term44925.getClass(), "totalRepertoireCount", 0);
        setIntField(term44925, term44925.getClass(), "totalMapNum", 0);
        setLongField(term44925, term44925.getClass(), "totalHiScore", 0L);
        setLongField(term44925, term44925.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44925, term44925.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44925, term44925.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44925, term44925.getClass(), "totalMasterHighScore", 0L);
        setField(term44925, term44925.getClass(), "eventWatchedDate", null);
        setIntField(term44925, term44925.getClass(), "friendCount", 0);
        setBooleanField(term44925, term44925.getClass(), "isMaimai", false);
        setField(term44925, term44925.getClass(), "firstGameId", null);
        setField(term44925, term44925.getClass(), "firstRomVersion", null);
        setField(term44925, term44925.getClass(), "firstDataVersion", null);
        setField(term44925, term44925.getClass(), "firstPlayDate", null);
        setField(term44925, term44925.getClass(), "lastGameId", null);
        setField(term44925, term44925.getClass(), "lastRomVersion", null);
        setField(term44925, term44925.getClass(), "lastDataVersion", null);
        setField(term44925, term44925.getClass(), "lastPlayDate", null);
        setIntField(term44925, term44925.getClass(), "lastPlaceId", 0);
        setField(term44925, term44925.getClass(), "lastPlaceName", null);
        setField(term44925, term44925.getClass(), "lastRegionId", null);
        setField(term44925, term44925.getClass(), "lastRegionName", null);
        setField(term44925, term44925.getClass(), "lastAllNetId", null);
        setField(term44925, term44925.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term44925, args);
    }

};


