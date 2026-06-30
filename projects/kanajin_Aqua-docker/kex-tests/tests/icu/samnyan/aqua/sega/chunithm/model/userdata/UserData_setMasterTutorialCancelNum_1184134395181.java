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

public class UserData_setMasterTutorialCancelNum_1184134395181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177039;
     Object term177071;

    public UserData_setMasterTutorialCancelNum_1184134395181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177039 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term177039, term177039.getClass(), "id", 0L);
        setField(term177039, term177039.getClass(), "card", null);
        setField(term177039, term177039.getClass(), "userName", null);
        setField(term177039, term177039.getClass(), "lastLoginDate", null);
        setBooleanField(term177039, term177039.getClass(), "isWebJoin", false);
        setField(term177039, term177039.getClass(), "webLimitDate", null);
        setIntField(term177039, term177039.getClass(), "level", 0);
        setIntField(term177039, term177039.getClass(), "reincarnationNum", 0);
        setField(term177039, term177039.getClass(), "exp", null);
        setLongField(term177039, term177039.getClass(), "point", 0L);
        setLongField(term177039, term177039.getClass(), "totalPoint", 0L);
        setIntField(term177039, term177039.getClass(), "playCount", 0);
        setIntField(term177039, term177039.getClass(), "multiPlayCount", 0);
        setIntField(term177039, term177039.getClass(), "multiWinCount", 0);
        setIntField(term177039, term177039.getClass(), "requestResCount", 0);
        setIntField(term177039, term177039.getClass(), "acceptResCount", 0);
        setIntField(term177039, term177039.getClass(), "successResCount", 0);
        setIntField(term177039, term177039.getClass(), "playerRating", 0);
        setIntField(term177039, term177039.getClass(), "highestRating", 0);
        setIntField(term177039, term177039.getClass(), "nameplateId", 0);
        setIntField(term177039, term177039.getClass(), "frameId", 0);
        setIntField(term177039, term177039.getClass(), "characterId", 0);
        setIntField(term177039, term177039.getClass(), "trophyId", 0);
        setIntField(term177039, term177039.getClass(), "playedTutorialBit", 0);
        setIntField(term177039, term177039.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term177039, term177039.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term177039, term177039.getClass(), "totalRepertoireCount", 0);
        setIntField(term177039, term177039.getClass(), "totalMapNum", 0);
        setLongField(term177039, term177039.getClass(), "totalHiScore", 0L);
        setLongField(term177039, term177039.getClass(), "totalBasicHighScore", 0L);
        setLongField(term177039, term177039.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term177039, term177039.getClass(), "totalExpertHighScore", 0L);
        setLongField(term177039, term177039.getClass(), "totalMasterHighScore", 0L);
        setField(term177039, term177039.getClass(), "eventWatchedDate", null);
        setIntField(term177039, term177039.getClass(), "friendCount", 0);
        setBooleanField(term177039, term177039.getClass(), "isMaimai", false);
        setField(term177039, term177039.getClass(), "firstGameId", null);
        setField(term177039, term177039.getClass(), "firstRomVersion", null);
        setField(term177039, term177039.getClass(), "firstDataVersion", null);
        setField(term177039, term177039.getClass(), "firstPlayDate", null);
        setField(term177039, term177039.getClass(), "lastGameId", null);
        setField(term177039, term177039.getClass(), "lastRomVersion", null);
        setField(term177039, term177039.getClass(), "lastDataVersion", null);
        setField(term177039, term177039.getClass(), "lastPlayDate", null);
        setIntField(term177039, term177039.getClass(), "lastPlaceId", 0);
        setField(term177039, term177039.getClass(), "lastPlaceName", null);
        setField(term177039, term177039.getClass(), "lastRegionId", null);
        setField(term177039, term177039.getClass(), "lastRegionName", null);
        setField(term177039, term177039.getClass(), "lastAllNetId", null);
        setField(term177039, term177039.getClass(), "lastClientId", null);
        term177071 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177071;
        callMethod(klass, "setMasterTutorialCancelNum", argTypes, term177039, args);
    }

};


