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

public class UserData_setCard_1112657238157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176233;

    public UserData_setCard_1112657238157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176233 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176233, term176233.getClass(), "id", 0L);
        setField(term176233, term176233.getClass(), "card", null);
        setField(term176233, term176233.getClass(), "userName", null);
        setField(term176233, term176233.getClass(), "lastLoginDate", null);
        setBooleanField(term176233, term176233.getClass(), "isWebJoin", false);
        setField(term176233, term176233.getClass(), "webLimitDate", null);
        setIntField(term176233, term176233.getClass(), "level", 0);
        setIntField(term176233, term176233.getClass(), "reincarnationNum", 0);
        setField(term176233, term176233.getClass(), "exp", null);
        setLongField(term176233, term176233.getClass(), "point", 0L);
        setLongField(term176233, term176233.getClass(), "totalPoint", 0L);
        setIntField(term176233, term176233.getClass(), "playCount", 0);
        setIntField(term176233, term176233.getClass(), "multiPlayCount", 0);
        setIntField(term176233, term176233.getClass(), "multiWinCount", 0);
        setIntField(term176233, term176233.getClass(), "requestResCount", 0);
        setIntField(term176233, term176233.getClass(), "acceptResCount", 0);
        setIntField(term176233, term176233.getClass(), "successResCount", 0);
        setIntField(term176233, term176233.getClass(), "playerRating", 0);
        setIntField(term176233, term176233.getClass(), "highestRating", 0);
        setIntField(term176233, term176233.getClass(), "nameplateId", 0);
        setIntField(term176233, term176233.getClass(), "frameId", 0);
        setIntField(term176233, term176233.getClass(), "characterId", 0);
        setIntField(term176233, term176233.getClass(), "trophyId", 0);
        setIntField(term176233, term176233.getClass(), "playedTutorialBit", 0);
        setIntField(term176233, term176233.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176233, term176233.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176233, term176233.getClass(), "totalRepertoireCount", 0);
        setIntField(term176233, term176233.getClass(), "totalMapNum", 0);
        setLongField(term176233, term176233.getClass(), "totalHiScore", 0L);
        setLongField(term176233, term176233.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176233, term176233.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176233, term176233.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176233, term176233.getClass(), "totalMasterHighScore", 0L);
        setField(term176233, term176233.getClass(), "eventWatchedDate", null);
        setIntField(term176233, term176233.getClass(), "friendCount", 0);
        setBooleanField(term176233, term176233.getClass(), "isMaimai", false);
        setField(term176233, term176233.getClass(), "firstGameId", null);
        setField(term176233, term176233.getClass(), "firstRomVersion", null);
        setField(term176233, term176233.getClass(), "firstDataVersion", null);
        setField(term176233, term176233.getClass(), "firstPlayDate", null);
        setField(term176233, term176233.getClass(), "lastGameId", null);
        setField(term176233, term176233.getClass(), "lastRomVersion", null);
        setField(term176233, term176233.getClass(), "lastDataVersion", null);
        setField(term176233, term176233.getClass(), "lastPlayDate", null);
        setIntField(term176233, term176233.getClass(), "lastPlaceId", 0);
        setField(term176233, term176233.getClass(), "lastPlaceName", null);
        setField(term176233, term176233.getClass(), "lastRegionId", null);
        setField(term176233, term176233.getClass(), "lastRegionName", null);
        setField(term176233, term176233.getClass(), "lastAllNetId", null);
        setField(term176233, term176233.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCard", argTypes, term176233, args);
    }

};


