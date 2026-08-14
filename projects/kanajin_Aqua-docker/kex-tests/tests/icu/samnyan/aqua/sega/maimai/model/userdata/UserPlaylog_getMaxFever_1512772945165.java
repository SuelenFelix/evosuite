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

public class UserPlaylog_getMaxFever_1512772945165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4001277;

    public UserPlaylog_getMaxFever_1512772945165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4001277 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4001277, term4001277.getClass(), "id", 0L);
        setField(term4001277, term4001277.getClass(), "user", null);
        setIntField(term4001277, term4001277.getClass(), "orderId", 0);
        setLongField(term4001277, term4001277.getClass(), "sortNumber", 0L);
        setIntField(term4001277, term4001277.getClass(), "placeId", 0);
        setField(term4001277, term4001277.getClass(), "placeName", null);
        setField(term4001277, term4001277.getClass(), "country", null);
        setIntField(term4001277, term4001277.getClass(), "regionId", 0);
        setField(term4001277, term4001277.getClass(), "playDate", null);
        setField(term4001277, term4001277.getClass(), "userPlayDate", null);
        setIntField(term4001277, term4001277.getClass(), "musicId", 0);
        setIntField(term4001277, term4001277.getClass(), "level", 0);
        setIntField(term4001277, term4001277.getClass(), "gameMode", 0);
        setIntField(term4001277, term4001277.getClass(), "rivalNum", 0);
        setIntField(term4001277, term4001277.getClass(), "track", 0);
        setIntField(term4001277, term4001277.getClass(), "eventId", 0);
        setBooleanField(term4001277, term4001277.getClass(), "isFreeToPlay", false);
        setIntField(term4001277, term4001277.getClass(), "playerRating", 0);
        setLongField(term4001277, term4001277.getClass(), "playedUserId1", 0L);
        setField(term4001277, term4001277.getClass(), "playedUserName1", null);
        setIntField(term4001277, term4001277.getClass(), "playedMusicLevel1", 0);
        setLongField(term4001277, term4001277.getClass(), "playedUserId2", 0L);
        setField(term4001277, term4001277.getClass(), "playedUserName2", null);
        setIntField(term4001277, term4001277.getClass(), "playedMusicLevel2", 0);
        setLongField(term4001277, term4001277.getClass(), "playedUserId3", 0L);
        setField(term4001277, term4001277.getClass(), "playedUserName3", null);
        setIntField(term4001277, term4001277.getClass(), "playedMusicLevel3", 0);
        setIntField(term4001277, term4001277.getClass(), "achievement", 0);
        setIntField(term4001277, term4001277.getClass(), "score", 0);
        setIntField(term4001277, term4001277.getClass(), "tapScore", 0);
        setIntField(term4001277, term4001277.getClass(), "holdScore", 0);
        setIntField(term4001277, term4001277.getClass(), "slideScore", 0);
        setIntField(term4001277, term4001277.getClass(), "breakScore", 0);
        setIntField(term4001277, term4001277.getClass(), "syncRate", 0);
        setIntField(term4001277, term4001277.getClass(), "vsWin", 0);
        setBooleanField(term4001277, term4001277.getClass(), "isAllPerfect", false);
        setIntField(term4001277, term4001277.getClass(), "fullCombo", 0);
        setIntField(term4001277, term4001277.getClass(), "maxFever", 0);
        setIntField(term4001277, term4001277.getClass(), "maxCombo", 0);
        setIntField(term4001277, term4001277.getClass(), "tapPerfect", 0);
        setIntField(term4001277, term4001277.getClass(), "tapGreat", 0);
        setIntField(term4001277, term4001277.getClass(), "tapGood", 0);
        setIntField(term4001277, term4001277.getClass(), "tapBad", 0);
        setIntField(term4001277, term4001277.getClass(), "holdPerfect", 0);
        setIntField(term4001277, term4001277.getClass(), "holdGreat", 0);
        setIntField(term4001277, term4001277.getClass(), "holdGood", 0);
        setIntField(term4001277, term4001277.getClass(), "holdBad", 0);
        setIntField(term4001277, term4001277.getClass(), "slidePerfect", 0);
        setIntField(term4001277, term4001277.getClass(), "slideGreat", 0);
        setIntField(term4001277, term4001277.getClass(), "slideGood", 0);
        setIntField(term4001277, term4001277.getClass(), "slideBad", 0);
        setIntField(term4001277, term4001277.getClass(), "breakPerfect", 0);
        setIntField(term4001277, term4001277.getClass(), "breakGreat", 0);
        setIntField(term4001277, term4001277.getClass(), "breakGood", 0);
        setIntField(term4001277, term4001277.getClass(), "breakBad", 0);
        setBooleanField(term4001277, term4001277.getClass(), "isTrackSkip", false);
        setBooleanField(term4001277, term4001277.getClass(), "isHighScore", false);
        setBooleanField(term4001277, term4001277.getClass(), "isChallengeTrack", false);
        setIntField(term4001277, term4001277.getClass(), "challengeLife", 0);
        setIntField(term4001277, term4001277.getClass(), "challengeRemain", 0);
        setIntField(term4001277, term4001277.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxFever", argTypes, term4001277, args);
    }

};


