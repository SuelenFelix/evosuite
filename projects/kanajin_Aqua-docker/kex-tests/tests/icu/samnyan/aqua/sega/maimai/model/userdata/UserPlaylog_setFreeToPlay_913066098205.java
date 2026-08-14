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

public class UserPlaylog_setFreeToPlay_913066098205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4003459;
     Object term4003513;

    public UserPlaylog_setFreeToPlay_913066098205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4003459 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4003459, term4003459.getClass(), "id", 0L);
        setField(term4003459, term4003459.getClass(), "user", null);
        setIntField(term4003459, term4003459.getClass(), "orderId", 0);
        setLongField(term4003459, term4003459.getClass(), "sortNumber", 0L);
        setIntField(term4003459, term4003459.getClass(), "placeId", 0);
        setField(term4003459, term4003459.getClass(), "placeName", null);
        setField(term4003459, term4003459.getClass(), "country", null);
        setIntField(term4003459, term4003459.getClass(), "regionId", 0);
        setField(term4003459, term4003459.getClass(), "playDate", null);
        setField(term4003459, term4003459.getClass(), "userPlayDate", null);
        setIntField(term4003459, term4003459.getClass(), "musicId", 0);
        setIntField(term4003459, term4003459.getClass(), "level", 0);
        setIntField(term4003459, term4003459.getClass(), "gameMode", 0);
        setIntField(term4003459, term4003459.getClass(), "rivalNum", 0);
        setIntField(term4003459, term4003459.getClass(), "track", 0);
        setIntField(term4003459, term4003459.getClass(), "eventId", 0);
        setBooleanField(term4003459, term4003459.getClass(), "isFreeToPlay", false);
        setIntField(term4003459, term4003459.getClass(), "playerRating", 0);
        setLongField(term4003459, term4003459.getClass(), "playedUserId1", 0L);
        setField(term4003459, term4003459.getClass(), "playedUserName1", null);
        setIntField(term4003459, term4003459.getClass(), "playedMusicLevel1", 0);
        setLongField(term4003459, term4003459.getClass(), "playedUserId2", 0L);
        setField(term4003459, term4003459.getClass(), "playedUserName2", null);
        setIntField(term4003459, term4003459.getClass(), "playedMusicLevel2", 0);
        setLongField(term4003459, term4003459.getClass(), "playedUserId3", 0L);
        setField(term4003459, term4003459.getClass(), "playedUserName3", null);
        setIntField(term4003459, term4003459.getClass(), "playedMusicLevel3", 0);
        setIntField(term4003459, term4003459.getClass(), "achievement", 0);
        setIntField(term4003459, term4003459.getClass(), "score", 0);
        setIntField(term4003459, term4003459.getClass(), "tapScore", 0);
        setIntField(term4003459, term4003459.getClass(), "holdScore", 0);
        setIntField(term4003459, term4003459.getClass(), "slideScore", 0);
        setIntField(term4003459, term4003459.getClass(), "breakScore", 0);
        setIntField(term4003459, term4003459.getClass(), "syncRate", 0);
        setIntField(term4003459, term4003459.getClass(), "vsWin", 0);
        setBooleanField(term4003459, term4003459.getClass(), "isAllPerfect", false);
        setIntField(term4003459, term4003459.getClass(), "fullCombo", 0);
        setIntField(term4003459, term4003459.getClass(), "maxFever", 0);
        setIntField(term4003459, term4003459.getClass(), "maxCombo", 0);
        setIntField(term4003459, term4003459.getClass(), "tapPerfect", 0);
        setIntField(term4003459, term4003459.getClass(), "tapGreat", 0);
        setIntField(term4003459, term4003459.getClass(), "tapGood", 0);
        setIntField(term4003459, term4003459.getClass(), "tapBad", 0);
        setIntField(term4003459, term4003459.getClass(), "holdPerfect", 0);
        setIntField(term4003459, term4003459.getClass(), "holdGreat", 0);
        setIntField(term4003459, term4003459.getClass(), "holdGood", 0);
        setIntField(term4003459, term4003459.getClass(), "holdBad", 0);
        setIntField(term4003459, term4003459.getClass(), "slidePerfect", 0);
        setIntField(term4003459, term4003459.getClass(), "slideGreat", 0);
        setIntField(term4003459, term4003459.getClass(), "slideGood", 0);
        setIntField(term4003459, term4003459.getClass(), "slideBad", 0);
        setIntField(term4003459, term4003459.getClass(), "breakPerfect", 0);
        setIntField(term4003459, term4003459.getClass(), "breakGreat", 0);
        setIntField(term4003459, term4003459.getClass(), "breakGood", 0);
        setIntField(term4003459, term4003459.getClass(), "breakBad", 0);
        setBooleanField(term4003459, term4003459.getClass(), "isTrackSkip", false);
        setBooleanField(term4003459, term4003459.getClass(), "isHighScore", false);
        setBooleanField(term4003459, term4003459.getClass(), "isChallengeTrack", false);
        setIntField(term4003459, term4003459.getClass(), "challengeLife", 0);
        setIntField(term4003459, term4003459.getClass(), "challengeRemain", 0);
        setIntField(term4003459, term4003459.getClass(), "isAllPerfectPlus", 0);
        term4003513 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4003513;
        callMethod(klass, "setFreeToPlay", argTypes, term4003459, args);
    }

};


