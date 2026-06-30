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

public class UserData_getLastClientId_967840142155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176167;

    public UserData_getLastClientId_967840142155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176167 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176167, term176167.getClass(), "id", 0L);
        setField(term176167, term176167.getClass(), "card", null);
        setField(term176167, term176167.getClass(), "userName", null);
        setField(term176167, term176167.getClass(), "lastLoginDate", null);
        setBooleanField(term176167, term176167.getClass(), "isWebJoin", false);
        setField(term176167, term176167.getClass(), "webLimitDate", null);
        setIntField(term176167, term176167.getClass(), "level", 0);
        setIntField(term176167, term176167.getClass(), "reincarnationNum", 0);
        setField(term176167, term176167.getClass(), "exp", null);
        setLongField(term176167, term176167.getClass(), "point", 0L);
        setLongField(term176167, term176167.getClass(), "totalPoint", 0L);
        setIntField(term176167, term176167.getClass(), "playCount", 0);
        setIntField(term176167, term176167.getClass(), "multiPlayCount", 0);
        setIntField(term176167, term176167.getClass(), "multiWinCount", 0);
        setIntField(term176167, term176167.getClass(), "requestResCount", 0);
        setIntField(term176167, term176167.getClass(), "acceptResCount", 0);
        setIntField(term176167, term176167.getClass(), "successResCount", 0);
        setIntField(term176167, term176167.getClass(), "playerRating", 0);
        setIntField(term176167, term176167.getClass(), "highestRating", 0);
        setIntField(term176167, term176167.getClass(), "nameplateId", 0);
        setIntField(term176167, term176167.getClass(), "frameId", 0);
        setIntField(term176167, term176167.getClass(), "characterId", 0);
        setIntField(term176167, term176167.getClass(), "trophyId", 0);
        setIntField(term176167, term176167.getClass(), "playedTutorialBit", 0);
        setIntField(term176167, term176167.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176167, term176167.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176167, term176167.getClass(), "totalRepertoireCount", 0);
        setIntField(term176167, term176167.getClass(), "totalMapNum", 0);
        setLongField(term176167, term176167.getClass(), "totalHiScore", 0L);
        setLongField(term176167, term176167.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176167, term176167.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176167, term176167.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176167, term176167.getClass(), "totalMasterHighScore", 0L);
        setField(term176167, term176167.getClass(), "eventWatchedDate", null);
        setIntField(term176167, term176167.getClass(), "friendCount", 0);
        setBooleanField(term176167, term176167.getClass(), "isMaimai", false);
        setField(term176167, term176167.getClass(), "firstGameId", null);
        setField(term176167, term176167.getClass(), "firstRomVersion", null);
        setField(term176167, term176167.getClass(), "firstDataVersion", null);
        setField(term176167, term176167.getClass(), "firstPlayDate", null);
        setField(term176167, term176167.getClass(), "lastGameId", null);
        setField(term176167, term176167.getClass(), "lastRomVersion", null);
        setField(term176167, term176167.getClass(), "lastDataVersion", null);
        setField(term176167, term176167.getClass(), "lastPlayDate", null);
        setIntField(term176167, term176167.getClass(), "lastPlaceId", 0);
        setField(term176167, term176167.getClass(), "lastPlaceName", null);
        setField(term176167, term176167.getClass(), "lastRegionId", null);
        setField(term176167, term176167.getClass(), "lastRegionName", null);
        setField(term176167, term176167.getClass(), "lastAllNetId", null);
        setField(term176167, term176167.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term176167, args);
    }

};


