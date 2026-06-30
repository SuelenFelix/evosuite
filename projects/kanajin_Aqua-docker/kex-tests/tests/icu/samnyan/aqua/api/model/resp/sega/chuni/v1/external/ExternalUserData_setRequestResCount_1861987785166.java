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

public class ExternalUserData_setRequestResCount_1861987785166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43703;
     Object term43734;

    public ExternalUserData_setRequestResCount_1861987785166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43703 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        setField(term43703, term43703.getClass(), "accessCode", null);
        setField(term43703, term43703.getClass(), "userName", null);
        setField(term43703, term43703.getClass(), "lastLoginDate", null);
        setBooleanField(term43703, term43703.getClass(), "isWebJoin", false);
        setField(term43703, term43703.getClass(), "webLimitDate", null);
        setIntField(term43703, term43703.getClass(), "level", 0);
        setIntField(term43703, term43703.getClass(), "reincarnationNum", 0);
        setField(term43703, term43703.getClass(), "exp", null);
        setLongField(term43703, term43703.getClass(), "point", 0L);
        setLongField(term43703, term43703.getClass(), "totalPoint", 0L);
        setIntField(term43703, term43703.getClass(), "playCount", 0);
        setIntField(term43703, term43703.getClass(), "multiPlayCount", 0);
        setIntField(term43703, term43703.getClass(), "multiWinCount", 0);
        setIntField(term43703, term43703.getClass(), "requestResCount", 0);
        setIntField(term43703, term43703.getClass(), "acceptResCount", 0);
        setIntField(term43703, term43703.getClass(), "successResCount", 0);
        setIntField(term43703, term43703.getClass(), "playerRating", 0);
        setIntField(term43703, term43703.getClass(), "highestRating", 0);
        setIntField(term43703, term43703.getClass(), "nameplateId", 0);
        setIntField(term43703, term43703.getClass(), "frameId", 0);
        setIntField(term43703, term43703.getClass(), "characterId", 0);
        setIntField(term43703, term43703.getClass(), "trophyId", 0);
        setIntField(term43703, term43703.getClass(), "playedTutorialBit", 0);
        setIntField(term43703, term43703.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term43703, term43703.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term43703, term43703.getClass(), "totalRepertoireCount", 0);
        setIntField(term43703, term43703.getClass(), "totalMapNum", 0);
        setLongField(term43703, term43703.getClass(), "totalHiScore", 0L);
        setLongField(term43703, term43703.getClass(), "totalBasicHighScore", 0L);
        setLongField(term43703, term43703.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term43703, term43703.getClass(), "totalExpertHighScore", 0L);
        setLongField(term43703, term43703.getClass(), "totalMasterHighScore", 0L);
        setField(term43703, term43703.getClass(), "eventWatchedDate", null);
        setIntField(term43703, term43703.getClass(), "friendCount", 0);
        setBooleanField(term43703, term43703.getClass(), "isMaimai", false);
        setField(term43703, term43703.getClass(), "firstGameId", null);
        setField(term43703, term43703.getClass(), "firstRomVersion", null);
        setField(term43703, term43703.getClass(), "firstDataVersion", null);
        setField(term43703, term43703.getClass(), "firstPlayDate", null);
        setField(term43703, term43703.getClass(), "lastGameId", null);
        setField(term43703, term43703.getClass(), "lastRomVersion", null);
        setField(term43703, term43703.getClass(), "lastDataVersion", null);
        setField(term43703, term43703.getClass(), "lastPlayDate", null);
        setIntField(term43703, term43703.getClass(), "lastPlaceId", 0);
        setField(term43703, term43703.getClass(), "lastPlaceName", null);
        setField(term43703, term43703.getClass(), "lastRegionId", null);
        setField(term43703, term43703.getClass(), "lastRegionName", null);
        setField(term43703, term43703.getClass(), "lastAllNetId", null);
        setField(term43703, term43703.getClass(), "lastClientId", null);
        term43734 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43734;
        callMethod(klass, "setRequestResCount", argTypes, term43703, args);
    }

};


