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

public class ExternalUserData_setExp_762028207160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43507;

    public ExternalUserData_setExp_762028207160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43507 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43507, term43507.getClass(), "accessCode", null);
        setField(term43507, term43507.getClass(), "userName", null);
        setField(term43507, term43507.getClass(), "lastLoginDate", null);
        setBooleanField(term43507, term43507.getClass(), "isWebJoin", false);
        setField(term43507, term43507.getClass(), "webLimitDate", null);
        setIntField(term43507, term43507.getClass(), "level", 0);
        setIntField(term43507, term43507.getClass(), "reincarnationNum", 0);
        setField(term43507, term43507.getClass(), "exp", null);
        setLongField(term43507, term43507.getClass(), "point", 0L);
        setLongField(term43507, term43507.getClass(), "totalPoint", 0L);
        setIntField(term43507, term43507.getClass(), "playCount", 0);
        setIntField(term43507, term43507.getClass(), "multiPlayCount", 0);
        setIntField(term43507, term43507.getClass(), "multiWinCount", 0);
        setIntField(term43507, term43507.getClass(), "requestResCount", 0);
        setIntField(term43507, term43507.getClass(), "acceptResCount", 0);
        setIntField(term43507, term43507.getClass(), "successResCount", 0);
        setIntField(term43507, term43507.getClass(), "playerRating", 0);
        setIntField(term43507, term43507.getClass(), "highestRating", 0);
        setIntField(term43507, term43507.getClass(), "nameplateId", 0);
        setIntField(term43507, term43507.getClass(), "frameId", 0);
        setIntField(term43507, term43507.getClass(), "characterId", 0);
        setIntField(term43507, term43507.getClass(), "trophyId", 0);
        setIntField(term43507, term43507.getClass(), "playedTutorialBit", 0);
        setIntField(term43507, term43507.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43507, term43507.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43507, term43507.getClass(), "totalRepertoireCount", 0);
        setIntField(term43507, term43507.getClass(), "totalMapNum", 0);
        setLongField(term43507, term43507.getClass(), "totalHiScore", 0L);
        setLongField(term43507, term43507.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43507, term43507.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43507, term43507.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43507, term43507.getClass(), "totalMasterHighScore", 0L);
        setField(term43507, term43507.getClass(), "eventWatchedDate", null);
        setIntField(term43507, term43507.getClass(), "friendCount", 0);
        setBooleanField(term43507, term43507.getClass(), "isMaimai", false);
        setField(term43507, term43507.getClass(), "firstGameId", null);
        setField(term43507, term43507.getClass(), "firstRomVersion", null);
        setField(term43507, term43507.getClass(), "firstDataVersion", null);
        setField(term43507, term43507.getClass(), "firstPlayDate", null);
        setField(term43507, term43507.getClass(), "lastGameId", null);
        setField(term43507, term43507.getClass(), "lastRomVersion", null);
        setField(term43507, term43507.getClass(), "lastDataVersion", null);
        setField(term43507, term43507.getClass(), "lastPlayDate", null);
        setIntField(term43507, term43507.getClass(), "lastPlaceId", 0);
        setField(term43507, term43507.getClass(), "lastPlaceName", null);
        setField(term43507, term43507.getClass(), "lastRegionId", null);
        setField(term43507, term43507.getClass(), "lastRegionName", null);
        setField(term43507, term43507.getClass(), "lastAllNetId", null);
        setField(term43507, term43507.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExp", argTypes, term43507, args);
    }

};


