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

public class UserPlaylog_isAllPerfect_1893739471163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174803;

    public UserPlaylog_isAllPerfect_1893739471163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174803 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term174803, term174803.getClass(), "id", 0L);
        setField(term174803, term174803.getClass(), "user", null);
        setIntField(term174803, term174803.getClass(), "orderId", 0);
        setLongField(term174803, term174803.getClass(), "sortNumber", 0L);
        setIntField(term174803, term174803.getClass(), "placeId", 0);
        setField(term174803, term174803.getClass(), "placeName", null);
        setField(term174803, term174803.getClass(), "country", null);
        setIntField(term174803, term174803.getClass(), "regionId", 0);
        setField(term174803, term174803.getClass(), "playDate", null);
        setField(term174803, term174803.getClass(), "userPlayDate", null);
        setIntField(term174803, term174803.getClass(), "musicId", 0);
        setIntField(term174803, term174803.getClass(), "level", 0);
        setIntField(term174803, term174803.getClass(), "gameMode", 0);
        setIntField(term174803, term174803.getClass(), "rivalNum", 0);
        setIntField(term174803, term174803.getClass(), "track", 0);
        setIntField(term174803, term174803.getClass(), "eventId", 0);
        setBooleanField(term174803, term174803.getClass(), "isFreeToPlay", false);
        setIntField(term174803, term174803.getClass(), "playerRating", 0);
        setLongField(term174803, term174803.getClass(), "playedUserId1", 0L);
        setField(term174803, term174803.getClass(), "playedUserName1", null);
        setIntField(term174803, term174803.getClass(), "playedMusicLevel1", 0);
        setLongField(term174803, term174803.getClass(), "playedUserId2", 0L);
        setField(term174803, term174803.getClass(), "playedUserName2", null);
        setIntField(term174803, term174803.getClass(), "playedMusicLevel2", 0);
        setLongField(term174803, term174803.getClass(), "playedUserId3", 0L);
        setField(term174803, term174803.getClass(), "playedUserName3", null);
        setIntField(term174803, term174803.getClass(), "playedMusicLevel3", 0);
        setIntField(term174803, term174803.getClass(), "achievement", 0);
        setIntField(term174803, term174803.getClass(), "score", 0);
        setIntField(term174803, term174803.getClass(), "tapScore", 0);
        setIntField(term174803, term174803.getClass(), "holdScore", 0);
        setIntField(term174803, term174803.getClass(), "slideScore", 0);
        setIntField(term174803, term174803.getClass(), "breakScore", 0);
        setIntField(term174803, term174803.getClass(), "syncRate", 0);
        setIntField(term174803, term174803.getClass(), "vsWin", 0);
        setBooleanField(term174803, term174803.getClass(), "isAllPerfect", false);
        setIntField(term174803, term174803.getClass(), "fullCombo", 0);
        setIntField(term174803, term174803.getClass(), "maxFever", 0);
        setIntField(term174803, term174803.getClass(), "maxCombo", 0);
        setIntField(term174803, term174803.getClass(), "tapPerfect", 0);
        setIntField(term174803, term174803.getClass(), "tapGreat", 0);
        setIntField(term174803, term174803.getClass(), "tapGood", 0);
        setIntField(term174803, term174803.getClass(), "tapBad", 0);
        setIntField(term174803, term174803.getClass(), "holdPerfect", 0);
        setIntField(term174803, term174803.getClass(), "holdGreat", 0);
        setIntField(term174803, term174803.getClass(), "holdGood", 0);
        setIntField(term174803, term174803.getClass(), "holdBad", 0);
        setIntField(term174803, term174803.getClass(), "slidePerfect", 0);
        setIntField(term174803, term174803.getClass(), "slideGreat", 0);
        setIntField(term174803, term174803.getClass(), "slideGood", 0);
        setIntField(term174803, term174803.getClass(), "slideBad", 0);
        setIntField(term174803, term174803.getClass(), "breakPerfect", 0);
        setIntField(term174803, term174803.getClass(), "breakGreat", 0);
        setIntField(term174803, term174803.getClass(), "breakGood", 0);
        setIntField(term174803, term174803.getClass(), "breakBad", 0);
        setBooleanField(term174803, term174803.getClass(), "isTrackSkip", false);
        setBooleanField(term174803, term174803.getClass(), "isHighScore", false);
        setBooleanField(term174803, term174803.getClass(), "isChallengeTrack", false);
        setIntField(term174803, term174803.getClass(), "challengeLife", 0);
        setIntField(term174803, term174803.getClass(), "challengeRemain", 0);
        setIntField(term174803, term174803.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllPerfect", argTypes, term174803, args);
    }

};


