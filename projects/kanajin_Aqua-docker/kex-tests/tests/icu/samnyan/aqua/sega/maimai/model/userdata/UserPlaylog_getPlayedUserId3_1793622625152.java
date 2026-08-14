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

public class UserPlaylog_getPlayedUserId3_1793622625152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000575;

    public UserPlaylog_getPlayedUserId3_1793622625152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4000575 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4000575, term4000575.getClass(), "id", 0L);
        setField(term4000575, term4000575.getClass(), "user", null);
        setIntField(term4000575, term4000575.getClass(), "orderId", 0);
        setLongField(term4000575, term4000575.getClass(), "sortNumber", 0L);
        setIntField(term4000575, term4000575.getClass(), "placeId", 0);
        setField(term4000575, term4000575.getClass(), "placeName", null);
        setField(term4000575, term4000575.getClass(), "country", null);
        setIntField(term4000575, term4000575.getClass(), "regionId", 0);
        setField(term4000575, term4000575.getClass(), "playDate", null);
        setField(term4000575, term4000575.getClass(), "userPlayDate", null);
        setIntField(term4000575, term4000575.getClass(), "musicId", 0);
        setIntField(term4000575, term4000575.getClass(), "level", 0);
        setIntField(term4000575, term4000575.getClass(), "gameMode", 0);
        setIntField(term4000575, term4000575.getClass(), "rivalNum", 0);
        setIntField(term4000575, term4000575.getClass(), "track", 0);
        setIntField(term4000575, term4000575.getClass(), "eventId", 0);
        setBooleanField(term4000575, term4000575.getClass(), "isFreeToPlay", false);
        setIntField(term4000575, term4000575.getClass(), "playerRating", 0);
        setLongField(term4000575, term4000575.getClass(), "playedUserId1", 0L);
        setField(term4000575, term4000575.getClass(), "playedUserName1", null);
        setIntField(term4000575, term4000575.getClass(), "playedMusicLevel1", 0);
        setLongField(term4000575, term4000575.getClass(), "playedUserId2", 0L);
        setField(term4000575, term4000575.getClass(), "playedUserName2", null);
        setIntField(term4000575, term4000575.getClass(), "playedMusicLevel2", 0);
        setLongField(term4000575, term4000575.getClass(), "playedUserId3", 0L);
        setField(term4000575, term4000575.getClass(), "playedUserName3", null);
        setIntField(term4000575, term4000575.getClass(), "playedMusicLevel3", 0);
        setIntField(term4000575, term4000575.getClass(), "achievement", 0);
        setIntField(term4000575, term4000575.getClass(), "score", 0);
        setIntField(term4000575, term4000575.getClass(), "tapScore", 0);
        setIntField(term4000575, term4000575.getClass(), "holdScore", 0);
        setIntField(term4000575, term4000575.getClass(), "slideScore", 0);
        setIntField(term4000575, term4000575.getClass(), "breakScore", 0);
        setIntField(term4000575, term4000575.getClass(), "syncRate", 0);
        setIntField(term4000575, term4000575.getClass(), "vsWin", 0);
        setBooleanField(term4000575, term4000575.getClass(), "isAllPerfect", false);
        setIntField(term4000575, term4000575.getClass(), "fullCombo", 0);
        setIntField(term4000575, term4000575.getClass(), "maxFever", 0);
        setIntField(term4000575, term4000575.getClass(), "maxCombo", 0);
        setIntField(term4000575, term4000575.getClass(), "tapPerfect", 0);
        setIntField(term4000575, term4000575.getClass(), "tapGreat", 0);
        setIntField(term4000575, term4000575.getClass(), "tapGood", 0);
        setIntField(term4000575, term4000575.getClass(), "tapBad", 0);
        setIntField(term4000575, term4000575.getClass(), "holdPerfect", 0);
        setIntField(term4000575, term4000575.getClass(), "holdGreat", 0);
        setIntField(term4000575, term4000575.getClass(), "holdGood", 0);
        setIntField(term4000575, term4000575.getClass(), "holdBad", 0);
        setIntField(term4000575, term4000575.getClass(), "slidePerfect", 0);
        setIntField(term4000575, term4000575.getClass(), "slideGreat", 0);
        setIntField(term4000575, term4000575.getClass(), "slideGood", 0);
        setIntField(term4000575, term4000575.getClass(), "slideBad", 0);
        setIntField(term4000575, term4000575.getClass(), "breakPerfect", 0);
        setIntField(term4000575, term4000575.getClass(), "breakGreat", 0);
        setIntField(term4000575, term4000575.getClass(), "breakGood", 0);
        setIntField(term4000575, term4000575.getClass(), "breakBad", 0);
        setBooleanField(term4000575, term4000575.getClass(), "isTrackSkip", false);
        setBooleanField(term4000575, term4000575.getClass(), "isHighScore", false);
        setBooleanField(term4000575, term4000575.getClass(), "isChallengeTrack", false);
        setIntField(term4000575, term4000575.getClass(), "challengeLife", 0);
        setIntField(term4000575, term4000575.getClass(), "challengeRemain", 0);
        setIntField(term4000575, term4000575.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserId3", argTypes, term4000575, args);
    }

};


