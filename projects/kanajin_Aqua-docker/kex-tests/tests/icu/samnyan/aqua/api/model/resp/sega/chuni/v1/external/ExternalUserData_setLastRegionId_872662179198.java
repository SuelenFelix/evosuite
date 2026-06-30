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

public class ExternalUserData_setLastRegionId_872662179198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44739;

    public ExternalUserData_setLastRegionId_872662179198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44739 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44739, term44739.getClass(), "accessCode", null);
        setField(term44739, term44739.getClass(), "userName", null);
        setField(term44739, term44739.getClass(), "lastLoginDate", null);
        setBooleanField(term44739, term44739.getClass(), "isWebJoin", false);
        setField(term44739, term44739.getClass(), "webLimitDate", null);
        setIntField(term44739, term44739.getClass(), "level", 0);
        setIntField(term44739, term44739.getClass(), "reincarnationNum", 0);
        setField(term44739, term44739.getClass(), "exp", null);
        setLongField(term44739, term44739.getClass(), "point", 0L);
        setLongField(term44739, term44739.getClass(), "totalPoint", 0L);
        setIntField(term44739, term44739.getClass(), "playCount", 0);
        setIntField(term44739, term44739.getClass(), "multiPlayCount", 0);
        setIntField(term44739, term44739.getClass(), "multiWinCount", 0);
        setIntField(term44739, term44739.getClass(), "requestResCount", 0);
        setIntField(term44739, term44739.getClass(), "acceptResCount", 0);
        setIntField(term44739, term44739.getClass(), "successResCount", 0);
        setIntField(term44739, term44739.getClass(), "playerRating", 0);
        setIntField(term44739, term44739.getClass(), "highestRating", 0);
        setIntField(term44739, term44739.getClass(), "nameplateId", 0);
        setIntField(term44739, term44739.getClass(), "frameId", 0);
        setIntField(term44739, term44739.getClass(), "characterId", 0);
        setIntField(term44739, term44739.getClass(), "trophyId", 0);
        setIntField(term44739, term44739.getClass(), "playedTutorialBit", 0);
        setIntField(term44739, term44739.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44739, term44739.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44739, term44739.getClass(), "totalRepertoireCount", 0);
        setIntField(term44739, term44739.getClass(), "totalMapNum", 0);
        setLongField(term44739, term44739.getClass(), "totalHiScore", 0L);
        setLongField(term44739, term44739.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44739, term44739.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44739, term44739.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44739, term44739.getClass(), "totalMasterHighScore", 0L);
        setField(term44739, term44739.getClass(), "eventWatchedDate", null);
        setIntField(term44739, term44739.getClass(), "friendCount", 0);
        setBooleanField(term44739, term44739.getClass(), "isMaimai", false);
        setField(term44739, term44739.getClass(), "firstGameId", null);
        setField(term44739, term44739.getClass(), "firstRomVersion", null);
        setField(term44739, term44739.getClass(), "firstDataVersion", null);
        setField(term44739, term44739.getClass(), "firstPlayDate", null);
        setField(term44739, term44739.getClass(), "lastGameId", null);
        setField(term44739, term44739.getClass(), "lastRomVersion", null);
        setField(term44739, term44739.getClass(), "lastDataVersion", null);
        setField(term44739, term44739.getClass(), "lastPlayDate", null);
        setIntField(term44739, term44739.getClass(), "lastPlaceId", 0);
        setField(term44739, term44739.getClass(), "lastPlaceName", null);
        setField(term44739, term44739.getClass(), "lastRegionId", null);
        setField(term44739, term44739.getClass(), "lastRegionName", null);
        setField(term44739, term44739.getClass(), "lastAllNetId", null);
        setField(term44739, term44739.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRegionId", argTypes, term44739, args);
    }

};


