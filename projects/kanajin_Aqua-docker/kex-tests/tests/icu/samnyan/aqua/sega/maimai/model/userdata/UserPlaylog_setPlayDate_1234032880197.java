package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserPlaylog_setPlayDate_1234032880197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176649;

    public UserPlaylog_setPlayDate_1234032880197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176649 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176649, term176649.getClass(), "id", 0L);
        setField(term176649, term176649.getClass(), "user", null);
        setIntField(term176649, term176649.getClass(), "orderId", 0);
        setLongField(term176649, term176649.getClass(), "sortNumber", 0L);
        setIntField(term176649, term176649.getClass(), "placeId", 0);
        setField(term176649, term176649.getClass(), "placeName", null);
        setField(term176649, term176649.getClass(), "country", null);
        setIntField(term176649, term176649.getClass(), "regionId", 0);
        setField(term176649, term176649.getClass(), "playDate", null);
        setField(term176649, term176649.getClass(), "userPlayDate", null);
        setIntField(term176649, term176649.getClass(), "musicId", 0);
        setIntField(term176649, term176649.getClass(), "level", 0);
        setIntField(term176649, term176649.getClass(), "gameMode", 0);
        setIntField(term176649, term176649.getClass(), "rivalNum", 0);
        setIntField(term176649, term176649.getClass(), "track", 0);
        setIntField(term176649, term176649.getClass(), "eventId", 0);
        setBooleanField(term176649, term176649.getClass(), "isFreeToPlay", false);
        setIntField(term176649, term176649.getClass(), "playerRating", 0);
        setLongField(term176649, term176649.getClass(), "playedUserId1", 0L);
        setField(term176649, term176649.getClass(), "playedUserName1", null);
        setIntField(term176649, term176649.getClass(), "playedMusicLevel1", 0);
        setLongField(term176649, term176649.getClass(), "playedUserId2", 0L);
        setField(term176649, term176649.getClass(), "playedUserName2", null);
        setIntField(term176649, term176649.getClass(), "playedMusicLevel2", 0);
        setLongField(term176649, term176649.getClass(), "playedUserId3", 0L);
        setField(term176649, term176649.getClass(), "playedUserName3", null);
        setIntField(term176649, term176649.getClass(), "playedMusicLevel3", 0);
        setIntField(term176649, term176649.getClass(), "achievement", 0);
        setIntField(term176649, term176649.getClass(), "score", 0);
        setIntField(term176649, term176649.getClass(), "tapScore", 0);
        setIntField(term176649, term176649.getClass(), "holdScore", 0);
        setIntField(term176649, term176649.getClass(), "slideScore", 0);
        setIntField(term176649, term176649.getClass(), "breakScore", 0);
        setIntField(term176649, term176649.getClass(), "syncRate", 0);
        setIntField(term176649, term176649.getClass(), "vsWin", 0);
        setBooleanField(term176649, term176649.getClass(), "isAllPerfect", false);
        setIntField(term176649, term176649.getClass(), "fullCombo", 0);
        setIntField(term176649, term176649.getClass(), "maxFever", 0);
        setIntField(term176649, term176649.getClass(), "maxCombo", 0);
        setIntField(term176649, term176649.getClass(), "tapPerfect", 0);
        setIntField(term176649, term176649.getClass(), "tapGreat", 0);
        setIntField(term176649, term176649.getClass(), "tapGood", 0);
        setIntField(term176649, term176649.getClass(), "tapBad", 0);
        setIntField(term176649, term176649.getClass(), "holdPerfect", 0);
        setIntField(term176649, term176649.getClass(), "holdGreat", 0);
        setIntField(term176649, term176649.getClass(), "holdGood", 0);
        setIntField(term176649, term176649.getClass(), "holdBad", 0);
        setIntField(term176649, term176649.getClass(), "slidePerfect", 0);
        setIntField(term176649, term176649.getClass(), "slideGreat", 0);
        setIntField(term176649, term176649.getClass(), "slideGood", 0);
        setIntField(term176649, term176649.getClass(), "slideBad", 0);
        setIntField(term176649, term176649.getClass(), "breakPerfect", 0);
        setIntField(term176649, term176649.getClass(), "breakGreat", 0);
        setIntField(term176649, term176649.getClass(), "breakGood", 0);
        setIntField(term176649, term176649.getClass(), "breakBad", 0);
        setBooleanField(term176649, term176649.getClass(), "isTrackSkip", false);
        setBooleanField(term176649, term176649.getClass(), "isHighScore", false);
        setBooleanField(term176649, term176649.getClass(), "isChallengeTrack", false);
        setIntField(term176649, term176649.getClass(), "challengeLife", 0);
        setIntField(term176649, term176649.getClass(), "challengeRemain", 0);
        setIntField(term176649, term176649.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayDate", argTypes, term176649, args);
    }

};


