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

public class UserPlaylog_setVsWin_1006361646223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4004461;
     Object term4004515;

    public UserPlaylog_setVsWin_1006361646223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4004461 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        setLongField(term4004461, term4004461.getClass(), "id", 0L);
        setField(term4004461, term4004461.getClass(), "user", null);
        setIntField(term4004461, term4004461.getClass(), "orderId", 0);
        setLongField(term4004461, term4004461.getClass(), "sortNumber", 0L);
        setIntField(term4004461, term4004461.getClass(), "placeId", 0);
        setField(term4004461, term4004461.getClass(), "placeName", null);
        setField(term4004461, term4004461.getClass(), "country", null);
        setIntField(term4004461, term4004461.getClass(), "regionId", 0);
        setField(term4004461, term4004461.getClass(), "playDate", null);
        setField(term4004461, term4004461.getClass(), "userPlayDate", null);
        setIntField(term4004461, term4004461.getClass(), "musicId", 0);
        setIntField(term4004461, term4004461.getClass(), "level", 0);
        setIntField(term4004461, term4004461.getClass(), "gameMode", 0);
        setIntField(term4004461, term4004461.getClass(), "rivalNum", 0);
        setIntField(term4004461, term4004461.getClass(), "track", 0);
        setIntField(term4004461, term4004461.getClass(), "eventId", 0);
        setBooleanField(term4004461, term4004461.getClass(), "isFreeToPlay", false);
        setIntField(term4004461, term4004461.getClass(), "playerRating", 0);
        setLongField(term4004461, term4004461.getClass(), "playedUserId1", 0L);
        setField(term4004461, term4004461.getClass(), "playedUserName1", null);
        setIntField(term4004461, term4004461.getClass(), "playedMusicLevel1", 0);
        setLongField(term4004461, term4004461.getClass(), "playedUserId2", 0L);
        setField(term4004461, term4004461.getClass(), "playedUserName2", null);
        setIntField(term4004461, term4004461.getClass(), "playedMusicLevel2", 0);
        setLongField(term4004461, term4004461.getClass(), "playedUserId3", 0L);
        setField(term4004461, term4004461.getClass(), "playedUserName3", null);
        setIntField(term4004461, term4004461.getClass(), "playedMusicLevel3", 0);
        setIntField(term4004461, term4004461.getClass(), "achievement", 0);
        setIntField(term4004461, term4004461.getClass(), "score", 0);
        setIntField(term4004461, term4004461.getClass(), "tapScore", 0);
        setIntField(term4004461, term4004461.getClass(), "holdScore", 0);
        setIntField(term4004461, term4004461.getClass(), "slideScore", 0);
        setIntField(term4004461, term4004461.getClass(), "breakScore", 0);
        setIntField(term4004461, term4004461.getClass(), "syncRate", 0);
        setIntField(term4004461, term4004461.getClass(), "vsWin", 0);
        setBooleanField(term4004461, term4004461.getClass(), "isAllPerfect", false);
        setIntField(term4004461, term4004461.getClass(), "fullCombo", 0);
        setIntField(term4004461, term4004461.getClass(), "maxFever", 0);
        setIntField(term4004461, term4004461.getClass(), "maxCombo", 0);
        setIntField(term4004461, term4004461.getClass(), "tapPerfect", 0);
        setIntField(term4004461, term4004461.getClass(), "tapGreat", 0);
        setIntField(term4004461, term4004461.getClass(), "tapGood", 0);
        setIntField(term4004461, term4004461.getClass(), "tapBad", 0);
        setIntField(term4004461, term4004461.getClass(), "holdPerfect", 0);
        setIntField(term4004461, term4004461.getClass(), "holdGreat", 0);
        setIntField(term4004461, term4004461.getClass(), "holdGood", 0);
        setIntField(term4004461, term4004461.getClass(), "holdBad", 0);
        setIntField(term4004461, term4004461.getClass(), "slidePerfect", 0);
        setIntField(term4004461, term4004461.getClass(), "slideGreat", 0);
        setIntField(term4004461, term4004461.getClass(), "slideGood", 0);
        setIntField(term4004461, term4004461.getClass(), "slideBad", 0);
        setIntField(term4004461, term4004461.getClass(), "breakPerfect", 0);
        setIntField(term4004461, term4004461.getClass(), "breakGreat", 0);
        setIntField(term4004461, term4004461.getClass(), "breakGood", 0);
        setIntField(term4004461, term4004461.getClass(), "breakBad", 0);
        setBooleanField(term4004461, term4004461.getClass(), "isTrackSkip", false);
        setBooleanField(term4004461, term4004461.getClass(), "isHighScore", false);
        setBooleanField(term4004461, term4004461.getClass(), "isChallengeTrack", false);
        setIntField(term4004461, term4004461.getClass(), "challengeLife", 0);
        setIntField(term4004461, term4004461.getClass(), "challengeRemain", 0);
        setIntField(term4004461, term4004461.getClass(), "isAllPerfectPlus", 0);
        term4004515 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4004515;
        callMethod(klass, "setVsWin", argTypes, term4004461, args);
    }

};


