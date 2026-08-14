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

public class UserPlaylog_getPlayerRating_1925570769145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000197;

    public UserPlaylog_getPlayerRating_1925570769145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4000197 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4000197, term4000197.getClass(), "id", 0L);
        setField(term4000197, term4000197.getClass(), "user", null);
        setIntField(term4000197, term4000197.getClass(), "orderId", 0);
        setLongField(term4000197, term4000197.getClass(), "sortNumber", 0L);
        setIntField(term4000197, term4000197.getClass(), "placeId", 0);
        setField(term4000197, term4000197.getClass(), "placeName", null);
        setField(term4000197, term4000197.getClass(), "country", null);
        setIntField(term4000197, term4000197.getClass(), "regionId", 0);
        setField(term4000197, term4000197.getClass(), "playDate", null);
        setField(term4000197, term4000197.getClass(), "userPlayDate", null);
        setIntField(term4000197, term4000197.getClass(), "musicId", 0);
        setIntField(term4000197, term4000197.getClass(), "level", 0);
        setIntField(term4000197, term4000197.getClass(), "gameMode", 0);
        setIntField(term4000197, term4000197.getClass(), "rivalNum", 0);
        setIntField(term4000197, term4000197.getClass(), "track", 0);
        setIntField(term4000197, term4000197.getClass(), "eventId", 0);
        setBooleanField(term4000197, term4000197.getClass(), "isFreeToPlay", false);
        setIntField(term4000197, term4000197.getClass(), "playerRating", 0);
        setLongField(term4000197, term4000197.getClass(), "playedUserId1", 0L);
        setField(term4000197, term4000197.getClass(), "playedUserName1", null);
        setIntField(term4000197, term4000197.getClass(), "playedMusicLevel1", 0);
        setLongField(term4000197, term4000197.getClass(), "playedUserId2", 0L);
        setField(term4000197, term4000197.getClass(), "playedUserName2", null);
        setIntField(term4000197, term4000197.getClass(), "playedMusicLevel2", 0);
        setLongField(term4000197, term4000197.getClass(), "playedUserId3", 0L);
        setField(term4000197, term4000197.getClass(), "playedUserName3", null);
        setIntField(term4000197, term4000197.getClass(), "playedMusicLevel3", 0);
        setIntField(term4000197, term4000197.getClass(), "achievement", 0);
        setIntField(term4000197, term4000197.getClass(), "score", 0);
        setIntField(term4000197, term4000197.getClass(), "tapScore", 0);
        setIntField(term4000197, term4000197.getClass(), "holdScore", 0);
        setIntField(term4000197, term4000197.getClass(), "slideScore", 0);
        setIntField(term4000197, term4000197.getClass(), "breakScore", 0);
        setIntField(term4000197, term4000197.getClass(), "syncRate", 0);
        setIntField(term4000197, term4000197.getClass(), "vsWin", 0);
        setBooleanField(term4000197, term4000197.getClass(), "isAllPerfect", false);
        setIntField(term4000197, term4000197.getClass(), "fullCombo", 0);
        setIntField(term4000197, term4000197.getClass(), "maxFever", 0);
        setIntField(term4000197, term4000197.getClass(), "maxCombo", 0);
        setIntField(term4000197, term4000197.getClass(), "tapPerfect", 0);
        setIntField(term4000197, term4000197.getClass(), "tapGreat", 0);
        setIntField(term4000197, term4000197.getClass(), "tapGood", 0);
        setIntField(term4000197, term4000197.getClass(), "tapBad", 0);
        setIntField(term4000197, term4000197.getClass(), "holdPerfect", 0);
        setIntField(term4000197, term4000197.getClass(), "holdGreat", 0);
        setIntField(term4000197, term4000197.getClass(), "holdGood", 0);
        setIntField(term4000197, term4000197.getClass(), "holdBad", 0);
        setIntField(term4000197, term4000197.getClass(), "slidePerfect", 0);
        setIntField(term4000197, term4000197.getClass(), "slideGreat", 0);
        setIntField(term4000197, term4000197.getClass(), "slideGood", 0);
        setIntField(term4000197, term4000197.getClass(), "slideBad", 0);
        setIntField(term4000197, term4000197.getClass(), "breakPerfect", 0);
        setIntField(term4000197, term4000197.getClass(), "breakGreat", 0);
        setIntField(term4000197, term4000197.getClass(), "breakGood", 0);
        setIntField(term4000197, term4000197.getClass(), "breakBad", 0);
        setBooleanField(term4000197, term4000197.getClass(), "isTrackSkip", false);
        setBooleanField(term4000197, term4000197.getClass(), "isHighScore", false);
        setBooleanField(term4000197, term4000197.getClass(), "isChallengeTrack", false);
        setIntField(term4000197, term4000197.getClass(), "challengeLife", 0);
        setIntField(term4000197, term4000197.getClass(), "challengeRemain", 0);
        setIntField(term4000197, term4000197.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term4000197, args);
    }

};


