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

public class UserPlaylog_setSlideGood_2085765219238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178935;
     Object term178989;

    public UserPlaylog_setSlideGood_2085765219238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178935 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178935, term178935.getClass(), "id", 0L);
        setField(term178935, term178935.getClass(), "user", null);
        setIntField(term178935, term178935.getClass(), "orderId", 0);
        setLongField(term178935, term178935.getClass(), "sortNumber", 0L);
        setIntField(term178935, term178935.getClass(), "placeId", 0);
        setField(term178935, term178935.getClass(), "placeName", null);
        setField(term178935, term178935.getClass(), "country", null);
        setIntField(term178935, term178935.getClass(), "regionId", 0);
        setField(term178935, term178935.getClass(), "playDate", null);
        setField(term178935, term178935.getClass(), "userPlayDate", null);
        setIntField(term178935, term178935.getClass(), "musicId", 0);
        setIntField(term178935, term178935.getClass(), "level", 0);
        setIntField(term178935, term178935.getClass(), "gameMode", 0);
        setIntField(term178935, term178935.getClass(), "rivalNum", 0);
        setIntField(term178935, term178935.getClass(), "track", 0);
        setIntField(term178935, term178935.getClass(), "eventId", 0);
        setBooleanField(term178935, term178935.getClass(), "isFreeToPlay", false);
        setIntField(term178935, term178935.getClass(), "playerRating", 0);
        setLongField(term178935, term178935.getClass(), "playedUserId1", 0L);
        setField(term178935, term178935.getClass(), "playedUserName1", null);
        setIntField(term178935, term178935.getClass(), "playedMusicLevel1", 0);
        setLongField(term178935, term178935.getClass(), "playedUserId2", 0L);
        setField(term178935, term178935.getClass(), "playedUserName2", null);
        setIntField(term178935, term178935.getClass(), "playedMusicLevel2", 0);
        setLongField(term178935, term178935.getClass(), "playedUserId3", 0L);
        setField(term178935, term178935.getClass(), "playedUserName3", null);
        setIntField(term178935, term178935.getClass(), "playedMusicLevel3", 0);
        setIntField(term178935, term178935.getClass(), "achievement", 0);
        setIntField(term178935, term178935.getClass(), "score", 0);
        setIntField(term178935, term178935.getClass(), "tapScore", 0);
        setIntField(term178935, term178935.getClass(), "holdScore", 0);
        setIntField(term178935, term178935.getClass(), "slideScore", 0);
        setIntField(term178935, term178935.getClass(), "breakScore", 0);
        setIntField(term178935, term178935.getClass(), "syncRate", 0);
        setIntField(term178935, term178935.getClass(), "vsWin", 0);
        setBooleanField(term178935, term178935.getClass(), "isAllPerfect", false);
        setIntField(term178935, term178935.getClass(), "fullCombo", 0);
        setIntField(term178935, term178935.getClass(), "maxFever", 0);
        setIntField(term178935, term178935.getClass(), "maxCombo", 0);
        setIntField(term178935, term178935.getClass(), "tapPerfect", 0);
        setIntField(term178935, term178935.getClass(), "tapGreat", 0);
        setIntField(term178935, term178935.getClass(), "tapGood", 0);
        setIntField(term178935, term178935.getClass(), "tapBad", 0);
        setIntField(term178935, term178935.getClass(), "holdPerfect", 0);
        setIntField(term178935, term178935.getClass(), "holdGreat", 0);
        setIntField(term178935, term178935.getClass(), "holdGood", 0);
        setIntField(term178935, term178935.getClass(), "holdBad", 0);
        setIntField(term178935, term178935.getClass(), "slidePerfect", 0);
        setIntField(term178935, term178935.getClass(), "slideGreat", 0);
        setIntField(term178935, term178935.getClass(), "slideGood", 0);
        setIntField(term178935, term178935.getClass(), "slideBad", 0);
        setIntField(term178935, term178935.getClass(), "breakPerfect", 0);
        setIntField(term178935, term178935.getClass(), "breakGreat", 0);
        setIntField(term178935, term178935.getClass(), "breakGood", 0);
        setIntField(term178935, term178935.getClass(), "breakBad", 0);
        setBooleanField(term178935, term178935.getClass(), "isTrackSkip", false);
        setBooleanField(term178935, term178935.getClass(), "isHighScore", false);
        setBooleanField(term178935, term178935.getClass(), "isChallengeTrack", false);
        setIntField(term178935, term178935.getClass(), "challengeLife", 0);
        setIntField(term178935, term178935.getClass(), "challengeRemain", 0);
        setIntField(term178935, term178935.getClass(), "isAllPerfectPlus", 0);
        term178989 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term178989;
        callMethod(klass, "setSlideGood", argTypes, term178935, args);
    }

};


