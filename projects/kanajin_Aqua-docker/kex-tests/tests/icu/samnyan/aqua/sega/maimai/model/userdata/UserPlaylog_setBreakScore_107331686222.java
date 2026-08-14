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
import java.lang.Integer;

public class UserPlaylog_setBreakScore_107331686222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178039;
     Object term178093;

    public UserPlaylog_setBreakScore_107331686222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178039 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178039, term178039.getClass(), "id", 0L);
        setField(term178039, term178039.getClass(), "user", null);
        setIntField(term178039, term178039.getClass(), "orderId", 0);
        setLongField(term178039, term178039.getClass(), "sortNumber", 0L);
        setIntField(term178039, term178039.getClass(), "placeId", 0);
        setField(term178039, term178039.getClass(), "placeName", null);
        setField(term178039, term178039.getClass(), "country", null);
        setIntField(term178039, term178039.getClass(), "regionId", 0);
        setField(term178039, term178039.getClass(), "playDate", null);
        setField(term178039, term178039.getClass(), "userPlayDate", null);
        setIntField(term178039, term178039.getClass(), "musicId", 0);
        setIntField(term178039, term178039.getClass(), "level", 0);
        setIntField(term178039, term178039.getClass(), "gameMode", 0);
        setIntField(term178039, term178039.getClass(), "rivalNum", 0);
        setIntField(term178039, term178039.getClass(), "track", 0);
        setIntField(term178039, term178039.getClass(), "eventId", 0);
        setBooleanField(term178039, term178039.getClass(), "isFreeToPlay", false);
        setIntField(term178039, term178039.getClass(), "playerRating", 0);
        setLongField(term178039, term178039.getClass(), "playedUserId1", 0L);
        setField(term178039, term178039.getClass(), "playedUserName1", null);
        setIntField(term178039, term178039.getClass(), "playedMusicLevel1", 0);
        setLongField(term178039, term178039.getClass(), "playedUserId2", 0L);
        setField(term178039, term178039.getClass(), "playedUserName2", null);
        setIntField(term178039, term178039.getClass(), "playedMusicLevel2", 0);
        setLongField(term178039, term178039.getClass(), "playedUserId3", 0L);
        setField(term178039, term178039.getClass(), "playedUserName3", null);
        setIntField(term178039, term178039.getClass(), "playedMusicLevel3", 0);
        setIntField(term178039, term178039.getClass(), "achievement", 0);
        setIntField(term178039, term178039.getClass(), "score", 0);
        setIntField(term178039, term178039.getClass(), "tapScore", 0);
        setIntField(term178039, term178039.getClass(), "holdScore", 0);
        setIntField(term178039, term178039.getClass(), "slideScore", 0);
        setIntField(term178039, term178039.getClass(), "breakScore", 0);
        setIntField(term178039, term178039.getClass(), "syncRate", 0);
        setIntField(term178039, term178039.getClass(), "vsWin", 0);
        setBooleanField(term178039, term178039.getClass(), "isAllPerfect", false);
        setIntField(term178039, term178039.getClass(), "fullCombo", 0);
        setIntField(term178039, term178039.getClass(), "maxFever", 0);
        setIntField(term178039, term178039.getClass(), "maxCombo", 0);
        setIntField(term178039, term178039.getClass(), "tapPerfect", 0);
        setIntField(term178039, term178039.getClass(), "tapGreat", 0);
        setIntField(term178039, term178039.getClass(), "tapGood", 0);
        setIntField(term178039, term178039.getClass(), "tapBad", 0);
        setIntField(term178039, term178039.getClass(), "holdPerfect", 0);
        setIntField(term178039, term178039.getClass(), "holdGreat", 0);
        setIntField(term178039, term178039.getClass(), "holdGood", 0);
        setIntField(term178039, term178039.getClass(), "holdBad", 0);
        setIntField(term178039, term178039.getClass(), "slidePerfect", 0);
        setIntField(term178039, term178039.getClass(), "slideGreat", 0);
        setIntField(term178039, term178039.getClass(), "slideGood", 0);
        setIntField(term178039, term178039.getClass(), "slideBad", 0);
        setIntField(term178039, term178039.getClass(), "breakPerfect", 0);
        setIntField(term178039, term178039.getClass(), "breakGreat", 0);
        setIntField(term178039, term178039.getClass(), "breakGood", 0);
        setIntField(term178039, term178039.getClass(), "breakBad", 0);
        setBooleanField(term178039, term178039.getClass(), "isTrackSkip", false);
        setBooleanField(term178039, term178039.getClass(), "isHighScore", false);
        setBooleanField(term178039, term178039.getClass(), "isChallengeTrack", false);
        setIntField(term178039, term178039.getClass(), "challengeLife", 0);
        setIntField(term178039, term178039.getClass(), "challengeRemain", 0);
        setIntField(term178039, term178039.getClass(), "isAllPerfectPlus", 0);
        term178093 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term178093;
        callMethod(klass, "setBreakScore", argTypes, term178039, args);
    }

};


