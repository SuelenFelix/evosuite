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

public class UserPlaylog_getPlayedUserName1_1261358706147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173939;

    public UserPlaylog_getPlayedUserName1_1261358706147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173939 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173939, term173939.getClass(), "id", 0L);
        setField(term173939, term173939.getClass(), "user", null);
        setIntField(term173939, term173939.getClass(), "orderId", 0);
        setLongField(term173939, term173939.getClass(), "sortNumber", 0L);
        setIntField(term173939, term173939.getClass(), "placeId", 0);
        setField(term173939, term173939.getClass(), "placeName", null);
        setField(term173939, term173939.getClass(), "country", null);
        setIntField(term173939, term173939.getClass(), "regionId", 0);
        setField(term173939, term173939.getClass(), "playDate", null);
        setField(term173939, term173939.getClass(), "userPlayDate", null);
        setIntField(term173939, term173939.getClass(), "musicId", 0);
        setIntField(term173939, term173939.getClass(), "level", 0);
        setIntField(term173939, term173939.getClass(), "gameMode", 0);
        setIntField(term173939, term173939.getClass(), "rivalNum", 0);
        setIntField(term173939, term173939.getClass(), "track", 0);
        setIntField(term173939, term173939.getClass(), "eventId", 0);
        setBooleanField(term173939, term173939.getClass(), "isFreeToPlay", false);
        setIntField(term173939, term173939.getClass(), "playerRating", 0);
        setLongField(term173939, term173939.getClass(), "playedUserId1", 0L);
        setField(term173939, term173939.getClass(), "playedUserName1", null);
        setIntField(term173939, term173939.getClass(), "playedMusicLevel1", 0);
        setLongField(term173939, term173939.getClass(), "playedUserId2", 0L);
        setField(term173939, term173939.getClass(), "playedUserName2", null);
        setIntField(term173939, term173939.getClass(), "playedMusicLevel2", 0);
        setLongField(term173939, term173939.getClass(), "playedUserId3", 0L);
        setField(term173939, term173939.getClass(), "playedUserName3", null);
        setIntField(term173939, term173939.getClass(), "playedMusicLevel3", 0);
        setIntField(term173939, term173939.getClass(), "achievement", 0);
        setIntField(term173939, term173939.getClass(), "score", 0);
        setIntField(term173939, term173939.getClass(), "tapScore", 0);
        setIntField(term173939, term173939.getClass(), "holdScore", 0);
        setIntField(term173939, term173939.getClass(), "slideScore", 0);
        setIntField(term173939, term173939.getClass(), "breakScore", 0);
        setIntField(term173939, term173939.getClass(), "syncRate", 0);
        setIntField(term173939, term173939.getClass(), "vsWin", 0);
        setBooleanField(term173939, term173939.getClass(), "isAllPerfect", false);
        setIntField(term173939, term173939.getClass(), "fullCombo", 0);
        setIntField(term173939, term173939.getClass(), "maxFever", 0);
        setIntField(term173939, term173939.getClass(), "maxCombo", 0);
        setIntField(term173939, term173939.getClass(), "tapPerfect", 0);
        setIntField(term173939, term173939.getClass(), "tapGreat", 0);
        setIntField(term173939, term173939.getClass(), "tapGood", 0);
        setIntField(term173939, term173939.getClass(), "tapBad", 0);
        setIntField(term173939, term173939.getClass(), "holdPerfect", 0);
        setIntField(term173939, term173939.getClass(), "holdGreat", 0);
        setIntField(term173939, term173939.getClass(), "holdGood", 0);
        setIntField(term173939, term173939.getClass(), "holdBad", 0);
        setIntField(term173939, term173939.getClass(), "slidePerfect", 0);
        setIntField(term173939, term173939.getClass(), "slideGreat", 0);
        setIntField(term173939, term173939.getClass(), "slideGood", 0);
        setIntField(term173939, term173939.getClass(), "slideBad", 0);
        setIntField(term173939, term173939.getClass(), "breakPerfect", 0);
        setIntField(term173939, term173939.getClass(), "breakGreat", 0);
        setIntField(term173939, term173939.getClass(), "breakGood", 0);
        setIntField(term173939, term173939.getClass(), "breakBad", 0);
        setBooleanField(term173939, term173939.getClass(), "isTrackSkip", false);
        setBooleanField(term173939, term173939.getClass(), "isHighScore", false);
        setBooleanField(term173939, term173939.getClass(), "isChallengeTrack", false);
        setIntField(term173939, term173939.getClass(), "challengeLife", 0);
        setIntField(term173939, term173939.getClass(), "challengeRemain", 0);
        setIntField(term173939, term173939.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName1", argTypes, term173939, args);
    }

};


