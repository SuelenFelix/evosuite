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
import java.lang.Boolean;

public class UserPlaylog_setTrackSkip_434835481244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179271;
     Object term179325;

    public UserPlaylog_setTrackSkip_434835481244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179271 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term179271, term179271.getClass(), "id", 0L);
        setField(term179271, term179271.getClass(), "user", null);
        setIntField(term179271, term179271.getClass(), "orderId", 0);
        setLongField(term179271, term179271.getClass(), "sortNumber", 0L);
        setIntField(term179271, term179271.getClass(), "placeId", 0);
        setField(term179271, term179271.getClass(), "placeName", null);
        setField(term179271, term179271.getClass(), "country", null);
        setIntField(term179271, term179271.getClass(), "regionId", 0);
        setField(term179271, term179271.getClass(), "playDate", null);
        setField(term179271, term179271.getClass(), "userPlayDate", null);
        setIntField(term179271, term179271.getClass(), "musicId", 0);
        setIntField(term179271, term179271.getClass(), "level", 0);
        setIntField(term179271, term179271.getClass(), "gameMode", 0);
        setIntField(term179271, term179271.getClass(), "rivalNum", 0);
        setIntField(term179271, term179271.getClass(), "track", 0);
        setIntField(term179271, term179271.getClass(), "eventId", 0);
        setBooleanField(term179271, term179271.getClass(), "isFreeToPlay", false);
        setIntField(term179271, term179271.getClass(), "playerRating", 0);
        setLongField(term179271, term179271.getClass(), "playedUserId1", 0L);
        setField(term179271, term179271.getClass(), "playedUserName1", null);
        setIntField(term179271, term179271.getClass(), "playedMusicLevel1", 0);
        setLongField(term179271, term179271.getClass(), "playedUserId2", 0L);
        setField(term179271, term179271.getClass(), "playedUserName2", null);
        setIntField(term179271, term179271.getClass(), "playedMusicLevel2", 0);
        setLongField(term179271, term179271.getClass(), "playedUserId3", 0L);
        setField(term179271, term179271.getClass(), "playedUserName3", null);
        setIntField(term179271, term179271.getClass(), "playedMusicLevel3", 0);
        setIntField(term179271, term179271.getClass(), "achievement", 0);
        setIntField(term179271, term179271.getClass(), "score", 0);
        setIntField(term179271, term179271.getClass(), "tapScore", 0);
        setIntField(term179271, term179271.getClass(), "holdScore", 0);
        setIntField(term179271, term179271.getClass(), "slideScore", 0);
        setIntField(term179271, term179271.getClass(), "breakScore", 0);
        setIntField(term179271, term179271.getClass(), "syncRate", 0);
        setIntField(term179271, term179271.getClass(), "vsWin", 0);
        setBooleanField(term179271, term179271.getClass(), "isAllPerfect", false);
        setIntField(term179271, term179271.getClass(), "fullCombo", 0);
        setIntField(term179271, term179271.getClass(), "maxFever", 0);
        setIntField(term179271, term179271.getClass(), "maxCombo", 0);
        setIntField(term179271, term179271.getClass(), "tapPerfect", 0);
        setIntField(term179271, term179271.getClass(), "tapGreat", 0);
        setIntField(term179271, term179271.getClass(), "tapGood", 0);
        setIntField(term179271, term179271.getClass(), "tapBad", 0);
        setIntField(term179271, term179271.getClass(), "holdPerfect", 0);
        setIntField(term179271, term179271.getClass(), "holdGreat", 0);
        setIntField(term179271, term179271.getClass(), "holdGood", 0);
        setIntField(term179271, term179271.getClass(), "holdBad", 0);
        setIntField(term179271, term179271.getClass(), "slidePerfect", 0);
        setIntField(term179271, term179271.getClass(), "slideGreat", 0);
        setIntField(term179271, term179271.getClass(), "slideGood", 0);
        setIntField(term179271, term179271.getClass(), "slideBad", 0);
        setIntField(term179271, term179271.getClass(), "breakPerfect", 0);
        setIntField(term179271, term179271.getClass(), "breakGreat", 0);
        setIntField(term179271, term179271.getClass(), "breakGood", 0);
        setIntField(term179271, term179271.getClass(), "breakBad", 0);
        setBooleanField(term179271, term179271.getClass(), "isTrackSkip", false);
        setBooleanField(term179271, term179271.getClass(), "isHighScore", false);
        setBooleanField(term179271, term179271.getClass(), "isChallengeTrack", false);
        setIntField(term179271, term179271.getClass(), "challengeLife", 0);
        setIntField(term179271, term179271.getClass(), "challengeRemain", 0);
        setIntField(term179271, term179271.getClass(), "isAllPerfectPlus", 0);
        term179325 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term179325;
        callMethod(klass, "setTrackSkip", argTypes, term179271, args);
    }

};


