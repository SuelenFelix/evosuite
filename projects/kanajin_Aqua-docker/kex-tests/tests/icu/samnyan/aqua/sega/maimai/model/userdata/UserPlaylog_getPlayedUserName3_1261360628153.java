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

public class UserPlaylog_getPlayedUserName3_1261360628153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000629;

    public UserPlaylog_getPlayedUserName3_1261360628153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4000629 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4000629, term4000629.getClass(), "id", 0L);
        setField(term4000629, term4000629.getClass(), "user", null);
        setIntField(term4000629, term4000629.getClass(), "orderId", 0);
        setLongField(term4000629, term4000629.getClass(), "sortNumber", 0L);
        setIntField(term4000629, term4000629.getClass(), "placeId", 0);
        setField(term4000629, term4000629.getClass(), "placeName", null);
        setField(term4000629, term4000629.getClass(), "country", null);
        setIntField(term4000629, term4000629.getClass(), "regionId", 0);
        setField(term4000629, term4000629.getClass(), "playDate", null);
        setField(term4000629, term4000629.getClass(), "userPlayDate", null);
        setIntField(term4000629, term4000629.getClass(), "musicId", 0);
        setIntField(term4000629, term4000629.getClass(), "level", 0);
        setIntField(term4000629, term4000629.getClass(), "gameMode", 0);
        setIntField(term4000629, term4000629.getClass(), "rivalNum", 0);
        setIntField(term4000629, term4000629.getClass(), "track", 0);
        setIntField(term4000629, term4000629.getClass(), "eventId", 0);
        setBooleanField(term4000629, term4000629.getClass(), "isFreeToPlay", false);
        setIntField(term4000629, term4000629.getClass(), "playerRating", 0);
        setLongField(term4000629, term4000629.getClass(), "playedUserId1", 0L);
        setField(term4000629, term4000629.getClass(), "playedUserName1", null);
        setIntField(term4000629, term4000629.getClass(), "playedMusicLevel1", 0);
        setLongField(term4000629, term4000629.getClass(), "playedUserId2", 0L);
        setField(term4000629, term4000629.getClass(), "playedUserName2", null);
        setIntField(term4000629, term4000629.getClass(), "playedMusicLevel2", 0);
        setLongField(term4000629, term4000629.getClass(), "playedUserId3", 0L);
        setField(term4000629, term4000629.getClass(), "playedUserName3", null);
        setIntField(term4000629, term4000629.getClass(), "playedMusicLevel3", 0);
        setIntField(term4000629, term4000629.getClass(), "achievement", 0);
        setIntField(term4000629, term4000629.getClass(), "score", 0);
        setIntField(term4000629, term4000629.getClass(), "tapScore", 0);
        setIntField(term4000629, term4000629.getClass(), "holdScore", 0);
        setIntField(term4000629, term4000629.getClass(), "slideScore", 0);
        setIntField(term4000629, term4000629.getClass(), "breakScore", 0);
        setIntField(term4000629, term4000629.getClass(), "syncRate", 0);
        setIntField(term4000629, term4000629.getClass(), "vsWin", 0);
        setBooleanField(term4000629, term4000629.getClass(), "isAllPerfect", false);
        setIntField(term4000629, term4000629.getClass(), "fullCombo", 0);
        setIntField(term4000629, term4000629.getClass(), "maxFever", 0);
        setIntField(term4000629, term4000629.getClass(), "maxCombo", 0);
        setIntField(term4000629, term4000629.getClass(), "tapPerfect", 0);
        setIntField(term4000629, term4000629.getClass(), "tapGreat", 0);
        setIntField(term4000629, term4000629.getClass(), "tapGood", 0);
        setIntField(term4000629, term4000629.getClass(), "tapBad", 0);
        setIntField(term4000629, term4000629.getClass(), "holdPerfect", 0);
        setIntField(term4000629, term4000629.getClass(), "holdGreat", 0);
        setIntField(term4000629, term4000629.getClass(), "holdGood", 0);
        setIntField(term4000629, term4000629.getClass(), "holdBad", 0);
        setIntField(term4000629, term4000629.getClass(), "slidePerfect", 0);
        setIntField(term4000629, term4000629.getClass(), "slideGreat", 0);
        setIntField(term4000629, term4000629.getClass(), "slideGood", 0);
        setIntField(term4000629, term4000629.getClass(), "slideBad", 0);
        setIntField(term4000629, term4000629.getClass(), "breakPerfect", 0);
        setIntField(term4000629, term4000629.getClass(), "breakGreat", 0);
        setIntField(term4000629, term4000629.getClass(), "breakGood", 0);
        setIntField(term4000629, term4000629.getClass(), "breakBad", 0);
        setBooleanField(term4000629, term4000629.getClass(), "isTrackSkip", false);
        setBooleanField(term4000629, term4000629.getClass(), "isHighScore", false);
        setBooleanField(term4000629, term4000629.getClass(), "isChallengeTrack", false);
        setIntField(term4000629, term4000629.getClass(), "challengeLife", 0);
        setIntField(term4000629, term4000629.getClass(), "challengeRemain", 0);
        setIntField(term4000629, term4000629.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName3", argTypes, term4000629, args);
    }

};


