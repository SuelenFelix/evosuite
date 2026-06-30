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

public class UserData_setLastGameId_1005192975196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177539;

    public UserData_setLastGameId_1005192975196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177539 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177539, term177539.getClass(), "id", 0L);
        setField(term177539, term177539.getClass(), "card", null);
        setField(term177539, term177539.getClass(), "userName", null);
        setField(term177539, term177539.getClass(), "lastLoginDate", null);
        setBooleanField(term177539, term177539.getClass(), "isWebJoin", false);
        setField(term177539, term177539.getClass(), "webLimitDate", null);
        setIntField(term177539, term177539.getClass(), "level", 0);
        setIntField(term177539, term177539.getClass(), "reincarnationNum", 0);
        setField(term177539, term177539.getClass(), "exp", null);
        setLongField(term177539, term177539.getClass(), "point", 0L);
        setLongField(term177539, term177539.getClass(), "totalPoint", 0L);
        setIntField(term177539, term177539.getClass(), "playCount", 0);
        setIntField(term177539, term177539.getClass(), "multiPlayCount", 0);
        setIntField(term177539, term177539.getClass(), "multiWinCount", 0);
        setIntField(term177539, term177539.getClass(), "requestResCount", 0);
        setIntField(term177539, term177539.getClass(), "acceptResCount", 0);
        setIntField(term177539, term177539.getClass(), "successResCount", 0);
        setIntField(term177539, term177539.getClass(), "playerRating", 0);
        setIntField(term177539, term177539.getClass(), "highestRating", 0);
        setIntField(term177539, term177539.getClass(), "nameplateId", 0);
        setIntField(term177539, term177539.getClass(), "frameId", 0);
        setIntField(term177539, term177539.getClass(), "characterId", 0);
        setIntField(term177539, term177539.getClass(), "trophyId", 0);
        setIntField(term177539, term177539.getClass(), "playedTutorialBit", 0);
        setIntField(term177539, term177539.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177539, term177539.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177539, term177539.getClass(), "totalRepertoireCount", 0);
        setIntField(term177539, term177539.getClass(), "totalMapNum", 0);
        setLongField(term177539, term177539.getClass(), "totalHiScore", 0L);
        setLongField(term177539, term177539.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177539, term177539.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177539, term177539.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177539, term177539.getClass(), "totalMasterHighScore", 0L);
        setField(term177539, term177539.getClass(), "eventWatchedDate", null);
        setIntField(term177539, term177539.getClass(), "friendCount", 0);
        setBooleanField(term177539, term177539.getClass(), "isMaimai", false);
        setField(term177539, term177539.getClass(), "firstGameId", null);
        setField(term177539, term177539.getClass(), "firstRomVersion", null);
        setField(term177539, term177539.getClass(), "firstDataVersion", null);
        setField(term177539, term177539.getClass(), "firstPlayDate", null);
        setField(term177539, term177539.getClass(), "lastGameId", null);
        setField(term177539, term177539.getClass(), "lastRomVersion", null);
        setField(term177539, term177539.getClass(), "lastDataVersion", null);
        setField(term177539, term177539.getClass(), "lastPlayDate", null);
        setIntField(term177539, term177539.getClass(), "lastPlaceId", 0);
        setField(term177539, term177539.getClass(), "lastPlaceName", null);
        setField(term177539, term177539.getClass(), "lastRegionId", null);
        setField(term177539, term177539.getClass(), "lastRegionName", null);
        setField(term177539, term177539.getClass(), "lastAllNetId", null);
        setField(term177539, term177539.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastGameId", argTypes, term177539, args);
    }

};


