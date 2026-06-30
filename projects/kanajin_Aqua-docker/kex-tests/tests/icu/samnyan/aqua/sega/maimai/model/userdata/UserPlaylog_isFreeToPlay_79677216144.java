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

public class UserPlaylog_isFreeToPlay_79677216144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173777;

    public UserPlaylog_isFreeToPlay_79677216144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173777 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173777, term173777.getClass(), "id", 0L);
        setField(term173777, term173777.getClass(), "user", null);
        setIntField(term173777, term173777.getClass(), "orderId", 0);
        setLongField(term173777, term173777.getClass(), "sortNumber", 0L);
        setIntField(term173777, term173777.getClass(), "placeId", 0);
        setField(term173777, term173777.getClass(), "placeName", null);
        setField(term173777, term173777.getClass(), "country", null);
        setIntField(term173777, term173777.getClass(), "regionId", 0);
        setField(term173777, term173777.getClass(), "playDate", null);
        setField(term173777, term173777.getClass(), "userPlayDate", null);
        setIntField(term173777, term173777.getClass(), "musicId", 0);
        setIntField(term173777, term173777.getClass(), "level", 0);
        setIntField(term173777, term173777.getClass(), "gameMode", 0);
        setIntField(term173777, term173777.getClass(), "rivalNum", 0);
        setIntField(term173777, term173777.getClass(), "track", 0);
        setIntField(term173777, term173777.getClass(), "eventId", 0);
        setBooleanField(term173777, term173777.getClass(), "isFreeToPlay", false);
        setIntField(term173777, term173777.getClass(), "playerRating", 0);
        setLongField(term173777, term173777.getClass(), "playedUserId1", 0L);
        setField(term173777, term173777.getClass(), "playedUserName1", null);
        setIntField(term173777, term173777.getClass(), "playedMusicLevel1", 0);
        setLongField(term173777, term173777.getClass(), "playedUserId2", 0L);
        setField(term173777, term173777.getClass(), "playedUserName2", null);
        setIntField(term173777, term173777.getClass(), "playedMusicLevel2", 0);
        setLongField(term173777, term173777.getClass(), "playedUserId3", 0L);
        setField(term173777, term173777.getClass(), "playedUserName3", null);
        setIntField(term173777, term173777.getClass(), "playedMusicLevel3", 0);
        setIntField(term173777, term173777.getClass(), "achievement", 0);
        setIntField(term173777, term173777.getClass(), "score", 0);
        setIntField(term173777, term173777.getClass(), "tapScore", 0);
        setIntField(term173777, term173777.getClass(), "holdScore", 0);
        setIntField(term173777, term173777.getClass(), "slideScore", 0);
        setIntField(term173777, term173777.getClass(), "breakScore", 0);
        setIntField(term173777, term173777.getClass(), "syncRate", 0);
        setIntField(term173777, term173777.getClass(), "vsWin", 0);
        setBooleanField(term173777, term173777.getClass(), "isAllPerfect", false);
        setIntField(term173777, term173777.getClass(), "fullCombo", 0);
        setIntField(term173777, term173777.getClass(), "maxFever", 0);
        setIntField(term173777, term173777.getClass(), "maxCombo", 0);
        setIntField(term173777, term173777.getClass(), "tapPerfect", 0);
        setIntField(term173777, term173777.getClass(), "tapGreat", 0);
        setIntField(term173777, term173777.getClass(), "tapGood", 0);
        setIntField(term173777, term173777.getClass(), "tapBad", 0);
        setIntField(term173777, term173777.getClass(), "holdPerfect", 0);
        setIntField(term173777, term173777.getClass(), "holdGreat", 0);
        setIntField(term173777, term173777.getClass(), "holdGood", 0);
        setIntField(term173777, term173777.getClass(), "holdBad", 0);
        setIntField(term173777, term173777.getClass(), "slidePerfect", 0);
        setIntField(term173777, term173777.getClass(), "slideGreat", 0);
        setIntField(term173777, term173777.getClass(), "slideGood", 0);
        setIntField(term173777, term173777.getClass(), "slideBad", 0);
        setIntField(term173777, term173777.getClass(), "breakPerfect", 0);
        setIntField(term173777, term173777.getClass(), "breakGreat", 0);
        setIntField(term173777, term173777.getClass(), "breakGood", 0);
        setIntField(term173777, term173777.getClass(), "breakBad", 0);
        setBooleanField(term173777, term173777.getClass(), "isTrackSkip", false);
        setBooleanField(term173777, term173777.getClass(), "isHighScore", false);
        setBooleanField(term173777, term173777.getClass(), "isChallengeTrack", false);
        setIntField(term173777, term173777.getClass(), "challengeLife", 0);
        setIntField(term173777, term173777.getClass(), "challengeRemain", 0);
        setIntField(term173777, term173777.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFreeToPlay", argTypes, term173777, args);
    }

};


