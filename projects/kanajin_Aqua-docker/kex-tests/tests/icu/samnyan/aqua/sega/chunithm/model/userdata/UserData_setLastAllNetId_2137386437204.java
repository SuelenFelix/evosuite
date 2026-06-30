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

public class UserData_setLastAllNetId_2137386437204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177797;

    public UserData_setLastAllNetId_2137386437204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177797 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177797, term177797.getClass(), "id", 0L);
        setField(term177797, term177797.getClass(), "card", null);
        setField(term177797, term177797.getClass(), "userName", null);
        setField(term177797, term177797.getClass(), "lastLoginDate", null);
        setBooleanField(term177797, term177797.getClass(), "isWebJoin", false);
        setField(term177797, term177797.getClass(), "webLimitDate", null);
        setIntField(term177797, term177797.getClass(), "level", 0);
        setIntField(term177797, term177797.getClass(), "reincarnationNum", 0);
        setField(term177797, term177797.getClass(), "exp", null);
        setLongField(term177797, term177797.getClass(), "point", 0L);
        setLongField(term177797, term177797.getClass(), "totalPoint", 0L);
        setIntField(term177797, term177797.getClass(), "playCount", 0);
        setIntField(term177797, term177797.getClass(), "multiPlayCount", 0);
        setIntField(term177797, term177797.getClass(), "multiWinCount", 0);
        setIntField(term177797, term177797.getClass(), "requestResCount", 0);
        setIntField(term177797, term177797.getClass(), "acceptResCount", 0);
        setIntField(term177797, term177797.getClass(), "successResCount", 0);
        setIntField(term177797, term177797.getClass(), "playerRating", 0);
        setIntField(term177797, term177797.getClass(), "highestRating", 0);
        setIntField(term177797, term177797.getClass(), "nameplateId", 0);
        setIntField(term177797, term177797.getClass(), "frameId", 0);
        setIntField(term177797, term177797.getClass(), "characterId", 0);
        setIntField(term177797, term177797.getClass(), "trophyId", 0);
        setIntField(term177797, term177797.getClass(), "playedTutorialBit", 0);
        setIntField(term177797, term177797.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177797, term177797.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177797, term177797.getClass(), "totalRepertoireCount", 0);
        setIntField(term177797, term177797.getClass(), "totalMapNum", 0);
        setLongField(term177797, term177797.getClass(), "totalHiScore", 0L);
        setLongField(term177797, term177797.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177797, term177797.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177797, term177797.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177797, term177797.getClass(), "totalMasterHighScore", 0L);
        setField(term177797, term177797.getClass(), "eventWatchedDate", null);
        setIntField(term177797, term177797.getClass(), "friendCount", 0);
        setBooleanField(term177797, term177797.getClass(), "isMaimai", false);
        setField(term177797, term177797.getClass(), "firstGameId", null);
        setField(term177797, term177797.getClass(), "firstRomVersion", null);
        setField(term177797, term177797.getClass(), "firstDataVersion", null);
        setField(term177797, term177797.getClass(), "firstPlayDate", null);
        setField(term177797, term177797.getClass(), "lastGameId", null);
        setField(term177797, term177797.getClass(), "lastRomVersion", null);
        setField(term177797, term177797.getClass(), "lastDataVersion", null);
        setField(term177797, term177797.getClass(), "lastPlayDate", null);
        setIntField(term177797, term177797.getClass(), "lastPlaceId", 0);
        setField(term177797, term177797.getClass(), "lastPlaceName", null);
        setField(term177797, term177797.getClass(), "lastRegionId", null);
        setField(term177797, term177797.getClass(), "lastRegionName", null);
        setField(term177797, term177797.getClass(), "lastAllNetId", null);
        setField(term177797, term177797.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastAllNetId", argTypes, term177797, args);
    }

};


