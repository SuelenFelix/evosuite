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

public class UserPlaylog_toString_1288668204253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179769;

    public UserPlaylog_toString_1288668204253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179769 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term179769, term179769.getClass(), "id", 0L);
        setField(term179769, term179769.getClass(), "user", null);
        setIntField(term179769, term179769.getClass(), "orderId", 0);
        setLongField(term179769, term179769.getClass(), "sortNumber", 0L);
        setIntField(term179769, term179769.getClass(), "placeId", 0);
        setField(term179769, term179769.getClass(), "placeName", null);
        setField(term179769, term179769.getClass(), "country", null);
        setIntField(term179769, term179769.getClass(), "regionId", 0);
        setField(term179769, term179769.getClass(), "playDate", null);
        setField(term179769, term179769.getClass(), "userPlayDate", null);
        setIntField(term179769, term179769.getClass(), "musicId", 0);
        setIntField(term179769, term179769.getClass(), "level", 0);
        setIntField(term179769, term179769.getClass(), "gameMode", 0);
        setIntField(term179769, term179769.getClass(), "rivalNum", 0);
        setIntField(term179769, term179769.getClass(), "track", 0);
        setIntField(term179769, term179769.getClass(), "eventId", 0);
        setBooleanField(term179769, term179769.getClass(), "isFreeToPlay", false);
        setIntField(term179769, term179769.getClass(), "playerRating", 0);
        setLongField(term179769, term179769.getClass(), "playedUserId1", 0L);
        setField(term179769, term179769.getClass(), "playedUserName1", null);
        setIntField(term179769, term179769.getClass(), "playedMusicLevel1", 0);
        setLongField(term179769, term179769.getClass(), "playedUserId2", 0L);
        setField(term179769, term179769.getClass(), "playedUserName2", null);
        setIntField(term179769, term179769.getClass(), "playedMusicLevel2", 0);
        setLongField(term179769, term179769.getClass(), "playedUserId3", 0L);
        setField(term179769, term179769.getClass(), "playedUserName3", null);
        setIntField(term179769, term179769.getClass(), "playedMusicLevel3", 0);
        setIntField(term179769, term179769.getClass(), "achievement", 0);
        setIntField(term179769, term179769.getClass(), "score", 0);
        setIntField(term179769, term179769.getClass(), "tapScore", 0);
        setIntField(term179769, term179769.getClass(), "holdScore", 0);
        setIntField(term179769, term179769.getClass(), "slideScore", 0);
        setIntField(term179769, term179769.getClass(), "breakScore", 0);
        setIntField(term179769, term179769.getClass(), "syncRate", 0);
        setIntField(term179769, term179769.getClass(), "vsWin", 0);
        setBooleanField(term179769, term179769.getClass(), "isAllPerfect", false);
        setIntField(term179769, term179769.getClass(), "fullCombo", 0);
        setIntField(term179769, term179769.getClass(), "maxFever", 0);
        setIntField(term179769, term179769.getClass(), "maxCombo", 0);
        setIntField(term179769, term179769.getClass(), "tapPerfect", 0);
        setIntField(term179769, term179769.getClass(), "tapGreat", 0);
        setIntField(term179769, term179769.getClass(), "tapGood", 0);
        setIntField(term179769, term179769.getClass(), "tapBad", 0);
        setIntField(term179769, term179769.getClass(), "holdPerfect", 0);
        setIntField(term179769, term179769.getClass(), "holdGreat", 0);
        setIntField(term179769, term179769.getClass(), "holdGood", 0);
        setIntField(term179769, term179769.getClass(), "holdBad", 0);
        setIntField(term179769, term179769.getClass(), "slidePerfect", 0);
        setIntField(term179769, term179769.getClass(), "slideGreat", 0);
        setIntField(term179769, term179769.getClass(), "slideGood", 0);
        setIntField(term179769, term179769.getClass(), "slideBad", 0);
        setIntField(term179769, term179769.getClass(), "breakPerfect", 0);
        setIntField(term179769, term179769.getClass(), "breakGreat", 0);
        setIntField(term179769, term179769.getClass(), "breakGood", 0);
        setIntField(term179769, term179769.getClass(), "breakBad", 0);
        setBooleanField(term179769, term179769.getClass(), "isTrackSkip", false);
        setBooleanField(term179769, term179769.getClass(), "isHighScore", false);
        setBooleanField(term179769, term179769.getClass(), "isChallengeTrack", false);
        setIntField(term179769, term179769.getClass(), "challengeLife", 0);
        setIntField(term179769, term179769.getClass(), "challengeRemain", 0);
        setIntField(term179769, term179769.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term179769, args);
    }

};


