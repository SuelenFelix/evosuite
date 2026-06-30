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

public class UserPlaylog_setPlayedUserId1_869962681207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177205;
     Object term177259;

    public UserPlaylog_setPlayedUserId1_869962681207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177205 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177205, term177205.getClass(), "id", 0L);
        setField(term177205, term177205.getClass(), "user", null);
        setIntField(term177205, term177205.getClass(), "orderId", 0);
        setLongField(term177205, term177205.getClass(), "sortNumber", 0L);
        setIntField(term177205, term177205.getClass(), "placeId", 0);
        setField(term177205, term177205.getClass(), "placeName", null);
        setField(term177205, term177205.getClass(), "country", null);
        setIntField(term177205, term177205.getClass(), "regionId", 0);
        setField(term177205, term177205.getClass(), "playDate", null);
        setField(term177205, term177205.getClass(), "userPlayDate", null);
        setIntField(term177205, term177205.getClass(), "musicId", 0);
        setIntField(term177205, term177205.getClass(), "level", 0);
        setIntField(term177205, term177205.getClass(), "gameMode", 0);
        setIntField(term177205, term177205.getClass(), "rivalNum", 0);
        setIntField(term177205, term177205.getClass(), "track", 0);
        setIntField(term177205, term177205.getClass(), "eventId", 0);
        setBooleanField(term177205, term177205.getClass(), "isFreeToPlay", false);
        setIntField(term177205, term177205.getClass(), "playerRating", 0);
        setLongField(term177205, term177205.getClass(), "playedUserId1", 0L);
        setField(term177205, term177205.getClass(), "playedUserName1", null);
        setIntField(term177205, term177205.getClass(), "playedMusicLevel1", 0);
        setLongField(term177205, term177205.getClass(), "playedUserId2", 0L);
        setField(term177205, term177205.getClass(), "playedUserName2", null);
        setIntField(term177205, term177205.getClass(), "playedMusicLevel2", 0);
        setLongField(term177205, term177205.getClass(), "playedUserId3", 0L);
        setField(term177205, term177205.getClass(), "playedUserName3", null);
        setIntField(term177205, term177205.getClass(), "playedMusicLevel3", 0);
        setIntField(term177205, term177205.getClass(), "achievement", 0);
        setIntField(term177205, term177205.getClass(), "score", 0);
        setIntField(term177205, term177205.getClass(), "tapScore", 0);
        setIntField(term177205, term177205.getClass(), "holdScore", 0);
        setIntField(term177205, term177205.getClass(), "slideScore", 0);
        setIntField(term177205, term177205.getClass(), "breakScore", 0);
        setIntField(term177205, term177205.getClass(), "syncRate", 0);
        setIntField(term177205, term177205.getClass(), "vsWin", 0);
        setBooleanField(term177205, term177205.getClass(), "isAllPerfect", false);
        setIntField(term177205, term177205.getClass(), "fullCombo", 0);
        setIntField(term177205, term177205.getClass(), "maxFever", 0);
        setIntField(term177205, term177205.getClass(), "maxCombo", 0);
        setIntField(term177205, term177205.getClass(), "tapPerfect", 0);
        setIntField(term177205, term177205.getClass(), "tapGreat", 0);
        setIntField(term177205, term177205.getClass(), "tapGood", 0);
        setIntField(term177205, term177205.getClass(), "tapBad", 0);
        setIntField(term177205, term177205.getClass(), "holdPerfect", 0);
        setIntField(term177205, term177205.getClass(), "holdGreat", 0);
        setIntField(term177205, term177205.getClass(), "holdGood", 0);
        setIntField(term177205, term177205.getClass(), "holdBad", 0);
        setIntField(term177205, term177205.getClass(), "slidePerfect", 0);
        setIntField(term177205, term177205.getClass(), "slideGreat", 0);
        setIntField(term177205, term177205.getClass(), "slideGood", 0);
        setIntField(term177205, term177205.getClass(), "slideBad", 0);
        setIntField(term177205, term177205.getClass(), "breakPerfect", 0);
        setIntField(term177205, term177205.getClass(), "breakGreat", 0);
        setIntField(term177205, term177205.getClass(), "breakGood", 0);
        setIntField(term177205, term177205.getClass(), "breakBad", 0);
        setBooleanField(term177205, term177205.getClass(), "isTrackSkip", false);
        setBooleanField(term177205, term177205.getClass(), "isHighScore", false);
        setBooleanField(term177205, term177205.getClass(), "isChallengeTrack", false);
        setIntField(term177205, term177205.getClass(), "challengeLife", 0);
        setIntField(term177205, term177205.getClass(), "challengeRemain", 0);
        setIntField(term177205, term177205.getClass(), "isAllPerfectPlus", 0);
        term177259 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term177259;
        callMethod(klass, "setPlayedUserId1", argTypes, term177205, args);
    }

};


