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

public class UserPlaylog_getRivalNum_1878451091142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173671;

    public UserPlaylog_getRivalNum_1878451091142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173671 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173671, term173671.getClass(), "id", 0L);
        setField(term173671, term173671.getClass(), "user", null);
        setIntField(term173671, term173671.getClass(), "orderId", 0);
        setLongField(term173671, term173671.getClass(), "sortNumber", 0L);
        setIntField(term173671, term173671.getClass(), "placeId", 0);
        setField(term173671, term173671.getClass(), "placeName", null);
        setField(term173671, term173671.getClass(), "country", null);
        setIntField(term173671, term173671.getClass(), "regionId", 0);
        setField(term173671, term173671.getClass(), "playDate", null);
        setField(term173671, term173671.getClass(), "userPlayDate", null);
        setIntField(term173671, term173671.getClass(), "musicId", 0);
        setIntField(term173671, term173671.getClass(), "level", 0);
        setIntField(term173671, term173671.getClass(), "gameMode", 0);
        setIntField(term173671, term173671.getClass(), "rivalNum", 0);
        setIntField(term173671, term173671.getClass(), "track", 0);
        setIntField(term173671, term173671.getClass(), "eventId", 0);
        setBooleanField(term173671, term173671.getClass(), "isFreeToPlay", false);
        setIntField(term173671, term173671.getClass(), "playerRating", 0);
        setLongField(term173671, term173671.getClass(), "playedUserId1", 0L);
        setField(term173671, term173671.getClass(), "playedUserName1", null);
        setIntField(term173671, term173671.getClass(), "playedMusicLevel1", 0);
        setLongField(term173671, term173671.getClass(), "playedUserId2", 0L);
        setField(term173671, term173671.getClass(), "playedUserName2", null);
        setIntField(term173671, term173671.getClass(), "playedMusicLevel2", 0);
        setLongField(term173671, term173671.getClass(), "playedUserId3", 0L);
        setField(term173671, term173671.getClass(), "playedUserName3", null);
        setIntField(term173671, term173671.getClass(), "playedMusicLevel3", 0);
        setIntField(term173671, term173671.getClass(), "achievement", 0);
        setIntField(term173671, term173671.getClass(), "score", 0);
        setIntField(term173671, term173671.getClass(), "tapScore", 0);
        setIntField(term173671, term173671.getClass(), "holdScore", 0);
        setIntField(term173671, term173671.getClass(), "slideScore", 0);
        setIntField(term173671, term173671.getClass(), "breakScore", 0);
        setIntField(term173671, term173671.getClass(), "syncRate", 0);
        setIntField(term173671, term173671.getClass(), "vsWin", 0);
        setBooleanField(term173671, term173671.getClass(), "isAllPerfect", false);
        setIntField(term173671, term173671.getClass(), "fullCombo", 0);
        setIntField(term173671, term173671.getClass(), "maxFever", 0);
        setIntField(term173671, term173671.getClass(), "maxCombo", 0);
        setIntField(term173671, term173671.getClass(), "tapPerfect", 0);
        setIntField(term173671, term173671.getClass(), "tapGreat", 0);
        setIntField(term173671, term173671.getClass(), "tapGood", 0);
        setIntField(term173671, term173671.getClass(), "tapBad", 0);
        setIntField(term173671, term173671.getClass(), "holdPerfect", 0);
        setIntField(term173671, term173671.getClass(), "holdGreat", 0);
        setIntField(term173671, term173671.getClass(), "holdGood", 0);
        setIntField(term173671, term173671.getClass(), "holdBad", 0);
        setIntField(term173671, term173671.getClass(), "slidePerfect", 0);
        setIntField(term173671, term173671.getClass(), "slideGreat", 0);
        setIntField(term173671, term173671.getClass(), "slideGood", 0);
        setIntField(term173671, term173671.getClass(), "slideBad", 0);
        setIntField(term173671, term173671.getClass(), "breakPerfect", 0);
        setIntField(term173671, term173671.getClass(), "breakGreat", 0);
        setIntField(term173671, term173671.getClass(), "breakGood", 0);
        setIntField(term173671, term173671.getClass(), "breakBad", 0);
        setBooleanField(term173671, term173671.getClass(), "isTrackSkip", false);
        setBooleanField(term173671, term173671.getClass(), "isHighScore", false);
        setBooleanField(term173671, term173671.getClass(), "isChallengeTrack", false);
        setIntField(term173671, term173671.getClass(), "challengeLife", 0);
        setIntField(term173671, term173671.getClass(), "challengeRemain", 0);
        setIntField(term173671, term173671.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRivalNum", argTypes, term173671, args);
    }

};


