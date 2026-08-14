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

public class UserPlaylog_getTrack_1566313520142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000035;

    public UserPlaylog_getTrack_1566313520142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4000035 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4000035, term4000035.getClass(), "id", 0L);
        setField(term4000035, term4000035.getClass(), "user", null);
        setIntField(term4000035, term4000035.getClass(), "orderId", 0);
        setLongField(term4000035, term4000035.getClass(), "sortNumber", 0L);
        setIntField(term4000035, term4000035.getClass(), "placeId", 0);
        setField(term4000035, term4000035.getClass(), "placeName", null);
        setField(term4000035, term4000035.getClass(), "country", null);
        setIntField(term4000035, term4000035.getClass(), "regionId", 0);
        setField(term4000035, term4000035.getClass(), "playDate", null);
        setField(term4000035, term4000035.getClass(), "userPlayDate", null);
        setIntField(term4000035, term4000035.getClass(), "musicId", 0);
        setIntField(term4000035, term4000035.getClass(), "level", 0);
        setIntField(term4000035, term4000035.getClass(), "gameMode", 0);
        setIntField(term4000035, term4000035.getClass(), "rivalNum", 0);
        setIntField(term4000035, term4000035.getClass(), "track", 0);
        setIntField(term4000035, term4000035.getClass(), "eventId", 0);
        setBooleanField(term4000035, term4000035.getClass(), "isFreeToPlay", false);
        setIntField(term4000035, term4000035.getClass(), "playerRating", 0);
        setLongField(term4000035, term4000035.getClass(), "playedUserId1", 0L);
        setField(term4000035, term4000035.getClass(), "playedUserName1", null);
        setIntField(term4000035, term4000035.getClass(), "playedMusicLevel1", 0);
        setLongField(term4000035, term4000035.getClass(), "playedUserId2", 0L);
        setField(term4000035, term4000035.getClass(), "playedUserName2", null);
        setIntField(term4000035, term4000035.getClass(), "playedMusicLevel2", 0);
        setLongField(term4000035, term4000035.getClass(), "playedUserId3", 0L);
        setField(term4000035, term4000035.getClass(), "playedUserName3", null);
        setIntField(term4000035, term4000035.getClass(), "playedMusicLevel3", 0);
        setIntField(term4000035, term4000035.getClass(), "achievement", 0);
        setIntField(term4000035, term4000035.getClass(), "score", 0);
        setIntField(term4000035, term4000035.getClass(), "tapScore", 0);
        setIntField(term4000035, term4000035.getClass(), "holdScore", 0);
        setIntField(term4000035, term4000035.getClass(), "slideScore", 0);
        setIntField(term4000035, term4000035.getClass(), "breakScore", 0);
        setIntField(term4000035, term4000035.getClass(), "syncRate", 0);
        setIntField(term4000035, term4000035.getClass(), "vsWin", 0);
        setBooleanField(term4000035, term4000035.getClass(), "isAllPerfect", false);
        setIntField(term4000035, term4000035.getClass(), "fullCombo", 0);
        setIntField(term4000035, term4000035.getClass(), "maxFever", 0);
        setIntField(term4000035, term4000035.getClass(), "maxCombo", 0);
        setIntField(term4000035, term4000035.getClass(), "tapPerfect", 0);
        setIntField(term4000035, term4000035.getClass(), "tapGreat", 0);
        setIntField(term4000035, term4000035.getClass(), "tapGood", 0);
        setIntField(term4000035, term4000035.getClass(), "tapBad", 0);
        setIntField(term4000035, term4000035.getClass(), "holdPerfect", 0);
        setIntField(term4000035, term4000035.getClass(), "holdGreat", 0);
        setIntField(term4000035, term4000035.getClass(), "holdGood", 0);
        setIntField(term4000035, term4000035.getClass(), "holdBad", 0);
        setIntField(term4000035, term4000035.getClass(), "slidePerfect", 0);
        setIntField(term4000035, term4000035.getClass(), "slideGreat", 0);
        setIntField(term4000035, term4000035.getClass(), "slideGood", 0);
        setIntField(term4000035, term4000035.getClass(), "slideBad", 0);
        setIntField(term4000035, term4000035.getClass(), "breakPerfect", 0);
        setIntField(term4000035, term4000035.getClass(), "breakGreat", 0);
        setIntField(term4000035, term4000035.getClass(), "breakGood", 0);
        setIntField(term4000035, term4000035.getClass(), "breakBad", 0);
        setBooleanField(term4000035, term4000035.getClass(), "isTrackSkip", false);
        setBooleanField(term4000035, term4000035.getClass(), "isHighScore", false);
        setBooleanField(term4000035, term4000035.getClass(), "isChallengeTrack", false);
        setIntField(term4000035, term4000035.getClass(), "challengeLife", 0);
        setIntField(term4000035, term4000035.getClass(), "challengeRemain", 0);
        setIntField(term4000035, term4000035.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrack", argTypes, term4000035, args);
    }

};


