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

public class UserPlaylog_getSlidePerfect_1452901139175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175451;

    public UserPlaylog_getSlidePerfect_1452901139175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175451 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175451, term175451.getClass(), "id", 0L);
        setField(term175451, term175451.getClass(), "user", null);
        setIntField(term175451, term175451.getClass(), "orderId", 0);
        setLongField(term175451, term175451.getClass(), "sortNumber", 0L);
        setIntField(term175451, term175451.getClass(), "placeId", 0);
        setField(term175451, term175451.getClass(), "placeName", null);
        setField(term175451, term175451.getClass(), "country", null);
        setIntField(term175451, term175451.getClass(), "regionId", 0);
        setField(term175451, term175451.getClass(), "playDate", null);
        setField(term175451, term175451.getClass(), "userPlayDate", null);
        setIntField(term175451, term175451.getClass(), "musicId", 0);
        setIntField(term175451, term175451.getClass(), "level", 0);
        setIntField(term175451, term175451.getClass(), "gameMode", 0);
        setIntField(term175451, term175451.getClass(), "rivalNum", 0);
        setIntField(term175451, term175451.getClass(), "track", 0);
        setIntField(term175451, term175451.getClass(), "eventId", 0);
        setBooleanField(term175451, term175451.getClass(), "isFreeToPlay", false);
        setIntField(term175451, term175451.getClass(), "playerRating", 0);
        setLongField(term175451, term175451.getClass(), "playedUserId1", 0L);
        setField(term175451, term175451.getClass(), "playedUserName1", null);
        setIntField(term175451, term175451.getClass(), "playedMusicLevel1", 0);
        setLongField(term175451, term175451.getClass(), "playedUserId2", 0L);
        setField(term175451, term175451.getClass(), "playedUserName2", null);
        setIntField(term175451, term175451.getClass(), "playedMusicLevel2", 0);
        setLongField(term175451, term175451.getClass(), "playedUserId3", 0L);
        setField(term175451, term175451.getClass(), "playedUserName3", null);
        setIntField(term175451, term175451.getClass(), "playedMusicLevel3", 0);
        setIntField(term175451, term175451.getClass(), "achievement", 0);
        setIntField(term175451, term175451.getClass(), "score", 0);
        setIntField(term175451, term175451.getClass(), "tapScore", 0);
        setIntField(term175451, term175451.getClass(), "holdScore", 0);
        setIntField(term175451, term175451.getClass(), "slideScore", 0);
        setIntField(term175451, term175451.getClass(), "breakScore", 0);
        setIntField(term175451, term175451.getClass(), "syncRate", 0);
        setIntField(term175451, term175451.getClass(), "vsWin", 0);
        setBooleanField(term175451, term175451.getClass(), "isAllPerfect", false);
        setIntField(term175451, term175451.getClass(), "fullCombo", 0);
        setIntField(term175451, term175451.getClass(), "maxFever", 0);
        setIntField(term175451, term175451.getClass(), "maxCombo", 0);
        setIntField(term175451, term175451.getClass(), "tapPerfect", 0);
        setIntField(term175451, term175451.getClass(), "tapGreat", 0);
        setIntField(term175451, term175451.getClass(), "tapGood", 0);
        setIntField(term175451, term175451.getClass(), "tapBad", 0);
        setIntField(term175451, term175451.getClass(), "holdPerfect", 0);
        setIntField(term175451, term175451.getClass(), "holdGreat", 0);
        setIntField(term175451, term175451.getClass(), "holdGood", 0);
        setIntField(term175451, term175451.getClass(), "holdBad", 0);
        setIntField(term175451, term175451.getClass(), "slidePerfect", 0);
        setIntField(term175451, term175451.getClass(), "slideGreat", 0);
        setIntField(term175451, term175451.getClass(), "slideGood", 0);
        setIntField(term175451, term175451.getClass(), "slideBad", 0);
        setIntField(term175451, term175451.getClass(), "breakPerfect", 0);
        setIntField(term175451, term175451.getClass(), "breakGreat", 0);
        setIntField(term175451, term175451.getClass(), "breakGood", 0);
        setIntField(term175451, term175451.getClass(), "breakBad", 0);
        setBooleanField(term175451, term175451.getClass(), "isTrackSkip", false);
        setBooleanField(term175451, term175451.getClass(), "isHighScore", false);
        setBooleanField(term175451, term175451.getClass(), "isChallengeTrack", false);
        setIntField(term175451, term175451.getClass(), "challengeLife", 0);
        setIntField(term175451, term175451.getClass(), "challengeRemain", 0);
        setIntField(term175451, term175451.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlidePerfect", argTypes, term175451, args);
    }

};


