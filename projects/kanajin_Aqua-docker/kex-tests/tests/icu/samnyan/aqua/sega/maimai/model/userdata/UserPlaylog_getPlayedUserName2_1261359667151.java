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

public class UserPlaylog_getPlayedUserName2_1261359667151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174157;

    public UserPlaylog_getPlayedUserName2_1261359667151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174157 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term174157, term174157.getClass(), "id", 0L);
        setField(term174157, term174157.getClass(), "user", null);
        setIntField(term174157, term174157.getClass(), "orderId", 0);
        setLongField(term174157, term174157.getClass(), "sortNumber", 0L);
        setIntField(term174157, term174157.getClass(), "placeId", 0);
        setField(term174157, term174157.getClass(), "placeName", null);
        setField(term174157, term174157.getClass(), "country", null);
        setIntField(term174157, term174157.getClass(), "regionId", 0);
        setField(term174157, term174157.getClass(), "playDate", null);
        setField(term174157, term174157.getClass(), "userPlayDate", null);
        setIntField(term174157, term174157.getClass(), "musicId", 0);
        setIntField(term174157, term174157.getClass(), "level", 0);
        setIntField(term174157, term174157.getClass(), "gameMode", 0);
        setIntField(term174157, term174157.getClass(), "rivalNum", 0);
        setIntField(term174157, term174157.getClass(), "track", 0);
        setIntField(term174157, term174157.getClass(), "eventId", 0);
        setBooleanField(term174157, term174157.getClass(), "isFreeToPlay", false);
        setIntField(term174157, term174157.getClass(), "playerRating", 0);
        setLongField(term174157, term174157.getClass(), "playedUserId1", 0L);
        setField(term174157, term174157.getClass(), "playedUserName1", null);
        setIntField(term174157, term174157.getClass(), "playedMusicLevel1", 0);
        setLongField(term174157, term174157.getClass(), "playedUserId2", 0L);
        setField(term174157, term174157.getClass(), "playedUserName2", null);
        setIntField(term174157, term174157.getClass(), "playedMusicLevel2", 0);
        setLongField(term174157, term174157.getClass(), "playedUserId3", 0L);
        setField(term174157, term174157.getClass(), "playedUserName3", null);
        setIntField(term174157, term174157.getClass(), "playedMusicLevel3", 0);
        setIntField(term174157, term174157.getClass(), "achievement", 0);
        setIntField(term174157, term174157.getClass(), "score", 0);
        setIntField(term174157, term174157.getClass(), "tapScore", 0);
        setIntField(term174157, term174157.getClass(), "holdScore", 0);
        setIntField(term174157, term174157.getClass(), "slideScore", 0);
        setIntField(term174157, term174157.getClass(), "breakScore", 0);
        setIntField(term174157, term174157.getClass(), "syncRate", 0);
        setIntField(term174157, term174157.getClass(), "vsWin", 0);
        setBooleanField(term174157, term174157.getClass(), "isAllPerfect", false);
        setIntField(term174157, term174157.getClass(), "fullCombo", 0);
        setIntField(term174157, term174157.getClass(), "maxFever", 0);
        setIntField(term174157, term174157.getClass(), "maxCombo", 0);
        setIntField(term174157, term174157.getClass(), "tapPerfect", 0);
        setIntField(term174157, term174157.getClass(), "tapGreat", 0);
        setIntField(term174157, term174157.getClass(), "tapGood", 0);
        setIntField(term174157, term174157.getClass(), "tapBad", 0);
        setIntField(term174157, term174157.getClass(), "holdPerfect", 0);
        setIntField(term174157, term174157.getClass(), "holdGreat", 0);
        setIntField(term174157, term174157.getClass(), "holdGood", 0);
        setIntField(term174157, term174157.getClass(), "holdBad", 0);
        setIntField(term174157, term174157.getClass(), "slidePerfect", 0);
        setIntField(term174157, term174157.getClass(), "slideGreat", 0);
        setIntField(term174157, term174157.getClass(), "slideGood", 0);
        setIntField(term174157, term174157.getClass(), "slideBad", 0);
        setIntField(term174157, term174157.getClass(), "breakPerfect", 0);
        setIntField(term174157, term174157.getClass(), "breakGreat", 0);
        setIntField(term174157, term174157.getClass(), "breakGood", 0);
        setIntField(term174157, term174157.getClass(), "breakBad", 0);
        setBooleanField(term174157, term174157.getClass(), "isTrackSkip", false);
        setBooleanField(term174157, term174157.getClass(), "isHighScore", false);
        setBooleanField(term174157, term174157.getClass(), "isChallengeTrack", false);
        setIntField(term174157, term174157.getClass(), "challengeLife", 0);
        setIntField(term174157, term174157.getClass(), "challengeRemain", 0);
        setIntField(term174157, term174157.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName2", argTypes, term174157, args);
    }

};


