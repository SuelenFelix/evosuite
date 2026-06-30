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

public class UserPlaylog_setBreakPerfect_449840543240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179047;
     Object term179101;

    public UserPlaylog_setBreakPerfect_449840543240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179047 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term179047, term179047.getClass(), "id", 0L);
        setField(term179047, term179047.getClass(), "user", null);
        setIntField(term179047, term179047.getClass(), "orderId", 0);
        setLongField(term179047, term179047.getClass(), "sortNumber", 0L);
        setIntField(term179047, term179047.getClass(), "placeId", 0);
        setField(term179047, term179047.getClass(), "placeName", null);
        setField(term179047, term179047.getClass(), "country", null);
        setIntField(term179047, term179047.getClass(), "regionId", 0);
        setField(term179047, term179047.getClass(), "playDate", null);
        setField(term179047, term179047.getClass(), "userPlayDate", null);
        setIntField(term179047, term179047.getClass(), "musicId", 0);
        setIntField(term179047, term179047.getClass(), "level", 0);
        setIntField(term179047, term179047.getClass(), "gameMode", 0);
        setIntField(term179047, term179047.getClass(), "rivalNum", 0);
        setIntField(term179047, term179047.getClass(), "track", 0);
        setIntField(term179047, term179047.getClass(), "eventId", 0);
        setBooleanField(term179047, term179047.getClass(), "isFreeToPlay", false);
        setIntField(term179047, term179047.getClass(), "playerRating", 0);
        setLongField(term179047, term179047.getClass(), "playedUserId1", 0L);
        setField(term179047, term179047.getClass(), "playedUserName1", null);
        setIntField(term179047, term179047.getClass(), "playedMusicLevel1", 0);
        setLongField(term179047, term179047.getClass(), "playedUserId2", 0L);
        setField(term179047, term179047.getClass(), "playedUserName2", null);
        setIntField(term179047, term179047.getClass(), "playedMusicLevel2", 0);
        setLongField(term179047, term179047.getClass(), "playedUserId3", 0L);
        setField(term179047, term179047.getClass(), "playedUserName3", null);
        setIntField(term179047, term179047.getClass(), "playedMusicLevel3", 0);
        setIntField(term179047, term179047.getClass(), "achievement", 0);
        setIntField(term179047, term179047.getClass(), "score", 0);
        setIntField(term179047, term179047.getClass(), "tapScore", 0);
        setIntField(term179047, term179047.getClass(), "holdScore", 0);
        setIntField(term179047, term179047.getClass(), "slideScore", 0);
        setIntField(term179047, term179047.getClass(), "breakScore", 0);
        setIntField(term179047, term179047.getClass(), "syncRate", 0);
        setIntField(term179047, term179047.getClass(), "vsWin", 0);
        setBooleanField(term179047, term179047.getClass(), "isAllPerfect", false);
        setIntField(term179047, term179047.getClass(), "fullCombo", 0);
        setIntField(term179047, term179047.getClass(), "maxFever", 0);
        setIntField(term179047, term179047.getClass(), "maxCombo", 0);
        setIntField(term179047, term179047.getClass(), "tapPerfect", 0);
        setIntField(term179047, term179047.getClass(), "tapGreat", 0);
        setIntField(term179047, term179047.getClass(), "tapGood", 0);
        setIntField(term179047, term179047.getClass(), "tapBad", 0);
        setIntField(term179047, term179047.getClass(), "holdPerfect", 0);
        setIntField(term179047, term179047.getClass(), "holdGreat", 0);
        setIntField(term179047, term179047.getClass(), "holdGood", 0);
        setIntField(term179047, term179047.getClass(), "holdBad", 0);
        setIntField(term179047, term179047.getClass(), "slidePerfect", 0);
        setIntField(term179047, term179047.getClass(), "slideGreat", 0);
        setIntField(term179047, term179047.getClass(), "slideGood", 0);
        setIntField(term179047, term179047.getClass(), "slideBad", 0);
        setIntField(term179047, term179047.getClass(), "breakPerfect", 0);
        setIntField(term179047, term179047.getClass(), "breakGreat", 0);
        setIntField(term179047, term179047.getClass(), "breakGood", 0);
        setIntField(term179047, term179047.getClass(), "breakBad", 0);
        setBooleanField(term179047, term179047.getClass(), "isTrackSkip", false);
        setBooleanField(term179047, term179047.getClass(), "isHighScore", false);
        setBooleanField(term179047, term179047.getClass(), "isChallengeTrack", false);
        setIntField(term179047, term179047.getClass(), "challengeLife", 0);
        setIntField(term179047, term179047.getClass(), "challengeRemain", 0);
        setIntField(term179047, term179047.getClass(), "isAllPerfectPlus", 0);
        term179101 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179101;
        callMethod(klass, "setBreakPerfect", argTypes, term179047, args);
    }

};


