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

public class UserPlaylog_setPlaceName_1122793860195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176541;

    public UserPlaylog_setPlaceName_1122793860195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176541 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176541, term176541.getClass(), "id", 0L);
        setField(term176541, term176541.getClass(), "user", null);
        setIntField(term176541, term176541.getClass(), "orderId", 0);
        setLongField(term176541, term176541.getClass(), "sortNumber", 0L);
        setIntField(term176541, term176541.getClass(), "placeId", 0);
        setField(term176541, term176541.getClass(), "placeName", null);
        setField(term176541, term176541.getClass(), "country", null);
        setIntField(term176541, term176541.getClass(), "regionId", 0);
        setField(term176541, term176541.getClass(), "playDate", null);
        setField(term176541, term176541.getClass(), "userPlayDate", null);
        setIntField(term176541, term176541.getClass(), "musicId", 0);
        setIntField(term176541, term176541.getClass(), "level", 0);
        setIntField(term176541, term176541.getClass(), "gameMode", 0);
        setIntField(term176541, term176541.getClass(), "rivalNum", 0);
        setIntField(term176541, term176541.getClass(), "track", 0);
        setIntField(term176541, term176541.getClass(), "eventId", 0);
        setBooleanField(term176541, term176541.getClass(), "isFreeToPlay", false);
        setIntField(term176541, term176541.getClass(), "playerRating", 0);
        setLongField(term176541, term176541.getClass(), "playedUserId1", 0L);
        setField(term176541, term176541.getClass(), "playedUserName1", null);
        setIntField(term176541, term176541.getClass(), "playedMusicLevel1", 0);
        setLongField(term176541, term176541.getClass(), "playedUserId2", 0L);
        setField(term176541, term176541.getClass(), "playedUserName2", null);
        setIntField(term176541, term176541.getClass(), "playedMusicLevel2", 0);
        setLongField(term176541, term176541.getClass(), "playedUserId3", 0L);
        setField(term176541, term176541.getClass(), "playedUserName3", null);
        setIntField(term176541, term176541.getClass(), "playedMusicLevel3", 0);
        setIntField(term176541, term176541.getClass(), "achievement", 0);
        setIntField(term176541, term176541.getClass(), "score", 0);
        setIntField(term176541, term176541.getClass(), "tapScore", 0);
        setIntField(term176541, term176541.getClass(), "holdScore", 0);
        setIntField(term176541, term176541.getClass(), "slideScore", 0);
        setIntField(term176541, term176541.getClass(), "breakScore", 0);
        setIntField(term176541, term176541.getClass(), "syncRate", 0);
        setIntField(term176541, term176541.getClass(), "vsWin", 0);
        setBooleanField(term176541, term176541.getClass(), "isAllPerfect", false);
        setIntField(term176541, term176541.getClass(), "fullCombo", 0);
        setIntField(term176541, term176541.getClass(), "maxFever", 0);
        setIntField(term176541, term176541.getClass(), "maxCombo", 0);
        setIntField(term176541, term176541.getClass(), "tapPerfect", 0);
        setIntField(term176541, term176541.getClass(), "tapGreat", 0);
        setIntField(term176541, term176541.getClass(), "tapGood", 0);
        setIntField(term176541, term176541.getClass(), "tapBad", 0);
        setIntField(term176541, term176541.getClass(), "holdPerfect", 0);
        setIntField(term176541, term176541.getClass(), "holdGreat", 0);
        setIntField(term176541, term176541.getClass(), "holdGood", 0);
        setIntField(term176541, term176541.getClass(), "holdBad", 0);
        setIntField(term176541, term176541.getClass(), "slidePerfect", 0);
        setIntField(term176541, term176541.getClass(), "slideGreat", 0);
        setIntField(term176541, term176541.getClass(), "slideGood", 0);
        setIntField(term176541, term176541.getClass(), "slideBad", 0);
        setIntField(term176541, term176541.getClass(), "breakPerfect", 0);
        setIntField(term176541, term176541.getClass(), "breakGreat", 0);
        setIntField(term176541, term176541.getClass(), "breakGood", 0);
        setIntField(term176541, term176541.getClass(), "breakBad", 0);
        setBooleanField(term176541, term176541.getClass(), "isTrackSkip", false);
        setBooleanField(term176541, term176541.getClass(), "isHighScore", false);
        setBooleanField(term176541, term176541.getClass(), "isChallengeTrack", false);
        setIntField(term176541, term176541.getClass(), "challengeLife", 0);
        setIntField(term176541, term176541.getClass(), "challengeRemain", 0);
        setIntField(term176541, term176541.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlaceName", argTypes, term176541, args);
    }

};


