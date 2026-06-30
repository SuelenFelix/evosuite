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

public class UserPlaylog_getPlayedMusicLevel3_1381070522154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174317;

    public UserPlaylog_getPlayedMusicLevel3_1381070522154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174317 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term174317, term174317.getClass(), "id", 0L);
        setField(term174317, term174317.getClass(), "user", null);
        setIntField(term174317, term174317.getClass(), "orderId", 0);
        setLongField(term174317, term174317.getClass(), "sortNumber", 0L);
        setIntField(term174317, term174317.getClass(), "placeId", 0);
        setField(term174317, term174317.getClass(), "placeName", null);
        setField(term174317, term174317.getClass(), "country", null);
        setIntField(term174317, term174317.getClass(), "regionId", 0);
        setField(term174317, term174317.getClass(), "playDate", null);
        setField(term174317, term174317.getClass(), "userPlayDate", null);
        setIntField(term174317, term174317.getClass(), "musicId", 0);
        setIntField(term174317, term174317.getClass(), "level", 0);
        setIntField(term174317, term174317.getClass(), "gameMode", 0);
        setIntField(term174317, term174317.getClass(), "rivalNum", 0);
        setIntField(term174317, term174317.getClass(), "track", 0);
        setIntField(term174317, term174317.getClass(), "eventId", 0);
        setBooleanField(term174317, term174317.getClass(), "isFreeToPlay", false);
        setIntField(term174317, term174317.getClass(), "playerRating", 0);
        setLongField(term174317, term174317.getClass(), "playedUserId1", 0L);
        setField(term174317, term174317.getClass(), "playedUserName1", null);
        setIntField(term174317, term174317.getClass(), "playedMusicLevel1", 0);
        setLongField(term174317, term174317.getClass(), "playedUserId2", 0L);
        setField(term174317, term174317.getClass(), "playedUserName2", null);
        setIntField(term174317, term174317.getClass(), "playedMusicLevel2", 0);
        setLongField(term174317, term174317.getClass(), "playedUserId3", 0L);
        setField(term174317, term174317.getClass(), "playedUserName3", null);
        setIntField(term174317, term174317.getClass(), "playedMusicLevel3", 0);
        setIntField(term174317, term174317.getClass(), "achievement", 0);
        setIntField(term174317, term174317.getClass(), "score", 0);
        setIntField(term174317, term174317.getClass(), "tapScore", 0);
        setIntField(term174317, term174317.getClass(), "holdScore", 0);
        setIntField(term174317, term174317.getClass(), "slideScore", 0);
        setIntField(term174317, term174317.getClass(), "breakScore", 0);
        setIntField(term174317, term174317.getClass(), "syncRate", 0);
        setIntField(term174317, term174317.getClass(), "vsWin", 0);
        setBooleanField(term174317, term174317.getClass(), "isAllPerfect", false);
        setIntField(term174317, term174317.getClass(), "fullCombo", 0);
        setIntField(term174317, term174317.getClass(), "maxFever", 0);
        setIntField(term174317, term174317.getClass(), "maxCombo", 0);
        setIntField(term174317, term174317.getClass(), "tapPerfect", 0);
        setIntField(term174317, term174317.getClass(), "tapGreat", 0);
        setIntField(term174317, term174317.getClass(), "tapGood", 0);
        setIntField(term174317, term174317.getClass(), "tapBad", 0);
        setIntField(term174317, term174317.getClass(), "holdPerfect", 0);
        setIntField(term174317, term174317.getClass(), "holdGreat", 0);
        setIntField(term174317, term174317.getClass(), "holdGood", 0);
        setIntField(term174317, term174317.getClass(), "holdBad", 0);
        setIntField(term174317, term174317.getClass(), "slidePerfect", 0);
        setIntField(term174317, term174317.getClass(), "slideGreat", 0);
        setIntField(term174317, term174317.getClass(), "slideGood", 0);
        setIntField(term174317, term174317.getClass(), "slideBad", 0);
        setIntField(term174317, term174317.getClass(), "breakPerfect", 0);
        setIntField(term174317, term174317.getClass(), "breakGreat", 0);
        setIntField(term174317, term174317.getClass(), "breakGood", 0);
        setIntField(term174317, term174317.getClass(), "breakBad", 0);
        setBooleanField(term174317, term174317.getClass(), "isTrackSkip", false);
        setBooleanField(term174317, term174317.getClass(), "isHighScore", false);
        setBooleanField(term174317, term174317.getClass(), "isChallengeTrack", false);
        setIntField(term174317, term174317.getClass(), "challengeLife", 0);
        setIntField(term174317, term174317.getClass(), "challengeRemain", 0);
        setIntField(term174317, term174317.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel3", argTypes, term174317, args);
    }

};


