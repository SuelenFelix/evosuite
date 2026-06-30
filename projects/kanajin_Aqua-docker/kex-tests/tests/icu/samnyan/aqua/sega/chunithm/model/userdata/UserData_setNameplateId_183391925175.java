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

public class UserData_setNameplateId_183391925175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176835;
     Object term176867;

    public UserData_setNameplateId_183391925175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176835 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term176835, term176835.getClass(), "id", 0L);
        setField(term176835, term176835.getClass(), "card", null);
        setField(term176835, term176835.getClass(), "userName", null);
        setField(term176835, term176835.getClass(), "lastLoginDate", null);
        setBooleanField(term176835, term176835.getClass(), "isWebJoin", false);
        setField(term176835, term176835.getClass(), "webLimitDate", null);
        setIntField(term176835, term176835.getClass(), "level", 0);
        setIntField(term176835, term176835.getClass(), "reincarnationNum", 0);
        setField(term176835, term176835.getClass(), "exp", null);
        setLongField(term176835, term176835.getClass(), "point", 0L);
        setLongField(term176835, term176835.getClass(), "totalPoint", 0L);
        setIntField(term176835, term176835.getClass(), "playCount", 0);
        setIntField(term176835, term176835.getClass(), "multiPlayCount", 0);
        setIntField(term176835, term176835.getClass(), "multiWinCount", 0);
        setIntField(term176835, term176835.getClass(), "requestResCount", 0);
        setIntField(term176835, term176835.getClass(), "acceptResCount", 0);
        setIntField(term176835, term176835.getClass(), "successResCount", 0);
        setIntField(term176835, term176835.getClass(), "playerRating", 0);
        setIntField(term176835, term176835.getClass(), "highestRating", 0);
        setIntField(term176835, term176835.getClass(), "nameplateId", 0);
        setIntField(term176835, term176835.getClass(), "frameId", 0);
        setIntField(term176835, term176835.getClass(), "characterId", 0);
        setIntField(term176835, term176835.getClass(), "trophyId", 0);
        setIntField(term176835, term176835.getClass(), "playedTutorialBit", 0);
        setIntField(term176835, term176835.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term176835, term176835.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term176835, term176835.getClass(), "totalRepertoireCount", 0);
        setIntField(term176835, term176835.getClass(), "totalMapNum", 0);
        setLongField(term176835, term176835.getClass(), "totalHiScore", 0L);
        setLongField(term176835, term176835.getClass(), "totalBasicHighScore", 0L);
        setLongField(term176835, term176835.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term176835, term176835.getClass(), "totalExpertHighScore", 0L);
        setLongField(term176835, term176835.getClass(), "totalMasterHighScore", 0L);
        setField(term176835, term176835.getClass(), "eventWatchedDate", null);
        setIntField(term176835, term176835.getClass(), "friendCount", 0);
        setBooleanField(term176835, term176835.getClass(), "isMaimai", false);
        setField(term176835, term176835.getClass(), "firstGameId", null);
        setField(term176835, term176835.getClass(), "firstRomVersion", null);
        setField(term176835, term176835.getClass(), "firstDataVersion", null);
        setField(term176835, term176835.getClass(), "firstPlayDate", null);
        setField(term176835, term176835.getClass(), "lastGameId", null);
        setField(term176835, term176835.getClass(), "lastRomVersion", null);
        setField(term176835, term176835.getClass(), "lastDataVersion", null);
        setField(term176835, term176835.getClass(), "lastPlayDate", null);
        setIntField(term176835, term176835.getClass(), "lastPlaceId", 0);
        setField(term176835, term176835.getClass(), "lastPlaceName", null);
        setField(term176835, term176835.getClass(), "lastRegionId", null);
        setField(term176835, term176835.getClass(), "lastRegionName", null);
        setField(term176835, term176835.getClass(), "lastAllNetId", null);
        setField(term176835, term176835.getClass(), "lastClientId", null);
        term176867 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176867;
        callMethod(klass, "setNameplateId", argTypes, term176835, args);
    }

};


