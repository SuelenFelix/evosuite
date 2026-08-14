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

public class UserPlaylog_setEventId_1124021084205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177093;
     Object term177147;

    public UserPlaylog_setEventId_1124021084205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177093 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177093, term177093.getClass(), "id", 0L);
        setField(term177093, term177093.getClass(), "user", null);
        setIntField(term177093, term177093.getClass(), "orderId", 0);
        setLongField(term177093, term177093.getClass(), "sortNumber", 0L);
        setIntField(term177093, term177093.getClass(), "placeId", 0);
        setField(term177093, term177093.getClass(), "placeName", null);
        setField(term177093, term177093.getClass(), "country", null);
        setIntField(term177093, term177093.getClass(), "regionId", 0);
        setField(term177093, term177093.getClass(), "playDate", null);
        setField(term177093, term177093.getClass(), "userPlayDate", null);
        setIntField(term177093, term177093.getClass(), "musicId", 0);
        setIntField(term177093, term177093.getClass(), "level", 0);
        setIntField(term177093, term177093.getClass(), "gameMode", 0);
        setIntField(term177093, term177093.getClass(), "rivalNum", 0);
        setIntField(term177093, term177093.getClass(), "track", 0);
        setIntField(term177093, term177093.getClass(), "eventId", 0);
        setBooleanField(term177093, term177093.getClass(), "isFreeToPlay", false);
        setIntField(term177093, term177093.getClass(), "playerRating", 0);
        setLongField(term177093, term177093.getClass(), "playedUserId1", 0L);
        setField(term177093, term177093.getClass(), "playedUserName1", null);
        setIntField(term177093, term177093.getClass(), "playedMusicLevel1", 0);
        setLongField(term177093, term177093.getClass(), "playedUserId2", 0L);
        setField(term177093, term177093.getClass(), "playedUserName2", null);
        setIntField(term177093, term177093.getClass(), "playedMusicLevel2", 0);
        setLongField(term177093, term177093.getClass(), "playedUserId3", 0L);
        setField(term177093, term177093.getClass(), "playedUserName3", null);
        setIntField(term177093, term177093.getClass(), "playedMusicLevel3", 0);
        setIntField(term177093, term177093.getClass(), "achievement", 0);
        setIntField(term177093, term177093.getClass(), "score", 0);
        setIntField(term177093, term177093.getClass(), "tapScore", 0);
        setIntField(term177093, term177093.getClass(), "holdScore", 0);
        setIntField(term177093, term177093.getClass(), "slideScore", 0);
        setIntField(term177093, term177093.getClass(), "breakScore", 0);
        setIntField(term177093, term177093.getClass(), "syncRate", 0);
        setIntField(term177093, term177093.getClass(), "vsWin", 0);
        setBooleanField(term177093, term177093.getClass(), "isAllPerfect", false);
        setIntField(term177093, term177093.getClass(), "fullCombo", 0);
        setIntField(term177093, term177093.getClass(), "maxFever", 0);
        setIntField(term177093, term177093.getClass(), "maxCombo", 0);
        setIntField(term177093, term177093.getClass(), "tapPerfect", 0);
        setIntField(term177093, term177093.getClass(), "tapGreat", 0);
        setIntField(term177093, term177093.getClass(), "tapGood", 0);
        setIntField(term177093, term177093.getClass(), "tapBad", 0);
        setIntField(term177093, term177093.getClass(), "holdPerfect", 0);
        setIntField(term177093, term177093.getClass(), "holdGreat", 0);
        setIntField(term177093, term177093.getClass(), "holdGood", 0);
        setIntField(term177093, term177093.getClass(), "holdBad", 0);
        setIntField(term177093, term177093.getClass(), "slidePerfect", 0);
        setIntField(term177093, term177093.getClass(), "slideGreat", 0);
        setIntField(term177093, term177093.getClass(), "slideGood", 0);
        setIntField(term177093, term177093.getClass(), "slideBad", 0);
        setIntField(term177093, term177093.getClass(), "breakPerfect", 0);
        setIntField(term177093, term177093.getClass(), "breakGreat", 0);
        setIntField(term177093, term177093.getClass(), "breakGood", 0);
        setIntField(term177093, term177093.getClass(), "breakBad", 0);
        setBooleanField(term177093, term177093.getClass(), "isTrackSkip", false);
        setBooleanField(term177093, term177093.getClass(), "isHighScore", false);
        setBooleanField(term177093, term177093.getClass(), "isChallengeTrack", false);
        setIntField(term177093, term177093.getClass(), "challengeLife", 0);
        setIntField(term177093, term177093.getClass(), "challengeRemain", 0);
        setIntField(term177093, term177093.getClass(), "isAllPerfectPlus", 0);
        term177147 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177147;
        callMethod(klass, "setEventId", argTypes, term177093, args);
    }

};


