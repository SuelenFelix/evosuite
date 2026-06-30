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

public class UserPlaylog_setHoldGood_5062673234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178711;
     Object term178765;

    public UserPlaylog_setHoldGood_5062673234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178711, term178711.getClass(), "id", 0L);
        setField(term178711, term178711.getClass(), "user", null);
        setIntField(term178711, term178711.getClass(), "orderId", 0);
        setLongField(term178711, term178711.getClass(), "sortNumber", 0L);
        setIntField(term178711, term178711.getClass(), "placeId", 0);
        setField(term178711, term178711.getClass(), "placeName", null);
        setField(term178711, term178711.getClass(), "country", null);
        setIntField(term178711, term178711.getClass(), "regionId", 0);
        setField(term178711, term178711.getClass(), "playDate", null);
        setField(term178711, term178711.getClass(), "userPlayDate", null);
        setIntField(term178711, term178711.getClass(), "musicId", 0);
        setIntField(term178711, term178711.getClass(), "level", 0);
        setIntField(term178711, term178711.getClass(), "gameMode", 0);
        setIntField(term178711, term178711.getClass(), "rivalNum", 0);
        setIntField(term178711, term178711.getClass(), "track", 0);
        setIntField(term178711, term178711.getClass(), "eventId", 0);
        setBooleanField(term178711, term178711.getClass(), "isFreeToPlay", false);
        setIntField(term178711, term178711.getClass(), "playerRating", 0);
        setLongField(term178711, term178711.getClass(), "playedUserId1", 0L);
        setField(term178711, term178711.getClass(), "playedUserName1", null);
        setIntField(term178711, term178711.getClass(), "playedMusicLevel1", 0);
        setLongField(term178711, term178711.getClass(), "playedUserId2", 0L);
        setField(term178711, term178711.getClass(), "playedUserName2", null);
        setIntField(term178711, term178711.getClass(), "playedMusicLevel2", 0);
        setLongField(term178711, term178711.getClass(), "playedUserId3", 0L);
        setField(term178711, term178711.getClass(), "playedUserName3", null);
        setIntField(term178711, term178711.getClass(), "playedMusicLevel3", 0);
        setIntField(term178711, term178711.getClass(), "achievement", 0);
        setIntField(term178711, term178711.getClass(), "score", 0);
        setIntField(term178711, term178711.getClass(), "tapScore", 0);
        setIntField(term178711, term178711.getClass(), "holdScore", 0);
        setIntField(term178711, term178711.getClass(), "slideScore", 0);
        setIntField(term178711, term178711.getClass(), "breakScore", 0);
        setIntField(term178711, term178711.getClass(), "syncRate", 0);
        setIntField(term178711, term178711.getClass(), "vsWin", 0);
        setBooleanField(term178711, term178711.getClass(), "isAllPerfect", false);
        setIntField(term178711, term178711.getClass(), "fullCombo", 0);
        setIntField(term178711, term178711.getClass(), "maxFever", 0);
        setIntField(term178711, term178711.getClass(), "maxCombo", 0);
        setIntField(term178711, term178711.getClass(), "tapPerfect", 0);
        setIntField(term178711, term178711.getClass(), "tapGreat", 0);
        setIntField(term178711, term178711.getClass(), "tapGood", 0);
        setIntField(term178711, term178711.getClass(), "tapBad", 0);
        setIntField(term178711, term178711.getClass(), "holdPerfect", 0);
        setIntField(term178711, term178711.getClass(), "holdGreat", 0);
        setIntField(term178711, term178711.getClass(), "holdGood", 0);
        setIntField(term178711, term178711.getClass(), "holdBad", 0);
        setIntField(term178711, term178711.getClass(), "slidePerfect", 0);
        setIntField(term178711, term178711.getClass(), "slideGreat", 0);
        setIntField(term178711, term178711.getClass(), "slideGood", 0);
        setIntField(term178711, term178711.getClass(), "slideBad", 0);
        setIntField(term178711, term178711.getClass(), "breakPerfect", 0);
        setIntField(term178711, term178711.getClass(), "breakGreat", 0);
        setIntField(term178711, term178711.getClass(), "breakGood", 0);
        setIntField(term178711, term178711.getClass(), "breakBad", 0);
        setBooleanField(term178711, term178711.getClass(), "isTrackSkip", false);
        setBooleanField(term178711, term178711.getClass(), "isHighScore", false);
        setBooleanField(term178711, term178711.getClass(), "isChallengeTrack", false);
        setIntField(term178711, term178711.getClass(), "challengeLife", 0);
        setIntField(term178711, term178711.getClass(), "challengeRemain", 0);
        setIntField(term178711, term178711.getClass(), "isAllPerfectPlus", 0);
        term178765 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term178765;
        callMethod(klass, "setHoldGood", argTypes, term178711, args);
    }

};


