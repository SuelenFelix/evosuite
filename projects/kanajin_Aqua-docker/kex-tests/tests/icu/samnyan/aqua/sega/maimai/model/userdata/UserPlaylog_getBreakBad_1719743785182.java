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

public class UserPlaylog_getBreakBad_1719743785182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002195;

    public UserPlaylog_getBreakBad_1719743785182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4002195 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4002195, term4002195.getClass(), "id", 0L);
        setField(term4002195, term4002195.getClass(), "user", null);
        setIntField(term4002195, term4002195.getClass(), "orderId", 0);
        setLongField(term4002195, term4002195.getClass(), "sortNumber", 0L);
        setIntField(term4002195, term4002195.getClass(), "placeId", 0);
        setField(term4002195, term4002195.getClass(), "placeName", null);
        setField(term4002195, term4002195.getClass(), "country", null);
        setIntField(term4002195, term4002195.getClass(), "regionId", 0);
        setField(term4002195, term4002195.getClass(), "playDate", null);
        setField(term4002195, term4002195.getClass(), "userPlayDate", null);
        setIntField(term4002195, term4002195.getClass(), "musicId", 0);
        setIntField(term4002195, term4002195.getClass(), "level", 0);
        setIntField(term4002195, term4002195.getClass(), "gameMode", 0);
        setIntField(term4002195, term4002195.getClass(), "rivalNum", 0);
        setIntField(term4002195, term4002195.getClass(), "track", 0);
        setIntField(term4002195, term4002195.getClass(), "eventId", 0);
        setBooleanField(term4002195, term4002195.getClass(), "isFreeToPlay", false);
        setIntField(term4002195, term4002195.getClass(), "playerRating", 0);
        setLongField(term4002195, term4002195.getClass(), "playedUserId1", 0L);
        setField(term4002195, term4002195.getClass(), "playedUserName1", null);
        setIntField(term4002195, term4002195.getClass(), "playedMusicLevel1", 0);
        setLongField(term4002195, term4002195.getClass(), "playedUserId2", 0L);
        setField(term4002195, term4002195.getClass(), "playedUserName2", null);
        setIntField(term4002195, term4002195.getClass(), "playedMusicLevel2", 0);
        setLongField(term4002195, term4002195.getClass(), "playedUserId3", 0L);
        setField(term4002195, term4002195.getClass(), "playedUserName3", null);
        setIntField(term4002195, term4002195.getClass(), "playedMusicLevel3", 0);
        setIntField(term4002195, term4002195.getClass(), "achievement", 0);
        setIntField(term4002195, term4002195.getClass(), "score", 0);
        setIntField(term4002195, term4002195.getClass(), "tapScore", 0);
        setIntField(term4002195, term4002195.getClass(), "holdScore", 0);
        setIntField(term4002195, term4002195.getClass(), "slideScore", 0);
        setIntField(term4002195, term4002195.getClass(), "breakScore", 0);
        setIntField(term4002195, term4002195.getClass(), "syncRate", 0);
        setIntField(term4002195, term4002195.getClass(), "vsWin", 0);
        setBooleanField(term4002195, term4002195.getClass(), "isAllPerfect", false);
        setIntField(term4002195, term4002195.getClass(), "fullCombo", 0);
        setIntField(term4002195, term4002195.getClass(), "maxFever", 0);
        setIntField(term4002195, term4002195.getClass(), "maxCombo", 0);
        setIntField(term4002195, term4002195.getClass(), "tapPerfect", 0);
        setIntField(term4002195, term4002195.getClass(), "tapGreat", 0);
        setIntField(term4002195, term4002195.getClass(), "tapGood", 0);
        setIntField(term4002195, term4002195.getClass(), "tapBad", 0);
        setIntField(term4002195, term4002195.getClass(), "holdPerfect", 0);
        setIntField(term4002195, term4002195.getClass(), "holdGreat", 0);
        setIntField(term4002195, term4002195.getClass(), "holdGood", 0);
        setIntField(term4002195, term4002195.getClass(), "holdBad", 0);
        setIntField(term4002195, term4002195.getClass(), "slidePerfect", 0);
        setIntField(term4002195, term4002195.getClass(), "slideGreat", 0);
        setIntField(term4002195, term4002195.getClass(), "slideGood", 0);
        setIntField(term4002195, term4002195.getClass(), "slideBad", 0);
        setIntField(term4002195, term4002195.getClass(), "breakPerfect", 0);
        setIntField(term4002195, term4002195.getClass(), "breakGreat", 0);
        setIntField(term4002195, term4002195.getClass(), "breakGood", 0);
        setIntField(term4002195, term4002195.getClass(), "breakBad", 0);
        setBooleanField(term4002195, term4002195.getClass(), "isTrackSkip", false);
        setBooleanField(term4002195, term4002195.getClass(), "isHighScore", false);
        setBooleanField(term4002195, term4002195.getClass(), "isChallengeTrack", false);
        setIntField(term4002195, term4002195.getClass(), "challengeLife", 0);
        setIntField(term4002195, term4002195.getClass(), "challengeRemain", 0);
        setIntField(term4002195, term4002195.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakBad", argTypes, term4002195, args);
    }

};


