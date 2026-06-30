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
import java.lang.Long;

public class ExternalUserData_setTotalBasicHighScore_1762621022181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44198;
     Object term44229;

    public ExternalUserData_setTotalBasicHighScore_1762621022181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44198 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44198, term44198.getClass(), "accessCode", null);
        setField(term44198, term44198.getClass(), "userName", null);
        setField(term44198, term44198.getClass(), "lastLoginDate", null);
        setBooleanField(term44198, term44198.getClass(), "isWebJoin", false);
        setField(term44198, term44198.getClass(), "webLimitDate", null);
        setIntField(term44198, term44198.getClass(), "level", 0);
        setIntField(term44198, term44198.getClass(), "reincarnationNum", 0);
        setField(term44198, term44198.getClass(), "exp", null);
        setLongField(term44198, term44198.getClass(), "point", 0L);
        setLongField(term44198, term44198.getClass(), "totalPoint", 0L);
        setIntField(term44198, term44198.getClass(), "playCount", 0);
        setIntField(term44198, term44198.getClass(), "multiPlayCount", 0);
        setIntField(term44198, term44198.getClass(), "multiWinCount", 0);
        setIntField(term44198, term44198.getClass(), "requestResCount", 0);
        setIntField(term44198, term44198.getClass(), "acceptResCount", 0);
        setIntField(term44198, term44198.getClass(), "successResCount", 0);
        setIntField(term44198, term44198.getClass(), "playerRating", 0);
        setIntField(term44198, term44198.getClass(), "highestRating", 0);
        setIntField(term44198, term44198.getClass(), "nameplateId", 0);
        setIntField(term44198, term44198.getClass(), "frameId", 0);
        setIntField(term44198, term44198.getClass(), "characterId", 0);
        setIntField(term44198, term44198.getClass(), "trophyId", 0);
        setIntField(term44198, term44198.getClass(), "playedTutorialBit", 0);
        setIntField(term44198, term44198.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44198, term44198.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44198, term44198.getClass(), "totalRepertoireCount", 0);
        setIntField(term44198, term44198.getClass(), "totalMapNum", 0);
        setLongField(term44198, term44198.getClass(), "totalHiScore", 0L);
        setLongField(term44198, term44198.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44198, term44198.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44198, term44198.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44198, term44198.getClass(), "totalMasterHighScore", 0L);
        setField(term44198, term44198.getClass(), "eventWatchedDate", null);
        setIntField(term44198, term44198.getClass(), "friendCount", 0);
        setBooleanField(term44198, term44198.getClass(), "isMaimai", false);
        setField(term44198, term44198.getClass(), "firstGameId", null);
        setField(term44198, term44198.getClass(), "firstRomVersion", null);
        setField(term44198, term44198.getClass(), "firstDataVersion", null);
        setField(term44198, term44198.getClass(), "firstPlayDate", null);
        setField(term44198, term44198.getClass(), "lastGameId", null);
        setField(term44198, term44198.getClass(), "lastRomVersion", null);
        setField(term44198, term44198.getClass(), "lastDataVersion", null);
        setField(term44198, term44198.getClass(), "lastPlayDate", null);
        setIntField(term44198, term44198.getClass(), "lastPlaceId", 0);
        setField(term44198, term44198.getClass(), "lastPlaceName", null);
        setField(term44198, term44198.getClass(), "lastRegionId", null);
        setField(term44198, term44198.getClass(), "lastRegionName", null);
        setField(term44198, term44198.getClass(), "lastAllNetId", null);
        setField(term44198, term44198.getClass(), "lastClientId", null);
        term44229 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term44229;
        callMethod(klass, "setTotalBasicHighScore", argTypes, term44198, args);
    }

};


