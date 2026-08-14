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
     Object term4003959;

    public UserPlaylog_setPlayedUserName3_1710036428214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4003959 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4003959, term4003959.getClass(), "id", 0L);
        setField(term4003959, term4003959.getClass(), "user", null);
        setIntField(term4003959, term4003959.getClass(), "orderId", 0);
        setLongField(term4003959, term4003959.getClass(), "sortNumber", 0L);
        setIntField(term4003959, term4003959.getClass(), "placeId", 0);
        setField(term4003959, term4003959.getClass(), "placeName", null);
        setField(term4003959, term4003959.getClass(), "country", null);
        setIntField(term4003959, term4003959.getClass(), "regionId", 0);
        setField(term4003959, term4003959.getClass(), "playDate", null);
        setField(term4003959, term4003959.getClass(), "userPlayDate", null);
        setIntField(term4003959, term4003959.getClass(), "musicId", 0);
        setIntField(term4003959, term4003959.getClass(), "level", 0);
        setIntField(term4003959, term4003959.getClass(), "gameMode", 0);
        setIntField(term4003959, term4003959.getClass(), "rivalNum", 0);
        setIntField(term4003959, term4003959.getClass(), "track", 0);
        setIntField(term4003959, term4003959.getClass(), "eventId", 0);
        setBooleanField(term4003959, term4003959.getClass(), "isFreeToPlay", false);
        setIntField(term4003959, term4003959.getClass(), "playerRating", 0);
        setLongField(term4003959, term4003959.getClass(), "playedUserId1", 0L);
        setField(term4003959, term4003959.getClass(), "playedUserName1", null);
        setIntField(term4003959, term4003959.getClass(), "playedMusicLevel1", 0);
        setLongField(term4003959, term4003959.getClass(), "playedUserId2", 0L);
        setField(term4003959, term4003959.getClass(), "playedUserName2", null);
        setIntField(term4003959, term4003959.getClass(), "playedMusicLevel2", 0);
        setLongField(term4003959, term4003959.getClass(), "playedUserId3", 0L);
        setField(term4003959, term4003959.getClass(), "playedUserName3", null);
        setIntField(term4003959, term4003959.getClass(), "playedMusicLevel3", 0);
        setIntField(term4003959, term4003959.getClass(), "achievement", 0);
        setIntField(term4003959, term4003959.getClass(), "score", 0);
        setIntField(term4003959, term4003959.getClass(), "tapScore", 0);
        setIntField(term4003959, term4003959.getClass(), "holdScore", 0);
        setIntField(term4003959, term4003959.getClass(), "slideScore", 0);
        setIntField(term4003959, term4003959.getClass(), "breakScore", 0);
        setIntField(term4003959, term4003959.getClass(), "syncRate", 0);
        setIntField(term4003959, term4003959.getClass(), "vsWin", 0);
        setBooleanField(term4003959, term4003959.getClass(), "isAllPerfect", false);
        setIntField(term4003959, term4003959.getClass(), "fullCombo", 0);
        setIntField(term4003959, term4003959.getClass(), "maxFever", 0);
        setIntField(term4003959, term4003959.getClass(), "maxCombo", 0);
        setIntField(term4003959, term4003959.getClass(), "tapPerfect", 0);
        setIntField(term4003959, term4003959.getClass(), "tapGreat", 0);
        setIntField(term4003959, term4003959.getClass(), "tapGood", 0);
        setIntField(term4003959, term4003959.getClass(), "tapBad", 0);
        setIntField(term4003959, term4003959.getClass(), "holdPerfect", 0);
        setIntField(term4003959, term4003959.getClass(), "holdGreat", 0);
        setIntField(term4003959, term4003959.getClass(), "holdGood", 0);
        setIntField(term4003959, term4003959.getClass(), "holdBad", 0);
        setIntField(term4003959, term4003959.getClass(), "slidePerfect", 0);
        setIntField(term4003959, term4003959.getClass(), "slideGreat", 0);
        setIntField(term4003959, term4003959.getClass(), "slideGood", 0);
        setIntField(term4003959, term4003959.getClass(), "slideBad", 0);
        setIntField(term4003959, term4003959.getClass(), "breakPerfect", 0);
        setIntField(term4003959, term4003959.getClass(), "breakGreat", 0);
        setIntField(term4003959, term4003959.getClass(), "breakGood", 0);
        setIntField(term4003959, term4003959.getClass(), "breakBad", 0);
        setBooleanField(term4003959, term4003959.getClass(), "isTrackSkip", false);
        setBooleanField(term4003959, term4003959.getClass(), "isHighScore", false);
        setBooleanField(term4003959, term4003959.getClass(), "isChallengeTrack", false);
        setIntField(term4003959, term4003959.getClass(), "challengeLife", 0);
        setIntField(term4003959, term4003959.getClass(), "challengeRemain", 0);
        setIntField(term4003959, term4003959.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName3", argTypes, term4003959, args);
    }

};


