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

public class UserPlaylog_setLevel_348959379201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176869;
     Object term176923;

    public UserPlaylog_setLevel_348959379201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176869 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176869, term176869.getClass(), "id", 0L);
        setField(term176869, term176869.getClass(), "user", null);
        setIntField(term176869, term176869.getClass(), "orderId", 0);
        setLongField(term176869, term176869.getClass(), "sortNumber", 0L);
        setIntField(term176869, term176869.getClass(), "placeId", 0);
        setField(term176869, term176869.getClass(), "placeName", null);
        setField(term176869, term176869.getClass(), "country", null);
        setIntField(term176869, term176869.getClass(), "regionId", 0);
        setField(term176869, term176869.getClass(), "playDate", null);
        setField(term176869, term176869.getClass(), "userPlayDate", null);
        setIntField(term176869, term176869.getClass(), "musicId", 0);
        setIntField(term176869, term176869.getClass(), "level", 0);
        setIntField(term176869, term176869.getClass(), "gameMode", 0);
        setIntField(term176869, term176869.getClass(), "rivalNum", 0);
        setIntField(term176869, term176869.getClass(), "track", 0);
        setIntField(term176869, term176869.getClass(), "eventId", 0);
        setBooleanField(term176869, term176869.getClass(), "isFreeToPlay", false);
        setIntField(term176869, term176869.getClass(), "playerRating", 0);
        setLongField(term176869, term176869.getClass(), "playedUserId1", 0L);
        setField(term176869, term176869.getClass(), "playedUserName1", null);
        setIntField(term176869, term176869.getClass(), "playedMusicLevel1", 0);
        setLongField(term176869, term176869.getClass(), "playedUserId2", 0L);
        setField(term176869, term176869.getClass(), "playedUserName2", null);
        setIntField(term176869, term176869.getClass(), "playedMusicLevel2", 0);
        setLongField(term176869, term176869.getClass(), "playedUserId3", 0L);
        setField(term176869, term176869.getClass(), "playedUserName3", null);
        setIntField(term176869, term176869.getClass(), "playedMusicLevel3", 0);
        setIntField(term176869, term176869.getClass(), "achievement", 0);
        setIntField(term176869, term176869.getClass(), "score", 0);
        setIntField(term176869, term176869.getClass(), "tapScore", 0);
        setIntField(term176869, term176869.getClass(), "holdScore", 0);
        setIntField(term176869, term176869.getClass(), "slideScore", 0);
        setIntField(term176869, term176869.getClass(), "breakScore", 0);
        setIntField(term176869, term176869.getClass(), "syncRate", 0);
        setIntField(term176869, term176869.getClass(), "vsWin", 0);
        setBooleanField(term176869, term176869.getClass(), "isAllPerfect", false);
        setIntField(term176869, term176869.getClass(), "fullCombo", 0);
        setIntField(term176869, term176869.getClass(), "maxFever", 0);
        setIntField(term176869, term176869.getClass(), "maxCombo", 0);
        setIntField(term176869, term176869.getClass(), "tapPerfect", 0);
        setIntField(term176869, term176869.getClass(), "tapGreat", 0);
        setIntField(term176869, term176869.getClass(), "tapGood", 0);
        setIntField(term176869, term176869.getClass(), "tapBad", 0);
        setIntField(term176869, term176869.getClass(), "holdPerfect", 0);
        setIntField(term176869, term176869.getClass(), "holdGreat", 0);
        setIntField(term176869, term176869.getClass(), "holdGood", 0);
        setIntField(term176869, term176869.getClass(), "holdBad", 0);
        setIntField(term176869, term176869.getClass(), "slidePerfect", 0);
        setIntField(term176869, term176869.getClass(), "slideGreat", 0);
        setIntField(term176869, term176869.getClass(), "slideGood", 0);
        setIntField(term176869, term176869.getClass(), "slideBad", 0);
        setIntField(term176869, term176869.getClass(), "breakPerfect", 0);
        setIntField(term176869, term176869.getClass(), "breakGreat", 0);
        setIntField(term176869, term176869.getClass(), "breakGood", 0);
        setIntField(term176869, term176869.getClass(), "breakBad", 0);
        setBooleanField(term176869, term176869.getClass(), "isTrackSkip", false);
        setBooleanField(term176869, term176869.getClass(), "isHighScore", false);
        setBooleanField(term176869, term176869.getClass(), "isChallengeTrack", false);
        setIntField(term176869, term176869.getClass(), "challengeLife", 0);
        setIntField(term176869, term176869.getClass(), "challengeRemain", 0);
        setIntField(term176869, term176869.getClass(), "isAllPerfectPlus", 0);
        term176923 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176923;
        callMethod(klass, "setLevel", argTypes, term176869, args);
    }

};


