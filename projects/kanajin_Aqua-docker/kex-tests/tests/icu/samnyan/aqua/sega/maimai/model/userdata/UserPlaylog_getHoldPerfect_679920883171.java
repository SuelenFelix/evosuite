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

public class UserPlaylog_getHoldPerfect_679920883171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175235;

    public UserPlaylog_getHoldPerfect_679920883171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175235 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175235, term175235.getClass(), "id", 0L);
        setField(term175235, term175235.getClass(), "user", null);
        setIntField(term175235, term175235.getClass(), "orderId", 0);
        setLongField(term175235, term175235.getClass(), "sortNumber", 0L);
        setIntField(term175235, term175235.getClass(), "placeId", 0);
        setField(term175235, term175235.getClass(), "placeName", null);
        setField(term175235, term175235.getClass(), "country", null);
        setIntField(term175235, term175235.getClass(), "regionId", 0);
        setField(term175235, term175235.getClass(), "playDate", null);
        setField(term175235, term175235.getClass(), "userPlayDate", null);
        setIntField(term175235, term175235.getClass(), "musicId", 0);
        setIntField(term175235, term175235.getClass(), "level", 0);
        setIntField(term175235, term175235.getClass(), "gameMode", 0);
        setIntField(term175235, term175235.getClass(), "rivalNum", 0);
        setIntField(term175235, term175235.getClass(), "track", 0);
        setIntField(term175235, term175235.getClass(), "eventId", 0);
        setBooleanField(term175235, term175235.getClass(), "isFreeToPlay", false);
        setIntField(term175235, term175235.getClass(), "playerRating", 0);
        setLongField(term175235, term175235.getClass(), "playedUserId1", 0L);
        setField(term175235, term175235.getClass(), "playedUserName1", null);
        setIntField(term175235, term175235.getClass(), "playedMusicLevel1", 0);
        setLongField(term175235, term175235.getClass(), "playedUserId2", 0L);
        setField(term175235, term175235.getClass(), "playedUserName2", null);
        setIntField(term175235, term175235.getClass(), "playedMusicLevel2", 0);
        setLongField(term175235, term175235.getClass(), "playedUserId3", 0L);
        setField(term175235, term175235.getClass(), "playedUserName3", null);
        setIntField(term175235, term175235.getClass(), "playedMusicLevel3", 0);
        setIntField(term175235, term175235.getClass(), "achievement", 0);
        setIntField(term175235, term175235.getClass(), "score", 0);
        setIntField(term175235, term175235.getClass(), "tapScore", 0);
        setIntField(term175235, term175235.getClass(), "holdScore", 0);
        setIntField(term175235, term175235.getClass(), "slideScore", 0);
        setIntField(term175235, term175235.getClass(), "breakScore", 0);
        setIntField(term175235, term175235.getClass(), "syncRate", 0);
        setIntField(term175235, term175235.getClass(), "vsWin", 0);
        setBooleanField(term175235, term175235.getClass(), "isAllPerfect", false);
        setIntField(term175235, term175235.getClass(), "fullCombo", 0);
        setIntField(term175235, term175235.getClass(), "maxFever", 0);
        setIntField(term175235, term175235.getClass(), "maxCombo", 0);
        setIntField(term175235, term175235.getClass(), "tapPerfect", 0);
        setIntField(term175235, term175235.getClass(), "tapGreat", 0);
        setIntField(term175235, term175235.getClass(), "tapGood", 0);
        setIntField(term175235, term175235.getClass(), "tapBad", 0);
        setIntField(term175235, term175235.getClass(), "holdPerfect", 0);
        setIntField(term175235, term175235.getClass(), "holdGreat", 0);
        setIntField(term175235, term175235.getClass(), "holdGood", 0);
        setIntField(term175235, term175235.getClass(), "holdBad", 0);
        setIntField(term175235, term175235.getClass(), "slidePerfect", 0);
        setIntField(term175235, term175235.getClass(), "slideGreat", 0);
        setIntField(term175235, term175235.getClass(), "slideGood", 0);
        setIntField(term175235, term175235.getClass(), "slideBad", 0);
        setIntField(term175235, term175235.getClass(), "breakPerfect", 0);
        setIntField(term175235, term175235.getClass(), "breakGreat", 0);
        setIntField(term175235, term175235.getClass(), "breakGood", 0);
        setIntField(term175235, term175235.getClass(), "breakBad", 0);
        setBooleanField(term175235, term175235.getClass(), "isTrackSkip", false);
        setBooleanField(term175235, term175235.getClass(), "isHighScore", false);
        setBooleanField(term175235, term175235.getClass(), "isChallengeTrack", false);
        setIntField(term175235, term175235.getClass(), "challengeLife", 0);
        setIntField(term175235, term175235.getClass(), "challengeRemain", 0);
        setIntField(term175235, term175235.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldPerfect", argTypes, term175235, args);
    }

};


