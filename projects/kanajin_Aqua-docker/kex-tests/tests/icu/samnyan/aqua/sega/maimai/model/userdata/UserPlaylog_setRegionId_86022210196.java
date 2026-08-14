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

public class UserPlaylog_setRegionId_86022210196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002959;
     Object term4003013;

    public UserPlaylog_setRegionId_86022210196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4002959 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4002959, term4002959.getClass(), "id", 0L);
        setField(term4002959, term4002959.getClass(), "user", null);
        setIntField(term4002959, term4002959.getClass(), "orderId", 0);
        setLongField(term4002959, term4002959.getClass(), "sortNumber", 0L);
        setIntField(term4002959, term4002959.getClass(), "placeId", 0);
        setField(term4002959, term4002959.getClass(), "placeName", null);
        setField(term4002959, term4002959.getClass(), "country", null);
        setIntField(term4002959, term4002959.getClass(), "regionId", 0);
        setField(term4002959, term4002959.getClass(), "playDate", null);
        setField(term4002959, term4002959.getClass(), "userPlayDate", null);
        setIntField(term4002959, term4002959.getClass(), "musicId", 0);
        setIntField(term4002959, term4002959.getClass(), "level", 0);
        setIntField(term4002959, term4002959.getClass(), "gameMode", 0);
        setIntField(term4002959, term4002959.getClass(), "rivalNum", 0);
        setIntField(term4002959, term4002959.getClass(), "track", 0);
        setIntField(term4002959, term4002959.getClass(), "eventId", 0);
        setBooleanField(term4002959, term4002959.getClass(), "isFreeToPlay", false);
        setIntField(term4002959, term4002959.getClass(), "playerRating", 0);
        setLongField(term4002959, term4002959.getClass(), "playedUserId1", 0L);
        setField(term4002959, term4002959.getClass(), "playedUserName1", null);
        setIntField(term4002959, term4002959.getClass(), "playedMusicLevel1", 0);
        setLongField(term4002959, term4002959.getClass(), "playedUserId2", 0L);
        setField(term4002959, term4002959.getClass(), "playedUserName2", null);
        setIntField(term4002959, term4002959.getClass(), "playedMusicLevel2", 0);
        setLongField(term4002959, term4002959.getClass(), "playedUserId3", 0L);
        setField(term4002959, term4002959.getClass(), "playedUserName3", null);
        setIntField(term4002959, term4002959.getClass(), "playedMusicLevel3", 0);
        setIntField(term4002959, term4002959.getClass(), "achievement", 0);
        setIntField(term4002959, term4002959.getClass(), "score", 0);
        setIntField(term4002959, term4002959.getClass(), "tapScore", 0);
        setIntField(term4002959, term4002959.getClass(), "holdScore", 0);
        setIntField(term4002959, term4002959.getClass(), "slideScore", 0);
        setIntField(term4002959, term4002959.getClass(), "breakScore", 0);
        setIntField(term4002959, term4002959.getClass(), "syncRate", 0);
        setIntField(term4002959, term4002959.getClass(), "vsWin", 0);
        setBooleanField(term4002959, term4002959.getClass(), "isAllPerfect", false);
        setIntField(term4002959, term4002959.getClass(), "fullCombo", 0);
        setIntField(term4002959, term4002959.getClass(), "maxFever", 0);
        setIntField(term4002959, term4002959.getClass(), "maxCombo", 0);
        setIntField(term4002959, term4002959.getClass(), "tapPerfect", 0);
        setIntField(term4002959, term4002959.getClass(), "tapGreat", 0);
        setIntField(term4002959, term4002959.getClass(), "tapGood", 0);
        setIntField(term4002959, term4002959.getClass(), "tapBad", 0);
        setIntField(term4002959, term4002959.getClass(), "holdPerfect", 0);
        setIntField(term4002959, term4002959.getClass(), "holdGreat", 0);
        setIntField(term4002959, term4002959.getClass(), "holdGood", 0);
        setIntField(term4002959, term4002959.getClass(), "holdBad", 0);
        setIntField(term4002959, term4002959.getClass(), "slidePerfect", 0);
        setIntField(term4002959, term4002959.getClass(), "slideGreat", 0);
        setIntField(term4002959, term4002959.getClass(), "slideGood", 0);
        setIntField(term4002959, term4002959.getClass(), "slideBad", 0);
        setIntField(term4002959, term4002959.getClass(), "breakPerfect", 0);
        setIntField(term4002959, term4002959.getClass(), "breakGreat", 0);
        setIntField(term4002959, term4002959.getClass(), "breakGood", 0);
        setIntField(term4002959, term4002959.getClass(), "breakBad", 0);
        setBooleanField(term4002959, term4002959.getClass(), "isTrackSkip", false);
        setBooleanField(term4002959, term4002959.getClass(), "isHighScore", false);
        setBooleanField(term4002959, term4002959.getClass(), "isChallengeTrack", false);
        setIntField(term4002959, term4002959.getClass(), "challengeLife", 0);
        setIntField(term4002959, term4002959.getClass(), "challengeRemain", 0);
        setIntField(term4002959, term4002959.getClass(), "isAllPerfectPlus", 0);
        term4003013 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4003013;
        callMethod(klass, "setRegionId", argTypes, term4002959, args);
    }

};


