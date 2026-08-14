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

public class UserPlaylog_setAchievement_1218510594217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177759;
     Object term177813;

    public UserPlaylog_setAchievement_1218510594217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177759 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term177759, term177759.getClass(), "id", 0L);
        setField(term177759, term177759.getClass(), "user", null);
        setIntField(term177759, term177759.getClass(), "orderId", 0);
        setLongField(term177759, term177759.getClass(), "sortNumber", 0L);
        setIntField(term177759, term177759.getClass(), "placeId", 0);
        setField(term177759, term177759.getClass(), "placeName", null);
        setField(term177759, term177759.getClass(), "country", null);
        setIntField(term177759, term177759.getClass(), "regionId", 0);
        setField(term177759, term177759.getClass(), "playDate", null);
        setField(term177759, term177759.getClass(), "userPlayDate", null);
        setIntField(term177759, term177759.getClass(), "musicId", 0);
        setIntField(term177759, term177759.getClass(), "level", 0);
        setIntField(term177759, term177759.getClass(), "gameMode", 0);
        setIntField(term177759, term177759.getClass(), "rivalNum", 0);
        setIntField(term177759, term177759.getClass(), "track", 0);
        setIntField(term177759, term177759.getClass(), "eventId", 0);
        setBooleanField(term177759, term177759.getClass(), "isFreeToPlay", false);
        setIntField(term177759, term177759.getClass(), "playerRating", 0);
        setLongField(term177759, term177759.getClass(), "playedUserId1", 0L);
        setField(term177759, term177759.getClass(), "playedUserName1", null);
        setIntField(term177759, term177759.getClass(), "playedMusicLevel1", 0);
        setLongField(term177759, term177759.getClass(), "playedUserId2", 0L);
        setField(term177759, term177759.getClass(), "playedUserName2", null);
        setIntField(term177759, term177759.getClass(), "playedMusicLevel2", 0);
        setLongField(term177759, term177759.getClass(), "playedUserId3", 0L);
        setField(term177759, term177759.getClass(), "playedUserName3", null);
        setIntField(term177759, term177759.getClass(), "playedMusicLevel3", 0);
        setIntField(term177759, term177759.getClass(), "achievement", 0);
        setIntField(term177759, term177759.getClass(), "score", 0);
        setIntField(term177759, term177759.getClass(), "tapScore", 0);
        setIntField(term177759, term177759.getClass(), "holdScore", 0);
        setIntField(term177759, term177759.getClass(), "slideScore", 0);
        setIntField(term177759, term177759.getClass(), "breakScore", 0);
        setIntField(term177759, term177759.getClass(), "syncRate", 0);
        setIntField(term177759, term177759.getClass(), "vsWin", 0);
        setBooleanField(term177759, term177759.getClass(), "isAllPerfect", false);
        setIntField(term177759, term177759.getClass(), "fullCombo", 0);
        setIntField(term177759, term177759.getClass(), "maxFever", 0);
        setIntField(term177759, term177759.getClass(), "maxCombo", 0);
        setIntField(term177759, term177759.getClass(), "tapPerfect", 0);
        setIntField(term177759, term177759.getClass(), "tapGreat", 0);
        setIntField(term177759, term177759.getClass(), "tapGood", 0);
        setIntField(term177759, term177759.getClass(), "tapBad", 0);
        setIntField(term177759, term177759.getClass(), "holdPerfect", 0);
        setIntField(term177759, term177759.getClass(), "holdGreat", 0);
        setIntField(term177759, term177759.getClass(), "holdGood", 0);
        setIntField(term177759, term177759.getClass(), "holdBad", 0);
        setIntField(term177759, term177759.getClass(), "slidePerfect", 0);
        setIntField(term177759, term177759.getClass(), "slideGreat", 0);
        setIntField(term177759, term177759.getClass(), "slideGood", 0);
        setIntField(term177759, term177759.getClass(), "slideBad", 0);
        setIntField(term177759, term177759.getClass(), "breakPerfect", 0);
        setIntField(term177759, term177759.getClass(), "breakGreat", 0);
        setIntField(term177759, term177759.getClass(), "breakGood", 0);
        setIntField(term177759, term177759.getClass(), "breakBad", 0);
        setBooleanField(term177759, term177759.getClass(), "isTrackSkip", false);
        setBooleanField(term177759, term177759.getClass(), "isHighScore", false);
        setBooleanField(term177759, term177759.getClass(), "isChallengeTrack", false);
        setIntField(term177759, term177759.getClass(), "challengeLife", 0);
        setIntField(term177759, term177759.getClass(), "challengeRemain", 0);
        setIntField(term177759, term177759.getClass(), "isAllPerfectPlus", 0);
        term177813 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177813;
        callMethod(klass, "setAchievement", argTypes, term177759, args);
    }

};


