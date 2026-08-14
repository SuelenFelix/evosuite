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

public class UserPlaylog_getIsAllPerfectPlus_772834945189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176209;

    public UserPlaylog_getIsAllPerfectPlus_772834945189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176209 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176209, term176209.getClass(), "id", 0L);
        setField(term176209, term176209.getClass(), "user", null);
        setIntField(term176209, term176209.getClass(), "orderId", 0);
        setLongField(term176209, term176209.getClass(), "sortNumber", 0L);
        setIntField(term176209, term176209.getClass(), "placeId", 0);
        setField(term176209, term176209.getClass(), "placeName", null);
        setField(term176209, term176209.getClass(), "country", null);
        setIntField(term176209, term176209.getClass(), "regionId", 0);
        setField(term176209, term176209.getClass(), "playDate", null);
        setField(term176209, term176209.getClass(), "userPlayDate", null);
        setIntField(term176209, term176209.getClass(), "musicId", 0);
        setIntField(term176209, term176209.getClass(), "level", 0);
        setIntField(term176209, term176209.getClass(), "gameMode", 0);
        setIntField(term176209, term176209.getClass(), "rivalNum", 0);
        setIntField(term176209, term176209.getClass(), "track", 0);
        setIntField(term176209, term176209.getClass(), "eventId", 0);
        setBooleanField(term176209, term176209.getClass(), "isFreeToPlay", false);
        setIntField(term176209, term176209.getClass(), "playerRating", 0);
        setLongField(term176209, term176209.getClass(), "playedUserId1", 0L);
        setField(term176209, term176209.getClass(), "playedUserName1", null);
        setIntField(term176209, term176209.getClass(), "playedMusicLevel1", 0);
        setLongField(term176209, term176209.getClass(), "playedUserId2", 0L);
        setField(term176209, term176209.getClass(), "playedUserName2", null);
        setIntField(term176209, term176209.getClass(), "playedMusicLevel2", 0);
        setLongField(term176209, term176209.getClass(), "playedUserId3", 0L);
        setField(term176209, term176209.getClass(), "playedUserName3", null);
        setIntField(term176209, term176209.getClass(), "playedMusicLevel3", 0);
        setIntField(term176209, term176209.getClass(), "achievement", 0);
        setIntField(term176209, term176209.getClass(), "score", 0);
        setIntField(term176209, term176209.getClass(), "tapScore", 0);
        setIntField(term176209, term176209.getClass(), "holdScore", 0);
        setIntField(term176209, term176209.getClass(), "slideScore", 0);
        setIntField(term176209, term176209.getClass(), "breakScore", 0);
        setIntField(term176209, term176209.getClass(), "syncRate", 0);
        setIntField(term176209, term176209.getClass(), "vsWin", 0);
        setBooleanField(term176209, term176209.getClass(), "isAllPerfect", false);
        setIntField(term176209, term176209.getClass(), "fullCombo", 0);
        setIntField(term176209, term176209.getClass(), "maxFever", 0);
        setIntField(term176209, term176209.getClass(), "maxCombo", 0);
        setIntField(term176209, term176209.getClass(), "tapPerfect", 0);
        setIntField(term176209, term176209.getClass(), "tapGreat", 0);
        setIntField(term176209, term176209.getClass(), "tapGood", 0);
        setIntField(term176209, term176209.getClass(), "tapBad", 0);
        setIntField(term176209, term176209.getClass(), "holdPerfect", 0);
        setIntField(term176209, term176209.getClass(), "holdGreat", 0);
        setIntField(term176209, term176209.getClass(), "holdGood", 0);
        setIntField(term176209, term176209.getClass(), "holdBad", 0);
        setIntField(term176209, term176209.getClass(), "slidePerfect", 0);
        setIntField(term176209, term176209.getClass(), "slideGreat", 0);
        setIntField(term176209, term176209.getClass(), "slideGood", 0);
        setIntField(term176209, term176209.getClass(), "slideBad", 0);
        setIntField(term176209, term176209.getClass(), "breakPerfect", 0);
        setIntField(term176209, term176209.getClass(), "breakGreat", 0);
        setIntField(term176209, term176209.getClass(), "breakGood", 0);
        setIntField(term176209, term176209.getClass(), "breakBad", 0);
        setBooleanField(term176209, term176209.getClass(), "isTrackSkip", false);
        setBooleanField(term176209, term176209.getClass(), "isHighScore", false);
        setBooleanField(term176209, term176209.getClass(), "isChallengeTrack", false);
        setIntField(term176209, term176209.getClass(), "challengeLife", 0);
        setIntField(term176209, term176209.getClass(), "challengeRemain", 0);
        setIntField(term176209, term176209.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsAllPerfectPlus", argTypes, term176209, args);
    }

};


