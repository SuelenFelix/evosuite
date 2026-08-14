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
import java.lang.Long;

public class UserPlaylog_setPlayedUserId2_869961720210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4003737;
     Object term4003791;

    public UserPlaylog_setPlayedUserId2_869961720210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4003737 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4003737, term4003737.getClass(), "id", 0L);
        setField(term4003737, term4003737.getClass(), "user", null);
        setIntField(term4003737, term4003737.getClass(), "orderId", 0);
        setLongField(term4003737, term4003737.getClass(), "sortNumber", 0L);
        setIntField(term4003737, term4003737.getClass(), "placeId", 0);
        setField(term4003737, term4003737.getClass(), "placeName", null);
        setField(term4003737, term4003737.getClass(), "country", null);
        setIntField(term4003737, term4003737.getClass(), "regionId", 0);
        setField(term4003737, term4003737.getClass(), "playDate", null);
        setField(term4003737, term4003737.getClass(), "userPlayDate", null);
        setIntField(term4003737, term4003737.getClass(), "musicId", 0);
        setIntField(term4003737, term4003737.getClass(), "level", 0);
        setIntField(term4003737, term4003737.getClass(), "gameMode", 0);
        setIntField(term4003737, term4003737.getClass(), "rivalNum", 0);
        setIntField(term4003737, term4003737.getClass(), "track", 0);
        setIntField(term4003737, term4003737.getClass(), "eventId", 0);
        setBooleanField(term4003737, term4003737.getClass(), "isFreeToPlay", false);
        setIntField(term4003737, term4003737.getClass(), "playerRating", 0);
        setLongField(term4003737, term4003737.getClass(), "playedUserId1", 0L);
        setField(term4003737, term4003737.getClass(), "playedUserName1", null);
        setIntField(term4003737, term4003737.getClass(), "playedMusicLevel1", 0);
        setLongField(term4003737, term4003737.getClass(), "playedUserId2", 0L);
        setField(term4003737, term4003737.getClass(), "playedUserName2", null);
        setIntField(term4003737, term4003737.getClass(), "playedMusicLevel2", 0);
        setLongField(term4003737, term4003737.getClass(), "playedUserId3", 0L);
        setField(term4003737, term4003737.getClass(), "playedUserName3", null);
        setIntField(term4003737, term4003737.getClass(), "playedMusicLevel3", 0);
        setIntField(term4003737, term4003737.getClass(), "achievement", 0);
        setIntField(term4003737, term4003737.getClass(), "score", 0);
        setIntField(term4003737, term4003737.getClass(), "tapScore", 0);
        setIntField(term4003737, term4003737.getClass(), "holdScore", 0);
        setIntField(term4003737, term4003737.getClass(), "slideScore", 0);
        setIntField(term4003737, term4003737.getClass(), "breakScore", 0);
        setIntField(term4003737, term4003737.getClass(), "syncRate", 0);
        setIntField(term4003737, term4003737.getClass(), "vsWin", 0);
        setBooleanField(term4003737, term4003737.getClass(), "isAllPerfect", false);
        setIntField(term4003737, term4003737.getClass(), "fullCombo", 0);
        setIntField(term4003737, term4003737.getClass(), "maxFever", 0);
        setIntField(term4003737, term4003737.getClass(), "maxCombo", 0);
        setIntField(term4003737, term4003737.getClass(), "tapPerfect", 0);
        setIntField(term4003737, term4003737.getClass(), "tapGreat", 0);
        setIntField(term4003737, term4003737.getClass(), "tapGood", 0);
        setIntField(term4003737, term4003737.getClass(), "tapBad", 0);
        setIntField(term4003737, term4003737.getClass(), "holdPerfect", 0);
        setIntField(term4003737, term4003737.getClass(), "holdGreat", 0);
        setIntField(term4003737, term4003737.getClass(), "holdGood", 0);
        setIntField(term4003737, term4003737.getClass(), "holdBad", 0);
        setIntField(term4003737, term4003737.getClass(), "slidePerfect", 0);
        setIntField(term4003737, term4003737.getClass(), "slideGreat", 0);
        setIntField(term4003737, term4003737.getClass(), "slideGood", 0);
        setIntField(term4003737, term4003737.getClass(), "slideBad", 0);
        setIntField(term4003737, term4003737.getClass(), "breakPerfect", 0);
        setIntField(term4003737, term4003737.getClass(), "breakGreat", 0);
        setIntField(term4003737, term4003737.getClass(), "breakGood", 0);
        setIntField(term4003737, term4003737.getClass(), "breakBad", 0);
        setBooleanField(term4003737, term4003737.getClass(), "isTrackSkip", false);
        setBooleanField(term4003737, term4003737.getClass(), "isHighScore", false);
        setBooleanField(term4003737, term4003737.getClass(), "isChallengeTrack", false);
        setIntField(term4003737, term4003737.getClass(), "challengeLife", 0);
        setIntField(term4003737, term4003737.getClass(), "challengeRemain", 0);
        setIntField(term4003737, term4003737.getClass(), "isAllPerfectPlus", 0);
        term4003791 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4003791;
        callMethod(klass, "setPlayedUserId2", argTypes, term4003737, args);
    }

};


