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

public class UserPlaylog_setTapGreat_1101221629229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178431;
     Object term178485;

    public UserPlaylog_setTapGreat_1101221629229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178431 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178431, term178431.getClass(), "id", 0L);
        setField(term178431, term178431.getClass(), "user", null);
        setIntField(term178431, term178431.getClass(), "orderId", 0);
        setLongField(term178431, term178431.getClass(), "sortNumber", 0L);
        setIntField(term178431, term178431.getClass(), "placeId", 0);
        setField(term178431, term178431.getClass(), "placeName", null);
        setField(term178431, term178431.getClass(), "country", null);
        setIntField(term178431, term178431.getClass(), "regionId", 0);
        setField(term178431, term178431.getClass(), "playDate", null);
        setField(term178431, term178431.getClass(), "userPlayDate", null);
        setIntField(term178431, term178431.getClass(), "musicId", 0);
        setIntField(term178431, term178431.getClass(), "level", 0);
        setIntField(term178431, term178431.getClass(), "gameMode", 0);
        setIntField(term178431, term178431.getClass(), "rivalNum", 0);
        setIntField(term178431, term178431.getClass(), "track", 0);
        setIntField(term178431, term178431.getClass(), "eventId", 0);
        setBooleanField(term178431, term178431.getClass(), "isFreeToPlay", false);
        setIntField(term178431, term178431.getClass(), "playerRating", 0);
        setLongField(term178431, term178431.getClass(), "playedUserId1", 0L);
        setField(term178431, term178431.getClass(), "playedUserName1", null);
        setIntField(term178431, term178431.getClass(), "playedMusicLevel1", 0);
        setLongField(term178431, term178431.getClass(), "playedUserId2", 0L);
        setField(term178431, term178431.getClass(), "playedUserName2", null);
        setIntField(term178431, term178431.getClass(), "playedMusicLevel2", 0);
        setLongField(term178431, term178431.getClass(), "playedUserId3", 0L);
        setField(term178431, term178431.getClass(), "playedUserName3", null);
        setIntField(term178431, term178431.getClass(), "playedMusicLevel3", 0);
        setIntField(term178431, term178431.getClass(), "achievement", 0);
        setIntField(term178431, term178431.getClass(), "score", 0);
        setIntField(term178431, term178431.getClass(), "tapScore", 0);
        setIntField(term178431, term178431.getClass(), "holdScore", 0);
        setIntField(term178431, term178431.getClass(), "slideScore", 0);
        setIntField(term178431, term178431.getClass(), "breakScore", 0);
        setIntField(term178431, term178431.getClass(), "syncRate", 0);
        setIntField(term178431, term178431.getClass(), "vsWin", 0);
        setBooleanField(term178431, term178431.getClass(), "isAllPerfect", false);
        setIntField(term178431, term178431.getClass(), "fullCombo", 0);
        setIntField(term178431, term178431.getClass(), "maxFever", 0);
        setIntField(term178431, term178431.getClass(), "maxCombo", 0);
        setIntField(term178431, term178431.getClass(), "tapPerfect", 0);
        setIntField(term178431, term178431.getClass(), "tapGreat", 0);
        setIntField(term178431, term178431.getClass(), "tapGood", 0);
        setIntField(term178431, term178431.getClass(), "tapBad", 0);
        setIntField(term178431, term178431.getClass(), "holdPerfect", 0);
        setIntField(term178431, term178431.getClass(), "holdGreat", 0);
        setIntField(term178431, term178431.getClass(), "holdGood", 0);
        setIntField(term178431, term178431.getClass(), "holdBad", 0);
        setIntField(term178431, term178431.getClass(), "slidePerfect", 0);
        setIntField(term178431, term178431.getClass(), "slideGreat", 0);
        setIntField(term178431, term178431.getClass(), "slideGood", 0);
        setIntField(term178431, term178431.getClass(), "slideBad", 0);
        setIntField(term178431, term178431.getClass(), "breakPerfect", 0);
        setIntField(term178431, term178431.getClass(), "breakGreat", 0);
        setIntField(term178431, term178431.getClass(), "breakGood", 0);
        setIntField(term178431, term178431.getClass(), "breakBad", 0);
        setBooleanField(term178431, term178431.getClass(), "isTrackSkip", false);
        setBooleanField(term178431, term178431.getClass(), "isHighScore", false);
        setBooleanField(term178431, term178431.getClass(), "isChallengeTrack", false);
        setIntField(term178431, term178431.getClass(), "challengeLife", 0);
        setIntField(term178431, term178431.getClass(), "challengeRemain", 0);
        setIntField(term178431, term178431.getClass(), "isAllPerfectPlus", 0);
        term178485 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term178485;
        callMethod(klass, "setTapGreat", argTypes, term178431, args);
    }

};


