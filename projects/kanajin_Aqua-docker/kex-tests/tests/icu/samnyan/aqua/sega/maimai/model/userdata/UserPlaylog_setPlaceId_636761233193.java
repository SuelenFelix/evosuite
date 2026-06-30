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
import java.lang.Integer;

public class UserPlaylog_setPlaceId_636761233193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176429;
     Object term176483;

    public UserPlaylog_setPlaceId_636761233193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176429 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176429, term176429.getClass(), "id", 0L);
        setField(term176429, term176429.getClass(), "user", null);
        setIntField(term176429, term176429.getClass(), "orderId", 0);
        setLongField(term176429, term176429.getClass(), "sortNumber", 0L);
        setIntField(term176429, term176429.getClass(), "placeId", 0);
        setField(term176429, term176429.getClass(), "placeName", null);
        setField(term176429, term176429.getClass(), "country", null);
        setIntField(term176429, term176429.getClass(), "regionId", 0);
        setField(term176429, term176429.getClass(), "playDate", null);
        setField(term176429, term176429.getClass(), "userPlayDate", null);
        setIntField(term176429, term176429.getClass(), "musicId", 0);
        setIntField(term176429, term176429.getClass(), "level", 0);
        setIntField(term176429, term176429.getClass(), "gameMode", 0);
        setIntField(term176429, term176429.getClass(), "rivalNum", 0);
        setIntField(term176429, term176429.getClass(), "track", 0);
        setIntField(term176429, term176429.getClass(), "eventId", 0);
        setBooleanField(term176429, term176429.getClass(), "isFreeToPlay", false);
        setIntField(term176429, term176429.getClass(), "playerRating", 0);
        setLongField(term176429, term176429.getClass(), "playedUserId1", 0L);
        setField(term176429, term176429.getClass(), "playedUserName1", null);
        setIntField(term176429, term176429.getClass(), "playedMusicLevel1", 0);
        setLongField(term176429, term176429.getClass(), "playedUserId2", 0L);
        setField(term176429, term176429.getClass(), "playedUserName2", null);
        setIntField(term176429, term176429.getClass(), "playedMusicLevel2", 0);
        setLongField(term176429, term176429.getClass(), "playedUserId3", 0L);
        setField(term176429, term176429.getClass(), "playedUserName3", null);
        setIntField(term176429, term176429.getClass(), "playedMusicLevel3", 0);
        setIntField(term176429, term176429.getClass(), "achievement", 0);
        setIntField(term176429, term176429.getClass(), "score", 0);
        setIntField(term176429, term176429.getClass(), "tapScore", 0);
        setIntField(term176429, term176429.getClass(), "holdScore", 0);
        setIntField(term176429, term176429.getClass(), "slideScore", 0);
        setIntField(term176429, term176429.getClass(), "breakScore", 0);
        setIntField(term176429, term176429.getClass(), "syncRate", 0);
        setIntField(term176429, term176429.getClass(), "vsWin", 0);
        setBooleanField(term176429, term176429.getClass(), "isAllPerfect", false);
        setIntField(term176429, term176429.getClass(), "fullCombo", 0);
        setIntField(term176429, term176429.getClass(), "maxFever", 0);
        setIntField(term176429, term176429.getClass(), "maxCombo", 0);
        setIntField(term176429, term176429.getClass(), "tapPerfect", 0);
        setIntField(term176429, term176429.getClass(), "tapGreat", 0);
        setIntField(term176429, term176429.getClass(), "tapGood", 0);
        setIntField(term176429, term176429.getClass(), "tapBad", 0);
        setIntField(term176429, term176429.getClass(), "holdPerfect", 0);
        setIntField(term176429, term176429.getClass(), "holdGreat", 0);
        setIntField(term176429, term176429.getClass(), "holdGood", 0);
        setIntField(term176429, term176429.getClass(), "holdBad", 0);
        setIntField(term176429, term176429.getClass(), "slidePerfect", 0);
        setIntField(term176429, term176429.getClass(), "slideGreat", 0);
        setIntField(term176429, term176429.getClass(), "slideGood", 0);
        setIntField(term176429, term176429.getClass(), "slideBad", 0);
        setIntField(term176429, term176429.getClass(), "breakPerfect", 0);
        setIntField(term176429, term176429.getClass(), "breakGreat", 0);
        setIntField(term176429, term176429.getClass(), "breakGood", 0);
        setIntField(term176429, term176429.getClass(), "breakBad", 0);
        setBooleanField(term176429, term176429.getClass(), "isTrackSkip", false);
        setBooleanField(term176429, term176429.getClass(), "isHighScore", false);
        setBooleanField(term176429, term176429.getClass(), "isChallengeTrack", false);
        setIntField(term176429, term176429.getClass(), "challengeLife", 0);
        setIntField(term176429, term176429.getClass(), "challengeRemain", 0);
        setIntField(term176429, term176429.getClass(), "isAllPerfectPlus", 0);
        term176483 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176483;
        callMethod(klass, "setPlaceId", argTypes, term176429, args);
    }

};


