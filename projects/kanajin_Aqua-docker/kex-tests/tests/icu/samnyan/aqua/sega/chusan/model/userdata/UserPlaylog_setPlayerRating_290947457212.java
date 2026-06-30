package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserPlaylog_setPlayerRating_290947457212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462876;
     Object term462924;

    public UserPlaylog_setPlayerRating_290947457212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462876 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term462876, term462876.getClass(), "id", 0L);
        setField(term462876, term462876.getClass(), "user", null);
        setField(term462876, term462876.getClass(), "romVersion", null);
        setIntField(term462876, term462876.getClass(), "orderId", 0);
        setIntField(term462876, term462876.getClass(), "sortNumber", 0);
        setIntField(term462876, term462876.getClass(), "placeId", 0);
        setField(term462876, term462876.getClass(), "playDate", null);
        setField(term462876, term462876.getClass(), "userPlayDate", null);
        setIntField(term462876, term462876.getClass(), "musicId", 0);
        setIntField(term462876, term462876.getClass(), "level", 0);
        setIntField(term462876, term462876.getClass(), "customId", 0);
        setIntField(term462876, term462876.getClass(), "playedUserId1", 0);
        setIntField(term462876, term462876.getClass(), "playedUserId2", 0);
        setIntField(term462876, term462876.getClass(), "playedUserId3", 0);
        setField(term462876, term462876.getClass(), "playedUserName1", null);
        setField(term462876, term462876.getClass(), "playedUserName2", null);
        setField(term462876, term462876.getClass(), "playedUserName3", null);
        setIntField(term462876, term462876.getClass(), "playedMusicLevel1", 0);
        setIntField(term462876, term462876.getClass(), "playedMusicLevel2", 0);
        setIntField(term462876, term462876.getClass(), "playedMusicLevel3", 0);
        setIntField(term462876, term462876.getClass(), "playedCustom1", 0);
        setIntField(term462876, term462876.getClass(), "playedCustom2", 0);
        setIntField(term462876, term462876.getClass(), "playedCustom3", 0);
        setIntField(term462876, term462876.getClass(), "track", 0);
        setIntField(term462876, term462876.getClass(), "score", 0);
        setIntField(term462876, term462876.getClass(), "rank", 0);
        setIntField(term462876, term462876.getClass(), "maxCombo", 0);
        setIntField(term462876, term462876.getClass(), "maxChain", 0);
        setIntField(term462876, term462876.getClass(), "rateTap", 0);
        setIntField(term462876, term462876.getClass(), "rateHold", 0);
        setIntField(term462876, term462876.getClass(), "rateSlide", 0);
        setIntField(term462876, term462876.getClass(), "rateAir", 0);
        setIntField(term462876, term462876.getClass(), "rateFlick", 0);
        setIntField(term462876, term462876.getClass(), "judgeGuilty", 0);
        setIntField(term462876, term462876.getClass(), "judgeAttack", 0);
        setIntField(term462876, term462876.getClass(), "judgeJustice", 0);
        setIntField(term462876, term462876.getClass(), "judgeCritical", 0);
        setIntField(term462876, term462876.getClass(), "judgeHeaven", 0);
        setIntField(term462876, term462876.getClass(), "eventId", 0);
        setIntField(term462876, term462876.getClass(), "playerRating", 0);
        setBooleanField(term462876, term462876.getClass(), "isNewRecord", false);
        setBooleanField(term462876, term462876.getClass(), "isFullCombo", false);
        setIntField(term462876, term462876.getClass(), "fullChainKind", 0);
        setBooleanField(term462876, term462876.getClass(), "isAllJustice", false);
        setBooleanField(term462876, term462876.getClass(), "isContinue", false);
        setBooleanField(term462876, term462876.getClass(), "isFreeToPlay", false);
        setIntField(term462876, term462876.getClass(), "characterId", 0);
        setIntField(term462876, term462876.getClass(), "charaIllustId", 0);
        setIntField(term462876, term462876.getClass(), "skillId", 0);
        setIntField(term462876, term462876.getClass(), "playKind", 0);
        setBooleanField(term462876, term462876.getClass(), "isClear", false);
        setIntField(term462876, term462876.getClass(), "skillLevel", 0);
        setIntField(term462876, term462876.getClass(), "skillEffect", 0);
        setField(term462876, term462876.getClass(), "placeName", null);
        setIntField(term462876, term462876.getClass(), "commonId", 0);
        term462924 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term462924;
        callMethod(klass, "setPlayerRating", argTypes, term462876, args);
    }

};


