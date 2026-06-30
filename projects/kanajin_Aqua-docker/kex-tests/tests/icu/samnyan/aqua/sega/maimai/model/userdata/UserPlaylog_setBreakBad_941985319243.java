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

public class UserPlaylog_setBreakBad_941985319243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179215;
     Object term179269;

    public UserPlaylog_setBreakBad_941985319243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179215 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term179215, term179215.getClass(), "id", 0L);
        setField(term179215, term179215.getClass(), "user", null);
        setIntField(term179215, term179215.getClass(), "orderId", 0);
        setLongField(term179215, term179215.getClass(), "sortNumber", 0L);
        setIntField(term179215, term179215.getClass(), "placeId", 0);
        setField(term179215, term179215.getClass(), "placeName", null);
        setField(term179215, term179215.getClass(), "country", null);
        setIntField(term179215, term179215.getClass(), "regionId", 0);
        setField(term179215, term179215.getClass(), "playDate", null);
        setField(term179215, term179215.getClass(), "userPlayDate", null);
        setIntField(term179215, term179215.getClass(), "musicId", 0);
        setIntField(term179215, term179215.getClass(), "level", 0);
        setIntField(term179215, term179215.getClass(), "gameMode", 0);
        setIntField(term179215, term179215.getClass(), "rivalNum", 0);
        setIntField(term179215, term179215.getClass(), "track", 0);
        setIntField(term179215, term179215.getClass(), "eventId", 0);
        setBooleanField(term179215, term179215.getClass(), "isFreeToPlay", false);
        setIntField(term179215, term179215.getClass(), "playerRating", 0);
        setLongField(term179215, term179215.getClass(), "playedUserId1", 0L);
        setField(term179215, term179215.getClass(), "playedUserName1", null);
        setIntField(term179215, term179215.getClass(), "playedMusicLevel1", 0);
        setLongField(term179215, term179215.getClass(), "playedUserId2", 0L);
        setField(term179215, term179215.getClass(), "playedUserName2", null);
        setIntField(term179215, term179215.getClass(), "playedMusicLevel2", 0);
        setLongField(term179215, term179215.getClass(), "playedUserId3", 0L);
        setField(term179215, term179215.getClass(), "playedUserName3", null);
        setIntField(term179215, term179215.getClass(), "playedMusicLevel3", 0);
        setIntField(term179215, term179215.getClass(), "achievement", 0);
        setIntField(term179215, term179215.getClass(), "score", 0);
        setIntField(term179215, term179215.getClass(), "tapScore", 0);
        setIntField(term179215, term179215.getClass(), "holdScore", 0);
        setIntField(term179215, term179215.getClass(), "slideScore", 0);
        setIntField(term179215, term179215.getClass(), "breakScore", 0);
        setIntField(term179215, term179215.getClass(), "syncRate", 0);
        setIntField(term179215, term179215.getClass(), "vsWin", 0);
        setBooleanField(term179215, term179215.getClass(), "isAllPerfect", false);
        setIntField(term179215, term179215.getClass(), "fullCombo", 0);
        setIntField(term179215, term179215.getClass(), "maxFever", 0);
        setIntField(term179215, term179215.getClass(), "maxCombo", 0);
        setIntField(term179215, term179215.getClass(), "tapPerfect", 0);
        setIntField(term179215, term179215.getClass(), "tapGreat", 0);
        setIntField(term179215, term179215.getClass(), "tapGood", 0);
        setIntField(term179215, term179215.getClass(), "tapBad", 0);
        setIntField(term179215, term179215.getClass(), "holdPerfect", 0);
        setIntField(term179215, term179215.getClass(), "holdGreat", 0);
        setIntField(term179215, term179215.getClass(), "holdGood", 0);
        setIntField(term179215, term179215.getClass(), "holdBad", 0);
        setIntField(term179215, term179215.getClass(), "slidePerfect", 0);
        setIntField(term179215, term179215.getClass(), "slideGreat", 0);
        setIntField(term179215, term179215.getClass(), "slideGood", 0);
        setIntField(term179215, term179215.getClass(), "slideBad", 0);
        setIntField(term179215, term179215.getClass(), "breakPerfect", 0);
        setIntField(term179215, term179215.getClass(), "breakGreat", 0);
        setIntField(term179215, term179215.getClass(), "breakGood", 0);
        setIntField(term179215, term179215.getClass(), "breakBad", 0);
        setBooleanField(term179215, term179215.getClass(), "isTrackSkip", false);
        setBooleanField(term179215, term179215.getClass(), "isHighScore", false);
        setBooleanField(term179215, term179215.getClass(), "isChallengeTrack", false);
        setIntField(term179215, term179215.getClass(), "challengeLife", 0);
        setIntField(term179215, term179215.getClass(), "challengeRemain", 0);
        setIntField(term179215, term179215.getClass(), "isAllPerfectPlus", 0);
        term179269 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179269;
        callMethod(klass, "setBreakBad", argTypes, term179215, args);
    }

};


