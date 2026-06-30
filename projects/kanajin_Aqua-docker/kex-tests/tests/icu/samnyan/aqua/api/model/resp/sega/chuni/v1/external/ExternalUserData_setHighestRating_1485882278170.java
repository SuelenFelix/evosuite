package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ExternalUserData_setHighestRating_1485882278170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43835;
     Object term43866;

    public ExternalUserData_setHighestRating_1485882278170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43835 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43835, term43835.getClass(), "accessCode", null);
        setField(term43835, term43835.getClass(), "userName", null);
        setField(term43835, term43835.getClass(), "lastLoginDate", null);
        setBooleanField(term43835, term43835.getClass(), "isWebJoin", false);
        setField(term43835, term43835.getClass(), "webLimitDate", null);
        setIntField(term43835, term43835.getClass(), "level", 0);
        setIntField(term43835, term43835.getClass(), "reincarnationNum", 0);
        setField(term43835, term43835.getClass(), "exp", null);
        setLongField(term43835, term43835.getClass(), "point", 0L);
        setLongField(term43835, term43835.getClass(), "totalPoint", 0L);
        setIntField(term43835, term43835.getClass(), "playCount", 0);
        setIntField(term43835, term43835.getClass(), "multiPlayCount", 0);
        setIntField(term43835, term43835.getClass(), "multiWinCount", 0);
        setIntField(term43835, term43835.getClass(), "requestResCount", 0);
        setIntField(term43835, term43835.getClass(), "acceptResCount", 0);
        setIntField(term43835, term43835.getClass(), "successResCount", 0);
        setIntField(term43835, term43835.getClass(), "playerRating", 0);
        setIntField(term43835, term43835.getClass(), "highestRating", 0);
        setIntField(term43835, term43835.getClass(), "nameplateId", 0);
        setIntField(term43835, term43835.getClass(), "frameId", 0);
        setIntField(term43835, term43835.getClass(), "characterId", 0);
        setIntField(term43835, term43835.getClass(), "trophyId", 0);
        setIntField(term43835, term43835.getClass(), "playedTutorialBit", 0);
        setIntField(term43835, term43835.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43835, term43835.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43835, term43835.getClass(), "totalRepertoireCount", 0);
        setIntField(term43835, term43835.getClass(), "totalMapNum", 0);
        setLongField(term43835, term43835.getClass(), "totalHiScore", 0L);
        setLongField(term43835, term43835.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43835, term43835.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43835, term43835.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43835, term43835.getClass(), "totalMasterHighScore", 0L);
        setField(term43835, term43835.getClass(), "eventWatchedDate", null);
        setIntField(term43835, term43835.getClass(), "friendCount", 0);
        setBooleanField(term43835, term43835.getClass(), "isMaimai", false);
        setField(term43835, term43835.getClass(), "firstGameId", null);
        setField(term43835, term43835.getClass(), "firstRomVersion", null);
        setField(term43835, term43835.getClass(), "firstDataVersion", null);
        setField(term43835, term43835.getClass(), "firstPlayDate", null);
        setField(term43835, term43835.getClass(), "lastGameId", null);
        setField(term43835, term43835.getClass(), "lastRomVersion", null);
        setField(term43835, term43835.getClass(), "lastDataVersion", null);
        setField(term43835, term43835.getClass(), "lastPlayDate", null);
        setIntField(term43835, term43835.getClass(), "lastPlaceId", 0);
        setField(term43835, term43835.getClass(), "lastPlaceName", null);
        setField(term43835, term43835.getClass(), "lastRegionId", null);
        setField(term43835, term43835.getClass(), "lastRegionName", null);
        setField(term43835, term43835.getClass(), "lastAllNetId", null);
        setField(term43835, term43835.getClass(), "lastClientId", null);
        term43866 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43866;
        callMethod(klass, "setHighestRating", argTypes, term43835, args);
    }

};


