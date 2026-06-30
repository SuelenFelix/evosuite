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

public class ExternalUserData_setFirstTutorialCancelNum_1362366342176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44033;
     Object term44064;

    public ExternalUserData_setFirstTutorialCancelNum_1362366342176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44033 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44033, term44033.getClass(), "accessCode", null);
        setField(term44033, term44033.getClass(), "userName", null);
        setField(term44033, term44033.getClass(), "lastLoginDate", null);
        setBooleanField(term44033, term44033.getClass(), "isWebJoin", false);
        setField(term44033, term44033.getClass(), "webLimitDate", null);
        setIntField(term44033, term44033.getClass(), "level", 0);
        setIntField(term44033, term44033.getClass(), "reincarnationNum", 0);
        setField(term44033, term44033.getClass(), "exp", null);
        setLongField(term44033, term44033.getClass(), "point", 0L);
        setLongField(term44033, term44033.getClass(), "totalPoint", 0L);
        setIntField(term44033, term44033.getClass(), "playCount", 0);
        setIntField(term44033, term44033.getClass(), "multiPlayCount", 0);
        setIntField(term44033, term44033.getClass(), "multiWinCount", 0);
        setIntField(term44033, term44033.getClass(), "requestResCount", 0);
        setIntField(term44033, term44033.getClass(), "acceptResCount", 0);
        setIntField(term44033, term44033.getClass(), "successResCount", 0);
        setIntField(term44033, term44033.getClass(), "playerRating", 0);
        setIntField(term44033, term44033.getClass(), "highestRating", 0);
        setIntField(term44033, term44033.getClass(), "nameplateId", 0);
        setIntField(term44033, term44033.getClass(), "frameId", 0);
        setIntField(term44033, term44033.getClass(), "characterId", 0);
        setIntField(term44033, term44033.getClass(), "trophyId", 0);
        setIntField(term44033, term44033.getClass(), "playedTutorialBit", 0);
        setIntField(term44033, term44033.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44033, term44033.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44033, term44033.getClass(), "totalRepertoireCount", 0);
        setIntField(term44033, term44033.getClass(), "totalMapNum", 0);
        setLongField(term44033, term44033.getClass(), "totalHiScore", 0L);
        setLongField(term44033, term44033.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44033, term44033.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44033, term44033.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44033, term44033.getClass(), "totalMasterHighScore", 0L);
        setField(term44033, term44033.getClass(), "eventWatchedDate", null);
        setIntField(term44033, term44033.getClass(), "friendCount", 0);
        setBooleanField(term44033, term44033.getClass(), "isMaimai", false);
        setField(term44033, term44033.getClass(), "firstGameId", null);
        setField(term44033, term44033.getClass(), "firstRomVersion", null);
        setField(term44033, term44033.getClass(), "firstDataVersion", null);
        setField(term44033, term44033.getClass(), "firstPlayDate", null);
        setField(term44033, term44033.getClass(), "lastGameId", null);
        setField(term44033, term44033.getClass(), "lastRomVersion", null);
        setField(term44033, term44033.getClass(), "lastDataVersion", null);
        setField(term44033, term44033.getClass(), "lastPlayDate", null);
        setIntField(term44033, term44033.getClass(), "lastPlaceId", 0);
        setField(term44033, term44033.getClass(), "lastPlaceName", null);
        setField(term44033, term44033.getClass(), "lastRegionId", null);
        setField(term44033, term44033.getClass(), "lastRegionName", null);
        setField(term44033, term44033.getClass(), "lastAllNetId", null);
        setField(term44033, term44033.getClass(), "lastClientId", null);
        term44064 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44064;
        callMethod(klass, "setFirstTutorialCancelNum", argTypes, term44033, args);
    }

};


