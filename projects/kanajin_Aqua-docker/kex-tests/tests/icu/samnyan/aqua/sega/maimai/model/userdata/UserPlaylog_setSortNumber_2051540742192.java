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

public class UserPlaylog_setSortNumber_2051540742192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176373;
     Object term176427;

    public UserPlaylog_setSortNumber_2051540742192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176373 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176373, term176373.getClass(), "id", 0L);
        setField(term176373, term176373.getClass(), "user", null);
        setIntField(term176373, term176373.getClass(), "orderId", 0);
        setLongField(term176373, term176373.getClass(), "sortNumber", 0L);
        setIntField(term176373, term176373.getClass(), "placeId", 0);
        setField(term176373, term176373.getClass(), "placeName", null);
        setField(term176373, term176373.getClass(), "country", null);
        setIntField(term176373, term176373.getClass(), "regionId", 0);
        setField(term176373, term176373.getClass(), "playDate", null);
        setField(term176373, term176373.getClass(), "userPlayDate", null);
        setIntField(term176373, term176373.getClass(), "musicId", 0);
        setIntField(term176373, term176373.getClass(), "level", 0);
        setIntField(term176373, term176373.getClass(), "gameMode", 0);
        setIntField(term176373, term176373.getClass(), "rivalNum", 0);
        setIntField(term176373, term176373.getClass(), "track", 0);
        setIntField(term176373, term176373.getClass(), "eventId", 0);
        setBooleanField(term176373, term176373.getClass(), "isFreeToPlay", false);
        setIntField(term176373, term176373.getClass(), "playerRating", 0);
        setLongField(term176373, term176373.getClass(), "playedUserId1", 0L);
        setField(term176373, term176373.getClass(), "playedUserName1", null);
        setIntField(term176373, term176373.getClass(), "playedMusicLevel1", 0);
        setLongField(term176373, term176373.getClass(), "playedUserId2", 0L);
        setField(term176373, term176373.getClass(), "playedUserName2", null);
        setIntField(term176373, term176373.getClass(), "playedMusicLevel2", 0);
        setLongField(term176373, term176373.getClass(), "playedUserId3", 0L);
        setField(term176373, term176373.getClass(), "playedUserName3", null);
        setIntField(term176373, term176373.getClass(), "playedMusicLevel3", 0);
        setIntField(term176373, term176373.getClass(), "achievement", 0);
        setIntField(term176373, term176373.getClass(), "score", 0);
        setIntField(term176373, term176373.getClass(), "tapScore", 0);
        setIntField(term176373, term176373.getClass(), "holdScore", 0);
        setIntField(term176373, term176373.getClass(), "slideScore", 0);
        setIntField(term176373, term176373.getClass(), "breakScore", 0);
        setIntField(term176373, term176373.getClass(), "syncRate", 0);
        setIntField(term176373, term176373.getClass(), "vsWin", 0);
        setBooleanField(term176373, term176373.getClass(), "isAllPerfect", false);
        setIntField(term176373, term176373.getClass(), "fullCombo", 0);
        setIntField(term176373, term176373.getClass(), "maxFever", 0);
        setIntField(term176373, term176373.getClass(), "maxCombo", 0);
        setIntField(term176373, term176373.getClass(), "tapPerfect", 0);
        setIntField(term176373, term176373.getClass(), "tapGreat", 0);
        setIntField(term176373, term176373.getClass(), "tapGood", 0);
        setIntField(term176373, term176373.getClass(), "tapBad", 0);
        setIntField(term176373, term176373.getClass(), "holdPerfect", 0);
        setIntField(term176373, term176373.getClass(), "holdGreat", 0);
        setIntField(term176373, term176373.getClass(), "holdGood", 0);
        setIntField(term176373, term176373.getClass(), "holdBad", 0);
        setIntField(term176373, term176373.getClass(), "slidePerfect", 0);
        setIntField(term176373, term176373.getClass(), "slideGreat", 0);
        setIntField(term176373, term176373.getClass(), "slideGood", 0);
        setIntField(term176373, term176373.getClass(), "slideBad", 0);
        setIntField(term176373, term176373.getClass(), "breakPerfect", 0);
        setIntField(term176373, term176373.getClass(), "breakGreat", 0);
        setIntField(term176373, term176373.getClass(), "breakGood", 0);
        setIntField(term176373, term176373.getClass(), "breakBad", 0);
        setBooleanField(term176373, term176373.getClass(), "isTrackSkip", false);
        setBooleanField(term176373, term176373.getClass(), "isHighScore", false);
        setBooleanField(term176373, term176373.getClass(), "isChallengeTrack", false);
        setIntField(term176373, term176373.getClass(), "challengeLife", 0);
        setIntField(term176373, term176373.getClass(), "challengeRemain", 0);
        setIntField(term176373, term176373.getClass(), "isAllPerfectPlus", 0);
        term176427 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term176427;
        callMethod(klass, "setSortNumber", argTypes, term176373, args);
    }

};


