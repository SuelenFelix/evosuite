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

public class UserPlaylog_getUserPlayDate_1112517731138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173455;

    public UserPlaylog_getUserPlayDate_1112517731138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173455 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173455, term173455.getClass(), "id", 0L);
        setField(term173455, term173455.getClass(), "user", null);
        setIntField(term173455, term173455.getClass(), "orderId", 0);
        setLongField(term173455, term173455.getClass(), "sortNumber", 0L);
        setIntField(term173455, term173455.getClass(), "placeId", 0);
        setField(term173455, term173455.getClass(), "placeName", null);
        setField(term173455, term173455.getClass(), "country", null);
        setIntField(term173455, term173455.getClass(), "regionId", 0);
        setField(term173455, term173455.getClass(), "playDate", null);
        setField(term173455, term173455.getClass(), "userPlayDate", null);
        setIntField(term173455, term173455.getClass(), "musicId", 0);
        setIntField(term173455, term173455.getClass(), "level", 0);
        setIntField(term173455, term173455.getClass(), "gameMode", 0);
        setIntField(term173455, term173455.getClass(), "rivalNum", 0);
        setIntField(term173455, term173455.getClass(), "track", 0);
        setIntField(term173455, term173455.getClass(), "eventId", 0);
        setBooleanField(term173455, term173455.getClass(), "isFreeToPlay", false);
        setIntField(term173455, term173455.getClass(), "playerRating", 0);
        setLongField(term173455, term173455.getClass(), "playedUserId1", 0L);
        setField(term173455, term173455.getClass(), "playedUserName1", null);
        setIntField(term173455, term173455.getClass(), "playedMusicLevel1", 0);
        setLongField(term173455, term173455.getClass(), "playedUserId2", 0L);
        setField(term173455, term173455.getClass(), "playedUserName2", null);
        setIntField(term173455, term173455.getClass(), "playedMusicLevel2", 0);
        setLongField(term173455, term173455.getClass(), "playedUserId3", 0L);
        setField(term173455, term173455.getClass(), "playedUserName3", null);
        setIntField(term173455, term173455.getClass(), "playedMusicLevel3", 0);
        setIntField(term173455, term173455.getClass(), "achievement", 0);
        setIntField(term173455, term173455.getClass(), "score", 0);
        setIntField(term173455, term173455.getClass(), "tapScore", 0);
        setIntField(term173455, term173455.getClass(), "holdScore", 0);
        setIntField(term173455, term173455.getClass(), "slideScore", 0);
        setIntField(term173455, term173455.getClass(), "breakScore", 0);
        setIntField(term173455, term173455.getClass(), "syncRate", 0);
        setIntField(term173455, term173455.getClass(), "vsWin", 0);
        setBooleanField(term173455, term173455.getClass(), "isAllPerfect", false);
        setIntField(term173455, term173455.getClass(), "fullCombo", 0);
        setIntField(term173455, term173455.getClass(), "maxFever", 0);
        setIntField(term173455, term173455.getClass(), "maxCombo", 0);
        setIntField(term173455, term173455.getClass(), "tapPerfect", 0);
        setIntField(term173455, term173455.getClass(), "tapGreat", 0);
        setIntField(term173455, term173455.getClass(), "tapGood", 0);
        setIntField(term173455, term173455.getClass(), "tapBad", 0);
        setIntField(term173455, term173455.getClass(), "holdPerfect", 0);
        setIntField(term173455, term173455.getClass(), "holdGreat", 0);
        setIntField(term173455, term173455.getClass(), "holdGood", 0);
        setIntField(term173455, term173455.getClass(), "holdBad", 0);
        setIntField(term173455, term173455.getClass(), "slidePerfect", 0);
        setIntField(term173455, term173455.getClass(), "slideGreat", 0);
        setIntField(term173455, term173455.getClass(), "slideGood", 0);
        setIntField(term173455, term173455.getClass(), "slideBad", 0);
        setIntField(term173455, term173455.getClass(), "breakPerfect", 0);
        setIntField(term173455, term173455.getClass(), "breakGreat", 0);
        setIntField(term173455, term173455.getClass(), "breakGood", 0);
        setIntField(term173455, term173455.getClass(), "breakBad", 0);
        setBooleanField(term173455, term173455.getClass(), "isTrackSkip", false);
        setBooleanField(term173455, term173455.getClass(), "isHighScore", false);
        setBooleanField(term173455, term173455.getClass(), "isChallengeTrack", false);
        setIntField(term173455, term173455.getClass(), "challengeLife", 0);
        setIntField(term173455, term173455.getClass(), "challengeRemain", 0);
        setIntField(term173455, term173455.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term173455, args);
    }

};


