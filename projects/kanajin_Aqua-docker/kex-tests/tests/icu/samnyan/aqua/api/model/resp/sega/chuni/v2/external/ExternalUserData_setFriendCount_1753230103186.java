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

public class ExternalUserData_setFriendCount_1753230103186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44361;
     Object term44392;

    public ExternalUserData_setFriendCount_1753230103186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44361 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term44361, term44361.getClass(), "accessCode", null);
        setField(term44361, term44361.getClass(), "userName", null);
        setField(term44361, term44361.getClass(), "lastLoginDate", null);
        setBooleanField(term44361, term44361.getClass(), "isWebJoin", false);
        setField(term44361, term44361.getClass(), "webLimitDate", null);
        setIntField(term44361, term44361.getClass(), "level", 0);
        setIntField(term44361, term44361.getClass(), "reincarnationNum", 0);
        setField(term44361, term44361.getClass(), "exp", null);
        setLongField(term44361, term44361.getClass(), "point", 0L);
        setLongField(term44361, term44361.getClass(), "totalPoint", 0L);
        setIntField(term44361, term44361.getClass(), "playCount", 0);
        setIntField(term44361, term44361.getClass(), "multiPlayCount", 0);
        setIntField(term44361, term44361.getClass(), "multiWinCount", 0);
        setIntField(term44361, term44361.getClass(), "requestResCount", 0);
        setIntField(term44361, term44361.getClass(), "acceptResCount", 0);
        setIntField(term44361, term44361.getClass(), "successResCount", 0);
        setIntField(term44361, term44361.getClass(), "playerRating", 0);
        setIntField(term44361, term44361.getClass(), "highestRating", 0);
        setIntField(term44361, term44361.getClass(), "nameplateId", 0);
        setIntField(term44361, term44361.getClass(), "frameId", 0);
        setIntField(term44361, term44361.getClass(), "characterId", 0);
        setIntField(term44361, term44361.getClass(), "trophyId", 0);
        setIntField(term44361, term44361.getClass(), "playedTutorialBit", 0);
        setIntField(term44361, term44361.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term44361, term44361.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term44361, term44361.getClass(), "totalRepertoireCount", 0);
        setIntField(term44361, term44361.getClass(), "totalMapNum", 0);
        setLongField(term44361, term44361.getClass(), "totalHiScore", 0L);
        setLongField(term44361, term44361.getClass(), "totalBasicHighScore", 0L);
        setLongField(term44361, term44361.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term44361, term44361.getClass(), "totalExpertHighScore", 0L);
        setLongField(term44361, term44361.getClass(), "totalMasterHighScore", 0L);
        setField(term44361, term44361.getClass(), "eventWatchedDate", null);
        setIntField(term44361, term44361.getClass(), "friendCount", 0);
        setBooleanField(term44361, term44361.getClass(), "isMaimai", false);
        setField(term44361, term44361.getClass(), "firstGameId", null);
        setField(term44361, term44361.getClass(), "firstRomVersion", null);
        setField(term44361, term44361.getClass(), "firstDataVersion", null);
        setField(term44361, term44361.getClass(), "firstPlayDate", null);
        setField(term44361, term44361.getClass(), "lastGameId", null);
        setField(term44361, term44361.getClass(), "lastRomVersion", null);
        setField(term44361, term44361.getClass(), "lastDataVersion", null);
        setField(term44361, term44361.getClass(), "lastPlayDate", null);
        setIntField(term44361, term44361.getClass(), "lastPlaceId", 0);
        setField(term44361, term44361.getClass(), "lastPlaceName", null);
        setField(term44361, term44361.getClass(), "lastRegionId", null);
        setField(term44361, term44361.getClass(), "lastRegionName", null);
        setField(term44361, term44361.getClass(), "lastAllNetId", null);
        setField(term44361, term44361.getClass(), "lastClientId", null);
        term44392 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term44392;
        callMethod(klass, "setFriendCount", argTypes, term44361, args);
    }

};


