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

public class UserPlaylog_equals_2046852727250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179607;

    public UserPlaylog_equals_2046852727250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179607 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term179607, term179607.getClass(), "id", 0L);
        setField(term179607, term179607.getClass(), "user", null);
        setIntField(term179607, term179607.getClass(), "orderId", 0);
        setLongField(term179607, term179607.getClass(), "sortNumber", 0L);
        setIntField(term179607, term179607.getClass(), "placeId", 0);
        setField(term179607, term179607.getClass(), "placeName", null);
        setField(term179607, term179607.getClass(), "country", null);
        setIntField(term179607, term179607.getClass(), "regionId", 0);
        setField(term179607, term179607.getClass(), "playDate", null);
        setField(term179607, term179607.getClass(), "userPlayDate", null);
        setIntField(term179607, term179607.getClass(), "musicId", 0);
        setIntField(term179607, term179607.getClass(), "level", 0);
        setIntField(term179607, term179607.getClass(), "gameMode", 0);
        setIntField(term179607, term179607.getClass(), "rivalNum", 0);
        setIntField(term179607, term179607.getClass(), "track", 0);
        setIntField(term179607, term179607.getClass(), "eventId", 0);
        setBooleanField(term179607, term179607.getClass(), "isFreeToPlay", false);
        setIntField(term179607, term179607.getClass(), "playerRating", 0);
        setLongField(term179607, term179607.getClass(), "playedUserId1", 0L);
        setField(term179607, term179607.getClass(), "playedUserName1", null);
        setIntField(term179607, term179607.getClass(), "playedMusicLevel1", 0);
        setLongField(term179607, term179607.getClass(), "playedUserId2", 0L);
        setField(term179607, term179607.getClass(), "playedUserName2", null);
        setIntField(term179607, term179607.getClass(), "playedMusicLevel2", 0);
        setLongField(term179607, term179607.getClass(), "playedUserId3", 0L);
        setField(term179607, term179607.getClass(), "playedUserName3", null);
        setIntField(term179607, term179607.getClass(), "playedMusicLevel3", 0);
        setIntField(term179607, term179607.getClass(), "achievement", 0);
        setIntField(term179607, term179607.getClass(), "score", 0);
        setIntField(term179607, term179607.getClass(), "tapScore", 0);
        setIntField(term179607, term179607.getClass(), "holdScore", 0);
        setIntField(term179607, term179607.getClass(), "slideScore", 0);
        setIntField(term179607, term179607.getClass(), "breakScore", 0);
        setIntField(term179607, term179607.getClass(), "syncRate", 0);
        setIntField(term179607, term179607.getClass(), "vsWin", 0);
        setBooleanField(term179607, term179607.getClass(), "isAllPerfect", false);
        setIntField(term179607, term179607.getClass(), "fullCombo", 0);
        setIntField(term179607, term179607.getClass(), "maxFever", 0);
        setIntField(term179607, term179607.getClass(), "maxCombo", 0);
        setIntField(term179607, term179607.getClass(), "tapPerfect", 0);
        setIntField(term179607, term179607.getClass(), "tapGreat", 0);
        setIntField(term179607, term179607.getClass(), "tapGood", 0);
        setIntField(term179607, term179607.getClass(), "tapBad", 0);
        setIntField(term179607, term179607.getClass(), "holdPerfect", 0);
        setIntField(term179607, term179607.getClass(), "holdGreat", 0);
        setIntField(term179607, term179607.getClass(), "holdGood", 0);
        setIntField(term179607, term179607.getClass(), "holdBad", 0);
        setIntField(term179607, term179607.getClass(), "slidePerfect", 0);
        setIntField(term179607, term179607.getClass(), "slideGreat", 0);
        setIntField(term179607, term179607.getClass(), "slideGood", 0);
        setIntField(term179607, term179607.getClass(), "slideBad", 0);
        setIntField(term179607, term179607.getClass(), "breakPerfect", 0);
        setIntField(term179607, term179607.getClass(), "breakGreat", 0);
        setIntField(term179607, term179607.getClass(), "breakGood", 0);
        setIntField(term179607, term179607.getClass(), "breakBad", 0);
        setBooleanField(term179607, term179607.getClass(), "isTrackSkip", false);
        setBooleanField(term179607, term179607.getClass(), "isHighScore", false);
        setBooleanField(term179607, term179607.getClass(), "isChallengeTrack", false);
        setIntField(term179607, term179607.getClass(), "challengeLife", 0);
        setIntField(term179607, term179607.getClass(), "challengeRemain", 0);
        setIntField(term179607, term179607.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term179607, args);
    }

};


