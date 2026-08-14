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

public class UserPlaylog_getPlayedMusicLevel1_1381072444148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000359;

    public UserPlaylog_getPlayedMusicLevel1_1381072444148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4000359 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4000359, term4000359.getClass(), "id", 0L);
        setField(term4000359, term4000359.getClass(), "user", null);
        setIntField(term4000359, term4000359.getClass(), "orderId", 0);
        setLongField(term4000359, term4000359.getClass(), "sortNumber", 0L);
        setIntField(term4000359, term4000359.getClass(), "placeId", 0);
        setField(term4000359, term4000359.getClass(), "placeName", null);
        setField(term4000359, term4000359.getClass(), "country", null);
        setIntField(term4000359, term4000359.getClass(), "regionId", 0);
        setField(term4000359, term4000359.getClass(), "playDate", null);
        setField(term4000359, term4000359.getClass(), "userPlayDate", null);
        setIntField(term4000359, term4000359.getClass(), "musicId", 0);
        setIntField(term4000359, term4000359.getClass(), "level", 0);
        setIntField(term4000359, term4000359.getClass(), "gameMode", 0);
        setIntField(term4000359, term4000359.getClass(), "rivalNum", 0);
        setIntField(term4000359, term4000359.getClass(), "track", 0);
        setIntField(term4000359, term4000359.getClass(), "eventId", 0);
        setBooleanField(term4000359, term4000359.getClass(), "isFreeToPlay", false);
        setIntField(term4000359, term4000359.getClass(), "playerRating", 0);
        setLongField(term4000359, term4000359.getClass(), "playedUserId1", 0L);
        setField(term4000359, term4000359.getClass(), "playedUserName1", null);
        setIntField(term4000359, term4000359.getClass(), "playedMusicLevel1", 0);
        setLongField(term4000359, term4000359.getClass(), "playedUserId2", 0L);
        setField(term4000359, term4000359.getClass(), "playedUserName2", null);
        setIntField(term4000359, term4000359.getClass(), "playedMusicLevel2", 0);
        setLongField(term4000359, term4000359.getClass(), "playedUserId3", 0L);
        setField(term4000359, term4000359.getClass(), "playedUserName3", null);
        setIntField(term4000359, term4000359.getClass(), "playedMusicLevel3", 0);
        setIntField(term4000359, term4000359.getClass(), "achievement", 0);
        setIntField(term4000359, term4000359.getClass(), "score", 0);
        setIntField(term4000359, term4000359.getClass(), "tapScore", 0);
        setIntField(term4000359, term4000359.getClass(), "holdScore", 0);
        setIntField(term4000359, term4000359.getClass(), "slideScore", 0);
        setIntField(term4000359, term4000359.getClass(), "breakScore", 0);
        setIntField(term4000359, term4000359.getClass(), "syncRate", 0);
        setIntField(term4000359, term4000359.getClass(), "vsWin", 0);
        setBooleanField(term4000359, term4000359.getClass(), "isAllPerfect", false);
        setIntField(term4000359, term4000359.getClass(), "fullCombo", 0);
        setIntField(term4000359, term4000359.getClass(), "maxFever", 0);
        setIntField(term4000359, term4000359.getClass(), "maxCombo", 0);
        setIntField(term4000359, term4000359.getClass(), "tapPerfect", 0);
        setIntField(term4000359, term4000359.getClass(), "tapGreat", 0);
        setIntField(term4000359, term4000359.getClass(), "tapGood", 0);
        setIntField(term4000359, term4000359.getClass(), "tapBad", 0);
        setIntField(term4000359, term4000359.getClass(), "holdPerfect", 0);
        setIntField(term4000359, term4000359.getClass(), "holdGreat", 0);
        setIntField(term4000359, term4000359.getClass(), "holdGood", 0);
        setIntField(term4000359, term4000359.getClass(), "holdBad", 0);
        setIntField(term4000359, term4000359.getClass(), "slidePerfect", 0);
        setIntField(term4000359, term4000359.getClass(), "slideGreat", 0);
        setIntField(term4000359, term4000359.getClass(), "slideGood", 0);
        setIntField(term4000359, term4000359.getClass(), "slideBad", 0);
        setIntField(term4000359, term4000359.getClass(), "breakPerfect", 0);
        setIntField(term4000359, term4000359.getClass(), "breakGreat", 0);
        setIntField(term4000359, term4000359.getClass(), "breakGood", 0);
        setIntField(term4000359, term4000359.getClass(), "breakBad", 0);
        setBooleanField(term4000359, term4000359.getClass(), "isTrackSkip", false);
        setBooleanField(term4000359, term4000359.getClass(), "isHighScore", false);
        setBooleanField(term4000359, term4000359.getClass(), "isChallengeTrack", false);
        setIntField(term4000359, term4000359.getClass(), "challengeLife", 0);
        setIntField(term4000359, term4000359.getClass(), "challengeRemain", 0);
        setIntField(term4000359, term4000359.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel1", argTypes, term4000359, args);
    }

};


