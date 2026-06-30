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

public class UserPlaylog_getCountry_856774688134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173237;

    public UserPlaylog_getCountry_856774688134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173237 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173237, term173237.getClass(), "id", 0L);
        setField(term173237, term173237.getClass(), "user", null);
        setIntField(term173237, term173237.getClass(), "orderId", 0);
        setLongField(term173237, term173237.getClass(), "sortNumber", 0L);
        setIntField(term173237, term173237.getClass(), "placeId", 0);
        setField(term173237, term173237.getClass(), "placeName", null);
        setField(term173237, term173237.getClass(), "country", null);
        setIntField(term173237, term173237.getClass(), "regionId", 0);
        setField(term173237, term173237.getClass(), "playDate", null);
        setField(term173237, term173237.getClass(), "userPlayDate", null);
        setIntField(term173237, term173237.getClass(), "musicId", 0);
        setIntField(term173237, term173237.getClass(), "level", 0);
        setIntField(term173237, term173237.getClass(), "gameMode", 0);
        setIntField(term173237, term173237.getClass(), "rivalNum", 0);
        setIntField(term173237, term173237.getClass(), "track", 0);
        setIntField(term173237, term173237.getClass(), "eventId", 0);
        setBooleanField(term173237, term173237.getClass(), "isFreeToPlay", false);
        setIntField(term173237, term173237.getClass(), "playerRating", 0);
        setLongField(term173237, term173237.getClass(), "playedUserId1", 0L);
        setField(term173237, term173237.getClass(), "playedUserName1", null);
        setIntField(term173237, term173237.getClass(), "playedMusicLevel1", 0);
        setLongField(term173237, term173237.getClass(), "playedUserId2", 0L);
        setField(term173237, term173237.getClass(), "playedUserName2", null);
        setIntField(term173237, term173237.getClass(), "playedMusicLevel2", 0);
        setLongField(term173237, term173237.getClass(), "playedUserId3", 0L);
        setField(term173237, term173237.getClass(), "playedUserName3", null);
        setIntField(term173237, term173237.getClass(), "playedMusicLevel3", 0);
        setIntField(term173237, term173237.getClass(), "achievement", 0);
        setIntField(term173237, term173237.getClass(), "score", 0);
        setIntField(term173237, term173237.getClass(), "tapScore", 0);
        setIntField(term173237, term173237.getClass(), "holdScore", 0);
        setIntField(term173237, term173237.getClass(), "slideScore", 0);
        setIntField(term173237, term173237.getClass(), "breakScore", 0);
        setIntField(term173237, term173237.getClass(), "syncRate", 0);
        setIntField(term173237, term173237.getClass(), "vsWin", 0);
        setBooleanField(term173237, term173237.getClass(), "isAllPerfect", false);
        setIntField(term173237, term173237.getClass(), "fullCombo", 0);
        setIntField(term173237, term173237.getClass(), "maxFever", 0);
        setIntField(term173237, term173237.getClass(), "maxCombo", 0);
        setIntField(term173237, term173237.getClass(), "tapPerfect", 0);
        setIntField(term173237, term173237.getClass(), "tapGreat", 0);
        setIntField(term173237, term173237.getClass(), "tapGood", 0);
        setIntField(term173237, term173237.getClass(), "tapBad", 0);
        setIntField(term173237, term173237.getClass(), "holdPerfect", 0);
        setIntField(term173237, term173237.getClass(), "holdGreat", 0);
        setIntField(term173237, term173237.getClass(), "holdGood", 0);
        setIntField(term173237, term173237.getClass(), "holdBad", 0);
        setIntField(term173237, term173237.getClass(), "slidePerfect", 0);
        setIntField(term173237, term173237.getClass(), "slideGreat", 0);
        setIntField(term173237, term173237.getClass(), "slideGood", 0);
        setIntField(term173237, term173237.getClass(), "slideBad", 0);
        setIntField(term173237, term173237.getClass(), "breakPerfect", 0);
        setIntField(term173237, term173237.getClass(), "breakGreat", 0);
        setIntField(term173237, term173237.getClass(), "breakGood", 0);
        setIntField(term173237, term173237.getClass(), "breakBad", 0);
        setBooleanField(term173237, term173237.getClass(), "isTrackSkip", false);
        setBooleanField(term173237, term173237.getClass(), "isHighScore", false);
        setBooleanField(term173237, term173237.getClass(), "isChallengeTrack", false);
        setIntField(term173237, term173237.getClass(), "challengeLife", 0);
        setIntField(term173237, term173237.getClass(), "challengeRemain", 0);
        setIntField(term173237, term173237.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term173237, args);
    }

};


