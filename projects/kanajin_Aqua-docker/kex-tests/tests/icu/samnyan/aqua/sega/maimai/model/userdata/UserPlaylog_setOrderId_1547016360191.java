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

public class UserPlaylog_setOrderId_1547016360191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002683;
     Object term4002737;

    public UserPlaylog_setOrderId_1547016360191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4002683 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4002683, term4002683.getClass(), "id", 0L);
        setField(term4002683, term4002683.getClass(), "user", null);
        setIntField(term4002683, term4002683.getClass(), "orderId", 0);
        setLongField(term4002683, term4002683.getClass(), "sortNumber", 0L);
        setIntField(term4002683, term4002683.getClass(), "placeId", 0);
        setField(term4002683, term4002683.getClass(), "placeName", null);
        setField(term4002683, term4002683.getClass(), "country", null);
        setIntField(term4002683, term4002683.getClass(), "regionId", 0);
        setField(term4002683, term4002683.getClass(), "playDate", null);
        setField(term4002683, term4002683.getClass(), "userPlayDate", null);
        setIntField(term4002683, term4002683.getClass(), "musicId", 0);
        setIntField(term4002683, term4002683.getClass(), "level", 0);
        setIntField(term4002683, term4002683.getClass(), "gameMode", 0);
        setIntField(term4002683, term4002683.getClass(), "rivalNum", 0);
        setIntField(term4002683, term4002683.getClass(), "track", 0);
        setIntField(term4002683, term4002683.getClass(), "eventId", 0);
        setBooleanField(term4002683, term4002683.getClass(), "isFreeToPlay", false);
        setIntField(term4002683, term4002683.getClass(), "playerRating", 0);
        setLongField(term4002683, term4002683.getClass(), "playedUserId1", 0L);
        setField(term4002683, term4002683.getClass(), "playedUserName1", null);
        setIntField(term4002683, term4002683.getClass(), "playedMusicLevel1", 0);
        setLongField(term4002683, term4002683.getClass(), "playedUserId2", 0L);
        setField(term4002683, term4002683.getClass(), "playedUserName2", null);
        setIntField(term4002683, term4002683.getClass(), "playedMusicLevel2", 0);
        setLongField(term4002683, term4002683.getClass(), "playedUserId3", 0L);
        setField(term4002683, term4002683.getClass(), "playedUserName3", null);
        setIntField(term4002683, term4002683.getClass(), "playedMusicLevel3", 0);
        setIntField(term4002683, term4002683.getClass(), "achievement", 0);
        setIntField(term4002683, term4002683.getClass(), "score", 0);
        setIntField(term4002683, term4002683.getClass(), "tapScore", 0);
        setIntField(term4002683, term4002683.getClass(), "holdScore", 0);
        setIntField(term4002683, term4002683.getClass(), "slideScore", 0);
        setIntField(term4002683, term4002683.getClass(), "breakScore", 0);
        setIntField(term4002683, term4002683.getClass(), "syncRate", 0);
        setIntField(term4002683, term4002683.getClass(), "vsWin", 0);
        setBooleanField(term4002683, term4002683.getClass(), "isAllPerfect", false);
        setIntField(term4002683, term4002683.getClass(), "fullCombo", 0);
        setIntField(term4002683, term4002683.getClass(), "maxFever", 0);
        setIntField(term4002683, term4002683.getClass(), "maxCombo", 0);
        setIntField(term4002683, term4002683.getClass(), "tapPerfect", 0);
        setIntField(term4002683, term4002683.getClass(), "tapGreat", 0);
        setIntField(term4002683, term4002683.getClass(), "tapGood", 0);
        setIntField(term4002683, term4002683.getClass(), "tapBad", 0);
        setIntField(term4002683, term4002683.getClass(), "holdPerfect", 0);
        setIntField(term4002683, term4002683.getClass(), "holdGreat", 0);
        setIntField(term4002683, term4002683.getClass(), "holdGood", 0);
        setIntField(term4002683, term4002683.getClass(), "holdBad", 0);
        setIntField(term4002683, term4002683.getClass(), "slidePerfect", 0);
        setIntField(term4002683, term4002683.getClass(), "slideGreat", 0);
        setIntField(term4002683, term4002683.getClass(), "slideGood", 0);
        setIntField(term4002683, term4002683.getClass(), "slideBad", 0);
        setIntField(term4002683, term4002683.getClass(), "breakPerfect", 0);
        setIntField(term4002683, term4002683.getClass(), "breakGreat", 0);
        setIntField(term4002683, term4002683.getClass(), "breakGood", 0);
        setIntField(term4002683, term4002683.getClass(), "breakBad", 0);
        setBooleanField(term4002683, term4002683.getClass(), "isTrackSkip", false);
        setBooleanField(term4002683, term4002683.getClass(), "isHighScore", false);
        setBooleanField(term4002683, term4002683.getClass(), "isChallengeTrack", false);
        setIntField(term4002683, term4002683.getClass(), "challengeLife", 0);
        setIntField(term4002683, term4002683.getClass(), "challengeRemain", 0);
        setIntField(term4002683, term4002683.getClass(), "isAllPerfectPlus", 0);
        term4002737 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4002737;
        callMethod(klass, "setOrderId", argTypes, term4002683, args);
    }

};


