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
     Object term4003571;
     Object term4003625;

    public UserPlaylog_setPlayedUserId1_869962681207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4003571 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4003571, term4003571.getClass(), "id", 0L);
        setField(term4003571, term4003571.getClass(), "user", null);
        setIntField(term4003571, term4003571.getClass(), "orderId", 0);
        setLongField(term4003571, term4003571.getClass(), "sortNumber", 0L);
        setIntField(term4003571, term4003571.getClass(), "placeId", 0);
        setField(term4003571, term4003571.getClass(), "placeName", null);
        setField(term4003571, term4003571.getClass(), "country", null);
        setIntField(term4003571, term4003571.getClass(), "regionId", 0);
        setField(term4003571, term4003571.getClass(), "playDate", null);
        setField(term4003571, term4003571.getClass(), "userPlayDate", null);
        setIntField(term4003571, term4003571.getClass(), "musicId", 0);
        setIntField(term4003571, term4003571.getClass(), "level", 0);
        setIntField(term4003571, term4003571.getClass(), "gameMode", 0);
        setIntField(term4003571, term4003571.getClass(), "rivalNum", 0);
        setIntField(term4003571, term4003571.getClass(), "track", 0);
        setIntField(term4003571, term4003571.getClass(), "eventId", 0);
        setBooleanField(term4003571, term4003571.getClass(), "isFreeToPlay", false);
        setIntField(term4003571, term4003571.getClass(), "playerRating", 0);
        setLongField(term4003571, term4003571.getClass(), "playedUserId1", 0L);
        setField(term4003571, term4003571.getClass(), "playedUserName1", null);
        setIntField(term4003571, term4003571.getClass(), "playedMusicLevel1", 0);
        setLongField(term4003571, term4003571.getClass(), "playedUserId2", 0L);
        setField(term4003571, term4003571.getClass(), "playedUserName2", null);
        setIntField(term4003571, term4003571.getClass(), "playedMusicLevel2", 0);
        setLongField(term4003571, term4003571.getClass(), "playedUserId3", 0L);
        setField(term4003571, term4003571.getClass(), "playedUserName3", null);
        setIntField(term4003571, term4003571.getClass(), "playedMusicLevel3", 0);
        setIntField(term4003571, term4003571.getClass(), "achievement", 0);
        setIntField(term4003571, term4003571.getClass(), "score", 0);
        setIntField(term4003571, term4003571.getClass(), "tapScore", 0);
        setIntField(term4003571, term4003571.getClass(), "holdScore", 0);
        setIntField(term4003571, term4003571.getClass(), "slideScore", 0);
        setIntField(term4003571, term4003571.getClass(), "breakScore", 0);
        setIntField(term4003571, term4003571.getClass(), "syncRate", 0);
        setIntField(term4003571, term4003571.getClass(), "vsWin", 0);
        setBooleanField(term4003571, term4003571.getClass(), "isAllPerfect", false);
        setIntField(term4003571, term4003571.getClass(), "fullCombo", 0);
        setIntField(term4003571, term4003571.getClass(), "maxFever", 0);
        setIntField(term4003571, term4003571.getClass(), "maxCombo", 0);
        setIntField(term4003571, term4003571.getClass(), "tapPerfect", 0);
        setIntField(term4003571, term4003571.getClass(), "tapGreat", 0);
        setIntField(term4003571, term4003571.getClass(), "tapGood", 0);
        setIntField(term4003571, term4003571.getClass(), "tapBad", 0);
        setIntField(term4003571, term4003571.getClass(), "holdPerfect", 0);
        setIntField(term4003571, term4003571.getClass(), "holdGreat", 0);
        setIntField(term4003571, term4003571.getClass(), "holdGood", 0);
        setIntField(term4003571, term4003571.getClass(), "holdBad", 0);
        setIntField(term4003571, term4003571.getClass(), "slidePerfect", 0);
        setIntField(term4003571, term4003571.getClass(), "slideGreat", 0);
        setIntField(term4003571, term4003571.getClass(), "slideGood", 0);
        setIntField(term4003571, term4003571.getClass(), "slideBad", 0);
        setIntField(term4003571, term4003571.getClass(), "breakPerfect", 0);
        setIntField(term4003571, term4003571.getClass(), "breakGreat", 0);
        setIntField(term4003571, term4003571.getClass(), "breakGood", 0);
        setIntField(term4003571, term4003571.getClass(), "breakBad", 0);
        setBooleanField(term4003571, term4003571.getClass(), "isTrackSkip", false);
        setBooleanField(term4003571, term4003571.getClass(), "isHighScore", false);
        setBooleanField(term4003571, term4003571.getClass(), "isChallengeTrack", false);
        setIntField(term4003571, term4003571.getClass(), "challengeLife", 0);
        setIntField(term4003571, term4003571.getClass(), "challengeRemain", 0);
        setIntField(term4003571, term4003571.getClass(), "isAllPerfectPlus", 0);
        term4003625 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4003625;
        callMethod(klass, "setPlayedUserId1", argTypes, term4003571, args);
    }

};


