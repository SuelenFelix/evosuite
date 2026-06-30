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

public class ExternalUserData_setFirstDataVersion_468763797190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44489;

    public ExternalUserData_setFirstDataVersion_468763797190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44489 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44489, term44489.getClass(), "accessCode", null);
        setField(term44489, term44489.getClass(), "userName", null);
        setField(term44489, term44489.getClass(), "lastLoginDate", null);
        setBooleanField(term44489, term44489.getClass(), "isWebJoin", false);
        setField(term44489, term44489.getClass(), "webLimitDate", null);
        setIntField(term44489, term44489.getClass(), "level", 0);
        setIntField(term44489, term44489.getClass(), "reincarnationNum", 0);
        setField(term44489, term44489.getClass(), "exp", null);
        setLongField(term44489, term44489.getClass(), "point", 0L);
        setLongField(term44489, term44489.getClass(), "totalPoint", 0L);
        setIntField(term44489, term44489.getClass(), "playCount", 0);
        setIntField(term44489, term44489.getClass(), "multiPlayCount", 0);
        setIntField(term44489, term44489.getClass(), "multiWinCount", 0);
        setIntField(term44489, term44489.getClass(), "requestResCount", 0);
        setIntField(term44489, term44489.getClass(), "acceptResCount", 0);
        setIntField(term44489, term44489.getClass(), "successResCount", 0);
        setIntField(term44489, term44489.getClass(), "playerRating", 0);
        setIntField(term44489, term44489.getClass(), "highestRating", 0);
        setIntField(term44489, term44489.getClass(), "nameplateId", 0);
        setIntField(term44489, term44489.getClass(), "frameId", 0);
        setIntField(term44489, term44489.getClass(), "characterId", 0);
        setIntField(term44489, term44489.getClass(), "trophyId", 0);
        setIntField(term44489, term44489.getClass(), "playedTutorialBit", 0);
        setIntField(term44489, term44489.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44489, term44489.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44489, term44489.getClass(), "totalRepertoireCount", 0);
        setIntField(term44489, term44489.getClass(), "totalMapNum", 0);
        setLongField(term44489, term44489.getClass(), "totalHiScore", 0L);
        setLongField(term44489, term44489.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44489, term44489.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44489, term44489.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44489, term44489.getClass(), "totalMasterHighScore", 0L);
        setField(term44489, term44489.getClass(), "eventWatchedDate", null);
        setIntField(term44489, term44489.getClass(), "friendCount", 0);
        setBooleanField(term44489, term44489.getClass(), "isMaimai", false);
        setField(term44489, term44489.getClass(), "firstGameId", null);
        setField(term44489, term44489.getClass(), "firstRomVersion", null);
        setField(term44489, term44489.getClass(), "firstDataVersion", null);
        setField(term44489, term44489.getClass(), "firstPlayDate", null);
        setField(term44489, term44489.getClass(), "lastGameId", null);
        setField(term44489, term44489.getClass(), "lastRomVersion", null);
        setField(term44489, term44489.getClass(), "lastDataVersion", null);
        setField(term44489, term44489.getClass(), "lastPlayDate", null);
        setIntField(term44489, term44489.getClass(), "lastPlaceId", 0);
        setField(term44489, term44489.getClass(), "lastPlaceName", null);
        setField(term44489, term44489.getClass(), "lastRegionId", null);
        setField(term44489, term44489.getClass(), "lastRegionName", null);
        setField(term44489, term44489.getClass(), "lastAllNetId", null);
        setField(term44489, term44489.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstDataVersion", argTypes, term44489, args);
    }

};


