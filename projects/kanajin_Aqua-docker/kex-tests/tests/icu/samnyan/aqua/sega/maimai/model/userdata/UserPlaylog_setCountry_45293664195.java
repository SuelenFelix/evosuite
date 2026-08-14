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
     Object term4002905;

    public UserPlaylog_setCountry_45293664195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4002905 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4002905, term4002905.getClass(), "id", 0L);
        setField(term4002905, term4002905.getClass(), "user", null);
        setIntField(term4002905, term4002905.getClass(), "orderId", 0);
        setLongField(term4002905, term4002905.getClass(), "sortNumber", 0L);
        setIntField(term4002905, term4002905.getClass(), "placeId", 0);
        setField(term4002905, term4002905.getClass(), "placeName", null);
        setField(term4002905, term4002905.getClass(), "country", null);
        setIntField(term4002905, term4002905.getClass(), "regionId", 0);
        setField(term4002905, term4002905.getClass(), "playDate", null);
        setField(term4002905, term4002905.getClass(), "userPlayDate", null);
        setIntField(term4002905, term4002905.getClass(), "musicId", 0);
        setIntField(term4002905, term4002905.getClass(), "level", 0);
        setIntField(term4002905, term4002905.getClass(), "gameMode", 0);
        setIntField(term4002905, term4002905.getClass(), "rivalNum", 0);
        setIntField(term4002905, term4002905.getClass(), "track", 0);
        setIntField(term4002905, term4002905.getClass(), "eventId", 0);
        setBooleanField(term4002905, term4002905.getClass(), "isFreeToPlay", false);
        setIntField(term4002905, term4002905.getClass(), "playerRating", 0);
        setLongField(term4002905, term4002905.getClass(), "playedUserId1", 0L);
        setField(term4002905, term4002905.getClass(), "playedUserName1", null);
        setIntField(term4002905, term4002905.getClass(), "playedMusicLevel1", 0);
        setLongField(term4002905, term4002905.getClass(), "playedUserId2", 0L);
        setField(term4002905, term4002905.getClass(), "playedUserName2", null);
        setIntField(term4002905, term4002905.getClass(), "playedMusicLevel2", 0);
        setLongField(term4002905, term4002905.getClass(), "playedUserId3", 0L);
        setField(term4002905, term4002905.getClass(), "playedUserName3", null);
        setIntField(term4002905, term4002905.getClass(), "playedMusicLevel3", 0);
        setIntField(term4002905, term4002905.getClass(), "achievement", 0);
        setIntField(term4002905, term4002905.getClass(), "score", 0);
        setIntField(term4002905, term4002905.getClass(), "tapScore", 0);
        setIntField(term4002905, term4002905.getClass(), "holdScore", 0);
        setIntField(term4002905, term4002905.getClass(), "slideScore", 0);
        setIntField(term4002905, term4002905.getClass(), "breakScore", 0);
        setIntField(term4002905, term4002905.getClass(), "syncRate", 0);
        setIntField(term4002905, term4002905.getClass(), "vsWin", 0);
        setBooleanField(term4002905, term4002905.getClass(), "isAllPerfect", false);
        setIntField(term4002905, term4002905.getClass(), "fullCombo", 0);
        setIntField(term4002905, term4002905.getClass(), "maxFever", 0);
        setIntField(term4002905, term4002905.getClass(), "maxCombo", 0);
        setIntField(term4002905, term4002905.getClass(), "tapPerfect", 0);
        setIntField(term4002905, term4002905.getClass(), "tapGreat", 0);
        setIntField(term4002905, term4002905.getClass(), "tapGood", 0);
        setIntField(term4002905, term4002905.getClass(), "tapBad", 0);
        setIntField(term4002905, term4002905.getClass(), "holdPerfect", 0);
        setIntField(term4002905, term4002905.getClass(), "holdGreat", 0);
        setIntField(term4002905, term4002905.getClass(), "holdGood", 0);
        setIntField(term4002905, term4002905.getClass(), "holdBad", 0);
        setIntField(term4002905, term4002905.getClass(), "slidePerfect", 0);
        setIntField(term4002905, term4002905.getClass(), "slideGreat", 0);
        setIntField(term4002905, term4002905.getClass(), "slideGood", 0);
        setIntField(term4002905, term4002905.getClass(), "slideBad", 0);
        setIntField(term4002905, term4002905.getClass(), "breakPerfect", 0);
        setIntField(term4002905, term4002905.getClass(), "breakGreat", 0);
        setIntField(term4002905, term4002905.getClass(), "breakGood", 0);
        setIntField(term4002905, term4002905.getClass(), "breakBad", 0);
        setBooleanField(term4002905, term4002905.getClass(), "isTrackSkip", false);
        setBooleanField(term4002905, term4002905.getClass(), "isHighScore", false);
        setBooleanField(term4002905, term4002905.getClass(), "isChallengeTrack", false);
        setIntField(term4002905, term4002905.getClass(), "challengeLife", 0);
        setIntField(term4002905, term4002905.getClass(), "challengeRemain", 0);
        setIntField(term4002905, term4002905.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCountry", argTypes, term4002905, args);
    }

};


