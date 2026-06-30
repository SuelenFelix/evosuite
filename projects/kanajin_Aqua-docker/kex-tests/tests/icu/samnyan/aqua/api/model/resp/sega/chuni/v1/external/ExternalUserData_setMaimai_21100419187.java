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
import java.lang.Boolean;

public class ExternalUserData_setMaimai_21100419187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44394;
     Object term44425;

    public ExternalUserData_setMaimai_21100419187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44394 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term44394, term44394.getClass(), "accessCode", null);
        setField(term44394, term44394.getClass(), "userName", null);
        setField(term44394, term44394.getClass(), "lastLoginDate", null);
        setBooleanField(term44394, term44394.getClass(), "isWebJoin", false);
        setField(term44394, term44394.getClass(), "webLimitDate", null);
        setIntField(term44394, term44394.getClass(), "level", 0);
        setIntField(term44394, term44394.getClass(), "reincarnationNum", 0);
        setField(term44394, term44394.getClass(), "exp", null);
        setLongField(term44394, term44394.getClass(), "point", 0L);
        setLongField(term44394, term44394.getClass(), "totalPoint", 0L);
        setIntField(term44394, term44394.getClass(), "playCount", 0);
        setIntField(term44394, term44394.getClass(), "multiPlayCount", 0);
        setIntField(term44394, term44394.getClass(), "multiWinCount", 0);
        setIntField(term44394, term44394.getClass(), "requestResCount", 0);
        setIntField(term44394, term44394.getClass(), "acceptResCount", 0);
        setIntField(term44394, term44394.getClass(), "successResCount", 0);
        setIntField(term44394, term44394.getClass(), "playerRating", 0);
        setIntField(term44394, term44394.getClass(), "highestRating", 0);
        setIntField(term44394, term44394.getClass(), "nameplateId", 0);
        setIntField(term44394, term44394.getClass(), "frameId", 0);
        setIntField(term44394, term44394.getClass(), "characterId", 0);
        setIntField(term44394, term44394.getClass(), "trophyId", 0);
        setIntField(term44394, term44394.getClass(), "playedTutorialBit", 0);
        setIntField(term44394, term44394.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44394, term44394.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44394, term44394.getClass(), "totalRepertoireCount", 0);
        setIntField(term44394, term44394.getClass(), "totalMapNum", 0);
        setLongField(term44394, term44394.getClass(), "totalHiScore", 0L);
        setLongField(term44394, term44394.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44394, term44394.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44394, term44394.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44394, term44394.getClass(), "totalMasterHighScore", 0L);
        setField(term44394, term44394.getClass(), "eventWatchedDate", null);
        setIntField(term44394, term44394.getClass(), "friendCount", 0);
        setBooleanField(term44394, term44394.getClass(), "isMaimai", false);
        setField(term44394, term44394.getClass(), "firstGameId", null);
        setField(term44394, term44394.getClass(), "firstRomVersion", null);
        setField(term44394, term44394.getClass(), "firstDataVersion", null);
        setField(term44394, term44394.getClass(), "firstPlayDate", null);
        setField(term44394, term44394.getClass(), "lastGameId", null);
        setField(term44394, term44394.getClass(), "lastRomVersion", null);
        setField(term44394, term44394.getClass(), "lastDataVersion", null);
        setField(term44394, term44394.getClass(), "lastPlayDate", null);
        setIntField(term44394, term44394.getClass(), "lastPlaceId", 0);
        setField(term44394, term44394.getClass(), "lastPlaceName", null);
        setField(term44394, term44394.getClass(), "lastRegionId", null);
        setField(term44394, term44394.getClass(), "lastRegionName", null);
        setField(term44394, term44394.getClass(), "lastAllNetId", null);
        setField(term44394, term44394.getClass(), "lastClientId", null);
        term44425 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term44425;
        callMethod(klass, "setMaimai", argTypes, term44394, args);
    }

};


