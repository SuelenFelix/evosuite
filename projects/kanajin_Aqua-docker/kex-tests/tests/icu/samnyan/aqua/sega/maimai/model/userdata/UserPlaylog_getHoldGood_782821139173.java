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

public class UserPlaylog_getHoldGood_782821139173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175343;

    public UserPlaylog_getHoldGood_782821139173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175343 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175343, term175343.getClass(), "id", 0L);
        setField(term175343, term175343.getClass(), "user", null);
        setIntField(term175343, term175343.getClass(), "orderId", 0);
        setLongField(term175343, term175343.getClass(), "sortNumber", 0L);
        setIntField(term175343, term175343.getClass(), "placeId", 0);
        setField(term175343, term175343.getClass(), "placeName", null);
        setField(term175343, term175343.getClass(), "country", null);
        setIntField(term175343, term175343.getClass(), "regionId", 0);
        setField(term175343, term175343.getClass(), "playDate", null);
        setField(term175343, term175343.getClass(), "userPlayDate", null);
        setIntField(term175343, term175343.getClass(), "musicId", 0);
        setIntField(term175343, term175343.getClass(), "level", 0);
        setIntField(term175343, term175343.getClass(), "gameMode", 0);
        setIntField(term175343, term175343.getClass(), "rivalNum", 0);
        setIntField(term175343, term175343.getClass(), "track", 0);
        setIntField(term175343, term175343.getClass(), "eventId", 0);
        setBooleanField(term175343, term175343.getClass(), "isFreeToPlay", false);
        setIntField(term175343, term175343.getClass(), "playerRating", 0);
        setLongField(term175343, term175343.getClass(), "playedUserId1", 0L);
        setField(term175343, term175343.getClass(), "playedUserName1", null);
        setIntField(term175343, term175343.getClass(), "playedMusicLevel1", 0);
        setLongField(term175343, term175343.getClass(), "playedUserId2", 0L);
        setField(term175343, term175343.getClass(), "playedUserName2", null);
        setIntField(term175343, term175343.getClass(), "playedMusicLevel2", 0);
        setLongField(term175343, term175343.getClass(), "playedUserId3", 0L);
        setField(term175343, term175343.getClass(), "playedUserName3", null);
        setIntField(term175343, term175343.getClass(), "playedMusicLevel3", 0);
        setIntField(term175343, term175343.getClass(), "achievement", 0);
        setIntField(term175343, term175343.getClass(), "score", 0);
        setIntField(term175343, term175343.getClass(), "tapScore", 0);
        setIntField(term175343, term175343.getClass(), "holdScore", 0);
        setIntField(term175343, term175343.getClass(), "slideScore", 0);
        setIntField(term175343, term175343.getClass(), "breakScore", 0);
        setIntField(term175343, term175343.getClass(), "syncRate", 0);
        setIntField(term175343, term175343.getClass(), "vsWin", 0);
        setBooleanField(term175343, term175343.getClass(), "isAllPerfect", false);
        setIntField(term175343, term175343.getClass(), "fullCombo", 0);
        setIntField(term175343, term175343.getClass(), "maxFever", 0);
        setIntField(term175343, term175343.getClass(), "maxCombo", 0);
        setIntField(term175343, term175343.getClass(), "tapPerfect", 0);
        setIntField(term175343, term175343.getClass(), "tapGreat", 0);
        setIntField(term175343, term175343.getClass(), "tapGood", 0);
        setIntField(term175343, term175343.getClass(), "tapBad", 0);
        setIntField(term175343, term175343.getClass(), "holdPerfect", 0);
        setIntField(term175343, term175343.getClass(), "holdGreat", 0);
        setIntField(term175343, term175343.getClass(), "holdGood", 0);
        setIntField(term175343, term175343.getClass(), "holdBad", 0);
        setIntField(term175343, term175343.getClass(), "slidePerfect", 0);
        setIntField(term175343, term175343.getClass(), "slideGreat", 0);
        setIntField(term175343, term175343.getClass(), "slideGood", 0);
        setIntField(term175343, term175343.getClass(), "slideBad", 0);
        setIntField(term175343, term175343.getClass(), "breakPerfect", 0);
        setIntField(term175343, term175343.getClass(), "breakGreat", 0);
        setIntField(term175343, term175343.getClass(), "breakGood", 0);
        setIntField(term175343, term175343.getClass(), "breakBad", 0);
        setBooleanField(term175343, term175343.getClass(), "isTrackSkip", false);
        setBooleanField(term175343, term175343.getClass(), "isHighScore", false);
        setBooleanField(term175343, term175343.getClass(), "isChallengeTrack", false);
        setIntField(term175343, term175343.getClass(), "challengeLife", 0);
        setIntField(term175343, term175343.getClass(), "challengeRemain", 0);
        setIntField(term175343, term175343.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldGood", argTypes, term175343, args);
    }

};


