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

public class UserPlaylog_getHoldPerfect_679920883172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175291;

    public UserPlaylog_getHoldPerfect_679920883172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175291 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175291, term175291.getClass(), "id", 0L);
        setField(term175291, term175291.getClass(), "user", null);
        setIntField(term175291, term175291.getClass(), "orderId", 0);
        setLongField(term175291, term175291.getClass(), "sortNumber", 0L);
        setIntField(term175291, term175291.getClass(), "placeId", 0);
        setField(term175291, term175291.getClass(), "placeName", null);
        setField(term175291, term175291.getClass(), "country", null);
        setIntField(term175291, term175291.getClass(), "regionId", 0);
        setField(term175291, term175291.getClass(), "playDate", null);
        setField(term175291, term175291.getClass(), "userPlayDate", null);
        setIntField(term175291, term175291.getClass(), "musicId", 0);
        setIntField(term175291, term175291.getClass(), "level", 0);
        setIntField(term175291, term175291.getClass(), "gameMode", 0);
        setIntField(term175291, term175291.getClass(), "rivalNum", 0);
        setIntField(term175291, term175291.getClass(), "track", 0);
        setIntField(term175291, term175291.getClass(), "eventId", 0);
        setBooleanField(term175291, term175291.getClass(), "isFreeToPlay", false);
        setIntField(term175291, term175291.getClass(), "playerRating", 0);
        setLongField(term175291, term175291.getClass(), "playedUserId1", 0L);
        setField(term175291, term175291.getClass(), "playedUserName1", null);
        setIntField(term175291, term175291.getClass(), "playedMusicLevel1", 0);
        setLongField(term175291, term175291.getClass(), "playedUserId2", 0L);
        setField(term175291, term175291.getClass(), "playedUserName2", null);
        setIntField(term175291, term175291.getClass(), "playedMusicLevel2", 0);
        setLongField(term175291, term175291.getClass(), "playedUserId3", 0L);
        setField(term175291, term175291.getClass(), "playedUserName3", null);
        setIntField(term175291, term175291.getClass(), "playedMusicLevel3", 0);
        setIntField(term175291, term175291.getClass(), "achievement", 0);
        setIntField(term175291, term175291.getClass(), "score", 0);
        setIntField(term175291, term175291.getClass(), "tapScore", 0);
        setIntField(term175291, term175291.getClass(), "holdScore", 0);
        setIntField(term175291, term175291.getClass(), "slideScore", 0);
        setIntField(term175291, term175291.getClass(), "breakScore", 0);
        setIntField(term175291, term175291.getClass(), "syncRate", 0);
        setIntField(term175291, term175291.getClass(), "vsWin", 0);
        setBooleanField(term175291, term175291.getClass(), "isAllPerfect", false);
        setIntField(term175291, term175291.getClass(), "fullCombo", 0);
        setIntField(term175291, term175291.getClass(), "maxFever", 0);
        setIntField(term175291, term175291.getClass(), "maxCombo", 0);
        setIntField(term175291, term175291.getClass(), "tapPerfect", 0);
        setIntField(term175291, term175291.getClass(), "tapGreat", 0);
        setIntField(term175291, term175291.getClass(), "tapGood", 0);
        setIntField(term175291, term175291.getClass(), "tapBad", 0);
        setIntField(term175291, term175291.getClass(), "holdPerfect", 0);
        setIntField(term175291, term175291.getClass(), "holdGreat", 0);
        setIntField(term175291, term175291.getClass(), "holdGood", 0);
        setIntField(term175291, term175291.getClass(), "holdBad", 0);
        setIntField(term175291, term175291.getClass(), "slidePerfect", 0);
        setIntField(term175291, term175291.getClass(), "slideGreat", 0);
        setIntField(term175291, term175291.getClass(), "slideGood", 0);
        setIntField(term175291, term175291.getClass(), "slideBad", 0);
        setIntField(term175291, term175291.getClass(), "breakPerfect", 0);
        setIntField(term175291, term175291.getClass(), "breakGreat", 0);
        setIntField(term175291, term175291.getClass(), "breakGood", 0);
        setIntField(term175291, term175291.getClass(), "breakBad", 0);
        setBooleanField(term175291, term175291.getClass(), "isTrackSkip", false);
        setBooleanField(term175291, term175291.getClass(), "isHighScore", false);
        setBooleanField(term175291, term175291.getClass(), "isChallengeTrack", false);
        setIntField(term175291, term175291.getClass(), "challengeLife", 0);
        setIntField(term175291, term175291.getClass(), "challengeRemain", 0);
        setIntField(term175291, term175291.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldPerfect", argTypes, term175291, args);
    }

};


