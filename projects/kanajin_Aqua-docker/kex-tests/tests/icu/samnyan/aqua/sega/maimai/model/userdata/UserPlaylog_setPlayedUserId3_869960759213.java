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
import java.lang.Long;

public class UserPlaylog_setPlayedUserId3_869960759213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4003903;
     Object term4003957;

    public UserPlaylog_setPlayedUserId3_869960759213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4003903 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4003903, term4003903.getClass(), "id", 0L);
        setField(term4003903, term4003903.getClass(), "user", null);
        setIntField(term4003903, term4003903.getClass(), "orderId", 0);
        setLongField(term4003903, term4003903.getClass(), "sortNumber", 0L);
        setIntField(term4003903, term4003903.getClass(), "placeId", 0);
        setField(term4003903, term4003903.getClass(), "placeName", null);
        setField(term4003903, term4003903.getClass(), "country", null);
        setIntField(term4003903, term4003903.getClass(), "regionId", 0);
        setField(term4003903, term4003903.getClass(), "playDate", null);
        setField(term4003903, term4003903.getClass(), "userPlayDate", null);
        setIntField(term4003903, term4003903.getClass(), "musicId", 0);
        setIntField(term4003903, term4003903.getClass(), "level", 0);
        setIntField(term4003903, term4003903.getClass(), "gameMode", 0);
        setIntField(term4003903, term4003903.getClass(), "rivalNum", 0);
        setIntField(term4003903, term4003903.getClass(), "track", 0);
        setIntField(term4003903, term4003903.getClass(), "eventId", 0);
        setBooleanField(term4003903, term4003903.getClass(), "isFreeToPlay", false);
        setIntField(term4003903, term4003903.getClass(), "playerRating", 0);
        setLongField(term4003903, term4003903.getClass(), "playedUserId1", 0L);
        setField(term4003903, term4003903.getClass(), "playedUserName1", null);
        setIntField(term4003903, term4003903.getClass(), "playedMusicLevel1", 0);
        setLongField(term4003903, term4003903.getClass(), "playedUserId2", 0L);
        setField(term4003903, term4003903.getClass(), "playedUserName2", null);
        setIntField(term4003903, term4003903.getClass(), "playedMusicLevel2", 0);
        setLongField(term4003903, term4003903.getClass(), "playedUserId3", 0L);
        setField(term4003903, term4003903.getClass(), "playedUserName3", null);
        setIntField(term4003903, term4003903.getClass(), "playedMusicLevel3", 0);
        setIntField(term4003903, term4003903.getClass(), "achievement", 0);
        setIntField(term4003903, term4003903.getClass(), "score", 0);
        setIntField(term4003903, term4003903.getClass(), "tapScore", 0);
        setIntField(term4003903, term4003903.getClass(), "holdScore", 0);
        setIntField(term4003903, term4003903.getClass(), "slideScore", 0);
        setIntField(term4003903, term4003903.getClass(), "breakScore", 0);
        setIntField(term4003903, term4003903.getClass(), "syncRate", 0);
        setIntField(term4003903, term4003903.getClass(), "vsWin", 0);
        setBooleanField(term4003903, term4003903.getClass(), "isAllPerfect", false);
        setIntField(term4003903, term4003903.getClass(), "fullCombo", 0);
        setIntField(term4003903, term4003903.getClass(), "maxFever", 0);
        setIntField(term4003903, term4003903.getClass(), "maxCombo", 0);
        setIntField(term4003903, term4003903.getClass(), "tapPerfect", 0);
        setIntField(term4003903, term4003903.getClass(), "tapGreat", 0);
        setIntField(term4003903, term4003903.getClass(), "tapGood", 0);
        setIntField(term4003903, term4003903.getClass(), "tapBad", 0);
        setIntField(term4003903, term4003903.getClass(), "holdPerfect", 0);
        setIntField(term4003903, term4003903.getClass(), "holdGreat", 0);
        setIntField(term4003903, term4003903.getClass(), "holdGood", 0);
        setIntField(term4003903, term4003903.getClass(), "holdBad", 0);
        setIntField(term4003903, term4003903.getClass(), "slidePerfect", 0);
        setIntField(term4003903, term4003903.getClass(), "slideGreat", 0);
        setIntField(term4003903, term4003903.getClass(), "slideGood", 0);
        setIntField(term4003903, term4003903.getClass(), "slideBad", 0);
        setIntField(term4003903, term4003903.getClass(), "breakPerfect", 0);
        setIntField(term4003903, term4003903.getClass(), "breakGreat", 0);
        setIntField(term4003903, term4003903.getClass(), "breakGood", 0);
        setIntField(term4003903, term4003903.getClass(), "breakBad", 0);
        setBooleanField(term4003903, term4003903.getClass(), "isTrackSkip", false);
        setBooleanField(term4003903, term4003903.getClass(), "isHighScore", false);
        setBooleanField(term4003903, term4003903.getClass(), "isChallengeTrack", false);
        setIntField(term4003903, term4003903.getClass(), "challengeLife", 0);
        setIntField(term4003903, term4003903.getClass(), "challengeRemain", 0);
        setIntField(term4003903, term4003903.getClass(), "isAllPerfectPlus", 0);
        term4003957 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4003957;
        callMethod(klass, "setPlayedUserId3", argTypes, term4003903, args);
    }

};


