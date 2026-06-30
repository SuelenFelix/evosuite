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

public class ExternalUserData_setReincarnationNum_631611072159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43474;
     Object term43505;

    public ExternalUserData_setReincarnationNum_631611072159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43474 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43474, term43474.getClass(), "accessCode", null);
        setField(term43474, term43474.getClass(), "userName", null);
        setField(term43474, term43474.getClass(), "lastLoginDate", null);
        setBooleanField(term43474, term43474.getClass(), "isWebJoin", false);
        setField(term43474, term43474.getClass(), "webLimitDate", null);
        setIntField(term43474, term43474.getClass(), "level", 0);
        setIntField(term43474, term43474.getClass(), "reincarnationNum", 0);
        setField(term43474, term43474.getClass(), "exp", null);
        setLongField(term43474, term43474.getClass(), "point", 0L);
        setLongField(term43474, term43474.getClass(), "totalPoint", 0L);
        setIntField(term43474, term43474.getClass(), "playCount", 0);
        setIntField(term43474, term43474.getClass(), "multiPlayCount", 0);
        setIntField(term43474, term43474.getClass(), "multiWinCount", 0);
        setIntField(term43474, term43474.getClass(), "requestResCount", 0);
        setIntField(term43474, term43474.getClass(), "acceptResCount", 0);
        setIntField(term43474, term43474.getClass(), "successResCount", 0);
        setIntField(term43474, term43474.getClass(), "playerRating", 0);
        setIntField(term43474, term43474.getClass(), "highestRating", 0);
        setIntField(term43474, term43474.getClass(), "nameplateId", 0);
        setIntField(term43474, term43474.getClass(), "frameId", 0);
        setIntField(term43474, term43474.getClass(), "characterId", 0);
        setIntField(term43474, term43474.getClass(), "trophyId", 0);
        setIntField(term43474, term43474.getClass(), "playedTutorialBit", 0);
        setIntField(term43474, term43474.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43474, term43474.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43474, term43474.getClass(), "totalRepertoireCount", 0);
        setIntField(term43474, term43474.getClass(), "totalMapNum", 0);
        setLongField(term43474, term43474.getClass(), "totalHiScore", 0L);
        setLongField(term43474, term43474.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43474, term43474.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43474, term43474.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43474, term43474.getClass(), "totalMasterHighScore", 0L);
        setField(term43474, term43474.getClass(), "eventWatchedDate", null);
        setIntField(term43474, term43474.getClass(), "friendCount", 0);
        setBooleanField(term43474, term43474.getClass(), "isMaimai", false);
        setField(term43474, term43474.getClass(), "firstGameId", null);
        setField(term43474, term43474.getClass(), "firstRomVersion", null);
        setField(term43474, term43474.getClass(), "firstDataVersion", null);
        setField(term43474, term43474.getClass(), "firstPlayDate", null);
        setField(term43474, term43474.getClass(), "lastGameId", null);
        setField(term43474, term43474.getClass(), "lastRomVersion", null);
        setField(term43474, term43474.getClass(), "lastDataVersion", null);
        setField(term43474, term43474.getClass(), "lastPlayDate", null);
        setIntField(term43474, term43474.getClass(), "lastPlaceId", 0);
        setField(term43474, term43474.getClass(), "lastPlaceName", null);
        setField(term43474, term43474.getClass(), "lastRegionId", null);
        setField(term43474, term43474.getClass(), "lastRegionName", null);
        setField(term43474, term43474.getClass(), "lastAllNetId", null);
        setField(term43474, term43474.getClass(), "lastClientId", null);
        term43505 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43505;
        callMethod(klass, "setReincarnationNum", argTypes, term43474, args);
    }

};


