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

public class UserPlaylog_getHoldBad_1533001621174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175397;

    public UserPlaylog_getHoldBad_1533001621174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175397 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175397, term175397.getClass(), "id", 0L);
        setField(term175397, term175397.getClass(), "user", null);
        setIntField(term175397, term175397.getClass(), "orderId", 0);
        setLongField(term175397, term175397.getClass(), "sortNumber", 0L);
        setIntField(term175397, term175397.getClass(), "placeId", 0);
        setField(term175397, term175397.getClass(), "placeName", null);
        setField(term175397, term175397.getClass(), "country", null);
        setIntField(term175397, term175397.getClass(), "regionId", 0);
        setField(term175397, term175397.getClass(), "playDate", null);
        setField(term175397, term175397.getClass(), "userPlayDate", null);
        setIntField(term175397, term175397.getClass(), "musicId", 0);
        setIntField(term175397, term175397.getClass(), "level", 0);
        setIntField(term175397, term175397.getClass(), "gameMode", 0);
        setIntField(term175397, term175397.getClass(), "rivalNum", 0);
        setIntField(term175397, term175397.getClass(), "track", 0);
        setIntField(term175397, term175397.getClass(), "eventId", 0);
        setBooleanField(term175397, term175397.getClass(), "isFreeToPlay", false);
        setIntField(term175397, term175397.getClass(), "playerRating", 0);
        setLongField(term175397, term175397.getClass(), "playedUserId1", 0L);
        setField(term175397, term175397.getClass(), "playedUserName1", null);
        setIntField(term175397, term175397.getClass(), "playedMusicLevel1", 0);
        setLongField(term175397, term175397.getClass(), "playedUserId2", 0L);
        setField(term175397, term175397.getClass(), "playedUserName2", null);
        setIntField(term175397, term175397.getClass(), "playedMusicLevel2", 0);
        setLongField(term175397, term175397.getClass(), "playedUserId3", 0L);
        setField(term175397, term175397.getClass(), "playedUserName3", null);
        setIntField(term175397, term175397.getClass(), "playedMusicLevel3", 0);
        setIntField(term175397, term175397.getClass(), "achievement", 0);
        setIntField(term175397, term175397.getClass(), "score", 0);
        setIntField(term175397, term175397.getClass(), "tapScore", 0);
        setIntField(term175397, term175397.getClass(), "holdScore", 0);
        setIntField(term175397, term175397.getClass(), "slideScore", 0);
        setIntField(term175397, term175397.getClass(), "breakScore", 0);
        setIntField(term175397, term175397.getClass(), "syncRate", 0);
        setIntField(term175397, term175397.getClass(), "vsWin", 0);
        setBooleanField(term175397, term175397.getClass(), "isAllPerfect", false);
        setIntField(term175397, term175397.getClass(), "fullCombo", 0);
        setIntField(term175397, term175397.getClass(), "maxFever", 0);
        setIntField(term175397, term175397.getClass(), "maxCombo", 0);
        setIntField(term175397, term175397.getClass(), "tapPerfect", 0);
        setIntField(term175397, term175397.getClass(), "tapGreat", 0);
        setIntField(term175397, term175397.getClass(), "tapGood", 0);
        setIntField(term175397, term175397.getClass(), "tapBad", 0);
        setIntField(term175397, term175397.getClass(), "holdPerfect", 0);
        setIntField(term175397, term175397.getClass(), "holdGreat", 0);
        setIntField(term175397, term175397.getClass(), "holdGood", 0);
        setIntField(term175397, term175397.getClass(), "holdBad", 0);
        setIntField(term175397, term175397.getClass(), "slidePerfect", 0);
        setIntField(term175397, term175397.getClass(), "slideGreat", 0);
        setIntField(term175397, term175397.getClass(), "slideGood", 0);
        setIntField(term175397, term175397.getClass(), "slideBad", 0);
        setIntField(term175397, term175397.getClass(), "breakPerfect", 0);
        setIntField(term175397, term175397.getClass(), "breakGreat", 0);
        setIntField(term175397, term175397.getClass(), "breakGood", 0);
        setIntField(term175397, term175397.getClass(), "breakBad", 0);
        setBooleanField(term175397, term175397.getClass(), "isTrackSkip", false);
        setBooleanField(term175397, term175397.getClass(), "isHighScore", false);
        setBooleanField(term175397, term175397.getClass(), "isChallengeTrack", false);
        setIntField(term175397, term175397.getClass(), "challengeLife", 0);
        setIntField(term175397, term175397.getClass(), "challengeRemain", 0);
        setIntField(term175397, term175397.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldBad", argTypes, term175397, args);
    }

};


