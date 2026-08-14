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

public class UserPlaylog_isFreeToPlay_79677216145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173833;

    public UserPlaylog_isFreeToPlay_79677216145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173833 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173833, term173833.getClass(), "id", 0L);
        setField(term173833, term173833.getClass(), "user", null);
        setIntField(term173833, term173833.getClass(), "orderId", 0);
        setLongField(term173833, term173833.getClass(), "sortNumber", 0L);
        setIntField(term173833, term173833.getClass(), "placeId", 0);
        setField(term173833, term173833.getClass(), "placeName", null);
        setField(term173833, term173833.getClass(), "country", null);
        setIntField(term173833, term173833.getClass(), "regionId", 0);
        setField(term173833, term173833.getClass(), "playDate", null);
        setField(term173833, term173833.getClass(), "userPlayDate", null);
        setIntField(term173833, term173833.getClass(), "musicId", 0);
        setIntField(term173833, term173833.getClass(), "level", 0);
        setIntField(term173833, term173833.getClass(), "gameMode", 0);
        setIntField(term173833, term173833.getClass(), "rivalNum", 0);
        setIntField(term173833, term173833.getClass(), "track", 0);
        setIntField(term173833, term173833.getClass(), "eventId", 0);
        setBooleanField(term173833, term173833.getClass(), "isFreeToPlay", false);
        setIntField(term173833, term173833.getClass(), "playerRating", 0);
        setLongField(term173833, term173833.getClass(), "playedUserId1", 0L);
        setField(term173833, term173833.getClass(), "playedUserName1", null);
        setIntField(term173833, term173833.getClass(), "playedMusicLevel1", 0);
        setLongField(term173833, term173833.getClass(), "playedUserId2", 0L);
        setField(term173833, term173833.getClass(), "playedUserName2", null);
        setIntField(term173833, term173833.getClass(), "playedMusicLevel2", 0);
        setLongField(term173833, term173833.getClass(), "playedUserId3", 0L);
        setField(term173833, term173833.getClass(), "playedUserName3", null);
        setIntField(term173833, term173833.getClass(), "playedMusicLevel3", 0);
        setIntField(term173833, term173833.getClass(), "achievement", 0);
        setIntField(term173833, term173833.getClass(), "score", 0);
        setIntField(term173833, term173833.getClass(), "tapScore", 0);
        setIntField(term173833, term173833.getClass(), "holdScore", 0);
        setIntField(term173833, term173833.getClass(), "slideScore", 0);
        setIntField(term173833, term173833.getClass(), "breakScore", 0);
        setIntField(term173833, term173833.getClass(), "syncRate", 0);
        setIntField(term173833, term173833.getClass(), "vsWin", 0);
        setBooleanField(term173833, term173833.getClass(), "isAllPerfect", false);
        setIntField(term173833, term173833.getClass(), "fullCombo", 0);
        setIntField(term173833, term173833.getClass(), "maxFever", 0);
        setIntField(term173833, term173833.getClass(), "maxCombo", 0);
        setIntField(term173833, term173833.getClass(), "tapPerfect", 0);
        setIntField(term173833, term173833.getClass(), "tapGreat", 0);
        setIntField(term173833, term173833.getClass(), "tapGood", 0);
        setIntField(term173833, term173833.getClass(), "tapBad", 0);
        setIntField(term173833, term173833.getClass(), "holdPerfect", 0);
        setIntField(term173833, term173833.getClass(), "holdGreat", 0);
        setIntField(term173833, term173833.getClass(), "holdGood", 0);
        setIntField(term173833, term173833.getClass(), "holdBad", 0);
        setIntField(term173833, term173833.getClass(), "slidePerfect", 0);
        setIntField(term173833, term173833.getClass(), "slideGreat", 0);
        setIntField(term173833, term173833.getClass(), "slideGood", 0);
        setIntField(term173833, term173833.getClass(), "slideBad", 0);
        setIntField(term173833, term173833.getClass(), "breakPerfect", 0);
        setIntField(term173833, term173833.getClass(), "breakGreat", 0);
        setIntField(term173833, term173833.getClass(), "breakGood", 0);
        setIntField(term173833, term173833.getClass(), "breakBad", 0);
        setBooleanField(term173833, term173833.getClass(), "isTrackSkip", false);
        setBooleanField(term173833, term173833.getClass(), "isHighScore", false);
        setBooleanField(term173833, term173833.getClass(), "isChallengeTrack", false);
        setIntField(term173833, term173833.getClass(), "challengeLife", 0);
        setIntField(term173833, term173833.getClass(), "challengeRemain", 0);
        setIntField(term173833, term173833.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFreeToPlay", argTypes, term173833, args);
    }

};


