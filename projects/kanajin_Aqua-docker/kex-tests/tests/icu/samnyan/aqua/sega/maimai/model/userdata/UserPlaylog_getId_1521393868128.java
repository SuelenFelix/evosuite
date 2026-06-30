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

public class UserPlaylog_getId_1521393868128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172913;

    public UserPlaylog_getId_1521393868128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172913 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term172913, term172913.getClass(), "id", 0L);
        setField(term172913, term172913.getClass(), "user", null);
        setIntField(term172913, term172913.getClass(), "orderId", 0);
        setLongField(term172913, term172913.getClass(), "sortNumber", 0L);
        setIntField(term172913, term172913.getClass(), "placeId", 0);
        setField(term172913, term172913.getClass(), "placeName", null);
        setField(term172913, term172913.getClass(), "country", null);
        setIntField(term172913, term172913.getClass(), "regionId", 0);
        setField(term172913, term172913.getClass(), "playDate", null);
        setField(term172913, term172913.getClass(), "userPlayDate", null);
        setIntField(term172913, term172913.getClass(), "musicId", 0);
        setIntField(term172913, term172913.getClass(), "level", 0);
        setIntField(term172913, term172913.getClass(), "gameMode", 0);
        setIntField(term172913, term172913.getClass(), "rivalNum", 0);
        setIntField(term172913, term172913.getClass(), "track", 0);
        setIntField(term172913, term172913.getClass(), "eventId", 0);
        setBooleanField(term172913, term172913.getClass(), "isFreeToPlay", false);
        setIntField(term172913, term172913.getClass(), "playerRating", 0);
        setLongField(term172913, term172913.getClass(), "playedUserId1", 0L);
        setField(term172913, term172913.getClass(), "playedUserName1", null);
        setIntField(term172913, term172913.getClass(), "playedMusicLevel1", 0);
        setLongField(term172913, term172913.getClass(), "playedUserId2", 0L);
        setField(term172913, term172913.getClass(), "playedUserName2", null);
        setIntField(term172913, term172913.getClass(), "playedMusicLevel2", 0);
        setLongField(term172913, term172913.getClass(), "playedUserId3", 0L);
        setField(term172913, term172913.getClass(), "playedUserName3", null);
        setIntField(term172913, term172913.getClass(), "playedMusicLevel3", 0);
        setIntField(term172913, term172913.getClass(), "achievement", 0);
        setIntField(term172913, term172913.getClass(), "score", 0);
        setIntField(term172913, term172913.getClass(), "tapScore", 0);
        setIntField(term172913, term172913.getClass(), "holdScore", 0);
        setIntField(term172913, term172913.getClass(), "slideScore", 0);
        setIntField(term172913, term172913.getClass(), "breakScore", 0);
        setIntField(term172913, term172913.getClass(), "syncRate", 0);
        setIntField(term172913, term172913.getClass(), "vsWin", 0);
        setBooleanField(term172913, term172913.getClass(), "isAllPerfect", false);
        setIntField(term172913, term172913.getClass(), "fullCombo", 0);
        setIntField(term172913, term172913.getClass(), "maxFever", 0);
        setIntField(term172913, term172913.getClass(), "maxCombo", 0);
        setIntField(term172913, term172913.getClass(), "tapPerfect", 0);
        setIntField(term172913, term172913.getClass(), "tapGreat", 0);
        setIntField(term172913, term172913.getClass(), "tapGood", 0);
        setIntField(term172913, term172913.getClass(), "tapBad", 0);
        setIntField(term172913, term172913.getClass(), "holdPerfect", 0);
        setIntField(term172913, term172913.getClass(), "holdGreat", 0);
        setIntField(term172913, term172913.getClass(), "holdGood", 0);
        setIntField(term172913, term172913.getClass(), "holdBad", 0);
        setIntField(term172913, term172913.getClass(), "slidePerfect", 0);
        setIntField(term172913, term172913.getClass(), "slideGreat", 0);
        setIntField(term172913, term172913.getClass(), "slideGood", 0);
        setIntField(term172913, term172913.getClass(), "slideBad", 0);
        setIntField(term172913, term172913.getClass(), "breakPerfect", 0);
        setIntField(term172913, term172913.getClass(), "breakGreat", 0);
        setIntField(term172913, term172913.getClass(), "breakGood", 0);
        setIntField(term172913, term172913.getClass(), "breakBad", 0);
        setBooleanField(term172913, term172913.getClass(), "isTrackSkip", false);
        setBooleanField(term172913, term172913.getClass(), "isHighScore", false);
        setBooleanField(term172913, term172913.getClass(), "isChallengeTrack", false);
        setIntField(term172913, term172913.getClass(), "challengeLife", 0);
        setIntField(term172913, term172913.getClass(), "challengeRemain", 0);
        setIntField(term172913, term172913.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term172913, args);
    }

};


