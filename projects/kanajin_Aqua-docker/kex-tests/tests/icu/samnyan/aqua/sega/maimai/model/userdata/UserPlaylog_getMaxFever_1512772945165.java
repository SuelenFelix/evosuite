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

public class UserPlaylog_getMaxFever_1512772945165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174911;

    public UserPlaylog_getMaxFever_1512772945165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term174911, term174911.getClass(), "id", 0L);
        setField(term174911, term174911.getClass(), "user", null);
        setIntField(term174911, term174911.getClass(), "orderId", 0);
        setLongField(term174911, term174911.getClass(), "sortNumber", 0L);
        setIntField(term174911, term174911.getClass(), "placeId", 0);
        setField(term174911, term174911.getClass(), "placeName", null);
        setField(term174911, term174911.getClass(), "country", null);
        setIntField(term174911, term174911.getClass(), "regionId", 0);
        setField(term174911, term174911.getClass(), "playDate", null);
        setField(term174911, term174911.getClass(), "userPlayDate", null);
        setIntField(term174911, term174911.getClass(), "musicId", 0);
        setIntField(term174911, term174911.getClass(), "level", 0);
        setIntField(term174911, term174911.getClass(), "gameMode", 0);
        setIntField(term174911, term174911.getClass(), "rivalNum", 0);
        setIntField(term174911, term174911.getClass(), "track", 0);
        setIntField(term174911, term174911.getClass(), "eventId", 0);
        setBooleanField(term174911, term174911.getClass(), "isFreeToPlay", false);
        setIntField(term174911, term174911.getClass(), "playerRating", 0);
        setLongField(term174911, term174911.getClass(), "playedUserId1", 0L);
        setField(term174911, term174911.getClass(), "playedUserName1", null);
        setIntField(term174911, term174911.getClass(), "playedMusicLevel1", 0);
        setLongField(term174911, term174911.getClass(), "playedUserId2", 0L);
        setField(term174911, term174911.getClass(), "playedUserName2", null);
        setIntField(term174911, term174911.getClass(), "playedMusicLevel2", 0);
        setLongField(term174911, term174911.getClass(), "playedUserId3", 0L);
        setField(term174911, term174911.getClass(), "playedUserName3", null);
        setIntField(term174911, term174911.getClass(), "playedMusicLevel3", 0);
        setIntField(term174911, term174911.getClass(), "achievement", 0);
        setIntField(term174911, term174911.getClass(), "score", 0);
        setIntField(term174911, term174911.getClass(), "tapScore", 0);
        setIntField(term174911, term174911.getClass(), "holdScore", 0);
        setIntField(term174911, term174911.getClass(), "slideScore", 0);
        setIntField(term174911, term174911.getClass(), "breakScore", 0);
        setIntField(term174911, term174911.getClass(), "syncRate", 0);
        setIntField(term174911, term174911.getClass(), "vsWin", 0);
        setBooleanField(term174911, term174911.getClass(), "isAllPerfect", false);
        setIntField(term174911, term174911.getClass(), "fullCombo", 0);
        setIntField(term174911, term174911.getClass(), "maxFever", 0);
        setIntField(term174911, term174911.getClass(), "maxCombo", 0);
        setIntField(term174911, term174911.getClass(), "tapPerfect", 0);
        setIntField(term174911, term174911.getClass(), "tapGreat", 0);
        setIntField(term174911, term174911.getClass(), "tapGood", 0);
        setIntField(term174911, term174911.getClass(), "tapBad", 0);
        setIntField(term174911, term174911.getClass(), "holdPerfect", 0);
        setIntField(term174911, term174911.getClass(), "holdGreat", 0);
        setIntField(term174911, term174911.getClass(), "holdGood", 0);
        setIntField(term174911, term174911.getClass(), "holdBad", 0);
        setIntField(term174911, term174911.getClass(), "slidePerfect", 0);
        setIntField(term174911, term174911.getClass(), "slideGreat", 0);
        setIntField(term174911, term174911.getClass(), "slideGood", 0);
        setIntField(term174911, term174911.getClass(), "slideBad", 0);
        setIntField(term174911, term174911.getClass(), "breakPerfect", 0);
        setIntField(term174911, term174911.getClass(), "breakGreat", 0);
        setIntField(term174911, term174911.getClass(), "breakGood", 0);
        setIntField(term174911, term174911.getClass(), "breakBad", 0);
        setBooleanField(term174911, term174911.getClass(), "isTrackSkip", false);
        setBooleanField(term174911, term174911.getClass(), "isHighScore", false);
        setBooleanField(term174911, term174911.getClass(), "isChallengeTrack", false);
        setIntField(term174911, term174911.getClass(), "challengeLife", 0);
        setIntField(term174911, term174911.getClass(), "challengeRemain", 0);
        setIntField(term174911, term174911.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxFever", argTypes, term174911, args);
    }

};


