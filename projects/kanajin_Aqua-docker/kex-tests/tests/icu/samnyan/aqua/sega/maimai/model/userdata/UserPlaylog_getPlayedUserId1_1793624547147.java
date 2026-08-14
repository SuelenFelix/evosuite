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

public class UserPlaylog_getPlayedUserId1_1793624547147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173941;

    public UserPlaylog_getPlayedUserId1_1793624547147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173941 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173941, term173941.getClass(), "id", 0L);
        setField(term173941, term173941.getClass(), "user", null);
        setIntField(term173941, term173941.getClass(), "orderId", 0);
        setLongField(term173941, term173941.getClass(), "sortNumber", 0L);
        setIntField(term173941, term173941.getClass(), "placeId", 0);
        setField(term173941, term173941.getClass(), "placeName", null);
        setField(term173941, term173941.getClass(), "country", null);
        setIntField(term173941, term173941.getClass(), "regionId", 0);
        setField(term173941, term173941.getClass(), "playDate", null);
        setField(term173941, term173941.getClass(), "userPlayDate", null);
        setIntField(term173941, term173941.getClass(), "musicId", 0);
        setIntField(term173941, term173941.getClass(), "level", 0);
        setIntField(term173941, term173941.getClass(), "gameMode", 0);
        setIntField(term173941, term173941.getClass(), "rivalNum", 0);
        setIntField(term173941, term173941.getClass(), "track", 0);
        setIntField(term173941, term173941.getClass(), "eventId", 0);
        setBooleanField(term173941, term173941.getClass(), "isFreeToPlay", false);
        setIntField(term173941, term173941.getClass(), "playerRating", 0);
        setLongField(term173941, term173941.getClass(), "playedUserId1", 0L);
        setField(term173941, term173941.getClass(), "playedUserName1", null);
        setIntField(term173941, term173941.getClass(), "playedMusicLevel1", 0);
        setLongField(term173941, term173941.getClass(), "playedUserId2", 0L);
        setField(term173941, term173941.getClass(), "playedUserName2", null);
        setIntField(term173941, term173941.getClass(), "playedMusicLevel2", 0);
        setLongField(term173941, term173941.getClass(), "playedUserId3", 0L);
        setField(term173941, term173941.getClass(), "playedUserName3", null);
        setIntField(term173941, term173941.getClass(), "playedMusicLevel3", 0);
        setIntField(term173941, term173941.getClass(), "achievement", 0);
        setIntField(term173941, term173941.getClass(), "score", 0);
        setIntField(term173941, term173941.getClass(), "tapScore", 0);
        setIntField(term173941, term173941.getClass(), "holdScore", 0);
        setIntField(term173941, term173941.getClass(), "slideScore", 0);
        setIntField(term173941, term173941.getClass(), "breakScore", 0);
        setIntField(term173941, term173941.getClass(), "syncRate", 0);
        setIntField(term173941, term173941.getClass(), "vsWin", 0);
        setBooleanField(term173941, term173941.getClass(), "isAllPerfect", false);
        setIntField(term173941, term173941.getClass(), "fullCombo", 0);
        setIntField(term173941, term173941.getClass(), "maxFever", 0);
        setIntField(term173941, term173941.getClass(), "maxCombo", 0);
        setIntField(term173941, term173941.getClass(), "tapPerfect", 0);
        setIntField(term173941, term173941.getClass(), "tapGreat", 0);
        setIntField(term173941, term173941.getClass(), "tapGood", 0);
        setIntField(term173941, term173941.getClass(), "tapBad", 0);
        setIntField(term173941, term173941.getClass(), "holdPerfect", 0);
        setIntField(term173941, term173941.getClass(), "holdGreat", 0);
        setIntField(term173941, term173941.getClass(), "holdGood", 0);
        setIntField(term173941, term173941.getClass(), "holdBad", 0);
        setIntField(term173941, term173941.getClass(), "slidePerfect", 0);
        setIntField(term173941, term173941.getClass(), "slideGreat", 0);
        setIntField(term173941, term173941.getClass(), "slideGood", 0);
        setIntField(term173941, term173941.getClass(), "slideBad", 0);
        setIntField(term173941, term173941.getClass(), "breakPerfect", 0);
        setIntField(term173941, term173941.getClass(), "breakGreat", 0);
        setIntField(term173941, term173941.getClass(), "breakGood", 0);
        setIntField(term173941, term173941.getClass(), "breakBad", 0);
        setBooleanField(term173941, term173941.getClass(), "isTrackSkip", false);
        setBooleanField(term173941, term173941.getClass(), "isHighScore", false);
        setBooleanField(term173941, term173941.getClass(), "isChallengeTrack", false);
        setIntField(term173941, term173941.getClass(), "challengeLife", 0);
        setIntField(term173941, term173941.getClass(), "challengeRemain", 0);
        setIntField(term173941, term173941.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId1", argTypes, term173941, args);
    }

};


