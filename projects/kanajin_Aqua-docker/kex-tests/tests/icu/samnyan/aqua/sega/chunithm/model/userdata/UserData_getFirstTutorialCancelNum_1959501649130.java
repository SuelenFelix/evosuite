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

public class UserData_getFirstTutorialCancelNum_1959501649130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175367;

    public UserData_getFirstTutorialCancelNum_1959501649130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175367 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175367, term175367.getClass(), "id", 0L);
        setField(term175367, term175367.getClass(), "card", null);
        setField(term175367, term175367.getClass(), "userName", null);
        setField(term175367, term175367.getClass(), "lastLoginDate", null);
        setBooleanField(term175367, term175367.getClass(), "isWebJoin", false);
        setField(term175367, term175367.getClass(), "webLimitDate", null);
        setIntField(term175367, term175367.getClass(), "level", 0);
        setIntField(term175367, term175367.getClass(), "reincarnationNum", 0);
        setField(term175367, term175367.getClass(), "exp", null);
        setLongField(term175367, term175367.getClass(), "point", 0L);
        setLongField(term175367, term175367.getClass(), "totalPoint", 0L);
        setIntField(term175367, term175367.getClass(), "playCount", 0);
        setIntField(term175367, term175367.getClass(), "multiPlayCount", 0);
        setIntField(term175367, term175367.getClass(), "multiWinCount", 0);
        setIntField(term175367, term175367.getClass(), "requestResCount", 0);
        setIntField(term175367, term175367.getClass(), "acceptResCount", 0);
        setIntField(term175367, term175367.getClass(), "successResCount", 0);
        setIntField(term175367, term175367.getClass(), "playerRating", 0);
        setIntField(term175367, term175367.getClass(), "highestRating", 0);
        setIntField(term175367, term175367.getClass(), "nameplateId", 0);
        setIntField(term175367, term175367.getClass(), "frameId", 0);
        setIntField(term175367, term175367.getClass(), "characterId", 0);
        setIntField(term175367, term175367.getClass(), "trophyId", 0);
        setIntField(term175367, term175367.getClass(), "playedTutorialBit", 0);
        setIntField(term175367, term175367.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175367, term175367.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175367, term175367.getClass(), "totalRepertoireCount", 0);
        setIntField(term175367, term175367.getClass(), "totalMapNum", 0);
        setLongField(term175367, term175367.getClass(), "totalHiScore", 0L);
        setLongField(term175367, term175367.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175367, term175367.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175367, term175367.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175367, term175367.getClass(), "totalMasterHighScore", 0L);
        setField(term175367, term175367.getClass(), "eventWatchedDate", null);
        setIntField(term175367, term175367.getClass(), "friendCount", 0);
        setBooleanField(term175367, term175367.getClass(), "isMaimai", false);
        setField(term175367, term175367.getClass(), "firstGameId", null);
        setField(term175367, term175367.getClass(), "firstRomVersion", null);
        setField(term175367, term175367.getClass(), "firstDataVersion", null);
        setField(term175367, term175367.getClass(), "firstPlayDate", null);
        setField(term175367, term175367.getClass(), "lastGameId", null);
        setField(term175367, term175367.getClass(), "lastRomVersion", null);
        setField(term175367, term175367.getClass(), "lastDataVersion", null);
        setField(term175367, term175367.getClass(), "lastPlayDate", null);
        setIntField(term175367, term175367.getClass(), "lastPlaceId", 0);
        setField(term175367, term175367.getClass(), "lastPlaceName", null);
        setField(term175367, term175367.getClass(), "lastRegionId", null);
        setField(term175367, term175367.getClass(), "lastRegionName", null);
        setField(term175367, term175367.getClass(), "lastAllNetId", null);
        setField(term175367, term175367.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstTutorialCancelNum", argTypes, term175367, args);
    }

};


