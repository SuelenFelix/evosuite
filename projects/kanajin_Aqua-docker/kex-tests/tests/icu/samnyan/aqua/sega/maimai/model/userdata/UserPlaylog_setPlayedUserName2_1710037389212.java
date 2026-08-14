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

public class UserPlaylog_setPlayedUserName2_1710037389212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177483;

    public UserPlaylog_setPlayedUserName2_1710037389212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177483 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177483, term177483.getClass(), "id", 0L);
        setField(term177483, term177483.getClass(), "user", null);
        setIntField(term177483, term177483.getClass(), "orderId", 0);
        setLongField(term177483, term177483.getClass(), "sortNumber", 0L);
        setIntField(term177483, term177483.getClass(), "placeId", 0);
        setField(term177483, term177483.getClass(), "placeName", null);
        setField(term177483, term177483.getClass(), "country", null);
        setIntField(term177483, term177483.getClass(), "regionId", 0);
        setField(term177483, term177483.getClass(), "playDate", null);
        setField(term177483, term177483.getClass(), "userPlayDate", null);
        setIntField(term177483, term177483.getClass(), "musicId", 0);
        setIntField(term177483, term177483.getClass(), "level", 0);
        setIntField(term177483, term177483.getClass(), "gameMode", 0);
        setIntField(term177483, term177483.getClass(), "rivalNum", 0);
        setIntField(term177483, term177483.getClass(), "track", 0);
        setIntField(term177483, term177483.getClass(), "eventId", 0);
        setBooleanField(term177483, term177483.getClass(), "isFreeToPlay", false);
        setIntField(term177483, term177483.getClass(), "playerRating", 0);
        setLongField(term177483, term177483.getClass(), "playedUserId1", 0L);
        setField(term177483, term177483.getClass(), "playedUserName1", null);
        setIntField(term177483, term177483.getClass(), "playedMusicLevel1", 0);
        setLongField(term177483, term177483.getClass(), "playedUserId2", 0L);
        setField(term177483, term177483.getClass(), "playedUserName2", null);
        setIntField(term177483, term177483.getClass(), "playedMusicLevel2", 0);
        setLongField(term177483, term177483.getClass(), "playedUserId3", 0L);
        setField(term177483, term177483.getClass(), "playedUserName3", null);
        setIntField(term177483, term177483.getClass(), "playedMusicLevel3", 0);
        setIntField(term177483, term177483.getClass(), "achievement", 0);
        setIntField(term177483, term177483.getClass(), "score", 0);
        setIntField(term177483, term177483.getClass(), "tapScore", 0);
        setIntField(term177483, term177483.getClass(), "holdScore", 0);
        setIntField(term177483, term177483.getClass(), "slideScore", 0);
        setIntField(term177483, term177483.getClass(), "breakScore", 0);
        setIntField(term177483, term177483.getClass(), "syncRate", 0);
        setIntField(term177483, term177483.getClass(), "vsWin", 0);
        setBooleanField(term177483, term177483.getClass(), "isAllPerfect", false);
        setIntField(term177483, term177483.getClass(), "fullCombo", 0);
        setIntField(term177483, term177483.getClass(), "maxFever", 0);
        setIntField(term177483, term177483.getClass(), "maxCombo", 0);
        setIntField(term177483, term177483.getClass(), "tapPerfect", 0);
        setIntField(term177483, term177483.getClass(), "tapGreat", 0);
        setIntField(term177483, term177483.getClass(), "tapGood", 0);
        setIntField(term177483, term177483.getClass(), "tapBad", 0);
        setIntField(term177483, term177483.getClass(), "holdPerfect", 0);
        setIntField(term177483, term177483.getClass(), "holdGreat", 0);
        setIntField(term177483, term177483.getClass(), "holdGood", 0);
        setIntField(term177483, term177483.getClass(), "holdBad", 0);
        setIntField(term177483, term177483.getClass(), "slidePerfect", 0);
        setIntField(term177483, term177483.getClass(), "slideGreat", 0);
        setIntField(term177483, term177483.getClass(), "slideGood", 0);
        setIntField(term177483, term177483.getClass(), "slideBad", 0);
        setIntField(term177483, term177483.getClass(), "breakPerfect", 0);
        setIntField(term177483, term177483.getClass(), "breakGreat", 0);
        setIntField(term177483, term177483.getClass(), "breakGood", 0);
        setIntField(term177483, term177483.getClass(), "breakBad", 0);
        setBooleanField(term177483, term177483.getClass(), "isTrackSkip", false);
        setBooleanField(term177483, term177483.getClass(), "isHighScore", false);
        setBooleanField(term177483, term177483.getClass(), "isChallengeTrack", false);
        setIntField(term177483, term177483.getClass(), "challengeLife", 0);
        setIntField(term177483, term177483.getClass(), "challengeRemain", 0);
        setIntField(term177483, term177483.getClass(), "isAllPerfectPlus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayedUserName2", argTypes, term177483, args);
    }

};


