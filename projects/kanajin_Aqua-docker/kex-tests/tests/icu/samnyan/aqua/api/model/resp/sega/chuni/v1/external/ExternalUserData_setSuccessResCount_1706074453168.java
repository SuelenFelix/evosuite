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

public class ExternalUserData_setSuccessResCount_1706074453168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43769;
     Object term43800;

    public ExternalUserData_setSuccessResCount_1706074453168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43769 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43769, term43769.getClass(), "accessCode", null);
        setField(term43769, term43769.getClass(), "userName", null);
        setField(term43769, term43769.getClass(), "lastLoginDate", null);
        setBooleanField(term43769, term43769.getClass(), "isWebJoin", false);
        setField(term43769, term43769.getClass(), "webLimitDate", null);
        setIntField(term43769, term43769.getClass(), "level", 0);
        setIntField(term43769, term43769.getClass(), "reincarnationNum", 0);
        setField(term43769, term43769.getClass(), "exp", null);
        setLongField(term43769, term43769.getClass(), "point", 0L);
        setLongField(term43769, term43769.getClass(), "totalPoint", 0L);
        setIntField(term43769, term43769.getClass(), "playCount", 0);
        setIntField(term43769, term43769.getClass(), "multiPlayCount", 0);
        setIntField(term43769, term43769.getClass(), "multiWinCount", 0);
        setIntField(term43769, term43769.getClass(), "requestResCount", 0);
        setIntField(term43769, term43769.getClass(), "acceptResCount", 0);
        setIntField(term43769, term43769.getClass(), "successResCount", 0);
        setIntField(term43769, term43769.getClass(), "playerRating", 0);
        setIntField(term43769, term43769.getClass(), "highestRating", 0);
        setIntField(term43769, term43769.getClass(), "nameplateId", 0);
        setIntField(term43769, term43769.getClass(), "frameId", 0);
        setIntField(term43769, term43769.getClass(), "characterId", 0);
        setIntField(term43769, term43769.getClass(), "trophyId", 0);
        setIntField(term43769, term43769.getClass(), "playedTutorialBit", 0);
        setIntField(term43769, term43769.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43769, term43769.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43769, term43769.getClass(), "totalRepertoireCount", 0);
        setIntField(term43769, term43769.getClass(), "totalMapNum", 0);
        setLongField(term43769, term43769.getClass(), "totalHiScore", 0L);
        setLongField(term43769, term43769.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43769, term43769.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43769, term43769.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43769, term43769.getClass(), "totalMasterHighScore", 0L);
        setField(term43769, term43769.getClass(), "eventWatchedDate", null);
        setIntField(term43769, term43769.getClass(), "friendCount", 0);
        setBooleanField(term43769, term43769.getClass(), "isMaimai", false);
        setField(term43769, term43769.getClass(), "firstGameId", null);
        setField(term43769, term43769.getClass(), "firstRomVersion", null);
        setField(term43769, term43769.getClass(), "firstDataVersion", null);
        setField(term43769, term43769.getClass(), "firstPlayDate", null);
        setField(term43769, term43769.getClass(), "lastGameId", null);
        setField(term43769, term43769.getClass(), "lastRomVersion", null);
        setField(term43769, term43769.getClass(), "lastDataVersion", null);
        setField(term43769, term43769.getClass(), "lastPlayDate", null);
        setIntField(term43769, term43769.getClass(), "lastPlaceId", 0);
        setField(term43769, term43769.getClass(), "lastPlaceName", null);
        setField(term43769, term43769.getClass(), "lastRegionId", null);
        setField(term43769, term43769.getClass(), "lastRegionName", null);
        setField(term43769, term43769.getClass(), "lastAllNetId", null);
        setField(term43769, term43769.getClass(), "lastClientId", null);
        term43800 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43800;
        callMethod(klass, "setSuccessResCount", argTypes, term43769, args);
    }

};


