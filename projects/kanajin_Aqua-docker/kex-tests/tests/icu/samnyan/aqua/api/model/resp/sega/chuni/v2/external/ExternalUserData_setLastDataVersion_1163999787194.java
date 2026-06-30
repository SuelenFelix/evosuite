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

public class ExternalUserData_setLastDataVersion_1163999787194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44613;

    public ExternalUserData_setLastDataVersion_1163999787194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44613 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44613, term44613.getClass(), "accessCode", null);
        setField(term44613, term44613.getClass(), "userName", null);
        setField(term44613, term44613.getClass(), "lastLoginDate", null);
        setBooleanField(term44613, term44613.getClass(), "isWebJoin", false);
        setField(term44613, term44613.getClass(), "webLimitDate", null);
        setIntField(term44613, term44613.getClass(), "level", 0);
        setIntField(term44613, term44613.getClass(), "reincarnationNum", 0);
        setField(term44613, term44613.getClass(), "exp", null);
        setLongField(term44613, term44613.getClass(), "point", 0L);
        setLongField(term44613, term44613.getClass(), "totalPoint", 0L);
        setIntField(term44613, term44613.getClass(), "playCount", 0);
        setIntField(term44613, term44613.getClass(), "multiPlayCount", 0);
        setIntField(term44613, term44613.getClass(), "multiWinCount", 0);
        setIntField(term44613, term44613.getClass(), "requestResCount", 0);
        setIntField(term44613, term44613.getClass(), "acceptResCount", 0);
        setIntField(term44613, term44613.getClass(), "successResCount", 0);
        setIntField(term44613, term44613.getClass(), "playerRating", 0);
        setIntField(term44613, term44613.getClass(), "highestRating", 0);
        setIntField(term44613, term44613.getClass(), "nameplateId", 0);
        setIntField(term44613, term44613.getClass(), "frameId", 0);
        setIntField(term44613, term44613.getClass(), "characterId", 0);
        setIntField(term44613, term44613.getClass(), "trophyId", 0);
        setIntField(term44613, term44613.getClass(), "playedTutorialBit", 0);
        setIntField(term44613, term44613.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44613, term44613.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44613, term44613.getClass(), "totalRepertoireCount", 0);
        setIntField(term44613, term44613.getClass(), "totalMapNum", 0);
        setLongField(term44613, term44613.getClass(), "totalHiScore", 0L);
        setLongField(term44613, term44613.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44613, term44613.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44613, term44613.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44613, term44613.getClass(), "totalMasterHighScore", 0L);
        setField(term44613, term44613.getClass(), "eventWatchedDate", null);
        setIntField(term44613, term44613.getClass(), "friendCount", 0);
        setBooleanField(term44613, term44613.getClass(), "isMaimai", false);
        setField(term44613, term44613.getClass(), "firstGameId", null);
        setField(term44613, term44613.getClass(), "firstRomVersion", null);
        setField(term44613, term44613.getClass(), "firstDataVersion", null);
        setField(term44613, term44613.getClass(), "firstPlayDate", null);
        setField(term44613, term44613.getClass(), "lastGameId", null);
        setField(term44613, term44613.getClass(), "lastRomVersion", null);
        setField(term44613, term44613.getClass(), "lastDataVersion", null);
        setField(term44613, term44613.getClass(), "lastPlayDate", null);
        setIntField(term44613, term44613.getClass(), "lastPlaceId", 0);
        setField(term44613, term44613.getClass(), "lastPlaceName", null);
        setField(term44613, term44613.getClass(), "lastRegionId", null);
        setField(term44613, term44613.getClass(), "lastRegionName", null);
        setField(term44613, term44613.getClass(), "lastAllNetId", null);
        setField(term44613, term44613.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastDataVersion", argTypes, term44613, args);
    }

};


