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

public class UserPlaylog_getUserPlayDate_1112517731137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3999765;

    public UserPlaylog_getUserPlayDate_1112517731137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3999765 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term3999765, term3999765.getClass(), "id", 0L);
        setField(term3999765, term3999765.getClass(), "user", null);
        setIntField(term3999765, term3999765.getClass(), "orderId", 0);
        setLongField(term3999765, term3999765.getClass(), "sortNumber", 0L);
        setIntField(term3999765, term3999765.getClass(), "placeId", 0);
        setField(term3999765, term3999765.getClass(), "placeName", null);
        setField(term3999765, term3999765.getClass(), "country", null);
        setIntField(term3999765, term3999765.getClass(), "regionId", 0);
        setField(term3999765, term3999765.getClass(), "playDate", null);
        setField(term3999765, term3999765.getClass(), "userPlayDate", null);
        setIntField(term3999765, term3999765.getClass(), "musicId", 0);
        setIntField(term3999765, term3999765.getClass(), "level", 0);
        setIntField(term3999765, term3999765.getClass(), "gameMode", 0);
        setIntField(term3999765, term3999765.getClass(), "rivalNum", 0);
        setIntField(term3999765, term3999765.getClass(), "track", 0);
        setIntField(term3999765, term3999765.getClass(), "eventId", 0);
        setBooleanField(term3999765, term3999765.getClass(), "isFreeToPlay", false);
        setIntField(term3999765, term3999765.getClass(), "playerRating", 0);
        setLongField(term3999765, term3999765.getClass(), "playedUserId1", 0L);
        setField(term3999765, term3999765.getClass(), "playedUserName1", null);
        setIntField(term3999765, term3999765.getClass(), "playedMusicLevel1", 0);
        setLongField(term3999765, term3999765.getClass(), "playedUserId2", 0L);
        setField(term3999765, term3999765.getClass(), "playedUserName2", null);
        setIntField(term3999765, term3999765.getClass(), "playedMusicLevel2", 0);
        setLongField(term3999765, term3999765.getClass(), "playedUserId3", 0L);
        setField(term3999765, term3999765.getClass(), "playedUserName3", null);
        setIntField(term3999765, term3999765.getClass(), "playedMusicLevel3", 0);
        setIntField(term3999765, term3999765.getClass(), "achievement", 0);
        setIntField(term3999765, term3999765.getClass(), "score", 0);
        setIntField(term3999765, term3999765.getClass(), "tapScore", 0);
        setIntField(term3999765, term3999765.getClass(), "holdScore", 0);
        setIntField(term3999765, term3999765.getClass(), "slideScore", 0);
        setIntField(term3999765, term3999765.getClass(), "breakScore", 0);
        setIntField(term3999765, term3999765.getClass(), "syncRate", 0);
        setIntField(term3999765, term3999765.getClass(), "vsWin", 0);
        setBooleanField(term3999765, term3999765.getClass(), "isAllPerfect", false);
        setIntField(term3999765, term3999765.getClass(), "fullCombo", 0);
        setIntField(term3999765, term3999765.getClass(), "maxFever", 0);
        setIntField(term3999765, term3999765.getClass(), "maxCombo", 0);
        setIntField(term3999765, term3999765.getClass(), "tapPerfect", 0);
        setIntField(term3999765, term3999765.getClass(), "tapGreat", 0);
        setIntField(term3999765, term3999765.getClass(), "tapGood", 0);
        setIntField(term3999765, term3999765.getClass(), "tapBad", 0);
        setIntField(term3999765, term3999765.getClass(), "holdPerfect", 0);
        setIntField(term3999765, term3999765.getClass(), "holdGreat", 0);
        setIntField(term3999765, term3999765.getClass(), "holdGood", 0);
        setIntField(term3999765, term3999765.getClass(), "holdBad", 0);
        setIntField(term3999765, term3999765.getClass(), "slidePerfect", 0);
        setIntField(term3999765, term3999765.getClass(), "slideGreat", 0);
        setIntField(term3999765, term3999765.getClass(), "slideGood", 0);
        setIntField(term3999765, term3999765.getClass(), "slideBad", 0);
        setIntField(term3999765, term3999765.getClass(), "breakPerfect", 0);
        setIntField(term3999765, term3999765.getClass(), "breakGreat", 0);
        setIntField(term3999765, term3999765.getClass(), "breakGood", 0);
        setIntField(term3999765, term3999765.getClass(), "breakBad", 0);
        setBooleanField(term3999765, term3999765.getClass(), "isTrackSkip", false);
        setBooleanField(term3999765, term3999765.getClass(), "isHighScore", false);
        setBooleanField(term3999765, term3999765.getClass(), "isChallengeTrack", false);
        setIntField(term3999765, term3999765.getClass(), "challengeLife", 0);
        setIntField(term3999765, term3999765.getClass(), "challengeRemain", 0);
        setIntField(term3999765, term3999765.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlayDate", argTypes, term3999765, args);
    }

};


