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

public class UserPlaylog_getPlayedUserName2_1261359667150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000467;

    public UserPlaylog_getPlayedUserName2_1261359667150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4000467 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4000467, term4000467.getClass(), "id", 0L);
        setField(term4000467, term4000467.getClass(), "user", null);
        setIntField(term4000467, term4000467.getClass(), "orderId", 0);
        setLongField(term4000467, term4000467.getClass(), "sortNumber", 0L);
        setIntField(term4000467, term4000467.getClass(), "placeId", 0);
        setField(term4000467, term4000467.getClass(), "placeName", null);
        setField(term4000467, term4000467.getClass(), "country", null);
        setIntField(term4000467, term4000467.getClass(), "regionId", 0);
        setField(term4000467, term4000467.getClass(), "playDate", null);
        setField(term4000467, term4000467.getClass(), "userPlayDate", null);
        setIntField(term4000467, term4000467.getClass(), "musicId", 0);
        setIntField(term4000467, term4000467.getClass(), "level", 0);
        setIntField(term4000467, term4000467.getClass(), "gameMode", 0);
        setIntField(term4000467, term4000467.getClass(), "rivalNum", 0);
        setIntField(term4000467, term4000467.getClass(), "track", 0);
        setIntField(term4000467, term4000467.getClass(), "eventId", 0);
        setBooleanField(term4000467, term4000467.getClass(), "isFreeToPlay", false);
        setIntField(term4000467, term4000467.getClass(), "playerRating", 0);
        setLongField(term4000467, term4000467.getClass(), "playedUserId1", 0L);
        setField(term4000467, term4000467.getClass(), "playedUserName1", null);
        setIntField(term4000467, term4000467.getClass(), "playedMusicLevel1", 0);
        setLongField(term4000467, term4000467.getClass(), "playedUserId2", 0L);
        setField(term4000467, term4000467.getClass(), "playedUserName2", null);
        setIntField(term4000467, term4000467.getClass(), "playedMusicLevel2", 0);
        setLongField(term4000467, term4000467.getClass(), "playedUserId3", 0L);
        setField(term4000467, term4000467.getClass(), "playedUserName3", null);
        setIntField(term4000467, term4000467.getClass(), "playedMusicLevel3", 0);
        setIntField(term4000467, term4000467.getClass(), "achievement", 0);
        setIntField(term4000467, term4000467.getClass(), "score", 0);
        setIntField(term4000467, term4000467.getClass(), "tapScore", 0);
        setIntField(term4000467, term4000467.getClass(), "holdScore", 0);
        setIntField(term4000467, term4000467.getClass(), "slideScore", 0);
        setIntField(term4000467, term4000467.getClass(), "breakScore", 0);
        setIntField(term4000467, term4000467.getClass(), "syncRate", 0);
        setIntField(term4000467, term4000467.getClass(), "vsWin", 0);
        setBooleanField(term4000467, term4000467.getClass(), "isAllPerfect", false);
        setIntField(term4000467, term4000467.getClass(), "fullCombo", 0);
        setIntField(term4000467, term4000467.getClass(), "maxFever", 0);
        setIntField(term4000467, term4000467.getClass(), "maxCombo", 0);
        setIntField(term4000467, term4000467.getClass(), "tapPerfect", 0);
        setIntField(term4000467, term4000467.getClass(), "tapGreat", 0);
        setIntField(term4000467, term4000467.getClass(), "tapGood", 0);
        setIntField(term4000467, term4000467.getClass(), "tapBad", 0);
        setIntField(term4000467, term4000467.getClass(), "holdPerfect", 0);
        setIntField(term4000467, term4000467.getClass(), "holdGreat", 0);
        setIntField(term4000467, term4000467.getClass(), "holdGood", 0);
        setIntField(term4000467, term4000467.getClass(), "holdBad", 0);
        setIntField(term4000467, term4000467.getClass(), "slidePerfect", 0);
        setIntField(term4000467, term4000467.getClass(), "slideGreat", 0);
        setIntField(term4000467, term4000467.getClass(), "slideGood", 0);
        setIntField(term4000467, term4000467.getClass(), "slideBad", 0);
        setIntField(term4000467, term4000467.getClass(), "breakPerfect", 0);
        setIntField(term4000467, term4000467.getClass(), "breakGreat", 0);
        setIntField(term4000467, term4000467.getClass(), "breakGood", 0);
        setIntField(term4000467, term4000467.getClass(), "breakBad", 0);
        setBooleanField(term4000467, term4000467.getClass(), "isTrackSkip", false);
        setBooleanField(term4000467, term4000467.getClass(), "isHighScore", false);
        setBooleanField(term4000467, term4000467.getClass(), "isChallengeTrack", false);
        setIntField(term4000467, term4000467.getClass(), "challengeLife", 0);
        setIntField(term4000467, term4000467.getClass(), "challengeRemain", 0);
        setIntField(term4000467, term4000467.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName2", argTypes, term4000467, args);
    }

};


