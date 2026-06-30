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

public class UserPlaylog_getEventId_1618326330143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173723;

    public UserPlaylog_getEventId_1618326330143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173723 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173723, term173723.getClass(), "id", 0L);
        setField(term173723, term173723.getClass(), "user", null);
        setIntField(term173723, term173723.getClass(), "orderId", 0);
        setLongField(term173723, term173723.getClass(), "sortNumber", 0L);
        setIntField(term173723, term173723.getClass(), "placeId", 0);
        setField(term173723, term173723.getClass(), "placeName", null);
        setField(term173723, term173723.getClass(), "country", null);
        setIntField(term173723, term173723.getClass(), "regionId", 0);
        setField(term173723, term173723.getClass(), "playDate", null);
        setField(term173723, term173723.getClass(), "userPlayDate", null);
        setIntField(term173723, term173723.getClass(), "musicId", 0);
        setIntField(term173723, term173723.getClass(), "level", 0);
        setIntField(term173723, term173723.getClass(), "gameMode", 0);
        setIntField(term173723, term173723.getClass(), "rivalNum", 0);
        setIntField(term173723, term173723.getClass(), "track", 0);
        setIntField(term173723, term173723.getClass(), "eventId", 0);
        setBooleanField(term173723, term173723.getClass(), "isFreeToPlay", false);
        setIntField(term173723, term173723.getClass(), "playerRating", 0);
        setLongField(term173723, term173723.getClass(), "playedUserId1", 0L);
        setField(term173723, term173723.getClass(), "playedUserName1", null);
        setIntField(term173723, term173723.getClass(), "playedMusicLevel1", 0);
        setLongField(term173723, term173723.getClass(), "playedUserId2", 0L);
        setField(term173723, term173723.getClass(), "playedUserName2", null);
        setIntField(term173723, term173723.getClass(), "playedMusicLevel2", 0);
        setLongField(term173723, term173723.getClass(), "playedUserId3", 0L);
        setField(term173723, term173723.getClass(), "playedUserName3", null);
        setIntField(term173723, term173723.getClass(), "playedMusicLevel3", 0);
        setIntField(term173723, term173723.getClass(), "achievement", 0);
        setIntField(term173723, term173723.getClass(), "score", 0);
        setIntField(term173723, term173723.getClass(), "tapScore", 0);
        setIntField(term173723, term173723.getClass(), "holdScore", 0);
        setIntField(term173723, term173723.getClass(), "slideScore", 0);
        setIntField(term173723, term173723.getClass(), "breakScore", 0);
        setIntField(term173723, term173723.getClass(), "syncRate", 0);
        setIntField(term173723, term173723.getClass(), "vsWin", 0);
        setBooleanField(term173723, term173723.getClass(), "isAllPerfect", false);
        setIntField(term173723, term173723.getClass(), "fullCombo", 0);
        setIntField(term173723, term173723.getClass(), "maxFever", 0);
        setIntField(term173723, term173723.getClass(), "maxCombo", 0);
        setIntField(term173723, term173723.getClass(), "tapPerfect", 0);
        setIntField(term173723, term173723.getClass(), "tapGreat", 0);
        setIntField(term173723, term173723.getClass(), "tapGood", 0);
        setIntField(term173723, term173723.getClass(), "tapBad", 0);
        setIntField(term173723, term173723.getClass(), "holdPerfect", 0);
        setIntField(term173723, term173723.getClass(), "holdGreat", 0);
        setIntField(term173723, term173723.getClass(), "holdGood", 0);
        setIntField(term173723, term173723.getClass(), "holdBad", 0);
        setIntField(term173723, term173723.getClass(), "slidePerfect", 0);
        setIntField(term173723, term173723.getClass(), "slideGreat", 0);
        setIntField(term173723, term173723.getClass(), "slideGood", 0);
        setIntField(term173723, term173723.getClass(), "slideBad", 0);
        setIntField(term173723, term173723.getClass(), "breakPerfect", 0);
        setIntField(term173723, term173723.getClass(), "breakGreat", 0);
        setIntField(term173723, term173723.getClass(), "breakGood", 0);
        setIntField(term173723, term173723.getClass(), "breakBad", 0);
        setBooleanField(term173723, term173723.getClass(), "isTrackSkip", false);
        setBooleanField(term173723, term173723.getClass(), "isHighScore", false);
        setBooleanField(term173723, term173723.getClass(), "isChallengeTrack", false);
        setIntField(term173723, term173723.getClass(), "challengeLife", 0);
        setIntField(term173723, term173723.getClass(), "challengeRemain", 0);
        setIntField(term173723, term173723.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term173723, args);
    }

};


