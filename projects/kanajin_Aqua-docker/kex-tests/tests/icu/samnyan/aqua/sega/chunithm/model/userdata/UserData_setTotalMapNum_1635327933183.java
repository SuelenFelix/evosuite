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

public class UserData_setTotalMapNum_1635327933183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177107;
     Object term177139;

    public UserData_setTotalMapNum_1635327933183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177107 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177107, term177107.getClass(), "id", 0L);
        setField(term177107, term177107.getClass(), "card", null);
        setField(term177107, term177107.getClass(), "userName", null);
        setField(term177107, term177107.getClass(), "lastLoginDate", null);
        setBooleanField(term177107, term177107.getClass(), "isWebJoin", false);
        setField(term177107, term177107.getClass(), "webLimitDate", null);
        setIntField(term177107, term177107.getClass(), "level", 0);
        setIntField(term177107, term177107.getClass(), "reincarnationNum", 0);
        setField(term177107, term177107.getClass(), "exp", null);
        setLongField(term177107, term177107.getClass(), "point", 0L);
        setLongField(term177107, term177107.getClass(), "totalPoint", 0L);
        setIntField(term177107, term177107.getClass(), "playCount", 0);
        setIntField(term177107, term177107.getClass(), "multiPlayCount", 0);
        setIntField(term177107, term177107.getClass(), "multiWinCount", 0);
        setIntField(term177107, term177107.getClass(), "requestResCount", 0);
        setIntField(term177107, term177107.getClass(), "acceptResCount", 0);
        setIntField(term177107, term177107.getClass(), "successResCount", 0);
        setIntField(term177107, term177107.getClass(), "playerRating", 0);
        setIntField(term177107, term177107.getClass(), "highestRating", 0);
        setIntField(term177107, term177107.getClass(), "nameplateId", 0);
        setIntField(term177107, term177107.getClass(), "frameId", 0);
        setIntField(term177107, term177107.getClass(), "characterId", 0);
        setIntField(term177107, term177107.getClass(), "trophyId", 0);
        setIntField(term177107, term177107.getClass(), "playedTutorialBit", 0);
        setIntField(term177107, term177107.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177107, term177107.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177107, term177107.getClass(), "totalRepertoireCount", 0);
        setIntField(term177107, term177107.getClass(), "totalMapNum", 0);
        setLongField(term177107, term177107.getClass(), "totalHiScore", 0L);
        setLongField(term177107, term177107.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177107, term177107.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177107, term177107.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177107, term177107.getClass(), "totalMasterHighScore", 0L);
        setField(term177107, term177107.getClass(), "eventWatchedDate", null);
        setIntField(term177107, term177107.getClass(), "friendCount", 0);
        setBooleanField(term177107, term177107.getClass(), "isMaimai", false);
        setField(term177107, term177107.getClass(), "firstGameId", null);
        setField(term177107, term177107.getClass(), "firstRomVersion", null);
        setField(term177107, term177107.getClass(), "firstDataVersion", null);
        setField(term177107, term177107.getClass(), "firstPlayDate", null);
        setField(term177107, term177107.getClass(), "lastGameId", null);
        setField(term177107, term177107.getClass(), "lastRomVersion", null);
        setField(term177107, term177107.getClass(), "lastDataVersion", null);
        setField(term177107, term177107.getClass(), "lastPlayDate", null);
        setIntField(term177107, term177107.getClass(), "lastPlaceId", 0);
        setField(term177107, term177107.getClass(), "lastPlaceName", null);
        setField(term177107, term177107.getClass(), "lastRegionId", null);
        setField(term177107, term177107.getClass(), "lastRegionName", null);
        setField(term177107, term177107.getClass(), "lastAllNetId", null);
        setField(term177107, term177107.getClass(), "lastClientId", null);
        term177139 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177139;
        callMethod(klass, "setTotalMapNum", argTypes, term177107, args);
    }

};


