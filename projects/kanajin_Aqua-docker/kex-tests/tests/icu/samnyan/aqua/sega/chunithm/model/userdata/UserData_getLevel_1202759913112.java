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

public class UserData_getLevel_1202759913112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174791;

    public UserData_getLevel_1202759913112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174791 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term174791, term174791.getClass(), "id", 0L);
        setField(term174791, term174791.getClass(), "card", null);
        setField(term174791, term174791.getClass(), "userName", null);
        setField(term174791, term174791.getClass(), "lastLoginDate", null);
        setBooleanField(term174791, term174791.getClass(), "isWebJoin", false);
        setField(term174791, term174791.getClass(), "webLimitDate", null);
        setIntField(term174791, term174791.getClass(), "level", 0);
        setIntField(term174791, term174791.getClass(), "reincarnationNum", 0);
        setField(term174791, term174791.getClass(), "exp", null);
        setLongField(term174791, term174791.getClass(), "point", 0L);
        setLongField(term174791, term174791.getClass(), "totalPoint", 0L);
        setIntField(term174791, term174791.getClass(), "playCount", 0);
        setIntField(term174791, term174791.getClass(), "multiPlayCount", 0);
        setIntField(term174791, term174791.getClass(), "multiWinCount", 0);
        setIntField(term174791, term174791.getClass(), "requestResCount", 0);
        setIntField(term174791, term174791.getClass(), "acceptResCount", 0);
        setIntField(term174791, term174791.getClass(), "successResCount", 0);
        setIntField(term174791, term174791.getClass(), "playerRating", 0);
        setIntField(term174791, term174791.getClass(), "highestRating", 0);
        setIntField(term174791, term174791.getClass(), "nameplateId", 0);
        setIntField(term174791, term174791.getClass(), "frameId", 0);
        setIntField(term174791, term174791.getClass(), "characterId", 0);
        setIntField(term174791, term174791.getClass(), "trophyId", 0);
        setIntField(term174791, term174791.getClass(), "playedTutorialBit", 0);
        setIntField(term174791, term174791.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term174791, term174791.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term174791, term174791.getClass(), "totalRepertoireCount", 0);
        setIntField(term174791, term174791.getClass(), "totalMapNum", 0);
        setLongField(term174791, term174791.getClass(), "totalHiScore", 0L);
        setLongField(term174791, term174791.getClass(), "totalBasicHighScore", 0L);
        setLongField(term174791, term174791.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term174791, term174791.getClass(), "totalExpertHighScore", 0L);
        setLongField(term174791, term174791.getClass(), "totalMasterHighScore", 0L);
        setField(term174791, term174791.getClass(), "eventWatchedDate", null);
        setIntField(term174791, term174791.getClass(), "friendCount", 0);
        setBooleanField(term174791, term174791.getClass(), "isMaimai", false);
        setField(term174791, term174791.getClass(), "firstGameId", null);
        setField(term174791, term174791.getClass(), "firstRomVersion", null);
        setField(term174791, term174791.getClass(), "firstDataVersion", null);
        setField(term174791, term174791.getClass(), "firstPlayDate", null);
        setField(term174791, term174791.getClass(), "lastGameId", null);
        setField(term174791, term174791.getClass(), "lastRomVersion", null);
        setField(term174791, term174791.getClass(), "lastDataVersion", null);
        setField(term174791, term174791.getClass(), "lastPlayDate", null);
        setIntField(term174791, term174791.getClass(), "lastPlaceId", 0);
        setField(term174791, term174791.getClass(), "lastPlaceName", null);
        setField(term174791, term174791.getClass(), "lastRegionId", null);
        setField(term174791, term174791.getClass(), "lastRegionName", null);
        setField(term174791, term174791.getClass(), "lastAllNetId", null);
        setField(term174791, term174791.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term174791, args);
    }

};


