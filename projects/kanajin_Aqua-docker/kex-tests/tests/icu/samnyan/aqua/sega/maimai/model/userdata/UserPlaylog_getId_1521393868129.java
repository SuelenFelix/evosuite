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

public class UserPlaylog_getId_1521393868129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172969;

    public UserPlaylog_getId_1521393868129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term172969, term172969.getClass(), "id", 0L);
        setField(term172969, term172969.getClass(), "user", null);
        setIntField(term172969, term172969.getClass(), "orderId", 0);
        setLongField(term172969, term172969.getClass(), "sortNumber", 0L);
        setIntField(term172969, term172969.getClass(), "placeId", 0);
        setField(term172969, term172969.getClass(), "placeName", null);
        setField(term172969, term172969.getClass(), "country", null);
        setIntField(term172969, term172969.getClass(), "regionId", 0);
        setField(term172969, term172969.getClass(), "playDate", null);
        setField(term172969, term172969.getClass(), "userPlayDate", null);
        setIntField(term172969, term172969.getClass(), "musicId", 0);
        setIntField(term172969, term172969.getClass(), "level", 0);
        setIntField(term172969, term172969.getClass(), "gameMode", 0);
        setIntField(term172969, term172969.getClass(), "rivalNum", 0);
        setIntField(term172969, term172969.getClass(), "track", 0);
        setIntField(term172969, term172969.getClass(), "eventId", 0);
        setBooleanField(term172969, term172969.getClass(), "isFreeToPlay", false);
        setIntField(term172969, term172969.getClass(), "playerRating", 0);
        setLongField(term172969, term172969.getClass(), "playedUserId1", 0L);
        setField(term172969, term172969.getClass(), "playedUserName1", null);
        setIntField(term172969, term172969.getClass(), "playedMusicLevel1", 0);
        setLongField(term172969, term172969.getClass(), "playedUserId2", 0L);
        setField(term172969, term172969.getClass(), "playedUserName2", null);
        setIntField(term172969, term172969.getClass(), "playedMusicLevel2", 0);
        setLongField(term172969, term172969.getClass(), "playedUserId3", 0L);
        setField(term172969, term172969.getClass(), "playedUserName3", null);
        setIntField(term172969, term172969.getClass(), "playedMusicLevel3", 0);
        setIntField(term172969, term172969.getClass(), "achievement", 0);
        setIntField(term172969, term172969.getClass(), "score", 0);
        setIntField(term172969, term172969.getClass(), "tapScore", 0);
        setIntField(term172969, term172969.getClass(), "holdScore", 0);
        setIntField(term172969, term172969.getClass(), "slideScore", 0);
        setIntField(term172969, term172969.getClass(), "breakScore", 0);
        setIntField(term172969, term172969.getClass(), "syncRate", 0);
        setIntField(term172969, term172969.getClass(), "vsWin", 0);
        setBooleanField(term172969, term172969.getClass(), "isAllPerfect", false);
        setIntField(term172969, term172969.getClass(), "fullCombo", 0);
        setIntField(term172969, term172969.getClass(), "maxFever", 0);
        setIntField(term172969, term172969.getClass(), "maxCombo", 0);
        setIntField(term172969, term172969.getClass(), "tapPerfect", 0);
        setIntField(term172969, term172969.getClass(), "tapGreat", 0);
        setIntField(term172969, term172969.getClass(), "tapGood", 0);
        setIntField(term172969, term172969.getClass(), "tapBad", 0);
        setIntField(term172969, term172969.getClass(), "holdPerfect", 0);
        setIntField(term172969, term172969.getClass(), "holdGreat", 0);
        setIntField(term172969, term172969.getClass(), "holdGood", 0);
        setIntField(term172969, term172969.getClass(), "holdBad", 0);
        setIntField(term172969, term172969.getClass(), "slidePerfect", 0);
        setIntField(term172969, term172969.getClass(), "slideGreat", 0);
        setIntField(term172969, term172969.getClass(), "slideGood", 0);
        setIntField(term172969, term172969.getClass(), "slideBad", 0);
        setIntField(term172969, term172969.getClass(), "breakPerfect", 0);
        setIntField(term172969, term172969.getClass(), "breakGreat", 0);
        setIntField(term172969, term172969.getClass(), "breakGood", 0);
        setIntField(term172969, term172969.getClass(), "breakBad", 0);
        setBooleanField(term172969, term172969.getClass(), "isTrackSkip", false);
        setBooleanField(term172969, term172969.getClass(), "isHighScore", false);
        setBooleanField(term172969, term172969.getClass(), "isChallengeTrack", false);
        setIntField(term172969, term172969.getClass(), "challengeLife", 0);
        setIntField(term172969, term172969.getClass(), "challengeRemain", 0);
        setIntField(term172969, term172969.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term172969, args);
    }

};


