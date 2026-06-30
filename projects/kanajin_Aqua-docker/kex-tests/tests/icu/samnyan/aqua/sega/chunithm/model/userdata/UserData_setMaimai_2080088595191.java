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
import java.lang.Boolean;

public class UserData_setMaimai_2080088595191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177377;
     Object term177409;

    public UserData_setMaimai_2080088595191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177377 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177377, term177377.getClass(), "id", 0L);
        setField(term177377, term177377.getClass(), "card", null);
        setField(term177377, term177377.getClass(), "userName", null);
        setField(term177377, term177377.getClass(), "lastLoginDate", null);
        setBooleanField(term177377, term177377.getClass(), "isWebJoin", false);
        setField(term177377, term177377.getClass(), "webLimitDate", null);
        setIntField(term177377, term177377.getClass(), "level", 0);
        setIntField(term177377, term177377.getClass(), "reincarnationNum", 0);
        setField(term177377, term177377.getClass(), "exp", null);
        setLongField(term177377, term177377.getClass(), "point", 0L);
        setLongField(term177377, term177377.getClass(), "totalPoint", 0L);
        setIntField(term177377, term177377.getClass(), "playCount", 0);
        setIntField(term177377, term177377.getClass(), "multiPlayCount", 0);
        setIntField(term177377, term177377.getClass(), "multiWinCount", 0);
        setIntField(term177377, term177377.getClass(), "requestResCount", 0);
        setIntField(term177377, term177377.getClass(), "acceptResCount", 0);
        setIntField(term177377, term177377.getClass(), "successResCount", 0);
        setIntField(term177377, term177377.getClass(), "playerRating", 0);
        setIntField(term177377, term177377.getClass(), "highestRating", 0);
        setIntField(term177377, term177377.getClass(), "nameplateId", 0);
        setIntField(term177377, term177377.getClass(), "frameId", 0);
        setIntField(term177377, term177377.getClass(), "characterId", 0);
        setIntField(term177377, term177377.getClass(), "trophyId", 0);
        setIntField(term177377, term177377.getClass(), "playedTutorialBit", 0);
        setIntField(term177377, term177377.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177377, term177377.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177377, term177377.getClass(), "totalRepertoireCount", 0);
        setIntField(term177377, term177377.getClass(), "totalMapNum", 0);
        setLongField(term177377, term177377.getClass(), "totalHiScore", 0L);
        setLongField(term177377, term177377.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177377, term177377.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177377, term177377.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177377, term177377.getClass(), "totalMasterHighScore", 0L);
        setField(term177377, term177377.getClass(), "eventWatchedDate", null);
        setIntField(term177377, term177377.getClass(), "friendCount", 0);
        setBooleanField(term177377, term177377.getClass(), "isMaimai", false);
        setField(term177377, term177377.getClass(), "firstGameId", null);
        setField(term177377, term177377.getClass(), "firstRomVersion", null);
        setField(term177377, term177377.getClass(), "firstDataVersion", null);
        setField(term177377, term177377.getClass(), "firstPlayDate", null);
        setField(term177377, term177377.getClass(), "lastGameId", null);
        setField(term177377, term177377.getClass(), "lastRomVersion", null);
        setField(term177377, term177377.getClass(), "lastDataVersion", null);
        setField(term177377, term177377.getClass(), "lastPlayDate", null);
        setIntField(term177377, term177377.getClass(), "lastPlaceId", 0);
        setField(term177377, term177377.getClass(), "lastPlaceName", null);
        setField(term177377, term177377.getClass(), "lastRegionId", null);
        setField(term177377, term177377.getClass(), "lastRegionName", null);
        setField(term177377, term177377.getClass(), "lastAllNetId", null);
        setField(term177377, term177377.getClass(), "lastClientId", null);
        term177409 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term177409;
        callMethod(klass, "setMaimai", argTypes, term177377, args);
    }

};


