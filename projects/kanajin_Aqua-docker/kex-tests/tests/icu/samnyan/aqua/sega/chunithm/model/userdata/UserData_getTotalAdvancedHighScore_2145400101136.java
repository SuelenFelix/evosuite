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

public class UserData_getTotalAdvancedHighScore_2145400101136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175559;

    public UserData_getTotalAdvancedHighScore_2145400101136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175559 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175559, term175559.getClass(), "id", 0L);
        setField(term175559, term175559.getClass(), "card", null);
        setField(term175559, term175559.getClass(), "userName", null);
        setField(term175559, term175559.getClass(), "lastLoginDate", null);
        setBooleanField(term175559, term175559.getClass(), "isWebJoin", false);
        setField(term175559, term175559.getClass(), "webLimitDate", null);
        setIntField(term175559, term175559.getClass(), "level", 0);
        setIntField(term175559, term175559.getClass(), "reincarnationNum", 0);
        setField(term175559, term175559.getClass(), "exp", null);
        setLongField(term175559, term175559.getClass(), "point", 0L);
        setLongField(term175559, term175559.getClass(), "totalPoint", 0L);
        setIntField(term175559, term175559.getClass(), "playCount", 0);
        setIntField(term175559, term175559.getClass(), "multiPlayCount", 0);
        setIntField(term175559, term175559.getClass(), "multiWinCount", 0);
        setIntField(term175559, term175559.getClass(), "requestResCount", 0);
        setIntField(term175559, term175559.getClass(), "acceptResCount", 0);
        setIntField(term175559, term175559.getClass(), "successResCount", 0);
        setIntField(term175559, term175559.getClass(), "playerRating", 0);
        setIntField(term175559, term175559.getClass(), "highestRating", 0);
        setIntField(term175559, term175559.getClass(), "nameplateId", 0);
        setIntField(term175559, term175559.getClass(), "frameId", 0);
        setIntField(term175559, term175559.getClass(), "characterId", 0);
        setIntField(term175559, term175559.getClass(), "trophyId", 0);
        setIntField(term175559, term175559.getClass(), "playedTutorialBit", 0);
        setIntField(term175559, term175559.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175559, term175559.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175559, term175559.getClass(), "totalRepertoireCount", 0);
        setIntField(term175559, term175559.getClass(), "totalMapNum", 0);
        setLongField(term175559, term175559.getClass(), "totalHiScore", 0L);
        setLongField(term175559, term175559.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175559, term175559.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175559, term175559.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175559, term175559.getClass(), "totalMasterHighScore", 0L);
        setField(term175559, term175559.getClass(), "eventWatchedDate", null);
        setIntField(term175559, term175559.getClass(), "friendCount", 0);
        setBooleanField(term175559, term175559.getClass(), "isMaimai", false);
        setField(term175559, term175559.getClass(), "firstGameId", null);
        setField(term175559, term175559.getClass(), "firstRomVersion", null);
        setField(term175559, term175559.getClass(), "firstDataVersion", null);
        setField(term175559, term175559.getClass(), "firstPlayDate", null);
        setField(term175559, term175559.getClass(), "lastGameId", null);
        setField(term175559, term175559.getClass(), "lastRomVersion", null);
        setField(term175559, term175559.getClass(), "lastDataVersion", null);
        setField(term175559, term175559.getClass(), "lastPlayDate", null);
        setIntField(term175559, term175559.getClass(), "lastPlaceId", 0);
        setField(term175559, term175559.getClass(), "lastPlaceName", null);
        setField(term175559, term175559.getClass(), "lastRegionId", null);
        setField(term175559, term175559.getClass(), "lastRegionName", null);
        setField(term175559, term175559.getClass(), "lastAllNetId", null);
        setField(term175559, term175559.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedHighScore", argTypes, term175559, args);
    }

};


