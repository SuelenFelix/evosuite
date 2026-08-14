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

public class UserPlaylog_setPlaceId_636761233194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176485;
     Object term176539;

    public UserPlaylog_setPlaceId_636761233194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176485 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176485, term176485.getClass(), "id", 0L);
        setField(term176485, term176485.getClass(), "user", null);
        setIntField(term176485, term176485.getClass(), "orderId", 0);
        setLongField(term176485, term176485.getClass(), "sortNumber", 0L);
        setIntField(term176485, term176485.getClass(), "placeId", 0);
        setField(term176485, term176485.getClass(), "placeName", null);
        setField(term176485, term176485.getClass(), "country", null);
        setIntField(term176485, term176485.getClass(), "regionId", 0);
        setField(term176485, term176485.getClass(), "playDate", null);
        setField(term176485, term176485.getClass(), "userPlayDate", null);
        setIntField(term176485, term176485.getClass(), "musicId", 0);
        setIntField(term176485, term176485.getClass(), "level", 0);
        setIntField(term176485, term176485.getClass(), "gameMode", 0);
        setIntField(term176485, term176485.getClass(), "rivalNum", 0);
        setIntField(term176485, term176485.getClass(), "track", 0);
        setIntField(term176485, term176485.getClass(), "eventId", 0);
        setBooleanField(term176485, term176485.getClass(), "isFreeToPlay", false);
        setIntField(term176485, term176485.getClass(), "playerRating", 0);
        setLongField(term176485, term176485.getClass(), "playedUserId1", 0L);
        setField(term176485, term176485.getClass(), "playedUserName1", null);
        setIntField(term176485, term176485.getClass(), "playedMusicLevel1", 0);
        setLongField(term176485, term176485.getClass(), "playedUserId2", 0L);
        setField(term176485, term176485.getClass(), "playedUserName2", null);
        setIntField(term176485, term176485.getClass(), "playedMusicLevel2", 0);
        setLongField(term176485, term176485.getClass(), "playedUserId3", 0L);
        setField(term176485, term176485.getClass(), "playedUserName3", null);
        setIntField(term176485, term176485.getClass(), "playedMusicLevel3", 0);
        setIntField(term176485, term176485.getClass(), "achievement", 0);
        setIntField(term176485, term176485.getClass(), "score", 0);
        setIntField(term176485, term176485.getClass(), "tapScore", 0);
        setIntField(term176485, term176485.getClass(), "holdScore", 0);
        setIntField(term176485, term176485.getClass(), "slideScore", 0);
        setIntField(term176485, term176485.getClass(), "breakScore", 0);
        setIntField(term176485, term176485.getClass(), "syncRate", 0);
        setIntField(term176485, term176485.getClass(), "vsWin", 0);
        setBooleanField(term176485, term176485.getClass(), "isAllPerfect", false);
        setIntField(term176485, term176485.getClass(), "fullCombo", 0);
        setIntField(term176485, term176485.getClass(), "maxFever", 0);
        setIntField(term176485, term176485.getClass(), "maxCombo", 0);
        setIntField(term176485, term176485.getClass(), "tapPerfect", 0);
        setIntField(term176485, term176485.getClass(), "tapGreat", 0);
        setIntField(term176485, term176485.getClass(), "tapGood", 0);
        setIntField(term176485, term176485.getClass(), "tapBad", 0);
        setIntField(term176485, term176485.getClass(), "holdPerfect", 0);
        setIntField(term176485, term176485.getClass(), "holdGreat", 0);
        setIntField(term176485, term176485.getClass(), "holdGood", 0);
        setIntField(term176485, term176485.getClass(), "holdBad", 0);
        setIntField(term176485, term176485.getClass(), "slidePerfect", 0);
        setIntField(term176485, term176485.getClass(), "slideGreat", 0);
        setIntField(term176485, term176485.getClass(), "slideGood", 0);
        setIntField(term176485, term176485.getClass(), "slideBad", 0);
        setIntField(term176485, term176485.getClass(), "breakPerfect", 0);
        setIntField(term176485, term176485.getClass(), "breakGreat", 0);
        setIntField(term176485, term176485.getClass(), "breakGood", 0);
        setIntField(term176485, term176485.getClass(), "breakBad", 0);
        setBooleanField(term176485, term176485.getClass(), "isTrackSkip", false);
        setBooleanField(term176485, term176485.getClass(), "isHighScore", false);
        setBooleanField(term176485, term176485.getClass(), "isChallengeTrack", false);
        setIntField(term176485, term176485.getClass(), "challengeLife", 0);
        setIntField(term176485, term176485.getClass(), "challengeRemain", 0);
        setIntField(term176485, term176485.getClass(), "isAllPerfectPlus", 0);
        term176539 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176539;
        callMethod(klass, "setPlaceId", argTypes, term176485, args);
    }

};


