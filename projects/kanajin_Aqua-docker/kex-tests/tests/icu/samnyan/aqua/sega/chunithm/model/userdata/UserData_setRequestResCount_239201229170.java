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
import java.lang.Integer;

public class UserData_setRequestResCount_239201229170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176665;
     Object term176697;

    public UserData_setRequestResCount_239201229170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176665 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176665, term176665.getClass(), "id", 0L);
        setField(term176665, term176665.getClass(), "card", null);
        setField(term176665, term176665.getClass(), "userName", null);
        setField(term176665, term176665.getClass(), "lastLoginDate", null);
        setBooleanField(term176665, term176665.getClass(), "isWebJoin", false);
        setField(term176665, term176665.getClass(), "webLimitDate", null);
        setIntField(term176665, term176665.getClass(), "level", 0);
        setIntField(term176665, term176665.getClass(), "reincarnationNum", 0);
        setField(term176665, term176665.getClass(), "exp", null);
        setLongField(term176665, term176665.getClass(), "point", 0L);
        setLongField(term176665, term176665.getClass(), "totalPoint", 0L);
        setIntField(term176665, term176665.getClass(), "playCount", 0);
        setIntField(term176665, term176665.getClass(), "multiPlayCount", 0);
        setIntField(term176665, term176665.getClass(), "multiWinCount", 0);
        setIntField(term176665, term176665.getClass(), "requestResCount", 0);
        setIntField(term176665, term176665.getClass(), "acceptResCount", 0);
        setIntField(term176665, term176665.getClass(), "successResCount", 0);
        setIntField(term176665, term176665.getClass(), "playerRating", 0);
        setIntField(term176665, term176665.getClass(), "highestRating", 0);
        setIntField(term176665, term176665.getClass(), "nameplateId", 0);
        setIntField(term176665, term176665.getClass(), "frameId", 0);
        setIntField(term176665, term176665.getClass(), "characterId", 0);
        setIntField(term176665, term176665.getClass(), "trophyId", 0);
        setIntField(term176665, term176665.getClass(), "playedTutorialBit", 0);
        setIntField(term176665, term176665.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176665, term176665.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176665, term176665.getClass(), "totalRepertoireCount", 0);
        setIntField(term176665, term176665.getClass(), "totalMapNum", 0);
        setLongField(term176665, term176665.getClass(), "totalHiScore", 0L);
        setLongField(term176665, term176665.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176665, term176665.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176665, term176665.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176665, term176665.getClass(), "totalMasterHighScore", 0L);
        setField(term176665, term176665.getClass(), "eventWatchedDate", null);
        setIntField(term176665, term176665.getClass(), "friendCount", 0);
        setBooleanField(term176665, term176665.getClass(), "isMaimai", false);
        setField(term176665, term176665.getClass(), "firstGameId", null);
        setField(term176665, term176665.getClass(), "firstRomVersion", null);
        setField(term176665, term176665.getClass(), "firstDataVersion", null);
        setField(term176665, term176665.getClass(), "firstPlayDate", null);
        setField(term176665, term176665.getClass(), "lastGameId", null);
        setField(term176665, term176665.getClass(), "lastRomVersion", null);
        setField(term176665, term176665.getClass(), "lastDataVersion", null);
        setField(term176665, term176665.getClass(), "lastPlayDate", null);
        setIntField(term176665, term176665.getClass(), "lastPlaceId", 0);
        setField(term176665, term176665.getClass(), "lastPlaceName", null);
        setField(term176665, term176665.getClass(), "lastRegionId", null);
        setField(term176665, term176665.getClass(), "lastRegionName", null);
        setField(term176665, term176665.getClass(), "lastAllNetId", null);
        setField(term176665, term176665.getClass(), "lastClientId", null);
        term176697 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176697;
        callMethod(klass, "setRequestResCount", argTypes, term176665, args);
    }

};


