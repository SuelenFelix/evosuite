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

public class UserPlaylog_setCountry_45293664196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176595;

    public UserPlaylog_setCountry_45293664196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176595 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176595, term176595.getClass(), "id", 0L);
        setField(term176595, term176595.getClass(), "user", null);
        setIntField(term176595, term176595.getClass(), "orderId", 0);
        setLongField(term176595, term176595.getClass(), "sortNumber", 0L);
        setIntField(term176595, term176595.getClass(), "placeId", 0);
        setField(term176595, term176595.getClass(), "placeName", null);
        setField(term176595, term176595.getClass(), "country", null);
        setIntField(term176595, term176595.getClass(), "regionId", 0);
        setField(term176595, term176595.getClass(), "playDate", null);
        setField(term176595, term176595.getClass(), "userPlayDate", null);
        setIntField(term176595, term176595.getClass(), "musicId", 0);
        setIntField(term176595, term176595.getClass(), "level", 0);
        setIntField(term176595, term176595.getClass(), "gameMode", 0);
        setIntField(term176595, term176595.getClass(), "rivalNum", 0);
        setIntField(term176595, term176595.getClass(), "track", 0);
        setIntField(term176595, term176595.getClass(), "eventId", 0);
        setBooleanField(term176595, term176595.getClass(), "isFreeToPlay", false);
        setIntField(term176595, term176595.getClass(), "playerRating", 0);
        setLongField(term176595, term176595.getClass(), "playedUserId1", 0L);
        setField(term176595, term176595.getClass(), "playedUserName1", null);
        setIntField(term176595, term176595.getClass(), "playedMusicLevel1", 0);
        setLongField(term176595, term176595.getClass(), "playedUserId2", 0L);
        setField(term176595, term176595.getClass(), "playedUserName2", null);
        setIntField(term176595, term176595.getClass(), "playedMusicLevel2", 0);
        setLongField(term176595, term176595.getClass(), "playedUserId3", 0L);
        setField(term176595, term176595.getClass(), "playedUserName3", null);
        setIntField(term176595, term176595.getClass(), "playedMusicLevel3", 0);
        setIntField(term176595, term176595.getClass(), "achievement", 0);
        setIntField(term176595, term176595.getClass(), "score", 0);
        setIntField(term176595, term176595.getClass(), "tapScore", 0);
        setIntField(term176595, term176595.getClass(), "holdScore", 0);
        setIntField(term176595, term176595.getClass(), "slideScore", 0);
        setIntField(term176595, term176595.getClass(), "breakScore", 0);
        setIntField(term176595, term176595.getClass(), "syncRate", 0);
        setIntField(term176595, term176595.getClass(), "vsWin", 0);
        setBooleanField(term176595, term176595.getClass(), "isAllPerfect", false);
        setIntField(term176595, term176595.getClass(), "fullCombo", 0);
        setIntField(term176595, term176595.getClass(), "maxFever", 0);
        setIntField(term176595, term176595.getClass(), "maxCombo", 0);
        setIntField(term176595, term176595.getClass(), "tapPerfect", 0);
        setIntField(term176595, term176595.getClass(), "tapGreat", 0);
        setIntField(term176595, term176595.getClass(), "tapGood", 0);
        setIntField(term176595, term176595.getClass(), "tapBad", 0);
        setIntField(term176595, term176595.getClass(), "holdPerfect", 0);
        setIntField(term176595, term176595.getClass(), "holdGreat", 0);
        setIntField(term176595, term176595.getClass(), "holdGood", 0);
        setIntField(term176595, term176595.getClass(), "holdBad", 0);
        setIntField(term176595, term176595.getClass(), "slidePerfect", 0);
        setIntField(term176595, term176595.getClass(), "slideGreat", 0);
        setIntField(term176595, term176595.getClass(), "slideGood", 0);
        setIntField(term176595, term176595.getClass(), "slideBad", 0);
        setIntField(term176595, term176595.getClass(), "breakPerfect", 0);
        setIntField(term176595, term176595.getClass(), "breakGreat", 0);
        setIntField(term176595, term176595.getClass(), "breakGood", 0);
        setIntField(term176595, term176595.getClass(), "breakBad", 0);
        setBooleanField(term176595, term176595.getClass(), "isTrackSkip", false);
        setBooleanField(term176595, term176595.getClass(), "isHighScore", false);
        setBooleanField(term176595, term176595.getClass(), "isChallengeTrack", false);
        setIntField(term176595, term176595.getClass(), "challengeLife", 0);
        setIntField(term176595, term176595.getClass(), "challengeRemain", 0);
        setIntField(term176595, term176595.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCountry", argTypes, term176595, args);
    }

};


