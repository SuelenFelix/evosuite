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

public class UserPlaylog_setPlaceName_1122793860194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4002851;

    public UserPlaylog_setPlaceName_1122793860194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4002851 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4002851, term4002851.getClass(), "id", 0L);
        setField(term4002851, term4002851.getClass(), "user", null);
        setIntField(term4002851, term4002851.getClass(), "orderId", 0);
        setLongField(term4002851, term4002851.getClass(), "sortNumber", 0L);
        setIntField(term4002851, term4002851.getClass(), "placeId", 0);
        setField(term4002851, term4002851.getClass(), "placeName", null);
        setField(term4002851, term4002851.getClass(), "country", null);
        setIntField(term4002851, term4002851.getClass(), "regionId", 0);
        setField(term4002851, term4002851.getClass(), "playDate", null);
        setField(term4002851, term4002851.getClass(), "userPlayDate", null);
        setIntField(term4002851, term4002851.getClass(), "musicId", 0);
        setIntField(term4002851, term4002851.getClass(), "level", 0);
        setIntField(term4002851, term4002851.getClass(), "gameMode", 0);
        setIntField(term4002851, term4002851.getClass(), "rivalNum", 0);
        setIntField(term4002851, term4002851.getClass(), "track", 0);
        setIntField(term4002851, term4002851.getClass(), "eventId", 0);
        setBooleanField(term4002851, term4002851.getClass(), "isFreeToPlay", false);
        setIntField(term4002851, term4002851.getClass(), "playerRating", 0);
        setLongField(term4002851, term4002851.getClass(), "playedUserId1", 0L);
        setField(term4002851, term4002851.getClass(), "playedUserName1", null);
        setIntField(term4002851, term4002851.getClass(), "playedMusicLevel1", 0);
        setLongField(term4002851, term4002851.getClass(), "playedUserId2", 0L);
        setField(term4002851, term4002851.getClass(), "playedUserName2", null);
        setIntField(term4002851, term4002851.getClass(), "playedMusicLevel2", 0);
        setLongField(term4002851, term4002851.getClass(), "playedUserId3", 0L);
        setField(term4002851, term4002851.getClass(), "playedUserName3", null);
        setIntField(term4002851, term4002851.getClass(), "playedMusicLevel3", 0);
        setIntField(term4002851, term4002851.getClass(), "achievement", 0);
        setIntField(term4002851, term4002851.getClass(), "score", 0);
        setIntField(term4002851, term4002851.getClass(), "tapScore", 0);
        setIntField(term4002851, term4002851.getClass(), "holdScore", 0);
        setIntField(term4002851, term4002851.getClass(), "slideScore", 0);
        setIntField(term4002851, term4002851.getClass(), "breakScore", 0);
        setIntField(term4002851, term4002851.getClass(), "syncRate", 0);
        setIntField(term4002851, term4002851.getClass(), "vsWin", 0);
        setBooleanField(term4002851, term4002851.getClass(), "isAllPerfect", false);
        setIntField(term4002851, term4002851.getClass(), "fullCombo", 0);
        setIntField(term4002851, term4002851.getClass(), "maxFever", 0);
        setIntField(term4002851, term4002851.getClass(), "maxCombo", 0);
        setIntField(term4002851, term4002851.getClass(), "tapPerfect", 0);
        setIntField(term4002851, term4002851.getClass(), "tapGreat", 0);
        setIntField(term4002851, term4002851.getClass(), "tapGood", 0);
        setIntField(term4002851, term4002851.getClass(), "tapBad", 0);
        setIntField(term4002851, term4002851.getClass(), "holdPerfect", 0);
        setIntField(term4002851, term4002851.getClass(), "holdGreat", 0);
        setIntField(term4002851, term4002851.getClass(), "holdGood", 0);
        setIntField(term4002851, term4002851.getClass(), "holdBad", 0);
        setIntField(term4002851, term4002851.getClass(), "slidePerfect", 0);
        setIntField(term4002851, term4002851.getClass(), "slideGreat", 0);
        setIntField(term4002851, term4002851.getClass(), "slideGood", 0);
        setIntField(term4002851, term4002851.getClass(), "slideBad", 0);
        setIntField(term4002851, term4002851.getClass(), "breakPerfect", 0);
        setIntField(term4002851, term4002851.getClass(), "breakGreat", 0);
        setIntField(term4002851, term4002851.getClass(), "breakGood", 0);
        setIntField(term4002851, term4002851.getClass(), "breakBad", 0);
        setBooleanField(term4002851, term4002851.getClass(), "isTrackSkip", false);
        setBooleanField(term4002851, term4002851.getClass(), "isHighScore", false);
        setBooleanField(term4002851, term4002851.getClass(), "isChallengeTrack", false);
        setIntField(term4002851, term4002851.getClass(), "challengeLife", 0);
        setIntField(term4002851, term4002851.getClass(), "challengeRemain", 0);
        setIntField(term4002851, term4002851.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlaceName", argTypes, term4002851, args);
    }

};


