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

public class ExternalUserData_getPlayedTutorialBit_703508010126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42447;

    public ExternalUserData_getPlayedTutorialBit_703508010126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42447 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        setField(term42447, term42447.getClass(), "accessCode", null);
        setField(term42447, term42447.getClass(), "userName", null);
        setField(term42447, term42447.getClass(), "lastLoginDate", null);
        setBooleanField(term42447, term42447.getClass(), "isWebJoin", false);
        setField(term42447, term42447.getClass(), "webLimitDate", null);
        setIntField(term42447, term42447.getClass(), "level", 0);
        setIntField(term42447, term42447.getClass(), "reincarnationNum", 0);
        setField(term42447, term42447.getClass(), "exp", null);
        setLongField(term42447, term42447.getClass(), "point", 0L);
        setLongField(term42447, term42447.getClass(), "totalPoint", 0L);
        setIntField(term42447, term42447.getClass(), "playCount", 0);
        setIntField(term42447, term42447.getClass(), "multiPlayCount", 0);
        setIntField(term42447, term42447.getClass(), "multiWinCount", 0);
        setIntField(term42447, term42447.getClass(), "requestResCount", 0);
        setIntField(term42447, term42447.getClass(), "acceptResCount", 0);
        setIntField(term42447, term42447.getClass(), "successResCount", 0);
        setIntField(term42447, term42447.getClass(), "playerRating", 0);
        setIntField(term42447, term42447.getClass(), "highestRating", 0);
        setIntField(term42447, term42447.getClass(), "nameplateId", 0);
        setIntField(term42447, term42447.getClass(), "frameId", 0);
        setIntField(term42447, term42447.getClass(), "characterId", 0);
        setIntField(term42447, term42447.getClass(), "trophyId", 0);
        setIntField(term42447, term42447.getClass(), "playedTutorialBit", 0);
        setIntField(term42447, term42447.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42447, term42447.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42447, term42447.getClass(), "totalRepertoireCount", 0);
        setIntField(term42447, term42447.getClass(), "totalMapNum", 0);
        setLongField(term42447, term42447.getClass(), "totalHiScore", 0L);
        setLongField(term42447, term42447.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42447, term42447.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42447, term42447.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42447, term42447.getClass(), "totalMasterHighScore", 0L);
        setField(term42447, term42447.getClass(), "eventWatchedDate", null);
        setIntField(term42447, term42447.getClass(), "friendCount", 0);
        setBooleanField(term42447, term42447.getClass(), "isMaimai", false);
        setField(term42447, term42447.getClass(), "firstGameId", null);
        setField(term42447, term42447.getClass(), "firstRomVersion", null);
        setField(term42447, term42447.getClass(), "firstDataVersion", null);
        setField(term42447, term42447.getClass(), "firstPlayDate", null);
        setField(term42447, term42447.getClass(), "lastGameId", null);
        setField(term42447, term42447.getClass(), "lastRomVersion", null);
        setField(term42447, term42447.getClass(), "lastDataVersion", null);
        setField(term42447, term42447.getClass(), "lastPlayDate", null);
        setIntField(term42447, term42447.getClass(), "lastPlaceId", 0);
        setField(term42447, term42447.getClass(), "lastPlaceName", null);
        setField(term42447, term42447.getClass(), "lastRegionId", null);
        setField(term42447, term42447.getClass(), "lastRegionName", null);
        setField(term42447, term42447.getClass(), "lastAllNetId", null);
        setField(term42447, term42447.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedTutorialBit", argTypes, term42447, args);
    }

};


