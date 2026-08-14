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

public class UserPlaylog_getPlayDate_352309560136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3999711;

    public UserPlaylog_getPlayDate_352309560136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3999711 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term3999711, term3999711.getClass(), "id", 0L);
        setField(term3999711, term3999711.getClass(), "user", null);
        setIntField(term3999711, term3999711.getClass(), "orderId", 0);
        setLongField(term3999711, term3999711.getClass(), "sortNumber", 0L);
        setIntField(term3999711, term3999711.getClass(), "placeId", 0);
        setField(term3999711, term3999711.getClass(), "placeName", null);
        setField(term3999711, term3999711.getClass(), "country", null);
        setIntField(term3999711, term3999711.getClass(), "regionId", 0);
        setField(term3999711, term3999711.getClass(), "playDate", null);
        setField(term3999711, term3999711.getClass(), "userPlayDate", null);
        setIntField(term3999711, term3999711.getClass(), "musicId", 0);
        setIntField(term3999711, term3999711.getClass(), "level", 0);
        setIntField(term3999711, term3999711.getClass(), "gameMode", 0);
        setIntField(term3999711, term3999711.getClass(), "rivalNum", 0);
        setIntField(term3999711, term3999711.getClass(), "track", 0);
        setIntField(term3999711, term3999711.getClass(), "eventId", 0);
        setBooleanField(term3999711, term3999711.getClass(), "isFreeToPlay", false);
        setIntField(term3999711, term3999711.getClass(), "playerRating", 0);
        setLongField(term3999711, term3999711.getClass(), "playedUserId1", 0L);
        setField(term3999711, term3999711.getClass(), "playedUserName1", null);
        setIntField(term3999711, term3999711.getClass(), "playedMusicLevel1", 0);
        setLongField(term3999711, term3999711.getClass(), "playedUserId2", 0L);
        setField(term3999711, term3999711.getClass(), "playedUserName2", null);
        setIntField(term3999711, term3999711.getClass(), "playedMusicLevel2", 0);
        setLongField(term3999711, term3999711.getClass(), "playedUserId3", 0L);
        setField(term3999711, term3999711.getClass(), "playedUserName3", null);
        setIntField(term3999711, term3999711.getClass(), "playedMusicLevel3", 0);
        setIntField(term3999711, term3999711.getClass(), "achievement", 0);
        setIntField(term3999711, term3999711.getClass(), "score", 0);
        setIntField(term3999711, term3999711.getClass(), "tapScore", 0);
        setIntField(term3999711, term3999711.getClass(), "holdScore", 0);
        setIntField(term3999711, term3999711.getClass(), "slideScore", 0);
        setIntField(term3999711, term3999711.getClass(), "breakScore", 0);
        setIntField(term3999711, term3999711.getClass(), "syncRate", 0);
        setIntField(term3999711, term3999711.getClass(), "vsWin", 0);
        setBooleanField(term3999711, term3999711.getClass(), "isAllPerfect", false);
        setIntField(term3999711, term3999711.getClass(), "fullCombo", 0);
        setIntField(term3999711, term3999711.getClass(), "maxFever", 0);
        setIntField(term3999711, term3999711.getClass(), "maxCombo", 0);
        setIntField(term3999711, term3999711.getClass(), "tapPerfect", 0);
        setIntField(term3999711, term3999711.getClass(), "tapGreat", 0);
        setIntField(term3999711, term3999711.getClass(), "tapGood", 0);
        setIntField(term3999711, term3999711.getClass(), "tapBad", 0);
        setIntField(term3999711, term3999711.getClass(), "holdPerfect", 0);
        setIntField(term3999711, term3999711.getClass(), "holdGreat", 0);
        setIntField(term3999711, term3999711.getClass(), "holdGood", 0);
        setIntField(term3999711, term3999711.getClass(), "holdBad", 0);
        setIntField(term3999711, term3999711.getClass(), "slidePerfect", 0);
        setIntField(term3999711, term3999711.getClass(), "slideGreat", 0);
        setIntField(term3999711, term3999711.getClass(), "slideGood", 0);
        setIntField(term3999711, term3999711.getClass(), "slideBad", 0);
        setIntField(term3999711, term3999711.getClass(), "breakPerfect", 0);
        setIntField(term3999711, term3999711.getClass(), "breakGreat", 0);
        setIntField(term3999711, term3999711.getClass(), "breakGood", 0);
        setIntField(term3999711, term3999711.getClass(), "breakBad", 0);
        setBooleanField(term3999711, term3999711.getClass(), "isTrackSkip", false);
        setBooleanField(term3999711, term3999711.getClass(), "isHighScore", false);
        setBooleanField(term3999711, term3999711.getClass(), "isChallengeTrack", false);
        setIntField(term3999711, term3999711.getClass(), "challengeLife", 0);
        setIntField(term3999711, term3999711.getClass(), "challengeRemain", 0);
        setIntField(term3999711, term3999711.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDate", argTypes, term3999711, args);
    }

};


