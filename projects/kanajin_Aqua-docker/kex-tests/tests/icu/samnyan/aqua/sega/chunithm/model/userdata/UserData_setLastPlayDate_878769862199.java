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

public class UserData_setLastPlayDate_878769862199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177635;

    public UserData_setLastPlayDate_878769862199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177635 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177635, term177635.getClass(), "id", 0L);
        setField(term177635, term177635.getClass(), "card", null);
        setField(term177635, term177635.getClass(), "userName", null);
        setField(term177635, term177635.getClass(), "lastLoginDate", null);
        setBooleanField(term177635, term177635.getClass(), "isWebJoin", false);
        setField(term177635, term177635.getClass(), "webLimitDate", null);
        setIntField(term177635, term177635.getClass(), "level", 0);
        setIntField(term177635, term177635.getClass(), "reincarnationNum", 0);
        setField(term177635, term177635.getClass(), "exp", null);
        setLongField(term177635, term177635.getClass(), "point", 0L);
        setLongField(term177635, term177635.getClass(), "totalPoint", 0L);
        setIntField(term177635, term177635.getClass(), "playCount", 0);
        setIntField(term177635, term177635.getClass(), "multiPlayCount", 0);
        setIntField(term177635, term177635.getClass(), "multiWinCount", 0);
        setIntField(term177635, term177635.getClass(), "requestResCount", 0);
        setIntField(term177635, term177635.getClass(), "acceptResCount", 0);
        setIntField(term177635, term177635.getClass(), "successResCount", 0);
        setIntField(term177635, term177635.getClass(), "playerRating", 0);
        setIntField(term177635, term177635.getClass(), "highestRating", 0);
        setIntField(term177635, term177635.getClass(), "nameplateId", 0);
        setIntField(term177635, term177635.getClass(), "frameId", 0);
        setIntField(term177635, term177635.getClass(), "characterId", 0);
        setIntField(term177635, term177635.getClass(), "trophyId", 0);
        setIntField(term177635, term177635.getClass(), "playedTutorialBit", 0);
        setIntField(term177635, term177635.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177635, term177635.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177635, term177635.getClass(), "totalRepertoireCount", 0);
        setIntField(term177635, term177635.getClass(), "totalMapNum", 0);
        setLongField(term177635, term177635.getClass(), "totalHiScore", 0L);
        setLongField(term177635, term177635.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177635, term177635.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177635, term177635.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177635, term177635.getClass(), "totalMasterHighScore", 0L);
        setField(term177635, term177635.getClass(), "eventWatchedDate", null);
        setIntField(term177635, term177635.getClass(), "friendCount", 0);
        setBooleanField(term177635, term177635.getClass(), "isMaimai", false);
        setField(term177635, term177635.getClass(), "firstGameId", null);
        setField(term177635, term177635.getClass(), "firstRomVersion", null);
        setField(term177635, term177635.getClass(), "firstDataVersion", null);
        setField(term177635, term177635.getClass(), "firstPlayDate", null);
        setField(term177635, term177635.getClass(), "lastGameId", null);
        setField(term177635, term177635.getClass(), "lastRomVersion", null);
        setField(term177635, term177635.getClass(), "lastDataVersion", null);
        setField(term177635, term177635.getClass(), "lastPlayDate", null);
        setIntField(term177635, term177635.getClass(), "lastPlaceId", 0);
        setField(term177635, term177635.getClass(), "lastPlaceName", null);
        setField(term177635, term177635.getClass(), "lastRegionId", null);
        setField(term177635, term177635.getClass(), "lastRegionName", null);
        setField(term177635, term177635.getClass(), "lastAllNetId", null);
        setField(term177635, term177635.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term177635, args);
    }

};


