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

public class UserPlaylog_getLevel_1591473111139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173507;

    public UserPlaylog_getLevel_1591473111139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173507 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term173507, term173507.getClass(), "id", 0L);
        setField(term173507, term173507.getClass(), "user", null);
        setIntField(term173507, term173507.getClass(), "orderId", 0);
        setLongField(term173507, term173507.getClass(), "sortNumber", 0L);
        setIntField(term173507, term173507.getClass(), "placeId", 0);
        setField(term173507, term173507.getClass(), "placeName", null);
        setField(term173507, term173507.getClass(), "country", null);
        setIntField(term173507, term173507.getClass(), "regionId", 0);
        setField(term173507, term173507.getClass(), "playDate", null);
        setField(term173507, term173507.getClass(), "userPlayDate", null);
        setIntField(term173507, term173507.getClass(), "musicId", 0);
        setIntField(term173507, term173507.getClass(), "level", 0);
        setIntField(term173507, term173507.getClass(), "gameMode", 0);
        setIntField(term173507, term173507.getClass(), "rivalNum", 0);
        setIntField(term173507, term173507.getClass(), "track", 0);
        setIntField(term173507, term173507.getClass(), "eventId", 0);
        setBooleanField(term173507, term173507.getClass(), "isFreeToPlay", false);
        setIntField(term173507, term173507.getClass(), "playerRating", 0);
        setLongField(term173507, term173507.getClass(), "playedUserId1", 0L);
        setField(term173507, term173507.getClass(), "playedUserName1", null);
        setIntField(term173507, term173507.getClass(), "playedMusicLevel1", 0);
        setLongField(term173507, term173507.getClass(), "playedUserId2", 0L);
        setField(term173507, term173507.getClass(), "playedUserName2", null);
        setIntField(term173507, term173507.getClass(), "playedMusicLevel2", 0);
        setLongField(term173507, term173507.getClass(), "playedUserId3", 0L);
        setField(term173507, term173507.getClass(), "playedUserName3", null);
        setIntField(term173507, term173507.getClass(), "playedMusicLevel3", 0);
        setIntField(term173507, term173507.getClass(), "achievement", 0);
        setIntField(term173507, term173507.getClass(), "score", 0);
        setIntField(term173507, term173507.getClass(), "tapScore", 0);
        setIntField(term173507, term173507.getClass(), "holdScore", 0);
        setIntField(term173507, term173507.getClass(), "slideScore", 0);
        setIntField(term173507, term173507.getClass(), "breakScore", 0);
        setIntField(term173507, term173507.getClass(), "syncRate", 0);
        setIntField(term173507, term173507.getClass(), "vsWin", 0);
        setBooleanField(term173507, term173507.getClass(), "isAllPerfect", false);
        setIntField(term173507, term173507.getClass(), "fullCombo", 0);
        setIntField(term173507, term173507.getClass(), "maxFever", 0);
        setIntField(term173507, term173507.getClass(), "maxCombo", 0);
        setIntField(term173507, term173507.getClass(), "tapPerfect", 0);
        setIntField(term173507, term173507.getClass(), "tapGreat", 0);
        setIntField(term173507, term173507.getClass(), "tapGood", 0);
        setIntField(term173507, term173507.getClass(), "tapBad", 0);
        setIntField(term173507, term173507.getClass(), "holdPerfect", 0);
        setIntField(term173507, term173507.getClass(), "holdGreat", 0);
        setIntField(term173507, term173507.getClass(), "holdGood", 0);
        setIntField(term173507, term173507.getClass(), "holdBad", 0);
        setIntField(term173507, term173507.getClass(), "slidePerfect", 0);
        setIntField(term173507, term173507.getClass(), "slideGreat", 0);
        setIntField(term173507, term173507.getClass(), "slideGood", 0);
        setIntField(term173507, term173507.getClass(), "slideBad", 0);
        setIntField(term173507, term173507.getClass(), "breakPerfect", 0);
        setIntField(term173507, term173507.getClass(), "breakGreat", 0);
        setIntField(term173507, term173507.getClass(), "breakGood", 0);
        setIntField(term173507, term173507.getClass(), "breakBad", 0);
        setBooleanField(term173507, term173507.getClass(), "isTrackSkip", false);
        setBooleanField(term173507, term173507.getClass(), "isHighScore", false);
        setBooleanField(term173507, term173507.getClass(), "isChallengeTrack", false);
        setIntField(term173507, term173507.getClass(), "challengeLife", 0);
        setIntField(term173507, term173507.getClass(), "challengeRemain", 0);
        setIntField(term173507, term173507.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term173507, args);
    }

};


