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

public class ExternalUserData_getTotalRepertoireCount_2116320721129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42540;

    public ExternalUserData_getTotalRepertoireCount_2116320721129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42540 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term42540, term42540.getClass(), "accessCode", null);
        setField(term42540, term42540.getClass(), "userName", null);
        setField(term42540, term42540.getClass(), "lastLoginDate", null);
        setBooleanField(term42540, term42540.getClass(), "isWebJoin", false);
        setField(term42540, term42540.getClass(), "webLimitDate", null);
        setIntField(term42540, term42540.getClass(), "level", 0);
        setIntField(term42540, term42540.getClass(), "reincarnationNum", 0);
        setField(term42540, term42540.getClass(), "exp", null);
        setLongField(term42540, term42540.getClass(), "point", 0L);
        setLongField(term42540, term42540.getClass(), "totalPoint", 0L);
        setIntField(term42540, term42540.getClass(), "playCount", 0);
        setIntField(term42540, term42540.getClass(), "multiPlayCount", 0);
        setIntField(term42540, term42540.getClass(), "multiWinCount", 0);
        setIntField(term42540, term42540.getClass(), "requestResCount", 0);
        setIntField(term42540, term42540.getClass(), "acceptResCount", 0);
        setIntField(term42540, term42540.getClass(), "successResCount", 0);
        setIntField(term42540, term42540.getClass(), "playerRating", 0);
        setIntField(term42540, term42540.getClass(), "highestRating", 0);
        setIntField(term42540, term42540.getClass(), "nameplateId", 0);
        setIntField(term42540, term42540.getClass(), "frameId", 0);
        setIntField(term42540, term42540.getClass(), "characterId", 0);
        setIntField(term42540, term42540.getClass(), "trophyId", 0);
        setIntField(term42540, term42540.getClass(), "playedTutorialBit", 0);
        setIntField(term42540, term42540.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42540, term42540.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42540, term42540.getClass(), "totalRepertoireCount", 0);
        setIntField(term42540, term42540.getClass(), "totalMapNum", 0);
        setLongField(term42540, term42540.getClass(), "totalHiScore", 0L);
        setLongField(term42540, term42540.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42540, term42540.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42540, term42540.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42540, term42540.getClass(), "totalMasterHighScore", 0L);
        setField(term42540, term42540.getClass(), "eventWatchedDate", null);
        setIntField(term42540, term42540.getClass(), "friendCount", 0);
        setBooleanField(term42540, term42540.getClass(), "isMaimai", false);
        setField(term42540, term42540.getClass(), "firstGameId", null);
        setField(term42540, term42540.getClass(), "firstRomVersion", null);
        setField(term42540, term42540.getClass(), "firstDataVersion", null);
        setField(term42540, term42540.getClass(), "firstPlayDate", null);
        setField(term42540, term42540.getClass(), "lastGameId", null);
        setField(term42540, term42540.getClass(), "lastRomVersion", null);
        setField(term42540, term42540.getClass(), "lastDataVersion", null);
        setField(term42540, term42540.getClass(), "lastPlayDate", null);
        setIntField(term42540, term42540.getClass(), "lastPlaceId", 0);
        setField(term42540, term42540.getClass(), "lastPlaceName", null);
        setField(term42540, term42540.getClass(), "lastRegionId", null);
        setField(term42540, term42540.getClass(), "lastRegionName", null);
        setField(term42540, term42540.getClass(), "lastAllNetId", null);
        setField(term42540, term42540.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRepertoireCount", argTypes, term42540, args);
    }

};


