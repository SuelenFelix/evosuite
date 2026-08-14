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

public class UserPlaylog_setSyncRate_161128402222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4004405;
     Object term4004459;

    public UserPlaylog_setSyncRate_161128402222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4004405 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4004405, term4004405.getClass(), "id", 0L);
        setField(term4004405, term4004405.getClass(), "user", null);
        setIntField(term4004405, term4004405.getClass(), "orderId", 0);
        setLongField(term4004405, term4004405.getClass(), "sortNumber", 0L);
        setIntField(term4004405, term4004405.getClass(), "placeId", 0);
        setField(term4004405, term4004405.getClass(), "placeName", null);
        setField(term4004405, term4004405.getClass(), "country", null);
        setIntField(term4004405, term4004405.getClass(), "regionId", 0);
        setField(term4004405, term4004405.getClass(), "playDate", null);
        setField(term4004405, term4004405.getClass(), "userPlayDate", null);
        setIntField(term4004405, term4004405.getClass(), "musicId", 0);
        setIntField(term4004405, term4004405.getClass(), "level", 0);
        setIntField(term4004405, term4004405.getClass(), "gameMode", 0);
        setIntField(term4004405, term4004405.getClass(), "rivalNum", 0);
        setIntField(term4004405, term4004405.getClass(), "track", 0);
        setIntField(term4004405, term4004405.getClass(), "eventId", 0);
        setBooleanField(term4004405, term4004405.getClass(), "isFreeToPlay", false);
        setIntField(term4004405, term4004405.getClass(), "playerRating", 0);
        setLongField(term4004405, term4004405.getClass(), "playedUserId1", 0L);
        setField(term4004405, term4004405.getClass(), "playedUserName1", null);
        setIntField(term4004405, term4004405.getClass(), "playedMusicLevel1", 0);
        setLongField(term4004405, term4004405.getClass(), "playedUserId2", 0L);
        setField(term4004405, term4004405.getClass(), "playedUserName2", null);
        setIntField(term4004405, term4004405.getClass(), "playedMusicLevel2", 0);
        setLongField(term4004405, term4004405.getClass(), "playedUserId3", 0L);
        setField(term4004405, term4004405.getClass(), "playedUserName3", null);
        setIntField(term4004405, term4004405.getClass(), "playedMusicLevel3", 0);
        setIntField(term4004405, term4004405.getClass(), "achievement", 0);
        setIntField(term4004405, term4004405.getClass(), "score", 0);
        setIntField(term4004405, term4004405.getClass(), "tapScore", 0);
        setIntField(term4004405, term4004405.getClass(), "holdScore", 0);
        setIntField(term4004405, term4004405.getClass(), "slideScore", 0);
        setIntField(term4004405, term4004405.getClass(), "breakScore", 0);
        setIntField(term4004405, term4004405.getClass(), "syncRate", 0);
        setIntField(term4004405, term4004405.getClass(), "vsWin", 0);
        setBooleanField(term4004405, term4004405.getClass(), "isAllPerfect", false);
        setIntField(term4004405, term4004405.getClass(), "fullCombo", 0);
        setIntField(term4004405, term4004405.getClass(), "maxFever", 0);
        setIntField(term4004405, term4004405.getClass(), "maxCombo", 0);
        setIntField(term4004405, term4004405.getClass(), "tapPerfect", 0);
        setIntField(term4004405, term4004405.getClass(), "tapGreat", 0);
        setIntField(term4004405, term4004405.getClass(), "tapGood", 0);
        setIntField(term4004405, term4004405.getClass(), "tapBad", 0);
        setIntField(term4004405, term4004405.getClass(), "holdPerfect", 0);
        setIntField(term4004405, term4004405.getClass(), "holdGreat", 0);
        setIntField(term4004405, term4004405.getClass(), "holdGood", 0);
        setIntField(term4004405, term4004405.getClass(), "holdBad", 0);
        setIntField(term4004405, term4004405.getClass(), "slidePerfect", 0);
        setIntField(term4004405, term4004405.getClass(), "slideGreat", 0);
        setIntField(term4004405, term4004405.getClass(), "slideGood", 0);
        setIntField(term4004405, term4004405.getClass(), "slideBad", 0);
        setIntField(term4004405, term4004405.getClass(), "breakPerfect", 0);
        setIntField(term4004405, term4004405.getClass(), "breakGreat", 0);
        setIntField(term4004405, term4004405.getClass(), "breakGood", 0);
        setIntField(term4004405, term4004405.getClass(), "breakBad", 0);
        setBooleanField(term4004405, term4004405.getClass(), "isTrackSkip", false);
        setBooleanField(term4004405, term4004405.getClass(), "isHighScore", false);
        setBooleanField(term4004405, term4004405.getClass(), "isChallengeTrack", false);
        setIntField(term4004405, term4004405.getClass(), "challengeLife", 0);
        setIntField(term4004405, term4004405.getClass(), "challengeRemain", 0);
        setIntField(term4004405, term4004405.getClass(), "isAllPerfectPlus", 0);
        term4004459 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4004459;
        callMethod(klass, "setSyncRate", argTypes, term4004405, args);
    }

};


