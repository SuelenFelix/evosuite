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
import java.lang.Integer;

public class ExternalUserData_setLastPlaceId_912964060196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44675;
     Object term44706;

    public ExternalUserData_setLastPlaceId_912964060196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44675 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44675, term44675.getClass(), "accessCode", null);
        setField(term44675, term44675.getClass(), "userName", null);
        setField(term44675, term44675.getClass(), "lastLoginDate", null);
        setBooleanField(term44675, term44675.getClass(), "isWebJoin", false);
        setField(term44675, term44675.getClass(), "webLimitDate", null);
        setIntField(term44675, term44675.getClass(), "level", 0);
        setIntField(term44675, term44675.getClass(), "reincarnationNum", 0);
        setField(term44675, term44675.getClass(), "exp", null);
        setLongField(term44675, term44675.getClass(), "point", 0L);
        setLongField(term44675, term44675.getClass(), "totalPoint", 0L);
        setIntField(term44675, term44675.getClass(), "playCount", 0);
        setIntField(term44675, term44675.getClass(), "multiPlayCount", 0);
        setIntField(term44675, term44675.getClass(), "multiWinCount", 0);
        setIntField(term44675, term44675.getClass(), "requestResCount", 0);
        setIntField(term44675, term44675.getClass(), "acceptResCount", 0);
        setIntField(term44675, term44675.getClass(), "successResCount", 0);
        setIntField(term44675, term44675.getClass(), "playerRating", 0);
        setIntField(term44675, term44675.getClass(), "highestRating", 0);
        setIntField(term44675, term44675.getClass(), "nameplateId", 0);
        setIntField(term44675, term44675.getClass(), "frameId", 0);
        setIntField(term44675, term44675.getClass(), "characterId", 0);
        setIntField(term44675, term44675.getClass(), "trophyId", 0);
        setIntField(term44675, term44675.getClass(), "playedTutorialBit", 0);
        setIntField(term44675, term44675.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44675, term44675.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44675, term44675.getClass(), "totalRepertoireCount", 0);
        setIntField(term44675, term44675.getClass(), "totalMapNum", 0);
        setLongField(term44675, term44675.getClass(), "totalHiScore", 0L);
        setLongField(term44675, term44675.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44675, term44675.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44675, term44675.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44675, term44675.getClass(), "totalMasterHighScore", 0L);
        setField(term44675, term44675.getClass(), "eventWatchedDate", null);
        setIntField(term44675, term44675.getClass(), "friendCount", 0);
        setBooleanField(term44675, term44675.getClass(), "isMaimai", false);
        setField(term44675, term44675.getClass(), "firstGameId", null);
        setField(term44675, term44675.getClass(), "firstRomVersion", null);
        setField(term44675, term44675.getClass(), "firstDataVersion", null);
        setField(term44675, term44675.getClass(), "firstPlayDate", null);
        setField(term44675, term44675.getClass(), "lastGameId", null);
        setField(term44675, term44675.getClass(), "lastRomVersion", null);
        setField(term44675, term44675.getClass(), "lastDataVersion", null);
        setField(term44675, term44675.getClass(), "lastPlayDate", null);
        setIntField(term44675, term44675.getClass(), "lastPlaceId", 0);
        setField(term44675, term44675.getClass(), "lastPlaceName", null);
        setField(term44675, term44675.getClass(), "lastRegionId", null);
        setField(term44675, term44675.getClass(), "lastRegionName", null);
        setField(term44675, term44675.getClass(), "lastAllNetId", null);
        setField(term44675, term44675.getClass(), "lastClientId", null);
        term44706 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44706;
        callMethod(klass, "setLastPlaceId", argTypes, term44675, args);
    }

};


