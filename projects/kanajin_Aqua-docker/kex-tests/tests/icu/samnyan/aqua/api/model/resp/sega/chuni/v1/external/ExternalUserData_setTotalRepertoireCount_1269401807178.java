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
import java.lang.Integer;

public class ExternalUserData_setTotalRepertoireCount_1269401807178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44099;
     Object term44130;

    public ExternalUserData_setTotalRepertoireCount_1269401807178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44099 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44099, term44099.getClass(), "accessCode", null);
        setField(term44099, term44099.getClass(), "userName", null);
        setField(term44099, term44099.getClass(), "lastLoginDate", null);
        setBooleanField(term44099, term44099.getClass(), "isWebJoin", false);
        setField(term44099, term44099.getClass(), "webLimitDate", null);
        setIntField(term44099, term44099.getClass(), "level", 0);
        setIntField(term44099, term44099.getClass(), "reincarnationNum", 0);
        setField(term44099, term44099.getClass(), "exp", null);
        setLongField(term44099, term44099.getClass(), "point", 0L);
        setLongField(term44099, term44099.getClass(), "totalPoint", 0L);
        setIntField(term44099, term44099.getClass(), "playCount", 0);
        setIntField(term44099, term44099.getClass(), "multiPlayCount", 0);
        setIntField(term44099, term44099.getClass(), "multiWinCount", 0);
        setIntField(term44099, term44099.getClass(), "requestResCount", 0);
        setIntField(term44099, term44099.getClass(), "acceptResCount", 0);
        setIntField(term44099, term44099.getClass(), "successResCount", 0);
        setIntField(term44099, term44099.getClass(), "playerRating", 0);
        setIntField(term44099, term44099.getClass(), "highestRating", 0);
        setIntField(term44099, term44099.getClass(), "nameplateId", 0);
        setIntField(term44099, term44099.getClass(), "frameId", 0);
        setIntField(term44099, term44099.getClass(), "characterId", 0);
        setIntField(term44099, term44099.getClass(), "trophyId", 0);
        setIntField(term44099, term44099.getClass(), "playedTutorialBit", 0);
        setIntField(term44099, term44099.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44099, term44099.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44099, term44099.getClass(), "totalRepertoireCount", 0);
        setIntField(term44099, term44099.getClass(), "totalMapNum", 0);
        setLongField(term44099, term44099.getClass(), "totalHiScore", 0L);
        setLongField(term44099, term44099.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44099, term44099.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44099, term44099.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44099, term44099.getClass(), "totalMasterHighScore", 0L);
        setField(term44099, term44099.getClass(), "eventWatchedDate", null);
        setIntField(term44099, term44099.getClass(), "friendCount", 0);
        setBooleanField(term44099, term44099.getClass(), "isMaimai", false);
        setField(term44099, term44099.getClass(), "firstGameId", null);
        setField(term44099, term44099.getClass(), "firstRomVersion", null);
        setField(term44099, term44099.getClass(), "firstDataVersion", null);
        setField(term44099, term44099.getClass(), "firstPlayDate", null);
        setField(term44099, term44099.getClass(), "lastGameId", null);
        setField(term44099, term44099.getClass(), "lastRomVersion", null);
        setField(term44099, term44099.getClass(), "lastDataVersion", null);
        setField(term44099, term44099.getClass(), "lastPlayDate", null);
        setIntField(term44099, term44099.getClass(), "lastPlaceId", 0);
        setField(term44099, term44099.getClass(), "lastPlaceName", null);
        setField(term44099, term44099.getClass(), "lastRegionId", null);
        setField(term44099, term44099.getClass(), "lastRegionName", null);
        setField(term44099, term44099.getClass(), "lastAllNetId", null);
        setField(term44099, term44099.getClass(), "lastClientId", null);
        term44130 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44130;
        callMethod(klass, "setTotalRepertoireCount", argTypes, term44099, args);
    }

};


