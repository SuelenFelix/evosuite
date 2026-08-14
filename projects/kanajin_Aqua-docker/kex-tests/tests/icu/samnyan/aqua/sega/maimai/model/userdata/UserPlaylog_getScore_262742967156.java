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

public class UserPlaylog_getScore_262742967156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000791;

    public UserPlaylog_getScore_262742967156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4000791 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4000791, term4000791.getClass(), "id", 0L);
        setField(term4000791, term4000791.getClass(), "user", null);
        setIntField(term4000791, term4000791.getClass(), "orderId", 0);
        setLongField(term4000791, term4000791.getClass(), "sortNumber", 0L);
        setIntField(term4000791, term4000791.getClass(), "placeId", 0);
        setField(term4000791, term4000791.getClass(), "placeName", null);
        setField(term4000791, term4000791.getClass(), "country", null);
        setIntField(term4000791, term4000791.getClass(), "regionId", 0);
        setField(term4000791, term4000791.getClass(), "playDate", null);
        setField(term4000791, term4000791.getClass(), "userPlayDate", null);
        setIntField(term4000791, term4000791.getClass(), "musicId", 0);
        setIntField(term4000791, term4000791.getClass(), "level", 0);
        setIntField(term4000791, term4000791.getClass(), "gameMode", 0);
        setIntField(term4000791, term4000791.getClass(), "rivalNum", 0);
        setIntField(term4000791, term4000791.getClass(), "track", 0);
        setIntField(term4000791, term4000791.getClass(), "eventId", 0);
        setBooleanField(term4000791, term4000791.getClass(), "isFreeToPlay", false);
        setIntField(term4000791, term4000791.getClass(), "playerRating", 0);
        setLongField(term4000791, term4000791.getClass(), "playedUserId1", 0L);
        setField(term4000791, term4000791.getClass(), "playedUserName1", null);
        setIntField(term4000791, term4000791.getClass(), "playedMusicLevel1", 0);
        setLongField(term4000791, term4000791.getClass(), "playedUserId2", 0L);
        setField(term4000791, term4000791.getClass(), "playedUserName2", null);
        setIntField(term4000791, term4000791.getClass(), "playedMusicLevel2", 0);
        setLongField(term4000791, term4000791.getClass(), "playedUserId3", 0L);
        setField(term4000791, term4000791.getClass(), "playedUserName3", null);
        setIntField(term4000791, term4000791.getClass(), "playedMusicLevel3", 0);
        setIntField(term4000791, term4000791.getClass(), "achievement", 0);
        setIntField(term4000791, term4000791.getClass(), "score", 0);
        setIntField(term4000791, term4000791.getClass(), "tapScore", 0);
        setIntField(term4000791, term4000791.getClass(), "holdScore", 0);
        setIntField(term4000791, term4000791.getClass(), "slideScore", 0);
        setIntField(term4000791, term4000791.getClass(), "breakScore", 0);
        setIntField(term4000791, term4000791.getClass(), "syncRate", 0);
        setIntField(term4000791, term4000791.getClass(), "vsWin", 0);
        setBooleanField(term4000791, term4000791.getClass(), "isAllPerfect", false);
        setIntField(term4000791, term4000791.getClass(), "fullCombo", 0);
        setIntField(term4000791, term4000791.getClass(), "maxFever", 0);
        setIntField(term4000791, term4000791.getClass(), "maxCombo", 0);
        setIntField(term4000791, term4000791.getClass(), "tapPerfect", 0);
        setIntField(term4000791, term4000791.getClass(), "tapGreat", 0);
        setIntField(term4000791, term4000791.getClass(), "tapGood", 0);
        setIntField(term4000791, term4000791.getClass(), "tapBad", 0);
        setIntField(term4000791, term4000791.getClass(), "holdPerfect", 0);
        setIntField(term4000791, term4000791.getClass(), "holdGreat", 0);
        setIntField(term4000791, term4000791.getClass(), "holdGood", 0);
        setIntField(term4000791, term4000791.getClass(), "holdBad", 0);
        setIntField(term4000791, term4000791.getClass(), "slidePerfect", 0);
        setIntField(term4000791, term4000791.getClass(), "slideGreat", 0);
        setIntField(term4000791, term4000791.getClass(), "slideGood", 0);
        setIntField(term4000791, term4000791.getClass(), "slideBad", 0);
        setIntField(term4000791, term4000791.getClass(), "breakPerfect", 0);
        setIntField(term4000791, term4000791.getClass(), "breakGreat", 0);
        setIntField(term4000791, term4000791.getClass(), "breakGood", 0);
        setIntField(term4000791, term4000791.getClass(), "breakBad", 0);
        setBooleanField(term4000791, term4000791.getClass(), "isTrackSkip", false);
        setBooleanField(term4000791, term4000791.getClass(), "isHighScore", false);
        setBooleanField(term4000791, term4000791.getClass(), "isChallengeTrack", false);
        setIntField(term4000791, term4000791.getClass(), "challengeLife", 0);
        setIntField(term4000791, term4000791.getClass(), "challengeRemain", 0);
        setIntField(term4000791, term4000791.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term4000791, args);
    }

};


