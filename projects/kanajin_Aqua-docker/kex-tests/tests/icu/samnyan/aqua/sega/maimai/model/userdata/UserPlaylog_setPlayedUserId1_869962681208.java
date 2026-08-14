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

public class UserPlaylog_setPlayedUserId1_869962681208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177261;
     Object term177315;

    public UserPlaylog_setPlayedUserId1_869962681208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177261 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177261, term177261.getClass(), "id", 0L);
        setField(term177261, term177261.getClass(), "user", null);
        setIntField(term177261, term177261.getClass(), "orderId", 0);
        setLongField(term177261, term177261.getClass(), "sortNumber", 0L);
        setIntField(term177261, term177261.getClass(), "placeId", 0);
        setField(term177261, term177261.getClass(), "placeName", null);
        setField(term177261, term177261.getClass(), "country", null);
        setIntField(term177261, term177261.getClass(), "regionId", 0);
        setField(term177261, term177261.getClass(), "playDate", null);
        setField(term177261, term177261.getClass(), "userPlayDate", null);
        setIntField(term177261, term177261.getClass(), "musicId", 0);
        setIntField(term177261, term177261.getClass(), "level", 0);
        setIntField(term177261, term177261.getClass(), "gameMode", 0);
        setIntField(term177261, term177261.getClass(), "rivalNum", 0);
        setIntField(term177261, term177261.getClass(), "track", 0);
        setIntField(term177261, term177261.getClass(), "eventId", 0);
        setBooleanField(term177261, term177261.getClass(), "isFreeToPlay", false);
        setIntField(term177261, term177261.getClass(), "playerRating", 0);
        setLongField(term177261, term177261.getClass(), "playedUserId1", 0L);
        setField(term177261, term177261.getClass(), "playedUserName1", null);
        setIntField(term177261, term177261.getClass(), "playedMusicLevel1", 0);
        setLongField(term177261, term177261.getClass(), "playedUserId2", 0L);
        setField(term177261, term177261.getClass(), "playedUserName2", null);
        setIntField(term177261, term177261.getClass(), "playedMusicLevel2", 0);
        setLongField(term177261, term177261.getClass(), "playedUserId3", 0L);
        setField(term177261, term177261.getClass(), "playedUserName3", null);
        setIntField(term177261, term177261.getClass(), "playedMusicLevel3", 0);
        setIntField(term177261, term177261.getClass(), "achievement", 0);
        setIntField(term177261, term177261.getClass(), "score", 0);
        setIntField(term177261, term177261.getClass(), "tapScore", 0);
        setIntField(term177261, term177261.getClass(), "holdScore", 0);
        setIntField(term177261, term177261.getClass(), "slideScore", 0);
        setIntField(term177261, term177261.getClass(), "breakScore", 0);
        setIntField(term177261, term177261.getClass(), "syncRate", 0);
        setIntField(term177261, term177261.getClass(), "vsWin", 0);
        setBooleanField(term177261, term177261.getClass(), "isAllPerfect", false);
        setIntField(term177261, term177261.getClass(), "fullCombo", 0);
        setIntField(term177261, term177261.getClass(), "maxFever", 0);
        setIntField(term177261, term177261.getClass(), "maxCombo", 0);
        setIntField(term177261, term177261.getClass(), "tapPerfect", 0);
        setIntField(term177261, term177261.getClass(), "tapGreat", 0);
        setIntField(term177261, term177261.getClass(), "tapGood", 0);
        setIntField(term177261, term177261.getClass(), "tapBad", 0);
        setIntField(term177261, term177261.getClass(), "holdPerfect", 0);
        setIntField(term177261, term177261.getClass(), "holdGreat", 0);
        setIntField(term177261, term177261.getClass(), "holdGood", 0);
        setIntField(term177261, term177261.getClass(), "holdBad", 0);
        setIntField(term177261, term177261.getClass(), "slidePerfect", 0);
        setIntField(term177261, term177261.getClass(), "slideGreat", 0);
        setIntField(term177261, term177261.getClass(), "slideGood", 0);
        setIntField(term177261, term177261.getClass(), "slideBad", 0);
        setIntField(term177261, term177261.getClass(), "breakPerfect", 0);
        setIntField(term177261, term177261.getClass(), "breakGreat", 0);
        setIntField(term177261, term177261.getClass(), "breakGood", 0);
        setIntField(term177261, term177261.getClass(), "breakBad", 0);
        setBooleanField(term177261, term177261.getClass(), "isTrackSkip", false);
        setBooleanField(term177261, term177261.getClass(), "isHighScore", false);
        setBooleanField(term177261, term177261.getClass(), "isChallengeTrack", false);
        setIntField(term177261, term177261.getClass(), "challengeLife", 0);
        setIntField(term177261, term177261.getClass(), "challengeRemain", 0);
        setIntField(term177261, term177261.getClass(), "isAllPerfectPlus", 0);
        term177315 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term177315;
        callMethod(klass, "setPlayedUserId1", argTypes, term177261, args);
    }

};


