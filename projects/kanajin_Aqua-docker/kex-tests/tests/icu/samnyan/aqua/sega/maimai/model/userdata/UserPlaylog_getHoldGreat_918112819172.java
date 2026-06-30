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

public class UserPlaylog_getHoldGreat_918112819172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175289;

    public UserPlaylog_getHoldGreat_918112819172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175289 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175289, term175289.getClass(), "id", 0L);
        setField(term175289, term175289.getClass(), "user", null);
        setIntField(term175289, term175289.getClass(), "orderId", 0);
        setLongField(term175289, term175289.getClass(), "sortNumber", 0L);
        setIntField(term175289, term175289.getClass(), "placeId", 0);
        setField(term175289, term175289.getClass(), "placeName", null);
        setField(term175289, term175289.getClass(), "country", null);
        setIntField(term175289, term175289.getClass(), "regionId", 0);
        setField(term175289, term175289.getClass(), "playDate", null);
        setField(term175289, term175289.getClass(), "userPlayDate", null);
        setIntField(term175289, term175289.getClass(), "musicId", 0);
        setIntField(term175289, term175289.getClass(), "level", 0);
        setIntField(term175289, term175289.getClass(), "gameMode", 0);
        setIntField(term175289, term175289.getClass(), "rivalNum", 0);
        setIntField(term175289, term175289.getClass(), "track", 0);
        setIntField(term175289, term175289.getClass(), "eventId", 0);
        setBooleanField(term175289, term175289.getClass(), "isFreeToPlay", false);
        setIntField(term175289, term175289.getClass(), "playerRating", 0);
        setLongField(term175289, term175289.getClass(), "playedUserId1", 0L);
        setField(term175289, term175289.getClass(), "playedUserName1", null);
        setIntField(term175289, term175289.getClass(), "playedMusicLevel1", 0);
        setLongField(term175289, term175289.getClass(), "playedUserId2", 0L);
        setField(term175289, term175289.getClass(), "playedUserName2", null);
        setIntField(term175289, term175289.getClass(), "playedMusicLevel2", 0);
        setLongField(term175289, term175289.getClass(), "playedUserId3", 0L);
        setField(term175289, term175289.getClass(), "playedUserName3", null);
        setIntField(term175289, term175289.getClass(), "playedMusicLevel3", 0);
        setIntField(term175289, term175289.getClass(), "achievement", 0);
        setIntField(term175289, term175289.getClass(), "score", 0);
        setIntField(term175289, term175289.getClass(), "tapScore", 0);
        setIntField(term175289, term175289.getClass(), "holdScore", 0);
        setIntField(term175289, term175289.getClass(), "slideScore", 0);
        setIntField(term175289, term175289.getClass(), "breakScore", 0);
        setIntField(term175289, term175289.getClass(), "syncRate", 0);
        setIntField(term175289, term175289.getClass(), "vsWin", 0);
        setBooleanField(term175289, term175289.getClass(), "isAllPerfect", false);
        setIntField(term175289, term175289.getClass(), "fullCombo", 0);
        setIntField(term175289, term175289.getClass(), "maxFever", 0);
        setIntField(term175289, term175289.getClass(), "maxCombo", 0);
        setIntField(term175289, term175289.getClass(), "tapPerfect", 0);
        setIntField(term175289, term175289.getClass(), "tapGreat", 0);
        setIntField(term175289, term175289.getClass(), "tapGood", 0);
        setIntField(term175289, term175289.getClass(), "tapBad", 0);
        setIntField(term175289, term175289.getClass(), "holdPerfect", 0);
        setIntField(term175289, term175289.getClass(), "holdGreat", 0);
        setIntField(term175289, term175289.getClass(), "holdGood", 0);
        setIntField(term175289, term175289.getClass(), "holdBad", 0);
        setIntField(term175289, term175289.getClass(), "slidePerfect", 0);
        setIntField(term175289, term175289.getClass(), "slideGreat", 0);
        setIntField(term175289, term175289.getClass(), "slideGood", 0);
        setIntField(term175289, term175289.getClass(), "slideBad", 0);
        setIntField(term175289, term175289.getClass(), "breakPerfect", 0);
        setIntField(term175289, term175289.getClass(), "breakGreat", 0);
        setIntField(term175289, term175289.getClass(), "breakGood", 0);
        setIntField(term175289, term175289.getClass(), "breakBad", 0);
        setBooleanField(term175289, term175289.getClass(), "isTrackSkip", false);
        setBooleanField(term175289, term175289.getClass(), "isHighScore", false);
        setBooleanField(term175289, term175289.getClass(), "isChallengeTrack", false);
        setIntField(term175289, term175289.getClass(), "challengeLife", 0);
        setIntField(term175289, term175289.getClass(), "challengeRemain", 0);
        setIntField(term175289, term175289.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldGreat", argTypes, term175289, args);
    }

};


