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

public class UserPlaylog_getHoldPerfect_679920883171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4001601;

    public UserPlaylog_getHoldPerfect_679920883171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4001601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4001601, term4001601.getClass(), "id", 0L);
        setField(term4001601, term4001601.getClass(), "user", null);
        setIntField(term4001601, term4001601.getClass(), "orderId", 0);
        setLongField(term4001601, term4001601.getClass(), "sortNumber", 0L);
        setIntField(term4001601, term4001601.getClass(), "placeId", 0);
        setField(term4001601, term4001601.getClass(), "placeName", null);
        setField(term4001601, term4001601.getClass(), "country", null);
        setIntField(term4001601, term4001601.getClass(), "regionId", 0);
        setField(term4001601, term4001601.getClass(), "playDate", null);
        setField(term4001601, term4001601.getClass(), "userPlayDate", null);
        setIntField(term4001601, term4001601.getClass(), "musicId", 0);
        setIntField(term4001601, term4001601.getClass(), "level", 0);
        setIntField(term4001601, term4001601.getClass(), "gameMode", 0);
        setIntField(term4001601, term4001601.getClass(), "rivalNum", 0);
        setIntField(term4001601, term4001601.getClass(), "track", 0);
        setIntField(term4001601, term4001601.getClass(), "eventId", 0);
        setBooleanField(term4001601, term4001601.getClass(), "isFreeToPlay", false);
        setIntField(term4001601, term4001601.getClass(), "playerRating", 0);
        setLongField(term4001601, term4001601.getClass(), "playedUserId1", 0L);
        setField(term4001601, term4001601.getClass(), "playedUserName1", null);
        setIntField(term4001601, term4001601.getClass(), "playedMusicLevel1", 0);
        setLongField(term4001601, term4001601.getClass(), "playedUserId2", 0L);
        setField(term4001601, term4001601.getClass(), "playedUserName2", null);
        setIntField(term4001601, term4001601.getClass(), "playedMusicLevel2", 0);
        setLongField(term4001601, term4001601.getClass(), "playedUserId3", 0L);
        setField(term4001601, term4001601.getClass(), "playedUserName3", null);
        setIntField(term4001601, term4001601.getClass(), "playedMusicLevel3", 0);
        setIntField(term4001601, term4001601.getClass(), "achievement", 0);
        setIntField(term4001601, term4001601.getClass(), "score", 0);
        setIntField(term4001601, term4001601.getClass(), "tapScore", 0);
        setIntField(term4001601, term4001601.getClass(), "holdScore", 0);
        setIntField(term4001601, term4001601.getClass(), "slideScore", 0);
        setIntField(term4001601, term4001601.getClass(), "breakScore", 0);
        setIntField(term4001601, term4001601.getClass(), "syncRate", 0);
        setIntField(term4001601, term4001601.getClass(), "vsWin", 0);
        setBooleanField(term4001601, term4001601.getClass(), "isAllPerfect", false);
        setIntField(term4001601, term4001601.getClass(), "fullCombo", 0);
        setIntField(term4001601, term4001601.getClass(), "maxFever", 0);
        setIntField(term4001601, term4001601.getClass(), "maxCombo", 0);
        setIntField(term4001601, term4001601.getClass(), "tapPerfect", 0);
        setIntField(term4001601, term4001601.getClass(), "tapGreat", 0);
        setIntField(term4001601, term4001601.getClass(), "tapGood", 0);
        setIntField(term4001601, term4001601.getClass(), "tapBad", 0);
        setIntField(term4001601, term4001601.getClass(), "holdPerfect", 0);
        setIntField(term4001601, term4001601.getClass(), "holdGreat", 0);
        setIntField(term4001601, term4001601.getClass(), "holdGood", 0);
        setIntField(term4001601, term4001601.getClass(), "holdBad", 0);
        setIntField(term4001601, term4001601.getClass(), "slidePerfect", 0);
        setIntField(term4001601, term4001601.getClass(), "slideGreat", 0);
        setIntField(term4001601, term4001601.getClass(), "slideGood", 0);
        setIntField(term4001601, term4001601.getClass(), "slideBad", 0);
        setIntField(term4001601, term4001601.getClass(), "breakPerfect", 0);
        setIntField(term4001601, term4001601.getClass(), "breakGreat", 0);
        setIntField(term4001601, term4001601.getClass(), "breakGood", 0);
        setIntField(term4001601, term4001601.getClass(), "breakBad", 0);
        setBooleanField(term4001601, term4001601.getClass(), "isTrackSkip", false);
        setBooleanField(term4001601, term4001601.getClass(), "isHighScore", false);
        setBooleanField(term4001601, term4001601.getClass(), "isChallengeTrack", false);
        setIntField(term4001601, term4001601.getClass(), "challengeLife", 0);
        setIntField(term4001601, term4001601.getClass(), "challengeRemain", 0);
        setIntField(term4001601, term4001601.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldPerfect", argTypes, term4001601, args);
    }

};


