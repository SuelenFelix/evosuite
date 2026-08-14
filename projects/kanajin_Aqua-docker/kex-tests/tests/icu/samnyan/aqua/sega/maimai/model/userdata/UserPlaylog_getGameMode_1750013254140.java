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

public class UserPlaylog_getGameMode_1750013254140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3999927;

    public UserPlaylog_getGameMode_1750013254140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3999927 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term3999927, term3999927.getClass(), "id", 0L);
        setField(term3999927, term3999927.getClass(), "user", null);
        setIntField(term3999927, term3999927.getClass(), "orderId", 0);
        setLongField(term3999927, term3999927.getClass(), "sortNumber", 0L);
        setIntField(term3999927, term3999927.getClass(), "placeId", 0);
        setField(term3999927, term3999927.getClass(), "placeName", null);
        setField(term3999927, term3999927.getClass(), "country", null);
        setIntField(term3999927, term3999927.getClass(), "regionId", 0);
        setField(term3999927, term3999927.getClass(), "playDate", null);
        setField(term3999927, term3999927.getClass(), "userPlayDate", null);
        setIntField(term3999927, term3999927.getClass(), "musicId", 0);
        setIntField(term3999927, term3999927.getClass(), "level", 0);
        setIntField(term3999927, term3999927.getClass(), "gameMode", 0);
        setIntField(term3999927, term3999927.getClass(), "rivalNum", 0);
        setIntField(term3999927, term3999927.getClass(), "track", 0);
        setIntField(term3999927, term3999927.getClass(), "eventId", 0);
        setBooleanField(term3999927, term3999927.getClass(), "isFreeToPlay", false);
        setIntField(term3999927, term3999927.getClass(), "playerRating", 0);
        setLongField(term3999927, term3999927.getClass(), "playedUserId1", 0L);
        setField(term3999927, term3999927.getClass(), "playedUserName1", null);
        setIntField(term3999927, term3999927.getClass(), "playedMusicLevel1", 0);
        setLongField(term3999927, term3999927.getClass(), "playedUserId2", 0L);
        setField(term3999927, term3999927.getClass(), "playedUserName2", null);
        setIntField(term3999927, term3999927.getClass(), "playedMusicLevel2", 0);
        setLongField(term3999927, term3999927.getClass(), "playedUserId3", 0L);
        setField(term3999927, term3999927.getClass(), "playedUserName3", null);
        setIntField(term3999927, term3999927.getClass(), "playedMusicLevel3", 0);
        setIntField(term3999927, term3999927.getClass(), "achievement", 0);
        setIntField(term3999927, term3999927.getClass(), "score", 0);
        setIntField(term3999927, term3999927.getClass(), "tapScore", 0);
        setIntField(term3999927, term3999927.getClass(), "holdScore", 0);
        setIntField(term3999927, term3999927.getClass(), "slideScore", 0);
        setIntField(term3999927, term3999927.getClass(), "breakScore", 0);
        setIntField(term3999927, term3999927.getClass(), "syncRate", 0);
        setIntField(term3999927, term3999927.getClass(), "vsWin", 0);
        setBooleanField(term3999927, term3999927.getClass(), "isAllPerfect", false);
        setIntField(term3999927, term3999927.getClass(), "fullCombo", 0);
        setIntField(term3999927, term3999927.getClass(), "maxFever", 0);
        setIntField(term3999927, term3999927.getClass(), "maxCombo", 0);
        setIntField(term3999927, term3999927.getClass(), "tapPerfect", 0);
        setIntField(term3999927, term3999927.getClass(), "tapGreat", 0);
        setIntField(term3999927, term3999927.getClass(), "tapGood", 0);
        setIntField(term3999927, term3999927.getClass(), "tapBad", 0);
        setIntField(term3999927, term3999927.getClass(), "holdPerfect", 0);
        setIntField(term3999927, term3999927.getClass(), "holdGreat", 0);
        setIntField(term3999927, term3999927.getClass(), "holdGood", 0);
        setIntField(term3999927, term3999927.getClass(), "holdBad", 0);
        setIntField(term3999927, term3999927.getClass(), "slidePerfect", 0);
        setIntField(term3999927, term3999927.getClass(), "slideGreat", 0);
        setIntField(term3999927, term3999927.getClass(), "slideGood", 0);
        setIntField(term3999927, term3999927.getClass(), "slideBad", 0);
        setIntField(term3999927, term3999927.getClass(), "breakPerfect", 0);
        setIntField(term3999927, term3999927.getClass(), "breakGreat", 0);
        setIntField(term3999927, term3999927.getClass(), "breakGood", 0);
        setIntField(term3999927, term3999927.getClass(), "breakBad", 0);
        setBooleanField(term3999927, term3999927.getClass(), "isTrackSkip", false);
        setBooleanField(term3999927, term3999927.getClass(), "isHighScore", false);
        setBooleanField(term3999927, term3999927.getClass(), "isChallengeTrack", false);
        setIntField(term3999927, term3999927.getClass(), "challengeLife", 0);
        setIntField(term3999927, term3999927.getClass(), "challengeRemain", 0);
        setIntField(term3999927, term3999927.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameMode", argTypes, term3999927, args);
    }

};


