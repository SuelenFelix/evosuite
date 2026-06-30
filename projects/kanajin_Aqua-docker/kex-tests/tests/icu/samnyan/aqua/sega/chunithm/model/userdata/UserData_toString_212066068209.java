package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_toString_212066068209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177957;

    public UserData_toString_212066068209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177957 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177957, term177957.getClass(), "id", 0L);
        setField(term177957, term177957.getClass(), "card", null);
        setField(term177957, term177957.getClass(), "userName", null);
        setField(term177957, term177957.getClass(), "lastLoginDate", null);
        setBooleanField(term177957, term177957.getClass(), "isWebJoin", false);
        setField(term177957, term177957.getClass(), "webLimitDate", null);
        setIntField(term177957, term177957.getClass(), "level", 0);
        setIntField(term177957, term177957.getClass(), "reincarnationNum", 0);
        setField(term177957, term177957.getClass(), "exp", null);
        setLongField(term177957, term177957.getClass(), "point", 0L);
        setLongField(term177957, term177957.getClass(), "totalPoint", 0L);
        setIntField(term177957, term177957.getClass(), "playCount", 0);
        setIntField(term177957, term177957.getClass(), "multiPlayCount", 0);
        setIntField(term177957, term177957.getClass(), "multiWinCount", 0);
        setIntField(term177957, term177957.getClass(), "requestResCount", 0);
        setIntField(term177957, term177957.getClass(), "acceptResCount", 0);
        setIntField(term177957, term177957.getClass(), "successResCount", 0);
        setIntField(term177957, term177957.getClass(), "playerRating", 0);
        setIntField(term177957, term177957.getClass(), "highestRating", 0);
        setIntField(term177957, term177957.getClass(), "nameplateId", 0);
        setIntField(term177957, term177957.getClass(), "frameId", 0);
        setIntField(term177957, term177957.getClass(), "characterId", 0);
        setIntField(term177957, term177957.getClass(), "trophyId", 0);
        setIntField(term177957, term177957.getClass(), "playedTutorialBit", 0);
        setIntField(term177957, term177957.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177957, term177957.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177957, term177957.getClass(), "totalRepertoireCount", 0);
        setIntField(term177957, term177957.getClass(), "totalMapNum", 0);
        setLongField(term177957, term177957.getClass(), "totalHiScore", 0L);
        setLongField(term177957, term177957.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177957, term177957.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177957, term177957.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177957, term177957.getClass(), "totalMasterHighScore", 0L);
        setField(term177957, term177957.getClass(), "eventWatchedDate", null);
        setIntField(term177957, term177957.getClass(), "friendCount", 0);
        setBooleanField(term177957, term177957.getClass(), "isMaimai", false);
        setField(term177957, term177957.getClass(), "firstGameId", null);
        setField(term177957, term177957.getClass(), "firstRomVersion", null);
        setField(term177957, term177957.getClass(), "firstDataVersion", null);
        setField(term177957, term177957.getClass(), "firstPlayDate", null);
        setField(term177957, term177957.getClass(), "lastGameId", null);
        setField(term177957, term177957.getClass(), "lastRomVersion", null);
        setField(term177957, term177957.getClass(), "lastDataVersion", null);
        setField(term177957, term177957.getClass(), "lastPlayDate", null);
        setIntField(term177957, term177957.getClass(), "lastPlaceId", 0);
        setField(term177957, term177957.getClass(), "lastPlaceName", null);
        setField(term177957, term177957.getClass(), "lastRegionId", null);
        setField(term177957, term177957.getClass(), "lastRegionName", null);
        setField(term177957, term177957.getClass(), "lastAllNetId", null);
        setField(term177957, term177957.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term177957, args);
    }

};


