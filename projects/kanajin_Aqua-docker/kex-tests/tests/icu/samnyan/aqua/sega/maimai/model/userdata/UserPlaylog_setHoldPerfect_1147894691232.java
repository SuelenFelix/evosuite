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

public class UserPlaylog_setHoldPerfect_1147894691232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178599;
     Object term178653;

    public UserPlaylog_setHoldPerfect_1147894691232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178599, term178599.getClass(), "id", 0L);
        setField(term178599, term178599.getClass(), "user", null);
        setIntField(term178599, term178599.getClass(), "orderId", 0);
        setLongField(term178599, term178599.getClass(), "sortNumber", 0L);
        setIntField(term178599, term178599.getClass(), "placeId", 0);
        setField(term178599, term178599.getClass(), "placeName", null);
        setField(term178599, term178599.getClass(), "country", null);
        setIntField(term178599, term178599.getClass(), "regionId", 0);
        setField(term178599, term178599.getClass(), "playDate", null);
        setField(term178599, term178599.getClass(), "userPlayDate", null);
        setIntField(term178599, term178599.getClass(), "musicId", 0);
        setIntField(term178599, term178599.getClass(), "level", 0);
        setIntField(term178599, term178599.getClass(), "gameMode", 0);
        setIntField(term178599, term178599.getClass(), "rivalNum", 0);
        setIntField(term178599, term178599.getClass(), "track", 0);
        setIntField(term178599, term178599.getClass(), "eventId", 0);
        setBooleanField(term178599, term178599.getClass(), "isFreeToPlay", false);
        setIntField(term178599, term178599.getClass(), "playerRating", 0);
        setLongField(term178599, term178599.getClass(), "playedUserId1", 0L);
        setField(term178599, term178599.getClass(), "playedUserName1", null);
        setIntField(term178599, term178599.getClass(), "playedMusicLevel1", 0);
        setLongField(term178599, term178599.getClass(), "playedUserId2", 0L);
        setField(term178599, term178599.getClass(), "playedUserName2", null);
        setIntField(term178599, term178599.getClass(), "playedMusicLevel2", 0);
        setLongField(term178599, term178599.getClass(), "playedUserId3", 0L);
        setField(term178599, term178599.getClass(), "playedUserName3", null);
        setIntField(term178599, term178599.getClass(), "playedMusicLevel3", 0);
        setIntField(term178599, term178599.getClass(), "achievement", 0);
        setIntField(term178599, term178599.getClass(), "score", 0);
        setIntField(term178599, term178599.getClass(), "tapScore", 0);
        setIntField(term178599, term178599.getClass(), "holdScore", 0);
        setIntField(term178599, term178599.getClass(), "slideScore", 0);
        setIntField(term178599, term178599.getClass(), "breakScore", 0);
        setIntField(term178599, term178599.getClass(), "syncRate", 0);
        setIntField(term178599, term178599.getClass(), "vsWin", 0);
        setBooleanField(term178599, term178599.getClass(), "isAllPerfect", false);
        setIntField(term178599, term178599.getClass(), "fullCombo", 0);
        setIntField(term178599, term178599.getClass(), "maxFever", 0);
        setIntField(term178599, term178599.getClass(), "maxCombo", 0);
        setIntField(term178599, term178599.getClass(), "tapPerfect", 0);
        setIntField(term178599, term178599.getClass(), "tapGreat", 0);
        setIntField(term178599, term178599.getClass(), "tapGood", 0);
        setIntField(term178599, term178599.getClass(), "tapBad", 0);
        setIntField(term178599, term178599.getClass(), "holdPerfect", 0);
        setIntField(term178599, term178599.getClass(), "holdGreat", 0);
        setIntField(term178599, term178599.getClass(), "holdGood", 0);
        setIntField(term178599, term178599.getClass(), "holdBad", 0);
        setIntField(term178599, term178599.getClass(), "slidePerfect", 0);
        setIntField(term178599, term178599.getClass(), "slideGreat", 0);
        setIntField(term178599, term178599.getClass(), "slideGood", 0);
        setIntField(term178599, term178599.getClass(), "slideBad", 0);
        setIntField(term178599, term178599.getClass(), "breakPerfect", 0);
        setIntField(term178599, term178599.getClass(), "breakGreat", 0);
        setIntField(term178599, term178599.getClass(), "breakGood", 0);
        setIntField(term178599, term178599.getClass(), "breakBad", 0);
        setBooleanField(term178599, term178599.getClass(), "isTrackSkip", false);
        setBooleanField(term178599, term178599.getClass(), "isHighScore", false);
        setBooleanField(term178599, term178599.getClass(), "isChallengeTrack", false);
        setIntField(term178599, term178599.getClass(), "challengeLife", 0);
        setIntField(term178599, term178599.getClass(), "challengeRemain", 0);
        setIntField(term178599, term178599.getClass(), "isAllPerfectPlus", 0);
        term178653 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term178653;
        callMethod(klass, "setHoldPerfect", argTypes, term178599, args);
    }

};


