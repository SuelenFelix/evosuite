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
     Object term3999603;

    public UserPlaylog_getCountry_856774688134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3999603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term3999603, term3999603.getClass(), "id", 0L);
        setField(term3999603, term3999603.getClass(), "user", null);
        setIntField(term3999603, term3999603.getClass(), "orderId", 0);
        setLongField(term3999603, term3999603.getClass(), "sortNumber", 0L);
        setIntField(term3999603, term3999603.getClass(), "placeId", 0);
        setField(term3999603, term3999603.getClass(), "placeName", null);
        setField(term3999603, term3999603.getClass(), "country", null);
        setIntField(term3999603, term3999603.getClass(), "regionId", 0);
        setField(term3999603, term3999603.getClass(), "playDate", null);
        setField(term3999603, term3999603.getClass(), "userPlayDate", null);
        setIntField(term3999603, term3999603.getClass(), "musicId", 0);
        setIntField(term3999603, term3999603.getClass(), "level", 0);
        setIntField(term3999603, term3999603.getClass(), "gameMode", 0);
        setIntField(term3999603, term3999603.getClass(), "rivalNum", 0);
        setIntField(term3999603, term3999603.getClass(), "track", 0);
        setIntField(term3999603, term3999603.getClass(), "eventId", 0);
        setBooleanField(term3999603, term3999603.getClass(), "isFreeToPlay", false);
        setIntField(term3999603, term3999603.getClass(), "playerRating", 0);
        setLongField(term3999603, term3999603.getClass(), "playedUserId1", 0L);
        setField(term3999603, term3999603.getClass(), "playedUserName1", null);
        setIntField(term3999603, term3999603.getClass(), "playedMusicLevel1", 0);
        setLongField(term3999603, term3999603.getClass(), "playedUserId2", 0L);
        setField(term3999603, term3999603.getClass(), "playedUserName2", null);
        setIntField(term3999603, term3999603.getClass(), "playedMusicLevel2", 0);
        setLongField(term3999603, term3999603.getClass(), "playedUserId3", 0L);
        setField(term3999603, term3999603.getClass(), "playedUserName3", null);
        setIntField(term3999603, term3999603.getClass(), "playedMusicLevel3", 0);
        setIntField(term3999603, term3999603.getClass(), "achievement", 0);
        setIntField(term3999603, term3999603.getClass(), "score", 0);
        setIntField(term3999603, term3999603.getClass(), "tapScore", 0);
        setIntField(term3999603, term3999603.getClass(), "holdScore", 0);
        setIntField(term3999603, term3999603.getClass(), "slideScore", 0);
        setIntField(term3999603, term3999603.getClass(), "breakScore", 0);
        setIntField(term3999603, term3999603.getClass(), "syncRate", 0);
        setIntField(term3999603, term3999603.getClass(), "vsWin", 0);
        setBooleanField(term3999603, term3999603.getClass(), "isAllPerfect", false);
        setIntField(term3999603, term3999603.getClass(), "fullCombo", 0);
        setIntField(term3999603, term3999603.getClass(), "maxFever", 0);
        setIntField(term3999603, term3999603.getClass(), "maxCombo", 0);
        setIntField(term3999603, term3999603.getClass(), "tapPerfect", 0);
        setIntField(term3999603, term3999603.getClass(), "tapGreat", 0);
        setIntField(term3999603, term3999603.getClass(), "tapGood", 0);
        setIntField(term3999603, term3999603.getClass(), "tapBad", 0);
        setIntField(term3999603, term3999603.getClass(), "holdPerfect", 0);
        setIntField(term3999603, term3999603.getClass(), "holdGreat", 0);
        setIntField(term3999603, term3999603.getClass(), "holdGood", 0);
        setIntField(term3999603, term3999603.getClass(), "holdBad", 0);
        setIntField(term3999603, term3999603.getClass(), "slidePerfect", 0);
        setIntField(term3999603, term3999603.getClass(), "slideGreat", 0);
        setIntField(term3999603, term3999603.getClass(), "slideGood", 0);
        setIntField(term3999603, term3999603.getClass(), "slideBad", 0);
        setIntField(term3999603, term3999603.getClass(), "breakPerfect", 0);
        setIntField(term3999603, term3999603.getClass(), "breakGreat", 0);
        setIntField(term3999603, term3999603.getClass(), "breakGood", 0);
        setIntField(term3999603, term3999603.getClass(), "breakBad", 0);
        setBooleanField(term3999603, term3999603.getClass(), "isTrackSkip", false);
        setBooleanField(term3999603, term3999603.getClass(), "isHighScore", false);
        setBooleanField(term3999603, term3999603.getClass(), "isChallengeTrack", false);
        setIntField(term3999603, term3999603.getClass(), "challengeLife", 0);
        setIntField(term3999603, term3999603.getClass(), "challengeRemain", 0);
        setIntField(term3999603, term3999603.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term3999603, args);
    }

};


