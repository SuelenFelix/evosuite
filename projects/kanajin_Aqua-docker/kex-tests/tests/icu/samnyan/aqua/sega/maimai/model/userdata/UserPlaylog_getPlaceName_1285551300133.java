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

public class UserPlaylog_getPlaceName_1285551300133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173183;

    public UserPlaylog_getPlaceName_1285551300133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173183 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173183, term173183.getClass(), "id", 0L);
        setField(term173183, term173183.getClass(), "user", null);
        setIntField(term173183, term173183.getClass(), "orderId", 0);
        setLongField(term173183, term173183.getClass(), "sortNumber", 0L);
        setIntField(term173183, term173183.getClass(), "placeId", 0);
        setField(term173183, term173183.getClass(), "placeName", null);
        setField(term173183, term173183.getClass(), "country", null);
        setIntField(term173183, term173183.getClass(), "regionId", 0);
        setField(term173183, term173183.getClass(), "playDate", null);
        setField(term173183, term173183.getClass(), "userPlayDate", null);
        setIntField(term173183, term173183.getClass(), "musicId", 0);
        setIntField(term173183, term173183.getClass(), "level", 0);
        setIntField(term173183, term173183.getClass(), "gameMode", 0);
        setIntField(term173183, term173183.getClass(), "rivalNum", 0);
        setIntField(term173183, term173183.getClass(), "track", 0);
        setIntField(term173183, term173183.getClass(), "eventId", 0);
        setBooleanField(term173183, term173183.getClass(), "isFreeToPlay", false);
        setIntField(term173183, term173183.getClass(), "playerRating", 0);
        setLongField(term173183, term173183.getClass(), "playedUserId1", 0L);
        setField(term173183, term173183.getClass(), "playedUserName1", null);
        setIntField(term173183, term173183.getClass(), "playedMusicLevel1", 0);
        setLongField(term173183, term173183.getClass(), "playedUserId2", 0L);
        setField(term173183, term173183.getClass(), "playedUserName2", null);
        setIntField(term173183, term173183.getClass(), "playedMusicLevel2", 0);
        setLongField(term173183, term173183.getClass(), "playedUserId3", 0L);
        setField(term173183, term173183.getClass(), "playedUserName3", null);
        setIntField(term173183, term173183.getClass(), "playedMusicLevel3", 0);
        setIntField(term173183, term173183.getClass(), "achievement", 0);
        setIntField(term173183, term173183.getClass(), "score", 0);
        setIntField(term173183, term173183.getClass(), "tapScore", 0);
        setIntField(term173183, term173183.getClass(), "holdScore", 0);
        setIntField(term173183, term173183.getClass(), "slideScore", 0);
        setIntField(term173183, term173183.getClass(), "breakScore", 0);
        setIntField(term173183, term173183.getClass(), "syncRate", 0);
        setIntField(term173183, term173183.getClass(), "vsWin", 0);
        setBooleanField(term173183, term173183.getClass(), "isAllPerfect", false);
        setIntField(term173183, term173183.getClass(), "fullCombo", 0);
        setIntField(term173183, term173183.getClass(), "maxFever", 0);
        setIntField(term173183, term173183.getClass(), "maxCombo", 0);
        setIntField(term173183, term173183.getClass(), "tapPerfect", 0);
        setIntField(term173183, term173183.getClass(), "tapGreat", 0);
        setIntField(term173183, term173183.getClass(), "tapGood", 0);
        setIntField(term173183, term173183.getClass(), "tapBad", 0);
        setIntField(term173183, term173183.getClass(), "holdPerfect", 0);
        setIntField(term173183, term173183.getClass(), "holdGreat", 0);
        setIntField(term173183, term173183.getClass(), "holdGood", 0);
        setIntField(term173183, term173183.getClass(), "holdBad", 0);
        setIntField(term173183, term173183.getClass(), "slidePerfect", 0);
        setIntField(term173183, term173183.getClass(), "slideGreat", 0);
        setIntField(term173183, term173183.getClass(), "slideGood", 0);
        setIntField(term173183, term173183.getClass(), "slideBad", 0);
        setIntField(term173183, term173183.getClass(), "breakPerfect", 0);
        setIntField(term173183, term173183.getClass(), "breakGreat", 0);
        setIntField(term173183, term173183.getClass(), "breakGood", 0);
        setIntField(term173183, term173183.getClass(), "breakBad", 0);
        setBooleanField(term173183, term173183.getClass(), "isTrackSkip", false);
        setBooleanField(term173183, term173183.getClass(), "isHighScore", false);
        setBooleanField(term173183, term173183.getClass(), "isChallengeTrack", false);
        setIntField(term173183, term173183.getClass(), "challengeLife", 0);
        setIntField(term173183, term173183.getClass(), "challengeRemain", 0);
        setIntField(term173183, term173183.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceName", argTypes, term173183, args);
    }

};


