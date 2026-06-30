package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ExternalUserData_setFrameId_172004224172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43901;
     Object term43932;

    public ExternalUserData_setFrameId_172004224172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43901 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term43901, term43901.getClass(), "accessCode", null);
        setField(term43901, term43901.getClass(), "userName", null);
        setField(term43901, term43901.getClass(), "lastLoginDate", null);
        setBooleanField(term43901, term43901.getClass(), "isWebJoin", false);
        setField(term43901, term43901.getClass(), "webLimitDate", null);
        setIntField(term43901, term43901.getClass(), "level", 0);
        setIntField(term43901, term43901.getClass(), "reincarnationNum", 0);
        setField(term43901, term43901.getClass(), "exp", null);
        setLongField(term43901, term43901.getClass(), "point", 0L);
        setLongField(term43901, term43901.getClass(), "totalPoint", 0L);
        setIntField(term43901, term43901.getClass(), "playCount", 0);
        setIntField(term43901, term43901.getClass(), "multiPlayCount", 0);
        setIntField(term43901, term43901.getClass(), "multiWinCount", 0);
        setIntField(term43901, term43901.getClass(), "requestResCount", 0);
        setIntField(term43901, term43901.getClass(), "acceptResCount", 0);
        setIntField(term43901, term43901.getClass(), "successResCount", 0);
        setIntField(term43901, term43901.getClass(), "playerRating", 0);
        setIntField(term43901, term43901.getClass(), "highestRating", 0);
        setIntField(term43901, term43901.getClass(), "nameplateId", 0);
        setIntField(term43901, term43901.getClass(), "frameId", 0);
        setIntField(term43901, term43901.getClass(), "characterId", 0);
        setIntField(term43901, term43901.getClass(), "trophyId", 0);
        setIntField(term43901, term43901.getClass(), "playedTutorialBit", 0);
        setIntField(term43901, term43901.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43901, term43901.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43901, term43901.getClass(), "totalRepertoireCount", 0);
        setIntField(term43901, term43901.getClass(), "totalMapNum", 0);
        setLongField(term43901, term43901.getClass(), "totalHiScore", 0L);
        setLongField(term43901, term43901.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43901, term43901.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43901, term43901.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43901, term43901.getClass(), "totalMasterHighScore", 0L);
        setField(term43901, term43901.getClass(), "eventWatchedDate", null);
        setIntField(term43901, term43901.getClass(), "friendCount", 0);
        setBooleanField(term43901, term43901.getClass(), "isMaimai", false);
        setField(term43901, term43901.getClass(), "firstGameId", null);
        setField(term43901, term43901.getClass(), "firstRomVersion", null);
        setField(term43901, term43901.getClass(), "firstDataVersion", null);
        setField(term43901, term43901.getClass(), "firstPlayDate", null);
        setField(term43901, term43901.getClass(), "lastGameId", null);
        setField(term43901, term43901.getClass(), "lastRomVersion", null);
        setField(term43901, term43901.getClass(), "lastDataVersion", null);
        setField(term43901, term43901.getClass(), "lastPlayDate", null);
        setIntField(term43901, term43901.getClass(), "lastPlaceId", 0);
        setField(term43901, term43901.getClass(), "lastPlaceName", null);
        setField(term43901, term43901.getClass(), "lastRegionId", null);
        setField(term43901, term43901.getClass(), "lastRegionName", null);
        setField(term43901, term43901.getClass(), "lastAllNetId", null);
        setField(term43901, term43901.getClass(), "lastClientId", null);
        term43932 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43932;
        callMethod(klass, "setFrameId", argTypes, term43901, args);
    }

};


