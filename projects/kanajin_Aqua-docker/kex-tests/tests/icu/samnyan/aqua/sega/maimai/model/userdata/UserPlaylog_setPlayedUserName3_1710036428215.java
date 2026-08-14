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

public class UserPlaylog_setPlayedUserName3_1710036428215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177649;

    public UserPlaylog_setPlayedUserName3_1710036428215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177649 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177649, term177649.getClass(), "id", 0L);
        setField(term177649, term177649.getClass(), "user", null);
        setIntField(term177649, term177649.getClass(), "orderId", 0);
        setLongField(term177649, term177649.getClass(), "sortNumber", 0L);
        setIntField(term177649, term177649.getClass(), "placeId", 0);
        setField(term177649, term177649.getClass(), "placeName", null);
        setField(term177649, term177649.getClass(), "country", null);
        setIntField(term177649, term177649.getClass(), "regionId", 0);
        setField(term177649, term177649.getClass(), "playDate", null);
        setField(term177649, term177649.getClass(), "userPlayDate", null);
        setIntField(term177649, term177649.getClass(), "musicId", 0);
        setIntField(term177649, term177649.getClass(), "level", 0);
        setIntField(term177649, term177649.getClass(), "gameMode", 0);
        setIntField(term177649, term177649.getClass(), "rivalNum", 0);
        setIntField(term177649, term177649.getClass(), "track", 0);
        setIntField(term177649, term177649.getClass(), "eventId", 0);
        setBooleanField(term177649, term177649.getClass(), "isFreeToPlay", false);
        setIntField(term177649, term177649.getClass(), "playerRating", 0);
        setLongField(term177649, term177649.getClass(), "playedUserId1", 0L);
        setField(term177649, term177649.getClass(), "playedUserName1", null);
        setIntField(term177649, term177649.getClass(), "playedMusicLevel1", 0);
        setLongField(term177649, term177649.getClass(), "playedUserId2", 0L);
        setField(term177649, term177649.getClass(), "playedUserName2", null);
        setIntField(term177649, term177649.getClass(), "playedMusicLevel2", 0);
        setLongField(term177649, term177649.getClass(), "playedUserId3", 0L);
        setField(term177649, term177649.getClass(), "playedUserName3", null);
        setIntField(term177649, term177649.getClass(), "playedMusicLevel3", 0);
        setIntField(term177649, term177649.getClass(), "achievement", 0);
        setIntField(term177649, term177649.getClass(), "score", 0);
        setIntField(term177649, term177649.getClass(), "tapScore", 0);
        setIntField(term177649, term177649.getClass(), "holdScore", 0);
        setIntField(term177649, term177649.getClass(), "slideScore", 0);
        setIntField(term177649, term177649.getClass(), "breakScore", 0);
        setIntField(term177649, term177649.getClass(), "syncRate", 0);
        setIntField(term177649, term177649.getClass(), "vsWin", 0);
        setBooleanField(term177649, term177649.getClass(), "isAllPerfect", false);
        setIntField(term177649, term177649.getClass(), "fullCombo", 0);
        setIntField(term177649, term177649.getClass(), "maxFever", 0);
        setIntField(term177649, term177649.getClass(), "maxCombo", 0);
        setIntField(term177649, term177649.getClass(), "tapPerfect", 0);
        setIntField(term177649, term177649.getClass(), "tapGreat", 0);
        setIntField(term177649, term177649.getClass(), "tapGood", 0);
        setIntField(term177649, term177649.getClass(), "tapBad", 0);
        setIntField(term177649, term177649.getClass(), "holdPerfect", 0);
        setIntField(term177649, term177649.getClass(), "holdGreat", 0);
        setIntField(term177649, term177649.getClass(), "holdGood", 0);
        setIntField(term177649, term177649.getClass(), "holdBad", 0);
        setIntField(term177649, term177649.getClass(), "slidePerfect", 0);
        setIntField(term177649, term177649.getClass(), "slideGreat", 0);
        setIntField(term177649, term177649.getClass(), "slideGood", 0);
        setIntField(term177649, term177649.getClass(), "slideBad", 0);
        setIntField(term177649, term177649.getClass(), "breakPerfect", 0);
        setIntField(term177649, term177649.getClass(), "breakGreat", 0);
        setIntField(term177649, term177649.getClass(), "breakGood", 0);
        setIntField(term177649, term177649.getClass(), "breakBad", 0);
        setBooleanField(term177649, term177649.getClass(), "isTrackSkip", false);
        setBooleanField(term177649, term177649.getClass(), "isHighScore", false);
        setBooleanField(term177649, term177649.getClass(), "isChallengeTrack", false);
        setIntField(term177649, term177649.getClass(), "challengeLife", 0);
        setIntField(term177649, term177649.getClass(), "challengeRemain", 0);
        setIntField(term177649, term177649.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName3", argTypes, term177649, args);
    }

};


