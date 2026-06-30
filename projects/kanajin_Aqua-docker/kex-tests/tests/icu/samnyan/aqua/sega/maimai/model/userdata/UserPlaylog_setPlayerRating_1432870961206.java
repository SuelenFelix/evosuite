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

public class UserPlaylog_setPlayerRating_1432870961206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177149;
     Object term177203;

    public UserPlaylog_setPlayerRating_1432870961206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177149 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177149, term177149.getClass(), "id", 0L);
        setField(term177149, term177149.getClass(), "user", null);
        setIntField(term177149, term177149.getClass(), "orderId", 0);
        setLongField(term177149, term177149.getClass(), "sortNumber", 0L);
        setIntField(term177149, term177149.getClass(), "placeId", 0);
        setField(term177149, term177149.getClass(), "placeName", null);
        setField(term177149, term177149.getClass(), "country", null);
        setIntField(term177149, term177149.getClass(), "regionId", 0);
        setField(term177149, term177149.getClass(), "playDate", null);
        setField(term177149, term177149.getClass(), "userPlayDate", null);
        setIntField(term177149, term177149.getClass(), "musicId", 0);
        setIntField(term177149, term177149.getClass(), "level", 0);
        setIntField(term177149, term177149.getClass(), "gameMode", 0);
        setIntField(term177149, term177149.getClass(), "rivalNum", 0);
        setIntField(term177149, term177149.getClass(), "track", 0);
        setIntField(term177149, term177149.getClass(), "eventId", 0);
        setBooleanField(term177149, term177149.getClass(), "isFreeToPlay", false);
        setIntField(term177149, term177149.getClass(), "playerRating", 0);
        setLongField(term177149, term177149.getClass(), "playedUserId1", 0L);
        setField(term177149, term177149.getClass(), "playedUserName1", null);
        setIntField(term177149, term177149.getClass(), "playedMusicLevel1", 0);
        setLongField(term177149, term177149.getClass(), "playedUserId2", 0L);
        setField(term177149, term177149.getClass(), "playedUserName2", null);
        setIntField(term177149, term177149.getClass(), "playedMusicLevel2", 0);
        setLongField(term177149, term177149.getClass(), "playedUserId3", 0L);
        setField(term177149, term177149.getClass(), "playedUserName3", null);
        setIntField(term177149, term177149.getClass(), "playedMusicLevel3", 0);
        setIntField(term177149, term177149.getClass(), "achievement", 0);
        setIntField(term177149, term177149.getClass(), "score", 0);
        setIntField(term177149, term177149.getClass(), "tapScore", 0);
        setIntField(term177149, term177149.getClass(), "holdScore", 0);
        setIntField(term177149, term177149.getClass(), "slideScore", 0);
        setIntField(term177149, term177149.getClass(), "breakScore", 0);
        setIntField(term177149, term177149.getClass(), "syncRate", 0);
        setIntField(term177149, term177149.getClass(), "vsWin", 0);
        setBooleanField(term177149, term177149.getClass(), "isAllPerfect", false);
        setIntField(term177149, term177149.getClass(), "fullCombo", 0);
        setIntField(term177149, term177149.getClass(), "maxFever", 0);
        setIntField(term177149, term177149.getClass(), "maxCombo", 0);
        setIntField(term177149, term177149.getClass(), "tapPerfect", 0);
        setIntField(term177149, term177149.getClass(), "tapGreat", 0);
        setIntField(term177149, term177149.getClass(), "tapGood", 0);
        setIntField(term177149, term177149.getClass(), "tapBad", 0);
        setIntField(term177149, term177149.getClass(), "holdPerfect", 0);
        setIntField(term177149, term177149.getClass(), "holdGreat", 0);
        setIntField(term177149, term177149.getClass(), "holdGood", 0);
        setIntField(term177149, term177149.getClass(), "holdBad", 0);
        setIntField(term177149, term177149.getClass(), "slidePerfect", 0);
        setIntField(term177149, term177149.getClass(), "slideGreat", 0);
        setIntField(term177149, term177149.getClass(), "slideGood", 0);
        setIntField(term177149, term177149.getClass(), "slideBad", 0);
        setIntField(term177149, term177149.getClass(), "breakPerfect", 0);
        setIntField(term177149, term177149.getClass(), "breakGreat", 0);
        setIntField(term177149, term177149.getClass(), "breakGood", 0);
        setIntField(term177149, term177149.getClass(), "breakBad", 0);
        setBooleanField(term177149, term177149.getClass(), "isTrackSkip", false);
        setBooleanField(term177149, term177149.getClass(), "isHighScore", false);
        setBooleanField(term177149, term177149.getClass(), "isChallengeTrack", false);
        setIntField(term177149, term177149.getClass(), "challengeLife", 0);
        setIntField(term177149, term177149.getClass(), "challengeRemain", 0);
        setIntField(term177149, term177149.getClass(), "isAllPerfectPlus", 0);
        term177203 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177203;
        callMethod(klass, "setPlayerRating", argTypes, term177149, args);
    }

};


