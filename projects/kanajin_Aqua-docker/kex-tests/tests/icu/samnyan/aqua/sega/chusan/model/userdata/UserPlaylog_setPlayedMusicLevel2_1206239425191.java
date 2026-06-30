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

public class UserPlaylog_setPlayedMusicLevel2_1206239425191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461826;
     Object term461874;

    public UserPlaylog_setPlayedMusicLevel2_1206239425191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461826 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term461826, term461826.getClass(), "id", 0L);
        setField(term461826, term461826.getClass(), "user", null);
        setField(term461826, term461826.getClass(), "romVersion", null);
        setIntField(term461826, term461826.getClass(), "orderId", 0);
        setIntField(term461826, term461826.getClass(), "sortNumber", 0);
        setIntField(term461826, term461826.getClass(), "placeId", 0);
        setField(term461826, term461826.getClass(), "playDate", null);
        setField(term461826, term461826.getClass(), "userPlayDate", null);
        setIntField(term461826, term461826.getClass(), "musicId", 0);
        setIntField(term461826, term461826.getClass(), "level", 0);
        setIntField(term461826, term461826.getClass(), "customId", 0);
        setIntField(term461826, term461826.getClass(), "playedUserId1", 0);
        setIntField(term461826, term461826.getClass(), "playedUserId2", 0);
        setIntField(term461826, term461826.getClass(), "playedUserId3", 0);
        setField(term461826, term461826.getClass(), "playedUserName1", null);
        setField(term461826, term461826.getClass(), "playedUserName2", null);
        setField(term461826, term461826.getClass(), "playedUserName3", null);
        setIntField(term461826, term461826.getClass(), "playedMusicLevel1", 0);
        setIntField(term461826, term461826.getClass(), "playedMusicLevel2", 0);
        setIntField(term461826, term461826.getClass(), "playedMusicLevel3", 0);
        setIntField(term461826, term461826.getClass(), "playedCustom1", 0);
        setIntField(term461826, term461826.getClass(), "playedCustom2", 0);
        setIntField(term461826, term461826.getClass(), "playedCustom3", 0);
        setIntField(term461826, term461826.getClass(), "track", 0);
        setIntField(term461826, term461826.getClass(), "score", 0);
        setIntField(term461826, term461826.getClass(), "rank", 0);
        setIntField(term461826, term461826.getClass(), "maxCombo", 0);
        setIntField(term461826, term461826.getClass(), "maxChain", 0);
        setIntField(term461826, term461826.getClass(), "rateTap", 0);
        setIntField(term461826, term461826.getClass(), "rateHold", 0);
        setIntField(term461826, term461826.getClass(), "rateSlide", 0);
        setIntField(term461826, term461826.getClass(), "rateAir", 0);
        setIntField(term461826, term461826.getClass(), "rateFlick", 0);
        setIntField(term461826, term461826.getClass(), "judgeGuilty", 0);
        setIntField(term461826, term461826.getClass(), "judgeAttack", 0);
        setIntField(term461826, term461826.getClass(), "judgeJustice", 0);
        setIntField(term461826, term461826.getClass(), "judgeCritical", 0);
        setIntField(term461826, term461826.getClass(), "judgeHeaven", 0);
        setIntField(term461826, term461826.getClass(), "eventId", 0);
        setIntField(term461826, term461826.getClass(), "playerRating", 0);
        setBooleanField(term461826, term461826.getClass(), "isNewRecord", false);
        setBooleanField(term461826, term461826.getClass(), "isFullCombo", false);
        setIntField(term461826, term461826.getClass(), "fullChainKind", 0);
        setBooleanField(term461826, term461826.getClass(), "isAllJustice", false);
        setBooleanField(term461826, term461826.getClass(), "isContinue", false);
        setBooleanField(term461826, term461826.getClass(), "isFreeToPlay", false);
        setIntField(term461826, term461826.getClass(), "characterId", 0);
        setIntField(term461826, term461826.getClass(), "charaIllustId", 0);
        setIntField(term461826, term461826.getClass(), "skillId", 0);
        setIntField(term461826, term461826.getClass(), "playKind", 0);
        setBooleanField(term461826, term461826.getClass(), "isClear", false);
        setIntField(term461826, term461826.getClass(), "skillLevel", 0);
        setIntField(term461826, term461826.getClass(), "skillEffect", 0);
        setField(term461826, term461826.getClass(), "placeName", null);
        setIntField(term461826, term461826.getClass(), "commonId", 0);
        term461874 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term461874;
        callMethod(klass, "setPlayedMusicLevel2", argTypes, term461826, args);
    }

};


