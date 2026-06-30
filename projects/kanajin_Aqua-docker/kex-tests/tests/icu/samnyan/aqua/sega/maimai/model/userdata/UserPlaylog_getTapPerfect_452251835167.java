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

public class UserPlaylog_getTapPerfect_452251835167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175019;

    public UserPlaylog_getTapPerfect_452251835167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175019 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175019, term175019.getClass(), "id", 0L);
        setField(term175019, term175019.getClass(), "user", null);
        setIntField(term175019, term175019.getClass(), "orderId", 0);
        setLongField(term175019, term175019.getClass(), "sortNumber", 0L);
        setIntField(term175019, term175019.getClass(), "placeId", 0);
        setField(term175019, term175019.getClass(), "placeName", null);
        setField(term175019, term175019.getClass(), "country", null);
        setIntField(term175019, term175019.getClass(), "regionId", 0);
        setField(term175019, term175019.getClass(), "playDate", null);
        setField(term175019, term175019.getClass(), "userPlayDate", null);
        setIntField(term175019, term175019.getClass(), "musicId", 0);
        setIntField(term175019, term175019.getClass(), "level", 0);
        setIntField(term175019, term175019.getClass(), "gameMode", 0);
        setIntField(term175019, term175019.getClass(), "rivalNum", 0);
        setIntField(term175019, term175019.getClass(), "track", 0);
        setIntField(term175019, term175019.getClass(), "eventId", 0);
        setBooleanField(term175019, term175019.getClass(), "isFreeToPlay", false);
        setIntField(term175019, term175019.getClass(), "playerRating", 0);
        setLongField(term175019, term175019.getClass(), "playedUserId1", 0L);
        setField(term175019, term175019.getClass(), "playedUserName1", null);
        setIntField(term175019, term175019.getClass(), "playedMusicLevel1", 0);
        setLongField(term175019, term175019.getClass(), "playedUserId2", 0L);
        setField(term175019, term175019.getClass(), "playedUserName2", null);
        setIntField(term175019, term175019.getClass(), "playedMusicLevel2", 0);
        setLongField(term175019, term175019.getClass(), "playedUserId3", 0L);
        setField(term175019, term175019.getClass(), "playedUserName3", null);
        setIntField(term175019, term175019.getClass(), "playedMusicLevel3", 0);
        setIntField(term175019, term175019.getClass(), "achievement", 0);
        setIntField(term175019, term175019.getClass(), "score", 0);
        setIntField(term175019, term175019.getClass(), "tapScore", 0);
        setIntField(term175019, term175019.getClass(), "holdScore", 0);
        setIntField(term175019, term175019.getClass(), "slideScore", 0);
        setIntField(term175019, term175019.getClass(), "breakScore", 0);
        setIntField(term175019, term175019.getClass(), "syncRate", 0);
        setIntField(term175019, term175019.getClass(), "vsWin", 0);
        setBooleanField(term175019, term175019.getClass(), "isAllPerfect", false);
        setIntField(term175019, term175019.getClass(), "fullCombo", 0);
        setIntField(term175019, term175019.getClass(), "maxFever", 0);
        setIntField(term175019, term175019.getClass(), "maxCombo", 0);
        setIntField(term175019, term175019.getClass(), "tapPerfect", 0);
        setIntField(term175019, term175019.getClass(), "tapGreat", 0);
        setIntField(term175019, term175019.getClass(), "tapGood", 0);
        setIntField(term175019, term175019.getClass(), "tapBad", 0);
        setIntField(term175019, term175019.getClass(), "holdPerfect", 0);
        setIntField(term175019, term175019.getClass(), "holdGreat", 0);
        setIntField(term175019, term175019.getClass(), "holdGood", 0);
        setIntField(term175019, term175019.getClass(), "holdBad", 0);
        setIntField(term175019, term175019.getClass(), "slidePerfect", 0);
        setIntField(term175019, term175019.getClass(), "slideGreat", 0);
        setIntField(term175019, term175019.getClass(), "slideGood", 0);
        setIntField(term175019, term175019.getClass(), "slideBad", 0);
        setIntField(term175019, term175019.getClass(), "breakPerfect", 0);
        setIntField(term175019, term175019.getClass(), "breakGreat", 0);
        setIntField(term175019, term175019.getClass(), "breakGood", 0);
        setIntField(term175019, term175019.getClass(), "breakBad", 0);
        setBooleanField(term175019, term175019.getClass(), "isTrackSkip", false);
        setBooleanField(term175019, term175019.getClass(), "isHighScore", false);
        setBooleanField(term175019, term175019.getClass(), "isChallengeTrack", false);
        setIntField(term175019, term175019.getClass(), "challengeLife", 0);
        setIntField(term175019, term175019.getClass(), "challengeRemain", 0);
        setIntField(term175019, term175019.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapPerfect", argTypes, term175019, args);
    }

};


