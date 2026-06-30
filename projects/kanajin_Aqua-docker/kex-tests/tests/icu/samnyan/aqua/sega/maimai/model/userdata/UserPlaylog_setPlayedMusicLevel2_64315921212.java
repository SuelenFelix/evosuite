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

public class UserPlaylog_setPlayedMusicLevel2_64315921212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177481;
     Object term177535;

    public UserPlaylog_setPlayedMusicLevel2_64315921212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177481 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177481, term177481.getClass(), "id", 0L);
        setField(term177481, term177481.getClass(), "user", null);
        setIntField(term177481, term177481.getClass(), "orderId", 0);
        setLongField(term177481, term177481.getClass(), "sortNumber", 0L);
        setIntField(term177481, term177481.getClass(), "placeId", 0);
        setField(term177481, term177481.getClass(), "placeName", null);
        setField(term177481, term177481.getClass(), "country", null);
        setIntField(term177481, term177481.getClass(), "regionId", 0);
        setField(term177481, term177481.getClass(), "playDate", null);
        setField(term177481, term177481.getClass(), "userPlayDate", null);
        setIntField(term177481, term177481.getClass(), "musicId", 0);
        setIntField(term177481, term177481.getClass(), "level", 0);
        setIntField(term177481, term177481.getClass(), "gameMode", 0);
        setIntField(term177481, term177481.getClass(), "rivalNum", 0);
        setIntField(term177481, term177481.getClass(), "track", 0);
        setIntField(term177481, term177481.getClass(), "eventId", 0);
        setBooleanField(term177481, term177481.getClass(), "isFreeToPlay", false);
        setIntField(term177481, term177481.getClass(), "playerRating", 0);
        setLongField(term177481, term177481.getClass(), "playedUserId1", 0L);
        setField(term177481, term177481.getClass(), "playedUserName1", null);
        setIntField(term177481, term177481.getClass(), "playedMusicLevel1", 0);
        setLongField(term177481, term177481.getClass(), "playedUserId2", 0L);
        setField(term177481, term177481.getClass(), "playedUserName2", null);
        setIntField(term177481, term177481.getClass(), "playedMusicLevel2", 0);
        setLongField(term177481, term177481.getClass(), "playedUserId3", 0L);
        setField(term177481, term177481.getClass(), "playedUserName3", null);
        setIntField(term177481, term177481.getClass(), "playedMusicLevel3", 0);
        setIntField(term177481, term177481.getClass(), "achievement", 0);
        setIntField(term177481, term177481.getClass(), "score", 0);
        setIntField(term177481, term177481.getClass(), "tapScore", 0);
        setIntField(term177481, term177481.getClass(), "holdScore", 0);
        setIntField(term177481, term177481.getClass(), "slideScore", 0);
        setIntField(term177481, term177481.getClass(), "breakScore", 0);
        setIntField(term177481, term177481.getClass(), "syncRate", 0);
        setIntField(term177481, term177481.getClass(), "vsWin", 0);
        setBooleanField(term177481, term177481.getClass(), "isAllPerfect", false);
        setIntField(term177481, term177481.getClass(), "fullCombo", 0);
        setIntField(term177481, term177481.getClass(), "maxFever", 0);
        setIntField(term177481, term177481.getClass(), "maxCombo", 0);
        setIntField(term177481, term177481.getClass(), "tapPerfect", 0);
        setIntField(term177481, term177481.getClass(), "tapGreat", 0);
        setIntField(term177481, term177481.getClass(), "tapGood", 0);
        setIntField(term177481, term177481.getClass(), "tapBad", 0);
        setIntField(term177481, term177481.getClass(), "holdPerfect", 0);
        setIntField(term177481, term177481.getClass(), "holdGreat", 0);
        setIntField(term177481, term177481.getClass(), "holdGood", 0);
        setIntField(term177481, term177481.getClass(), "holdBad", 0);
        setIntField(term177481, term177481.getClass(), "slidePerfect", 0);
        setIntField(term177481, term177481.getClass(), "slideGreat", 0);
        setIntField(term177481, term177481.getClass(), "slideGood", 0);
        setIntField(term177481, term177481.getClass(), "slideBad", 0);
        setIntField(term177481, term177481.getClass(), "breakPerfect", 0);
        setIntField(term177481, term177481.getClass(), "breakGreat", 0);
        setIntField(term177481, term177481.getClass(), "breakGood", 0);
        setIntField(term177481, term177481.getClass(), "breakBad", 0);
        setBooleanField(term177481, term177481.getClass(), "isTrackSkip", false);
        setBooleanField(term177481, term177481.getClass(), "isHighScore", false);
        setBooleanField(term177481, term177481.getClass(), "isChallengeTrack", false);
        setIntField(term177481, term177481.getClass(), "challengeLife", 0);
        setIntField(term177481, term177481.getClass(), "challengeRemain", 0);
        setIntField(term177481, term177481.getClass(), "isAllPerfectPlus", 0);
        term177535 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177535;
        callMethod(klass, "setPlayedMusicLevel2", argTypes, term177481, args);
    }

};


