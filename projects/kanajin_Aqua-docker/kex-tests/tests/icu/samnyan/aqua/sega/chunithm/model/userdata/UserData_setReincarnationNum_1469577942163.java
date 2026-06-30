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

public class UserData_setReincarnationNum_1469577942163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176429;
     Object term176461;

    public UserData_setReincarnationNum_1469577942163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176429 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176429, term176429.getClass(), "id", 0L);
        setField(term176429, term176429.getClass(), "card", null);
        setField(term176429, term176429.getClass(), "userName", null);
        setField(term176429, term176429.getClass(), "lastLoginDate", null);
        setBooleanField(term176429, term176429.getClass(), "isWebJoin", false);
        setField(term176429, term176429.getClass(), "webLimitDate", null);
        setIntField(term176429, term176429.getClass(), "level", 0);
        setIntField(term176429, term176429.getClass(), "reincarnationNum", 0);
        setField(term176429, term176429.getClass(), "exp", null);
        setLongField(term176429, term176429.getClass(), "point", 0L);
        setLongField(term176429, term176429.getClass(), "totalPoint", 0L);
        setIntField(term176429, term176429.getClass(), "playCount", 0);
        setIntField(term176429, term176429.getClass(), "multiPlayCount", 0);
        setIntField(term176429, term176429.getClass(), "multiWinCount", 0);
        setIntField(term176429, term176429.getClass(), "requestResCount", 0);
        setIntField(term176429, term176429.getClass(), "acceptResCount", 0);
        setIntField(term176429, term176429.getClass(), "successResCount", 0);
        setIntField(term176429, term176429.getClass(), "playerRating", 0);
        setIntField(term176429, term176429.getClass(), "highestRating", 0);
        setIntField(term176429, term176429.getClass(), "nameplateId", 0);
        setIntField(term176429, term176429.getClass(), "frameId", 0);
        setIntField(term176429, term176429.getClass(), "characterId", 0);
        setIntField(term176429, term176429.getClass(), "trophyId", 0);
        setIntField(term176429, term176429.getClass(), "playedTutorialBit", 0);
        setIntField(term176429, term176429.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176429, term176429.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176429, term176429.getClass(), "totalRepertoireCount", 0);
        setIntField(term176429, term176429.getClass(), "totalMapNum", 0);
        setLongField(term176429, term176429.getClass(), "totalHiScore", 0L);
        setLongField(term176429, term176429.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176429, term176429.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176429, term176429.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176429, term176429.getClass(), "totalMasterHighScore", 0L);
        setField(term176429, term176429.getClass(), "eventWatchedDate", null);
        setIntField(term176429, term176429.getClass(), "friendCount", 0);
        setBooleanField(term176429, term176429.getClass(), "isMaimai", false);
        setField(term176429, term176429.getClass(), "firstGameId", null);
        setField(term176429, term176429.getClass(), "firstRomVersion", null);
        setField(term176429, term176429.getClass(), "firstDataVersion", null);
        setField(term176429, term176429.getClass(), "firstPlayDate", null);
        setField(term176429, term176429.getClass(), "lastGameId", null);
        setField(term176429, term176429.getClass(), "lastRomVersion", null);
        setField(term176429, term176429.getClass(), "lastDataVersion", null);
        setField(term176429, term176429.getClass(), "lastPlayDate", null);
        setIntField(term176429, term176429.getClass(), "lastPlaceId", 0);
        setField(term176429, term176429.getClass(), "lastPlaceName", null);
        setField(term176429, term176429.getClass(), "lastRegionId", null);
        setField(term176429, term176429.getClass(), "lastRegionName", null);
        setField(term176429, term176429.getClass(), "lastAllNetId", null);
        setField(term176429, term176429.getClass(), "lastClientId", null);
        term176461 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176461;
        callMethod(klass, "setReincarnationNum", argTypes, term176429, args);
    }

};


