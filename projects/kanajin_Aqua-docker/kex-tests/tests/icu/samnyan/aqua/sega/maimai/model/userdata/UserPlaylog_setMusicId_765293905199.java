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

public class UserPlaylog_setMusicId_765293905199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176757;
     Object term176811;

    public UserPlaylog_setMusicId_765293905199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176757 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term176757, term176757.getClass(), "id", 0L);
        setField(term176757, term176757.getClass(), "user", null);
        setIntField(term176757, term176757.getClass(), "orderId", 0);
        setLongField(term176757, term176757.getClass(), "sortNumber", 0L);
        setIntField(term176757, term176757.getClass(), "placeId", 0);
        setField(term176757, term176757.getClass(), "placeName", null);
        setField(term176757, term176757.getClass(), "country", null);
        setIntField(term176757, term176757.getClass(), "regionId", 0);
        setField(term176757, term176757.getClass(), "playDate", null);
        setField(term176757, term176757.getClass(), "userPlayDate", null);
        setIntField(term176757, term176757.getClass(), "musicId", 0);
        setIntField(term176757, term176757.getClass(), "level", 0);
        setIntField(term176757, term176757.getClass(), "gameMode", 0);
        setIntField(term176757, term176757.getClass(), "rivalNum", 0);
        setIntField(term176757, term176757.getClass(), "track", 0);
        setIntField(term176757, term176757.getClass(), "eventId", 0);
        setBooleanField(term176757, term176757.getClass(), "isFreeToPlay", false);
        setIntField(term176757, term176757.getClass(), "playerRating", 0);
        setLongField(term176757, term176757.getClass(), "playedUserId1", 0L);
        setField(term176757, term176757.getClass(), "playedUserName1", null);
        setIntField(term176757, term176757.getClass(), "playedMusicLevel1", 0);
        setLongField(term176757, term176757.getClass(), "playedUserId2", 0L);
        setField(term176757, term176757.getClass(), "playedUserName2", null);
        setIntField(term176757, term176757.getClass(), "playedMusicLevel2", 0);
        setLongField(term176757, term176757.getClass(), "playedUserId3", 0L);
        setField(term176757, term176757.getClass(), "playedUserName3", null);
        setIntField(term176757, term176757.getClass(), "playedMusicLevel3", 0);
        setIntField(term176757, term176757.getClass(), "achievement", 0);
        setIntField(term176757, term176757.getClass(), "score", 0);
        setIntField(term176757, term176757.getClass(), "tapScore", 0);
        setIntField(term176757, term176757.getClass(), "holdScore", 0);
        setIntField(term176757, term176757.getClass(), "slideScore", 0);
        setIntField(term176757, term176757.getClass(), "breakScore", 0);
        setIntField(term176757, term176757.getClass(), "syncRate", 0);
        setIntField(term176757, term176757.getClass(), "vsWin", 0);
        setBooleanField(term176757, term176757.getClass(), "isAllPerfect", false);
        setIntField(term176757, term176757.getClass(), "fullCombo", 0);
        setIntField(term176757, term176757.getClass(), "maxFever", 0);
        setIntField(term176757, term176757.getClass(), "maxCombo", 0);
        setIntField(term176757, term176757.getClass(), "tapPerfect", 0);
        setIntField(term176757, term176757.getClass(), "tapGreat", 0);
        setIntField(term176757, term176757.getClass(), "tapGood", 0);
        setIntField(term176757, term176757.getClass(), "tapBad", 0);
        setIntField(term176757, term176757.getClass(), "holdPerfect", 0);
        setIntField(term176757, term176757.getClass(), "holdGreat", 0);
        setIntField(term176757, term176757.getClass(), "holdGood", 0);
        setIntField(term176757, term176757.getClass(), "holdBad", 0);
        setIntField(term176757, term176757.getClass(), "slidePerfect", 0);
        setIntField(term176757, term176757.getClass(), "slideGreat", 0);
        setIntField(term176757, term176757.getClass(), "slideGood", 0);
        setIntField(term176757, term176757.getClass(), "slideBad", 0);
        setIntField(term176757, term176757.getClass(), "breakPerfect", 0);
        setIntField(term176757, term176757.getClass(), "breakGreat", 0);
        setIntField(term176757, term176757.getClass(), "breakGood", 0);
        setIntField(term176757, term176757.getClass(), "breakBad", 0);
        setBooleanField(term176757, term176757.getClass(), "isTrackSkip", false);
        setBooleanField(term176757, term176757.getClass(), "isHighScore", false);
        setBooleanField(term176757, term176757.getClass(), "isChallengeTrack", false);
        setIntField(term176757, term176757.getClass(), "challengeLife", 0);
        setIntField(term176757, term176757.getClass(), "challengeRemain", 0);
        setIntField(term176757, term176757.getClass(), "isAllPerfectPlus", 0);
        term176811 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176811;
        callMethod(klass, "setMusicId", argTypes, term176757, args);
    }

};


