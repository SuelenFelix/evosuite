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

public class UserPlaylog_getEventId_1618326330143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000089;

    public UserPlaylog_getEventId_1618326330143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4000089 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4000089, term4000089.getClass(), "id", 0L);
        setField(term4000089, term4000089.getClass(), "user", null);
        setIntField(term4000089, term4000089.getClass(), "orderId", 0);
        setLongField(term4000089, term4000089.getClass(), "sortNumber", 0L);
        setIntField(term4000089, term4000089.getClass(), "placeId", 0);
        setField(term4000089, term4000089.getClass(), "placeName", null);
        setField(term4000089, term4000089.getClass(), "country", null);
        setIntField(term4000089, term4000089.getClass(), "regionId", 0);
        setField(term4000089, term4000089.getClass(), "playDate", null);
        setField(term4000089, term4000089.getClass(), "userPlayDate", null);
        setIntField(term4000089, term4000089.getClass(), "musicId", 0);
        setIntField(term4000089, term4000089.getClass(), "level", 0);
        setIntField(term4000089, term4000089.getClass(), "gameMode", 0);
        setIntField(term4000089, term4000089.getClass(), "rivalNum", 0);
        setIntField(term4000089, term4000089.getClass(), "track", 0);
        setIntField(term4000089, term4000089.getClass(), "eventId", 0);
        setBooleanField(term4000089, term4000089.getClass(), "isFreeToPlay", false);
        setIntField(term4000089, term4000089.getClass(), "playerRating", 0);
        setLongField(term4000089, term4000089.getClass(), "playedUserId1", 0L);
        setField(term4000089, term4000089.getClass(), "playedUserName1", null);
        setIntField(term4000089, term4000089.getClass(), "playedMusicLevel1", 0);
        setLongField(term4000089, term4000089.getClass(), "playedUserId2", 0L);
        setField(term4000089, term4000089.getClass(), "playedUserName2", null);
        setIntField(term4000089, term4000089.getClass(), "playedMusicLevel2", 0);
        setLongField(term4000089, term4000089.getClass(), "playedUserId3", 0L);
        setField(term4000089, term4000089.getClass(), "playedUserName3", null);
        setIntField(term4000089, term4000089.getClass(), "playedMusicLevel3", 0);
        setIntField(term4000089, term4000089.getClass(), "achievement", 0);
        setIntField(term4000089, term4000089.getClass(), "score", 0);
        setIntField(term4000089, term4000089.getClass(), "tapScore", 0);
        setIntField(term4000089, term4000089.getClass(), "holdScore", 0);
        setIntField(term4000089, term4000089.getClass(), "slideScore", 0);
        setIntField(term4000089, term4000089.getClass(), "breakScore", 0);
        setIntField(term4000089, term4000089.getClass(), "syncRate", 0);
        setIntField(term4000089, term4000089.getClass(), "vsWin", 0);
        setBooleanField(term4000089, term4000089.getClass(), "isAllPerfect", false);
        setIntField(term4000089, term4000089.getClass(), "fullCombo", 0);
        setIntField(term4000089, term4000089.getClass(), "maxFever", 0);
        setIntField(term4000089, term4000089.getClass(), "maxCombo", 0);
        setIntField(term4000089, term4000089.getClass(), "tapPerfect", 0);
        setIntField(term4000089, term4000089.getClass(), "tapGreat", 0);
        setIntField(term4000089, term4000089.getClass(), "tapGood", 0);
        setIntField(term4000089, term4000089.getClass(), "tapBad", 0);
        setIntField(term4000089, term4000089.getClass(), "holdPerfect", 0);
        setIntField(term4000089, term4000089.getClass(), "holdGreat", 0);
        setIntField(term4000089, term4000089.getClass(), "holdGood", 0);
        setIntField(term4000089, term4000089.getClass(), "holdBad", 0);
        setIntField(term4000089, term4000089.getClass(), "slidePerfect", 0);
        setIntField(term4000089, term4000089.getClass(), "slideGreat", 0);
        setIntField(term4000089, term4000089.getClass(), "slideGood", 0);
        setIntField(term4000089, term4000089.getClass(), "slideBad", 0);
        setIntField(term4000089, term4000089.getClass(), "breakPerfect", 0);
        setIntField(term4000089, term4000089.getClass(), "breakGreat", 0);
        setIntField(term4000089, term4000089.getClass(), "breakGood", 0);
        setIntField(term4000089, term4000089.getClass(), "breakBad", 0);
        setBooleanField(term4000089, term4000089.getClass(), "isTrackSkip", false);
        setBooleanField(term4000089, term4000089.getClass(), "isHighScore", false);
        setBooleanField(term4000089, term4000089.getClass(), "isChallengeTrack", false);
        setIntField(term4000089, term4000089.getClass(), "challengeLife", 0);
        setIntField(term4000089, term4000089.getClass(), "challengeRemain", 0);
        setIntField(term4000089, term4000089.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term4000089, args);
    }

};


