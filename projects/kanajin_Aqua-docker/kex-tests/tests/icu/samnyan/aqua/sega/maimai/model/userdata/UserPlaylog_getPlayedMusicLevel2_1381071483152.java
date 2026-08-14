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

public class UserPlaylog_getPlayedMusicLevel2_1381071483152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174211;

    public UserPlaylog_getPlayedMusicLevel2_1381071483152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174211 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term174211, term174211.getClass(), "id", 0L);
        setField(term174211, term174211.getClass(), "user", null);
        setIntField(term174211, term174211.getClass(), "orderId", 0);
        setLongField(term174211, term174211.getClass(), "sortNumber", 0L);
        setIntField(term174211, term174211.getClass(), "placeId", 0);
        setField(term174211, term174211.getClass(), "placeName", null);
        setField(term174211, term174211.getClass(), "country", null);
        setIntField(term174211, term174211.getClass(), "regionId", 0);
        setField(term174211, term174211.getClass(), "playDate", null);
        setField(term174211, term174211.getClass(), "userPlayDate", null);
        setIntField(term174211, term174211.getClass(), "musicId", 0);
        setIntField(term174211, term174211.getClass(), "level", 0);
        setIntField(term174211, term174211.getClass(), "gameMode", 0);
        setIntField(term174211, term174211.getClass(), "rivalNum", 0);
        setIntField(term174211, term174211.getClass(), "track", 0);
        setIntField(term174211, term174211.getClass(), "eventId", 0);
        setBooleanField(term174211, term174211.getClass(), "isFreeToPlay", false);
        setIntField(term174211, term174211.getClass(), "playerRating", 0);
        setLongField(term174211, term174211.getClass(), "playedUserId1", 0L);
        setField(term174211, term174211.getClass(), "playedUserName1", null);
        setIntField(term174211, term174211.getClass(), "playedMusicLevel1", 0);
        setLongField(term174211, term174211.getClass(), "playedUserId2", 0L);
        setField(term174211, term174211.getClass(), "playedUserName2", null);
        setIntField(term174211, term174211.getClass(), "playedMusicLevel2", 0);
        setLongField(term174211, term174211.getClass(), "playedUserId3", 0L);
        setField(term174211, term174211.getClass(), "playedUserName3", null);
        setIntField(term174211, term174211.getClass(), "playedMusicLevel3", 0);
        setIntField(term174211, term174211.getClass(), "achievement", 0);
        setIntField(term174211, term174211.getClass(), "score", 0);
        setIntField(term174211, term174211.getClass(), "tapScore", 0);
        setIntField(term174211, term174211.getClass(), "holdScore", 0);
        setIntField(term174211, term174211.getClass(), "slideScore", 0);
        setIntField(term174211, term174211.getClass(), "breakScore", 0);
        setIntField(term174211, term174211.getClass(), "syncRate", 0);
        setIntField(term174211, term174211.getClass(), "vsWin", 0);
        setBooleanField(term174211, term174211.getClass(), "isAllPerfect", false);
        setIntField(term174211, term174211.getClass(), "fullCombo", 0);
        setIntField(term174211, term174211.getClass(), "maxFever", 0);
        setIntField(term174211, term174211.getClass(), "maxCombo", 0);
        setIntField(term174211, term174211.getClass(), "tapPerfect", 0);
        setIntField(term174211, term174211.getClass(), "tapGreat", 0);
        setIntField(term174211, term174211.getClass(), "tapGood", 0);
        setIntField(term174211, term174211.getClass(), "tapBad", 0);
        setIntField(term174211, term174211.getClass(), "holdPerfect", 0);
        setIntField(term174211, term174211.getClass(), "holdGreat", 0);
        setIntField(term174211, term174211.getClass(), "holdGood", 0);
        setIntField(term174211, term174211.getClass(), "holdBad", 0);
        setIntField(term174211, term174211.getClass(), "slidePerfect", 0);
        setIntField(term174211, term174211.getClass(), "slideGreat", 0);
        setIntField(term174211, term174211.getClass(), "slideGood", 0);
        setIntField(term174211, term174211.getClass(), "slideBad", 0);
        setIntField(term174211, term174211.getClass(), "breakPerfect", 0);
        setIntField(term174211, term174211.getClass(), "breakGreat", 0);
        setIntField(term174211, term174211.getClass(), "breakGood", 0);
        setIntField(term174211, term174211.getClass(), "breakBad", 0);
        setBooleanField(term174211, term174211.getClass(), "isTrackSkip", false);
        setBooleanField(term174211, term174211.getClass(), "isHighScore", false);
        setBooleanField(term174211, term174211.getClass(), "isChallengeTrack", false);
        setIntField(term174211, term174211.getClass(), "challengeLife", 0);
        setIntField(term174211, term174211.getClass(), "challengeRemain", 0);
        setIntField(term174211, term174211.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel2", argTypes, term174211, args);
    }

};


