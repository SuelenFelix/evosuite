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

public class UserPlaylog_setId_709835634189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176207;
     Object term176261;

    public UserPlaylog_setId_709835634189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176207 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176207, term176207.getClass(), "id", 0L);
        setField(term176207, term176207.getClass(), "user", null);
        setIntField(term176207, term176207.getClass(), "orderId", 0);
        setLongField(term176207, term176207.getClass(), "sortNumber", 0L);
        setIntField(term176207, term176207.getClass(), "placeId", 0);
        setField(term176207, term176207.getClass(), "placeName", null);
        setField(term176207, term176207.getClass(), "country", null);
        setIntField(term176207, term176207.getClass(), "regionId", 0);
        setField(term176207, term176207.getClass(), "playDate", null);
        setField(term176207, term176207.getClass(), "userPlayDate", null);
        setIntField(term176207, term176207.getClass(), "musicId", 0);
        setIntField(term176207, term176207.getClass(), "level", 0);
        setIntField(term176207, term176207.getClass(), "gameMode", 0);
        setIntField(term176207, term176207.getClass(), "rivalNum", 0);
        setIntField(term176207, term176207.getClass(), "track", 0);
        setIntField(term176207, term176207.getClass(), "eventId", 0);
        setBooleanField(term176207, term176207.getClass(), "isFreeToPlay", false);
        setIntField(term176207, term176207.getClass(), "playerRating", 0);
        setLongField(term176207, term176207.getClass(), "playedUserId1", 0L);
        setField(term176207, term176207.getClass(), "playedUserName1", null);
        setIntField(term176207, term176207.getClass(), "playedMusicLevel1", 0);
        setLongField(term176207, term176207.getClass(), "playedUserId2", 0L);
        setField(term176207, term176207.getClass(), "playedUserName2", null);
        setIntField(term176207, term176207.getClass(), "playedMusicLevel2", 0);
        setLongField(term176207, term176207.getClass(), "playedUserId3", 0L);
        setField(term176207, term176207.getClass(), "playedUserName3", null);
        setIntField(term176207, term176207.getClass(), "playedMusicLevel3", 0);
        setIntField(term176207, term176207.getClass(), "achievement", 0);
        setIntField(term176207, term176207.getClass(), "score", 0);
        setIntField(term176207, term176207.getClass(), "tapScore", 0);
        setIntField(term176207, term176207.getClass(), "holdScore", 0);
        setIntField(term176207, term176207.getClass(), "slideScore", 0);
        setIntField(term176207, term176207.getClass(), "breakScore", 0);
        setIntField(term176207, term176207.getClass(), "syncRate", 0);
        setIntField(term176207, term176207.getClass(), "vsWin", 0);
        setBooleanField(term176207, term176207.getClass(), "isAllPerfect", false);
        setIntField(term176207, term176207.getClass(), "fullCombo", 0);
        setIntField(term176207, term176207.getClass(), "maxFever", 0);
        setIntField(term176207, term176207.getClass(), "maxCombo", 0);
        setIntField(term176207, term176207.getClass(), "tapPerfect", 0);
        setIntField(term176207, term176207.getClass(), "tapGreat", 0);
        setIntField(term176207, term176207.getClass(), "tapGood", 0);
        setIntField(term176207, term176207.getClass(), "tapBad", 0);
        setIntField(term176207, term176207.getClass(), "holdPerfect", 0);
        setIntField(term176207, term176207.getClass(), "holdGreat", 0);
        setIntField(term176207, term176207.getClass(), "holdGood", 0);
        setIntField(term176207, term176207.getClass(), "holdBad", 0);
        setIntField(term176207, term176207.getClass(), "slidePerfect", 0);
        setIntField(term176207, term176207.getClass(), "slideGreat", 0);
        setIntField(term176207, term176207.getClass(), "slideGood", 0);
        setIntField(term176207, term176207.getClass(), "slideBad", 0);
        setIntField(term176207, term176207.getClass(), "breakPerfect", 0);
        setIntField(term176207, term176207.getClass(), "breakGreat", 0);
        setIntField(term176207, term176207.getClass(), "breakGood", 0);
        setIntField(term176207, term176207.getClass(), "breakBad", 0);
        setBooleanField(term176207, term176207.getClass(), "isTrackSkip", false);
        setBooleanField(term176207, term176207.getClass(), "isHighScore", false);
        setBooleanField(term176207, term176207.getClass(), "isChallengeTrack", false);
        setIntField(term176207, term176207.getClass(), "challengeLife", 0);
        setIntField(term176207, term176207.getClass(), "challengeRemain", 0);
        setIntField(term176207, term176207.getClass(), "isAllPerfectPlus", 0);
        term176261 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term176261;
        callMethod(klass, "setId", argTypes, term176207, args);
    }

};


