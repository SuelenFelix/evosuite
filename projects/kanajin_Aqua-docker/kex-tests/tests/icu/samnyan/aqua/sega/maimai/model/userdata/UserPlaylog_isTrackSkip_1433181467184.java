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

public class UserPlaylog_isTrackSkip_1433181467184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175939;

    public UserPlaylog_isTrackSkip_1433181467184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175939 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term175939, term175939.getClass(), "id", 0L);
        setField(term175939, term175939.getClass(), "user", null);
        setIntField(term175939, term175939.getClass(), "orderId", 0);
        setLongField(term175939, term175939.getClass(), "sortNumber", 0L);
        setIntField(term175939, term175939.getClass(), "placeId", 0);
        setField(term175939, term175939.getClass(), "placeName", null);
        setField(term175939, term175939.getClass(), "country", null);
        setIntField(term175939, term175939.getClass(), "regionId", 0);
        setField(term175939, term175939.getClass(), "playDate", null);
        setField(term175939, term175939.getClass(), "userPlayDate", null);
        setIntField(term175939, term175939.getClass(), "musicId", 0);
        setIntField(term175939, term175939.getClass(), "level", 0);
        setIntField(term175939, term175939.getClass(), "gameMode", 0);
        setIntField(term175939, term175939.getClass(), "rivalNum", 0);
        setIntField(term175939, term175939.getClass(), "track", 0);
        setIntField(term175939, term175939.getClass(), "eventId", 0);
        setBooleanField(term175939, term175939.getClass(), "isFreeToPlay", false);
        setIntField(term175939, term175939.getClass(), "playerRating", 0);
        setLongField(term175939, term175939.getClass(), "playedUserId1", 0L);
        setField(term175939, term175939.getClass(), "playedUserName1", null);
        setIntField(term175939, term175939.getClass(), "playedMusicLevel1", 0);
        setLongField(term175939, term175939.getClass(), "playedUserId2", 0L);
        setField(term175939, term175939.getClass(), "playedUserName2", null);
        setIntField(term175939, term175939.getClass(), "playedMusicLevel2", 0);
        setLongField(term175939, term175939.getClass(), "playedUserId3", 0L);
        setField(term175939, term175939.getClass(), "playedUserName3", null);
        setIntField(term175939, term175939.getClass(), "playedMusicLevel3", 0);
        setIntField(term175939, term175939.getClass(), "achievement", 0);
        setIntField(term175939, term175939.getClass(), "score", 0);
        setIntField(term175939, term175939.getClass(), "tapScore", 0);
        setIntField(term175939, term175939.getClass(), "holdScore", 0);
        setIntField(term175939, term175939.getClass(), "slideScore", 0);
        setIntField(term175939, term175939.getClass(), "breakScore", 0);
        setIntField(term175939, term175939.getClass(), "syncRate", 0);
        setIntField(term175939, term175939.getClass(), "vsWin", 0);
        setBooleanField(term175939, term175939.getClass(), "isAllPerfect", false);
        setIntField(term175939, term175939.getClass(), "fullCombo", 0);
        setIntField(term175939, term175939.getClass(), "maxFever", 0);
        setIntField(term175939, term175939.getClass(), "maxCombo", 0);
        setIntField(term175939, term175939.getClass(), "tapPerfect", 0);
        setIntField(term175939, term175939.getClass(), "tapGreat", 0);
        setIntField(term175939, term175939.getClass(), "tapGood", 0);
        setIntField(term175939, term175939.getClass(), "tapBad", 0);
        setIntField(term175939, term175939.getClass(), "holdPerfect", 0);
        setIntField(term175939, term175939.getClass(), "holdGreat", 0);
        setIntField(term175939, term175939.getClass(), "holdGood", 0);
        setIntField(term175939, term175939.getClass(), "holdBad", 0);
        setIntField(term175939, term175939.getClass(), "slidePerfect", 0);
        setIntField(term175939, term175939.getClass(), "slideGreat", 0);
        setIntField(term175939, term175939.getClass(), "slideGood", 0);
        setIntField(term175939, term175939.getClass(), "slideBad", 0);
        setIntField(term175939, term175939.getClass(), "breakPerfect", 0);
        setIntField(term175939, term175939.getClass(), "breakGreat", 0);
        setIntField(term175939, term175939.getClass(), "breakGood", 0);
        setIntField(term175939, term175939.getClass(), "breakBad", 0);
        setBooleanField(term175939, term175939.getClass(), "isTrackSkip", false);
        setBooleanField(term175939, term175939.getClass(), "isHighScore", false);
        setBooleanField(term175939, term175939.getClass(), "isChallengeTrack", false);
        setIntField(term175939, term175939.getClass(), "challengeLife", 0);
        setIntField(term175939, term175939.getClass(), "challengeRemain", 0);
        setIntField(term175939, term175939.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTrackSkip", argTypes, term175939, args);
    }

};


