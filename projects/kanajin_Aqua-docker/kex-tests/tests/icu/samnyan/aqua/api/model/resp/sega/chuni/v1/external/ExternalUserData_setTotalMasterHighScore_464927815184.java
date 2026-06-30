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
import java.lang.Long;

public class ExternalUserData_setTotalMasterHighScore_464927815184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44297;
     Object term44328;

    public ExternalUserData_setTotalMasterHighScore_464927815184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44297 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44297, term44297.getClass(), "accessCode", null);
        setField(term44297, term44297.getClass(), "userName", null);
        setField(term44297, term44297.getClass(), "lastLoginDate", null);
        setBooleanField(term44297, term44297.getClass(), "isWebJoin", false);
        setField(term44297, term44297.getClass(), "webLimitDate", null);
        setIntField(term44297, term44297.getClass(), "level", 0);
        setIntField(term44297, term44297.getClass(), "reincarnationNum", 0);
        setField(term44297, term44297.getClass(), "exp", null);
        setLongField(term44297, term44297.getClass(), "point", 0L);
        setLongField(term44297, term44297.getClass(), "totalPoint", 0L);
        setIntField(term44297, term44297.getClass(), "playCount", 0);
        setIntField(term44297, term44297.getClass(), "multiPlayCount", 0);
        setIntField(term44297, term44297.getClass(), "multiWinCount", 0);
        setIntField(term44297, term44297.getClass(), "requestResCount", 0);
        setIntField(term44297, term44297.getClass(), "acceptResCount", 0);
        setIntField(term44297, term44297.getClass(), "successResCount", 0);
        setIntField(term44297, term44297.getClass(), "playerRating", 0);
        setIntField(term44297, term44297.getClass(), "highestRating", 0);
        setIntField(term44297, term44297.getClass(), "nameplateId", 0);
        setIntField(term44297, term44297.getClass(), "frameId", 0);
        setIntField(term44297, term44297.getClass(), "characterId", 0);
        setIntField(term44297, term44297.getClass(), "trophyId", 0);
        setIntField(term44297, term44297.getClass(), "playedTutorialBit", 0);
        setIntField(term44297, term44297.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44297, term44297.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44297, term44297.getClass(), "totalRepertoireCount", 0);
        setIntField(term44297, term44297.getClass(), "totalMapNum", 0);
        setLongField(term44297, term44297.getClass(), "totalHiScore", 0L);
        setLongField(term44297, term44297.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44297, term44297.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44297, term44297.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44297, term44297.getClass(), "totalMasterHighScore", 0L);
        setField(term44297, term44297.getClass(), "eventWatchedDate", null);
        setIntField(term44297, term44297.getClass(), "friendCount", 0);
        setBooleanField(term44297, term44297.getClass(), "isMaimai", false);
        setField(term44297, term44297.getClass(), "firstGameId", null);
        setField(term44297, term44297.getClass(), "firstRomVersion", null);
        setField(term44297, term44297.getClass(), "firstDataVersion", null);
        setField(term44297, term44297.getClass(), "firstPlayDate", null);
        setField(term44297, term44297.getClass(), "lastGameId", null);
        setField(term44297, term44297.getClass(), "lastRomVersion", null);
        setField(term44297, term44297.getClass(), "lastDataVersion", null);
        setField(term44297, term44297.getClass(), "lastPlayDate", null);
        setIntField(term44297, term44297.getClass(), "lastPlaceId", 0);
        setField(term44297, term44297.getClass(), "lastPlaceName", null);
        setField(term44297, term44297.getClass(), "lastRegionId", null);
        setField(term44297, term44297.getClass(), "lastRegionName", null);
        setField(term44297, term44297.getClass(), "lastAllNetId", null);
        setField(term44297, term44297.getClass(), "lastClientId", null);
        term44328 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term44328;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term44297, args);
    }

};


