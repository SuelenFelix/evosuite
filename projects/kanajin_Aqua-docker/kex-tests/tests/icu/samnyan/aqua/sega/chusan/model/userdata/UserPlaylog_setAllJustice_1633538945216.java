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
import java.lang.Boolean;

public class UserPlaylog_setAllJustice_1633538945216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463076;
     Object term463124;

    public UserPlaylog_setAllJustice_1633538945216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463076 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog"));
        setLongField(term463076, term463076.getClass(), "id", 0L);
        setField(term463076, term463076.getClass(), "user", null);
        setField(term463076, term463076.getClass(), "romVersion", null);
        setIntField(term463076, term463076.getClass(), "orderId", 0);
        setIntField(term463076, term463076.getClass(), "sortNumber", 0);
        setIntField(term463076, term463076.getClass(), "placeId", 0);
        setField(term463076, term463076.getClass(), "playDate", null);
        setField(term463076, term463076.getClass(), "userPlayDate", null);
        setIntField(term463076, term463076.getClass(), "musicId", 0);
        setIntField(term463076, term463076.getClass(), "level", 0);
        setIntField(term463076, term463076.getClass(), "customId", 0);
        setIntField(term463076, term463076.getClass(), "playedUserId1", 0);
        setIntField(term463076, term463076.getClass(), "playedUserId2", 0);
        setIntField(term463076, term463076.getClass(), "playedUserId3", 0);
        setField(term463076, term463076.getClass(), "playedUserName1", null);
        setField(term463076, term463076.getClass(), "playedUserName2", null);
        setField(term463076, term463076.getClass(), "playedUserName3", null);
        setIntField(term463076, term463076.getClass(), "playedMusicLevel1", 0);
        setIntField(term463076, term463076.getClass(), "playedMusicLevel2", 0);
        setIntField(term463076, term463076.getClass(), "playedMusicLevel3", 0);
        setIntField(term463076, term463076.getClass(), "playedCustom1", 0);
        setIntField(term463076, term463076.getClass(), "playedCustom2", 0);
        setIntField(term463076, term463076.getClass(), "playedCustom3", 0);
        setIntField(term463076, term463076.getClass(), "track", 0);
        setIntField(term463076, term463076.getClass(), "score", 0);
        setIntField(term463076, term463076.getClass(), "rank", 0);
        setIntField(term463076, term463076.getClass(), "maxCombo", 0);
        setIntField(term463076, term463076.getClass(), "maxChain", 0);
        setIntField(term463076, term463076.getClass(), "rateTap", 0);
        setIntField(term463076, term463076.getClass(), "rateHold", 0);
        setIntField(term463076, term463076.getClass(), "rateSlide", 0);
        setIntField(term463076, term463076.getClass(), "rateAir", 0);
        setIntField(term463076, term463076.getClass(), "rateFlick", 0);
        setIntField(term463076, term463076.getClass(), "judgeGuilty", 0);
        setIntField(term463076, term463076.getClass(), "judgeAttack", 0);
        setIntField(term463076, term463076.getClass(), "judgeJustice", 0);
        setIntField(term463076, term463076.getClass(), "judgeCritical", 0);
        setIntField(term463076, term463076.getClass(), "judgeHeaven", 0);
        setIntField(term463076, term463076.getClass(), "eventId", 0);
        setIntField(term463076, term463076.getClass(), "playerRating", 0);
        setBooleanField(term463076, term463076.getClass(), "isNewRecord", false);
        setBooleanField(term463076, term463076.getClass(), "isFullCombo", false);
        setIntField(term463076, term463076.getClass(), "fullChainKind", 0);
        setBooleanField(term463076, term463076.getClass(), "isAllJustice", false);
        setBooleanField(term463076, term463076.getClass(), "isContinue", false);
        setBooleanField(term463076, term463076.getClass(), "isFreeToPlay", false);
        setIntField(term463076, term463076.getClass(), "characterId", 0);
        setIntField(term463076, term463076.getClass(), "charaIllustId", 0);
        setIntField(term463076, term463076.getClass(), "skillId", 0);
        setIntField(term463076, term463076.getClass(), "playKind", 0);
        setBooleanField(term463076, term463076.getClass(), "isClear", false);
        setIntField(term463076, term463076.getClass(), "skillLevel", 0);
        setIntField(term463076, term463076.getClass(), "skillEffect", 0);
        setField(term463076, term463076.getClass(), "placeName", null);
        setIntField(term463076, term463076.getClass(), "commonId", 0);
        term463124 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term463124;
        callMethod(klass, "setAllJustice", argTypes, term463076, args);
    }

};


