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

public class UserPlaylog_setPlayedUserName3_1710036428214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177593;

    public UserPlaylog_setPlayedUserName3_1710036428214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177593 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177593, term177593.getClass(), "id", 0L);
        setField(term177593, term177593.getClass(), "user", null);
        setIntField(term177593, term177593.getClass(), "orderId", 0);
        setLongField(term177593, term177593.getClass(), "sortNumber", 0L);
        setIntField(term177593, term177593.getClass(), "placeId", 0);
        setField(term177593, term177593.getClass(), "placeName", null);
        setField(term177593, term177593.getClass(), "country", null);
        setIntField(term177593, term177593.getClass(), "regionId", 0);
        setField(term177593, term177593.getClass(), "playDate", null);
        setField(term177593, term177593.getClass(), "userPlayDate", null);
        setIntField(term177593, term177593.getClass(), "musicId", 0);
        setIntField(term177593, term177593.getClass(), "level", 0);
        setIntField(term177593, term177593.getClass(), "gameMode", 0);
        setIntField(term177593, term177593.getClass(), "rivalNum", 0);
        setIntField(term177593, term177593.getClass(), "track", 0);
        setIntField(term177593, term177593.getClass(), "eventId", 0);
        setBooleanField(term177593, term177593.getClass(), "isFreeToPlay", false);
        setIntField(term177593, term177593.getClass(), "playerRating", 0);
        setLongField(term177593, term177593.getClass(), "playedUserId1", 0L);
        setField(term177593, term177593.getClass(), "playedUserName1", null);
        setIntField(term177593, term177593.getClass(), "playedMusicLevel1", 0);
        setLongField(term177593, term177593.getClass(), "playedUserId2", 0L);
        setField(term177593, term177593.getClass(), "playedUserName2", null);
        setIntField(term177593, term177593.getClass(), "playedMusicLevel2", 0);
        setLongField(term177593, term177593.getClass(), "playedUserId3", 0L);
        setField(term177593, term177593.getClass(), "playedUserName3", null);
        setIntField(term177593, term177593.getClass(), "playedMusicLevel3", 0);
        setIntField(term177593, term177593.getClass(), "achievement", 0);
        setIntField(term177593, term177593.getClass(), "score", 0);
        setIntField(term177593, term177593.getClass(), "tapScore", 0);
        setIntField(term177593, term177593.getClass(), "holdScore", 0);
        setIntField(term177593, term177593.getClass(), "slideScore", 0);
        setIntField(term177593, term177593.getClass(), "breakScore", 0);
        setIntField(term177593, term177593.getClass(), "syncRate", 0);
        setIntField(term177593, term177593.getClass(), "vsWin", 0);
        setBooleanField(term177593, term177593.getClass(), "isAllPerfect", false);
        setIntField(term177593, term177593.getClass(), "fullCombo", 0);
        setIntField(term177593, term177593.getClass(), "maxFever", 0);
        setIntField(term177593, term177593.getClass(), "maxCombo", 0);
        setIntField(term177593, term177593.getClass(), "tapPerfect", 0);
        setIntField(term177593, term177593.getClass(), "tapGreat", 0);
        setIntField(term177593, term177593.getClass(), "tapGood", 0);
        setIntField(term177593, term177593.getClass(), "tapBad", 0);
        setIntField(term177593, term177593.getClass(), "holdPerfect", 0);
        setIntField(term177593, term177593.getClass(), "holdGreat", 0);
        setIntField(term177593, term177593.getClass(), "holdGood", 0);
        setIntField(term177593, term177593.getClass(), "holdBad", 0);
        setIntField(term177593, term177593.getClass(), "slidePerfect", 0);
        setIntField(term177593, term177593.getClass(), "slideGreat", 0);
        setIntField(term177593, term177593.getClass(), "slideGood", 0);
        setIntField(term177593, term177593.getClass(), "slideBad", 0);
        setIntField(term177593, term177593.getClass(), "breakPerfect", 0);
        setIntField(term177593, term177593.getClass(), "breakGreat", 0);
        setIntField(term177593, term177593.getClass(), "breakGood", 0);
        setIntField(term177593, term177593.getClass(), "breakBad", 0);
        setBooleanField(term177593, term177593.getClass(), "isTrackSkip", false);
        setBooleanField(term177593, term177593.getClass(), "isHighScore", false);
        setBooleanField(term177593, term177593.getClass(), "isChallengeTrack", false);
        setIntField(term177593, term177593.getClass(), "challengeLife", 0);
        setIntField(term177593, term177593.getClass(), "challengeRemain", 0);
        setIntField(term177593, term177593.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName3", argTypes, term177593, args);
    }

};


