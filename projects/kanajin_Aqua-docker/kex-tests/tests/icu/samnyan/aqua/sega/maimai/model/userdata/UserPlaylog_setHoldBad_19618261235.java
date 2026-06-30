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

public class UserPlaylog_setHoldBad_19618261235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178767;
     Object term178821;

    public UserPlaylog_setHoldBad_19618261235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178767 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term178767, term178767.getClass(), "id", 0L);
        setField(term178767, term178767.getClass(), "user", null);
        setIntField(term178767, term178767.getClass(), "orderId", 0);
        setLongField(term178767, term178767.getClass(), "sortNumber", 0L);
        setIntField(term178767, term178767.getClass(), "placeId", 0);
        setField(term178767, term178767.getClass(), "placeName", null);
        setField(term178767, term178767.getClass(), "country", null);
        setIntField(term178767, term178767.getClass(), "regionId", 0);
        setField(term178767, term178767.getClass(), "playDate", null);
        setField(term178767, term178767.getClass(), "userPlayDate", null);
        setIntField(term178767, term178767.getClass(), "musicId", 0);
        setIntField(term178767, term178767.getClass(), "level", 0);
        setIntField(term178767, term178767.getClass(), "gameMode", 0);
        setIntField(term178767, term178767.getClass(), "rivalNum", 0);
        setIntField(term178767, term178767.getClass(), "track", 0);
        setIntField(term178767, term178767.getClass(), "eventId", 0);
        setBooleanField(term178767, term178767.getClass(), "isFreeToPlay", false);
        setIntField(term178767, term178767.getClass(), "playerRating", 0);
        setLongField(term178767, term178767.getClass(), "playedUserId1", 0L);
        setField(term178767, term178767.getClass(), "playedUserName1", null);
        setIntField(term178767, term178767.getClass(), "playedMusicLevel1", 0);
        setLongField(term178767, term178767.getClass(), "playedUserId2", 0L);
        setField(term178767, term178767.getClass(), "playedUserName2", null);
        setIntField(term178767, term178767.getClass(), "playedMusicLevel2", 0);
        setLongField(term178767, term178767.getClass(), "playedUserId3", 0L);
        setField(term178767, term178767.getClass(), "playedUserName3", null);
        setIntField(term178767, term178767.getClass(), "playedMusicLevel3", 0);
        setIntField(term178767, term178767.getClass(), "achievement", 0);
        setIntField(term178767, term178767.getClass(), "score", 0);
        setIntField(term178767, term178767.getClass(), "tapScore", 0);
        setIntField(term178767, term178767.getClass(), "holdScore", 0);
        setIntField(term178767, term178767.getClass(), "slideScore", 0);
        setIntField(term178767, term178767.getClass(), "breakScore", 0);
        setIntField(term178767, term178767.getClass(), "syncRate", 0);
        setIntField(term178767, term178767.getClass(), "vsWin", 0);
        setBooleanField(term178767, term178767.getClass(), "isAllPerfect", false);
        setIntField(term178767, term178767.getClass(), "fullCombo", 0);
        setIntField(term178767, term178767.getClass(), "maxFever", 0);
        setIntField(term178767, term178767.getClass(), "maxCombo", 0);
        setIntField(term178767, term178767.getClass(), "tapPerfect", 0);
        setIntField(term178767, term178767.getClass(), "tapGreat", 0);
        setIntField(term178767, term178767.getClass(), "tapGood", 0);
        setIntField(term178767, term178767.getClass(), "tapBad", 0);
        setIntField(term178767, term178767.getClass(), "holdPerfect", 0);
        setIntField(term178767, term178767.getClass(), "holdGreat", 0);
        setIntField(term178767, term178767.getClass(), "holdGood", 0);
        setIntField(term178767, term178767.getClass(), "holdBad", 0);
        setIntField(term178767, term178767.getClass(), "slidePerfect", 0);
        setIntField(term178767, term178767.getClass(), "slideGreat", 0);
        setIntField(term178767, term178767.getClass(), "slideGood", 0);
        setIntField(term178767, term178767.getClass(), "slideBad", 0);
        setIntField(term178767, term178767.getClass(), "breakPerfect", 0);
        setIntField(term178767, term178767.getClass(), "breakGreat", 0);
        setIntField(term178767, term178767.getClass(), "breakGood", 0);
        setIntField(term178767, term178767.getClass(), "breakBad", 0);
        setBooleanField(term178767, term178767.getClass(), "isTrackSkip", false);
        setBooleanField(term178767, term178767.getClass(), "isHighScore", false);
        setBooleanField(term178767, term178767.getClass(), "isChallengeTrack", false);
        setIntField(term178767, term178767.getClass(), "challengeLife", 0);
        setIntField(term178767, term178767.getClass(), "challengeRemain", 0);
        setIntField(term178767, term178767.getClass(), "isAllPerfectPlus", 0);
        term178821 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term178821;
        callMethod(klass, "setHoldBad", argTypes, term178767, args);
    }

};


