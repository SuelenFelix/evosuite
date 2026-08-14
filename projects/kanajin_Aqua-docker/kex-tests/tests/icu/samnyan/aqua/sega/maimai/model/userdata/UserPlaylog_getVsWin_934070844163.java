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

public class UserPlaylog_getVsWin_934070844163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174805;

    public UserPlaylog_getVsWin_934070844163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174805 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term174805, term174805.getClass(), "id", 0L);
        setField(term174805, term174805.getClass(), "user", null);
        setIntField(term174805, term174805.getClass(), "orderId", 0);
        setLongField(term174805, term174805.getClass(), "sortNumber", 0L);
        setIntField(term174805, term174805.getClass(), "placeId", 0);
        setField(term174805, term174805.getClass(), "placeName", null);
        setField(term174805, term174805.getClass(), "country", null);
        setIntField(term174805, term174805.getClass(), "regionId", 0);
        setField(term174805, term174805.getClass(), "playDate", null);
        setField(term174805, term174805.getClass(), "userPlayDate", null);
        setIntField(term174805, term174805.getClass(), "musicId", 0);
        setIntField(term174805, term174805.getClass(), "level", 0);
        setIntField(term174805, term174805.getClass(), "gameMode", 0);
        setIntField(term174805, term174805.getClass(), "rivalNum", 0);
        setIntField(term174805, term174805.getClass(), "track", 0);
        setIntField(term174805, term174805.getClass(), "eventId", 0);
        setBooleanField(term174805, term174805.getClass(), "isFreeToPlay", false);
        setIntField(term174805, term174805.getClass(), "playerRating", 0);
        setLongField(term174805, term174805.getClass(), "playedUserId1", 0L);
        setField(term174805, term174805.getClass(), "playedUserName1", null);
        setIntField(term174805, term174805.getClass(), "playedMusicLevel1", 0);
        setLongField(term174805, term174805.getClass(), "playedUserId2", 0L);
        setField(term174805, term174805.getClass(), "playedUserName2", null);
        setIntField(term174805, term174805.getClass(), "playedMusicLevel2", 0);
        setLongField(term174805, term174805.getClass(), "playedUserId3", 0L);
        setField(term174805, term174805.getClass(), "playedUserName3", null);
        setIntField(term174805, term174805.getClass(), "playedMusicLevel3", 0);
        setIntField(term174805, term174805.getClass(), "achievement", 0);
        setIntField(term174805, term174805.getClass(), "score", 0);
        setIntField(term174805, term174805.getClass(), "tapScore", 0);
        setIntField(term174805, term174805.getClass(), "holdScore", 0);
        setIntField(term174805, term174805.getClass(), "slideScore", 0);
        setIntField(term174805, term174805.getClass(), "breakScore", 0);
        setIntField(term174805, term174805.getClass(), "syncRate", 0);
        setIntField(term174805, term174805.getClass(), "vsWin", 0);
        setBooleanField(term174805, term174805.getClass(), "isAllPerfect", false);
        setIntField(term174805, term174805.getClass(), "fullCombo", 0);
        setIntField(term174805, term174805.getClass(), "maxFever", 0);
        setIntField(term174805, term174805.getClass(), "maxCombo", 0);
        setIntField(term174805, term174805.getClass(), "tapPerfect", 0);
        setIntField(term174805, term174805.getClass(), "tapGreat", 0);
        setIntField(term174805, term174805.getClass(), "tapGood", 0);
        setIntField(term174805, term174805.getClass(), "tapBad", 0);
        setIntField(term174805, term174805.getClass(), "holdPerfect", 0);
        setIntField(term174805, term174805.getClass(), "holdGreat", 0);
        setIntField(term174805, term174805.getClass(), "holdGood", 0);
        setIntField(term174805, term174805.getClass(), "holdBad", 0);
        setIntField(term174805, term174805.getClass(), "slidePerfect", 0);
        setIntField(term174805, term174805.getClass(), "slideGreat", 0);
        setIntField(term174805, term174805.getClass(), "slideGood", 0);
        setIntField(term174805, term174805.getClass(), "slideBad", 0);
        setIntField(term174805, term174805.getClass(), "breakPerfect", 0);
        setIntField(term174805, term174805.getClass(), "breakGreat", 0);
        setIntField(term174805, term174805.getClass(), "breakGood", 0);
        setIntField(term174805, term174805.getClass(), "breakBad", 0);
        setBooleanField(term174805, term174805.getClass(), "isTrackSkip", false);
        setBooleanField(term174805, term174805.getClass(), "isHighScore", false);
        setBooleanField(term174805, term174805.getClass(), "isChallengeTrack", false);
        setIntField(term174805, term174805.getClass(), "challengeLife", 0);
        setIntField(term174805, term174805.getClass(), "challengeRemain", 0);
        setIntField(term174805, term174805.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVsWin", argTypes, term174805, args);
    }

};


