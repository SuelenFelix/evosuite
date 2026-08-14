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

public class UserPlaylog_getTapPerfect_452251835167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4001385;

    public UserPlaylog_getTapPerfect_452251835167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4001385 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4001385, term4001385.getClass(), "id", 0L);
        setField(term4001385, term4001385.getClass(), "user", null);
        setIntField(term4001385, term4001385.getClass(), "orderId", 0);
        setLongField(term4001385, term4001385.getClass(), "sortNumber", 0L);
        setIntField(term4001385, term4001385.getClass(), "placeId", 0);
        setField(term4001385, term4001385.getClass(), "placeName", null);
        setField(term4001385, term4001385.getClass(), "country", null);
        setIntField(term4001385, term4001385.getClass(), "regionId", 0);
        setField(term4001385, term4001385.getClass(), "playDate", null);
        setField(term4001385, term4001385.getClass(), "userPlayDate", null);
        setIntField(term4001385, term4001385.getClass(), "musicId", 0);
        setIntField(term4001385, term4001385.getClass(), "level", 0);
        setIntField(term4001385, term4001385.getClass(), "gameMode", 0);
        setIntField(term4001385, term4001385.getClass(), "rivalNum", 0);
        setIntField(term4001385, term4001385.getClass(), "track", 0);
        setIntField(term4001385, term4001385.getClass(), "eventId", 0);
        setBooleanField(term4001385, term4001385.getClass(), "isFreeToPlay", false);
        setIntField(term4001385, term4001385.getClass(), "playerRating", 0);
        setLongField(term4001385, term4001385.getClass(), "playedUserId1", 0L);
        setField(term4001385, term4001385.getClass(), "playedUserName1", null);
        setIntField(term4001385, term4001385.getClass(), "playedMusicLevel1", 0);
        setLongField(term4001385, term4001385.getClass(), "playedUserId2", 0L);
        setField(term4001385, term4001385.getClass(), "playedUserName2", null);
        setIntField(term4001385, term4001385.getClass(), "playedMusicLevel2", 0);
        setLongField(term4001385, term4001385.getClass(), "playedUserId3", 0L);
        setField(term4001385, term4001385.getClass(), "playedUserName3", null);
        setIntField(term4001385, term4001385.getClass(), "playedMusicLevel3", 0);
        setIntField(term4001385, term4001385.getClass(), "achievement", 0);
        setIntField(term4001385, term4001385.getClass(), "score", 0);
        setIntField(term4001385, term4001385.getClass(), "tapScore", 0);
        setIntField(term4001385, term4001385.getClass(), "holdScore", 0);
        setIntField(term4001385, term4001385.getClass(), "slideScore", 0);
        setIntField(term4001385, term4001385.getClass(), "breakScore", 0);
        setIntField(term4001385, term4001385.getClass(), "syncRate", 0);
        setIntField(term4001385, term4001385.getClass(), "vsWin", 0);
        setBooleanField(term4001385, term4001385.getClass(), "isAllPerfect", false);
        setIntField(term4001385, term4001385.getClass(), "fullCombo", 0);
        setIntField(term4001385, term4001385.getClass(), "maxFever", 0);
        setIntField(term4001385, term4001385.getClass(), "maxCombo", 0);
        setIntField(term4001385, term4001385.getClass(), "tapPerfect", 0);
        setIntField(term4001385, term4001385.getClass(), "tapGreat", 0);
        setIntField(term4001385, term4001385.getClass(), "tapGood", 0);
        setIntField(term4001385, term4001385.getClass(), "tapBad", 0);
        setIntField(term4001385, term4001385.getClass(), "holdPerfect", 0);
        setIntField(term4001385, term4001385.getClass(), "holdGreat", 0);
        setIntField(term4001385, term4001385.getClass(), "holdGood", 0);
        setIntField(term4001385, term4001385.getClass(), "holdBad", 0);
        setIntField(term4001385, term4001385.getClass(), "slidePerfect", 0);
        setIntField(term4001385, term4001385.getClass(), "slideGreat", 0);
        setIntField(term4001385, term4001385.getClass(), "slideGood", 0);
        setIntField(term4001385, term4001385.getClass(), "slideBad", 0);
        setIntField(term4001385, term4001385.getClass(), "breakPerfect", 0);
        setIntField(term4001385, term4001385.getClass(), "breakGreat", 0);
        setIntField(term4001385, term4001385.getClass(), "breakGood", 0);
        setIntField(term4001385, term4001385.getClass(), "breakBad", 0);
        setBooleanField(term4001385, term4001385.getClass(), "isTrackSkip", false);
        setBooleanField(term4001385, term4001385.getClass(), "isHighScore", false);
        setBooleanField(term4001385, term4001385.getClass(), "isChallengeTrack", false);
        setIntField(term4001385, term4001385.getClass(), "challengeLife", 0);
        setIntField(term4001385, term4001385.getClass(), "challengeRemain", 0);
        setIntField(term4001385, term4001385.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapPerfect", argTypes, term4001385, args);
    }

};


