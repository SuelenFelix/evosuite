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

public class UserPlaylog_getPlayedUserId2_1793623586150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174103;

    public UserPlaylog_getPlayedUserId2_1793623586150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174103 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term174103, term174103.getClass(), "id", 0L);
        setField(term174103, term174103.getClass(), "user", null);
        setIntField(term174103, term174103.getClass(), "orderId", 0);
        setLongField(term174103, term174103.getClass(), "sortNumber", 0L);
        setIntField(term174103, term174103.getClass(), "placeId", 0);
        setField(term174103, term174103.getClass(), "placeName", null);
        setField(term174103, term174103.getClass(), "country", null);
        setIntField(term174103, term174103.getClass(), "regionId", 0);
        setField(term174103, term174103.getClass(), "playDate", null);
        setField(term174103, term174103.getClass(), "userPlayDate", null);
        setIntField(term174103, term174103.getClass(), "musicId", 0);
        setIntField(term174103, term174103.getClass(), "level", 0);
        setIntField(term174103, term174103.getClass(), "gameMode", 0);
        setIntField(term174103, term174103.getClass(), "rivalNum", 0);
        setIntField(term174103, term174103.getClass(), "track", 0);
        setIntField(term174103, term174103.getClass(), "eventId", 0);
        setBooleanField(term174103, term174103.getClass(), "isFreeToPlay", false);
        setIntField(term174103, term174103.getClass(), "playerRating", 0);
        setLongField(term174103, term174103.getClass(), "playedUserId1", 0L);
        setField(term174103, term174103.getClass(), "playedUserName1", null);
        setIntField(term174103, term174103.getClass(), "playedMusicLevel1", 0);
        setLongField(term174103, term174103.getClass(), "playedUserId2", 0L);
        setField(term174103, term174103.getClass(), "playedUserName2", null);
        setIntField(term174103, term174103.getClass(), "playedMusicLevel2", 0);
        setLongField(term174103, term174103.getClass(), "playedUserId3", 0L);
        setField(term174103, term174103.getClass(), "playedUserName3", null);
        setIntField(term174103, term174103.getClass(), "playedMusicLevel3", 0);
        setIntField(term174103, term174103.getClass(), "achievement", 0);
        setIntField(term174103, term174103.getClass(), "score", 0);
        setIntField(term174103, term174103.getClass(), "tapScore", 0);
        setIntField(term174103, term174103.getClass(), "holdScore", 0);
        setIntField(term174103, term174103.getClass(), "slideScore", 0);
        setIntField(term174103, term174103.getClass(), "breakScore", 0);
        setIntField(term174103, term174103.getClass(), "syncRate", 0);
        setIntField(term174103, term174103.getClass(), "vsWin", 0);
        setBooleanField(term174103, term174103.getClass(), "isAllPerfect", false);
        setIntField(term174103, term174103.getClass(), "fullCombo", 0);
        setIntField(term174103, term174103.getClass(), "maxFever", 0);
        setIntField(term174103, term174103.getClass(), "maxCombo", 0);
        setIntField(term174103, term174103.getClass(), "tapPerfect", 0);
        setIntField(term174103, term174103.getClass(), "tapGreat", 0);
        setIntField(term174103, term174103.getClass(), "tapGood", 0);
        setIntField(term174103, term174103.getClass(), "tapBad", 0);
        setIntField(term174103, term174103.getClass(), "holdPerfect", 0);
        setIntField(term174103, term174103.getClass(), "holdGreat", 0);
        setIntField(term174103, term174103.getClass(), "holdGood", 0);
        setIntField(term174103, term174103.getClass(), "holdBad", 0);
        setIntField(term174103, term174103.getClass(), "slidePerfect", 0);
        setIntField(term174103, term174103.getClass(), "slideGreat", 0);
        setIntField(term174103, term174103.getClass(), "slideGood", 0);
        setIntField(term174103, term174103.getClass(), "slideBad", 0);
        setIntField(term174103, term174103.getClass(), "breakPerfect", 0);
        setIntField(term174103, term174103.getClass(), "breakGreat", 0);
        setIntField(term174103, term174103.getClass(), "breakGood", 0);
        setIntField(term174103, term174103.getClass(), "breakBad", 0);
        setBooleanField(term174103, term174103.getClass(), "isTrackSkip", false);
        setBooleanField(term174103, term174103.getClass(), "isHighScore", false);
        setBooleanField(term174103, term174103.getClass(), "isChallengeTrack", false);
        setIntField(term174103, term174103.getClass(), "challengeLife", 0);
        setIntField(term174103, term174103.getClass(), "challengeRemain", 0);
        setIntField(term174103, term174103.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId2", argTypes, term174103, args);
    }

};


