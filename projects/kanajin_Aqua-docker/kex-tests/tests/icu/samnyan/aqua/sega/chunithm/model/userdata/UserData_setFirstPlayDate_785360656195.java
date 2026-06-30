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

public class UserData_setFirstPlayDate_785360656195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177507;

    public UserData_setFirstPlayDate_785360656195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177507 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177507, term177507.getClass(), "id", 0L);
        setField(term177507, term177507.getClass(), "card", null);
        setField(term177507, term177507.getClass(), "userName", null);
        setField(term177507, term177507.getClass(), "lastLoginDate", null);
        setBooleanField(term177507, term177507.getClass(), "isWebJoin", false);
        setField(term177507, term177507.getClass(), "webLimitDate", null);
        setIntField(term177507, term177507.getClass(), "level", 0);
        setIntField(term177507, term177507.getClass(), "reincarnationNum", 0);
        setField(term177507, term177507.getClass(), "exp", null);
        setLongField(term177507, term177507.getClass(), "point", 0L);
        setLongField(term177507, term177507.getClass(), "totalPoint", 0L);
        setIntField(term177507, term177507.getClass(), "playCount", 0);
        setIntField(term177507, term177507.getClass(), "multiPlayCount", 0);
        setIntField(term177507, term177507.getClass(), "multiWinCount", 0);
        setIntField(term177507, term177507.getClass(), "requestResCount", 0);
        setIntField(term177507, term177507.getClass(), "acceptResCount", 0);
        setIntField(term177507, term177507.getClass(), "successResCount", 0);
        setIntField(term177507, term177507.getClass(), "playerRating", 0);
        setIntField(term177507, term177507.getClass(), "highestRating", 0);
        setIntField(term177507, term177507.getClass(), "nameplateId", 0);
        setIntField(term177507, term177507.getClass(), "frameId", 0);
        setIntField(term177507, term177507.getClass(), "characterId", 0);
        setIntField(term177507, term177507.getClass(), "trophyId", 0);
        setIntField(term177507, term177507.getClass(), "playedTutorialBit", 0);
        setIntField(term177507, term177507.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177507, term177507.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177507, term177507.getClass(), "totalRepertoireCount", 0);
        setIntField(term177507, term177507.getClass(), "totalMapNum", 0);
        setLongField(term177507, term177507.getClass(), "totalHiScore", 0L);
        setLongField(term177507, term177507.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177507, term177507.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177507, term177507.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177507, term177507.getClass(), "totalMasterHighScore", 0L);
        setField(term177507, term177507.getClass(), "eventWatchedDate", null);
        setIntField(term177507, term177507.getClass(), "friendCount", 0);
        setBooleanField(term177507, term177507.getClass(), "isMaimai", false);
        setField(term177507, term177507.getClass(), "firstGameId", null);
        setField(term177507, term177507.getClass(), "firstRomVersion", null);
        setField(term177507, term177507.getClass(), "firstDataVersion", null);
        setField(term177507, term177507.getClass(), "firstPlayDate", null);
        setField(term177507, term177507.getClass(), "lastGameId", null);
        setField(term177507, term177507.getClass(), "lastRomVersion", null);
        setField(term177507, term177507.getClass(), "lastDataVersion", null);
        setField(term177507, term177507.getClass(), "lastPlayDate", null);
        setIntField(term177507, term177507.getClass(), "lastPlaceId", 0);
        setField(term177507, term177507.getClass(), "lastPlaceName", null);
        setField(term177507, term177507.getClass(), "lastRegionId", null);
        setField(term177507, term177507.getClass(), "lastRegionName", null);
        setField(term177507, term177507.getClass(), "lastAllNetId", null);
        setField(term177507, term177507.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstPlayDate", argTypes, term177507, args);
    }

};


