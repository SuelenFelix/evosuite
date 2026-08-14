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

public class UserPlaylog_setPlayedUserId2_869961720211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177427;
     Object term177481;

    public UserPlaylog_setPlayedUserId2_869961720211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177427 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177427, term177427.getClass(), "id", 0L);
        setField(term177427, term177427.getClass(), "user", null);
        setIntField(term177427, term177427.getClass(), "orderId", 0);
        setLongField(term177427, term177427.getClass(), "sortNumber", 0L);
        setIntField(term177427, term177427.getClass(), "placeId", 0);
        setField(term177427, term177427.getClass(), "placeName", null);
        setField(term177427, term177427.getClass(), "country", null);
        setIntField(term177427, term177427.getClass(), "regionId", 0);
        setField(term177427, term177427.getClass(), "playDate", null);
        setField(term177427, term177427.getClass(), "userPlayDate", null);
        setIntField(term177427, term177427.getClass(), "musicId", 0);
        setIntField(term177427, term177427.getClass(), "level", 0);
        setIntField(term177427, term177427.getClass(), "gameMode", 0);
        setIntField(term177427, term177427.getClass(), "rivalNum", 0);
        setIntField(term177427, term177427.getClass(), "track", 0);
        setIntField(term177427, term177427.getClass(), "eventId", 0);
        setBooleanField(term177427, term177427.getClass(), "isFreeToPlay", false);
        setIntField(term177427, term177427.getClass(), "playerRating", 0);
        setLongField(term177427, term177427.getClass(), "playedUserId1", 0L);
        setField(term177427, term177427.getClass(), "playedUserName1", null);
        setIntField(term177427, term177427.getClass(), "playedMusicLevel1", 0);
        setLongField(term177427, term177427.getClass(), "playedUserId2", 0L);
        setField(term177427, term177427.getClass(), "playedUserName2", null);
        setIntField(term177427, term177427.getClass(), "playedMusicLevel2", 0);
        setLongField(term177427, term177427.getClass(), "playedUserId3", 0L);
        setField(term177427, term177427.getClass(), "playedUserName3", null);
        setIntField(term177427, term177427.getClass(), "playedMusicLevel3", 0);
        setIntField(term177427, term177427.getClass(), "achievement", 0);
        setIntField(term177427, term177427.getClass(), "score", 0);
        setIntField(term177427, term177427.getClass(), "tapScore", 0);
        setIntField(term177427, term177427.getClass(), "holdScore", 0);
        setIntField(term177427, term177427.getClass(), "slideScore", 0);
        setIntField(term177427, term177427.getClass(), "breakScore", 0);
        setIntField(term177427, term177427.getClass(), "syncRate", 0);
        setIntField(term177427, term177427.getClass(), "vsWin", 0);
        setBooleanField(term177427, term177427.getClass(), "isAllPerfect", false);
        setIntField(term177427, term177427.getClass(), "fullCombo", 0);
        setIntField(term177427, term177427.getClass(), "maxFever", 0);
        setIntField(term177427, term177427.getClass(), "maxCombo", 0);
        setIntField(term177427, term177427.getClass(), "tapPerfect", 0);
        setIntField(term177427, term177427.getClass(), "tapGreat", 0);
        setIntField(term177427, term177427.getClass(), "tapGood", 0);
        setIntField(term177427, term177427.getClass(), "tapBad", 0);
        setIntField(term177427, term177427.getClass(), "holdPerfect", 0);
        setIntField(term177427, term177427.getClass(), "holdGreat", 0);
        setIntField(term177427, term177427.getClass(), "holdGood", 0);
        setIntField(term177427, term177427.getClass(), "holdBad", 0);
        setIntField(term177427, term177427.getClass(), "slidePerfect", 0);
        setIntField(term177427, term177427.getClass(), "slideGreat", 0);
        setIntField(term177427, term177427.getClass(), "slideGood", 0);
        setIntField(term177427, term177427.getClass(), "slideBad", 0);
        setIntField(term177427, term177427.getClass(), "breakPerfect", 0);
        setIntField(term177427, term177427.getClass(), "breakGreat", 0);
        setIntField(term177427, term177427.getClass(), "breakGood", 0);
        setIntField(term177427, term177427.getClass(), "breakBad", 0);
        setBooleanField(term177427, term177427.getClass(), "isTrackSkip", false);
        setBooleanField(term177427, term177427.getClass(), "isHighScore", false);
        setBooleanField(term177427, term177427.getClass(), "isChallengeTrack", false);
        setIntField(term177427, term177427.getClass(), "challengeLife", 0);
        setIntField(term177427, term177427.getClass(), "challengeRemain", 0);
        setIntField(term177427, term177427.getClass(), "isAllPerfectPlus", 0);
        term177481 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term177481;
        callMethod(klass, "setPlayedUserId2", argTypes, term177427, args);
    }

};


