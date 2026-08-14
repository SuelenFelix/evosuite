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

public class UserPlaylog_setPlayedMusicLevel1_64316882210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177371;
     Object term177425;

    public UserPlaylog_setPlayedMusicLevel1_64316882210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177371 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177371, term177371.getClass(), "id", 0L);
        setField(term177371, term177371.getClass(), "user", null);
        setIntField(term177371, term177371.getClass(), "orderId", 0);
        setLongField(term177371, term177371.getClass(), "sortNumber", 0L);
        setIntField(term177371, term177371.getClass(), "placeId", 0);
        setField(term177371, term177371.getClass(), "placeName", null);
        setField(term177371, term177371.getClass(), "country", null);
        setIntField(term177371, term177371.getClass(), "regionId", 0);
        setField(term177371, term177371.getClass(), "playDate", null);
        setField(term177371, term177371.getClass(), "userPlayDate", null);
        setIntField(term177371, term177371.getClass(), "musicId", 0);
        setIntField(term177371, term177371.getClass(), "level", 0);
        setIntField(term177371, term177371.getClass(), "gameMode", 0);
        setIntField(term177371, term177371.getClass(), "rivalNum", 0);
        setIntField(term177371, term177371.getClass(), "track", 0);
        setIntField(term177371, term177371.getClass(), "eventId", 0);
        setBooleanField(term177371, term177371.getClass(), "isFreeToPlay", false);
        setIntField(term177371, term177371.getClass(), "playerRating", 0);
        setLongField(term177371, term177371.getClass(), "playedUserId1", 0L);
        setField(term177371, term177371.getClass(), "playedUserName1", null);
        setIntField(term177371, term177371.getClass(), "playedMusicLevel1", 0);
        setLongField(term177371, term177371.getClass(), "playedUserId2", 0L);
        setField(term177371, term177371.getClass(), "playedUserName2", null);
        setIntField(term177371, term177371.getClass(), "playedMusicLevel2", 0);
        setLongField(term177371, term177371.getClass(), "playedUserId3", 0L);
        setField(term177371, term177371.getClass(), "playedUserName3", null);
        setIntField(term177371, term177371.getClass(), "playedMusicLevel3", 0);
        setIntField(term177371, term177371.getClass(), "achievement", 0);
        setIntField(term177371, term177371.getClass(), "score", 0);
        setIntField(term177371, term177371.getClass(), "tapScore", 0);
        setIntField(term177371, term177371.getClass(), "holdScore", 0);
        setIntField(term177371, term177371.getClass(), "slideScore", 0);
        setIntField(term177371, term177371.getClass(), "breakScore", 0);
        setIntField(term177371, term177371.getClass(), "syncRate", 0);
        setIntField(term177371, term177371.getClass(), "vsWin", 0);
        setBooleanField(term177371, term177371.getClass(), "isAllPerfect", false);
        setIntField(term177371, term177371.getClass(), "fullCombo", 0);
        setIntField(term177371, term177371.getClass(), "maxFever", 0);
        setIntField(term177371, term177371.getClass(), "maxCombo", 0);
        setIntField(term177371, term177371.getClass(), "tapPerfect", 0);
        setIntField(term177371, term177371.getClass(), "tapGreat", 0);
        setIntField(term177371, term177371.getClass(), "tapGood", 0);
        setIntField(term177371, term177371.getClass(), "tapBad", 0);
        setIntField(term177371, term177371.getClass(), "holdPerfect", 0);
        setIntField(term177371, term177371.getClass(), "holdGreat", 0);
        setIntField(term177371, term177371.getClass(), "holdGood", 0);
        setIntField(term177371, term177371.getClass(), "holdBad", 0);
        setIntField(term177371, term177371.getClass(), "slidePerfect", 0);
        setIntField(term177371, term177371.getClass(), "slideGreat", 0);
        setIntField(term177371, term177371.getClass(), "slideGood", 0);
        setIntField(term177371, term177371.getClass(), "slideBad", 0);
        setIntField(term177371, term177371.getClass(), "breakPerfect", 0);
        setIntField(term177371, term177371.getClass(), "breakGreat", 0);
        setIntField(term177371, term177371.getClass(), "breakGood", 0);
        setIntField(term177371, term177371.getClass(), "breakBad", 0);
        setBooleanField(term177371, term177371.getClass(), "isTrackSkip", false);
        setBooleanField(term177371, term177371.getClass(), "isHighScore", false);
        setBooleanField(term177371, term177371.getClass(), "isChallengeTrack", false);
        setIntField(term177371, term177371.getClass(), "challengeLife", 0);
        setIntField(term177371, term177371.getClass(), "challengeRemain", 0);
        setIntField(term177371, term177371.getClass(), "isAllPerfectPlus", 0);
        term177425 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177425;
        callMethod(klass, "setPlayedMusicLevel1", argTypes, term177371, args);
    }

};


