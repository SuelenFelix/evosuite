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
import java.lang.Boolean;

public class UserPlaylog_setHighScore_798127935245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179327;
     Object term179381;

    public UserPlaylog_setHighScore_798127935245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179327 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term179327, term179327.getClass(), "id", 0L);
        setField(term179327, term179327.getClass(), "user", null);
        setIntField(term179327, term179327.getClass(), "orderId", 0);
        setLongField(term179327, term179327.getClass(), "sortNumber", 0L);
        setIntField(term179327, term179327.getClass(), "placeId", 0);
        setField(term179327, term179327.getClass(), "placeName", null);
        setField(term179327, term179327.getClass(), "country", null);
        setIntField(term179327, term179327.getClass(), "regionId", 0);
        setField(term179327, term179327.getClass(), "playDate", null);
        setField(term179327, term179327.getClass(), "userPlayDate", null);
        setIntField(term179327, term179327.getClass(), "musicId", 0);
        setIntField(term179327, term179327.getClass(), "level", 0);
        setIntField(term179327, term179327.getClass(), "gameMode", 0);
        setIntField(term179327, term179327.getClass(), "rivalNum", 0);
        setIntField(term179327, term179327.getClass(), "track", 0);
        setIntField(term179327, term179327.getClass(), "eventId", 0);
        setBooleanField(term179327, term179327.getClass(), "isFreeToPlay", false);
        setIntField(term179327, term179327.getClass(), "playerRating", 0);
        setLongField(term179327, term179327.getClass(), "playedUserId1", 0L);
        setField(term179327, term179327.getClass(), "playedUserName1", null);
        setIntField(term179327, term179327.getClass(), "playedMusicLevel1", 0);
        setLongField(term179327, term179327.getClass(), "playedUserId2", 0L);
        setField(term179327, term179327.getClass(), "playedUserName2", null);
        setIntField(term179327, term179327.getClass(), "playedMusicLevel2", 0);
        setLongField(term179327, term179327.getClass(), "playedUserId3", 0L);
        setField(term179327, term179327.getClass(), "playedUserName3", null);
        setIntField(term179327, term179327.getClass(), "playedMusicLevel3", 0);
        setIntField(term179327, term179327.getClass(), "achievement", 0);
        setIntField(term179327, term179327.getClass(), "score", 0);
        setIntField(term179327, term179327.getClass(), "tapScore", 0);
        setIntField(term179327, term179327.getClass(), "holdScore", 0);
        setIntField(term179327, term179327.getClass(), "slideScore", 0);
        setIntField(term179327, term179327.getClass(), "breakScore", 0);
        setIntField(term179327, term179327.getClass(), "syncRate", 0);
        setIntField(term179327, term179327.getClass(), "vsWin", 0);
        setBooleanField(term179327, term179327.getClass(), "isAllPerfect", false);
        setIntField(term179327, term179327.getClass(), "fullCombo", 0);
        setIntField(term179327, term179327.getClass(), "maxFever", 0);
        setIntField(term179327, term179327.getClass(), "maxCombo", 0);
        setIntField(term179327, term179327.getClass(), "tapPerfect", 0);
        setIntField(term179327, term179327.getClass(), "tapGreat", 0);
        setIntField(term179327, term179327.getClass(), "tapGood", 0);
        setIntField(term179327, term179327.getClass(), "tapBad", 0);
        setIntField(term179327, term179327.getClass(), "holdPerfect", 0);
        setIntField(term179327, term179327.getClass(), "holdGreat", 0);
        setIntField(term179327, term179327.getClass(), "holdGood", 0);
        setIntField(term179327, term179327.getClass(), "holdBad", 0);
        setIntField(term179327, term179327.getClass(), "slidePerfect", 0);
        setIntField(term179327, term179327.getClass(), "slideGreat", 0);
        setIntField(term179327, term179327.getClass(), "slideGood", 0);
        setIntField(term179327, term179327.getClass(), "slideBad", 0);
        setIntField(term179327, term179327.getClass(), "breakPerfect", 0);
        setIntField(term179327, term179327.getClass(), "breakGreat", 0);
        setIntField(term179327, term179327.getClass(), "breakGood", 0);
        setIntField(term179327, term179327.getClass(), "breakBad", 0);
        setBooleanField(term179327, term179327.getClass(), "isTrackSkip", false);
        setBooleanField(term179327, term179327.getClass(), "isHighScore", false);
        setBooleanField(term179327, term179327.getClass(), "isChallengeTrack", false);
        setIntField(term179327, term179327.getClass(), "challengeLife", 0);
        setIntField(term179327, term179327.getClass(), "challengeRemain", 0);
        setIntField(term179327, term179327.getClass(), "isAllPerfectPlus", 0);
        term179381 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term179381;
        callMethod(klass, "setHighScore", argTypes, term179327, args);
    }

};


