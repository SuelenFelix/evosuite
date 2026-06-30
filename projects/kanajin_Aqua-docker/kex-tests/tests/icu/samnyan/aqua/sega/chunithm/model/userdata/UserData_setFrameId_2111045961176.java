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

public class UserData_setFrameId_2111045961176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176869;
     Object term176901;

    public UserData_setFrameId_2111045961176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176869 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176869, term176869.getClass(), "id", 0L);
        setField(term176869, term176869.getClass(), "card", null);
        setField(term176869, term176869.getClass(), "userName", null);
        setField(term176869, term176869.getClass(), "lastLoginDate", null);
        setBooleanField(term176869, term176869.getClass(), "isWebJoin", false);
        setField(term176869, term176869.getClass(), "webLimitDate", null);
        setIntField(term176869, term176869.getClass(), "level", 0);
        setIntField(term176869, term176869.getClass(), "reincarnationNum", 0);
        setField(term176869, term176869.getClass(), "exp", null);
        setLongField(term176869, term176869.getClass(), "point", 0L);
        setLongField(term176869, term176869.getClass(), "totalPoint", 0L);
        setIntField(term176869, term176869.getClass(), "playCount", 0);
        setIntField(term176869, term176869.getClass(), "multiPlayCount", 0);
        setIntField(term176869, term176869.getClass(), "multiWinCount", 0);
        setIntField(term176869, term176869.getClass(), "requestResCount", 0);
        setIntField(term176869, term176869.getClass(), "acceptResCount", 0);
        setIntField(term176869, term176869.getClass(), "successResCount", 0);
        setIntField(term176869, term176869.getClass(), "playerRating", 0);
        setIntField(term176869, term176869.getClass(), "highestRating", 0);
        setIntField(term176869, term176869.getClass(), "nameplateId", 0);
        setIntField(term176869, term176869.getClass(), "frameId", 0);
        setIntField(term176869, term176869.getClass(), "characterId", 0);
        setIntField(term176869, term176869.getClass(), "trophyId", 0);
        setIntField(term176869, term176869.getClass(), "playedTutorialBit", 0);
        setIntField(term176869, term176869.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176869, term176869.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176869, term176869.getClass(), "totalRepertoireCount", 0);
        setIntField(term176869, term176869.getClass(), "totalMapNum", 0);
        setLongField(term176869, term176869.getClass(), "totalHiScore", 0L);
        setLongField(term176869, term176869.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176869, term176869.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176869, term176869.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176869, term176869.getClass(), "totalMasterHighScore", 0L);
        setField(term176869, term176869.getClass(), "eventWatchedDate", null);
        setIntField(term176869, term176869.getClass(), "friendCount", 0);
        setBooleanField(term176869, term176869.getClass(), "isMaimai", false);
        setField(term176869, term176869.getClass(), "firstGameId", null);
        setField(term176869, term176869.getClass(), "firstRomVersion", null);
        setField(term176869, term176869.getClass(), "firstDataVersion", null);
        setField(term176869, term176869.getClass(), "firstPlayDate", null);
        setField(term176869, term176869.getClass(), "lastGameId", null);
        setField(term176869, term176869.getClass(), "lastRomVersion", null);
        setField(term176869, term176869.getClass(), "lastDataVersion", null);
        setField(term176869, term176869.getClass(), "lastPlayDate", null);
        setIntField(term176869, term176869.getClass(), "lastPlaceId", 0);
        setField(term176869, term176869.getClass(), "lastPlaceName", null);
        setField(term176869, term176869.getClass(), "lastRegionId", null);
        setField(term176869, term176869.getClass(), "lastRegionName", null);
        setField(term176869, term176869.getClass(), "lastAllNetId", null);
        setField(term176869, term176869.getClass(), "lastClientId", null);
        term176901 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176901;
        callMethod(klass, "setFrameId", argTypes, term176869, args);
    }

};


