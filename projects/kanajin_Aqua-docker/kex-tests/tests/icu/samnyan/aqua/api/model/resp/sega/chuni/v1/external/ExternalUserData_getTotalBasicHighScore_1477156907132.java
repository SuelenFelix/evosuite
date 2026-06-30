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

public class ExternalUserData_getTotalBasicHighScore_1477156907132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42633;

    public ExternalUserData_getTotalBasicHighScore_1477156907132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42633 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term42633, term42633.getClass(), "accessCode", null);
        setField(term42633, term42633.getClass(), "userName", null);
        setField(term42633, term42633.getClass(), "lastLoginDate", null);
        setBooleanField(term42633, term42633.getClass(), "isWebJoin", false);
        setField(term42633, term42633.getClass(), "webLimitDate", null);
        setIntField(term42633, term42633.getClass(), "level", 0);
        setIntField(term42633, term42633.getClass(), "reincarnationNum", 0);
        setField(term42633, term42633.getClass(), "exp", null);
        setLongField(term42633, term42633.getClass(), "point", 0L);
        setLongField(term42633, term42633.getClass(), "totalPoint", 0L);
        setIntField(term42633, term42633.getClass(), "playCount", 0);
        setIntField(term42633, term42633.getClass(), "multiPlayCount", 0);
        setIntField(term42633, term42633.getClass(), "multiWinCount", 0);
        setIntField(term42633, term42633.getClass(), "requestResCount", 0);
        setIntField(term42633, term42633.getClass(), "acceptResCount", 0);
        setIntField(term42633, term42633.getClass(), "successResCount", 0);
        setIntField(term42633, term42633.getClass(), "playerRating", 0);
        setIntField(term42633, term42633.getClass(), "highestRating", 0);
        setIntField(term42633, term42633.getClass(), "nameplateId", 0);
        setIntField(term42633, term42633.getClass(), "frameId", 0);
        setIntField(term42633, term42633.getClass(), "characterId", 0);
        setIntField(term42633, term42633.getClass(), "trophyId", 0);
        setIntField(term42633, term42633.getClass(), "playedTutorialBit", 0);
        setIntField(term42633, term42633.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term42633, term42633.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term42633, term42633.getClass(), "totalRepertoireCount", 0);
        setIntField(term42633, term42633.getClass(), "totalMapNum", 0);
        setLongField(term42633, term42633.getClass(), "totalHiScore", 0L);
        setLongField(term42633, term42633.getClass(), "totalBasicHighScore", 0L);
        setLongField(term42633, term42633.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term42633, term42633.getClass(), "totalExpertHighScore", 0L);
        setLongField(term42633, term42633.getClass(), "totalMasterHighScore", 0L);
        setField(term42633, term42633.getClass(), "eventWatchedDate", null);
        setIntField(term42633, term42633.getClass(), "friendCount", 0);
        setBooleanField(term42633, term42633.getClass(), "isMaimai", false);
        setField(term42633, term42633.getClass(), "firstGameId", null);
        setField(term42633, term42633.getClass(), "firstRomVersion", null);
        setField(term42633, term42633.getClass(), "firstDataVersion", null);
        setField(term42633, term42633.getClass(), "firstPlayDate", null);
        setField(term42633, term42633.getClass(), "lastGameId", null);
        setField(term42633, term42633.getClass(), "lastRomVersion", null);
        setField(term42633, term42633.getClass(), "lastDataVersion", null);
        setField(term42633, term42633.getClass(), "lastPlayDate", null);
        setIntField(term42633, term42633.getClass(), "lastPlaceId", 0);
        setField(term42633, term42633.getClass(), "lastPlaceName", null);
        setField(term42633, term42633.getClass(), "lastRegionId", null);
        setField(term42633, term42633.getClass(), "lastRegionName", null);
        setField(term42633, term42633.getClass(), "lastAllNetId", null);
        setField(term42633, term42633.getClass(), "lastClientId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicHighScore", argTypes, term42633, args);
    }

};


