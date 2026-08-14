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

public class UserPlaylog_setPlayDate_1234032880197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4003015;

    public UserPlaylog_setPlayDate_1234032880197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4003015 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4003015, term4003015.getClass(), "id", 0L);
        setField(term4003015, term4003015.getClass(), "user", null);
        setIntField(term4003015, term4003015.getClass(), "orderId", 0);
        setLongField(term4003015, term4003015.getClass(), "sortNumber", 0L);
        setIntField(term4003015, term4003015.getClass(), "placeId", 0);
        setField(term4003015, term4003015.getClass(), "placeName", null);
        setField(term4003015, term4003015.getClass(), "country", null);
        setIntField(term4003015, term4003015.getClass(), "regionId", 0);
        setField(term4003015, term4003015.getClass(), "playDate", null);
        setField(term4003015, term4003015.getClass(), "userPlayDate", null);
        setIntField(term4003015, term4003015.getClass(), "musicId", 0);
        setIntField(term4003015, term4003015.getClass(), "level", 0);
        setIntField(term4003015, term4003015.getClass(), "gameMode", 0);
        setIntField(term4003015, term4003015.getClass(), "rivalNum", 0);
        setIntField(term4003015, term4003015.getClass(), "track", 0);
        setIntField(term4003015, term4003015.getClass(), "eventId", 0);
        setBooleanField(term4003015, term4003015.getClass(), "isFreeToPlay", false);
        setIntField(term4003015, term4003015.getClass(), "playerRating", 0);
        setLongField(term4003015, term4003015.getClass(), "playedUserId1", 0L);
        setField(term4003015, term4003015.getClass(), "playedUserName1", null);
        setIntField(term4003015, term4003015.getClass(), "playedMusicLevel1", 0);
        setLongField(term4003015, term4003015.getClass(), "playedUserId2", 0L);
        setField(term4003015, term4003015.getClass(), "playedUserName2", null);
        setIntField(term4003015, term4003015.getClass(), "playedMusicLevel2", 0);
        setLongField(term4003015, term4003015.getClass(), "playedUserId3", 0L);
        setField(term4003015, term4003015.getClass(), "playedUserName3", null);
        setIntField(term4003015, term4003015.getClass(), "playedMusicLevel3", 0);
        setIntField(term4003015, term4003015.getClass(), "achievement", 0);
        setIntField(term4003015, term4003015.getClass(), "score", 0);
        setIntField(term4003015, term4003015.getClass(), "tapScore", 0);
        setIntField(term4003015, term4003015.getClass(), "holdScore", 0);
        setIntField(term4003015, term4003015.getClass(), "slideScore", 0);
        setIntField(term4003015, term4003015.getClass(), "breakScore", 0);
        setIntField(term4003015, term4003015.getClass(), "syncRate", 0);
        setIntField(term4003015, term4003015.getClass(), "vsWin", 0);
        setBooleanField(term4003015, term4003015.getClass(), "isAllPerfect", false);
        setIntField(term4003015, term4003015.getClass(), "fullCombo", 0);
        setIntField(term4003015, term4003015.getClass(), "maxFever", 0);
        setIntField(term4003015, term4003015.getClass(), "maxCombo", 0);
        setIntField(term4003015, term4003015.getClass(), "tapPerfect", 0);
        setIntField(term4003015, term4003015.getClass(), "tapGreat", 0);
        setIntField(term4003015, term4003015.getClass(), "tapGood", 0);
        setIntField(term4003015, term4003015.getClass(), "tapBad", 0);
        setIntField(term4003015, term4003015.getClass(), "holdPerfect", 0);
        setIntField(term4003015, term4003015.getClass(), "holdGreat", 0);
        setIntField(term4003015, term4003015.getClass(), "holdGood", 0);
        setIntField(term4003015, term4003015.getClass(), "holdBad", 0);
        setIntField(term4003015, term4003015.getClass(), "slidePerfect", 0);
        setIntField(term4003015, term4003015.getClass(), "slideGreat", 0);
        setIntField(term4003015, term4003015.getClass(), "slideGood", 0);
        setIntField(term4003015, term4003015.getClass(), "slideBad", 0);
        setIntField(term4003015, term4003015.getClass(), "breakPerfect", 0);
        setIntField(term4003015, term4003015.getClass(), "breakGreat", 0);
        setIntField(term4003015, term4003015.getClass(), "breakGood", 0);
        setIntField(term4003015, term4003015.getClass(), "breakBad", 0);
        setBooleanField(term4003015, term4003015.getClass(), "isTrackSkip", false);
        setBooleanField(term4003015, term4003015.getClass(), "isHighScore", false);
        setBooleanField(term4003015, term4003015.getClass(), "isChallengeTrack", false);
        setIntField(term4003015, term4003015.getClass(), "challengeLife", 0);
        setIntField(term4003015, term4003015.getClass(), "challengeRemain", 0);
        setIntField(term4003015, term4003015.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayDate", argTypes, term4003015, args);
    }

};


