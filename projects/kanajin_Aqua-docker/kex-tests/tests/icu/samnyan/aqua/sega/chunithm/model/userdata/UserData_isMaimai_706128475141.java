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

public class UserData_isMaimai_706128475141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175719;

    public UserData_isMaimai_706128475141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175719 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term175719, term175719.getClass(), "id", 0L);
        setField(term175719, term175719.getClass(), "card", null);
        setField(term175719, term175719.getClass(), "userName", null);
        setField(term175719, term175719.getClass(), "lastLoginDate", null);
        setBooleanField(term175719, term175719.getClass(), "isWebJoin", false);
        setField(term175719, term175719.getClass(), "webLimitDate", null);
        setIntField(term175719, term175719.getClass(), "level", 0);
        setIntField(term175719, term175719.getClass(), "reincarnationNum", 0);
        setField(term175719, term175719.getClass(), "exp", null);
        setLongField(term175719, term175719.getClass(), "point", 0L);
        setLongField(term175719, term175719.getClass(), "totalPoint", 0L);
        setIntField(term175719, term175719.getClass(), "playCount", 0);
        setIntField(term175719, term175719.getClass(), "multiPlayCount", 0);
        setIntField(term175719, term175719.getClass(), "multiWinCount", 0);
        setIntField(term175719, term175719.getClass(), "requestResCount", 0);
        setIntField(term175719, term175719.getClass(), "acceptResCount", 0);
        setIntField(term175719, term175719.getClass(), "successResCount", 0);
        setIntField(term175719, term175719.getClass(), "playerRating", 0);
        setIntField(term175719, term175719.getClass(), "highestRating", 0);
        setIntField(term175719, term175719.getClass(), "nameplateId", 0);
        setIntField(term175719, term175719.getClass(), "frameId", 0);
        setIntField(term175719, term175719.getClass(), "characterId", 0);
        setIntField(term175719, term175719.getClass(), "trophyId", 0);
        setIntField(term175719, term175719.getClass(), "playedTutorialBit", 0);
        setIntField(term175719, term175719.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term175719, term175719.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term175719, term175719.getClass(), "totalRepertoireCount", 0);
        setIntField(term175719, term175719.getClass(), "totalMapNum", 0);
        setLongField(term175719, term175719.getClass(), "totalHiScore", 0L);
        setLongField(term175719, term175719.getClass(), "totalBasicHighScore", 0L);
        setLongField(term175719, term175719.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term175719, term175719.getClass(), "totalExpertHighScore", 0L);
        setLongField(term175719, term175719.getClass(), "totalMasterHighScore", 0L);
        setField(term175719, term175719.getClass(), "eventWatchedDate", null);
        setIntField(term175719, term175719.getClass(), "friendCount", 0);
        setBooleanField(term175719, term175719.getClass(), "isMaimai", false);
        setField(term175719, term175719.getClass(), "firstGameId", null);
        setField(term175719, term175719.getClass(), "firstRomVersion", null);
        setField(term175719, term175719.getClass(), "firstDataVersion", null);
        setField(term175719, term175719.getClass(), "firstPlayDate", null);
        setField(term175719, term175719.getClass(), "lastGameId", null);
        setField(term175719, term175719.getClass(), "lastRomVersion", null);
        setField(term175719, term175719.getClass(), "lastDataVersion", null);
        setField(term175719, term175719.getClass(), "lastPlayDate", null);
        setIntField(term175719, term175719.getClass(), "lastPlaceId", 0);
        setField(term175719, term175719.getClass(), "lastPlaceName", null);
        setField(term175719, term175719.getClass(), "lastRegionId", null);
        setField(term175719, term175719.getClass(), "lastRegionName", null);
        setField(term175719, term175719.getClass(), "lastAllNetId", null);
        setField(term175719, term175719.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaimai", argTypes, term175719, args);
    }

};


