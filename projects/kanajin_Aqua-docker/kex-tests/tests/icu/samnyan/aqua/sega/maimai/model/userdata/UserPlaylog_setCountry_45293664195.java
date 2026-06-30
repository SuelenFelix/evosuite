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

public class UserPlaylog_setCountry_45293664195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176539;

    public UserPlaylog_setCountry_45293664195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176539 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176539, term176539.getClass(), "id", 0L);
        setField(term176539, term176539.getClass(), "user", null);
        setIntField(term176539, term176539.getClass(), "orderId", 0);
        setLongField(term176539, term176539.getClass(), "sortNumber", 0L);
        setIntField(term176539, term176539.getClass(), "placeId", 0);
        setField(term176539, term176539.getClass(), "placeName", null);
        setField(term176539, term176539.getClass(), "country", null);
        setIntField(term176539, term176539.getClass(), "regionId", 0);
        setField(term176539, term176539.getClass(), "playDate", null);
        setField(term176539, term176539.getClass(), "userPlayDate", null);
        setIntField(term176539, term176539.getClass(), "musicId", 0);
        setIntField(term176539, term176539.getClass(), "level", 0);
        setIntField(term176539, term176539.getClass(), "gameMode", 0);
        setIntField(term176539, term176539.getClass(), "rivalNum", 0);
        setIntField(term176539, term176539.getClass(), "track", 0);
        setIntField(term176539, term176539.getClass(), "eventId", 0);
        setBooleanField(term176539, term176539.getClass(), "isFreeToPlay", false);
        setIntField(term176539, term176539.getClass(), "playerRating", 0);
        setLongField(term176539, term176539.getClass(), "playedUserId1", 0L);
        setField(term176539, term176539.getClass(), "playedUserName1", null);
        setIntField(term176539, term176539.getClass(), "playedMusicLevel1", 0);
        setLongField(term176539, term176539.getClass(), "playedUserId2", 0L);
        setField(term176539, term176539.getClass(), "playedUserName2", null);
        setIntField(term176539, term176539.getClass(), "playedMusicLevel2", 0);
        setLongField(term176539, term176539.getClass(), "playedUserId3", 0L);
        setField(term176539, term176539.getClass(), "playedUserName3", null);
        setIntField(term176539, term176539.getClass(), "playedMusicLevel3", 0);
        setIntField(term176539, term176539.getClass(), "achievement", 0);
        setIntField(term176539, term176539.getClass(), "score", 0);
        setIntField(term176539, term176539.getClass(), "tapScore", 0);
        setIntField(term176539, term176539.getClass(), "holdScore", 0);
        setIntField(term176539, term176539.getClass(), "slideScore", 0);
        setIntField(term176539, term176539.getClass(), "breakScore", 0);
        setIntField(term176539, term176539.getClass(), "syncRate", 0);
        setIntField(term176539, term176539.getClass(), "vsWin", 0);
        setBooleanField(term176539, term176539.getClass(), "isAllPerfect", false);
        setIntField(term176539, term176539.getClass(), "fullCombo", 0);
        setIntField(term176539, term176539.getClass(), "maxFever", 0);
        setIntField(term176539, term176539.getClass(), "maxCombo", 0);
        setIntField(term176539, term176539.getClass(), "tapPerfect", 0);
        setIntField(term176539, term176539.getClass(), "tapGreat", 0);
        setIntField(term176539, term176539.getClass(), "tapGood", 0);
        setIntField(term176539, term176539.getClass(), "tapBad", 0);
        setIntField(term176539, term176539.getClass(), "holdPerfect", 0);
        setIntField(term176539, term176539.getClass(), "holdGreat", 0);
        setIntField(term176539, term176539.getClass(), "holdGood", 0);
        setIntField(term176539, term176539.getClass(), "holdBad", 0);
        setIntField(term176539, term176539.getClass(), "slidePerfect", 0);
        setIntField(term176539, term176539.getClass(), "slideGreat", 0);
        setIntField(term176539, term176539.getClass(), "slideGood", 0);
        setIntField(term176539, term176539.getClass(), "slideBad", 0);
        setIntField(term176539, term176539.getClass(), "breakPerfect", 0);
        setIntField(term176539, term176539.getClass(), "breakGreat", 0);
        setIntField(term176539, term176539.getClass(), "breakGood", 0);
        setIntField(term176539, term176539.getClass(), "breakBad", 0);
        setBooleanField(term176539, term176539.getClass(), "isTrackSkip", false);
        setBooleanField(term176539, term176539.getClass(), "isHighScore", false);
        setBooleanField(term176539, term176539.getClass(), "isChallengeTrack", false);
        setIntField(term176539, term176539.getClass(), "challengeLife", 0);
        setIntField(term176539, term176539.getClass(), "challengeRemain", 0);
        setIntField(term176539, term176539.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCountry", argTypes, term176539, args);
    }

};


