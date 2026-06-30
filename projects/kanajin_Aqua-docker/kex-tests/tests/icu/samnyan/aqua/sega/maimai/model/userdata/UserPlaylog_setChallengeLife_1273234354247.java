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

public class UserPlaylog_setChallengeLife_1273234354247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179439;
     Object term179493;

    public UserPlaylog_setChallengeLife_1273234354247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179439 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term179439, term179439.getClass(), "id", 0L);
        setField(term179439, term179439.getClass(), "user", null);
        setIntField(term179439, term179439.getClass(), "orderId", 0);
        setLongField(term179439, term179439.getClass(), "sortNumber", 0L);
        setIntField(term179439, term179439.getClass(), "placeId", 0);
        setField(term179439, term179439.getClass(), "placeName", null);
        setField(term179439, term179439.getClass(), "country", null);
        setIntField(term179439, term179439.getClass(), "regionId", 0);
        setField(term179439, term179439.getClass(), "playDate", null);
        setField(term179439, term179439.getClass(), "userPlayDate", null);
        setIntField(term179439, term179439.getClass(), "musicId", 0);
        setIntField(term179439, term179439.getClass(), "level", 0);
        setIntField(term179439, term179439.getClass(), "gameMode", 0);
        setIntField(term179439, term179439.getClass(), "rivalNum", 0);
        setIntField(term179439, term179439.getClass(), "track", 0);
        setIntField(term179439, term179439.getClass(), "eventId", 0);
        setBooleanField(term179439, term179439.getClass(), "isFreeToPlay", false);
        setIntField(term179439, term179439.getClass(), "playerRating", 0);
        setLongField(term179439, term179439.getClass(), "playedUserId1", 0L);
        setField(term179439, term179439.getClass(), "playedUserName1", null);
        setIntField(term179439, term179439.getClass(), "playedMusicLevel1", 0);
        setLongField(term179439, term179439.getClass(), "playedUserId2", 0L);
        setField(term179439, term179439.getClass(), "playedUserName2", null);
        setIntField(term179439, term179439.getClass(), "playedMusicLevel2", 0);
        setLongField(term179439, term179439.getClass(), "playedUserId3", 0L);
        setField(term179439, term179439.getClass(), "playedUserName3", null);
        setIntField(term179439, term179439.getClass(), "playedMusicLevel3", 0);
        setIntField(term179439, term179439.getClass(), "achievement", 0);
        setIntField(term179439, term179439.getClass(), "score", 0);
        setIntField(term179439, term179439.getClass(), "tapScore", 0);
        setIntField(term179439, term179439.getClass(), "holdScore", 0);
        setIntField(term179439, term179439.getClass(), "slideScore", 0);
        setIntField(term179439, term179439.getClass(), "breakScore", 0);
        setIntField(term179439, term179439.getClass(), "syncRate", 0);
        setIntField(term179439, term179439.getClass(), "vsWin", 0);
        setBooleanField(term179439, term179439.getClass(), "isAllPerfect", false);
        setIntField(term179439, term179439.getClass(), "fullCombo", 0);
        setIntField(term179439, term179439.getClass(), "maxFever", 0);
        setIntField(term179439, term179439.getClass(), "maxCombo", 0);
        setIntField(term179439, term179439.getClass(), "tapPerfect", 0);
        setIntField(term179439, term179439.getClass(), "tapGreat", 0);
        setIntField(term179439, term179439.getClass(), "tapGood", 0);
        setIntField(term179439, term179439.getClass(), "tapBad", 0);
        setIntField(term179439, term179439.getClass(), "holdPerfect", 0);
        setIntField(term179439, term179439.getClass(), "holdGreat", 0);
        setIntField(term179439, term179439.getClass(), "holdGood", 0);
        setIntField(term179439, term179439.getClass(), "holdBad", 0);
        setIntField(term179439, term179439.getClass(), "slidePerfect", 0);
        setIntField(term179439, term179439.getClass(), "slideGreat", 0);
        setIntField(term179439, term179439.getClass(), "slideGood", 0);
        setIntField(term179439, term179439.getClass(), "slideBad", 0);
        setIntField(term179439, term179439.getClass(), "breakPerfect", 0);
        setIntField(term179439, term179439.getClass(), "breakGreat", 0);
        setIntField(term179439, term179439.getClass(), "breakGood", 0);
        setIntField(term179439, term179439.getClass(), "breakBad", 0);
        setBooleanField(term179439, term179439.getClass(), "isTrackSkip", false);
        setBooleanField(term179439, term179439.getClass(), "isHighScore", false);
        setBooleanField(term179439, term179439.getClass(), "isChallengeTrack", false);
        setIntField(term179439, term179439.getClass(), "challengeLife", 0);
        setIntField(term179439, term179439.getClass(), "challengeRemain", 0);
        setIntField(term179439, term179439.getClass(), "isAllPerfectPlus", 0);
        term179493 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term179493;
        callMethod(klass, "setChallengeLife", argTypes, term179439, args);
    }

};


