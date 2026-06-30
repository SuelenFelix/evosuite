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
import java.lang.Boolean;

public class UserPlaylog_setAllPerfect_1408484511224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178151;
     Object term178205;

    public UserPlaylog_setAllPerfect_1408484511224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178151 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178151, term178151.getClass(), "id", 0L);
        setField(term178151, term178151.getClass(), "user", null);
        setIntField(term178151, term178151.getClass(), "orderId", 0);
        setLongField(term178151, term178151.getClass(), "sortNumber", 0L);
        setIntField(term178151, term178151.getClass(), "placeId", 0);
        setField(term178151, term178151.getClass(), "placeName", null);
        setField(term178151, term178151.getClass(), "country", null);
        setIntField(term178151, term178151.getClass(), "regionId", 0);
        setField(term178151, term178151.getClass(), "playDate", null);
        setField(term178151, term178151.getClass(), "userPlayDate", null);
        setIntField(term178151, term178151.getClass(), "musicId", 0);
        setIntField(term178151, term178151.getClass(), "level", 0);
        setIntField(term178151, term178151.getClass(), "gameMode", 0);
        setIntField(term178151, term178151.getClass(), "rivalNum", 0);
        setIntField(term178151, term178151.getClass(), "track", 0);
        setIntField(term178151, term178151.getClass(), "eventId", 0);
        setBooleanField(term178151, term178151.getClass(), "isFreeToPlay", false);
        setIntField(term178151, term178151.getClass(), "playerRating", 0);
        setLongField(term178151, term178151.getClass(), "playedUserId1", 0L);
        setField(term178151, term178151.getClass(), "playedUserName1", null);
        setIntField(term178151, term178151.getClass(), "playedMusicLevel1", 0);
        setLongField(term178151, term178151.getClass(), "playedUserId2", 0L);
        setField(term178151, term178151.getClass(), "playedUserName2", null);
        setIntField(term178151, term178151.getClass(), "playedMusicLevel2", 0);
        setLongField(term178151, term178151.getClass(), "playedUserId3", 0L);
        setField(term178151, term178151.getClass(), "playedUserName3", null);
        setIntField(term178151, term178151.getClass(), "playedMusicLevel3", 0);
        setIntField(term178151, term178151.getClass(), "achievement", 0);
        setIntField(term178151, term178151.getClass(), "score", 0);
        setIntField(term178151, term178151.getClass(), "tapScore", 0);
        setIntField(term178151, term178151.getClass(), "holdScore", 0);
        setIntField(term178151, term178151.getClass(), "slideScore", 0);
        setIntField(term178151, term178151.getClass(), "breakScore", 0);
        setIntField(term178151, term178151.getClass(), "syncRate", 0);
        setIntField(term178151, term178151.getClass(), "vsWin", 0);
        setBooleanField(term178151, term178151.getClass(), "isAllPerfect", false);
        setIntField(term178151, term178151.getClass(), "fullCombo", 0);
        setIntField(term178151, term178151.getClass(), "maxFever", 0);
        setIntField(term178151, term178151.getClass(), "maxCombo", 0);
        setIntField(term178151, term178151.getClass(), "tapPerfect", 0);
        setIntField(term178151, term178151.getClass(), "tapGreat", 0);
        setIntField(term178151, term178151.getClass(), "tapGood", 0);
        setIntField(term178151, term178151.getClass(), "tapBad", 0);
        setIntField(term178151, term178151.getClass(), "holdPerfect", 0);
        setIntField(term178151, term178151.getClass(), "holdGreat", 0);
        setIntField(term178151, term178151.getClass(), "holdGood", 0);
        setIntField(term178151, term178151.getClass(), "holdBad", 0);
        setIntField(term178151, term178151.getClass(), "slidePerfect", 0);
        setIntField(term178151, term178151.getClass(), "slideGreat", 0);
        setIntField(term178151, term178151.getClass(), "slideGood", 0);
        setIntField(term178151, term178151.getClass(), "slideBad", 0);
        setIntField(term178151, term178151.getClass(), "breakPerfect", 0);
        setIntField(term178151, term178151.getClass(), "breakGreat", 0);
        setIntField(term178151, term178151.getClass(), "breakGood", 0);
        setIntField(term178151, term178151.getClass(), "breakBad", 0);
        setBooleanField(term178151, term178151.getClass(), "isTrackSkip", false);
        setBooleanField(term178151, term178151.getClass(), "isHighScore", false);
        setBooleanField(term178151, term178151.getClass(), "isChallengeTrack", false);
        setIntField(term178151, term178151.getClass(), "challengeLife", 0);
        setIntField(term178151, term178151.getClass(), "challengeRemain", 0);
        setIntField(term178151, term178151.getClass(), "isAllPerfectPlus", 0);
        term178205 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term178205;
        callMethod(klass, "setAllPerfect", argTypes, term178151, args);
    }

};


