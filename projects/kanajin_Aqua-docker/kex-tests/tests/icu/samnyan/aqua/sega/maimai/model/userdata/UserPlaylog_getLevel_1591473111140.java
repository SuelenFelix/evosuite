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

public class UserPlaylog_getLevel_1591473111140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173563;

    public UserPlaylog_getLevel_1591473111140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173563 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173563, term173563.getClass(), "id", 0L);
        setField(term173563, term173563.getClass(), "user", null);
        setIntField(term173563, term173563.getClass(), "orderId", 0);
        setLongField(term173563, term173563.getClass(), "sortNumber", 0L);
        setIntField(term173563, term173563.getClass(), "placeId", 0);
        setField(term173563, term173563.getClass(), "placeName", null);
        setField(term173563, term173563.getClass(), "country", null);
        setIntField(term173563, term173563.getClass(), "regionId", 0);
        setField(term173563, term173563.getClass(), "playDate", null);
        setField(term173563, term173563.getClass(), "userPlayDate", null);
        setIntField(term173563, term173563.getClass(), "musicId", 0);
        setIntField(term173563, term173563.getClass(), "level", 0);
        setIntField(term173563, term173563.getClass(), "gameMode", 0);
        setIntField(term173563, term173563.getClass(), "rivalNum", 0);
        setIntField(term173563, term173563.getClass(), "track", 0);
        setIntField(term173563, term173563.getClass(), "eventId", 0);
        setBooleanField(term173563, term173563.getClass(), "isFreeToPlay", false);
        setIntField(term173563, term173563.getClass(), "playerRating", 0);
        setLongField(term173563, term173563.getClass(), "playedUserId1", 0L);
        setField(term173563, term173563.getClass(), "playedUserName1", null);
        setIntField(term173563, term173563.getClass(), "playedMusicLevel1", 0);
        setLongField(term173563, term173563.getClass(), "playedUserId2", 0L);
        setField(term173563, term173563.getClass(), "playedUserName2", null);
        setIntField(term173563, term173563.getClass(), "playedMusicLevel2", 0);
        setLongField(term173563, term173563.getClass(), "playedUserId3", 0L);
        setField(term173563, term173563.getClass(), "playedUserName3", null);
        setIntField(term173563, term173563.getClass(), "playedMusicLevel3", 0);
        setIntField(term173563, term173563.getClass(), "achievement", 0);
        setIntField(term173563, term173563.getClass(), "score", 0);
        setIntField(term173563, term173563.getClass(), "tapScore", 0);
        setIntField(term173563, term173563.getClass(), "holdScore", 0);
        setIntField(term173563, term173563.getClass(), "slideScore", 0);
        setIntField(term173563, term173563.getClass(), "breakScore", 0);
        setIntField(term173563, term173563.getClass(), "syncRate", 0);
        setIntField(term173563, term173563.getClass(), "vsWin", 0);
        setBooleanField(term173563, term173563.getClass(), "isAllPerfect", false);
        setIntField(term173563, term173563.getClass(), "fullCombo", 0);
        setIntField(term173563, term173563.getClass(), "maxFever", 0);
        setIntField(term173563, term173563.getClass(), "maxCombo", 0);
        setIntField(term173563, term173563.getClass(), "tapPerfect", 0);
        setIntField(term173563, term173563.getClass(), "tapGreat", 0);
        setIntField(term173563, term173563.getClass(), "tapGood", 0);
        setIntField(term173563, term173563.getClass(), "tapBad", 0);
        setIntField(term173563, term173563.getClass(), "holdPerfect", 0);
        setIntField(term173563, term173563.getClass(), "holdGreat", 0);
        setIntField(term173563, term173563.getClass(), "holdGood", 0);
        setIntField(term173563, term173563.getClass(), "holdBad", 0);
        setIntField(term173563, term173563.getClass(), "slidePerfect", 0);
        setIntField(term173563, term173563.getClass(), "slideGreat", 0);
        setIntField(term173563, term173563.getClass(), "slideGood", 0);
        setIntField(term173563, term173563.getClass(), "slideBad", 0);
        setIntField(term173563, term173563.getClass(), "breakPerfect", 0);
        setIntField(term173563, term173563.getClass(), "breakGreat", 0);
        setIntField(term173563, term173563.getClass(), "breakGood", 0);
        setIntField(term173563, term173563.getClass(), "breakBad", 0);
        setBooleanField(term173563, term173563.getClass(), "isTrackSkip", false);
        setBooleanField(term173563, term173563.getClass(), "isHighScore", false);
        setBooleanField(term173563, term173563.getClass(), "isChallengeTrack", false);
        setIntField(term173563, term173563.getClass(), "challengeLife", 0);
        setIntField(term173563, term173563.getClass(), "challengeRemain", 0);
        setIntField(term173563, term173563.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term173563, args);
    }

};


