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
import java.lang.Integer;

public class UserPlaylog_setSlidePerfect_1905540591236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178823;
     Object term178877;

    public UserPlaylog_setSlidePerfect_1905540591236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178823 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178823, term178823.getClass(), "id", 0L);
        setField(term178823, term178823.getClass(), "user", null);
        setIntField(term178823, term178823.getClass(), "orderId", 0);
        setLongField(term178823, term178823.getClass(), "sortNumber", 0L);
        setIntField(term178823, term178823.getClass(), "placeId", 0);
        setField(term178823, term178823.getClass(), "placeName", null);
        setField(term178823, term178823.getClass(), "country", null);
        setIntField(term178823, term178823.getClass(), "regionId", 0);
        setField(term178823, term178823.getClass(), "playDate", null);
        setField(term178823, term178823.getClass(), "userPlayDate", null);
        setIntField(term178823, term178823.getClass(), "musicId", 0);
        setIntField(term178823, term178823.getClass(), "level", 0);
        setIntField(term178823, term178823.getClass(), "gameMode", 0);
        setIntField(term178823, term178823.getClass(), "rivalNum", 0);
        setIntField(term178823, term178823.getClass(), "track", 0);
        setIntField(term178823, term178823.getClass(), "eventId", 0);
        setBooleanField(term178823, term178823.getClass(), "isFreeToPlay", false);
        setIntField(term178823, term178823.getClass(), "playerRating", 0);
        setLongField(term178823, term178823.getClass(), "playedUserId1", 0L);
        setField(term178823, term178823.getClass(), "playedUserName1", null);
        setIntField(term178823, term178823.getClass(), "playedMusicLevel1", 0);
        setLongField(term178823, term178823.getClass(), "playedUserId2", 0L);
        setField(term178823, term178823.getClass(), "playedUserName2", null);
        setIntField(term178823, term178823.getClass(), "playedMusicLevel2", 0);
        setLongField(term178823, term178823.getClass(), "playedUserId3", 0L);
        setField(term178823, term178823.getClass(), "playedUserName3", null);
        setIntField(term178823, term178823.getClass(), "playedMusicLevel3", 0);
        setIntField(term178823, term178823.getClass(), "achievement", 0);
        setIntField(term178823, term178823.getClass(), "score", 0);
        setIntField(term178823, term178823.getClass(), "tapScore", 0);
        setIntField(term178823, term178823.getClass(), "holdScore", 0);
        setIntField(term178823, term178823.getClass(), "slideScore", 0);
        setIntField(term178823, term178823.getClass(), "breakScore", 0);
        setIntField(term178823, term178823.getClass(), "syncRate", 0);
        setIntField(term178823, term178823.getClass(), "vsWin", 0);
        setBooleanField(term178823, term178823.getClass(), "isAllPerfect", false);
        setIntField(term178823, term178823.getClass(), "fullCombo", 0);
        setIntField(term178823, term178823.getClass(), "maxFever", 0);
        setIntField(term178823, term178823.getClass(), "maxCombo", 0);
        setIntField(term178823, term178823.getClass(), "tapPerfect", 0);
        setIntField(term178823, term178823.getClass(), "tapGreat", 0);
        setIntField(term178823, term178823.getClass(), "tapGood", 0);
        setIntField(term178823, term178823.getClass(), "tapBad", 0);
        setIntField(term178823, term178823.getClass(), "holdPerfect", 0);
        setIntField(term178823, term178823.getClass(), "holdGreat", 0);
        setIntField(term178823, term178823.getClass(), "holdGood", 0);
        setIntField(term178823, term178823.getClass(), "holdBad", 0);
        setIntField(term178823, term178823.getClass(), "slidePerfect", 0);
        setIntField(term178823, term178823.getClass(), "slideGreat", 0);
        setIntField(term178823, term178823.getClass(), "slideGood", 0);
        setIntField(term178823, term178823.getClass(), "slideBad", 0);
        setIntField(term178823, term178823.getClass(), "breakPerfect", 0);
        setIntField(term178823, term178823.getClass(), "breakGreat", 0);
        setIntField(term178823, term178823.getClass(), "breakGood", 0);
        setIntField(term178823, term178823.getClass(), "breakBad", 0);
        setBooleanField(term178823, term178823.getClass(), "isTrackSkip", false);
        setBooleanField(term178823, term178823.getClass(), "isHighScore", false);
        setBooleanField(term178823, term178823.getClass(), "isChallengeTrack", false);
        setIntField(term178823, term178823.getClass(), "challengeLife", 0);
        setIntField(term178823, term178823.getClass(), "challengeRemain", 0);
        setIntField(term178823, term178823.getClass(), "isAllPerfectPlus", 0);
        term178877 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term178877;
        callMethod(klass, "setSlidePerfect", argTypes, term178823, args);
    }

};


